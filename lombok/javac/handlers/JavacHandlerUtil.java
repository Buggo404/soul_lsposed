package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil.SCL.lombok */
public class JavacHandlerUtil {
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$AccessLevel;
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static /* synthetic */ int[] $SWITCH_TABLE$com$sun$source$tree$Tree$Kind;




    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$ClassSymbolMembersField.SCL.lombok */
    static class ClassSymbolMembersField {
        private static final java.lang.reflect.Field membersField = null;
        private static final java.lang.reflect.Method removeMethod = null;
        private static final java.lang.reflect.Method enterMethod = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                java.lang.Class<com.sun.tools.javac.code.Symbol$ClassSymbol> r0 = com.sun.tools.javac.code.Symbol.ClassSymbol.class
                java.lang.String r1 = "members_field"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L37
                r7 = r0
                r0 = r7
                java.lang.Class r0 = r0.getType()     // Catch: java.lang.Exception -> L37
                java.lang.String r1 = "remove"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L37
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.code.Symbol> r5 = com.sun.tools.javac.code.Symbol.class
                r3[r4] = r5     // Catch: java.lang.Exception -> L37
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L37
                r8 = r0
                r0 = r7
                java.lang.Class r0 = r0.getType()     // Catch: java.lang.Exception -> L37
                java.lang.String r1 = "enter"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L37
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.code.Symbol> r5 = com.sun.tools.javac.code.Symbol.class
                r3[r4] = r5     // Catch: java.lang.Exception -> L37
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L37
                r9 = r0
                goto L38
            L37:
            L38:
                r0 = r7
                lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.membersField = r0
                r0 = r8
                lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.removeMethod = r0
                r0 = r9
                lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.enterMethod = r0
                return
        }

        ClassSymbolMembersField() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static void remove(com.sun.tools.javac.code.Symbol.ClassSymbol r7, com.sun.tools.javac.code.Symbol r8) {
                r0 = r7
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.membersField     // Catch: java.lang.Exception -> L28
                r1 = r7
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L28
                com.sun.tools.javac.code.Scope r0 = (com.sun.tools.javac.code.Scope) r0     // Catch: java.lang.Exception -> L28
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L15
                return
            L15:
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.removeMethod     // Catch: java.lang.Exception -> L28
                r1 = r9
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
                r3 = r2
                r4 = 0
                r5 = r8
                r3[r4] = r5     // Catch: java.lang.Exception -> L28
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> L28
                goto L29
            L28:
            L29:
                return
        }

