package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTransformer.SCL.lombok */
public class JavacTransformer {
    private final lombok.javac.HandlerLibrary handlers;
    private final javax.annotation.processing.Messager messager;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTransformer$AnnotationVisitor.SCL.lombok */
    private class AnnotationVisitor extends lombok.javac.JavacASTAdapter {
        private final long priority;
        final /* synthetic */ lombok.javac.JavacTransformer this$0;

        AnnotationVisitor(lombok.javac.JavacTransformer r5, long r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r6
                r0.priority = r1
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnType(com.sun.tools.javac.tree.JCTree.JCClassDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r9
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r11 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r11
                r2 = r9
                r3 = r10
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnField(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r9
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r11 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r11
                r2 = r9
                r3 = r10
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnMethod(com.sun.tools.javac.tree.JCTree.JCMethodDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r9
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r11 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r11
                r2 = r9
                r3 = r10
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnMethodArgument(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, com.sun.tools.javac.tree.JCTree.JCMethodDecl r9, lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCAnnotation r11) {
                r7 = this;
                r0 = r10
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r12 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r12
                r2 = r10
                r3 = r11
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnLocal(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r9
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r11 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r11
                r2 = r9
                r3 = r10
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }

        @Override // lombok.javac.JavacASTAdapter, lombok.javac.JavacASTVisitor
        public void visitAnnotationOnTypeUse(com.sun.tools.javac.tree.JCTree r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r9
                lombok.core.LombokNode r0 = r0.top()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
                r11 = r0
                r0 = r7
                lombok.javac.JavacTransformer r0 = r0.this$0
                lombok.javac.HandlerLibrary r0 = lombok.javac.JavacTransformer.access$0(r0)
                r1 = r11
                r2 = r9
                r3 = r10
                r4 = r7
                long r4 = r4.priority
                r0.handleAnnotation(r1, r2, r3, r4)
                return
        }
    }

    public JavacTransformer(javax.annotation.processing.Messager r5, com.sun.source.util.Trees r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.messager = r1
            r0 = r4
            r1 = r5
            r2 = r6
            lombok.javac.HandlerLibrary r1 = lombok.javac.HandlerLibrary.load(r1, r2)
            r0.handlers = r1
            return
    }

    public java.util.SortedSet<java.lang.Long> getPriorities() {
            r2 = this;
            r0 = r2
            lombok.javac.HandlerLibrary r0 = r0.handlers
            java.util.SortedSet r0 = r0.getPriorities()
            return r0
    }

    public java.util.SortedSet<java.lang.Long> getPrioritiesRequiringResolutionReset() {
            r2 = this;
            r0 = r2
            lombok.javac.HandlerLibrary r0 = r0.handlers
            java.util.SortedSet r0 = r0.getPrioritiesRequiringResolutionReset()
            return r0
    }

    public void transform(long r8, com.sun.tools.javac.util.Context r10, java.util.List<com.sun.tools.javac.tree.JCTree.JCCompilationUnit> r11, lombok.core.CleanupRegistry r12) {
            r7 = this;
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L70
        Lc:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r13 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.LOMBOK_DISABLE
            r2 = r13
            java.net.URI r2 = lombok.javac.JavacAST.getAbsoluteFileLocation(r2)
            java.lang.Object r1 = lombok.core.LombokConfiguration.read(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L70
            lombok.javac.JavacAST r0 = new lombok.javac.JavacAST
            r1 = r0
            r2 = r7
            javax.annotation.processing.Messager r2 = r2.messager
            r3 = r10
            r4 = r13
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            lombok.javac.JavacTransformer$AnnotationVisitor r1 = new lombok.javac.JavacTransformer$AnnotationVisitor
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.traverse(r1)
            r0 = r7
            lombok.javac.HandlerLibrary r0 = r0.handlers
            r1 = r15
            r2 = r8
            r0.callASTVisitors(r1, r2)
            r0 = r15
            boolean r0 = r0.isChanged()
            if (r0 == 0) goto L70
            r0 = r10
            r1 = r15
            lombok.core.LombokNode r1 = r1.top()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            lombok.javac.LombokOptions.markChanged(r0, r1)
        L70:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            return
    }

    static /* synthetic */ lombok.javac.HandlerLibrary access$0(lombok.javac.JavacTransformer r2) {
            r0 = r2
            lombok.javac.HandlerLibrary r0 = r0.handlers
            return r0
    }
}
