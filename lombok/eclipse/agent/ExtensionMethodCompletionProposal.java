package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/ExtensionMethodCompletionProposal.SCL.lombok */
public class ExtensionMethodCompletionProposal extends org.eclipse.jdt.internal.codeassist.InternalCompletionProposal {
    private char[] fullSignature;
    private char[][] parameterNames;

    public ExtensionMethodCompletionProposal(int r6) {
            r5 = this;
            r0 = r5
            r1 = 6
            r2 = r6
            r3 = 1
            int r2 = r2 - r3
            r0.<init>(r1, r2)
            return
    }

    public void setMethodBinding(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r7, org.eclipse.jdt.internal.compiler.ast.ASTNode r8) {
            r6 = this;
            r0 = r7
            char[][] r0 = r0.parameterNames
            if (r0 == 0) goto L26
            r0 = r7
            char[][] r0 = r0.parameterNames
            int r0 = r0.length
            if (r0 <= 0) goto L26
            r0 = r6
            r1 = r7
            char[][] r1 = r1.parameterNames
            r2 = 1
            r3 = r7
            char[][] r3 = r3.parameterNames
            int r3 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            char[][] r1 = (char[][]) r1
            r0.setParameterNames(r1)
            goto L2e
        L26:
            r0 = r6
            r1 = r7
            char[] r1 = org.eclipse.jdt.internal.codeassist.CompletionEngine.getSignature(r1)
            r0.fullSignature = r1
        L2e:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.original()
            r9 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = r1.parameters
            int r1 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]) r0
            r10 = r0
            r0 = r7
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = r1.parameters
            r2 = 1
            r3 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r3 = r3.parameters
            int r3 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]) r1
            r0.parameters = r1
            r0 = 0
            r11 = r0
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L94
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.original()
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.original()
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = r1.parameters
            int r1 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]) r0
            r11 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.original()
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.original()
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = r1.parameters
            r2 = 1
            r3 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r3 = r3.original()
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r3 = r3.parameters
            int r3 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = (org.eclipse.jdt.internal.compiler.lookup.TypeBinding[]) r1
            r0.parameters = r1
        L94:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            if (r0 != 0) goto L9f
            r0 = 0
            goto La4
        L9f:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            int r0 = r0.length
        La4:
            r12 = r0
            r0 = r12
            char[] r0 = new char[r0]
            r13 = r0
            r0 = r12
            char[] r0 = new char[r0]
            r14 = r0
            r0 = 0
            r15 = r0
            goto Ldd
        Lba:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.original()
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r13
            r1 = r15
            r2 = r16
            char[] r2 = r2.qualifiedPackageName()
            r0[r1] = r2
            r0 = r14
            r1 = r15
            r2 = r16
            char[] r2 = r2.qualifiedSourceName()
            r0[r1] = r2
            int r15 = r15 + 1
        Ldd:
            r0 = r15
            r1 = r12
            if (r0 < r1) goto Lba
            r0 = r7
            char[] r0 = r0.selector
            r1 = 2
            char[] r1 = new char[r1]
            r2 = r1
            r3 = 0
            r4 = 40
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = 41
            r2[r3] = r4
            char[] r0 = org.eclipse.jdt.core.compiler.CharOperation.concat(r0, r1)
            r15 = r0
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            char[] r1 = org.eclipse.jdt.internal.codeassist.CompletionEngine.getSignature(r1)
            r0.setDeclarationSignature(r1)
            r0 = r6
            r1 = r7
            char[] r1 = org.eclipse.jdt.internal.codeassist.CompletionEngine.getSignature(r1)
            r0.setSignature(r1)
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L11a
            r0 = r6
            r1 = r9
            char[] r1 = org.eclipse.jdt.internal.codeassist.CompletionEngine.getSignature(r1)
            r0.setOriginalSignature(r1)
        L11a:
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            char[] r1 = r1.qualifiedPackageName()
            r0.setDeclarationPackageName(r1)
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.declaringClass
            char[] r1 = r1.qualifiedSourceName()
            r0.setDeclarationTypeName(r1)
            r0 = r6
            r1 = r13
            r0.setParameterPackageNames(r1)
            r0 = r6
            r1 = r14
            r0.setParameterTypeNames(r1)
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.returnType
            char[] r1 = r1.qualifiedPackageName()
            r0.setPackageName(r1)
            r0 = r6
            r1 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.returnType
            char[] r1 = r1.qualifiedSourceName()
            r0.setTypeName(r1)
            r0 = r6
            r1 = r7
            char[] r1 = r1.selector
            r0.setName(r1)
            r0 = r6
            r1 = r15
            r0.setCompletion(r1)
            r0 = r6
            r1 = r7
            int r1 = r1.modifiers
            r2 = -9
            r1 = r1 & r2
            r0.setFlags(r1)
            r0 = r7
            boolean r0 = r0.isVarargs()
            if (r0 == 0) goto L183
            r0 = r12
            if (r0 != 0) goto L183
            r0 = r6
            r1 = r6
            int r1 = r1.getFlags()
            r2 = -129(0xffffffffffffff7f, float:NaN)
            r1 = r1 & r2
            r0.setFlags(r1)
        L183:
            r0 = r8
            int r0 = r0.sourceEnd
            r1 = 1
            int r0 = r0 + r1
            r16 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnQualifiedNameReference
            if (r0 == 0) goto L19f
            r0 = r16
            r1 = r8
            org.eclipse.jdt.internal.codeassist.complete.CompletionOnQualifiedNameReference r1 = (org.eclipse.jdt.internal.codeassist.complete.CompletionOnQualifiedNameReference) r1
            char[] r1 = r1.completionIdentifier
            int r1 = r1.length
            int r0 = r0 - r1
            r16 = r0
        L19f:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnMemberAccess
            if (r0 == 0) goto L1b3
            r0 = r16
            r1 = r8
            org.eclipse.jdt.internal.codeassist.complete.CompletionOnMemberAccess r1 = (org.eclipse.jdt.internal.codeassist.complete.CompletionOnMemberAccess) r1
            char[] r1 = r1.token
            int r1 = r1.length
            int r0 = r0 - r1
            r16 = r0
        L1b3:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.codeassist.complete.CompletionOnSingleNameReference
            if (r0 == 0) goto L1c7
            r0 = r16
            r1 = r8
            org.eclipse.jdt.internal.codeassist.complete.CompletionOnSingleNameReference r1 = (org.eclipse.jdt.internal.codeassist.complete.CompletionOnSingleNameReference) r1
            char[] r1 = r1.token
            int r1 = r1.length
            int r0 = r0 - r1
            r16 = r0
        L1c7:
            r0 = r6
            r1 = r16
            r2 = r16
            r0.setReplaceRange(r1, r2)
            r0 = r6
            r1 = r16
            r2 = r16
            r0.setTokenRange(r1, r2)
            r0 = r6
            r1 = 100
            r0.setRelevance(r1)
            r0 = r7
            r1 = r10
            r0.parameters = r1
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L1f1
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.original()
            r1 = r11
            r0.parameters = r1
        L1f1:
            return
    }

    public char[][] findParameterNames(org.eclipse.core.runtime.IProgressMonitor r11) {
            r10 = this;
            r0 = r10
            char[][] r0 = r0.parameterNames
            if (r0 == 0) goto Lc
            r0 = r10
            char[][] r0 = r0.parameterNames
            return r0
        Lc:
            r0 = r10
            org.eclipse.jdt.internal.core.NameLookup r0 = r0.nameLookup
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r10
            char[] r3 = r3.declarationTypeName
            r2.<init>(r3)
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r10
            char[] r4 = r4.declarationPackageName
            r3.<init>(r4)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            org.eclipse.jdt.internal.core.NameLookup$Answer r0 = r0.findType(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Le2
            r0 = r12
            org.eclipse.jdt.core.IType r0 = r0.type
            if (r0 == 0) goto Le2
            r0 = r10
            char[] r0 = r0.fullSignature
            char[][] r0 = org.eclipse.jdt.core.Signature.getParameterTypes(r0)
            r13 = r0
            r0 = r13
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r14 = r0
            r0 = 0
            r15 = r0
            goto L63
        L50:
            r0 = r14
            r1 = r15
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r13
            r5 = r15
            r4 = r4[r5]
            r3.<init>(r4)
            r0[r1] = r2
            int r15 = r15 + 1
        L63:
            r0 = r15
            r1 = r13
            int r1 = r1.length
            if (r0 < r1) goto L50
            r0 = r12
            org.eclipse.jdt.core.IType r0 = r0.type
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r10
            char[] r3 = r3.getName()
            r2.<init>(r3)
            r2 = r14
            org.eclipse.jdt.core.IMethod r0 = r0.getMethod(r1, r2)
            r15 = r0
            r0 = r12
            org.eclipse.jdt.core.IType r0 = r0.type
            r1 = r15
            org.eclipse.jdt.core.IMethod[] r0 = r0.findMethods(r1)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto La0
            r0 = r16
            int r0 = r0.length
            if (r0 <= 0) goto La0
            r0 = r16
            r1 = 0
            r0 = r0[r1]
            r15 = r0
        La0:
            r0 = r15
            if (r0 == 0) goto Le2
            r0 = r15
            java.lang.String[] r0 = r0.getParameterNames()     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            r17 = r0
            r0 = r17
            int r0 = r0.length     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            r1 = 1
            int r0 = r0 - r1
            char[] r0 = new char[r0]     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            r18 = r0
            r0 = 0
            r19 = r0
            goto Ld0
        Lbe:
            r0 = r18
            r1 = r19
            r2 = r17
            r3 = r19
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            char[] r2 = r2.toCharArray()     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            r0[r1] = r2     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            int r19 = r19 + 1
        Ld0:
            r0 = r19
            r1 = r18
            int r1 = r1.length     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            if (r0 < r1) goto Lbe
            r0 = r10
            r1 = r18
            r0.setParameterNames(r1)     // Catch: org.eclipse.jdt.core.JavaModelException -> Le1
            goto Le2
        Le1:
        Le2:
            r0 = r10
            char[][] r0 = r0.parameterNames
            if (r0 != 0) goto Lf2
            r0 = r10
            r1 = r10
            r2 = r11
            char[][] r1 = super.findParameterNames(r2)
            r0.parameterNames = r1
        Lf2:
            r0 = r10
            char[][] r0 = r0.parameterNames
            return r0
    }

    public void setParameterNames(char[][] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.parameterNames = r1
            r0 = r3
            r1 = r4
            super.setParameterNames(r1)
            return
    }
}
