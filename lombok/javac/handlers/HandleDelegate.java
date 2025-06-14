package lombok.javac.handlers;

@lombok.core.HandlerPriority(65536)
@lombok.javac.ResolutionResetNeeded
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate.SCL.lombok */
public class HandleDelegate extends lombok.javac.JavacAnnotationHandler<lombok.experimental.Delegate> {
    private static final java.util.List<java.lang.String> METHODS_IN_OBJECT = null;
    private static final java.lang.String LEGALITY_OF_DELEGATE = "@Delegate is legal only on instance fields or no-argument instance methods.";
    private static final java.lang.String RECURSION_NOT_ALLOWED = "@Delegate does not support recursion (delegating to a type that itself has @Delegate members). Member \"%s\" is @Delegate in type \"%s\"";
    public static final int HANDLE_DELEGATE_PRIORITY = 65536;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate$CantMakeDelegates.SCL.lombok */
    public static class CantMakeDelegates extends java.lang.Exception {
        java.util.Set<java.lang.String> conflicted;

        public CantMakeDelegates() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate$DelegateReceiver.SCL.lombok */
    public enum DelegateReceiver extends java.lang.Enum<lombok.javac.handlers.HandleDelegate.DelegateReceiver> {
        public static final lombok.javac.handlers.HandleDelegate.DelegateReceiver METHOD = null;
        public static final lombok.javac.handlers.HandleDelegate.DelegateReceiver FIELD = null;
        private static final /* synthetic */ lombok.javac.handlers.HandleDelegate.DelegateReceiver[] ENUM$VALUES = null;



