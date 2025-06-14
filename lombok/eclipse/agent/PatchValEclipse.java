package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchValEclipse.SCL.lombok */
public class PatchValEclipse {
    private static final java.lang.reflect.Field FIELD_NAME_INDEX = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchValEclipse$Reflection.SCL.lombok */
    public static final class Reflection {
        private static final java.lang.reflect.Field initCopyField = null;
        private static final java.lang.reflect.Field iterableCopyField = null;
        private static final java.lang.reflect.Field astStackField = null;
        private static final java.lang.reflect.Field astPtrField = null;
        private static final java.lang.reflect.Constructor<org.eclipse.jdt.core.dom.Modifier> modifierConstructor = null;
        private static final java.lang.reflect.Constructor<org.eclipse.jdt.core.dom.MarkerAnnotation> markerAnnotationConstructor = null;
        private static final java.lang.reflect.Method astConverterRecordNodes = null;

        static {
                r0 = 0
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = 0
                r12 = r0
                r0 = 0
                r13 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
                java.lang.String r1 = "$initCopy"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L24
                r7 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.LocalDeclaration> r0 = org.eclipse.jdt.internal.compiler.ast.LocalDeclaration.class
                java.lang.String r1 = "$iterableCopy"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L24
                r8 = r0
                goto L25
            L24:
            L25:
                java.lang.Class<org.eclipse.jdt.internal.compiler.parser.Parser> r0 = org.eclipse.jdt.internal.compiler.parser.Parser.class
                java.lang.String r1 = "astStack"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L76
                r9 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.parser.Parser> r0 = org.eclipse.jdt.internal.compiler.parser.Parser.class
                java.lang.String r1 = "astPtr"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L76
                r10 = r0
                java.lang.Class<org.eclipse.jdt.core.dom.Modifier> r0 = org.eclipse.jdt.core.dom.Modifier.class
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L76
                r2 = r1
                r3 = 0
                java.lang.Class<org.eclipse.jdt.core.dom.AST> r4 = org.eclipse.jdt.core.dom.AST.class
                r2[r3] = r4     // Catch: java.lang.Throwable -> L76
                java.lang.reflect.Constructor r0 = lombok.permit.Permit.getConstructor(r0, r1)     // Catch: java.lang.Throwable -> L76
                r11 = r0
                java.lang.Class<org.eclipse.jdt.core.dom.MarkerAnnotation> r0 = org.eclipse.jdt.core.dom.MarkerAnnotation.class
                r1 = 1
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L76
                r2 = r1
                r3 = 0
                java.lang.Class<org.eclipse.jdt.core.dom.AST> r4 = org.eclipse.jdt.core.dom.AST.class
                r2[r3] = r4     // Catch: java.lang.Throwable -> L76
                java.lang.reflect.Constructor r0 = lombok.permit.Permit.getConstructor(r0, r1)     // Catch: java.lang.Throwable -> L76
                r12 = r0
                java.lang.String r0 = "org.eclipse.jdt.core.dom.ASTConverter"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L76
                r14 = r0
                r0 = r14
                java.lang.String r1 = "recordNodes"
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L76
                r3 = r2
                r4 = 0
                java.lang.Class<org.eclipse.jdt.core.dom.ASTNode> r5 = org.eclipse.jdt.core.dom.ASTNode.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L76
                r3 = r2
                r4 = 1
                java.lang.Class<org.eclipse.jdt.internal.compiler.ast.ASTNode> r5 = org.eclipse.jdt.internal.compiler.ast.ASTNode.class
                r3[r4] = r5     // Catch: java.lang.Throwable -> L76
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L76
                r13 = r0
                goto L77
            L76:
            L77:
                r0 = r7
                lombok.eclipse.agent.PatchValEclipse.Reflection.initCopyField = r0
                r0 = r8
                lombok.eclipse.agent.PatchValEclipse.Reflection.iterableCopyField = r0
                r0 = r9
                lombok.eclipse.agent.PatchValEclipse.Reflection.astStackField = r0
                r0 = r10
                lombok.eclipse.agent.PatchValEclipse.Reflection.astPtrField = r0
                r0 = r11
                lombok.eclipse.agent.PatchValEclipse.Reflection.modifierConstructor = r0
                r0 = r12
                lombok.eclipse.agent.PatchValEclipse.Reflection.markerAnnotationConstructor = r0
                r0 = r13
                lombok.eclipse.agent.PatchValEclipse.Reflection.astConverterRecordNodes = r0
                return
        }

        public Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.reflect.Field access$0() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.astStackField
                return r0
        }

