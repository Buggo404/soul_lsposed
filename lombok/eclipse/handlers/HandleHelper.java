package lombok.eclipse.handlers;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleHelper.SCL.lombok */
public class HandleHelper extends lombok.eclipse.EclipseAnnotationHandler<lombok.experimental.Helper> {


    public HandleHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private org.eclipse.jdt.internal.compiler.ast.Statement[] getStatementsFromAstNode(org.eclipse.jdt.internal.compiler.ast.ASTNode r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Block
            if (r0 == 0) goto Lf
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.Block r0 = (org.eclipse.jdt.internal.compiler.ast.Block) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            return r0
        Lf:
            r0 = r3
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L1e
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            return r0
        L1e:
            r0 = r3
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            if (r0 == 0) goto L2d
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = (org.eclipse.jdt.internal.compiler.ast.SwitchStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
            return r0
        L2d:
            r0 = 0
            return r0
    }

    private void setStatementsOfAstNode(org.eclipse.jdt.internal.compiler.ast.ASTNode r7, org.eclipse.jdt.internal.compiler.ast.Statement[] r8) {
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Block
            if (r0 == 0) goto L12
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Block r0 = (org.eclipse.jdt.internal.compiler.ast.Block) r0
            r1 = r8
            r0.statements = r1
            goto L51
        L12:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L24
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r1 = r8
            r0.statements = r1
            goto L51
        L24:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SwitchStatement
            if (r0 == 0) goto L36
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.SwitchStatement r0 = (org.eclipse.jdt.internal.compiler.ast.SwitchStatement) r0
            r1 = r8
            r0.statements = r1
            goto L51
        L36:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Can't set statements on node type: "
            r3.<init>(r4)
            r3 = r7
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L51:
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.Helper> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.HELPER_FLAG_USAGE
            java.lang.String r2 = "@Helper"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1b
            r0 = 0
            goto L23
        L1b:
            r0 = r11
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
        L23:
            r12 = r0
            r0 = r7
            r1 = r12
            if (r1 != 0) goto L2f
            r1 = 0
            goto L37
        L2f:
            r1 = r12
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
        L37:
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.getStatementsFromAstNode(r1)
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L51
            r0 = r11
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L51
            r0 = r13
            if (r0 != 0) goto L58
        L51:
            r0 = r10
            java.lang.String r1 = "@Helper is legal only on method-local classes."
            r0.addError(r1)
            return
        L58:
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r14 = r0
            r0 = -1
            r15 = r0
            r0 = 0
            r16 = r0
            goto L7f
        L6b:
            r0 = r13
            r1 = r16
            r0 = r0[r1]
            r1 = r14
            if (r0 != r1) goto L7c
            r0 = r16
            r15 = r0
            goto L87
        L7c:
            int r16 = r16 + 1
        L7f:
            r0 = r16
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto L6b
        L87:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r14
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r20 = r1
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r18 = r0
            goto Le2
        La1:
            r0 = r20
            r1 = r18
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto Lb3
            goto Ldf
        Lb3:
            r0 = r17
            char[] r0 = r0.selector
            r21 = r0
            r0 = r21
            if (r0 == 0) goto Ldf
            r0 = r21
            int r0 = r0.length
            if (r0 <= 0) goto Ldf
            r0 = r21
            r1 = 0
            char r0 = r0[r1]
            r1 = 60
            if (r0 == r1) goto Ldf
            r0 = r16
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r21
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        Ldf:
            int r18 = r18 + 1
        Le2:
            r0 = r18
            r1 = r19
            if (r0 < r1) goto La1
            r0 = r16
            java.util.Collections.sort(r0)
            r0 = r16
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r17 = r0
            r0 = r14
            char[] r0 = r0.name
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r18 = r0
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r19 = r0
            r0 = r18
            r1 = 0
            r2 = 36
            r0[r1] = r2
            r0 = r14
            char[] r0 = r0.name
            r1 = 0
            r2 = r18
            r3 = 1
            r4 = r18
            int r4 = r4.length
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            lombok.eclipse.handlers.HandleHelper$1 r0 = new lombok.eclipse.handlers.HandleHelper$1
            r1 = r0
            r2 = r7
            r3 = r17
            r4 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5)
            r20 = r0
            r0 = r15
            r1 = 1
            int r0 = r0 + r1
            r21 = r0
            goto L14d
        L13f:
            r0 = r13
            r1 = r21
            r0 = r0[r1]
            r1 = r20
            r2 = 0
            r0.traverse(r1, r2)
            int r21 = r21 + 1
        L14d:
            r0 = r21
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto L13f
            r0 = r19
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L163
            r0 = r10
            java.lang.String r1 = "No methods of this helper class are ever used."
            r0.addWarning(r1)
            return
        L163:
            r0 = r13
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = new org.eclipse.jdt.internal.compiler.ast.Statement[r0]
            r21 = r0
            r0 = r13
            r1 = 0
            r2 = r21
            r3 = 0
            r4 = r15
            r5 = 1
            int r4 = r4 + r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r2 = r21
            r3 = r15
            r4 = 2
            int r3 = r3 + r4
            r4 = r13
            int r4 = r4.length
            r5 = r15
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            r1 = r0
            r2 = r18
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r22 = r0
            r0 = r22
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
            org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = new org.eclipse.jdt.internal.compiler.ast.AllocationExpression
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r14
            char[] r3 = r3.name
            r4 = 0
            r2.<init>(r3, r4)
            r0.type = r1
            r0 = r22
            r1 = r23
            r0.initialization = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r2 = r1
            r3 = r14
            char[] r3 = r3.name
            r4 = 0
            r2.<init>(r3, r4)
            r0.type = r1
            lombok.eclipse.handlers.SetGeneratedByVisitor r0 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r1 = r0
            r2 = r10
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r1.<init>(r2)
            r24 = r0
            r0 = r22
            r1 = r24
            r2 = 0
            r0.traverse(r1, r2)
            r0 = r21
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r2 = r22
            r0[r1] = r2
            r0 = r7
            r1 = r12
            java.lang.Object r1 = r1.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r1
            r2 = r21
            r0.setStatementsOfAstNode(r1, r2)
            return
    }
}
