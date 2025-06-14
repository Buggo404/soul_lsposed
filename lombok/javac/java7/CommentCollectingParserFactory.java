package lombok.javac.java7;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java7/CommentCollectingParserFactory.SCL.lombok */
public class CommentCollectingParserFactory extends com.sun.tools.javac.parser.ParserFactory {
    private final com.sun.tools.javac.util.Context context;

    static com.sun.tools.javac.util.Context.Key<com.sun.tools.javac.parser.ParserFactory> key() {
            com.sun.tools.javac.util.Context$Key r0 = lombok.javac.java7.CommentCollectingParserFactory.parserFactoryKey
            return r0
    }

    protected CommentCollectingParserFactory(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.context = r1
            return
    }

    public com.sun.tools.javac.parser.Parser newParser(java.lang.CharSequence r8, boolean r9, boolean r10, boolean r11) {
            r7 = this;
            r0 = r7
            com.sun.tools.javac.util.Context r0 = r0.context
            com.sun.tools.javac.parser.ScannerFactory r0 = com.sun.tools.javac.parser.ScannerFactory.instance(r0)
            r12 = r0
            r0 = r12
            r1 = r8
            r2 = 1
            com.sun.tools.javac.parser.Scanner r0 = r0.newScanner(r1, r2)
            r13 = r0
            lombok.javac.java7.CommentCollectingParser r0 = new lombok.javac.java7.CommentCollectingParser
            r1 = r0
            r2 = r7
            r3 = r13
            r4 = 1
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r14
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
            lombok.javac.java7.CommentCollectingParserFactory r2 = new lombok.javac.java7.CommentCollectingParserFactory     // Catch: java.lang.Exception -> L20
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
