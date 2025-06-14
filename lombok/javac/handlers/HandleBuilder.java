package lombok.javac.handlers;

@lombok.core.HandlerPriority(-1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilder.SCL.lombok */
public class HandleBuilder extends lombok.javac.JavacAnnotationHandler<lombok.Builder> {
    private lombok.javac.handlers.HandleConstructor handleConstructor;
    static final java.lang.String CLEAN_FIELD_NAME = "$lombokUnclean";
    static final java.lang.String CLEAN_METHOD_NAME = "$lombokClean";
    static final java.lang.String TO_BUILDER_METHOD_NAME = "toBuilder";
    static final java.lang.String DEFAULT_PREFIX = "$default$";
    static final java.lang.String SET_PREFIX = "$set";
    static final java.lang.String VALUE_PREFIX = "$value";
    static final java.lang.String BUILDER_TEMP_VAR = "builder";
    static final java.lang.String TO_BUILDER_NOT_SUPPORTED = "@Builder(toBuilder=true) is only supported if you return your own type.";

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f586x2486df07;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilder$BuilderFieldData.SCL.lombok */
    static class BuilderFieldData {
        com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> annotations;
        com.sun.tools.javac.tree.JCTree.JCExpression type;
        com.sun.tools.javac.util.Name rawName;
        com.sun.tools.javac.util.Name name;
        com.sun.tools.javac.util.Name builderFieldName;
        com.sun.tools.javac.util.Name nameOfDefaultProvider;
        com.sun.tools.javac.util.Name nameOfSetFlag;
        lombok.javac.handlers.JavacSingularsRecipes.SingularData singularData;
        lombok.Builder.ObtainVia obtainVia;
        lombok.javac.JavacNode obtainViaNode;
        lombok.javac.JavacNode originalFieldNode;
        java.util.List<lombok.javac.JavacNode> createdFields;

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

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleBuilder$BuilderJob.SCL.lombok */
    static class BuilderJob {
        lombok.core.configuration.CheckerFrameworkVersion checkerFramework;
        lombok.javac.JavacNode parentType;
        java.lang.String builderMethodName;
        java.lang.String buildMethodName;
        boolean isStatic;
        com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> typeParams;
        com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> builderTypeParams;
        lombok.javac.JavacNode sourceNode;
        java.util.List<lombok.javac.handlers.HandleBuilder.BuilderFieldData> builderFields;
        lombok.AccessLevel accessInners;
        lombok.AccessLevel accessOuters;
        boolean oldFluent;
        boolean oldChain;
        boolean toBuilder;
        lombok.javac.JavacNode builderType;
        java.lang.String builderClassName;

        BuilderJob() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        void init(lombok.core.AnnotationValues<lombok.Builder> r5, lombok.Builder r6, lombok.javac.JavacNode r7) {
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
                lombok.javac.JavacNode r0 = r0.sourceNode
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
                boolean r1 = lombok.javac.handlers.HandleBuilder.access$0(r1, r2)
                r0.oldFluent = r1
                r0 = r4
                r1 = r5
                java.lang.String r2 = "chain"
                java.lang.Object r1 = r1.getActualExpression(r2)
                r2 = 1
                boolean r1 = lombok.javac.handlers.HandleBuilder.access$0(r1, r2)
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
                r0.builderClassName = r1
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
                r0 = r4
                java.lang.String r0 = r0.builderClassName
                if (r0 != 0) goto Lb9
                r0 = r4
                java.lang.String r1 = ""
                r0.builderClassName = r1
            Lb9:
                return
        }

        static java.lang.String getBuilderClassNameTemplate(lombok.javac.JavacNode r3, java.lang.String r4) {
                r0 = r4
                if (r0 == 0) goto Ld
                r0 = r4
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Ld
                r0 = r4
                return r0
            Ld:
                r0 = r3
                lombok.javac.JavacAST r0 = r0.getAst()
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

        java.lang.String replaceBuilderClassName(com.sun.tools.javac.util.Name r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                java.lang.String r1 = r1.toString()
                r2 = r4
                java.lang.String r2 = r2.builderClassName
                java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
                return r0
        }

        java.lang.String replaceBuilderClassName(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                r0 = r6
                r1 = 42
                int r0 = r0.indexOf(r1)
                r1 = -1
                if (r0 != r1) goto Lc
                r0 = r6
                return r0
            Lc:
                r0 = r6
                java.lang.String r1 = "*"
                r2 = r5
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
        }

        com.sun.tools.javac.tree.JCTree.JCExpression createBuilderParentTypeReference() {
                r4 = this;
                r0 = r4
                lombok.javac.JavacNode r0 = r0.parentType
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r1 = r4
                lombok.javac.JavacNode r1 = r1.parentType
                r2 = r4
                com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
                return r0
        }

        com.sun.tools.javac.util.Name getBuilderClassName() {
                r3 = this;
                r0 = r3
                lombok.javac.JavacNode r0 = r0.parentType
                r1 = r3
                java.lang.String r1 = r1.builderClassName
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                return r0
        }

        com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> copyTypeParams() {
                r3 = this;
                r0 = r3
                lombok.javac.JavacNode r0 = r0.sourceNode
                r1 = r3
                com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r0, r1)
                return r0
        }

        com.sun.tools.javac.util.Name toName(java.lang.String r4) {
                r3 = this;
                r0 = r3
                lombok.javac.JavacNode r0 = r0.parentType
                r1 = r4
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                return r0
        }

        com.sun.tools.javac.util.Context getContext() {
                r2 = this;
                r0 = r2
                lombok.javac.JavacNode r0 = r0.parentType
                com.sun.tools.javac.util.Context r0 = r0.getContext()
                return r0
        }

        lombok.javac.JavacTreeMaker getTreeMaker() {
                r2 = this;
                r0 = r2
                lombok.javac.JavacNode r0 = r0.parentType
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                return r0
        }
    }

    public HandleBuilder() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            lombok.javac.handlers.HandleConstructor r1 = new lombok.javac.handlers.HandleConstructor
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
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCLiteral
            if (r0 == 0) goto L21
            r0 = r2
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = (com.sun.tools.javac.tree.JCTree.JCLiteral) r0
            java.lang.Object r0 = r0.value
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
        L21:
            r0 = r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.Builder> r11, com.sun.tools.javac.tree.JCTree.JCAnnotation r12, lombok.javac.JavacNode r13) {
            r10 = this;
            r0 = r13
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.BUILDER_FLAG_USAGE
            java.lang.String r2 = "@Builder"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
            lombok.javac.handlers.HandleBuilder$BuilderJob r0 = new lombok.javac.handlers.HandleBuilder$BuilderJob
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r14
            r1 = r13
            r0.sourceNode = r1
            r0 = r14
            r1 = r13
            lombok.core.configuration.CheckerFrameworkVersion r1 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r1)
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
            if (r0 == 0) goto L4d
            r0 = 0
            r17 = r0
            goto L5f
        L4d:
            java.lang.String r0 = "builderMethodName"
            r1 = r14
            java.lang.String r1 = r1.builderMethodName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L5c
            return
        L5c:
            r0 = 1
            r17 = r0
        L5f:
            java.lang.String r0 = "buildMethodName"
            r1 = r14
            java.lang.String r1 = r1.buildMethodName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L6e
            return
        L6e:
            r0 = r13
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r18 = r0
            r0 = r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.builderFields = r1
            r0 = r14
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r0.typeParams = r1
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L9b
            r0 = r18
            goto L9c
        L9b:
            r0 = 0
        L9c:
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r18
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto Lb6
            r0 = r13
            java.lang.String r1 = "@Builder is not supported on non-static nested classes."
            r0.addError(r1)
            return
        Lb6:
            r0 = r18
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L338
            r0 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto Ld8
            r0 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isRecord(r0)
            if (r0 != 0) goto Ld8
            r0 = r13
            java.lang.String r1 = "@Builder is only supported on classes, records, constructors, and methods."
            r0.addError(r1)
            return
        Ld8:
            r0 = r14
            r1 = r18
            r0.parentType = r1
            r0 = r18
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r25 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r26 = r0
            java.lang.Class<lombok.Value> r0 = lombok.Value.class
            r1 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L10a
            java.lang.String r0 = "lombok.experimental.Value"
            r1 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto L10a
            r0 = 0
            goto L10b
        L10a:
            r0 = 1
        L10b:
            r27 = r0
            r0 = r18
            r1 = 1
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.HandleConstructor.findAllFields(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L2c4
        L11b:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r28 = r0
            r0 = r28
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r30 = r0
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r28
            r2 = 0
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r31 = r0
            r0 = r30
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15f
            r0 = r27
            if (r0 == 0) goto L15b
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r28
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L15f
        L15b:
            r0 = 0
            goto L160
        L15f:
            r0 = 1
        L160:
            r32 = r0
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.javac.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r33 = r0
            r0 = r33
            r1 = r30
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.rawName = r1
            r0 = r33
            r1 = r28
            com.sun.tools.javac.util.Name r1 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r1)
            r0.name = r1
            r0 = r33
            r1 = r33
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.builderFieldName = r1
            r0 = r33
            r1 = r28
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r1)
            r0.annotations = r1
            r0 = r33
            r1 = r30
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r0.type = r1
            r0 = r33
            r1 = r10
            r2 = r28
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3)
            r0.singularData = r1
            r0 = r33
            r1 = r28
            r0.originalFieldNode = r1
            r0 = r33
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1d7
            r0 = r31
            if (r0 == 0) goto L1d7
            r0 = r31
            java.lang.String r1 = "@Builder.Default and @Singular cannot be mixed."
            r0.addError(r1)
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r28
            r2 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r0 = 0
            r31 = r0
        L1d7:
            r0 = r30
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L1f8
            r0 = r31
            if (r0 == 0) goto L1f8
            r0 = r31
            java.lang.String r1 = "@Builder.Default requires an initializing expression (' = something;')."
            r0.addWarning(r1)
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r28
            r2 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r0 = 0
            r31 = r0
        L1f8:
            r0 = r30
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L223
            r0 = r31
            if (r0 != 0) goto L223
            r0 = r32
            if (r0 == 0) goto L20d
            goto L2c4
        L20d:
            r0 = r24
            if (r0 != 0) goto L21b
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
        L21b:
            r0 = r24
            r1 = r28
            boolean r0 = r0.add(r1)
        L223:
            r0 = r31
            if (r0 == 0) goto L2a7
            r0 = r33
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "$default$"
            r3.<init>(r4)
            r3 = r33
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.nameOfDefaultProvider = r1
            r0 = r33
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r33
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$set"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.nameOfSetFlag = r1
            r0 = r33
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r33
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$value"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.builderFieldName = r1
            r0 = r33
            com.sun.tools.javac.util.Name r0 = r0.nameOfDefaultProvider
            r1 = r28
            r2 = r25
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = generateDefaultProvider(r0, r1, r2, r3)
            r34 = r0
            r0 = r34
            if (r0 == 0) goto L2a7
            r0 = r18
            r1 = r34
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L2a7:
            r0 = r10
            r1 = r33
            r2 = r28
            r0.addObtainVia(r1, r2)
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r33
            boolean r0 = r0.add(r1)
            r0 = r26
            r1 = r28
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L2c4:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11b
            r0 = r18
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isRecord(r0)
            if (r0 != 0) goto L2f0
            r0 = r10
            lombok.javac.handlers.HandleConstructor r0 = r0.handleConstructor
            r1 = r18
            lombok.AccessLevel r2 = lombok.AccessLevel.PACKAGE
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r26
            com.sun.tools.javac.util.List r4 = r4.toList()
            r5 = 0
            r6 = 0
            lombok.javac.handlers.HandleConstructor$SkipIfConstructorExists r7 = lombok.javac.handlers.HandleConstructor.SkipIfConstructorExists.I_AM_BUILDER
            r8 = r13
            r0.generateConstructor(r1, r2, r3, r4, r5, r6, r7, r8)
        L2f0:
            r0 = r18
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r18
            r2 = r25
            com.sun.tools.javac.util.List r2 = r2.typarams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r19 = r0
            r0 = r14
            r1 = r14
            r2 = r25
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r14
            r1 = r14
            r2 = r25
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.builderClassName = r1
            java.lang.String r0 = "builderClassName"
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L641
            return
        L338:
            r0 = r22
            if (r0 == 0) goto L3c5
            r0 = r22
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c5
            r0 = r22
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r25 = r0
            r0 = r25
            com.sun.tools.javac.util.List r0 = r0.typarams
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36b
            r0 = r13
            java.lang.String r1 = "@Builder is not supported on constructors with constructor type parameters."
            r0.addError(r1)
            return
        L36b:
            r0 = r14
            r1 = r18
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r0.parentType = r1
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r26 = r0
            r0 = r14
            r1 = r14
            r2 = r26
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r14
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.createBuilderParentTypeReference()
            r19 = r0
            r0 = r25
            com.sun.tools.javac.util.List r0 = r0.thrown
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r14
            r1 = r14
            r2 = r26
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.builderClassName = r1
            java.lang.String r0 = "builderClassName"
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            r2 = r13
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L641
            return
        L3c5:
            r0 = r22
            if (r0 == 0) goto L63a
            r0 = r14
            r1 = r18
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r0.parentType = r1
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r25 = r0
            r0 = r22
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r26 = r0
            r0 = r14
            r1 = r26
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.mods
            long r1 = r1.flags
            r2 = 8
            long r1 = r1 & r2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L405
            r1 = 1
            goto L406
        L405:
            r1 = 0
        L406:
            r0.isStatic = r1
            r0 = r26
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            r27 = r0
            r0 = r27
            r19 = r0
            r0 = r14
            r1 = r14
            r2 = r26
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r26
            com.sun.tools.javac.util.List r0 = r0.thrown
            r20 = r0
            r0 = r26
            com.sun.tools.javac.util.Name r0 = r0.name
            r21 = r0
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L447
            r0 = r14
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r19
            r2 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r19 = r0
        L447:
            r0 = r14
            java.lang.String r0 = r0.builderClassName
            r1 = 42
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 <= r1) goto L47c
            r0 = r13
            r1 = r25
            r2 = r19
            r3 = r14
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r3 = r3.typeParams
            java.lang.String r0 = returnTypeToBuilderClassName(r0, r1, r2, r3)
            r28 = r0
            r0 = r28
            if (r0 != 0) goto L46a
            return
        L46a:
            r0 = r14
            r1 = r14
            java.lang.String r1 = r1.builderClassName
            java.lang.String r2 = "*"
            r3 = r28
            java.lang.String r1 = r1.replace(r2, r3)
            r0.builderClassName = r1
        L47c:
            r0 = r14
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L641
            r0 = r27
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L493
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L493:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r30 = r0
            r0 = r27
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L4aa
            r0 = r27
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.util.List r0 = r0.arguments
            r30 = r0
        L4aa:
            r0 = r27
            r31 = r0
            r0 = r19
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L4c0
            r0 = r19
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r31 = r0
        L4c0:
            r0 = r31
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L4d8
            r0 = r31
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r28 = r0
            r0 = 0
            r29 = r0
            goto L537
        L4d8:
            r0 = r31
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L51a
            r0 = r31
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r32 = r0
            r0 = r32
            com.sun.tools.javac.util.Name r0 = r0.name
            r28 = r0
            r0 = r32
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            java.lang.String r0 = unpack(r0)
            r29 = r0
            r0 = r29
            java.lang.String r1 = "ERR:"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L537
            r0 = r29
            r1 = 4
            r2 = r29
            java.lang.String r3 = "__ERR__"
            int r2 = r2.indexOf(r3)
            java.lang.String r0 = r0.substring(r1, r2)
            r33 = r0
            r0 = r13
            r1 = r33
            r0.addError(r1)
            return
        L51a:
            r0 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Expected a (parameterized) type here instead of a "
            r2.<init>(r3)
            r2 = r31
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L537:
            r0 = r29
            if (r0 == 0) goto L550
            r0 = r18
            java.lang.String r0 = r0.getPackageDeclaration()
            r1 = r29
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L550
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L550:
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            java.lang.String r0 = r0.getName()
            r1 = r28
            boolean r0 = r0.contentEquals(r1)
            if (r0 != 0) goto L567
            r0 = r13
            java.lang.String r1 = "@Builder(toBuilder=true) is only supported if you return your own type."
            r0.addError(r1)
            return
        L567:
            r0 = r26
            com.sun.tools.javac.util.List r0 = r0.typarams
            r32 = r0
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.typarams
            r33 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r32
            java.util.Iterator r0 = r0.iterator()
            r35 = r0
            goto L62d
        L591:
            r0 = r35
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r34 = r0
            r0 = -1
            r36 = r0
            r0 = -1
            r37 = r0
            r0 = r30
            java.util.Iterator r0 = r0.iterator()
            r39 = r0
            goto L5de
        L5ad:
            r0 = r39
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r38 = r0
            int r37 = r37 + 1
            r0 = r38
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 != 0) goto L5c7
            goto L5de
        L5c7:
            r0 = r38
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r34
            com.sun.tools.javac.util.Name r1 = r1.name
            if (r0 == r1) goto L5da
            goto L5de
        L5da:
            r0 = r37
            r36 = r0
        L5de:
            r0 = r39
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5ad
            r0 = r36
            r1 = -1
            if (r0 == r1) goto L5f8
            r0 = r33
            int r0 = r0.size()
            r1 = r36
            if (r0 > r1) goto L618
        L5f8:
            r0 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "@Builder(toBuilder=true) requires that each type parameter on the static method is part of the typeargs of the return value. Type parameter "
            r2.<init>(r3)
            r2 = r34
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not part of the return type."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L618:
            r0 = r16
            r1 = r33
            r2 = r36
            java.lang.Object r1 = r1.get(r2)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r1
            com.sun.tools.javac.util.Name r1 = r1.name
            boolean r0 = r0.add(r1)
        L62d:
            r0 = r35
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L591
            goto L641
        L63a:
            r0 = r13
            java.lang.String r1 = "@Builder is only supported on classes, records, constructors, and methods."
            r0.addError(r1)
            return
        L641:
            r0 = r22
            if (r0 == 0) goto L6ea
            r0 = r22
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L6e0
        L653:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r25 = r0
            r0 = r25
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ARGUMENT
            if (r0 == r1) goto L66d
            goto L6e0
        L66d:
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.javac.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r25
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r28 = r0
            r0 = r27
            r1 = r28
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.name = r1
            r0 = r27
            r1 = r27
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.builderFieldName = r1
            r0 = r27
            r1 = r28
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.rawName = r1
            r0 = r27
            r1 = r25
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r1)
            r0.annotations = r1
            r0 = r27
            r1 = r28
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r0.type = r1
            r0 = r27
            r1 = r10
            r2 = r25
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3)
            r0.singularData = r1
            r0 = r27
            r1 = r25
            r0.originalFieldNode = r1
            r0 = r10
            r1 = r27
            r2 = r25
            r0.addObtainVia(r1, r2)
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r27
            boolean r0 = r0.add(r1)
        L6e0:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L653
        L6ea:
            r0 = r14
            r1 = r14
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r14
            java.lang.String r2 = r2.builderClassName
            lombok.javac.JavacNode r1 = lombok.javac.handlers.JavacHandlerUtil.findInnerClass(r1, r2)
            r0.builderType = r1
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            if (r0 != 0) goto L722
            r0 = r14
            r1 = r10
            r2 = r14
            lombok.javac.JavacNode r1 = r1.makeBuilderClass(r2)
            r0.builderType = r1
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            goto L7d6
        L722:
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r25 = r0
            r0 = r14
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L752
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.STATIC
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L752
            r0 = r13
            java.lang.String r1 = "Existing Builder must be a static inner class."
            r0.addError(r1)
            return
        L752:
            r0 = r14
            boolean r0 = r0.isStatic
            if (r0 != 0) goto L775
            r0 = r25
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.STATIC
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L775
            r0 = r13
            java.lang.String r1 = "Existing Builder must be a non-static inner class."
            r0.addError(r1)
            return
        L775:
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r13
            lombok.javac.handlers.JavacHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L7cc
        L78d:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r26 = r0
            r0 = r26
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            r28 = r0
            r0 = r28
            if (r0 != 0) goto L7a8
            goto L7cc
        L7a8:
            r0 = r28
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r29 = r0
            r0 = r29
            if (r0 != 0) goto L7b7
            goto L7cc
        L7b7:
            r0 = r29
            r1 = r14
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = r28
            boolean r0 = r0.checkForAlreadyExistingNodesAndGenerateError(r1, r2)
            if (r0 == 0) goto L7cc
            r0 = r26
            r1 = 0
            r0.singularData = r1
        L7cc:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L78d
        L7d6:
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L872
        L7e5:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r25 = r0
            r0 = r25
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L818
            r0 = r25
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L818
            r0 = r25
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.requiresCleaning()
            if (r0 == 0) goto L818
            r0 = 1
            r23 = r0
            goto L87c
        L818:
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L872
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            r1 = r25
            lombok.Builder$ObtainVia r1 = r1.obtainVia
            java.lang.String r1 = r1.method()
            boolean r1 = r1.isEmpty()
            if (r0 != r1) goto L849
            r0 = r25
            lombok.javac.JavacNode r0 = r0.obtainViaNode
            java.lang.String r1 = "The syntax is either @ObtainVia(field = \"fieldName\") or @ObtainVia(method = \"methodName\")."
            r0.addError(r1)
            return
        L849:
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L872
            r0 = r25
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L872
            r0 = r25
            lombok.javac.JavacNode r0 = r0.obtainViaNode
            java.lang.String r1 = "@ObtainVia(isStatic = true) is not valid unless 'method' has been set."
            r0.addError(r1)
            return
        L872:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7e5
        L87c:
            r0 = r10
            r1 = r14
            r0.generateBuilderFields(r1)
            r0 = r23
            if (r0 == 0) goto L8c2
            r0 = r14
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r25 = r0
            r0 = r25
            r1 = r25
            r2 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r14
            lombok.javac.JavacNode r2 = r2.builderType
            java.lang.String r3 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r25
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r26 = r0
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r26
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r0 = r26
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L8c2:
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.constructorExists(r0)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L8f4
            lombok.AccessLevel r0 = lombok.AccessLevel.PACKAGE
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r14
            lombok.javac.JavacNode r2 = r2.builderType
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = 0
            r5 = r13
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleConstructor.createConstructor(r0, r1, r2, r3, r4, r5)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L8f4
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r25
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L8f4:
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L91e
        L903:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r25 = r0
            r0 = r10
            r1 = r14
            r2 = r25
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            r0.makePrefixedSetterMethodsForBuilder(r1, r2, r3)
        L91e:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L903
            r0 = r14
            java.lang.String r0 = r0.buildMethodName
            r1 = r14
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = -1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            r25 = r0
            r0 = r25
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK
            if (r0 != r1) goto L950
            r0 = r14
            java.lang.String r0 = r0.buildMethodName
            r1 = r14
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            r25 = r0
        L950:
            r0 = r25
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L97e
            r0 = r10
            r1 = r14
            r2 = r21
            r3 = r19
            r4 = r20
            r5 = r23
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateBuildMethod(r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L97e
            r0 = r26
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L97e:
            java.lang.String r0 = "toString"
            r1 = r14
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto La1c
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r14
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L9ed
        L9a8:
            r0 = r27
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r26 = r0
            r0 = r26
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L9e3
        L9c3:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
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
        L9e3:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9c3
        L9ed:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9a8
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r25
            r2 = 1
            r3 = 0
            lombok.core.handlers.HandlerUtil$FieldAccess r4 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r5 = r14
            lombok.javac.JavacNode r5 = r5.sourceNode
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleToString.createToString(r0, r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto La1c
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        La1c:
            r0 = r23
            if (r0 == 0) goto La2f
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r10
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = r1.generateCleanMethod(r2)
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        La2f:
            r0 = r17
            if (r0 == 0) goto La4b
            r0 = r14
            java.lang.String r0 = r0.builderMethodName
            r1 = r14
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = -1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto La4b
            r0 = 0
            r17 = r0
        La4b:
            r0 = r17
            if (r0 == 0) goto La6e
            r0 = r10
            r1 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateBuilderMethod(r1)
            r25 = r0
            r0 = r25
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r25
            if (r0 == 0) goto La6e
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r25
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        La6e:
            r0 = r14
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto Lb28
            int[] r0 = m82x2486df07()
            java.lang.String r1 = "toBuilder"
            r2 = r14
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Laac;
                case 2: goto Lb28;
                case 3: goto Laa4;
                default: goto Lb28;
            }
        Laa4:
            r0 = r13
            java.lang.String r1 = "Not generating toBuilder() as it already exists."
            r0.addWarning(r1)
            return
        Laac:
            r0 = r14
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r0 = r0.typeParams
            r25 = r0
            r0 = r16
            if (r0 == 0) goto Lb01
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r14
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r27 = r0
            r0 = r16
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto Laf0
        Lad4:
            r0 = r29
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.util.Name r0 = (com.sun.tools.javac.util.Name) r0
            r28 = r0
            r0 = r26
            r1 = r27
            r2 = r28
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Laf0:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lad4
            r0 = r26
            com.sun.tools.javac.util.List r0 = r0.toList()
            r25 = r0
        Lb01:
            r0 = r10
            r1 = r14
            r2 = r25
            r3 = r15
            java.lang.String r3 = r3.setterPrefix()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateToBuilderMethod(r1, r2, r3)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto Lb28
            r0 = r26
            r1 = r13
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r14
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        Lb28:
            r0 = r24
            if (r0 == 0) goto Lb5a
            r0 = r17
            if (r0 == 0) goto Lb5a
            r0 = r24
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto Lb50
        Lb3c:
            r0 = r26
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r25 = r0
            r0 = r25
            java.lang.String r1 = "@Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final."
            r0.addWarning(r1)
        Lb50:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb3c
        Lb5a:
            return
    }

    static java.lang.String returnTypeToBuilderClassName(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCClassDecl r6, com.sun.tools.javac.tree.JCTree.JCExpression r7, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r8) {
            r0 = 0
            r9 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L19
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r9 = r0
            goto Le2
        L19:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L68
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r10 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L54
        L32:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r11 = r0
            r0 = r11
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            r0 = r5
            java.lang.String r1 = "@Builder requires specifying 'builderClassName' if used on methods with a type parameter as return type."
            r0.addError(r1)
            r0 = 0
            return r0
        L54:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L32
            r0 = r10
            java.lang.String r0 = r0.toString()
            r9 = r0
            goto Le2
        L68:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto La5
            r0 = r7
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r9
            r1 = 0
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto Le2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r9
            r3 = 0
            char r2 = r2.charAt(r3)
            char r2 = java.lang.Character.toTitleCase(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r9
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            goto Le2
        La5:
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto Le2
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto Lcd
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r9 = r0
            goto Le2
        Lcd:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto Le2
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = (com.sun.tools.javac.tree.JCTree.JCIdent) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r9 = r0
        Le2:
            r0 = r9
            if (r0 == 0) goto Lef
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L112
        Lef:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok bug ID#20140614-1651: javac HandleBuilder: return type to name conversion failed: "
            r2.<init>(r3)
            r2 = r7
            java.lang.Class r2 = r2.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r9 = r0
        L112:
            r0 = r9
            return r0
    }

    private static java.lang.String unpack(com.sun.tools.javac.tree.JCTree.JCExpression r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            unpack(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void unpack(java.lang.StringBuilder r5, com.sun.tools.javac.tree.JCTree.JCExpression r6) {
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L17
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = (com.sun.tools.javac.tree.JCTree.JCIdent) r1
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L17:
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L3e
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            r7 = r0
            r0 = r5
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.selected
            unpack(r0, r1)
            r0 = r5
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L3e:
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L63
            r0 = r5
            r1 = 0
            r0.setLength(r1)
            r0 = r5
            java.lang.String r1 = "ERR:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "@Builder(toBuilder=true) is not supported if returning a type with generics applied to an intermediate."
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "__ERR__"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
        L63:
            r0 = r5
            r1 = 0
            r0.setLength(r1)
            r0 = r5
            java.lang.String r1 = "ERR:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Expected a type of some sort, not a "
            r2.<init>(r3)
            r2 = r6
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = "__ERR__"
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateToBuilderMethod(lombok.javac.handlers.HandleBuilder.BuilderJob r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r12, java.lang.String r13) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            r0 = r14
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r14
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            r6 = r11
            java.lang.String r6 = r6.builderClassName
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            r6 = r11
            boolean r6 = r6.isStatic
            if (r6 == 0) goto L25
            r6 = 0
            goto L26
        L25:
            r6 = 1
        L26:
            r7 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r7 = r7.builderTypeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            r16 = r0
            r0 = 0
            r17 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r11
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L267
        L54:
            r0 = r20
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r19 = r0
            r0 = r13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6b
            r0 = r13
            goto L7b
        L6b:
            r0 = r11
            boolean r0 = r0.oldFluent
            if (r0 == 0) goto L78
            java.lang.String r0 = ""
            goto L7b
        L78:
            java.lang.String r0 = "set"
        L7b:
            r21 = r0
            r0 = r19
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r22 = r0
            r0 = r21
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9c
            r0 = r11
            lombok.javac.JavacNode r0 = r0.sourceNode
            r1 = r21
            r2 = r22
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r22 = r0
        L9c:
            r0 = r11
            r1 = r22
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r23 = r0
            r0 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto Lb0
            r0 = 1
            goto Lb1
        Lb0:
            r0 = 2
        Lb1:
            com.sun.tools.javac.tree.JCTree$JCExpression[] r0 = new com.sun.tools.javac.tree.JCTree.JCExpression[r0]
            r24 = r0
            r0 = r19
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto Lce
            r0 = r19
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L116
        Lce:
            r0 = 0
            r25 = r0
            goto L10b
        Ld4:
            r0 = r24
            r1 = r25
            r2 = r14
            r3 = r14
            r4 = r11
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r19
            lombok.Builder$ObtainVia r4 = r4.obtainVia
            if (r4 != 0) goto Lf6
            r4 = r19
            com.sun.tools.javac.util.Name r4 = r4.rawName
            goto L104
        Lf6:
            r4 = r11
            r5 = r19
            lombok.Builder$ObtainVia r5 = r5.obtainVia
            java.lang.String r5 = r5.field()
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
        L104:
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r0[r1] = r2
            int r25 = r25 + 1
        L10b:
            r0 = r25
            r1 = r24
            int r1 = r1.length
            if (r0 < r1) goto Ld4
            goto L1ef
        L116:
            r0 = r19
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            r25 = r0
            r0 = r19
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L16d
            r0 = r14
            r1 = r14
            r2 = r11
            r3 = r11
            lombok.javac.JavacNode r3 = r3.parentType
            java.lang.String r3 = r3.getName()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r11
            r3 = r25
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            r0 = r14
            r1 = r14
            r2 = r12
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.typeParameterNames(r1, r2)
            r2 = r27
            r3 = r14
            r4 = r11
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r26 = r0
            goto L195
        L16d:
            r0 = r14
            r1 = r14
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r11
            r3 = r25
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            r0 = r14
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r27
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r26 = r0
        L195:
            r0 = 0
            r27 = r0
            goto L1ad
        L19b:
            r0 = r24
            r1 = r27
            r2 = r14
            r3 = r19
            com.sun.tools.javac.util.Name r3 = r3.name
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r0[r1] = r2
            int r27 = r27 + 1
        L1ad:
            r0 = r27
            r1 = r24
            int r1 = r1.length
            if (r0 < r1) goto L19b
            r0 = r14
            r1 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.type
            r2 = r11
            lombok.javac.JavacNode r2 = r2.sourceNode
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
            r27 = r0
            r0 = r17
            if (r0 != 0) goto L1d3
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r17 = r0
        L1d3:
            r0 = r17
            r1 = r14
            r2 = r14
            r3 = 16
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r19
            com.sun.tools.javac.util.Name r3 = r3.name
            r4 = r27
            r5 = r26
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1ef:
            r0 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L218
            r0 = r24
            r1 = 0
            r0 = r0[r1]
            r25 = r0
            r0 = r14
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r14
            r3 = r16
            r4 = r23
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r25
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r16 = r0
            goto L267
        L218:
            r0 = r14
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r24
            r3 = 0
            r2 = r2[r3]
            r3 = r14
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r26 = r0
            r0 = r14
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r14
            r3 = r14
            r4 = r11
            java.lang.String r5 = "builder"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r23
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r24
            r4 = 1
            r3 = r3[r4]
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r27 = r0
            r0 = r18
            r1 = r14
            r2 = r26
            r3 = r14
            r4 = r27
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r3 = r3.Exec(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L267:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L54
            r0 = r18
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2cb
            r0 = r14
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getBuilderClassName()
            r3 = r11
            boolean r3 = r3.isStatic
            if (r3 == 0) goto L28e
            r3 = 0
            goto L28f
        L28e:
            r3 = 1
        L28f:
            r4 = r12
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r19 = r0
            r0 = r18
            r1 = r14
            r2 = r14
            r3 = 16
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r11
            java.lang.String r4 = "builder"
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            r4 = r19
            r5 = r16
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.prepend(r1)
            r0 = r18
            r1 = r14
            r2 = r14
            r3 = r11
            java.lang.String r4 = "builder"
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L2d8
        L2cb:
            r0 = r18
            r1 = r14
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L2d8:
            r0 = r17
            if (r0 == 0) goto L2e9
            r0 = r17
            r1 = r18
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            r0 = r17
            r18 = r0
        L2e9:
            r0 = r14
            r1 = 0
            r2 = r18
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r19 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r20 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L31c
            r0 = r14
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.common.aliasing.qual.Unique"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r20 = r0
        L31c:
            r0 = r14
            r1 = r14
            r2 = r11
            lombok.AccessLevel r2 = r2.accessOuters
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            long r2 = (long) r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            java.lang.String r3 = "toBuilder"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r14
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            com.sun.tools.javac.util.Name r5 = r5.getBuilderClassName()
            r6 = r11
            boolean r6 = r6.isStatic
            if (r6 == 0) goto L346
            r6 = 0
            goto L347
        L346:
            r6 = 1
        L347:
            r7 = r12
            r8 = r20
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7, r8)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r19
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r21 = r0
            r0 = r11
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r21
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r21
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateCleanMethod(lombok.javac.handlers.HandleBuilder.BuilderJob r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r11
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L53
        L1b:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r14 = r0
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L53
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L53
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r11
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r11
            lombok.javac.JavacNode r3 = r3.sourceNode
            r4 = r13
            r0.appendCleaningCode(r1, r2, r3, r4)
        L53:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            r0 = r13
            r1 = r12
            r2 = r12
            r3 = r12
            r4 = r12
            r5 = r11
            java.lang.String r6 = "this"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r11
            java.lang.String r6 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r12
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOOLEAN
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCAssign r2 = r2.Assign(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r12
            r1 = 0
            r2 = r13
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r14 = r0
            r0 = r12
            r1 = r12
            lombok.AccessLevel r2 = lombok.AccessLevel.PRIVATE
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            long r2 = (long) r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            java.lang.String r3 = "$lombokClean"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r12
            r4 = r11
            lombok.javac.JavacNode r4 = r4.builderType
            com.sun.tools.javac.code.Symtab r4 = r4.getSymbolTable()
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_VOID
            com.sun.tools.javac.code.Type r4 = lombok.javac.Javac.createVoidType(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.Type(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r14
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r15 = r0
            r0 = r15
            r1 = r11
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r15
            return r0
    }

    static com.sun.tools.javac.tree.JCTree.JCVariableDecl generateReceiver(lombok.javac.handlers.HandleBuilder.BuilderJob r8) {
            r0 = r8
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateCalledMethods()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L45
        L21:
            r0 = r11
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r10 = r0
            r0 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L45
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 != 0) goto L45
            r0 = r9
            r1 = r10
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L45:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r11 = r0
            r0 = r9
            int r0 = r0.size()
            if (r0 != 0) goto L5c
            r0 = 0
            return r0
        L5c:
            r0 = r9
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L71
            r0 = r11
            r1 = r9
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r10 = r0
            goto La5
        L71:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r12 = r0
            r0 = r9
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
            goto L95
        L81:
            r0 = r12
            r1 = r11
            r2 = r9
            r3 = r13
            java.lang.Object r2 = r2.get(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r12 = r0
            int r13 = r13 + (-1)
        L95:
            r0 = r13
            if (r0 >= 0) goto L81
            r0 = r11
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = r0.NewArray(r1, r2, r3)
            r10 = r0
        La5:
            r0 = r11
            r1 = r8
            lombok.javac.JavacNode r1 = r1.builderType
            java.lang.String r2 = "org.checkerframework.checker.calledmethods.qual.CalledMethods"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            r2 = r10
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r12 = r0
            r0 = r8
            lombok.javac.JavacNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r13 = r0
            r0 = r11
            r1 = r11
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r8
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r11
            r4 = r8
            lombok.javac.JavacNode r4 = r4.builderType
            r5 = r13
            com.sun.tools.javac.util.List r5 = r5.typarams
            r6 = r12
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.of(r6)
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r14 = r0
            r0 = r14
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateBuildMethod(lombok.javac.handlers.HandleBuilder.BuilderJob r13, com.sun.tools.javac.util.Name r14, com.sun.tools.javac.tree.JCTree.JCExpression r15, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r16, boolean r17) {
            r12 = this;
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r17
            if (r0 == 0) goto L66
            r0 = r18
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT
            r2 = r18
            r3 = r18
            r4 = r13
            java.lang.String r5 = "this"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r13
            java.lang.String r5 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCUnary r0 = r0.Unary(r1, r2)
            r21 = r0
            r0 = r18
            r1 = r18
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r18
            r4 = r13
            java.lang.String r5 = "$lombokClean"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r22 = r0
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r23 = r0
            r0 = r20
            r1 = r23
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L66:
            r0 = r13
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r22 = r0
            goto Lb5
        L74:
            r0 = r22
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r21 = r0
            r0 = r21
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto Lb5
            r0 = r21
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto Lb5
            r0 = r21
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r21
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r13
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r13
            lombok.javac.JavacNode r3 = r3.sourceNode
            r4 = r20
            r5 = r21
            com.sun.tools.javac.util.Name r5 = r5.builderFieldName
            java.lang.String r6 = "this"
            r0.appendBuildCode(r1, r2, r3, r4, r5, r6)
        Lb5:
            r0 = r22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L74
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r13
            java.lang.String r1 = "this"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r22 = r0
            r0 = r13
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L1df
        Ldf:
            r0 = r24
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r23 = r0
            r0 = r23
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L197
            r0 = r20
            r1 = r18
            r2 = r18
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r2 = r2.Modifiers(r3)
            r3 = r23
            com.sun.tools.javac.util.Name r3 = r3.builderFieldName
            r4 = r18
            r5 = r23
            com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.type
            r6 = r13
            lombok.javac.JavacNode r6 = r6.sourceNode
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r4, r5, r6)
            r5 = r18
            r6 = r18
            r7 = r22
            com.sun.tools.javac.tree.JCTree$JCIdent r6 = r6.Ident(r7)
            r7 = r23
            com.sun.tools.javac.util.Name r7 = r7.builderFieldName
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r5 = r5.Select(r6, r7)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r20
            r1 = r18
            r2 = r18
            lombok.javac.JavacTreeMaker$TreeTag r3 = lombok.javac.Javac.CTC_NOT
            r4 = r18
            r5 = r18
            r6 = r22
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r23
            com.sun.tools.javac.util.Name r6 = r6.nameOfSetFlag
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r4 = r4.Select(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCUnary r2 = r2.Unary(r3, r4)
            r3 = r18
            r4 = r18
            r5 = r18
            r6 = r23
            com.sun.tools.javac.util.Name r6 = r6.builderFieldName
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            r6 = r18
            r7 = r18
            r8 = r13
            lombok.javac.JavacNode r8 = r8.parentType
            java.lang.Object r8 = r8.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r8 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r8
            com.sun.tools.javac.util.List r8 = r8.typarams
            com.sun.tools.javac.util.List r7 = lombok.javac.handlers.JavacHandlerUtil.typeParameterNames(r7, r8)
            r8 = r18
            r9 = r18
            r10 = r13
            lombok.javac.JavacNode r10 = r10.parentType
            java.lang.Object r10 = r10.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r10 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r10
            com.sun.tools.javac.util.Name r10 = r10.name
            com.sun.tools.javac.tree.JCTree$JCIdent r9 = r9.Ident(r10)
            r10 = r23
            com.sun.tools.javac.util.Name r10 = r10.nameOfDefaultProvider
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r8 = r8.Select(r9, r10)
            com.sun.tools.javac.util.List r9 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r6 = r6.Apply(r7, r8, r9)
            com.sun.tools.javac.tree.JCTree$JCAssign r4 = r4.Assign(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r3 = r3.Exec(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L197:
            r0 = r23
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 != 0) goto L1b5
            r0 = r23
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1c8
            r0 = r23
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.shadowedDuringBuild()
            if (r0 == 0) goto L1c8
        L1b5:
            r0 = r21
            r1 = r18
            r2 = r23
            com.sun.tools.javac.util.Name r2 = r2.builderFieldName
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L1df
        L1c8:
            r0 = r21
            r1 = r18
            r2 = r18
            r3 = r22
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r23
            com.sun.tools.javac.util.Name r3 = r3.builderFieldName
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = r1.Select(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1df:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Ldf
            r0 = r17
            if (r0 == 0) goto L221
            r0 = r20
            r1 = r18
            r2 = r18
            r3 = r18
            r4 = r18
            r5 = r13
            java.lang.String r6 = "this"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r13
            java.lang.String r6 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r18
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOOLEAN
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCAssign r2 = r2.Assign(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L221:
            r0 = r14
            if (r0 != 0) goto L247
            r0 = r18
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r15
            r4 = r21
            com.sun.tools.javac.util.List r4 = r4.toList()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r20
            r1 = r18
            r2 = r19
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L304
        L247:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r13
            lombok.javac.JavacNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.typarams
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L281
        L265:
            r0 = r25
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r24 = r0
            r0 = r23
            r1 = r18
            r2 = r24
            com.sun.tools.javac.util.Name r2 = r2.name
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L281:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L265
            r0 = r18
            r1 = r13
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            com.sun.tools.javac.util.Name r1 = r1.name
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r24 = r0
            r0 = r13
            boolean r0 = r0.isStatic
            if (r0 != 0) goto L2b6
            r0 = r18
            r1 = r24
            r2 = r13
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r24 = r0
        L2b6:
            r0 = r18
            r1 = r24
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r25 = r0
            r0 = r18
            r1 = r23
            com.sun.tools.javac.util.List r1 = r1.toList()
            r2 = r25
            r3 = r21
            com.sun.tools.javac.util.List r3 = r3.toList()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r19 = r0
            r0 = r15
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree
            if (r0 == 0) goto L2f7
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_VOID
            r1 = r15
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f7
            r0 = r20
            r1 = r18
            r2 = r19
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L304
        L2f7:
            r0 = r20
            r1 = r18
            r2 = r19
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L304:
            r0 = r18
            r1 = 0
            r2 = r20
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r23 = r0
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L333
            r0 = r18
            r1 = r13
            lombok.javac.JavacNode r1 = r1.builderType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto L336
        L333:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        L336:
            r24 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = generateReceiver(r0)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L37a
            r0 = r18
            boolean r0 = r0.hasMethodDefWithRecvParam()
            if (r0 == 0) goto L37a
            r0 = r18
            r1 = r18
            r2 = r13
            lombok.AccessLevel r2 = r2.accessInners
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            long r2 = (long) r2
            r3 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r13
            r3 = r13
            java.lang.String r3 = r3.buildMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r15
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r25
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r16
            r8 = r23
            r9 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDefWithRecvParam(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r26 = r0
            goto L3a4
        L37a:
            r0 = r18
            r1 = r18
            r2 = r13
            lombok.AccessLevel r2 = r2.accessInners
            int r2 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r2)
            long r2 = (long) r2
            r3 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r13
            r3 = r13
            java.lang.String r3 = r3.buildMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r15
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r6 = r16
            r7 = r23
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r26 = r0
        L3a4:
            r0 = r14
            if (r0 != 0) goto L3b1
            r0 = r13
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r26
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
        L3b1:
            r0 = r26
            return r0
    }

    public static com.sun.tools.javac.tree.JCTree.JCMethodDecl generateDefaultProvider(com.sun.tools.javac.util.Name r10, lombok.javac.JavacNode r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r12, lombok.javac.handlers.HandleBuilder.BuilderJob r13) {
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            r0 = r11
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r15 = r0
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            r16 = r0
            r0 = r15
            r1 = 0
            r0.init = r1
            r0 = r14
            r1 = 0
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r17 = r0
            r0 = r14
            r1 = 0
            r2 = r17
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r18 = r0
            r0 = 10
            r19 = r0
            r0 = r14
            r1 = r14
            r2 = r19
            long r2 = (long) r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r10
            r3 = r14
            r4 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.vartype
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r3, r4, r5)
            r4 = r11
            r5 = r12
            com.sun.tools.javac.util.List r4 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r4, r5)
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r18
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r20 = r0
            r0 = r16
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCNewArray
            if (r0 == 0) goto L9a
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L9a
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCNewArray r0 = (com.sun.tools.javac.tree.JCTree.JCNewArray) r0
            r21 = r0
            r0 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            r22 = r0
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            if (r0 != 0) goto L9a
            r0 = r21
            r1 = r14
            r2 = r22
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.elemtype
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r1, r2, r3)
            r0.elemtype = r1
        L9a:
            r0 = r20
            r1 = r13
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r17
            r1 = r16
            r0.expr = r1
            r0 = r20
            return r0
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl generateBuilderMethod(lombok.javac.handlers.HandleBuilder.BuilderJob r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r11
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L31
            r0 = r12
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            r6 = r11
            java.lang.String r6 = r6.builderClassName
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            r6 = 0
            r7 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r7 = r7.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r13 = r0
            goto L62
        L31:
            r0 = r12
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = 0
            r5 = r11
            r6 = r11
            java.lang.String r6 = r6.builderClassName
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            r6 = 0
            r7 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r7 = r7.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = (com.sun.tools.javac.tree.JCTree.JCNewClass) r0
            r1 = r12
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r0.encl = r1
        L62:
            r0 = r12
            r1 = r13
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r14 = r0
            r0 = r12
            r1 = 0
            r2 = r14
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r15 = r0
            r0 = r11
            lombok.AccessLevel r0 = r0.accessOuters
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            r16 = r0
            r0 = r11
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L8c
            r0 = r16
            r1 = 8
            r0 = r0 | r1
            r16 = r0
        L8c:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r17 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Lb1
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r17 = r0
        Lb1:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r18 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto Ld6
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.common.aliasing.qual.Unique"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r18 = r0
        Ld6:
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getBuilderClassName()
            r3 = r11
            boolean r3 = r3.isStatic
            if (r3 == 0) goto Lea
            r3 = 0
            goto Leb
        Lea:
            r3 = 1
        Leb:
            r4 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r4 = r4.builderTypeParams
            r5 = r18
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r12
            r1 = r12
            r2 = r16
            long r2 = (long) r2
            r3 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r11
            r3 = r11
            java.lang.String r3 = r3.builderMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r19
            r4 = r11
            com.sun.tools.javac.util.List r4 = r4.copyTypeParams()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r15
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r20 = r0
            r0 = r11
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r20
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r20
            return r0
    }

    public void generateBuilderFields(lombok.javac.handlers.HandleBuilder.BuilderJob r8) {
            r7 = this;
            r0 = r8
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            int r0 = r0.size()
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            lombok.javac.JavacNode r0 = r0.builderType
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L41
        L21:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r11 = r0
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L41
            r0 = r10
            r1 = r11
            boolean r0 = r0.add(r1)
        L41:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            goto L1ca
        L5c:
            r0 = r8
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r13 = r0
            r0 = r13
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto Ldb
            r0 = r13
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto Ldb
            r0 = r13
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r13
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r8
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r8
            lombok.javac.JavacNode r3 = r3.sourceNode
            java.util.List r0 = r0.generateFields(r1, r2, r3)
            r14 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
            goto Lc1
        La5:
            r0 = r16
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r15 = r0
            r0 = r11
            r1 = r15
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            boolean r0 = r0.add(r1)
        Lc1:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La5
            r0 = r13
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            r1 = r14
            boolean r0 = r0.addAll(r1)
            goto L1c7
        Ldb:
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L127
        Lec:
            r0 = r17
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r16 = r0
            r0 = r16
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r18 = r0
            r0 = r18
            r1 = r13
            com.sun.tools.javac.util.Name r1 = r1.builderFieldName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L116
            r0 = r16
            r14 = r0
        L116:
            r0 = r18
            r1 = r13
            com.sun.tools.javac.util.Name r1 = r1.nameOfSetFlag
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L127
            r0 = r16
            r15 = r0
        L127:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lec
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r16 = r0
            r0 = r14
            if (r0 != 0) goto L178
            r0 = r16
            r1 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r17 = r0
            r0 = r16
            r1 = r17
            r2 = r13
            com.sun.tools.javac.util.Name r2 = r2.builderFieldName
            r3 = r16
            r4 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.type
            r5 = r8
            lombok.javac.JavacNode r5 = r5.sourceNode
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r3, r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r18 = r0
            r0 = r8
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r18
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r14 = r0
            r0 = r11
            r1 = r18
            boolean r0 = r0.add(r1)
        L178:
            r0 = r15
            if (r0 != 0) goto L1ba
            r0 = r13
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L1ba
            r0 = r16
            r1 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r17 = r0
            r0 = r16
            r1 = r17
            r2 = r13
            com.sun.tools.javac.util.Name r2 = r2.nameOfSetFlag
            r3 = r16
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r18 = r0
            r0 = r8
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r18
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r0 = r11
            r1 = r18
            boolean r0 = r0.add(r1)
        L1ba:
            r0 = r13
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            r1 = r14
            boolean r0 = r0.add(r1)
        L1c7:
            int r12 = r12 + (-1)
        L1ca:
            r0 = r12
            if (r0 >= 0) goto L5c
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L1f1
        L1db:
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r12 = r0
            r0 = r12
            r1 = r8
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L1f1:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1db
            return
    }

    public void makePrefixedSetterMethodsForBuilder(lombok.javac.handlers.HandleBuilder.BuilderJob r7, lombok.javac.handlers.HandleBuilder.BuilderFieldData r8, java.lang.String r9) {
            r6 = this;
            r0 = r8
            lombok.javac.JavacNode r0 = r0.originalFieldNode
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            r10 = r0
            r0 = r8
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1a
            r0 = r8
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
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
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r7
            r2 = r8
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r10
            r0.generateMethods(r1, r2, r3)
        L37:
            return
    }

    private void makePrefixedSetterMethodForBuilder(lombok.javac.handlers.HandleBuilder.BuilderJob r14, lombok.javac.handlers.HandleBuilder.BuilderFieldData r15, boolean r16, java.lang.String r17) {
            r13 = this;
            r0 = r15
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r18 = r0
            r0 = r17
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1c
            r0 = r17
            goto L2c
        L1c:
            r0 = r14
            boolean r0 = r0.oldFluent
            if (r0 == 0) goto L29
            java.lang.String r0 = ""
            goto L2c
        L29:
            java.lang.String r0 = "set"
        L2c:
            r19 = r0
            r0 = r14
            lombok.javac.JavacNode r0 = r0.sourceNode
            r1 = r19
            r2 = r15
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r20 = r0
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r20
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r21 = r0
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L9a
        L5a:
            r0 = r23
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r22 = r0
            r0 = r22
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto L74
            goto L9a
        L74:
            r0 = r22
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r24 = r0
            r0 = r24
            com.sun.tools.javac.util.Name r0 = r0.name
            r25 = r0
            r0 = r25
            r1 = r21
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9a
            r0 = r18
            r1 = r24
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isTolerate(r0, r1)
            if (r0 != 0) goto L9a
            return
        L9a:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5a
            r0 = r18
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r22 = r0
            r0 = r15
            lombok.javac.JavacNode r0 = r0.originalFieldNode
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableToSetterAnnotations(r0)
            r23 = r0
            r0 = r14
            lombok.AccessLevel r0 = r0.accessInners
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            long r0 = (long) r0
            r1 = r16
            r2 = r18
            r3 = r22
            r4 = r20
            r5 = r15
            com.sun.tools.javac.util.Name r5 = r5.name
            r6 = r15
            com.sun.tools.javac.util.Name r6 = r6.nameOfSetFlag
            r7 = r14
            boolean r7 = r7.oldChain
            r8 = r14
            lombok.javac.JavacNode r8 = r8.sourceNode
            r9 = r23
            r10 = r15
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCAnnotation> r10 = r10.annotations
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleSetter.createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r24 = r0
            r0 = r24
            r1 = r14
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r14
            lombok.javac.JavacNode r0 = r0.sourceNode
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L115
            r0 = r13
            r1 = r15
            lombok.javac.JavacNode r1 = r1.originalFieldNode
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r24
            r3 = r15
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.String r3 = r3.toString()
            r0.copyJavadocFromParam(r1, r2, r3)
            goto L122
        L115:
            r0 = r15
            lombok.javac.JavacNode r0 = r0.originalFieldNode
            r1 = r24
            lombok.javac.handlers.JavacHandlerUtil$CopyJavadoc r2 = lombok.javac.handlers.JavacHandlerUtil.CopyJavadoc.SETTER
            r3 = 1
            lombok.javac.handlers.JavacHandlerUtil.copyJavadoc(r0, r1, r2, r3)
        L122:
            r0 = r14
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r24
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private void copyJavadocFromParam(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCMethodDecl r6, java.lang.String r7) {
            r4 = this;
            r0 = r5
            lombok.core.LombokNode r0 = r0.top()     // Catch: java.lang.Exception -> L33
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L33
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0     // Catch: java.lang.Exception -> L33
            r8 = r0
            r0 = r8
            r1 = r5
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L33
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = lombok.javac.Javac.getDocComment(r0, r1)     // Catch: java.lang.Exception -> L33
            r9 = r0
            r0 = r9
            r1 = r7
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.getParamJavadoc(r0, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.addReturnsThisIfNeeded(r0)     // Catch: java.lang.Exception -> L33
            r10 = r0
            r0 = r8
            r1 = r6
            r2 = r10
            lombok.javac.Javac.setDocComment(r0, r1, r2)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
        L34:
            return
    }

    public lombok.javac.JavacNode makeBuilderClass(lombok.javac.handlers.HandleBuilder.BuilderJob r9) {
            r8 = this;
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r10 = r0
            r0 = r9
            lombok.AccessLevel r0 = r0.accessOuters
            int r0 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r0)
            r11 = r0
            r0 = r9
            boolean r0 = r0.isStatic
            if (r0 == 0) goto L19
            r0 = r11
            r1 = 8
            r0 = r0 | r1
            r11 = r0
        L19:
            r0 = r10
            r1 = r11
            long r1 = (long) r1
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r12 = r0
            r0 = r10
            r1 = r12
            r2 = r9
            com.sun.tools.javac.util.Name r2 = r2.getBuilderClassName()
            r3 = r9
            com.sun.tools.javac.util.List r3 = r3.copyTypeParams()
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.ClassDef(r1, r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r13
            r1 = r9
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r9
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r13
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectType(r0, r1)
            return r0
    }

    private void addObtainVia(lombok.javac.handlers.HandleBuilder.BuilderFieldData r4, lombok.javac.JavacNode r5) {
            r3 = this;
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L46
        Lc:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            java.lang.Class<lombok.Builder$ObtainVia> r0 = lombok.Builder.ObtainVia.class
            r1 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L24
            goto L46
        L24:
            java.lang.Class<lombok.Builder$ObtainVia> r0 = lombok.Builder.ObtainVia.class
            r1 = r6
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.annotation.Annotation r1 = r1.getInstance()
            lombok.Builder$ObtainVia r1 = (lombok.Builder.ObtainVia) r1
            r0.obtainVia = r1
            r0 = r4
            r1 = r6
            r0.obtainViaNode = r1
            r0 = r6
            java.lang.Class<lombok.Builder$ObtainVia> r1 = lombok.Builder.ObtainVia.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            return
        L46:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            return
    }

    private lombok.javac.handlers.JavacSingularsRecipes.SingularData getSingularData(lombok.javac.JavacNode r12, java.lang.String r13) {
            r11 = this;
            r0 = r12
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L14c
        Lc:
            r0 = r15
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r14 = r0
            java.lang.Class<lombok.Singular> r0 = lombok.Singular.class
            r1 = r14
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.annotationTypeMatches(r0, r1)
            if (r0 != 0) goto L24
            goto L14c
        L24:
            r0 = r12
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L35
            r0 = r12
            com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r0)
            goto L3f
        L35:
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
        L3f:
            r16 = r0
            java.lang.Class<lombok.Singular> r0 = lombok.Singular.class
            r1 = r14
            lombok.core.AnnotationValues r0 = lombok.javac.handlers.JavacHandlerUtil.createAnnotation(r0, r1)
            r17 = r0
            r0 = r17
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.Singular r0 = (lombok.Singular) r0
            r18 = r0
            r0 = r14
            java.lang.Class<lombok.Singular> r1 = lombok.Singular.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r18
            java.lang.String r0 = r0.value()
            r19 = r0
            r0 = r19
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lad
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r12
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.SINGULAR_AUTO
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L90
            r0 = r12
            java.lang.String r1 = "The singular must be specified explicitly (e.g. @Singular(\"task\")) because auto singularization is disabled."
            r0.addError(r1)
            r0 = r16
            java.lang.String r0 = r0.toString()
            r19 = r0
            goto Lad
        L90:
            r0 = r16
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.autoSingularize(r0)
            r19 = r0
            r0 = r19
            if (r0 != 0) goto Lad
            r0 = r12
            java.lang.String r1 = "Can't singularize this name; please specify the singular explicitly (i.e. @Singular(\"sheep\"))"
            r0.addError(r1)
            r0 = r16
            java.lang.String r0 = r0.toString()
            r19 = r0
        Lad:
            r0 = r12
            r1 = r19
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = r12
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto Lce
            r0 = r12
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r21 = r0
        Lce:
            r0 = 0
            r22 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r23 = r0
            r0 = r21
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto Lf2
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.util.List r0 = r0.arguments
            r23 = r0
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r21 = r0
        Lf2:
            r0 = r21
            java.lang.String r0 = r0.toString()
            r22 = r0
            lombok.javac.handlers.JavacSingularsRecipes r0 = lombok.javac.handlers.JavacSingularsRecipes.get()
            r1 = r22
            java.lang.String r0 = r0.toQualified(r1)
            r24 = r0
            lombok.javac.handlers.JavacSingularsRecipes r0 = lombok.javac.handlers.JavacSingularsRecipes.get()
            r1 = r24
            r2 = r12
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer(r1, r2)
            r25 = r0
            r0 = r25
            if (r0 != 0) goto L131
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok does not know how to create the singular-form builder methods for type '"
            r2.<init>(r3)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "'; they won't be generated."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L131:
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = new lombok.javac.handlers.JavacSingularsRecipes$SingularData
            r1 = r0
            r2 = r14
            r3 = r20
            r4 = r16
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r18
            boolean r8 = r8.ignoreNullCollections()
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L14c:
            r0 = r15
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

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m82x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleBuilder.f586x2486df07
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult[] r0 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_LOMBOK     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.EXISTS_BY_USER     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            r1 = r0
            lombok.javac.handlers.HandleBuilder.f586x2486df07 = r1
            return r0
    }
}
