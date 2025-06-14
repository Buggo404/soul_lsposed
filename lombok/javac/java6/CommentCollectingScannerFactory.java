package lombok.javac.java6;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java6/CommentCollectingScannerFactory.SCL.lombok */
public class CommentCollectingScannerFactory extends com.sun.tools.javac.parser.Scanner.Factory {


    public static void preRegister(com.sun.tools.javac.util.Context r4) {
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.java6.CommentCollectingScannerFactory.scannerFactoryKey
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L1b
            lombok.javac.java6.CommentCollectingScannerFactory$1MyFactory r0 = new lombok.javac.java6.CommentCollectingScannerFactory$1MyFactory
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.java6.CommentCollectingScannerFactory.scannerFactoryKey
            r2 = r5
            r0.put(r1, r2)
        L1b:
            return
    }

    protected CommentCollectingScannerFactory(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public com.sun.tools.javac.parser.Scanner newScanner(java.lang.CharSequence r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L14
            lombok.javac.java6.CommentCollectingScanner r0 = new lombok.javac.java6.CommentCollectingScanner
            r1 = r0
            r2 = r5
            r3 = r6
            java.nio.CharBuffer r3 = (java.nio.CharBuffer) r3
            r1.<init>(r2, r3)
            return r0
        L14:
            r0 = r6
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = r7
            int r2 = r2.length
            com.sun.tools.javac.parser.Scanner r0 = r0.newScanner(r1, r2)
            return r0
    }

    public com.sun.tools.javac.parser.Scanner newScanner(char[] r7, int r8) {
            r6 = this;
            lombok.javac.java6.CommentCollectingScanner r0 = new lombok.javac.java6.CommentCollectingScanner
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }
}
