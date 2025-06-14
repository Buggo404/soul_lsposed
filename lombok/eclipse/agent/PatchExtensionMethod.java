package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod.SCL.lombok */
public class PatchExtensionMethod {
    private static final lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod.PostponedError> MessageSend_postponedErrors = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$Extension.SCL.lombok */
    static class Extension {
        java.util.List<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> extensionMethods;
        boolean suppressBaseMethods;

        Extension() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$PostponedError.SCL.lombok */
    private interface PostponedError {
        void fire();
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$PostponedInvalidMethodError.SCL.lombok */
    private static class PostponedInvalidMethodError implements lombok.eclipse.agent.PatchExtensionMethod.PostponedError {
        private final org.eclipse.jdt.internal.compiler.problem.ProblemReporter problemReporter;
        private final java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.MessageSend> messageSendRef;
        private final org.eclipse.jdt.internal.compiler.lookup.MethodBinding method;
        private final org.eclipse.jdt.internal.compiler.lookup.Scope scope;
        private static final java.lang.reflect.Method shortMethod = null;
        private static final java.lang.reflect.Method longMethod = null;
        private static java.lang.Throwable initProblem;

        static {
                java.lang.String r0 = "invalidMethod"
                r1 = 2
                java.lang.Class[] r1 = new java.lang.Class[r1]
                r2 = r1
                r3 = 0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r4 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
                r2[r3] = r4
                r2 = r1
                r3 = 1
                java.lang.Class<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> r4 = org.eclipse.jdt.internal.compiler.lookup.MethodBinding.class
                r2[r3] = r4
                java.lang.reflect.Method r0 = getMethod(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.shortMethod = r0
                java.lang.String r0 = "invalidMethod"
                r1 = 3
                java.lang.Class[] r1 = new java.lang.Class[r1]
                r2 = r1
                r3 = 0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r4 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
                r2[r3] = r4
                r2 = r1
                r3 = 1
                java.lang.Class<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> r4 = org.eclipse.jdt.internal.compiler.lookup.MethodBinding.class
                r2[r3] = r4
                r2 = r1
                r3 = 2
                java.lang.Class<org.eclipse.jdt.internal.compiler.lookup.Scope> r4 = org.eclipse.jdt.internal.compiler.lookup.Scope.class
                r2[r3] = r4
                java.lang.reflect.Method r0 = getMethod(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.longMethod = r0
                return
        }

        private static java.lang.reflect.Method getMethod(java.lang.String r4, java.lang.Class<?>... r5) {
                java.lang.Class<org.eclipse.jdt.internal.compiler.problem.ProblemReporter> r0 = org.eclipse.jdt.internal.compiler.problem.ProblemReporter.class
                r1 = r4
                r2 = r5
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L8
                return r0
            L8:
                r6 = move-exception
                r0 = r6
                lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.initProblem = r0
                r0 = 0
                return r0
        }

        PostponedInvalidMethodError(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r6, org.eclipse.jdt.internal.compiler.ast.MessageSend r7, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r8, org.eclipse.jdt.internal.compiler.lookup.Scope r9) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.problemReporter = r1
                r0 = r5
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r2 = r1
                r3 = r7
                r2.<init>(r3)
                r0.messageSendRef = r1
                r0 = r5
                r1 = r8
                r0.method = r1
                r0 = r5
                r1 = r9
                r0.scope = r1
                return
        }

        static void invoke(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r8, org.eclipse.jdt.internal.compiler.ast.MessageSend r9, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r10, org.eclipse.jdt.internal.compiler.lookup.Scope r11) {
                r0 = r9
                if (r0 == 0) goto L8e
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.shortMethod     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                if (r0 == 0) goto L24
                java.lang.Throwable r0 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.initProblem     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.shortMethod     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r2 = r8
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r4 = r3
                r5 = 0
                r6 = r9
                r4[r5] = r6     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r4 = r3
                r5 = 1
                r6 = r10
                r4[r5] = r6     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2, r3)     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                goto L8e
            L24:
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.longMethod     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                if (r0 == 0) goto L48
                java.lang.Throwable r0 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.initProblem     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.longMethod     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r2 = r8
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r4 = r3
                r5 = 0
                r6 = r9
                r4[r5] = r6     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r4 = r3
                r5 = 1
                r6 = r10
                r4[r5] = r6     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                r4 = r3
                r5 = 2
                r6 = r11
                r4[r5] = r6     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2, r3)     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                goto L8e
            L48:
                java.lang.Throwable r0 = lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.initProblem     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                java.lang.String r1 = "method named 'invalidMethod' not found in ProblemReporter.class"
                lombok.permit.Permit.reportReflectionProblem(r0, r1)     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L5f
                goto L8e
            L53:
                r12 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r12
                r1.<init>(r2)
                throw r0
            L5f:
                r12 = move-exception
                r0 = r12
                java.lang.Throwable r0 = r0.getCause()
                r13 = r0
                r0 = r13
                boolean r0 = r0 instanceof java.lang.Error
                if (r0 == 0) goto L76
                r0 = r13
                java.lang.Error r0 = (java.lang.Error) r0
                throw r0
            L76:
                r0 = r13
                boolean r0 = r0 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L84
                r0 = r13
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L84:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r13
                r1.<init>(r2)
                throw r0
            L8e:
                return
        }

