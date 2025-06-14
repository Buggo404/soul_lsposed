package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseSingularsRecipes.SCL.lombok */
public class EclipseSingularsRecipes {
    private static final lombok.eclipse.handlers.EclipseSingularsRecipes INSTANCE = null;
    private final java.util.Map<java.lang.String, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer> singularizers;
    private final lombok.core.TypeLibrary singularizableTypes;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseSingularsRecipes$EclipseSingularizer.SCL.lombok */
    public static abstract class EclipseSingularizer {
        protected static final long[] NULL_POSS = null;
        private static final char[] SIZE_TEXT = null;
        private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;



        static {
                r0 = 1
                long[] r0 = new long[r0]
                lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS = r0
                r0 = 4
                char[] r0 = new char[r0]
                r1 = r0
                r2 = 0
                r3 = 115(0x73, float:1.61E-43)
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = 105(0x69, float:1.47E-43)
                r1[r2] = r3
                r1 = r0
                r2 = 2
                r3 = 122(0x7a, float:1.71E-43)
                r1[r2] = r3
                r1 = r0
                r2 = 3
                r3 = 101(0x65, float:1.42E-43)
                r1[r2] = r3
                lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.SIZE_TEXT = r0
                return
        }

        public EclipseSingularizer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public abstract lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes();

        public boolean checkForAlreadyExistingNodesAndGenerateError(lombok.eclipse.EclipseNode r5, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r6) {
                r4 = this;
                r0 = r5
                lombok.core.LombokImmutableList r0 = r0.down()
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
                goto Lfb
            Lc:
                r0 = r8
                java.lang.Object r0 = r0.next()
                lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
                r7 = r0
                int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
                r1 = r7
                lombok.core.AST$Kind r1 = r1.getKind()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 3: goto L3c;
                    case 4: goto Lfb;
                    case 5: goto L9d;
                    default: goto Lfb;
                }
            L3c:
                r0 = r7
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
                r9 = r0
                r0 = r9
                char[] r0 = r0.name
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L54
                goto Lfb
            L54:
                r0 = r9
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getGeneratedBy(r0)
                if (r0 == 0) goto L5f
                goto Lfb
            L5f:
                r0 = r4
                r1 = r6
                r2 = r5
                java.util.List r0 = r0.listFieldsToBeGenerated(r1, r2)
                java.util.Iterator r0 = r0.iterator()
                r12 = r0
                goto L90
            L6f:
                r0 = r12
                java.lang.Object r0 = r0.next()
                char[] r0 = (char[]) r0
                r11 = r0
                r0 = r10
                r1 = r11
                boolean r0 = java.util.Arrays.equals(r0, r1)
                if (r0 != 0) goto L88
                goto L90
            L88:
                r0 = r7
                java.lang.String r1 = "Manually adding a field that @Singular @Builder would generate is not supported. If you want to manually manage the builder aspect for this field/parameter, don't use @Singular."
                r0.addError(r1)
                r0 = 1
                return r0
            L90:
                r0 = r12
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L6f
                goto Lfb
            L9d:
                r0 = r7
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
                r9 = r0
                r0 = r9
                char[] r0 = r0.selector
                r10 = r0
                r0 = r10
                if (r0 != 0) goto Lb5
                goto Lfb
            Lb5:
                r0 = r9
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.getGeneratedBy(r0)
                if (r0 == 0) goto Lc0
                goto Lfb
            Lc0:
                r0 = r4
                r1 = r6
                r2 = r5
                java.util.List r0 = r0.listMethodsToBeGenerated(r1, r2)
                java.util.Iterator r0 = r0.iterator()
                r12 = r0
                goto Lf1
            Ld0:
                r0 = r12
                java.lang.Object r0 = r0.next()
                char[] r0 = (char[]) r0
                r11 = r0
                r0 = r10
                r1 = r11
                boolean r0 = java.util.Arrays.equals(r0, r1)
                if (r0 != 0) goto Le9
                goto Lf1
            Le9:
                r0 = r7
                java.lang.String r1 = "Manually adding a method that @Singular @Builder would generate is not supported. If you want to manually manage the builder aspect for this field/parameter, don't use @Singular."
                r0.addError(r1)
                r0 = 1
                return r0
            Lf1:
                r0 = r12
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Ld0
            Lfb:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
        }

