using antlr_c;
using antlr_c.Clases;
using antlr_c.Generated;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using howto_maze;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;

namespace CrearLaberinto
{
    public partial class CrearLaberintoForm : Form
    {
        public CrearLaberintoForm()
        {
            InitializeComponent();
        }

       

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                if (this.comboBox1.GetItemText(this.comboBox1.SelectedItem) == "CUP")
                {
                    //CUP
                    if (this.textBox1.Text.EndsWith(".xml"))
                    {
                        Laberinto laberinto = ReadXML(this.textBox1.Text);
                        var m = new Form1();
                        m.LoadLaberinto(laberinto);
                        //Mirar como carga el laberinto y procesar la información del objeto para mostrarla
                        m.Show();
                    }
                    else
                    {
                        throw new FormatException("CUP requiere de un archivo XML para ejecutarse");
                    }
                }
                else if (this.comboBox1.GetItemText(this.comboBox1.SelectedItem) == "Antlr")
                {
                    if (this.textBox1.Text.EndsWith(".txt"))
                    {
                        generacionANTLR(this.textBox1.Text);
                    }
                    else
                    {
                        throw new FormatException("ANTLR requiere de un archivo TXT para ejecutarse");
                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: " + ex, "Error",
                            MessageBoxButtons.OK, MessageBoxIcon.Error);
                System.Diagnostics.Debug.WriteLine("Error: " + ex);
            }








        }


        public static void generacionANTLR(String path) {
            //ANTLR
            //StreamReader file = new StreamReader("");

            // mostrarLaberinto(laberinto);
            System.Diagnostics.Debug.WriteLine(File.ReadAllText(path));
            //Console.WriteLine(File.ReadAllText(path));
            AntlrInputStream inputStream = new AntlrInputStream(File.ReadAllText(path));
            LaberintoLexer laberintoLexer = new LaberintoLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(laberintoLexer);
            LaberintoParser laberintoParser = new LaberintoParser(commonTokenStream);
            laberintoParser.RemoveErrorListeners();
            laberintoParser.AddErrorListener(new MyErrorListener());
            //LaberintoParser.ChatContext chatContext = LaberintoParser.chat();
            //MiLaberintoVisitor visitor = new MiLaberintoVisitor();
            Antlr4.Runtime.Tree.IParseTree tree = laberintoParser.inicio();
            //visitor.Visit(tree);

            MiLaberintoListener listener = new MiLaberintoListener();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.Walk(listener, tree);
        }

        public static Laberinto ReadXML(string path)
        {
            Laberinto laberinto;
            XmlReaderSettings settings = new XmlReaderSettings();
            settings.DtdProcessing = DtdProcessing.Parse;
            settings.ValidationType = ValidationType.DTD;
            //Path
            var reader = XmlReader.Create(path, settings);

            reader.ReadToFollowing("laberinto");
            do
            {

                reader.ReadToFollowing("nombre"); String nombre = reader.ReadElementContentAsString();

                reader.ReadToFollowing("vida"); int vida = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("tiempo"); int tiempo = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("unidadTiempo"); char unidad = reader.ReadElementContentAsString()[0];
                Directiva directiva = new Directiva(vida, tiempo, unidad);

                reader.ReadToFollowing("dimension");
                reader.ReadToFollowing("alto"); int alto = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("ancho"); int ancho = reader.ReadElementContentAsInt();
                int[] dimension = { alto, ancho };

                reader.ReadToFollowing("inicio");
                reader.ReadToFollowing("x"); int x = reader.ReadElementContentAsInt();

                reader.ReadToFollowing("y"); int y = reader.ReadElementContentAsInt();
                Coordenada inicio = new Coordenada(x, y);

                reader.ReadToFollowing("final");
                reader.ReadToFollowing("x"); x = reader.ReadElementContentAsInt();
                reader.ReadToFollowing("y"); y = reader.ReadElementContentAsInt();
                Coordenada meta = new Coordenada(x, y);

                laberinto = new Laberinto(nombre, directiva, dimension, inicio, meta);
                reader.ReadToFollowing("definiciones");
                Console.WriteLine("Definiciones:");
                List<Elemento> listaDef = new List<Elemento>();
                Elemento elemento;
                String ident;
                String elem;
                int valor;

                String nameNode;
                if (reader.ReadToFollowing("definicion"))
                {
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
                    if (reader.ReadToFollowing("localizacion"))
                    {
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
                        List<Elemento> listaEleLoc = Util.unificarListaLoc(listaLoc, listaLocCoord);
                        if (listaEleLoc != null) {
                            Util.addElementoALoc(listaDef, listaEleLoc);
                            laberinto.setLocalizaciones(listaEleLoc);
                        }
                        
                    }

                }
                Console.WriteLine("-------------------------");



            } while (reader.ReadToFollowing("laberinto"));
            return laberinto;
        }


        

    }
}
