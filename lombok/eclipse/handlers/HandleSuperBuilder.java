package lombok.eclipse.handlers;

@lombok.core.HandlerPriority(-1024)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSuperBuilder.SCL.lombok */
public class HandleSuperBuilder extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.SuperBuilder> {
    private static final char[] SELF_METHOD_NAME = null;
    private static final char[] FILL_VALUES_METHOD_NAME = null;
    private static final char[] FILL_VALUES_STATIC_METHOD_NAME = null;
    private static final char[] INSTANCE_VARIABLE_NAME = null;
    private static final java.lang.String BUILDER_VARIABLE_NAME_STRING = "b";
    private static final char[] BUILDER_VARIABLE_NAME = null;

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    private static /* synthetic */ int[] f579xb87c1847;



    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleSuperBuilder$SuperBuilderJob.SCL.lombok */
    class SuperBuilderJob extends lombok.eclipse.handlers.HandleBuilder.BuilderJob {
        lombok.eclipse.EclipseNode builderAbstractType;
        java.lang.String builderAbstractClassName;
        char[] builderAbstractClassNameArr;
        lombok.eclipse.EclipseNode builderImplType;
        java.lang.String builderImplClassName;
        char[] builderImplClassNameArr;
        private org.eclipse.jdt.internal.compiler.ast.TypeParameter[] builderTypeParams_;
        final /* synthetic */ lombok.eclipse.handlers.HandleSuperBuilder this$0;

        SuperBuilderJob(lombok.eclipse.handlers.HandleSuperBuilder r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        void init(lombok.core.AnnotationValues<lombok.experimental.SuperBuilder> r6, lombok.experimental.SuperBuilder r7, lombok.eclipse.EclipseNode r8) {
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
                lombok.eclipse.EclipseNode r1 = r1.builderImplType
                r0.builderType = r1
                r0 = r3
                r1 = r3
                java.lang.String r1 = r1.builderImplClassName
                r0.builderClassName = r1
                r0 = r3
                r1 = r3
                char[] r1 = r1.builderImplClassNameArr
                r0.builderClassNameArr = r1
                r0 = r3
                r1 = r3
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
                r0.builderTypeParams = r1
                return
        }

        void setBuilderToAbstract() {
                r3 = this;
                r0 = r3
                r1 = r3
                lombok.eclipse.EclipseNode r1 = r1.builderAbstractType
                r0.builderType = r1
                r0 = r3
                r1 = r3
                java.lang.String r1 = r1.builderAbstractClassName
                r0.builderClassName = r1
                r0 = r3
                r1 = r3
                char[] r1 = r1.builderAbstractClassNameArr
                r0.builderClassNameArr = r1
                r0 = r3
                r1 = r3
                org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.builderTypeParams_
                r0.builderTypeParams = r1
                return
        }

        static /* synthetic */ void access$0(lombok.eclipse.handlers.HandleSuperBuilder.SuperBuilderJob r3, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4) {
                r0 = r3
                r1 = r4
                r0.builderTypeParams_ = r1
                return
        }
    }

    static {
            java.lang.String r0 = "self"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSuperBuilder.SELF_METHOD_NAME = r0
            java.lang.String r0 = "$fillValuesFrom"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_METHOD_NAME = r0
            java.lang.String r0 = "$fillValuesFromInstanceIntoBuilder"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_STATIC_METHOD_NAME = r0
            java.lang.String r0 = "instance"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME = r0
            java.lang.String r0 = "b"
            char[] r0 = r0.toCharArray()
            lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME = r0
            return
    }