        @Override // lombok.eclipse.agent.PatchExtensionMethod.PostponedError
        public void fire() {
                r5 = this;
                r0 = r5
                java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = r0.messageSendRef
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = (org.eclipse.jdt.internal.compiler.ast.MessageSend) r0
                r6 = r0
                r0 = r5
                org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
                r1 = r6
                r2 = r5
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r2 = r2.method
                r3 = r5
                org.eclipse.jdt.internal.compiler.lookup.Scope r3 = r3.scope
                invoke(r0, r1, r2, r3)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$PostponedNoMethodError.SCL.lombok */
    private static class PostponedNoMethodError implements lombok.eclipse.agent.PatchExtensionMethod.PostponedError {
        private final org.eclipse.jdt.internal.compiler.problem.ProblemReporter problemReporter;
        private final java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.MessageSend> messageSendRef;
        private final org.eclipse.jdt.internal.compiler.lookup.TypeBinding recType;
        private final org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] params;

        PostponedNoMethodError(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r6, org.eclipse.jdt.internal.compiler.ast.MessageSend r7, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r8, org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r9) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.problemReporter = r1
                r0 = r5
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r2 = r1
                r3 = r7
                r2.<init>(r3)
                r0.messageSendRef = r1
                r0 = r5
                r1 = r8
                r0.recType = r1
                r0 = r5
                r1 = r9
                r0.params = r1
                return
        }

