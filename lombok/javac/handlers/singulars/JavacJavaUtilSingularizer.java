package lombok.javac.handlers.singulars;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/singulars/JavacJavaUtilSingularizer.SCL.lombok */
abstract class JavacJavaUtilSingularizer extends lombok.javac.handlers.JavacSingularsRecipes.JavacSingularizer {
    JavacJavaUtilSingularizer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createJavaUtilSetMapInitialCapacitySwitchStatements(lombok.javac.JavacTreeMaker r13, lombok.javac.handlers.JavacSingularsRecipes.SingularData r14, lombok.javac.JavacNode r15, boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, lombok.javac.JavacNode r20, java.lang.String r21) {
            r12 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r22 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r17
            if (r0 == 0) goto L6e
            r0 = r13
            r1 = r22
            r2 = r15
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            r8 = r17
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r22
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r25 = r0
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r25
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r24 = r0
            r0 = r13
            r1 = 0
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = r0.Break(r1)
            r25 = r0
            r0 = r13
            r1 = r13
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_INT
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            r2 = r24
            r3 = r25
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r26 = r0
            r0 = r23
            r1 = r26
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L6e:
            r0 = r18
            if (r0 == 0) goto L178
            r0 = r13
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            r25 = r0
            r0 = r13
            r1 = r22
            r2 = r15
            r3 = r21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r16
            if (r5 == 0) goto L9e
            java.lang.String r5 = "$key"
            goto La0
        L9e:
            java.lang.String r5 = ""
        La0:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "get"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r25
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r26 = r0
            r0 = r16
            if (r0 == 0) goto L116
            r0 = r13
            lombok.javac.JavacTreeMaker$TypeTag r1 = lombok.javac.Javac.CTC_INT
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1, r2)
            r28 = r0
            r0 = r13
            r1 = r22
            r2 = r15
            r3 = r21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r16
            if (r5 == 0) goto Lec
            java.lang.String r5 = "$value"
            goto Lee
        Lec:
            java.lang.String r5 = ""
        Lee:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "get"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r28
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r29 = r0
            r0 = r26
            r1 = r29
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            r27 = r0
            goto L11d
        L116:
            r0 = r26
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r27 = r0
        L11d:
            r0 = r13
            r1 = r22
            r2 = r15
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            r8 = r18
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r28 = r0
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r24 = r0
            r0 = r13
            r1 = 0
            com.sun.tools.javac.tree.JCTree$JCBreak r0 = r0.Break(r1)
            r25 = r0
            r0 = r13
            r1 = r13
            lombok.javac.JavacTreeMaker$TypeTag r2 = lombok.javac.Javac.CTC_INT
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.sun.tools.javac.tree.JCTree$JCLiteral r1 = r1.Literal(r2, r3)
            r2 = r24
            r3 = r25
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r26 = r0
            r0 = r23
            r1 = r26
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L178:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = 0
            r6 = 1
            r7 = r17
            if (r7 != 0) goto L189
            r7 = 1
            goto L18a
        L189:
            r7 = 0
        L18a:
            r8 = r19
            r9 = r20
            r10 = r21
            com.sun.tools.javac.util.List r0 = r0.createJavaUtilSimpleCreationAndFillStatements(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r24 = r0
            r0 = r13
            r1 = 0
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCCase r0 = r0.Case(r1, r2)
            r25 = r0
            r0 = r23
            r1 = r25
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r13
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            if (r4 == 0) goto L1cc
            r4 = r15
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = r5
            r6.<init>()
            r6 = r14
            com.sun.tools.javac.util.Name r6 = r6.getPluralName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "$key"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.sun.tools.javac.util.Name r4 = r4.toName(r5)
            goto L1d0
        L1cc:
            r4 = r14
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
        L1d0:
            r5 = 1
            r6 = 0
            r7 = r21
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.getSize(r2, r3, r4, r5, r6, r7)
            r2 = r23
            com.sun.tools.javac.util.List r2 = r2.toList()
            com.sun.tools.javac.tree.JCTree$JCSwitch r0 = r0.Switch(r1, r2)
            r24 = r0
            r0 = r15
            r1 = r14
            java.lang.String r1 = r1.getTargetFqn()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r25 = r0
            r0 = r12
            r1 = r16
            if (r1 == 0) goto L1f5
            r1 = 2
            goto L1f6
        L1f5:
            r1 = 1
        L1f6:
            r2 = 0
            r3 = r15
            r4 = r25
            r5 = r14
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r20
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r25 = r0
            r0 = r13
            r1 = r13
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r25
            r4 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r26 = r0
            r0 = r26
            r1 = r24
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1)
            return r0
    }

    protected com.sun.tools.javac.tree.JCTree.JCStatement createConstructBuilderVarIfNeeded(lombok.javac.JavacTreeMaker r9, lombok.javac.handlers.JavacSingularsRecipes.SingularData r10, lombok.javac.JavacNode r11, boolean r12, lombok.javac.JavacNode r13) {
            r8 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r14 = r0
            r0 = r12
            if (r0 == 0) goto L27
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r10
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "$key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            goto L2b
        L27:
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.getPluralName()
        L2b:
            r15 = r0
            r0 = r12
            if (r0 == 0) goto L4f
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r10
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "$value"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            goto L50
        L4f:
            r0 = 0
        L50:
            r16 = r0
            r0 = r9
            r1 = r9
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r17 = r0
            r0 = r9
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_EQUAL
            r2 = r17
            r3 = r9
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r18 = r0
            r0 = r9
            r1 = r9
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r15
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r17 = r0
            r0 = r11
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ArrayList"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r19 = r0
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r11
            r4 = r19
            r5 = r10
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r19 = r0
            r0 = r9
            r1 = 0
            r2 = r14
            r3 = r19
            r4 = r14
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r9
            r1 = r9
            r2 = r17
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r21 = r0
            r0 = r12
            if (r0 == 0) goto L151
            r0 = r9
            r1 = r9
            r2 = r11
            java.lang.String r3 = "this"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r17 = r0
            r0 = r11
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "ArrayList"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r23 = r0
            r0 = r10
            com.sun.tools.javac.util.List r0 = r0.getTypeArgs()
            r24 = r0
            r0 = r24
            if (r0 == 0) goto L110
            r0 = r24
            com.sun.tools.javac.util.List r0 = r0.tail
            if (r0 == 0) goto L110
            r0 = r24
            com.sun.tools.javac.util.List r0 = r0.tail
            r24 = r0
            goto L115
        L110:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r24 = r0
        L115:
            r0 = r8
            r1 = 1
            r2 = 0
            r3 = r11
            r4 = r23
            r5 = r24
            r6 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r23 = r0
            r0 = r9
            r1 = 0
            r2 = r14
            r3 = r23
            r4 = r14
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r20 = r0
            r0 = r9
            r1 = r9
            r2 = r17
            r3 = r20
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r25 = r0
            r0 = r9
            r1 = 0
            r2 = r21
            r3 = r25
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r22 = r0
            goto L155
        L151:
            r0 = r21
            r22 = r0
        L155:
            r0 = r9
            r1 = r18
            r2 = r22
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            return r0
    }

    protected com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree.JCStatement> createJavaUtilSimpleCreationAndFillStatements(lombok.javac.JavacTreeMaker r13, lombok.javac.handlers.JavacSingularsRecipes.SingularData r14, lombok.javac.JavacNode r15, boolean r16, boolean r17, boolean r18, boolean r19, java.lang.String r20, lombok.javac.JavacNode r21, java.lang.String r22) {
            r12 = this;
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r23 = r0
            r0 = r15
            r1 = r22
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r24 = r0
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r26 = r0
            r0 = r18
            if (r0 == 0) goto Lf0
            r0 = r16
            if (r0 == 0) goto L39
            r0 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "$key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            goto L3d
        L39:
            r0 = r14
            com.sun.tools.javac.util.Name r0 = r0.getPluralName()
        L3d:
            r27 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_LESS_THAN
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r27
            r6 = r19
            r7 = 1
            r8 = r22
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.getSize(r3, r4, r5, r6, r7, r8)
            r3 = r13
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            r5 = 1073741824(0x40000000, float:2.0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r28 = r0
            r0 = r15
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Integer"
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.lang.String r4 = "MAX_VALUE"
            r2[r3] = r4
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r0, r1)
            r29 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r13
            lombok.javac.JavacTreeMaker$TypeTag r3 = lombok.javac.Javac.CTC_INT
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.sun.tools.javac.tree.JCTree$JCLiteral r2 = r2.Literal(r3, r4)
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r27
            r7 = r19
            r8 = 1
            r9 = r22
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.getSize(r4, r5, r6, r7, r8, r9)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r30 = r0
            r0 = r13
            r1 = r13
            lombok.javac.JavacTreeMaker$TreeTag r2 = lombok.javac.Javac.CTC_MINUS
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r27
            r7 = r19
            r8 = 1
            r9 = r22
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.getSize(r4, r5, r6, r7, r8, r9)
            r4 = r13
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_INT
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCBinary r1 = r1.Binary(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCParens r0 = r0.Parens(r1)
            r31 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_DIV
            r2 = r31
            r3 = r13
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r32 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_PLUS
            r2 = r30
            r3 = r32
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r33 = r0
            r0 = r13
            r1 = r28
            r2 = r33
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCConditional r0 = r0.Conditional(r1, r2, r3)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r26 = r0
        Lf0:
            r0 = r15
            java.lang.String r1 = "java"
            java.lang.String r2 = "util"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            r6 = r20
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r27 = r0
            r0 = r12
            r1 = r16
            if (r1 == 0) goto L10d
            r1 = 2
            goto L10e
        L10d:
            r1 = 1
        L10e:
            r2 = 0
            r3 = r15
            r4 = r27
            r5 = r14
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r21
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r27 = r0
            r0 = r13
            r1 = 0
            r2 = r23
            r3 = r27
            r4 = r26
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r28 = r0
            r0 = r17
            if (r0 == 0) goto L16a
            r0 = r15
            r1 = r14
            java.lang.String r1 = r1.getTargetFqn()
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDotsString(r0, r1)
            r29 = r0
            r0 = r12
            r1 = r16
            if (r1 == 0) goto L144
            r1 = 2
            goto L145
        L144:
            r1 = 1
        L145:
            r2 = 0
            r3 = r15
            r4 = r29
            r5 = r14
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r21
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.addTypeArgs(r1, r2, r3, r4, r5, r6)
            r29 = r0
            r0 = r13
            r1 = r13
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            r3 = r29
            r4 = r28
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r25 = r0
            goto L17e
        L16a:
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r28
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r25 = r0
        L17e:
            r0 = r16
            if (r0 == 0) goto L2bf
            r0 = r15
            java.lang.String r1 = "$i"
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r27 = r0
            r0 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "$key"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r28 = r0
            r0 = r13
            r1 = r13
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r15
            java.lang.String r3 = "put"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r29 = r0
            r0 = r13
            r1 = r23
            r2 = r15
            r3 = r22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "$key"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "get"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r13
            r4 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r30 = r0
            r0 = r13
            r1 = r23
            r2 = r15
            r3 = r22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "$value"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "get"
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r13
            r4 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r31 = r0
            r0 = r13
            r1 = r12
            r2 = 2
            r3 = 0
            r4 = r15
            r5 = r14
            com.sun.tools.javac.util.List r5 = r5.getTypeArgs()
            r6 = r21
            com.sun.tools.javac.util.List r1 = r1.createTypeArgs(r2, r3, r4, r5, r6)
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r2 = r31
            com.sun.tools.javac.tree.JCTree$JCTypeCast r0 = r0.TypeCast(r1, r2)
            r31 = r0
            r0 = r13
            r1 = r13
            r2 = r23
            r3 = r29
            r4 = r30
            r5 = r31
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r32 = r0
            r0 = r13
            r1 = r13
            r2 = 0
            com.sun.tools.javac.tree.JCTree$JCModifiers r1 = r1.Modifiers(r2)
            r2 = r27
            r3 = r13
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_INT
            com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree r3 = r3.TypeIdent(r4)
            r4 = r13
            lombok.javac.JavacTreeMaker$TypeTag r5 = lombok.javac.Javac.CTC_INT
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.sun.tools.javac.tree.JCTree$JCLiteral r4 = r4.Literal(r5, r6)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r33 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_LESS_THAN
            r2 = r13
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r28
            r7 = r19
            r8 = 1
            r9 = r22
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.getSize(r4, r5, r6, r7, r8, r9)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r34 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_POSTINC
            r2 = r13
            r3 = r27
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            com.sun.tools.javac.tree.JCTree$JCUnary r0 = r0.Unary(r1, r2)
            r35 = r0
            r0 = r13
            r1 = r33
            com.sun.tools.javac.util.List r1 = com.sun.tools.javac.util.List.of(r1)
            r2 = r34
            r3 = r13
            r4 = r35
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r3 = r3.Exec(r4)
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            r4 = r32
            com.sun.tools.javac.tree.JCTree$JCForLoop r0 = r0.ForLoop(r1, r2, r3, r4)
            r26 = r0
            goto L2f3
        L2bf:
            r0 = r13
            r1 = r13
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            r0 = r13
            r1 = r13
            r2 = r23
            r3 = r13
            r4 = r13
            r5 = r14
            com.sun.tools.javac.util.Name r5 = r5.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r4 = r4.Ident(r5)
            r5 = r15
            java.lang.String r6 = "addAll"
            com.sun.tools.javac.util.Name r5 = r5.toName(r6)
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r3 = r3.Select(r4, r5)
            r4 = r27
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.of(r4)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r1 = r1.Apply(r2, r3, r4)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r26 = r0
        L2f3:
            r0 = r19
            if (r0 == 0) goto L348
            r0 = r13
            r1 = r13
            r2 = r24
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            r2 = r16
            if (r2 == 0) goto L321
            r2 = r15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            r4 = r14
            com.sun.tools.javac.util.Name r4 = r4.getPluralName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "$key"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            goto L325
        L321:
            r2 = r14
            com.sun.tools.javac.util.Name r2 = r2.getPluralName()
        L325:
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = r0.Select(r1, r2)
            r27 = r0
            r0 = r13
            lombok.javac.JavacTreeMaker$TreeTag r1 = lombok.javac.Javac.CTC_NOT_EQUAL
            r2 = r27
            r3 = r13
            lombok.javac.JavacTreeMaker$TypeTag r4 = lombok.javac.Javac.CTC_BOT
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCLiteral r3 = r3.Literal(r4, r5)
            com.sun.tools.javac.tree.JCTree$JCBinary r0 = r0.Binary(r1, r2, r3)
            r28 = r0
            r0 = r13
            r1 = r28
            r2 = r26
            r3 = 0
            com.sun.tools.javac.tree.JCTree$JCIf r0 = r0.m81If(r1, r2, r3)
            r26 = r0
        L348:
            r0 = r13
            r1 = r14
            com.sun.tools.javac.util.Name r1 = r1.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r28 = r0
            r0 = r13
            r1 = r23
            r2 = r15
            java.lang.String r3 = "java"
            java.lang.String r4 = "util"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "Collections"
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = r8
            java.lang.String r10 = "unmodifiable"
            r9.<init>(r10)
            r9 = r14
            java.lang.String r9 = r9.getTargetSimpleType()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6[r7] = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r2, r3, r4, r5)
            r3 = r28
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.of(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r29 = r0
            r0 = r13
            r1 = r13
            r2 = r13
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.getPluralName()
            com.sun.tools.javac.tree.JCTree$JCIdent r2 = r2.Ident(r3)
            r3 = r29
            com.sun.tools.javac.tree.JCTree$JCAssign r1 = r1.Assign(r2, r3)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
            r27 = r0
            r0 = r25
            r1 = r26
            r2 = r27
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0, r1, r2)
            return r0
    }
}
