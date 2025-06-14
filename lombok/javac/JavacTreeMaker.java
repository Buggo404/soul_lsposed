package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker.SCL.lombok */
public class JavacTreeMaker {

    /* renamed from: tm */
    private final com.sun.tools.javac.tree.TreeMaker f584tm;
    private static final java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker.FieldId<?>, java.lang.Object> FIELD_CACHE = null;
    private static final java.lang.Object REFLECTIVE_ITEM_NOT_FOUND = null;
    private static final java.lang.Object REFLECTIVE_ITEM_MULTIPLE_FOUND = null;
    private static final java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker.MethodId<?>, java.lang.Object> METHOD_CACHE = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCCompilationUnit> TopLevel = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCImport> Import = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCClassDecl> ClassDef = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCMethodDecl> MethodDef = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCMethodDecl> MethodDefWithRecvParam = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCVariableDecl> VarDef = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCVariableDecl> ReceiverVarDef = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCSkip> Skip = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCBlock> Block = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCDoWhileLoop> DoLoop = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCWhileLoop> WhileLoop = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCForLoop> ForLoop = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop> ForeachLoop = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCLabeledStatement> Labelled = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCSwitch> Switch = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCCase> Case11 = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree> DefaultCaseLabel = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree> ConstantCaseLabel = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCSynchronized> Synchronized = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTry> Try = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTry> TryWithResources = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCCatch> Catch = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCConditional> Conditional = null;

    /* renamed from: If */
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCIf> f585If = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCExpressionStatement> Exec = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCBreak> Break11 = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCBreak> Break12 = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCContinue> Continue = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCReturn> Return = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCThrow> Throw = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAssert> Assert = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCMethodInvocation> Apply = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCNewClass> NewClass = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCNewArray> NewArray = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCParens> Parens = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAssign> Assign = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAssignOp> Assignop = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCUnary> Unary = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCBinary> Binary = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTypeCast> TypeCast = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCInstanceOf> TypeTest = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCArrayAccess> Indexed = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCFieldAccess> Select = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCIdent> Ident = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCLiteral> Literal = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree> TypeIdent = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCArrayTypeTree> TypeArray = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTypeApply> TypeApply = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTypeParameter> TypeParameter = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCTypeParameter> TypeParameterWithAnnos = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCWildcard> Wildcard = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.TypeBoundKind> TypeBoundKind = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAnnotation> Annotation = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAnnotation> TypeAnnotation = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCModifiers> ModifiersWithAnnotations = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCModifiers> Modifiers = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCErroneous> Erroneous = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCErroneous> ErroneousWithErrs = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.LetExpr> LetExpr = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCClassDecl> AnonymousClassDef = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.LetExpr> LetExprSingle = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCIdent> IdentVarDecl = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression>> Idents = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCMethodInvocation> App2 = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCMethodInvocation> App1 = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation>> Annotations = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCLiteral> LiteralWithValue = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAnnotation> AnnotationWithAttributeOnly = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCAnnotation> TypeAnnotationWithAttributeOnly = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCExpression> AnnotatedType = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCStatement> Call = null;
    private static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCExpression> Type = null;
    private static final lombok.javac.JavacTreeMaker.FieldId<com.sun.tools.javac.tree.JCTree.JCVariableDecl> MethodDecl_recvParam = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$Case12.SCL.lombok */
    public static class Case12 {
        private static final java.lang.Class<?> CASE_KIND_CLASS = null;
        static final lombok.javac.JavacTreeMaker.MethodId<com.sun.tools.javac.tree.JCTree.JCCase> Case12 = null;
        static final java.lang.Object CASE_KIND_STATEMENT = null;

        static {
                java.lang.Class<com.sun.tools.javac.tree.TreeMaker> r0 = com.sun.tools.javac.tree.TreeMaker.class
                java.lang.String r1 = "com.sun.source.tree.CaseTree$CaseKind"
                java.lang.Class r0 = lombok.javac.JavacTreeMaker.classForName(r0, r1)
                lombok.javac.JavacTreeMaker.Case12.CASE_KIND_CLASS = r0
                java.lang.String r0 = "Case"
                java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCase> r1 = com.sun.tools.javac.tree.JCTree.JCCase.class
                r2 = 4
                java.lang.Class[] r2 = new java.lang.Class[r2]
                r3 = r2
                r4 = 0
                java.lang.Class<?> r5 = lombok.javac.JavacTreeMaker.Case12.CASE_KIND_CLASS
                r3[r4] = r5
                r3 = r2
                r4 = 1
                java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
                r3[r4] = r5
                r3 = r2
                r4 = 2
                java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
                r3[r4] = r5
                r3 = r2
                r4 = 3
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
                r3[r4] = r5
                lombok.javac.JavacTreeMaker$MethodId r0 = lombok.javac.JavacTreeMaker.MethodId(r0, r1, r2)
                lombok.javac.JavacTreeMaker.Case12.Case12 = r0
                java.lang.Class<?> r0 = lombok.javac.JavacTreeMaker.Case12.CASE_KIND_CLASS
                java.lang.Object[] r0 = r0.getEnumConstants()
                r1 = 0
                r0 = r0[r1]
                lombok.javac.JavacTreeMaker.Case12.CASE_KIND_STATEMENT = r0
                return
        }

        public Case12() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$FieldId.SCL.lombok */
    private static final class FieldId<J> {
        private final java.lang.Class<?> owner;
        private final java.lang.String name;
        private final java.lang.Class<J> fieldType;

        FieldId(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<J> r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.owner = r1
                r0 = r3
                r1 = r5
                r0.name = r1
                r0 = r3
                r1 = r6
                r0.fieldType = r1
                return
        }

        static /* synthetic */ java.lang.Class access$0(lombok.javac.JavacTreeMaker.FieldId r2) {
                r0 = r2
                java.lang.Class<J> r0 = r0.fieldType
                return r0
        }

        static /* synthetic */ java.lang.Class access$1(lombok.javac.JavacTreeMaker.FieldId r2) {
                r0 = r2
                java.lang.Class<?> r0 = r0.owner
                return r0
        }