        @Override // lombok.eclipse.agent.PatchExtensionMethod.PostponedError
        public void fire() {
                r5 = this;
                r0 = r5
                java.lang.ref.WeakReference<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = r0.messageSendRef
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = (org.eclipse.jdt.internal.compiler.ast.MessageSend) r0
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L1f
                r0 = r5
                org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
                r1 = r6
                r2 = r5
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r2 = r2.recType
                r3 = r5
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r3 = r3.params
                r0.errorNoMethodFor(r1, r2, r3)
            L1f:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$PostponedNonStaticAccessToStaticMethodError.SCL.lombok */
    private static class PostponedNonStaticAccessToStaticMethodError implements lombok.eclipse.agent.PatchExtensionMethod.PostponedError {
        private final org.eclipse.jdt.internal.compiler.problem.ProblemReporter problemReporter;
        private org.eclipse.jdt.internal.compiler.ast.ASTNode location;
        private org.eclipse.jdt.internal.compiler.lookup.MethodBinding method;
        private org.eclipse.jdt.internal.compiler.impl.ReferenceContext referenceContext;

        PostponedNonStaticAccessToStaticMethodError(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r4, org.eclipse.jdt.internal.compiler.ast.ASTNode r5, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.problemReporter = r1
                r0 = r3
                r1 = r5
                r0.location = r1
                r0 = r3
                r1 = r6
                r0.method = r1
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.impl.ReferenceContext r1 = r1.referenceContext
                r0.referenceContext = r1
                return
        }

        @Override // lombok.eclipse.agent.PatchExtensionMethod.PostponedError
        public void fire() {
                r4 = this;
                r0 = r4
                org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
                r1 = r4
                org.eclipse.jdt.internal.compiler.impl.ReferenceContext r1 = r1.referenceContext
                r0.referenceContext = r1
                r0 = r4
                org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter
                r1 = r4
                org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.location
                r2 = r4
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r2 = r2.method
                r0.nonStaticAccessToStaticMethod(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchExtensionMethod$Reflection.SCL.lombok */
    private static final class Reflection {
        public static final java.lang.reflect.Field argumentTypes = null;
        public static final java.lang.reflect.Field argumentsHaveErrors = null;
        public static final java.lang.reflect.Field inferenceContexts = null;
        private static final java.lang.reflect.Method isPolyExpression = null;
        private static final java.lang.Class<?> functionalExpression = null;
        private static final java.lang.reflect.Constructor<?> polyTypeBindingConstructor = null;

        static {
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
                java.lang.String r1 = "argumentTypes"
                java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentTypes = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
                java.lang.String r1 = "argumentsHaveErrors"
                java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentsHaveErrors = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
                java.lang.String r1 = "inferenceContexts"
                java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.inferenceContexts = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Expression> r0 = org.eclipse.jdt.internal.compiler.ast.Expression.class
                java.lang.String r1 = "isPolyExpression"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.isPolyExpression = r0
                r0 = 0
                r6 = r0
                r0 = 0
                r7 = r0
                java.lang.String r0 = "org.eclipse.jdt.internal.compiler.ast.FunctionalExpression"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L39
                r6 = r0
                goto L3a
            L39:
            L3a:
                java.lang.String r0 = "org.eclipse.jdt.internal.compiler.lookup.PolyTypeBinding"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L4f
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4f
                r2 = r1
                r3 = 0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.Expression> r4 = org.eclipse.jdt.internal.compiler.ast.Expression.class
                r2[r3] = r4     // Catch: java.lang.Exception -> L4f
                java.lang.reflect.Constructor r0 = lombok.permit.Permit.getConstructor(r0, r1)     // Catch: java.lang.Exception -> L4f
                r7 = r0
                goto L50
            L4f:
            L50:
                r0 = r6
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.functionalExpression = r0
                r0 = r7
                lombok.eclipse.agent.PatchExtensionMethod.Reflection.polyTypeBindingConstructor = r0
                return
        }

        private Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static boolean isFunctionalExpression(org.eclipse.jdt.internal.compiler.ast.Expression r3) {
                java.lang.Class<?> r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.functionalExpression
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                java.lang.Class<?> r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.functionalExpression
                r1 = r3
                boolean r0 = r0.isInstance(r1)
                return r0
        }

        public static boolean isPolyExpression(org.eclipse.jdt.internal.compiler.ast.Expression r4) {
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.isPolyExpression
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.isPolyExpression     // Catch: java.lang.Exception -> L1a
                r1 = r4
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1a
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L1a
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L1a
                return r0
            L1a:
                r0 = 0
                return r0
        }

        public static org.eclipse.jdt.internal.compiler.lookup.TypeBinding getPolyTypeBinding(org.eclipse.jdt.internal.compiler.ast.Expression r6) {
                java.lang.reflect.Constructor<?> r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.polyTypeBindingConstructor
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                java.lang.reflect.Constructor<?> r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.polyTypeBindingConstructor     // Catch: java.lang.Exception -> L1a
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1a
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4     // Catch: java.lang.Exception -> L1a
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1a
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding) r0     // Catch: java.lang.Exception -> L1a
                return r0
            L1a:
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.MessageSend> r0 = org.eclipse.jdt.internal.compiler.ast.MessageSend.class
            java.lang.Class<lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r1 = lombok.eclipse.agent.PatchExtensionMethod.PostponedError.class
            java.lang.String r2 = "lombok$postponedErrors"
            lombok.core.FieldAugment r0 = lombok.core.FieldAugment.augment(r0, r1, r2)
            lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors = r0
            return
    }

    public PatchExtensionMethod() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static lombok.eclipse.EclipseNode getTypeNode(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.scope
            org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r0 = r0.compilationUnitScope()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.referenceContext
            r4 = r0
            r0 = r4
            r1 = 0
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r5 = r0
            r0 = r5
            r1 = r3
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L2d
            r0 = r4
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r5 = r0
            r0 = r5
            r1 = r3
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
        L2d:
            r0 = r6
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.Annotation getAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.eclipse.EclipseNode r5) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 == 0) goto L3d
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L36
        L1f:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            r1 = r5
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            if (r0 == 0) goto L33
            r0 = r7
            return r0
        L33:
            int r8 = r8 + 1
        L36:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L1f
        L3d:
            r0 = 0
            return r0
    }

    static lombok.eclipse.EclipseNode upToType(lombok.eclipse.EclipseNode r3) {
            r0 = r3
            r4 = r0
        L2:
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L2
        L18:
            r0 = r4
            return r0
    }

    static java.util.List<lombok.eclipse.agent.PatchExtensionMethod.Extension> getApplicableExtensionMethods(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.Annotation r6, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            if (r0 == 0) goto Lda
            r0 = r6
            if (r0 == 0) goto Lda
            r0 = r7
            if (r0 == 0) goto Lda
            r0 = r5
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r0 = r0.initializerScope
            r9 = r0
            r0 = r5
            r1 = r6
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r10 = r0
            java.lang.Class<lombok.experimental.ExtensionMethod> r0 = lombok.experimental.ExtensionMethod.class
            r1 = r10
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            java.lang.annotation.Annotation r0 = r0.getInstance()     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L48
            lombok.experimental.ExtensionMethod r0 = (lombok.experimental.ExtensionMethod) r0     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L48
            boolean r0 = r0.suppressBaseMethods()     // Catch: lombok.core.AnnotationValues.AnnotationValueDecodeFail -> L48
            r12 = r0
            goto L5c
        L48:
            r13 = move-exception
            r0 = r13
            lombok.core.AnnotationValues$AnnotationValue r0 = r0.owner
            r1 = r13
            java.lang.String r1 = r1.getMessage()
            r2 = r13
            int r2 = r2.idx
            r0.setError(r1, r2)
        L5c:
            r0 = r11
            java.lang.String r1 = "value"
            java.util.List r0 = r0.getActualExpressions(r1)
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Ld0
        L6d:
            r0 = r14
            java.lang.Object r0 = r0.next()
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            if (r0 == 0) goto Ld0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r9
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L95
            goto Ld0
        L95:
            r0 = r15
            boolean r0 = r0.isClass()
            if (r0 != 0) goto La8
            r0 = r15
            boolean r0 = r0.isEnum()
            if (r0 != 0) goto La8
            goto Ld0
        La8:
            lombok.eclipse.agent.PatchExtensionMethod$Extension r0 = new lombok.eclipse.agent.PatchExtensionMethod$Extension
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r5
            r2 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r2 = (org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) r2
            r3 = r7
            java.util.List r1 = getApplicableExtensionMethodsDefinedInProvider(r1, r2, r3)
            r0.extensionMethods = r1
            r0 = r16
            r1 = r12
            r0.suppressBaseMethods = r1
            r0 = r8
            r1 = r16
            boolean r0 = r0.add(r1)
        Ld0:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6d
        Lda:
            r0 = r8
            return r0
    }

    private static java.util.List<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> getApplicableExtensionMethodsDefinedInProvider(lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r4, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding[] r0 = r0.methods()
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L76
        L18:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L2a
            goto L73
        L2a:
            r0 = r7
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L35
            goto L73
        L35:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            if (r0 == 0) goto L73
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            int r0 = r0.length
            if (r0 != 0) goto L49
            goto L73
        L49:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r1 = 0
            r0 = r0[r1]
            r11 = r0
            r0 = r5
            r1 = r11
            boolean r0 = r0.isProvablyDistinct(r1)
            if (r0 == 0) goto L6a
            r0 = r5
            r1 = r11
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.erasure()
            boolean r0 = r0.isCompatibleWith(r1)
            if (r0 != 0) goto L6a
            goto L73
        L6a:
            r0 = r6
            r1 = r7
            boolean r0 = r0.add(r1)
        L73:
            int r8 = r8 + 1
        L76:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L18
            r0 = r6
            return r0
    }

    public static void errorNoMethodFor(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r9, org.eclipse.jdt.internal.compiler.ast.MessageSend r10, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r11, org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r12) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r10
            lombok.eclipse.agent.PatchExtensionMethod$PostponedNoMethodError r2 = new lombok.eclipse.agent.PatchExtensionMethod$PostponedNoMethodError
            r3 = r2
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            r0.set(r1, r2)
            return
    }

    public static void invalidMethod(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r9, org.eclipse.jdt.internal.compiler.ast.MessageSend r10, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r11) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r10
            lombok.eclipse.agent.PatchExtensionMethod$PostponedInvalidMethodError r2 = new lombok.eclipse.agent.PatchExtensionMethod$PostponedInvalidMethodError
            r3 = r2
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0.set(r1, r2)
            return
    }

