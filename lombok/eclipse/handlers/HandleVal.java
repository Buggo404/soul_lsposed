package lombok.eclipse.handlers;

@lombok.eclipse.DeferUntilPostDiet
@lombok.core.HandlerPriority(65536)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandleVal.SCL.lombok */
public class HandleVal extends lombok.eclipse.EclipseASTAdapter {
    public HandleVal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseASTAdapter, lombok.eclipse.EclipseASTVisitor
    public void visitLocal(lombok.eclipse.EclipseNode r6, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r7) {
            r5 = this;
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r8 = r0
            java.lang.Class<lombok.val> r0 = lombok.val.class
            r1 = r6
            r2 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            r9 = r0
            java.lang.Class<lombok.var> r0 = lombok.var.class
            r1 = r6
            r2 = r8
            boolean r0 = lombok.eclipse.handlers.EclipseHandlerUtil.typeMatches(r0, r1, r2)
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L22
            r0 = r10
            if (r0 != 0) goto L22
            return
        L22:
            r0 = r9
            if (r0 == 0) goto L30
            r0 = r6
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VAL_FLAG_USAGE
            java.lang.String r2 = "val"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L30:
            r0 = r10
            if (r0 == 0) goto L3e
            r0 = r6
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.VAR_FLAG_USAGE
            java.lang.String r2 = "var"
            lombok.core.handlers.HandlerUtil.handleFlagUsage(r0, r1, r2)
        L3e:
            r0 = 0
            r11 = r0
            r0 = r6
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ForeachStatement
            if (r0 == 0) goto L70
            r0 = r6
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ForeachStatement r0 = (org.eclipse.jdt.internal.compiler.ast.ForeachStatement) r0
            r12 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r7
            if (r0 != r1) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            r11 = r0
        L70:
            r0 = r9
            if (r0 == 0) goto L7a
            java.lang.String r0 = "val"
            goto L7c
        L7a:
            java.lang.String r0 = "var"
        L7c:
            r12 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 != 0) goto La5
            r0 = r11
            if (r0 != 0) goto La5
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' on a local variable requires an initializer expression"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        La5:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto Lca
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' is not compatible with array initializer expressions. Use the full form (new int[] { ... } instead of just { ... })"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        Lca:
            r0 = r6
            lombok.core.LombokNode r0 = r0.directUp()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r13 = r0
            r0 = r9
            if (r0 == 0) goto Led
            r0 = r13
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ForStatement
            if (r0 == 0) goto Led
            r0 = r6
            java.lang.String r1 = "'val' is not allowed in old-style for loops"
            r0.addError(r1)
            return
        Led:
            r0 = r13
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ForStatement
            if (r0 == 0) goto L114
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.ForStatement r0 = (org.eclipse.jdt.internal.compiler.ast.ForStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.initializations
            if (r0 == 0) goto L114
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.ForStatement r0 = (org.eclipse.jdt.internal.compiler.ast.ForStatement) r0
            org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.initializations
            int r0 = r0.length
            r1 = 1
            if (r0 <= r1) goto L114
            r0 = r6
            java.lang.String r1 = "'var' is not allowed in old-style for loops if there is more than 1 initializer"
            r0.addError(r1)
            return
        L114:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            if (r0 == 0) goto L148
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "org.eclipse.jdt.internal.compiler.ast.LambdaExpression"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L148
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' is not allowed with lambda expressions."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L148:
            r0 = r10
            if (r0 == 0) goto L15e
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NullLiteral
            if (r0 == 0) goto L15e
            r0 = r6
            java.lang.String r1 = "variable initializer is 'null'"
            r0.addError(r1)
            return
        L15e:
            return
    }
}
