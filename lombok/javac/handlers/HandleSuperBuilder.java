package lombok.javac.handlers;

@lombok.core.HandlerPriority(-1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSuperBuilder.SCL.lombok */
public class HandleSuperBuilder extends lombok.javac.JavacAnnotationHandler<lombok.experimental.SuperBuilder> {
    private static final java.lang.String SELF_METHOD = "self";
    private static final java.lang.String FILL_VALUES_METHOD_NAME = "$fillValuesFrom";
    private static final java.lang.String STATIC_FILL_VALUES_METHOD_NAME = "$fillValuesFromInstanceIntoBuilder";
    private static final java.lang.String INSTANCE_VARIABLE_NAME = "instance";
    private static final java.lang.String BUILDER_VARIABLE_NAME = "b";

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f593x2486df07;



    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleSuperBuilder$SuperBuilderJob.SCL.lombok */
    class SuperBuilderJob extends lombok.javac.handlers.HandleBuilder.BuilderJob {
        lombok.javac.JavacNode builderAbstractType;
        java.lang.String builderAbstractClassName;
        lombok.javac.JavacNode builderImplType;
        java.lang.String builderImplClassName;
        com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> builderTypeParams_;
        final /* synthetic */ lombok.javac.handlers.HandleSuperBuilder this$0;

        SuperBuilderJob(lombok.javac.handlers.HandleSuperBuilder r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        void init(lombok.core.AnnotationValues<lombok.experimental.SuperBuilder> r6, lombok.experimental.SuperBuilder r7, lombok.javac.JavacNode r8) {
                r5 = this;
                r0 = r5
                r1 = r5
                lombok.AccessLevel r2 = lombok.AccessLevel.PUBLIC
                r3 = r2; r2 = r1; r1 = r3; 
                r2.accessInners = r3
                r0.accessOuters = r1
                r0 = r5
                r1 = 1
                r0.oldFluent = r1
                r0 = r5
                r1 = 1
                r0.oldChain = r1
                r0 = r5
                r1 = r7
                java.lang.String r1 = r1.builderMethodName()
                r0.builderMethodName = r1
                r0 = r5
                r1 = r7
                java.lang.String r1 = r1.buildMethodName()
                r0.buildMethodName = r1
                r0 = r5
                r1 = r7
                boolean r1 = r1.toBuilder()
                r0.toBuilder = r1
                r0 = r5
                java.lang.String r0 = r0.builderMethodName
                if (r0 != 0) goto L41
                r0 = r5
                java.lang.String r1 = "builder"
                r0.builderMethodName = r1
            L41:
                r0 = r5
                java.lang.String r0 = r0.buildMethodName
                if (r0 != 0) goto L4e
                r0 = r5
                java.lang.String r1 = "build"
                r0.buildMethodName = r1
            L4e:
                r0 = r5
                r1 = r8
                r2 = 0
                java.lang.String r1 = getBuilderClassNameTemplate(r1, r2)
                r0.builderClassName = r1
                return
        }

        void setBuilderToImpl() {
                r3 = this;
                r0 = r3
                r1 = r3
                lombok.javac.JavacNode r1 = r1.builderImplType
                r0.builderType = r1
                r0 = r3
                r1 = r3
                java.lang.String r1 = r1.builderImplClassName
                r0.builderClassName = r1
                r0 = r3
                r1 = r3
                com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
                r0.builderTypeParams = r1
                return
        }

        void setBuilderToAbstract() {
                r3 = this;
                r0 = r3
                r1 = r3
                lombok.javac.JavacNode r1 = r1.builderAbstractType
                r0.builderType = r1
                r0 = r3
                r1 = r3
                java.lang.String r1 = r1.builderAbstractClassName
                r0.builderClassName = r1
                r0 = r3
                r1 = r3
                com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.builderTypeParams_
                r0.builderTypeParams = r1
                return
        }
    }

    public HandleSuperBuilder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.SuperBuilder> r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10, lombok.javac.JavacNode r11) {
            r8 = this;
            r0 = r11
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SUPERBUILDER_FLAG_USAGE
            java.lang.String r2 = "@SuperBuilder"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            lombok.javac.handlers.HandleSuperBuilder$SuperBuilderJob r0 = new lombok.javac.handlers.HandleSuperBuilder$SuperBuilderJob
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r11
            r0.sourceNode = r1
            r0 = r12
            r1 = r11
            lombok.core.configuration.CheckerFrameworkVersion r1 = lombok.javac.handlers.JavacHandlerUtil.getCheckerFrameworkVersion(r1)
            r0.checkerFramework = r1
            r0 = r12
            r1 = 1
            r0.isStatic = r1
            r0 = r9
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            r13 = r0
            r0 = r12
            r1 = r9
            r2 = r13
            r3 = r11
            r0.init(r1, r2, r3)
            r0 = r12
            java.lang.String r0 = r0.builderMethodName
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            r0 = 0
            r14 = r0
            goto L5d
        L4b:
            java.lang.String r0 = "builderMethodName"
            r1 = r12
            java.lang.String r1 = r1.builderMethodName
            r2 = r11
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L5a
            return
        L5a:
            r0 = 1
            r14 = r0
        L5d:
            java.lang.String r0 = "buildMethodName"
            r1 = r12
            java.lang.String r1 = r1.buildMethodName
            r2 = r11
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L6c
            return
        L6c:
            r0 = r11
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r15 = r0
            r0 = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.builderFields = r1
            r0 = r12
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r0.typeParams = r1
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r15
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClass(r0)
            if (r0 != 0) goto La5
            r0 = r11
            java.lang.String r1 = "@SuperBuilder is only supported on classes."
            r0.addError(r1)
            return
        La5:
            r0 = r15
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto Lb4
            r0 = r11
            java.lang.String r1 = "@SuperBuilder is not supported on non-static nested classes."
            r0.addError(r1)
            return
        Lb4:
            r0 = r12
            r1 = r15
            r0.parentType = r1
            r0 = r15
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r19 = r0
            r0 = 0
            r20 = r0
            java.lang.Class<lombok.Value> r0 = lombok.Value.class
            r1 = r15
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto Le0
            java.lang.String r0 = "lombok.experimental.Value"
            r1 = r15
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto Le0
            r0 = 0
            goto Le1
        Le0:
            r0 = 1
        Le1:
            r21 = r0
            r0 = r15
            r1 = 1
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.HandleConstructor.findAllFields(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L293
        Lf1:
            r0 = r23
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r22 = r0
            r0 = r22
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r24 = r0
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r22
            r2 = 0
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r25 = r0
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 16
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L135
            r0 = r21
            if (r0 == 0) goto L131
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r22
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L135
        L131:
            r0 = 0
            goto L136
        L135:
            r0 = 1
        L136:
            r26 = r0
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.javac.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r27
            r1 = r24
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.rawName = r1
            r0 = r27
            r1 = r22
            com.sun.tools.javac.util.Name r1 = lombok.javac.handlers.JavacHandlerUtil.removePrefixFromField(r1)
            r0.name = r1
            r0 = r27
            r1 = r27
            com.sun.tools.javac.util.Name r1 = r1.name
            r0.builderFieldName = r1
            r0 = r27
            r1 = r22
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.findCopyableAnnotations(r1)
            r0.annotations = r1
            r0 = r27
            r1 = r24
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            r0.type = r1
            r0 = r27
            r1 = r8
            r2 = r22
            r3 = r13
            java.lang.String r3 = r3.setterPrefix()
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3)
            r0.singularData = r1
            r0 = r27
            r1 = r22
            r0.originalFieldNode = r1
            r0 = r27
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1ac
            r0 = r25
            if (r0 == 0) goto L1ac
            r0 = r25
            java.lang.String r1 = "@Builder.Default and @Singular cannot be mixed."
            r0.addError(r1)
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r22
            r2 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r0 = 0
            r25 = r0
        L1ac:
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 != 0) goto L1cc
            r0 = r25
            if (r0 == 0) goto L1cc
            r0 = r25
            java.lang.String r1 = "@Builder.Default requires an initializing expression (' = something;')."
            r0.addWarning(r1)
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r22
            r2 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findAnnotation(r0, r1, r2)
            r0 = 0
            r25 = r0
        L1cc:
            r0 = r24
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
            if (r0 == 0) goto L1f7
            r0 = r25
            if (r0 != 0) goto L1f7
            r0 = r26
            if (r0 == 0) goto L1e1
            goto L293
        L1e1:
            r0 = r20
            if (r0 != 0) goto L1ef
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
        L1ef:
            r0 = r20
            r1 = r22
            boolean r0 = r0.add(r1)
        L1f7:
            r0 = r25
            if (r0 == 0) goto L27e
            r0 = r27
            r1 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "$default$"
            r3.<init>(r4)
            r3 = r27
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.nameOfDefaultProvider = r1
            r0 = r27
            r1 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r27
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$set"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.nameOfSetFlag = r1
            r0 = r27
            r1 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r27
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$value"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r0.builderFieldName = r1
            r0 = r27
            com.sun.tools.javac.util.Name r0 = r0.nameOfDefaultProvider
            r1 = r22
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleBuilder.generateDefaultProvider(r0, r1, r2, r3)
            r28 = r0
            r0 = r28
            if (r0 == 0) goto L27e
            r0 = r15
            r1 = r28
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L27e:
            r0 = r8
            r1 = r27
            r2 = r22
            r0.addObtainVia(r1, r2)
            r0 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r27
            boolean r0 = r0.add(r1)
        L293:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf1
            r0 = r12
            r1 = r12
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.typarams
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderTypeParams = r3
            r0.typeParams = r1
            r0 = r12
            r1 = r12
            r2 = r19
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r1 = r1.replaceBuilderClassName(r2)
            r0.builderClassName = r1
            java.lang.String r0 = "builderClassName"
            r1 = r12
            java.lang.String r1 = r1.builderClassName
            r2 = r11
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L2cc
            return
        L2cc:
            java.lang.String r0 = "C"
            r22 = r0
            java.lang.String r0 = "B"
            r23 = r0
            r0 = r8
            r1 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r19
            java.util.HashSet r0 = r0.gatherUsedTypeNames(r1, r2)
            r24 = r0
            r0 = r8
            r1 = r22
            r2 = r24
            java.lang.String r0 = r0.generateNonclashingNameFor(r1, r2)
            r22 = r0
            r0 = r8
            r1 = r23
            r2 = r24
            java.lang.String r0 = r0.generateNonclashingNameFor(r1, r2)
            r23 = r0
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r25 = r0
            r0 = r25
            r1 = r15
            r2 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r26 = r0
            r0 = r25
            r1 = r15
            r2 = r22
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r2 = r26
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = r0.TypeParameter(r1, r2)
            r27 = r0
            r0 = r8
            r1 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r25
            r3 = r12
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r28 = r0
            r0 = r28
            r1 = r25
            r2 = r15
            r3 = r22
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r28
            r1 = r25
            r2 = r15
            r3 = r23
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r25
            r1 = r25
            r2 = r15
            r3 = r12
            com.sun.tools.javac.util.Name r3 = r3.getBuilderClassName()
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r2 = r28
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r29 = r0
            r0 = r25
            r1 = r15
            r2 = r23
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            r2 = r29
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = r0.TypeParameter(r1, r2)
            r30 = r0
            r0 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r0 = r0.typeParams
            if (r0 == 0) goto L396
            r0 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r0 = r0.typeParams
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3a5
        L396:
            r0 = r12
            r1 = r27
            r2 = r30
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1, r2)
            r0.builderTypeParams_ = r1
            goto L3b9
        L3a5:
            r0 = r12
            r1 = r12
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r27
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r2 = r30
            com.sun.tools.javac.util.List r1 = r1.append(r2)
            r0.builderTypeParams_ = r1
        L3b9:
            r0 = r19
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.Javac.getExtendsClause(r0)
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r26
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L3df
            r0 = r26
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.util.List r0 = r0.getTypeArguments()
            r17 = r0
            r0 = r26
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.getType()
            r26 = r0
        L3df:
            r0 = r26
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L41f
            r0 = r26
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.getIdentifier()
            r28 = r0
            r0 = r11
            r1 = 0
            java.lang.String r0 = lombok.javac.handlers.HandleBuilder.BuilderJob.getBuilderClassNameTemplate(r0, r1)
            r29 = r0
            r0 = r12
            r1 = r28
            java.lang.String r1 = r1.toString()
            r2 = r29
            java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
            r30 = r0
            r0 = r15
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r1 = r26
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r1
            r2 = r15
            r3 = r30
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            goto L44b
        L41f:
            r0 = r26
            if (r0 == 0) goto L44b
            r0 = r11
            r1 = 0
            java.lang.String r0 = lombok.javac.handlers.HandleBuilder.BuilderJob.getBuilderClassNameTemplate(r0, r1)
            r28 = r0
            r0 = r12
            r1 = r26
            java.lang.String r1 = r1.toString()
            r2 = r28
            java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
            r29 = r0
            r0 = r15
            r1 = r26
            java.lang.String r1 = r1.toString()
            r2 = r29
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r27 = r0
        L44b:
            r0 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L4e7
        L45a:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r28 = r0
            r0 = r28
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L48d
            r0 = r28
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L48d
            r0 = r28
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.requiresCleaning()
            if (r0 == 0) goto L48d
            r0 = 1
            r18 = r0
            goto L4f1
        L48d:
            r0 = r28
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L4e7
            r0 = r28
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            r1 = r28
            lombok.Builder$ObtainVia r1 = r1.obtainVia
            java.lang.String r1 = r1.method()
            boolean r1 = r1.isEmpty()
            if (r0 != r1) goto L4be
            r0 = r28
            lombok.javac.JavacNode r0 = r0.obtainViaNode
            java.lang.String r1 = "The syntax is either @ObtainVia(field = \"fieldName\") or @ObtainVia(method = \"methodName\")."
            r0.addError(r1)
            return
        L4be:
            r0 = r28
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4e7
            r0 = r28
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L4e7
            r0 = r28
            lombok.javac.JavacNode r0 = r0.obtainViaNode
            java.lang.String r1 = "@ObtainVia(isStatic = true) is not valid unless 'method' has been set."
            r0.addError(r1)
            return
        L4e7:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L45a
        L4f1:
            r0 = r12
            r1 = r12
            r2 = r12
            r3 = r19
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.String r2 = r2.replaceBuilderClassName(r3)
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderClassName = r3
            r0.builderAbstractClassName = r1
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r12
            java.lang.String r3 = r3.builderAbstractClassName
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Impl"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.builderImplClassName = r1
            r0 = r12
            r1 = r8
            r2 = r15
            r3 = r12
            java.lang.String r3 = r3.builderClassName
            lombok.javac.JavacNode r1 = r1.findInnerClass(r2, r3)
            r0.builderAbstractType = r1
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderAbstractType
            if (r0 != 0) goto L561
            r0 = r12
            r1 = r8
            r2 = r12
            r3 = r27
            r4 = r17
            r5 = r22
            r6 = r23
            lombok.javac.JavacNode r1 = r1.generateBuilderAbstractClass(r2, r3, r4, r5, r6)
            r0.builderAbstractType = r1
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderAbstractType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            goto L5fd
        L561:
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderAbstractType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r28 = r0
            r0 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.STATIC
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L594
            r0 = r28
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.ABSTRACT
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L59c
        L594:
            r0 = r11
            java.lang.String r1 = "Existing Builder must be an abstract static inner class."
            r0.addError(r1)
            return
        L59c:
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderAbstractType
            r1 = r11
            lombok.javac.handlers.JavacHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
            r0 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r30 = r0
            goto L5f3
        L5b4:
            r0 = r30
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r29 = r0
            r0 = r29
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            r31 = r0
            r0 = r31
            if (r0 != 0) goto L5cf
            goto L5f3
        L5cf:
            r0 = r31
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r32 = r0
            r0 = r32
            if (r0 != 0) goto L5de
            goto L5f3
        L5de:
            r0 = r32
            r1 = r12
            lombok.javac.JavacNode r1 = r1.builderAbstractType
            r2 = r31
            boolean r0 = r0.checkForAlreadyExistingNodesAndGenerateError(r1, r2)
            if (r0 == 0) goto L5f3
            r0 = r29
            r1 = 0
            r0.singularData = r1
        L5f3:
            r0 = r30
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5b4
        L5fd:
            r0 = r12
            r0.setBuilderToAbstract()
            r0 = r8
            r1 = r12
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r2 = r2.builderFields
            r3 = r11
            r0.generateBuilderFields(r1, r2, r3)
            r0 = r18
            if (r0 == 0) goto L648
            r0 = r25
            r1 = r25
            r2 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r12
            java.lang.String r3 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r25
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r28
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        L648:
            r0 = r12
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L697
            r0 = r8
            r1 = r12
            r2 = r27
            if (r2 == 0) goto L65c
            r2 = 1
            goto L65d
        L65c:
            r2 = 0
        L65d:
            r3 = r23
            r4 = r22
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateFillValuesMethod(r1, r2, r3, r4)
            r28 = r0
            r0 = r28
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r28
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            r0 = r8
            r1 = r12
            r2 = r13
            java.lang.String r2 = r2.setterPrefix()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateStaticFillValuesMethod(r1, r2)
            r29 = r0
            r0 = r29
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r29
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L697:
            r0 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r29 = r0
            goto L6c3
        L6a6:
            r0 = r29
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r28 = r0
            r0 = r8
            r1 = r12
            r2 = r28
            r3 = r23
            r4 = r13
            java.lang.String r4 = r4.setterPrefix()
            r0.generateSetterMethodsForBuilder(r1, r2, r3, r4)
        L6c3:
            r0 = r29
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6a6
            r0 = r8
            r1 = r12
            r2 = r27
            if (r2 == 0) goto L6d9
            r2 = 1
            goto L6da
        L6d9:
            r2 = 0
        L6da:
            r3 = r23
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateAbstractSelfMethod(r1, r2, r3)
            r28 = r0
            r0 = r28
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r28
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            r0 = r8
            r1 = r12
            r2 = r27
            if (r2 == 0) goto L6fe
            r2 = 1
            goto L6ff
        L6fe:
            r2 = 0
        L6ff:
            r3 = r22
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateAbstractBuildMethod(r1, r2, r3)
            r29 = r0
            r0 = r29
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r29
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r30 = r0
            r0 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L774
        L72f:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r31 = r0
            r0 = r31
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            java.util.Iterator r0 = r0.iterator()
            r34 = r0
            goto L76a
        L74a:
            r0 = r34
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r33 = r0
            r0 = r30
            lombok.core.handlers.InclusionExclusionUtils$Included r1 = new lombok.core.handlers.InclusionExclusionUtils$Included
            r2 = r1
            r3 = r33
            r4 = 0
            r5 = 1
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L76a:
            r0 = r34
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L74a
        L774:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L72f
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r30
            r2 = 1
            r3 = r27
            if (r3 == 0) goto L78f
            r3 = 1
            goto L790
        L78f:
            r3 = 0
        L790:
            lombok.core.handlers.HandlerUtil$FieldAccess r4 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleToString.createToString(r0, r1, r2, r3, r4, r5)
            r31 = r0
            r0 = r31
            if (r0 == 0) goto L7a8
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r31
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L7a8:
            r0 = r18
            if (r0 == 0) goto L7cf
            r0 = r8
            r1 = r12
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r1 = r1.builderFields
            r2 = r12
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateCleanMethod(r1, r2, r3)
            r32 = r0
            r0 = r32
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r32
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L7cf:
            r0 = r19
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L7e4
            r0 = 1
            goto L7e5
        L7e4:
            r0 = 0
        L7e5:
            r32 = r0
            r0 = r32
            if (r0 != 0) goto L8d7
            r0 = r12
            r1 = r8
            r2 = r15
            r3 = r12
            java.lang.String r3 = r3.builderImplClassName
            lombok.javac.JavacNode r1 = r1.findInnerClass(r2, r3)
            r0.builderImplType = r1
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderImplType
            if (r0 != 0) goto L822
            r0 = r12
            r1 = r8
            r2 = r12
            lombok.javac.JavacNode r1 = r1.generateBuilderImplClass(r2)
            r0.builderImplType = r1
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderImplType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            goto L866
        L822:
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderImplType
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r33 = r0
            r0 = r33
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.STATIC
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L855
            r0 = r33
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            java.util.Set r0 = r0.getFlags()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.ABSTRACT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L85d
        L855:
            r0 = r11
            java.lang.String r1 = "Existing BuilderImpl must be a non-abstract static inner class."
            r0.addError(r1)
            return
        L85d:
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderImplType
            r1 = r11
            lombok.javac.handlers.JavacHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
        L866:
            lombok.AccessLevel r0 = lombok.AccessLevel.PRIVATE
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r12
            lombok.javac.JavacNode r2 = r2.builderImplType
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = 0
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleConstructor.createConstructor(r0, r1, r2, r3, r4, r5)
            r33 = r0
            r0 = r33
            if (r0 == 0) goto L88a
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderImplType
            r1 = r33
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L88a:
            r0 = r12
            r0.setBuilderToImpl()
            r0 = r8
            r1 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateSelfMethod(r1)
            r34 = r0
            r0 = r34
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r34
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            r0 = r12
            java.lang.String r0 = r0.buildMethodName
            r1 = r12
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = -1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L8d7
            r0 = r8
            r1 = r12
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateBuildMethod(r1, r2)
            r35 = r0
            r0 = r35
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r35
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L8d7:
            r0 = r8
            r1 = r12
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r12
            java.lang.String r2 = r2.builderAbstractClassName
            boolean r0 = r0.constructorExists(r1, r2)
            if (r0 != 0) goto L8fd
            r0 = r12
            r0.setBuilderToAbstract()
            r0 = r8
            r1 = r12
            r2 = r27
            if (r2 == 0) goto L8f9
            r2 = 1
            goto L8fa
        L8f9:
            r2 = 0
        L8fa:
            r0.generateBuilderBasedConstructor(r1, r2)
        L8fd:
            r0 = r32
            if (r0 != 0) goto L999
            r0 = r14
            if (r0 == 0) goto L91e
            r0 = r12
            java.lang.String r0 = r0.builderMethodName
            r1 = r12
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = -1
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r0, r1, r2)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L91e
            r0 = 0
            r14 = r0
        L91e:
            r0 = r14
            if (r0 == 0) goto L941
            r0 = r8
            r1 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateBuilderMethod(r1)
            r33 = r0
            r0 = r33
            if (r0 == 0) goto L941
            r0 = r33
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r33
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L941:
            r0 = r12
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L999
            int[] r0 = m87x2486df07()
            java.lang.String r1 = "toBuilder"
            r2 = r12
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = 0
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L97b;
                case 2: goto L999;
                case 3: goto L978;
                default: goto L999;
            }
        L978:
            goto L999
        L97b:
            r0 = r8
            r1 = r12
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.generateToBuilderMethod(r1)
            r33 = r0
            r0 = r33
            if (r0 == 0) goto L999
            r0 = r33
            r1 = r11
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r12
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r33
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L999:
            r0 = r20
            if (r0 == 0) goto L9cb
            r0 = r14
            if (r0 == 0) goto L9cb
            r0 = r20
            java.util.Iterator r0 = r0.iterator()
            r34 = r0
            goto L9c1
        L9ad:
            r0 = r34
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r33 = r0
            r0 = r33
            java.lang.String r1 = "@SuperBuilder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final."
            r0.addWarning(r1)
        L9c1:
            r0 = r34
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9ad
        L9cb:
            return
    }

    private lombok.javac.JavacNode generateBuilderAbstractClass(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r9, com.sun.tools.javac.tree.JCTree.JCExpression r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r11, java.lang.String r12, java.lang.String r13) {
            r8 = this;
            r0 = r9
            lombok.javac.JavacNode r0 = r0.parentType
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            r0 = r14
            r1 = 1033(0x409, double:5.104E-321)
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r15 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r9
            lombok.javac.JavacNode r1 = r1.sourceNode
            r2 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r1, r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            r0 = r14
            r1 = r9
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r17 = r0
            r0 = r16
            r1 = r14
            r2 = r9
            r3 = r12
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r17
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r9
            r1 = r9
            java.lang.String r1 = r1.builderClassName
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r18 = r0
            r0 = r8
            r1 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r14
            r3 = r9
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r19 = r0
            r0 = r19
            r1 = r14
            r2 = r9
            r3 = r12
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            r1 = r14
            r2 = r9
            r3 = r13
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = r14
            r2 = r9
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = r18
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r20 = r0
            r0 = r16
            r1 = r14
            r2 = r9
            r3 = r13
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r20
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = 0
            r21 = r0
            r0 = r10
            if (r0 == 0) goto L102
            r0 = r8
            r1 = r11
            r2 = r14
            r3 = r9
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r19 = r0
            r0 = r19
            r1 = r14
            r2 = r9
            r3 = r12
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            r1 = r14
            r2 = r9
            r3 = r13
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = r10
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r21 = r0
        L102:
            r0 = r14
            r1 = r15
            r2 = r18
            r3 = r16
            com.sun.tools.javac.util.List r3 = r3.toList()
            r4 = r21
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.ClassDef(r1, r2, r3, r4, r5, r6)
            r22 = r0
            r0 = r22
            r1 = r9
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r9
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r22
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectType(r0, r1)
            return r0
    }

    private lombok.javac.JavacNode generateBuilderImplClass(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r9) {
            r8 = this;
            r0 = r9
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r10 = r0
            r0 = r10
            r1 = 26
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r11 = r0
            r0 = r10
            r1 = r9
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r9
            r3 = r9
            java.lang.String r3 = r3.builderAbstractClassName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r12 = r0
            r0 = r10
            r1 = r9
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r13 = r0
            r0 = r10
            r1 = r9
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r9
            r3 = r9
            java.lang.String r3 = r3.builderImplClassName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            r4 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r4 = r4.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r8
            r1 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r10
            r3 = r9
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r15 = r0
            r0 = r15
            r1 = r13
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = r14
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r10
            r1 = r12
            r2 = r15
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r12 = r0
            r0 = r10
            r1 = r11
            r2 = r9
            r3 = r9
            java.lang.String r3 = r3.builderImplClassName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r9
            lombok.javac.JavacNode r3 = r3.parentType
            r4 = r9
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r4 = r4.typeParams
            com.sun.tools.javac.util.List r3 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r3, r4)
            r4 = r12
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.ClassDef(r1, r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r16
            r1 = r9
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r9
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r16
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectType(r0, r1)
            return r0
    }

    private void generateBuilderBasedConstructor(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r13, boolean r14) {
            r12 = this;
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r15 = r0
            lombok.AccessLevel r0 = lombok.AccessLevel.PROTECTED
            r16 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r13
            java.lang.String r1 = "b"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r18 = r0
            r0 = r13
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r20 = r0
            goto L15d
        L29:
            r0 = r20
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r19 = r0
            r0 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L7b
            r0 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L7b
            r0 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r19
            lombok.javac.JavacNode r2 = r2.originalFieldNode
            r3 = r13
            lombok.javac.JavacNode r3 = r3.sourceNode
            r4 = r17
            r5 = r19
            com.sun.tools.javac.util.Name r5 = r5.builderFieldName
            java.lang.String r6 = "b"
            r0.appendBuildCode(r1, r2, r3, r4, r5, r6)
            r0 = r15
            r1 = r19
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            com.sun.tools.javac.util.Name r1 = r1.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r21 = r0
            goto L8c
        L7b:
            r0 = r15
            r1 = r15
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r19
            com.sun.tools.javac.util.Name r2 = r2.builderFieldName
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r21 = r0
        L8c:
            r0 = r15
            r1 = r15
            r2 = r13
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r19
            com.sun.tools.javac.util.Name r2 = r2.rawName
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r22 = r0
            r0 = r15
            r1 = r15
            r2 = r22
            r3 = r21
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r23 = r0
            r0 = r19
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L12e
            r0 = r15
            r1 = r15
            r2 = r18
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r19
            com.sun.tools.javac.util.Name r2 = r2.nameOfSetFlag
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r24 = r0
            r0 = r15
            r1 = r15
            r2 = r13
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r19
            com.sun.tools.javac.util.Name r2 = r2.rawName
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r22 = r0
            r0 = r15
            r1 = r13
            lombok.javac.JavacNode r1 = r1.parentType
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r25 = r0
            r0 = r15
            r1 = r22
            r2 = r15
            r3 = r15
            r4 = r13
            lombok.javac.JavacNode r4 = r4.parentType
            java.lang.Object r4 = r4.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r4 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r4
            com.sun.tools.javac.util.List r4 = r4.typarams
            com.sun.tools.javac.util.List r3 = lombok.javac.handlers.JavacHandlerUtil.typeParameterNames(r3, r4)
            r4 = r15
            r5 = r25
            r6 = r19
            com.sun.tools.javac.util.Name r6 = r6.nameOfDefaultProvider
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r4 = r4.Select(r5, r6)
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            com.sun.tools.javac.tree.JCTree$JCAssign r0 = r0.Assign(r1, r2)
            r26 = r0
            r0 = r17
            r1 = r15
            r2 = r24
            r3 = r23
            r4 = r15
            r5 = r26
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r4 = r4.Exec(r5)
            com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L136
        L12e:
            r0 = r17
            r1 = r23
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L136:
            r0 = r19
            lombok.javac.JavacNode r0 = r0.originalFieldNode
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L15d
            r0 = r15
            r1 = r19
            lombok.javac.JavacNode r1 = r1.originalFieldNode
            r2 = r13
            lombok.javac.JavacNode r2 = r2.sourceNode
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r0, r1, r2)
            r24 = r0
            r0 = r24
            if (r0 == 0) goto L15d
            r0 = r17
            r1 = r24
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L15d:
            r0 = r20
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L188
            r0 = r15
            r1 = r13
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto L18b
        L188:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        L18b:
            r19 = r0
            r0 = r15
            r1 = r16
            int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
            long r1 = (long) r1
            r2 = r19
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r20 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r13
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r22 = r0
            r0 = r12
            r1 = r13
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r15
            r3 = r13
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r24 = r0
            r0 = r15
            r1 = r15
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r25 = r0
            r0 = r24
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = r15
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r25 = r0
            r0 = r24
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = r15
            r2 = r13
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = r13
            com.sun.tools.javac.util.Name r3 = r3.getBuilderClassName()
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r2 = r24
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r26 = r0
            r0 = r15
            r1 = r15
            r2 = r22
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r18
            r3 = r26
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r27 = r0
            r0 = r21
            r1 = r27
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            if (r0 == 0) goto L24c
            r0 = r15
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r15
            r3 = r13
            java.lang.String r4 = "super"
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r15
            r4 = r18
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r28 = r0
            r0 = r17
            r1 = r15
            r2 = r28
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.prepend(r1)
        L24c:
            r0 = r15
            r1 = r20
            r2 = r13
            java.lang.String r3 = "<init>"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r21
            com.sun.tools.javac.util.List r5 = r5.toList()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r15
            r8 = 0
            r9 = r17
            com.sun.tools.javac.util.List r9 = r9.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r7 = r7.Block(r8, r9)
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r13
            lombok.javac.JavacNode r1 = r1.sourceNode
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r28 = r0
            r0 = r13
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r28
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateBuilderMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            r6 = r11
            java.lang.String r6 = r6.builderImplClassName
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            r6 = 0
            r7 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r7 = r7.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r13 = r0
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
            r0 = 1
            r16 = r0
            r0 = r16
            r1 = 8
            r0 = r0 | r1
            r16 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r12
            r2 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.typeParameterNames(r1, r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            r0 = r12
            r1 = r12
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r18 = r0
            r0 = r17
            r1 = r18
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r17
            r1 = r18
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r19 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto L9e
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.common.aliasing.qual.Unique"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r19 = r0
        L9e:
            r0 = r12
            r1 = r12
            r2 = r11
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = r11
            r4 = r11
            java.lang.String r4 = r4.builderAbstractClassName
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r6 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5, r6)
            r2 = r17
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r20 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Le0
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto Le3
        Le0:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        Le3:
            r21 = r0
            r0 = r12
            r1 = r12
            r2 = r16
            long r2 = (long) r2
            r3 = r21
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r11
            r3 = r11
            java.lang.String r3 = r3.builderMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r20
            r4 = r11
            lombok.javac.JavacNode r4 = r4.sourceNode
            r5 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r5 = r5.typeParams
            com.sun.tools.javac.util.List r4 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r4, r5)
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r15
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r22 = r0
            r0 = r11
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r22
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r22
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateToBuilderMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            r6 = r11
            java.lang.String r6 = r6.builderImplClassName
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            r6 = 0
            r7 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r7 = r7.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r3, r4, r5, r6, r7)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r12
            r1 = r11
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r14 = r0
            r0 = r12
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r12
            r3 = r13
            r4 = r11
            java.lang.String r5 = "$fillValuesFrom"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r14
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r15 = r0
            r0 = r12
            r1 = r15
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r16 = r0
            r0 = r12
            r1 = 0
            r2 = r16
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r17 = r0
            r0 = 1
            r18 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r12
            r2 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r2 = r2.typeParams
            com.sun.tools.javac.util.List r1 = lombok.javac.handlers.JavacHandlerUtil.typeParameterNames(r1, r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.appendList(r1)
            r0 = r12
            r1 = r12
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r20 = r0
            r0 = r19
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r19
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r12
            r1 = r12
            r2 = r11
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = r11
            r4 = r11
            java.lang.String r4 = r4.builderAbstractClassName
            com.sun.tools.javac.util.Name r3 = r3.toName(r4)
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r21 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto Ld9
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            goto Ldc
        Ld9:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
        Ldc:
            r22 = r0
            r0 = r12
            r1 = r12
            r2 = r18
            long r2 = (long) r2
            r3 = r22
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2, r3)
            r2 = r11
            java.lang.String r3 = "toBuilder"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r21
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r17
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r23 = r0
            r0 = r11
            lombok.javac.JavacNode r0 = r0.parentType
            r1 = r23
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r23
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateFillValuesMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11, boolean r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r15 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
            r0 = r12
            if (r0 == 0) goto L31
            r0 = r15
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r17 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r16 = r0
        L31:
            r0 = r15
            r1 = 4
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r17 = r0
            r0 = r11
            java.lang.String r1 = "$fillValuesFrom"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r18 = r0
            r0 = r15
            r1 = r11
            r2 = r13
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r19 = r0
            r0 = r15
            r1 = r11
            r2 = r14
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r20 = r0
            r0 = r15
            r1 = r15
            r2 = 8589934608(0x200000010, double:4.24399159E-314)
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            java.lang.String r3 = "instance"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r20
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r21 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r12
            if (r0 == 0) goto Lbb
            r0 = r15
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r15
            r3 = r15
            r4 = r11
            java.lang.String r5 = "super"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r18
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r15
            r4 = r11
            java.lang.String r5 = "instance"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r23 = r0
            r0 = r22
            r1 = r15
            r2 = r23
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Lbb:
            r0 = r15
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getBuilderClassName()
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r23 = r0
            r0 = r15
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r15
            r3 = r23
            r4 = r11
            java.lang.String r5 = "$fillValuesFromInstanceIntoBuilder"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r15
            r4 = r11
            java.lang.String r5 = "instance"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r15
            r5 = r11
            java.lang.String r6 = "this"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r24 = r0
            r0 = r22
            r1 = r15
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = r15
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r15
            r4 = r11
            java.lang.String r5 = "self"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r25 = r0
            r0 = r22
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r15
            r1 = 0
            r2 = r22
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r26 = r0
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r21
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5)
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r26
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateStaticFillValuesMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11, java.lang.String r12) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r13 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r14 = r0
            r0 = r13
            r1 = 10
            r2 = r14
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r15 = r0
            r0 = r11
            java.lang.String r1 = "$fillValuesFromInstanceIntoBuilder"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r16 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_VOID
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r0 = r0.TypeIdent(r1)
            r17 = r0
            r0 = r13
            r1 = r13
            r2 = 8589934608(0x200000010, double:4.24399159E-314)
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            java.lang.String r3 = "instance"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r11
            lombok.javac.JavacNode r3 = r3.parentType
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r3)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r18 = r0
            r0 = r10
            r1 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r1 = r1.typeParams
            r2 = r13
            r3 = r11
            lombok.javac.JavacNode r3 = r3.sourceNode
            com.sun.tools.javac.util.ListBuffer r0 = r0.getTypeParamExpressions(r1, r2, r3)
            r19 = r0
            r0 = r13
            r1 = r13
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r20 = r0
            r0 = r19
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r13
            r1 = r13
            com.sun.tools.javac.code.BoundKind r2 = com.sun.tools.javac.code.BoundKind.UNBOUND
            com.sun.tools.javac.tree.JCTree$TypeBoundKind r1 = r1.TypeBoundKind(r2)
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = r0.Wildcard(r1, r2)
            r20 = r0
            r0 = r19
            r1 = r20
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r13
            r1 = r13
            r2 = r11
            lombok.javac.JavacNode r2 = r2.parentType
            r3 = r11
            com.sun.tools.javac.util.Name r3 = r3.getBuilderClassName()
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r2 = r19
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
            r21 = r0
            r0 = r13
            r1 = r13
            r2 = 8589934608(0x200000010, double:4.24399159E-314)
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r11
            java.lang.String r3 = "b"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r21
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r22 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r11
            java.util.List<lombok.javac.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto Le2
        Lc4:
            r0 = r25
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r24 = r0
            r0 = r10
            r1 = r24
            r2 = r11
            r3 = r12
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.createSetterCallWithInstanceValue(r1, r2, r3)
            r26 = r0
            r0 = r23
            r1 = r26
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        Le2:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc4
            r0 = r13
            r1 = 0
            r2 = r23
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r24 = r0
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r11
            lombok.javac.JavacNode r4 = r4.builderType
            r5 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r5 = r5.typeParams
            com.sun.tools.javac.util.List r4 = lombok.javac.handlers.JavacHandlerUtil.copyTypeParams(r4, r5)
            r5 = r18
            r6 = r22
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5, r6)
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r24
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCExpressionStatement createSetterCallWithInstanceValue(lombok.javac.handlers.HandleBuilder.BuilderFieldData r10, lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11, java.lang.String r12) {
            r9 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r13 = r0
            r0 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 2
        L12:
            com.sun.tools.javac.tree.JCTree$JCExpression[] r0 = new com.sun.tools.javac.tree.JCTree.JCExpression[r0]
            r14 = r0
            r0 = r10
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L2d
            r0 = r10
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
        L2d:
            r0 = 0
            r15 = r0
            goto L66
        L33:
            r0 = r14
            r1 = r15
            r2 = r13
            r3 = r13
            r4 = r11
            java.lang.String r5 = "instance"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r10
            lombok.Builder$ObtainVia r4 = r4.obtainVia
            if (r4 != 0) goto L52
            r4 = r10
            com.sun.tools.javac.util.Name r4 = r4.rawName
            goto L5f
        L52:
            r4 = r11
            r5 = r10
            lombok.Builder$ObtainVia r5 = r5.obtainVia
            java.lang.String r5 = r5.field()
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
        L5f:
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r0[r1] = r2
            int r15 = r15 + 1
        L66:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 < r1) goto L33
            goto L114
        L71:
            r0 = r10
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto Ld2
            r0 = 0
            r15 = r0
            goto Lc7
        L83:
            r0 = r13
            r1 = r11
            lombok.javac.JavacNode r1 = r1.parentType
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2)
            r16 = r0
            r0 = r13
            r1 = r16
            r2 = r11
            r3 = r10
            lombok.Builder$ObtainVia r3 = r3.obtainVia
            java.lang.String r3 = r3.method()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r17 = r0
            r0 = r14
            r1 = r15
            r2 = r13
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r17
            r5 = r13
            r6 = r11
            java.lang.String r7 = "instance"
            com.sun.tools.javac.util.Name r6 = r6.toName(r7)
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.of(r5)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            r0[r1] = r2
            int r15 = r15 + 1
        Lc7:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 < r1) goto L83
            goto L114
        Ld2:
            r0 = 0
            r15 = r0
            goto L10c
        Ld8:
            r0 = r13
            r1 = r13
            r2 = r11
            java.lang.String r3 = "instance"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r11
            r3 = r10
            lombok.Builder$ObtainVia r3 = r3.obtainVia
            java.lang.String r3 = r3.method()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r16 = r0
            r0 = r14
            r1 = r15
            r2 = r13
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = r16
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r2 = r2.Apply(r3, r4, r5)
            r0[r1] = r2
            int r15 = r15 + 1
        L10c:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 < r1) goto Ld8
        L114:
            r0 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L124
            r0 = r14
            r1 = 0
            r0 = r0[r1]
            r15 = r0
            goto L16b
        L124:
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r14
            r3 = 0
            r2 = r2[r3]
            r3 = r13
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r16 = r0
            r0 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            java.lang.String r1 = r1.getTargetFqn()
            r2 = r13
            r3 = r10
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r3 = r3.singularData
            r4 = r11
            lombok.javac.JavacNode r4 = r4.parentType
            r5 = r11
            lombok.javac.JavacNode r5 = r5.sourceNode
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.getEmptyExpression(r1, r2, r3, r4, r5)
            r17 = r0
            r0 = r13
            r1 = r16
            r2 = r17
            r3 = r14
            r4 = 1
            r3 = r3[r4]
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            r15 = r0
        L16b:
            r0 = r11
            lombok.javac.JavacNode r0 = r0.sourceNode
            r1 = r12
            r2 = r10
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r16 = r0
            r0 = r13
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
            r2 = r13
            r3 = r13
            r4 = r11
            java.lang.String r5 = "b"
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            r4 = r11
            r5 = r16
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r15
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r17 = r0
            r0 = r13
            r1 = r17
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r18 = r0
            r0 = r18
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateAbstractSelfMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11, boolean r12, java.lang.String r13) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r15 = r0
            r0 = r12
            if (r0 == 0) goto L2b
            r0 = r14
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r16 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L4d
            r0 = r14
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.Pure"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            goto L4e
        L4d:
            r0 = 0
        L4e:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L5e
            r0 = r15
            r1 = r17
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r15 = r0
        L5e:
            r0 = r16
            if (r0 == 0) goto L6c
            r0 = r15
            r1 = r16
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r15 = r0
        L6c:
            r0 = r14
            r1 = 1028(0x404, double:5.08E-321)
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r18 = r0
            r0 = r11
            java.lang.String r1 = "self"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r19 = r0
            r0 = r14
            r1 = r11
            r2 = r13
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r20 = r0
            r0 = r20
            r1 = r14
            r2 = r11
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r11
            lombok.core.configuration.CheckerFrameworkVersion r3 = r3.checkerFramework
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
            r20 = r0
            r0 = r14
            r1 = r18
            r2 = r19
            r3 = r20
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = 0
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateSelfMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r11) {
            r10 = this;
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r12 = r0
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r13 = r0
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L3c
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            java.lang.String r2 = "org.checkerframework.dataflow.qual.Pure"
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r14 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r15 = r0
            r0 = r14
            if (r0 == 0) goto L52
            r0 = r15
            r1 = r14
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r15 = r0
        L52:
            r0 = r15
            r1 = r13
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r15 = r0
            r0 = r12
            r1 = 4
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r16 = r0
            r0 = r11
            java.lang.String r1 = "self"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r17 = r0
            r0 = r12
            r1 = r11
            lombok.javac.JavacNode r1 = r1.builderType
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.getBuilderClassName()
            r3 = 0
            r4 = r11
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCTypeParameter> r4 = r4.typeParams
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.namePlusTypeParamsToTypeReference(r0, r1, r2, r3, r4)
            r18 = r0
            r0 = r18
            r1 = r12
            r2 = r11
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r11
            lombok.core.configuration.CheckerFrameworkVersion r3 = r3.checkerFramework
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
            r18 = r0
            r0 = r12
            r1 = r12
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            r19 = r0
            r0 = r12
            r1 = 0
            r2 = r19
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r20 = r0
            r0 = r12
            r1 = r16
            r2 = r17
            r3 = r18
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r20
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateAbstractBuildMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r12, boolean r13, java.lang.String r14) {
            r11 = this;
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r15 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
            r0 = r13
            if (r0 == 0) goto L31
            r0 = r15
            r1 = r12
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r17 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r16 = r0
        L31:
            r0 = r12
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L54
            r0 = r16
            r1 = r15
            r2 = r12
            lombok.javac.JavacNode r2 = r2.builderType
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r16 = r0
        L54:
            r0 = r15
            r1 = 1025(0x401, double:5.064E-321)
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r17 = r0
            r0 = r12
            r1 = r12
            java.lang.String r1 = r1.buildMethodName
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r18 = r0
            r0 = r15
            r1 = r12
            r2 = r14
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r19 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = lombok.javac.handlers.HandleBuilder.generateReceiver(r0)
            r20 = r0
            r0 = r20
            if (r0 == 0) goto La6
            r0 = r15
            boolean r0 = r0.hasMethodDefWithRecvParam()
            if (r0 == 0) goto La6
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r20
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r7 = com.sun.tools.javac.util.List.nil()
            r8 = 0
            r9 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDefWithRecvParam(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r21 = r0
            goto Lbe
        La6:
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = 0
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r21 = r0
        Lbe:
            r0 = r21
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateBuildMethod(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r12, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r13) {
            r11 = this;
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r14
            r1 = r12
            java.lang.String r2 = "this"
            com.sun.tools.javac.util.Name r1 = r1.toName(r2)
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r17 = r0
            r0 = r14
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r12
            lombok.javac.JavacNode r3 = r3.parentType
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r3)
            r4 = r17
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r16
            r1 = r14
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCReturn r1 = r1.Return(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = 0
            r2 = r16
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r18 = r0
            r0 = r14
            r1 = r12
            lombok.javac.JavacNode r1 = r1.builderType
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Override"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            r19 = r0
            r0 = r19
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r20 = r0
            r0 = r12
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L8d
            r0 = r20
            r1 = r14
            r2 = r12
            lombok.javac.JavacNode r2 = r2.builderType
            java.lang.String r3 = "org.checkerframework.dataflow.qual.SideEffectFree"
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.genTypeRef(r2, r3)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = r1.Annotation(r2, r3)
            com.sun.tools.javac.util.List r0 = r0.prepend(r1)
            r20 = r0
        L8d:
            r0 = r14
            r1 = 1
            r2 = r20
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r21 = r0
            r0 = r12
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = lombok.javac.handlers.HandleBuilder.generateReceiver(r0)
            r22 = r0
            r0 = r22
            if (r0 == 0) goto Lce
            r0 = r14
            boolean r0 = r0.hasMethodDefWithRecvParam()
            if (r0 == 0) goto Lce
            r0 = r14
            r1 = r21
            r2 = r12
            r3 = r12
            java.lang.String r3 = r3.buildMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r12
            lombok.javac.JavacNode r3 = r3.parentType
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r3)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r22
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r13
            r8 = r18
            r9 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDefWithRecvParam(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r23 = r0
            goto Lef
        Lce:
            r0 = r14
            r1 = r21
            r2 = r12
            r3 = r12
            java.lang.String r3 = r3.buildMethodName
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r12
            lombok.javac.JavacNode r3 = r3.parentType
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneSelfType(r3)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            r6 = r13
            r7 = r18
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r23 = r0
        Lef:
            r0 = r12
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r23
            lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r23
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCMethodDecl generateCleanMethod(java.util.List<lombok.javac.handlers.HandleBuilder.BuilderFieldData> r11, lombok.javac.JavacNode r12, lombok.javac.JavacNode r13) {
            r10 = this;
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r14 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L4d
        L1a:
            r0 = r17
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r16 = r0
            r0 = r16
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L4d
            r0 = r16
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L4d
            r0 = r16
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r16
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r12
            r3 = r13
            r4 = r15
            r0.appendCleaningCode(r1, r2, r3, r4)
        L4d:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
            r0 = r15
            r1 = r14
            r2 = r14
            r3 = r14
            r4 = r14
            r5 = r12
            java.lang.String r6 = "this"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r12
            java.lang.String r6 = "$lombokUnclean"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r14
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_BOOLEAN
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCAssign r2 = r2.Assign(r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r14
            r1 = 0
            r2 = r15
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r16 = r0
            r0 = r14
            r1 = r14
            r2 = 1
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r12
            java.lang.String r3 = "$lombokClean"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = r14
            r4 = r12
            com.sun.tools.javac.code.Symtab r4 = r4.getSymbolTable()
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_VOID
            com.sun.tools.javac.code.Type r4 = lombok.javac.Javac.createVoidType(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.Type(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r16
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private void generateBuilderFields(lombok.javac.JavacNode r8, java.util.List<lombok.javac.handlers.HandleBuilder.BuilderFieldData> r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r9
            int r0 = r0.size()
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r8
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L3e
        L1d:
            r0 = r14
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L3e
            r0 = r12
            r1 = r13
            boolean r0 = r0.add(r1)
        L3e:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r11
            r1 = 1
            int r0 = r0 - r1
            r14 = r0
            goto L1b7
        L5a:
            r0 = r9
            r1 = r14
            java.lang.Object r0 = r0.get(r1)
            lombok.javac.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.javac.handlers.HandleBuilder.BuilderFieldData) r0
            r15 = r0
            r0 = r15
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto Ld0
            r0 = r15
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto Ld0
            r0 = r15
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r15
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r8
            r3 = r10
            java.util.List r0 = r0.generateFields(r1, r2, r3)
            r16 = r0
            r0 = r16
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lb6
        L9a:
            r0 = r18
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r17 = r0
            r0 = r13
            r1 = r17
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            boolean r0 = r0.add(r1)
        Lb6:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L9a
            r0 = r15
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            r1 = r16
            boolean r0 = r0.addAll(r1)
            goto L1b4
        Ld0:
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
            goto L11d
        Le2:
            r0 = r19
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r18 = r0
            r0 = r18
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r20 = r0
            r0 = r20
            r1 = r15
            com.sun.tools.javac.util.Name r1 = r1.builderFieldName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10c
            r0 = r18
            r16 = r0
        L10c:
            r0 = r20
            r1 = r15
            com.sun.tools.javac.util.Name r1 = r1.nameOfSetFlag
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11d
            r0 = r18
            r17 = r0
        L11d:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le2
            r0 = r8
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            r0 = r16
            if (r0 != 0) goto L168
            r0 = r18
            r1 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r19 = r0
            r0 = r18
            r1 = r19
            r2 = r15
            com.sun.tools.javac.util.Name r2 = r2.builderFieldName
            r3 = r18
            r4 = r15
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.type
            r5 = r10
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r3, r4, r5)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r20 = r0
            r0 = r8
            r1 = r20
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r16 = r0
            r0 = r13
            r1 = r20
            boolean r0 = r0.add(r1)
        L168:
            r0 = r17
            if (r0 != 0) goto L1a7
            r0 = r15
            com.sun.tools.javac.util.Name r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L1a7
            r0 = r18
            r1 = 2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r19 = r0
            r0 = r18
            r1 = r19
            r2 = r15
            com.sun.tools.javac.util.Name r2 = r2.nameOfSetFlag
            r3 = r18
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOOLEAN
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r20 = r0
            r0 = r8
            r1 = r20
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
            r0 = r13
            r1 = r20
            boolean r0 = r0.add(r1)
        L1a7:
            r0 = r15
            java.util.List<lombok.javac.JavacNode> r0 = r0.createdFields
            r1 = r16
            boolean r0 = r0.add(r1)
        L1b4:
            int r14 = r14 + (-1)
        L1b7:
            r0 = r14
            if (r0 >= 0) goto L5a
            r0 = r13
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L1db
        L1c8:
            r0 = r15
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r14 = r0
            r0 = r14
            r1 = r10
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L1db:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c8
            return
    }

    private void generateSetterMethodsForBuilder(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r13, lombok.javac.handlers.HandleBuilder.BuilderFieldData r14, java.lang.String r15, java.lang.String r16) {
            r12 = this;
            r0 = r14
            lombok.javac.JavacNode r0 = r0.originalFieldNode
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isFieldDeprecated(r0)
            r17 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            lombok.javac.handlers.HandleSuperBuilder$1 r0 = new lombok.javac.handlers.HandleSuperBuilder$1
            r1 = r0
            r2 = r12
            r3 = r18
            r4 = r13
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            r19 = r0
            lombok.javac.handlers.HandleSuperBuilder$2 r0 = new lombok.javac.handlers.HandleSuperBuilder$2
            r1 = r0
            r2 = r12
            r3 = r18
            r4 = r13
            r1.<init>(r2, r3, r4)
            r20 = r0
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L3b
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            if (r0 != 0) goto L72
        L3b:
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r14
            java.util.List<lombok.javac.JavacNode> r3 = r3.createdFields
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            lombok.javac.JavacNode r3 = (lombok.javac.JavacNode) r3
            r4 = r14
            com.sun.tools.javac.util.Name r4 = r4.name
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.nameOfSetFlag
            r6 = r19
            com.sun.tools.javac.tree.JCTree$JCExpression r6 = r6.make()
            r7 = r20
            com.sun.tools.javac.tree.JCTree$JCStatement r7 = r7.make()
            r8 = r14
            com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCAnnotation> r8 = r8.annotations
            r9 = r14
            lombok.javac.JavacNode r9 = r9.originalFieldNode
            r10 = r16
            r0.generateSimpleSetterMethodForBuilder(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L96
        L72:
            r0 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r0 = r0.singularData
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getSingularizer()
            r1 = r13
            lombok.core.configuration.CheckerFrameworkVersion r1 = r1.checkerFramework
            r2 = r14
            lombok.javac.handlers.JavacSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r17
            r4 = r13
            lombok.javac.JavacNode r4 = r4.builderType
            r5 = r13
            lombok.javac.JavacNode r5 = r5.sourceNode
            r6 = 1
            r7 = r19
            r8 = r20
            lombok.AccessLevel r9 = lombok.AccessLevel.PUBLIC
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L96:
            return
    }

    private void generateSimpleSetterMethodForBuilder(lombok.javac.handlers.HandleSuperBuilder.SuperBuilderJob r15, boolean r16, lombok.javac.JavacNode r17, com.sun.tools.javac.util.Name r18, com.sun.tools.javac.util.Name r19, com.sun.tools.javac.tree.JCTree.JCExpression r20, com.sun.tools.javac.tree.JCTree.JCStatement r21, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r22, lombok.javac.JavacNode r23, java.lang.String r24) {
            r14 = this;
            r0 = r15
            lombok.javac.JavacNode r0 = r0.sourceNode
            r1 = r24
            r2 = r18
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r25 = r0
            r0 = r15
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r25
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r26 = r0
            r0 = r15
            lombok.javac.JavacNode r0 = r0.builderType
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r28 = r0
            goto L69
        L2a:
            r0 = r28
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r27 = r0
            r0 = r27
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 == r1) goto L44
            goto L69
        L44:
            r0 = r27
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r29 = r0
            r0 = r29
            com.sun.tools.javac.util.Name r0 = r0.name
            r30 = r0
            r0 = r30
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            r0 = r17
            r1 = r29
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isTolerate(r0, r1)
            if (r0 != 0) goto L69
            return
        L69:
            r0 = r28
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2a
            r0 = r17
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r27 = r0
            r0 = r23
            com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableToSetterAnnotations(r0)
            r28 = r0
            r0 = r20
            r1 = r27
            r2 = r15
            lombok.javac.JavacNode r2 = r2.builderType
            r3 = r15
            lombok.core.configuration.CheckerFrameworkVersion r3 = r3.checkerFramework
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
            r20 = r0
            r0 = 1
            r1 = r16
            r2 = r17
            r3 = r27
            r4 = r25
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r15
            lombok.javac.JavacNode r9 = r9.sourceNode
            r10 = r28
            r11 = r22
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = lombok.javac.handlers.HandleSetter.createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r29 = r0
            r0 = r15
            lombok.javac.JavacNode r0 = r0.builderType
            r1 = r29
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
            return
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

    private java.util.HashSet<java.lang.String> gatherUsedTypeNames(com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter> r5, com.sun.tools.javac.tree.JCTree.JCClassDecl r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L2a
        L11:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r8 = r0
            r0 = r7
            r1 = r8
            com.sun.tools.javac.util.Name r1 = r1.getName()
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L2a:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = r7
            r1 = r6
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.getMembers()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L8d
        L4c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r8 = r0
            r0 = r8
            com.sun.source.tree.Tree$Kind r0 = r0.getKind()
            com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.VARIABLE
            if (r0 != r1) goto L8d
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L8d
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.getType()
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L8d
            r0 = r7
            r1 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = (com.sun.tools.javac.tree.JCTree.JCIdent) r1
            com.sun.tools.javac.util.Name r1 = r1.getName()
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L8d:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            r0 = r4
            r1 = r7
            r2 = r6
            com.sun.tools.javac.tree.JCTree r2 = lombok.javac.Javac.getExtendsClause(r2)
            r0.addFirstToken(r1, r2)
            r0 = r6
            com.sun.tools.javac.util.List r0 = r0.getImplementsClause()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto Lbf
        Lac:
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r8 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            r0.addFirstToken(r1, r2)
        Lbf:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lac
            r0 = r7
            return r0
    }

    private void addFirstToken(java.util.Set<java.lang.String> r4, com.sun.tools.javac.tree.JCTree r5) {
            r3 = this;
            r0 = r5
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L1f
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.clazz
            r5 = r0
            goto L1f
        L17:
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            r5 = r0
        L1f:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L30
            r0 = r5
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            if (r0 != 0) goto L17
        L30:
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            return
    }

    private java.lang.String generateNonclashingNameFor(java.lang.String r6, java.util.HashSet<java.lang.String> r7) {
            r5 = this;
            r0 = r7
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto La
            r0 = r6
            return r0
        La:
            r0 = 2
            r8 = r0
            goto L12
        Lf:
            int r8 = r8 + 1
        L12:
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r6
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r6
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private lombok.javac.JavacNode findInnerClass(lombok.javac.JavacNode r4, java.lang.String r5) {
            r3 = this;
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L3b
        Lc:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L24
            goto L3b
        L24:
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r8 = r0
            r0 = r8
            com.sun.tools.javac.util.Name r0 = r0.name
            r1 = r5
            boolean r0 = r0.contentEquals(r1)
            if (r0 == 0) goto L3b
            r0 = r6
            return r0
        L3b:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
    }

    private com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCExpression> getTypeParamExpressions(com.sun.tools.javac.util.List<? extends com.sun.tools.javac.tree.JCTree> r6, lombok.javac.JavacTreeMaker r7, lombok.javac.JavacNode r8) {
            r5 = this;
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L8b
        L12:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeParameter
            if (r0 == 0) goto L3b
            r0 = r9
            r1 = r7
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r2 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r2
            com.sun.tools.javac.util.Name r2 = r2.getName()
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L8b
        L3b:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L58
            r0 = r9
            r1 = r7
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = (com.sun.tools.javac.tree.JCTree.JCIdent) r2
            com.sun.tools.javac.util.Name r2 = r2.getName()
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L8b
        L58:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L73
            r0 = r9
            r1 = r5
            r2 = r7
            r3 = r10
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r3
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.copySelect(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            goto L8b
        L73:
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTypeApply
            if (r0 == 0) goto L8b
            r0 = r9
            r1 = r7
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCTypeApply r2 = (com.sun.tools.javac.tree.JCTree.JCTypeApply) r2
            r3 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L8b:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r9
            return r0
    }

    private com.sun.tools.javac.tree.JCTree.JCExpression copySelect(lombok.javac.JavacTreeMaker r5, com.sun.tools.javac.tree.JCTree.JCFieldAccess r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            r8 = r0
            goto L4c
        Le:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L32
            r0 = r7
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r1
            com.sun.tools.javac.util.Name r1 = r1.getIdentifier()
            boolean r0 = r0.add(r1)
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.getExpression()
            r8 = r0
            goto L4c
        L32:
            r0 = r8
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L4c
            r0 = r7
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = (com.sun.tools.javac.tree.JCTree.JCIdent) r1
            com.sun.tools.javac.util.Name r1 = r1.getName()
            boolean r0 = r0.add(r1)
            r0 = 0
            r8 = r0
        L4c:
            r0 = r8
            if (r0 != 0) goto Le
            r0 = r7
            java.util.Collections.reverse(r0)
            r0 = 0
            r9 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L89
        L63:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.util.Name r0 = (com.sun.tools.javac.util.Name) r0
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L7f
            r0 = r5
            r1 = r10
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r9 = r0
            goto L89
        L7f:
            r0 = r5
            r1 = r9
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r9 = r0
        L89:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L63
            r0 = r9
            return r0
    }

    private boolean constructorExists(lombok.javac.JavacNode r5, java.lang.String r6) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto Lc6
            r0 = r5
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto Lc6
            r0 = r5
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lbc
        L20:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto Lbc
            r0 = r7
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r9 = r0
            r0 = r9
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            r11 = r0
            r0 = r5
            r1 = r9
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isTolerate(r0, r1)
            if (r0 == 0) goto L58
            goto Lbc
        L58:
            r0 = r11
            if (r0 == 0) goto Lbc
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.params
            if (r0 == 0) goto Lbc
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.params
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto Lbc
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.params
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.getType()
            java.lang.String r0 = r0.toString()
            r12 = r0
            r0 = r12
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r13 = r0
            r0 = r13
            if (r0 < 0) goto L9e
            r0 = r12
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r12 = r0
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r6
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "<?, ?>"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            r0 = 1
            return r0
        Lbc:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
        Lc6:
            r0 = 0
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$javac$handlers$JavacHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m87x2486df07() {
            int[] r0 = lombok.javac.handlers.HandleSuperBuilder.f593x2486df07
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
            lombok.javac.handlers.HandleSuperBuilder.f593x2486df07 = r1
            return r0
    }
}
