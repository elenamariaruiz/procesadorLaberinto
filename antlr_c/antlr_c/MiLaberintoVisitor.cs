using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using antlr_c.Generated;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using antlr_c.Clases;

namespace antlr_c
{
    public class MiLaberintoVisitor :LaberintoBaseVisitor<object>
    {
        public override object Visit([NotNull] IParseTree tree)
        {
            return base.Visit(tree);
        }
        public override object VisitInicio([NotNull] LaberintoParser.InicioContext context)
        {
            
            Console.WriteLine(context.IDENT().ToString());
            return base.VisitInicio(context);
            //return context;
        }

        public override object VisitBloque([NotNull] LaberintoParser.BloqueContext context)
        {
            return base.VisitBloque(context);
        }
        public override object VisitStart([NotNull] LaberintoParser.StartContext context)
        {
            int x = int.Parse(context.coord().NUMERO().ElementAt(0).ToString());
            int y = int.Parse(context.coord().NUMERO().ElementAt(1).ToString());
            Coordenada cordInicio = new Coordenada(x, y);
            Console.WriteLine(cordInicio.getCoordX());
            Console.WriteLine(cordInicio.getCoordY());
            return base.VisitStart(context);
        }
    }
}


