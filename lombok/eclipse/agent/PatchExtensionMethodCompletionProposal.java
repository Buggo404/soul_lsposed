package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethodCompletionProposal.SCL.lombok */
public class PatchExtensionMethodCompletionProposal {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethodCompletionProposal$Reflection.SCL.lombok */
    static class Reflection {
        public static final java.lang.reflect.Field replacementOffsetField = null;
        public static final java.lang.reflect.Field contextField = null;
        public static final java.lang.reflect.Field extendedContextField = null;
        public static final java.lang.reflect.Field assistNodeField = null;
        public static final java.lang.reflect.Field assistScopeField = null;
        public static final java.lang.reflect.Field lookupEnvironmentField = null;
        public static final java.lang.reflect.Field completionEngineField = null;
        public static final java.lang.reflect.Field nameLookupField = null;
        public static final java.lang.reflect.Method createJavaCompletionProposalMethod = null;

        static {
                java.lang.Class<org.eclipse.jdt.internal.ui.text.java.AbstractJavaCompletionProposal> r0 = org.eclipse.jdt.internal.ui.text.java.AbstractJavaCompletionProposal.class
                java.lang.String r1 = "fReplacementOffset"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.replacementOffsetField = r0
                java.lang.Class<org.eclipse.jdt.ui.text.java.CompletionProposalCollector> r0 = org.eclipse.jdt.ui.text.java.CompletionProposalCollector.class
                java.lang.String r1 = "fContext"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalCompletionContext> r0 = org.eclipse.jdt.internal.codeassist.InternalCompletionContext.class
                java.lang.String r1 = "extendedContext"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.extendedContextField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext> r0 = org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext.class
                java.lang.String r1 = "assistNode"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistNodeField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext> r0 = org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext.class
                java.lang.String r1 = "assistScope"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistScopeField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext> r0 = org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext.class
                java.lang.String r1 = "lookupEnvironment"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.lookupEnvironmentField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalCompletionProposal> r0 = org.eclipse.jdt.internal.codeassist.InternalCompletionProposal.class
                java.lang.String r1 = "completionEngine"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.completionEngineField = r0
                java.lang.Class<org.eclipse.jdt.internal.codeassist.InternalCompletionProposal> r0 = org.eclipse.jdt.internal.codeassist.InternalCompletionProposal.class
                java.lang.String r1 = "nameLookup"
                java.lang.reflect.Field r0 = accessField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.nameLookupField = r0
                java.lang.Class<org.eclipse.jdt.ui.text.java.CompletionProposalCollector> r0 = org.eclipse.jdt.ui.text.java.CompletionProposalCollector.class
                java.lang.String r1 = "createJavaCompletionProposal"
                java.lang.Class<org.eclipse.jdt.core.CompletionProposal> r2 = org.eclipse.jdt.core.CompletionProposal.class
                java.lang.reflect.Method r0 = accessMethod(r0, r1, r2)
                lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.createJavaCompletionProposalMethod = r0
                return
        }

        Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static boolean isComplete() {
                r0 = 9
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = r0
                r2 = 0
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.replacementOffsetField
                r1[r2] = r3
                r1 = r0
                r2 = 1
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField
                r1[r2] = r3
                r1 = r0
                r2 = 2
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.extendedContextField
                r1[r2] = r3
                r1 = r0
                r2 = 3
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistNodeField
                r1[r2] = r3
                r1 = r0
                r2 = 4
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistScopeField
                r1[r2] = r3
                r1 = r0
                r2 = 5
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.lookupEnvironmentField
                r1[r2] = r3
                r1 = r0
                r2 = 6
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.completionEngineField
                r1[r2] = r3
                r1 = r0
                r2 = 7
                java.lang.reflect.Field r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.nameLookupField
                r1[r2] = r3
                r1 = r0
                r2 = 8
                java.lang.reflect.Method r3 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.createJavaCompletionProposalMethod
                r1[r2] = r3
                r5 = r0
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L58
            L4a:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L55
                r0 = 0
                return r0
            L55:
                int r7 = r7 + 1
            L58:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L4a
                r0 = 1
                return r0
        }

        private static java.lang.reflect.Field accessField(java.lang.Class<?> r3, java.lang.String r4) {
                r0 = r3
                r1 = r4
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lc
                java.lang.reflect.AccessibleObject r0 = makeAccessible(r0)     // Catch: java.lang.Exception -> Lc
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> Lc
                return r0
            Lc:
                r0 = 0
                return r0
        }

        private static java.lang.reflect.Method accessMethod(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?> r9) {
                r0 = r7
                r1 = r8
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L14
                r3 = r2
                r4 = 0
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Exception -> L14
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L14
                java.lang.reflect.AccessibleObject r0 = makeAccessible(r0)     // Catch: java.lang.Exception -> L14
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L14
                return r0
            L14:
                r0 = 0
                return r0
        }

        private static <T extends java.lang.reflect.AccessibleObject> T makeAccessible(T r2) {
                r0 = r2
                java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
                return r0
        }
    }