        static {
                lombok.javac.handlers.HandleDelegate$DelegateReceiver$1 r0 = new lombok.javac.handlers.HandleDelegate$DelegateReceiver$1
                r1 = r0
                java.lang.String r2 = "METHOD"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.javac.handlers.HandleDelegate.DelegateReceiver.METHOD = r0
                lombok.javac.handlers.HandleDelegate$DelegateReceiver$2 r0 = new lombok.javac.handlers.HandleDelegate$DelegateReceiver$2
                r1 = r0
                java.lang.String r2 = "FIELD"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.javac.handlers.HandleDelegate.DelegateReceiver.FIELD = r0
                r0 = 2
                lombok.javac.handlers.HandleDelegate$DelegateReceiver[] r0 = new lombok.javac.handlers.HandleDelegate.DelegateReceiver[r0]
                r1 = r0
                r2 = 0
                lombok.javac.handlers.HandleDelegate$DelegateReceiver r3 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.METHOD
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.handlers.HandleDelegate$DelegateReceiver r3 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.FIELD
                r1[r2] = r3
                lombok.javac.handlers.HandleDelegate.DelegateReceiver.ENUM$VALUES = r0
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

        public abstract com.sun.tools.javac.tree.JCTree.JCExpression get(lombok.javac.JavacNode r1, com.sun.tools.javac.util.Name r2);

        public static lombok.javac.handlers.HandleDelegate.DelegateReceiver[] values() {
                lombok.javac.handlers.HandleDelegate$DelegateReceiver[] r0 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.handlers.HandleDelegate$DelegateReceiver[] r2 = new lombok.javac.handlers.HandleDelegate.DelegateReceiver[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.handlers.HandleDelegate.DelegateReceiver valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.handlers.HandleDelegate$DelegateReceiver> r0 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.handlers.HandleDelegate$DelegateReceiver r0 = (lombok.javac.handlers.HandleDelegate.DelegateReceiver) r0
                return r0
        }

        /* synthetic */ DelegateReceiver(java.lang.String r5, int r6, lombok.javac.handlers.HandleDelegate.DelegateReceiver r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate$DelegateRecursion.SCL.lombok */
    private static class DelegateRecursion extends java.lang.Throwable {
        final java.lang.String type;
        final java.lang.String member;

        public DelegateRecursion(java.lang.String r4, java.lang.String r5) {
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

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate$MethodSig.SCL.lombok */
    public static class MethodSig {
        final com.sun.tools.javac.util.Name name;
        final javax.lang.model.type.ExecutableType type;
        final boolean isDeprecated;
        final javax.lang.model.element.ExecutableElement elem;

        MethodSig(com.sun.tools.javac.util.Name r4, javax.lang.model.type.ExecutableType r5, boolean r6, javax.lang.model.element.ExecutableElement r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.type = r1
                r0 = r3
                r1 = r6
                r0.isDeprecated = r1
                r0 = r3
                r1 = r7
                r0.elem = r1
                return
        }

        java.lang.String[] getParameterNames() {
                r5 = this;
                r0 = r5
                javax.lang.model.element.ExecutableElement r0 = r0.elem
                java.util.List r0 = r0.getParameters()
                r6 = r0
                r0 = r6
                int r0 = r0.size()
                java.lang.String[] r0 = new java.lang.String[r0]
                r7 = r0
                r0 = 0
                r8 = r0
                goto L33
            L19:
                r0 = r7
                r1 = r8
                r2 = r6
                r3 = r8
                java.lang.Object r2 = r2.get(r3)
                javax.lang.model.element.VariableElement r2 = (javax.lang.model.element.VariableElement) r2
                javax.lang.model.element.Name r2 = r2.getSimpleName()
                java.lang.String r2 = r2.toString()
                r0[r1] = r2
                int r8 = r8 + 1
            L33:
                r0 = r8
                r1 = r7
                int r1 = r1.length
                if (r0 < r1) goto L19
                r0 = r7
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r4
                boolean r2 = r2.isDeprecated
                if (r2 == 0) goto L10
                java.lang.String r2 = "@Deprecated "
                goto L12
            L10:
                java.lang.String r2 = ""
            L12:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.<init>(r2)
                r1 = r4
                com.sun.tools.javac.util.Name r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                javax.lang.model.type.ExecutableType r1 = r1.type
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandleDelegate$Unannotated.SCL.lombok */
    private static class Unannotated {
        private static final java.lang.reflect.Method unannotated = null;

        static {
                r0 = 0
                r4 = r0
                java.lang.Class<com.sun.tools.javac.code.Type> r0 = com.sun.tools.javac.code.Type.class
                java.lang.String r1 = "unannotatedType"
                r2 = 0
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L11
                java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.Exception -> L11
                r4 = r0
                goto L12
            L11:
            L12:
                r0 = r4
                lombok.javac.handlers.HandleDelegate.Unannotated.unannotated = r0
                return
        }

        private Unannotated() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static com.sun.tools.javac.code.Type unannotatedType(com.sun.tools.javac.code.Type r4) {
                java.lang.reflect.Method r0 = lombok.javac.handlers.HandleDelegate.Unannotated.unannotated
                if (r0 != 0) goto L8
                r0 = r4
                return r0
            L8:
                java.lang.reflect.Method r0 = lombok.javac.handlers.HandleDelegate.Unannotated.unannotated     // Catch: java.lang.Exception -> L17
                r1 = r4
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L17
                java.lang.Object r0 = lombok.permit.Permit.invoke(r0, r1, r2)     // Catch: java.lang.Exception -> L17
                com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: java.lang.Exception -> L17
                return r0
            L17:
                r0 = r4
                return r0
        }
    }

    static {
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
            lombok.javac.handlers.HandleDelegate.METHODS_IN_OBJECT = r0
            return
    }

    public HandleDelegate() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.experimental.Delegate> r8, com.sun.tools.javac.tree.JCTree.JCAnnotation r9, lombok.javac.JavacNode r10) {
            r7 = this;
            r0 = r10
            lombok.core.configuration.ConfigurationKey<lombok.core.configuration.FlagUsageType> r1 = lombok.ConfigurationKeys.DELEGATE_FLAG_USAGE
            java.lang.String r2 = "@Delegate"
            lombok.core.handlers.HandlerUtil.handleExperimentalFlagUsage(r0, r1, r2)
            java.lang.Class<lombok.Delegate> r0 = lombok.Delegate.class
            r11 = r0
            r0 = r10
            java.lang.Class<lombok.experimental.Delegate> r1 = lombok.experimental.Delegate.class
            r2 = r11
            lombok.javac.handlers.JavacHandlerUtil.deleteAnnotationIfNeccessary(r0, r1, r2)
            r0 = r10
            r1 = r10
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.String r1 = r1.getName()
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r13 = r0
            lombok.javac.JavacResolution r0 = new lombok.javac.JavacResolution
            r1 = r0
            r2 = r10
            com.sun.tools.javac.util.Context r2 = r2.getContext()
            r1.<init>(r2)
            r15 = r0
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r16 = r0
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 != r1) goto L93
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            r0 = r10
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            return
        L6c:
            lombok.javac.handlers.HandleDelegate$DelegateReceiver r0 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.FIELD
            r14 = r0
            r0 = r16
            com.sun.tools.javac.code.Type r0 = r0.type
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L89
            r0 = r15
            r1 = r10
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r0.resolveClassMember(r1)
        L89:
            r0 = r16
            com.sun.tools.javac.code.Type r0 = r0.type
            r12 = r0
            goto L10a
        L93:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.METHOD
            if (r0 != r1) goto L109
            r0 = r16
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 != 0) goto Lb2
            r0 = r10
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            return
        Lb2:
            r0 = r16
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r17 = r0
            r0 = r17
            com.sun.tools.javac.util.List r0 = r0.params
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld5
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            long r0 = r0.flags
            r1 = 8
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Ldc
        Ld5:
            r0 = r10
            java.lang.String r1 = "@Delegate is legal only on instance fields or no-argument instance methods."
            r0.addError(r1)
            return
        Ldc:
            lombok.javac.handlers.HandleDelegate$DelegateReceiver r0 = lombok.javac.handlers.HandleDelegate.DelegateReceiver.METHOD
            r14 = r0
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            com.sun.tools.javac.code.Type r0 = r0.type
            r12 = r0
            r0 = r12
            if (r0 != 0) goto Lfc
            r0 = r15
            r1 = r10
            lombok.core.LombokNode r1 = r1.m66up()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            r0.resolveClassMember(r1)
        Lfc:
            r0 = r17
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.restype
            com.sun.tools.javac.code.Type r0 = r0.type
            r12 = r0
            goto L10a
        L109:
            return
        L10a:
            r0 = r8
            java.lang.String r1 = "types"
            java.util.List r0 = r0.getActualExpressions(r1)
            r17 = r0
            r0 = r8
            java.lang.String r1 = "excludes"
            java.util.List r0 = r0.getActualExpressions(r1)
            r18 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r19 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r20 = r0
            r0 = r17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L148
            r0 = r12
            if (r0 == 0) goto L1b6
            r0 = r19
            r1 = r12
            boolean r0 = r0.add(r1)
            goto L1b6
        L148:
            r0 = r17
            java.util.Iterator r0 = r0.iterator()
            r22 = r0
            goto L1ac
        L154:
            r0 = r22
            java.lang.Object r0 = r0.next()
            r21 = r0
            r0 = r21
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L1ac
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ac
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.code.Type r0 = r0.type
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L190
            r0 = r15
            r1 = r10
            r0.resolveClassMember(r1)
        L190:
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.code.Type r0 = r0.type
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L1ac
            r0 = r19
            r1 = r23
            boolean r0 = r0.add(r1)
        L1ac:
            r0 = r22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L154
        L1b6:
            r0 = r18
            java.util.Iterator r0 = r0.iterator()
            r22 = r0
            goto L21a
        L1c2:
            r0 = r22
            java.lang.Object r0 = r0.next()
            r21 = r0
            r0 = r21
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L21a
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.util.Name r0 = r0.name
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21a
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.code.Type r0 = r0.type
            r23 = r0
            r0 = r23
            if (r0 != 0) goto L1fe
            r0 = r15
            r1 = r10
            r0.resolveClassMember(r1)
        L1fe:
            r0 = r21
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            com.sun.tools.javac.code.Type r0 = r0.type
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L21a
            r0 = r20
            r1 = r23
            boolean r0 = r0.add(r1)
        L21a:
            r0 = r22
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1c2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r21 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r22 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r23 = r0
            r0 = r23
            java.util.List<java.lang.String> r1 = lombok.javac.handlers.HandleDelegate.METHODS_IN_OBJECT
            boolean r0 = r0.addAll(r1)
            r0 = r10
            lombok.javac.JavacNode r0 = lombok.javac.handlers.JavacHandlerUtil.upToTypeNode(r0)
            r24 = r0
            r0 = r24
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.code.Symbol$ClassSymbol r0 = r0.sym
            java.util.List r0 = r0.getEnclosedElements()
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
            goto L298
        L268:
            r0 = r26
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Symbol r0 = (com.sun.tools.javac.code.Symbol) r0
            r25 = r0
            r0 = r25
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Symbol.MethodSymbol
            if (r0 == 0) goto L298
            r0 = r23
            r1 = r25
            javax.lang.model.type.TypeMirror r1 = r1.asType()
            javax.lang.model.type.ExecutableType r1 = (javax.lang.model.type.ExecutableType) r1
            r2 = r25
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r10
            com.sun.tools.javac.model.JavacTypes r3 = r3.getTypesUtil()
            java.lang.String r1 = printSig(r1, r2, r3)
            boolean r0 = r0.add(r1)
        L298:
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L268
            r0 = r20
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r26 = r0
            goto L2e2
        L2ae:
            r0 = r26
            java.lang.Object r0 = r0.next()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r25 = r0
            r0 = r25
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 == 0) goto L2da
            r0 = r25
            com.sun.tools.javac.code.Type$ClassType r0 = (com.sun.tools.javac.code.Type.ClassType) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r27 = r0
            r0 = r7
            r1 = r22
            r2 = r27
            r3 = r10
            com.sun.tools.javac.model.JavacTypes r3 = r3.getTypesUtil()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r4 = r23
            r0.addMethodBindings(r1, r2, r3, r4)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            goto L2e2
        L2da:
            r0 = r10
            java.lang.String r1 = "@Delegate can only use concrete class types, not wildcards, arrays, type variables, or primitives."
            r0.addError(r1)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            return
        L2e2:
            r0 = r26
            boolean r0 = r0.hasNext()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 != 0) goto L2ae
            r0 = r22
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r26 = r0
            goto L31d
        L2f8:
            r0 = r26
            java.lang.Object r0 = r0.next()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            lombok.javac.handlers.HandleDelegate$MethodSig r0 = (lombok.javac.handlers.HandleDelegate.MethodSig) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r25 = r0
            r0 = r23
            r1 = r25
            javax.lang.model.type.ExecutableType r1 = r1.type     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r2 = r25
            com.sun.tools.javac.util.Name r2 = r2.name     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r3 = r10
            com.sun.tools.javac.model.JavacTypes r3 = r3.getTypesUtil()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            java.lang.String r1 = printSig(r1, r2, r3)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            boolean r0 = r0.add(r1)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
        L31d:
            r0 = r26
            boolean r0 = r0.hasNext()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 != 0) goto L2f8
            r0 = r19
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r26 = r0
            goto L36e
        L333:
            r0 = r26
            java.lang.Object r0 = r0.next()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r25 = r0
            r0 = r25
            com.sun.tools.javac.code.Type r0 = lombok.javac.handlers.HandleDelegate.Unannotated.unannotatedType(r0)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r27 = r0
            r0 = r27
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 == 0) goto L366
            r0 = r27
            com.sun.tools.javac.code.Type$ClassType r0 = (com.sun.tools.javac.code.Type.ClassType) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r28 = r0
            r0 = r7
            r1 = r21
            r2 = r28
            r3 = r10
            com.sun.tools.javac.model.JavacTypes r3 = r3.getTypesUtil()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r4 = r23
            r0.addMethodBindings(r1, r2, r3, r4)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            goto L36e
        L366:
            r0 = r10
            java.lang.String r1 = "@Delegate can only use concrete class types, not wildcards, arrays, type variables, or primitives."
            r0.addError(r1)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            return
        L36e:
            r0 = r26
            boolean r0 = r0.hasNext()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 != 0) goto L333
            r0 = r21
            java.util.Iterator r0 = r0.iterator()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r26 = r0
            goto L39b
        L384:
            r0 = r26
            java.lang.Object r0 = r0.next()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            lombok.javac.handlers.HandleDelegate$MethodSig r0 = (lombok.javac.handlers.HandleDelegate.MethodSig) r0     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            r25 = r0
            r0 = r7
            r1 = r25
            r2 = r10
            r3 = r13
            r4 = r14
            r0.generateAndAdd(r1, r2, r3, r4)     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
        L39b:
            r0 = r26
            boolean r0 = r0.hasNext()     // Catch: lombok.javac.handlers.HandleDelegate.DelegateRecursion -> L3a8
            if (r0 != 0) goto L384
            goto L3c7
        L3a8:
            r25 = move-exception
            r0 = r10
            java.lang.String r1 = "@Delegate does not support recursion (delegating to a type that itself has @Delegate members). Member \"%s\" is @Delegate in type \"%s\""
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r25
            java.lang.String r5 = r5.member
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r25
            java.lang.String r5 = r5.type
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.addError(r1)
        L3c7:
            return
    }

