package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/DocCommentIntegrator.SCL.lombok */
public class DocCommentIntegrator {
    private static final java.util.regex.Pattern CONTENT_STRIPPER = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/DocCommentIntegrator$CommentAttacher_8.SCL.lombok */
    private static class CommentAttacher_8 {


        private CommentAttacher_8() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static void attach(com.sun.tools.javac.tree.JCTree r8, java.lang.String r9, int r10, java.lang.Object r11) {
                r0 = r9
                r12 = r0
                r0 = r11
                com.sun.tools.javac.tree.DocCommentTable r0 = (com.sun.tools.javac.tree.DocCommentTable) r0
                r1 = r8
                lombok.delombok.DocCommentIntegrator$CommentAttacher_8$1 r2 = new lombok.delombok.DocCommentIntegrator$CommentAttacher_8$1
                r3 = r2
                r4 = r12
                r5 = r10
                r6 = r8
                r3.<init>(r4, r5, r6)
                r0.putComment(r1, r2)
                return
        }
    }

    static {
            java.lang.String r0 = "^(?:\\s*\\*)?(.*?)$"
            r1 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            lombok.delombok.DocCommentIntegrator.CONTENT_STRIPPER = r0
            return
    }

    public DocCommentIntegrator() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.util.List<lombok.javac.CommentInfo> integrate(java.util.List<lombok.javac.CommentInfo> r6, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L86
        L19:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.CommentInfo r0 = (lombok.javac.CommentInfo) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.isJavadoc()
            if (r0 != 0) goto L39
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L86
        L39:
            r0 = r5
            r1 = r7
            r2 = r11
            int r2 = r2.endPos
            com.sun.tools.javac.tree.JCTree r0 = r0.findJavadocableNodeOnOrAfter(r1, r2)
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L56
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L86
        L56:
            r0 = r13
            r1 = r10
            if (r0 != r1) goto L66
            r0 = r8
            r1 = r9
            boolean r0 = r0.add(r1)
        L66:
            r0 = r5
            r1 = r7
            r2 = r13
            r3 = r11
            boolean r0 = r0.attach(r1, r2, r3)
            if (r0 != 0) goto L7e
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L86
        L7e:
            r0 = r13
            r10 = r0
            r0 = r11
            r9 = r0
        L86:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L19
            r0 = r8
            return r0
    }

    private boolean attach(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r6, com.sun.tools.javac.tree.JCTree r7, lombok.javac.CommentInfo r8) {
            r5 = this;
            r0 = r8
            java.lang.String r0 = r0.content
            r9 = r0
            r0 = r9
            java.lang.String r1 = "/**"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L18
            r0 = r9
            r1 = 3
            java.lang.String r0 = r0.substring(r1)
            r9 = r0
        L18:
            r0 = r9
            java.lang.String r1 = "*/"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L31
            r0 = r9
            r1 = 0
            r2 = r9
            int r2 = r2.length()
            r3 = 2
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r9 = r0
        L31:
            java.util.regex.Pattern r0 = lombok.delombok.DocCommentIntegrator.CONTENT_STRIPPER
            r1 = r9
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r1 = "$1"
            java.lang.String r0 = r0.replaceAll(r1)
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.trim()
            r9 = r0
            r0 = r6
            java.lang.Object r0 = lombok.javac.Javac.getDocComments(r0)
            if (r0 != 0) goto L52
            r0 = r6
            lombok.javac.Javac.initDocComments(r0)
        L52:
            r0 = r6
            java.lang.Object r0 = lombok.javac.Javac.getDocComments(r0)
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L70
            r0 = r10
            java.util.Map r0 = (java.util.Map) r0
            r1 = r7
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 1
            return r0
        L70:
            r0 = r10
            boolean r0 = lombok.javac.Javac.instanceOfDocCommentTable(r0)
            if (r0 == 0) goto L86
            r0 = r7
            r1 = r9
            r2 = r8
            int r2 = r2.pos
            r3 = r10
            lombok.delombok.DocCommentIntegrator.CommentAttacher_8.attach(r0, r1, r2, r3)
            r0 = 1
            return r0
        L86:
            r0 = 0
            return r0
    }

    private com.sun.tools.javac.tree.JCTree findJavadocableNodeOnOrAfter(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4, int r5) {
            r3 = this;
            r0 = r4
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.PackageName.getPackageNode(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L13
            r0 = r5
            r1 = r6
            int r1 = r1.pos
            if (r0 > r1) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto La7
        L1f:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            int r0 = r0.pos
            r1 = r5
            if (r0 >= r1) goto L8a
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto La7
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            r9 = r0
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L63
            goto L58
        L51:
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.tail
            r9 = r0
        L58:
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.tail
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L51
        L63:
            r0 = r9
            java.lang.Object r0 = r0.head
            if (r0 == 0) goto La7
            r0 = r9
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            int r0 = r0.pos
            r1 = r5
            if (r0 < r1) goto La7
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto La7
        L8a:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 != 0) goto La2
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 != 0) goto La2
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto La5
        La2:
            r0 = r8
            return r0
        La5:
            r0 = 0
            return r0
        La7:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
    }
}