        static /* synthetic */ java.lang.reflect.Field access$1() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.astPtrField
                return r0
        }

        static /* synthetic */ java.lang.reflect.Field access$2() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.iterableCopyField
                return r0
        }

        static /* synthetic */ java.lang.reflect.Field access$3() {
                java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.initCopyField
                return r0
        }

        static /* synthetic */ java.lang.reflect.Method access$4() {
                java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.astConverterRecordNodes
                return r0
        }

        static /* synthetic */ java.lang.reflect.Constructor access$5() {
                java.lang.reflect.Constructor<org.eclipse.jdt.core.dom.Modifier> r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.modifierConstructor
                return r0
        }

        static /* synthetic */ java.lang.reflect.Constructor access$6() {
                java.lang.reflect.Constructor<org.eclipse.jdt.core.dom.MarkerAnnotation> r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.markerAnnotationConstructor
                return r0
        }
    }

    static {
            r0 = 0
            r3 = r0
            java.lang.Class<org.eclipse.jdt.core.dom.Name> r0 = org.eclipse.jdt.core.dom.Name.class
            java.lang.String r1 = "index"
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> Ld
            r3 = r0
            goto Le
        Ld:
        Le:
            r0 = r3
            lombok.eclipse.agent.PatchValEclipse.FIELD_NAME_INDEX = r0
            return
    }

    public PatchValEclipse() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void copyInitializationOfForEachIterable(org.eclipse.jdt.internal.compiler.parser.Parser r4) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$0()     // Catch: java.lang.Exception -> L1c
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1c
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode[]) r0     // Catch: java.lang.Exception -> L1c
            r5 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$1()     // Catch: java.lang.Exception -> L1c
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1c
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1c
            r6 = r0
            goto L1e
        L1c:
            return
        L1e:
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.ForeachStatement r0 = (org.eclipse.jdt.internal.compiler.ast.ForeachStatement) r0
            r7 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.collection
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L31
            return
        L31:
            r0 = r4
            if (r0 != 0) goto L39
            r0 = 0
            goto L4b
        L39:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            if (r0 != 0) goto L44
            r0 = 0
            goto L4b
        L44:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
        L4b:
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.elementVariable
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVal(r0, r1)
            r9 = r0
            r0 = r4
            if (r0 != 0) goto L5f
            r0 = 0
            goto L71
        L5f:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            if (r0 != 0) goto L6a
            r0 = 0
            goto L71
        L6a:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
        L71:
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.elementVariable
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVar(r0, r1)
            r10 = r0
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r0 = r0.elementVariable
            if (r0 == 0) goto L8e
            r0 = r9
            if (r0 != 0) goto L8f
            r0 = r10
            if (r0 != 0) goto L8f
        L8e:
            return
        L8f:
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$2()     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto La5
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$2()     // Catch: java.lang.Exception -> La4
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1 = r1.elementVariable     // Catch: java.lang.Exception -> La4
            r2 = r8
            r0.set(r1, r2)     // Catch: java.lang.Exception -> La4
            goto La5
        La4:
        La5:
            return
    }

    public static void copyInitializationOfLocalDeclaration(org.eclipse.jdt.internal.compiler.parser.Parser r4) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$0()     // Catch: java.lang.Exception -> L1c
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1c
            org.eclipse.jdt.internal.compiler.ast.ASTNode[] r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode[]) r0     // Catch: java.lang.Exception -> L1c
            r5 = r0
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$1()     // Catch: java.lang.Exception -> L1c
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1c
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1c
            r6 = r0
            goto L1e
        L1c:
            return
        L1e:
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.AbstractVariableDeclaration) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.LocalDeclaration
            if (r0 != 0) goto L2d
            return
        L2d:
            r0 = r7
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L39
            return
        L39:
            r0 = r4
            if (r0 != 0) goto L41
            r0 = 0
            goto L53
        L41:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            if (r0 != 0) goto L4c
            r0 = 0
            goto L53
        L4c:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
        L53:
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVal(r0, r1)
            r9 = r0
            r0 = r4
            if (r0 != 0) goto L64
            r0 = 0
            goto L76
        L64:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            if (r0 != 0) goto L6f
            r0 = 0
            goto L76
        L6f:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.compilationUnit
            org.eclipse.jdt.internal.compiler.ast.ImportReference[] r0 = r0.imports
        L76:
            r1 = r7
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVar(r0, r1)
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L8a
            r0 = r10
            if (r0 != 0) goto L8a
            return
        L8a:
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$3()     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto L9d
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$3()     // Catch: java.lang.Exception -> L9c
            r1 = r7
            r2 = r8
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L9c
            goto L9d
        L9c:
        L9d:
            return
    }

    private static boolean couldBeVal(org.eclipse.jdt.internal.compiler.ast.ImportReference[] r4, org.eclipse.jdt.internal.compiler.ast.TypeReference r5) {
            r0 = r4
            java.lang.String r1 = "lombok.val"
            r2 = r5
            boolean r0 = lombok.eclipse.agent.PatchVal.couldBe(r0, r1, r2)
            return r0
    }

    private static boolean couldBeVar(org.eclipse.jdt.internal.compiler.ast.ImportReference[] r4, org.eclipse.jdt.internal.compiler.ast.TypeReference r5) {
            r0 = r4
            java.lang.String r1 = "lombok.experimental.var"
            r2 = r5
            boolean r0 = lombok.eclipse.agent.PatchVal.couldBe(r0, r1, r2)
            if (r0 != 0) goto L16
            r0 = r4
            java.lang.String r1 = "lombok.var"
            r2 = r5
            boolean r0 = lombok.eclipse.agent.PatchVal.couldBe(r0, r1, r2)
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    public static void addFinalAndValAnnotationToSingleVariableDeclaration(java.lang.Object r5, org.eclipse.jdt.core.dom.SingleVariableDeclaration r6, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r7) {
            r0 = r6
            java.util.List r0 = r0.modifiers()
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            org.eclipse.jdt.core.dom.AST r2 = r2.getAST()
            r3 = r7
            addFinalAndValAnnotationToModifierList(r0, r1, r2, r3)
            return
    }

    public static void addFinalAndValAnnotationToVariableDeclarationStatement(java.lang.Object r5, org.eclipse.jdt.core.dom.VariableDeclarationStatement r6, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r7) {
            r0 = r6
            java.util.List r0 = r0.modifiers()
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            org.eclipse.jdt.core.dom.AST r2 = r2.getAST()
            r3 = r7
            addFinalAndValAnnotationToModifierList(r0, r1, r2, r3)
            return
    }

    public static void addFinalAndValAnnotationToModifierList(java.lang.Object r7, java.util.List<org.eclipse.jdt.core.dom.IExtendedModifier> r8, org.eclipse.jdt.core.dom.AST r9, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r10) {
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r17 = r1
            int r0 = r0.length
            r16 = r0
            r0 = 0
            r15 = r0
            goto L51
        L21:
            r0 = r17
            r1 = r15
            r0 = r0[r1]
            r14 = r0
            r0 = 0
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVal(r0, r1)
            if (r0 == 0) goto L3b
            r0 = 1
            r11 = r0
            r0 = r14
            r12 = r0
        L3b:
            r0 = 0
            r1 = r14
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            boolean r0 = couldBeVar(r0, r1)
            if (r0 == 0) goto L4e
            r0 = 1
            r11 = r0
            r0 = r14
            r13 = r0
        L4e:
            int r15 = r15 + 1
        L51:
            r0 = r15
            r1 = r16
            if (r0 < r1) goto L21
            r0 = r11
            if (r0 != 0) goto L5e
            return
        L5e:
            r0 = r8
            if (r0 != 0) goto L63
            return
        L63:
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
            goto Lfd
        L77:
            r0 = r18
            java.lang.Object r0 = r0.next()
            r17 = r0
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.Modifier
            if (r0 == 0) goto La7
            r0 = r17
            org.eclipse.jdt.core.dom.Modifier r0 = (org.eclipse.jdt.core.dom.Modifier) r0
            org.eclipse.jdt.core.dom.Modifier$ModifierKeyword r0 = r0.getKeyword()
            r19 = r0
            r0 = r19
            if (r0 != 0) goto L9a
            goto Lfd
        L9a:
            r0 = r19
            int r0 = r0.toFlagValue()
            r1 = 16
            if (r0 != r1) goto La7
            r0 = 1
            r14 = r0
        La7:
            r0 = r17
            boolean r0 = r0 instanceof org.eclipse.jdt.core.dom.Annotation
            if (r0 == 0) goto Lfd
            r0 = r17
            org.eclipse.jdt.core.dom.Annotation r0 = (org.eclipse.jdt.core.dom.Annotation) r0
            org.eclipse.jdt.core.dom.Name r0 = r0.getTypeName()
            r19 = r0
            r0 = r19
            if (r0 == 0) goto Lfd
            r0 = r19
            java.lang.String r0 = r0.getFullyQualifiedName()
            r20 = r0
            java.lang.String r0 = "val"
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld9
            java.lang.String r0 = "lombok.val"
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ldc
        Ld9:
            r0 = 1
            r15 = r0
        Ldc:
            java.lang.String r0 = "var"
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lfa
            java.lang.String r0 = "lombok.var"
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lfa
            java.lang.String r0 = "lombok.experimental.var"
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfd
        Lfa:
            r0 = 1
            r16 = r0
        Lfd:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L77
            r0 = r14
            if (r0 != 0) goto L129
            r0 = r12
            if (r0 == 0) goto L129
            r0 = r8
            r1 = r9
            org.eclipse.jdt.core.dom.Modifier$ModifierKeyword r2 = org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.FINAL_KEYWORD
            r3 = r12
            int r3 = r3.sourceStart
            r4 = r12
            int r4 = r4.sourceEnd
            org.eclipse.jdt.core.dom.Modifier r1 = createModifier(r1, r2, r3, r4)
            boolean r0 = r0.add(r1)
        L129:
            r0 = r15
            if (r0 != 0) goto L196
            r0 = r12
            if (r0 == 0) goto L196
            r0 = r9
            r1 = r12
            r2 = r12
            int r2 = r2.sourceStart
            r3 = r12
            int r3 = r3.sourceEnd
            org.eclipse.jdt.core.dom.MarkerAnnotation r0 = createValVarAnnotation(r0, r1, r2, r3)
            r17 = r0
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$4()     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r1 = r7
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3 = r2
            r4 = 0
            r5 = r17
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3 = r2
            r4 = 1
            r5 = r12
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$4()     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r1 = r7
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3 = r2
            r4 = 0
            r5 = r17
            org.eclipse.jdt.core.dom.Name r5 = r5.getTypeName()     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3 = r2
            r4 = 1
            r5 = r12
            org.eclipse.jdt.internal.compiler.ast.TypeReference r5 = r5.type     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L17a java.lang.reflect.InvocationTargetException -> L182
            goto L18d
        L17a:
            r18 = move-exception
            r0 = r18
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L182:
            r18 = move-exception
            r0 = r18
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L18d:
            r0 = r8
            r1 = r17
            boolean r0 = r0.add(r1)
        L196:
            r0 = r16
            if (r0 != 0) goto L203
            r0 = r13
            if (r0 == 0) goto L203
            r0 = r9
            r1 = r13
            r2 = r13
            int r2 = r2.sourceStart
            r3 = r13
            int r3 = r3.sourceEnd
            org.eclipse.jdt.core.dom.MarkerAnnotation r0 = createValVarAnnotation(r0, r1, r2, r3)
            r17 = r0
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$4()     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r1 = r7
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3 = r2
            r4 = 0
            r5 = r17
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3 = r2
            r4 = 1
            r5 = r13
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            java.lang.reflect.Method r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$4()     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r1 = r7
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3 = r2
            r4 = 0
            r5 = r17
            org.eclipse.jdt.core.dom.Name r5 = r5.getTypeName()     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3 = r2
            r4 = 1
            r5 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r5 = r5.type     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            r3[r4] = r5     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.IllegalAccessException -> L1e7 java.lang.reflect.InvocationTargetException -> L1ef
            goto L1fa
        L1e7:
            r18 = move-exception
            r0 = r18
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L1ef:
            r18 = move-exception
            r0 = r18
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L1fa:
            r0 = r8
            r1 = r17
            boolean r0 = r0.add(r1)
        L203:
            return
    }

    public static org.eclipse.jdt.core.dom.Modifier createModifier(org.eclipse.jdt.core.dom.AST r6, org.eclipse.jdt.core.dom.Modifier.ModifierKeyword r7, int r8, int r9) {
            r0 = 0
            r10 = r0
            java.lang.reflect.Constructor r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$5()     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r2 = r1
            r3 = 0
            r4 = r6
            r2[r3] = r4     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            org.eclipse.jdt.core.dom.Modifier r0 = (org.eclipse.jdt.core.dom.Modifier) r0     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r10 = r0
            goto L31
        L19:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L21:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L29:
            r11 = move-exception
            r0 = r11
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L31:
            r0 = r10
            if (r0 == 0) goto L47
            r0 = r10
            r1 = r7
            r0.setKeyword(r1)
            r0 = r10
            r1 = r8
            r2 = r9
            r3 = r8
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
        L47:
            r0 = r10
            return r0
    }

    public static org.eclipse.jdt.core.dom.MarkerAnnotation createValVarAnnotation(org.eclipse.jdt.core.dom.AST r7, org.eclipse.jdt.internal.compiler.ast.Annotation r8, int r9, int r10) {
            r0 = 0
            r11 = r0
            java.lang.reflect.Constructor r0 = lombok.eclipse.agent.PatchValEclipse.Reflection.access$6()     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            org.eclipse.jdt.core.dom.MarkerAnnotation r0 = (org.eclipse.jdt.core.dom.MarkerAnnotation) r0     // Catch: java.lang.InstantiationException -> L19 java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L29
            r11 = r0
            goto L31
        L19:
            r12 = move-exception
            r0 = r12
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L21:
            r12 = move-exception
            r0 = r12
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L29:
            r12 = move-exception
            r0 = r12
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L31:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L52
            r0 = 1
            char[] r0 = new char[r0]
            r12 = r0
            r0 = r12
            r1 = 0
            r2 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r2
            char[] r2 = r2.token
            r0[r1] = r2
            goto L6d
        L52:
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference
            if (r0 == 0) goto L6b
            r0 = r8
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.QualifiedTypeReference) r0
            char[][] r0 = r0.tokens
            r12 = r0
            goto L6d
        L6b:
            r0 = 0
            return r0
        L6d:
            r0 = r11
            if (r0 == 0) goto L177
            r0 = r7
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r12
            r4 = r12
            int r4 = r4.length
            r5 = 1
            int r4 = r4 - r5
            r3 = r3[r4]
            r2.<init>(r3)
            org.eclipse.jdt.core.dom.SimpleName r0 = r0.newSimpleName(r1)
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r12
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto La9
            r0 = r11
            r1 = r13
            r0.setTypeName(r1)
            r0 = r13
            r1 = 1
            setIndex(r0, r1)
            goto L16c
        La9:
            r0 = r12
            int r0 = r0.length
            r1 = 2
            if (r0 != r1) goto Lf5
            r0 = r7
            java.lang.String r1 = "lombok"
            org.eclipse.jdt.core.dom.SimpleName r0 = r0.newSimpleName(r1)
            r14 = r0
            r0 = r14
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r14
            r1 = 1
            setIndex(r0, r1)
            r0 = r13
            r1 = 2
            setIndex(r0, r1)
            r0 = r7
            r1 = r14
            r2 = r13
            org.eclipse.jdt.core.dom.QualifiedName r0 = r0.newQualifiedName(r1, r2)
            r15 = r0
            r0 = r15
            r1 = 1
            setIndex(r0, r1)
            r0 = r15
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r11
            r1 = r15
            r0.setTypeName(r1)
            goto L16c
        Lf5:
            r0 = r7
            java.lang.String r1 = "lombok"
            org.eclipse.jdt.core.dom.SimpleName r0 = r0.newSimpleName(r1)
            r14 = r0
            r0 = r14
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r7
            java.lang.String r1 = "experimental"
            org.eclipse.jdt.core.dom.SimpleName r0 = r0.newSimpleName(r1)
            r15 = r0
            r0 = r14
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r14
            r1 = 1
            setIndex(r0, r1)
            r0 = r15
            r1 = 2
            setIndex(r0, r1)
            r0 = r13
            r1 = 3
            setIndex(r0, r1)
            r0 = r7
            r1 = r14
            r2 = r15
            org.eclipse.jdt.core.dom.QualifiedName r0 = r0.newQualifiedName(r1, r2)
            r16 = r0
            r0 = r16
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r16
            r1 = 1
            setIndex(r0, r1)
            r0 = r7
            r1 = r16
            r2 = r13
            org.eclipse.jdt.core.dom.QualifiedName r0 = r0.newQualifiedName(r1, r2)
            r17 = r0
            r0 = r17
            r1 = 1
            setIndex(r0, r1)
            r0 = r17
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
            r0 = r11
            r1 = r17
            r0.setTypeName(r1)
        L16c:
            r0 = r11
            r1 = r9
            r2 = r10
            r3 = r9
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 + r3
            r0.setSourceRange(r1, r2)
        L177:
            r0 = r11
            return r0
    }

    private static void setIndex(org.eclipse.jdt.core.dom.Name r4, int r5) {
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.FIELD_NAME_INDEX     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L15
            java.lang.reflect.Field r0 = lombok.eclipse.agent.PatchValEclipse.FIELD_NAME_INDEX     // Catch: java.lang.Exception -> L14
            r1 = r4
            r2 = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L14
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
        L15:
            return
    }
}
