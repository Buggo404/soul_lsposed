package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacResolution.SCL.lombok */
public class JavacResolution {
    private final com.sun.tools.javac.util.Context context;
    private final com.sun.tools.javac.comp.Attr attr;
    private final lombok.javac.CompilerMessageSuppressor messageSuppressor;
    private static final java.lang.reflect.Method isLocal = null;
    private static java.lang.reflect.Field memberEnterDotEnv;
    private static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacResolution$ArgumentAttrReflect.SCL.lombok */
    private static class ArgumentAttrReflect {
        private static java.lang.reflect.Field ARGUMENT_TYPE_CACHE;

        static {
                int r0 = lombok.javac.Javac.getJavaCompilerVersion()
                r1 = 9
                if (r0 < r1) goto L16
                java.lang.Class<com.sun.tools.javac.comp.ArgumentAttr> r0 = com.sun.tools.javac.comp.ArgumentAttr.class
                java.lang.String r1 = "argumentTypeCache"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L15
                lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE = r0     // Catch: java.lang.Exception -> L15
                goto L16
            L15:
            L16:
                return
        }

        private ArgumentAttrReflect() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static java.util.Map<?, ?> enableTempCache(com.sun.tools.javac.util.Context r6) {
                java.lang.reflect.Field r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                r0 = r6
                com.sun.tools.javac.comp.ArgumentAttr r0 = com.sun.tools.javac.comp.ArgumentAttr.instance(r0)
                r7 = r0
                java.lang.reflect.Field r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE     // Catch: java.lang.Exception -> L29
                r1 = r7
                java.lang.Object r0 = lombok.permit.Permit.get(r0, r1)     // Catch: java.lang.Exception -> L29
                java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L29
                r8 = r0
                java.lang.reflect.Field r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE     // Catch: java.lang.Exception -> L29
                r1 = r7
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L29
                r3 = r2
                r4 = r8
                r3.<init>(r4)     // Catch: java.lang.Exception -> L29
                lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.Exception -> L29
                r0 = r8
                return r0
            L29:
                r0 = 0
                return r0
        }