    public PatchExtensionMethodCompletionProposal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] getJavaCompletionProposals(org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r4, org.eclipse.jdt.ui.text.java.CompletionProposalCollector r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r4
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r6 = r0
            boolean r0 = canExtendCodeAssist()
            if (r0 == 0) goto L8b
            r0 = r5
            java.util.List r0 = getExtensionMethods(r0)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L81
        L20:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchExtensionMethod$Extension r0 = (lombok.eclipse.agent.PatchExtensionMethod.Extension) r0
            r7 = r0
            r0 = r7
            java.util.List<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> r0 = r0.extensionMethods
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L77
        L39:
            r0 = r10
            java.lang.Object r0 = r0.next()
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.MethodBinding) r0
            r9 = r0
            r0 = r9
            r1 = r5
            boolean r0 = isMatchingProposal(r0, r1)
            if (r0 != 0) goto L51
            goto L77
        L51:
            lombok.eclipse.agent.ExtensionMethodCompletionProposal r0 = new lombok.eclipse.agent.ExtensionMethodCompletionProposal
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r11 = r0
            r0 = r5
            r1 = r11
            copyNameLookupAndCompletionEngine(r0, r1)
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getAssistNode(r0)
            r12 = r0
            r0 = r11
            r1 = r9
            r2 = r12
            r0.setMethodBinding(r1, r2)
            r0 = r5
            r1 = r11
            r2 = r6
            createAndAddJavaCompletionProposal(r0, r1, r2)
        L77:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L39
        L81:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
        L8b:
            r0 = r6
            r1 = 0
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r1 = new org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[] r0 = (org.eclipse.jdt.ui.text.java.IJavaCompletionProposal[]) r0
            return r0
    }

    private static java.util.List<lombok.eclipse.agent.PatchExtensionMethod.Extension> getExtensionMethods(org.eclipse.jdt.ui.text.java.CompletionProposalCollector r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = getClassScope(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4c
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            r9 = r0
            r0 = r9
            r1 = r6
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = getFirstParameterType(r0, r1)
            r10 = r0
            r0 = r9
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.agent.PatchExtensionMethod.getTypeNode(r0)
            r11 = r0
            goto L47
        L26:
            java.lang.Class<lombok.experimental.ExtensionMethod> r0 = lombok.experimental.ExtensionMethod.class
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = lombok.eclipse.agent.PatchExtensionMethod.getAnnotation(r0, r1)
            r12 = r0
            r0 = r7
            r1 = 0
            r2 = r11
            r3 = r12
            r4 = r10
            java.util.List r2 = lombok.eclipse.agent.PatchExtensionMethod.getApplicableExtensionMethods(r2, r3, r4)
            boolean r0 = r0.addAll(r1, r2)
            r0 = r11
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.agent.PatchExtensionMethod.upToType(r0)
            r11 = r0
        L47:
            r0 = r11
            if (r0 != 0) goto L26
        L4c:
            r0 = r7
            return r0
    }

    private static boolean isMatchingProposal(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4, org.eclipse.jdt.ui.text.java.CompletionProposalCollector r5) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField     // Catch: java.lang.IllegalAccessException -> L2b
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L2b
            org.eclipse.jdt.internal.codeassist.InternalCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalCompletionContext) r0     // Catch: java.lang.IllegalAccessException -> L2b
            r6 = r0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.IllegalAccessException -> L2b
            r1 = r0
            r2 = r6
            char[] r2 = r2.getToken()     // Catch: java.lang.IllegalAccessException -> L2b
            r1.<init>(r2)     // Catch: java.lang.IllegalAccessException -> L2b
            r7 = r0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.IllegalAccessException -> L2b
            r1 = r0
            r2 = r4
            char[] r2 = r2.selector     // Catch: java.lang.IllegalAccessException -> L2b
            r1.<init>(r2)     // Catch: java.lang.IllegalAccessException -> L2b
            r8 = r0
            r0 = r8
            r1 = r7
            boolean r0 = r0.contains(r1)     // Catch: java.lang.IllegalAccessException -> L2b
            return r0
        L2b:
            r0 = 1
            return r0
    }

    static org.eclipse.jdt.internal.compiler.lookup.TypeBinding getFirstParameterType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2, org.eclipse.jdt.ui.text.java.CompletionProposalCollector r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = getAssistNode(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnQualifiedNameReference
            if (r0 != 0) goto L24
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnSingleNameReference
            if (r0 != 0) goto L24
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnMemberAccess
            if (r0 != 0) goto L24
            r0 = 0
            return r0
        L24:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldReference
            if (r0 == 0) goto L3a
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = (org.eclipse.jdt.internal.compiler.ast.FieldReference) r0
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SuperReference
            if (r0 == 0) goto L3a
            r0 = 0
            return r0
        L3a:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NameReference
            if (r0 == 0) goto L5e
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.NameReference r0 = (org.eclipse.jdt.internal.compiler.ast.NameReference) r0
            org.eclipse.jdt.internal.compiler.lookup.Binding r0 = r0.binding
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.VariableBinding
            if (r0 == 0) goto L6d
            r0 = r6
            org.eclipse.jdt.internal.compiler.lookup.VariableBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.VariableBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.type
            r4 = r0
            goto L6d
        L5e:
            r0 = r5
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldReference
            if (r0 == 0) goto L6d
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = (org.eclipse.jdt.internal.compiler.ast.FieldReference) r0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.actualReceiverType
            r4 = r0
        L6d:
            r0 = r4
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.ASTNode getAssistNode(org.eclipse.jdt.ui.text.java.CompletionProposalCollector r3) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField     // Catch: java.lang.Exception -> L27
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L27
            org.eclipse.jdt.internal.codeassist.InternalCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalCompletionContext) r0     // Catch: java.lang.Exception -> L27
            r4 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.extendedContextField     // Catch: java.lang.Exception -> L27
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L27
            org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext) r0     // Catch: java.lang.Exception -> L27
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistNodeField     // Catch: java.lang.Exception -> L27
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L27
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0     // Catch: java.lang.Exception -> L27
            return r0
        L27:
            r0 = 0
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.lookup.ClassScope getClassScope(org.eclipse.jdt.ui.text.java.CompletionProposalCollector r3) {
            r0 = 0
            r4 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField     // Catch: java.lang.IllegalAccessException -> L36
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L36
            org.eclipse.jdt.internal.codeassist.InternalCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalCompletionContext) r0     // Catch: java.lang.IllegalAccessException -> L36
            r5 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.extendedContextField     // Catch: java.lang.IllegalAccessException -> L36
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L36
            org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext) r0     // Catch: java.lang.IllegalAccessException -> L36
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L37
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.assistScopeField     // Catch: java.lang.IllegalAccessException -> L36
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L36
            org.eclipse.jdt.internal.compiler.lookup.Scope r0 = (org.eclipse.jdt.internal.compiler.lookup.Scope) r0     // Catch: java.lang.IllegalAccessException -> L36
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.classScope()     // Catch: java.lang.IllegalAccessException -> L36
            r4 = r0
            goto L37
        L36:
        L37:
            r0 = r4
            return r0
    }

    private static void copyNameLookupAndCompletionEngine(org.eclipse.jdt.ui.text.java.CompletionProposalCollector r4, org.eclipse.jdt.internal.codeassist.InternalCompletionProposal r5) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.contextField     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L43
            org.eclipse.jdt.internal.codeassist.InternalCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalCompletionContext) r0     // Catch: java.lang.IllegalAccessException -> L43
            r6 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.extendedContextField     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L43
            org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext r0 = (org.eclipse.jdt.internal.codeassist.InternalExtendedCompletionContext) r0     // Catch: java.lang.IllegalAccessException -> L43
            r7 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.lookupEnvironmentField     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L43
            org.eclipse.jdt.internal.compiler.lookup.LookupEnvironment r0 = (org.eclipse.jdt.internal.compiler.lookup.LookupEnvironment) r0     // Catch: java.lang.IllegalAccessException -> L43
            r8 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.nameLookupField     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r5
            r2 = r8
            org.eclipse.jdt.internal.compiler.env.INameEnvironment r2 = r2.nameEnvironment     // Catch: java.lang.IllegalAccessException -> L43
            org.eclipse.jdt.internal.core.SearchableEnvironment r2 = (org.eclipse.jdt.internal.core.SearchableEnvironment) r2     // Catch: java.lang.IllegalAccessException -> L43
            org.eclipse.jdt.internal.core.NameLookup r2 = r2.nameLookup     // Catch: java.lang.IllegalAccessException -> L43
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L43
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.completionEngineField     // Catch: java.lang.IllegalAccessException -> L43
            r1 = r5
            r2 = r8
            org.eclipse.jdt.internal.compiler.impl.ITypeRequestor r2 = r2.typeRequestor     // Catch: java.lang.IllegalAccessException -> L43
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L43
            goto L44
        L43:
        L44:
            return
    }

    private static void createAndAddJavaCompletionProposal(org.eclipse.jdt.ui.text.java.CompletionProposalCollector r8, org.eclipse.jdt.core.CompletionProposal r9, java.util.List<org.eclipse.jdt.ui.text.java.IJavaCompletionProposal> r10) {
            r0 = r10
            java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.createJavaCompletionProposalMethod     // Catch: java.lang.Exception -> L1c
            r2 = r8
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L1c
            r4 = r3
            r5 = 0
            r6 = r9
            r4[r5] = r6     // Catch: java.lang.Exception -> L1c
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L1c
            org.eclipse.jdt.ui.text.java.IJavaCompletionProposal r1 = (org.eclipse.jdt.ui.text.java.IJavaCompletionProposal) r1     // Catch: java.lang.Exception -> L1c
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L1c
            goto L1d
        L1c:
        L1d:
            return
    }

    private static boolean canExtendCodeAssist() {
            boolean r0 = lombok.eclipse.agent.PatchExtensionMethodCompletionProposal.Reflection.isComplete()
            return r0
    }
}
