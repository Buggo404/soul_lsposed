package lombok.javac.java6;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/java6/CommentCollectingParser.SCL.lombok */
class CommentCollectingParser extends com.sun.tools.javac.parser.EndPosParser {
    private final com.sun.tools.javac.parser.Lexer lexer;

    protected CommentCollectingParser(com.sun.tools.javac.parser.Parser.Factory r6, com.sun.tools.javac.parser.Lexer r7, boolean r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r5
            r1 = r7
            r0.lexer = r1
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCCompilationUnit compilationUnit() {
            r4 = this;
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = super.compilationUnit()
            r5 = r0
            r0 = r4
            com.sun.tools.javac.parser.Lexer r0 = r0.lexer
            boolean r0 = r0 instanceof lombok.javac.java6.CommentCollectingScanner
            if (r0 == 0) goto L22
            r0 = r4
            com.sun.tools.javac.parser.Lexer r0 = r0.lexer
            lombok.javac.java6.CommentCollectingScanner r0 = (lombok.javac.java6.CommentCollectingScanner) r0
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
