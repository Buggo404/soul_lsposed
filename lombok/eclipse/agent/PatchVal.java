package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchVal.SCL.lombok */
public class PatchVal {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchVal$Reflection.SCL.lombok */
    public static final class Reflection {
        private static final java.lang.reflect.Field initCopyField = null;
        private static final java.lang.reflect.Field iterableCopyField = null;

        static {
                r0 = 0
                r3 = r0
                r0 = 0
                r4 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
                java.lang.String r1 = "$initCopy"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L17
                r3 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
                java.lang.String r1 = "$iterableCopy"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L17
                r4 = r0
                goto L18
            L17:
            L18:
                r0 = r3
                lombok.eclipse.agent.PatchVal.Reflection.initCopyField = r0
                r0 = r4
                lombok.eclipse.agent.PatchVal.Reflection.iterableCopyField = r0
                return
        }

        public Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.reflect.Field access$0() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.initCopyField
                return r0
        }

        static /* synthetic */ java.lang.reflect.Field access$1() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.iterableCopyField
                return r0
        }
    }

    public PatchVal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean matches(java.lang.String r4, char[] r5) {
            r0 = r5
            if (r0 == 0) goto Ld
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length
            if (r0 == r1) goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 0
            r6 = r0
            goto L24
        L14:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r6
            char r1 = r1[r2]
            if (r0 == r1) goto L21
            r0 = 0
            return r0
        L21:
            int r6 = r6 + 1
        L24:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 < r1) goto L14
            r0 = 1
            return r0
    }

    public static boolean couldBe(org.eclipse.jdt.internal.compiler.lookup.ImportBinding[] r4, java.lang.String r5, org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r0 = r5
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r7 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto Lea
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r8 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r8
            boolean r0 = matches(r0, r1)
            if (r0 != 0) goto L27
            r0 = 0
            return r0
        L27:
            r0 = r4
            if (r0 != 0) goto L2d
            r0 = 1
            return r0
        L2d:
            r0 = r4
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto Le1
        L3a:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.ImportReference r0 = r0.reference
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L50
            goto Lde
        L50:
            r0 = r13
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L5b
            goto Lde
        L5b:
            r0 = r13
            int r0 = r0.bits
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L6a
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            r14 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r14
            if (r1 == 0) goto L78
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            int r0 = r0 - r1
            r15 = r0
            r0 = r13
            char[][] r0 = r0.tokens
            r16 = r0
            r0 = r15
            r1 = r16
            int r1 = r1.length
            if (r0 == r1) goto L8e
            goto Lde
        L8e:
            r0 = 0
            r17 = r0
            goto Ld5
        L94:
            r0 = r7
            r1 = r17
            r0 = r0[r1]
            int r0 = r0.length()
            r1 = r16
            r2 = r17
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 == r1) goto La7
            goto Lde
        La7:
            r0 = 0
            r18 = r0
            goto Lc7
        Lad:
            r0 = r7
            r1 = r17
            r0 = r0[r1]
            r1 = r18
            char r0 = r0.charAt(r1)
            r1 = r16
            r2 = r17
            r1 = r1[r2]
            r2 = r18
            char r1 = r1[r2]
            if (r0 == r1) goto Lc4
            goto Lde
        Lc4:
            int r18 = r18 + 1
        Lc7:
            r0 = r18
            r1 = r16
            r2 = r17
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 < r1) goto Lad
            int r17 = r17 + 1
        Ld5:
            r0 = r17
            r1 = r15
            if (r0 < r1) goto L94
            r0 = 1
            return r0
        Lde:
            int r10 = r10 + 1
        Le1:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L3a
            r0 = 0
            return r0
        Lea:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L130
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r8
            int r1 = r1.length
            if (r0 == r1) goto L104
            r0 = 0
            return r0
        L104:
            r0 = 0
            r9 = r0
            goto L126
        L10a:
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = matches(r0, r1)
            if (r0 != 0) goto L123
            r0 = 0
            return r0
        L123:
            int r9 = r9 + 1
        L126:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 < r1) goto L10a
            r0 = 1
            return r0
        L130:
            r0 = 0
            return r0
    }

    public static boolean couldBe(org.eclipse.jdt.internal.compiler.ast.ImportReference[] r4, java.lang.String r5, org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
            r0 = r5
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r7 = r0
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto Ldb
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            r8 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r8
            boolean r0 = matches(r0, r1)
            if (r0 != 0) goto L27
            r0 = 0
            return r0
        L27:
            r0 = r4
            if (r0 != 0) goto L2d
            r0 = 1
            return r0
        L2d:
            r0 = r4
            r1 = r0
            r12 = r1
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r10 = r0
            goto Ld2
        L3a:
            r0 = r12
            r1 = r10
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L4c
            goto Lcf
        L4c:
            r0 = r9
            int r0 = r0.bits
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            r13 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r13
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            int r0 = r0 - r1
            r14 = r0
            r0 = r9
            char[][] r0 = r0.tokens
            r15 = r0
            r0 = r14
            r1 = r15
            int r1 = r1.length
            if (r0 == r1) goto L7f
            goto Lcf
        L7f:
            r0 = 0
            r16 = r0
            goto Lc6
        L85:
            r0 = r7
            r1 = r16
            r0 = r0[r1]
            int r0 = r0.length()
            r1 = r15
            r2 = r16
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 == r1) goto L98
            goto Lcf
        L98:
            r0 = 0
            r17 = r0
            goto Lb8
        L9e:
            r0 = r7
            r1 = r16
            r0 = r0[r1]
            r1 = r17
            char r0 = r0.charAt(r1)
            r1 = r15
            r2 = r16
            r1 = r1[r2]
            r2 = r17
            char r1 = r1[r2]
            if (r0 == r1) goto Lb5
            goto Lcf
        Lb5:
            int r17 = r17 + 1
        Lb8:
            r0 = r17
            r1 = r15
            r2 = r16
            r1 = r1[r2]
            int r1 = r1.length
            if (r0 < r1) goto L9e
            int r16 = r16 + 1
        Lc6:
            r0 = r16
            r1 = r14
            if (r0 < r1) goto L85
            r0 = 1
            return r0
        Lcf:
            int r10 = r10 + 1
        Ld2:
            r0 = r10
            r1 = r11
            if (r0 < r1) goto L3a
            r0 = 0
            return r0
        Ldb:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L121
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r1 = r8
            int r1 = r1.length
            if (r0 == r1) goto Lf5
            r0 = 0
            return r0
        Lf5:
            r0 = 0
            r9 = r0
            goto L117
        Lfb:
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = matches(r0, r1)
            if (r0 != 0) goto L114
            r0 = 0
            return r0
        L114:
            int r9 = r9 + 1
        L117:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 < r1) goto Lfb
            r0 = 1
            return r0
        L121:
            r0 = 0
            return r0
    }

    /* renamed from: is */
    private static boolean m69is(org.eclipse.jdt.internal.compiler.ast.TypeReference r6, org.eclipse.jdt.internal.compiler.lookup.BlockScope r7, java.lang.String r8) {
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.Scope r0 = r0.parent
            r9 = r0
            goto L1b
        L8:
            r0 = r9
            org.eclipse.jdt.internal.compiler.lookup.Scope r0 = r0.parent
            r10 = r0
            r0 = r10
            r1 = r9
            if (r0 != r1) goto L18
            r0 = 0
            goto L1a
        L18:
            r0 = r10
        L1a:
            r9 = r0
        L1b:
            r0 = r9
            if (r0 == 0) goto L26
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope
            if (r0 == 0) goto L8
        L26:
            r0 = 0
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope
            if (r0 == 0) goto L39
            r0 = r9
            org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r0 = (org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope) r0
            org.eclipse.jdt.internal.compiler.lookup.ImportBinding[] r0 = r0.imports
            r10 = r0
        L39:
            r0 = r10
            r1 = r8
            r2 = r6
            boolean r0 = couldBe(r0, r1, r2)
            if (r0 != 0) goto L45
            r0 = 0
            return r0
        L45:
            r0 = r6
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L58
            r0 = r6
            r1 = r7
            r2 = 0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1, r2)
            r11 = r0
        L58:
            r0 = r11
            if (r0 != 0) goto L5f
            r0 = 0
            return r0
        L5f:
            r0 = r11
            char[] r0 = r0.qualifiedPackageName()
            r12 = r0
            r0 = r11
            char[] r0 = r0.qualifiedSourceName()
            r13 = r0
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto L7b
            r0 = r12
            int r0 = r0.length
            r1 = 1
            int r0 = r0 + r1
            goto L7c
        L7b:
            r0 = 0
        L7c:
            r14 = r0
            r0 = r14
            r1 = r13
            int r1 = r1.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            r15 = r0
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto La2
            r0 = r12
            r1 = 0
            r2 = r15
            r3 = 0
            r4 = r12
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r15
            r1 = r12
            int r1 = r1.length
            r2 = 46
            r0[r1] = r2
        La2:
            r0 = r13
            r1 = 0
            r2 = r15
            r3 = r14
            r4 = r13
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            r1 = r15
            boolean r0 = matches(r0, r1)
            return r0
    }

    public static boolean handleValForLocalDeclaration(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r7, org.eclipse.jdt.internal.compiler.lookup.BlockScope r8) {
            r0 = r7
            if (r0 == 0) goto L10
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
            r1 = r7
            java.lang.Class r1 = r1.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
        L10:
            r0 = 0
            return r0
        L12:
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = r8
            boolean r0 = isVal(r0, r1)
            r10 = r0
            r0 = r7
            r1 = r8
            boolean r0 = isVar(r0, r1)
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L2c
            r0 = r11
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = r10
            if (r0 == 0) goto L98
            java.lang.Throwable r0 = new java.lang.Throwable
            r1 = r0
            r1.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r12 = r0
            r0 = 0
            r13 = r0
            goto L87
        L42:
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "lombok.launch.PatchFixesHider$Val"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L84
            r0 = r12
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "org.eclipse.jdt.internal.compiler.ast.LocalDeclaration"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = r12
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            r0 = r0[r1]
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "org.eclipse.jdt.internal.compiler.ast.ForStatement"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            r0 = 1
            goto L7b
        L7a:
            r0 = 0
        L7b:
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L98
            r0 = 0
            return r0
        L84:
            int r13 = r13 + 1
        L87:
            r0 = r13
            r1 = r12
            int r1 = r1.length
            r2 = 2
            int r1 = r1 - r2
            if (r0 >= r1) goto L98
            r0 = r13
            r1 = 10
            if (r0 < r1) goto L42
        L98:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            r12 = r0
            r0 = r12
            if (r0 != 0) goto Lb9
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.access$0()
            if (r0 == 0) goto Lb9
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.access$0()     // Catch: java.lang.Exception -> Lb8
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lb8
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0     // Catch: java.lang.Exception -> Lb8
            r12 = r0
            goto Lb9
        Lb8:
        Lb9:
            r0 = r12
            if (r0 != 0) goto Ld6
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.access$1()
            if (r0 == 0) goto Ld6
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchVal.Reflection.access$1()     // Catch: java.lang.Exception -> Ld5
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Ld5
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = (org.eclipse.jdt.internal.compiler.ast.Expression) r0     // Catch: java.lang.Exception -> Ld5
            r12 = r0
            r0 = 1
            r9 = r0
            goto Ld6
        Ld5:
        Ld6:
            r0 = 0
            r13 = r0
            r0 = r8
            boolean r0 = hasNativeVarSupport(r0)
            if (r0 == 0) goto L102
            r0 = r10
            if (r0 == 0) goto L102
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r1 = r0
            java.lang.String r2 = "var"
            char[] r2 = r2.toCharArray()
            r3 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r3 = r3.type
            long r3 = lombok.eclipse.Eclipse.pos(r3)
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r7
            r1 = r12
            r0.initialization = r1
            r0 = 0
            r12 = r0
        L102:
            r0 = r12
            if (r0 == 0) goto L250
            r0 = r12
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "org.eclipse.jdt.internal.compiler.ast.LambdaExpression"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L119
            r0 = 0
            return r0
        L119:
            r0 = 0
            r14 = r0
            r0 = r9
            if (r0 == 0) goto L129
            r0 = r12
            r1 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = getForEachComponentType(r0, r1)     // Catch: java.lang.NullPointerException -> L134
            goto L12f
        L129:
            r0 = r12
            r1 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = resolveForExpression(r0, r1)     // Catch: java.lang.NullPointerException -> L134
        L12f:
            r14 = r0
            goto L138
        L134:
            r0 = 0
            r14 = r0
        L138:
            r0 = r14
            if (r0 != 0) goto L22c
            r0 = r12
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConditionalExpression
            if (r0 == 0) goto L22c
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.ConditionalExpression r0 = (org.eclipse.jdt.internal.compiler.ast.ConditionalExpression) r0
            r15 = r0
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.valueIfTrue
            r16 = r0
            r0 = r15
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.valueIfFalse
            r17 = r0
            r0 = r16
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            r18 = r0
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.referenceCompilationUnit()
            org.eclipse.jdt.internal.compiler.CompilationResult r0 = r0.compilationResult
            r19 = r0
            r0 = r19
            org.eclipse.jdt.core.compiler.CategorizedProblem[] r0 = r0.problems
            r20 = r0
            r0 = r20
            r1 = r19
            int r1 = r1.problemCount
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r21 = r0
            r0 = r18
            if (r0 == 0) goto L22c
            r0 = r17
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            if (r0 != 0) goto L22c
            r0 = r21
            int r0 = r0.getCategoryID()
            r1 = 40
            if (r0 != r1) goto L22c
            r0 = r19
            int r0 = r0.problemCount
            r22 = r0
            r0 = 0
            r23 = r0
            goto L1d4
        L1a1:
            r0 = r20
            r1 = r23
            r0 = r0[r1]
            r1 = r21
            if (r0 != r1) goto L1d1
            r0 = r20
            r1 = r23
            r2 = 0
            r0[r1] = r2
            r0 = r23
            r1 = 1
            int r0 = r0 + r1
            r1 = r22
            if (r0 >= r1) goto L1db
            r0 = r20
            r1 = r23
            r2 = 1
            int r1 = r1 + r2
            r2 = r20
            r3 = r23
            r4 = r22
            r5 = r23
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 + r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            goto L1db
        L1d1:
            int r23 = r23 + 1
        L1d4:
            r0 = r23
            r1 = r22
            if (r0 < r1) goto L1a1
        L1db:
            r0 = r19
            r1 = r21
            r0.removeProblem(r1)
            r0 = r19
            boolean r0 = r0.hasErrors()
            if (r0 != 0) goto L203
            r0 = r8
            org.eclipse.jdt.internal.compiler.impl.ReferenceContext r0 = r0.referenceContext()
            clearIgnoreFurtherInvestigationField(r0)
            java.lang.Class<org.eclipse.jdt.internal.compiler.CompilationResult> r0 = org.eclipse.jdt.internal.compiler.CompilationResult.class
            java.lang.String r1 = "hasMandatoryErrors"
            java.lang.reflect.Field r0 = getField(r0, r1)
            r1 = r19
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            setValue(r0, r1, r2)
        L203:
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FunctionalExpression
            if (r0 == 0) goto L219
            r0 = r17
            org.eclipse.jdt.internal.compiler.ast.FunctionalExpression r0 = (org.eclipse.jdt.internal.compiler.ast.FunctionalExpression) r0
            r23 = r0
            r0 = r23
            r1 = r18
            r0.setExpectedType(r1)
        L219:
            r0 = r17
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            if (r0 != 0) goto L228
            r0 = r17
            r1 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = resolveForExpression(r0, r1)
        L228:
            r0 = r18
            r14 = r0
        L22c:
            r0 = r14
            if (r0 == 0) goto L250
            r0 = r14
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: java.lang.Exception -> L24f
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r0, r1, r2)     // Catch: java.lang.Exception -> L24f
            r13 = r0
            r0 = r9
            if (r0 != 0) goto L250
            r0 = r12
            r1 = r13
            r2 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: java.lang.Exception -> L24f
            r0.resolvedType = r1     // Catch: java.lang.Exception -> L24f
            goto L250
        L24f:
        L250:
            r0 = r10
            if (r0 == 0) goto L25f
            r0 = r7
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
        L25f:
            r0 = r7
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = r1.annotations
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addValAnnotation(r1, r2, r3)
            r0.annotations = r1
            r0 = r7
            r1 = r13
            if (r1 == 0) goto L27a
            r1 = r13
            goto L28c
        L27a:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r4 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = 3
            long[] r4 = lombok.eclipse.Eclipse.poss(r4, r5)
            r2.<init>(r3, r4)
        L28c:
            r0.type = r1
            r0 = 0
            return r0
    }

    private static boolean isVar(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r4, org.eclipse.jdt.internal.compiler.lookup.BlockScope r5) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r5
            java.lang.String r2 = "lombok.experimental.var"
            boolean r0 = m69is(r0, r1, r2)
            if (r0 != 0) goto L1e
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r5
            java.lang.String r2 = "lombok.var"
            boolean r0 = m69is(r0, r1, r2)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            r0 = 1
            return r0
    }

    private static boolean isVal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r4, org.eclipse.jdt.internal.compiler.lookup.BlockScope r5) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r5
            java.lang.String r2 = "lombok.val"
            boolean r0 = m69is(r0, r1, r2)
            return r0
    }

    private static boolean hasNativeVarSupport(org.eclipse.jdt.internal.compiler.lookup.Scope r6) {
            r0 = r6
            org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter()
            org.eclipse.jdt.internal.compiler.impl.CompilerOptions r0 = r0.options
            long r0 = r0.sourceLevel
            r1 = 16
            long r0 = r0 >> r1
            r7 = r0
            r0 = r6
            org.eclipse.jdt.internal.compiler.problem.ProblemReporter r0 = r0.problemReporter()
            org.eclipse.jdt.internal.compiler.impl.CompilerOptions r0 = r0.options
            long r0 = r0.complianceLevel
            r1 = 16
            long r0 = r0 >> r1
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            r0 = r9
            r7 = r0
        L24:
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2c
            r0 = r7
            r9 = r0
        L2c:
            r0 = r7
            r1 = 44
            long r0 = r0 - r1
            int r0 = (int) r0
            r1 = r9
            r2 = 44
            long r1 = r1 - r2
            int r1 = (int) r1
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 10
            if (r0 < r1) goto L42
            r0 = 1
            return r0
        L42:
            r0 = 0
            return r0
    }

    public static boolean handleValForForEach(org.eclipse.jdt.internal.compiler.ast.ForeachStatement r7, org.eclipse.jdt.internal.compiler.lookup.BlockScope r8) {
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r8
            boolean r0 = isVal(r0, r1)
            r9 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r8
            boolean r0 = isVar(r0, r1)
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L25
            r0 = r10
            if (r0 != 0) goto L25
            r0 = 0
            return r0
        L25:
            r0 = r8
            boolean r0 = hasNativeVarSupport(r0)
            if (r0 == 0) goto L2e
            r0 = 0
            return r0
        L2e:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.collection
            r1 = r8
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = getForEachComponentType(r0, r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            r0 = r11
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.elementVariable
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            r2 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r0, r1, r2)
            r12 = r0
            r0 = r9
            if (r0 == 0) goto L60
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r0
            int r1 = r1.modifiers
            r2 = 16
            r1 = r1 | r2
            r0.modifiers = r1
        L60:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.elementVariable
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = r1.annotations
            r2 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2 = r2.elementVariable
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            r3 = r8
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = addValAnnotation(r1, r2, r3)
            r0.annotations = r1
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            r1 = r12
            if (r1 == 0) goto L87
            r1 = r12
            goto L9c
        L87:
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r1 = new org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            r2 = r1
            char[][] r3 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r4 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r4 = r4.elementVariable
            org.eclipse.jdt.internal.compiler.ast.TypeReference r4 = r4.type
            r5 = 3
            long[] r4 = lombok.eclipse.Eclipse.poss(r4, r5)
            r2.<init>(r3, r4)
        L9c:
            r0.type = r1
            r0 = 0
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.ast.Annotation[] addValAnnotation(org.eclipse.jdt.internal.compiler.ast.Annotation[] r7, org.eclipse.jdt.internal.compiler.ast.TypeReference r8, org.eclipse.jdt.internal.compiler.lookup.BlockScope r9) {
            r0 = r7
            if (r0 == 0) goto L18
            r0 = 1
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r10 = r0
            r0 = r7
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r7
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            goto L1d
        L18:
            r0 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r0]
            r10 = r0
        L1d:
            r0 = r8
            r1 = r8
            char[][] r1 = r1.getTypeName()
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = lombok.eclipse.handlers.EclipseHandlerUtil.generateQualifiedTypeRef(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r2 = new org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
            r3 = r2
            r4 = r11
            r5 = r11
            int r5 = r5.sourceStart
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = r10
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.lookup.TypeBinding getForEachComponentType(org.eclipse.jdt.internal.compiler.ast.Expression r4, org.eclipse.jdt.internal.compiler.lookup.BlockScope r5) {
            r0 = r4
            if (r0 == 0) goto L90
            r0 = r4
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolvedType
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L13
            r0 = r4
            r1 = r5
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = resolveForExpression(r0, r1)
            r6 = r0
        L13:
            r0 = r6
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r6
            boolean r0 = r0.isArrayType()
            if (r0 == 0) goto L2a
            r0 = r6
            org.eclipse.jdt.internal.compiler.lookup.ArrayBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ArrayBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.elementsType()
            r6 = r0
            r0 = r6
            return r0
        L2a:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding
            if (r0 == 0) goto L90
            r0 = r6
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) r0
            r1 = 38
            r2 = 0
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.findSuperTypeOriginatingFrom(r1, r2)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L7f
            r0 = r7
            int r0 = r0.kind()
            switch(r0) {
                case 260: goto L71;
                case 1028: goto L7d;
                case 2052: goto L68;
                default: goto L7f;
            }
        L68:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables()
            r8 = r0
            goto L7f
        L71:
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.arguments
            r8 = r0
            goto L7f
        L7d:
            r0 = 0
            return r0
        L7f:
            r0 = r8
            if (r0 == 0) goto L90
            r0 = r8
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L90
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            return r0
        L90:
            r0 = 0
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.lookup.TypeBinding resolveForExpression(org.eclipse.jdt.internal.compiler.ast.Expression r3, org.eclipse.jdt.internal.compiler.lookup.BlockScope r4) {
            r0 = r3
            r1 = r4
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6 org.eclipse.jdt.internal.compiler.problem.AbortCompilation -> L9
            return r0
        L6:
            r0 = 0
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static void clearIgnoreFurtherInvestigationField(org.eclipse.jdt.internal.compiler.impl.ReferenceContext r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration
            if (r0 == 0) goto L14
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration) r0
            r7 = r0
            r0 = r7
            r1 = 0
            r0.ignoreFurtherInvestigation = r1
            goto Lb7
        L14:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LambdaExpression
            if (r0 == 0) goto L73
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.LambdaExpression r0 = (org.eclipse.jdt.internal.compiler.ast.LambdaExpression) r0
            r7 = r0
            java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LambdaExpression> r0 = org.eclipse.jdt.internal.compiler.ast.LambdaExpression.class
            java.lang.String r1 = "ignoreFurtherInvestigation"
            java.lang.reflect.Field r0 = getField(r0, r1)
            r1 = r7
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            setValue(r0, r1, r2)
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.BlockScope r0 = r0.enclosingScope
            org.eclipse.jdt.internal.compiler.lookup.Scope r0 = r0.parent
            r8 = r0
            goto L6c
        L3c:
            r0 = r8
            int r0 = r0.kind
            switch(r0) {
                case 2: goto L58;
                case 3: goto L58;
                default: goto L67;
            }
        L58:
            r0 = r8
            org.eclipse.jdt.internal.compiler.impl.ReferenceContext r0 = r0.referenceContext()
            r9 = r0
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L67
            r0 = r9
            clearIgnoreFurtherInvestigationField(r0)
            return
        L67:
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.Scope r0 = r0.parent
            r8 = r0
        L6c:
            r0 = r8
            if (r0 != 0) goto L3c
            goto Lb7
        L73:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.TypeDeclaration
            if (r0 == 0) goto L87
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            r7 = r0
            r0 = r7
            r1 = 0
            r0.ignoreFurtherInvestigation = r1
            goto Lb7
        L87:
            r0 = r6
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration
            if (r0 == 0) goto L9b
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
            r7 = r0
            r0 = r7
            r1 = 0
            r0.ignoreFurtherInvestigation = r1
            goto Lb7
        L9b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "clearIgnoreFurtherInvestigationField for "
            r3.<init>(r4)
            r3 = r6
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lb7:
            return
    }

    private static void setValue(java.lang.reflect.Field r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> L9
            goto Lf
        L9:
            r7 = move-exception
            r0 = r7
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        Lf:
            return
    }

    private static java.lang.reflect.Field getField(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L6
            return r0
        L6:
            r5 = move-exception
            r0 = r5
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
    }
}
