package org.antlrfun;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Hello {
    public static void main(String [] args) throws Exception
    {

        ANTLRInputStream antlrInputStream = new ANTLRInputStream("hello world");

        HelloLexer lexer = new HelloLexer(antlrInputStream);

        CommonTokenStream tokens = new CommonTokenStream( lexer );
        HelloParser parser = new HelloParser( tokens );
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new HelloWalker(), tree );
    }
}