        public static void restoreCache(java.util.Map<?, ?> r4, com.sun.tools.javac.util.Context r5) {
                java.lang.reflect.Field r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE
                if (r0 != 0) goto L7
                return
            L7:
                r0 = r5
                com.sun.tools.javac.comp.ArgumentAttr r0 = com.sun.tools.javac.comp.ArgumentAttr.instance(r0)
                r6 = r0
                java.lang.reflect.Field r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.ARGUMENT_TYPE_CACHE     // Catch: java.lang.Exception -> L17
                r1 = r6
                r2 = r4
                lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.Exception -> L17
                goto L18
            L17:
            L18:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacResolution$EnvFinder.SCL.lombok */
    private static final class EnvFinder extends com.sun.tools.javac.tree.JCTree.Visitor {
        private com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> env;
        private com.sun.tools.javac.comp.Enter enter;
        private com.sun.tools.javac.comp.MemberEnter memberEnter;
        private com.sun.tools.javac.tree.JCTree copyAt;

        EnvFinder(com.sun.tools.javac.util.Context r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.env = r1
                r0 = r3
                r1 = 0
                r0.copyAt = r1
                r0 = r3
                r1 = r4
                com.sun.tools.javac.comp.Enter r1 = com.sun.tools.javac.comp.Enter.instance(r1)
                r0.enter = r1
                r0 = r3
                r1 = r4
                com.sun.tools.javac.comp.MemberEnter r1 = com.sun.tools.javac.comp.MemberEnter.instance(r1)
                r0.memberEnter = r1
                return
        }

        com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> get() {
                r2 = this;
                r0 = r2
                com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r0 = r0.env
                return r0
        }

        com.sun.tools.javac.tree.JCTree copyAt() {
                r2 = this;
                r0 = r2
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                return r0
        }

        public void visitTopLevel(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r5) {
                r4 = this;
                r0 = r4
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r4
                r1 = r4
                com.sun.tools.javac.comp.Enter r1 = r1.enter
                r2 = r5
                com.sun.tools.javac.comp.Env r1 = r1.getTopLevelEnv(r2)
                r0.env = r1
                return
        }

        public void visitClassDef(com.sun.tools.javac.tree.JCTree.JCClassDecl r5) {
                r4 = this;
                r0 = r4
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r5
                com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
                if (r0 == 0) goto L1e
                r0 = r4
                r1 = r4
                com.sun.tools.javac.comp.Enter r1 = r1.enter
                r2 = r5
                com.sun.tools.javac.code.Symbol$ClassSymbol r2 = r2.sym
                com.sun.tools.javac.comp.Env r1 = r1.getClassEnv(r2)
                r0.env = r1
            L1e:
                return
        }

        public void visitMethodDef(com.sun.tools.javac.tree.JCTree.JCMethodDecl r6) {
                r5 = this;
                r0 = r5
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r5
                r1 = r5
                com.sun.tools.javac.comp.MemberEnter r1 = r1.memberEnter
                r2 = r6
                r3 = r5
                com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r3 = r3.env
                com.sun.tools.javac.comp.Env r1 = r1.getMethodEnv(r2, r3)
                r0.env = r1
                r0 = r5
                r1 = r6
                r0.copyAt = r1
                return
        }

        public void visitVarDef(com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
                r5 = this;
                r0 = r5
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r5
                r1 = r5
                com.sun.tools.javac.comp.MemberEnter r1 = r1.memberEnter
                r2 = r6
                r3 = r5
                com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r3 = r3.env
                com.sun.tools.javac.comp.Env r1 = r1.getInitEnv(r2, r3)
                r0.env = r1
                r0 = r5
                r1 = r6
                r0.copyAt = r1
                return
        }

        public void visitBlock(com.sun.tools.javac.tree.JCTree.JCBlock r4) {
                r3 = this;
                r0 = r3
                com.sun.tools.javac.tree.JCTree r0 = r0.copyAt
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r3
                r1 = r4
                r0.copyAt = r1
                return
        }

        public void visitTree(com.sun.tools.javac.tree.JCTree r2) {
                r1 = this;
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacResolution$ReflectiveAccess.SCL.lombok */
    private static class ReflectiveAccess {
        private static java.lang.reflect.Method UPPER_BOUND;
        private static java.lang.Throwable initError;

        static {
                r0 = 0
                r7 = r0
                java.lang.Class<com.sun.tools.javac.code.Types> r0 = com.sun.tools.javac.code.Types.class
                java.lang.String r1 = "upperBound"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L16
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.code.Type> r5 = com.sun.tools.javac.code.Type.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L16
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L16
                r7 = r0
                goto L1b
            L16:
                r8 = move-exception
                r0 = r8
                lombok.javac.JavacResolution.ReflectiveAccess.initError = r0
            L1b:
                r0 = r7
                if (r0 != 0) goto L38
                java.lang.Class<com.sun.tools.javac.code.Types> r0 = com.sun.tools.javac.code.Types.class
                java.lang.String r1 = "wildUpperBound"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L33
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.code.Type> r5 = com.sun.tools.javac.code.Type.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L33
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L33
                r7 = r0
                goto L38
            L33:
                r8 = move-exception
                r0 = r8
                lombok.javac.JavacResolution.ReflectiveAccess.initError = r0
            L38:
                r0 = r7
                lombok.javac.JavacResolution.ReflectiveAccess.UPPER_BOUND = r0
                return
        }

        private ReflectiveAccess() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static com.sun.tools.javac.code.Type Types_upperBound(com.sun.tools.javac.code.Types r8, com.sun.tools.javac.code.Type r9) {
                java.lang.Throwable r0 = lombok.javac.JavacResolution.ReflectiveAccess.initError
                java.lang.reflect.Method r1 = lombok.javac.JavacResolution.ReflectiveAccess.UPPER_BOUND
                r2 = r8
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = r3
                r5 = 0
                r6 = r9
                r4[r5] = r6
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2, r3)
                com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacResolution$TypeNotConvertibleException.SCL.lombok */
    public static class TypeNotConvertibleException extends java.lang.Exception {
        public TypeNotConvertibleException(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    static {
            java.lang.Class<com.sun.tools.javac.code.Symbol$TypeSymbol> r0 = com.sun.tools.javac.code.Symbol.TypeSymbol.class
            java.lang.String r1 = "isLocal"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1c
            java.lang.Class<com.sun.tools.javac.code.Symbol$TypeSymbol> r0 = com.sun.tools.javac.code.Symbol.TypeSymbol.class
            java.lang.String r1 = "isDirectlyOrIndirectlyLocal"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
            r4 = r0
        L1c:
            r0 = r4
            lombok.javac.JavacResolution.isLocal = r0
            return
    }

    public JavacResolution(com.sun.tools.javac.util.Context r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.context = r1
            r0 = r5
            r1 = r6
            com.sun.tools.javac.comp.Attr r1 = com.sun.tools.javac.comp.Attr.instance(r1)
            r0.attr = r1
            r0 = r5
            lombok.javac.CompilerMessageSuppressor r1 = new lombok.javac.CompilerMessageSuppressor
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.messageSuppressor = r1
            return
    }

    public java.util.Map<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> resolveMethodMember(lombok.javac.JavacNode r6) {
            r5 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            r8 = r0
            goto L20
        Ld:
            r0 = r7
            r1 = r8
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.push(r1)
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
        L20:
            r0 = r8
            if (r0 != 0) goto Ld
            r0 = r5
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.disableLoggers()
            lombok.javac.JavacResolution$EnvFinder r0 = new lombok.javac.JavacResolution$EnvFinder     // Catch: java.lang.Throwable -> Lbc
            r1 = r0
            r2 = r6
            com.sun.tools.javac.util.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r8 = r0
            goto L45
        L3a:
            r0 = r7
            java.lang.Object r0 = r0.pop()     // Catch: java.lang.Throwable -> Lbc
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0     // Catch: java.lang.Throwable -> Lbc
            r1 = r8
            r0.accept(r1)     // Catch: java.lang.Throwable -> Lbc
        L45:
            r0 = r7
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L3a
            lombok.javac.TreeMirrorMaker r0 = new lombok.javac.TreeMirrorMaker     // Catch: java.lang.Throwable -> Lbc
            r1 = r0
            r2 = r6
            lombok.javac.JavacTreeMaker r2 = r2.getTreeMaker()     // Catch: java.lang.Throwable -> Lbc
            r3 = r6
            com.sun.tools.javac.util.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lbc
            r9 = r0
            r0 = r9
            r1 = r8
            com.sun.tools.javac.tree.JCTree r1 = r1.copyAt()     // Catch: java.lang.Throwable -> Lbc
            com.sun.tools.javac.tree.JCTree r0 = r0.copy(r1)     // Catch: java.lang.Throwable -> Lbc
            r10 = r0
            r0 = r6
            com.sun.tools.javac.util.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> Lbc
            com.sun.tools.javac.util.Log r0 = com.sun.tools.javac.util.Log.instance(r0)     // Catch: java.lang.Throwable -> Lbc
            r11 = r0
            r0 = r11
            r1 = r6
            lombok.core.LombokNode r1 = r1.top()     // Catch: java.lang.Throwable -> Lbc
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lbc
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1     // Catch: java.lang.Throwable -> Lbc
            javax.tools.JavaFileObject r1 = r1.getSourceFile()     // Catch: java.lang.Throwable -> Lbc
            javax.tools.JavaFileObject r0 = r0.useSource(r1)     // Catch: java.lang.Throwable -> Lbc
            r12 = r0
            r0 = r5
            r1 = r10
            r2 = r8
            com.sun.tools.javac.comp.Env r2 = r2.get()     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Lbc
            r3 = r6
            com.sun.tools.javac.util.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Lbc
            r0.memberEnterAndAttribute(r1, r2, r3)     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Lbc
            r0 = r9
            java.util.Map r0 = r0.getOriginalToCopyMap()     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Lbc
            r14 = r0
            r0 = r11
            r1 = r12
            javax.tools.JavaFileObject r0 = r0.useSource(r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = r5
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.enableLoggers()
            r0 = r14
            return r0
        Laf:
            r13 = move-exception
            r0 = r11
            r1 = r12
            javax.tools.JavaFileObject r0 = r0.useSource(r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = r13
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r15 = move-exception
            r0 = r5
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.enableLoggers()
            r0 = r15
            throw r0
    }

    private static java.lang.reflect.Field getMemberEnterDotEnv() {
            java.lang.reflect.Field r0 = lombok.javac.JavacResolution.memberEnterDotEnv
            if (r0 == 0) goto La
            java.lang.reflect.Field r0 = lombok.javac.JavacResolution.memberEnterDotEnv
            return r0
        La:
            java.lang.Class<com.sun.tools.javac.comp.MemberEnter> r0 = com.sun.tools.javac.comp.MemberEnter.class
            java.lang.String r1 = "env"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L16
            r1 = r0
            lombok.javac.JavacResolution.memberEnterDotEnv = r1     // Catch: java.lang.NoSuchFieldException -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> getEnvOfMemberEnter(com.sun.tools.javac.comp.MemberEnter r3) {
            java.lang.reflect.Field r0 = getMemberEnterDotEnv()
            r4 = r0
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Ld
            com.sun.tools.javac.comp.Env r0 = (com.sun.tools.javac.comp.Env) r0     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    private static void setEnvOfMemberEnter(com.sun.tools.javac.comp.MemberEnter r4, com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r5) {
            java.lang.reflect.Field r0 = getMemberEnterDotEnv()
            r6 = r0
            r0 = r6
            r1 = r4
            r2 = r5
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            return
        Lf:
            return
    }

    private void memberEnterAndAttribute(com.sun.tools.javac.tree.JCTree r5, com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r6, com.sun.tools.javac.util.Context r7) {
            r4 = this;
            r0 = r7
            com.sun.tools.javac.comp.MemberEnter r0 = com.sun.tools.javac.comp.MemberEnter.instance(r0)
            r8 = r0
            r0 = r8
            com.sun.tools.javac.comp.Env r0 = getEnvOfMemberEnter(r0)
            r9 = r0
            r0 = r8
            r1 = r6
            setEnvOfMemberEnter(r0, r1)
            r0 = r5
            r1 = r8
            r0.accept(r1)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L30
            goto L3c
        L1c:
            r10 = move-exception
            java.lang.String r0 = "member enter failed."
            r1 = r10
            java.lang.Throwable r0 = lombok.core.debug.AssertionLogger.assertLog(r0, r1)     // Catch: java.lang.Throwable -> L30
            r0 = r8
            r1 = r9
            setEnvOfMemberEnter(r0, r1)
            goto L43
        L30:
            r11 = move-exception
            r0 = r8
            r1 = r9
            setEnvOfMemberEnter(r0, r1)
            r0 = r11
            throw r0
        L3c:
            r0 = r8
            r1 = r9
            setEnvOfMemberEnter(r0, r1)
        L43:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.attrib(r1, r2)
            return
    }

    public void resolveClassMember(lombok.javac.JavacNode r5) {
            r4 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            r7 = r0
            goto L20
        Ld:
            r0 = r6
            r1 = r7
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r0.push(r1)
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
        L20:
            r0 = r7
            if (r0 != 0) goto Ld
            r0 = r4
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.disableLoggers()
            lombok.javac.JavacResolution$EnvFinder r0 = new lombok.javac.JavacResolution$EnvFinder     // Catch: java.lang.Throwable -> L5e
            r1 = r0
            r2 = r5
            com.sun.tools.javac.util.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r7 = r0
            goto L45
        L3a:
            r0 = r6
            java.lang.Object r0 = r0.pop()     // Catch: java.lang.Throwable -> L5e
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0     // Catch: java.lang.Throwable -> L5e
            r1 = r7
            r0.accept(r1)     // Catch: java.lang.Throwable -> L5e
        L45:
            r0 = r6
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L3a
            r0 = r4
            r1 = r5
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L5e
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1     // Catch: java.lang.Throwable -> L5e
            r2 = r7
            com.sun.tools.javac.comp.Env r2 = r2.get()     // Catch: java.lang.Throwable -> L5e
            r0.attrib(r1, r2)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5e:
            r8 = move-exception
            r0 = r4
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.enableLoggers()
            r0 = r8
            throw r0
        L6a:
            r0 = r4
            lombok.javac.CompilerMessageSuppressor r0 = r0.messageSuppressor
            r0.enableLoggers()
            return
    }

    private void attrib(com.sun.tools.javac.tree.JCTree r5, com.sun.tools.javac.comp.Env<com.sun.tools.javac.comp.AttrContext> r6) {
            r4 = this;
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.enclClass     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L25
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.enclClass     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L25
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.enclClass     // Catch: java.lang.Throwable -> L3c
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = r1.enclClass     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Symbol$ClassSymbol r1 = r1.sym     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Type r1 = r1.type     // Catch: java.lang.Throwable -> L3c
            r0.type = r1     // Catch: java.lang.Throwable -> L3c
        L25:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.enclClass     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3d
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.enclClass     // Catch: java.lang.Throwable -> L3c
            com.sun.tools.javac.code.Type$JCNoType r1 = com.sun.tools.javac.code.Type.noType     // Catch: java.lang.Throwable -> L3c
            r0.type = r1     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
        L3d:
            r0 = 0
            r7 = r0
            r0 = r4
            com.sun.tools.javac.util.Context r0 = r0.context     // Catch: java.lang.Throwable -> L94
            java.util.Map r0 = lombok.javac.JavacResolution.ArgumentAttrReflect.enableTempCache(r0)     // Catch: java.lang.Throwable -> L94
            r7 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L5b
            r0 = r4
            com.sun.tools.javac.comp.Attr r0 = r0.attr     // Catch: java.lang.Throwable -> L94
            r1 = r5
            r2 = r6
            com.sun.tools.javac.code.Type r0 = r0.attribStat(r1, r2)     // Catch: java.lang.Throwable -> L94
            goto La1
        L5b:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L75
            r0 = r4
            com.sun.tools.javac.comp.Attr r0 = r0.attr     // Catch: java.lang.Throwable -> L94
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r1     // Catch: java.lang.Throwable -> L94
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = r1.body     // Catch: java.lang.Throwable -> L94
            r2 = r6
            com.sun.tools.javac.code.Type r0 = r0.attribStat(r1, r2)     // Catch: java.lang.Throwable -> L94
            goto La1
        L75:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L89
            r0 = r4
            com.sun.tools.javac.comp.Attr r0 = r0.attr     // Catch: java.lang.Throwable -> L94
            r1 = r5
            r2 = r6
            com.sun.tools.javac.code.Type r0 = r0.attribStat(r1, r2)     // Catch: java.lang.Throwable -> L94
            goto La1
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L94
            r1 = r0
            java.lang.String r2 = "Called with something that isn't a block, method decl, or variable decl"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L94
            throw r0     // Catch: java.lang.Throwable -> L94
        L94:
            r8 = move-exception
            r0 = r7
            r1 = r4
            com.sun.tools.javac.util.Context r1 = r1.context
            lombok.javac.JavacResolution.ArgumentAttrReflect.restoreCache(r0, r1)
            r0 = r8
            throw r0
        La1:
            r0 = r7
            r1 = r4
            com.sun.tools.javac.util.Context r1 = r1.context
            lombok.javac.JavacResolution.ArgumentAttrReflect.restoreCache(r0, r1)
            return
    }

    public static com.sun.tools.javac.code.Type ifTypeIsIterableToComponent(com.sun.tools.javac.code.Type r4, lombok.javac.JavacAST r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            com.sun.tools.javac.code.Types r0 = com.sun.tools.javac.code.Types.instance(r0)
            r6 = r0
            r0 = r5
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            com.sun.tools.javac.code.Symtab r0 = com.sun.tools.javac.code.Symtab.instance(r0)
            r7 = r0
            r0 = r6
            r1 = r4
            com.sun.tools.javac.code.Type r0 = lombok.javac.JavacResolution.ReflectiveAccess.Types_upperBound(r0, r1)
            r8 = r0
            r0 = r6
            r1 = r8
            com.sun.tools.javac.code.Type r0 = r0.elemtype(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r9
            return r0
        L2d:
            r0 = r6
            r1 = r8
            r2 = r7
            com.sun.tools.javac.code.Type r2 = r2.iterableType
            com.sun.tools.javac.code.Symbol$TypeSymbol r2 = r2.tsym
            com.sun.tools.javac.code.Type r0 = r0.asSuper(r1, r2)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L46
            r0 = r7
            com.sun.tools.javac.code.Type r0 = r0.objectType
            return r0
        L46:
            r0 = r10
            com.sun.tools.javac.util.List r0 = r0.allparams()
            r11 = r0
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            r0 = r7
            com.sun.tools.javac.code.Type r0 = r0.objectType
            goto L68
        L5c:
            r0 = r6
            r1 = r11
            java.lang.Object r1 = r1.head
            com.sun.tools.javac.code.Type r1 = (com.sun.tools.javac.code.Type) r1
            com.sun.tools.javac.code.Type r0 = lombok.javac.JavacResolution.ReflectiveAccess.Types_upperBound(r0, r1)
        L68:
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression typeToJCTree(com.sun.tools.javac.code.Type r6, lombok.javac.JavacAST r7, boolean r8) throws lombok.javac.JavacResolution.TypeNotConvertibleException {
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree(r0, r1, r2, r3, r4)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression createJavaLangObject(lombok.javac.JavacAST r5) {
            r0 = r5
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.String r2 = "java"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r7 = r0
            r0 = r6
            r1 = r7
            r2 = r5
            java.lang.String r3 = "lang"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            r2 = r5
            java.lang.String r3 = "Object"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r7 = r0
            r0 = r7
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression typeToJCTree(com.sun.tools.javac.code.Type r6, lombok.javac.JavacAST r7, boolean r8, boolean r9, boolean r10) throws lombok.javac.JavacResolution.TypeNotConvertibleException {
            r0 = 0
            r11 = r0
            r0 = r6
            r12 = r0
            goto L16
        L9:
            int r11 = r11 + 1
            r0 = r12
            com.sun.tools.javac.code.Type$ArrayType r0 = (com.sun.tools.javac.code.Type.ArrayType) r0
            com.sun.tools.javac.code.Type r0 = r0.elemtype
            r12 = r0
        L16:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ArrayType
            if (r0 != 0) goto L9
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree0(r0, r1, r2, r3, r4)
            r13 = r0
            goto L3b
        L2d:
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r13
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = r0.TypeArray(r1)
            r13 = r0
            int r11 = r11 + (-1)
        L3b:
            r0 = r11
            if (r0 > 0) goto L2d
            r0 = r13
            return r0
    }

    private static java.lang.Iterable<? extends com.sun.tools.javac.code.Type> concat(com.sun.tools.javac.code.Type r5, java.util.Collection<? extends com.sun.tools.javac.code.Type> r6) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = r6
            return r0
        L6:
            lombok.javac.JavacResolution$1 r0 = new lombok.javac.JavacResolution$1
            r1 = r0
            r2 = r6
            r3 = r5
            r1.<init>(r2, r3)
            return r0
    }

    private static int compare(com.sun.tools.javac.util.Name r3, com.sun.tools.javac.util.Name r4) {
            r0 = r3
            r1 = r4
            int r0 = r0.compareTo(r1)
            return r0
    }

    private static boolean isLocalType(com.sun.tools.javac.code.Symbol.TypeSymbol r4) {
            java.lang.reflect.Method r0 = lombok.javac.JavacResolution.isLocal     // Catch: java.lang.Exception -> L12
            r1 = r4
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L12
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> L12
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L12
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression typeToJCTree0(com.sun.tools.javac.code.Type r6, lombok.javac.JavacAST r7, boolean r8, boolean r9, boolean r10) throws lombok.javac.JavacResolution.TypeNotConvertibleException {
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOT
            r1 = r6
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createJavaLangObject(r0)
            return r0
        L18:
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_VOID
            r1 = r6
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            r0 = r9
            if (r0 == 0) goto L35
            r0 = r6
            javax.lang.model.type.TypeKind r0 = r0.getKind()
            r1 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = primitiveToJCTree(r0, r1)
            goto L39
        L35:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createJavaLangObject(r0)
        L39:
            return r0
        L3a:
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L4b
            r0 = r6
            javax.lang.model.type.TypeKind r0 = r0.getKind()
            r1 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = primitiveToJCTree(r0, r1)
            return r0
        L4b:
            r0 = r6
            boolean r0 = r0.isErroneous()
            if (r0 == 0) goto L5d
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            java.lang.String r2 = "Type cannot be resolved"
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r6
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.asElement()
            r12 = r0
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.getTypeArguments()
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r12
            if (r0 != 0) goto L7c
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            java.lang.String r2 = "Null or compound type"
            r1.<init>(r2)
            throw r0
        L7c:
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.name
            int r0 = r0.length()
            if (r0 != 0) goto L182
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType
            if (r0 == 0) goto L177
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r6
            com.sun.tools.javac.code.Type$ClassType r0 = (com.sun.tools.javac.code.Type.ClassType) r0
            com.sun.tools.javac.code.Type r0 = r0.supertype_field
            r17 = r0
            r0 = r6
            com.sun.tools.javac.code.Type$ClassType r0 = (com.sun.tools.javac.code.Type.ClassType) r0
            com.sun.tools.javac.util.List r0 = r0.interfaces_field
            r18 = r0
            r0 = r17
            r1 = r18
            java.lang.Iterable r0 = concat(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L158
        Lb7:
            r0 = r20
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
            r19 = r0
            r0 = 0
            r21 = r0
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ArrayType
            if (r0 == 0) goto Ld5
            r0 = 100
            r21 = r0
            goto L122
        Ld5:
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.TypeVar
            if (r0 == 0) goto Le4
            r0 = 20
            r21 = r0
            goto L122
        Le4:
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.WildcardType
            if (r0 == 0) goto Lf3
            r0 = 15
            r21 = r0
            goto L122
        Lf3:
            r0 = r19
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L102
            r0 = 10
            r21 = r0
            goto L122
        L102:
            r0 = r19
            boolean r0 = isObject(r0)
            if (r0 == 0) goto L110
            r0 = 1
            r21 = r0
            goto L122
        L110:
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType
            if (r0 == 0) goto L11f
            r0 = 50
            r21 = r0
            goto L122
        L11f:
            r0 = 5
            r21 = r0
        L122:
            r0 = r16
            r1 = r21
            if (r0 <= r1) goto L12c
            goto L158
        L12c:
            r0 = r16
            r1 = r21
            if (r0 >= r1) goto L13e
            r0 = r19
            r15 = r0
            r0 = r21
            r16 = r0
            goto L158
        L13e:
            r0 = r15
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym
            com.sun.tools.javac.util.Name r0 = r0.getQualifiedName()
            r1 = r19
            com.sun.tools.javac.code.Symbol$TypeSymbol r1 = r1.tsym
            com.sun.tools.javac.util.Name r1 = r1.getQualifiedName()
            int r0 = compare(r0, r1)
            if (r0 >= 0) goto L158
            r0 = r19
            r15 = r0
        L158:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb7
            r0 = r15
            if (r0 != 0) goto L16c
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createJavaLangObject(r0)
            return r0
        L16c:
            r0 = r15
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree(r0, r1, r2, r3, r4)
            return r0
        L177:
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            java.lang.String r2 = "Anonymous inner class"
            r1.<init>(r2)
            throw r0
        L182:
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.WildcardType
            if (r0 != 0) goto L190
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.CapturedType
            if (r0 == 0) goto L2f8
        L190:
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.WildcardType
            if (r0 == 0) goto L1ac
            r0 = r6
            com.sun.tools.javac.code.Type$WildcardType r0 = (com.sun.tools.javac.code.Type.WildcardType) r0
            com.sun.tools.javac.code.Type r0 = r0.getExtendsBound()
            r16 = r0
            r0 = r6
            com.sun.tools.javac.code.Type$WildcardType r0 = (com.sun.tools.javac.code.Type.WildcardType) r0
            com.sun.tools.javac.code.Type r0 = r0.getSuperBound()
            r15 = r0
            goto L211
        L1ac:
            r0 = r6
            com.sun.tools.javac.code.Type r0 = r0.getLowerBound()
            r15 = r0
            r0 = r6
            com.sun.tools.javac.code.Type r0 = r0.getUpperBound()
            r16 = r0
            r0 = r10
            if (r0 == 0) goto L211
            r0 = r6
            com.sun.tools.javac.code.Type$CapturedType r0 = (com.sun.tools.javac.code.Type.CapturedType) r0
            com.sun.tools.javac.code.Type$WildcardType r0 = r0.wildcard
            com.sun.tools.javac.code.BoundKind r0 = r0.kind
            r17 = r0
            r0 = r17
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.UNBOUND
            if (r0 != r1) goto L1e0
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L1e0:
            r0 = r17
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.EXTENDS
            if (r0 != r1) goto L1fa
            r0 = 0
            r15 = r0
            r0 = r6
            com.sun.tools.javac.code.Type$CapturedType r0 = (com.sun.tools.javac.code.Type.CapturedType) r0
            com.sun.tools.javac.code.Type$WildcardType r0 = r0.wildcard
            com.sun.tools.javac.code.Type r0 = r0.type
            r16 = r0
            goto L211
        L1fa:
            r0 = r17
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.SUPER
            if (r0 != r1) goto L211
            r0 = r6
            com.sun.tools.javac.code.Type$CapturedType r0 = (com.sun.tools.javac.code.Type.CapturedType) r0
            com.sun.tools.javac.code.Type$WildcardType r0 = r0.wildcard
            com.sun.tools.javac.code.Type r0 = r0.type
            r15 = r0
            r0 = 0
            r16 = r0
        L211:
            r0 = r8
            if (r0 == 0) goto L2c9
            r0 = r15
            if (r0 == 0) goto L228
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_BOT
            r1 = r15
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L297
        L228:
            r0 = r16
            if (r0 == 0) goto L23b
            r0 = r16
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24a
        L23b:
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L24a:
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.getTypeArguments()
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L265
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L265:
            r0 = r16
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree(r0, r1, r2, r3, r4)
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCWildcard
            if (r0 == 0) goto L287
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L287:
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.EXTENDS
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = r17
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L297:
            r0 = r15
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree(r0, r1, r2, r3, r4)
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCWildcard
            if (r0 == 0) goto L2b9
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L2b9:
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.SUPER
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = r17
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L2c9:
            r0 = r16
            if (r0 == 0) goto L2f3
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.getTypeArguments()
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2e9
            r0 = r11
            r1 = r11
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L2e9:
            r0 = r16
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree(r0, r1, r2, r3, r4)
            return r0
        L2f3:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createJavaLangObject(r0)
            return r0
        L2f8:
            r0 = r12
            boolean r0 = isLocalType(r0)
            if (r0 == 0) goto L30d
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.getSimpleName()
            java.lang.String r0 = r0.toString()
            r15 = r0
            goto L35b
        L30d:
            r0 = r12
            com.sun.tools.javac.code.Type r0 = r0.type
            if (r0 == 0) goto L351
            r0 = r12
            com.sun.tools.javac.code.Type r0 = r0.type
            com.sun.tools.javac.code.Type r0 = r0.getEnclosingType()
            if (r0 == 0) goto L351
            r0 = r12
            com.sun.tools.javac.code.Type r0 = r0.type
            com.sun.tools.javac.code.Type r0 = r0.getEnclosingType()
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            java.lang.String r1 = "CLASS"
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L351
            r0 = r6
            com.sun.tools.javac.code.Type r0 = r0.getEnclosingType()
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = typeToJCTree0(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.getSimpleName()
            java.lang.String r0 = r0.toString()
            r15 = r0
            goto L35b
        L351:
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.getQualifiedName()
            java.lang.String r0 = r0.toString()
            r15 = r0
        L35b:
            r0 = r15
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36e
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            java.lang.String r2 = "unknown type"
            r1.<init>(r2)
            throw r0
        L36e:
            r0 = r15
            java.lang.String r1 = "<"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L383
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L383:
            r0 = r15
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r14
            if (r0 != 0) goto L3bf
            r0 = r11
            r1 = r7
            r2 = r16
            r3 = 0
            r2 = r2[r3]
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r14 = r0
            r0 = 1
            r17 = r0
            goto L3bf
        L3aa:
            r0 = r11
            r1 = r14
            r2 = r7
            r3 = r16
            r4 = r17
            r3 = r3[r4]
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r14 = r0
            int r17 = r17 + 1
        L3bf:
            r0 = r17
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto L3aa
            r0 = r13
            r1 = r7
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = genericsToJCTreeNodes(r0, r1, r2)
            return r0
    }

    private static boolean isObject(com.sun.tools.javac.code.Type r3) {
            r0 = r3
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression genericsToJCTreeNodes(com.sun.tools.javac.util.List<com.sun.tools.javac.code.Type> r7, lombok.javac.JavacAST r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) throws lombok.javac.JavacResolution.TypeNotConvertibleException {
            r0 = r7
            if (r0 == 0) goto L4d
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L36
        L1c:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = 1
            r4 = 0
            r5 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = typeToJCTree(r1, r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L36:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r9
            r2 = r10
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            return r0
        L4d:
            r0 = r9
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression primitiveToJCTree(javax.lang.model.type.TypeKind r4, lombok.javac.JavacTreeMaker r5) throws lombok.javac.JavacResolution.TypeNotConvertibleException {
            int[] r0 = $SWITCH_TABLE$javax$lang$model$type$TypeKind()
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L9c;
                case 2: goto L64;
                case 3: goto L74;
                case 4: goto L7c;
                case 5: goto L84;
                case 6: goto L6c;
                case 7: goto L8c;
                case 8: goto L94;
                case 9: goto La4;
                case 10: goto Lac;
                case 11: goto Lac;
                case 12: goto Lac;
                case 13: goto Lac;
                case 14: goto Lac;
                case 15: goto Lac;
                case 16: goto Lac;
                case 17: goto Lac;
                case 18: goto Lac;
                case 19: goto Lac;
                default: goto Lac;
            }
        L64:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BYTE
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L6c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_CHAR
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L74:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_SHORT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L7c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L84:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_LONG
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L8c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_FLOAT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L94:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_DOUBLE
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L9c:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        La4:
            r0 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_VOID
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        Lac:
            lombok.javac.JavacResolution$TypeNotConvertibleException r0 = new lombok.javac.JavacResolution$TypeNotConvertibleException
            r1 = r0
            java.lang.String r2 = "Nulltype"
            r1.<init>(r2)
            throw r0
    }

    public static boolean platformHasTargetTyping() {
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            r1 = 8
            if (r0 < r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$javax$lang$model$type$TypeKind() {
            int[] r0 = lombok.javac.JavacResolution.$SWITCH_TABLE$javax$lang$model$type$TypeKind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            javax.lang.model.type.TypeKind[] r0 = javax.lang.model.type.TypeKind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ARRAY     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 12
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L2a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a
            goto L2b
        L2a:
        L2b:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.BYTE     // Catch: java.lang.NoSuchFieldError -> L37
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37
            goto L38
        L37:
        L38:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.CHAR     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DECLARED     // Catch: java.lang.NoSuchFieldError -> L53
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
            r2 = 13
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
            goto L54
        L53:
        L54:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L61
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            goto L62
        L61:
        L62:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.ERROR     // Catch: java.lang.NoSuchFieldError -> L6f
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
            r2 = 14
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6f
            goto L70
        L6f:
        L70:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.EXECUTABLE     // Catch: java.lang.NoSuchFieldError -> L7d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
            r2 = 18
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            goto L7e
        L7d:
        L7e:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.FLOAT     // Catch: java.lang.NoSuchFieldError -> L8b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            goto L8c
        L8b:
        L8c:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.INT     // Catch: java.lang.NoSuchFieldError -> L98
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L98
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L98
            goto L99
        L98:
        L99:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.LONG     // Catch: java.lang.NoSuchFieldError -> La5
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            goto La6
        La5:
        La6:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NONE     // Catch: java.lang.NoSuchFieldError -> Lb3
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb3
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb3
            goto Lb4
        Lb3:
        Lb4:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.NULL     // Catch: java.lang.NoSuchFieldError -> Lc1
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
            r2 = 11
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            goto Lc2
        Lc1:
        Lc2:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.OTHER     // Catch: java.lang.NoSuchFieldError -> Lcf
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcf
            r2 = 19
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcf
            goto Ld0
        Lcf:
        Ld0:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.PACKAGE     // Catch: java.lang.NoSuchFieldError -> Ldd
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldd
            r2 = 17
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldd
            goto Lde
        Ldd:
        Lde:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.SHORT     // Catch: java.lang.NoSuchFieldError -> Lea
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lea
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lea
            goto Leb
        Lea:
        Leb:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.TYPEVAR     // Catch: java.lang.NoSuchFieldError -> Lf8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf8
            r2 = 15
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID     // Catch: java.lang.NoSuchFieldError -> L106
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L106
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L106
            goto L107
        L106:
        L107:
            r0 = r4
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.WILDCARD     // Catch: java.lang.NoSuchFieldError -> L114
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
            r2 = 16
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            goto L115
        L114:
        L115:
            r0 = r4
            r1 = r0
            lombok.javac.JavacResolution.$SWITCH_TABLE$javax$lang$model$type$TypeKind = r1
            return r0
    }
}
