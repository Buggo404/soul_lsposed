package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchJavadoc.SCL.lombok */
public class PatchJavadoc {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchJavadoc$Reflection.SCL.lombok */
    private static class Reflection {
        private static final java.lang.reflect.Method javadoc2HTML = null;
        private static final java.lang.reflect.Method oldJavadoc2HTML = null;
        private static final java.lang.reflect.Method lsJavadoc2HTML = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                java.lang.Class<org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2> r0 = org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2.class
                java.lang.String r1 = "javadoc2HTML"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L24
                r3 = r2
                r4 = 0
                java.lang.Class<org.eclipse.jdt.core.IMember> r5 = org.eclipse.jdt.core.IMember.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L24
                r3 = r2
                r4 = 1
                java.lang.Class<org.eclipse.jdt.core.IJavaElement> r5 = org.eclipse.jdt.core.IJavaElement.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L24
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L24
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L24
                r7 = r0
                goto L25
            L24:
            L25:
                java.lang.Class<org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2> r0 = org.eclipse.jdt.internal.ui.text.javadoc.JavadocContentAccess2.class
                java.lang.String r1 = "javadoc2HTML"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3e
                r3 = r2
                r4 = 0
                java.lang.Class<org.eclipse.jdt.core.IMember> r5 = org.eclipse.jdt.core.IMember.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L3e
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L3e
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
                r8 = r0
                goto L3f
            L3e:
            L3f:
                java.lang.String r0 = "org.eclipse.jdt.ls.core.internal.javadoc.JavadocContentAccess2"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L60
                java.lang.String r1 = "javadoc2HTML"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L60
                r3 = r2
                r4 = 0
                java.lang.Class<org.eclipse.jdt.core.IMember> r5 = org.eclipse.jdt.core.IMember.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L60
                r3 = r2
                r4 = 1
                java.lang.Class<org.eclipse.jdt.core.IJavaElement> r5 = org.eclipse.jdt.core.IJavaElement.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L60
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L60
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L60
                r9 = r0
                goto L61
            L60:
            L61:
                r0 = r7
                lombok.eclipse.agent.PatchJavadoc.Reflection.javadoc2HTML = r0
                r0 = r8
                lombok.eclipse.agent.PatchJavadoc.Reflection.oldJavadoc2HTML = r0
                r0 = r9
                lombok.eclipse.agent.PatchJavadoc.Reflection.lsJavadoc2HTML = r0
                return
        }

        private Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private static java.lang.String javadoc2HTML(org.eclipse.jdt.core.IMember r7, org.eclipse.jdt.core.IJavaElement r8, java.lang.String r9) {
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.javadoc2HTML
                if (r0 == 0) goto L24
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.javadoc2HTML     // Catch: java.lang.Throwable -> L21
                r1 = 0
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L21
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5     // Catch: java.lang.Throwable -> L21
                r3 = r2
                r4 = 1
                r5 = r8
                r3[r4] = r5     // Catch: java.lang.Throwable -> L21
                r3 = r2
                r4 = 2
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Throwable -> L21
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L21
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L21
                return r0
            L21:
                r0 = 0
                return r0
            L24:
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.lsJavadoc2HTML
                if (r0 == 0) goto L48
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.lsJavadoc2HTML     // Catch: java.lang.Throwable -> L45
                r1 = 0
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L45
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5     // Catch: java.lang.Throwable -> L45
                r3 = r2
                r4 = 1
                r5 = r8
                r3[r4] = r5     // Catch: java.lang.Throwable -> L45
                r3 = r2
                r4 = 2
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Throwable -> L45
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L45
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L45
                return r0
            L45:
                r0 = 0
                return r0
            L48:
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.oldJavadoc2HTML
                if (r0 == 0) goto L68
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.oldJavadoc2HTML     // Catch: java.lang.Throwable -> L65
                r1 = 0
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L65
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5     // Catch: java.lang.Throwable -> L65
                r3 = r2
                r4 = 1
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Throwable -> L65
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L65
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L65
                return r0
            L65:
                r0 = 0
                return r0
            L68:
                r0 = 0
                return r0
        }

