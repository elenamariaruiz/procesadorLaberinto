import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("../../doc/Lenguaje.txt");
        CharStream charStream = new ANTLRInputStream(fis);
        LaberintoLexer lexer = new LaberintoLexer(charStream);
        GachaneitorParser parser = new GachaneitorParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.inicio();
        System.out.println(tree.toStringTree(parser));

    }
}