        static /* synthetic */ java.lang.String access$2(lombok.javac.JavacTreeMaker.FieldId r2) {
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$MethodId.SCL.lombok */
    private static final class MethodId<J> {
        private final java.lang.Class<?> owner;
        private final java.lang.String name;
        private final java.lang.Class<J> returnType;
        private final java.lang.Class<?>[] paramTypes;

        MethodId(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<J> r6, java.lang.Class<?>... r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.owner = r1
                r0 = r3
                r1 = r5
                r0.name = r1
                r0 = r3
                r1 = r7
                r0.paramTypes = r1
                r0 = r3
                r1 = r6
                r0.returnType = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                java.lang.Class<J> r1 = r1.returnType
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.Class<?> r1 = r1.owner
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "."
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.String r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 1
                r5 = r0
                r0 = r3
                java.lang.Class<?>[] r0 = r0.paramTypes
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L68
            L46:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r5
                if (r0 == 0) goto L55
                r0 = 0
                r5 = r0
                goto L5c
            L55:
                r0 = r4
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L5c:
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                int r7 = r7 + 1
            L68:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L46
                r0 = r4
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        static /* synthetic */ java.lang.Class access$0(lombok.javac.JavacTreeMaker.MethodId r2) {
                r0 = r2
                java.lang.Class<J> r0 = r0.returnType
                return r0
        }

        static /* synthetic */ java.lang.Class access$1(lombok.javac.JavacTreeMaker.MethodId r2) {
                r0 = r2
                java.lang.Class<?> r0 = r0.owner
                return r0
        }

        static /* synthetic */ java.lang.String access$2(lombok.javac.JavacTreeMaker.MethodId r2) {
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        static /* synthetic */ java.lang.Class[] access$3(lombok.javac.JavacTreeMaker.MethodId r2) {
                r0 = r2
                java.lang.Class<?>[] r0 = r0.paramTypes
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$SchroedingerType.SCL.lombok */
    private static class SchroedingerType {
        final java.lang.Object value;
        private static java.lang.reflect.Field NOSUCHFIELDEX_MARKER;

        static {
                java.lang.Class<lombok.javac.JavacTreeMaker$SchroedingerType> r0 = lombok.javac.JavacTreeMaker.SchroedingerType.class
                java.lang.String r1 = "NOSUCHFIELDEX_MARKER"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> Ld
                lombok.javac.JavacTreeMaker.SchroedingerType.NOSUCHFIELDEX_MARKER = r0     // Catch: java.lang.NoSuchFieldException -> Ld
                goto L13
            Ld:
                r3 = move-exception
                r0 = r3
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L13:
                return
        }

        private SchroedingerType(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                return
        }

        public int hashCode() {
                r2 = this;
                r0 = r2
                java.lang.Object r0 = r0.value
                if (r0 != 0) goto Lb
                r0 = -1
                goto L12
            Lb:
                r0 = r2
                java.lang.Object r0 = r0.value
                int r0 = r0.hashCode()
            L12:
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof lombok.javac.JavacTreeMaker.SchroedingerType
                if (r0 == 0) goto L2b
                r0 = r4
                lombok.javac.JavacTreeMaker$SchroedingerType r0 = (lombok.javac.JavacTreeMaker.SchroedingerType) r0
                java.lang.Object r0 = r0.value
                r5 = r0
                r0 = r3
                java.lang.Object r0 = r0.value
                if (r0 != 0) goto L22
                r0 = r5
                if (r0 != 0) goto L1e
                r0 = 1
                goto L2a
            L1e:
                r0 = 0
                goto L2a
            L22:
                r0 = r3
                java.lang.Object r0 = r0.value
                r1 = r5
                boolean r0 = r0.equals(r1)
            L2a:
                return r0
            L2b:
                r0 = 0
                return r0
        }

        static java.lang.Object getFieldCached(java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r4, java.lang.String r5, java.lang.String r6) {
                r0 = r4
                r1 = r6
                java.lang.Object r0 = r0.get(r1)
                r7 = r0
                r0 = r7
                if (r0 == 0) goto Le
                r0 = r7
                return r0
            Le:
                r0 = r5
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.NoSuchFieldException -> L1e java.lang.IllegalAccessException -> L26 java.lang.ClassNotFoundException -> L2e
                r1 = r6
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L1e java.lang.IllegalAccessException -> L26 java.lang.ClassNotFoundException -> L2e
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NoSuchFieldException -> L1e java.lang.IllegalAccessException -> L26 java.lang.ClassNotFoundException -> L2e
                r7 = r0
                goto L36
            L1e:
                r8 = move-exception
                r0 = r8
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L26:
                r8 = move-exception
                r0 = r8
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L2e:
                r8 = move-exception
                r0 = r8
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L36:
                r0 = r4
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                r0 = r7
                return r0
        }

        static java.lang.Object getFieldCached(java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> r4, java.lang.Object r5, java.lang.String r6) throws java.lang.NoSuchFieldException {
                r0 = r5
                java.lang.Class r0 = r0.getClass()
                r7 = r0
                r0 = r4
                r1 = r7
                java.lang.Object r0 = r0.get(r1)
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L50
                r0 = r7
                r1 = r6
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L20
                r8 = r0
                goto L33
            L20:
                r9 = move-exception
                r0 = r4
                r1 = r7
                java.lang.reflect.Field r2 = lombok.javac.JavacTreeMaker.SchroedingerType.NOSUCHFIELDEX_MARKER
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                r0 = r9
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L33:
                r0 = r8
                java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
                r0 = r4
                r1 = r7
                r2 = r8
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L50
                r0 = r9
                r8 = r0
            L50:
                r0 = r8
                java.lang.reflect.Field r1 = lombok.javac.JavacTreeMaker.SchroedingerType.NOSUCHFIELDEX_MARKER
                if (r0 != r1) goto L61
                java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r8
                r1 = r5
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L68
                return r0
            L68:
                r9 = move-exception
                r0 = r9
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
        }

        /* synthetic */ SchroedingerType(java.lang.Object r4, lombok.javac.JavacTreeMaker.SchroedingerType r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$TreeTag.SCL.lombok */
    public static class TreeTag extends lombok.javac.JavacTreeMaker.SchroedingerType {
        private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> TREE_TAG_CACHE = null;
        private static final java.lang.reflect.Field TAG_FIELD = null;
        private static final java.lang.reflect.Method TAG_METHOD = null;
        private static final lombok.javac.JavacTreeMaker.MethodId<java.lang.Integer> OP_PREC = null;

        static {
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                lombok.javac.JavacTreeMaker.TreeTag.TREE_TAG_CACHE = r0
                java.lang.Class<com.sun.tools.javac.tree.TreeInfo> r0 = com.sun.tools.javac.tree.TreeInfo.class
                java.lang.String r1 = "opPrec"
                java.lang.Class r2 = java.lang.Integer.TYPE
                r3 = 1
                java.lang.Class[] r3 = new java.lang.Class[r3]
                r4 = r3
                r5 = 0
                java.lang.Class<lombok.javac.JavacTreeMaker$TreeTag> r6 = lombok.javac.JavacTreeMaker.TreeTag.class
                r4[r5] = r6
                lombok.javac.JavacTreeMaker$MethodId r0 = lombok.javac.JavacTreeMaker.MethodId(r0, r1, r2, r3)
                lombok.javac.JavacTreeMaker.TreeTag.OP_PREC = r0
                r0 = 0
                r8 = r0
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r0 = com.sun.tools.javac.tree.JCTree.class
                java.lang.String r1 = "getTag"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L31
                r8 = r0
                goto L32
            L31:
            L32:
                r0 = r8
                if (r0 == 0) goto L41
                r0 = 0
                lombok.javac.JavacTreeMaker.TreeTag.TAG_FIELD = r0
                r0 = r8
                lombok.javac.JavacTreeMaker.TreeTag.TAG_METHOD = r0
                goto L57
            L41:
                r0 = 0
                r9 = r0
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r0 = com.sun.tools.javac.tree.JCTree.class
                java.lang.String r1 = "tag"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L4e
                r9 = r0
                goto L4f
            L4e:
            L4f:
                r0 = r9
                lombok.javac.JavacTreeMaker.TreeTag.TAG_FIELD = r0
                r0 = 0
                lombok.javac.JavacTreeMaker.TreeTag.TAG_METHOD = r0
            L57:
                return
        }

        private TreeTag(java.lang.Object r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 0
                r0.<init>(r1, r2)
                return
        }

        public static lombok.javac.JavacTreeMaker.TreeTag treeTag(com.sun.tools.javac.tree.JCTree r6) {
                java.lang.reflect.Method r0 = lombok.javac.JavacTreeMaker.TreeTag.TAG_METHOD     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                if (r0 == 0) goto L19
                lombok.javac.JavacTreeMaker$TreeTag r0 = new lombok.javac.JavacTreeMaker$TreeTag     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r1 = r0
                java.lang.reflect.Method r2 = lombok.javac.JavacTreeMaker.TreeTag.TAG_METHOD     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r3 = r6
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r1.<init>(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                return r0
            L19:
                lombok.javac.JavacTreeMaker$TreeTag r0 = new lombok.javac.JavacTreeMaker$TreeTag     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r1 = r0
                java.lang.reflect.Field r2 = lombok.javac.JavacTreeMaker.TreeTag.TAG_FIELD     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r3 = r6
                java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                r1.<init>(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.IllegalAccessException -> L31
                return r0
            L28:
                r7 = move-exception
                r0 = r7
                java.lang.Throwable r0 = r0.getCause()
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L31:
                r7 = move-exception
                r0 = r7
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
        }

        public static lombok.javac.JavacTreeMaker.TreeTag treeTag(java.lang.String r6) {
                lombok.javac.JavacTreeMaker$TreeTag r0 = new lombok.javac.JavacTreeMaker$TreeTag
                r1 = r0
                java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r2 = lombok.javac.JavacTreeMaker.TreeTag.TREE_TAG_CACHE
                int r3 = lombok.javac.Javac.getJavaCompilerVersion()
                r4 = 8
                if (r3 >= r4) goto L14
                java.lang.String r3 = "com.sun.tools.javac.tree.JCTree"
                goto L16
            L14:
                java.lang.String r3 = "com.sun.tools.javac.tree.JCTree$Tag"
            L16:
                r4 = r6
                java.lang.Object r2 = getFieldCached(r2, r3, r4)
                r1.<init>(r2)
                return r0
        }

        public int getOperatorPrecedenceLevel() {
                r7 = this;
                r0 = 0
                lombok.javac.JavacTreeMaker$MethodId<java.lang.Integer> r1 = lombok.javac.JavacTreeMaker.TreeTag.OP_PREC
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r7
                java.lang.Object r5 = r5.value
                r3[r4] = r5
                java.lang.Object r0 = lombok.javac.JavacTreeMaker.access$0(r0, r1, r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
        }

        public boolean isPrefixUnaryOp() {
                r3 = this;
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_NEG
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_POS
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_NOT
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_COMPL
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_PREDEC
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                lombok.javac.JavacTreeMaker$TreeTag r0 = lombok.javac.Javac.CTC_PREINC
                r1 = r3
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                r0 = 0
                return r0
            L3e:
                r0 = 1
                return r0
        }

        @Override // lombok.javac.JavacTreeMaker.SchroedingerType
        public /* bridge */ /* synthetic */ int hashCode() {
                r2 = this;
                r0 = r2
                int r0 = super.hashCode()
                return r0
        }

        @Override // lombok.javac.JavacTreeMaker.SchroedingerType
        public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                boolean r0 = super.equals(r1)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacTreeMaker$TypeTag.SCL.lombok */
    public static class TypeTag extends lombok.javac.JavacTreeMaker.SchroedingerType {
        private static final java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> TYPE_TAG_CACHE = null;
        private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> FIELD_CACHE = null;
        private static final java.lang.reflect.Method TYPE_TYPETAG_METHOD = null;

        static {
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                lombok.javac.JavacTreeMaker.TypeTag.TYPE_TAG_CACHE = r0
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r1 = r0
                r1.<init>()
                lombok.javac.JavacTreeMaker.TypeTag.FIELD_CACHE = r0
                r0 = 0
                r4 = r0
                java.lang.Class<com.sun.tools.javac.code.Type> r0 = com.sun.tools.javac.code.Type.class
                java.lang.String r1 = "getTag"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L25
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L25
                r4 = r0
                goto L26
            L25:
            L26:
                r0 = r4
                lombok.javac.JavacTreeMaker.TypeTag.TYPE_TYPETAG_METHOD = r0
                return
        }

        private TypeTag(java.lang.Object r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 0
                r0.<init>(r1, r2)
                return
        }

        public static lombok.javac.JavacTreeMaker.TypeTag typeTag(com.sun.tools.javac.tree.JCTree r6) {
                lombok.javac.JavacTreeMaker$TypeTag r0 = new lombok.javac.JavacTreeMaker$TypeTag     // Catch: java.lang.NoSuchFieldException -> L11
                r1 = r0
                java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> r2 = lombok.javac.JavacTreeMaker.TypeTag.FIELD_CACHE     // Catch: java.lang.NoSuchFieldException -> L11
                r3 = r6
                java.lang.String r4 = "typetag"
                java.lang.Object r2 = getFieldCached(r2, r3, r4)     // Catch: java.lang.NoSuchFieldException -> L11
                r1.<init>(r2)     // Catch: java.lang.NoSuchFieldException -> L11
                return r0
            L11:
                r7 = move-exception
                r0 = r7
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
        }

        public static lombok.javac.JavacTreeMaker.TypeTag typeTag(com.sun.tools.javac.code.Type r6) {
                r0 = r6
                if (r0 != 0) goto L8
                lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_VOID
                return r0
            L8:
                lombok.javac.JavacTreeMaker$TypeTag r0 = new lombok.javac.JavacTreeMaker$TypeTag     // Catch: java.lang.NoSuchFieldException -> L19
                r1 = r0
                java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> r2 = lombok.javac.JavacTreeMaker.TypeTag.FIELD_CACHE     // Catch: java.lang.NoSuchFieldException -> L19
                r3 = r6
                java.lang.String r4 = "tag"
                java.lang.Object r2 = getFieldCached(r2, r3, r4)     // Catch: java.lang.NoSuchFieldException -> L19
                r1.<init>(r2)     // Catch: java.lang.NoSuchFieldException -> L19
                return r0
            L19:
                java.lang.reflect.Method r0 = lombok.javac.JavacTreeMaker.TypeTag.TYPE_TYPETAG_METHOD
                if (r0 != 0) goto L40
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                java.lang.String r4 = "Type "
                r3.<init>(r4)
                r3 = r6
                java.lang.Class r3 = r3.getClass()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " has neither 'tag' nor getTag()"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L40:
                lombok.javac.JavacTreeMaker$TypeTag r0 = new lombok.javac.JavacTreeMaker$TypeTag     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L59
                r1 = r0
                java.lang.reflect.Method r2 = lombok.javac.JavacTreeMaker.TypeTag.TYPE_TYPETAG_METHOD     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L59
                r3 = r6
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L59
                java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L59
                r1.<init>(r2)     // Catch: java.lang.IllegalAccessException -> L53 java.lang.reflect.InvocationTargetException -> L59
                return r0
            L53:
                r7 = move-exception
                r0 = r7
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
            L59:
                r7 = move-exception
                r0 = r7
                java.lang.Throwable r0 = r0.getCause()
                java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
                throw r0
        }

        public static lombok.javac.JavacTreeMaker.TypeTag typeTag(java.lang.String r6) {
                lombok.javac.JavacTreeMaker$TypeTag r0 = new lombok.javac.JavacTreeMaker$TypeTag
                r1 = r0
                java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> r2 = lombok.javac.JavacTreeMaker.TypeTag.TYPE_TAG_CACHE
                int r3 = lombok.javac.Javac.getJavaCompilerVersion()
                r4 = 8
                if (r3 >= r4) goto L14
                java.lang.String r3 = "com.sun.tools.javac.code.TypeTags"
                goto L16
            L14:
                java.lang.String r3 = "com.sun.tools.javac.code.TypeTag"
            L16:
                r4 = r6
                java.lang.Object r2 = getFieldCached(r2, r3, r4)
                r1.<init>(r2)
                return r0
        }

        @Override // lombok.javac.JavacTreeMaker.SchroedingerType
        public /* bridge */ /* synthetic */ int hashCode() {
                r2 = this;
                r0 = r2
                int r0 = super.hashCode()
                return r0
        }

        @Override // lombok.javac.JavacTreeMaker.SchroedingerType
        public /* bridge */ /* synthetic */ boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                boolean r0 = super.equals(r1)
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            lombok.javac.JavacTreeMaker.FIELD_CACHE = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_MULTIPLE_FOUND = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            lombok.javac.JavacTreeMaker.METHOD_CACHE = r0
            java.lang.String r0 = "TopLevel"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TopLevel = r0
            java.lang.String r0 = "Import"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Import = r0
            java.lang.String r0 = "ClassDef"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.ClassDef = r0
            java.lang.String r0 = "MethodDef"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r1 = com.sun.tools.javac.tree.JCTree.JCMethodDecl.class
            r2 = 8
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCModifiers> r5 = com.sun.tools.javac.tree.JCTree.JCModifiers.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 5
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 6
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            r3 = r2
            r4 = 7
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.MethodDef = r0
            java.lang.String r0 = "MethodDef"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r1 = com.sun.tools.javac.tree.JCTree.JCMethodDecl.class
            r2 = 9
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCModifiers> r5 = com.sun.tools.javac.tree.JCTree.JCModifiers.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r5 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            r3[r4] = r5
            r3 = r2
            r4 = 5
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 6
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 7
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            r3 = r2
            r4 = 8
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.MethodDefWithRecvParam = r0
            java.lang.String r0 = "VarDef"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.VarDef = r0
            java.lang.String r0 = "ReceiverVarDef"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.ReceiverVarDef = r0
            java.lang.String r0 = "Skip"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Skip = r0
            java.lang.String r0 = "Block"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Block = r0
            java.lang.String r0 = "DoLoop"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.DoLoop = r0
            java.lang.String r0 = "WhileLoop"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.WhileLoop = r0
            java.lang.String r0 = "ForLoop"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.ForLoop = r0
            java.lang.String r0 = "ForeachLoop"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.ForeachLoop = r0
            java.lang.String r0 = "Labelled"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Labelled = r0
            java.lang.String r0 = "Switch"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Switch = r0
            java.lang.String r0 = "Case"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCase> r1 = com.sun.tools.javac.tree.JCTree.JCCase.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Case11 = r0
            java.lang.String r0 = "DefaultCaseLabel"
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r1 = com.sun.tools.javac.tree.JCTree.class
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.DefaultCaseLabel = r0
            java.lang.String r0 = "ConstantCaseLabel"
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r1 = com.sun.tools.javac.tree.JCTree.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.ConstantCaseLabel = r0
            java.lang.String r0 = "Synchronized"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Synchronized = r0
            java.lang.String r0 = "Try"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCTry> r1 = com.sun.tools.javac.tree.JCTree.JCTry.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Try = r0
            java.lang.String r0 = "Try"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCTry> r1 = com.sun.tools.javac.tree.JCTree.JCTry.class
            r2 = 4
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBlock> r5 = com.sun.tools.javac.tree.JCTree.JCBlock.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.TryWithResources = r0
            java.lang.String r0 = "Catch"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Catch = r0
            java.lang.String r0 = "Conditional"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Conditional = r0
            java.lang.String r0 = "If"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.f585If = r0
            java.lang.String r0 = "Exec"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Exec = r0
            java.lang.String r0 = "Break"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBreak> r1 = com.sun.tools.javac.tree.JCTree.JCBreak.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Break11 = r0
            java.lang.String r0 = "Break"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCBreak> r1 = com.sun.tools.javac.tree.JCTree.JCBreak.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Break12 = r0
            java.lang.String r0 = "Continue"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Continue = r0
            java.lang.String r0 = "Return"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Return = r0
            java.lang.String r0 = "Throw"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Throw = r0
            java.lang.String r0 = "Assert"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Assert = r0
            java.lang.String r0 = "Apply"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Apply = r0
            java.lang.String r0 = "NewClass"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.NewClass = r0
            java.lang.String r0 = "NewArray"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.NewArray = r0
            java.lang.String r0 = "Parens"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Parens = r0
            java.lang.String r0 = "Assign"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Assign = r0
            java.lang.String r0 = "Assignop"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Assignop = r0
            java.lang.String r0 = "Unary"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Unary = r0
            java.lang.String r0 = "Binary"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Binary = r0
            java.lang.String r0 = "TypeCast"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeCast = r0
            java.lang.String r0 = "TypeTest"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeTest = r0
            java.lang.String r0 = "Indexed"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Indexed = r0
            java.lang.String r0 = "Select"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Select = r0
            java.lang.String r0 = "Ident"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCIdent> r1 = com.sun.tools.javac.tree.JCTree.JCIdent.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Ident = r0
            java.lang.String r0 = "Literal"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCLiteral> r1 = com.sun.tools.javac.tree.JCTree.JCLiteral.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<lombok.javac.JavacTreeMaker$TypeTag> r5 = lombok.javac.JavacTreeMaker.TypeTag.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Literal = r0
            java.lang.String r0 = "TypeIdent"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeIdent = r0
            java.lang.String r0 = "TypeArray"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeArray = r0
            java.lang.String r0 = "TypeApply"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeApply = r0
            java.lang.String r0 = "TypeParameter"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = com.sun.tools.javac.tree.JCTree.JCTypeParameter.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.TypeParameter = r0
            java.lang.String r0 = "TypeParameter"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = com.sun.tools.javac.tree.JCTree.JCTypeParameter.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.Name> r5 = com.sun.tools.javac.util.Name.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.TypeParameterWithAnnos = r0
            java.lang.String r0 = "Wildcard"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Wildcard = r0
            java.lang.String r0 = "TypeBoundKind"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.TypeBoundKind = r0
            java.lang.String r0 = "Annotation"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = com.sun.tools.javac.tree.JCTree.JCAnnotation.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Annotation = r0
            java.lang.String r0 = "TypeAnnotation"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = com.sun.tools.javac.tree.JCTree.JCAnnotation.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.TypeAnnotation = r0
            java.lang.String r0 = "Modifiers"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCModifiers> r1 = com.sun.tools.javac.tree.JCTree.JCModifiers.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.ModifiersWithAnnotations = r0
            java.lang.String r0 = "Modifiers"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCModifiers> r1 = com.sun.tools.javac.tree.JCTree.JCModifiers.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Modifiers = r0
            java.lang.String r0 = "Erroneous"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCErroneous> r1 = com.sun.tools.javac.tree.JCTree.JCErroneous.class
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.Erroneous = r0
            java.lang.String r0 = "Erroneous"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCErroneous> r1 = com.sun.tools.javac.tree.JCTree.JCErroneous.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.ErroneousWithErrs = r0
            java.lang.String r0 = "LetExpr"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$LetExpr> r1 = com.sun.tools.javac.tree.JCTree.LetExpr.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.LetExpr = r0
            java.lang.String r0 = "AnonymousClassDef"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.AnonymousClassDef = r0
            java.lang.String r0 = "LetExpr"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$LetExpr> r1 = com.sun.tools.javac.tree.JCTree.LetExpr.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r5 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.LetExprSingle = r0
            java.lang.String r0 = "Ident"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCIdent> r1 = com.sun.tools.javac.tree.JCTree.JCIdent.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r5 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.IdentVarDecl = r0
            java.lang.String r0 = "Idents"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Idents = r0
            java.lang.String r0 = "App"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodInvocation> r1 = com.sun.tools.javac.tree.JCTree.JCMethodInvocation.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.App2 = r0
            java.lang.String r0 = "App"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodInvocation> r1 = com.sun.tools.javac.tree.JCTree.JCMethodInvocation.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.App1 = r0
            java.lang.String r0 = "Annotations"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Annotations = r0
            java.lang.String r0 = "Literal"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCLiteral> r1 = com.sun.tools.javac.tree.JCTree.JCLiteral.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.LiteralWithValue = r0
            java.lang.String r0 = "Annotation"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = com.sun.tools.javac.tree.JCTree.JCAnnotation.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.code.Attribute> r5 = com.sun.tools.javac.code.Attribute.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.AnnotationWithAttributeOnly = r0
            java.lang.String r0 = "TypeAnnotation"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = com.sun.tools.javac.tree.JCTree.JCAnnotation.class
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.code.Attribute> r5 = com.sun.tools.javac.code.Attribute.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.TypeAnnotationWithAttributeOnly = r0
            java.lang.String r0 = "AnnotatedType"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r1 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<com.sun.tools.javac.util.List> r5 = com.sun.tools.javac.util.List.class
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r5 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            r3[r4] = r5
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.AnnotatedType = r0
            java.lang.String r0 = "Call"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Call = r0
            java.lang.String r0 = "Type"
            lombok.javac.JavacTreeMaker$MethodId r0 = MethodId(r0)
            lombok.javac.JavacTreeMaker.Type = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r0 = com.sun.tools.javac.tree.JCTree.JCMethodDecl.class
            java.lang.String r1 = "recvparam"
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r2 = com.sun.tools.javac.tree.JCTree.JCVariableDecl.class
            lombok.javac.JavacTreeMaker$FieldId r0 = FieldId(r0, r1, r2)
            lombok.javac.JavacTreeMaker.MethodDecl_recvParam = r0
            return
    }

    public JavacTreeMaker(com.sun.tools.javac.tree.TreeMaker r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.f584tm = r1
            return
    }

    public com.sun.tools.javac.tree.TreeMaker getUnderlyingTreeMaker() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.tree.TreeMaker r0 = r0.f584tm
            return r0
    }

    /* renamed from: at */
    public lombok.javac.JavacTreeMaker m80at(int r4) {
            r3 = this;
            r0 = r3
            com.sun.tools.javac.tree.TreeMaker r0 = r0.f584tm
            r1 = r4
            com.sun.tools.javac.tree.TreeMaker r0 = r0.at(r1)
            r0 = r3
            return r0
    }

    static <J> lombok.javac.JavacTreeMaker.MethodId<J> MethodId(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<J> r9, java.lang.Class<?>... r10) {
            lombok.javac.JavacTreeMaker$MethodId r0 = new lombok.javac.JavacTreeMaker$MethodId
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    static <J> lombok.javac.JavacTreeMaker.MethodId<J> MethodId(java.lang.String r7, java.lang.Class<J> r8, java.lang.Class<?>... r9) {
            lombok.javac.JavacTreeMaker$MethodId r0 = new lombok.javac.JavacTreeMaker$MethodId
            r1 = r0
            java.lang.Class<com.sun.tools.javac.tree.TreeMaker> r2 = com.sun.tools.javac.tree.TreeMaker.class
            r3 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    static <J> lombok.javac.JavacTreeMaker.MethodId<J> MethodId(java.lang.String r7) {
            java.lang.Class<lombok.javac.JavacTreeMaker> r0 = lombok.javac.JavacTreeMaker.class
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L3e
        Lf:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            r0 = r8
            java.lang.Class r0 = r0.getReturnType()
            r12 = r0
            r0 = r8
            java.lang.Class[] r0 = r0.getParameterTypes()
            r13 = r0
            lombok.javac.JavacTreeMaker$MethodId r0 = new lombok.javac.JavacTreeMaker$MethodId
            r1 = r0
            java.lang.Class<com.sun.tools.javac.tree.TreeMaker> r2 = com.sun.tools.javac.tree.TreeMaker.class
            r3 = r7
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            return r0
        L3b:
            int r9 = r9 + 1
        L3e:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto Lf
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Not found: "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static <J> lombok.javac.JavacTreeMaker.FieldId<J> FieldId(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<J> r8) {
            lombok.javac.JavacTreeMaker$FieldId r0 = new lombok.javac.JavacTreeMaker$FieldId
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    private static boolean has(lombok.javac.JavacTreeMaker.FieldId<?> r3) {
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$FieldId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.FIELD_CACHE
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            r0 = r4
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            if (r0 != r1) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = r3
            java.lang.reflect.Field r0 = getFromCache(r0)     // Catch: java.lang.IllegalStateException -> L28
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND     // Catch: java.lang.IllegalStateException -> L28
            if (r0 == r1) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
        L28:
            r0 = 0
            return r0
    }

    private static <J> J get(java.lang.Object r4, lombok.javac.JavacTreeMaker.FieldId<J> r5) {
            r0 = r5
            java.lang.reflect.Field r0 = getFromCache(r0)
            r6 = r0
            r0 = r5
            java.lang.Class r0 = lombok.javac.JavacTreeMaker.FieldId.access$0(r0)     // Catch: java.lang.IllegalAccessException -> L12
            r1 = r6
            r2 = r4
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> L12
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.IllegalAccessException -> L12
            return r0
        L12:
            r7 = move-exception
            r0 = r7
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
    }

    private static <J> void set(java.lang.Object r5, lombok.javac.JavacTreeMaker.FieldId<J> r6, J r7) {
            r0 = r6
            java.lang.reflect.Field r0 = getFromCache(r0)
            r8 = r0
            r0 = r8
            r1 = r5
            r2 = r7
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> Le java.lang.IllegalArgumentException -> L16
            goto L32
        Le:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L16:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Type mismatch for: "
            r2.<init>(r3)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r9
            throw r0
        L32:
            return
    }

    private static java.lang.reflect.Field getFromCache(lombok.javac.JavacTreeMaker.FieldId<?> r6) {
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$FieldId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.FIELD_CACHE
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L11
            r0 = r6
            java.lang.Object r0 = addToCache(r0)
            r7 = r0
        L11:
            r0 = r7
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            if (r0 != r1) goto L31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Lombok TreeMaker frontend issue: no match when looking for field: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L31:
            r0 = r7
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            return r0
    }

    private static java.lang.Object addToCache(lombok.javac.JavacTreeMaker.FieldId<?> r4) {
            r0 = r4
            java.lang.Class r0 = lombok.javac.JavacTreeMaker.FieldId.access$1(r0)
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L3f
        L11:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r4
            java.lang.String r0 = lombok.javac.JavacTreeMaker.FieldId.access$2(r0)
            r1 = r5
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r5
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto L33
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)
        L33:
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$FieldId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.FIELD_CACHE
            r1 = r4
            r2 = r5
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            return r0
        L3c:
            int r6 = r6 + 1
        L3f:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L11
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$FieldId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.FIELD_CACHE
            r1 = r4
            java.lang.Object r2 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            return r0
    }

    private boolean has(lombok.javac.JavacTreeMaker.MethodId<?> r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            r0 = r5
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            if (r0 != r1) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = r4
            java.lang.reflect.Method r0 = getFromCache(r0)     // Catch: java.lang.IllegalStateException -> L28
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND     // Catch: java.lang.IllegalStateException -> L28
            if (r0 == r1) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
        L28:
            r0 = 0
            return r0
    }

    private <J> J invoke(lombok.javac.JavacTreeMaker.MethodId<J> r5, java.lang.Object... r6) {
            r4 = this;
            r0 = r4
            com.sun.tools.javac.tree.TreeMaker r0 = r0.f584tm
            r1 = r5
            r2 = r6
            java.lang.Object r0 = invokeAny(r0, r1, r2)
            return r0
    }

    private static <J> J invokeAny(java.lang.Object r5, lombok.javac.JavacTreeMaker.MethodId<J> r6, java.lang.Object... r7) {
            r0 = r6
            java.lang.reflect.Method r0 = getFromCache(r0)
            r8 = r0
            r0 = r6
            java.lang.Class r0 = lombok.javac.JavacTreeMaker.MethodId.access$0(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            boolean r0 = r0.isPrimitive()     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            if (r0 == 0) goto L16
            r0 = r8
            r1 = r5
            r2 = r7
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            return r0
        L16:
            r0 = r6
            java.lang.Class r0 = lombok.javac.JavacTreeMaker.MethodId.access$0(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            r1 = r8
            r2 = r5
            r3 = r7
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L2f java.lang.IllegalArgumentException -> L37
            return r0
        L24:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L2f:
            r9 = move-exception
            r0 = r9
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L37:
            r9 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Type mismatch for: "
            r2.<init>(r3)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r9
            throw r0
    }

    private static boolean tryResolve(lombok.javac.JavacTreeMaker.MethodId<?> r3) {
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L11
            r0 = r3
            java.lang.Object r0 = addToCache(r0)
            r4 = r0
        L11:
            r0 = r4
            boolean r0 = r0 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Method getFromCache(lombok.javac.JavacTreeMaker.MethodId<?> r6) {
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L11
            r0 = r6
            java.lang.Object r0 = addToCache(r0)
            r7 = r0
        L11:
            r0 = r7
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_MULTIPLE_FOUND
            if (r0 != r1) goto L31
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Lombok TreeMaker frontend issue: multiple matches when looking for method: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L31:
            r0 = r7
            java.lang.Object r1 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            if (r0 != r1) goto L51
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Lombok TreeMaker frontend issue: no match when looking for method: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    private static java.lang.Object addToCache(lombok.javac.JavacTreeMaker.MethodId<?> r4) {
            r0 = 0
            r5 = r0
            r0 = r4
            java.lang.Class r0 = lombok.javac.JavacTreeMaker.MethodId.access$1(r0)
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto Lbd
        L14:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            java.lang.String r0 = lombok.javac.JavacTreeMaker.MethodId.access$2(r0)
            r1 = r6
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto Lba
        L2a:
            r0 = r6
            java.lang.Class[] r0 = r0.getParameterTypes()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r1 = r4
            java.lang.Class[] r1 = lombok.javac.JavacTreeMaker.MethodId.access$3(r1)
            int r1 = r1.length
            if (r0 == r1) goto L3e
            goto Lba
        L3e:
            r0 = 0
            r11 = r0
            goto L9a
        L44:
            java.lang.Class<com.sun.tools.javac.code.Symbol> r0 = com.sun.tools.javac.code.Symbol.class
            r1 = r10
            r2 = r11
            r1 = r1[r2]
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L55
            goto Lba
        L55:
            java.lang.Class<lombok.javac.JavacTreeMaker$SchroedingerType> r0 = lombok.javac.JavacTreeMaker.SchroedingerType.class
            r1 = r4
            java.lang.Class[] r1 = lombok.javac.JavacTreeMaker.MethodId.access$3(r1)
            r2 = r11
            r1 = r1[r2]
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L97
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L82
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            r1 = r4
            java.lang.Class[] r1 = lombok.javac.JavacTreeMaker.MethodId.access$3(r1)
            r2 = r11
            r1 = r1[r2]
            if (r0 == r1) goto L97
            goto Lba
        L82:
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            r1 = r4
            java.lang.Class[] r1 = lombok.javac.JavacTreeMaker.MethodId.access$3(r1)
            r2 = r11
            r1 = r1[r2]
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L97
            goto Lba
        L97:
            int r11 = r11 + 1
        L9a:
            r0 = r11
            r1 = r10
            int r1 = r1.length
            if (r0 < r1) goto L44
            r0 = r5
            if (r0 != 0) goto Lab
            r0 = r6
            r5 = r0
            goto Lba
        Lab:
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r4
            java.lang.Object r2 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_MULTIPLE_FOUND
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            java.lang.Object r0 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_MULTIPLE_FOUND
            return r0
        Lba:
            int r7 = r7 + 1
        Lbd:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L14
            r0 = r5
            if (r0 != 0) goto Ld6
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r4
            java.lang.Object r2 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            java.lang.Object r0 = lombok.javac.JavacTreeMaker.REFLECTIVE_ITEM_NOT_FOUND
            return r0
        Ld6:
            r0 = r5
            java.lang.reflect.AccessibleObject r0 = lombok.permit.Permit.setAccessible(r0)
            java.util.concurrent.ConcurrentHashMap<lombok.javac.JavacTreeMaker$MethodId<?>, java.lang.Object> r0 = lombok.javac.JavacTreeMaker.METHOD_CACHE
            r1 = r4
            r2 = r5
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lea
            r0 = r5
            return r0
        Lea:
            r0 = r6
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCCompilationUnit TopLevel(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCCompilationUnit> r1 = lombok.javac.JavacTreeMaker.TopLevel
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCImport Import(com.sun.tools.javac.tree.JCTree r8, boolean r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCImport> r1 = lombok.javac.JavacTreeMaker.Import
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCImport r0 = (com.sun.tools.javac.tree.JCTree.JCImport) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCClassDecl ClassDef(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.util.Name r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r10, com.sun.tools.javac.tree.JCTree.JCExpression r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r13) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCClassDecl> r1 = lombok.javac.JavacTreeMaker.ClassDef
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r12
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = r13
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl MethodDef(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.util.Name r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r13, com.sun.tools.javac.tree.JCTree.JCBlock r14, com.sun.tools.javac.tree.JCTree.JCExpression r15) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r1 = lombok.javac.JavacTreeMaker.MethodDef
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r12
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = r14
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = r15
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public boolean hasMethodDefWithRecvParam() {
            r3 = this;
            r0 = r3
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r1 = lombok.javac.JavacTreeMaker.MethodDefWithRecvParam
            boolean r0 = r0.has(r1)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl MethodDefWithRecvParam(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.util.Name r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r11, com.sun.tools.javac.tree.JCTree.JCVariableDecl r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r14, com.sun.tools.javac.tree.JCTree.JCBlock r15, com.sun.tools.javac.tree.JCTree.JCExpression r16) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r1 = lombok.javac.JavacTreeMaker.MethodDefWithRecvParam
            r2 = 9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r12
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = r14
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = r15
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = r16
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCVariableDecl VarDef(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.util.Name r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.tree.JCTree.JCExpression r11) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = lombok.javac.JavacTreeMaker.VarDef
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r12 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            if (r0 == 0) goto L3e
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            int r0 = r0.pos
            r1 = -1
            if (r0 != r1) goto L3e
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r1 = 0
            r0.pos = r1
        L3e:
            r0 = r12
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCVariableDecl ReceiverVarDef(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = lombok.javac.JavacTreeMaker.ReceiverVarDef
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCSkip Skip() {
            r4 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCSkip> r1 = lombok.javac.JavacTreeMaker.Skip
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCSkip r0 = (com.sun.tools.javac.tree.JCTree.JCSkip) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCBlock Block(long r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r11) {
            r8 = this;
            r0 = r8
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCBlock> r1 = lombok.javac.JavacTreeMaker.Block
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = (com.sun.tools.javac.tree.JCTree.JCBlock) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCDoWhileLoop DoLoop(com.sun.tools.javac.tree.JCTree.JCStatement r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCDoWhileLoop> r1 = lombok.javac.JavacTreeMaker.DoLoop
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCDoWhileLoop r0 = (com.sun.tools.javac.tree.JCTree.JCDoWhileLoop) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCWhileLoop WhileLoop(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCStatement r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCWhileLoop> r1 = lombok.javac.JavacTreeMaker.WhileLoop
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCWhileLoop r0 = (com.sun.tools.javac.tree.JCTree.JCWhileLoop) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCForLoop ForLoop(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpressionStatement> r10, com.sun.tools.javac.tree.JCTree.JCStatement r11) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCForLoop> r1 = lombok.javac.JavacTreeMaker.ForLoop
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCForLoop r0 = (com.sun.tools.javac.tree.JCTree.JCForLoop) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop ForeachLoop(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.tree.JCTree.JCStatement r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCEnhancedForLoop> r1 = lombok.javac.JavacTreeMaker.ForeachLoop
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCEnhancedForLoop r0 = (com.sun.tools.javac.tree.JCTree.JCEnhancedForLoop) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCLabeledStatement Labelled(com.sun.tools.javac.util.Name r8, com.sun.tools.javac.tree.JCTree.JCStatement r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCLabeledStatement> r1 = lombok.javac.JavacTreeMaker.Labelled
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCLabeledStatement r0 = (com.sun.tools.javac.tree.JCTree.JCLabeledStatement) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCSwitch Switch(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCCase> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCSwitch> r1 = lombok.javac.JavacTreeMaker.Switch
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCSwitch r0 = (com.sun.tools.javac.tree.JCTree.JCSwitch) r0
            return r0
    }

    static java.lang.Class<?> classForName(java.lang.Class<?> r4, java.lang.String r5) {
            r0 = r4
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L9
            r1 = r5
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L9
            return r0
        L9:
            r6 = move-exception
            java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.setStackTrace(r1)
            r0 = r7
            throw r0
    }

    public com.sun.tools.javac.tree.JCTree.JCCase Case(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> r9) {
            r7 = this;
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCCase> r0 = lombok.javac.JavacTreeMaker.Case11
            boolean r0 = tryResolve(r0)
            if (r0 == 0) goto L20
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCCase> r1 = lombok.javac.JavacTreeMaker.Case11
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            return r0
        L20:
            r0 = r8
            if (r0 != 0) goto L3e
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree> r0 = lombok.javac.JavacTreeMaker.DefaultCaseLabel
            boolean r0 = tryResolve(r0)
            if (r0 == 0) goto L37
            r0 = r7
            com.sun.tools.javac.tree.JCTree r0 = r0.DefaultCaseLabel()
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto L3a
        L37:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        L3a:
            r10 = r0
            goto L58
        L3e:
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree> r0 = lombok.javac.JavacTreeMaker.ConstantCaseLabel
            boolean r0 = tryResolve(r0)
            if (r0 == 0) goto L53
            r0 = r7
            r1 = r8
            com.sun.tools.javac.tree.JCTree r0 = r0.ConstantCaseLabel(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r10 = r0
            goto L58
        L53:
            r0 = r8
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r10 = r0
        L58:
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCCase> r1 = lombok.javac.JavacTreeMaker.Case12.Case12
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.Object r5 = lombok.javac.JavacTreeMaker.Case12.CASE_KIND_STATEMENT
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 0
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = (com.sun.tools.javac.tree.JCTree.JCCase) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree DefaultCaseLabel() {
            r4 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree> r1 = lombok.javac.JavacTreeMaker.DefaultCaseLabel
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree ConstantCaseLabel(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree> r1 = lombok.javac.JavacTreeMaker.ConstantCaseLabel
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCSynchronized Synchronized(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCBlock r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCSynchronized> r1 = lombok.javac.JavacTreeMaker.Synchronized
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCSynchronized r0 = (com.sun.tools.javac.tree.JCTree.JCSynchronized) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTry Try(com.sun.tools.javac.tree.JCTree.JCBlock r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCCatch> r9, com.sun.tools.javac.tree.JCTree.JCBlock r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTry> r1 = lombok.javac.JavacTreeMaker.Try
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTry r0 = (com.sun.tools.javac.tree.JCTree.JCTry) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTry Try(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r8, com.sun.tools.javac.tree.JCTree.JCBlock r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCCatch> r10, com.sun.tools.javac.tree.JCTree.JCBlock r11) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTry> r1 = lombok.javac.JavacTreeMaker.TryWithResources
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTry r0 = (com.sun.tools.javac.tree.JCTree.JCTry) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCCatch Catch(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, com.sun.tools.javac.tree.JCTree.JCBlock r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCCatch> r1 = lombok.javac.JavacTreeMaker.Catch
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCCatch r0 = (com.sun.tools.javac.tree.JCTree.JCCatch) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCConditional Conditional(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCConditional> r1 = lombok.javac.JavacTreeMaker.Conditional
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = (com.sun.tools.javac.tree.JCTree.JCConditional) r0
            return r0
    }

    /* renamed from: If */
    public com.sun.tools.javac.tree.JCTree.JCIf m81If(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCStatement r9, com.sun.tools.javac.tree.JCTree.JCStatement r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCIf> r1 = lombok.javac.JavacTreeMaker.f585If
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCIf r0 = (com.sun.tools.javac.tree.JCTree.JCIf) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpressionStatement Exec(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCExpressionStatement> r1 = lombok.javac.JavacTreeMaker.Exec
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = (com.sun.tools.javac.tree.JCTree.JCExpressionStatement) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCBreak Break(com.sun.tools.javac.util.Name r9) {
            r8 = this;
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCBreak> r0 = lombok.javac.JavacTreeMaker.Break11
            boolean r0 = tryResolve(r0)
            if (r0 == 0) goto L1c
            r0 = r8
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCBreak> r1 = lombok.javac.JavacTreeMaker.Break11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = (com.sun.tools.javac.tree.JCTree.JCBreak) r0
            return r0
        L1c:
            r0 = r8
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCBreak> r1 = lombok.javac.JavacTreeMaker.Break12
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            if (r5 == 0) goto L32
            r5 = r8
            r6 = r9
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            goto L33
        L32:
            r5 = 0
        L33:
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = (com.sun.tools.javac.tree.JCTree.JCBreak) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCContinue Continue(com.sun.tools.javac.util.Name r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCContinue> r1 = lombok.javac.JavacTreeMaker.Continue
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCContinue r0 = (com.sun.tools.javac.tree.JCTree.JCContinue) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCReturn Return(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCReturn> r1 = lombok.javac.JavacTreeMaker.Return
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = (com.sun.tools.javac.tree.JCTree.JCReturn) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCThrow Throw(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCThrow> r1 = lombok.javac.JavacTreeMaker.Throw
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCThrow r0 = (com.sun.tools.javac.tree.JCTree.JCThrow) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAssert Assert(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAssert> r1 = lombok.javac.JavacTreeMaker.Assert
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAssert r0 = (com.sun.tools.javac.tree.JCTree.JCAssert) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodInvocation Apply(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodInvocation> r1 = lombok.javac.JavacTreeMaker.Apply
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCNewClass NewClass(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r11, com.sun.tools.javac.tree.JCTree.JCClassDecl r12) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCNewClass> r1 = lombok.javac.JavacTreeMaker.NewClass
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r12
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = (com.sun.tools.javac.tree.JCTree.JCNewClass) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCNewArray NewArray(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCNewArray> r1 = lombok.javac.JavacTreeMaker.NewArray
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCParens Parens(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCParens> r1 = lombok.javac.JavacTreeMaker.Parens
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCParens r0 = (com.sun.tools.javac.tree.JCTree.JCParens) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAssign Assign(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAssign> r1 = lombok.javac.JavacTreeMaker.Assign
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = (com.sun.tools.javac.tree.JCTree.JCAssign) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAssignOp Assignop(lombok.javac.JavacTreeMaker.TreeTag r8, com.sun.tools.javac.tree.JCTree r9, com.sun.tools.javac.tree.JCTree r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAssignOp> r1 = lombok.javac.JavacTreeMaker.Assignop
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = r5.value
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAssignOp r0 = (com.sun.tools.javac.tree.JCTree.JCAssignOp) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCUnary Unary(lombok.javac.JavacTreeMaker.TreeTag r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCUnary> r1 = lombok.javac.JavacTreeMaker.Unary
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = r5.value
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCUnary r0 = (com.sun.tools.javac.tree.JCTree.JCUnary) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCBinary Binary(lombok.javac.JavacTreeMaker.TreeTag r8, com.sun.tools.javac.tree.JCTree.JCExpression r9, com.sun.tools.javac.tree.JCTree.JCExpression r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCBinary> r1 = lombok.javac.JavacTreeMaker.Binary
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = r5.value
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = (com.sun.tools.javac.tree.JCTree.JCBinary) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTypeCast TypeCast(com.sun.tools.javac.tree.JCTree r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTypeCast> r1 = lombok.javac.JavacTreeMaker.TypeCast
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = (com.sun.tools.javac.tree.JCTree.JCTypeCast) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCInstanceOf TypeTest(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCInstanceOf> r1 = lombok.javac.JavacTreeMaker.TypeTest
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCInstanceOf r0 = (com.sun.tools.javac.tree.JCTree.JCInstanceOf) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCArrayAccess Indexed(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCArrayAccess> r1 = lombok.javac.JavacTreeMaker.Indexed
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCArrayAccess r0 = (com.sun.tools.javac.tree.JCTree.JCArrayAccess) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCFieldAccess Select(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.Name r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCFieldAccess> r1 = lombok.javac.JavacTreeMaker.Select
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCIdent Ident(com.sun.tools.javac.util.Name r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCIdent> r1 = lombok.javac.JavacTreeMaker.Ident
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCLiteral Literal(lombok.javac.JavacTreeMaker.TypeTag r8, java.lang.Object r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCLiteral> r1 = lombok.javac.JavacTreeMaker.Literal
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = r5.value
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = (com.sun.tools.javac.tree.JCTree.JCLiteral) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree TypeIdent(lombok.javac.JavacTreeMaker.TypeTag r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree> r1 = lombok.javac.JavacTreeMaker.TypeIdent
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Object r5 = r5.value
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCArrayTypeTree TypeArray(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCArrayTypeTree> r1 = lombok.javac.JavacTreeMaker.TypeArray
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTypeApply TypeApply(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTypeApply> r1 = lombok.javac.JavacTreeMaker.TypeApply
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTypeParameter TypeParameter(com.sun.tools.javac.util.Name r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = lombok.javac.JavacTreeMaker.TypeParameter
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCTypeParameter TypeParameter(com.sun.tools.javac.util.Name r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r10) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = lombok.javac.JavacTreeMaker.TypeParameterWithAnnos
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r10
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCWildcard Wildcard(com.sun.tools.javac.tree.JCTree.TypeBoundKind r8, com.sun.tools.javac.tree.JCTree r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCWildcard> r1 = lombok.javac.JavacTreeMaker.Wildcard
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = (com.sun.tools.javac.tree.JCTree.JCWildcard) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.TypeBoundKind TypeBoundKind(com.sun.tools.javac.code.BoundKind r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$TypeBoundKind> r1 = lombok.javac.JavacTreeMaker.TypeBoundKind
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r0 = (com.sun.tools.javac.tree.JCTree.TypeBoundKind) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAnnotation Annotation(com.sun.tools.javac.tree.JCTree r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = lombok.javac.JavacTreeMaker.Annotation
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAnnotation TypeAnnotation(com.sun.tools.javac.tree.JCTree r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = lombok.javac.JavacTreeMaker.TypeAnnotation
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCModifiers Modifiers(long r9, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r11) {
            r8 = this;
            r0 = r8
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCModifiers> r1 = lombok.javac.JavacTreeMaker.ModifiersWithAnnotations
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = (com.sun.tools.javac.tree.JCTree.JCModifiers) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCModifiers Modifiers(long r9) {
            r8 = this;
            r0 = r8
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCModifiers> r1 = lombok.javac.JavacTreeMaker.Modifiers
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = (com.sun.tools.javac.tree.JCTree.JCModifiers) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCErroneous Erroneous() {
            r4 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCErroneous> r1 = lombok.javac.JavacTreeMaker.Erroneous
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCErroneous r0 = (com.sun.tools.javac.tree.JCTree.JCErroneous) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCErroneous Erroneous(com.sun.tools.javac.util.List<? extends com.sun.tools.javac.tree.JCTree> r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCErroneous> r1 = lombok.javac.JavacTreeMaker.ErroneousWithErrs
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCErroneous r0 = (com.sun.tools.javac.tree.JCTree.JCErroneous) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.LetExpr LetExpr(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r8, com.sun.tools.javac.tree.JCTree r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$LetExpr> r1 = lombok.javac.JavacTreeMaker.LetExpr
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$LetExpr r0 = (com.sun.tools.javac.tree.JCTree.LetExpr) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCClassDecl AnonymousClassDef(com.sun.tools.javac.tree.JCTree.JCModifiers r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCClassDecl> r1 = lombok.javac.JavacTreeMaker.AnonymousClassDef
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.LetExpr LetExpr(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, com.sun.tools.javac.tree.JCTree r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$LetExpr> r1 = lombok.javac.JavacTreeMaker.LetExprSingle
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$LetExpr r0 = (com.sun.tools.javac.tree.JCTree.LetExpr) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression Ident(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCIdent> r1 = lombok.javac.JavacTreeMaker.IdentVarDecl
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            return r0
    }

    public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> Idents(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression>> r1 = lombok.javac.JavacTreeMaker.Idents
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodInvocation App(com.sun.tools.javac.tree.JCTree.JCExpression r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodInvocation> r1 = lombok.javac.JavacTreeMaker.App2
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodInvocation App(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCMethodInvocation> r1 = lombok.javac.JavacTreeMaker.App1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = (com.sun.tools.javac.tree.JCTree.JCMethodInvocation) r0
            return r0
    }

    public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> Annotations(com.sun.tools.javac.util.List<com.sun.tools.javac.code.Attribute.Compound> r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCAnnotation>> r1 = lombok.javac.JavacTreeMaker.Annotations
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCLiteral Literal(java.lang.Object r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCLiteral> r1 = lombok.javac.JavacTreeMaker.LiteralWithValue
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = (com.sun.tools.javac.tree.JCTree.JCLiteral) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAnnotation Annotation(com.sun.tools.javac.code.Attribute r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = lombok.javac.JavacTreeMaker.AnnotationWithAttributeOnly
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCAnnotation TypeAnnotation(com.sun.tools.javac.code.Attribute r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCAnnotation> r1 = lombok.javac.JavacTreeMaker.TypeAnnotationWithAttributeOnly
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression AnnotatedType(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r8, com.sun.tools.javac.tree.JCTree.JCExpression r9) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCExpression> r1 = lombok.javac.JavacTreeMaker.AnnotatedType
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r9
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCStatement Call(com.sun.tools.javac.tree.JCTree.JCExpression r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCStatement> r1 = lombok.javac.JavacTreeMaker.Call
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCExpression Type(com.sun.tools.javac.code.Type r8) {
            r7 = this;
            r0 = r7
            lombok.javac.JavacTreeMaker$MethodId<com.sun.tools.javac.tree.JCTree$JCExpression> r1 = lombok.javac.JavacTreeMaker.Type
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            return r0
    }

    public boolean hasReceiverParameter() {
            r2 = this;
            lombok.javac.JavacTreeMaker$FieldId<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r0 = lombok.javac.JavacTreeMaker.MethodDecl_recvParam
            boolean r0 = has(r0)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCVariableDecl getReceiverParameter(com.sun.tools.javac.tree.JCTree.JCMethodDecl r4) {
            r3 = this;
            r0 = r4
            lombok.javac.JavacTreeMaker$FieldId<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = lombok.javac.JavacTreeMaker.MethodDecl_recvParam
            java.lang.Object r0 = get(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            return r0
    }

    public void setReceiverParameter(com.sun.tools.javac.tree.JCTree.JCMethodDecl r5, com.sun.tools.javac.tree.JCTree.JCVariableDecl r6) {
            r4 = this;
            r0 = r5
            lombok.javac.JavacTreeMaker$FieldId<com.sun.tools.javac.tree.JCTree$JCVariableDecl> r1 = lombok.javac.JavacTreeMaker.MethodDecl_recvParam
            r2 = r6
            set(r0, r1, r2)
            return
    }

    static /* synthetic */ java.lang.Object access$0(java.lang.Object r4, lombok.javac.JavacTreeMaker.MethodId r5, java.lang.Object[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = invokeAny(r0, r1, r2)
            return r0
    }
}