    public static void invalidMethod(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r9, org.eclipse.jdt.internal.compiler.ast.MessageSend r10, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r11, org.eclipse.jdt.internal.compiler.lookup.Scope r12) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r10
            lombok.eclipse.agent.PatchExtensionMethod$PostponedInvalidMethodError r2 = new lombok.eclipse.agent.PatchExtensionMethod$PostponedInvalidMethodError
            r3 = r2
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            r0.set(r1, r2)
            return
    }

    public static void nonStaticAccessToStaticMethod(org.eclipse.jdt.internal.compiler.problem.ProblemReporter r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r10, org.eclipse.jdt.internal.compiler.ast.MessageSend r11) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r11
            lombok.eclipse.agent.PatchExtensionMethod$PostponedNonStaticAccessToStaticMethodError r2 = new lombok.eclipse.agent.PatchExtensionMethod$PostponedNonStaticAccessToStaticMethodError
            r3 = r2
            r4 = r8
            r5 = r9
            r6 = r10
            r3.<init>(r4, r5, r6)
            r0.set(r1, r2)
            return
    }

    public static org.eclipse.jdt.internal.compiler.lookup.TypeBinding resolveType(org.eclipse.jdt.internal.compiler.lookup.TypeBinding r6, org.eclipse.jdt.internal.compiler.ast.MessageSend r7, org.eclipse.jdt.internal.compiler.lookup.BlockScope r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.classScope()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            lombok.eclipse.EclipseNode r0 = getTypeNode(r0)
            r12 = r0
            goto L52
        L1e:
            java.lang.Class<lombok.experimental.ExtensionMethod> r0 = lombok.experimental.ExtensionMethod.class
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.Annotation r0 = getAnnotation(r0, r1)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L4b
            r0 = r9
            r1 = 0
            r2 = r12
            r3 = r13
            r4 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r4 = r4.receiver
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r4 = r4.resolvedType
            java.util.List r2 = getApplicableExtensionMethods(r2, r3, r4)
            boolean r0 = r0.addAll(r1, r2)
            r0 = r11
            if (r0 != 0) goto L4b
            r0 = r12
            r11 = r0
        L4b:
            r0 = r12
            lombok.eclipse.EclipseNode r0 = upToType(r0)
            r12 = r0
        L52:
            r0 = r12
            if (r0 != 0) goto L1e
            r0 = 0
            r12 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ThisReference
            if (r0 == 0) goto L76
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = (org.eclipse.jdt.internal.compiler.ast.ThisReference) r0
            int r0 = r0.bits
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L76
            r0 = 1
            r12 = r0
        L76:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SuperReference
            if (r0 == 0) goto L83
            r0 = 1
            r12 = r0
        L83:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NameReference
            if (r0 == 0) goto La4
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            org.eclipse.jdt.internal.compiler.ast.NameReference r0 = (org.eclipse.jdt.internal.compiler.ast.NameReference) r0
            org.eclipse.jdt.internal.compiler.lookup.Binding r0 = r0.binding
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.TypeBinding
            if (r0 == 0) goto La4
            r0 = 1
            r12 = r0
        La4:
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentsHaveErrors
            if (r0 == 0) goto Lc1
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentsHaveErrors     // Catch: java.lang.IllegalAccessException -> Lc0
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> Lc0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.IllegalAccessException -> Lc0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.IllegalAccessException -> Lc0
            if (r0 == 0) goto Lc1
            r0 = 1
            r12 = r0
            goto Lc1
        Lc0:
        Lc1:
            r0 = r12
            if (r0 != 0) goto L377
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L36d
        Ld1:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchExtensionMethod$Extension r0 = (lombok.eclipse.agent.PatchExtensionMethod.Extension) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.suppressBaseMethods
            if (r0 != 0) goto Lf2
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.binding
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ProblemMethodBinding
            if (r0 != 0) goto Lf2
            goto L36d
        Lf2:
            r0 = r13
            java.util.List<org.eclipse.jdt.internal.compiler.lookup.MethodBinding> r0 = r0.extensionMethods
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto L363
        L101:
            r0 = r16
            java.lang.Object r0 = r0.next()
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.MethodBinding) r0
            r15 = r0
            r0 = r7
            char[] r0 = r0.selector
            r1 = r15
            char[] r1 = r1.selector
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L11f
            goto L363
        L11f:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r7
            java.lang.Object r0 = r0.clear(r1)
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ThisReference
            if (r0 == 0) goto L13f
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            r1 = r0
            int r1 = r1.bits
            r2 = -5
            r1 = r1 & r2
            r0.bits = r1
        L13f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.receiver
            boolean r0 = r0.add(r1)
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            if (r0 == 0) goto L16a
            r0 = r17
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = r1.arguments
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
        L16a:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r18 = r0
            r0 = r7
            r1 = r17
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r17
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
            goto L1d2
        L197:
            r0 = r21
            java.lang.Object r0 = r0.next()
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            r22 = r0
            r0 = r22
            if (r0 != 0) goto L1be
            r0 = r20
            boolean r0 = requiresPolyBinding(r0)
            if (r0 == 0) goto L1be
            r0 = r20
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.getPolyTypeBinding(r0)
            r22 = r0
        L1be:
            r0 = r22
            if (r0 != 0) goto L1c8
            org.eclipse.jdt.internal.compiler.lookup.NullTypeBinding r0 = org.eclipse.jdt.internal.compiler.lookup.TypeBinding.NULL
            r22 = r0
        L1c8:
            r0 = r19
            r1 = r22
            boolean r0 = r0.add(r1)
        L1d2:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L197
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.receiver
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MessageSend
            if (r0 == 0) goto L1fb
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.inferenceContexts
            if (r0 == 0) goto L1fb
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.inferenceContexts     // Catch: java.lang.IllegalAccessException -> L1fa
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.receiver     // Catch: java.lang.IllegalAccessException -> L1fa
            r2 = 0
            lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.IllegalAccessException -> L1fa
            goto L1fb
        L1fa:
        L1fb:
            r0 = r8
            r1 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            r2 = r7
            char[] r2 = r2.selector
            r3 = r19
            r4 = 0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r4 = new org.eclipse.jdt.internal.compiler.lookup.TypeBinding[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r3 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]) r3
            r4 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.getMethod(r1, r2, r3, r4)
            r20 = r0
            r0 = r20
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ProblemMethodBinding
            if (r0 == 0) goto L23d
            r0 = r7
            r1 = r18
            r0.arguments = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.declaringClass
            if (r0 == 0) goto L35e
            r0 = r8
            org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter()
            r1 = r7
            r2 = r20
            r3 = r8
            lombok.eclipse.agent.PatchExtensionMethod.PostponedInvalidMethodError.invoke(r0, r1, r2, r3)
            goto L35e
        L23d:
            r0 = r20
            boolean r0 = r0.isVarargs()
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r17
            int r0 = r0.size()
            r23 = r0
            goto L30c
        L253:
            r0 = r17
            r1 = r22
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0
            r24 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r25 = r0
            r0 = r21
            if (r0 == 0) goto L287
            r0 = r22
            r1 = r25
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 < r1) goto L287
            r0 = r25
            r1 = r25
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.leafComponentType()
            r26 = r0
            goto L28e
        L287:
            r0 = r25
            r1 = r22
            r0 = r0[r1]
            r26 = r0
        L28e:
            r0 = r24
            boolean r0 = requiresPolyBinding(r0)
            if (r0 == 0) goto L2a4
            r0 = r24
            r1 = r26
            r0.setExpectedType(r1)
            r0 = r24
            r1 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)
        L2a4:
            r0 = r24
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            if (r0 == 0) goto L309
            r0 = r26
            boolean r0 = r0.isBaseType()
            if (r0 != 0) goto L2dc
            r0 = r24
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            boolean r0 = r0.isBaseType()
            if (r0 == 0) goto L2dc
            r0 = r24
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            int r0 = r0.id
            r27 = r0
            r0 = r24
            r1 = 512(0x200, float:7.175E-43)
            r2 = r27
            r3 = r27
            r4 = 4
            int r3 = r3 << r4
            int r2 = r2 + r3
            r1 = r1 | r2
            r0.implicitConversion = r1
            goto L309
        L2dc:
            r0 = r26
            boolean r0 = r0.isBaseType()
            if (r0 == 0) goto L309
            r0 = r24
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            boolean r0 = r0.isBaseType()
            if (r0 != 0) goto L309
            r0 = r25
            r1 = r22
            r0 = r0[r1]
            int r0 = r0.id
            r27 = r0
            r0 = r24
            r1 = 1024(0x400, float:1.435E-42)
            r2 = r27
            r3 = r27
            r4 = 4
            int r3 = r3 << r4
            int r2 = r2 + r3
            r1 = r1 | r2
            r0.implicitConversion = r1
        L309:
            int r22 = r22 + 1
        L30c:
            r0 = r22
            r1 = r23
            if (r0 < r1) goto L253
            r0 = r7
            r1 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = createNameRef(r1, r2)
            r0.receiver = r1
            r0 = r7
            r1 = r15
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            r0.actualReceiverType = r1
            r0 = r7
            r1 = r20
            r0.binding = r1
            r0 = r7
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.binding
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.returnType
            r0.resolvedType = r1
            r0 = r7
            r1 = r7
            int r1 = r1.sourceEnd
            r0.statementEnd = r1
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentTypes
            if (r0 == 0) goto L35e
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.argumentTypes     // Catch: java.lang.IllegalAccessException -> L35d
            r1 = r7
            r2 = r19
            r3 = 0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r3 = new org.eclipse.jdt.internal.compiler.lookup.TypeBinding[r3]     // Catch: java.lang.IllegalAccessException -> L35d
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.IllegalAccessException -> L35d
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L35d
            goto L35e
        L35d:
        L35e:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            return r0
        L363:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L101
        L36d:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld1
        L377:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.agent.PatchExtensionMethod$PostponedError r0 = (lombok.eclipse.agent.PatchExtensionMethod.PostponedError) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L38f
            r0 = r13
            r0.fire()
        L38f:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.MessageSend, lombok.eclipse.agent.PatchExtensionMethod$PostponedError> r0 = lombok.eclipse.agent.PatchExtensionMethod.MessageSend_postponedErrors
            r1 = r7
            java.lang.Object r0 = r0.clear(r1)
            r0 = r6
            return r0
    }

    private static boolean requiresPolyBinding(org.eclipse.jdt.internal.compiler.ast.Expression r2) {
            r0 = r2
            boolean r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.isFunctionalExpression(r0)
            if (r0 != 0) goto L17
            r0 = r2
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            if (r0 == 0) goto L15
            r0 = r2
            boolean r0 = lombok.eclipse.agent.PatchExtensionMethod.Reflection.isPolyExpression(r0)
            if (r0 != 0) goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.NameReference createNameRef(org.eclipse.jdt.internal.compiler.lookup.TypeBinding r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r0 = r8
            int r0 = r0.sourceStart
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r8
            int r1 = r1.sourceEnd
            long r1 = (long) r1
            long r0 = r0 | r1
            r9 = r0
            r0 = r7
            char[] r0 = r0.qualifiedPackageName()
            r11 = r0
            r0 = r7
            char[] r0 = r0.qualifiedSourceName()
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L31
            r0 = r13
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
        L31:
            r0 = r13
            int r0 = r0.length()
            if (r0 <= 0) goto L42
            r0 = r13
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
        L42:
            r0 = r13
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r14
            r1 = 46
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 != r1) goto L67
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r12
            r3 = r9
            r1.<init>(r2, r3)
            return r0
        L67:
            r0 = r14
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r16 = r0
            r0 = r16
            int r0 = r0.length
            char[] r0 = new char[r0]
            r15 = r0
            r0 = 0
            r17 = r0
            goto L8f
        L7f:
            r0 = r15
            r1 = r17
            r2 = r16
            r3 = r17
            r2 = r2[r3]
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            int r17 = r17 + 1
        L8f:
            r0 = r17
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto L7f
            r0 = r16
            int r0 = r0.length
            long[] r0 = new long[r0]
            r17 = r0
            r0 = r17
            r1 = r9
            java.util.Arrays.fill(r0, r1)
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r15
            r3 = r17
            r4 = r8
            int r4 = r4.sourceStart
            r5 = r8
            int r5 = r5.sourceEnd
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
