import sys
from argparse import ArgumentParser
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker, InputStream
from LaberintoLexer import LaberintoLexer
from LaberintoParser import LaberintoParser
 
def main(args):
    input_stream = FileStream(args.input_file, encoding="utf-8")
    lexer = LaberintoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LaberintoParser(stream)

    tree = parser.inicio()
    print(tree)


    

def build_argparser():
    argparser = ArgumentParser()
    argparser.add_argument(
        "-i", "--input_file",
        help="Cadena de entrada del procesador de lenguajes."
    )
    argparser.add_argument(
        "-o", "--output_dir",
        help="Directorio donde el lenguaje de salida será guardado.",
        default="."
    )
    return argparser

 
if __name__ == '__main__':
    parser = build_argparser()
    print(main(parser.parse_args()))