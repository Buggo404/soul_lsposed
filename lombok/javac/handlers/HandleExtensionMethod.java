package lombok.javac.handlers;

@lombok.core.HandlerPriority(66560)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleExtensionMethod.SCL.lombok */
public class HandleExtensionMethod extends lombok.javac.JavacAnnotationHandler<lombok.experimental.ExtensionMethod> {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleExtensionMethod$Extension.SCL.lombok */
    private static class Extension {
        final java.util.List<com.sun.tools.javac.code.Symbol.MethodSymbol> extensionMethods;
        final com.sun.tools.javac.code.Symbol.TypeSymbol extensionProvider;

        public Extension(java.util.List<com.sun.tools.javac.code.Symbol.MethodSymbol> r4, com.sun.tools.javac.code.Symbol.TypeSymbol r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.extensionMethods = r1
                r0 = r3
                r1 = r5
                r0.extensionProvider = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleExtensionMethod$ExtensionMethodReplaceVisitor.SCL.lombok */
    private static class ExtensionMethodReplaceVisitor extends com.sun.source.util.TreeScanner<java.lang.Void, java.lang.Void> {
        final lombok.javac.JavacNode annotationNode;
        final java.util.List<lombok.javac.handlers.HandleExtensionMethod.Extension> extensions;
        final boolean suppressBaseMethods;

        public ExtensionMethodReplaceVisitor(lombok.javac.JavacNode r4, java.util.List<lombok.javac.handlers.HandleExtensionMethod.Extension> r5, boolean r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.annotationNode = r1
                r0 = r3
                r1 = r5
                r0.extensions = r1
                r0 = r3
                r1 = r6
                r0.suppressBaseMethods = r1
                return
        }

        public void replace() {
                r4 = this;
                r0 = r4
                lombok.javac.JavacNode r0 = r0.annotationNode
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
                r1 = r4
                r2 = 0
                java.lang.Object r0 = r0.accept(r1, r2)
                return
        }

        public java.lang.Void visitMethodInvocation(com.sun.source.tree.MethodInvocationTree r5, java.lang.Void r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.Object r0 = super.visitMethodInvocation(r1, r2)
                r0 = r4
                r1 = r5
                com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r1
                r0.handleMethodCall(r1)
                r0 = 0
                return r0
        }

        private void handleMethodCall(com.sun.tools.javac.tree.JCTree.JCMethodInvocation r7) {
                r6 = this;
                r0 = r6
                lombok.javac.JavacNode r0 = r0.annotationNode
                lombok.javac.JavacAST r0 = r0.getAst()
                r1 = r7
                lombok.core.LombokNode r0 = r0.get(r1)
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L14
                return
            L14:
                r0 = r8
                lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
                r9 = r0
                r0 = r9
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
                com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
                r10 = r0
                r0 = r6
                r1 = r7
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.receiverOf(r1)
                r11 = r0
                r0 = r6
                r1 = r7
                java.lang.String r0 = r0.methodNameOf(r1)
                r12 = r0
                java.lang.String r0 = "this"
                r1 = r11
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L54
                java.lang.String r0 = "this"
                r1 = r12
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L54
                java.lang.String r0 = "super"
                r1 = r12
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L55
            L54:
                return
            L55:
                lombok.javac.JavacResolution r0 = new lombok.javac.JavacResolution
                r1 = r0
                r2 = r8
                com.sun.tools.javac.util.Context r2 = r2.getContext()
                r1.<init>(r2)
                r1 = r8
                java.util.Map r0 = r0.resolveMethodMember(r1)
                r13 = r0
                r0 = r13
                r1 = r7
                java.lang.Object r0 = r0.get(r1)
                com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L80
                r0 = r14
                com.sun.tools.javac.code.Type r0 = r0.type
                if (r0 != 0) goto L81
            L80:
                return
            L81:
                r0 = r6
                boolean r0 = r0.suppressBaseMethods
                if (r0 != 0) goto L94
                r0 = r14
                com.sun.tools.javac.code.Type r0 = r0.type
                boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ErrorType
                if (r0 != 0) goto L94
                return
            L94:
                r0 = r13
                r1 = r11
                java.lang.Object r0 = r0.get(r1)
                com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
                r15 = r0
                r0 = r15
                if (r0 == 0) goto Laf
                r0 = r15
                com.sun.tools.javac.code.Type r0 = r0.type
                if (r0 != 0) goto Lb0
            Laf:
                return
            Lb0:
                r0 = r15
                com.sun.tools.javac.code.Type r0 = r0.type
                r16 = r0
                r0 = 0
                r17 = r0
                r0 = r15
                boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
                if (r0 == 0) goto Lcf
                r0 = r15
                com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
                com.sun.tools.javac.code.Symbol r0 = r0.sym
                r17 = r0
                goto Le1
            Lcf:
                r0 = r15
                boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
                if (r0 == 0) goto Le1
                r0 = r15
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
                com.sun.tools.javac.code.Symbol r0 = r0.sym
                r17 = r0
            Le1:
                r0 = r17
                boolean r0 = r0 instanceof com.sun.tools.javac.code.Symbol.ClassSymbol
                if (r0 == 0) goto Lea
                return
            Lea:
                r0 = r6
                lombok.javac.JavacNode r0 = r0.annotationNode
                com.sun.tools.javac.util.Context r0 = r0.getContext()
                com.sun.tools.javac.code.Types r0 = com.sun.tools.javac.code.Types.instance(r0)
                r18 = r0
                r0 = r6
                java.util.List<lombok.javac.handlers.HandleExtensionMethod$Extension> r0 = r0.extensions
                java.util.Iterator r0 = r0.iterator()
                r20 = r0
                goto L1da
            L104:
                r0 = r20
                java.lang.Object r0 = r0.next()
                lombok.javac.handlers.HandleExtensionMethod$Extension r0 = (lombok.javac.handlers.HandleExtensionMethod.Extension) r0
                r19 = r0
                r0 = r19
                com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.extensionProvider
                r21 = r0
                r0 = r10
                r1 = r21
                if (r0 != r1) goto L121
                goto L1da
            L121:
                r0 = r19
                java.util.List<com.sun.tools.javac.code.Symbol$MethodSymbol> r0 = r0.extensionMethods
                java.util.Iterator r0 = r0.iterator()
                r23 = r0
                goto L1d0
            L130:
                r0 = r23
                java.lang.Object r0 = r0.next()
                com.sun.tools.javac.code.Symbol$MethodSymbol r0 = (com.sun.tools.javac.code.Symbol.MethodSymbol) r0
                r22 = r0
                r0 = r12
                r1 = r22
                com.sun.tools.javac.util.Name r1 = r1.name
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L14f
                goto L1d0
            L14f:
                r0 = r22
                com.sun.tools.javac.code.Type r0 = r0.type
                r24 = r0
                java.lang.Class<com.sun.tools.javac.code.Type$MethodType> r0 = com.sun.tools.javac.code.Type.MethodType.class
                r1 = r24
                boolean r0 = r0.isInstance(r1)
                if (r0 != 0) goto L16d
                java.lang.Class<com.sun.tools.javac.code.Type$ForAll> r0 = com.sun.tools.javac.code.Type.ForAll.class
                r1 = r24
                boolean r0 = r0.isInstance(r1)
                if (r0 != 0) goto L16d
                goto L1d0
            L16d:
                r0 = r18
                r1 = r24
                com.sun.tools.javac.code.Type$MethodType r1 = r1.asMethodType()
                com.sun.tools.javac.util.List r1 = r1.argtypes
                r2 = 0
                java.lang.Object r1 = r1.get(r2)
                com.sun.tools.javac.code.Type r1 = (com.sun.tools.javac.code.Type) r1
                com.sun.tools.javac.code.Type r0 = r0.erasure(r1)
                r25 = r0
                r0 = r18
                r1 = r16
                r2 = r25
                boolean r0 = r0.isAssignable(r1, r2)
                if (r0 != 0) goto L192
                goto L1d0
            L192:
                r0 = r7
                r1 = r7
                com.sun.tools.javac.util.List r1 = r1.args
                r2 = r11
                com.sun.tools.javac.util.List r1 = r1.prepend(r2)
                r0.args = r1
                r0 = r7
                r1 = r6
                lombok.javac.JavacNode r1 = r1.annotationNode
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r4 = r21
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r3.<init>(r4)
                java.lang.String r3 = "."
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r12
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r1, r2)
                r0.meth = r1
                r0 = r7
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                r1 = r8
                com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
                return
            L1d0:
                r0 = r23
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L130
            L1da:
                r0 = r20
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L104
                return
        }

        private java.lang.String methodNameOf(com.sun.tools.javac.tree.JCTree.JCMethodInvocation r3) {
                r2 = this;
                r0 = r3
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
                if (r0 == 0) goto L18
                r0 = r3
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
                com.sun.tools.javac.util.Name r0 = r0.name
                java.lang.String r0 = r0.toString()
                return r0
            L18:
                r0 = r3
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
                com.sun.tools.javac.util.Name r0 = r0.name
                java.lang.String r0 = r0.toString()
                return r0
        }

        private com.sun.tools.javac.tree.JCTree.JCExpression receiverOf(com.sun.tools.javac.tree.JCTree.JCMethodInvocation r5) {
                r4 = this;
                r0 = r5
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
                if (r0 == 0) goto L1e
                r0 = r4
                lombok.javac.JavacNode r0 = r0.annotationNode
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r1 = r4
                lombok.javac.JavacNode r1 = r1.annotationNode
                java.lang.String r2 = "this"
                com.sun.tools.javac.util.Name r1 = r1.toName(r2)
                com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
                return r0
            L1e:
                r0 = r5
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object visitMethodInvocation(com.sun.source.tree.MethodInvocationTree r5, java.lang.Object r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.Void r2 = (java.lang.Void) r2
                java.lang.Void r0 = r0.visitMethodInvocation(r1, r2)
                return r0
        }
    }

    public HandleExtensionMethod() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.ExtensionMethod> r8, com.sun.tools.javac.tree.JCTree.JCAnnotation r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.EXTENSION_METHOD_FLAG_USAGE
            java.lang.String r2 = "@ExtensionMethod"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r10
            java.lang.Class<lombok.experimental.ExtensionMethod> r1 = lombok.experimental.ExtensionMethod.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassOrEnumOrInterface(r0)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L2b
            r0 = r10
            java.lang.String r1 = "@ExtensionMethod can only be used on a class or an enum or an interface"
            r0.addError(r1)
            return
        L2b:
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.ExtensionMethod r0 = (lombok.experimental.ExtensionMethod) r0
            boolean r0 = r0.suppressBaseMethods()
            r13 = r0
            r0 = r8
            java.lang.String r1 = "value"
            java.util.List r0 = r0.getActualExpressions(r1)
            r14 = r0
            r0 = r14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L61
            r0 = r10
            java.lang.String r1 = "@%s has no effect since no extension types were specified."
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<lombok.experimental.ExtensionMethod> r5 = lombok.experimental.ExtensionMethod.class
            java.lang.String r5 = r5.getName()
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
            return
        L61:
            r0 = r7
            r1 = r10
            r2 = r14
            java.util.List r0 = r0.getExtensions(r1, r2)
            r15 = r0
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L75
            return
        L75:
            lombok.javac.handlers.HandleExtensionMethod$ExtensionMethodReplaceVisitor r0 = new lombok.javac.handlers.HandleExtensionMethod$ExtensionMethodReplaceVisitor
            r1 = r0
            r2 = r10
            r3 = r15
            r4 = r13
            r1.<init>(r2, r3, r4)
            r0.replace()
            r0 = r10
            r0.rebuild()
            return
    }

