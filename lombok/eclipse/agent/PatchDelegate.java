package lombok.eclipse.agent;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate.SCL.lombok */
public class PatchDelegate {
    private static java.lang.ThreadLocal<java.util.List<lombok.eclipse.agent.PatchDelegate.ClassScopeEntry>> visited;
    private static final java.lang.String LEGALITY_OF_DELEGATE = "@Delegate is legal only on instance fields or no-argument instance methods.";
    private static final java.lang.String RECURSION_NOT_ALLOWED = "@Delegate does not support recursion (delegating to a type that itself has @Delegate members). Member \"%s\" is @Delegate in type \"%s\"";
    private static boolean eclipseAvailable;
    private static final char[] STRING_LOMBOK = null;
    private static final char[] STRING_EXPERIMENTAL = null;
    private static final char[] STRING_DELEGATE = null;
    private static final java.util.List<java.lang.String> METHODS_IN_OBJECT = null;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$BindingTuple.SCL.lombok */
    private static final class BindingTuple {
        final org.eclipse.jdt.internal.compiler.lookup.MethodBinding parameterized;
        final org.eclipse.jdt.internal.compiler.lookup.MethodBinding base;
        final char[] fieldName;
        final org.eclipse.jdt.internal.compiler.ast.ASTNode responsible;

        BindingTuple(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4, org.eclipse.jdt.internal.compiler.lookup.MethodBinding r5, char[] r6, org.eclipse.jdt.internal.compiler.ast.ASTNode r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.parameterized = r1
                r0 = r3
                r1 = r5
                r0.base = r1
                r0 = r3
                r1 = r6
                r0.fieldName = r1
                r0 = r3
                r1 = r7
                r0.responsible = r1
                return
        }

