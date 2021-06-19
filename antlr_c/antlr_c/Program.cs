using Antlr4.Runtime;
using System;
using System.Xml;
using System.IO;
using System.Text;
using antlr_c.Generated;
using antlr_c.Clases;
using System.Xml.Schema;
using System.Collections.Generic;
using System.Linq;

namespace antlr_c
{
    class Program
    {

        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            
            try
            {
                String path = "C:\\Users\\Asus\\Documents\\GIT\\howto_maze\\antlr py\\laberinto.txt";
                //StreamReader file = new StreamReader("");

                %ReadXML();

                Console.WriteLine(File.ReadAllText(path));
                AntlrInputStream inputStream = new AntlrInputStream(File.ReadAllText(path));
                LaberintoLexer laberintoLexer = new LaberintoLexer(inputStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(laberintoLexer);
                LaberintoParser laberintoParser = new LaberintoParser(commonTokenStream);
                //parser.RemoveErrorListeners();
                //parser.AddErrorListener(new MyErrorListener());
                //LaberintoParser.ChatContext chatContext = LaberintoParser.chat();
                MiLaberintoVisitor visitor = new MiLaberintoVisitor();
                Antlr4.Runtime.Tree.IParseTree tree = laberintoParser.inicio();
                visitor.Visit(tree);
                var cleanedFormula = string.Empty;
                var tokenList = commonTokenStream.GetTokens();
                for (var i = 0; i < tokenList.Count - 1; i++)
                {
                    cleanedFormula += tokenList[i].Text;
                }
                Console.WriteLine(cleanedFormula);
                //Antlr4.Runtime.Tree.IParseTree parseTree = laberintoParser.inicio();
                //Console.WriteLine();

                //visitor.Visit(chatContext);

                /*foreach (var line in visitor.VisitBloque)
                {
                    Console.WriteLine("{0} has said {1}", line.Person, line.Text);
                }*/
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
            
        }
        public static void ReadXML()
        {       

            XmlReaderSettings settings = new XmlReaderSettings();
            settings.DtdProcessing = DtdProcessing.Parse;
            settings.ValidationType = ValidationType.DTD;
            //Path
            var reader = XmlReader.Create("C:\\Users\\Asus\\Documents\\GIT\\howto_maze\\cup\\Laberinto1.xml", settings);

            reader.ReadToFollowing("laberinto");
            do
            {

                reader.ReadToFollowing("nombre"); String nombre = reader.ReadElementContentAsString();

                reader.ReadToFollowing("use");String use = reader.ReadElementContentAsString();
                reader.ReadToFollowing("tiempo");int tiempo = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("unidadTiempo"); char unidad = reader.ReadElementContentAsString()[0];
                Directiva directiva = new Directiva(use, tiempo, unidad);

                reader.ReadToFollowing("dimension");
                reader.ReadToFollowing("alto");int alto = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("ancho");int ancho = reader.ReadElementContentAsInt();
                int[] dimension = { alto, ancho };
                
                reader.ReadToFollowing("inicio");
                reader.ReadToFollowing("x"); int x = reader.ReadElementContentAsInt();
                
                reader.ReadToFollowing("y"); int y = reader.ReadElementContentAsInt();                
                Coordenada inicio = new Coordenada(x, y);

                reader.ReadToFollowing("final");
                reader.ReadToFollowing("x"); x = reader.ReadElementContentAsInt();                
                reader.ReadToFollowing("y"); y = reader.ReadElementContentAsInt();                
                Coordenada meta = new Coordenada(x, y);

                Laberinto laberinto = new Laberinto(nombre, directiva, dimension, inicio, meta);
                reader.ReadToFollowing("definiciones");
                Console.WriteLine("Definiciones:");
                List<Elemento> listaDef = new List<Elemento>();
                Elemento elemento;
                String ident;
                String elem;
                int valor;
                reader.ReadToFollowing("definicion");
                String nameNode;
                do
                {

                    reader.ReadToFollowing("ident");
                    ident = reader.ReadElementContentAsString();
                    //Console.WriteLine($"ident: {reader.ReadElementContentAsString()}");
                    reader.ReadToFollowing("elemento");
                    elem = reader.ReadElementContentAsString();
                    //Console.WriteLine($"elemento: {reader.ReadElementContentAsString()}");
                    reader.ReadToFollowing("valor");
                    valor = reader.ReadElementContentAsInt();
                    //Console.WriteLine($"valor: {reader.ReadElementContentAsString()}");
                    elemento = new Elemento(ident, elem, valor);
                    listaDef.Add(elemento);
                    //Leer etiqueta final
                    reader.Read();
                    //Leer saltos de linea
                    reader.Read();
                    //Leer etiqueta inicial
                    reader.Read();
                    nameNode = reader.LocalName;
                } while (nameNode.Equals("definicion"));

                laberinto.setDefinicion(listaDef);
                bool aux = reader.ReadToFollowing("localizaciones");
                Console.WriteLine("Localizaciones:");
                reader.ReadToFollowing("localizacion");
                List<String> listaLoc = new List<String>();
                List<Coordenada> listaLocCoord = new List<Coordenada>();
                Coordenada coord;
                do
                {                    
                    reader.ReadToFollowing("ident");
                    ident = reader.ReadElementContentAsString();
                    //Console.WriteLine($"ident: {reader.ReadElementContentAsString()}");

                    reader.ReadToDescendant("coordenada");
                    reader.ReadToFollowing("x");
                    x = reader.ReadElementContentAsInt();
                    //Console.WriteLine($"Coordenada x: {reader.ReadElementContentAsString()}");
                    reader.ReadToFollowing("y");
                    y = reader.ReadElementContentAsInt();
                    coord = new Coordenada(x, y);
                    listaLoc.Add(ident);
                    listaLocCoord.Add(coord);
                    //Console.WriteLine($"Coordenada y: {reader.ReadElementContentAsString()}");
                    
                } while (reader.ReadToFollowing("localizacion"));
                List<Elemento> listaEleLoc = unificarListaLoc(listaLoc, listaLocCoord);
                laberinto.setLocalizaciones(listaEleLoc);
                Console.WriteLine("-------------------------");



            } while (reader.ReadToFollowing("laberinto"));



            // Now we can read the serialized book ...  
            /*System.Xml.Serialization.XmlSerializer reader =
                new System.Xml.Serialization.XmlSerializer(typeof(Laberinto));
            System.IO.StreamReader file = new System.IO.StreamReader(
                @"C:\\Users\\Asus\\Documents\\GIT\\howto_maze\\cup\\Laberinto1.xml");
            Laberinto overview = (Laberinto)reader.Deserialize(file);
            file.Close();

            Console.WriteLine(overview.nombre);
            Console.WriteLine(overview.dimension);
            Console.WriteLine(overview.ToString());
            Console.WriteLine(overview.getInicio().ToString());*/


        }

        public static List<Elemento> unificarListaLoc(List<String> listaIdent, List<Coordenada> listaCoord) {
            List<Elemento> localizaciones = new List<Elemento>();
            List<Coordenada> listaCoordenadas = new List<Coordenada>();
            int index = 0;
            int i;
            
            for (i = 0; i < listaIdent.Count; i++) {
                

                if (!listaIdent.ElementAt(index).Equals(listaIdent.ElementAt(i)))
                {                    
                    localizaciones.Add(new Elemento(listaIdent.ElementAt(index), listaCoordenadas));
                    listaCoordenadas = new List<Coordenada>();
                    index=i;

                }
                listaCoordenadas.Add(listaCoord.ElementAt(i));
                
            }
            if (listaCoordenadas != null)
            {
                localizaciones.Add(new Elemento(listaIdent.ElementAt(i-1), listaCoordenadas));
            }

            return localizaciones;
        
        }

    }
}
