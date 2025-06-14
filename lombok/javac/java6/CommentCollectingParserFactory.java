package lombok.javac.java6;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java6/CommentCollectingParserFactory.SCL.lombok */
public class CommentCollectingParserFactory extends com.sun.tools.javac.parser.Parser.Factory {
    static com.sun.tools.javac.util.Context.Key<com.sun.tools.javac.parser.Parser.Factory> key() {
            com.sun.tools.javac.util.Context$Key r0 = lombok.javac.java6.CommentCollectingParserFactory.parserFactoryKey
            return r0
    }

    protected CommentCollectingParserFactory(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public com.sun.tools.javac.parser.Parser newParser(com.sun.tools.javac.parser.Lexer r7, boolean r8, boolean r9) {
            r6 = this;
            lombok.javac.java6.CommentCollectingParser r0 = new lombok.javac.java6.CommentCollectingParser
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 1
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            com.sun.tools.javac.parser.Parser r0 = (com.sun.tools.javac.parser.Parser) r0
            return r0
    }

    public static void setInCompiler(com.sun.tools.javac.main.JavaCompiler r6, com.sun.tools.javac.util.Context r7) {
            r0 = r7
            com.sun.tools.javac.util.Context$Key r1 = key()
            r2 = 0
            r0.put(r1, r2)
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r0 = com.sun.tools.javac.main.JavaCompiler.class
            java.lang.String r1 = "parserFactory"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L20
            r8 = r0
            r0 = r8
            r1 = r6
            lombok.javac.java6.CommentCollectingParserFactory r2 = new lombok.javac.java6.CommentCollectingParserFactory     // Catch: java.lang.Exception -> L20
            r3 = r2
            r4 = r7
            r3.<init>(r4)     // Catch: java.lang.Exception -> L20
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L20
            goto L2c
        L20:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Could not set comment sensitive parser in the compiler"
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L2c:
            return
    }
}
