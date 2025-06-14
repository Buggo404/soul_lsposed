package lombok.javac.java8;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java8/CommentCollectingScannerFactory.SCL.lombok */
public class CommentCollectingScannerFactory extends com.sun.tools.javac.parser.ScannerFactory {
    public static boolean findTextBlocks;


    public static void preRegister(com.sun.tools.javac.util.Context r4) {
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.java8.CommentCollectingScannerFactory.scannerFactoryKey
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L1b
            lombok.javac.java8.CommentCollectingScannerFactory$1MyFactory r0 = new lombok.javac.java8.CommentCollectingScannerFactory$1MyFactory
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            com.sun.tools.javac.util.Context$Key r1 = lombok.javac.java8.CommentCollectingScannerFactory.scannerFactoryKey
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

    public com.sun.tools.javac.parser.Scanner newScanner(java.lang.CharSequence r7, boolean r8) {
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L30
            r0 = r7
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L30
            r0 = r7
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            r11 = r0
            r0 = r11
            java.nio.CharBuffer r0 = r0.compact()
            java.nio.Buffer r0 = r0.flip()
            r0 = r11
            char[] r0 = r0.array()
            r9 = r0
            r0 = r11
            int r0 = r0.limit()
            r10 = r0
            goto L3e
        L30:
            r0 = r7
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
        L3e:
            r0 = r9
            int r0 = r0.length
            r1 = r10
            if (r0 != r1) goto L5a
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r11 = r0
            r0 = r9
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r10
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            r9 = r0
        L5a:
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r8
            com.sun.tools.javac.parser.Scanner r0 = r0.newScanner(r1, r2, r3)
            return r0
    }

    public com.sun.tools.javac.parser.Scanner newScanner(char[] r9, int r10, boolean r11) {
            r8 = this;
            lombok.javac.java8.CommentCollectingScanner r0 = new lombok.javac.java8.CommentCollectingScanner
            r1 = r0
            r2 = r8
            r3 = r8
            r4 = r9
            r5 = r10
            boolean r6 = lombok.javac.java8.CommentCollectingScannerFactory.findTextBlocks
            lombok.javac.java8.CommentCollectingTokenizer r3 = lombok.javac.java8.CommentCollectingTokenizer.create(r3, r4, r5, r6)
            r1.<init>(r2, r3)
            return r0
    }
}
