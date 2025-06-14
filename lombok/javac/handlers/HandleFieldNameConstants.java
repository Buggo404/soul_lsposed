package lombok.javac.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleFieldNameConstants.SCL.lombok */
public class HandleFieldNameConstants extends lombok.javac.JavacAnnotationHandler<lombok.experimental.FieldNameConstants> {
    private static final lombok.core.configuration.IdentifierName FIELDS = null;

    static {
            java.lang.String r0 = "Fields"
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)
            lombok.javac.handlers.HandleFieldNameConstants.FIELDS = r0
            return
    }

    public HandleFieldNameConstants() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public void generateFieldNameConstantsForType(lombok.javac.JavacNode r10, lombok.javac.JavacNode r11, lombok.AccessLevel r12, boolean r13, lombok.core.configuration.IdentifierName r14, boolean r15, boolean r16) {
            r9 = this;
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isClassEnumOrRecord(r0)
            if (r0 != 0) goto Le
            r0 = r11
            java.lang.String r1 = "@FieldNameConstants is only supported on a class, an enum or a record."
            r0.addError(r1)
            return
        Le:
            r0 = r10
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.isStaticAllowed(r0)
            if (r0 != 0) goto L1c
            r0 = r11
            java.lang.String r1 = "@FieldNameConstants is not supported on non-static nested classes."
            r0.addError(r1)
            return
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r10
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r19 = r0
            goto L52
        L31:
            r0 = r19
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r18 = r0
            r0 = r9
            r1 = r18
            r2 = r15
            boolean r0 = r0.fieldQualifiesForFieldNameConstantsGeneration(r1, r2)
            if (r0 == 0) goto L52
            r0 = r17
            r1 = r18
            boolean r0 = r0.add(r1)
        L52:
            r0 = r19
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L31
            r0 = r17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6f
            r0 = r11
            java.lang.String r1 = "No fields qualify for @FieldNameConstants, therefore this annotation does nothing"
            r0.addWarning(r1)
            goto L7e
        L6f:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r17
            r5 = r13
            r6 = r14
            r7 = r16
            r0.createInnerTypeFieldNameConstants(r1, r2, r3, r4, r5, r6, r7)
        L7e:
            return
    }

    private boolean fieldQualifiesForFieldNameConstantsGeneration(lombok.javac.JavacNode r6, boolean r7) {
            r5 = this;
            r0 = r6
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.Class<lombok.experimental.FieldNameConstants$Exclude> r0 = lombok.experimental.FieldNameConstants.Exclude.class
            r1 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            r8 = r0
            java.lang.Class<lombok.experimental.FieldNameConstants$Include> r0 = lombok.experimental.FieldNameConstants.Include.class
            r1 = r6
            boolean r0 = lombok.javac.handlers.JavacHandlerUtil.hasAnnotationAndDeleteIfNeccessary(r0, r1)
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r9
            if (r0 == 0) goto L28
            r0 = 1
            return r0
        L28:
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = 0
            return r0
        L2e:
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "$"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L49
            r0 = 0
            return r0
        L49:
            r0 = r10
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5c
            r0 = 0
            return r0
        L5c:
            r0 = 1
            return r0
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.FieldNameConstants> r10, com.sun.tools.javac.tree.JCTree.JCAnnotation r11, lombok.javac.JavacNode r12) {
            r9 = this;
            r0 = r12
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_FLAG_USAGE
            java.lang.String r2 = "@FieldNameConstants"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r12
            java.lang.Class<lombok.experimental.FieldNameConstants> r1 = lombok.experimental.FieldNameConstants.class
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1)
            r0 = r12
            java.lang.String r1 = "lombok.AccessLevel"
            lombok.javac.handlers.JavacHandlerUtil.deleteImportFromCompilationUnit(r0, r1)
            r0 = r12
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r13 = r0
            r0 = r10
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.experimental.FieldNameConstants r0 = (lombok.experimental.FieldNameConstants) r0
            r14 = r0
            r0 = r14
            lombok.AccessLevel r0 = r0.level()
            r15 = r0
            r0 = r14
            boolean r0 = r0.asEnum()
            r16 = r0
            r0 = r10
            java.lang.String r1 = "prefix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L5a
            r0 = r10
            java.lang.String r1 = "suffix"
            boolean r0 = r0.isExplicit(r1)
            if (r0 != 0) goto L5a
            r0 = r13
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L5a
            r0 = 0
            goto L5b
        L5a:
            r0 = 1
        L5b:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L69
            r0 = r12
            java.lang.String r1 = "@FieldNameConstants has been redesigned in lombok v1.18.4; please upgrade your project dependency on lombok. See https://projectlombok.org/features/experimental/FieldNameConstants for more information."
            r0.addError(r1)
            return
        L69:
            r0 = r15
            lombok.AccessLevel r1 = lombok.AccessLevel.NONE
            if (r0 != r1) goto L78
            r0 = r12
            java.lang.String r1 = "AccessLevel.NONE is not compatible with @FieldNameConstants. If you don't want the inner type, simply remove @FieldNameConstants."
            r0.addWarning(r1)
            return
        L78:
            r0 = r14
            java.lang.String r0 = r0.innerTypeName()     // Catch: java.lang.IllegalArgumentException -> L87
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L87
            r18 = r0
            goto La8
        L87:
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "InnerTypeName "
            r2.<init>(r3)
            r2 = r14
            java.lang.String r2 = r2.innerTypeName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is not a valid Java identifier."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        La8:
            r0 = r18
            if (r0 != 0) goto Lbc
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.IdentifierName> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_INNER_TYPE_NAME
            java.lang.Object r0 = r0.readConfiguration(r1)
            lombok.core.configuration.IdentifierName r0 = (lombok.core.configuration.IdentifierName) r0
            r18 = r0
        Lbc:
            r0 = r18
            if (r0 != 0) goto Lc6
            lombok.core.configuration.IdentifierName r0 = lombok.javac.handlers.HandleFieldNameConstants.FIELDS
            r18 = r0
        Lc6:
            r0 = r12
            lombok.javac.JavacAST r0 = r0.getAst()
            lombok.core.configuration.ConfigurationKey<java.lang.Boolean> r1 = lombok.ConfigurationKeys.FIELD_NAME_CONSTANTS_UPPERCASE
            java.lang.Object r0 = r0.readConfiguration(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r19 = r0
            r0 = r19
            if (r0 != 0) goto Le0
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r19 = r0
        Le0:
            r0 = r9
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r14
            boolean r6 = r6.onlyExplicitlyIncluded()
            r7 = r19
            boolean r7 = r7.booleanValue()
            r0.generateFieldNameConstantsForType(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void createInnerTypeFieldNameConstants(lombok.javac.JavacNode r11, lombok.javac.JavacNode r12, lombok.AccessLevel r13, java.util.List<lombok.javac.JavacNode> r14, boolean r15, lombok.core.configuration.IdentifierName r16, boolean r17) {
            r10 = this;
            r0 = r14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            r0 = r11
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r18 = r0
            r0 = r18
            r1 = r13
            int r1 = lombok.javac.handlers.JavacHandlerUtil.toJavacModifier(r1)
            r2 = r15
            if (r2 == 0) goto L22
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L24
        L22:
            r2 = 24
        L24:
            r1 = r1 | r2
            long r1 = (long) r1
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r19 = r0
            r0 = r11
            r1 = r16
            java.lang.String r1 = r1.getName()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r20 = r0
            r0 = r11
            r1 = r16
            java.lang.String r1 = r1.getName()
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.findInnerClass(r0, r1)
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r21
            if (r0 != 0) goto L73
            r0 = r18
            r1 = r19
            r2 = r20
            com.sun.tools.javac.util.List r3 = com.sun.tools.javac.util.List.nil()
            r4 = 0
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = r0.ClassDef(r1, r2, r3, r4, r5, r6)
            r23 = r0
            r0 = r11
            r1 = r23
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectType(r0, r1)
            r21 = r0
            r0 = r23
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = 1
            r22 = r0
            goto Lf3
        L73:
            r0 = r21
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            r23 = r0
            r0 = r23
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.getModifiers()
            long r0 = r0.flags
            r24 = r0
            r0 = r15
            if (r0 == 0) goto Lb4
            r0 = r24
            r1 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb4
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Existing "
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be declared as an 'enum'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lb4:
            r0 = r15
            if (r0 != 0) goto Le1
            r0 = r24
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le1
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Existing "
            r2.<init>(r3)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be declared as a 'static class'."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Le1:
            r0 = r21
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.constructorExists(r0)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 != r1) goto Lf0
            r0 = 1
            goto Lf1
        Lf0:
            r0 = 0
        Lf1:
            r22 = r0
        Lf3:
            r0 = r22
            if (r0 == 0) goto L161
            r0 = r18
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r2 = r15
            if (r2 == 0) goto L106
            r2 = 0
            goto L109
        L106:
            r2 = 2
        L109:
            long r1 = r1 | r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r23 = r0
            r0 = r18
            r1 = 0
            r2 = r18
            r3 = r18
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = r18
            r6 = r11
            java.lang.String r7 = "super"
            com.sun.tools.javac.util.Name r6 = r6.toName(r7)
            com.sun.tools.javac.tree.JCTree$JCIdent r5 = r5.Ident(r6)
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r3 = r3.Apply(r4, r5, r6)
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r2 = r2.Exec(r3)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r24 = r0
            r0 = r18
            r1 = r23
            r2 = r11
            java.lang.String r3 = "<init>"
            com.sun.tools.javac.util.Name r2 = r2.toName(r3)
            r3 = 0
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r5 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.util.List r6 = com.sun.tools.javac.util.List.nil()
            r7 = r24
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r25 = r0
            r0 = r25
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            r0 = r21
            r1 = r25
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L161:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r14
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L240
        L176:
            r0 = r25
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r24 = r0
            r0 = r24
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            r26 = r0
            r0 = r17
            if (r0 == 0) goto L1a2
            r0 = r11
            r1 = r26
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = lombok.core.handlers.HandlerUtil.camelCaseToConstant(r1)
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r26 = r0
        L1a2:
            r0 = r26
            java.lang.String r0 = r0.toString()
            r1 = r21
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r0 = lombok.javac.handlers.JavacHandlerUtil.fieldExists(r0, r1)
            lombok.javac.handlers.JavacHandlerUtil$MemberExistsResult r1 = lombok.javac.handlers.JavacHandlerUtil.MemberExistsResult.NOT_EXISTS
            if (r0 == r1) goto L1b5
            goto L240
        L1b5:
            r0 = r18
            r1 = 25
            r2 = r15
            if (r2 == 0) goto L1c5
            r2 = 16384(0x4000, double:8.0948E-320)
            goto L1c6
        L1c5:
            r2 = 0
        L1c6:
            long r1 = r1 | r2
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r27 = r0
            r0 = r15
            if (r0 == 0) goto L1f3
            r0 = r18
            r1 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r0 = r0.Ident(r1)
            r28 = r0
            r0 = r18
            r1 = 0
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            r3 = r18
            r4 = r20
            com.sun.tools.javac.tree.JCTree$JCIdent r3 = r3.Ident(r4)
            com.sun.tools.javac.util.List r4 = com.sun.tools.javac.util.List.nil()
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCNewClass r0 = r0.NewClass(r1, r2, r3, r4, r5)
            r29 = r0
            goto L216
        L1f3:
            r0 = r24
            java.lang.String r1 = "java"
            java.lang.String r2 = "lang"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "String"
            r4[r5] = r6
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.handlers.JavacHandlerUtil.chainDots(r0, r1, r2, r3)
            r28 = r0
            r0 = r18
            r1 = r24
            java.lang.String r1 = r1.getName()
            com.sun.tools.javac.tree.JCTree$JCLiteral r0 = r0.Literal(r1)
            r29 = r0
        L216:
            r0 = r18
            r1 = r27
            r2 = r26
            r3 = r28
            r4 = r29
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = r0.VarDef(r1, r2, r3, r4)
            r30 = r0
            r0 = r21
            r1 = r30
            r2 = 0
            r3 = 1
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.injectField(r0, r1, r2, r3)
            r0 = r30
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r23
            r1 = r30
            boolean r0 = r0.add(r1)
        L240:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L176
            r0 = r23
            java.util.Iterator r0 = r0.iterator()
            r25 = r0
            goto L269
        L256:
            r0 = r25
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r24 = r0
            r0 = r24
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
        L269:
            r0 = r25
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L256
            return
    }
}