    public void generateAndAdd(lombok.javac.handlers.HandleDelegate.MethodSig r8, lombok.javac.JavacNode r9, com.sun.tools.javac.util.Name r10, lombok.javac.handlers.HandleDelegate.DelegateReceiver r11) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = r1.createDelegateMethod(r2, r3, r4, r5)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L1d lombok.javac.handlers.HandleDelegate.CantMakeDelegates -> L46
            boolean r0 = r0.add(r1)     // Catch: lombok.javac.JavacResolution.TypeNotConvertibleException -> L1d lombok.javac.handlers.HandleDelegate.CantMakeDelegates -> L46
            goto L62
        L1d:
            r13 = move-exception
            r0 = r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "Can't create delegate method for "
            r2.<init>(r3)
            r2 = r8
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r13
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L46:
            r13 = move-exception
            r0 = r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            java.lang.String r3 = "There's a conflict in the names of type parameters. Fix it by renaming the following type parameters of your class: "
            r2.<init>(r3)
            r2 = r13
            java.util.Set<java.lang.String> r2 = r2.conflicted
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.addError(r1)
            return
        L62:
            r0 = r12
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L8c
        L6e:
            r0 = r14
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            r13 = r0
            r0 = r9
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r13
            lombok.javac.handlers.JavacHandlerUtil.injectMethod(r0, r1)
        L8c:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6e
            return
    }

