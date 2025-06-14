package lombok.javac.java7;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java7/CommentCollectingParser.SCL.lombok */
class CommentCollectingParser extends com.sun.tools.javac.parser.EndPosParser {
    private final com.sun.tools.javac.parser.Lexer lexer;

    protected CommentCollectingParser(com.sun.tools.javac.parser.ParserFactory r7, com.sun.tools.javac.parser.Lexer r8, boolean r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r0 = r6
            r1 = r8
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
            boolean r0 = r0 instanceof lombok.javac.java7.CommentCollectingScanner
            if (r0 == 0) goto L22
            r0 = r4
            com.sun.tools.javac.parser.Lexer r0 = r0.lexer
            lombok.javac.java7.CommentCollectingScanner r0 = (lombok.javac.java7.CommentCollectingScanner) r0
            com.sun.tools.javac.util.List r0 = r0.getComments()
            r6 = r0
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_comments
            r1 = r5
            r2 = r6
            r0.set(r1, r2)
        L22:
            r0 = r5
            return r0
    }
}
