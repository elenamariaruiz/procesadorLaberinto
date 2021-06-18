using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace howto_maze
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            ReadXML();
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());

        }

         public static void ReadXML()
        {
            /*// First write something so that there is something to read ...  
            var b = new Laberinto { nombre = "Laberinto1" };
            var writer = new System.Xml.Serialization.XmlSerializer(typeof(Laberinto));
            var wfile = new System.IO.StreamWriter(@"c:\temp\SerializationOverview.xml");
            writer.Serialize(wfile, b);
            wfile.Close();*/

            // Now we can read the serialized book ...  
            System.Xml.Serialization.XmlSerializer reader =
                new System.Xml.Serialization.XmlSerializer(typeof(Laberinto));
            System.IO.StreamReader file = new System.IO.StreamReader(
                @"C:\\Users\\Asus\\Documents\\GIT\\howto_maze\\cup\\Laberinto1.xml");
            Laberinto overview = (Laberinto)reader.Deserialize(file);
            file.Close();

            Console.WriteLine(overview.nombre);
            Console.WriteLine(overview.);
            Console.WriteLine(overview.nombre);
            Console.WriteLine(overview.nombre);

        }
    }
}