    public void checkConflictOfTypeVarNames(lombok.javac.handlers.HandleDelegate.MethodSig r5, lombok.javac.JavacNode r6) throws lombok.javac.handlers.HandleDelegate.CantMakeDelegates {
            r4 = this;
            r0 = r5
            javax.lang.model.element.ExecutableElement r0 = r0.elem
            java.util.List r0 = r0.getTypeParameters()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            return
        L12:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            r8 = r0
            goto L80
        L20:
            r0 = r8
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 != r1) goto L76
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCClassDecl r0 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r0
            com.sun.tools.javac.util.List r0 = r0.typarams
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L76
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L6c
        L49:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r0 = (com.sun.tools.javac.tree.JCTree.JCTypeParameter) r0
            r10 = r0
            r0 = r10
            com.sun.tools.javac.util.Name r0 = r0.name
            if (r0 == 0) goto L6c
            r0 = r7
            r1 = r10
            com.sun.tools.javac.util.Name r1 = r1.name
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L6c:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L49
        L76:
            r0 = r8
            lombok.core.LombokNode r0 = r0.m66up()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r8 = r0
        L80:
            r0 = r8
            if (r0 != 0) goto L20
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r5
            javax.lang.model.element.ExecutableElement r0 = r0.elem
            java.util.List r0 = r0.getTypeParameters()
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto Lc1
        La1:
            r0 = r11
            java.lang.Object r0 = r0.next()
            javax.lang.model.element.TypeParameterElement r0 = (javax.lang.model.element.TypeParameterElement) r0
            r10 = r0
            r0 = r9
            r1 = r10
            javax.lang.model.element.Name r1 = r1.getSimpleName()
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        Lc1:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La1
            r0 = r9
            r1 = r7
            boolean r0 = r0.retainAll(r1)
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ldf
            return
        Ldf:
            lombok.javac.FindTypeVarScanner r0 = new lombok.javac.FindTypeVarScanner
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r5
            javax.lang.model.element.ExecutableElement r0 = r0.elem
            javax.lang.model.type.TypeMirror r0 = r0.asType()
            r1 = r10
            r2 = 0
            java.lang.Object r0 = r0.accept(r1, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = r10
            java.util.Set r2 = r2.getTypeVariables()
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            r1 = r9
            boolean r0 = r0.removeAll(r1)
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12f
            lombok.javac.handlers.HandleDelegate$CantMakeDelegates r0 = new lombok.javac.handlers.HandleDelegate$CantMakeDelegates
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r9
            r0.conflicted = r1
            r0 = r12
            throw r0
        L12f:
            return
    }

