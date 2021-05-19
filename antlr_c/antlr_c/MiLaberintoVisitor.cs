using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using antlr_c.Generated;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

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
    }
}


