package lombok.javac.java8;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java8/CommentCollectingScanner.SCL.lombok */
public class CommentCollectingScanner extends com.sun.tools.javac.parser.Scanner {
    private lombok.javac.java8.CommentCollectingTokenizer tokenizer;

    public CommentCollectingScanner(com.sun.tools.javac.parser.ScannerFactory r5, lombok.javac.java8.CommentCollectingTokenizer r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.tokenizer = r1
            return
    }

    public com.sun.tools.javac.util.List<lombok.javac.CommentInfo> getComments() {
            r2 = this;
            r0 = r2
            lombok.javac.java8.CommentCollectingTokenizer r0 = r0.tokenizer
            com.sun.tools.javac.util.List r0 = r0.getComments()
            return r0
    }

    public com.sun.tools.javac.util.List<java.lang.Integer> getTextBlockStarts() {
            r2 = this;
            r0 = r2
            lombok.javac.java8.CommentCollectingTokenizer r0 = r0.tokenizer
            com.sun.tools.javac.util.List r0 = r0.getTextBlockStarts()
            return r0
    }
}
