package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CommentCatcher.SCL.lombok */
public class CommentCatcher {
    private final com.sun.tools.javac.main.JavaCompiler compiler;
    public static final lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree.JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> JCCompilationUnit_comments = null;
    public static final lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree.JCCompilationUnit, java.util.List<java.lang.Integer>> JCCompilationUnit_textBlockStarts = null;

    static {
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.String r2 = "lombok$comments"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.javac.CommentCatcher.JCCompilationUnit_comments = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r0 = com.sun.tools.javac.tree.JCTree.JCCompilationUnit.class
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.String r2 = "lombok$textBlockStarts"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.javac.CommentCatcher.JCCompilationUnit_textBlockStarts = r0
            return
    }

    public static lombok.javac.CommentCatcher create(com.sun.tools.javac.util.Context r4, boolean r5) {
            r0 = r4
            r1 = r5
            registerCommentsCollectingScannerFactory(r0, r1)
            com.sun.tools.javac.main.JavaCompiler r0 = new com.sun.tools.javac.main.JavaCompiler
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r4
            setInCompiler(r0, r1)
            r0 = r6
            r1 = 1
            r0.keepComments = r1
            r0 = r6
            r1 = 1
            r0.genEndPos = r1
            lombok.javac.CommentCatcher r0 = new lombok.javac.CommentCatcher
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    private CommentCatcher(com.sun.tools.javac.main.JavaCompiler r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.compiler = r1
            return
    }

    public com.sun.tools.javac.main.JavaCompiler getCompiler() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.main.JavaCompiler r0 = r0.compiler
            return r0
    }

    public void setComments(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r5, java.util.List<lombok.javac.CommentInfo> r6) {
            r4 = this;
            r0 = r6
            if (r0 == 0) goto Lf
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_comments
            r1 = r5
            r2 = r6
            r0.set(r1, r2)
            goto L17
        Lf:
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_comments
            r1 = r5
            java.lang.Object r0 = r0.clear(r1)
        L17:
            return
    }

    public java.util.List<lombok.javac.CommentInfo> getComments(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            r3 = this;
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<lombok.javac.CommentInfo>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_comments
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L15
            java.util.List r0 = java.util.Collections.emptyList()
            goto L16
        L15:
            r0 = r5
        L16:
            return r0
    }

    public java.util.List<java.lang.Integer> getTextBlockStarts(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4) {
            r3 = this;
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCCompilationUnit, java.util.List<java.lang.Integer>> r0 = lombok.javac.CommentCatcher.JCCompilationUnit_textBlockStarts
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L15
            java.util.List r0 = java.util.Collections.emptyList()
            goto L16
        L15:
            r0 = r5
        L16:
            return r0
    }

    private static void registerCommentsCollectingScannerFactory(com.sun.tools.javac.util.Context r7, boolean r8) {
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r10 = r0
            r0 = r10
            r1 = 6
            if (r0 > r1) goto L13
            java.lang.String r0 = "lombok.javac.java6.CommentCollectingScannerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r9 = r0
            goto L3a
        L13:
            r0 = r10
            r1 = 7
            if (r0 != r1) goto L22
            java.lang.String r0 = "lombok.javac.java7.CommentCollectingScannerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r9 = r0
            goto L3a
        L22:
            java.lang.String r0 = "lombok.javac.java8.CommentCollectingScannerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r9
            java.lang.String r1 = "findTextBlocks"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r1 = 0
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r0.set(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
        L3a:
            r0 = r9
            java.lang.String r1 = "preRegister"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Context> r5 = com.sun.tools.javac.util.Context.class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.Exception -> L62
            goto L68
        L59:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L62:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L68:
            return
    }

    private static void setInCompiler(com.sun.tools.javac.main.JavaCompiler r7, com.sun.tools.javac.util.Context r8) {
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r10 = r0
            r0 = r10
            r1 = 6
            if (r0 > r1) goto L13
            java.lang.String r0 = "lombok.javac.java6.CommentCollectingParserFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r9 = r0
            goto L37
        L13:
            r0 = r10
            r1 = 7
            if (r0 != r1) goto L22
            java.lang.String r0 = "lombok.javac.java7.CommentCollectingParserFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r9 = r0
            goto L37
        L22:
            r0 = r10
            r1 = 8
            if (r0 != r1) goto L31
            java.lang.String r0 = "lombok.javac.java8.CommentCollectingParserFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r9 = r0
            goto L37
        L31:
            java.lang.String r0 = "lombok.javac.java9.CommentCollectingParserFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r9 = r0
        L37:
            r0 = r9
            java.lang.String r1 = "setInCompiler"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.main.JavaCompiler> r5 = com.sun.tools.javac.main.JavaCompiler.class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.Context> r5 = com.sun.tools.javac.util.Context.class
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r1 = 0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.Exception -> L68
            goto L6e
        L5f:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L68:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L6e:
            return
    }
}