        public java.util.List<char[]> listFieldsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r3, lombok.eclipse.EclipseNode r4) {
                r2 = this;
                r0 = r3
                char[] r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData.access$0(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
        }

        public java.util.List<char[]> listMethodsToBeGenerated(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r6, lombok.eclipse.EclipseNode r7) {
                r5 = this;
                r0 = r6
                char[] r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData.access$0(r0)
                r8 = r0
                r0 = r6
                char[] r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData.access$1(r0)
                r9 = r0
                r0 = r8
                r1 = r9
                boolean r0 = java.util.Arrays.equals(r0, r1)
                if (r0 == 0) goto L19
                r0 = r8
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L19:
                r0 = 2
                char[] r0 = new char[r0]
                r1 = r0
                r2 = 0
                r3 = r8
                r1[r2] = r3
                r1 = r0
                r2 = 1
                r3 = r9
                r1[r2] = r3
                java.util.List r0 = java.util.Arrays.asList(r0)
                return r0
        }

        public abstract java.util.List<lombok.eclipse.EclipseNode> generateFields(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r1, lombok.eclipse.EclipseNode r2);

        public void generateMethods(lombok.eclipse.handlers.HandleBuilder.BuilderJob r11, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r12, boolean r13) {
                r10 = this;
                lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer$1 r0 = new lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer$1
                r1 = r0
                r2 = r10
                r3 = r11
                r1.<init>(r2, r3)
                r14 = r0
                lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer$2 r0 = new lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer$2
                r1 = r0
                r2 = r10
                r3 = r11
                r1.<init>(r2, r3)
                r15 = r0
                r0 = r10
                r1 = r11
                lombok.core.configuration.CheckerFrameworkVersion r1 = r1.checkerFramework
                r2 = r12
                r3 = r13
                r4 = r11
                lombok.eclipse.EclipseNode r4 = r4.builderType
                r5 = r11
                boolean r5 = r5.oldFluent
                r6 = r14
                r7 = r15
                r8 = r11
                lombok.AccessLevel r8 = r8.accessInners
                r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public abstract void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r1, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r2, boolean r3, lombok.eclipse.EclipseNode r4, boolean r5, lombok.eclipse.handlers.EclipseSingularsRecipes.TypeReferenceMaker r6, lombok.eclipse.handlers.EclipseSingularsRecipes.StatementMaker r7, lombok.AccessLevel r8);

        public abstract void appendBuildCode(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r1, lombok.eclipse.EclipseNode r2, java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> r3, char[] r4, java.lang.String r5);

        public boolean shadowedDuringBuild() {
                r2 = this;
                r0 = 1
                return r0
        }

        public boolean requiresCleaning() {
                r7 = this;
                r0 = r7
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.String r1 = "appendCleaningCode"
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L2d
                r3 = r2
                r4 = 0
                java.lang.Class<lombok.eclipse.handlers.EclipseSingularsRecipes$SingularData> r5 = lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2d
                r3 = r2
                r4 = 1
                java.lang.Class<lombok.eclipse.EclipseNode> r5 = lombok.eclipse.EclipseNode.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2d
                r3 = r2
                r4 = 2
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.Class<lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer> r1 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.class
                boolean r0 = r0.equals(r1)     // Catch: java.lang.NoSuchMethodException -> L2d
                if (r0 == 0) goto L2b
                r0 = 0
                goto L2c
            L2b:
                r0 = 1
            L2c:
                return r0
            L2d:
                r0 = 0
                return r0
        }

        public void appendCleaningCode(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r2, lombok.eclipse.EclipseNode r3, java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> r4) {
                r1 = this;
                return
        }

        protected org.eclipse.jdt.internal.compiler.ast.Annotation[] generateSelfReturnAnnotations(boolean r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7) {
                r5 = this;
                r0 = r6
                if (r0 == 0) goto Lb
                r0 = r7
                org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r0)
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L13
                r0 = 0
                return r0
            L13:
                r0 = 1
                org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
                r1 = r0
                r2 = 0
                r3 = r8
                r1[r2] = r3
                return r0
        }

        protected org.eclipse.jdt.internal.compiler.ast.TypeReference addTypeArgs(int r9, boolean r10, lombok.eclipse.EclipseNode r11, org.eclipse.jdt.internal.compiler.ast.TypeReference r12, java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r13) {
                r8 = this;
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r13
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.createTypeArgs(r1, r2, r3, r4)
                r14 = r0
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
                if (r0 == 0) goto L2b
                org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedSingleTypeReference
                r1 = r0
                r2 = r12
                org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r2
                char[] r2 = r2.token
                r3 = r14
                r4 = 0
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                r12 = r0
                goto L82
            L2b:
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
                if (r0 == 0) goto L6c
                r0 = r12
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
                r15 = r0
                r0 = r15
                char[][] r0 = r0.tokens
                int r0 = r0.length
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r0]
                r16 = r0
                r0 = r16
                r1 = r15
                char[][] r1 = r1.tokens
                int r1 = r1.length
                r2 = 1
                int r1 = r1 - r2
                r2 = r14
                r0[r1] = r2
                org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.ParameterizedQualifiedTypeReference
                r1 = r0
                r2 = r12
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r2
                char[][] r2 = r2.tokens
                r3 = r16
                r4 = 0
                long[] r5 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS
                r1.<init>(r2, r3, r4, r5)
                r12 = r0
                goto L82
            L6c:
                r0 = r11
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "Don't know how to clone-and-parameterize type: "
                r2.<init>(r3)
                r2 = r12
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.addError(r1)
            L82:
                r0 = r12
                return r0
        }

        protected org.eclipse.jdt.internal.compiler.ast.TypeReference[] createTypeArgs(int r7, boolean r8, lombok.eclipse.EclipseNode r9, java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r10) {
                r6 = this;
                r0 = r7
                if (r0 >= 0) goto Lf
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "count is negative"
                r1.<init>(r2)
                throw r0
            Lf:
                r0 = r7
                if (r0 != 0) goto L15
                r0 = 0
                return r0
            L15:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r11 = r0
                r0 = r10
                if (r0 == 0) goto L176
                r0 = r10
                java.util.Iterator r0 = r0.iterator()
                r13 = r0
                goto L13d
            L2f:
                r0 = r13
                java.lang.Object r0 = r0.next()
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r0
                r12 = r0
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Wildcard
                if (r0 == 0) goto L4b
                r0 = r12
                org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = (org.eclipse.jdt.internal.compiler.ast.Wildcard) r0
                goto L4c
            L4b:
                r0 = 0
            L4c:
                r14 = r0
                r0 = r8
                if (r0 != 0) goto Lca
                r0 = r14
                if (r0 == 0) goto L80
                r0 = r14
                int r0 = r0.kind
                if (r0 == 0) goto L68
                r0 = r14
                int r0 = r0.kind
                r1 = 2
                if (r0 != r1) goto L80
            L68:
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
                r2 = r1
                char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
                long[] r4 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS
                r2.<init>(r3, r4)
                boolean r0 = r0.add(r1)
                goto L133
            L80:
                r0 = r14
                if (r0 == 0) goto Lba
                r0 = r14
                int r0 = r0.kind
                r1 = 1
                if (r0 != r1) goto Lba
                r0 = r11
                r1 = r14
                org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.bound     // Catch: java.lang.Exception -> La1
                org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)     // Catch: java.lang.Exception -> La1
                boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> La1
                goto L133
            La1:
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
                r2 = r1
                char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
                long[] r4 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS
                r2.<init>(r3, r4)
                boolean r0 = r0.add(r1)
                goto L133
            Lba:
                r0 = r11
                r1 = r12
                org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
                boolean r0 = r0.add(r1)
                goto L133
            Lca:
                r0 = r14
                if (r0 == 0) goto Lf7
                r0 = r14
                int r0 = r0.kind
                if (r0 == 0) goto Le0
                r0 = r14
                int r0 = r0.kind
                r1 = 2
                if (r0 != r1) goto Lf7
            Le0:
                org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
                r1 = r0
                r2 = 0
                r1.<init>(r2)
                r15 = r0
                r0 = r11
                r1 = r15
                boolean r0 = r0.add(r1)
                goto L133
            Lf7:
                r0 = r14
                if (r0 == 0) goto L115
                r0 = r14
                int r0 = r0.kind
                r1 = 1
                if (r0 != r1) goto L115
                r0 = r11
                r1 = r12
                org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
                boolean r0 = r0.add(r1)
                goto L133
            L115:
                org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
                r1 = r0
                r2 = 1
                r1.<init>(r2)
                r15 = r0
                r0 = r15
                r1 = r12
                org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r1)
                r0.bound = r1
                r0 = r11
                r1 = r15
                boolean r0 = r0.add(r1)
            L133:
                int r7 = r7 + (-1)
                r0 = r7
                if (r0 != 0) goto L13d
                goto L176
            L13d:
                r0 = r13
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L2f
                goto L176
            L14a:
                r0 = r8
                if (r0 == 0) goto L161
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.Wildcard r1 = new org.eclipse.jdt.internal.compiler.ast.Wildcard
                r2 = r1
                r3 = 0
                r2.<init>(r3)
                boolean r0 = r0.add(r1)
                goto L176
            L161:
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
                r2 = r1
                char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
                long[] r4 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS
                r2.<init>(r3, r4)
                boolean r0 = r0.add(r1)
            L176:
                r0 = r7
                int r7 = r7 + (-1)
                if (r0 > 0) goto L14a
                r0 = r11
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L189
                r0 = 0
                return r0
            L189:
                r0 = r11
                r1 = 0
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference[]) r0
                return r0
        }

        protected org.eclipse.jdt.internal.compiler.ast.Expression getSize(lombok.eclipse.EclipseNode r7, char[] r8, boolean r9, java.lang.String r10) {
                r6 = this;
                org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
                r1 = r0
                r1.<init>()
                r11 = r0
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.Reference r0 = getBuilderReference(r0)
                r12 = r0
                org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
                r1 = r0
                r2 = r8
                r3 = 0
                r1.<init>(r2, r3)
                r13 = r0
                r0 = r13
                r1 = r12
                r0.receiver = r1
                r0 = r11
                r1 = r13
                r0.receiver = r1
                r0 = r11
                char[] r1 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.SIZE_TEXT
                r0.selector = r1
                r0 = r9
                if (r0 != 0) goto L38
                r0 = r11
                return r0
            L38:
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.Reference r0 = getBuilderReference(r0)
                r14 = r0
                org.eclipse.jdt.internal.compiler.ast.FieldReference r0 = new org.eclipse.jdt.internal.compiler.ast.FieldReference
                r1 = r0
                r2 = r8
                r3 = 0
                r1.<init>(r2, r3)
                r15 = r0
                r0 = r15
                r1 = r14
                r0.receiver = r1
                org.eclipse.jdt.internal.compiler.ast.NullLiteral r0 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
                r1 = r0
                r2 = 0
                r3 = 0
                r1.<init>(r2, r3)
                r16 = r0
                org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
                r1 = r0
                r2 = r15
                r3 = r16
                r4 = 18
                r1.<init>(r2, r3, r4)
                r17 = r0
                r0 = 1
                char[] r0 = new char[r0]
                r1 = r0
                r2 = 0
                r3 = 48
                r1[r2] = r3
                r1 = 0
                org.eclipse.jdt.internal.compiler.ast.IntLiteral r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeIntLiteral(r0, r1)
                r18 = r0
                org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = new org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
                r1 = r0
                r2 = r17
                r3 = r18
                r4 = r11
                r1.<init>(r2, r3, r4)
                r19 = r0
                r0 = r19
                return r0
        }

        protected org.eclipse.jdt.internal.compiler.ast.TypeReference cloneParamType(int r6, java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r7, lombok.eclipse.EclipseNode r8) {
                r5 = this;
                r0 = r7
                if (r0 == 0) goto L45
                r0 = r7
                int r0 = r0.size()
                r1 = r6
                if (r0 <= r1) goto L45
                r0 = r7
                r1 = r6
                java.lang.Object r0 = r0.get(r1)
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.TypeReference) r0
                r9 = r0
                r0 = r9
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Wildcard
                if (r0 == 0) goto L3f
                r0 = r9
                org.eclipse.jdt.internal.compiler.ast.Wildcard r0 = (org.eclipse.jdt.internal.compiler.ast.Wildcard) r0
                r10 = r0
                r0 = r10
                int r0 = r0.kind
                r1 = 1
                if (r0 != r1) goto L45
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.bound     // Catch: java.lang.Exception -> L3b
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0)     // Catch: java.lang.Exception -> L3b
                return r0
            L3b:
                goto L45
            L3f:
                r0 = r9
                org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.copyType(r0)
                return r0
            L45:
                org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
                r1 = r0
                char[][] r2 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
                long[] r3 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.NULL_POSS
                r1.<init>(r2, r3)
                return r0
        }

        protected static org.eclipse.jdt.internal.compiler.ast.Reference getBuilderReference(java.lang.String r6) {
                java.lang.String r0 = "this"
                r1 = r6
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L14
                org.eclipse.jdt.internal.compiler.ast.ThisReference r0 = new org.eclipse.jdt.internal.compiler.ast.ThisReference
                r1 = r0
                r2 = 0
                r3 = 0
                r1.<init>(r2, r3)
                return r0
            L14:
                org.eclipse.jdt.internal.compiler.ast.SingleNameReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
                r1 = r0
                r2 = r6
                char[] r2 = r2.toCharArray()
                r3 = 0
                r1.<init>(r2, r3)
                return r0
        }

        protected void nullBehaviorize(lombok.eclipse.EclipseNode r9, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r10, java.util.List<org.eclipse.jdt.internal.compiler.ast.Statement> r11, org.eclipse.jdt.internal.compiler.ast.Argument r12, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r13) {
                r8 = this;
                r0 = r10
                boolean r0 = r0.isIgnoreNullCollections()
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L6f
                org.eclipse.jdt.internal.compiler.ast.EqualExpression r0 = new org.eclipse.jdt.internal.compiler.ast.EqualExpression
                r1 = r0
                org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
                r3 = r2
                r4 = r10
                char[] r4 = r4.getPluralName()
                r5 = 0
                r3.<init>(r4, r5)
                org.eclipse.jdt.internal.compiler.ast.NullLiteral r3 = new org.eclipse.jdt.internal.compiler.ast.NullLiteral
                r4 = r3
                r5 = 0
                r6 = 0
                r4.<init>(r5, r6)
                r4 = 29
                r1.<init>(r2, r3, r4)
                r15 = r0
                org.eclipse.jdt.internal.compiler.ast.Block r0 = new org.eclipse.jdt.internal.compiler.ast.Block
                r1 = r0
                r2 = 0
                r1.<init>(r2)
                r16 = r0
                r0 = r16
                r1 = r11
                r2 = r11
                int r2 = r2.size()
                org.eclipse.jdt.internal.compiler.ast.Statement[] r2 = new org.eclipse.jdt.internal.compiler.ast.Statement[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = (org.eclipse.jdt.internal.compiler.ast.Statement[]) r1
                r0.statements = r1
                r0 = r11
                r0.clear()
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.IfStatement r1 = new org.eclipse.jdt.internal.compiler.ast.IfStatement
                r2 = r1
                r3 = r15
                r4 = r16
                r5 = 0
                r6 = 0
                r2.<init>(r3, r4, r5, r6)
                boolean r0 = r0.add(r1)
                r0 = r9
                r1 = r12
                r2 = r13
                lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNullableAnnotation(r0, r1, r2)
                return
            L6f:
                r0 = r9
                r1 = r12
                r2 = r13
                lombok.eclipse.handlers.EclipseHandlerUtil.createRelevantNonNullAnnotation(r0, r1, r2)
                r0 = 0
                r1 = r10
                char[] r1 = r1.getPluralName()
                r2 = r9
                java.lang.String r3 = "%s cannot be null"
                org.eclipse.jdt.internal.compiler.ast.Statement r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateNullCheck(r0, r1, r2, r3)
                r15 = r0
                r0 = r11
                r1 = 0
                r2 = r15
                r0.add(r1, r2)
                return
        }

        protected abstract int getTypeArgumentsCount();

        protected abstract char[][] getEmptyMakerReceiver(java.lang.String r1);

        protected abstract char[] getEmptyMakerSelector(java.lang.String r1);

        public org.eclipse.jdt.internal.compiler.ast.MessageSend getEmptyExpression(java.lang.String r8, lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r9, lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11) {
                r7 = this;
                org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
                r1 = r0
                r1.<init>()
                r12 = r0
                r0 = r12
                r1 = r11
                r2 = r7
                r3 = r8
                char[][] r2 = r2.getEmptyMakerReceiver(r3)
                org.eclipse.jdt.internal.compiler.ast.NameReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedNameRef(r1, r2)
                r0.receiver = r1
                r0 = r12
                r1 = r7
                r2 = r8
                char[] r1 = r1.getEmptyMakerSelector(r2)
                r0.selector = r1
                r0 = r12
                r1 = r7
                r2 = r7
                int r2 = r2.getTypeArgumentsCount()
                r3 = 0
                r4 = r10
                r5 = r9
                java.util.List r5 = r5.getTypeArgs()
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.createTypeArgs(r2, r3, r4, r5)
                r0.typeArguments = r1
                r0 = r12
                return r0
        }

        static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
                int[] r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.$SWITCH_TABLE$lombok$core$AST$Kind
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
                lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.$SWITCH_TABLE$lombok$core$AST$Kind = r1
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseSingularsRecipes$SingularData.SCL.lombok */
    public static final class SingularData {
        private final lombok.eclipse.EclipseNode annotation;
        private final char[] singularName;
        private final char[] pluralName;
        private final char[] setterPrefix;
        private final java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> typeArgs;
        private final java.lang.String targetFqn;
        private final lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer singularizer;
        private final boolean ignoreNullCollections;
        private final org.eclipse.jdt.internal.compiler.ast.ASTNode source;

        public SingularData(lombok.eclipse.EclipseNode r12, char[] r13, char[] r14, java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r15, java.lang.String r16, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer r17, org.eclipse.jdt.internal.compiler.ast.ASTNode r18, boolean r19) {
                r11 = this;
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = 0
                char[] r9 = new char[r9]
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public SingularData(lombok.eclipse.EclipseNode r4, char[] r5, char[] r6, java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r7, java.lang.String r8, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer r9, org.eclipse.jdt.internal.compiler.ast.ASTNode r10, boolean r11, char[] r12) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.annotation = r1
                r0 = r3
                r1 = r5
                r0.singularName = r1
                r0 = r3
                r1 = r6
                r0.pluralName = r1
                r0 = r3
                r1 = r7
                r0.typeArgs = r1
                r0 = r3
                r1 = r8
                r0.targetFqn = r1
                r0 = r3
                r1 = r9
                r0.singularizer = r1
                r0 = r3
                r1 = r10
                r0.source = r1
                r0 = r3
                r1 = r11
                r0.ignoreNullCollections = r1
                r0 = r3
                r1 = r12
                r0.setterPrefix = r1
                return
        }

        public void setGeneratedByRecursive(org.eclipse.jdt.internal.compiler.ast.ASTNode r5) {
                r4 = this;
                lombok.eclipse.handlers.SetGeneratedByVisitor r0 = new lombok.eclipse.handlers.SetGeneratedByVisitor
                r1 = r0
                r2 = r4
                org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = r2.source
                r1.<init>(r2)
                r6 = r0
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
                if (r0 == 0) goto L1f
                r0 = r5
                org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
                r1 = r6
                r2 = 0
                r0.traverse(r1, r2)
                goto L38
            L1f:
                r0 = r5
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
                if (r0 == 0) goto L32
                r0 = r5
                org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.FieldDeclaration) r0
                r1 = r6
                r2 = 0
                r0.traverse(r1, r2)
                goto L38
            L32:
                r0 = r5
                r1 = r6
                r2 = 0
                r0.traverse(r1, r2)
            L38:
                return
        }

        public org.eclipse.jdt.internal.compiler.ast.ASTNode getSource() {
                r2 = this;
                r0 = r2
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = r0.source
                return r0
        }

        public lombok.eclipse.EclipseNode getAnnotation() {
                r2 = this;
                r0 = r2
                lombok.eclipse.EclipseNode r0 = r0.annotation
                return r0
        }

        public char[] getSingularName() {
                r2 = this;
                r0 = r2
                char[] r0 = r0.singularName
                return r0
        }

        public char[] getPluralName() {
                r2 = this;
                r0 = r2
                char[] r0 = r0.pluralName
                return r0
        }

        public char[] getSetterPrefix() {
                r2 = this;
                r0 = r2
                char[] r0 = r0.setterPrefix
                return r0
        }

        public java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> getTypeArgs() {
                r2 = this;
                r0 = r2
                java.util.List<org.eclipse.jdt.internal.compiler.ast.TypeReference> r0 = r0.typeArgs
                return r0
        }

        public java.lang.String getTargetFqn() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.targetFqn
                return r0
        }

        public lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer getSingularizer() {
                r2 = this;
                r0 = r2
                lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = r0.singularizer
                return r0
        }

        public boolean isIgnoreNullCollections() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.ignoreNullCollections
                return r0
        }

        public java.lang.String getTargetSimpleType() {
                r4 = this;
                r0 = r4
                java.lang.String r0 = r0.targetFqn
                java.lang.String r1 = "."
                int r0 = r0.lastIndexOf(r1)
                r5 = r0
                r0 = r5
                r1 = -1
                if (r0 != r1) goto L16
                r0 = r4
                java.lang.String r0 = r0.targetFqn
                goto L20
            L16:
                r0 = r4
                java.lang.String r0 = r0.targetFqn
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
            L20:
                return r0
        }

        static /* synthetic */ char[] access$0(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r2) {
                r0 = r2
                char[] r0 = r0.pluralName
                return r0
        }

        static /* synthetic */ char[] access$1(lombok.eclipse.handlers.EclipseSingularsRecipes.SingularData r2) {
                r0 = r2
                char[] r0 = r0.singularName
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseSingularsRecipes$StatementMaker.SCL.lombok */
    public interface StatementMaker {
        /* renamed from: make */
        org.eclipse.jdt.internal.compiler.ast.Statement mo246make();
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/EclipseSingularsRecipes$TypeReferenceMaker.SCL.lombok */
    public interface TypeReferenceMaker {
        org.eclipse.jdt.internal.compiler.ast.TypeReference make();
    }

    static {
            lombok.eclipse.handlers.EclipseSingularsRecipes r0 = new lombok.eclipse.handlers.EclipseSingularsRecipes
            r1 = r0
            r1.<init>()
            lombok.eclipse.handlers.EclipseSingularsRecipes.INSTANCE = r0
            return
    }

    private EclipseSingularsRecipes() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.singularizers = r1
            r0 = r5
            lombok.core.TypeLibrary r1 = new lombok.core.TypeLibrary
            r2 = r1
            r2.<init>()
            r0.singularizableTypes = r1
            r0 = r5
            lombok.core.TypeLibrary r0 = r0.singularizableTypes     // Catch: java.io.IOException -> L2f
            r1 = r5
            java.util.Map<java.lang.String, lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer> r1 = r1.singularizers     // Catch: java.io.IOException -> L2f
            loadAll(r0, r1)     // Catch: java.io.IOException -> L2f
            r0 = r5
            lombok.core.TypeLibrary r0 = r0.singularizableTypes     // Catch: java.io.IOException -> L2f
            r0.lock()     // Catch: java.io.IOException -> L2f
            goto L46
        L2f:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Lombok's @Singularizable feature is broken due to misconfigured SPI files: "
            r2.<init>(r3)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L46:
            return
    }

    private static void loadAll(lombok.core.TypeLibrary r5, java.util.Map<java.lang.String, lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer> r6) throws java.io.IOException {
            java.lang.Class<lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer> r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.class
            java.lang.Class<lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer> r1 = lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lb3
        L13:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = (lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer) r0
            r7 = r0
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.getSupportedTypes()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto La9
        L29:
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r6
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = (lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L99
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1 = r7
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L60
            r0 = r7
            goto L62
        L60:
            r0 = r11
        L62:
            r12 = r0
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Multiple singularizers found for type "
            r2.<init>(r3)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "; the alphabetically first class is used: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            r1 = r9
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
            goto La9
        L99:
            r0 = r6
            r1 = r9
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            r1 = r9
            r0.addType(r1)
        La9:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L29
        Lb3:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            return
    }

    public static lombok.eclipse.handlers.EclipseSingularsRecipes get() {
            lombok.eclipse.handlers.EclipseSingularsRecipes r0 = lombok.eclipse.handlers.EclipseSingularsRecipes.INSTANCE
            return r0
    }

    public java.lang.String toQualified(java.lang.String r4) {
            r3 = this;
            r0 = r3
            lombok.core.TypeLibrary r0 = r0.singularizableTypes
            r1 = r4
            java.util.List r0 = r0.toQualifieds(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r5
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer getSingularizer(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer> r0 = r0.singularizers
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            lombok.eclipse.handlers.EclipseSingularsRecipes$EclipseSingularizer r0 = (lombok.eclipse.handlers.EclipseSingularsRecipes.EclipseSingularizer) r0
            return r0
    }
}