    public HandleSuperBuilder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.SuperBuilder> r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11, lombok.eclipse.EclipseNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.SUPERBUILDER_FLAG_USAGE
            java.lang.String r2 = "@SuperBuilder"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            lombok.eclipse.handlers.HandleSuperBuilder$SuperBuilderJob r0 = new lombok.eclipse.handlers.HandleSuperBuilder$SuperBuilderJob
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r12
            r0.sourceNode = r1
            r0 = r13
            r1 = r11
            r0.source = r1
            r0 = r13
            r1 = r12
            lombok.core.configuration.CheckerFrameworkVersion r1 = lombok.eclipse.handlers.EclipseHandlerUtil.getCheckerFrameworkVersion(r1)
            r0.checkerFramework = r1
            r0 = r13
            r1 = 1
            r0.isStatic = r1
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.SuperBuilder r0 = (lombok.experimental.SuperBuilder) r0
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = r14
            r3 = r12
            r0.init(r1, r2, r3)
            r0 = r13
            java.lang.String r0 = r0.builderMethodName
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L51
            r0 = 0
            r15 = r0
            goto L63
        L51:
            java.lang.String r0 = "builderMethodName"
            r1 = r13
            java.lang.String r1 = r1.builderMethodName
            r2 = r12
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L60
            return
        L60:
            r0 = 1
            r15 = r0
        L63:
            java.lang.String r0 = "buildMethodName"
            r1 = r13
            java.lang.String r1 = r1.buildMethodName
            r2 = r12
            boolean r0 = lombok.core.handlers.HandlerUtil.checkName(r0, r1, r2)
            if (r0 != 0) goto L72
            return
        L72:
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r16 = r0
            r0 = r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.builderFields = r1
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isClass(r0)
            if (r0 != 0) goto L9c
            r0 = r12
            java.lang.String r1 = "@SuperBuilder is only supported on classes."
            r0.addError(r1)
            return
        L9c:
            r0 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto Lab
            r0 = r12
            java.lang.String r1 = "@SuperBuilder is not supported on non-static nested classes."
            r0.addError(r1)
            return
        Lab:
            r0 = r13
            r1 = r16
            r0.parentType = r1
            r0 = r16
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            java.lang.Class<lombok.Value> r0 = lombok.Value.class
            r1 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto Ldd
            java.lang.String r0 = "lombok.experimental.Value"
            r1 = r16
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 != 0) goto Ldd
            r0 = 0
            goto Lde
        Ldd:
            r0 = 1
        Lde:
            r22 = r0
            r0 = r16
            r1 = 1
            java.util.List r0 = lombok.eclipse.handlers.HandleConstructor.findAllFields(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r24 = r0
            goto L268
        Lf0:
            r0 = r24
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r23 = r0
            r0 = r23
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r25 = r0
            java.lang.Class<lombok.Builder$Default> r0 = lombok.Builder.Default.class
            r1 = r23
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findAnnotation(r0, r1)
            r26 = r0
            r0 = r25
            int r0 = r0.modifiers
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L12d
            r0 = r22
            if (r0 == 0) goto L129
            java.lang.Class<lombok.experimental.NonFinal> r0 = lombok.experimental.NonFinal.class
            r1 = r23
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasAnnotation(r0, r1)
            if (r0 == 0) goto L12d
        L129:
            r0 = 0
            goto L12e
        L12d:
            r0 = 1
        L12e:
            r27 = r0
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableAnnotations(r0)
            r28 = r0
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = new lombok.eclipse.handlers.HandleBuilder$BuilderFieldData
            r1 = r0
            r1.<init>()
            r29 = r0
            r0 = r29
            r1 = r23
            java.lang.String r1 = r1.getName()
            char[] r1 = r1.toCharArray()
            r0.rawName = r1
            r0 = r29
            r1 = r23
            char[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.removePrefixFromField(r1)
            r0.name = r1
            r0 = r29
            r1 = r29
            char[] r1 = r1.name
            r0.builderFieldName = r1
            r0 = r29
            r1 = r25
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r2 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r2]
            r3 = r2
            r4 = 0
            r5 = r28
            r3[r4] = r5
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r1, r2)
            r0.annotations = r1
            r0 = r29
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r0.type = r1
            r0 = r29
            r1 = r9
            r2 = r23
            r3 = r11
            r4 = r14
            java.lang.String r4 = r4.setterPrefix()
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.getSingularData(r2, r3, r4)
            r0.singularData = r1
            r0 = r29
            r1 = r23
            r0.originalFieldNode = r1
            r0 = r29
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1b0
            r0 = r26
            if (r0 == 0) goto L1b0
            r0 = r26
            java.lang.String r1 = "@Builder.Default and @Singular cannot be mixed."
            r0.addError(r1)
            r0 = 0
            r26 = r0
        L1b0:
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto L1c8
            r0 = r26
            if (r0 == 0) goto L1c8
            r0 = r26
            java.lang.String r1 = "@Builder.Default requires an initializing expression (' = something;')."
            r0.addWarning(r1)
            r0 = 0
            r26 = r0
        L1c8:
            r0 = r25
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L1f5
            r0 = r26
            if (r0 != 0) goto L1f5
            r0 = r27
            if (r0 == 0) goto L1dd
            goto L268
        L1dd:
            r0 = r19
            if (r0 != 0) goto L1eb
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r19 = r0
        L1eb:
            r0 = r19
            r1 = r23
            boolean r0 = r0.add(r1)
        L1f5:
            r0 = r26
            if (r0 == 0) goto L249
            r0 = r29
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.DEFAULT_PREFIX
            r2 = r29
            char[] r2 = r2.name
            char[] r1 = prefixWith(r1, r2)
            r0.nameOfDefaultProvider = r1
            r0 = r29
            r1 = r29
            char[] r1 = r1.name
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.SET_PREFIX
            char[] r1 = prefixWith(r1, r2)
            r0.nameOfSetFlag = r1
            r0 = r29
            r1 = r29
            char[] r1 = r1.name
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.VALUE_PREFIX
            char[] r1 = prefixWith(r1, r2)
            r0.builderFieldName = r1
            r0 = r29
            char[] r0 = r0.nameOfDefaultProvider
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            r2 = r23
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = lombok.eclipse.handlers.HandleBuilder.generateDefaultProvider(r0, r1, r2, r3)
            r30 = r0
            r0 = r30
            if (r0 == 0) goto L249
            r0 = r16
            r1 = r30
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L249:
            r0 = r9
            r1 = r29
            r2 = r23
            r0.addObtainVia(r1, r2)
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            r1 = r29
            boolean r0 = r0.add(r1)
            r0 = r21
            r1 = r23
            boolean r0 = r0.add(r1)
        L268:
            r0 = r24
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lf0
            r0 = r13
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            if (r1 == 0) goto L284
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            goto L288
        L284:
            r1 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter[r1]
        L288:
            r0.typeParams = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.createBuilderParentTypeReference()
            r17 = r0
            java.lang.String r0 = "C"
            r23 = r0
            java.lang.String r0 = "B"
            r24 = r0
            r0 = r9
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r20
            java.util.Set r0 = r0.gatherUsedTypeNames(r1, r2)
            r25 = r0
            r0 = r9
            r1 = r23
            r2 = r25
            java.lang.String r0 = r0.generateNonclashingNameFor(r1, r2)
            r23 = r0
            r0 = r9
            r1 = r24
            r2 = r25
            java.lang.String r0 = r0.generateNonclashingNameFor(r1, r2)
            r24 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            r1 = 2
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter[r0]
            r26 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            r1 = 0
            r2 = r26
            r3 = 0
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r27
            r1 = r23
            char[] r1 = r1.toCharArray()
            r0.name = r1
            r0 = r27
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.type = r1
            r0 = r26
            r1 = r26
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            r2 = r27
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r1 = r0
            r1.<init>()
            r28 = r0
            r0 = r28
            r1 = r24
            char[] r1 = r1.toCharArray()
            r0.name = r1
            r0 = r28
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.type = r1
            r0 = r26
            r1 = r26
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r28
            r0[r1] = r2
            r0 = r13
            r1 = r13
            r2 = r26
            r3 = r2; r2 = r1; r1 = r3; 
            lombok.eclipse.handlers.HandleSuperBuilder.SuperBuilderJob.access$0(r2, r3)
            r0.builderTypeParams = r1
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.superclass
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r4 = r3
            r5 = r23
            char[] r5 = r5.toCharArray()
            r6 = 0
            r4.<init>(r5, r6)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r3 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r4 = r3
            r5 = r24
            char[] r5 = r5.toCharArray()
            r6 = 0
            r4.<init>(r5, r6)
            r1[r2] = r3
            r29 = r0
            r0 = r27
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L405
            r0 = r27
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            r30 = r0
            r0 = r30
            char[] r0 = r0.getLastToken()
            r31 = r0
            r0 = r12
            r1 = 0
            java.lang.String r0 = lombok.eclipse.handlers.HandleBuilder.BuilderJob.getBuilderClassNameTemplate(r0, r1)
            r32 = r0
            r0 = r13
            r1 = r31
            r2 = r32
            java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
            r33 = r0
            r0 = r30
            char[][] r0 = r0.tokens
            r1 = r30
            char[][] r1 = r1.tokens
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            char[][] r0 = (char[][]) r0
            r34 = r0
            r0 = r34
            r1 = r34
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r33
            char[] r2 = r2.toCharArray()
            r0[r1] = r2
            r0 = r34
            int r0 = r0.length
            long[] r0 = new long[r0]
            r35 = r0
            r0 = r35
            r1 = r13
            long r1 = r1.getPos()
            java.util.Arrays.fill(r0, r1)
            r0 = r9
            r1 = r27
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.getTypeParametersFrom(r1)
            r36 = r0
            r0 = r34
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r37 = r0
            r0 = r37
            r1 = r37
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r9
            r3 = r36
            r4 = r29
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = r2.mergeTypeReferences(r3, r4)
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r34
            r3 = r37
            r4 = 0
            r5 = r35
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
            goto L479
        L405:
            r0 = r27
            if (r0 == 0) goto L479
            r0 = r27
            char[][] r0 = r0.getTypeName()
            r1 = 0
            r0 = r0[r1]
            r30 = r0
            r0 = r12
            r1 = 0
            java.lang.String r0 = lombok.eclipse.handlers.HandleBuilder.BuilderJob.getBuilderClassNameTemplate(r0, r1)
            r31 = r0
            r0 = r13
            r1 = r30
            r2 = r31
            java.lang.String r0 = r0.replaceBuilderClassName(r1, r2)
            r32 = r0
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = r30
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r32
            char[] r3 = r3.toCharArray()
            r1[r2] = r3
            r33 = r0
            r0 = r33
            int r0 = r0.length
            long[] r0 = new long[r0]
            r34 = r0
            r0 = r34
            r1 = r13
            long r1 = r1.getPos()
            java.util.Arrays.fill(r0, r1)
            r0 = r9
            r1 = r27
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.getTypeParametersFrom(r1)
            r35 = r0
            r0 = r33
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r36 = r0
            r0 = r36
            r1 = r36
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r9
            r3 = r35
            r4 = r29
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r2 = r2.mergeTypeReferences(r3, r4)
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            r1 = r0
            r2 = r33
            r3 = r36
            r4 = 0
            r5 = r34
            r1.<init>(r2, r3, r4, r5)
            r28 = r0
        L479:
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r20
            char[] r3 = r3.name
            java.lang.String r2 = r2.replaceBuilderClassName(r3)
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderClassName = r3
            r0.builderAbstractClassName = r1
            r0 = r13
            r1 = r13
            r2 = r13
            java.lang.String r2 = r2.builderAbstractClassName
            char[] r2 = r2.toCharArray()
            r3 = r2; r2 = r1; r1 = r3; 
            r2.builderClassNameArr = r3
            r0.builderAbstractClassNameArr = r1
            r0 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r13
            java.lang.String r3 = r3.builderAbstractClassName
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r2 = "Impl"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.builderImplClassName = r1
            r0 = r13
            r1 = r13
            java.lang.String r1 = r1.builderImplClassName
            char[] r1 = r1.toCharArray()
            r0.builderImplClassNameArr = r1
            r0 = r9
            r1 = r16
            r2 = r13
            java.lang.String r2 = r2.builderClassName
            boolean r0 = r0.constructorExists(r1, r2)
            if (r0 != 0) goto L4e9
            r0 = r9
            r1 = r13
            r2 = r28
            if (r2 == 0) goto L4e5
            r2 = 1
            goto L4e6
        L4e5:
            r2 = 0
        L4e6:
            r0.generateBuilderBasedConstructor(r1, r2)
        L4e9:
            r0 = r13
            r1 = r9
            r2 = r16
            r3 = r13
            java.lang.String r3 = r3.builderClassName
            lombok.eclipse.EclipseNode r1 = r1.findInnerClass(r2, r3)
            r0.builderAbstractType = r1
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderAbstractType
            if (r0 != 0) goto L515
            r0 = r13
            r1 = r9
            r2 = r13
            r3 = r28
            r4 = r23
            r5 = r24
            lombok.eclipse.EclipseNode r1 = r1.generateBuilderAbstractClass(r2, r3, r4, r5)
            r0.builderAbstractType = r1
            goto L597
        L515:
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderAbstractType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r30 = r0
            r0 = r30
            int r0 = r0.modifiers
            r1 = 1032(0x408, float:1.446E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L536
            r0 = r12
            java.lang.String r1 = "Existing Builder must be an abstract static inner class."
            r0.addError(r1)
            return
        L536:
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderAbstractType
            r1 = r12
            lombok.eclipse.handlers.EclipseHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L58d
        L54e:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r31 = r0
            r0 = r31
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            r33 = r0
            r0 = r33
            if (r0 != 0) goto L569
            goto L58d
        L569:
            r0 = r33
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r34 = r0
            r0 = r34
            if (r0 != 0) goto L578
            goto L58d
        L578:
            r0 = r34
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.builderAbstractType
            r2 = r33
            boolean r0 = r0.checkForAlreadyExistingNodesAndGenerateError(r1, r2)
            if (r0 == 0) goto L58d
            r0 = r31
            r1 = 0
            r0.singularData = r1
        L58d:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L54e
        L597:
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r31 = r0
            goto L633
        L5a6:
            r0 = r31
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r30 = r0
            r0 = r30
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L5d9
            r0 = r30
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L5d9
            r0 = r30
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            boolean r0 = r0.requiresCleaning()
            if (r0 == 0) goto L5d9
            r0 = 1
            r18 = r0
            goto L63d
        L5d9:
            r0 = r30
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L633
            r0 = r30
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            r1 = r30
            lombok.Builder$ObtainVia r1 = r1.obtainVia
            java.lang.String r1 = r1.method()
            boolean r1 = r1.isEmpty()
            if (r0 != r1) goto L60a
            r0 = r30
            lombok.eclipse.EclipseNode r0 = r0.obtainViaNode
            java.lang.String r1 = "The syntax is either @ObtainVia(field = \"fieldName\") or @ObtainVia(method = \"methodName\")."
            r0.addError(r1)
            return
        L60a:
            r0 = r30
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L633
            r0 = r30
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L633
            r0 = r30
            lombok.eclipse.EclipseNode r0 = r0.obtainViaNode
            java.lang.String r1 = "@ObtainVia(isStatic = true) is not valid unless 'method' has been set."
            r0.addError(r1)
            return
        L633:
            r0 = r31
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5a6
        L63d:
            r0 = r13
            r0.setBuilderToAbstract()
            r0 = r9
            r1 = r13
            r0.generateBuilderFields(r1)
            r0 = r18
            if (r0 == 0) goto L67c
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleBuilder.CLEAN_FIELD_NAME
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4)
            r30 = r0
            r0 = r30
            r1 = -1
            r0.declarationSourceEnd = r1
            r0 = r30
            r1 = 2
            r0.modifiers = r1
            r0 = r30
            r1 = 5
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.type = r1
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r30
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectFieldAndMarkGenerated(r0, r1)
        L67c:
            r0 = r13
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L6b7
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r9
            r2 = r13
            r3 = r28
            if (r3 == 0) goto L695
            r3 = 1
            goto L696
        L695:
            r3 = 0
        L696:
            r4 = r24
            r5 = r23
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateFillValuesMethod(r2, r3, r4, r5)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r9
            r2 = r13
            r3 = r14
            java.lang.String r3 = r3.setterPrefix()
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateStaticFillValuesMethod(r2, r3)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L6b7:
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r31 = r0
            goto L6e3
        L6c6:
            r0 = r31
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r30 = r0
            r0 = r9
            r1 = r13
            r2 = r30
            r3 = r24
            r4 = r14
            java.lang.String r4 = r4.setterPrefix()
            r0.generateSetterMethodsForBuilder(r1, r2, r3, r4)
        L6e3:
            r0 = r31
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6c6
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r9
            r2 = r13
            r3 = r28
            if (r3 == 0) goto L6fe
            r3 = 1
            goto L6ff
        L6fe:
            r3 = 0
        L6ff:
            r4 = r24
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateAbstractSelfMethod(r2, r3, r4)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            r0 = r13
            r0.setBuilderToAbstract()
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r9
            r2 = r13
            r3 = r28
            if (r3 == 0) goto L71e
            r3 = 1
            goto L71f
        L71e:
            r3 = 0
        L71f:
            r4 = r23
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateAbstractBuildMethod(r2, r3, r4)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            java.lang.String r0 = "toString"
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L7cc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r30 = r0
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L797
        L752:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r31 = r0
            r0 = r31
            java.util.List<lombok.eclipse.EclipseNode> r0 = r0.createdFields
            java.util.Iterator r0 = r0.iterator()
            r34 = r0
            goto L78d
        L76d:
            r0 = r34
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
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
        L78d:
            r0 = r34
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L76d
        L797:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L752
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r30
            r2 = 1
            r3 = r28
            if (r3 == 0) goto L7b2
            r3 = 1
            goto L7b3
        L7b2:
            r3 = 0
        L7b3:
            r4 = r11
            lombok.core.handlers.HandlerUtil$FieldAccess r5 = lombok.core.handlers.HandlerUtil.FieldAccess.ALWAYS_FIELD
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = lombok.eclipse.handlers.HandleToString.createToString(r0, r1, r2, r3, r4, r5)
            r31 = r0
            r0 = r31
            if (r0 == 0) goto L7cc
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r31
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L7cc:
            r0 = r18
            if (r0 == 0) goto L7e5
            r0 = r13
            r0.setBuilderToAbstract()
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r9
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateCleanMethod(r2)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L7e5:
            r0 = r20
            int r0 = r0.modifiers
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L7f5
            r0 = 1
            goto L7f6
        L7f5:
            r0 = 0
        L7f6:
            r30 = r0
            r0 = r30
            if (r0 == 0) goto L7fe
            return
        L7fe:
            r0 = r13
            r1 = r9
            r2 = r16
            r3 = r13
            java.lang.String r3 = r3.builderImplClassName
            lombok.eclipse.EclipseNode r1 = r1.findInnerClass(r2, r3)
            r0.builderImplType = r1
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderImplType
            if (r0 != 0) goto L829
            r0 = r13
            r1 = r9
            r2 = r13
            r3 = r13
            java.lang.String r3 = r3.builderImplClassName
            lombok.eclipse.EclipseNode r1 = r1.generateBuilderImplClass(r2, r3)
            r0.builderImplType = r1
            goto L85e
        L829:
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderImplType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r31 = r0
            r0 = r31
            int r0 = r0.modifiers
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L84d
            r0 = r31
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L855
        L84d:
            r0 = r12
            java.lang.String r1 = "Existing BuilderImpl must be a non-abstract static inner class."
            r0.addError(r1)
            return
        L855:
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderImplType
            r1 = r12
            lombok.eclipse.handlers.EclipseHandlerUtil.sanityCheckForMethodGeneratingAnnotationsOnBuilderClass(r0, r1)
        L85e:
            r0 = r13
            r0.setBuilderToImpl()
            r0 = r13
            boolean r0 = r0.toBuilder
            if (r0 == 0) goto L8a7
            int[] r0 = m75xb87c1847()
            java.lang.String r1 = "toBuilder"
            r2 = r13
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = 0
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r1, r2, r3)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L89b;
                case 2: goto L8a7;
                case 3: goto L898;
                default: goto L8a7;
            }
        L898:
            goto L8a7
        L89b:
            r0 = r16
            r1 = r9
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateToBuilderMethod(r2)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L8a7:
            r0 = r13
            r0.setBuilderToImpl()
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderImplType
            r1 = r9
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateSelfMethod(r2)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            r0 = r13
            java.lang.String r0 = r0.buildMethodName
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.builderImplType
            r2 = -1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto L8e5
            r0 = r13
            r0.setBuilderToImpl()
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.builderImplType
            r1 = r9
            r2 = r13
            r3 = r17
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r1 = r1.generateBuildMethod(r2, r3)
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L8e5:
            r0 = r15
            if (r0 == 0) goto L8fe
            r0 = r13
            java.lang.String r0 = r0.builderMethodName
            r1 = r16
            r2 = -1
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r0 = lombok.eclipse.handlers.EclipseHandlerUtil.methodExists(r0, r1, r2)
            lombok.eclipse.handlers.EclipseHandlerUtil$MemberExistsResult r1 = lombok.eclipse.handlers.EclipseHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L8fe
            r0 = 0
            r15 = r0
        L8fe:
            r0 = r15
            if (r0 == 0) goto L918
            r0 = r9
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.generateBuilderMethod(r1)
            r31 = r0
            r0 = r31
            if (r0 == 0) goto L918
            r0 = r16
            r1 = r31
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
        L918:
            r0 = r19
            if (r0 == 0) goto L94c
            r0 = r15
            if (r0 == 0) goto L94c
            r0 = r19
            java.util.Iterator r0 = r0.iterator()
            r32 = r0
            goto L942
        L92e:
            r0 = r32
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r31 = r0
            r0 = r31
            java.lang.String r1 = "@SuperBuilder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final."
            r0.addWarning(r1)
        L942:
            r0 = r32
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L92e
        L94c:
            return
    }

    private lombok.eclipse.EclipseNode generateBuilderAbstractClass(lombok.eclipse.handlers.HandleBuilder.BuilderJob r9, org.eclipse.jdt.internal.compiler.ast.TypeReference r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r9
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r13 = r0
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            r1 = r0
            r2 = r13
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r14
            r1 = r0
            int r1 = r1.modifiers
            r2 = 1033(0x409, float:1.448E-42)
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r14
            r1 = r9
            char[] r1 = r1.builderClassNameArr
            r0.name = r1
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParams
            int r2 = r2.length
            r3 = 2
            int r2 = r2 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = (org.eclipse.jdt.internal.compiler.ast.TypeParameter[]) r1
            r0.typeParameters = r1
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r11
            char[] r1 = r1.toCharArray()
            r0.name = r1
            r0 = r15
            r1 = r9
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r1, r2)
            r0.type = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            r2 = r15
            r0[r1] = r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r15
            r1 = r12
            char[] r1 = r1.toCharArray()
            r0.name = r1
            r0 = r8
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r11
            r3 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.appendBuilderTypeReferences(r1, r2, r3)
            r16 = r0
            r0 = r15
            r1 = r9
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r9
            char[] r2 = r2.builderClassNameArr
            r3 = 0
            r4 = r16
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r1, r2, r3, r4, r5)
            r0.type = r1
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r15
            r0[r1] = r2
            r0 = r10
            if (r0 == 0) goto Le1
            r0 = r14
            r1 = r10
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1, r2)
            r0.superclass = r1
        Le1:
            r0 = r14
            r1 = 0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = r0.createDefaultConstructor(r1, r2)
            r0 = r14
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r9
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r14
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectType(r0, r1)
            return r0
    }

    private lombok.eclipse.EclipseNode generateBuilderImplClass(lombok.eclipse.handlers.HandleBuilder.BuilderJob r9, java.lang.String r10) {
            r8 = this;
            r0 = r9
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r11 = r0
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            r1 = r0
            r2 = r11
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r12
            r1 = r0
            int r1 = r1.modifiers
            r2 = 26
            r1 = r1 | r2
            r0.modifiers = r1
            r0 = r12
            r1 = r10
            char[] r1 = r1.toCharArray()
            r0.name = r1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            if (r0 == 0) goto L59
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            if (r0 <= 0) goto L59
            r0 = r12
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r0.typeParameters = r1
        L59:
            r0 = r9
            java.lang.String r0 = r0.builderClassName
            if (r0 == 0) goto Ld1
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            r1 = 2
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r13 = r0
            r0 = 0
            r14 = r0
            goto L8c
        L72:
            r0 = r13
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r14
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r14 = r14 + 1
        L8c:
            r0 = r14
            r1 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            int r1 = r1.length
            if (r0 < r1) goto L72
            r0 = r13
            r1 = r13
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            r2 = r9
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = lombok.eclipse.handlers.EclipseHandlerUtil.cloneSelfType(r2, r3)
            r0[r1] = r2
            r0 = r13
            r1 = r13
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r2 = r9
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = r10
            r4 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = createTypeReferenceWithTypeParameters(r2, r3, r4)
            r0[r1] = r2
            r0 = r12
            r1 = r9
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r9
            char[] r2 = r2.builderClassNameArr
            r3 = 0
            r4 = r13
            r5 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r1, r2, r3, r4, r5)
            r0.superclass = r1
        Ld1:
            r0 = r12
            r1 = 0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = r0.createDefaultConstructor(r1, r2)
            r0 = r12
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r9
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r9
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r12
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectType(r0, r1)
            return r0
    }

    private void generateBuilderBasedConstructor(lombok.eclipse.handlers.HandleBuilder.BuilderJob r13, boolean r14) {
            r12 = this;
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r15 = r0
            r0 = r13
            long r0 = r0.getPos()
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            r1 = r0
            r2 = r13
            lombok.eclipse.EclipseNode r2 = r2.parentType
            lombok.core.LombokNode r2 = r2.top()
            lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r2
            org.eclipse.jdt.internal.compiler.CompilationResult r2 = r2.compilationResult
            r1.<init>(r2)
            r18 = r0
            r0 = r18
            lombok.AccessLevel r1 = lombok.AccessLevel.PROTECTED
            int r1 = lombok.eclipse.handlers.EclipseHandlerUtil.toEclipseModifier(r1)
            r0.modifiers = r1
            r0 = r18
            r1 = r15
            char[] r1 = r1.name
            r0.selector = r1
            r0 = r14
            if (r0 == 0) goto L70
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r1 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r2 = r1
            r3 = 2
            r2.<init>(r3)
            r0.constructorCall = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r7 = r16
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            goto L7d
        L70:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r1 = new org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.constructorCall = r1
        L7d:
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r18
            org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r0 = r0.constructorCall
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r18
            r1 = 0
            r0.thrownExceptions = r1
            r0 = r18
            r1 = 0
            r0.typeParameters = r1
            r0 = r18
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r18
            r1 = r18
            r2 = r18
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            int r3 = r3.sourceStart
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceStart = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceStart = r3
            r0.bodyStart = r1
            r0 = r18
            r1 = r18
            r2 = r18
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            int r3 = r3.sourceEnd
            r4 = r3; r3 = r2; r2 = r4; 
            r3.sourceEnd = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.declarationSourceEnd = r3
            r0.bodyEnd = r1
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r19 = r0
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r13
            char[] r1 = r1.builderClassNameArr
            r2 = 0
            r3 = r12
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r19
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3 = r3.mergeToTypeReferences(r4, r5)
            r4 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r0, r1, r2, r3, r4)
            r20 = r0
            r0 = r18
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument r4 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r7 = r16
            r8 = r20
            r9 = 16
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r23 = r0
            goto L300
        L14d:
            r0 = r23
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r22 = r0
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r22
            char[] r2 = r2.rawName
            r3 = r16
            r1.<init>(r2, r3)
            r24 = r0
            r0 = r16
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r25 = r0
            r0 = r16
            int r0 = (int) r0
            r26 = r0
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r2 = r1
            r3 = r25
            r4 = r26
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r22
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L1c9
            r0 = r22
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 == 0) goto L1c9
            r0 = r22
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r22
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.singularData
            r2 = r13
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = r21
            r4 = r22
            char[] r4 = r4.builderFieldName
            java.lang.String r5 = "b"
            r0.appendBuildCode(r1, r2, r3, r4, r5)
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r1 = r0
            r2 = r22
            char[] r2 = r2.builderFieldName
            r3 = r16
            r1.<init>(r2, r3)
            r27 = r0
            goto L1fd
        L1c9:
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            char[] r3 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r22
            char[] r3 = r3.builderFieldName
            r1[r2] = r3
            r28 = r0
            r0 = 2
            long[] r0 = new long[r0]
            r1 = r0
            r2 = 0
            r3 = r16
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r16
            r1[r2] = r3
            r29 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r28
            r3 = r29
            r4 = r25
            r5 = r26
            r1.<init>(r2, r3, r4, r5)
            r27 = r0
        L1fd:
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r24
            r3 = r27
            r4 = r16
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r28 = r0
            r0 = r22
            char[] r0 = r0.nameOfSetFlag
            if (r0 == 0) goto L2c7
            r0 = 2
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            char[] r3 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r22
            char[] r3 = r3.nameOfSetFlag
            r1[r2] = r3
            r29 = r0
            r0 = 2
            long[] r0 = new long[r0]
            r1 = r0
            r2 = 0
            r3 = r16
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r16
            r1[r2] = r3
            r30 = r0
            org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedNameReference
            r1 = r0
            r2 = r29
            r3 = r30
            r4 = r25
            r5 = r26
            r1.<init>(r2, r3, r4, r5)
            r31 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r32 = r0
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceStart
            r0.sourceStart = r1
            r0 = r32
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            int r1 = r1.sourceEnd
            r0.sourceEnd = r1
            r0 = r32
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNameReference(r1, r2)
            r0.receiver = r1
            r0 = r32
            r1 = r22
            char[] r1 = r1.nameOfDefaultProvider
            r0.selector = r1
            r0 = r32
            r1 = r12
            r2 = r13
            lombok.eclipse.EclipseNode r2 = r2.parentType
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParameters
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.typeParameterNames(r2)
            r0.typeArguments = r1
            org.eclipse.jdt.internal.compiler.ast.Assignment r0 = new org.eclipse.jdt.internal.compiler.ast.Assignment
            r1 = r0
            r2 = r24
            r3 = r32
            r4 = r16
            int r4 = (int) r4
            r1.<init>(r2, r3, r4)
            r33 = r0
            org.eclipse.jdt.internal.compiler.ast.IfStatement r0 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
            r1 = r0
            r2 = r31
            r3 = r28
            r4 = r33
            r5 = r25
            r6 = r26
            r1.<init>(r2, r3, r4, r5, r6)
            r34 = r0
            r0 = r21
            r1 = r34
            boolean r0 = r0.add(r1)
            goto L2d1
        L2c7:
            r0 = r21
            r1 = r28
            boolean r0 = r0.add(r1)
        L2d1:
            r0 = r22
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.hasNonNullAnnotations(r0)
            if (r0 == 0) goto L300
            r0 = r22
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.sourceNode
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2)
            r29 = r0
            r0 = r29
            if (r0 == 0) goto L300
            r0 = r21
            r1 = r29
            boolean r0 = r0.add(r1)
        L300:
            r0 = r23
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14d
            r0 = r18
            r1 = r21
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L31a
            r1 = 0
            goto L328
        L31a:
            r1 = r21
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        L328:
            r0.statements = r1
            r0 = r13
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L34b
            r0 = r18
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r4 = r4.source
            java.lang.String r5 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
        L34b:
            r0 = r18
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = r15
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r18
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            return
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateBuilderMethod(lombok.eclipse.handlers.HandleSuperBuilder.SuperBuilderJob r11) {
            r10 = this;
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r12
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 | r1
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
            r1 = 9
            r0.modifiers = r1
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            if (r0 == 0) goto L5f
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            if (r0 <= 0) goto L5f
            r0 = r16
            r1 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r0.typeParameters = r1
        L5f:
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r17 = r0
            r0 = r16
            r1 = r11
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r11
            char[] r2 = r2.builderAbstractClassNameArr
            r3 = 0
            r4 = r10
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r5 = r5.typeParams
            r6 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r4 = r4.mergeToTypeReferences(r5, r6)
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r1, r2, r3, r4, r5)
            r0.returnType = r1
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto Ld8
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r18 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r18
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
        Ld8:
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r11
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r11
            char[] r2 = r2.builderImplClassNameArr
            r3 = 0
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r0.type = r1
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
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L12f
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
        L12f:
            r0 = r11
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r16
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r16
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
            r0 = r16
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateToBuilderMethod(lombok.eclipse.handlers.HandleSuperBuilder.SuperBuilderJob r11) {
            r10 = this;
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceStart
            r12 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            int r0 = r0.sourceEnd
            r13 = r0
            r0 = r12
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r13
            long r1 = (long) r1
            long r0 = r0 | r1
            r14 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r16 = r0
            r0 = r16
            char[] r1 = lombok.eclipse.handlers.HandleBuilder.TO_BUILDER_METHOD_NAME
            r0.selector = r1
            r0 = r16
            r1 = 1
            r0.modifiers = r1
            r0 = r16
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r17 = r0
            r0 = r16
            r1 = r11
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r11
            char[] r2 = r2.builderAbstractClassNameArr
            r3 = 0
            r4 = r10
            r5 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r5 = r5.typeParams
            r6 = r17
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r4 = r4.mergeToTypeReferences(r5, r6)
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r1, r2, r3, r4, r5)
            r0.returnType = r1
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateUnique()
            if (r0 == 0) goto Lb4
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            char[][] r0 = r0.getTypeName()
            int r0 = r0.length
            r18 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r0.annotations = r1
            r0 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.Annotation[][] r0 = r0.annotations
            r1 = r18
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
        Lb4:
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r18 = r0
            r0 = r18
            r1 = r11
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r11
            char[] r2 = r2.builderImplClassNameArr
            r3 = 0
            r4 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3, r4, r5)
            r0.type = r1
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r18
            r0.receiver = r1
            r0 = r19
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_METHOD_NAME
            r0.selector = r1
            r0 = r19
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
            r0 = r16
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            r6 = r19
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
            r0 = r11
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L138
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
        L138:
            r0 = r11
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r16
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r16
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
            r0 = r16
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateFillValuesMethod(lombok.eclipse.handlers.HandleSuperBuilder.SuperBuilderJob r13, boolean r14, java.lang.String r15, java.lang.String r16) {
            r12 = this;
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r17 = r0
            r0 = r17
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_METHOD_NAME
            r0.selector = r1
            r0 = r17
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r17
            r1 = 4
            r0.modifiers = r1
            r0 = r14
            if (r0 == 0) goto L41
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            char[][] r4 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r5 = r13
            lombok.eclipse.EclipseNode r5 = r5.parentType
            java.lang.Object r5 = r5.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r5 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r5
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r4, r5)
            r2[r3] = r4
            r0.annotations = r1
        L41:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r15
            char[] r3 = r3.toCharArray()
            r4 = 0
            r2.<init>(r3, r4)
            r0.returnType = r1
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            r2 = r16
            char[] r2 = r2.toCharArray()
            r3 = 0
            r1.<init>(r2, r3)
            r18 = r0
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument r4 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r7 = 0
            r8 = r18
            r9 = 16
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r0.arguments = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r14
            if (r0 == 0) goto Lc9
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            org.eclipse.jdt.internal.compiler.ast.SuperReference r1 = new org.eclipse.jdt.internal.compiler.ast.SuperReference
            r2 = r1
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r20
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_METHOD_NAME
            r0.selector = r1
            r0 = r20
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r19
            r1 = r20
            boolean r0 = r0.add(r1)
        Lc9:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r20
            r1 = r13
            lombok.eclipse.EclipseNode r1 = r1.parentType
            r2 = r13
            char[] r2 = r2.builderAbstractClassNameArr
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNameReference(r1, r2, r3)
            r0.receiver = r1
            r0 = r20
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_STATIC_METHOD_NAME
            r0.selector = r1
            r0 = r20
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            org.eclipse.jdt.internal.compiler.ast.ThisReference r4 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r5 = r4
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
            r0 = r19
            r1 = r20
            boolean r0 = r0.add(r1)
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.ThisReference r1 = org.eclipse.jdt.internal.compiler.ast.ThisReference.implicitThis()
            r0.receiver = r1
            r0 = r21
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.SELF_METHOD_NAME
            r0.selector = r1
            r0 = r19
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r1 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r2 = r1
            r3 = r21
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r17
            r1 = r19
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L154
            r1 = 0
            goto L162
        L154:
            r1 = r19
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        L162:
            r0.statements = r1
            r0 = r17
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateStaticFillValuesMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r13, java.lang.String r14) {
            r12 = this;
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r15 = r0
            r0 = r15
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.FILL_VALUES_STATIC_METHOD_NAME
            r0.selector = r1
            r0 = r15
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r15
            r1 = 10
            r0.modifiers = r1
            r0 = r15
            r1 = 6
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = org.eclipse.jdt.internal.compiler.ast.TypeReference.baseTypeReference(r1, r2)
            r0.returnType = r1
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.eclipse.jdt.internal.compiler.ast.Wildcard r3 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
            r4 = r3
            r5 = 0
            r4.<init>(r5)
            r1[r2] = r3
            r16 = r0
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r13
            char[] r1 = r1.builderClassNameArr
            r2 = 0
            r3 = r12
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r16
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3 = r3.mergeToTypeReferences(r4, r5)
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r0, r1, r2, r3, r4)
            r17 = r0
            org.eclipse.jdt.internal.compiler.ast.Argument r0 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r1 = r0
            char[] r2 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r3 = 0
            r4 = r17
            r5 = 16
            r1.<init>(r2, r3, r4, r5)
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            if (r0 <= 0) goto Lad
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r19 = r0
            r0 = 0
            r20 = r0
            goto La3
        L89:
            r0 = r19
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r4 = r4.typeParams
            r5 = r20
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r20 = r20 + 1
        La3:
            r0 = r20
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            int r1 = r1.length
            if (r0 < r1) goto L89
        Lad:
            r0 = r13
            long r0 = r0.getPos()
            r20 = r0
            r0 = r19
            if (r0 != 0) goto Lc4
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateTypeReference(r0, r1)
            goto Lcf
        Lc4:
            r0 = r13
            lombok.eclipse.EclipseNode r0 = r0.parentType
            r1 = r19
            r2 = r20
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r0, r1, r2)
        Lcf:
            r22 = r0
            r0 = r15
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.Argument r4 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r7 = 0
            r8 = r22
            r9 = 16
            r5.<init>(r6, r7, r8, r9)
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r18
            r2[r3] = r4
            r0.arguments = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParams
            int r0 = r0.length
            if (r0 <= 0) goto L107
            r0 = r15
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParams
            r2 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyTypeParams(r1, r2)
            r0.typeParameters = r1
        L107:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r13
            java.util.List<lombok.eclipse.handlers.HandleBuilder$BuilderFieldData> r0 = r0.builderFields
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L145
        L11e:
            r0 = r25
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.HandleBuilder$BuilderFieldData r0 = (lombok.eclipse.handlers.HandleBuilder.BuilderFieldData) r0
            r24 = r0
            r0 = r12
            r1 = r24
            r2 = r13
            lombok.eclipse.EclipseNode r2 = r2.parentType
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r4 = r14
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = r0.createSetterCallWithInstanceValue(r1, r2, r3, r4)
            r26 = r0
            r0 = r23
            r1 = r26
            boolean r0 = r0.add(r1)
        L145:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11e
            r0 = r15
            r1 = r23
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15e
            r1 = 0
            goto L16c
        L15e:
            r1 = r23
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        L16c:
            r0.statements = r1
            r0 = r15
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r13
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r15
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MessageSend createSetterCallWithInstanceValue(lombok.eclipse.handlers.HandleBuilder.BuilderFieldData r12, lombok.eclipse.EclipseNode r13, org.eclipse.jdt.internal.compiler.ast.ASTNode r14, java.lang.String r15) {
            r11 = this;
            r0 = r13
            r1 = r15
            r2 = r12
            char[] r2 = r2.name
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            char[] r0 = r0.toCharArray()
            r16 = r0
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 2
        L27:
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = new org.eclipse.jdt.internal.compiler.ast.Expression[r0]
            r18 = r0
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 == 0) goto L42
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L95
        L42:
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            if (r0 != 0) goto L50
            r0 = r12
            char[] r0 = r0.rawName
            goto L5c
        L50:
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.field()
            char[] r0 = r0.toCharArray()
        L5c:
            r19 = r0
            r0 = 0
            r20 = r0
            goto L8a
        L64:
            org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
            r1 = r0
            r2 = r19
            r3 = 0
            r1.<init>(r2, r3)
            r21 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r18
            r1 = r20
            r2 = r21
            r0[r1] = r2
            int r20 = r20 + 1
        L8a:
            r0 = r20
            r1 = r18
            int r1 = r1.length
            if (r0 < r1) goto L64
            goto L10f
        L95:
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            java.lang.String r0 = r0.method()
            r19 = r0
            r0 = r12
            lombok.Builder$ObtainVia r0 = r0.obtainVia
            boolean r0 = r0.isStatic()
            r20 = r0
            r0 = 0
            r21 = r0
            goto L107
        Lb1:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r22 = r0
            r0 = r22
            r1 = r20
            if (r1 == 0) goto Lc9
            r1 = r13
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNameReference(r1, r2)
            goto Ld4
        Lc9:
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r4 = 0
            r2.<init>(r3, r4)
        Ld4:
            r0.receiver = r1
            r0 = r22
            r1 = r19
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r20
            if (r0 == 0) goto Lfd
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r4 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r5 = r4
            char[] r6 = lombok.eclipse.handlers.HandleSuperBuilder.INSTANCE_VARIABLE_NAME
            r7 = 0
            r5.<init>(r6, r7)
            r2[r3] = r4
            r0.arguments = r1
        Lfd:
            r0 = r18
            r1 = r21
            r2 = r22
            r0[r1] = r2
            int r21 = r21 + 1
        L107:
            r0 = r21
            r1 = r18
            int r1 = r1.length
            if (r0 < r1) goto Lb1
        L10f:
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 != 0) goto L120
            r0 = r17
            r1 = r18
            r0.arguments = r1
            goto L16c
        L120:
            org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
            r1 = r0
            r2 = r18
            r3 = 0
            r2 = r2[r3]
            org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
            r4 = r3
            r5 = 0
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 18
            r1.<init>(r2, r3, r4)
            r19 = r0
            r0 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r1 = r1.singularData
            java.lang.String r1 = r1.getTargetFqn()
            r2 = r12
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r13
            r4 = r14
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = r0.getEmptyExpression(r1, r2, r3, r4)
            r20 = r0
            r0 = r17
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r4 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            r5 = r4
            r6 = r19
            r7 = r20
            r8 = r18
            r9 = 1
            r8 = r8[r9]
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.arguments = r1
        L16c:
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r2 = r1
            char[] r3 = lombok.eclipse.handlers.HandleSuperBuilder.BUILDER_VARIABLE_NAME
            r4 = 0
            r2.<init>(r3, r4)
            r0.receiver = r1
            r0 = r17
            r1 = r16
            r0.selector = r1
            r0 = r17
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateAbstractSelfMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r8, boolean r9, java.lang.String r10) {
            r7 = this;
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r11 = r0
            r0 = r11
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.SELF_METHOD_NAME
            r0.selector = r1
            r0 = r11
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            r1 = 16778244(0x1000404, float:2.3512768E-38)
            r0.modifiers = r1
            r0 = r9
            if (r0 == 0) goto L3a
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r8
            lombok.eclipse.EclipseNode r1 = r1.parentType
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r12 = r0
            r0 = r8
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L5a
            r0 = r8
            lombok.eclipse.EclipseNode r0 = r0.parentType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            java.lang.String r1 = "org.checkerframework.dataflow.qual.Pure"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r0, r1)
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L7d
            r0 = r13
            if (r0 == 0) goto L7d
            r0 = r11
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r13
            r2[r3] = r4
            r0.annotations = r1
            goto La6
        L7d:
            r0 = r12
            if (r0 == 0) goto L93
            r0 = r11
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            r0.annotations = r1
            goto La6
        L93:
            r0 = r13
            if (r0 == 0) goto La6
            r0 = r11
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r13
            r2[r3] = r4
            r0.annotations = r1
        La6:
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r10
            char[] r3 = r3.toCharArray()
            r4 = 0
            r2.<init>(r3, r4)
            r0.returnType = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r8
            lombok.eclipse.EclipseNode r1 = r1.parentType
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            r2 = r8
            lombok.core.configuration.CheckerFrameworkVersion r2 = r2.checkerFramework
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r11
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateSelfMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r12) {
            r11 = this;
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r13 = r0
            r0 = r13
            char[] r1 = lombok.eclipse.handlers.HandleSuperBuilder.SELF_METHOD_NAME
            r0.selector = r1
            r0 = r13
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r13
            r1 = 4
            r0.modifiers = r1
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r12
            lombok.eclipse.EclipseNode r1 = r1.builderType
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            r14 = r0
            r0 = r12
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generatePure()
            if (r0 == 0) goto L4b
            r0 = r12
            lombok.eclipse.EclipseNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            java.lang.String r1 = "org.checkerframework.dataflow.qual.Pure"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r0, r1)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L67
            r0 = r13
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r15
            r2[r3] = r4
            r0.annotations = r1
            goto L73
        L67:
            r0 = r13
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            r2[r3] = r4
            r0.annotations = r1
        L73:
            r0 = r13
            r1 = r12
            lombok.eclipse.EclipseNode r1 = r1.builderType
            r2 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r2 = r2.typeParams
            r3 = r12
            long r3 = r3.getPos()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.namePlusTypeParamsToTypeReference(r1, r2, r3)
            r0.returnType = r1
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            r1 = r12
            lombok.eclipse.EclipseNode r1 = r1.parentType
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            r2 = r12
            lombok.core.configuration.CheckerFrameworkVersion r2 = r2.checkerFramework
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r13
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r4 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r5 = r4
            org.eclipse.jdt.internal.compiler.ast.ThisReference r6 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
            r7 = r6
            r8 = 0
            r9 = 0
            r7.<init>(r8, r9)
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8)
            r2[r3] = r4
            r0.statements = r1
            r0 = r13
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateAbstractBuildMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r8, boolean r9, java.lang.String r10) {
            r7 = this;
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r11 = r0
            r0 = r11
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            r1 = 16778241(0x1000401, float:2.351276E-38)
            r0.modifiers = r1
            r0 = r11
            r1 = r8
            java.lang.String r1 = r1.buildMethodName
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r11
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r10
            char[] r3 = r3.toCharArray()
            r4 = 0
            r2.<init>(r3, r4)
            r0.returnType = r1
            r0 = r9
            if (r0 == 0) goto L56
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            goto L57
        L56:
            r0 = 0
        L57:
            r12 = r0
            r0 = r8
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L70
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            java.lang.String r1 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r0, r1)
            goto L71
        L70:
            r0 = 0
        L71:
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L93
            r0 = r13
            if (r0 == 0) goto L93
            r0 = r11
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r13
            r2[r3] = r4
            r0.annotations = r1
            goto Lbc
        L93:
            r0 = r12
            if (r0 == 0) goto La9
            r0 = r11
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            r0.annotations = r1
            goto Lbc
        La9:
            r0 = r13
            if (r0 == 0) goto Lbc
            r0 = r11
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r13
            r2[r3] = r4
            r0.annotations = r1
        Lbc:
            r0 = r11
            r1 = r8
            org.eclipse.jdt.internal.compiler.ast.Receiver r1 = lombok.eclipse.handlers.HandleBuilder.generateBuildReceiver(r1)
            r0.receiver = r1
            r0 = r11
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r11
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.MethodDeclaration generateBuildMethod(lombok.eclipse.handlers.HandleBuilder.BuilderJob r10, org.eclipse.jdt.internal.compiler.ast.TypeReference r11) {
            r9 = this;
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = r0.createNewMethodDeclaration()
            r12 = r0
            r0 = r12
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r12
            r1 = 1
            r0.modifiers = r1
            r0 = r12
            r1 = r10
            java.lang.String r1 = r1.buildMethodName
            char[] r1 = r1.toCharArray()
            r0.selector = r1
            r0 = r12
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r12
            r1 = r11
            r0.returnType = r1
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OVERRIDE
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeMarkerAnnotation(r0, r1)
            r14 = r0
            r0 = r10
            lombok.core.configuration.CheckerFrameworkVersion r0 = r0.checkerFramework
            boolean r0 = r0.generateSideEffectFree()
            if (r0 == 0) goto L5e
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
            java.lang.String r1 = "org.checkerframework.dataflow.qual.SideEffectFree"
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNamedAnnotation(r0, r1)
            goto L5f
        L5e:
            r0 = 0
        L5f:
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L7b
            r0 = r12
            r1 = 2
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r15
            r2[r3] = r4
            r0.annotations = r1
            goto L88
        L7b:
            r0 = r12
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r14
            r2[r3] = r4
            r0.annotations = r1
        L88:
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
            r0.type = r1
            r0 = r16
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
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r1 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r2 = r1
            r3 = r16
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            r0 = r12
            r1 = r13
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld4
            r1 = 0
            goto Le2
        Ld4:
            r1 = r13
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
        Le2:
            r0.statements = r1
            r0 = r12
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.Receiver r1 = lombok.eclipse.handlers.HandleBuilder.generateBuildReceiver(r1)
            r0.receiver = r1
            r0 = r10
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r12
            lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            r0 = r12
            lombok.eclipse.handlers.SetGeneratedByVisitor r1 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r2 = r1
            r3 = r10
            org.eclipse.jdt.internal.compiler.ast.ASTNode r3 = r3.source
            r2.<init>(r3)
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r12
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

    private void generateBuilderFields(lombok.eclipse.handlers.HandleBuilder.BuilderJob r7) {
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

    private void generateSetterMethodsForBuilder(lombok.eclipse.handlers.HandleBuilder.BuilderJob r13, lombok.eclipse.handlers.HandleBuilder.BuilderFieldData r14, java.lang.String r15, java.lang.String r16) {
            r12 = this;
            r0 = r14
            lombok.eclipse.EclipseNode r0 = r0.originalFieldNode
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isFieldDeprecated(r0)
            r17 = r0
            lombok.eclipse.handlers.HandleSuperBuilder$1 r0 = new lombok.eclipse.handlers.HandleSuperBuilder$1
            r1 = r0
            r2 = r12
            r3 = r15
            r1.<init>(r2, r3)
            r18 = r0
            lombok.eclipse.handlers.HandleSuperBuilder$2 r0 = new lombok.eclipse.handlers.HandleSuperBuilder$2
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r19 = r0
            r0 = r14
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            if (r0 == 0) goto L2f
            r0 = r14
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            if (r0 != 0) goto L66
        L2f:
            r0 = r12
            r1 = r13
            r2 = r17
            r3 = r14
            java.util.List<lombok.eclipse.EclipseNode> r3 = r3.createdFields
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            lombok.eclipse.EclipseNode r3 = (lombok.eclipse.EclipseNode) r3
            r4 = r14
            char[] r4 = r4.name
            r5 = r14
            char[] r5 = r5.nameOfSetFlag
            r6 = r18
            org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.make()
            r7 = r19
            org.eclipse.jdt.internal.compiler.ast.Statement r7 = r7.mo246make()
            r8 = r14
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r8 = r8.annotations
            r9 = r14
            lombok.eclipse.EclipseNode r9 = r9.originalFieldNode
            r10 = r16
            r0.generateSimpleSetterMethodForBuilder(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L86
        L66:
            r0 = r14
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r0 = r0.singularData
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.getSingularizer()
            r1 = r13
            lombok.core.configuration.CheckerFrameworkVersion r1 = r1.checkerFramework
            r2 = r14
            lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData r2 = r2.singularData
            r3 = r17
            r4 = r13
            lombok.eclipse.EclipseNode r4 = r4.builderType
            r5 = 1
            r6 = r18
            r7 = r19
            lombok.AccessLevel r8 = lombok.AccessLevel.PUBLIC
            r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
        L86:
            return
    }

    private void generateSimpleSetterMethodForBuilder(lombok.eclipse.handlers.HandleBuilder.BuilderJob r18, boolean r19, lombok.eclipse.EclipseNode r20, char[] r21, char[] r22, org.eclipse.jdt.internal.compiler.ast.TypeReference r23, org.eclipse.jdt.internal.compiler.ast.Statement r24, org.eclipse.jdt.internal.compiler.ast.Annotation[] r25, lombok.eclipse.EclipseNode r26, java.lang.String r27) {
            r17 = this;
            r0 = r18
            lombok.eclipse.EclipseNode r0 = r0.builderType
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r28 = r0
            r0 = r28
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r29 = r0
            r0 = r29
            if (r0 != 0) goto L1d
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = lombok.eclipse.handlers.HandleBuilder.EMPTY_METHODS
            r29 = r0
        L1d:
            r0 = r29
            int r0 = r0.length
            r30 = r0
            r0 = r18
            lombok.eclipse.EclipseNode r0 = r0.sourceNode
            r1 = r27
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r21
            r3.<init>(r4)
            java.lang.String r0 = lombok.core.handlers.HandlerUtil.buildAccessorName(r0, r1, r2)
            r31 = r0
            r0 = 0
            r32 = r0
            goto L71
        L3c:
            r0 = r29
            r1 = r32
            r0 = r0[r1]
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto L4a
            goto L6e
        L4a:
            r0 = r29
            r1 = r32
            r0 = r0[r1]
            char[] r0 = r0.selector
            r33 = r0
            r0 = r31
            char[] r0 = r0.toCharArray()
            r1 = r33
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L6e
            r0 = r20
            r1 = r29
            r2 = r32
            r1 = r1[r2]
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isTolerate(r0, r1)
            if (r0 != 0) goto L6e
            return
        L6e:
            int r32 = r32 + 1
        L71:
            r0 = r32
            r1 = r30
            if (r0 < r1) goto L3c
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.findCopyableToSetterAnnotations(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r32 = r0
            r0 = r23
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.source
            r2 = r18
            lombok.core.configuration.CheckerFrameworkVersion r2 = r2.checkerFramework
            lombok.eclipse.handlers.EclipseHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2)
            r0 = r28
            r1 = r19
            r2 = r20
            r3 = r31
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = 1
            r9 = r18
            lombok.eclipse.EclipseNode r9 = r9.sourceNode
            r10 = r32
            r11 = r25
            if (r11 == 0) goto Lbf
            r11 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r11 = r11.source
            r12 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r12 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r12]
            r13 = r12
            r14 = 0
            r15 = r25
            r13[r14] = r15
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r11 = lombok.eclipse.handlers.EclipseHandlerUtil.copyAnnotations(r11, r12)
            java.util.List r11 = java.util.Arrays.asList(r11)
            goto Lc2
        Lbf:
            java.util.List r11 = java.util.Collections.emptyList()
        Lc2:
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = lombok.eclipse.handlers.HandleSetter.createSetter(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r33 = r0
            r0 = r18
            lombok.eclipse.EclipseNode r0 = r0.builderType
            r1 = r33
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
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

    private java.util.Set<java.lang.String> gatherUsedTypeNames(org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r5, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L29
        L15:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r7
            r1 = r8
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            int r9 = r9 + 1
        L29:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L15
            r0 = r7
            r1 = r6
            char[] r1 = r1.name
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 == 0) goto L79
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L72
        L53:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Initializer
            if (r0 == 0) goto L65
            goto L6f
        L65:
            r0 = r4
            r1 = r7
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r0.addFirstToken(r1, r2)
        L6f:
            int r9 = r9 + 1
        L72:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L53
        L79:
            r0 = r4
            r1 = r7
            r2 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.superclass
            r0.addFirstToken(r1, r2)
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.superInterfaces
            if (r0 == 0) goto Lb1
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.superInterfaces
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto Laa
        L99:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r7
            r2 = r8
            r0.addFirstToken(r1, r2)
            int r9 = r9 + 1
        Laa:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L99
        Lb1:
            r0 = r7
            return r0
    }

    private void addFirstToken(java.util.Set<java.lang.String> r5, org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r6
            char[][] r0 = r0.getTypeName()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r7
            int r0 = r0.length
            r1 = 1
            if (r0 < r1) goto L21
            r0 = r5
            r1 = r7
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.add(r1)
        L21:
            return
    }

    private java.lang.String generateNonclashingNameFor(java.lang.String r6, java.util.Set<java.lang.String> r7) {
            r5 = this;
            r0 = r7
            r1 = r6
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lc
            r0 = r6
            return r0
        Lc:
            r0 = 2
            r8 = r0
            goto L14
        L11:
            int r8 = r8 + 1
        L14:
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
            if (r0 != 0) goto L11
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

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] appendBuilderTypeReferences(org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            r0 = 2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r12 = r0
            r0 = r12
            r1 = r12
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r10
            char[] r4 = r4.toCharArray()
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = r12
            r1 = r12
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r11
            char[] r4 = r4.toCharArray()
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r2 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.mergeToTypeReferences(r1, r2)
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] getTypeParametersFrom(org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
            if (r0 == 0) goto L14
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference) r0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[][] r0 = r0.typeArguments
            r7 = r0
            goto L2a
        L14:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
            if (r0 == 0) goto L2a
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r3 = (org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference) r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r3 = r3.typeArguments
            r1[r2] = r3
            r7 = r0
        L2a:
            r0 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L3f
            r0 = r7
            int r0 = r0.length
            if (r0 <= 0) goto L3f
            r0 = r7
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r8 = r0
        L3f:
            r0 = r8
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.TypeReference createTypeReferenceWithTypeParameters(lombok.eclipse.EclipseNode r8, java.lang.String r9, org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r10) {
            r0 = r10
            int r0 = r0.length
            if (r0 <= 0) goto L3a
            r0 = r10
            int r0 = r0.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r11 = r0
            r0 = 0
            r12 = r0
            goto L27
        L11:
            r0 = r11
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r10
            r5 = r12
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r12 = r12 + 1
        L27:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 < r1) goto L11
            r0 = r8
            r1 = r9
            char[] r1 = r1.toCharArray()
            r2 = 0
            r3 = r11
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateParameterizedTypeReference(r0, r1, r2, r3, r4)
            return r0
        L3a:
            r0 = r8
            r1 = r9
            char[] r1 = r1.toCharArray()
            r2 = 0
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateTypeReference(r0, r1, r2, r3)
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] mergeToTypeReferences(org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r9, org.eclipse.jdt.internal.compiler.ast.TypeReference[] r10) {
            r8 = this;
            r0 = r9
            int r0 = r0.length
            r1 = r10
            int r1 = r1.length
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r11 = r0
            r0 = 0
            r12 = r0
            goto L25
        Lf:
            r0 = r11
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r9
            r5 = r12
            r4 = r4[r5]
            char[] r4 = r4.name
            r5 = 0
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r12 = r12 + 1
        L25:
            r0 = r12
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto Lf
            r0 = 0
            r12 = r0
            goto L40
        L32:
            r0 = r11
            r1 = r9
            int r1 = r1.length
            r2 = r12
            int r1 = r1 + r2
            r2 = r10
            r3 = r12
            r2 = r2[r3]
            r0[r1] = r2
            int r12 = r12 + 1
        L40:
            r0 = r12
            r1 = r10
            int r1 = r1.length
            if (r0 < r1) goto L32
            r0 = r11
            return r0
    }

    private org.eclipse.jdt.internal.compiler.ast.TypeReference[] mergeTypeReferences(org.eclipse.jdt.internal.compiler.ast.TypeReference[] r6, org.eclipse.jdt.internal.compiler.ast.TypeReference[] r7) {
            r5 = this;
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
            r8 = r0
            r0 = 0
            r9 = r0
            goto L1a
        Lf:
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            int r9 = r9 + 1
        L1a:
            r0 = r9
            r1 = r6
            int r1 = r1.length
            if (r0 < r1) goto Lf
            r0 = 0
            r9 = r0
            goto L35
        L27:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            r2 = r9
            int r1 = r1 + r2
            r2 = r7
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            int r9 = r9 + 1
        L35:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 < r1) goto L27
            r0 = r8
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

    private lombok.eclipse.EclipseNode findInnerClass(lombok.eclipse.EclipseNode r4, java.lang.String r5) {
            r3 = this;
            r0 = r5
            char[] r0 = r0.toCharArray()
            r6 = r0
            r0 = r4
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto L44
        L11:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L2b
            goto L44
        L2b:
            r0 = r7
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r9 = r0
            r0 = r9
            char[] r0 = r0.name
            r1 = r6
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L44
            r0 = r7
            return r0
        L44:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L11
            r0 = 0
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

    private boolean constructorExists(lombok.eclipse.EclipseNode r4, java.lang.String r5) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L9e
            r0 = r4
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L9e
            r0 = r4
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r6 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L9e
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto L97
        L2d:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
            if (r0 == 0) goto L94
            r0 = r7
            int r0 = r0.bits
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L4b
            goto L94
        L4b:
            r0 = r7
            boolean r0 = r0.isConstructor()
            if (r0 != 0) goto L56
            goto L94
        L56:
            r0 = r4
            r1 = r7
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.isTolerate(r0, r1)
            if (r0 == 0) goto L62
            goto L94
        L62:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 == 0) goto L94
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            int r0 = r0.length
            r1 = 1
            if (r0 == r1) goto L77
            goto L94
        L77:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = 0
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            char[] r0 = r0.getLastToken()
            r11 = r0
            r0 = r5
            r1 = r11
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L94
            r0 = 1
            return r0
        L94:
            int r8 = r8 + 1
        L97:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L2d
        L9e:
            r0 = 0
            return r0
    }

    /* renamed from: $SWITCH_TABLE$lombok$eclipse$handlers$EclipseHandlerUtil$MemberExistsResult */
    static /* synthetic */ int[] m75xb87c1847() {
            int[] r0 = lombok.eclipse.handlers.HandleSuperBuilder.f579xb87c1847
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
            lombok.eclipse.handlers.HandleSuperBuilder.f579xb87c1847 = r1
            return r0
    }

    static /* synthetic */ char[] access$1() {
            char[] r0 = lombok.eclipse.handlers.HandleSuperBuilder.SELF_METHOD_NAME
            return r0
    }
}
