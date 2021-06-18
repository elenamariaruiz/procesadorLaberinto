using Antlr4.Runtime;
using System;
using System.Xml;
using System.IO;
using System.Text;
using antlr_c.Generated;
using antlr_c.Clases;
using System.Xml.Schema;

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

                ReadXML();

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
            /*// First write something so that there is something to read ...  
            var b = new Laberinto { nombre = "Laberinto1" };
            var writer = new System.Xml.Serialization.XmlSerializer(typeof(Laberinto));
            var wfile = new System.IO.StreamWriter(@"c:\temp\SerializationOverview.xml");
            writer.Serialize(wfile, b);
            wfile.Close();*/

          

            XmlReaderSettings settings = new XmlReaderSettings();
            settings.DtdProcessing = DtdProcessing.Parse;
            settings.ValidationType = ValidationType.DTD;
            var reader = XmlReader.Create("C:\\Users\\Asus\\Documents\\GIT\\howto_maze\\cup\\Laberinto1.xml", settings);
            reader.ReadToFollowing("laberinto");

            do
            {

                reader.ReadToFollowing("nombre");
                Console.WriteLine($"nombre: {reader.ReadElementContentAsString()}");

                reader.ReadToFollowing("use");
                Console.WriteLine($"use: {reader.ReadElementContentAsString()}");

                reader.ReadToFollowing("dimension");
                reader.ReadToFollowing("alto");
                Console.WriteLine($"alto: {reader.ReadElementContentAsString()}");
                reader.ReadToFollowing("ancho");
                Console.WriteLine($"ancho: {reader.ReadElementContentAsString()}");
                reader.ReadToFollowing("inicio");
                reader.ReadToFollowing("x");
                Console.WriteLine($"Inicio x: {reader.ReadElementContentAsString()}");
                reader.ReadToFollowing("y");
                Console.WriteLine($"Inicio y: {reader.ReadElementContentAsString()}");

                reader.ReadToFollowing("final");
                reader.ReadToFollowing("x");
                Console.WriteLine($"Final x: {reader.ReadElementContentAsString()}");
                reader.ReadToFollowing("y");
                Console.WriteLine($"Final y: {reader.ReadElementContentAsString()}");
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

    }
}