        static /* synthetic */ java.lang.String access$0(org.eclipse.jdt.core.IMember r4, org.eclipse.jdt.core.IJavaElement r5, java.lang.String r6) {
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.String r0 = javadoc2HTML(r0, r1, r2)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchJavadoc$Signature.SCL.lombok */
    private static class Signature {
        private Signature() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static final java.lang.String getSignature(org.eclipse.jdt.internal.core.SourceMethod r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                org.eclipse.jdt.core.IJavaElement r1 = r1.getParent()
                java.lang.String r1 = r1.getElementName()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r1 = "."
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.getElementName()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r1 = "("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                java.lang.String[] r0 = r0.getParameterTypes()
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L4d
            L3c:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r4
                r1 = r5
                java.lang.String r1 = org.eclipse.jdt.core.Signature.toString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
            L4d:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto L3c
                r0 = r4
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public PatchJavadoc() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String getHTMLContentFromSource(java.lang.String r4, java.lang.Object r5) {
            r0 = r4
            if (r0 == 0) goto L6
            r0 = r4
            return r0
        L6:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.core.SourceMethod
            if (r0 == 0) goto L61
            r0 = r5
            org.eclipse.jdt.internal.core.SourceMethod r0 = (org.eclipse.jdt.internal.core.SourceMethod) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.core.ICompilationUnit r0 = r0.getCompilationUnit()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.core.CompilationUnit
            if (r0 == 0) goto L61
            r0 = r7
            org.eclipse.jdt.internal.core.CompilationUnit r0 = (org.eclipse.jdt.internal.core.CompilationUnit) r0
            r8 = r0
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.env.ICompilationUnit, java.util.Map<java.lang.String, java.lang.String>> r0 = lombok.eclipse.EcjAugments.CompilationUnit_javadoc
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L38
            r0 = 0
            return r0
        L38:
            r0 = r6
            java.lang.String r0 = lombok.eclipse.agent.PatchJavadoc.Signature.getSignature(r0)
            r10 = r0
            r0 = r9
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L53
            r0 = 0
            return r0
        L53:
            r0 = r5
            org.eclipse.jdt.core.IMember r0 = (org.eclipse.jdt.core.IMember) r0
            r1 = r5
            org.eclipse.jdt.core.IJavaElement r1 = (org.eclipse.jdt.core.IJavaElement) r1
            r2 = r11
            java.lang.String r0 = lombok.eclipse.agent.PatchJavadoc.Reflection.access$0(r0, r1, r2)
            return r0
        L61:
            r0 = 0
            return r0
    }

    public static java.lang.StringBuffer printMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4, java.lang.Integer r5, java.lang.StringBuffer r6, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r7) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.env.ICompilationUnit, java.util.Map<java.lang.String, java.lang.String>> r0 = lombok.eclipse.EcjAugments.CompilationUnit_javadoc
            r1 = r4
            org.eclipse.jdt.internal.compiler.CompilationResult r1 = r1.compilationResult
            org.eclipse.jdt.internal.compiler.env.ICompilationUnit r1 = r1.compilationUnit
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r7
            r1 = r4
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getSignature(r0, r1)
            r9 = r0
            r0 = r8
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r10
            java.lang.String r1 = "\r?\n"
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L61
        L44:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r5
            int r0 = r0.intValue()
            r1 = r6
            java.lang.StringBuffer r0 = org.eclipse.jdt.internal.compiler.ast.ASTNode.printIndent(r0, r1)
            r1 = r11
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            int r12 = r12 + 1
        L61:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L44
        L68:
            r0 = r4
            r1 = r5
            int r1 = r1.intValue()
            r2 = r6
            java.lang.StringBuffer r0 = r0.print(r1, r2)
            return r0
    }
}
