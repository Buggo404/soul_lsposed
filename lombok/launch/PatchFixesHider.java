package lombok.launch;

/* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
/* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider.SCL.lombok */
final class PatchFixesHider {

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Delegate.SCL.lombok */
    public static final class Delegate {
        private static final java.lang.reflect.Method HANDLE_DELEGATE_FOR_TYPE = null;
        private static final java.lang.reflect.Method ADD_GENERATED_DELEGATE_METHODS = null;

        static void updateImportantForAccessibility(android.view.View r7, boolean r8) {
                java.lang.String r0 = "lombok.eclipse.agent.PatchDelegatePortal"
                void r0 = android.animation.Animator.resume()
                r7 = r0
                r0 = r7
                java.lang.String r1 = "handleDelegateForType"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                void r0 = android.animation.AnimatorListenerAdapter.onAnimationRepeat(r0)
                lombok.launch.PatchFixesHider.Delegate.HANDLE_DELEGATE_FOR_TYPE = r0
                r0 = r7
                java.lang.String r1 = "addGeneratedDelegateMethods"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                void r0 = android.animation.AnimatorListenerAdapter.onAnimationRepeat(r0)
                lombok.launch.PatchFixesHider.Delegate.ADD_GENERATED_DELEGATE_METHODS = r0
                return
        }

        public Delegate(android.content.Context r3) {
                r2 = this;
                r0 = r2
                super/*android.animation.AnimatorSet*/.start()
                return
        }

        /* renamed from: <init>, reason: not valid java name */
        public static void m334init(android.content.Context r6, android.util.AttributeSet r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Delegate.HANDLE_DELEGATE_FOR_TYPE
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                java.lang.Class r0 = android.animation.Keyframe.getType()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                android.animation.Keyframe r0 = r0.ofInt(r0, r3)
                return r0
        }

        /* renamed from: <init>, reason: not valid java name */
        public static void m335init(android.content.Context r6) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Delegate.ADD_GENERATED_DELEGATE_METHODS
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Class r0 = android.animation.Keyframe.getType()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$ExtensionMethod.SCL.lombok */
    public static final class ExtensionMethod {
        private static final java.lang.String MESSAGE_SEND_SIG = "org.eclipse.jdt.internal.compiler.ast.MessageSend";
        private static final java.lang.String TYPE_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding";
        private static final java.lang.String SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.Scope";
        private static final java.lang.String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final java.lang.String TYPE_BINDINGS_SIG = "[Lorg.eclipse.jdt.internal.compiler.lookup.TypeBinding;";
        private static final java.lang.String PROBLEM_REPORTER_SIG = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter";
        private static final java.lang.String METHOD_BINDING_SIG = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding";
        private static final java.lang.String AST_NODE_SIG = "org.eclipse.jdt.internal.compiler.ast.ASTNode";
        private static final java.lang.reflect.Method RESOLVE_TYPE = null;
        private static final java.lang.reflect.Method ERROR_NO_METHOD_FOR = null;
        private static final java.lang.reflect.Method INVALID_METHOD = null;
        private static final java.lang.reflect.Method INVALID_METHOD2 = null;
        private static final java.lang.reflect.Method NON_STATIC_ACCESS_TO_STATIC_METHOD = null;

        static {
                java.lang.String r0 = "lombok.eclipse.agent.PatchExtensionMethod"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "resolveType"
                r2 = 3
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ExtensionMethod.RESOLVE_TYPE = r0
                r0 = r7
                java.lang.String r1 = "errorNoMethodFor"
                r2 = 4
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.TypeBinding"
                r3[r4] = r5
                r3 = r2
                r4 = 3
                java.lang.String r5 = "[Lorg.eclipse.jdt.internal.compiler.lookup.TypeBinding;"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ExtensionMethod.ERROR_NO_METHOD_FOR = r0
                r0 = r7
                java.lang.String r1 = "invalidMethod"
                r2 = 3
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD = r0
                r0 = r7
                java.lang.String r1 = "invalidMethod"
                r2 = 4
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
                r3[r4] = r5
                r3 = r2
                r4 = 3
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.Scope"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD2 = r0
                r0 = r7
                java.lang.String r1 = "nonStaticAccessToStaticMethod"
                r2 = 4
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.problem.ProblemReporter"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.ASTNode"
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.MethodBinding"
                r3[r4] = r5
                r3 = r2
                r4 = 3
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.MessageSend"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ExtensionMethod.NON_STATIC_ACCESS_TO_STATIC_METHOD = r0
                return
        }

        public ExtensionMethod() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.lang.Object resolveType(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.RESOLVE_TYPE
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return r0
        }

