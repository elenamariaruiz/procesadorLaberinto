using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;

namespace antlr_c
{
    public class MyErrorListener : BaseErrorListener
    {
        override
        public void SyntaxError(IRecognizer recognizer,  IToken offendingSymbol, int line, int charPositionInLine,  string msg, RecognitionException e)
        {
            throw new Exception("Error en linea: " + line + ", columna: " + charPositionInLine + ". " + msg);
        }
    }
}
