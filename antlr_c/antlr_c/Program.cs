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
using System.Windows.Forms;
using howto_maze;
using Antlr4.Runtime.Tree;
using CrearLaberinto;

namespace antlr_c
{
    class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            try
            {

                System.Windows.Forms.Application.EnableVisualStyles();
                Application.SetCompatibleTextRenderingDefault(false);
                Application.Run(new CrearLaberintoForm());

                

                
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: " + ex, "Error",
                            MessageBoxButtons.OK, MessageBoxIcon.Error);
                System.Diagnostics.Debug.WriteLine("Error: " + ex);
            }

        }
    }    

        
}
