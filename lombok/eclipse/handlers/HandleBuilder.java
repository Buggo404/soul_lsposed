package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleBuilder.SCL.lombok */
public class HandleBuilder extends lombok.eclipse.EclipseAnnotationHandler<lombok.Builder> {
    private lombok.eclipse.handlers.HandleConstructor handleConstructor;
    static final char[] CLEAN_FIELD_NAME = null;
    static final char[] CLEAN_METHOD_NAME = null;
    static final java.lang.String TO_BUILDER_METHOD_NAME_STRING = "toBuilder";
    static final char[] TO_BUILDER_METHOD_NAME = null;
    static final char[] DEFAULT_PREFIX = null;
    static final char[] SET_PREFIX = null;
    static final char[] VALUE_PREFIX = null;
    static final char[] BUILDER_TEMP_VAR = null;
    static final org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] EMPTY_METHODS = null;
    static final java.lang.String TO_BUILDER_NOT_SUPPORTED = "@Builder(toBuilder=true) is only supported if you return your own type.";

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f572xb87c1847;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleBuilder$BuilderFieldData.SCL.lombok */
    static class BuilderFieldData {
        org.eclipse.jdt.internal.compiler.ast.Annotation[] annotations;
        org.eclipse.jdt.internal.compiler.ast.TypeReference type;
        char[] rawName;
        char[] name;
        char[] builderFieldName;
        char[] nameOfDefaultProvider;
        char[] nameOfSetFlag;
        lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData singularData;
        lombok.Builder.ObtainVia obtainVia;
        lombok.eclipse.EclipseNode obtainViaNode;
        lombok.eclipse.EclipseNode originalFieldNode;
        java.util.List<lombok.eclipse.EclipseNode> createdFields;

        BuilderFieldData() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.createdFields = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleBuilder$BuilderJob.SCL.lombok */
    static class BuilderJob {
        lombok.core.configuration.CheckerFrameworkVersion checkerFramework;
        lombok.eclipse.EclipseNode parentType;
        java.lang.String builderMethodName;
        java.lang.String buildMethodName;
        boolean isStatic;
        org.eclipse.jdt.internal.compiler.ast.TypeParameter[] typeParams;
        org.eclipse.jdt.internal.compiler.ast.TypeParameter[] builderTypeParams;
        org.eclipse.jdt.internal.compiler.ast.ASTNode source;
        lombok.eclipse.EclipseNode sourceNode;
        java.util.List<lombok.eclipse.handlers.HandleBuilder.BuilderFieldData> builderFields;
        lombok.AccessLevel accessInners;
        lombok.AccessLevel accessOuters;
        boolean oldFluent;
        boolean oldChain;
        boolean toBuilder;
        lombok.eclipse.EclipseNode builderType;
        java.lang.String builderClassName;
        char[] builderClassNameArr;

        BuilderJob() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        void setBuilderClassName(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.builderClassName = r1
                r0 = r3
                r1 = r4
                char[] r1 = r1.toCharArray()
                r0.builderClassNameArr = r1
                return
        }

        org.eclipse.jdt.internal.compiler.ast.TypeParameter[] copyTypeParams() {
                r3 = this;
                r0 = r3
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
                r1 = r3
                org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r0, r1)
                return r0
        }

        long getPos() {
                r5 = this;
                r0 = r5
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
                int r0 = r0.sourceStart
                long r0 = (long) r0
                r1 = 32
                long r0 = r0 << r1
                r1 = r5
                org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
                int r1 = r1.sourceEnd
                long r1 = (long) r1
                long r0 = r0 | r1
                return r0
        }

        public org.eclipse.jdt.internal.compiler.ast.TypeReference createBuilderTypeReference() {
                r7 = this;
                r0 = r7
                lombok.eclipse.EclipseNode r0 = r0.parentType
                r1 = r7
                char[] r1 = r1.builderClassNameArr
                r2 = r7
                boolean r2 = r2.isStatic
                if (r2 == 0) goto L13
                r2 = 0
                goto L14
            L13:
                r2 = 1
            L14:
                r3 = r7
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r3 = r3.builderTypeParams
                r4 = r7
                long r4 = r4.getPos()
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
                return r0
        }

        public org.eclipse.jdt.internal.compiler.ast.TypeReference createBuilderTypeReferenceForceStatic() {
                r7 = this;
                r0 = r7
                lombok.eclipse.EclipseNode r0 = r0.parentType
                r1 = r7
                char[] r1 = r1.builderClassNameArr
                r2 = 0
                r3 = r7
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r3 = r3.builderTypeParams
                r4 = r7
                long r4 = r4.getPos()
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
                return r0
        }

        public org.eclipse.jdt.internal.compiler.ast.TypeReference createBuilderParentTypeReference() {
                r5 = this;
                r0 = r5
                lombok.eclipse.EclipseNode r0 = r0.parentType
                r1 = r5
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
                r2 = r5
                long r2 = r2.getPos()
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
                return r0
        }

        public lombok.eclipse.EclipseNode getTopNode() {
                r2 = this;
                r0 = r2
                lombok.eclipse.EclipseNode r0 = r0.parentType
                lombok.core.LombokNode r0 = r0.top()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                return r0
        }

        void init(lombok.core.AnnotationValues<lombok.Builder> r5, lombok.Builder r6, lombok.eclipse.EclipseNode r7) {
                r4 = this;
                r0 = r4
                r1 = r6
                lombok.AccessLevel r1 = r1.access()
                r0.accessOuters = r1
                r0 = r4
                lombok.AccessLevel r0 = r0.accessOuters
                if (r0 != 0) goto L18
                r0 = r4
                lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
                r0.accessOuters = r1
            L18:
                r0 = r4
                lombok.AccessLevel r0 = r0.accessOuters
                lombok.AccessLevel r1 = lombok.AccessLevel.NONE
                if (r0 != r1) goto L32
                r0 = r4
                lombok.eclipse.EclipseNode r0 = r0.sourceNode
                java.lang.String r1 = "AccessLevel.NONE is not valid here"
                r0.addError(r1)
                r0 = r4
                lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
                r0.accessOuters = r1
            L32:
                r0 = r4
                r1 = r4
                lombok.AccessLevel r1 = r1.accessOuters
                lombok.AccessLevel r2 = lombok.AccessLevel.PROTECTED
                if (r1 != r2) goto L43
                lombok.AccessLevel r1 = lombok.AccessLevel.PUBLIC
                goto L47
            L43:
                r1 = r4
                lombok.AccessLevel r1 = r1.accessOuters
            L47:
                r0.accessInners = r1
                r0 = r4
                r1 = r5
                java.lang.String r2 = "fluent"
                java.lang.Object r1 = r1.getActualExpression(r2)
                r2 = 1
                boolean r1 = lombok.eclipse.handlers.HandleBuilder.access$0(r1, r2)
                r0.oldFluent = r1
                r0 = r4
                r1 = r5
                java.lang.String r2 = "chain"
                java.lang.Object r1 = r1.getActualExpression(r2)
                r2 = 1
                boolean r1 = lombok.eclipse.handlers.HandleBuilder.access$0(r1, r2)
                r0.oldChain = r1
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.builderMethodName()
                r0.builderMethodName = r1
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.buildMethodName()
                r0.buildMethodName = r1
                r0 = r4
                r1 = r7
                r2 = r6
                java.lang.String r2 = r2.builderClassName()
                java.lang.String r1 = getBuilderClassNameTemplate(r1, r2)
                r0.setBuilderClassName(r1)
                r0 = r4
                r1 = r6
                boolean r1 = r1.toBuilder()
                r0.toBuilder = r1
                r0 = r4
                java.lang.String r0 = r0.builderMethodName
                if (r0 != 0) goto L9f
                r0 = r4
                java.lang.String r1 = "builder"
                r0.builderMethodName = r1
            L9f:
                r0 = r4
                java.lang.String r0 = r0.buildMethodName
                if (r0 != 0) goto Lac
                r0 = r4
                java.lang.String r1 = "build"
                r0.buildMethodName = r1
            Lac:
                return
        }

        static java.lang.String getBuilderClassNameTemplate(lombok.eclipse.EclipseNode r3, java.lang.String r4) {
                r0 = r4
                if (r0 == 0) goto Ld
                r0 = r4
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Ld
                r0 = r4
                return r0
            Ld:
                r0 = r3
                lombok.eclipse.EclipseAST r0 = r0.getAst()
                lombok.core.configuration.ConfigurationKey<java.lang.String> r1 = lombok.ConfigurationKeys.BUILDER_CLASS_NAME
                java.lang.Object r0 = r0.readConfiguration(r1)
                java.lang.String r0 = (java.lang.String) r0
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L28
                r0 = r4
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L28
                r0 = r4
                return r0
            L28:
                java.lang.String r0 = "*Builder"
                return r0
        }

        org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createNewMethodDeclaration() {
                r4 = this;
                org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
                r1 = r0
                r2 = r4
                lombok.eclipse.EclipseNode r2 = r2.getTopNode()
                java.lang.Object r2 = r2.get()
                org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
                org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
                r1.<init>(r2)
                return r0
        }

        java.lang.String replaceBuilderClassName(char[] r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r4
                java.lang.String r2 = r2.builderClassName
                java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
                return r0
        }

        java.lang.String replaceBuilderClassName(char[] r7, java.lang.String r8) {
                r6 = this;
                r0 = r8
                r1 = 42
                int r0 = r0.indexOf(r1)
                r1 = -1
                if (r0 != r1) goto Lc
                r0 = r8
                return r0
            Lc:
                r0 = r8
                java.lang.String r1 = "*"
                java.lang.String r2 = new java.lang.String
                r3 = r2
                r4 = r7
                r3.<init>(r4)
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
        }

        java.lang.String replaceBuilderClassName(java.lang.String r5) {
                r4 = this;
                r0 = r4
                java.lang.String r0 = r0.builderClassName
                java.lang.String r1 = "*"
                r2 = r5
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
        }
    }

    static {
            java.lang.String r0 = "$lombokUnclean"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME = r0
            java.lang.String r0 = "$lombokClean"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleBuilder.CLEAN_METHOD_NAME = r0
            java.lang.String r0 = "toBuilder"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleBuilder.TO_BUILDER_METHOD_NAME = r0
            r0 = 9
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 36
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 102(0x66, float:1.43E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 36
            r1[r2] = r3
            lombok.eclipse.handlers.HandleBuilder.DEFAULT_PREFIX = r0
            r0 = 4
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 36
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 115(0x73, float:1.61E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleBuilder.SET_PREFIX = r0
            r0 = 6
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 36
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 118(0x76, float:1.65E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleBuilder.VALUE_PREFIX = r0
            r0 = 7
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 117(0x75, float:1.64E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 100
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            lombok.eclipse.handlers.HandleBuilder.BUILDER_TEMP_VAR = r0
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = new org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[r0]
            lombok.eclipse.handlers.HandleBuilder.EMPTY_METHODS = r0
            return
    }

    public HandleBuilder() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.eclipse.handlers.HandleConstructor r1 = new lombok.eclipse.handlers.HandleConstructor
            r2 = r1
            r2.<init>()
            r0.handleConstructor = r1
            return
    }

    private static final boolean toBoolean(java.lang.Object r2, boolean r3) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = r3
            return r0
        L6:
            r0 = r2
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r2
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static boolean equals(java.lang.String r4, char[] r5) {
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length
            if (r0 == r1) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = 0
            r6 = r0
            goto L20
        L10:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r6
            char r1 = r1[r2]
            if (r0 == r1) goto L1d
            r0 = 0
            return r0
        L1d:
            int r6 = r6 + 1
        L20:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 < r1) goto L10
            r0 = 1
            return r0
    }

    private static boolean equals(java.lang.String r4, char[][] r5) {
            r0 = r4
            if (r0 == 0) goto Lb
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
        Lb:
            r0 = r5
            int r0 = r0.length
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
        L14:
            r0 = r4
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r1 = r5
            int r1 = r1.length
            if (r0 == r1) goto L24
            r0 = 0
            return r0
        L24:
            r0 = 0
            r7 = r0
            goto L3a
        L29:
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            boolean r0 = equals(r0, r1)
            if (r0 != 0) goto L37
            r0 = 0
            return r0
        L37:
            int r7 = r7 + 1
        L3a:
            r0 = r7
            r1 = r5
            int r1 = r1.length
            if (r0 < r1) goto L29
            r0 = 1
            return r0
    }

    private static final char[] prefixWith(char[] r6, char[] r7) {
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r8 = r0
            r0 = r6
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r2 = r8
            r3 = r6
            int r3 = r3.length
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder> r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12, lombok.eclipse.EclipseNode r13) {
            r10 = this;
            r0 = r13
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.BUILDER_FLAG_USAGE
            java.lang.String r2 = "@Builder"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            lombok.eclipse.handlers.HandleBuilder$BuilderJob r0 = new lombok.eclipse.handlers.HandleBuilder$BuilderJob
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            r1 = r13
            r0.sourceNode = r1
            r0 = r14
            r1 = r12
            r0.source = r1
            r0 = r14
            r1 = r13
            lombok.core.configuration.CheckerFrameworkVersion r1 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r1)
            r0.checkerFramework = r1
            r0 = r14
            r1 = 1
            r0.isStatic = r1
            r0 = r11
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Builder r0 = (lombok.Builder) r0
            r15 = r0
            r0 = r14
            r1 = r11
            r2 = r15
            r3 = r13
            r0.init(r1, r2, r3)
            r0 = 0
            r16 = r0
            r0 = r14
            java.lang.String r0 = r0.builderMethodName
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L53
            r0 = 0
            r17 = r0
            goto L65
        L53:
            java.lang.String r0 = "builderMethodName"
            r1 = r14
            java.lang.String r1 = r1.builderMethodName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L62
            return
        L62:
            r0 = 1
            r17 = r0
        L65:
            java.lang.String r0 = "buildMethodName"
            r1 = r14
            java.lang.String r1 = r1.buildMethodName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L74
            return
        L74:
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r18 = r0
            r0 = r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.builderFields = r1
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L99
            r0 = r18
            goto L9a
        L99:
            r0 = 0
        L9a:
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r18
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.upToTypeNode(r0)
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto Lb4
            r0 = r13
            java.lang.String r1 = "@Builder is not supported on non-static nested classes."
            r0.addError(r1)
            return
        Lb4:
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L2f6
            r0 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto Ld6
            r0 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isRecord(r0)
            if (r0 != 0) goto Ld6
            r0 = r13
            java.lang.String r1 = "@Builder is only supported on classes, records, constructors, and methods."
            r0.addError(r1)
            return
        Ld6:
            r0 = r14
            r1 = r18
            r0.parentType = r1
            r0 = r18
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r25 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r26 = r0
            java.lang.Class<lombok.Value> r0 = lombok.Value.class
            r1 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L108
            java.lang.String r0 = "lombok.experimental.Value"
            r1 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L108
            r0 = 0
            goto L109
        L108:
            r0 = 1
        L109:
            r27 = r0
            r0 = r18
            r1 = 1
            java.util.List r0 = lombok.eclipse.handlers.HandleConstructor.findAllFields(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L291
        L11b:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r28 = r0
            r0 = r28
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r30 = r0
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r28
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findAnnotation(r0, r1)
            r31 = r0
            r0 = r30
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L15a
            r0 = r27
            if (r0 == 0) goto L156
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r28
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L15a
        L156:
            r0 = 0
            goto L15b
        L15a:
            r0 = 1
        L15b:
            r32 = r0
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.eclipse.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r33
            r1 = r28
            java.lang.String r1 = r1.getName()
            char[] r1 = r1.toCharArray()
            r0.rawName = r1
            r0 = r33
            r1 = r28
            char[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r1)
            r0.name = r1
            r0 = r33
            r1 = r33
            char[] r1 = r1.name
            r0.builderFieldName = r1
            r0 = r33
            r1 = r30
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r28
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r5 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r5)
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r33
            r1 = r30
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r0.type = r1
            r0 = r33
            r1 = r10
            r2 = r28
            r3 = r12
            r4 = r15
            java.lang.String r4 = r4.setterPrefix()
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3, r4)
            r0.singularData = r1
            r0 = r33
            r1 = r28
            r0.originalFieldNode = r1
            r0 = r33
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1d9
            r0 = r31
            if (r0 == 0) goto L1d9
            r0 = r31
            java.lang.String r1 = "@Builder.Default and @Singular cannot be mixed."
            r0.addError(r1)
            r0 = 0
            r31 = r0
        L1d9:
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto L1f1
            r0 = r31
            if (r0 == 0) goto L1f1
            r0 = r31
            java.lang.String r1 = "@Builder.Default requires an initializing expression (' = something;')."
            r0.addWarning(r1)
            r0 = 0
            r31 = r0
        L1f1:
            r0 = r30
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L21e
            r0 = r31
            if (r0 != 0) goto L21e
            r0 = r32
            if (r0 == 0) goto L206
            goto L291
        L206:
            r0 = r24
            if (r0 != 0) goto L214
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
        L214:
            r0 = r24
            r1 = r28
            boolean r0 = r0.add(r1)
        L21e:
            r0 = r31
            if (r0 == 0) goto L272
            r0 = r33
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.DEFAULT_PREFIX
            r2 = r33
            char[] r2 = r2.name
            char[] r1 = prefixWith(r1, r2)
            r0.nameOfDefaultProvider = r1
            r0 = r33
            r1 = r33
            char[] r1 = r1.name
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.SET_PREFIX
            char[] r1 = prefixWith(r1, r2)
            r0.nameOfSetFlag = r1
            r0 = r33
            r1 = r33
            char[] r1 = r1.name
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.VALUE_PREFIX
            char[] r1 = prefixWith(r1, r2)
            r0.builderFieldName = r1
            r0 = r33
            char[] r0 = r0.nameOfDefaultProvider
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            r2 = r28
            r3 = r12
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = generateDefaultProvider(r0, r1, r2, r3)
            r34 = r0
            r0 = r34
            if (r0 == 0) goto L272
            r0 = r18
            r1 = r34
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L272:
            r0 = r10
            r1 = r33
            r2 = r28
            r0.addObtainVia(r1, r2)
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r33
            boolean r0 = r0.add(r1)
            r0 = r26
            r1 = r28
            boolean r0 = r0.add(r1)
        L291:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11b
            r0 = r18
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isRecord(r0)
            if (r0 != 0) goto L2ba
            r0 = r10
            lombok.eclipse.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r18
            lombok.AccessLevel r2 = lombok.AccessLevel.PACKAGE
            r3 = r26
            r4 = 0
            r5 = 0
            lombok.eclipse.handlers.HandleConstructor$SkipIfConstructorExists r6 = lombok.eclipse.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER
            java.util.List r7 = java.util.Collections.emptyList()
            r8 = r13
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
        L2ba:
            r0 = r14
            r1 = r14
            r2 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createBuilderParentTypeReference()
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r14
            r1 = r14
            r2 = r25
            char[] r2 = r2.name
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.setBuilderClassName(r1)
            java.lang.String r0 = "builderClassName"
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L622
            return
        L2f6:
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L37e
            r0 = r18
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
            r25 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            if (r0 == 0) goto L324
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            int r0 = r0.length
            if (r0 <= 0) goto L324
            r0 = r13
            java.lang.String r1 = "@Builder is not supported on constructors with constructor type parameters."
            r0.addError(r1)
            return
        L324:
            r0 = r14
            r1 = r18
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r0.parentType = r1
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r26 = r0
            r0 = r14
            r1 = r14
            r2 = r26
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createBuilderParentTypeReference()
            r19 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.thrownExceptions
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r14
            r1 = r14
            r2 = r25
            char[] r2 = r2.selector
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.setBuilderClassName(r1)
            java.lang.String r0 = "builderClassName"
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L622
            return
        L37e:
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 == 0) goto L61b
            r0 = r18
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r25 = r0
            r0 = r14
            r1 = r18
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r0.parentType = r1
            r0 = r14
            r1 = r25
            boolean r1 = r1.isStatic()
            r0.isStatic = r1
            r0 = r14
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L5b5
            r0 = 0
            r27 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            int r0 = r0.dimensions()
            if (r0 <= 0) goto L3c7
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L3c7:
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L3e2
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r26 = r0
            goto L426
        L3e2:
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L41f
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r27 = r0
            r0 = r27
            r1 = r27
            int r1 = r1.length
            r0 = r0[r1]
            r26 = r0
            r0 = r27
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            char[] r0 = new char[r0]
            r28 = r0
            r0 = r27
            r1 = 0
            r2 = r28
            r3 = 0
            r4 = r28
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r28
            r27 = r0
            goto L426
        L41f:
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L426:
            r0 = r27
            if (r0 == 0) goto L43f
            r0 = r18
            java.lang.String r0 = r0.getPackageDeclaration()
            r1 = r27
            boolean r0 = equals(r0, r1)
            if (r0 != 0) goto L43f
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L43f:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            if (r0 == 0) goto L457
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.String r0 = r0.getName()
            r1 = r26
            boolean r0 = equals(r0, r1)
            if (r0 != 0) goto L45e
        L457:
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L45e:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r28 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 == 0) goto L49b
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r30 = r0
            r0 = r30
            r1 = 0
            r2 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.returnType
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = r2.typeArguments
            r0[r1] = r2
            goto L4b3
        L49b:
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            if (r0 == 0) goto L4b3
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            r30 = r0
        L4b3:
            r0 = r30
            if (r0 == 0) goto L4e4
            r0 = 0
            r31 = r0
            goto L4da
        L4be:
            r0 = r30
            r1 = r31
            r0 = r0[r1]
            if (r0 == 0) goto L4d7
            r0 = r30
            r1 = r31
            r0 = r0[r1]
            int r0 = r0.length
            if (r0 <= 0) goto L4d7
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is not supported if returning a type with generics applied to an intermediate."
            r0.addError(r1)
            return
        L4d7:
            int r31 = r31 + 1
        L4da:
            r0 = r31
            r1 = r30
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 < r1) goto L4be
        L4e4:
            r0 = r30
            if (r0 != 0) goto L4ed
            r0 = 0
            goto L4f5
        L4ed:
            r0 = r30
            r1 = r30
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
        L4f5:
            r31 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r29
            if (r0 == 0) goto L5b5
            r0 = r29
            r1 = r0
            r35 = r1
            int r0 = r0.length
            r34 = r0
            r0 = 0
            r33 = r0
            goto L5ae
        L513:
            r0 = r35
            r1 = r33
            r0 = r0[r1]
            r32 = r0
            r0 = -1
            r36 = r0
            r0 = r31
            if (r0 == 0) goto L561
            r0 = 0
            r37 = r0
            goto L559
        L528:
            r0 = r31
            r1 = r37
            r0 = r0[r1]
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.SingleTypeReference> r1 = org.eclipse.jdt.internal.compiler.ast.SingleTypeReference.class
            if (r0 == r1) goto L539
            goto L556
        L539:
            r0 = r31
            r1 = r37
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r1 = r32
            char[] r1 = r1.name
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L552
            goto L556
        L552:
            r0 = r37
            r36 = r0
        L556:
            int r37 = r37 + 1
        L559:
            r0 = r37
            r1 = r31
            int r1 = r1.length
            if (r0 < r1) goto L528
        L561:
            r0 = r36
            r1 = -1
            if (r0 == r1) goto L574
            r0 = r28
            if (r0 == 0) goto L574
            r0 = r28
            int r0 = r0.length
            r1 = r36
            if (r0 > r1) goto L59b
        L574:
            r0 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@Builder(toBuilder=true) requires that each type parameter on the static method is part of the typeargs of the return value. Type parameter "
            r2.<init>(r3)
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r32
            char[] r4 = r4.name
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not part of the return type."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L59b:
            r0 = r16
            r1 = r28
            r2 = r36
            r1 = r1[r2]
            char[] r1 = r1.name
            boolean r0 = r0.add(r1)
            int r33 = r33 + 1
        L5ae:
            r0 = r33
            r1 = r34
            if (r0 < r1) goto L513
        L5b5:
            r0 = r14
            r1 = r14
            r2 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0, r1)
            r19 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.thrownExceptions
            r20 = r0
            r0 = r25
            char[] r0 = r0.selector
            r21 = r0
            r0 = r14
            java.lang.String r0 = r0.builderClassName
            r1 = 42
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L622
            r0 = r13
            r1 = r25
            r2 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParams
            char[] r0 = returnTypeToBuilderClassName(r0, r1, r2)
            r26 = r0
            r0 = r26
            if (r0 != 0) goto L5ff
            return
        L5ff:
            r0 = r14
            r1 = r14
            r2 = r26
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.setBuilderClassName(r1)
            java.lang.String r0 = "builderClassName"
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L622
            return
        L61b:
            r0 = r13
            java.lang.String r1 = "@Builder is only supported on classes, records, constructors, and methods."
            r0.addError(r1)
            return
        L622:
            r0 = r22
            if (r0 == 0) goto L6dc
            r0 = r22
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L6d2
        L634:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r25 = r0
            r0 = r25
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT
            if (r0 == r1) goto L64e
            goto L6d2
        L64e:
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.eclipse.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r25
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = (org.eclipse.jdt.internal.compiler.ast.Argument) r0
            r28 = r0
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r0)
            r29 = r0
            r0 = r27
            r1 = r28
            char[] r1 = r1.name
            r0.rawName = r1
            r0 = r27
            r1 = r28
            char[] r1 = r1.name
            r0.name = r1
            r0 = r27
            r1 = r27
            char[] r1 = r1.name
            r0.builderFieldName = r1
            r0 = r27
            r1 = r28
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r29
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r27
            r1 = r28
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r0.type = r1
            r0 = r27
            r1 = r10
            r2 = r25
            r3 = r12
            r4 = r15
            java.lang.String r4 = r4.setterPrefix()
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3, r4)
            r0.singularData = r1
            r0 = r27
            r1 = r25
            r0.originalFieldNode = r1
            r0 = r10
            r1 = r27
            r2 = r25
            r0.addObtainVia(r1, r2)
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r27
            boolean r0 = r0.add(r1)
        L6d2:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L634
        L6dc:
            r0 = r14
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r14
            java.lang.String r2 = r2.builderClassName
            lombok.eclipse.EclipseNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.findInnerClass(r1, r2)
            r0.builderType = r1
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            if (r0 != 0) goto L6ff
            r0 = r10
            r1 = r14
            r0.makeBuilderClass(r1)
            goto L7a3
        L6ff:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r25 = r0
            r0 = r14
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L727
            r0 = r25
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L727
            r0 = r13
            java.lang.String r1 = "Existing Builder must be a static inner class."
            r0.addError(r1)
            return
        L727:
            r0 = r14
            boolean r0 = r0.isStatic
            if (r0 != 0) goto L742
            r0 = r25
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L742
            r0 = r13
            java.lang.String r1 = "Existing Builder must be a non-static inner class."
            r0.addError(r1)
            return
        L742:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r13
            lombok.eclipse.handlers.EclipseHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L799
        L75a:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r26 = r0
            r0 = r26
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            r28 = r0
            r0 = r28
            if (r0 != 0) goto L775
            goto L799
        L775:
            r0 = r28
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r29 = r0
            r0 = r29
            if (r0 != 0) goto L784
            goto L799
        L784:
            r0 = r29
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = r28
            boolean r0 = r0.checkForAlreadyExistingNodesAndGenerateError(r1, r2)
            if (r0 == 0) goto L799
            r0 = r26
            r1 = 0
            r0.singularData = r1
        L799:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L75a
        L7a3:
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L83f
        L7b2:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r25 = r0
            r0 = r25
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L7e5
            r0 = r25
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L7e5
            r0 = r25
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.requiresCleaning()
            if (r0 == 0) goto L7e5
            r0 = 1
            r23 = r0
            goto L849
        L7e5:
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L83f
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            r1 = r25
            lombok.Builder$ObtainVia r1 = r1.obtainVia
            java.lang.String r1 = r1.method()
            boolean r1 = r1.isEmpty()
            if (r0 != r1) goto L816
            r0 = r25
            lombok.eclipse.EclipseNode r0 = r0.obtainViaNode
            java.lang.String r1 = "The syntax is either @ObtainVia(field = \"fieldName\") or @ObtainVia(method = \"methodName\")."
            r0.addError(r1)
            return
        L816:
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83f
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L83f
            r0 = r25
            lombok.eclipse.EclipseNode r0 = r0.obtainViaNode
            java.lang.String r1 = "@ObtainVia(isStatic = true) is not valid unless 'method' has been set."
            r0.addError(r1)
            return
        L83f:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7b2
        L849:
            r0 = r10
            r1 = r14
            r0.generateBuilderFields(r1)
            r0 = r23
            if (r0 == 0) goto L891
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r25
            r1 = 2
            r0.modifiers = r1
            r0 = r25
            r1 = 5
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r25
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r12
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        L891:
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.constructorExists(r0)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L8c4
            lombok.AccessLevel r0 = lombok.AccessLevel.PACKAGE
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.builderType
            java.util.List r2 = java.util.Collections.emptyList()
            r3 = 0
            r4 = r13
            java.util.List r5 = java.util.Collections.emptyList()
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = lombok.eclipse.handlers.HandleConstructor.createConstructor(r0, r1, r2, r3, r4, r5)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L8c4
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L8c4:
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L8ee
        L8d3:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r25 = r0
            r0 = r10
            r1 = r14
            r2 = r25
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            r0.makePrefixedSetterMethodsForBuilder(r1, r2, r3)
        L8ee:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8d3
            r0 = r14
            java.lang.String r0 = r0.buildMethodName
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = -1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            r25 = r0
            r0 = r25
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
            if (r0 != r1) goto L920
            r0 = r14
            java.lang.String r0 = r0.buildMethodName
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            r25 = r0
        L920:
            r0 = r25
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L948
            r0 = r10
            r1 = r14
            r2 = r21
            r3 = r19
            r4 = r20
            r5 = r23
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.generateBuildMethod(r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L948
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r26
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L948:
            java.lang.String r0 = "toString"
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L9e3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r14
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L9b7
        L972:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r26 = r0
            r0 = r26
            java.util.List<lombok.eclipse.EclipseNode> r0 = r0.createdFields
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L9ad
        L98d:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r28 = r0
            r0 = r25
            lombok.core.handlers.InclusionExclusionUtils$Included r1 = new lombok.core.handlers.InclusionExclusionUtils$Included
            r2 = r1
            r3 = r28
            r4 = 0
            r5 = 1
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L9ad:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L98d
        L9b7:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L972
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r25
            r2 = 1
            r3 = 0
            r4 = r12
            lombok.core.handlers.HandlerUtil$FieldAccess r5 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = lombok.eclipse.handlers.HandleToString.createToString(r0, r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L9e3
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r26
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L9e3:
            r0 = r23
            if (r0 == 0) goto La00
            r0 = r10
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.generateCleanMethod(r1)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto La00
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        La00:
            r0 = r17
            if (r0 == 0) goto La1c
            r0 = r14
            java.lang.String r0 = r0.builderMethodName
            r1 = r14
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = -1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto La1c
            r0 = 0
            r17 = r0
        La1c:
            r0 = r17
            if (r0 == 0) goto La39
            r0 = r10
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.generateBuilderMethod(r1)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto La39
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r25
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        La39:
            r0 = r14
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto Lae0
            int[] r0 = m70xb87c1847()
            java.lang.String r1 = "toBuilder"
            r2 = r14
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto La76;
                case 2: goto Lae0;
                case 3: goto La6c;
                default: goto Lae0;
            }
        La6c:
            r0 = r13
            java.lang.String r1 = "Not generating toBuilder() as it already exists."
            r0.addWarning(r1)
            goto Lae0
        La76:
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            r25 = r0
            r0 = r16
            if (r0 == 0) goto Labf
            r0 = r16
            int r0 = r0.size()
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter[r0]
            r25 = r0
            r0 = 0
            r26 = r0
            goto Lab7
        La94:
            r0 = r25
            r1 = r26
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r2 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            r0 = r25
            r1 = r26
            r0 = r0[r1]
            r1 = r16
            r2 = r26
            java.lang.Object r1 = r1.get(r2)
            char[] r1 = (char[]) r1
            r0.name = r1
            int r26 = r26 + 1
        Lab7:
            r0 = r26
            r1 = r25
            int r1 = r1.length
            if (r0 < r1) goto La94
        Labf:
            r0 = r10
            r1 = r14
            r2 = r25
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.generateToBuilderMethod(r1, r2, r3)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto Lae0
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r26
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        Lae0:
            r0 = r24
            if (r0 == 0) goto Lb14
            r0 = r17
            if (r0 == 0) goto Lb14
            r0 = r24
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto Lb0a
        Laf6:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r25 = r0
            r0 = r25
            java.lang.String r1 = "@Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final."
            r0.addWarning(r1)
        Lb0a:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Laf6
        Lb14:
            return
    }

    static char[] returnTypeToBuilderClassName(lombok.eclipse.EclipseNode r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r9) {
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L22
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r11 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r10 = r0
            goto L84
        L22:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L7b
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r10 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 != 0) goto L84
            r0 = r9
            if (r0 == 0) goto L84
            r0 = r9
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L71
        L52:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            char[] r0 = r0.name
            r1 = r10
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L6e
            r0 = r7
            java.lang.String r1 = "@Builder requires specifying 'builderClassName' if used on methods with a type parameter as return type."
            r0.addError(r1)
            r0 = 0
            return r0
        L6e:
            int r12 = r12 + 1
        L71:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L52
            goto L84
        L7b:
            r0 = r7
            java.lang.String r1 = "Unexpected kind of return type on annotated method. Specify 'builderClassName' to solve this problem."
            r0.addError(r1)
            r0 = 0
            return r0
        L84:
            r0 = r10
            r1 = 0
            char r0 = r0[r1]
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto Lac
            r0 = r10
            int r0 = r0.length
            char[] r0 = new char[r0]
            r11 = r0
            r0 = r10
            r1 = 1
            r2 = r11
            r3 = 1
            r4 = r10
            int r4 = r4.length
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r11
            r1 = 0
            r2 = r10
            r3 = 0
            char r2 = r2[r3]
            char r2 = java.lang.Character.toTitleCase(r2)
            r0[r1] = r2
            r0 = r11
            r10 = r0
        Lac:
            r0 = r10
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateToBuilderMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r11, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r12, java.lang.String r13) {
            r10 = this;
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceEnd
            r15 = r0
            r0 = r11
            long r0 = r0.getPos()
            r16 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r18 = r0
            r0 = r18
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.TO_BUILDER_METHOD_NAME
            r0.selector = r1
            r0 = r18
            r1 = r11
            lombok.AccessLevel r1 = r1.accessOuters
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r18
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r18
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createBuilderTypeReference()
            r0.returnType = r1
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L88
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r19 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r19
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r19
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r5 = r5.source
            java.lang.String r6 = "org.checkerframework.common.aliasing.qual.Unique"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r5 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r5, r6)
            r3[r4] = r5
            r0[r1] = r2
        L88:
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createBuilderTypeReference()
            r0.type = r1
            r0 = r19
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r11
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L318
        Lb2:
            r0 = r24
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r23 = r0
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r23
            char[] r2 = r2.name
            r1.<init>(r2)
            r25 = r0
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld7
            r0 = r13
            goto Le7
        Ld7:
            r0 = r11
            boolean r0 = r0.oldFluent
            if (r0 == 0) goto Le4
            java.lang.String r0 = ""
            goto Le7
        Le4:
            java.lang.String r0 = "set"
        Le7:
            r26 = r0
            r0 = r26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lfe
            r0 = r11
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            r1 = r26
            r2 = r25
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r25 = r0
        Lfe:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r23
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L113
            r0 = 1
            goto L114
        L113:
            r0 = 2
        L114:
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r28 = r0
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L131
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L185
        L131:
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 != 0) goto L141
            r0 = r23
            char[] r0 = r0.rawName
            goto L14e
        L141:
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            char[] r0 = r0.toCharArray()
        L14e:
            r29 = r0
            r0 = 0
            r30 = r0
            goto L17a
        L156:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r29
            r3 = 0
            r1.<init>(r2, r3)
            r31 = r0
            r0 = r31
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r28
            r1 = r30
            r2 = r31
            r0[r1] = r2
            int r30 = r30 + 1
        L17a:
            r0 = r30
            r1 = r28
            int r1 = r1.length
            if (r0 < r1) goto L156
            goto L291
        L185:
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            r29 = r0
            r0 = r23
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            r30 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r31 = r0
            r0 = r30
            if (r0 == 0) goto L1f5
            r0 = r12
            if (r0 == 0) goto L1e5
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto L1e5
            r0 = r31
            r1 = r12
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
            r0.typeArguments = r1
            r0 = 0
            r32 = r0
            goto L1de
        L1c4:
            r0 = r31
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r1 = r32
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r12
            r5 = r32
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r32 = r32 + 1
        L1de:
            r0 = r32
            r1 = r12
            int r1 = r1.length
            if (r0 < r1) goto L1c4
        L1e5:
            r0 = r31
            r1 = r11
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNameReference(r1, r2)
            r0.receiver = r1
            goto L203
        L1f5:
            r0 = r31
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
        L203:
            r0 = r31
            r1 = r29
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r30
            if (r0 == 0) goto L227
            r0 = r31
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ThisReference r4 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r5 = r4
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
        L227:
            r0 = 0
            r32 = r0
            goto L242
        L22d:
            r0 = r28
            r1 = r32
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r23
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r32 = r32 + 1
        L242:
            r0 = r32
            r1 = r28
            int r1 = r1.length
            if (r0 < r1) goto L22d
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r23
            char[] r2 = r2.name
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r32 = r0
            r0 = r32
            r1 = 16
            r0.modifiers = r1
            r0 = r32
            r1 = r23
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.type = r1
            r0 = r32
            r1 = r31
            r0.initialization = r1
            r0 = r21
            if (r0 != 0) goto L287
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
        L287:
            r0 = r21
            r1 = r32
            boolean r0 = r0.add(r1)
        L291:
            r0 = r27
            r1 = r25
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r23
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L2b8
            r0 = r27
            r1 = r28
            r0.arguments = r1
            r0 = r27
            r1 = r20
            r0.receiver = r1
            r0 = r27
            r20 = r0
            goto L318
        L2b8:
            r0 = r27
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            r4 = r28
            r5 = 1
            r4 = r4[r5]
            r2[r3] = r4
            r0.arguments = r1
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleBuilder.BUILDER_TEMP_VAR
            r4 = r16
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r28
            r3 = 0
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = r14
            r6 = r15
            r4.<init>(r5, r6)
            r4 = 29
            r1.<init>(r2, r3, r4)
            r29 = r0
            r0 = r22
            if (r0 != 0) goto L301
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r22 = r0
        L301:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r2 = r1
            r3 = r29
            r4 = r27
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L318:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb2
            r0 = r21
            if (r0 != 0) goto L32b
            r0 = 0
            goto L332
        L32b:
            r0 = r21
            int r0 = r0.size()
        L332:
            r23 = r0
            r0 = r22
            if (r0 != 0) goto L33d
            r0 = 0
            goto L344
        L33d:
            r0 = r22
            int r0 = r0.size()
        L344:
            r24 = r0
            r0 = r24
            if (r0 <= 0) goto L418
            r0 = r18
            r1 = r23
            r2 = r24
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 + r2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            r0 = 0
            r25 = r0
            goto L377
        L360:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r25
            r2 = r21
            r3 = r25
            java.lang.Object r2 = r2.get(r3)
            org.eclipse.jdt.internal.compiler.ast.Statement r2 = (org.eclipse.jdt.internal.compiler.ast.Statement) r2
            r0[r1] = r2
            int r25 = r25 + 1
        L377:
            r0 = r25
            r1 = r23
            if (r0 < r1) goto L360
            r0 = 0
            r25 = r0
            goto L3a0
        L384:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r23
            r2 = 1
            int r1 = r1 + r2
            r2 = r25
            int r1 = r1 + r2
            r2 = r22
            r3 = r25
            java.lang.Object r2 = r2.get(r3)
            org.eclipse.jdt.internal.compiler.ast.Statement r2 = (org.eclipse.jdt.internal.compiler.ast.Statement) r2
            r0[r1] = r2
            int r25 = r25 + 1
        L3a0:
            r0 = r25
            r1 = r24
            if (r0 < r1) goto L384
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.BUILDER_TEMP_VAR
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r23
            r2 = r25
            r0[r1] = r2
            r0 = r25
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r25
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createBuilderTypeReference()
            r0.type = r1
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r14
            r0.sourceStart = r1
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r15
            r0.sourceEnd = r1
            r0 = r25
            r1 = r20
            r0.initialization = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r23
            r2 = r24
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r2 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r3 = r2
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleBuilder.BUILDER_TEMP_VAR
            r7 = r16
            r5.<init>(r6, r7)
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6)
            r0[r1] = r2
            goto L45d
        L418:
            r0 = r18
            r1 = r23
            r2 = 1
            int r1 = r1 + r2
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r0.statements = r1
            r0 = 0
            r25 = r0
            goto L441
        L42a:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r25
            r2 = r21
            r3 = r25
            java.lang.Object r2 = r2.get(r3)
            org.eclipse.jdt.internal.compiler.ast.Statement r2 = (org.eclipse.jdt.internal.compiler.ast.Statement) r2
            r0[r1] = r2
            int r25 = r25 + 1
        L441:
            r0 = r25
            r1 = r23
            if (r0 < r1) goto L42a
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            r1 = r23
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r2 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r3 = r2
            r4 = r20
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6)
            r0[r1] = r2
        L45d:
            r0 = r11
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r18
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r18
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = r11
            lombok.eclipse.EclipseNode r2 = r2.parentType
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r18
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateCleanMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r10
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L45
        L16:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r12 = r0
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L45
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L45
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r10
            lombok.eclipse.EclipseNode r2 = r2.builderType
            r3 = r11
            r0.appendCleaningCode(r1, r2, r3)
        L45:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L16
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME
            r3 = 0
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            r3 = r12
            org.eclipse.jdt.internal.compiler.ast.FalseLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.FalseLiteral
            r5 = r4
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7)
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r13 = r0
            r0 = r13
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.CLEAN_METHOD_NAME
            r0.selector = r1
            r0 = r13
            r1 = 2
            r0.modifiers = r1
            r0 = r13
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r13
            r1 = 6
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = r13
            r1 = r11
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
            r0.statements = r1
            r0 = r13
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r13
            return r0
    }

    static org.eclipse.jdt.internal.compiler.ast.Receiver generateBuildReceiver(lombok.eclipse.handlers.HandleBuilder.BuilderJob r9) {
            r0 = r9
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateCalledMethods()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L44
        L21:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r11 = r0
            r0 = r11
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L44
            r0 = r11
            char[] r0 = r0.nameOfSetFlag
            if (r0 != 0) goto L44
            r0 = r10
            r1 = r11
            char[] r1 = r1.name
            boolean r0 = r0.add(r1)
        L44:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r10
            int r0 = r0.size()
            if (r0 != 0) goto L58
            r0 = 0
            return r0
        L58:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceStart
            r11 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceEnd
            r12 = r0
            java.lang.String r0 = "org.checkerframework.checker.calledmethods.qual.CalledMethods"
            char[][] r0 = lombok.eclipse.Eclipse.fromQualifiedName(r0)
            r13 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = new org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r3 = r2
            r4 = r13
            r5 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r5 = r5.source
            r6 = r13
            int r6 = r6.length
            long[] r5 = lombok.eclipse.Eclipse.poss(r5, r6)
            r3.<init>(r4, r5)
            r3 = r11
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r10
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto Lb3
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r1 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r2 = r1
            r3 = r10
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            char[] r3 = (char[]) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.memberValue = r1
            goto L10e
        Lb3:
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r11
            r0.sourceStart = r1
            r0 = r15
            r1 = r12
            r0.sourceEnd = r1
            r0 = r15
            r1 = r10
            int r1 = r1.size()
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.expressions = r1
            r0 = 0
            r16 = r0
            goto Lfc
        Ldc:
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.StringLiteral r2 = new org.eclipse.jdt.internal.compiler.ast.StringLiteral
            r3 = r2
            r4 = r10
            r5 = r16
            java.lang.Object r4 = r4.get(r5)
            char[] r4 = (char[]) r4
            r5 = r11
            r6 = r12
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            int r16 = r16 + 1
        Lfc:
            r0 = r16
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = r1.expressions
            int r1 = r1.length
            if (r0 < r1) goto Ldc
            r0 = r14
            r1 = r15
            r0.memberValue = r1
        L10e:
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createBuilderTypeReference()
            r15 = r0
            r0 = r15
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r16 = r0
            r0 = r15
            r1 = r16
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r16
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            r3[r4] = r5
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.Receiver r0 = new org.eclipse.jdt.internal.compiler.ast.Receiver
            r1 = r0
            r2 = 4
            char[] r2 = new char[r2]
            r3 = r2
            r4 = 0
            r5 = 116(0x74, float:1.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 104(0x68, float:1.46E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 105(0x69, float:1.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 115(0x73, float:1.61E-43)
            r3[r4] = r5
            r3 = 0
            r4 = r15
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateBuildMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r10, char[] r11, org.eclipse.jdt.internal.compiler.ast.TypeReference r12, org.eclipse.jdt.internal.compiler.ast.TypeReference[] r13, boolean r14) {
            r9 = this;
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r15 = r0
            r0 = r15
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L6f
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME
            r3 = 0
            r1.<init>(r2, r3)
            r17 = r0
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r17
            r3 = 11
            r1.<init>(r2, r3)
            r18 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.CLEAN_METHOD_NAME
            r0.selector = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L6f:
            r0 = r10
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lba
        L7d:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r17 = r0
            r0 = r17
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto Lba
            r0 = r17
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto Lba
            r0 = r17
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r17
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r10
            lombok.eclipse.EclipseNode r2 = r2.builderType
            r3 = r16
            r4 = r17
            char[] r4 = r4.builderFieldName
            java.lang.String r5 = "this"
            r0.appendBuildCode(r1, r2, r3, r4, r5)
        Lba:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7d
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r10
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
            goto L24a
        Ldb:
            r0 = r19
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r18 = r0
            r0 = r18
            char[] r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L1ed
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r18
            char[] r2 = r2.builderFieldName
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r20 = r0
            r0 = r20
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r18
            char[] r2 = r2.builderFieldName
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r20
            r1 = r21
            r0.initialization = r1
            r0 = r16
            r1 = r20
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r22
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r10
            lombok.eclipse.EclipseNode r3 = r3.parentType
            java.lang.Object r3 = r3.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r3
            char[] r3 = r3.name
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r22
            r1 = r18
            char[] r1 = r1.nameOfDefaultProvider
            r0.selector = r1
            r0 = r22
            r1 = r9
            r2 = r10
            lombok.eclipse.EclipseNode r2 = r2.builderType
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.typeParameterNames(r2)
            r0.typeArguments = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r18
            char[] r4 = r4.builderFieldName
            r5 = 0
            r3.<init>(r4, r5)
            r3 = r22
            r4 = 0
            r1.<init>(r2, r3, r4)
            r23 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r18
            char[] r2 = r2.nameOfSetFlag
            r3 = 0
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            org.eclipse.jdt.internal.compiler.ast.UnaryExpression r0 = new org.eclipse.jdt.internal.compiler.ast.UnaryExpression
            r1 = r0
            r2 = r24
            r3 = 11
            r1.<init>(r2, r3)
            r25 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r2 = r1
            r3 = r25
            r4 = r23
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L1ed:
            r0 = r18
            char[] r0 = r0.nameOfSetFlag
            if (r0 != 0) goto L20b
            r0 = r18
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L223
            r0 = r18
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.shadowedDuringBuild()
            if (r0 == 0) goto L223
        L20b:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r18
            char[] r3 = r3.builderFieldName
            r4 = 0
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto L24a
        L223:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r18
            char[] r2 = r2.builderFieldName
            r3 = 0
            r1.<init>(r2, r3)
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r17
            r1 = r20
            boolean r0 = r0.add(r1)
        L24a:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ldb
            r0 = r14
            if (r0 == 0) goto L28f
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME
            r3 = 0
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.Assignment r1 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r2 = r1
            r3 = r18
            org.eclipse.jdt.internal.compiler.ast.TrueLiteral r4 = new org.eclipse.jdt.internal.compiler.ast.TrueLiteral
            r5 = r4
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7)
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L28f:
            r0 = r15
            r1 = r10
            lombok.AccessLevel r1 = r1.accessInners
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r15
            r1 = r10
            java.lang.String r1 = r1.buildMethodName
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r15
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypes(r1)
            r0.thrownExceptions = r1
            r0 = r15
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r15
            r1 = r12
            r0.returnType = r1
            r0 = r11
            if (r0 != 0) goto L315
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r15
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
            r0.type = r1
            r0 = r18
            r1 = r17
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2ee
            r1 = 0
            goto L2fc
        L2ee:
            r1 = r17
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
        L2fc:
            r0.arguments = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r1 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r2 = r1
            r3 = r18
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            goto L3d5
        L315:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r11
            r0.selector = r1
            r0 = r10
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L34b
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            r3 = r10
            lombok.eclipse.EclipseNode r3 = r3.builderType
            lombok.core.LombokNode r3 = r3.m66up()
            lombok.eclipse.EclipseNode r3 = (lombok.eclipse.EclipseNode) r3
            java.lang.String r3 = r3.getName()
            char[] r3 = r3.toCharArray()
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            goto L367
        L34b:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.QualifiedThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedThisReference
            r2 = r1
            r3 = r10
            lombok.eclipse.EclipseNode r3 = r3.builderType
            lombok.core.LombokNode r3 = r3.m66up()
            lombok.eclipse.EclipseNode r3 = (lombok.eclipse.EclipseNode) r3
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = lombok.eclipse.handlers.EclipseHandlerUtil.generateTypeReference(r3, r4)
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            r0.receiver = r1
        L367:
            r0 = r18
            r1 = r9
            r2 = r10
            lombok.eclipse.EclipseNode r2 = r2.builderType
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.typeParameterNames(r2)
            r0.typeArguments = r1
            r0 = r18
            r1 = r17
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L38d
            r1 = 0
            goto L39b
        L38d:
            r1 = r17
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r2 = new org.eclipse.jdt.internal.compiler.ast.Expression[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = (org.eclipse.jdt.internal.compiler.ast.Expression[]) r1
        L39b:
            r0.arguments = r1
            r0 = r12
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L3c2
            char[] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.VOID
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r1
            char[] r1 = r1.token
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L3c2
            r0 = r16
            r1 = r18
            boolean r0 = r0.add(r1)
            goto L3d5
        L3c2:
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r1 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r2 = r1
            r3 = r18
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L3d5:
            r0 = r15
            r1 = r16
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3e5
            r1 = 0
            goto L3f3
        L3e5:
            r1 = r16
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        L3f3:
            r0.statements = r1
            r0 = r10
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L416
            r0 = r15
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = r4.source
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
        L416:
            r0 = r15
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.Receiver r1 = generateBuildReceiver(r1)
            r0.receiver = r1
            r0 = r11
            if (r0 != 0) goto L42c
            r0 = r10
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r15
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L42c:
            r0 = r15
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r15
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] typeParameterNames(org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r9) {
            r8 = this;
            r0 = r9
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r9
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r10 = r0
            r0 = 0
            r11 = r0
            goto L25
        L11:
            r0 = r10
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r9
            r5 = r11
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r11 = r11 + 1
        L25:
            r0 = r11
            r1 = r10
            int r1 = r1.length
            if (r0 < r1) goto L11
            r0 = r10
            return r0
    }

    public static org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateDefaultProvider(char[] r10, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r11, lombok.eclipse.EclipseNode r12, org.eclipse.jdt.internal.compiler.ast.ASTNode r13) {
            r0 = r13
            int r0 = r0.sourceStart
            r14 = r0
            r0 = r13
            int r0 = r0.sourceEnd
            r15 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r12
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            r1 = r11
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r0.typeParameters = r1
            r0 = r16
            r1 = r10
            r0.selector = r1
            r0 = r16
            r1 = 10
            r0.modifiers = r1
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r12
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r17 = r0
            r0 = r16
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.returnType = r1
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto Laa
            org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.initialization
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r1 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r1
            r0.initializer = r1
            r0 = r19
            r1 = r17
            r2 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            char[][] r2 = r2.getTypeName()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r1, r2)
            r0.type = r1
            r0 = r19
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            int r1 = r1.dimensions()
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.dimensions = r1
            r0 = r19
            r18 = r0
            goto Lb1
        Laa:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            r18 = r0
        Lb1:
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            r6 = r18
            r7 = r14
            r8 = r15
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
            r0 = r17
            r1 = 0
            r0.initialization = r1
            r0 = r16
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r13
            r2.<init>(r3)
            r2 = r12
            lombok.core.LombokNode r2 = r2.m66up()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r16
            return r0
    }

    public org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateBuilderMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r11) {
            r10 = this;
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r11
            long r0 = r0.getPos()
            r14 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r16 = r0
            r0 = r16
            r1 = r11
            java.lang.String r1 = r1.builderMethodName
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r16
            r1 = r11
            lombok.AccessLevel r1 = r1.accessOuters
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r11
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L47
            r0 = r16
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
        L47:
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r16
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createBuilderTypeReference()
            r0.returnType = r1
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L9d
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r17 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r17
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r17
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r5 = r5.source
            java.lang.String r6 = "org.checkerframework.common.aliasing.qual.Unique"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r5 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r5, r6)
            r3[r4] = r5
            r0[r1] = r2
        L9d:
            r0 = r16
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.copyTypeParams()
            r0.typeParameters = r1
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r11
            boolean r0 = r0.isStatic
            if (r0 == 0) goto Ld9
            r0 = r17
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.createBuilderTypeReferenceForceStatic()
            r0.type = r1
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            r6 = r17
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
            goto L13f
        Ld9:
            org.eclipse.jdt.internal.compiler.ast.QualifiedAllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedAllocationExpression
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4)
            r0.enclosingInstance = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            if (r0 == 0) goto Lff
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            if (r0 != 0) goto L114
        Lff:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r11
            char[] r3 = r3.builderClassNameArr
            r4 = r14
            r2.<init>(r3, r4)
            r0.type = r1
            goto L128
        L114:
            r0 = r18
            r1 = 0
            r2 = r11
            char[] r2 = r2.builderClassNameArr
            r3 = 0
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r0.type = r1
        L128:
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            r6 = r18
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
        L13f:
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L15f
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = r4.source
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
        L15f:
            r0 = r11
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r16
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r16
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = r11
            lombok.eclipse.EclipseNode r2 = r2.builderType
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r16
            return r0
    }

    public void generateBuilderFields(lombok.eclipse.handlers.HandleBuilder.BuilderJob r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            lombok.eclipse.EclipseNode r0 = r0.builderType
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L34
        L17:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L34
            r0 = r8
            r1 = r9
            boolean r0 = r0.add(r1)
        L34:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L17
            r0 = r7
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L196
        L4c:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r9 = r0
            r0 = r9
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L87
            r0 = r9
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L87
            r0 = r9
            java.util.List<lombok.eclipse.EclipseNode> r0 = r0.createdFields
            r1 = r9
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r1 = r1.getSingularizer()
            r2 = r9
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r7
            lombok.eclipse.EclipseNode r3 = r3.builderType
            java.util.List r1 = r1.generateFields(r2, r3)
            boolean r0 = r0.addAll(r1)
            goto L196
        L87:
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto Ld8
        L98:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r13 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            char[] r0 = r0.name
            r15 = r0
            r0 = r15
            r1 = r9
            char[] r1 = r1.builderFieldName
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lc1
            r0 = r13
            r11 = r0
        Lc1:
            r0 = r9
            char[] r0 = r0.nameOfSetFlag
            if (r0 == 0) goto Ld8
            r0 = r15
            r1 = r9
            char[] r1 = r1.nameOfSetFlag
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Ld8
            r0 = r13
            r12 = r0
        Ld8:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L98
            r0 = r11
            if (r0 != 0) goto L137
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r9
            char[] r2 = r2.builderFieldName
            java.lang.Object r2 = r2.clone()
            char[] r2 = (char[]) r2
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r13
            r1 = 2
            r0.modifiers = r1
            r0 = r13
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
            r0.type = r1
            r0 = r13
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r7
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r13
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r11 = r0
        L137:
            r0 = r12
            if (r0 != 0) goto L18a
            r0 = r9
            char[] r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L18a
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            r2 = r9
            char[] r2 = r2.nameOfSetFlag
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r13
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r13
            r1 = 2
            r0.modifiers = r1
            r0 = r13
            r1 = 5
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r13
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r7
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r13
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        L18a:
            r0 = r9
            java.util.List<lombok.eclipse.EclipseNode> r0 = r0.createdFields
            r1 = r11
            boolean r0 = r0.add(r1)
        L196:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            return
    }

    public void makePrefixedSetterMethodsForBuilder(lombok.eclipse.handlers.HandleBuilder.BuilderJob r7, lombok.eclipse.handlers.HandleBuilder.BuilderFieldData r8, java.lang.String r9) {
            r6 = this;
            r0 = r8
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            r10 = r0
            r0 = r8
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1a
            r0 = r8
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 != 0) goto L26
        L1a:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r9
            r0.makePrefixedSetterMethodForBuilder(r1, r2, r3, r4)
            goto L37
        L26:
            r0 = r8
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r7
            r2 = r8
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r10
            r0.generateMethods(r1, r2, r3)
        L37:
            return
    }

    private void makePrefixedSetterMethodForBuilder(lombok.eclipse.handlers.HandleBuilder.BuilderJob r17, lombok.eclipse.handlers.HandleBuilder.BuilderFieldData r18, boolean r19, java.lang.String r20) {
            r16 = this;
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r21 = r0
            r0 = r18
            java.util.List<lombok.eclipse.EclipseNode> r0 = r0.createdFields
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r22 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L2c
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = lombok.eclipse.handlers.HandleBuilder.EMPTY_METHODS
            r23 = r0
        L2c:
            r0 = r23
            int r0 = r0.length
            r24 = r0
            r0 = r20
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3f
            java.lang.String r0 = "set"
            goto L41
        L3f:
            r0 = r20
        L41:
            r25 = r0
            r0 = r17
            boolean r0 = r0.oldFluent
            if (r0 == 0) goto L79
            r0 = r20
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r18
            char[] r2 = r2.name
            r1.<init>(r2)
            goto L74
        L60:
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            r1 = r25
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r18
            char[] r4 = r4.name
            r3.<init>(r4)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
        L74:
            r26 = r0
            goto L8f
        L79:
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            r1 = r25
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r18
            char[] r4 = r4.name
            r3.<init>(r4)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r26 = r0
        L8f:
            r0 = 0
            r27 = r0
            goto Lcb
        L95:
            r0 = r23
            r1 = r27
            r0 = r0[r1]
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto La3
            goto Lc8
        La3:
            r0 = r23
            r1 = r27
            r0 = r0[r1]
            char[] r0 = r0.selector
            r28 = r0
            r0 = r26
            char[] r0 = r0.toCharArray()
            r1 = r28
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lc8
            r0 = r22
            r1 = r23
            r2 = r27
            r1 = r1[r2]
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isTolerate(r0, r1)
            if (r0 != 0) goto Lc8
            return
        Lc8:
            int r27 = r27 + 1
        Lcb:
            r0 = r27
            r1 = r24
            if (r0 < r1) goto L95
            java.util.List r0 = java.util.Collections.emptyList()
            r27 = r0
            r0 = r18
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableToSetterAnnotations(r0)
            r28 = r0
            r0 = r28
            if (r0 == 0) goto Lf2
            r0 = r28
            int r0 = r0.length
            if (r0 <= 0) goto Lf2
            r0 = r28
            java.util.List r0 = java.util.Arrays.asList(r0)
            r27 = r0
        Lf2:
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r29 = r0
            r0 = r21
            r1 = r19
            r2 = r22
            r3 = r26
            r4 = r18
            char[] r4 = r4.name
            r5 = r18
            char[] r5 = r5.nameOfSetFlag
            r6 = r17
            boolean r6 = r6.oldChain
            r7 = r17
            lombok.AccessLevel r7 = r7.accessInners
            int r7 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r7)
            r8 = r17
            lombok.eclipse.EclipseNode r8 = r8.sourceNode
            r9 = r27
            r10 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r10 = r10.annotations
            if (r10 == 0) goto L13b
            r10 = r29
            r11 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r11 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r11]
            r12 = r11
            r13 = 0
            r14 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r14 = r14.annotations
            r12[r13] = r14
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r10 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r10, r11)
            java.util.List r10 = java.util.Arrays.asList(r10)
            goto L13e
        L13b:
            java.util.List r10 = java.util.Collections.emptyList()
        L13e:
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = lombok.eclipse.handlers.HandleSetter.createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r30 = r0
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L172
            r0 = r16
            r1 = r18
            lombok.eclipse.EclipseNode r1 = r1.originalFieldNode
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.eclipse.EclipseNode r1 = (lombok.eclipse.EclipseNode) r1
            r2 = r30
            r3 = r21
            r4 = r18
            char[] r4 = r4.name
            java.lang.String r4 = r4.toString()
            r0.copyJavadocFromParam(r1, r2, r3, r4)
            goto L181
        L172:
            r0 = r18
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            r1 = r30
            r2 = r21
            lombok.eclipse.handlers.EclipseHandlerUtil$CopyJavadoc r3 = lombok.eclipse.handlers.EclipseHandlerUtil.CopyJavadoc.SETTER
            r4 = 1
            lombok.eclipse.handlers.EclipseHandlerUtil.copyJavadoc(r0, r1, r2, r3, r4)
        L181:
            r0 = r17
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r30
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void copyJavadocFromParam(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r7, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r8, java.lang.String r9) {
            r5 = this;
            r0 = r6
            lombok.core.LombokNode r0 = r0.top()     // Catch: java.lang.Exception -> L2d
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Exception -> L2d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L2d
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0     // Catch: java.lang.Exception -> L2d
            r10 = r0
            r0 = r6
            java.lang.String r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getDocComment(r0)     // Catch: java.lang.Exception -> L2d
            r11 = r0
            r0 = r11
            r1 = r9
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.getParamJavadoc(r0, r1)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)     // Catch: java.lang.Exception -> L2d
            r12 = r0
            r0 = r10
            r1 = r8
            r2 = r7
            r3 = r12
            lombok.eclipse.handlers.EclipseHandlerUtil.setDocComment(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
        L2e:
            return
    }

    public void makeBuilderClass(lombok.eclipse.handlers.HandleBuilder.BuilderJob r6) {
            r5 = this;
            r0 = r6
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r7 = r0
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            r1 = r0
            r2 = r7
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r8
            r1 = r0
            int r1 = r1.modifiers
            r2 = r6
            lombok.AccessLevel r2 = r2.accessOuters
            int r2 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r2)
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r6
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L45
            r0 = r8
            r1 = r0
            int r1 = r1.modifiers
            r2 = 8
            r1 = r1 | r2
            r0.modifiers = r1
        L45:
            r0 = r8
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.copyTypeParams()
            r0.typeParameters = r1
            r0 = r8
            r1 = r6
            char[] r1 = r1.builderClassNameArr
            r0.name = r1
            r0 = r8
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r6
            r1 = r6
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r8
            lombok.eclipse.EclipseNode r1 = lombok.eclipse.handlers.EclipseHandlerUtil.injectType(r1, r2)
            r0.builderType = r1
            return
    }

    private void addObtainVia(lombok.eclipse.handlers.HandleBuilder.BuilderFieldData r4, lombok.eclipse.EclipseNode r5) {
            r3 = this;
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L3f
        Lc:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r6 = r0
            java.lang.Class<lombok.Builder$ObtainVia> r0 = lombok.Builder.ObtainVia.class
            r1 = r6
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L24
            goto L3f
        L24:
            java.lang.Class<lombok.Builder$ObtainVia> r0 = lombok.Builder.ObtainVia.class
            r1 = r6
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.annotation.Annotation r1 = r1.getInstance()
            lombok.Builder$ObtainVia r1 = (lombok.Builder.ObtainVia) r1
            r0.obtainVia = r1
            r0 = r4
            r1 = r6
            r0.obtainViaNode = r1
            return
        L3f:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            return
    }

    private lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData getSingularData(lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, java.lang.String r15) {
            r12 = this;
            r0 = r13
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L1c5
        Lc:
            r0 = r17
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r16 = r0
            java.lang.Class<lombok.Singular> r0 = lombok.Singular.class
            r1 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L26
            goto L1c5
        L26:
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L37
            r0 = r13
            char[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r0)
            goto L41
        L37:
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0
            char[] r0 = r0.name
        L41:
            r18 = r0
            java.lang.Class<lombok.Singular> r0 = lombok.Singular.class
            r1 = r16
            lombok.core.AnnotationValues r0 = lombok.eclipse.handlers.EclipseHandlerUtil.createAnnotation(r0, r1)
            r19 = r0
            r0 = r19
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Singular r0 = (lombok.Singular) r0
            r20 = r0
            r0 = r20
            java.lang.String r0 = r0.value()
            r21 = r0
            r0 = r21
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r13
            lombok.eclipse.EclipseAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.SINGULAR_AUTO
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L90
            r0 = r13
            java.lang.String r1 = "The singular must be specified explicitly (e.g. @Singular(\"task\")) because auto singularization is disabled."
            r0.addError(r1)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r18
            r1.<init>(r2)
            r21 = r0
            goto Lb5
        L90:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r18
            r1.<init>(r2)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.autoSingularize(r0)
            r21 = r0
            r0 = r21
            if (r0 != 0) goto Lb5
            r0 = r13
            java.lang.String r1 = "Can't singularize this name; please specify the singular explicitly (i.e. @Singular(\"sheep\"))"
            r0.addError(r1)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r18
            r1.<init>(r2)
            r21 = r0
        Lb5:
            r0 = r21
            char[] r0 = r0.toCharArray()
            r22 = r0
            r0 = r13
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r23
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 == 0) goto Lf1
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r24 = r0
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r23
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r2
            char[] r2 = r2.token
            r1.<init>(r2)
            r25 = r0
            goto L160
        Lf1:
            r0 = r23
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            if (r0 == 0) goto L159
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L112
            r0 = r26
            r1 = r26
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r24 = r0
        L112:
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r27 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = 0
            r29 = r0
            goto L147
        L12b:
            r0 = r29
            if (r0 <= 0) goto L139
            r0 = r28
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
        L139:
            r0 = r28
            r1 = r27
            r2 = r29
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            int r29 = r29 + 1
        L147:
            r0 = r29
            r1 = r27
            int r1 = r1.length
            if (r0 < r1) goto L12b
            r0 = r28
            java.lang.String r0 = r0.toString()
            r25 = r0
            goto L160
        L159:
            r0 = r23
            java.lang.String r0 = r0.toString()
            r25 = r0
        L160:
            lombok.eclipse.handlers.EclipseSingularsRecipes r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.get()
            r1 = r25
            java.lang.String r0 = r0.toQualified(r1)
            r26 = r0
            lombok.eclipse.handlers.EclipseSingularsRecipes r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.get()
            r1 = r26
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer(r1)
            r27 = r0
            r0 = r27
            if (r0 != 0) goto L197
            r0 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok does not know how to create the singular-form builder methods for type '"
            r2.<init>(r3)
            r2 = r25
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'; they won't be generated."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L197:
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = new lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData
            r1 = r0
            r2 = r16
            r3 = r22
            r4 = r18
            r5 = r24
            if (r5 != 0) goto L1ac
            java.util.List r5 = java.util.Collections.emptyList()
            goto L1b1
        L1ac:
            r5 = r24
            java.util.List r5 = java.util.Arrays.asList(r5)
        L1b1:
            r6 = r26
            r7 = r27
            r8 = r14
            r9 = r20
            boolean r9 = r9.ignoreNullCollections()
            r10 = r15
            char[] r10 = r10.toCharArray()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L1c5:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
    }

    static /* synthetic */ boolean access$0(java.lang.Object r3, boolean r4) {
            r0 = r3
            r1 = r4
            boolean r0 = toBoolean(r0, r1)
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m70xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleBuilder.f572xb87c1847
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.EXISTS_BY_USER     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.eclipse.handlers.HandleBuilder.f572xb87c1847 = r1
            return r0
    }
}
