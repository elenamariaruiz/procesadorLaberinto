using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using antlr_c.Generated;
using Antlr4.Runtime.Misc;

namespace antlr_c
{
    public class MiLaberintoVisitor :LaberintoBaseVisitor<object>
    {
        public override object VisitInicio([NotNull] LaberintoParser.InicioContext context)
        {
            Console.WriteLine(context.GetText());
            return base.VisitInicio(context);
        }

        public override object VisitBloque([NotNull] LaberintoParser.BloqueContext context)
        {
            return base.VisitBloque(context);
        }
    }
}


