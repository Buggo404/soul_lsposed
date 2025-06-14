package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacSingularsRecipes.SCL.lombok */
public class JavacSingularsRecipes {
    private static final lombok.javac.handlers.JavacSingularsRecipes INSTANCE = null;
    private final java.util.Map<java.lang.String, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer> singularizers;
    private final lombok.core.TypeLibrary singularizableTypes;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacSingularsRecipes$ExpressionMaker.SCL.lombok */
    public interface ExpressionMaker {
        com.sun.tools.javac.tree.JCTree.JCExpression make();
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacSingularsRecipes$JavacSingularizer.SCL.lombok */
    public static abstract class JavacSingularizer {
        private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;



        public JavacSingularizer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public abstract lombok.core.LombokImmutableList<java.lang.String> getSupportedTypes();

        protected lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer getGuavaInstead(lombok.javac.JavacNode r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        protected com.sun.tools.javac.tree.JCTree.JCModifiers makeMods(lombok.javac.JavacTreeMaker r8, lombok.javac.JavacNode r9, boolean r10, lombok.AccessLevel r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r12) {
                r7 = this;
                r0 = r10
                if (r0 == 0) goto L1b
                r0 = r8
                r1 = r9
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "Deprecated"
                r3[r4] = r5
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
                com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
                com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
                goto L1c
            L1b:
                r0 = 0
            L1c:
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L2b
                r0 = r13
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
                goto L2e
            L2b:
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            L2e:
                r14 = r0
                r0 = r14
                r1 = r12
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.mergeAnnotations(r0, r1)
                r14 = r0
                r0 = r8
                r1 = r11
                int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
                long r1 = (long) r1
                r2 = r14
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
                return r0
        }

        public boolean checkForAlreadyExistingNodesAndGenerateError(lombok.javac.JavacNode r5, lombok.javac.handlers.JavacSingularsRecipes.SingularData r6) {
                r4 = this;
                r0 = r5
                lombok.core.LombokImmutableList r0 = r0.down()
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
                goto Lfb
            Lc:
                r0 = r8
                java.lang.Object r0 = r0.next()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
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
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
                r9 = r0
                r0 = r9
                com.sun.tools.javac.util.Name r0 = r0.name
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L54
                goto Lfb
            L54:
                r0 = r9
                com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r0)
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
                com.sun.tools.javac.util.Name r0 = (com.sun.tools.javac.util.Name) r0
                r11 = r0
                r0 = r11
                r1 = r10
                boolean r0 = r0.equals(r1)
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
                com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
                r9 = r0
                r0 = r9
                com.sun.tools.javac.util.Name r0 = r0.name
                r10 = r0
                r0 = r10
                if (r0 != 0) goto Lb5
                goto Lfb
            Lb5:
                r0 = r9
                com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.getGeneratedBy(r0)
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
                com.sun.tools.javac.util.Name r0 = (com.sun.tools.javac.util.Name) r0
                r11 = r0
                r0 = r11
                r1 = r10
                boolean r0 = r0.equals(r1)
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

        public java.util.List<com.sun.tools.javac.util.Name> listFieldsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r3, lombok.javac.JavacNode r4) {
                r2 = this;
                r0 = r3
                com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.access$0(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
        }

        public java.util.List<com.sun.tools.javac.util.Name> listMethodsToBeGenerated(lombok.javac.handlers.JavacSingularsRecipes.SingularData r6, lombok.javac.JavacNode r7) {
                r5 = this;
                r0 = r6
                com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.access$0(r0)
                r8 = r0
                r0 = r6
                com.sun.tools.javac.util.Name r0 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.access$1(r0)
                r9 = r0
                r0 = r8
                r1 = r9
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L19
                r0 = r8
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L19:
                r0 = 2
                com.sun.tools.javac.util.Name[] r0 = new com.sun.tools.javac.util.Name[r0]
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

        public abstract java.util.List<lombok.javac.JavacNode> generateFields(lombok.javac.handlers.JavacSingularsRecipes.SingularData r1, lombok.javac.JavacNode r2, lombok.javac.JavacNode r3);

        public void generateMethods(lombok.javac.handlers.HandleBuilder.BuilderJob r12, lombok.javac.handlers.JavacSingularsRecipes.SingularData r13, boolean r14) {
                r11 = this;
                r0 = r12
                lombok.javac.JavacNode r0 = r0.builderType
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r15 = r0
                lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer$1 r0 = new lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer$1
                r1 = r0
                r2 = r11
                r3 = r12
                r4 = r15
                r1.<init>(r2, r3, r4)
                r16 = r0
                lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer$2 r0 = new lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer$2
                r1 = r0
                r2 = r11
                r3 = r12
                r4 = r15
                r1.<init>(r2, r3, r4)
                r17 = r0
                r0 = r11
                r1 = r12
                lombok.core.configuration.CheckerFrameworkVersion r1 = r1.checkerFramework
                r2 = r13
                r3 = r14
                r4 = r12
                lombok.javac.JavacNode r4 = r4.builderType
                r5 = r12
                lombok.javac.JavacNode r5 = r5.sourceNode
                r6 = r12
                boolean r6 = r6.oldFluent
                r7 = r16
                r8 = r17
                r9 = r12
                lombok.AccessLevel r9 = r9.accessInners
                r0.generateMethods(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public abstract void generateMethods(lombok.core.configuration.CheckerFrameworkVersion r1, lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, boolean r3, lombok.javac.JavacNode r4, lombok.javac.JavacNode r5, boolean r6, lombok.javac.handlers.JavacSingularsRecipes.ExpressionMaker r7, lombok.javac.handlers.JavacSingularsRecipes.StatementMaker r8, lombok.AccessLevel r9);

        protected void doGenerateMethods(lombok.core.configuration.CheckerFrameworkVersion r13, lombok.javac.handlers.JavacSingularsRecipes.SingularData r14, boolean r15, lombok.javac.JavacNode r16, lombok.javac.JavacNode r17, boolean r18, lombok.javac.handlers.JavacSingularsRecipes.ExpressionMaker r19, lombok.javac.handlers.JavacSingularsRecipes.StatementMaker r20, lombok.AccessLevel r21) {
                r12 = this;
                r0 = r16
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r22 = r0
                r0 = r12
                r1 = r13
                r2 = r15
                r3 = r22
                r4 = r19
                com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.make()
                r5 = r20
                com.sun.tools.javac.tree.JCTree$JCStatement r5 = r5.make()
                r6 = r14
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r21
                r0.generateSingularMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0 = r12
                r1 = r13
                r2 = r15
                r3 = r22
                r4 = r19
                com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.make()
                r5 = r20
                com.sun.tools.javac.tree.JCTree$JCStatement r5 = r5.make()
                r6 = r14
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r21
                r0.generatePluralMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0 = r12
                r1 = r13
                r2 = r15
                r3 = r22
                r4 = r19
                com.sun.tools.javac.tree.JCTree$JCExpression r4 = r4.make()
                r5 = r20
                com.sun.tools.javac.tree.JCTree$JCStatement r5 = r5.make()
                r6 = r14
                r7 = r16
                r8 = r17
                r9 = r21
                r0.generateClearMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        private void finishAndInjectMethod(lombok.core.configuration.CheckerFrameworkVersion r11, lombok.javac.JavacTreeMaker r12, com.sun.tools.javac.tree.JCTree.JCExpression r13, com.sun.tools.javac.tree.JCTree.JCStatement r14, lombok.javac.handlers.JavacSingularsRecipes.SingularData r15, lombok.javac.JavacNode r16, lombok.javac.JavacNode r17, boolean r18, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r19, com.sun.tools.javac.util.Name r20, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> r21, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCAnnotation> r22, lombok.AccessLevel r23, java.lang.Boolean r24) {
                r10 = this;
                r0 = r14
                if (r0 == 0) goto Ld
                r0 = r19
                r1 = r14
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            Ld:
                r0 = r12
                r1 = 0
                r2 = r19
                com.sun.tools.javac.util.List r2 = r2.toList()
                com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
                r25 = r0
                r0 = r10
                r1 = r12
                r2 = r16
                r3 = r18
                r4 = r23
                r5 = r22
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.makeMods(r1, r2, r3, r4, r5)
                r26 = r0
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
                r27 = r0
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
                r28 = r0
                r0 = r24
                if (r0 == 0) goto L90
                r0 = r24
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L69
                r0 = r21
                java.util.Iterator r0 = r0.iterator()
                r30 = r0
                goto L5c
            L49:
                r0 = r30
                java.lang.Object r0 = r0.next()
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
                r29 = r0
                r0 = r16
                r1 = r29
                lombok.javac.handlers.JavacHandlerUtil.createRelevantNullableAnnotation(r0, r1)
            L5c:
                r0 = r30
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L49
                goto L90
            L69:
                r0 = r21
                java.util.Iterator r0 = r0.iterator()
                r30 = r0
                goto L86
            L73:
                r0 = r30
                java.lang.Object r0 = r0.next()
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
                r29 = r0
                r0 = r16
                r1 = r29
                lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            L86:
                r0 = r30
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L73
            L90:
                r0 = r13
                r1 = r12
                r2 = r16
                r3 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.addCheckerFrameworkReturnsReceiver(r0, r1, r2, r3)
                r13 = r0
                r0 = r12
                r1 = r26
                r2 = r20
                r3 = r13
                r4 = r27
                r5 = r21
                r6 = r28
                r7 = r25
                r8 = 0
                com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
                r29 = r0
                r0 = r14
                if (r0 == 0) goto Lb9
                r0 = r16
                r1 = r29
                lombok.javac.handlers.JavacHandlerUtil.createRelevantNonNullAnnotation(r0, r1)
            Lb9:
                r0 = r29
                r1 = r17
                com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
                r0 = r16
                r1 = r29
                lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
                return
        }

        private void generateClearMethod(lombok.core.configuration.CheckerFrameworkVersion r17, boolean r18, lombok.javac.JavacTreeMaker r19, com.sun.tools.javac.tree.JCTree.JCExpression r20, com.sun.tools.javac.tree.JCTree.JCStatement r21, lombok.javac.handlers.JavacSingularsRecipes.SingularData r22, lombok.javac.JavacNode r23, lombok.javac.JavacNode r24, lombok.AccessLevel r25) {
                r16 = this;
                r0 = r16
                r1 = r19
                r2 = r22
                r3 = r23
                com.sun.tools.javac.tree.JCTree$JCStatement r0 = r0.generateClearStatements(r1, r2, r3)
                r26 = r0
                com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
                r1 = r0
                r1.<init>()
                r27 = r0
                r0 = r27
                r1 = r26
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                r0 = r23
                r1 = r24
                java.lang.String r2 = "clear"
                r3 = r22
                com.sun.tools.javac.util.Name r3 = r3.getPluralName()
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                r28 = r0
                r0 = r16
                r1 = r17
                r2 = r19
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r7 = r24
                r8 = r18
                r9 = r27
                r10 = r28
                com.sun.tools.javac.util.List r11 = com.sun.tools.javac.util.List.nil()
                com.sun.tools.javac.util.List r12 = com.sun.tools.javac.util.List.nil()
                r13 = r25
                r14 = 0
                r0.finishAndInjectMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
        }

        protected abstract com.sun.tools.javac.tree.JCTree.JCStatement generateClearStatements(lombok.javac.JavacTreeMaker r1, lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, lombok.javac.JavacNode r3);

        private void generateSingularMethod(lombok.core.configuration.CheckerFrameworkVersion r17, boolean r18, lombok.javac.JavacTreeMaker r19, com.sun.tools.javac.tree.JCTree.JCExpression r20, com.sun.tools.javac.tree.JCTree.JCStatement r21, lombok.javac.handlers.JavacSingularsRecipes.SingularData r22, lombok.javac.JavacNode r23, lombok.javac.JavacNode r24, boolean r25, lombok.AccessLevel r26) {
                r16 = this;
                r0 = r16
                r1 = r19
                r2 = r22
                r3 = r23
                r4 = r24
                com.sun.tools.javac.util.ListBuffer r0 = r0.generateSingularMethodStatements(r1, r2, r3, r4)
                r27 = r0
                r0 = r16
                r1 = r19
                r2 = r22
                r3 = r23
                r4 = r24
                com.sun.tools.javac.util.List r0 = r0.generateSingularMethodParameters(r1, r2, r3, r4)
                r28 = r0
                r0 = r22
                com.sun.tools.javac.util.Name r0 = r0.getSingularName()
                r29 = r0
                r0 = r22
                java.lang.String r0 = r0.getSetterPrefix()
                r30 = r0
                r0 = r30
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L3b
                r0 = r25
                if (r0 != 0) goto L3b
                r0 = r16
                java.lang.String r0 = r0.getAddMethodName()
                r30 = r0
            L3b:
                r0 = r30
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L56
                r0 = r23
                r1 = r24
                r2 = r30
                r3 = r29
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                r29 = r0
            L56:
                r0 = r27
                r1 = r16
                r2 = r19
                r3 = r22
                r4 = r23
                r5 = r24
                com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3, r4, r5)
                com.sun.tools.javac.util.ListBuffer r0 = r0.prepend(r1)
                r0 = r22
                lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.access$2(r0)
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableToBuilderSingularSetterAnnotations(r0)
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
                r31 = r0
                r0 = r16
                r1 = r17
                r2 = r19
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r7 = r24
                r8 = r18
                r9 = r27
                r10 = r29
                r11 = r28
                r12 = r31
                r13 = r26
                r14 = 0
                r0.finishAndInjectMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
        }

        protected com.sun.tools.javac.tree.JCTree.JCVariableDecl generateSingularMethodParameter(int r8, lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12, com.sun.tools.javac.util.Name r13) {
                r7 = this;
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                r1 = r11
                com.sun.tools.javac.util.Context r1 = r1.getContext()
                long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
                r14 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                com.sun.tools.javac.util.List r3 = r3.getTypeArgs()
                r4 = r11
                r5 = r12
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.cloneParamType(r1, r2, r3, r4, r5)
                r16 = r0
                r0 = r16
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.getTypeUseAnnotations(r0)
                r17 = r0
                r0 = r16
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.removeTypeUseAnnotations(r0)
                r16 = r0
                r0 = r17
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L3c
                r0 = r9
                r1 = r14
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
                goto L44
            L3c:
                r0 = r9
                r1 = r14
                r2 = r17
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            L44:
                r18 = r0
                r0 = r9
                r1 = r18
                r2 = r13
                r3 = r16
                r4 = 0
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
                return r0
        }

        protected com.sun.tools.javac.tree.JCTree.JCStatement generateSingularMethodAddStatement(lombok.javac.JavacTreeMaker r9, lombok.javac.JavacNode r10, com.sun.tools.javac.util.Name r11, java.lang.String r12) {
                r8 = this;
                r0 = r10
                java.lang.String r1 = "this"
                r2 = r12
                r3 = 1
                java.lang.String[] r3 = new java.lang.String[r3]
                r4 = r3
                r5 = 0
                java.lang.String r6 = "add"
                r4[r5] = r6
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
                r13 = r0
                r0 = r9
                com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
                r2 = r13
                r3 = r9
                r4 = r11
                com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
                com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
                com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
                r14 = r0
                r0 = r9
                r1 = r14
                com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
                return r0
        }

        protected abstract com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generateSingularMethodStatements(lombok.javac.JavacTreeMaker r1, lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, lombok.javac.JavacNode r3, lombok.javac.JavacNode r4);

        protected abstract com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCVariableDecl> generateSingularMethodParameters(lombok.javac.JavacTreeMaker r1, lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, lombok.javac.JavacNode r3, lombok.javac.JavacNode r4);

        private void generatePluralMethod(lombok.core.configuration.CheckerFrameworkVersion r17, boolean r18, lombok.javac.JavacTreeMaker r19, com.sun.tools.javac.tree.JCTree.JCExpression r20, com.sun.tools.javac.tree.JCTree.JCStatement r21, lombok.javac.handlers.JavacSingularsRecipes.SingularData r22, lombok.javac.JavacNode r23, lombok.javac.JavacNode r24, boolean r25, lombok.AccessLevel r26) {
                r16 = this;
                r0 = r16
                r1 = r19
                r2 = r22
                r3 = r23
                r4 = r24
                com.sun.tools.javac.util.ListBuffer r0 = r0.generatePluralMethodStatements(r1, r2, r3, r4)
                r27 = r0
                r0 = r22
                com.sun.tools.javac.util.Name r0 = r0.getPluralName()
                r28 = r0
                r0 = r22
                java.lang.String r0 = r0.getSetterPrefix()
                r29 = r0
                r0 = r29
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L41
                r0 = r25
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r16
                java.lang.String r2 = r2.getAddMethodName()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.<init>(r2)
                java.lang.String r1 = "All"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r29 = r0
            L41:
                r0 = r29
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L5c
                r0 = r23
                r1 = r24
                r2 = r29
                r3 = r28
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = lombok.core.handlers.HandlerUtil.buildAccessorName(r1, r2, r3)
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                r28 = r0
            L5c:
                r0 = r16
                r1 = r23
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.getPluralMethodParamType(r1)
                r30 = r0
                r0 = r16
                r1 = r16
                int r1 = r1.getTypeArgumentsCount()
                r2 = 1
                r3 = r23
                r4 = r30
                r5 = r22
                com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
                r6 = r24
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
                r30 = r0
                r0 = 8589934592(0x200000000, double:4.243991582E-314)
                r1 = r23
                com.sun.tools.javac.util.Context r1 = r1.getContext()
                long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
                r31 = r0
                r0 = r22
                boolean r0 = r0.isIgnoreNullCollections()
                r33 = r0
                r0 = r19
                r1 = r31
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
                r34 = r0
                r0 = r19
                r1 = r34
                r2 = r22
                com.sun.tools.javac.util.Name r2 = r2.getPluralName()
                r3 = r30
                r4 = 0
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
                r35 = r0
                r0 = r27
                r1 = r16
                r2 = r19
                r3 = r22
                r4 = r23
                r5 = r24
                com.sun.tools.javac.tree.JCTree$JCStatement r1 = r1.createConstructBuilderVarIfNeeded(r2, r3, r4, r5)
                com.sun.tools.javac.util.ListBuffer r0 = r0.prepend(r1)
                r0 = r33
                if (r0 == 0) goto Lfd
                r0 = r19
                lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
                r2 = r19
                r3 = r22
                com.sun.tools.javac.util.Name r3 = r3.getPluralName()
                com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
                r3 = r19
                lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
                r5 = 0
                com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
                com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
                r36 = r0
                r0 = r19
                r1 = 0
                r2 = r27
                com.sun.tools.javac.util.List r2 = r2.toList()
                com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
                r37 = r0
                com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
                r1 = r0
                r1.<init>()
                r27 = r0
                r0 = r27
                r1 = r19
                r2 = r36
                r3 = r37
                r4 = 0
                com.sun.tools.javac.tree.JCTree$JCIf r1 = r1.m81If(r2, r3, r4)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L112
            Lfd:
                r0 = r27
                r1 = r19
                r2 = 0
                r3 = r22
                com.sun.tools.javac.util.Name r3 = r3.getPluralName()
                r4 = r23
                java.lang.String r5 = "%s cannot be null"
                com.sun.tools.javac.tree.JCTree$JCStatement r1 = lombok.javac.handlers.JavacHandlerUtil.generateNullCheck(r1, r2, r3, r4, r5)
                com.sun.tools.javac.util.ListBuffer r0 = r0.prepend(r1)
            L112:
                r0 = r22
                lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.access$2(r0)
                lombok.core.LombokNode r0 = r0.m66up()
                lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.findCopyableToSetterAnnotations(r0)
                com.sun.tools.javac.util.List r0 = lombok.javac.handlers.JavacHandlerUtil.copyAnnotations(r0)
                r36 = r0
                r0 = r16
                r1 = r17
                r2 = r19
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r7 = r24
                r8 = r18
                r9 = r27
                r10 = r28
                r11 = r35
                com.sun.tools.javac.util.List r11 = com.sun.tools.javac.util.List.of(r11)
                r12 = r36
                r13 = r26
                r14 = r33
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                r0.finishAndInjectMethod(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
        }

        protected com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> generatePluralMethodStatements(lombok.javac.JavacTreeMaker r11, lombok.javac.handlers.JavacSingularsRecipes.SingularData r12, lombok.javac.JavacNode r13, lombok.javac.JavacNode r14) {
                r10 = this;
                com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
                r1 = r0
                r1.<init>()
                r15 = r0
                r0 = r13
                java.lang.String r1 = "this"
                r2 = r12
                com.sun.tools.javac.util.Name r2 = r2.getPluralName()
                java.lang.String r2 = r2.toString()
                r3 = 1
                java.lang.String[] r3 = new java.lang.String[r3]
                r4 = r3
                r5 = 0
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r7 = r6
                r8 = r10
                java.lang.String r8 = r8.getAddMethodName()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                r7.<init>(r8)
                java.lang.String r7 = "All"
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                r4[r5] = r6
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
                r16 = r0
                r0 = r11
                com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
                r2 = r16
                r3 = r11
                r4 = r12
                com.sun.tools.javac.util.Name r4 = r4.getPluralName()
                com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
                com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
                com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
                r17 = r0
                r0 = r15
                r1 = r11
                r2 = r17
                com.sun.tools.javac.tree.JCTree$JCExpressionStatement r1 = r1.Exec(r2)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                r0 = r15
                return r0
        }

        protected abstract com.sun.tools.javac.tree.JCTree.JCExpression getPluralMethodParamType(lombok.javac.JavacNode r1);

        protected abstract com.sun.tools.javac.tree.JCTree.JCStatement createConstructBuilderVarIfNeeded(lombok.javac.JavacTreeMaker r1, lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, lombok.javac.JavacNode r3, lombok.javac.JavacNode r4);

        public abstract void appendBuildCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r1, lombok.javac.JavacNode r2, lombok.javac.JavacNode r3, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r4, com.sun.tools.javac.util.Name r5, java.lang.String r6);

        public boolean shadowedDuringBuild() {
                r2 = this;
                r0 = 1
                return r0
        }

        public boolean requiresCleaning() {
                r7 = this;
                r0 = r7
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.String r1 = "appendCleaningCode"
                r2 = 4
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L35
                r3 = r2
                r4 = 0
                java.lang.Class<lombok.javac.handlers.JavacSingularsRecipes$SingularData> r5 = lombok.javac.handlers.JavacSingularsRecipes.SingularData.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L35
                r3 = r2
                r4 = 1
                java.lang.Class<lombok.javac.JavacNode> r5 = lombok.javac.JavacNode.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L35
                r3 = r2
                r4 = 2
                java.lang.Class<com.sun.tools.javac.tree.JCTree> r5 = com.sun.tools.javac.tree.JCTree.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L35
                r3 = r2
                r4 = 3
                java.lang.Class<com.sun.tools.javac.util.ListBuffer> r5 = com.sun.tools.javac.util.ListBuffer.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.NoSuchMethodException -> L35
                java.lang.Class<lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer> r1 = lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer.class
                boolean r0 = r0.equals(r1)     // Catch: java.lang.NoSuchMethodException -> L35
                if (r0 == 0) goto L33
                r0 = 0
                goto L34
            L33:
                r0 = 1
            L34:
                return r0
            L35:
                r0 = 0
                return r0
        }

        public void appendCleaningCode(lombok.javac.handlers.JavacSingularsRecipes.SingularData r2, lombok.javac.JavacNode r3, lombok.javac.JavacNode r4, com.sun.tools.javac.util.ListBuffer<com.sun.tools.javac.tree.JCTree.JCStatement> r5) {
                r1 = this;
                return
        }

        protected com.sun.tools.javac.tree.JCTree.JCExpression addTypeArgs(int r8, boolean r9, lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCExpression r11, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r12, lombok.javac.JavacNode r13) {
                r7 = this;
                r0 = r10
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r14 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r12
                r5 = r13
                com.sun.tools.javac.util.List r0 = r0.createTypeArgs(r1, r2, r3, r4, r5)
                r15 = r0
                r0 = r14
                r1 = r11
                r2 = r15
                com.sun.tools.javac.tree.JCTree$JCTypeApply r0 = r0.TypeApply(r1, r2)
                return r0
        }

        protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> createTypeArgs(int r8, boolean r9, lombok.javac.JavacNode r10, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r11, lombok.javac.JavacNode r12) {
                r7 = this;
                r0 = r10
                lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
                r13 = r0
                r0 = r8
                if (r0 >= 0) goto L15
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "count is negative"
                r1.<init>(r2)
                throw r0
            L15:
                r0 = r8
                if (r0 != 0) goto L1d
                com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
                return r0
            L1d:
                com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
                r1 = r0
                r1.<init>()
                r14 = r0
                r0 = r11
                if (r0 == 0) goto L16e
                r0 = r11
                java.util.Iterator r0 = r0.iterator()
                r16 = r0
                goto L132
            L35:
                r0 = r16
                java.lang.Object r0 = r0.next()
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
                r15 = r0
                r0 = r9
                if (r0 != 0) goto Lc2
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNBOUNDED_WILDCARD
                if (r0 == r1) goto L5b
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SUPER_WILDCARD
                if (r0 != r1) goto L72
            L5b:
                r0 = r14
                r1 = r10
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "Object"
                r3[r4] = r5
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L128
            L72:
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXTENDS_WILDCARD
                if (r0 != r1) goto Lb0
                r0 = r15
                com.sun.tools.javac.tree.JCTree$JCWildcard r0 = (com.sun.tools.javac.tree.JCTree.JCWildcard) r0     // Catch: java.lang.Exception -> L8d
                com.sun.tools.javac.tree.JCTree r0 = r0.inner     // Catch: java.lang.Exception -> L8d
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0     // Catch: java.lang.Exception -> L8d
                r17 = r0
                goto L9e
            L8d:
                r0 = r10
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = r1
                r3 = 0
                java.lang.String r4 = "Object"
                r2[r3] = r4
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
                r17 = r0
            L9e:
                r0 = r14
                r1 = r13
                r2 = r17
                r3 = r12
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r1, r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L128
            Lb0:
                r0 = r14
                r1 = r13
                r2 = r15
                r3 = r12
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r1, r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L128
            Lc2:
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNBOUNDED_WILDCARD
                if (r0 == r1) goto Ld8
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SUPER_WILDCARD
                if (r0 != r1) goto Lef
            Ld8:
                r0 = r14
                r1 = r13
                r2 = r13
                com.sun.tools.javac.code.BoundKind r3 = com.sun.tools.javac.code.BoundKind.UNBOUND
                com.sun.tools.javac.tree.JCTree$TypeBoundKind r2 = r2.TypeBoundKind(r3)
                r3 = 0
                com.sun.tools.javac.tree.JCTree$JCWildcard r1 = r1.Wildcard(r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L128
            Lef:
                r0 = r15
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXTENDS_WILDCARD
                if (r0 != r1) goto L10c
                r0 = r14
                r1 = r13
                r2 = r15
                r3 = r12
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r1, r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L128
            L10c:
                r0 = r14
                r1 = r13
                r2 = r13
                com.sun.tools.javac.code.BoundKind r3 = com.sun.tools.javac.code.BoundKind.EXTENDS
                com.sun.tools.javac.tree.JCTree$TypeBoundKind r2 = r2.TypeBoundKind(r3)
                r3 = r13
                r4 = r15
                r5 = r12
                com.sun.tools.javac.tree.JCTree$JCExpression r3 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r3, r4, r5)
                com.sun.tools.javac.tree.JCTree$JCWildcard r1 = r1.Wildcard(r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            L128:
                int r8 = r8 + (-1)
                r0 = r8
                if (r0 != 0) goto L132
                goto L16e
            L132:
                r0 = r16
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L35
                goto L16e
            L13f:
                r0 = r9
                if (r0 == 0) goto L15a
                r0 = r14
                r1 = r13
                r2 = r13
                com.sun.tools.javac.code.BoundKind r3 = com.sun.tools.javac.code.BoundKind.UNBOUND
                com.sun.tools.javac.tree.JCTree$TypeBoundKind r2 = r2.TypeBoundKind(r3)
                r3 = 0
                com.sun.tools.javac.tree.JCTree$JCWildcard r1 = r1.Wildcard(r2, r3)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
                goto L16e
            L15a:
                r0 = r14
                r1 = r10
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "Object"
                r3[r4] = r5
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
                com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            L16e:
                r0 = r8
                int r8 = r8 + (-1)
                if (r0 > 0) goto L13f
                r0 = r14
                com.sun.tools.javac.util.List r0 = r0.toList()
                return r0
        }

        protected com.sun.tools.javac.tree.JCTree.JCExpression getSize(lombok.javac.JavacTreeMaker r8, lombok.javac.JavacNode r9, com.sun.tools.javac.util.Name r10, boolean r11, boolean r12, java.lang.String r13) {
                r7 = this;
                r0 = r9
                r1 = r13
                com.sun.tools.javac.util.Name r0 = r0.toName(r1)
                r14 = r0
                r0 = r8
                r1 = r8
                r2 = r8
                r3 = r14
                com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
                r3 = r10
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r1 = r1.Select(r2, r3)
                r2 = r9
                java.lang.String r3 = "size"
                com.sun.tools.javac.util.Name r2 = r2.toName(r3)
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
                r15 = r0
                r0 = r8
                com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.nil()
                r2 = r15
                com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
                com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
                r16 = r0
                r0 = r11
                if (r0 == 0) goto L73
                r0 = r8
                lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
                r2 = r8
                r3 = r8
                r4 = r14
                com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
                r4 = r10
                com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
                r3 = r8
                lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
                r5 = 0
                com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
                com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
                r17 = r0
                r0 = r8
                r1 = r17
                r2 = r8
                lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_INT
                r4 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
                r3 = r16
                com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
                r18 = r0
                r0 = r12
                if (r0 == 0) goto L70
                r0 = r8
                r1 = r18
                com.sun.tools.javac.tree.JCTree$JCParens r0 = r0.Parens(r1)
                return r0
            L70:
                r0 = r18
                return r0
            L73:
                r0 = r16
                return r0
        }

        protected com.sun.tools.javac.tree.JCTree.JCExpression cloneParamType(int r7, lombok.javac.JavacTreeMaker r8, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r9, lombok.javac.JavacNode r10, lombok.javac.JavacNode r11) {
                r6 = this;
                r0 = r9
                if (r0 == 0) goto Lc
                r0 = r9
                int r0 = r0.size()
                r1 = r7
                if (r0 > r1) goto L1c
            Lc:
                r0 = r10
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = r1
                r3 = 0
                java.lang.String r4 = "Object"
                r2[r3] = r4
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
                return r0
            L1c:
                r0 = r9
                r1 = r7
                java.lang.Object r0 = r0.get(r1)
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
                r12 = r0
                r0 = r12
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.UNBOUNDED_WILDCARD
                if (r0 == r1) goto L3c
                r0 = r12
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.SUPER_WILDCARD
                if (r0 != r1) goto L4c
            L3c:
                r0 = r10
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = r1
                r3 = 0
                java.lang.String r4 = "Object"
                r2[r3] = r4
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
                return r0
            L4c:
                r0 = r12
                com.sun.source.tree.Tree$Kind r0 = r0.getKind()
                com.sun.source.tree.Tree$Kind r1 = com.sun.source.tree.Tree.Kind.EXTENDS_WILDCARD
                if (r0 != r1) goto L7a
                r0 = r8
                r1 = r12
                com.sun.tools.javac.tree.JCTree$JCWildcard r1 = (com.sun.tools.javac.tree.JCTree.JCWildcard) r1     // Catch: java.lang.Exception -> L69
                com.sun.tools.javac.tree.JCTree r1 = r1.inner     // Catch: java.lang.Exception -> L69
                com.sun.tools.javac.tree.JCTree$JCExpression r1 = (com.sun.tools.javac.tree.JCTree.JCExpression) r1     // Catch: java.lang.Exception -> L69
                r2 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)     // Catch: java.lang.Exception -> L69
                return r0
            L69:
                r0 = r10
                r1 = 1
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = r1
                r3 = 0
                java.lang.String r4 = "Object"
                r2[r3] = r4
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
                return r0
            L7a:
                r0 = r8
                r1 = r12
                r2 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.cloneType(r0, r1, r2)
                return r0
        }

        protected abstract java.lang.String getAddMethodName();

        protected abstract int getTypeArgumentsCount();

        protected abstract java.lang.String getEmptyMaker(java.lang.String r1);

        public com.sun.tools.javac.tree.JCTree.JCExpression getEmptyExpression(java.lang.String r8, lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, lombok.javac.JavacNode r12) {
                r7 = this;
                r0 = r7
                r1 = r8
                java.lang.String r0 = r0.getEmptyMaker(r1)
                r13 = r0
                r0 = r7
                r1 = r7
                int r1 = r1.getTypeArgumentsCount()
                r2 = 0
                r3 = r11
                r4 = r10
                com.sun.tools.javac.util.List r4 = r4.getTypeArgs()
                r5 = r12
                com.sun.tools.javac.util.List r0 = r0.createTypeArgs(r1, r2, r3, r4, r5)
                r14 = r0
                r0 = r9
                r1 = r14
                r2 = r11
                r3 = r13
                java.lang.String r4 = "\\."
                java.lang.String[] r3 = r3.split(r4)
                com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3)
                com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
                com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
                return r0
        }

        static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
                int[] r0 = lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer.$SWITCH_TABLE$lombok$core$AST$Kind
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
                lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer.$SWITCH_TABLE$lombok$core$AST$Kind = r1
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacSingularsRecipes$SingularData.SCL.lombok */
    public static final class SingularData {
        private final lombok.javac.JavacNode annotation;
        private final com.sun.tools.javac.util.Name singularName;
        private final com.sun.tools.javac.util.Name pluralName;
        private final com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> typeArgs;
        private final java.lang.String targetFqn;
        private final lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer singularizer;
        private final java.lang.String setterPrefix;
        private final boolean ignoreNullCollections;

        public SingularData(lombok.javac.JavacNode r11, com.sun.tools.javac.util.Name r12, com.sun.tools.javac.util.Name r13, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r14, java.lang.String r15, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer r16, boolean r17) {
                r10 = this;
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                java.lang.String r8 = ""
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public SingularData(lombok.javac.JavacNode r4, com.sun.tools.javac.util.Name r5, com.sun.tools.javac.util.Name r6, com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> r7, java.lang.String r8, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer r9, boolean r10, java.lang.String r11) {
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
                r1 = r11
                r0.setterPrefix = r1
                r0 = r3
                r1 = r10
                r0.ignoreNullCollections = r1
                return
        }

        public lombok.javac.JavacNode getAnnotation() {
                r2 = this;
                r0 = r2
                lombok.javac.JavacNode r0 = r0.annotation
                return r0
        }

        public com.sun.tools.javac.util.Name getSingularName() {
                r2 = this;
                r0 = r2
                com.sun.tools.javac.util.Name r0 = r0.singularName
                return r0
        }

        public com.sun.tools.javac.util.Name getPluralName() {
                r2 = this;
                r0 = r2
                com.sun.tools.javac.util.Name r0 = r0.pluralName
                return r0
        }

        public java.lang.String getSetterPrefix() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.setterPrefix
                return r0
        }

        public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCExpression> getTypeArgs() {
                r2 = this;
                r0 = r2
                com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree$JCExpression> r0 = r0.typeArgs
                return r0
        }

        public java.lang.String getTargetFqn() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.targetFqn
                return r0
        }

        public lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer getSingularizer() {
                r2 = this;
                r0 = r2
                lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.singularizer
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

        static /* synthetic */ com.sun.tools.javac.util.Name access$0(lombok.javac.handlers.JavacSingularsRecipes.SingularData r2) {
                r0 = r2
                com.sun.tools.javac.util.Name r0 = r0.pluralName
                return r0
        }

        static /* synthetic */ com.sun.tools.javac.util.Name access$1(lombok.javac.handlers.JavacSingularsRecipes.SingularData r2) {
                r0 = r2
                com.sun.tools.javac.util.Name r0 = r0.singularName
                return r0
        }

        static /* synthetic */ lombok.javac.JavacNode access$2(lombok.javac.handlers.JavacSingularsRecipes.SingularData r2) {
                r0 = r2
                lombok.javac.JavacNode r0 = r0.annotation
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/JavacSingularsRecipes$StatementMaker.SCL.lombok */
    public interface StatementMaker {
        com.sun.tools.javac.tree.JCTree.JCStatement make();
    }

    static {
            lombok.javac.handlers.JavacSingularsRecipes r0 = new lombok.javac.handlers.JavacSingularsRecipes
            r1 = r0
            r1.<init>()
            lombok.javac.handlers.JavacSingularsRecipes.INSTANCE = r0
            return
    }

    private JavacSingularsRecipes() {
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
            java.util.Map<java.lang.String, lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer> r1 = r1.singularizers     // Catch: java.io.IOException -> L2f
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

    private static void loadAll(lombok.core.TypeLibrary r5, java.util.Map<java.lang.String, lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer> r6) throws java.io.IOException {
            java.lang.Class<lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer> r0 = lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer.class
            java.lang.Class<lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer> r1 = lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Iterable r0 = lombok.core.SpiLoadUtil.findServices(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lb3
        L13:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = (lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer) r0
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
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = (lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer) r0
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

    public static lombok.javac.handlers.JavacSingularsRecipes get() {
            lombok.javac.handlers.JavacSingularsRecipes r0 = lombok.javac.handlers.JavacSingularsRecipes.INSTANCE
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

    public lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer getSingularizer(java.lang.String r5, lombok.javac.JavacNode r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer> r0 = r0.singularizers
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = (lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer) r0
            r7 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r6
            lombok.javac.JavacAST r1 = r1.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r2 = lombok.ConfigurationKeys.SINGULAR_USE_GUAVA
            java.lang.Object r1 = r1.readConfiguration(r2)
            boolean r0 = r0.equals(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L2d
            r0 = r7
            r1 = r6
            lombok.javac.handlers.JavacSingularsRecipes$JavacSingularizer r0 = r0.getGuavaInstead(r1)
            goto L2e
        L2d:
            r0 = r7
        L2e:
            return r0
    }
}
