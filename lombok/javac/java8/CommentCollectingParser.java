package lombok.javac.java8;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java8/CommentCollectingParser.SCL.lombok */
class CommentCollectingParser extends com.sun.tools.javac.parser.JavacParser {
    private final com.sun.tools.javac.parser.Lexer lexer;

    protected CommentCollectingParser(com.sun.tools.javac.parser.ParserFactory r8, com.sun.tools.javac.parser.Lexer r9, boolean r10, boolean r11, boolean r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r9
            r0.lexer = r1
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCCompilationUnit parseCompilationUnit() {
            r4 = this;
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = super.parseCompilationUnit()
            r5 = r0
            r0 = r4
            com.sun.tools.javac.parser.Lexer r0 = r0.lexer
            boolean r0 = r0 instanceof lombok.javac.java8.CommentCollectingScanner
            if (r0 == 0) goto L31
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_comments
            r1 = r5
            r2 = r4
            com.sun.tools.javac.parser.Lexer r2 = r2.lexer
            lombok.javac.java8.CommentCollectingScanner r2 = (lombok.javac.java8.CommentCollectingScanner) r2
            com.sun.tools.javac.util.List r2 = r2.getComments()
            r0.set(r1, r2)
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<java.lang.Integer>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_textBlockStarts
            r1 = r5
            r2 = r4
            com.sun.tools.javac.parser.Lexer r2 = r2.lexer
            lombok.javac.java8.CommentCollectingScanner r2 = (lombok.javac.java8.CommentCollectingScanner) r2
            com.sun.tools.javac.util.List r2 = r2.getTextBlockStarts()
            r0.set(r1, r2)
        L31:
            r0 = r5
            return r0
    }
}