        public static void errorNoMethodFor(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.ERROR_NO_METHOD_FOR
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void invalidMethod(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void invalidMethod(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.INVALID_METHOD2
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void nonStaticAccessToStaticMethod(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ExtensionMethod.NON_STATIC_ACCESS_TO_STATIC_METHOD
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Javadoc.SCL.lombok */
    public static final class Javadoc {
        private static final java.lang.reflect.Method GET_HTML = null;
        private static final java.lang.reflect.Method PRINT_METHOD = null;

        static {
                java.lang.String r0 = "lombok.eclipse.agent.PatchJavadoc"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "getHTMLContentFromSource"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.Javadoc.GET_HTML = r0
                r0 = r7
                java.lang.String r1 = "printMethod"
                r2 = 4
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration> r5 = org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.StringBuffer> r5 = java.lang.StringBuffer.class
                r3[r4] = r5
                r3 = r2
                r4 = 3
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.TypeDeclaration> r5 = org.eclipse.jdt.internal.compiler.ast.TypeDeclaration.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.Javadoc.PRINT_METHOD = r0
                return
        }

        public Javadoc() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.lang.String getHTMLContentFromSource(java.lang.String r6, org.eclipse.jdt.core.IJavaElement r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Javadoc.GET_HTML
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        public static java.lang.StringBuffer printMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r6, int r7, java.lang.StringBuffer r8, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Javadoc.PRINT_METHOD
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                r2 = r1
                r3 = 3
                r4 = r9
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.lang.StringBuffer r0 = (java.lang.StringBuffer) r0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$LombokDeps.SCL.lombok */
    public static final class LombokDeps {
        public static final java.lang.reflect.Method ADD_LOMBOK_NOTES = null;
        public static final java.lang.reflect.Method POST_COMPILER_BYTES_STRING = null;
        public static final java.lang.reflect.Method POST_COMPILER_OUTPUTSTREAM = null;
        public static final java.lang.reflect.Method POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING = null;

        static {
                java.lang.String r0 = "lombok.eclipse.agent.PatchFixesShadowLoaded"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "addLombokNotesToEclipseAboutDialog"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.LombokDeps.ADD_LOMBOK_NOTES = r0
                r0 = r7
                java.lang.String r1 = "runPostCompiler"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<byte[]> r5 = byte[].class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BYTES_STRING = r0
                r0 = r7
                java.lang.String r1 = "runPostCompiler"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.io.OutputStream> r5 = java.io.OutputStream.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_OUTPUTSTREAM = r0
                r0 = r7
                java.lang.String r1 = "runPostCompiler"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.io.BufferedOutputStream> r5 = java.io.BufferedOutputStream.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING = r0
                return
        }

        public LombokDeps() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.lang.String addLombokNotesToEclipseAboutDialog(java.lang.String r6, java.lang.String r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.ADD_LOMBOK_NOTES     // Catch: java.lang.Throwable -> L16
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4     // Catch: java.lang.Throwable -> L16
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)     // Catch: java.lang.Throwable -> L16
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L16
                return r0
            L16:
                r0 = r6
                return r0
        }

        public static byte[] runPostCompiler(byte[] r6, java.lang.String r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BYTES_STRING
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                byte[] r0 = (byte[]) r0
                return r0
        }

        public static java.io.OutputStream runPostCompiler(java.io.OutputStream r6) throws java.io.IOException {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_OUTPUTSTREAM
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.io.OutputStream r0 = (java.io.OutputStream) r0
                return r0
        }

        public static java.io.BufferedOutputStream runPostCompiler(java.io.BufferedOutputStream r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.LombokDeps.POST_COMPILER_BUFFEREDOUTPUTSTREAM_STRING_STRING
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$PatchFixes.SCL.lombok */
    public static final class PatchFixes {
        public static final int ALREADY_PROCESSED_FLAG = 8388608;

        public PatchFixes() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static boolean isGenerated(org.eclipse.jdt.core.dom.ASTNode r3) {
                r0 = 0
                r4 = r0
                r0 = r3
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L36
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L36
                r1 = r3
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L36
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L36
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L36
                r4 = r0
                r0 = r4
                if (r0 != 0) goto L37
                r0 = r3
                org.eclipse.jdt.core.dom.ASTNode r0 = r0.getParent()     // Catch: java.lang.Exception -> L36
                if (r0 == 0) goto L37
                r0 = r3
                org.eclipse.jdt.core.dom.ASTNode r0 = r0.getParent()     // Catch: java.lang.Exception -> L36
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.QualifiedName     // Catch: java.lang.Exception -> L36
                if (r0 == 0) goto L37
                r0 = r3
                org.eclipse.jdt.core.dom.ASTNode r0 = r0.getParent()     // Catch: java.lang.Exception -> L36
                boolean r0 = isGenerated(r0)     // Catch: java.lang.Exception -> L36
                r4 = r0
                goto L37
            L36:
            L37:
                r0 = r4
                return r0
        }

        public static boolean isGenerated(org.eclipse.jdt.internal.compiler.ast.ASTNode r3) {
                r0 = 0
                r4 = r0
                r0 = r3
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = "$generatedBy"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L1b
                r1 = r3
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1b
                if (r0 == 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r4 = r0
                goto L1c
            L1b:
            L1c:
                r0 = r4
                return r0
        }

        public static boolean isGenerated(org.eclipse.jdt.core.IMember r3) {
                r0 = 0
                r4 = r0
                r0 = r3
                org.eclipse.jdt.core.ISourceRange r0 = r0.getNameRange()     // Catch: org.eclipse.jdt.core.JavaModelException -> L2b
                int r0 = r0.getLength()     // Catch: org.eclipse.jdt.core.JavaModelException -> L2b
                if (r0 <= 0) goto L26
                r0 = r3
                org.eclipse.jdt.core.ISourceRange r0 = r0.getNameRange()     // Catch: org.eclipse.jdt.core.JavaModelException -> L2b
                r1 = r3
                org.eclipse.jdt.core.ISourceRange r1 = r1.getSourceRange()     // Catch: org.eclipse.jdt.core.JavaModelException -> L2b
                boolean r0 = r0.equals(r1)     // Catch: org.eclipse.jdt.core.JavaModelException -> L2b
                if (r0 != 0) goto L26
                r0 = 0
                goto L27
            L26:
                r0 = 1
            L27:
                r4 = r0
                goto L2c
            L2b:
            L2c:
                r0 = r4
                return r0
        }

        public static boolean isBlockedVisitorAndGenerated(org.eclipse.jdt.core.dom.ASTNode r3, org.eclipse.jdt.core.dom.ASTVisitor r4) {
                r0 = r4
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                r5 = r0
                r0 = r5
                java.lang.String r1 = "org.eclipse.jdt.internal.corext.fix"
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L2b
                r0 = r5
                java.lang.String r1 = "org.eclipse.jdt.internal.ui.fix"
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L2b
                r0 = r5
                java.lang.String r1 = "org.eclipse.jdt.ls.core.internal.semantictokens.SemanticTokensVisitor"
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L2b
                r0 = 0
                return r0
            L2b:
                r0 = r5
                java.lang.String r1 = "org.eclipse.jdt.internal.corext.fix.VariableDeclarationFixCore$WrittenNamesFinder"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L36
                r0 = 0
                return r0
            L36:
                r0 = r3
                boolean r0 = isGenerated(r0)
                return r0
        }

        public static boolean isListRewriteOnGeneratedNode(org.eclipse.jdt.core.dom.rewrite.ListRewrite r2) {
                r0 = r2
                org.eclipse.jdt.core.dom.ASTNode r0 = r0.getParent()
                boolean r0 = isGenerated(r0)
                return r0
        }

        public static boolean returnFalse(java.lang.Object r2) {
                r0 = 0
                return r0
        }

        public static boolean returnTrue(java.lang.Object r2) {
                r0 = 1
                return r0
        }

        public static java.util.List removeGeneratedNodes(java.util.List r4) {
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3c
                r1 = r0
                r2 = r4
                int r2 = r2.size()     // Catch: java.lang.Exception -> L3c
                r1.<init>(r2)     // Catch: java.lang.Exception -> L3c
                r5 = r0
                r0 = r4
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L3c
                r7 = r0
                goto L31
            L18:
                r0 = r7
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L3c
                r6 = r0
                r0 = r6
                org.eclipse.jdt.core.dom.ASTNode r0 = (org.eclipse.jdt.core.dom.ASTNode) r0     // Catch: java.lang.Exception -> L3c
                boolean r0 = isGenerated(r0)     // Catch: java.lang.Exception -> L3c
                if (r0 != 0) goto L31
                r0 = r5
                r1 = r6
                boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> L3c
            L31:
                r0 = r7
                boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L3c
                if (r0 != 0) goto L18
                r0 = r5
                return r0
            L3c:
                r0 = r4
                return r0
        }

        public static java.lang.String getRealMethodDeclarationSource(java.lang.String r3, java.lang.Object r4, org.eclipse.jdt.core.dom.MethodDeclaration r5) throws java.lang.Exception {
                r0 = r5
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L9
                r0 = r3
                return r0
            L9:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r5
                java.util.List r0 = r0.modifiers()
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
                goto L60
            L1f:
                r0 = r8
                java.lang.Object r0 = r0.next()
                r7 = r0
                r0 = r7
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.Annotation
                if (r0 == 0) goto L60
                r0 = r7
                org.eclipse.jdt.core.dom.Annotation r0 = (org.eclipse.jdt.core.dom.Annotation) r0
                r9 = r0
                r0 = r9
                org.eclipse.jdt.core.dom.ITypeBinding r0 = r0.resolveTypeBinding()
                java.lang.String r0 = r0.getQualifiedName()
                r10 = r0
                java.lang.String r0 = "java.lang.Override"
                r1 = r10
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L60
                java.lang.String r0 = "java.lang.SuppressWarnings"
                r1 = r10
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L60
                r0 = r6
                r1 = r9
                boolean r0 = r0.add(r1)
            L60:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L1f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = r6
                r1 = r7
                addAnnotations(r0, r1)
                r0 = r4
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = "fPublic"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Lb8
                r1 = r4
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb8
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb8
                if (r0 == 0) goto L97
                r0 = r7
                java.lang.String r1 = "public "
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lb8
            L97:
                r0 = r4
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = "fAbstract"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Lb8
                r1 = r4
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb8
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb8
                if (r0 == 0) goto Lb9
                r0 = r7
                java.lang.String r1 = "abstract "
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lb8
                goto Lb9
            Lb8:
            Lb9:
                r0 = r7
                r1 = r5
                org.eclipse.jdt.core.dom.Type r1 = r1.getReturnType2()
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                org.eclipse.jdt.core.dom.SimpleName r1 = r1.getName()
                java.lang.String r1 = r1.getFullyQualifiedName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 1
                r8 = r0
                r0 = r5
                java.util.List r0 = r0.parameters()
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                goto L10c
            Leb:
                r0 = r10
                java.lang.Object r0 = r0.next()
                r9 = r0
                r0 = r8
                if (r0 != 0) goto L101
                r0 = r7
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L101:
                r0 = 0
                r8 = r0
                r0 = r7
                r1 = r9
                java.lang.StringBuilder r0 = r0.append(r1)
            L10c:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Leb
                r0 = r7
                java.lang.String r1 = ");"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                java.lang.String r0 = r0.toString()
                return r0
        }

        public static void addAnnotations(java.util.List<org.eclipse.jdt.core.dom.Annotation> r3, java.lang.StringBuilder r4) {
                r0 = r3
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
                goto Lf0
            La:
                r0 = r6
                java.lang.Object r0 = r0.next()
                org.eclipse.jdt.core.dom.Annotation r0 = (org.eclipse.jdt.core.dom.Annotation) r0
                r5 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = r5
                boolean r0 = r0.isSingleMemberAnnotation()
                if (r0 == 0) goto L3d
                r0 = r5
                org.eclipse.jdt.core.dom.SingleMemberAnnotation r0 = (org.eclipse.jdt.core.dom.SingleMemberAnnotation) r0
                r8 = r0
                r0 = r7
                r1 = r8
                org.eclipse.jdt.core.dom.Expression r1 = r1.getValue()
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
                goto L79
            L3d:
                r0 = r5
                boolean r0 = r0.isNormalAnnotation()
                if (r0 == 0) goto L79
                r0 = r5
                org.eclipse.jdt.core.dom.NormalAnnotation r0 = (org.eclipse.jdt.core.dom.NormalAnnotation) r0
                r8 = r0
                r0 = r8
                java.util.List r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                goto L6f
            L59:
                r0 = r10
                java.lang.Object r0 = r0.next()
                r9 = r0
                r0 = r7
                r1 = r9
                java.lang.String r1 = r1.toString()
                boolean r0 = r0.add(r1)
            L6f:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L59
            L79:
                r0 = r4
                java.lang.String r1 = "@"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                org.eclipse.jdt.core.dom.Name r1 = r1.getTypeName()
                java.lang.String r1 = r1.getFullyQualifiedName()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Le9
                r0 = r4
                java.lang.String r1 = "("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 1
                r8 = r0
                r0 = r7
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                goto Ld7
            Lab:
                r0 = r10
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                r9 = r0
                r0 = r8
                if (r0 != 0) goto Lc3
                r0 = r4
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            Lc3:
                r0 = 0
                r8 = r0
                r0 = r4
                r1 = 34
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r9
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 34
                java.lang.StringBuilder r0 = r0.append(r1)
            Ld7:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Lab
                r0 = r4
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
            Le9:
                r0 = r4
                java.lang.String r1 = " "
                java.lang.StringBuilder r0 = r0.append(r1)
            Lf0:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto La
                return
        }

        public static org.eclipse.jdt.core.dom.MethodDeclaration getRealMethodDeclarationNode(org.eclipse.jdt.core.dom.MethodDeclaration r4, org.eclipse.jdt.core.IMethod r5, org.eclipse.jdt.core.dom.CompilationUnit r6) throws org.eclipse.jdt.core.JavaModelException {
                r0 = r4
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L9
                r0 = r4
                return r0
            L9:
                r0 = r5
                org.eclipse.jdt.core.IType r0 = r0.getDeclaringType()
                r7 = r0
                java.util.Stack r0 = new java.util.Stack
                r1 = r0
                r1.<init>()
                r8 = r0
                goto L2a
            L1c:
                r0 = r8
                r1 = r7
                java.lang.Object r0 = r0.push(r1)
                r0 = r7
                org.eclipse.jdt.core.IType r0 = r0.getDeclaringType()
                r7 = r0
            L2a:
                r0 = r7
                if (r0 != 0) goto L1c
                r0 = r8
                java.lang.Object r0 = r0.pop()
                org.eclipse.jdt.core.IType r0 = (org.eclipse.jdt.core.IType) r0
                r9 = r0
                r0 = r9
                r1 = r6
                java.util.List r1 = r1.types()
                org.eclipse.jdt.core.dom.AbstractTypeDeclaration r0 = findTypeDeclaration(r0, r1)
                r10 = r0
                goto L58
            L46:
                r0 = r8
                java.lang.Object r0 = r0.pop()
                org.eclipse.jdt.core.IType r0 = (org.eclipse.jdt.core.IType) r0
                r1 = r10
                java.util.List r1 = r1.bodyDeclarations()
                org.eclipse.jdt.core.dom.AbstractTypeDeclaration r0 = findTypeDeclaration(r0, r1)
                r10 = r0
            L58:
                r0 = r8
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L65
                r0 = r10
                if (r0 != 0) goto L46
            L65:
                r0 = r5
                java.lang.String r0 = r0.getElementName()
                r11 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r12 = r0
                r0 = r5
                java.lang.String[] r0 = r0.getParameterTypes()
                r1 = r0
                r16 = r1
                int r0 = r0.length
                r15 = r0
                r0 = 0
                r14 = r0
                goto L9f
            L88:
                r0 = r16
                r1 = r14
                r0 = r0[r1]
                r13 = r0
                r0 = r12
                r1 = r13
                java.lang.String r1 = org.eclipse.jdt.core.Signature.toString(r1)
                boolean r0 = r0.add(r1)
                int r14 = r14 + 1
            L9f:
                r0 = r14
                r1 = r15
                if (r0 < r1) goto L88
                r0 = r8
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16a
                r0 = r10
                if (r0 == 0) goto L16a
                r0 = r10
                java.util.List r0 = r0.bodyDeclarations()
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
                goto L160
            Lc2:
                r0 = r14
                java.lang.Object r0 = r0.next()
                r13 = r0
                r0 = r13
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.MethodDeclaration
                if (r0 == 0) goto L160
                r0 = r13
                org.eclipse.jdt.core.dom.MethodDeclaration r0 = (org.eclipse.jdt.core.dom.MethodDeclaration) r0
                r15 = r0
                r0 = r15
                org.eclipse.jdt.core.dom.SimpleName r0 = r0.getName()
                java.lang.String r0 = r0.toString()
                r1 = r11
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto Led
                goto L160
            Led:
                r0 = r15
                java.util.List r0 = r0.parameters()
                int r0 = r0.size()
                r1 = r12
                int r1 = r1.size()
                if (r0 == r1) goto L104
                goto L160
            L104:
                r0 = r15
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L10f
                goto L160
            L10f:
                r0 = 1
                r16 = r0
                r0 = 0
                r17 = r0
                goto L149
            L118:
                r0 = r15
                java.util.List r0 = r0.parameters()
                r1 = r17
                java.lang.Object r0 = r0.get(r1)
                org.eclipse.jdt.core.dom.SingleVariableDeclaration r0 = (org.eclipse.jdt.core.dom.SingleVariableDeclaration) r0
                r18 = r0
                r0 = r18
                org.eclipse.jdt.core.dom.Type r0 = r0.getType()
                java.lang.String r0 = r0.toString()
                r1 = r12
                r2 = r17
                java.lang.Object r1 = r1.get(r2)
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L146
                r0 = 0
                r16 = r0
                goto L158
            L146:
                int r17 = r17 + 1
            L149:
                r0 = r17
                r1 = r15
                java.util.List r1 = r1.parameters()
                int r1 = r1.size()
                if (r0 < r1) goto L118
            L158:
                r0 = r16
                if (r0 == 0) goto L160
                r0 = r15
                return r0
            L160:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Lc2
            L16a:
                r0 = r4
                return r0
        }

        public static org.eclipse.jdt.core.dom.AbstractTypeDeclaration findTypeDeclaration(org.eclipse.jdt.core.IType r3, java.util.List<?> r4) {
                r0 = r4
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
                goto L35
            La:
                r0 = r6
                java.lang.Object r0 = r0.next()
                r5 = r0
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.AbstractTypeDeclaration
                if (r0 == 0) goto L35
                r0 = r5
                org.eclipse.jdt.core.dom.AbstractTypeDeclaration r0 = (org.eclipse.jdt.core.dom.AbstractTypeDeclaration) r0
                r7 = r0
                r0 = r7
                org.eclipse.jdt.core.dom.SimpleName r0 = r0.getName()
                java.lang.String r0 = r0.toString()
                r1 = r3
                java.lang.String r1 = r1.getElementName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L35
                r0 = r7
                return r0
            L35:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto La
                r0 = 0
                return r0
        }

        public static int getSourceEndFixed(int r3, org.eclipse.jdt.internal.compiler.ast.ASTNode r4) throws java.lang.Exception {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L1f
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "$generatedBy"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L1f
                r0 = r5
                int r0 = r0.sourceEnd
                return r0
            L1f:
                r0 = r3
                return r0
        }

        public static int fixRetrieveStartingCatchPosition(int r3, int r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                goto La
            L9:
                r0 = r3
            La:
                return r0
        }

        public static int fixRetrieveIdentifierEndPosition(int r3, int r4, int r5) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L7
                r0 = r5
                return r0
            L7:
                r0 = r3
                r1 = r4
                if (r0 >= r1) goto Le
                r0 = r5
                return r0
            Le:
                r0 = r3
                return r0
        }

        public static int fixRetrieveEllipsisStartPosition(int r3, int r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                goto La
            L9:
                r0 = r3
            La:
                return r0
        }

        public static int fixRetrieveStartBlockPosition(int r3, int r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                goto La
            L9:
                r0 = r3
            La:
                return r0
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int r3, int r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                goto La
            L9:
                r0 = r3
            La:
                return r0
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int r3, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                if (r0 != 0) goto Lb
            L9:
                r0 = r3
                return r0
            Lb:
                lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L24
                r0 = r4
                int r0 = r0.declarationSourceEnd
                return r0
            L24:
                r0 = -1
                return r0
        }

        public static int fixRetrieveRightBraceOrSemiColonPosition(int r3, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                if (r0 != 0) goto Lb
            L9:
                r0 = r3
                return r0
            Lb:
                lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L24
                r0 = r4
                int r0 = r0.declarationSourceEnd
                return r0
            L24:
                r0 = -1
                return r0
        }

        public static int fixRetrieveProperRightBracketPosition(int r3, org.eclipse.jdt.core.dom.Type r4) {
                r0 = r3
                r1 = -1
                if (r0 != r1) goto L9
                r0 = r4
                if (r0 != 0) goto Lb
            L9:
                r0 = r3
                return r0
            Lb:
                r0 = r4
                boolean r0 = isGenerated(r0)
                if (r0 == 0) goto L1e
                r0 = r4
                int r0 = r0.getStartPosition()
                r1 = r4
                int r1 = r1.getLength()
                int r0 = r0 + r1
                r1 = 1
                int r0 = r0 - r1
                return r0
            L1e:
                r0 = -1
                return r0
        }

        public static boolean checkBit24(java.lang.Object r3) throws java.lang.Exception {
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "bits"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r3
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r4 = r0
                r0 = r4
                r1 = 8388608(0x800000, float:1.17549435E-38)
                r0 = r0 & r1
                if (r0 == 0) goto L1e
                r0 = 1
                return r0
            L1e:
                r0 = 0
                return r0
        }

        public static boolean skipRewritingGeneratedNodes(org.eclipse.jdt.core.dom.ASTNode r3) throws java.lang.Exception {
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r3
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        public static void setIsGeneratedFlag(org.eclipse.jdt.core.dom.ASTNode r4, org.eclipse.jdt.internal.compiler.ast.ASTNode r5) throws java.lang.Exception {
                r0 = r5
                if (r0 == 0) goto L8
                r0 = r4
                if (r0 != 0) goto L9
            L8:
                return
            L9:
                lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
                r1 = r5
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L2e
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r4
                r2 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.set(r1, r2)
            L2e:
                return
        }

        public static void setIsGeneratedFlagForName(org.eclipse.jdt.core.dom.Name r4, java.lang.Object r5) throws java.lang.Exception {
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ASTNode
                if (r0 == 0) goto L2f
                lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.ASTNode, org.eclipse.jdt.internal.compiler.ast.ASTNode> r0 = lombok.eclipse.EcjAugments.ASTNode_generatedBy
                r1 = r5
                org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L2f
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r1 = r4
                r2 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.set(r1, r2)
            L2f:
                return
        }

        public static org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] listRewriteHandleGeneratedMethods(org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent r6) {
                r0 = r6
                org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] r0 = r0.getChildren()
                r7 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r8 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r9 = r0
                r0 = 0
                r10 = r0
                goto L8b
            L1b:
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                java.lang.Object r0 = r0.getOriginalValue()
                org.eclipse.jdt.core.dom.ASTNode r0 = (org.eclipse.jdt.core.dom.ASTNode) r0
                boolean r0 = isGenerated(r0)
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L7f
                r0 = r11
                int r0 = r0.getChangeKind()
                r1 = 4
                if (r0 == r1) goto L49
                r0 = r11
                int r0 = r0.getChangeKind()
                r1 = 2
                if (r0 == r1) goto L49
                r0 = 0
                goto L4a
            L49:
                r0 = 1
            L4a:
                r13 = r0
                r0 = r11
                java.lang.Object r0 = r0.getOriginalValue()
                boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.MethodDeclaration
                r14 = r0
                r0 = r13
                if (r0 == 0) goto L88
                r0 = r14
                if (r0 == 0) goto L88
                r0 = r11
                java.lang.Object r0 = r0.getNewValue()
                if (r0 == 0) goto L88
                r0 = r9
                org.eclipse.jdt.internal.core.dom.rewrite.NodeRewriteEvent r1 = new org.eclipse.jdt.internal.core.dom.rewrite.NodeRewriteEvent
                r2 = r1
                r3 = 0
                r4 = r11
                java.lang.Object r4 = r4.getNewValue()
                r2.<init>(r3, r4)
                boolean r0 = r0.add(r1)
                goto L88
            L7f:
                r0 = r8
                r1 = r11
                boolean r0 = r0.add(r1)
            L88:
                int r10 = r10 + 1
            L8b:
                r0 = r10
                r1 = r7
                int r1 = r1.length
                if (r0 < r1) goto L1b
                r0 = r8
                r1 = r9
                boolean r0 = r0.addAll(r1)
                r0 = r8
                r1 = 0
                org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] r1 = new org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[] r0 = (org.eclipse.jdt.internal.core.dom.rewrite.RewriteEvent[]) r0
                return r0
        }

        public static int getTokenEndOffsetFixed(org.eclipse.jdt.internal.core.dom.rewrite.TokenScanner r4, int r5, int r6, java.lang.Object r7) throws org.eclipse.core.runtime.CoreException {
                r0 = 0
                r8 = r0
                r0 = r7
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L1b
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L1b
                r1 = r7
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1b
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L1b
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L1b
                r8 = r0
                goto L1c
            L1b:
            L1c:
                r0 = r8
                if (r0 == 0) goto L23
                r0 = -1
                return r0
            L23:
                r0 = r4
                r1 = r5
                r2 = r6
                int r0 = r0.getTokenEndOffset(r1, r2)
                return r0
        }

        public static org.eclipse.jdt.core.IMethod[] removeGeneratedMethods(org.eclipse.jdt.core.IMethod[] r3) throws java.lang.Exception {
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L2b
            L14:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r5
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L28
                r0 = r4
                r1 = r5
                boolean r0 = r0.add(r1)
            L28:
                int r6 = r6 + 1
            L2b:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto L14
                r0 = r4
                int r0 = r0.size()
                r1 = r3
                int r1 = r1.length
                if (r0 != r1) goto L40
                r0 = r3
                goto L4d
            L40:
                r0 = r4
                r1 = 0
                org.eclipse.jdt.core.IMethod[] r1 = new org.eclipse.jdt.core.IMethod[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                org.eclipse.jdt.core.IMethod[] r0 = (org.eclipse.jdt.core.IMethod[]) r0
            L4d:
                return r0
        }

        public static org.eclipse.jdt.core.search.SearchMatch[] removeGenerated(org.eclipse.jdt.core.search.SearchMatch[] r3) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = 0
                r5 = r0
                goto L43
            Ld:
                r0 = r3
                r1 = r5
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                java.lang.Object r0 = r0.getElement()
                boolean r0 = r0 instanceof org.eclipse.jdt.core.IField
                if (r0 == 0) goto L38
                r0 = r6
                java.lang.Object r0 = r0.getElement()
                org.eclipse.jdt.core.IField r0 = (org.eclipse.jdt.core.IField) r0
                r7 = r0
                r0 = r7
                java.lang.String r1 = "Generated"
                org.eclipse.jdt.core.IAnnotation r0 = r0.getAnnotation(r1)
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L38
                goto L40
            L38:
                r0 = r4
                r1 = r6
                boolean r0 = r0.add(r1)
            L40:
                int r5 = r5 + 1
            L43:
                r0 = r5
                r1 = r3
                int r1 = r1.length
                if (r0 < r1) goto Ld
                r0 = r4
                r1 = 0
                org.eclipse.jdt.core.search.SearchMatch[] r1 = new org.eclipse.jdt.core.search.SearchMatch[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                org.eclipse.jdt.core.search.SearchMatch[] r0 = (org.eclipse.jdt.core.search.SearchMatch[]) r0
                return r0
        }

        public static org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[] createFakeSearchResult(org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[] r8, java.lang.Object r9) throws java.lang.Exception {
                r0 = r8
                if (r0 == 0) goto L9
                r0 = r8
                int r0 = r0.length
                if (r0 != 0) goto L4d
            L9:
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = "fField"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L4d
                r0 = r10
                r1 = 1
                r0.setAccessible(r1)
                r0 = r10
                r1 = r9
                java.lang.Object r0 = r0.get(r1)
                org.eclipse.jdt.internal.core.SourceField r0 = (org.eclipse.jdt.internal.core.SourceField) r0
                r11 = r0
                r0 = r11
                org.eclipse.jdt.core.IType r0 = r0.getDeclaringType()
                java.lang.String r1 = "Data"
                org.eclipse.jdt.core.IAnnotation r0 = r0.getAnnotation(r1)
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L4d
                r0 = 1
                org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[] r0 = new org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup[r0]
                r1 = r0
                r2 = 0
                org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup r3 = new org.eclipse.jdt.internal.corext.refactoring.SearchResultGroup
                r4 = r3
                r5 = 0
                r6 = 1
                org.eclipse.jdt.core.search.SearchMatch[] r6 = new org.eclipse.jdt.core.search.SearchMatch[r6]
                r4.<init>(r5, r6)
                r1[r2] = r3
                return r0
            L4d:
                r0 = r8
                return r0
        }

        public static org.eclipse.jdt.core.dom.SimpleName[] removeGeneratedSimpleNames(org.eclipse.jdt.core.dom.SimpleName[] r5) throws java.lang.Exception {
                java.lang.Class<org.eclipse.jdt.core.dom.SimpleName> r0 = org.eclipse.jdt.core.dom.SimpleName.class
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                goto L2b
            Lf:
                r0 = r5
                r1 = r8
                r0 = r0[r1]
                if (r0 == 0) goto L25
                r0 = r6
                r1 = r5
                r2 = r8
                r1 = r1[r2]
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L28
            L25:
                int r7 = r7 + 1
            L28:
                int r8 = r8 + 1
            L2b:
                r0 = r8
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto Lf
                r0 = r7
                r1 = r5
                int r1 = r1.length
                if (r0 != r1) goto L39
                r0 = r5
                return r0
            L39:
                r0 = r7
                org.eclipse.jdt.core.dom.SimpleName[] r0 = new org.eclipse.jdt.core.dom.SimpleName[r0]
                r8 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r9 = r0
                goto L6b
            L46:
                r0 = r5
                r1 = r9
                r0 = r0[r1]
                if (r0 == 0) goto L5e
                r0 = r6
                r1 = r5
                r2 = r9
                r1 = r1[r2]
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L68
            L5e:
                r0 = r8
                r1 = r7
                int r7 = r7 + 1
                r2 = r5
                r3 = r9
                r2 = r2[r3]
                r0[r1] = r2
            L68:
                int r9 = r9 + 1
            L6b:
                r0 = r9
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto L46
                r0 = r8
                return r0
        }

        public static org.eclipse.jdt.core.dom.Name[] removeGeneratedNames(org.eclipse.jdt.core.dom.Name[] r5) throws java.lang.Exception {
                java.lang.Class<org.eclipse.jdt.core.dom.Name> r0 = org.eclipse.jdt.core.dom.Name.class
                java.lang.String r1 = "$isGenerated"
                java.lang.reflect.Field r0 = r0.getField(r1)
                r6 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                goto L2c
            L10:
                r0 = r5
                r1 = r8
                r0 = r0[r1]
                if (r0 == 0) goto L26
                r0 = r6
                r1 = r5
                r2 = r8
                r1 = r1[r2]
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L29
            L26:
                int r7 = r7 + 1
            L29:
                int r8 = r8 + 1
            L2c:
                r0 = r8
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto L10
                r0 = r7
                r1 = r5
                int r1 = r1.length
                if (r0 != r1) goto L3a
                r0 = r5
                return r0
            L3a:
                r0 = r7
                org.eclipse.jdt.core.dom.Name[] r0 = new org.eclipse.jdt.core.dom.Name[r0]
                r8 = r0
                r0 = 0
                r7 = r0
                r0 = 0
                r9 = r0
                goto L6c
            L47:
                r0 = r5
                r1 = r9
                r0 = r0[r1]
                if (r0 == 0) goto L5f
                r0 = r6
                r1 = r5
                r2 = r9
                r1 = r1[r2]
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L69
            L5f:
                r0 = r8
                r1 = r7
                int r7 = r7 + 1
                r2 = r5
                r3 = r9
                r2 = r2[r3]
                r0[r1] = r2
            L69:
                int r9 = r9 + 1
            L6c:
                r0 = r9
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto L47
                r0 = r8
                return r0
        }

        public static org.eclipse.jdt.internal.compiler.ast.Annotation[] convertAnnotations(org.eclipse.jdt.internal.compiler.ast.Annotation[] r5, org.eclipse.jdt.core.IAnnotatable r6) {
                r0 = r6
                org.eclipse.jdt.core.IAnnotation[] r0 = r0.getAnnotations()     // Catch: java.lang.Exception -> La
                r7 = r0
                goto Ld
            La:
                r0 = r5
                return r0
            Ld:
                r0 = r5
                if (r0 != 0) goto L13
                r0 = 0
                return r0
            L13:
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                goto L95
            L1b:
                java.lang.String r0 = new java.lang.String
                r1 = r0
                r2 = r5
                r3 = r9
                r2 = r2[r3]
                org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
                char[] r2 = r2.getLastToken()
                r1.<init>(r2)
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = r7
                r1 = r0
                r15 = r1
                int r0 = r0.length
                r14 = r0
                r0 = 0
                r13 = r0
                goto L7b
            L3e:
                r0 = r15
                r1 = r13
                r0 = r0[r1]
                r12 = r0
                r0 = r12
                java.lang.String r0 = r0.getElementName()
                r16 = r0
                r0 = r16
                r1 = 46
                int r0 = r0.lastIndexOf(r1)
                r17 = r0
                r0 = r17
                r1 = -1
                if (r0 <= r1) goto L68
                r0 = r16
                r1 = r17
                r2 = 1
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
                r16 = r0
            L68:
                r0 = r16
                r1 = r10
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L78
                r0 = 1
                r11 = r0
                goto L82
            L78:
                int r13 = r13 + 1
            L7b:
                r0 = r13
                r1 = r14
                if (r0 < r1) goto L3e
            L82:
                r0 = r11
                if (r0 != 0) goto L8f
                r0 = r5
                r1 = r9
                r2 = 0
                r0[r1] = r2
                goto L92
            L8f:
                int r8 = r8 + 1
            L92:
                int r9 = r9 + 1
            L95:
                r0 = r9
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto L1b
                r0 = r5
                r9 = r0
                r0 = r8
                r1 = r5
                int r1 = r1.length
                if (r0 >= r1) goto Ld4
                r0 = r8
                org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
                goto Lcd
            Lb4:
                r0 = r5
                r1 = r11
                r0 = r0[r1]
                if (r0 != 0) goto Lbe
                goto Lca
            Lbe:
                r0 = r9
                r1 = r10
                int r10 = r10 + 1
                r2 = r5
                r3 = r11
                r2 = r2[r3]
                r0[r1] = r2
            Lca:
                int r11 = r11 + 1
            Lcd:
                r0 = r11
                r1 = r5
                int r1 = r1.length
                if (r0 < r1) goto Lb4
            Ld4:
                r0 = r9
                return r0
        }

        public static java.lang.String getRealNodeSource(java.lang.String r2, org.eclipse.jdt.internal.compiler.ast.ASTNode r3) {
                r0 = r3
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L9
                r0 = r2
                return r0
            L9:
                r0 = r3
                java.lang.String r0 = r0.toString()
                return r0
        }

        public static java.lang.String getRealNodeSource(java.lang.String r2, org.eclipse.jdt.core.dom.ASTNode r3) throws java.lang.Exception {
                r0 = r3
                boolean r0 = isGenerated(r0)
                if (r0 != 0) goto L9
                r0 = r2
                return r0
            L9:
                r0 = r3
                java.lang.String r0 = r0.toString()
                return r0
        }

        public static boolean skipRewriteVisibility(org.eclipse.jdt.internal.corext.refactoring.structure.MemberVisibilityAdjustor.IncomingMemberVisibilityAdjustment r2) {
                r0 = r2
                org.eclipse.jdt.core.IMember r0 = r0.getMember()
                boolean r0 = isGenerated(r0)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Tests.SCL.lombok */
    public static class Tests {
        public Tests() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.lang.Object getBundle(java.lang.Object r5, java.lang.Class<?> r6) {
                r0 = r5
                if (r0 == 0) goto L6
                r0 = r5
                return r0
            L6:
                r0 = r6
                java.security.ProtectionDomain r0 = r0.getProtectionDomain()
                java.security.CodeSource r0 = r0.getCodeSource()
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L14
                r0 = 0
                return r0
            L14:
                r0 = r7
                java.net.URL r0 = r0.getLocation()
                java.lang.String r0 = r0.getFile()
                r8 = r0
                r0 = r8
                r1 = r8
                java.lang.String r2 = "/"
                int r1 = r1.lastIndexOf(r2)
                r2 = 1
                int r1 = r1 + r2
                r2 = r8
                java.lang.String r3 = "_"
                int r2 = r2.indexOf(r3)
                java.lang.String r0 = r0.substring(r1, r2)
                r9 = r0
                org.osgi.framework.BundleContext r0 = org.eclipse.core.runtime.adaptor.EclipseStarter.getSystemBundleContext()
                org.osgi.framework.Bundle[] r0 = r0.getBundles()
                r10 = r0
                r0 = r10
                r1 = r0
                r14 = r1
                int r0 = r0.length
                r13 = r0
                r0 = 0
                r12 = r0
                goto L64
            L48:
                r0 = r14
                r1 = r12
                r0 = r0[r1]
                r11 = r0
                r0 = r9
                r1 = r11
                java.lang.String r1 = r1.getSymbolicName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L61
                r0 = r11
                return r0
            L61:
                int r12 = r12 + 1
            L64:
                r0 = r12
                r1 = r13
                if (r0 < r1) goto L48
                r0 = 0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Transform.SCL.lombok */
    public static final class Transform {
        private static java.lang.reflect.Method TRANSFORM;
        private static java.lang.reflect.Method TRANSFORM_SWAPPED;

        public Transform() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private static synchronized void init(java.lang.ClassLoader r3) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Transform.TRANSFORM
                if (r0 == 0) goto L7
                return
            L7:
                r0 = r3
                lombok.launch.Main.prependClassLoader(r0)
                java.lang.String r0 = "lombok.eclipse.TransformEclipseAST"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r4 = r0
                r0 = r4
                java.lang.String r1 = "transform"
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethodAnyArgs(r0, r1)
                lombok.launch.PatchFixesHider.Transform.TRANSFORM = r0
                r0 = r4
                java.lang.String r1 = "transform_swapped"
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethodAnyArgs(r0, r1)
                lombok.launch.PatchFixesHider.Transform.TRANSFORM_SWAPPED = r0
                return
        }

        public static void transform(java.lang.Object r6, java.lang.Object r7) throws java.io.IOException {
                r0 = r6
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                init(r0)
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Transform.TRANSFORM
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void transform_swapped(java.lang.Object r6, java.lang.Object r7) throws java.io.IOException {
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                init(r0)
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Transform.TRANSFORM_SWAPPED
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Util.SCL.lombok */
    public static final class Util {
        private static java.lang.ClassLoader shadowLoader;

        public Util() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.lang.ClassLoader getShadowLoader() {
                java.lang.ClassLoader r0 = lombok.launch.PatchFixesHider.Util.shadowLoader
                if (r0 != 0) goto L1e
                java.lang.String r0 = "lombok.core.LombokNode"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L17
                java.lang.Class<lombok.launch.PatchFixesHider$Util> r0 = lombok.launch.PatchFixesHider.Util.class
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
                lombok.launch.PatchFixesHider.Util.shadowLoader = r0     // Catch: java.lang.ClassNotFoundException -> L17
                goto L1e
            L17:
                java.lang.ClassLoader r0 = lombok.launch.Main.getShadowClassLoader()
                lombok.launch.PatchFixesHider.Util.shadowLoader = r0
            L1e:
                java.lang.ClassLoader r0 = lombok.launch.PatchFixesHider.Util.shadowLoader
                return r0
        }

        public static java.lang.Class<?> shadowLoadClass(java.lang.String r4) {
                r0 = r4
                r1 = 1
                java.lang.ClassLoader r2 = getShadowLoader()     // Catch: java.lang.ClassNotFoundException -> L9
                java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L9
                return r0
            L9:
                r5 = move-exception
                r0 = r5
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
        }

        public static java.lang.reflect.Method findMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<?>... r6) {
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7
                return r0
            L7:
                r7 = move-exception
                r0 = r7
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
        }

        public static java.lang.reflect.Method findMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.String... r8) {
                r0 = r6
                java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
                r1 = r0
                r12 = r1
                int r0 = r0.length
                r11 = r0
                r0 = 0
                r10 = r0
                goto L31
            L10:
                r0 = r12
                r1 = r10
                r0 = r0[r1]
                r9 = r0
                r0 = r7
                r1 = r9
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L2e
                r0 = r9
                java.lang.Class[] r0 = r0.getParameterTypes()
                r1 = r8
                boolean r0 = sameTypes(r0, r1)
                if (r0 == 0) goto L2e
                r0 = r9
                return r0
            L2e:
                int r10 = r10 + 1
            L31:
                r0 = r10
                r1 = r11
                if (r0 < r1) goto L10
                java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r4 = r6
                java.lang.String r4 = r4.getName()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r3.<init>(r4)
                java.lang.String r3 = "::"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
        }

        public static java.lang.reflect.Method findMethodAnyArgs(java.lang.Class<?> r6, java.lang.String r7) {
                r0 = r6
                java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
                r1 = r0
                r11 = r1
                int r0 = r0.length
                r10 = r0
                r0 = 0
                r9 = r0
                goto L24
            Lf:
                r0 = r11
                r1 = r9
                r0 = r0[r1]
                r8 = r0
                r0 = r7
                r1 = r8
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L21
                r0 = r8
                return r0
            L21:
                int r9 = r9 + 1
            L24:
                r0 = r9
                r1 = r10
                if (r0 < r1) goto Lf
                java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r4 = r6
                java.lang.String r4 = r4.getName()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r3.<init>(r4)
                java.lang.String r3 = "::"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
        }

        public static java.lang.Object invokeMethod(java.lang.reflect.Method r4, java.lang.Object... r5) {
                r0 = r4
                r1 = 0
                r2 = r5
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L7 java.lang.reflect.InvocationTargetException -> Ld
                return r0
            L7:
                r6 = move-exception
                r0 = r6
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
            Ld:
                r6 = move-exception
                r0 = r6
                java.lang.Throwable r0 = r0.getCause()
                java.lang.RuntimeException r0 = sneakyThrow(r0)
                throw r0
        }

        private static java.lang.RuntimeException sneakyThrow(java.lang.Throwable r4) {
                r0 = r4
                if (r0 != 0) goto Le
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "t"
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                sneakyThrow0(r0)
                r0 = 0
                return r0
        }

        private static <T extends java.lang.Throwable> void sneakyThrow0(java.lang.Throwable r2) throws java.lang.Throwable {
                r0 = r2
                throw r0
        }

        private static boolean sameTypes(java.lang.Class<?>[] r4, java.lang.String[] r5) {
                r0 = r4
                int r0 = r0.length
                r1 = r5
                int r1 = r1.length
                if (r0 == r1) goto L9
                r0 = 0
                return r0
            L9:
                r0 = 0
                r6 = r0
                goto L22
            Le:
                r0 = r4
                r1 = r6
                r0 = r0[r1]
                java.lang.String r0 = r0.getName()
                r1 = r5
                r2 = r6
                r1 = r1[r2]
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1f
                r0 = 0
                return r0
            L1f:
                int r6 = r6 + 1
            L22:
                r0 = r6
                r1 = r4
                int r1 = r1.length
                if (r0 < r1) goto Le
                r0 = 1
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$Val.SCL.lombok */
    public static final class Val {
        private static final java.lang.String BLOCK_SCOPE_SIG = "org.eclipse.jdt.internal.compiler.lookup.BlockScope";
        private static final java.lang.String LOCAL_DECLARATION_SIG = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration";
        private static final java.lang.String FOREACH_STATEMENT_SIG = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement";
        private static final java.lang.reflect.Method HANDLE_VAL_FOR_LOCAL_DECLARATION = null;
        private static final java.lang.reflect.Method HANDLE_VAL_FOR_FOR_EACH = null;

        static {
                java.lang.String r0 = "lombok.eclipse.agent.PatchVal"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "handleValForLocalDeclaration"
                r2 = 2
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.Val.HANDLE_VAL_FOR_LOCAL_DECLARATION = r0
                r0 = r7
                java.lang.String r1 = "handleValForForEach"
                r2 = 2
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.ast.ForeachStatement"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.String r5 = "org.eclipse.jdt.internal.compiler.lookup.BlockScope"
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.Val.HANDLE_VAL_FOR_FOR_EACH = r0
                return
        }

        public Val() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static boolean handleValForLocalDeclaration(java.lang.Object r6, java.lang.Object r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Val.HANDLE_VAL_FOR_LOCAL_DECLARATION
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        public static boolean handleValForForEach(java.lang.Object r6, java.lang.Object r7) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Val.HANDLE_VAL_FOR_FOR_EACH
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        public static org.eclipse.jdt.internal.compiler.lookup.TypeBinding skipResolveInitializerIfAlreadyCalled(org.eclipse.jdt.internal.compiler.ast.Expression r3, org.eclipse.jdt.internal.compiler.lookup.BlockScope r4) {
                r0 = r3
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
                if (r0 == 0) goto Lc
                r0 = r3
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
                return r0
            Lc:
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)     // Catch: java.lang.NullPointerException -> L12 java.lang.ArrayIndexOutOfBoundsException -> L15
                return r0
            L12:
                r0 = 0
                return r0
            L15:
                r0 = 0
                return r0
        }

        public static org.eclipse.jdt.internal.compiler.lookup.TypeBinding skipResolveInitializerIfAlreadyCalled2(org.eclipse.jdt.internal.compiler.ast.Expression r3, org.eclipse.jdt.internal.compiler.lookup.BlockScope r4, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r5) {
                r0 = r5
                if (r0 == 0) goto L1c
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
                r1 = r5
                java.lang.Class r1 = r1.getClass()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1c
                r0 = r3
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
                if (r0 == 0) goto L1c
                r0 = r3
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
                return r0
            L1c:
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)     // Catch: java.lang.NullPointerException -> L22 java.lang.ArrayIndexOutOfBoundsException -> L25
                return r0
            L22:
                r0 = 0
                return r0
            L25:
                r0 = 0
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  classes.dex
 */
    /* loaded from: com.usidqw.qwerklj.apk:Class50/lombok/launch/PatchFixesHider$ValPortal.SCL.lombok */
    public static final class ValPortal {
        private static final java.lang.reflect.Method COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE = null;
        private static final java.lang.reflect.Method COPY_INITIALIZATION_OF_LOCAL_DECLARATION = null;
        private static final java.lang.reflect.Method ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT = null;
        private static final java.lang.reflect.Method ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION = null;

        static {
                java.lang.String r0 = "lombok.eclipse.agent.PatchValEclipsePortal"
                java.lang.Class r0 = lombok.launch.PatchFixesHider.Util.shadowLoadClass(r0)
                r7 = r0
                r0 = r7
                java.lang.String r1 = "copyInitializationOfForEachIterable"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE = r0
                r0 = r7
                java.lang.String r1 = "copyInitializationOfLocalDeclaration"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_LOCAL_DECLARATION = r0
                r0 = r7
                java.lang.String r1 = "addFinalAndValAnnotationToVariableDeclarationStatement"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT = r0
                r0 = r7
                java.lang.String r1 = "addFinalAndValAnnotationToSingleVariableDeclaration"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.Util.findMethod(r0, r1, r2)
                lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION = r0
                return
        }

        public ValPortal() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static void copyInitializationOfForEachIterable(java.lang.Object r6) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_FOR_EACH_ITERABLE
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void copyInitializationOfLocalDeclaration(java.lang.Object r6) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ValPortal.COPY_INITIALIZATION_OF_LOCAL_DECLARATION
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void addFinalAndValAnnotationToVariableDeclarationStatement(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_VARIABLE_DECLARATION_STATEMENT
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }

        public static void addFinalAndValAnnotationToSingleVariableDeclaration(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
                java.lang.reflect.Method r0 = lombok.launch.PatchFixesHider.ValPortal.ADD_FINAL_AND_VAL_ANNOTATION_TO_SINGLE_VARIABLE_DECLARATION
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4
                java.lang.Object r0 = lombok.launch.PatchFixesHider.Util.invokeMethod(r0, r1)
                return
        }
    }

    PatchFixesHider() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