        public java.lang.String toString() {
                r8 = this;
                java.lang.String r0 = "{param: %s, base: %s, fieldName: %s}"
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r8
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4 = r4.parameterized
                if (r4 != 0) goto L14
                java.lang.String r4 = "(null)"
                goto L1b
            L14:
                r4 = r8
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4 = r4.parameterized
                java.lang.String r4 = lombok.eclipse.agent.PatchDelegate.access$0(r4)
            L1b:
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r8
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4 = r4.base
                if (r4 != 0) goto L2a
                java.lang.String r4 = "(null)"
                goto L31
            L2a:
                r4 = r8
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4 = r4.base
                java.lang.String r4 = lombok.eclipse.agent.PatchDelegate.access$0(r4)
            L31:
                r2[r3] = r4
                r2 = r1
                r3 = 2
                java.lang.String r4 = new java.lang.String
                r5 = r4
                r6 = r8
                char[] r6 = r6.fieldName
                r5.<init>(r6)
                r2[r3] = r4
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$CantMakeDelegates.SCL.lombok */
    public static class CantMakeDelegates extends java.lang.Exception {
        public java.util.Set<java.lang.String> conflicted;

        public CantMakeDelegates() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$ClassScopeEntry.SCL.lombok */
    private static class ClassScopeEntry {
        final org.eclipse.jdt.internal.compiler.lookup.ClassScope scope;
        java.lang.String corruptedPath;

        ClassScopeEntry(org.eclipse.jdt.internal.compiler.lookup.ClassScope r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.scope = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$DelegateReceiver.SCL.lombok */
    private enum DelegateReceiver extends java.lang.Enum<lombok.eclipse.agent.PatchDelegate.DelegateReceiver> {
        public static final lombok.eclipse.agent.PatchDelegate.DelegateReceiver METHOD = null;
        public static final lombok.eclipse.agent.PatchDelegate.DelegateReceiver FIELD = null;
        private static final /* synthetic */ lombok.eclipse.agent.PatchDelegate.DelegateReceiver[] ENUM$VALUES = null;



        static {
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver$1 r0 = new lombok.eclipse.agent.PatchDelegate$DelegateReceiver$1
                r1 = r0
                java.lang.String r2 = "METHOD"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.eclipse.agent.PatchDelegate.DelegateReceiver.METHOD = r0
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver$2 r0 = new lombok.eclipse.agent.PatchDelegate$DelegateReceiver$2
                r1 = r0
                java.lang.String r2 = "FIELD"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.eclipse.agent.PatchDelegate.DelegateReceiver.FIELD = r0
                r0 = 2
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver[] r0 = new lombok.eclipse.agent.PatchDelegate.DelegateReceiver[r0]
                r1 = r0
                r2 = 0
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver r3 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.METHOD
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver r3 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.FIELD
                r1[r2] = r3
                lombok.eclipse.agent.PatchDelegate.DelegateReceiver.ENUM$VALUES = r0
                return
        }

        DelegateReceiver(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public abstract org.eclipse.jdt.internal.compiler.ast.Expression get(org.eclipse.jdt.internal.compiler.ast.ASTNode r1, char[] r2);

        public static lombok.eclipse.agent.PatchDelegate.DelegateReceiver[] values() {
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver[] r0 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver[] r2 = new lombok.eclipse.agent.PatchDelegate.DelegateReceiver[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.eclipse.agent.PatchDelegate.DelegateReceiver valueOf(java.lang.String r3) {
                java.lang.Class<lombok.eclipse.agent.PatchDelegate$DelegateReceiver> r0 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.eclipse.agent.PatchDelegate$DelegateReceiver r0 = (lombok.eclipse.agent.PatchDelegate.DelegateReceiver) r0
                return r0
        }

        /* synthetic */ DelegateReceiver(java.lang.String r5, int r6, lombok.eclipse.agent.PatchDelegate.DelegateReceiver r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$DelegateRecursion.SCL.lombok */
    private static class DelegateRecursion extends java.lang.Throwable {
        final char[] type;
        final char[] member;

        public DelegateRecursion(char[] r4, char[] r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.type = r1
                r0 = r3
                r1 = r5
                r0.member = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$EclipseOnlyMethods.SCL.lombok */
    public static class EclipseOnlyMethods {

        /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod.SCL.lombok */
        private static final class DelegateSourceMethod extends org.eclipse.jdt.internal.core.SourceMethod {
            private lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.DelegateSourceMethod.DelegateSourceMethodInfo sourceMethodInfo;

            /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod$DelegateSourceMethodInfo.SCL.lombok */
            public static final class DelegateSourceMethodInfo extends org.eclipse.jdt.internal.core.SourceMethodInfo {
                DelegateSourceMethodInfo(lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.DelegateSourceMethod r16, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r17) {
                        r15 = this;
                        r0 = r15
                        r0.<init>()
                        r0 = r17
                        int r0 = r0.sourceStart
                        r18 = r0
                        r0 = r17
                        int r0 = r0.sourceEnd
                        r19 = r0
                        r0 = r17
                        org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
                        if (r0 == 0) goto L1d
                        r0 = r17
                        org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
                        goto L21
                    L1d:
                        r0 = 0
                        org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = new org.eclipse.jdt.internal.compiler.ast.Argument[r0]
                    L21:
                        r20 = r0
                        r0 = r20
                        int r0 = r0.length
                        char[] r0 = new char[r0]
                        r21 = r0
                        r0 = r15
                        r1 = r20
                        int r1 = r1.length
                        org.eclipse.jdt.core.ILocalVariable[] r1 = new org.eclipse.jdt.core.ILocalVariable[r1]
                        r0.arguments = r1
                        r0 = 0
                        r22 = r0
                        goto L81
                    L3b:
                        r0 = r20
                        r1 = r22
                        r0 = r0[r1]
                        r23 = r0
                        r0 = r21
                        r1 = r22
                        r2 = r23
                        char[] r2 = r2.name
                        r0[r1] = r2
                        r0 = r15
                        org.eclipse.jdt.core.ILocalVariable[] r0 = r0.arguments
                        r1 = r22
                        org.eclipse.jdt.internal.core.LocalVariable r2 = new org.eclipse.jdt.internal.core.LocalVariable
                        r3 = r2
                        r4 = r16
                        java.lang.String r5 = new java.lang.String
                        r6 = r5
                        r7 = r23
                        char[] r7 = r7.name
                        r6.<init>(r7)
                        r6 = r18
                        r7 = r19
                        r8 = r18
                        r9 = r18
                        r10 = r16
                        java.lang.String[] r10 = r10.getParameterTypes()
                        r11 = r22
                        r10 = r10[r11]
                        r11 = r23
                        org.eclipse.jdt.internal.compiler.ast.Annotation[] r11 = r11.annotations
                        r12 = r23
                        int r12 = r12.modifiers
                        r13 = 1
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        r0[r1] = r2
                        int r22 = r22 + 1
                    L81:
                        r0 = r22
                        r1 = r20
                        int r1 = r1.length
                        if (r0 < r1) goto L3b
                        r0 = r15
                        r1 = r21
                        r0.setArgumentNames(r1)
                        r0 = r15
                        r1 = r18
                        r0.setSourceRangeStart(r1)
                        r0 = r15
                        r1 = r19
                        r0.setSourceRangeEnd(r1)
                        r0 = r15
                        r1 = r18
                        r0.setNameSourceStart(r1)
                        r0 = r15
                        r1 = r19
                        r0.setNameSourceEnd(r1)
                        r0 = r15
                        char[][] r1 = org.eclipse.jdt.core.compiler.CharOperation.NO_CHAR_CHAR
                        r0.setExceptionTypeNames(r1)
                        r0 = r15
                        r1 = r17
                        org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType
                        if (r1 != 0) goto Lce
                        r1 = 4
                        char[] r1 = new char[r1]
                        r2 = r1
                        r3 = 0
                        r4 = 118(0x76, float:1.65E-43)
                        r2[r3] = r4
                        r2 = r1
                        r3 = 1
                        r4 = 111(0x6f, float:1.56E-43)
                        r2[r3] = r4
                        r2 = r1
                        r3 = 2
                        r4 = 105(0x69, float:1.47E-43)
                        r2[r3] = r4
                        r2 = r1
                        r3 = 3
                        r4 = 100
                        r2[r3] = r4
                        goto Lda
                    Lce:
                        r1 = r17
                        org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType
                        char[][] r1 = r1.getParameterizedTypeName()
                        r2 = 46
                        char[] r1 = org.eclipse.jdt.core.compiler.CharOperation.concatWith(r1, r2)
                    Lda:
                        r0.setReturnType(r1)
                        r0 = r15
                        r1 = r17
                        int r1 = r1.modifiers
                        r0.setFlags(r1)
                        return
                }

                public /* bridge */ /* synthetic */ int getDeclarationSourceEnd() {
                        r2 = this;
                        r0 = r2
                        int r0 = super.getDeclarationSourceEnd()
                        return r0
                }

                public /* bridge */ /* synthetic */ int getDeclarationSourceStart() {
                        r2 = this;
                        r0 = r2
                        int r0 = super.getDeclarationSourceStart()
                        return r0
                }

                public /* bridge */ /* synthetic */ int getModifiers() {
                        r2 = this;
                        r0 = r2
                        int r0 = super.getModifiers()
                        return r0
                }
            }

            private static lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.DelegateSourceMethod forMethodDeclaration(org.eclipse.jdt.internal.core.JavaElement r7, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r8) {
                    r0 = r8
                    org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
                    if (r0 == 0) goto Le
                    r0 = r8
                    org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
                    goto L12
                Le:
                    r0 = 0
                    org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = new org.eclipse.jdt.internal.compiler.ast.Argument[r0]
                L12:
                    r9 = r0
                    r0 = r9
                    int r0 = r0.length
                    java.lang.String[] r0 = new java.lang.String[r0]
                    r10 = r0
                    r0 = 0
                    r11 = r0
                    goto L39
                L1f:
                    r0 = r10
                    r1 = r11
                    r2 = r9
                    r3 = r11
                    r2 = r2[r3]
                    org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = r2.type
                    char[][] r2 = r2.getParameterizedTypeName()
                    r3 = 46
                    char[] r2 = org.eclipse.jdt.core.compiler.CharOperation.concatWith(r2, r3)
                    r3 = 0
                    java.lang.String r2 = org.eclipse.jdt.core.Signature.createTypeSignature(r2, r3)
                    r0[r1] = r2
                    int r11 = r11 + 1
                L39:
                    r0 = r11
                    r1 = r9
                    int r1 = r1.length
                    if (r0 < r1) goto L1f
                    lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod r0 = new lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod
                    r1 = r0
                    r2 = r7
                    java.lang.String r3 = new java.lang.String
                    r4 = r3
                    r5 = r8
                    char[] r5 = r5.selector
                    r4.<init>(r5)
                    r4 = r10
                    r5 = r8
                    r1.<init>(r2, r3, r4, r5)
                    return r0
            }

            private DelegateSourceMethod(org.eclipse.jdt.internal.core.JavaElement r7, java.lang.String r8, java.lang.String[] r9, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r10) {
                    r6 = this;
                    r0 = r6
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r0.<init>(r1, r2, r3)
                    r0 = r6
                    lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod$DelegateSourceMethodInfo r1 = new lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod$DelegateSourceMethodInfo
                    r2 = r1
                    r3 = r6
                    r4 = r10
                    r2.<init>(r3, r4)
                    r0.sourceMethodInfo = r1
                    return
            }

            public java.lang.Object getElementInfo() throws org.eclipse.jdt.core.JavaModelException {
                    r2 = this;
                    r0 = r2
                    lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod$DelegateSourceMethodInfo r0 = r0.sourceMethodInfo
                    return r0
            }

            public boolean isReadOnly() {
                    r2 = this;
                    r0 = 1
                    return r0
            }

            public boolean equals(java.lang.Object r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    if (r0 != r1) goto L7
                    r0 = 1
                    return r0
                L7:
                    r0 = 0
                    return r0
            }

            static /* synthetic */ lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.DelegateSourceMethod access$0(org.eclipse.jdt.internal.core.JavaElement r3, org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r4) {
                    r0 = r3
                    r1 = r4
                    lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod r0 = forMethodDeclaration(r0, r1)
                    return r0
            }
        }

        public EclipseOnlyMethods() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        private static void cleanupDelegateMethods(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3) {
                r0 = r3
                org.eclipse.jdt.internal.core.CompilationUnit r0 = getCompilationUnit(r0)
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L11
                lombok.core.FieldAugment<org.eclipse.jdt.internal.core.CompilationUnit, java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<org.eclipse.jdt.internal.core.SourceMethod>>> r0 = lombok.eclipse.EcjAugments.EclipseAugments.CompilationUnit_delegateMethods
                r1 = r4
                java.lang.Object r0 = r0.clear(r1)
            L11:
                return
        }

        public static void collectGeneratedDelegateMethods(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r5, lombok.eclipse.EclipseNode r6, java.util.List<org.eclipse.jdt.internal.compiler.ast.MethodDeclaration> r7) {
                java.lang.String r0 = new java.lang.String
                r1 = r0
                r2 = r6
                lombok.core.LombokNode r2 = r2.m66up()
                lombok.eclipse.EclipseNode r2 = (lombok.eclipse.EclipseNode) r2
                r3 = r6
                java.lang.String r3 = r3.getName()
                char[] r3 = r3.toCharArray()
                char[][] r2 = lombok.eclipse.handlers.EclipseHandlerUtil.getQualifiedInnerName(r2, r3)
                r3 = 36
                char[] r2 = org.eclipse.jdt.core.compiler.CharOperation.concatWith(r2, r3)
                r1.<init>(r2)
                r8 = r0
                r0 = r5
                r1 = r8
                org.eclipse.jdt.internal.core.SourceType r0 = getSourceType(r0, r1)
                r9 = r0
                r0 = r9
                java.util.List r0 = getGeneratedMethods(r0)
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L32
                return
            L32:
                r0 = r7
                java.util.Iterator r0 = r0.iterator()
                r12 = r0
                goto L58
            L3d:
                r0 = r12
                java.lang.Object r0 = r0.next()
                org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
                r11 = r0
                r0 = r10
                r1 = r9
                r2 = r11
                lombok.eclipse.agent.PatchDelegate$EclipseOnlyMethods$DelegateSourceMethod r1 = lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.DelegateSourceMethod.access$0(r1, r2)
                boolean r0 = r0.add(r1)
            L58:
                r0 = r12
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L3d
                return
        }

        public static java.lang.Object[] addGeneratedDelegateMethodsToChildren(java.lang.Object[] r4, java.lang.Object r5) {
                r0 = r5
                org.eclipse.jdt.internal.core.SourceTypeElementInfo r0 = (org.eclipse.jdt.internal.core.SourceTypeElementInfo) r0
                org.eclipse.jdt.core.IType r0 = r0.getHandle()
                org.eclipse.jdt.internal.core.SourceType r0 = (org.eclipse.jdt.internal.core.SourceType) r0
                java.util.List r0 = getGeneratedMethods(r0)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L29
                r0 = r4
                org.eclipse.jdt.core.IJavaElement[] r0 = (org.eclipse.jdt.core.IJavaElement[]) r0
                r1 = r6
                r2 = 0
                org.eclipse.jdt.core.IJavaElement[] r2 = new org.eclipse.jdt.core.IJavaElement[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                org.eclipse.jdt.core.IJavaElement[] r1 = (org.eclipse.jdt.core.IJavaElement[]) r1
                java.lang.Class<org.eclipse.jdt.core.IJavaElement> r2 = org.eclipse.jdt.core.IJavaElement.class
                java.lang.Object[] r0 = lombok.eclipse.handlers.EclipseHandlerUtil.concat(r0, r1, r2)
                return r0
            L29:
                r0 = r4
                return r0
        }

        private static void notifyDelegateMethodsAdded(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r5) {
                r0 = r5
                org.eclipse.jdt.internal.core.CompilationUnit r0 = getCompilationUnit(r0)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L1d
                org.eclipse.jdt.internal.core.JavaModelManager r0 = org.eclipse.jdt.internal.core.JavaModelManager.getJavaModelManager()
                org.eclipse.jdt.internal.core.DeltaProcessor r0 = r0.getDeltaProcessor()
                r7 = r0
                r0 = r7
                org.eclipse.jdt.internal.core.JavaElementDelta r1 = new org.eclipse.jdt.internal.core.JavaElementDelta
                r2 = r1
                r3 = r6
                r2.<init>(r3)
                r2 = 1
                r0.fire(r1, r2)
            L1d:
                return
        }

        private static org.eclipse.jdt.internal.core.CompilationUnit getCompilationUnit(java.lang.Object r2) {
                r0 = r2
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.core.CompilationUnit
                if (r0 == 0) goto L11
                r0 = r2
                org.eclipse.jdt.internal.core.CompilationUnit r0 = (org.eclipse.jdt.internal.core.CompilationUnit) r0
                r3 = r0
                r0 = r3
                org.eclipse.jdt.internal.core.CompilationUnit r0 = r0.originalFromClone()
                return r0
            L11:
                r0 = 0
                return r0
        }

        private static org.eclipse.jdt.internal.core.CompilationUnit getCompilationUnit(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2) {
                r0 = r2
                org.eclipse.jdt.internal.compiler.CompilationResult r0 = r0.compilationResult
                org.eclipse.jdt.internal.compiler.env.ICompilationUnit r0 = r0.compilationUnit
                org.eclipse.jdt.internal.core.CompilationUnit r0 = getCompilationUnit(r0)
                return r0
        }

        private static java.util.List<org.eclipse.jdt.internal.core.SourceMethod> getGeneratedMethods(org.eclipse.jdt.internal.core.SourceType r5) {
                r0 = r5
                if (r0 == 0) goto L46
                r0 = r5
                org.eclipse.jdt.core.ICompilationUnit r0 = r0.getCompilationUnit()
                org.eclipse.jdt.internal.core.CompilationUnit r0 = getCompilationUnit(r0)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L46
                lombok.core.FieldAugment<org.eclipse.jdt.internal.core.CompilationUnit, java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<org.eclipse.jdt.internal.core.SourceMethod>>> r0 = lombok.eclipse.EcjAugments.EclipseAugments.CompilationUnit_delegateMethods
                r1 = r6
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r3 = r2
                r3.<init>()
                java.lang.Object r0 = r0.setIfAbsent(r1, r2)
                java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
                r7 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = r7
                r1 = r5
                java.lang.String r1 = r1.getTypeQualifiedName()
                r2 = r8
                java.lang.Object r0 = r0.putIfAbsent(r1, r2)
                java.util.List r0 = (java.util.List) r0
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L44
                r0 = r9
                goto L45
            L44:
                r0 = r8
            L45:
                return r0
            L46:
                r0 = 0
                return r0
        }

        private static org.eclipse.jdt.internal.core.SourceType getSourceType(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3, java.lang.String r4) {
                r0 = r3
                org.eclipse.jdt.internal.core.CompilationUnit r0 = getCompilationUnit(r0)
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L46
                r0 = r5
                org.eclipse.jdt.core.IType[] r0 = r0.getAllTypes()     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                r1 = r0
                r9 = r1
                int r0 = r0.length     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                r8 = r0
                r0 = 0
                r7 = r0
                goto L3b
            L19:
                r0 = r9
                r1 = r7
                r0 = r0[r1]     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                r6 = r0
                r0 = r6
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.core.SourceType     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                if (r0 == 0) goto L38
                r0 = r6
                java.lang.String r0 = r0.getTypeQualifiedName()     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                r1 = r4
                boolean r0 = r0.equals(r1)     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                if (r0 == 0) goto L38
                r0 = r6
                org.eclipse.jdt.internal.core.SourceType r0 = (org.eclipse.jdt.internal.core.SourceType) r0     // Catch: org.eclipse.jdt.core.JavaModelException -> L45
                return r0
            L38:
                int r7 = r7 + 1
            L3b:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L19
                goto L46
            L45:
            L46:
                r0 = 0
                return r0
        }

        static /* synthetic */ void access$0(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2) {
                r0 = r2
                cleanupDelegateMethods(r0)
                return
        }

        static /* synthetic */ void access$1(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2) {
                r0 = r2
                notifyDelegateMethodsAdded(r0)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$EclipseTypeBindingScanner.SCL.lombok */
    public static abstract class EclipseTypeBindingScanner {
        public EclipseTypeBindingScanner() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public void visitRaw(org.eclipse.jdt.internal.compiler.lookup.Binding r4) {
                r3 = this;
                r0 = r4
                if (r0 != 0) goto L5
                return
            L5:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.MethodBinding
                if (r0 == 0) goto L14
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.MethodBinding) r1
                r0.visitMethod(r1)
            L14:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.BaseTypeBinding
                if (r0 == 0) goto L23
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.BaseTypeBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.BaseTypeBinding) r1
                r0.visitBase(r1)
            L23:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ArrayBinding
                if (r0 == 0) goto L32
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.ArrayBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.ArrayBinding) r1
                r0.visitArray(r1)
            L32:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.UnresolvedReferenceBinding
                if (r0 == 0) goto L41
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.UnresolvedReferenceBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.UnresolvedReferenceBinding) r1
                r0.visitUnresolved(r1)
            L41:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.WildcardBinding
                if (r0 == 0) goto L50
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.WildcardBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.WildcardBinding) r1
                r0.visitWildcard(r1)
            L50:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding
                if (r0 == 0) goto L5f
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding) r1
                r0.visitTypeVariable(r1)
            L5f:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding
                if (r0 == 0) goto L6e
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding) r1
                r0.visitParameterized(r1)
            L6e:
                r0 = r4
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding
                if (r0 == 0) goto L7d
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = (org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) r1
                r0.visitReference(r1)
            L7d:
                return
        }

        public void visitReference(org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r2) {
                r1 = this;
                return
        }

        public void visitParameterized(org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.genericType()
                r0.visitRaw(r1)
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables()
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L33
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L2c
            L1e:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r3
                r1 = r6
                r0.visitRaw(r1)
                int r7 = r7 + 1
            L2c:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L1e
            L33:
                return
        }

        public void visitTypeVariable(org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.superclass
                r0.visitRaw(r1)
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.superInterfaces()
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L33
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto L2c
            L1e:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r3
                r1 = r6
                r0.visitRaw(r1)
                int r7 = r7 + 1
            L2c:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L1e
            L33:
                return
        }

        public void visitWildcard(org.eclipse.jdt.internal.compiler.lookup.WildcardBinding r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.bound
                r0.visitRaw(r1)
                return
        }

        public void visitUnresolved(org.eclipse.jdt.internal.compiler.lookup.UnresolvedReferenceBinding r2) {
                r1 = this;
                return
        }

        public void visitArray(org.eclipse.jdt.internal.compiler.lookup.ArrayBinding r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.leafComponentType()
                r0.visitRaw(r1)
                return
        }

        public void visitBase(org.eclipse.jdt.internal.compiler.lookup.BaseTypeBinding r2) {
                r1 = this;
                return
        }

        public void visitMethod(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r4) {
                r3 = this;
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
                if (r0 == 0) goto L29
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L23
            L16:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r3
                r1 = r5
                r0.visitRaw(r1)
                int r6 = r6 + 1
            L23:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto L16
            L29:
                r0 = r3
                r1 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.returnType
                r0.visitRaw(r1)
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.thrownExceptions
                if (r0 == 0) goto L5a
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.thrownExceptions
                r1 = r0
                r8 = r1
                int r0 = r0.length
                r7 = r0
                r0 = 0
                r6 = r0
                goto L54
            L47:
                r0 = r8
                r1 = r6
                r0 = r0[r1]
                r5 = r0
                r0 = r3
                r1 = r5
                r0.visitRaw(r1)
                int r6 = r6 + 1
            L54:
                r0 = r6
                r1 = r7
                if (r0 < r1) goto L47
            L5a:
                r0 = r4
                org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables()
                r5 = r0
                r0 = r5
                if (r0 == 0) goto Lb8
                r0 = r5
                r1 = r0
                r9 = r1
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r7 = r0
                goto Lb1
            L70:
                r0 = r9
                r1 = r7
                r0 = r0[r1]
                r6 = r0
                r0 = r3
                r1 = r6
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.superclass
                r0.visitRaw(r1)
                r0 = r6
                org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.superInterfaces()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto Lae
                r0 = r10
                r1 = r0
                r14 = r1
                int r0 = r0.length
                r13 = r0
                r0 = 0
                r12 = r0
                goto La7
            L97:
                r0 = r14
                r1 = r12
                r0 = r0[r1]
                r11 = r0
                r0 = r3
                r1 = r11
                r0.visitRaw(r1)
                int r12 = r12 + 1
            La7:
                r0 = r12
                r1 = r13
                if (r0 < r1) goto L97
            Lae:
                int r7 = r7 + 1
            Lb1:
                r0 = r7
                r1 = r8
                if (r0 < r1) goto L70
            Lb8:
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$Reflection.SCL.lombok */
    private static final class Reflection {
        public static final java.lang.reflect.Method classScopeBuildFieldsAndMethodsMethod = null;
        public static final java.lang.Throwable initCause = null;

        static {
                r0 = 0
                r4 = r0
                r0 = 0
                r5 = r0
                java.lang.Class<org.eclipse.jdt.internal.compiler.lookup.ClassScope> r0 = org.eclipse.jdt.internal.compiler.lookup.ClassScope.class
                java.lang.String r1 = "buildFieldsAndMethods"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L13
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L13
                r4 = r0
                goto L16
            L13:
                r6 = move-exception
                r0 = r6
                r5 = r0
            L16:
                r0 = r4
                lombok.eclipse.agent.PatchDelegate.Reflection.classScopeBuildFieldsAndMethodsMethod = r0
                r0 = r5
                lombok.eclipse.agent.PatchDelegate.Reflection.initCause = r0
                return
        }

        private Reflection() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/agent/PatchDelegate$TypeVarFinder.SCL.lombok */
    public static class TypeVarFinder extends lombok.eclipse.agent.PatchDelegate.EclipseTypeBindingScanner {
        private java.util.Set<java.lang.String> typeVars;

        public TypeVarFinder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.HashSet r1 = new java.util.HashSet
                r2 = r1
                r2.<init>()
                r0.typeVars = r1
                return
        }

        public java.util.Set<java.lang.String> getTypeVariables() {
                r2 = this;
                r0 = r2
                java.util.Set<java.lang.String> r0 = r0.typeVars
                return r0
        }

        @Override // lombok.eclipse.agent.PatchDelegate.EclipseTypeBindingScanner
        public void visitTypeVariable(org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding r6) {
                r5 = this;
                r0 = r6
                char[] r0 = r0.sourceName
                if (r0 == 0) goto L1c
                r0 = r5
                java.util.Set<java.lang.String> r0 = r0.typeVars
                java.lang.String r1 = new java.lang.String
                r2 = r1
                r3 = r6
                char[] r3 = r3.sourceName
                r2.<init>(r3)
                boolean r0 = r0.add(r1)
            L1c:
                r0 = r5
                r1 = r6
                super.visitTypeVariable(r1)
                return
        }
    }

    static {
            lombok.eclipse.agent.PatchDelegate$1 r0 = new lombok.eclipse.agent.PatchDelegate$1
            r1 = r0
            r1.<init>()
            lombok.eclipse.agent.PatchDelegate.visited = r0
            r0 = 1
            lombok.eclipse.agent.PatchDelegate.eclipseAvailable = r0
            java.lang.Class<org.eclipse.jdt.internal.core.CompilationUnit> r0 = org.eclipse.jdt.internal.core.CompilationUnit.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L17
            goto L1c
        L17:
            r0 = 0
            lombok.eclipse.agent.PatchDelegate.eclipseAvailable = r0
        L1c:
            r0 = 6
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 109(0x6d, float:1.53E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 98
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 111(0x6f, float:1.56E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 107(0x6b, float:1.5E-43)
            r1[r2] = r3
            lombok.eclipse.agent.PatchDelegate.STRING_LOMBOK = r0
            r0 = 12
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 120(0x78, float:1.68E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 112(0x70, float:1.57E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 114(0x72, float:1.6E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 105(0x69, float:1.47E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 109(0x6d, float:1.53E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 110(0x6e, float:1.54E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            lombok.eclipse.agent.PatchDelegate.STRING_EXPERIMENTAL = r0
            r0 = 8
            char[] r0 = new char[r0]
            r1 = r0
            r2 = 0
            r3 = 68
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 108(0x6c, float:1.51E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 103(0x67, float:1.44E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 97
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 116(0x74, float:1.63E-43)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 101(0x65, float:1.42E-43)
            r1[r2] = r3
            lombok.eclipse.agent.PatchDelegate.STRING_DELEGATE = r0
            r0 = 12
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "hashCode()"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "canEqual(java.lang.Object)"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "equals(java.lang.Object)"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "wait()"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "wait(long)"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "wait(long, int)"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "notify()"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "notifyAll()"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "toString()"
            r1[r2] = r3
            r1 = r0
            r2 = 9
            java.lang.String r3 = "getClass()"
            r1[r2] = r3
            r1 = r0
            r2 = 10
            java.lang.String r3 = "clone()"
            r1[r2] = r3
            r1 = r0
            r2 = 11
            java.lang.String r3 = "finalize()"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            lombok.eclipse.agent.PatchDelegate.METHODS_IN_OBJECT = r0
            return
    }

    public PatchDelegate() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.String nameOfScope(org.eclipse.jdt.internal.compiler.lookup.ClassScope r4) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            java.lang.String r0 = "(unknown)"
            return r0
        Lc:
            r0 = r5
            char[] r0 = r0.name
            if (r0 == 0) goto L1b
            r0 = r5
            char[] r0 = r0.name
            int r0 = r0.length
            if (r0 != 0) goto L1e
        L1b:
            java.lang.String r0 = "(unknown)"
            return r0
        L1e:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r5
            char[] r2 = r2.name
            r1.<init>(r2)
            return r0
    }

    private static boolean hasDelegateMarkedFieldsOrMethods(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 == 0) goto L58
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r0
            r7 = r1
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r5 = r0
            goto L53
        L15:
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r4 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L24
            goto L50
        L24:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L49
        L34:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = r3
            boolean r0 = isDelegate(r0, r1)
            if (r0 == 0) goto L46
            r0 = 1
            return r0
        L46:
            int r9 = r9 + 1
        L49:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L34
        L50:
            int r5 = r5 + 1
        L53:
            r0 = r5
            r1 = r6
            if (r0 < r1) goto L15
        L58:
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto Lb0
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r7 = r1
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r5 = r0
            goto Lab
        L6d:
            r0 = r7
            r1 = r5
            r0 = r0[r1]
            r4 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L7c
            goto La8
        L7c:
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto La1
        L8c:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = r3
            boolean r0 = isDelegate(r0, r1)
            if (r0 == 0) goto L9e
            r0 = 1
            return r0
        L9e:
            int r9 = r9 + 1
        La1:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L8c
        La8:
            int r5 = r5 + 1
        Lab:
            r0 = r5
            r1 = r6
            if (r0 < r1) goto L6d
        Lb0:
            r0 = 0
            return r0
    }

    public static boolean handleDelegateForType(org.eclipse.jdt.internal.compiler.lookup.ClassScope r5) {
            boolean r0 = lombok.eclipse.TransformEclipseAST.disableLombok
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r5
            org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r0 = r0.compilationUnitScope()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = r0.referenceContext
            r6 = r0
            r0 = r5
            r1 = r5
            org.eclipse.jdt.internal.compiler.lookup.CompilationUnitScope r1 = r1.compilationUnitScope()
            org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding[] r1 = r1.topLevelTypes
            r2 = 0
            r1 = r1[r2]
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r1 = r1.scope
            if (r0 != r1) goto L2a
            boolean r0 = lombok.eclipse.agent.PatchDelegate.eclipseAvailable
            if (r0 == 0) goto L2a
            r0 = r6
            lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.access$0(r0)
        L2a:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            boolean r0 = hasDelegateMarkedFieldsOrMethods(r0)
            if (r0 != 0) goto L36
            r0 = 0
            return r0
        L36:
            java.lang.ThreadLocal<java.util.List<lombok.eclipse.agent.PatchDelegate$ClassScopeEntry>> r0 = lombok.eclipse.agent.PatchDelegate.visited
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L8a
        L4d:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchDelegate$ClassScopeEntry r0 = (lombok.eclipse.agent.PatchDelegate.ClassScopeEntry) r0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L72
            r0 = r8
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r1 = r1.scope
            java.lang.String r1 = nameOfScope(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L8a
        L72:
            r0 = r9
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.scope
            r1 = r5
            if (r0 != r1) goto L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = nameOfScope(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r8 = r0
        L8a:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4d
            r0 = r8
            if (r0 == 0) goto Le2
            r0 = 0
            r9 = r0
            r0 = r8
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto Ld5
        Lac:
            r0 = r12
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchDelegate$ClassScopeEntry r0 = (lombok.eclipse.agent.PatchDelegate.ClassScopeEntry) r0
            r11 = r0
            r0 = r9
            if (r0 != 0) goto Lc9
            r0 = r11
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.scope
            r1 = r5
            if (r0 != r1) goto Lc9
            r0 = 1
            r9 = r0
        Lc9:
            r0 = r9
            if (r0 == 0) goto Ld5
            r0 = r11
            r1 = r10
            r0.corruptedPath = r1
        Ld5:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lac
            goto L1f1
        Le2:
            lombok.eclipse.agent.PatchDelegate$ClassScopeEntry r0 = new lombok.eclipse.agent.PatchDelegate$ClassScopeEntry
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r9 = r0
            r0 = r7
            r1 = r9
            boolean r0 = r0.add(r1)
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext     // Catch: java.lang.Throwable -> L1a8
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L1cf
            r0 = r6
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)     // Catch: java.lang.Throwable -> L1a8
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a8
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L1a8
            r12 = r0
            r0 = r6
            r1 = r5
            r2 = r12
            fillMethodBindingsForFields(r0, r1, r2)     // Catch: java.lang.Throwable -> L1a8
            r0 = r9
            java.lang.String r0 = r0.corruptedPath     // Catch: java.lang.Throwable -> L1a8
            if (r0 == 0) goto L145
            r0 = r11
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = r1.referenceContext     // Catch: java.lang.Throwable -> L1a8
            lombok.core.LombokNode r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a8
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a8
            r2 = r1
            java.lang.String r3 = "No @Delegate methods created because there's a loop: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a8
            r2 = r9
            java.lang.String r2 = r2.corruptedPath     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1a8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a8
            r0.addError(r1)     // Catch: java.lang.Throwable -> L1a8
            goto L157
        L145:
            r0 = r11
            r1 = r10
            lombok.core.LombokNode r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a8
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Throwable -> L1a8
            r1 = r12
            lombok.eclipse.agent.PatchDelegate$DelegateReceiver r2 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.FIELD     // Catch: java.lang.Throwable -> L1a8
            generateDelegateMethods(r0, r1, r2)     // Catch: java.lang.Throwable -> L1a8
        L157:
            r0 = r12
            r0.clear()     // Catch: java.lang.Throwable -> L1a8
            r0 = r6
            r1 = r5
            r2 = r12
            fillMethodBindingsForMethods(r0, r1, r2)     // Catch: java.lang.Throwable -> L1a8
            r0 = r9
            java.lang.String r0 = r0.corruptedPath     // Catch: java.lang.Throwable -> L1a8
            if (r0 == 0) goto L193
            r0 = r11
            r1 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1 = r1.referenceContext     // Catch: java.lang.Throwable -> L1a8
            lombok.core.LombokNode r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a8
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a8
            r2 = r1
            java.lang.String r3 = "No @Delegate methods created because there's a loop: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a8
            r2 = r9
            java.lang.String r2 = r2.corruptedPath     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L1a8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a8
            r0.addError(r1)     // Catch: java.lang.Throwable -> L1a8
            goto L1cf
        L193:
            r0 = r11
            r1 = r10
            lombok.core.LombokNode r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1a8
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Throwable -> L1a8
            r1 = r12
            lombok.eclipse.agent.PatchDelegate$DelegateReceiver r2 = lombok.eclipse.agent.PatchDelegate.DelegateReceiver.METHOD     // Catch: java.lang.Throwable -> L1a8
            generateDelegateMethods(r0, r1, r2)     // Catch: java.lang.Throwable -> L1a8
            goto L1cf
        L1a8:
            r13 = move-exception
            r0 = r7
            r1 = r7
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1cc
            boolean r0 = lombok.eclipse.agent.PatchDelegate.eclipseAvailable
            if (r0 == 0) goto L1cc
            r0 = r6
            lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.access$1(r0)
        L1cc:
            r0 = r13
            throw r0
        L1cf:
            r0 = r7
            r1 = r7
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f1
            boolean r0 = lombok.eclipse.agent.PatchDelegate.eclipseAvailable
            if (r0 == 0) goto L1f1
            r0 = r6
            lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.access$1(r0)
        L1f1:
            r0 = 0
            return r0
    }

    private static java.lang.String containsDuplicates(java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L34
        L12:
            r0 = r6
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchDelegate$BindingTuple r0 = (lombok.eclipse.agent.PatchDelegate.BindingTuple) r0
            r5 = r0
            r0 = r4
            r1 = r5
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.parameterized
            java.lang.String r1 = printSig(r1)
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto L34
            r0 = r5
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.parameterized
            java.lang.String r0 = printSig(r0)
            return r0
        L34:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = 0
            return r0
    }

    public static void markHandled(org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.Annotation, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.Annotation_applied
            r1 = r4
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    private static void fillMethodBindingsForFields(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r9, org.eclipse.jdt.internal.compiler.lookup.ClassScope r10, java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r11) {
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            r12 = r0
            r0 = r12
            if (r0 != 0) goto La
            return
        La:
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            if (r0 == 0) goto L230
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.FieldDeclaration[] r0 = r0.fields
            r1 = r0
            r16 = r1
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r14 = r0
            goto L229
        L21:
            r0 = r16
            r1 = r14
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L33
            goto L226
        L33:
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r20 = r1
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r18 = r0
            goto L21f
        L44:
            r0 = r20
            r1 = r18
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            r1 = r12
            boolean r0 = isDelegate(r0, r1)
            if (r0 != 0) goto L57
            goto L21c
        L57:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.Annotation, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.Annotation_applied
            r1 = r17
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            goto L21c
        L6f:
            r0 = r13
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L93
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r21 = r0
            r0 = r21
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            goto L226
        L93:
            r0 = r17
            java.lang.String r1 = "types"
            java.util.List r0 = rawTypes(r0, r1)
            r21 = r0
            r0 = r17
            java.lang.String r1 = "excludes"
            java.util.List r0 = rawTypes(r0, r1)
            r22 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r22
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r26 = r0
            goto Lf0
        Lc5:
            r0 = r26
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r25 = r0
            r0 = r23
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            java.util.HashSet r2 = new java.util.HashSet     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r3 = r2
            r3.<init>()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r3 = r13
            char[] r3 = r3.name     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
        Lf0:
            r0 = r26
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            if (r0 != 0) goto Lc5
            r0 = r12
            java.util.Set r0 = findAlreadyImplementedMethods(r0)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r25 = r0
            r0 = r23
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r27 = r0
            goto L128
        L10c:
            r0 = r27
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            lombok.eclipse.agent.PatchDelegate$BindingTuple r0 = (lombok.eclipse.agent.PatchDelegate.BindingTuple) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r26 = r0
            r0 = r25
            r1 = r26
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.parameterized     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            java.lang.String r1 = printSig(r1)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            boolean r0 = r0.add(r1)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
        L128:
            r0 = r27
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            if (r0 != 0) goto L10c
            r0 = r21
            boolean r0 = r0.isEmpty()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            if (r0 == 0) goto L159
            r0 = r24
            r1 = r13
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r2 = r25
            r3 = r13
            char[] r3 = r3.name     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            goto L1d8
        L159:
            r0 = r21
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r27 = r0
            goto L18b
        L165:
            r0 = r27
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r26 = r0
            r0 = r24
            r1 = r26
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r2 = r25
            r3 = r13
            char[] r3 = r3.name     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
        L18b:
            r0 = r27
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L198
            if (r0 != 0) goto L165
            goto L1d8
        L198:
            r25 = move-exception
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r26 = r0
            r0 = r26
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate does not support recursion (delegating to a type that itself has @Delegate members). Member \"%s\" is @Delegate in type \"%s\""
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r25
            char[] r7 = r7.member
            r6.<init>(r7)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r25
            char[] r7 = r7.type
            r6.<init>(r7)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
            goto L226
        L1d8:
            r0 = r24
            java.lang.String r0 = containsDuplicates(r0)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L213
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r26 = r0
            r0 = r26
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The method '"
            r2.<init>(r3)
            r2 = r25
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' is being delegated by more than one specified type."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            goto L21c
        L213:
            r0 = r11
            r1 = r24
            boolean r0 = r0.addAll(r1)
        L21c:
            int r18 = r18 + 1
        L21f:
            r0 = r18
            r1 = r19
            if (r0 < r1) goto L44
        L226:
            int r14 = r14 + 1
        L229:
            r0 = r14
            r1 = r15
            if (r0 < r1) goto L21
        L230:
            return
    }

    private static void fillMethodBindingsForMethods(org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r9, org.eclipse.jdt.internal.compiler.lookup.ClassScope r10, java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r11) {
            r0 = r10
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = r0.referenceContext
            r12 = r0
            r0 = r12
            if (r0 != 0) goto La
            return
        La:
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            if (r0 == 0) goto L284
            r0 = r12
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r16 = r1
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r14 = r0
            goto L27d
        L21:
            r0 = r16
            r1 = r14
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            if (r0 != 0) goto L33
            goto L27a
        L33:
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r0 = r0.annotations
            r1 = r0
            r20 = r1
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r18 = r0
            goto L273
        L44:
            r0 = r20
            r1 = r18
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            r1 = r12
            boolean r0 = isDelegate(r0, r1)
            if (r0 != 0) goto L57
            goto L270
        L57:
            lombok.core.FieldAugment<org.eclipse.jdt.internal.compiler.ast.Annotation, java.lang.Boolean> r0 = lombok.eclipse.EcjAugments.Annotation_applied
            r1 = r17
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            goto L270
        L6f:
            r0 = r13
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            if (r0 != 0) goto L90
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r21 = r0
            r0 = r21
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            goto L27a
        L90:
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 == 0) goto Lb1
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r21 = r0
            r0 = r21
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            goto L27a
        Lb1:
            r0 = r13
            int r0 = r0.modifiers
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Ld5
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r21 = r0
            r0 = r21
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            goto L27a
        Ld5:
            r0 = r13
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.MethodDeclaration) r0
            r21 = r0
            r0 = r17
            java.lang.String r1 = "types"
            java.util.List r0 = rawTypes(r0, r1)
            r22 = r0
            r0 = r17
            java.lang.String r1 = "excludes"
            java.util.List r0 = rawTypes(r0, r1)
            r23 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r24 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r25 = r0
            r0 = r23
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r27 = r0
            goto L139
        L10e:
            r0 = r27
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r26 = r0
            r0 = r24
            r1 = r26
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            java.util.HashSet r2 = new java.util.HashSet     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r3 = r2
            r3.<init>()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r3 = r21
            char[] r3 = r3.selector     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
        L139:
            r0 = r27
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            if (r0 != 0) goto L10e
            r0 = r12
            java.util.Set r0 = findAlreadyImplementedMethods(r0)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r26 = r0
            r0 = r24
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r28 = r0
            goto L171
        L155:
            r0 = r28
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            lombok.eclipse.agent.PatchDelegate$BindingTuple r0 = (lombok.eclipse.agent.PatchDelegate.BindingTuple) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r27 = r0
            r0 = r26
            r1 = r27
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.parameterized     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            java.lang.String r1 = printSig(r1)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            boolean r0 = r0.add(r1)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
        L171:
            r0 = r28
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            if (r0 != 0) goto L155
            r0 = r22
            boolean r0 = r0.isEmpty()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            if (r0 == 0) goto L1ad
            r0 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            if (r0 != 0) goto L190
            goto L270
        L190:
            r0 = r25
            r1 = r21
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.returnType     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r2 = r26
            r3 = r21
            char[] r3 = r3.selector     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            goto L22c
        L1ad:
            r0 = r22
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r28 = r0
            goto L1df
        L1b9:
            r0 = r28
            java.lang.Object r0 = r0.next()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r0 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r0     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r27 = r0
            r0 = r25
            r1 = r27
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r2 = r12
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r2 = r2.initializerScope     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.resolveType(r2)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r2 = r26
            r3 = r21
            char[] r3 = r3.selector     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            r4 = r17
            addAllMethodBindings(r0, r1, r2, r3, r4)     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
        L1df:
            r0 = r28
            boolean r0 = r0.hasNext()     // Catch: lombok.eclipse.agent.PatchDelegate.DelegateRecursion -> L1ec
            if (r0 != 0) goto L1b9
            goto L22c
        L1ec:
            r26 = move-exception
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r27 = r0
            r0 = r27
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.String r1 = "@Delegate does not support recursion (delegating to a type that itself has @Delegate members). Member \"%s\" is @Delegate in type \"%s\""
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r26
            char[] r7 = r7.member
            r6.<init>(r7)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = new java.lang.String
            r6 = r5
            r7 = r26
            char[] r7 = r7.type
            r6.<init>(r7)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
            goto L27a
        L22c:
            r0 = r25
            java.lang.String r0 = containsDuplicates(r0)
            r26 = r0
            r0 = r26
            if (r0 == 0) goto L267
            r0 = r9
            r1 = 1
            lombok.eclipse.EclipseAST r0 = lombok.eclipse.TransformEclipseAST.getAST(r0, r1)
            r27 = r0
            r0 = r27
            r1 = r17
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "The method '"
            r2.<init>(r3)
            r2 = r26
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' is being delegated by more than one specified type."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            goto L270
        L267:
            r0 = r11
            r1 = r25
            boolean r0 = r0.addAll(r1)
        L270:
            int r18 = r18 + 1
        L273:
            r0 = r18
            r1 = r19
            if (r0 < r1) goto L44
        L27a:
            int r14 = r14 + 1
        L27d:
            r0 = r14
            r1 = r15
            if (r0 < r1) goto L21
        L284:
            return
    }

    private static boolean isDelegate(org.eclipse.jdt.internal.compiler.ast.Annotation r3, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r4) {
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.String r0 = "Delegate"
            r1 = r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = r1.type
            char[] r1 = r1.getLastToken()
            boolean r0 = charArrayEquals(r0, r1)
            if (r0 != 0) goto L1b
            r0 = 0
            return r0
        L1b:
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r4
            org.eclipse.jdt.internal.compiler.lookup.MethodScope r1 = r1.initializerScope
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.resolveType(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2d:
            java.lang.String r0 = "lombok"
            r1 = r5
            char[] r1 = r1.qualifiedPackageName()
            boolean r0 = charArrayEquals(r0, r1)
            if (r0 != 0) goto L49
            java.lang.String r0 = "lombok.experimental"
            r1 = r5
            char[] r1 = r1.qualifiedPackageName()
            boolean r0 = charArrayEquals(r0, r1)
            if (r0 != 0) goto L49
            r0 = 0
            return r0
        L49:
            java.lang.String r0 = "Delegate"
            r1 = r5
            char[] r1 = r1.qualifiedSourceName()
            boolean r0 = charArrayEquals(r0, r1)
            if (r0 != 0) goto L58
            r0 = 0
            return r0
        L58:
            r0 = 1
            return r0
    }

    private static java.util.List<org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess> rawTypes(org.eclipse.jdt.internal.compiler.ast.Annotation r3, java.lang.String r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r3
            org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs()
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L89
        L18:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            r1 = r6
            char[] r1 = r1.name
            boolean r0 = charArrayEquals(r0, r1)
            if (r0 == 0) goto L86
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ArrayInitializer
            if (r0 == 0) goto L6e
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            org.eclipse.jdt.internal.compiler.ast.ArrayInitializer r0 = (org.eclipse.jdt.internal.compiler.ast.ArrayInitializer) r0
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.expressions
            r1 = r0
            r13 = r1
            int r0 = r0.length
            r12 = r0
            r0 = 0
            r11 = r0
            goto L67
        L49:
            r0 = r13
            r1 = r11
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            if (r0 == 0) goto L64
            r0 = r5
            r1 = r10
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r1 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r1
            boolean r0 = r0.add(r1)
        L64:
            int r11 = r11 + 1
        L67:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto L49
        L6e:
            r0 = r6
            org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.value
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess
            if (r0 == 0) goto L86
            r0 = r5
            r1 = r6
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.value
            org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess r1 = (org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess) r1
            boolean r0 = r0.add(r1)
        L86:
            int r7 = r7 + 1
        L89:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L18
            r0 = r5
            return r0
    }

    private static void generateDelegateMethods(lombok.eclipse.EclipseNode r7, java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r8, lombok.eclipse.agent.PatchDelegate.DelegateReceiver r9) {
            r0 = r7
            lombok.core.LombokNode r0 = r0.top()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration) r0
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L8b
        L22:
            r0 = r13
            java.lang.Object r0 = r0.next()
            lombok.eclipse.agent.PatchDelegate$BindingTuple r0 = (lombok.eclipse.agent.PatchDelegate.BindingTuple) r0
            r12 = r0
            r0 = r7
            lombok.eclipse.EclipseAST r0 = r0.getAst()
            r1 = r12
            org.eclipse.jdt.internal.compiler.ast.ASTNode r1 = r1.responsible
            lombok.core.LombokNode r0 = r0.get(r1)
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r14 = r0
            r0 = r12
            char[] r0 = r0.fieldName
            r1 = r7
            r2 = r12
            r3 = r10
            org.eclipse.jdt.internal.compiler.CompilationResult r3 = r3.compilationResult
            r4 = r14
            r5 = r9
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = createDelegateMethod(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L8b
            lombok.eclipse.handlers.SetGeneratedByVisitor r0 = new lombok.eclipse.handlers.SetGeneratedByVisitor
            r1 = r0
            r2 = r14
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r2 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r2
            r1.<init>(r2)
            r16 = r0
            r0 = r15
            r1 = r16
            r2 = r7
            java.lang.Object r2 = r2.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r2
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            r0.traverse(r1, r2)
            r0 = r7
            r1 = r15
            lombok.eclipse.EclipseNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.injectMethod(r0, r1)
            r0 = r11
            r1 = r15
            boolean r0 = r0.add(r1)
        L8b:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L22
            boolean r0 = lombok.eclipse.agent.PatchDelegate.eclipseAvailable
            if (r0 == 0) goto La2
            r0 = r10
            r1 = r7
            r2 = r11
            lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.collectGeneratedDelegateMethods(r0, r1, r2)
        La2:
            return
    }

    public static void checkConflictOfTypeVarNames(lombok.eclipse.agent.PatchDelegate.BindingTuple r5, lombok.eclipse.EclipseNode r6) throws lombok.eclipse.agent.PatchDelegate.CantMakeDelegates {
            r0 = r5
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.parameterized
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L11
            r0 = r7
            int r0 = r0.length
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            r9 = r0
            goto L81
        L20:
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L77
            r0 = r9
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.TypeDeclaration) r0
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L77
            r0 = r10
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L70
        L4b:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            char[] r0 = r0.name
            if (r0 == 0) goto L6d
            r0 = r8
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r11
            char[] r3 = r3.name
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        L6d:
            int r12 = r12 + 1
        L70:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L4b
        L77:
            r0 = r9
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0
            r9 = r0
        L81:
            r0 = r9
            if (r0 != 0) goto L20
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r7
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto Lc3
        L9c:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            char[] r0 = r0.sourceName()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto Lc0
            r0 = r10
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r15
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
        Lc0:
            int r12 = r12 + 1
        Lc3:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L9c
            r0 = r10
            r1 = r8
            boolean r0 = r0.retainAll(r1)
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lde
            return
        Lde:
            lombok.eclipse.agent.PatchDelegate$TypeVarFinder r0 = new lombok.eclipse.agent.PatchDelegate$TypeVarFinder
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r5
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r1 = r1.base
            r0.visitRaw(r1)
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = r11
            java.util.Set r2 = r2.getTypeVariables()
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r10
            boolean r0 = r0.removeAll(r1)
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L125
            lombok.eclipse.agent.PatchDelegate$CantMakeDelegates r0 = new lombok.eclipse.agent.PatchDelegate$CantMakeDelegates
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            r1 = r10
            r0.conflicted = r1
            r0 = r13
            throw r0
        L125:
            return
    }

    private static org.eclipse.jdt.internal.compiler.ast.MethodDeclaration createDelegateMethod(char[] r11, lombok.eclipse.EclipseNode r12, lombok.eclipse.agent.PatchDelegate.BindingTuple r13, org.eclipse.jdt.internal.compiler.CompilationResult r14, lombok.eclipse.EclipseNode r15, lombok.eclipse.agent.PatchDelegate.DelegateReceiver r16) {
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.base
            int r0 = r0.modifiers
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r17 = r0
            r0 = r13
            r1 = r12
            checkConflictOfTypeVarNames(r0, r1)     // Catch: lombok.eclipse.agent.PatchDelegate.CantMakeDelegates -> L1d
            goto L3b
        L1d:
            r18 = move-exception
            r0 = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "There's a conflict in the names of type parameters. Fix it by renaming the following type parameters of your class: "
            r2.<init>(r3)
            r2 = r18
            java.util.Set<java.lang.String> r2 = r2.conflicted
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            r0 = 0
            return r0
        L3b:
            r0 = r15
            java.lang.Object r0 = r0.get()
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
            r18 = r0
            r0 = r18
            int r0 = r0.sourceStart
            r19 = r0
            r0 = r18
            int r0 = r0.sourceEnd
            r20 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.parameterized
            r21 = r0
            org.eclipse.jdt.internal.compiler.ast.MethodDeclaration r0 = new org.eclipse.jdt.internal.compiler.ast.MethodDeclaration
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            r22 = r0
            r0 = r22
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            r1 = r19
            r0.sourceStart = r1
            r0 = r22
            r1 = r20
            r0.sourceEnd = r1
            r0 = r22
            r1 = 1
            r0.modifiers = r1
            r0 = r22
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.returnType
            r2 = r18
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r1, r2, r3)
            r0.returnType = r1
            r0 = r21
            boolean r0 = r0.isDeprecated()
            r23 = r0
            r0 = r22
            r1 = r21
            char[] r1 = r1.selector
            r0.selector = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.thrownExceptions
            if (r0 == 0) goto Le9
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.thrownExceptions
            int r0 = r0.length
            if (r0 <= 0) goto Le9
            r0 = r22
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r1 = r1.thrownExceptions
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
            r0.thrownExceptions = r1
            r0 = 0
            r24 = r0
            goto Lde
        Lc5:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.thrownExceptions
            r1 = r24
            r2 = r21
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r2 = r2.thrownExceptions
            r3 = r24
            r2 = r2[r3]
            r3 = r18
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r2, r3, r4)
            r0[r1] = r2
            int r24 = r24 + 1
        Lde:
            r0 = r24
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = r1.thrownExceptions
            int r1 = r1.length
            if (r0 < r1) goto Lc5
        Le9:
            org.eclipse.jdt.internal.compiler.ast.MessageSend r0 = new org.eclipse.jdt.internal.compiler.ast.MessageSend
            r1 = r0
            r1.<init>()
            r24 = r0
            r0 = r24
            r1 = r19
            r0.sourceStart = r1
            r0 = r24
            r1 = r20
            r0.sourceEnd = r1
            r0 = r24
            r1 = r18
            long r1 = lombok.eclipse.Eclipse.pos(r1)
            r0.nameSourcePosition = r1
            r0 = r24
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            r1 = r16
            r2 = r18
            r3 = r11
            org.eclipse.jdt.internal.compiler.ast.Expression r1 = r1.get(r2, r3)
            r0.receiver = r1
            r0 = r24
            r1 = r21
            char[] r1 = r1.selector
            r0.selector = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables
            if (r0 == 0) goto L2b7
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables
            int r0 = r0.length
            if (r0 <= 0) goto L2b7
            r0 = r22
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r1 = r1.typeVariables
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter[r1]
            r0.typeParameters = r1
            r0 = r24
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r1 = r1.typeVariables
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
            r0.typeArguments = r1
            r0 = 0
            r25 = r0
            goto L2ac
        L15c:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r2 = new org.eclipse.jdt.internal.compiler.ast.TypeParameter
            r3 = r2
            r3.<init>()
            r0[r1] = r2
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r19
            r0.sourceStart = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r20
            r0.sourceEnd = r1
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r1 = r1.typeVariables
            r2 = r25
            r1 = r1[r2]
            char[] r1 = r1.sourceName
            r0.name = r1
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            r3 = r2
            r4 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r4 = r4.typeVariables
            r5 = r25
            r4 = r4[r5]
            char[] r4 = r4.sourceName
            r5 = r18
            long r5 = lombok.eclipse.Eclipse.pos(r5)
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.typeArguments
            r1 = r25
            r0 = r0[r1]
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables
            r1 = r25
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.superclass
            r26 = r0
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding[] r0 = r0.typeVariables
            r1 = r25
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.superInterfaces
            r27 = r0
            r0 = r27
            if (r0 != 0) goto L1fb
            r0 = 0
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = new org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[r0]
            r27 = r0
        L1fb:
            r0 = r26
            if (r0 != 0) goto L206
            r0 = r27
            int r0 = r0.length
            if (r0 <= 0) goto L2a9
        L206:
            r0 = r26
            if (r0 != 0) goto L20f
            r0 = 0
            goto L210
        L20f:
            r0 = 1
        L210:
            r28 = r0
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r27
            int r1 = r1.length
            r2 = r28
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 - r2
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r1 = new org.eclipse.jdt.internal.compiler.ast.TypeReference[r1]
            r0.bounds = r1
            r0 = r26
            if (r0 == 0) goto L243
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r26
            r2 = r18
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r1, r2, r3)
            r0.type = r1
            goto L258
        L243:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            r1 = r27
            r2 = 0
            r1 = r1[r2]
            r2 = r18
            r3 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r1 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r1, r2, r3)
            r0.type = r1
        L258:
            r0 = 0
            r29 = r0
            r0 = r26
            if (r0 != 0) goto L264
            r0 = 1
            goto L265
        L264:
            r0 = 0
        L265:
            r30 = r0
            goto L2a1
        L26a:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.bounds
            r1 = r29
            r2 = r27
            r3 = r30
            r2 = r2[r3]
            r3 = r18
            r4 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r2 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r2, r3, r4)
            r0[r1] = r2
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters
            r1 = r25
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference[] r0 = r0.bounds
            r1 = r29
            int r29 = r29 + 1
            r0 = r0[r1]
            r1 = r0
            int r1 = r1.bits
            r2 = 16
            r1 = r1 | r2
            r0.bits = r1
            int r30 = r30 + 1
        L2a1:
            r0 = r30
            r1 = r27
            int r1 = r1.length
            if (r0 < r1) goto L26a
        L2a9:
            int r25 = r25 + 1
        L2ac:
            r0 = r25
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r1 = r1.typeParameters
            int r1 = r1.length
            if (r0 < r1) goto L15c
        L2b7:
            r0 = r23
            if (r0 == 0) goto L2cd
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Annotation[] r1 = new org.eclipse.jdt.internal.compiler.ast.Annotation[r1]
            r2 = r1
            r3 = 0
            r4 = r18
            org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation r4 = lombok.eclipse.handlers.EclipseHandlerUtil.generateDeprecatedAnnotation(r4)
            r2[r3] = r4
            r0.annotations = r1
        L2cd:
            r0 = r22
            r1 = r0
            int r1 = r1.bits
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r2
            r0.bits = r1
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            if (r0 == 0) goto L3d0
            r0 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            int r0 = r0.length
            if (r0 <= 0) goto L3d0
            r0 = r22
            r1 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r1 = r1.parameters
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = new org.eclipse.jdt.internal.compiler.ast.Argument[r1]
            r0.arguments = r1
            r0 = r24
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            org.eclipse.jdt.internal.compiler.ast.Expression[] r1 = new org.eclipse.jdt.internal.compiler.ast.Expression[r1]
            r0.arguments = r1
            r0 = 0
            r25 = r0
            goto L3a4
        L30d:
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = r0.base     // Catch: java.lang.Exception -> L319
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r0 = r0.sourceMethod()     // Catch: java.lang.Exception -> L319
            r26 = r0
            goto L31d
        L319:
            r0 = 0
            r26 = r0
        L31d:
            r0 = r26
            if (r0 != 0) goto L33c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "arg"
            r1.<init>(r2)
            r1 = r25
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            r27 = r0
            goto L349
        L33c:
            r0 = r26
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r25
            r0 = r0[r1]
            char[] r0 = r0.name
            r27 = r0
        L349:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.Argument r2 = new org.eclipse.jdt.internal.compiler.ast.Argument
            r3 = r2
            r4 = r27
            r5 = r18
            long r5 = lombok.eclipse.Eclipse.pos(r5)
            r6 = r21
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r6 = r6.parameters
            r7 = r25
            r6 = r6[r7]
            r7 = r18
            r8 = 0
            org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = lombok.eclipse.handlers.EclipseHandlerUtil.makeType(r6, r7, r8)
            r7 = 16
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r25
            r0 = r0[r1]
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r1 = r25
            org.eclipse.jdt.internal.compiler.ast.SingleNameReference r2 = new org.eclipse.jdt.internal.compiler.ast.SingleNameReference
            r3 = r2
            r4 = r27
            r5 = r18
            long r5 = lombok.eclipse.Eclipse.pos(r5)
            r3.<init>(r4, r5)
            r0[r1] = r2
            r0 = r24
            org.eclipse.jdt.internal.compiler.ast.Expression[] r0 = r0.arguments
            r1 = r25
            r0 = r0[r1]
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
            int r25 = r25 + 1
        L3a4:
            r0 = r25
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            if (r0 < r1) goto L30d
            r0 = r17
            if (r0 == 0) goto L3d0
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r22
            org.eclipse.jdt.internal.compiler.ast.Argument[] r1 = r1.arguments
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r0
            int r1 = r1.bits
            r2 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 | r2
            r0.bits = r1
        L3d0:
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleTypeReference
            if (r0 == 0) goto L3f3
            r0 = r22
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.returnType
            org.eclipse.jdt.internal.compiler.ast.SingleTypeReference r0 = (org.eclipse.jdt.internal.compiler.ast.SingleTypeReference) r0
            char[] r0 = r0.token
            char[] r1 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.VOID
            if (r0 != r1) goto L3f3
            r0 = r24
            r25 = r0
            goto L410
        L3f3:
            org.eclipse.jdt.internal.compiler.ast.ReturnStatement r0 = new org.eclipse.jdt.internal.compiler.ast.ReturnStatement
            r1 = r0
            r2 = r24
            r3 = r18
            int r3 = r3.sourceStart
            r4 = r18
            int r4 = r4.sourceEnd
            r1.<init>(r2, r3, r4)
            r25 = r0
            r0 = r25
            r1 = r18
            org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = lombok.eclipse.handlers.EclipseHandlerUtil.setGeneratedBy(r0, r1)
        L410:
            r0 = r22
            r1 = 1
            org.eclipse.jdt.internal.compiler.ast.Statement[] r1 = new org.eclipse.jdt.internal.compiler.ast.Statement[r1]
            r2 = r1
            r3 = 0
            r4 = r25
            r2[r3] = r4
            r0.statements = r1
            r0 = r22
            return r0
    }

    public static java.lang.Object[] addGeneratedDelegateMethods(java.lang.Object[] r3, java.lang.Object r4) {
            java.lang.String r0 = "lombok.skipdelegates"
            boolean r0 = lombok.patcher.Symbols.hasSymbol(r0)
            if (r0 == 0) goto Lb
            r0 = r3
            return r0
        Lb:
            boolean r0 = lombok.eclipse.agent.PatchDelegate.eclipseAvailable
            if (r0 != 0) goto L13
            r0 = r3
            return r0
        L13:
            r0 = r3
            r1 = r4
            java.lang.Object[] r0 = lombok.eclipse.agent.PatchDelegate.EclipseOnlyMethods.addGeneratedDelegateMethodsToChildren(r0, r1)
            return r0
    }

    private static void addAllMethodBindings(java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r6, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r7, java.util.Set<java.lang.String> r8, char[] r9, org.eclipse.jdt.internal.compiler.ast.ASTNode r10) throws lombok.eclipse.agent.PatchDelegate.DelegateRecursion {
            r0 = r8
            java.util.List<java.lang.String> r1 = lombok.eclipse.agent.PatchDelegate.METHODS_IN_OBJECT
            boolean r0 = r0.addAll(r1)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            addAllMethodBindings0(r0, r1, r2, r3, r4)
            return
    }

    private static void addAllMethodBindings0(java.util.List<lombok.eclipse.agent.PatchDelegate.BindingTuple> r7, org.eclipse.jdt.internal.compiler.lookup.TypeBinding r8, java.util.Set<java.lang.String> r9, char[] r10, org.eclipse.jdt.internal.compiler.ast.ASTNode r11) throws lombok.eclipse.agent.PatchDelegate.DelegateRecursion {
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding
            if (r0 == 0) goto L21
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.scope
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L21
            r0 = r12
            org.eclipse.jdt.internal.compiler.lookup.LookupEnvironment r0 = r0.environment()
            org.eclipse.jdt.internal.compiler.impl.CompilerOptions r0 = r0.globalOptions
            r1 = 1
            r0.storeAnnotations = r1
        L21:
            r0 = r8
            if (r0 != 0) goto L26
            return
        L26:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding
            if (r0 == 0) goto L39
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.genericType()
            r12 = r0
            goto L3c
        L39:
            r0 = r8
            r12 = r0
        L3c:
            r0 = r12
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding
            if (r0 == 0) goto L67
            r0 = r12
            org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r0 = r0.scope
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L67
            java.lang.Throwable r0 = lombok.eclipse.agent.PatchDelegate.Reflection.initCause     // Catch: java.lang.Exception -> L66
            java.lang.reflect.Method r1 = lombok.eclipse.agent.PatchDelegate.Reflection.classScopeBuildFieldsAndMethodsMethod     // Catch: java.lang.Exception -> L66
            r2 = r13
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L66
            java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
        L67:
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding
            if (r0 != 0) goto L6f
            return
        L6f:
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) r0
            r13 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding[] r0 = r0.availableMethods()
            r14 = r0
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.FieldBinding[] r0 = r0.availableFields()
            r15 = r0
            r0 = r8
            r1 = r14
            failIfContainsAnnotation(r0, r1)
            r0 = r8
            r1 = r15
            failIfContainsAnnotation(r0, r1)
            r0 = r14
            r16 = r0
            r0 = r16
            r17 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding
            if (r0 == 0) goto Lb7
            r0 = r8
            org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.genericType()
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding[] r0 = r0.availableMethods()
            r17 = r0
            r0 = r17
            int r0 = r0.length
            r1 = r16
            int r1 = r1.length
            if (r0 == r1) goto Lb7
            r0 = r16
            r17 = r0
        Lb7:
            r0 = 0
            r18 = r0
            goto L13a
        Lbd:
            r0 = r16
            r1 = r18
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            java.lang.String r0 = printSig(r0)
            r20 = r0
            r0 = r19
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto Ld6
            goto L137
        Ld6:
            r0 = r19
            boolean r0 = r0.isBridge()
            if (r0 == 0) goto Le1
            goto L137
        Le1:
            r0 = r19
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto Lec
            goto L137
        Lec:
            r0 = r19
            boolean r0 = r0.isDefaultAbstract()
            if (r0 == 0) goto Lf7
            goto L137
        Lf7:
            r0 = r19
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L102
            goto L137
        L102:
            r0 = r19
            boolean r0 = r0.isSynthetic()
            if (r0 == 0) goto L10d
            goto L137
        L10d:
            r0 = r9
            r1 = r20
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto L11b
            goto L137
        L11b:
            lombok.eclipse.agent.PatchDelegate$BindingTuple r0 = new lombok.eclipse.agent.PatchDelegate$BindingTuple
            r1 = r0
            r2 = r19
            r3 = r17
            r4 = r18
            r3 = r3[r4]
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r21 = r0
            r0 = r7
            r1 = r21
            boolean r0 = r0.add(r1)
        L137:
            int r18 = r18 + 1
        L13a:
            r0 = r18
            r1 = r16
            int r1 = r1.length
            if (r0 < r1) goto Lbd
            r0 = r7
            r1 = r13
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r1 = r1.superclass()
            r2 = r9
            r3 = r10
            r4 = r11
            addAllMethodBindings0(r0, r1, r2, r3, r4)
            r0 = r13
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding[] r0 = r0.superInterfaces()
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L184
            r0 = r18
            r1 = r0
            r22 = r1
            int r0 = r0.length
            r21 = r0
            r0 = 0
            r20 = r0
            goto L17d
        L169:
            r0 = r22
            r1 = r20
            r0 = r0[r1]
            r19 = r0
            r0 = r7
            r1 = r19
            r2 = r9
            r3 = r10
            r4 = r11
            addAllMethodBindings0(r0, r1, r2, r3, r4)
            int r20 = r20 + 1
        L17d:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L169
        L184:
            return
    }

    private static java.util.Set<java.lang.String> findAlreadyImplementedMethods(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r4) {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration[] r0 = r0.methods
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L77
        L17:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r6
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L26
            goto L74
        L26:
            r0 = r6
            int r0 = r0.modifiers
            r1 = 64
            r0 = r0 & r1
            if (r0 == 0) goto L33
            goto L74
        L33:
            r0 = r6
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L3d
            goto L74
        L3d:
            r0 = r6
            int r0 = r0.modifiers
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4b
            goto L74
        L4b:
            r0 = r6
            int r0 = r0.modifiers
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L57
            goto L74
        L57:
            r0 = r6
            int r0 = r0.modifiers
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L65
            goto L74
        L65:
            r0 = r5
            r1 = r6
            r2 = r4
            org.eclipse.jdt.internal.compiler.lookup.ClassScope r2 = r2.scope
            java.lang.String r1 = printSig(r1, r2)
            boolean r0 = r0.add(r1)
        L74:
            int r7 = r7 + 1
        L77:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L17
            r0 = r5
            return r0
    }

    private static void failIfContainsAnnotation(org.eclipse.jdt.internal.compiler.lookup.TypeBinding r5, org.eclipse.jdt.internal.compiler.lookup.Binding[] r6) throws lombok.eclipse.agent.PatchDelegate.DelegateRecursion {
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r6
            r1 = r0
            r10 = r1
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
            goto Ld5
        L11:
            r0 = r10
            r1 = r8
            r0 = r0[r1]
            r7 = r0
            r0 = 0
            r11 = r0
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.MethodBinding
            if (r0 == 0) goto L29
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.MethodBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.MethodBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.AnnotationBinding[] r0 = r0.getAnnotations()
            r11 = r0
        L29:
            r0 = r7
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.FieldBinding
            if (r0 == 0) goto L39
            r0 = r7
            org.eclipse.jdt.internal.compiler.lookup.FieldBinding r0 = (org.eclipse.jdt.internal.compiler.lookup.FieldBinding) r0
            org.eclipse.jdt.internal.compiler.lookup.AnnotationBinding[] r0 = r0.getAnnotations()
            r11 = r0
        L39:
            r0 = r11
            if (r0 != 0) goto L41
            goto Ld2
        L41:
            r0 = r11
            r1 = r0
            r15 = r1
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r13 = r0
            goto Lcb
        L4f:
            r0 = r15
            r1 = r13
            r0 = r0[r1]
            r12 = r0
            r0 = 0
            r16 = r0
            r0 = r12
            org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding r0 = r0.getAnnotationType()     // Catch: java.lang.Exception -> L66
            char[][] r0 = r0.compoundName     // Catch: java.lang.Exception -> L66
            r16 = r0
            goto L67
        L66:
        L67:
            r0 = r16
            if (r0 == 0) goto Lc8
            r0 = r16
            int r0 = r0.length
            r1 = 2
            if (r0 < r1) goto Lc8
            r0 = r16
            int r0 = r0.length
            r1 = 3
            if (r0 <= r1) goto L7d
            goto Lc8
        L7d:
            char[] r0 = lombok.eclipse.agent.PatchDelegate.STRING_LOMBOK
            r1 = r16
            r2 = 0
            r1 = r1[r2]
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L8d
            goto Lc8
        L8d:
            char[] r0 = lombok.eclipse.agent.PatchDelegate.STRING_DELEGATE
            r1 = r16
            r2 = r16
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto La1
            goto Lc8
        La1:
            r0 = r16
            int r0 = r0.length
            r1 = 3
            if (r0 != r1) goto Lb8
            char[] r0 = lombok.eclipse.agent.PatchDelegate.STRING_EXPERIMENTAL
            r1 = r16
            r2 = 1
            r1 = r1[r2]
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto Lb8
            goto Lc8
        Lb8:
            lombok.eclipse.agent.PatchDelegate$DelegateRecursion r0 = new lombok.eclipse.agent.PatchDelegate$DelegateRecursion
            r1 = r0
            r2 = r5
            char[] r2 = r2.readableName()
            r3 = r7
            char[] r3 = r3.readableName()
            r1.<init>(r2, r3)
            throw r0
        Lc8:
            int r13 = r13 + 1
        Lcb:
            r0 = r13
            r1 = r14
            if (r0 < r1) goto L4f
        Ld2:
            int r8 = r8 + 1
        Ld5:
            r0 = r8
            r1 = r9
            if (r0 < r1) goto L11
            return
    }

    private static java.lang.String printSig(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            char[] r1 = r1.selector
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r5 = r0
            r0 = r3
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            if (r0 == 0) goto L59
            r0 = r3
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r0 = r0.parameters
            r1 = r0
            r9 = r1
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r7 = r0
            goto L52
        L32:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L44
            r0 = r4
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L44:
            r0 = 0
            r5 = r0
            r0 = r4
            r1 = r6
            java.lang.String r1 = typeBindingToSignature(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
        L52:
            r0 = r7
            r1 = r8
            if (r0 < r1) goto L32
        L59:
            r0 = r4
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String printSig(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            char[] r1 = r1.selector
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r8 = r0
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            if (r0 == 0) goto Lb1
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.TypeParameter[] r0 = r0.typeParameters()
            r9 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L6b
            r0 = r9
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto L64
        L44:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r10
            java.lang.String r1 = new java.lang.String
            r2 = r1
            r3 = r11
            char[] r3 = r3.name
            r2.<init>(r3)
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            int r12 = r12 + 1
        L64:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L44
        L6b:
            r0 = r5
            org.eclipse.jdt.internal.compiler.ast.Argument[] r0 = r0.arguments
            r1 = r0
            r14 = r1
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r12 = r0
            goto Laa
        L7b:
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            r1 = r10
            r2 = r6
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = makeTypeBinding(r0, r1, r2)
            r15 = r0
            r0 = r8
            if (r0 != 0) goto L9b
            r0 = r7
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L9b:
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = r15
            java.lang.String r1 = typeBindingToSignature(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r12 = r12 + 1
        Laa:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L7b
        Lb1:
            r0 = r7
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static org.eclipse.jdt.internal.compiler.lookup.TypeBinding makeTypeBinding(org.eclipse.jdt.internal.compiler.ast.TypeReference r4, java.util.Map<java.lang.String, org.eclipse.jdt.internal.compiler.ast.TypeParameter> r5, org.eclipse.jdt.internal.compiler.lookup.ClassScope r6) {
            r0 = r4
            char[][] r0 = r0.getTypeName()
            r7 = r0
            r0 = r7
            java.lang.String r0 = lombok.eclipse.Eclipse.toQualifiedName(r0)
            r8 = r0
            r0 = r5
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.eclipse.jdt.internal.compiler.ast.TypeParameter r0 = (org.eclipse.jdt.internal.compiler.ast.TypeParameter) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L35
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            if (r0 == 0) goto L31
            r0 = r9
            org.eclipse.jdt.internal.compiler.ast.TypeReference r0 = r0.type
            char[][] r0 = r0.getTypeName()
            r7 = r0
            goto L35
        L31:
            char[][] r0 = org.eclipse.jdt.internal.compiler.lookup.TypeConstants.JAVA_LANG_OBJECT
            r7 = r0
        L35:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.getType(r1, r2)
            r10 = r0
            r0 = r4
            int r0 = r0.dimensions()
            if (r0 <= 0) goto L51
            r0 = r6
            r1 = r10
            r2 = r4
            int r2 = r2.dimensions()
            org.eclipse.jdt.internal.compiler.lookup.ArrayBinding r0 = r0.createArrayType(r1, r2)
            r10 = r0
        L51:
            r0 = r10
            return r0
    }

    private static java.lang.String typeBindingToSignature(org.eclipse.jdt.internal.compiler.lookup.TypeBinding r4) {
            r0 = r4
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r0 = r0.erasure()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r4
            boolean r0 = r0.isBaseType()
            if (r0 == 0) goto L1c
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r4
            char[] r2 = r2.sourceName()
            r1.<init>(r2)
            return r0
        L1c:
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding
            if (r0 == 0) goto L79
            r0 = r4
            char[] r0 = r0.qualifiedPackageName()
            if (r0 != 0) goto L30
            java.lang.String r0 = ""
            goto L3b
        L30:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r4
            char[] r2 = r2.qualifiedPackageName()
            r1.<init>(r2)
        L3b:
            r5 = r0
            r0 = r4
            char[] r0 = r0.qualifiedSourceName()
            if (r0 != 0) goto L49
            java.lang.String r0 = ""
            goto L54
        L49:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r4
            char[] r2 = r2.qualifiedSourceName()
            r1.<init>(r2)
        L54:
            r6 = r0
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            r0 = r6
            goto L78
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L78:
            return r0
        L79:
            r0 = r4
            boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.lookup.ArrayBinding
            if (r0 == 0) goto Lb1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r4
            org.eclipse.jdt.internal.compiler.lookup.TypeBinding r1 = r1.leafComponentType()
            java.lang.String r1 = typeBindingToSignature(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
            goto La4
        L99:
            r0 = r5
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
        La4:
            r0 = r6
            r1 = r4
            int r1 = r1.dimensions()
            if (r0 < r1) goto L99
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
        Lb1:
            java.lang.String r0 = ""
            return r0
    }

    private static boolean charArrayEquals(java.lang.String r4, char[] r5) {
            r0 = r4
            if (r0 != 0) goto Lc
            r0 = r5
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
        Lc:
            r0 = r5
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length
            if (r0 == r1) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = 0
            r6 = r0
            goto L32
        L22:
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r6
            char r1 = r1[r2]
            if (r0 == r1) goto L2f
            r0 = 0
            return r0
        L2f:
            int r6 = r6 + 1
        L32:
            r0 = r6
            r1 = r4
            int r1 = r1.length()
            if (r0 < r1) goto L22
            r0 = 1
            return r0
    }

    static /* synthetic */ java.lang.String access$0(org.eclipse.jdt.internal.compiler.lookup.MethodBinding r2) {
            r0 = r2
            java.lang.String r0 = printSig(r0)
            return r0
    }
}