        static void enter(com.sun.tools.javac.code.Symbol.ClassSymbol r7, com.sun.tools.javac.code.Symbol r8) {
                r0 = r7
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.membersField     // Catch: java.lang.Exception -> L28
                r1 = r7
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L28
                com.sun.tools.javac.code.Scope r0 = (com.sun.tools.javac.code.Scope) r0     // Catch: java.lang.Exception -> L28
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L15
                return
            L15:
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.enterMethod     // Catch: java.lang.Exception -> L28
                r1 = r9
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
                r3 = r2
                r4 = 0
                r5 = r8
                r3[r4] = r5     // Catch: java.lang.Exception -> L28
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> L28
                goto L29
            L28:
            L29:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$CopyJavadoc.SCL.lombok */
    public enum CopyJavadoc extends java.lang.Enum<lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc> {
        public static final lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc VERBATIM = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc GETTER = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc SETTER = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc WITH = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc WITH_BY = null;
        private static final /* synthetic */ lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc[] ENUM$VALUES = null;







        static {
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$1 r0 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$1
                r1 = r0
                java.lang.String r2 = "VERBATIM"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.VERBATIM = r0
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$2 r0 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$2
                r1 = r0
                java.lang.String r2 = "GETTER"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.GETTER = r0
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$3 r0 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$3
                r1 = r0
                java.lang.String r2 = "SETTER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.SETTER = r0
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$4 r0 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$4
                r1 = r0
                java.lang.String r2 = "WITH"
                r3 = 3
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH = r0
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$5 r0 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$5
                r1 = r0
                java.lang.String r2 = "WITH_BY"
                r3 = 4
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH_BY = r0
                r0 = 5
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc[] r0 = new lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc[r0]
                r1 = r0
                r2 = 0
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r3 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.VERBATIM
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r3 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.GETTER
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r3 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.SETTER
                r1[r2] = r3
                r1 = r0
                r2 = 3
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r3 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH
                r1[r2] = r3
                r1 = r0
                r2 = 4
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r3 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.WITH_BY
                r1[r2] = r3
                lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.ENUM$VALUES = r0
                return
        }

        CopyJavadoc(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public abstract java.lang.String apply(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r1, lombok.javac.JavacNode r2);

        private static java.lang.String applySetter(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r9, lombok.javac.JavacNode r10, java.lang.String r11) {
                r0 = r10
                java.lang.Object r0 = r0.get()
                com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
                r12 = r0
                r0 = r9
                r1 = r12
                java.lang.String r0 = lombok.javac.Javac.getDocComment(r0, r1)
                r13 = r0
                r0 = r13
                r1 = r11
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.getJavadocSection(r0, r1)
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L20
                r0 = 1
                goto L21
            L20:
                r0 = 0
            L21:
                r15 = r0
                r0 = r15
                if (r0 != 0) goto L35
                r0 = r13
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.stripSectionsFromJavadoc(r0)
                lombok.core.handlers.HandlerUtil$JavadocTag r1 = lombok.core.handlers.HandlerUtil.JavadocTag.RETURN
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.stripLinesWithTagFromJavadoc(r0, r1)
                r14 = r0
            L35:
                r0 = r10
                lombok.javac.JavacAST r0 = r0.getAst()
                java.lang.String r1 = "javadocfilter-setter"
                r2 = r12
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$6 r3 = new lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc$6
                r4 = r3
                r5 = r9
                r6 = r12
                r7 = r15
                r4.<init>(r5, r6, r7)
                r0.cleanupTask(r1, r2, r3)
                r0 = r10
                r1 = r10
                lombok.core.AnnotationValues r1 = lombok.javac.handlers.JavacHandlerUtil.getAccessorsForField(r1)
                boolean r0 = lombok.javac.handlers.JavacHandlerUtil.shouldReturnThis(r0, r1)
                if (r0 == 0) goto L5d
                r0 = r14
                java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)
                goto L5f
            L5d:
                r0 = r14
            L5f:
                return r0
        }

        public static lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc[] values() {
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc[] r0 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc[] r2 = new lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc> r0 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r0 = (lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc) r0
                return r0
        }

        /* synthetic */ CopyJavadoc(java.lang.String r5, int r6, lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ java.lang.String access$3(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r4, lombok.javac.JavacNode r5, java.lang.String r6) {
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.String r0 = applySetter(r0, r1, r2)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$EnterReflect.SCL.lombok */
    static class EnterReflect {
        private static final java.lang.reflect.Method classEnter = null;
        private static final java.lang.reflect.Method memberEnter = null;
        private static final java.lang.reflect.Method blockAnnotations = null;
        private static final java.lang.reflect.Method unblockAnnotations = null;

        static {
                java.lang.Class<com.sun.tools.javac.comp.Enter> r0 = com.sun.tools.javac.comp.Enter.class
                java.lang.String r1 = "classEnter"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<com.sun.tools.javac.comp.Env> r5 = com.sun.tools.javac.comp.Env.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                lombok.javac.handlers.JavacHandlerUtil.EnterReflect.classEnter = r0
                java.lang.Class<com.sun.tools.javac.comp.MemberEnter> r0 = com.sun.tools.javac.comp.MemberEnter.class
                java.lang.String r1 = "memberEnter"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<com.sun.tools.javac.comp.Env> r5 = com.sun.tools.javac.comp.Env.class
                r3[r4] = r5
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                lombok.javac.handlers.JavacHandlerUtil.EnterReflect.memberEnter = r0
                java.lang.Class<com.sun.tools.javac.comp.Annotate> r0 = com.sun.tools.javac.comp.Annotate.class
                java.lang.String r1 = "blockAnnotations"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L4c
                java.lang.Class<com.sun.tools.javac.comp.Annotate> r0 = com.sun.tools.javac.comp.Annotate.class
                java.lang.String r1 = "enterStart"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                r7 = r0
            L4c:
                r0 = r7
                lombok.javac.handlers.JavacHandlerUtil.EnterReflect.blockAnnotations = r0
                java.lang.Class<com.sun.tools.javac.comp.Annotate> r0 = com.sun.tools.javac.comp.Annotate.class
                java.lang.String r1 = "unblockAnnotations"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L6c
                java.lang.Class<com.sun.tools.javac.comp.Annotate> r0 = com.sun.tools.javac.comp.Annotate.class
                java.lang.String r1 = "enterDone"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.reflect.Method r0 = lombok.permit.Permit.permissiveGetMethod(r0, r1, r2)
                r8 = r0
            L6c:
                r0 = r8
                lombok.javac.handlers.JavacHandlerUtil.EnterReflect.unblockAnnotations = r0
                return
        }

        EnterReflect() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static com.sun.tools.javac.code.Type classEnter(com.sun.tools.javac.tree.JCTree r7, lombok.javac.JavacNode r8) {
                r0 = r8
                com.sun.tools.javac.util.Context r0 = r0.getContext()
                com.sun.tools.javac.comp.Enter r0 = com.sun.tools.javac.comp.Enter.instance(r0)
                r9 = r0
                r0 = r9
                r1 = r8
                javax.lang.model.element.Element r1 = r1.getElement()
                com.sun.tools.javac.code.Symbol$TypeSymbol r1 = (com.sun.tools.javac.code.Symbol.TypeSymbol) r1
                com.sun.tools.javac.comp.Env r0 = r0.getEnv(r1)
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L1a
                r0 = 0
                return r0
            L1a:
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.EnterReflect.classEnter
                r1 = r9
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r10
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
                r11 = r0
                r0 = r11
                if (r0 != 0) goto L39
                r0 = 0
                return r0
            L39:
                r0 = r11
                r0.complete()
                r0 = r11
                return r0
        }

        static void memberEnter(com.sun.tools.javac.tree.JCTree r7, lombok.javac.JavacNode r8) {
                r0 = r8
                com.sun.tools.javac.util.Context r0 = r0.getContext()
                r9 = r0
                r0 = r9
                com.sun.tools.javac.comp.MemberEnter r0 = com.sun.tools.javac.comp.MemberEnter.instance(r0)
                r10 = r0
                r0 = r9
                com.sun.tools.javac.comp.Annotate r0 = com.sun.tools.javac.comp.Annotate.instance(r0)
                r11 = r0
                r0 = r9
                com.sun.tools.javac.comp.Enter r0 = com.sun.tools.javac.comp.Enter.instance(r0)
                r12 = r0
                r0 = r12
                r1 = r8
                javax.lang.model.element.Element r1 = r1.getElement()
                com.sun.tools.javac.code.Symbol$TypeSymbol r1 = (com.sun.tools.javac.code.Symbol.TypeSymbol) r1
                com.sun.tools.javac.comp.Env r0 = r0.getEnv(r1)
                r13 = r0
                r0 = r13
                if (r0 != 0) goto L2a
                return
            L2a:
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.EnterReflect.blockAnnotations
                r1 = r11
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.EnterReflect.memberEnter
                r1 = r10
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r7
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                java.lang.reflect.Method r0 = lombok.javac.handlers.JavacHandlerUtil.EnterReflect.unblockAnnotations
                r1 = r11
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$GetterMethod.SCL.lombok */
    private static class GetterMethod {
        private final com.sun.tools.javac.util.Name name;
        private final com.sun.tools.javac.tree.JCTree.JCExpression type;

        GetterMethod(com.sun.tools.javac.util.Name r4, com.sun.tools.javac.tree.JCTree.JCExpression r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.type = r1
                return
        }

        static /* synthetic */ com.sun.tools.javac.tree.JCTree.JCExpression access$0(lombok.javac.handlers.JavacHandlerUtil.GetterMethod r2) {
                r0 = r2
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.type
                return r0
        }

        static /* synthetic */ com.sun.tools.javac.util.Name access$1(lombok.javac.handlers.JavacHandlerUtil.GetterMethod r2) {
                r0 = r2
                com.sun.tools.javac.util.Name r0 = r0.name
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$JCAnnotatedTypeReflect.SCL.lombok */
    static class JCAnnotatedTypeReflect {
        private static java.lang.Class<?> TYPE;
        private static java.lang.reflect.Constructor<?> CONSTRUCTOR;
        private static java.lang.reflect.Field ANNOTATIONS;
        private static java.lang.reflect.Field UNDERLYING_TYPE;

        JCAnnotatedTypeReflect() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private static void initByLoader(java.lang.ClassLoader r3) {
                java.lang.Class<?> r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.TYPE
                if (r0 == 0) goto L7
                return
            L7:
                r0 = r3
                java.lang.String r1 = "com.sun.tools.javac.tree.JCTree$JCAnnotatedType"
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L11
                r4 = r0
                goto L13
            L11:
                return
            L13:
                r0 = r4
                init(r0)
                return
        }

        private static void init(java.lang.Class<?> r6) {
                java.lang.Class<?> r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.TYPE
                if (r0 == 0) goto L7
                return
            L7:
                r0 = r6
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "com.sun.tools.javac.tree.JCTree$JCAnnotatedType"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L14
                return
            L14:
                r0 = r6
                r1 = 2
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L42
                r2 = r1
                r3 = 0
                java.lang.Class<com.sun.tools.javac.util.List> r4 = com.sun.tools.javac.util.List.class
                r2[r3] = r4     // Catch: java.lang.Exception -> L42
                r2 = r1
                r3 = 1
                java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r4 = com.sun.tools.javac.tree.JCTree.JCExpression.class
                r2[r3] = r4     // Catch: java.lang.Exception -> L42
                java.lang.reflect.Constructor r0 = lombok.permit.Permit.getConstructor(r0, r1)     // Catch: java.lang.Exception -> L42
                lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.CONSTRUCTOR = r0     // Catch: java.lang.Exception -> L42
                r0 = r6
                java.lang.String r1 = "annotations"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L42
                lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.ANNOTATIONS = r0     // Catch: java.lang.Exception -> L42
                r0 = r6
                java.lang.String r1 = "underlyingType"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Exception -> L42
                lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.UNDERLYING_TYPE = r0     // Catch: java.lang.Exception -> L42
                r0 = r6
                lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.TYPE = r0     // Catch: java.lang.Exception -> L42
                goto L43
            L42:
            L43:
                return
        }

        /* renamed from: is */
        static boolean m92is(com.sun.tools.javac.tree.JCTree r3) {
                r0 = r3
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                init(r0)
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                java.lang.Class<?> r1 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.TYPE
                if (r0 != r1) goto L19
                r0 = 1
                return r0
            L19:
                r0 = 0
                return r0
        }

        static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> getAnnotations(com.sun.tools.javac.tree.JCTree r3) {
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                init(r0)
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.ANNOTATIONS     // Catch: java.lang.Exception -> L12
                r1 = r3
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L12
                com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0     // Catch: java.lang.Exception -> L12
                return r0
            L12:
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
                return r0
        }

        static void setAnnotations(com.sun.tools.javac.tree.JCTree r4, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r5) {
                r0 = r4
                java.lang.Class r0 = r0.getClass()
                init(r0)
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.ANNOTATIONS     // Catch: java.lang.Exception -> L12
                r1 = r4
                r2 = r5
                r0.set(r1, r2)     // Catch: java.lang.Exception -> L12
                goto L13
            L12:
            L13:
                return
        }

        static com.sun.tools.javac.tree.JCTree.JCExpression getUnderlyingType(com.sun.tools.javac.tree.JCTree r3) {
                r0 = r3
                java.lang.Class r0 = r0.getClass()
                init(r0)
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.UNDERLYING_TYPE     // Catch: java.lang.Exception -> L12
                r1 = r3
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L12
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.Exception -> L12
                return r0
            L12:
                r0 = 0
                return r0
        }

        static com.sun.tools.javac.tree.JCTree.JCExpression create(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r6, com.sun.tools.javac.tree.JCTree.JCExpression r7) {
                r0 = r7
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                initByLoader(r0)
                java.lang.reflect.Constructor<?> r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.CONSTRUCTOR     // Catch: java.lang.Exception -> L20
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L20
                r2 = r1
                r3 = 0
                r4 = r6
                r2[r3] = r4     // Catch: java.lang.Exception -> L20
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4     // Catch: java.lang.Exception -> L20
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L20
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.Exception -> L20
                return r0
            L20:
                r0 = r7
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$JCAnnotationReflect.SCL.lombok */
    static class JCAnnotationReflect {
        private static final java.lang.reflect.Field ATTRIBUTE = null;

        static {
                java.lang.Class<com.sun.tools.javac.tree.JCTree$JCAnnotation> r0 = com.sun.tools.javac.tree.JCTree.JCAnnotation.class
                java.lang.String r1 = "attribute"
                java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
                lombok.javac.handlers.JavacHandlerUtil.JCAnnotationReflect.ATTRIBUTE = r0
                return
        }

        JCAnnotationReflect() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static com.sun.tools.javac.code.Attribute.Compound getAttribute(com.sun.tools.javac.tree.JCTree.JCAnnotation r3) {
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotationReflect.ATTRIBUTE
                if (r0 == 0) goto L12
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotationReflect.ATTRIBUTE     // Catch: java.lang.Exception -> L11
                r1 = r3
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L11
                com.sun.tools.javac.code.Attribute$Compound r0 = (com.sun.tools.javac.code.Attribute.Compound) r0     // Catch: java.lang.Exception -> L11
                return r0
            L11:
            L12:
                r0 = 0
                return r0
        }

        static void setAttribute(com.sun.tools.javac.tree.JCTree.JCAnnotation r4, com.sun.tools.javac.code.Attribute.Compound r5) {
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotationReflect.ATTRIBUTE
                if (r0 == 0) goto L12
                java.lang.reflect.Field r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotationReflect.ATTRIBUTE     // Catch: java.lang.Exception -> L11
                r1 = r4
                r2 = r5
                lombok.permit.Permit.set(r0, r1, r2)     // Catch: java.lang.Exception -> L11
                goto L12
            L11:
            L12:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$MarkingScanner.SCL.lombok */
    private static class MarkingScanner extends com.sun.tools.javac.tree.TreeScanner {
        private final lombok.javac.JavacNode source;

        MarkingScanner(lombok.javac.JavacNode r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.source = r1
                return
        }

        public void scan(com.sun.tools.javac.tree.JCTree r4) {
                r3 = this;
                r0 = r4
                if (r0 != 0) goto L5
                return
            L5:
                r0 = r4
                r1 = r3
                lombok.javac.JavacNode r1 = r1.source
                com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r0, r1)
                r0 = r3
                r1 = r4
                super.scan(r1)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacHandlerUtil$MemberExistsResult.SCL.lombok */
    public enum MemberExistsResult extends java.lang.Enum<lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult> {
        public static final lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult NOT_EXISTS = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult EXISTS_BY_LOMBOK = null;
        public static final lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult EXISTS_BY_USER = null;
        private static final /* synthetic */ lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult[] ENUM$VALUES = null;

        static {
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = new lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "NOT_EXISTS"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS = r0
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = new lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "EXISTS_BY_LOMBOK"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK = r0
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = new lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult
                r1 = r0
                java.lang.String r2 = "EXISTS_BY_USER"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER = r0
                r0 = 3
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r0 = new lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult[r0]
                r1 = r0
                r2 = 0
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r3 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r3 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r3 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
                r1[r2] = r3
                lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.ENUM$VALUES = r0
                return
        }

        MemberExistsResult(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult[] values() {
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r2 = new lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult> r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = (lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult) r0
                return r0
        }
    }

    static {
            java.lang.Class<lombok.javac.handlers.JavacHandlerUtil> r0 = lombok.javac.handlers.JavacHandlerUtil.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            lombok.javac.handlers.JavacHandlerUtil.$assertionsDisabled = r0
            return
    }

    private JavacHandlerUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean inNetbeansEditor(lombok.javac.JavacNode r2) {
            r0 = r2
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            boolean r0 = inNetbeansEditor(r0)
            return r0
    }

    public static boolean inNetbeansEditor(com.sun.tools.javac.util.Context r3) {
            r0 = r3
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r4 = r0
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.lang.String r1 = "ide"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L23
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.lang.String r1 = "backgroundCompilation"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L23
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }

    public static boolean inNetbeansCompileOnSave(com.sun.tools.javac.util.Context r3) {
            r0 = r3
            com.sun.tools.javac.util.Options r0 = com.sun.tools.javac.util.Options.instance(r0)
            r4 = r0
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.lang.String r1 = "ide"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L23
            r0 = r4
            java.util.Set r0 = r0.keySet()
            java.lang.String r1 = "backgroundCompilation"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L23
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree getGeneratedBy(com.sun.tools.javac.tree.JCTree r3) {
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r0 = lombok.javac.JavacAugments.JCTree_generatedNode
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
    }

    public static boolean isGenerated(com.sun.tools.javac.tree.JCTree r2) {
            r0 = r2
            com.sun.tools.javac.tree.JCTree r0 = getGeneratedBy(r0)
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static <T extends com.sun.tools.javac.tree.JCTree> T recursiveSetGeneratedBy(T r5, lombok.javac.JavacNode r6) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree r0 = setGeneratedBy(r0, r1)
            r0 = r5
            lombok.javac.handlers.JavacHandlerUtil$MarkingScanner r1 = new lombok.javac.handlers.JavacHandlerUtil$MarkingScanner
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.accept(r1)
            r0 = r5
            return r0
    }

    public static <T extends com.sun.tools.javac.tree.JCTree> T setGeneratedBy(T r4, lombok.javac.JavacNode r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            if (r0 != 0) goto L14
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r0 = lombok.javac.JavacAugments.JCTree_generatedNode
            r1 = r4
            java.lang.Object r0 = r0.clear(r1)
            r0 = r4
            return r0
        L14:
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r0 = lombok.javac.JavacAugments.JCTree_generatedNode
            r1 = r4
            r2 = r5
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r0.set(r1, r2)
            r0 = r5
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            boolean r0 = inNetbeansEditor(r0)
            if (r0 == 0) goto L33
            r0 = r4
            boolean r0 = isParameter(r0)
            if (r0 == 0) goto L50
        L33:
            r0 = r4
            r1 = r5
            int r1 = r1.getStartPos()
            r0.pos = r1
            r0 = r4
            r1 = r5
            int r1 = r1.getEndPosition()
            r2 = r5
            lombok.core.LombokNode r2 = r2.top()
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r2 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r2
            lombok.javac.Javac.storeEnd(r0, r1, r2)
        L50:
            r0 = r4
            return r0
    }

    public static boolean isParameter(com.sun.tools.javac.tree.JCTree r5) {
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L1c
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public static boolean hasAnnotation(java.lang.String r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            boolean r0 = hasAnnotation(r0, r1, r2)
            return r0
    }

    public static boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            boolean r0 = hasAnnotation(r0, r1, r2)
            return r0
    }

    public static boolean hasAnnotationAndDeleteIfNeccessary(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            r2 = 1
            boolean r0 = hasAnnotation(r0, r1, r2)
            return r0
    }

    private static boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r3, lombok.javac.JavacNode r4, boolean r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L74;
                case 5: goto L40;
                case 6: goto L74;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L74;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L6a
        L4c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r3
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L6a
            r0 = r5
            if (r0 == 0) goto L68
            r0 = r6
            r1 = r3
            deleteAnnotationIfNeccessary(r0, r1)
        L68:
            r0 = 1
            return r0
        L6a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
        L74:
            r0 = 0
            return r0
    }

    private static boolean hasAnnotation(java.lang.String r3, lombok.javac.JavacNode r4, boolean r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L74;
                case 5: goto L40;
                case 6: goto L74;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L74;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L6a
        L4c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r3
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L6a
            r0 = r5
            if (r0 == 0) goto L68
            r0 = r6
            r1 = r3
            deleteAnnotationIfNeccessary(r0, r1)
        L68:
            r0 = 1
            return r0
        L6a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
        L74:
            r0 = 0
            return r0
    }

    public static lombok.javac.JavacNode findInnerClass(lombok.javac.JavacNode r3, java.lang.String r4) {
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L39
        Lb:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L22
            goto L39
        L22:
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r4
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L39
            r0 = r5
            return r0
        L39:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
    }

    public static lombok.javac.JavacNode findAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            lombok.javac.JavacNode r0 = findAnnotation(r0, r1, r2)
            return r0
    }

    public static lombok.javac.JavacNode findAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r3, lombok.javac.JavacNode r4, boolean r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r4
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L40;
                case 3: goto L40;
                case 4: goto L74;
                case 5: goto L40;
                case 6: goto L74;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L74;
            }
        L40:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L6a
        L4c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r3
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L6a
            r0 = r5
            if (r0 == 0) goto L68
            r0 = r6
            r1 = r3
            deleteAnnotationIfNeccessary(r0, r1)
        L68:
            r0 = r6
            return r0
        L6a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
        L74:
            r0 = 0
            return r0
    }

    public static boolean annotationTypeMatches(java.lang.Class<? extends java.lang.annotation.Annotation> r4, lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            r1 = r5
            r2 = r5
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static boolean annotationTypeMatches(java.lang.String r4, lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r4
            r1 = r5
            r2 = r5
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static boolean typeMatches(java.lang.Class<?> r4, lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree r6) {
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = r5
            r2 = r6
            boolean r0 = typeMatches(r0, r1, r2)
            return r0
    }

    public static boolean typeMatches(java.lang.String r5, lombok.javac.JavacNode r6, com.sun.tools.javac.tree.JCTree r7) {
            r0 = r7
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r7
            java.lang.String r0 = r0.toString()
        Lc:
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L18
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L1a
        L18:
            r0 = 0
            return r0
        L1a:
            r0 = r8
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r1 = r5
            r2 = 36
            int r1 = r1.lastIndexOf(r2)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r8
            int r0 = r0.length()
            r1 = r9
            int r0 = r0 - r1
            r11 = r0
            r0 = r11
            r1 = r5
            int r1 = r1.length()
            r2 = r10
            int r1 = r1 - r2
            if (r0 == r1) goto L4e
            r0 = 0
            return r0
        L4e:
            r0 = 0
            r12 = r0
            goto L6e
        L54:
            r0 = r8
            r1 = r12
            r2 = r9
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r12
            r3 = r10
            int r2 = r2 + r3
            char r1 = r1.charAt(r2)
            if (r0 == r1) goto L6b
            r0 = 0
            return r0
        L6b:
            int r12 = r12 + 1
        L6e:
            r0 = r12
            r1 = r11
            if (r0 < r1) goto L54
            r0 = r6
            lombok.core.TypeResolver r0 = r0.getImportListAsTypeResolver()
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r5
            r3 = r8
            boolean r0 = r0.typeMatches(r1, r2, r3)
            return r0
    }

    public static boolean isFieldDeprecated(lombok.javac.JavacNode r5) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L47
        L31:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            r1 = r7
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L47
            r0 = 1
            return r0
        L47:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L31
            r0 = 0
            return r0
    }

    public static lombok.core.configuration.CheckerFrameworkVersion getCheckerFrameworkVersion(lombok.javac.JavacNode r3) {
            r0 = r3
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.CheckerFrameworkVersion> r1 = lombok.ConfigurationKeys.CHECKER_FRAMEWORK
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.CheckerFrameworkVersion r0 = (lombok.core.configuration.CheckerFrameworkVersion) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L18
            lombok.core.configuration.CheckerFrameworkVersion r0 = lombok.core.configuration.CheckerFrameworkVersion.NONE
            goto L19
        L18:
            r0 = r4
        L19:
            return r0
    }

    public static boolean nodeHasDeprecatedFlag(com.sun.tools.javac.tree.JCTree r5) {
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L1e
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
        L1e:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L3c
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3a
            r0 = 1
            return r0
        L3a:
            r0 = 0
            return r0
        L3c:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L5a
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            r0 = 1
            return r0
        L58:
            r0 = 0
            return r0
        L5a:
            r0 = 0
            return r0
    }

    public static <A extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<A> createAnnotation(java.lang.Class<A> r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            r2 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1, r2)
            return r0
    }

    public static <A extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<A> createAnnotation(java.lang.Class<A> r12, com.sun.tools.javac.tree.JCTree.JCAnnotation r13, lombok.javac.JavacNode r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r13
            com.sun.tools.javac.util.List r0 = r0.getArguments()
            r16 = r0
            r0 = r16
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L19e
        L18:
            r0 = r18
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r17 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r22 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L6b
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            r25 = r0
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            java.lang.String r0 = r0.toString()
            r19 = r0
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.rhs
            r20 = r0
            goto L74
        L6b:
            r0 = r17
            r20 = r0
            java.lang.String r0 = "value"
            r19 = r0
        L74:
            r0 = r20
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewArray
            if (r0 == 0) goto L116
            r0 = r20
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            com.sun.tools.javac.util.List r0 = r0.elems
            r25 = r0
            r0 = r25
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L109
        L90:
            r0 = r27
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r26 = r0
            r0 = r21
            r1 = r26
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r23
            r1 = r26
            boolean r0 = r0.add(r1)
            r0 = r26
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto Lef
            r0 = r26
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.ClassNotFoundException -> Lde
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> Lde
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Lde
            r28 = r0
            r0 = r22
            r1 = r28
            r2 = r26
            com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2     // Catch: java.lang.ClassNotFoundException -> Lde
            r3 = r14
            lombok.core.AnnotationValues r1 = createAnnotation(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> Lde
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> Lde
            goto Lfc
        Lde:
            r0 = r22
            r1 = r26
            java.lang.Object r1 = lombok.javac.Javac.calculateGuess(r1)
            boolean r0 = r0.add(r1)
            goto Lfc
        Lef:
            r0 = r22
            r1 = r26
            java.lang.Object r1 = lombok.javac.Javac.calculateGuess(r1)
            boolean r0 = r0.add(r1)
        Lfc:
            r0 = r24
            r1 = r26
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r1 = r1.pos()
            boolean r0 = r0.add(r1)
        L109:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L90
            goto L183
        L116:
            r0 = r21
            r1 = r20
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r23
            r1 = r20
            boolean r0 = r0.add(r1)
            r0 = r20
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L169
            r0 = r20
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.ClassNotFoundException -> L158
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L158
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L158
            r25 = r0
            r0 = r22
            r1 = r25
            r2 = r20
            com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2     // Catch: java.lang.ClassNotFoundException -> L158
            r3 = r14
            lombok.core.AnnotationValues r1 = createAnnotation(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L158
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> L158
            goto L176
        L158:
            r0 = r22
            r1 = r20
            java.lang.Object r1 = lombok.javac.Javac.calculateGuess(r1)
            boolean r0 = r0.add(r1)
            goto L176
        L169:
            r0 = r22
            r1 = r20
            java.lang.Object r1 = lombok.javac.Javac.calculateGuess(r1)
            boolean r0 = r0.add(r1)
        L176:
            r0 = r24
            r1 = r20
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r1 = r1.pos()
            boolean r0 = r0.add(r1)
        L183:
            r0 = r15
            r1 = r19
            lombok.javac.handlers.JavacHandlerUtil$1 r2 = new lombok.javac.handlers.JavacHandlerUtil$1
            r3 = r2
            r4 = r14
            r5 = r21
            r6 = r23
            r7 = r22
            r8 = 1
            r9 = r14
            r10 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.put(r1, r2)
        L19e:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L18
            r0 = r12
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r1 = r0
            r20 = r1
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r18 = r0
            goto L20a
        L1b8:
            r0 = r20
            r1 = r18
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto L1cd
            goto L207
        L1cd:
            r0 = r17
            java.lang.String r0 = r0.getName()
            r21 = r0
            r0 = r15
            r1 = r21
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L207
            r0 = r15
            r1 = r21
            lombok.javac.handlers.JavacHandlerUtil$2 r2 = new lombok.javac.handlers.JavacHandlerUtil$2
            r3 = r2
            r4 = r14
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r5
            r6.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r6
            r7.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = r7
            r8.<init>()
            r8 = 0
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.put(r1, r2)
        L207:
            int r18 = r18 + 1
        L20a:
            r0 = r18
            r1 = r19
            if (r0 < r1) goto L1b8
            lombok.core.AnnotationValues r0 = new lombok.core.AnnotationValues
            r1 = r0
            r2 = r12
            r3 = r15
            r4 = r14
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static void deleteAnnotationIfNeccessary(lombok.javac.JavacNode r6, java.lang.String r7) {
            r0 = r6
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            deleteAnnotationIfNeccessary0(r0, r1)
            return
    }

    public static void deleteAnnotationIfNeccessary(lombok.javac.JavacNode r6, java.lang.Class<? extends java.lang.annotation.Annotation> r7) {
            r0 = r6
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            deleteAnnotationIfNeccessary0(r0, r1)
            return
    }

    public static void deleteAnnotationIfNeccessary(lombok.javac.JavacNode r6, java.lang.Class<? extends java.lang.annotation.Annotation> r7, java.lang.Class<? extends java.lang.annotation.Annotation> r8) {
            r0 = r6
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r8
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            deleteAnnotationIfNeccessary0(r0, r1)
            return
    }

    public static void deleteAnnotationIfNeccessary(lombok.javac.JavacNode r6, java.lang.Class<? extends java.lang.annotation.Annotation> r7, java.lang.String r8) {
            r0 = r6
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r8
            r2[r3] = r4
            deleteAnnotationIfNeccessary0(r0, r1)
            return
    }

    private static void deleteAnnotationIfNeccessary0(lombok.javac.JavacNode r4, java.lang.String... r5) {
            r0 = r4
            boolean r0 = inNetbeansEditor(r0)
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r4
            boolean r0 = r0.shouldDeleteLombokAnnotations()
            if (r0 != 0) goto L10
            return
        L10:
            r0 = r4
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r6
            lombok.core.AST$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L95;
                case 3: goto L4c;
                case 4: goto Lbf;
                case 5: goto L6f;
                case 6: goto Lbf;
                case 7: goto L4c;
                case 8: goto L4c;
                default: goto Lbf;
            }
        L4c:
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r7 = r0
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r4
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            com.sun.tools.javac.util.List r1 = filterList(r1, r2)
            r0.annotations = r1
            goto Lc0
        L6f:
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r8 = r0
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r4
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            com.sun.tools.javac.util.List r1 = filterList(r1, r2)
            r0.annotations = r1
            goto Lc0
        L95:
            r0 = r6
            java.lang.Object r0 = r0.get()     // Catch: java.lang.ClassCastException -> Lbb
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0     // Catch: java.lang.ClassCastException -> Lbb
            r9 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods     // Catch: java.lang.ClassCastException -> Lbb
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods     // Catch: java.lang.ClassCastException -> Lbb
            com.sun.tools.javac.util.List r1 = r1.annotations     // Catch: java.lang.ClassCastException -> Lbb
            r2 = r4
            java.lang.Object r2 = r2.get()     // Catch: java.lang.ClassCastException -> Lbb
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2     // Catch: java.lang.ClassCastException -> Lbb
            com.sun.tools.javac.util.List r1 = filterList(r1, r2)     // Catch: java.lang.ClassCastException -> Lbb
            r0.annotations = r1     // Catch: java.lang.ClassCastException -> Lbb
            goto Lc0
        Lbb:
            goto Lc0
        Lbf:
            return
        Lc0:
            r0 = r6
            lombok.javac.JavacAST r0 = r0.getAst()
            r0.setChanged()
            r0 = r5
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto Le2
        Ld4:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            r1 = r7
            deleteImportFromCompilationUnit(r0, r1)
            int r8 = r8 + 1
        Le2:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto Ld4
            return
    }

    public static void deleteImportFromCompilationUnit(lombok.javac.JavacNode r4, java.lang.String r5) {
            r0 = r4
            boolean r0 = inNetbeansEditor(r0)
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r4
            boolean r0 = r0.shouldDeleteLombokAnnotations()
            if (r0 != 0) goto L10
            return
        L10:
            r0 = r4
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r6 = r0
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L6e
        L2a:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCImport
            if (r0 != 0) goto L3f
            goto L6e
        L3f:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0.staticImport
            if (r0 == 0) goto L50
            goto L6e
        L50:
            r0 = r9
            com.sun.tools.javac.tree.JCTree r0 = r0.qualid
            java.lang.String r0 = r0.toString()
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto L6e
        L62:
            lombok.core.FieldAugment<com.sun.tools.javac.tree.JCTree$JCImport, java.lang.Boolean> r0 = lombok.javac.JavacAugments.JCImport_deletable
            r1 = r9
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
        L6e:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2a
            return
    }

    private static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> filterList(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r3, com.sun.tools.javac.tree.JCTree r4) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L27
        L11:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r6 = r0
            r0 = r4
            r1 = r6
            if (r0 == r1) goto L27
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L27:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static java.util.List<java.lang.String> toAllGetterNames(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllGetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllGetterNames(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllGetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toGetterName(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toGetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toGetterName(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toGetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllSetterNames(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllSetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllSetterNames(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllSetterNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toSetterName(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toSetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toSetterName(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toSetterName(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithNames(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithNames(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithByNames(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithByNames(r0, r1, r2, r3)
            return r0
    }

    public static java.util.List<java.lang.String> toAllWithByNames(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.util.List r0 = lombok.core.handlers.HandlerUtil.toAllWithByNames(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithName(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithName(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithByName(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r5
            lombok.core.AnnotationValues r1 = getAccessorsForField(r1)
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithByName(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.String toWithByName(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.getName()
            r3 = r5
            boolean r3 = isBoolean(r3)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.toWithByName(r0, r1, r2, r3)
            return r0
    }

    public static boolean shouldReturnThis(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r6
            r1 = r5
            lombok.javac.JavacAST r1 = r1.getAst()
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldReturnThis0(r0, r1)
            return r0
    }

    public static boolean shouldMakeFinal(lombok.javac.JavacNode r5, lombok.core.AnnotationValues<lombok.experimental.Accessors> r6) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r6
            r1 = r5
            lombok.javac.JavacAST r1 = r1.getAst()
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldMakeFinal0(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression cloneSelfType(lombok.javac.JavacNode r4) {
            r0 = r4
            r5 = r0
            r0 = r4
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r6 = r0
            goto L12
        La:
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
        L12:
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto La
        L20:
            r0 = r6
            r1 = r5
            r2 = r5
            java.lang.Object r2 = r2.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r2 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r2
            com.sun.tools.javac.util.List r2 = r2.typarams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = namePlusTypeParamsToTypeReference(r0, r1, r2)
            return r0
    }

    public static boolean isBoolean(lombok.javac.JavacNode r2) {
            r0 = r2
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r3 = r0
            r0 = r3
            boolean r0 = isBoolean(r0)
            return r0
    }

    public static boolean isBoolean(com.sun.tools.javac.tree.JCTree.JCExpression r3) {
            r0 = r3
            if (r0 == 0) goto L13
            r0 = r3
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public static com.sun.tools.javac.util.Name removePrefixFromField(lombok.javac.JavacNode r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L49
        Ld:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L49
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto L52
            r0 = r7
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4 = r0
            goto L52
        L49:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
        L52:
            r0 = r4
            if (r0 != 0) goto Lc0
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            goto Lbc
        L61:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto Laa
        L6d:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto Laa
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 == 0) goto Lc0
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.Accessors r0 = (lombok.experimental.Accessors) r0
            java.lang.String[] r0 = r0.prefix()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4 = r0
            goto Lc0
        Laa:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6d
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
        Lbc:
            r0 = r5
            if (r0 != 0) goto L61
        Lc0:
            r0 = r4
            if (r0 != 0) goto Ld2
            r0 = r3
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.util.List<java.lang.String>> r1 = lombok.ConfigurationKeys.ACCESSORS_PREFIX
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
            r4 = r0
        Ld2:
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf3
            r0 = r3
            java.lang.String r0 = r0.getName()
            r1 = r4
            java.lang.CharSequence r0 = lombok.core.handlers.HandlerUtil.removePrefix(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto Lf3
            r0 = r3
            r1 = r5
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            return r0
        Lf3:
            r0 = r3
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            return r0
    }

    public static lombok.core.AnnotationValues<lombok.experimental.Accessors> getAccessorsForField(lombok.javac.JavacNode r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L2c
        Ld:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L2c
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r4 = r0
            goto L35
        L2c:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ld
        L35:
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            goto L8f
        L40:
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L7d
        L4c:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L7d
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r6
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r8 = r0
            r0 = r4
            if (r0 != 0) goto L73
            r0 = r8
            goto L79
        L73:
            r0 = r4
            r1 = r8
            lombok.core.AnnotationValues r0 = r0.integrate(r1)
        L79:
            r4 = r0
            goto L87
        L7d:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
        L87:
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
        L8f:
            r0 = r5
            if (r0 != 0) goto L40
            r0 = r4
            if (r0 != 0) goto La1
            java.lang.Class<lombok.experimental.Accessors> r0 = lombok.experimental.Accessors.class
            r1 = r3
            lombok.core.AnnotationValues r0 = lombok.core.AnnotationValues.m58of(r0, r1)
            goto La2
        La1:
            r0 = r4
        La2:
            return r0
    }

    public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult fieldExists(java.lang.String r3, lombok.javac.JavacNode r4) {
            r0 = r4
            lombok.javac.JavacNode r0 = upToTypeNode(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L5d
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L5d
            r0 = r4
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L54
        L24:
            r0 = r6
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L54
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r3
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L54
            r0 = r5
            com.sun.tools.javac.tree.JCTree r0 = getGeneratedBy(r0)
            if (r0 != 0) goto L50
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L53
        L50:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L53:
            return r0
        L54:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L24
        L5d:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult methodExists(java.lang.String r5, lombok.javac.JavacNode r6, int r7) {
            r0 = r5
            r1 = r6
            r2 = 1
            r3 = r7
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = methodExists(r0, r1, r2, r3)
            return r0
    }

    public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult methodExists(java.lang.String r5, lombok.javac.JavacNode r6, boolean r7, int r8) {
            r0 = r6
            lombok.javac.JavacNode r0 = upToTypeNode(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Le7
            r0 = r6
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto Le7
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto Ldd
        L25:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto Ldd
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r11 = r0
            r0 = r11
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L57
            r0 = r12
            r1 = r5
            boolean r0 = r0.equals(r1)
            goto L5d
        L57:
            r0 = r12
            r1 = r5
            boolean r0 = r0.equalsIgnoreCase(r1)
        L5d:
            r13 = r0
            r0 = r13
            if (r0 == 0) goto Ldd
            r0 = r8
            r1 = -1
            if (r0 <= r1) goto Lbf
            r0 = r11
            com.sun.tools.javac.util.List r0 = r0.params
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r14
            if (r0 == 0) goto Lb0
            r0 = r14
            int r0 = r0.length()
            if (r0 <= 0) goto Lb0
            r0 = r14
            int r0 = r0.length()
            r15 = r0
            r0 = r14
            java.lang.Object r0 = r0.last()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lac
            r0 = 2147483647(0x7fffffff, float:NaN)
            r16 = r0
            int r15 = r15 + (-1)
            goto Lb0
        Lac:
            r0 = r15
            r16 = r0
        Lb0:
            r0 = r8
            r1 = r15
            if (r0 < r1) goto Ldd
            r0 = r8
            r1 = r16
            if (r0 <= r1) goto Lbf
            goto Ldd
        Lbf:
            r0 = r6
            r1 = r11
            boolean r0 = isTolerate(r0, r1)
            if (r0 == 0) goto Lcb
            goto Ldd
        Lcb:
            r0 = r9
            com.sun.tools.javac.tree.JCTree r0 = getGeneratedBy(r0)
            if (r0 != 0) goto Ld9
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto Ldc
        Ld9:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        Ldc:
            return r0
        Ldd:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L25
        Le7:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static boolean isTolerate(lombok.javac.JavacNode r4, com.sun.tools.javac.tree.JCTree.JCMethodDecl r5) {
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            com.sun.tools.javac.util.List r0 = r0.getAnnotations()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3a
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L30
        L15:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r7 = r0
            java.lang.Class<lombok.experimental.Tolerate> r0 = lombok.experimental.Tolerate.class
            r1 = r4
            r2 = r7
            com.sun.tools.javac.tree.JCTree r2 = r2.getAnnotationType()
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L15
        L3a:
            r0 = 0
            return r0
    }

    public static lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult constructorExists(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.javac.JavacNode r0 = upToTypeNode(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7f
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L7f
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L76
        L24:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L76
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r8 = r0
            r0 = r8
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L76
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            goto L76
        L5a:
            r0 = r5
            r1 = r8
            boolean r0 = isTolerate(r0, r1)
            if (r0 == 0) goto L65
            goto L76
        L65:
            r0 = r6
            com.sun.tools.javac.tree.JCTree r0 = getGeneratedBy(r0)
            if (r0 != 0) goto L72
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER
            goto L75
        L72:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
        L75:
            return r0
        L76:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L24
        L7f:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            return r0
    }

    public static boolean isConstructorCall(com.sun.tools.javac.tree.JCTree.JCStatement r3) {
            r0 = r3
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCExpressionStatement
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.expr
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodInvocation
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            r0 = r4
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.meth
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L37
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L50
        L37:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L4c
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L50
        L4c:
            java.lang.String r0 = ""
            r6 = r0
        L50:
            java.lang.String r0 = "super"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            java.lang.String r0 = "this"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            r0 = 0
            return r0
        L66:
            r0 = 1
            return r0
    }

    public static int toJavacModifier(lombok.AccessLevel r3) {
            int[] r0 = $SWITCH_TABLE$lombok$AccessLevel()
            r1 = r3
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L30;
                case 3: goto L36;
                case 4: goto L30;
                case 5: goto L34;
                case 6: goto L34;
                default: goto L32;
            }
        L30:
            r0 = 0
            return r0
        L32:
            r0 = 1
            return r0
        L34:
            r0 = 2
            return r0
        L36:
            r0 = 4
            return r0
    }

    private static lombok.javac.handlers.JavacHandlerUtil.GetterMethod findGetter(lombok.javac.JavacNode r5) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r6 = r0
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
            r0 = r5
            java.util.List r0 = toAllGetterNames(r0)
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto Lb1
        L1e:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto La7
        L35:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto L4f
            goto La7
        L4f:
            r0 = r10
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r12 = r0
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r1 = r8
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L6b
            goto La7
        L6b:
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L7f
            goto La7
        L7f:
            r0 = r12
            com.sun.tools.javac.util.List r0 = r0.params
            if (r0 == 0) goto L95
            r0 = r12
            com.sun.tools.javac.util.List r0 = r0.params
            int r0 = r0.size()
            if (r0 <= 0) goto L95
            goto La7
        L95:
            lombok.javac.handlers.JavacHandlerUtil$GetterMethod r0 = new lombok.javac.handlers.JavacHandlerUtil$GetterMethod
            r1 = r0
            r2 = r12
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.restype
            r1.<init>(r2, r3)
            return r0
        La7:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L35
        Lb1:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1e
            r0 = 0
            r8 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L10c
        Lc9:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L10c
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r9
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L10c
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r9
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r11 = r0
            r0 = r11
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            lombok.AccessLevel r0 = r0.value()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L10a
            r0 = 0
            return r0
        L10a:
            r0 = 1
            r8 = r0
        L10c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc9
            r0 = r8
            if (r0 != 0) goto L1a1
            r0 = r5
            boolean r0 = lombok.javac.handlers.HandleGetter.fieldQualifiesForGetterGeneration(r0)
            if (r0 == 0) goto L1a1
            r0 = r5
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L1a1
            r0 = r9
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L197
        L13c:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L160
            java.lang.Class<lombok.Data> r0 = lombok.Data.class
            r1 = r10
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L160
            r0 = 1
            r8 = r0
        L160:
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L197
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r10
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L197
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r10
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r12 = r0
            r0 = r12
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            lombok.AccessLevel r0 = r0.value()
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L195
            r0 = 0
            return r0
        L195:
            r0 = 1
            r8 = r0
        L197:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13c
        L1a1:
            r0 = r8
            if (r0 == 0) goto L1c4
            r0 = r5
            java.lang.String r0 = toGetterName(r0)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L1b2
            r0 = 0
            return r0
        L1b2:
            lombok.javac.handlers.JavacHandlerUtil$GetterMethod r0 = new lombok.javac.handlers.JavacHandlerUtil$GetterMethod
            r1 = r0
            r2 = r5
            r3 = r9
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.vartype
            r1.<init>(r2, r3)
            return r0
        L1c4:
            r0 = 0
            return r0
    }

    static boolean lookForGetter(lombok.javac.JavacNode r3, lombok.core.handlers.HandlerUtil.FieldAccess r4) {
            r0 = r4
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.GETTER
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            lombok.core.handlers.HandlerUtil$FieldAccess r1 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            if (r0 != r1) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r3
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L59
        L1d:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L34
            goto L59
        L34:
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r5
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L59
            java.lang.Class<lombok.Getter> r0 = lombok.Getter.class
            r1 = r5
            lombok.core.AnnotationValues r0 = createAnnotation(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Getter r0 = (lombok.Getter) r0
            boolean r0 = r0.lazy()
            if (r0 == 0) goto L59
            r0 = 1
            return r0
        L59:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression getFieldType(lombok.javac.JavacNode r3, lombok.core.handlers.HandlerUtil.FieldAccess r4) {
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L15
            r0 = r3
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            return r0
        L15:
            r0 = r3
            r1 = r4
            boolean r0 = lookForGetter(r0, r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r3
            lombok.javac.handlers.JavacHandlerUtil$GetterMethod r0 = findGetter(r0)
            goto L27
        L26:
            r0 = 0
        L27:
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L37
            r0 = r3
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            return r0
        L37:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.GetterMethod.access$0(r0)
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression createFieldAccessor(lombok.javac.JavacTreeMaker r5, lombok.javac.JavacNode r6, lombok.core.handlers.HandlerUtil.FieldAccess r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createFieldAccessor(r0, r1, r2, r3)
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression createFieldAccessor(lombok.javac.JavacTreeMaker r6, lombok.javac.JavacNode r7, lombok.core.handlers.HandlerUtil.FieldAccess r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r0 = r7
            r1 = r8
            boolean r0 = lookForGetter(r0, r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L13
            r0 = r7
            lombok.javac.handlers.JavacHandlerUtil$GetterMethod r0 = findGetter(r0)
            goto L14
        L13:
            r0 = 0
        L14:
            r11 = r0
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r12 = r0
            r0 = r11
            if (r0 != 0) goto L95
            r0 = r9
            if (r0 != 0) goto L7a
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            r0 = r6
            r1 = r7
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r9 = r0
            goto L7a
        L48:
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7a
            r0 = r13
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L7a
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r14 = r0
            r0 = r6
            r1 = r14
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r9 = r0
        L7a:
            r0 = r9
            if (r0 != 0) goto L8a
            r0 = r6
            r1 = r12
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            goto L94
        L8a:
            r0 = r6
            r1 = r9
            r2 = r12
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
        L94:
            return r0
        L95:
            r0 = r9
            if (r0 != 0) goto La5
            r0 = r6
            r1 = r7
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r9 = r0
        La5:
            r0 = r6
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r6
            r3 = r9
            r4 = r11
            com.sun.tools.javac.util.Name r4 = lombok.javac.handlers.JavacHandlerUtil.GetterMethod.access$1(r4)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r13 = r0
            r0 = r13
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression createMethodAccessor(lombok.javac.JavacTreeMaker r4, lombok.javac.JavacNode r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = createMethodAccessor(r0, r1, r2)
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression createMethodAccessor(lombok.javac.JavacTreeMaker r6, lombok.javac.JavacNode r7, com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L2b
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = r6
            r1 = r7
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r8 = r0
            goto L61
        L2b:
            r0 = r8
            if (r0 != 0) goto L61
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L61
            r0 = r10
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L61
            r0 = r7
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r11 = r0
            r0 = r6
            r1 = r11
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r8 = r0
        L61:
            r0 = r6
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r8
            if (r2 != 0) goto L74
            r2 = r6
            r3 = r9
            com.sun.tools.javac.util.Name r3 = r3.name
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            goto L7d
        L74:
            r2 = r6
            r3 = r8
            r4 = r9
            com.sun.tools.javac.util.Name r4 = r4.name
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
        L7d:
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r10 = r0
            r0 = r10
            return r0
    }

    public static lombok.javac.JavacNode injectFieldAndMarkGenerated(lombok.javac.JavacNode r4, com.sun.tools.javac.tree.JCTree.JCVariableDecl r5) {
            r0 = r4
            r1 = r5
            r2 = 1
            lombok.javac.JavacNode r0 = injectField(r0, r1, r2)
            return r0
    }

    public static lombok.javac.JavacNode injectField(lombok.javac.JavacNode r4, com.sun.tools.javac.tree.JCTree.JCVariableDecl r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            lombok.javac.JavacNode r0 = injectField(r0, r1, r2)
            return r0
    }

    public static lombok.javac.JavacNode injectField(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCVariableDecl r6, boolean r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            lombok.javac.JavacNode r0 = injectField(r0, r1, r2, r3)
            return r0
    }

    public static lombok.javac.JavacNode injectField(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCVariableDecl r6, boolean r7, boolean r8) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L3b
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addSuppressWarningsAll(r0, r1, r2, r3)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addGenerated(r0, r1, r2, r3)
        L3b:
            r0 = 0
            r10 = r0
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.defs
            r11 = r0
        L45:
            r0 = 0
            r12 = r0
            r0 = r11
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L77
            r0 = r11
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r13 = r0
            r0 = r8
            if (r0 != 0) goto L69
            r0 = r13
            boolean r0 = isEnumConstant(r0)
            if (r0 != 0) goto L71
        L69:
            r0 = r13
            boolean r0 = isGenerated(r0)
            if (r0 == 0) goto L9c
        L71:
            r0 = 1
            r12 = r0
            goto L9c
        L77:
            r0 = r11
            java.lang.Object r0 = r0.head
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L9c
            r0 = r11
            java.lang.Object r0 = r0.head
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L9c
            r0 = 1
            r12 = r0
        L9c:
            r0 = r12
            if (r0 == 0) goto Laf
            r0 = r11
            r10 = r0
            r0 = r11
            com.sun.tools.javac.util.List r0 = r0.tail
            r11 = r0
            goto L45
        Laf:
            r0 = r6
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r12 = r0
            r0 = r12
            r1 = r11
            r0.tail = r1
            r0 = r10
            if (r0 != 0) goto Lcb
            r0 = r9
            r1 = r12
            r0.defs = r1
            goto Ld2
        Lcb:
            r0 = r10
            r1 = r12
            r0.tail = r1
        Ld2:
            r0 = r6
            r1 = r5
            lombok.javac.handlers.JavacHandlerUtil.EnterReflect.memberEnter(r0, r1)
            r0 = r5
            r1 = r6
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.FIELD
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    public static boolean isEnumConstant(com.sun.tools.javac.tree.JCTree.JCVariableDecl r5) {
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static void injectMethod(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCMethodDecl r6) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r7 = r0
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.getName()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L93
            r0 = 0
            r8 = r0
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L89
        L23:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L86
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L86
            r0 = r5
            r1 = r9
            lombok.core.LombokNode r0 = r0.getNodeFor(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L68
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r11
            r0.removeChild(r1)
        L68:
            r0 = r7
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.defs
            r2 = r8
            com.sun.tools.javac.util.List r1 = addAllButOne(r1, r2)
            r0.defs = r1
            r0 = r7
            com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r1
            com.sun.tools.javac.code.Symbol$MethodSymbol r1 = r1.sym
            lombok.javac.handlers.JavacHandlerUtil.ClassSymbolMembersField.remove(r0, r1)
            goto L93
        L86:
            int r8 = r8 + 1
        L89:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L23
        L93:
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addSuppressWarningsAll(r0, r1, r2, r3)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addGenerated(r0, r1, r2, r3)
            r0 = r7
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.defs
            r2 = r6
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.defs = r1
            r0 = r6
            r1 = r5
            lombok.javac.handlers.JavacHandlerUtil.EnterReflect.memberEnter(r0, r1)
            r0 = r5
            r1 = r6
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.METHOD
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            return
    }

    public static lombok.javac.JavacNode injectType(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCClassDecl r6) {
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r7 = r0
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addSuppressWarningsAll(r0, r1, r2, r3)
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            r2 = r5
            r3 = r6
            com.sun.tools.javac.tree.JCTree r3 = getGeneratedBy(r3)
            lombok.core.LombokNode r2 = r2.getNodeFor(r3)
            lombok.javac.JavacNode r2 = (lombok.javac.JavacNode) r2
            r3 = r5
            com.sun.tools.javac.util.Context r3 = r3.getContext()
            addGenerated(r0, r1, r2, r3)
            r0 = r7
            r1 = r7
            com.sun.tools.javac.util.List r1 = r1.defs
            r2 = r6
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.defs = r1
            r0 = r6
            r1 = r5
            com.sun.tools.javac.code.Type r0 = lombok.javac.handlers.JavacHandlerUtil.EnterReflect.classEnter(r0, r1)
            r0 = r5
            r1 = r6
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.TYPE
            lombok.core.LombokNode r0 = r0.add(r1, r2)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    public static long addFinalIfNeeded(long r5, com.sun.tools.javac.util.Context r7) {
            r0 = r7
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateFinalParams()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L15
            r0 = r5
            r1 = 16
            long r0 = r0 | r1
            r5 = r0
        L15:
            r0 = r5
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression genTypeRef(lombok.javac.JavacNode r6, java.lang.String r7) {
            r0 = r7
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r1 = 2
            if (r0 <= r1) goto L3d
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = r8
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = "lang"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = r8
            int r0 = r0.length
            r1 = 2
            int r0 = r0 - r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = r8
            r1 = 2
            r2 = r9
            r3 = 0
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = genJavaLangTypeRef(r0, r1)
            return r0
        L3d:
            r0 = r6
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression genJavaLangTypeRef(lombok.javac.JavacNode r5, java.lang.String... r6) {
            r0 = r5
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.javaLangAsFqn()
            if (r0 == 0) goto L1c
            r0 = r5
            java.lang.String r1 = "java"
            java.lang.String r2 = "lang"
            r3 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3)
            return r0
        L1c:
            r0 = r5
            r1 = 0
            r2 = 0
            r3 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression genJavaLangTypeRef(lombok.javac.JavacNode r6, int r7, java.lang.String... r8) {
            r0 = r6
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.javaLangAsFqn()
            if (r0 == 0) goto L1d
            r0 = r6
            r1 = r7
            java.lang.String r2 = "java"
            java.lang.String r3 = "lang"
            r4 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3, r4)
            return r0
        L1d:
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3, r4)
            return r0
    }

    public static void addSuppressWarningsAll(com.sun.tools.javac.tree.JCTree.JCModifiers r7, lombok.javac.JavacNode r8, lombok.javac.JavacNode r9, com.sun.tools.javac.util.Context r10) {
            r0 = r10
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateSuppressWarnings()
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r8
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L93
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L89
        L39:
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r12 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree r0 = r0.getAnnotationType()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L64
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r15 = r0
            goto L76
        L64:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L76
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r15 = r0
        L76:
            r0 = r15
            if (r0 == 0) goto L89
            r0 = r15
            java.lang.String r1 = "SuppressWarnings"
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L89
            r0 = 0
            r11 = r0
        L89:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L39
        L93:
            r0 = r11
            if (r0 == 0) goto Lab
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.String r3 = "java.lang.SuppressWarnings"
            r4 = r8
            lombok.javac.JavacTreeMaker r4 = r4.getTreeMaker()
            java.lang.String r5 = "all"
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5)
            addAnnotation(r0, r1, r2, r3, r4)
        Lab:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_FINDBUGS_SUPPRESSWARNINGS_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lea
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = r12
            r2 = r8
            java.lang.String r3 = "justification"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r12
            java.lang.String r3 = "generated code"
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.String r3 = "edu.umd.cs.findbugs.annotations.SuppressFBWarnings"
            r4 = r13
            addAnnotation(r0, r1, r2, r3, r4)
        Lea:
            return
    }

    public static void addGenerated(com.sun.tools.javac.tree.JCTree.JCModifiers r7, lombok.javac.JavacNode r8, lombok.javac.JavacNode r9, com.sun.tools.javac.util.Context r10) {
            r0 = r10
            lombok.javac.LombokOptions r0 = lombok.delombok.LombokOptionsFactory.getDelombokOptions(r0)
            lombok.delombok.FormatPreferences r0 = r0.getFormatPreferences()
            boolean r0 = r0.generateGenerated()
            if (r0 != 0) goto Le
            return
        Le:
            r0 = r8
            boolean r0 = lombok.core.handlers.HandlerUtil.shouldAddGenerated(r0)
            if (r0 == 0) goto L28
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.String r3 = "javax.annotation.Generated"
            r4 = r8
            lombok.javac.JavacTreeMaker r4 = r4.getTreeMaker()
            java.lang.String r5 = "lombok"
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5)
            addAnnotation(r0, r1, r2, r3, r4)
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r8
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.ADD_LOMBOK_GENERATED_ANNOTATIONS
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.String r3 = "lombok.Generated"
            r4 = 0
            addAnnotation(r0, r1, r2, r3, r4)
        L45:
            return
    }

    public static void addAnnotation(com.sun.tools.javac.tree.JCTree.JCModifiers r6, lombok.javac.JavacNode r7, lombok.javac.JavacNode r8, java.lang.String r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r0 = r9
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L12
            r0 = r9
            goto L1a
        L12:
            r0 = r9
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
        L1a:
            r12 = r0
            r0 = r13
            r1 = 9
            if (r0 != r1) goto L35
            r0 = r9
            r1 = 0
            java.lang.String r2 = "java.lang."
            r3 = 0
            r4 = 10
            boolean r0 = r0.regionMatches(r1, r2, r3, r4)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r11 = r0
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L89
        L44:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r13 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree r0 = r0.getAnnotationType()
            r15 = r0
            r0 = r15
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L74
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r16 = r0
            r0 = r16
            r1 = r12
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L74
            return
        L74:
            r0 = r15
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L89
            r0 = r15
            java.lang.String r0 = r0.toString()
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            return
        L89:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L44
            r0 = r7
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r13 = r0
            r0 = r11
            if (r0 == 0) goto Lae
            r0 = r7
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = genJavaLangTypeRef(r0, r1)
            goto Lb3
        Lae:
            r0 = r7
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDotsString(r0, r1)
        Lb3:
            r14 = r0
            r0 = r10
            if (r0 == 0) goto Lc2
            r0 = r10
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto Lc5
        Lc2:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        Lc5:
            r15 = r0
            r0 = r13
            r1 = r14
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r1 = r8
            com.sun.tools.javac.tree.JCTree r0 = recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r16 = r0
            r0 = r6
            r1 = r6
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r16
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.annotations = r1
            return
    }

    static com.sun.tools.javac.tree.JCTree.JCExpression addCheckerFrameworkReturnsReceiver(com.sun.tools.javac.tree.JCTree.JCExpression r4, lombok.javac.JavacTreeMaker r5, lombok.javac.JavacNode r6, lombok.core.configuration.CheckerFrameworkVersion r7) {
            r0 = r7
            boolean r0 = r0.generateReturnsReceiver()
            if (r0 == 0) goto L22
            r0 = r5
            r1 = r6
            java.lang.String r2 = "org.checkerframework.common.returnsreceiver.qual.This"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r8
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            r2 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.AnnotatedType(r1, r2)
            r4 = r0
        L22:
            r0 = r4
            return r0
    }

    private static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> addAllButOne(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r3, int r4) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L2e
        L13:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r6
            int r6 = r6 + 1
            r1 = r4
            if (r0 == r1) goto L2e
            r0 = r5
            r1 = r7
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L2e:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression chainDots(lombok.javac.JavacNode r6, java.lang.String r7, java.lang.String r8, java.lang.String... r9) {
            r0 = r6
            r1 = -1
            r2 = r7
            r3 = r8
            r4 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3, r4)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression chainDots(lombok.javac.JavacNode r6, java.lang.String[] r7) {
            r0 = r6
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3, r4)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression chainDots(lombok.javac.JavacNode r5, lombok.core.LombokImmutableList<java.lang.String> r6) {
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.$assertionsDisabled
            if (r0 != 0) goto L12
            r0 = r6
            if (r0 != 0) goto L12
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L12:
            r0 = r5
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L4c
        L22:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L40
            r0 = r7
            r1 = r5
            r2 = r9
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r8 = r0
            goto L4c
        L40:
            r0 = r7
            r1 = r8
            r2 = r5
            r3 = r9
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r8 = r0
        L4c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L22
            r0 = r8
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression chainDots(lombok.javac.JavacNode r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String... r10) {
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.$assertionsDisabled
            if (r0 != 0) goto L13
            r0 = r10
            if (r0 != 0) goto L13
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L13:
            r0 = r6
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            r0 = r7
            r1 = -1
            if (r0 == r1) goto L26
            r0 = r11
            r1 = r7
            lombok.javac.JavacTreeMaker r0 = r0.m80at(r1)
            r11 = r0
        L26:
            r0 = 0
            r12 = r0
            r0 = r8
            if (r0 == 0) goto L39
            r0 = r11
            r1 = r6
            r2 = r8
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r12 = r0
        L39:
            r0 = r9
            if (r0 == 0) goto L5d
            r0 = r12
            if (r0 != 0) goto L4f
            r0 = r11
            r1 = r6
            r2 = r9
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            goto L5b
        L4f:
            r0 = r11
            r1 = r12
            r2 = r6
            r3 = r9
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
        L5b:
            r12 = r0
        L5d:
            r0 = 0
            r13 = r0
            goto L8e
        L63:
            r0 = r12
            if (r0 != 0) goto L79
            r0 = r11
            r1 = r6
            r2 = r10
            r3 = r13
            r2 = r2[r3]
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            goto L89
        L79:
            r0 = r11
            r1 = r12
            r2 = r6
            r3 = r10
            r4 = r13
            r3 = r3[r4]
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
        L89:
            r12 = r0
            int r13 = r13 + 1
        L8e:
            r0 = r13
            r1 = r10
            int r1 = r1.length
            if (r0 < r1) goto L63
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.$assertionsDisabled
            if (r0 != 0) goto La9
            r0 = r12
            if (r0 != 0) goto La9
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        La9:
            r0 = r12
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression chainDotsString(lombok.javac.JavacNode r6, java.lang.String r7) {
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = r7
            java.lang.String r4 = "\\."
            java.lang.String[] r3 = r3.split(r4)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = chainDots(r0, r1, r2, r3)
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findAnnotations(lombok.javac.JavacNode r4, java.util.regex.Pattern r5) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L6f
        L14:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L6f
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "."
            int r0 = r0.lastIndexOf(r1)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 != r1) goto L51
            r0 = r10
            goto L5a
        L51:
            r0 = r10
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
        L5a:
            r12 = r0
            r0 = r5
            r1 = r12
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L6f
            r0 = r6
            r1 = r9
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L6f:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static java.lang.String scanForNearestAnnotation(lombok.javac.JavacNode r4, java.lang.String... r5) {
            goto L6e
        L3:
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L5d
        Le:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L25
            goto L5d
        L25:
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r8 = r0
            r0 = r5
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto L56
        L3b:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r4
            r2 = r8
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L53
            r0 = r9
            return r0
        L53:
            int r10 = r10 + 1
        L56:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L3b
        L5d:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r4 = r0
        L6e:
            r0 = r4
            if (r0 != 0) goto L3
            r0 = 0
            return r0
    }

    public static boolean hasNonNullAnnotations(lombok.javac.JavacNode r4) {
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L59
        Lb:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r5 = r0
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L59
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r7 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.NONNULL_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L4f
        L34:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r7
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L4f
            r0 = 1
            return r0
        L4f:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L34
        L59:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
    }

    public static boolean hasNonNullAnnotations(lombok.javac.JavacNode r4, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r5) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L47
        Le:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r6 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.NONNULL_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L3d
        L25:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r6
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L3d
            r0 = 1
            return r0
        L3d:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L25
        L47:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            r0 = 0
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findCopyableAnnotations(lombok.javac.JavacNode r4) {
            r0 = 0
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L45
        L10:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L45
            r0 = r5
            if (r0 == 0) goto L30
            java.lang.String r0 = ""
            r6 = r0
            goto L4f
        L30:
            r0 = r7
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r9
            r5 = r0
        L45:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
        L4f:
            r0 = r6
            if (r0 != 0) goto L57
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            return r0
        L57:
            r0 = r4
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.util.List<lombok.core.configuration.TypeName>> r1 = lombok.ConfigurationKeys.COPYABLE_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ldc
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L9d
        L77:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.TypeName r0 = (lombok.core.configuration.TypeName) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L9d
            r0 = r8
            java.lang.String r0 = r0.toString()
            r1 = r4
            r2 = r5
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L9d
            r0 = r5
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
        L9d:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L77
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.BASE_COPYABLE_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto Ld2
        Lb4:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r5
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto Ld2
            r0 = r5
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
        Ld2:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb4
        Ldc:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L19b
        Lf1:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L19b
            r0 = r9
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L150
        L120:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.TypeName r0 = (lombok.core.configuration.TypeName) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L150
            r0 = r13
            java.lang.String r0 = r0.toString()
            r1 = r4
            r2 = r11
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L150
            r0 = r8
            r1 = r11
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = 1
            r12 = r0
            goto L15a
        L150:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L120
        L15a:
            r0 = r12
            if (r0 != 0) goto L19b
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.BASE_COPYABLE_ANNOTATIONS
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L191
        L16c:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            r1 = r4
            r2 = r11
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L191
            r0 = r8
            r1 = r11
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L19b
        L191:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16c
        L19b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf1
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findCopyableToSetterAnnotations(lombok.javac.JavacNode r3) {
            r0 = r3
            java.util.List<java.lang.String> r1 = lombok.core.handlers.HandlerUtil.COPY_TO_SETTER_ANNOTATIONS
            com.sun.tools.javac.util.List r0 = findAnnotationsInList(r0, r1)
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findCopyableToBuilderSingularSetterAnnotations(lombok.javac.JavacNode r3) {
            r0 = r3
            java.util.List<java.lang.String> r1 = lombok.core.handlers.HandlerUtil.COPY_TO_BUILDER_SINGULAR_SETTER_ANNOTATIONS
            com.sun.tools.javac.util.List r0 = findAnnotationsInList(r0, r1)
            return r0
    }

    private static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> findAnnotationsInList(lombok.javac.JavacNode r4, java.util.List<java.lang.String> r5) {
            r0 = 0
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L48
        L10:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L48
            r0 = r6
            if (r0 == 0) goto L32
            java.lang.String r0 = ""
            r7 = r0
            goto L52
        L32:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r10
            r6 = r0
        L48:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
        L52:
            r0 = r7
            if (r0 != 0) goto L5a
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            return r0
        L5a:
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L94
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8a
        L6c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r6
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L8a
            r0 = r6
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
        L8a:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6c
        L94:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L10c
        La9:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 != r1) goto L10c
            r0 = r9
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L10c
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L102
        Ldd:
            r0 = r14
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            r1 = r4
            r2 = r11
            com.sun.tools.javac.tree.JCTree r2 = r2.annotationType
            boolean r0 = typeMatches(r0, r1, r2)
            if (r0 == 0) goto L102
            r0 = r8
            r1 = r11
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L10c
        L102:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ldd
        L10c:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La9
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCStatement generateNullCheck(lombok.javac.JavacTreeMaker r4, lombok.javac.JavacNode r5, lombok.javac.JavacNode r6) {
            r0 = r4
            r1 = r5
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = generateNullCheck(r0, r1, r2)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCStatement generateNullCheck(lombok.javac.JavacTreeMaker r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.util.Name r10, lombok.javac.JavacNode r11, java.lang.String r12) {
            r0 = r11
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullCheckExceptionType> r1 = lombok.ConfigurationKeys.NON_NULL_EXCEPTION_TYPE
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullCheckExceptionType r0 = (lombok.core.configuration.NullCheckExceptionType) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L19
            lombok.core.configuration.NullCheckExceptionType r0 = lombok.core.configuration.NullCheckExceptionType.NULL_POINTER_EXCEPTION
            r13 = r0
        L19:
            r0 = r9
            if (r0 == 0) goto L26
            r0 = r9
            boolean r0 = lombok.javac.Javac.isPrimitive(r0)
            if (r0 == 0) goto L26
            r0 = 0
            return r0
        L26:
            r0 = r8
            r1 = r13
            r2 = r10
            java.lang.String r2 = r2.toString()
            r3 = r12
            java.lang.String r1 = r1.toExceptionMessage(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r14 = r0
            r0 = r13
            lombok.core.LombokImmutableList r0 = r0.getMethod()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L5f
            r0 = r8
            r1 = r8
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r11
            r4 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = chainDots(r3, r4)
            r4 = r8
            r5 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r14
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            return r0
        L5f:
            r0 = r13
            lombok.core.configuration.NullCheckExceptionType r1 = lombok.core.configuration.NullCheckExceptionType.ASSERTION
            if (r0 != r1) goto L82
            r0 = r8
            r1 = r8
            lombok.javac.JavacTreeMaker$TreeTag r2 = lombok.javac.Javac.CTC_NOT_EQUAL
            r3 = r8
            r4 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r8
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOT
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r1 = r1.Binary(r2, r3, r4)
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCAssert r0 = r0.Assert(r1, r2)
            return r0
        L82:
            r0 = r11
            r1 = r13
            java.lang.String r1 = r1.getExceptionType()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = genTypeRef(r0, r1)
            r16 = r0
            r0 = r8
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r16
            r4 = r14
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r17 = r0
            r0 = r8
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCThrow r0 = r0.Throw(r1)
            r18 = r0
            r0 = r8
            r1 = 0
            r2 = r18
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r19 = r0
            r0 = r8
            r1 = r8
            lombok.javac.JavacTreeMaker$TreeTag r2 = lombok.javac.Javac.CTC_EQUAL
            r3 = r8
            r4 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r8
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOT
            r6 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r1 = r1.Binary(r2, r3, r4)
            r2 = r19
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCStatement generateNullCheck(lombok.javac.JavacTreeMaker r6, com.sun.tools.javac.tree.JCTree.JCVariableDecl r7, lombok.javac.JavacNode r8) {
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r2 = r7
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r8
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = generateNullCheck(r0, r1, r2, r3, r4)
            return r0
    }

    public static com.sun.tools.javac.util.List<java.lang.Integer> createListOfNonExistentFields(com.sun.tools.javac.util.List<java.lang.String> r5, lombok.javac.JavacNode r6, boolean r7, boolean r8) {
            r0 = r5
            int r0 = r0.size()
            boolean[] r0 = new boolean[r0]
            r9 = r0
            r0 = r6
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L9d
        L14:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r10 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            goto La7
        L2a:
            r0 = r10
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L38
            goto L9d
        L38:
            r0 = r10
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            goto L9d
        L5a:
            r0 = r12
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6e
            goto L9d
        L6e:
            r0 = r8
            if (r0 == 0) goto L86
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 128(0x80, double:6.32E-322)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L86
            goto L9d
        L86:
            r0 = r5
            r1 = r10
            java.lang.String r1 = r1.getName()
            int r0 = r0.indexOf(r1)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 <= r1) goto L9d
            r0 = r9
            r1 = r13
            r2 = 1
            r0[r1] = r2
        L9d:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
        La7:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = 0
            r11 = r0
            goto Lcc
        Lb6:
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            if (r0 != 0) goto Lc9
            r0 = r10
            r1 = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Lc9:
            int r11 = r11 + 1
        Lcc:
            r0 = r11
            r1 = r5
            int r1 = r1.size()
            if (r0 < r1) goto Lb6
            r0 = r10
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> unboxAndRemoveAnnotationParameter(com.sun.tools.javac.tree.JCTree.JCAnnotation r4, java.lang.String r5, java.lang.String r6, lombok.javac.JavacNode r7) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r8 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.args
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L287
        L1e:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r10 = r0
            java.lang.String r0 = "value"
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L67
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            r15 = r0
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L60
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            r16 = r0
            r0 = r16
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r13 = r0
        L60:
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.rhs
            r14 = r0
        L67:
            r0 = r13
            int r0 = r0.length()
            r15 = r0
            goto L85
        L71:
            r0 = r13
            r1 = r15
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 95
            if (r0 == r1) goto L82
            goto L8a
        L82:
            int r15 = r15 + (-1)
        L85:
            r0 = r15
            if (r0 > 0) goto L71
        L8a:
            r0 = r15
            r1 = r13
            int r1 = r1.length()
            if (r0 >= r1) goto L98
            r0 = 1
            goto L99
        L98:
            r0 = 0
        L99:
            r12 = r0
            r0 = r13
            r1 = 0
            r2 = r15
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r5
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb9
            r0 = r8
            r1 = r10
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L287
        Lb9:
            r0 = r10
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r0 = r0.pos()
            r1 = r7
            lombok.core.LombokNode r1 = r1.top()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            int r0 = lombok.javac.Javac.getEndPosition(r0, r1)
            r15 = r0
            r0 = r7
            lombok.javac.JavacAST r0 = r0.getAst()
            r1 = r10
            int r1 = r1.pos
            r2 = r15
            r0.removeFromDeferredDiagnostics(r1, r2)
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L21a
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.annotationType
            java.lang.String r0 = r0.toString()
            r16 = r0
            r0 = r16
            java.lang.String r1 = "_"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "$"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "x"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "X"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r16 = r0
            r0 = r16
            int r0 = r0.length()
            if (r0 <= 0) goto L13e
            r0 = r12
            if (r0 == 0) goto L136
            r0 = r9
            r1 = r14
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L287
        L136:
            r0 = r6
            r1 = r7
            addError(r0, r1)
            goto L287
        L13e:
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            com.sun.tools.javac.util.List r0 = r0.args
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L20d
        L14e:
            r0 = r18
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAssign
            if (r0 == 0) goto L1a0
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L1a0
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.lhs
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            r19 = r0
            java.lang.String r0 = "value"
            r1 = r19
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19b
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.rhs
            r17 = r0
            goto L1a0
        L19b:
            r0 = r6
            r1 = r7
            addError(r0, r1)
        L1a0:
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L1b6
            r0 = r9
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L20d
        L1b6:
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewArray
            if (r0 == 0) goto L205
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            com.sun.tools.javac.util.List r0 = r0.elems
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L1f8
        L1ce:
            r0 = r20
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r19 = r0
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L1f0
            r0 = r9
            r1 = r19
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L1f8
        L1f0:
            r0 = r6
            r1 = r7
            addError(r0, r1)
            goto L287
        L1f8:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1ce
            goto L20d
        L205:
            r0 = r6
            r1 = r7
            addError(r0, r1)
            goto L287
        L20d:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14e
            goto L287
        L21a:
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewArray
            if (r0 == 0) goto L282
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            r16 = r0
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.elems
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L287
            r0 = r12
            if (r0 == 0) goto L27a
            r0 = r16
            com.sun.tools.javac.util.List r0 = r0.elems
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto L26d
        L246:
            r0 = r18
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L268
            r0 = r9
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L26d
        L268:
            r0 = r6
            r1 = r7
            addError(r0, r1)
        L26d:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L246
            goto L287
        L27a:
            r0 = r6
            r1 = r7
            addError(r0, r1)
            goto L287
        L282:
            r0 = r6
            r1 = r7
            addError(r0, r1)
        L287:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1e
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L2ac
        L29b:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r10 = r0
            r0 = r10
            clearTypes(r0)
        L2ac:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29b
            r0 = r4
            r1 = r8
            com.sun.tools.javac.util.List r1 = r1.toList()
            r0.args = r1
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    private static void clearTypes(com.sun.tools.javac.tree.JCTree r4) {
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$3 r1 = new lombok.javac.handlers.JavacHandlerUtil$3
            r2 = r1
            r2.<init>()
            r0.accept(r1)
            return
    }

    private static void addError(java.lang.String r5, lombok.javac.JavacNode r6) {
            r0 = r6
            int r0 = r0.getLatestJavaSpecSupported()
            r1 = 8
            if (r0 >= r1) goto L27
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The correct format up to JDK7 is "
            r2.<init>(r3)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "=@__({@SomeAnnotation, @SomeOtherAnnotation}))"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            goto L42
        L27:
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The correct format for JDK8+ is "
            r2.<init>(r3)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "_={@SomeAnnotation, @SomeOtherAnnotation})"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
        L42:
            return
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> copyTypeParams(lombok.javac.JavacNode r5, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r6) {
            r0 = r6
            if (r0 == 0) goto Lb
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = r6
            return r0
        Ld:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L93
        L23:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.bounds
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L83
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L83
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.bounds
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L72
        L59:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r13 = r0
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L72:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L59
            r0 = r12
            com.sun.tools.javac.util.List r0 = r0.toList()
            r11 = r0
        L83:
            r0 = r7
            r1 = r8
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L93:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L23
            r0 = r7
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> getTypeUseAnnotations(com.sun.tools.javac.tree.JCTree.JCExpression r2) {
            r0 = r2
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.m92is(r0)
            if (r0 != 0) goto Lb
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            return r0
        Lb:
            r0 = r2
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getAnnotations(r0)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression removeTypeUseAnnotations(com.sun.tools.javac.tree.JCTree.JCExpression r2) {
            r0 = r2
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.m92is(r0)
            if (r0 != 0) goto L9
            r0 = r2
            return r0
        L9:
            r0 = r2
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getUnderlyingType(r0)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression namePlusTypeParamsToTypeReference(lombok.javac.JavacTreeMaker r7, lombok.javac.JavacNode r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r9) {
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r11 = r0
            r0 = r7
            r1 = r8
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r10
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r11
            r4 = r9
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression namePlusTypeParamsToTypeReference(lombok.javac.JavacTreeMaker r7, lombok.javac.JavacNode r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r10) {
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r11 = r0
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r12 = r0
            r0 = r7
            r1 = r8
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r12
            r4 = r9
            r5 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression namePlusTypeParamsToTypeReference(lombok.javac.JavacTreeMaker r7, lombok.javac.JavacNode r8, com.sun.tools.javac.util.Name r9, boolean r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression namePlusTypeParamsToTypeReference(lombok.javac.JavacTreeMaker r7, lombok.javac.JavacNode r8, com.sun.tools.javac.util.Name r9, boolean r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12) {
            r0 = 0
            r13 = r0
            r0 = r8
            if (r0 == 0) goto L6a
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L6a
            r0 = r8
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6a
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r14 = r0
            r0 = r10
            if (r0 == 0) goto L3d
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r15 = r0
            r0 = r10
            if (r0 == 0) goto L4c
            r0 = r14
            com.sun.tools.javac.util.List r0 = r0.typarams
            goto L4f
        L4c:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        L4f:
            r16 = r0
            r0 = r7
            r1 = r8
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r15
            r4 = r16
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4, r5)
            r13 = r0
        L6a:
            r0 = r13
            if (r0 != 0) goto L77
            r0 = r7
            r1 = r9
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            goto L7e
        L77:
            r0 = r7
            r1 = r13
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
        L7e:
            r13 = r0
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L91
            r0 = r12
            r1 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.create(r0, r1)
            r13 = r0
        L91:
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La7
            r0 = r7
            r1 = r13
            r2 = r7
            r3 = r11
            com.sun.tools.javac.util.List r2 = typeParameterNames(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r13 = r0
        La7:
            r0 = r13
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> typeParameterNames(lombok.javac.JavacTreeMaker r4, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r5) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L29
        L11:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r7 = r0
            r0 = r6
            r1 = r4
            r2 = r7
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L29:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static void sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(lombok.javac.JavacNode r5, lombok.javac.JavacNode r6) {
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r7 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L69
        L10:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
            java.util.List<java.lang.String> r0 = lombok.core.handlers.HandlerUtil.INVALID_ON_BUILDERS
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L5f
        L28:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r10
            r1 = r8
            boolean r0 = annotationTypeMatches(r0, r1)
            if (r0 == 0) goto L5f
            r0 = r10
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r12 = r0
            r0 = r7
            r1 = r12
            r2 = -1
            if (r1 != r2) goto L52
            r1 = r10
            goto L5b
        L52:
            r1 = r10
            r2 = r12
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
        L5b:
            com.sun.tools.javac.util.List r0 = r0.append(r1)
            r7 = r0
        L5f:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L28
        L69:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
            r0 = r7
            int r0 = r0.size()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L7d
            return
        L7d:
            r0 = r8
            r1 = 1
            if (r0 != r1) goto La4
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2 = r7
            java.lang.Object r2 = r2.head
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not allowed on builder classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        La4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto Ld6
        Lb6:
            r0 = r11
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r0 = r9
            java.lang.String r1 = "@"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        Ld6:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb6
            r0 = r9
            r1 = r9
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
            r0 = r6
            r1 = r9
            java.lang.String r2 = " are not allowed on builder classes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
    }

    static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> copyAnnotations(com.sun.tools.javac.util.List<? extends com.sun.tools.javac.tree.JCTree.JCExpression> r3) {
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L30
        L10:
            r0 = r6
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 != 0) goto L24
            goto L30
        L24:
            r0 = r4
            r1 = r5
            java.lang.Object r1 = r1.clone()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L30:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
            r0 = r4
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> mergeAnnotations(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r3, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r4) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
        Lb:
            r0 = r4
            return r0
        Ld:
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
        L18:
            r0 = r3
            return r0
        L1a:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L3c
        L2b:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r6 = r0
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L3c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2b
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L60
        L4f:
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r6 = r0
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L60:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4f
            r0 = r5
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static boolean isClass(lombok.javac.JavacNode r4) {
            r0 = r4
            r1 = 2305843009213719040(0x2000000000006200, double:1.491668146248351E-154)
            boolean r0 = isClassAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isClassOrEnum(lombok.javac.JavacNode r4) {
            r0 = r4
            r1 = 2305843009213702656(0x2000000000002200, double:1.4916681462429243E-154)
            boolean r0 = isClassAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isClassOrEnumOrInterface(lombok.javac.JavacNode r4) {
            r0 = r4
            r1 = 2305843009213702144(0x2000000000002000, double:1.4916681462427547E-154)
            boolean r0 = isClassAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isClassEnumOrRecord(lombok.javac.JavacNode r4) {
            r0 = r4
            r1 = 8704(0x2200, double:4.3003E-320)
            boolean r0 = isClassAndDoesNotHaveFlags(r0, r1)
            return r0
    }

    public static boolean isRecord(lombok.javac.JavacNode r5) {
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L22
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    public static boolean isClassAndDoesNotHaveFlags(lombok.javac.JavacNode r5, long r6) {
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r8 = r0
            goto L19
        L17:
            r0 = 0
            return r0
        L19:
            r0 = r8
            if (r0 != 0) goto L21
            r0 = 0
            goto L28
        L21:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
        L28:
            r9 = r0
            r0 = r9
            r1 = r6
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = 1
            return r0
        L35:
            r0 = 0
            return r0
    }

    public static boolean isStaticAllowed(lombok.javac.JavacNode r3) {
            r0 = r3
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L27
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            if (r0 == 0) goto L27
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT
            if (r0 == r1) goto L27
            r0 = r3
            boolean r0 = isRecord(r0)
            if (r0 != 0) goto L27
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }

    public static lombok.javac.JavacNode upToTypeNode(lombok.javac.JavacNode r4) {
            r0 = r4
            if (r0 != 0) goto L17
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "node"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r4 = r0
        L17:
            r0 = r4
            if (r0 == 0) goto L25
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto Lf
        L25:
            r0 = r4
            return r0
    }

    public static com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> cloneTypes(lombok.javac.JavacTreeMaker r5, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r6, lombok.javac.JavacNode r7) {
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            return r0
        Lb:
            r0 = r6
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L24
            r0 = r5
            r1 = r6
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = cloneType(r0, r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            return r0
        L24:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L4d
        L35:
            r0 = r10
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r9 = r0
            r0 = r8
            r1 = r5
            r2 = r9
            r3 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L4d:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L35
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.toList()
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCExpression cloneType(lombok.javac.JavacTreeMaker r3, com.sun.tools.javac.tree.JCTree.JCExpression r4, lombok.javac.JavacNode r5) {
            r0 = r3
            r1 = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = cloneType0(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L10
            r0 = r6
            r1 = r5
            com.sun.tools.javac.tree.JCTree r0 = recursiveSetGeneratedBy(r0, r1)
        L10:
            r0 = r6
            return r0
    }

    private static com.sun.tools.javac.tree.JCTree.JCExpression cloneType0(lombok.javac.JavacTreeMaker r4, com.sun.tools.javac.tree.JCTree r5) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L16
            r0 = r4
            r1 = r5
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            return r0
        L16:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L29
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = (com.sun.tools.javac.tree.JCTree.JCIdent) r1
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            return r0
        L29:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L46
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r6 = r0
            r0 = r4
            r1 = r4
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.selected
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType0(r1, r2)
            r2 = r6
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            return r0
        L46:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L5f
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            r6 = r0
            r0 = r4
            r1 = r4
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.elemtype
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType0(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = r0.TypeArray(r1)
            return r0
        L5f:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto Lb1
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            r6 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.arguments
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L96
        L7f:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r8 = r0
            r0 = r7
            r1 = r4
            r2 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType0(r1, r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L96:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7f
            r0 = r4
            r1 = r4
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.clazz
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = cloneType0(r1, r2)
            r2 = r7
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            return r0
        Lb1:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCWildcard
            if (r0 == 0) goto L115
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = (com.sun.tools.javac.tree.JCTree.JCWildcard) r0
            r6 = r0
            r0 = r4
            r1 = r6
            com.sun.tools.javac.tree.JCTree r1 = r1.inner
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = cloneType0(r0, r1)
            r7 = r0
            int[] r0 = $SWITCH_TABLE$com$sun$source$tree$Tree$Kind()
            r1 = r6
            com.sun.source.tree.Tree$Kind r1 = r1.getKind()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 88: goto L104;
                case 89: goto Lf8;
                case 90: goto Lec;
                default: goto L104;
            }
        Lec:
            r0 = r4
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.SUPER
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r0 = r0.TypeBoundKind(r1)
            r8 = r0
            goto L10d
        Lf8:
            r0 = r4
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.EXTENDS
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r0 = r0.TypeBoundKind(r1)
            r8 = r0
            goto L10d
        L104:
            r0 = r4
            com.sun.tools.javac.code.BoundKind r1 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r0 = r0.TypeBoundKind(r1)
            r8 = r0
        L10d:
            r0 = r4
            r1 = r8
            r2 = r7
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            return r0
        L115:
            r0 = r5
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.m92is(r0)
            if (r0 == 0) goto L133
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getUnderlyingType(r1)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = cloneType0(r0, r1)
            r6 = r0
            r0 = r5
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getAnnotations(r0)
            com.sun.tools.javac.util.List r0 = copyAnnotations(r0)
            r7 = r0
            r0 = r7
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.create(r0, r1)
            return r0
        L133:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            return r0
    }

    public static void copyJavadoc(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree r6, lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            copyJavadoc(r0, r1, r2, r3)
            return
    }

    public static void copyJavadoc(lombok.javac.JavacNode r4, com.sun.tools.javac.tree.JCTree r5, lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc r6, boolean r7) {
            r0 = r6
            if (r0 != 0) goto L8
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r0 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.VERBATIM
            r6 = r0
        L8:
            r0 = r4
            lombok.core.LombokNode r0 = r0.top()     // Catch: java.lang.Exception -> L36
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.Exception -> L36
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L36
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0     // Catch: java.lang.Exception -> L36
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r4
            java.lang.String r0 = r0.apply(r1, r2)     // Catch: java.lang.Exception -> L36
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L2b
            r0 = r9
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)     // Catch: java.lang.Exception -> L36
            r9 = r0
        L2b:
            r0 = r8
            r1 = r5
            r2 = r9
            lombok.javac.Javac.setDocComment(r0, r1, r2)     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
        L37:
            return
    }

    public static boolean isDirectDescendantOfObject(lombok.javac.JavacNode r4) {
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 != 0) goto L15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "not a type node"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.Javac.getExtendsClause(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            r0 = r6
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            r0 = 0
            return r0
        L41:
            r0 = 1
            return r0
    }

    public static void createRelevantNullableAnnotation(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCMethodDecl r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNullableAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToMethodDecl(r0, r1, r2, r3)
            return
    }

    public static void createRelevantNonNullAnnotation(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCMethodDecl r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNonNullAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToMethodDecl(r0, r1, r2, r3)
            return
    }

    public static void createRelevantNonNullAnnotation(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNonNullAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToVarDecl(r0, r1, r2, r3)
            return
    }

    public static void createRelevantNullableAnnotation(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r0 = r5
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.NullAnnotationLibrary> r1 = lombok.ConfigurationKeys.ADD_NULL_ANNOTATIONS
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.NullAnnotationLibrary r0 = (lombok.core.configuration.NullAnnotationLibrary) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L13
            return
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getNullableAnnotation()
            r3 = r7
            boolean r3 = r3.isTypeUse()
            applyAnnotationToVarDecl(r0, r1, r2, r3)
            return
    }

    private static void applyAnnotationToMethodDecl(lombok.javac.JavacNode r6, com.sun.tools.javac.tree.JCTree.JCMethodDecl r7, java.lang.String r8, boolean r9) {
            r0 = r8
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r6
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r10 = r0
            r0 = r10
            r1 = r6
            r2 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r11 = r0
            r0 = r9
            if (r0 == 0) goto Ld8
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L63
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            r13 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L5c
            r0 = r7
            r1 = r10
            r2 = r10
            r3 = r11
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            r4 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.clazz
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.AnnotatedType(r3, r4)
            r3 = r13
            com.sun.tools.javac.util.List r3 = r3.arguments
            com.sun.tools.javac.tree.JCTree$JCTypeApply r1 = r1.TypeApply(r2, r3)
            r0.restype = r1
            return
        L5c:
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r12 = r0
        L63:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L73
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L84
        L73:
            r0 = r7
            r1 = r10
            r2 = r11
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.AnnotatedType(r2, r3)
            r0.restype = r1
            return
        L84:
            r0 = r12
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.m92is(r0)
            if (r0 == 0) goto La0
            r0 = r12
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getAnnotations(r0)
            r13 = r0
            r0 = r12
            r1 = r13
            r2 = r11
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
            lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.setAnnotations(r0, r1)
            return
        La0:
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 != 0) goto Lb0
            r0 = r12
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto Lfd
        Lb0:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            if (r1 != 0) goto Lc6
            r1 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            goto Ld2
        Lc6:
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r11
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
        Ld2:
            r0.annotations = r1
            goto Lfd
        Ld8:
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            if (r1 != 0) goto Lee
            r1 = r11
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            goto Lfa
        Lee:
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r11
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
        Lfa:
            r0.annotations = r1
        Lfd:
            return
    }

    private static void applyAnnotationToVarDecl(lombok.javac.JavacNode r4, com.sun.tools.javac.tree.JCTree.JCVariableDecl r5, java.lang.String r6, boolean r7) {
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r8 = r0
            r0 = r8
            r1 = r4
            r2 = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r9 = r0
            r0 = r7
            if (r0 == 0) goto Lc5
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L3d
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            r11 = r0
            r0 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r10 = r0
        L3d:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 != 0) goto L4d
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L71
        L4d:
            r0 = r8
            r1 = r9
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.AnnotatedType(r1, r2)
            r10 = r0
            r0 = r11
            if (r0 == 0) goto L6a
            r0 = r11
            r1 = r10
            r0.clazz = r1
            goto L70
        L6a:
            r0 = r5
            r1 = r10
            r0.vartype = r1
        L70:
            return
        L71:
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.m92is(r0)
            if (r0 == 0) goto L8d
            r0 = r10
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.getAnnotations(r0)
            r12 = r0
            r0 = r10
            r1 = r12
            r2 = r9
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
            lombok.javac.handlers.JavacHandlerUtil.JCAnnotatedTypeReflect.setAnnotations(r0, r1)
            return
        L8d:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 != 0) goto L9d
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto Lea
        L9d:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            if (r1 != 0) goto Lb3
            r1 = r9
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            goto Lbf
        Lb3:
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r9
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
        Lbf:
            r0.annotations = r1
            goto Lea
        Lc5:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            if (r1 != 0) goto Ldb
            r1 = r9
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            goto Le7
        Ldb:
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            com.sun.tools.javac.util.List r1 = r1.annotations
            r2 = r9
            com.sun.tools.javac.util.List r1 = r1.prepend(r2)
        Le7:
            r0.annotations = r1
        Lea:
            return
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$lombok$core$AST$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.core.AST$Kind[] r0 = lombok.core.AST.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.INITIALIZER     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.LOCAL     // Catch: java.lang.NoSuchFieldError -> L60
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            goto L61
        L60:
        L61:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L6d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            goto L6e
        L6d:
        L6e:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.NoSuchFieldError -> L7b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            goto L7c
        L7b:
        L7c:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE_USE     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$AccessLevel() {
            int[] r0 = lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$lombok$AccessLevel
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.AccessLevel[] r0 = lombok.AccessLevel.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.MODULE     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE     // Catch: java.lang.NoSuchFieldError -> L2a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a
            goto L2b
        L2a:
        L2b:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PACKAGE     // Catch: java.lang.NoSuchFieldError -> L37
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37
            goto L38
        L37:
        L38:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PRIVATE     // Catch: java.lang.NoSuchFieldError -> L44
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
            goto L45
        L44:
        L45:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PROTECTED     // Catch: java.lang.NoSuchFieldError -> L51
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            goto L52
        L51:
        L52:
            r0 = r4
            lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC     // Catch: java.lang.NoSuchFieldError -> L5e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5e
            goto L5f
        L5e:
        L5f:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$lombok$AccessLevel = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$com$sun$source$tree$Tree$Kind() {
            int[] r0 = lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$com$sun$source$tree$Tree$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            com.sun.source.tree.Tree$Kind[] r0 = com.sun.source.tree.Tree.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.AND     // Catch: java.lang.NoSuchFieldError -> L1d
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
            r2 = 64
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            goto L1e
        L1d:
        L1e:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.AND_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
            r2 = 77
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            goto L2c
        L2b:
        L2c:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ANNOTATION     // Catch: java.lang.NoSuchFieldError -> L38
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38
            goto L39
        L38:
        L39:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ARRAY_ACCESS     // Catch: java.lang.NoSuchFieldError -> L45
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            goto L46
        L45:
        L46:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ARRAY_TYPE     // Catch: java.lang.NoSuchFieldError -> L52
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L52
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L52
            goto L53
        L52:
        L53:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ASSERT     // Catch: java.lang.NoSuchFieldError -> L5f
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5f
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5f
            goto L60
        L5f:
        L60:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L6c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            goto L6d
        L6c:
        L6d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BITWISE_COMPLEMENT     // Catch: java.lang.NoSuchFieldError -> L7a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7a
            r2 = 48
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7a
            goto L7b
        L7a:
        L7b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BLOCK     // Catch: java.lang.NoSuchFieldError -> L88
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
            r2 = 6
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            goto L89
        L88:
        L89:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BOOLEAN_LITERAL     // Catch: java.lang.NoSuchFieldError -> L96
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
            r2 = 84
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            goto L97
        L96:
        L97:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.BREAK     // Catch: java.lang.NoSuchFieldError -> La4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La4
            r2 = 7
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La4
            goto La5
        La4:
        La5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CASE     // Catch: java.lang.NoSuchFieldError -> Lb2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb2
            r2 = 8
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb2
            goto Lb3
        Lb2:
        Lb3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CATCH     // Catch: java.lang.NoSuchFieldError -> Lc0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
            r2 = 9
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            goto Lc1
        Lc0:
        Lc1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CHAR_LITERAL     // Catch: java.lang.NoSuchFieldError -> Lce
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lce
            r2 = 85
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lce
            goto Lcf
        Lce:
        Lcf:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CLASS     // Catch: java.lang.NoSuchFieldError -> Ldc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldc
            r2 = 10
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldc
            goto Ldd
        Ldc:
        Ldd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.COMPILATION_UNIT     // Catch: java.lang.NoSuchFieldError -> Lea
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lea
            r2 = 11
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lea
            goto Leb
        Lea:
        Leb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_AND     // Catch: java.lang.NoSuchFieldError -> Lf8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf8
            r2 = 67
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf8
            goto Lf9
        Lf8:
        Lf9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_EXPRESSION     // Catch: java.lang.NoSuchFieldError -> L106
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L106
            r2 = 12
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L106
            goto L107
        L106:
        L107:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONDITIONAL_OR     // Catch: java.lang.NoSuchFieldError -> L114
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L114
            r2 = 68
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L114
            goto L115
        L114:
        L115:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L122
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L122
            r2 = 13
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L122
            goto L123
        L122:
        L123:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DIVIDE     // Catch: java.lang.NoSuchFieldError -> L130
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L130
            r2 = 51
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L130
            goto L131
        L130:
        L131:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DIVIDE_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L13e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L13e
            r2 = 70
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L13e
            goto L13f
        L13e:
        L13f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DOUBLE_LITERAL     // Catch: java.lang.NoSuchFieldError -> L14c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L14c
            r2 = 83
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L14c
            goto L14d
        L14c:
        L14d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.DO_WHILE_LOOP     // Catch: java.lang.NoSuchFieldError -> L15a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15a
            r2 = 14
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15a
            goto L15b
        L15a:
        L15b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EMPTY_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L168
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L168
            r2 = 32
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L168
            goto L169
        L168:
        L169:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ENHANCED_FOR_LOOP     // Catch: java.lang.NoSuchFieldError -> L176
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L176
            r2 = 15
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L176
            goto L177
        L176:
        L177:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EQUAL_TO     // Catch: java.lang.NoSuchFieldError -> L184
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L184
            r2 = 62
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L184
            goto L185
        L184:
        L185:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.ERRONEOUS     // Catch: java.lang.NoSuchFieldError -> L192
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L192
            r2 = 91
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L192
            goto L193
        L192:
        L193:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXPRESSION_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L1a0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a0
            r2 = 16
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a0
            goto L1a1
        L1a0:
        L1a1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXTENDS_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L1ae
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ae
            r2 = 89
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ae
            goto L1af
        L1ae:
        L1af:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.FLOAT_LITERAL     // Catch: java.lang.NoSuchFieldError -> L1bc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1bc
            r2 = 82
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1bc
            goto L1bd
        L1bc:
        L1bd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.FOR_LOOP     // Catch: java.lang.NoSuchFieldError -> L1ca
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1ca
            r2 = 18
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1ca
            goto L1cb
        L1ca:
        L1cb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.GREATER_THAN     // Catch: java.lang.NoSuchFieldError -> L1d8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d8
            r2 = 59
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d8
            goto L1d9
        L1d8:
        L1d9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.GREATER_THAN_EQUAL     // Catch: java.lang.NoSuchFieldError -> L1e6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e6
            r2 = 61
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e6
            goto L1e7
        L1e6:
        L1e7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IDENTIFIER     // Catch: java.lang.NoSuchFieldError -> L1f4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f4
            r2 = 19
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f4
            goto L1f5
        L1f4:
        L1f5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IF     // Catch: java.lang.NoSuchFieldError -> L202
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L202
            r2 = 20
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L202
            goto L203
        L202:
        L203:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.IMPORT     // Catch: java.lang.NoSuchFieldError -> L210
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L210
            r2 = 21
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L210
            goto L211
        L210:
        L211:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.INSTANCE_OF     // Catch: java.lang.NoSuchFieldError -> L21e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L21e
            r2 = 22
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21e
            goto L21f
        L21e:
        L21f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.INT_LITERAL     // Catch: java.lang.NoSuchFieldError -> L22c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22c
            r2 = 80
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22c
            goto L22d
        L22c:
        L22d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LABELED_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L23a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L23a
            r2 = 23
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L23a
            goto L23b
        L23a:
        L23b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LEFT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L248
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L248
            r2 = 55
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L248
            goto L249
        L248:
        L249:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LEFT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L256
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L256
            r2 = 74
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L256
            goto L257
        L256:
        L257:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LESS_THAN     // Catch: java.lang.NoSuchFieldError -> L264
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L264
            r2 = 58
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L264
            goto L265
        L264:
        L265:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LESS_THAN_EQUAL     // Catch: java.lang.NoSuchFieldError -> L272
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L272
            r2 = 60
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L272
            goto L273
        L272:
        L273:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LOGICAL_COMPLEMENT     // Catch: java.lang.NoSuchFieldError -> L280
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L280
            r2 = 49
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L280
            goto L281
        L280:
        L281:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.LONG_LITERAL     // Catch: java.lang.NoSuchFieldError -> L28e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28e
            r2 = 81
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28e
            goto L28f
        L28e:
        L28f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MEMBER_SELECT     // Catch: java.lang.NoSuchFieldError -> L29c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29c
            r2 = 17
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29c
            goto L29d
        L29c:
        L29d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.METHOD     // Catch: java.lang.NoSuchFieldError -> L2aa
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2aa
            r2 = 24
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2aa
            goto L2ab
        L2aa:
        L2ab:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.METHOD_INVOCATION     // Catch: java.lang.NoSuchFieldError -> L2b8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b8
            r2 = 25
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b8
            goto L2b9
        L2b8:
        L2b9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MINUS     // Catch: java.lang.NoSuchFieldError -> L2c6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2c6
            r2 = 54
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2c6
            goto L2c7
        L2c6:
        L2c7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MINUS_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2d4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2d4
            r2 = 73
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2d4
            goto L2d5
        L2d4:
        L2d5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MODIFIERS     // Catch: java.lang.NoSuchFieldError -> L2e2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e2
            r2 = 26
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e2
            goto L2e3
        L2e2:
        L2e3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MULTIPLY     // Catch: java.lang.NoSuchFieldError -> L2f0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f0
            r2 = 50
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f0
            goto L2f1
        L2f0:
        L2f1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.MULTIPLY_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L2fe
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2fe
            r2 = 69
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2fe
            goto L2ff
        L2fe:
        L2ff:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NEW_ARRAY     // Catch: java.lang.NoSuchFieldError -> L30c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L30c
            r2 = 27
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L30c
            goto L30d
        L30c:
        L30d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NEW_CLASS     // Catch: java.lang.NoSuchFieldError -> L31a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L31a
            r2 = 28
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L31a
            goto L31b
        L31a:
        L31b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NOT_EQUAL_TO     // Catch: java.lang.NoSuchFieldError -> L328
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L328
            r2 = 63
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L328
            goto L329
        L328:
        L329:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.NULL_LITERAL     // Catch: java.lang.NoSuchFieldError -> L336
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L336
            r2 = 87
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L336
            goto L337
        L336:
        L337:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OR     // Catch: java.lang.NoSuchFieldError -> L344
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L344
            r2 = 66
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L344
            goto L345
        L344:
        L345:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OR_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L352
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L352
            r2 = 79
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L352
            goto L353
        L352:
        L353:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.OTHER     // Catch: java.lang.NoSuchFieldError -> L360
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L360
            r2 = 92
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L360
            goto L361
        L360:
        L361:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PARAMETERIZED_TYPE     // Catch: java.lang.NoSuchFieldError -> L36e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36e
            r2 = 37
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36e
            goto L36f
        L36e:
        L36f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PARENTHESIZED     // Catch: java.lang.NoSuchFieldError -> L37c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L37c
            r2 = 29
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L37c
            goto L37d
        L37c:
        L37d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PLUS     // Catch: java.lang.NoSuchFieldError -> L38a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38a
            r2 = 53
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L38a
            goto L38b
        L38a:
        L38b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PLUS_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L398
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L398
            r2 = 72
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L398
            goto L399
        L398:
        L399:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.POSTFIX_DECREMENT     // Catch: java.lang.NoSuchFieldError -> L3a6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a6
            r2 = 43
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a6
            goto L3a7
        L3a6:
        L3a7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.POSTFIX_INCREMENT     // Catch: java.lang.NoSuchFieldError -> L3b4
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b4
            r2 = 42
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b4
            goto L3b5
        L3b4:
        L3b5:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PREFIX_DECREMENT     // Catch: java.lang.NoSuchFieldError -> L3c2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c2
            r2 = 45
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c2
            goto L3c3
        L3c2:
        L3c3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PREFIX_INCREMENT     // Catch: java.lang.NoSuchFieldError -> L3d0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d0
            r2 = 44
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d0
            goto L3d1
        L3d0:
        L3d1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.PRIMITIVE_TYPE     // Catch: java.lang.NoSuchFieldError -> L3de
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3de
            r2 = 30
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3de
            goto L3df
        L3de:
        L3df:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.REMAINDER     // Catch: java.lang.NoSuchFieldError -> L3ec
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3ec
            r2 = 52
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3ec
            goto L3ed
        L3ec:
        L3ed:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.REMAINDER_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L3fa
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3fa
            r2 = 71
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3fa
            goto L3fb
        L3fa:
        L3fb:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RETURN     // Catch: java.lang.NoSuchFieldError -> L408
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L408
            r2 = 31
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L408
            goto L409
        L408:
        L409:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RIGHT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L416
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L416
            r2 = 56
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L416
            goto L417
        L416:
        L417:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.RIGHT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L424
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L424
            r2 = 75
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L424
            goto L425
        L424:
        L425:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.STRING_LITERAL     // Catch: java.lang.NoSuchFieldError -> L432
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L432
            r2 = 86
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L432
            goto L433
        L432:
        L433:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SUPER_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L440
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L440
            r2 = 90
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L440
            goto L441
        L440:
        L441:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SWITCH     // Catch: java.lang.NoSuchFieldError -> L44e
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44e
            r2 = 33
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44e
            goto L44f
        L44e:
        L44f:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SYNCHRONIZED     // Catch: java.lang.NoSuchFieldError -> L45c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45c
            r2 = 34
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45c
            goto L45d
        L45c:
        L45d:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.THROW     // Catch: java.lang.NoSuchFieldError -> L46a
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46a
            r2 = 35
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46a
            goto L46b
        L46a:
        L46b:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TRY     // Catch: java.lang.NoSuchFieldError -> L478
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L478
            r2 = 36
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L478
            goto L479
        L478:
        L479:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TYPE_CAST     // Catch: java.lang.NoSuchFieldError -> L486
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L486
            r2 = 38
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L486
            goto L487
        L486:
        L487:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.TYPE_PARAMETER     // Catch: java.lang.NoSuchFieldError -> L494
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L494
            r2 = 39
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L494
            goto L495
        L494:
        L495:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNARY_MINUS     // Catch: java.lang.NoSuchFieldError -> L4a2
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4a2
            r2 = 47
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4a2
            goto L4a3
        L4a2:
        L4a3:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNARY_PLUS     // Catch: java.lang.NoSuchFieldError -> L4b0
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4b0
            r2 = 46
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4b0
            goto L4b1
        L4b0:
        L4b1:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNBOUNDED_WILDCARD     // Catch: java.lang.NoSuchFieldError -> L4be
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4be
            r2 = 88
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4be
            goto L4bf
        L4be:
        L4bf:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNSIGNED_RIGHT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L4cc
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4cc
            r2 = 57
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4cc
            goto L4cd
        L4cc:
        L4cd:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L4da
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4da
            r2 = 76
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4da
            goto L4db
        L4da:
        L4db:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.VARIABLE     // Catch: java.lang.NoSuchFieldError -> L4e8
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e8
            r2 = 40
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e8
            goto L4e9
        L4e8:
        L4e9:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.WHILE_LOOP     // Catch: java.lang.NoSuchFieldError -> L4f6
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4f6
            r2 = 41
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4f6
            goto L4f7
        L4f6:
        L4f7:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.XOR     // Catch: java.lang.NoSuchFieldError -> L504
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L504
            r2 = 65
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L504
            goto L505
        L504:
        L505:
            r0 = r4
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.XOR_ASSIGNMENT     // Catch: java.lang.NoSuchFieldError -> L512
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L512
            r2 = 78
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L512
            goto L513
        L512:
        L513:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.JavacHandlerUtil.$SWITCH_TABLE$com$sun$source$tree$Tree$Kind = r1
            return r0
    }
}