    public java.util.List<lombok.javac.handlers.HandleExtensionMethod.Extension> getExtensions(lombok.javac.JavacNode r6, java.util.List<java.lang.Object> r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L7c
        L13:
            r0 = r10
            java.lang.Object r0 = r0.next()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L27
            goto L7c
        L27:
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r11 = r0
            java.lang.String r0 = "class"
            r1 = r11
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L7c
        L41:
            lombok.javac.handlers.JavacResolver r0 = lombok.javac.handlers.JavacResolver.CLASS
            r1 = r6
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.selected
            com.sun.tools.javac.code.Type r0 = r0.resolveMember(r1, r2)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L57
            goto L7c
        L57:
            r0 = r12
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym
            long r0 = r0.flags()
            r1 = 8704(0x2200, double:4.3003E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            goto L7c
        L6b:
            r0 = r8
            r1 = r5
            r2 = r6
            r3 = r12
            com.sun.tools.javac.code.Type$ClassType r3 = (com.sun.tools.javac.code.Type.ClassType) r3
            lombok.javac.handlers.HandleExtensionMethod$Extension r1 = r1.getExtension(r2, r3)
            boolean r0 = r0.add(r1)
        L7c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r8
            return r0
    }

    public lombok.javac.handlers.HandleExtensionMethod.Extension getExtension(lombok.javac.JavacNode r6, com.sun.tools.javac.code.Type.ClassType r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.asElement()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L84
            r0 = r9
            java.util.List r0 = r0.getEnclosedElements()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L7a
        L22:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Symbol r0 = (com.sun.tools.javac.code.Symbol) r0
            r10 = r0
            r0 = r10
            javax.lang.model.element.ElementKind r0 = r0.getKind()
            javax.lang.model.element.ElementKind r1 = javax.lang.model.element.ElementKind.METHOD
            if (r0 == r1) goto L3c
            goto L7a
        L3c:
            r0 = r10
            com.sun.tools.javac.code.Symbol$MethodSymbol r0 = (com.sun.tools.javac.code.Symbol.MethodSymbol) r0
            r12 = r0
            r0 = r12
            long r0 = r0.flags()
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            goto L7a
        L54:
            r0 = r12
            long r0 = r0.flags()
            r1 = 1
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L63
            goto L7a
        L63:
            r0 = r12
            com.sun.tools.javac.util.List r0 = r0.params()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L71
            goto L7a
        L71:
            r0 = r8
            r1 = r12
            boolean r0 = r0.add(r1)
        L7a:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L22
        L84:
            lombok.javac.handlers.HandleExtensionMethod$Extension r0 = new lombok.javac.handlers.HandleExtensionMethod$Extension
            r1 = r0
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }
}
