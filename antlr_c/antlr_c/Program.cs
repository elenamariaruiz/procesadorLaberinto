using Antlr4.Runtime;
using System;
using System.IO;
using System.Text;
using antlr_c.Generated;

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
                
                Console.WriteLine(tree.ToStringTree());
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
    }
}