    public com.sun.tools.javac.tree.JCTree.JCMethodDecl createDelegateMethod(lombok.javac.handlers.HandleDelegate.MethodSig r11, lombok.javac.JavacNode r12, com.sun.tools.javac.util.Name r13, lombok.javac.handlers.HandleDelegate.DelegateReceiver r14) throws lombok.javac.JavacResolution.TypeNotConvertibleException, lombok.javac.handlers.HandleDelegate.CantMakeDelegates {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r0.checkConflictOfTypeVarNames(r1, r2)
            r0 = r12
            lombok.javac.JavacTreeMaker r0 = r0.getTreeMaker()
            r15 = r0
            r0 = r11
            boolean r0 = r0.isDeprecated
            if (r0 == 0) goto L31
            r0 = r15
            r1 = r12
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Deprecated"
            r3[r4] = r5
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.handlers.JavacHandlerUtil.genJavaLangTypeRef(r1, r2)
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.nil()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = r0.Annotation(r1, r2)
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.of(r0)
            r16 = r0
            goto L36
        L31:
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            r16 = r0
        L36:
            r0 = r15
            r1 = 1
            r2 = r16
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1, r2)
            r17 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            javax.lang.model.type.TypeMirror r0 = r0.getReturnType()
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
            r1 = r12
            lombok.javac.JavacAST r1 = r1.getAst()
            r2 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = lombok.javac.JavacResolution.typeToJCTree(r0, r1, r2)
            r18 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            javax.lang.model.type.TypeMirror r0 = r0.getReturnType()
            javax.lang.model.type.TypeKind r0 = r0.getKind()
            javax.lang.model.type.TypeKind r1 = javax.lang.model.type.TypeKind.VOID
            if (r0 == r1) goto L6e
            r0 = 1
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r19 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getParameterTypes()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L86
            r0 = 0
            goto L8d
        L86:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
        L8d:
            r20 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getParameterTypes()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La4
            r0 = 0
            goto Lab
        La4:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
        Lab:
            r21 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getThrownTypes()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            r0 = 0
            goto Lc9
        Lc2:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
        Lc9:
            r22 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getTypeVariables()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le0
            r0 = 0
            goto Le7
        Le0:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
        Le7:
            r23 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getTypeVariables()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lfe
            r0 = 0
            goto L105
        Lfe:
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
        L105:
            r24 = r0
            r0 = r12
            com.sun.tools.javac.util.Context r0 = r0.getContext()
            com.sun.tools.javac.code.Types r0 = com.sun.tools.javac.code.Types.instance(r0)
            r25 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getTypeVariables()
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L19c
        L123:
            r0 = r27
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r26 = r0
            r0 = r26
            com.sun.tools.javac.code.Type$TypeVar r0 = (com.sun.tools.javac.code.Type.TypeVar) r0
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym
            com.sun.tools.javac.util.Name r0 = r0.name
            r28 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer
            r1 = r0
            r1.<init>()
            r29 = r0
            r0 = r25
            r1 = r26
            com.sun.tools.javac.code.Type$TypeVar r1 = (com.sun.tools.javac.code.Type.TypeVar) r1
            com.sun.tools.javac.util.List r0 = r0.getBounds(r1)
            java.util.Iterator r0 = r0.iterator()
            r31 = r0
            goto L173
        L157:
            r0 = r31
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
            r30 = r0
            r0 = r29
            r1 = r30
            r2 = r12
            lombok.javac.JavacAST r2 = r2.getAst()
            r3 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.typeToJCTree(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L173:
            r0 = r31
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L157
            r0 = r23
            r1 = r15
            r2 = r28
            r3 = r29
            com.sun.tools.javac.util.List r3 = r3.toList()
            com.sun.tools.javac.tree.JCTree$JCTypeParameter r1 = r1.TypeParameter(r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r24
            r1 = r15
            r2 = r28
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L19c:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L123
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getThrownTypes()
            java.util.Iterator r0 = r0.iterator()
            r27 = r0
            goto L1d8
        L1b9:
            r0 = r27
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r26 = r0
            r0 = r22
            r1 = r26
            com.sun.tools.javac.code.Type r1 = (com.sun.tools.javac.code.Type) r1
            r2 = r12
            lombok.javac.JavacAST r2 = r2.getAst()
            r3 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = lombok.javac.JavacResolution.typeToJCTree(r1, r2, r3)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L1d8:
            r0 = r27
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b9
            r0 = 0
            r26 = r0
            r0 = r11
            java.lang.String[] r0 = r0.getParameterNames()
            r27 = r0
            r0 = r11
            javax.lang.model.element.ExecutableElement r0 = r0.elem
            boolean r0 = r0.isVarArgs()
            r28 = r0
            r0 = r11
            javax.lang.model.type.ExecutableType r0 = r0.type
            java.util.List r0 = r0.getParameterTypes()
            java.util.Iterator r0 = r0.iterator()
            r30 = r0
            goto L27c
        L209:
            r0 = r30
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r29 = r0
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r1 = r12
            com.sun.tools.javac.util.Context r1 = r1.getContext()
            long r0 = lombok.javac.handlers.JavacHandlerUtil.addFinalIfNeeded(r0, r1)
            r31 = r0
            r0 = r15
            r1 = r31
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.Modifiers(r1)
            r33 = r0
            r0 = r12
            r1 = r27
            r2 = r26
            int r26 = r26 + 1
            r1 = r1[r2]
            com.sun.tools.javac.util.Name r0 = r0.toName(r1)
            r34 = r0
            r0 = r28
            if (r0 == 0) goto L252
            r0 = r26
            r1 = r27
            int r1 = r1.length
            if (r0 != r1) goto L252
            r0 = r33
            r1 = r0
            long r1 = r1.flags
            r2 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r1 = r1 | r2
            r0.flags = r1
        L252:
            r0 = r20
            r1 = r15
            r2 = r33
            r3 = r34
            r4 = r29
            com.sun.tools.javac.code.Type r4 = (com.sun.tools.javac.code.Type) r4
            r5 = r12
            lombok.javac.JavacAST r5 = r5.getAst()
            r6 = 1
            com.sun.tools.javac.tree.JCTree$JCExpression r4 = lombok.javac.JavacResolution.typeToJCTree(r4, r5, r6)
            r5 = 0
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = r1.VarDef(r2, r3, r4, r5)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
            r0 = r21
            r1 = r15
            r2 = r34
            com.sun.tools.javac.tree.JCTree$JCIdent r1 = r1.Ident(r2)
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)
        L27c:
            r0 = r30
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L209
            r0 = r15
            r1 = r24
            com.sun.tools.javac.util.List r1 = toList(r1)
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r13
            com.sun.tools.javac.tree.JCTree$JCExpression r3 = r3.get(r4, r5)
            r4 = r11
            com.sun.tools.javac.util.Name r4 = r4.name
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r2 = r2.Select(r3, r4)
            r3 = r21
            com.sun.tools.javac.util.List r3 = toList(r3)
            com.sun.tools.javac.tree.JCTree$JCMethodInvocation r0 = r0.Apply(r1, r2, r3)
            r29 = r0
            r0 = r19
            if (r0 == 0) goto L2b6
            r0 = r15
            r1 = r29
            com.sun.tools.javac.tree.JCTree$JCReturn r0 = r0.Return(r1)
            goto L2bd
        L2b6:
            r0 = r15
            r1 = r29
            com.sun.tools.javac.tree.JCTree$JCExpressionStatement r0 = r0.Exec(r1)
        L2bd:
            r30 = r0
            r0 = r15
            r1 = 0
            r2 = r30
            com.sun.tools.javac.util.List r2 = com.sun.tools.javac.util.List.of(r2)
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.Block(r1, r2)
            r31 = r0
            r0 = r15
            r1 = r17
            r2 = r11
            com.sun.tools.javac.util.Name r2 = r2.name
            r3 = r18
            r4 = r23
            com.sun.tools.javac.util.List r4 = toList(r4)
            r5 = r20
            com.sun.tools.javac.util.List r5 = toList(r5)
            r6 = r22
            com.sun.tools.javac.util.List r6 = toList(r6)
            r7 = r31
            r8 = 0
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = r0.MethodDef(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r12
            com.sun.tools.javac.tree.JCTree r0 = lombok.javac.handlers.JavacHandlerUtil.recursiveSetGeneratedBy(r0, r1)
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r0 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r0
            return r0
    }

    public static <T> com.sun.tools.javac.util.List<T> toList(com.sun.tools.javac.util.ListBuffer<T> r2) {
            r0 = r2
            if (r0 != 0) goto La
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.nil()
            goto Le
        La:
            r0 = r2
            com.sun.tools.javac.util.List r0 = r0.toList()
        Le:
            return r0
    }

    public void addMethodBindings(java.util.List<lombok.javac.handlers.HandleDelegate.MethodSig> r9, com.sun.tools.javac.code.Type.ClassType r10, com.sun.tools.javac.model.JavacTypes r11, java.util.Set<java.lang.String> r12) throws lombok.javac.handlers.HandleDelegate.DelegateRecursion {
            r8 = this;
            r0 = r10
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.asElement()
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = r13
            java.util.List r0 = r0.getEnclosedElements()
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L129
        L1b:
            r0 = r15
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Symbol r0 = (com.sun.tools.javac.code.Symbol) r0
            r14 = r0
            r0 = r14
            java.util.List r0 = r0.getAnnotationMirrors()
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto L89
        L36:
            r0 = r17
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Attribute$Compound r0 = (com.sun.tools.javac.code.Attribute.Compound) r0
            r16 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            com.sun.tools.javac.code.Type r0 = r0.type     // Catch: java.lang.Exception -> L58
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym     // Catch: java.lang.Exception -> L58
            com.sun.tools.javac.util.Name r0 = r0.flatName()     // Catch: java.lang.Exception -> L58
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L58
            r18 = r0
            goto L59
        L58:
        L59:
            java.lang.String r0 = "lombok.Delegate"
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            java.lang.String r0 = "lombok.experimental.Delegate"
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
        L6f:
            lombok.javac.handlers.HandleDelegate$DelegateRecursion r0 = new lombok.javac.handlers.HandleDelegate$DelegateRecursion
            r1 = r0
            r2 = r10
            com.sun.tools.javac.code.Symbol$TypeSymbol r2 = r2.tsym
            com.sun.tools.javac.util.Name r2 = r2.name
            java.lang.String r2 = r2.toString()
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.name
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            throw r0
        L89:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L36
            r0 = r14
            javax.lang.model.element.ElementKind r0 = r0.getKind()
            javax.lang.model.element.ElementKind r1 = javax.lang.model.element.ElementKind.METHOD
            if (r0 == r1) goto La1
            goto L129
        La1:
            r0 = r14
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto Lac
            goto L129
        Lac:
            r0 = r14
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto Lb7
            goto L129
        Lb7:
            r0 = r14
            javax.lang.model.element.ExecutableElement r0 = (javax.lang.model.element.ExecutableElement) r0
            r16 = r0
            r0 = r16
            java.util.Set r0 = r0.getModifiers()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.PUBLIC
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld3
            goto L129
        Ld3:
            r0 = r11
            r1 = r10
            r2 = r14
            javax.lang.model.type.TypeMirror r0 = r0.asMemberOf(r1, r2)
            javax.lang.model.type.ExecutableType r0 = (javax.lang.model.type.ExecutableType) r0
            r17 = r0
            r0 = r17
            r1 = r14
            com.sun.tools.javac.util.Name r1 = r1.name
            r2 = r11
            java.lang.String r0 = printSig(r0, r1, r2)
            r18 = r0
            r0 = r12
            r1 = r18
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto Lfb
            goto L129
        Lfb:
            r0 = r14
            long r0 = r0.flags()
            r1 = 131072(0x20000, double:6.47582E-319)
            long r0 = r0 & r1
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L10d
            r0 = 1
            goto L10e
        L10d:
            r0 = 0
        L10e:
            r19 = r0
            r0 = r9
            lombok.javac.handlers.HandleDelegate$MethodSig r1 = new lombok.javac.handlers.HandleDelegate$MethodSig
            r2 = r1
            r3 = r14
            com.sun.tools.javac.util.Name r3 = r3.name
            r4 = r17
            r5 = r19
            r6 = r16
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L129:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            r0 = r11
            r1 = r10
            java.util.List r0 = r0.directSupertypes(r1)
            java.util.Iterator r0 = r0.iterator()
            r15 = r0
            goto L163
        L142:
            r0 = r15
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.code.Type.ClassType
            if (r0 == 0) goto L163
            r0 = r8
            r1 = r9
            r2 = r14
            com.sun.tools.javac.code.Type$ClassType r2 = (com.sun.tools.javac.code.Type.ClassType) r2
            r3 = r11
            r4 = r12
            r0.addMethodBindings(r1, r2, r3, r4)
        L163:
            r0 = r15
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L142
            return
    }

    public static java.lang.String printSig(javax.lang.model.type.ExecutableType r4, com.sun.tools.javac.util.Name r5, com.sun.tools.javac.model.JavacTypes r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r8 = r0
            r0 = r4
            java.util.List r0 = r0.getParameterTypes()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L51
        L2a:
            r0 = r10
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L43
            r0 = r7
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L43:
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = r9
            r2 = r6
            java.lang.String r1 = typeBindingToSignature(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
        L51:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2a
            r0 = r7
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String typeBindingToSignature(javax.lang.model.type.TypeMirror r3, com.sun.tools.javac.model.JavacTypes r4) {
            r0 = r4
            r1 = r3
            javax.lang.model.type.TypeMirror r0 = r0.erasure(r1)
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.toString()
            return r0
    }
}
