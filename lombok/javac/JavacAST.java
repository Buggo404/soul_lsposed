package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAST.SCL.lombok */
public class JavacAST extends lombok.core.AST<lombok.javac.JavacAST, lombok.javac.JavacNode, com.sun.tools.javac.tree.JCTree> {
    private final lombok.core.CleanupRegistry cleanup;
    private final com.sun.tools.javac.model.JavacElements elements;
    private final lombok.javac.JavacTreeMaker treeMaker;
    private final com.sun.tools.javac.code.Symtab symtab;
    private final com.sun.tools.javac.model.JavacTypes javacTypes;
    private final com.sun.tools.javac.util.Log log;
    private final lombok.javac.JavacAST.ErrorLog errorLogger;
    private final com.sun.tools.javac.util.Context context;
    private static final java.net.URI NOT_CALCULATED_MARKER = null;
    private java.net.URI memoizedAbsoluteFileLocation;
    private static java.lang.Class<?> wrappedFileObjectClass;
    private static java.lang.Class<?> sbtJavaFileObjectClass;
    private static java.lang.Class<?> sbtMappedVirtualFileClass;
    private static java.lang.Class<?> sbtOptionClass;
    private static java.lang.reflect.Field wrappedFileObjectField;
    private static java.lang.reflect.Field sbtJavaFileObjectField;
    private static java.lang.reflect.Field sbtMappedVirtualFilePathField;
    private static java.lang.reflect.Field sbtMappedVirtualFileRootsField;
    private static java.lang.reflect.Field sbtOptionField;
    private static java.lang.reflect.Method sbtMapGetMethod;
    private static boolean JCTRY_RESOURCES_FIELD_INITIALIZED;
    private static java.lang.reflect.Field JCTRY_RESOURCES_FIELD;
    private static boolean JCANNOTATEDTYPE_FIELDS_INITIALIZED;
    private static java.lang.reflect.Field JCANNOTATEDTYPE_ANNOTATIONS;
    private static java.lang.reflect.Field JCANNOTATEDTYPE_UNDERLYINGTYPE;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Method> getBodyMethods = null;
    private static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind;
    private static /* synthetic */ int[] $SWITCH_TABLE$javax$tools$Diagnostic$Kind;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAST$ErrorLog.SCL.lombok */
    static abstract class ErrorLog {
        final com.sun.tools.javac.util.Log log;
        private final javax.annotation.processing.Messager messager;
        private final java.lang.reflect.Field errorCount;
        private final java.lang.reflect.Field warningCount;

        private ErrorLog(com.sun.tools.javac.util.Log r4, javax.annotation.processing.Messager r5, java.lang.reflect.Field r6, java.lang.reflect.Field r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.log = r1
                r0 = r3
                r1 = r5
                r0.messager = r1
                r0 = r3
                r1 = r6
                r0.errorCount = r1
                r0 = r3
                r1 = r7
                r0.warningCount = r1
                return
        }

        final void error(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r4
                java.lang.reflect.Field r1 = r1.errorCount
                r0.increment(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                r0.error1(r1, r2)
                return
        }

        final void warning(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r4
                java.lang.reflect.Field r1 = r1.warningCount
                r0.increment(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                r0.warning1(r1, r2)
                return
        }

        final void mandatoryWarning(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r4
                java.lang.reflect.Field r1 = r1.warningCount
                r0.increment(r1)
                r0 = r4
                r1 = r5
                r2 = r6
                r0.mandatoryWarning1(r1, r2)
                return
        }

        abstract void error1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r1, java.lang.String r2);

        abstract void warning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r1, java.lang.String r2);

        abstract void mandatoryWarning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r1, java.lang.String r2);

        abstract void note(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r1, java.lang.String r2);

        private void increment(java.lang.reflect.Field r6) {
                r5 = this;
                r0 = r6
                if (r0 != 0) goto L5
                return
            L5:
                r0 = r6
                r1 = r5
                javax.annotation.processing.Messager r1 = r1.messager     // Catch: java.lang.Throwable -> L25
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L25
                java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L25
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L25
                r7 = r0
                r0 = r6
                r1 = r5
                javax.annotation.processing.Messager r1 = r1.messager     // Catch: java.lang.Throwable -> L25
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L25
                r0.set(r1, r2)     // Catch: java.lang.Throwable -> L25
                goto L26
            L25:
            L26:
                return
        }

        static lombok.javac.JavacAST.ErrorLog create(javax.annotation.processing.Messager r8, com.sun.tools.javac.util.Log r9) {
                r0 = r8
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Ld
                java.lang.String r1 = "errorCount"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> Ld
                r10 = r0
                goto L10
            Ld:
                r0 = 0
                r10 = r0
            L10:
                r0 = 0
                r11 = r0
                r0 = r9
                java.lang.Class r0 = r0.getClass()
                java.lang.reflect.Field[] r0 = r0.getFields()
                r1 = r0
                r15 = r1
                int r0 = r0.length
                r14 = r0
                r0 = 0
                r13 = r0
                goto L41
            L25:
                r0 = r15
                r1 = r13
                r0 = r0[r1]
                r12 = r0
                r0 = r12
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "multipleErrors"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3e
                r0 = 1
                r11 = r0
                goto L48
            L3e:
                int r13 = r13 + 1
            L41:
                r0 = r13
                r1 = r14
                if (r0 < r1) goto L25
            L48:
                r0 = r11
                if (r0 == 0) goto L58
                lombok.javac.JavacAST$JdkBefore9 r0 = new lombok.javac.JavacAST$JdkBefore9
                r1 = r0
                r2 = r9
                r3 = r8
                r4 = r10
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                return r0
            L58:
                r0 = r8
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L66
                java.lang.String r1 = "warningCount"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L66
                r12 = r0
                goto L6a
            L66:
                r0 = 0
                r12 = r0
            L6a:
                lombok.javac.JavacAST$Jdk9Plus r0 = new lombok.javac.JavacAST$Jdk9Plus
                r1 = r0
                r2 = r9
                r3 = r8
                r4 = r10
                r5 = r12
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        /* synthetic */ ErrorLog(com.sun.tools.javac.util.Log r7, javax.annotation.processing.Messager r8, java.lang.reflect.Field r9, java.lang.reflect.Field r10, lombok.javac.JavacAST.ErrorLog r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAST$Jdk9Plus.SCL.lombok */
    static class Jdk9Plus extends lombok.javac.JavacAST.ErrorLog {
        private static final java.lang.String PROC_MESSAGER = "proc.messager";
        private java.lang.Object multiple;
        private java.lang.reflect.Method errorMethod;
        private java.lang.reflect.Method warningMethod;
        private java.lang.reflect.Method mandatoryWarningMethod;
        private java.lang.reflect.Method noteMethod;
        private java.lang.reflect.Method errorKey;
        private java.lang.reflect.Method warningKey;
        private java.lang.reflect.Method noteKey;
        private com.sun.tools.javac.util.JCDiagnostic.Factory diags;

        private Jdk9Plus(com.sun.tools.javac.util.Log r9, javax.annotation.processing.Messager r10, java.lang.reflect.Field r11, java.lang.reflect.Field r12) {
                r8 = this;
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.String r0 = "com.sun.tools.javac.util.JCDiagnostic$DiagnosticFlag"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13a
                r13 = r0
                r0 = r13
                java.lang.Object[] r0 = r0.getEnumConstants()     // Catch: java.lang.Throwable -> L13a
                r1 = r0
                r17 = r1
                int r0 = r0.length     // Catch: java.lang.Throwable -> L13a
                r16 = r0
                r0 = 0
                r15 = r0
                goto L3f
            L22:
                r0 = r17
                r1 = r15
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L13a
                r14 = r0
                r0 = r14
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13a
                java.lang.String r1 = "MULTIPLE"
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L13a
                if (r0 == 0) goto L3c
                r0 = r8
                r1 = r14
                r0.multiple = r1     // Catch: java.lang.Throwable -> L13a
            L3c:
                int r15 = r15 + 1
            L3f:
                r0 = r15
                r1 = r16
                if (r0 < r1) goto L22
                java.lang.String r0 = "com.sun.tools.javac.util.JCDiagnostic$Error"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13a
                r14 = r0
                java.lang.String r0 = "com.sun.tools.javac.util.JCDiagnostic$Warning"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13a
                r15 = r0
                java.lang.String r0 = "com.sun.tools.javac.util.JCDiagnostic$Note"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L13a
                r16 = r0
                r0 = r9
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L13a
                r17 = r0
                r0 = r8
                r1 = r17
                java.lang.String r2 = "error"
                r3 = 3
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                r6 = r13
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r6 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 2
                r6 = r14
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.errorMethod = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                r1 = r17
                java.lang.String r2 = "warning"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r6 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                r6 = r15
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.warningMethod = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                r1 = r17
                java.lang.String r2 = "mandatoryWarning"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r6 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                r6 = r15
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.mandatoryWarningMethod = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                r1 = r17
                java.lang.String r2 = "note"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition> r6 = com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                r6 = r16
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.noteMethod = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r17
                java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L13a
                java.lang.String r1 = "diags"
                java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L13a
                r18 = r0
                r0 = r8
                r1 = r18
                r2 = r9
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L13a
                com.sun.tools.javac.util.JCDiagnostic$Factory r1 = (com.sun.tools.javac.util.JCDiagnostic.Factory) r1     // Catch: java.lang.Throwable -> L13a
                r0.diags = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                com.sun.tools.javac.util.JCDiagnostic$Factory r0 = r0.diags     // Catch: java.lang.Throwable -> L13a
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L13a
                r19 = r0
                r0 = r8
                r1 = r19
                java.lang.String r2 = "errorKey"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.errorKey = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                r1 = r19
                java.lang.String r2 = "warningKey"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.warningKey = r1     // Catch: java.lang.Throwable -> L13a
                r0 = r8
                r1 = r19
                java.lang.String r2 = "noteKey"
                r3 = 2
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 0
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                r4 = r3
                r5 = 1
                java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
                r4[r5] = r6     // Catch: java.lang.Throwable -> L13a
                java.lang.reflect.Method r1 = lombok.permit.Permit.getMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L13a
                r0.noteKey = r1     // Catch: java.lang.Throwable -> L13a
                goto L13b
            L13a:
            L13b:
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void error1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r11, java.lang.String r12) {
                r10 = this;
                r0 = r10
                java.lang.reflect.Method r0 = r0.errorKey
                r1 = r10
                com.sun.tools.javac.util.JCDiagnostic$Factory r1 = r1.diags
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "proc.messager"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = r5
                r7 = 0
                r8 = r12
                r6[r7] = r8
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L43
                r0 = r10
                java.lang.reflect.Method r0 = r0.errorMethod
                r1 = r10
                com.sun.tools.javac.util.Log r1 = r1.log
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                java.lang.Object r5 = r5.multiple
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r13
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            L43:
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void warning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r11, java.lang.String r12) {
                r10 = this;
                r0 = r10
                java.lang.reflect.Method r0 = r0.warningKey
                r1 = r10
                com.sun.tools.javac.util.JCDiagnostic$Factory r1 = r1.diags
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "proc.messager"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = r5
                r7 = 0
                r8 = r12
                r6[r7] = r8
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L3c
                r0 = r10
                java.lang.reflect.Method r0 = r0.warningMethod
                r1 = r10
                com.sun.tools.javac.util.Log r1 = r1.log
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            L3c:
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void mandatoryWarning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r11, java.lang.String r12) {
                r10 = this;
                r0 = r10
                java.lang.reflect.Method r0 = r0.warningKey
                r1 = r10
                com.sun.tools.javac.util.JCDiagnostic$Factory r1 = r1.diags
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "proc.messager"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = r5
                r7 = 0
                r8 = r12
                r6[r7] = r8
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L3c
                r0 = r10
                java.lang.reflect.Method r0 = r0.mandatoryWarningMethod
                r1 = r10
                com.sun.tools.javac.util.Log r1 = r1.log
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            L3c:
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void note(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r11, java.lang.String r12) {
                r10 = this;
                r0 = r10
                java.lang.reflect.Method r0 = r0.noteKey
                r1 = r10
                com.sun.tools.javac.util.JCDiagnostic$Factory r1 = r1.diags
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "proc.messager"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = r5
                r7 = 0
                r8 = r12
                r6[r7] = r8
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
                r13 = r0
                r0 = r13
                if (r0 == 0) goto L3c
                r0 = r10
                java.lang.reflect.Method r0 = r0.noteMethod
                r1 = r10
                com.sun.tools.javac.util.Log r1 = r1.log
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                r3[r4] = r5
                java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            L3c:
                return
        }

        /* synthetic */ Jdk9Plus(com.sun.tools.javac.util.Log r7, javax.annotation.processing.Messager r8, java.lang.reflect.Field r9, java.lang.reflect.Field r10, lombok.javac.JavacAST.Jdk9Plus r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacAST$JdkBefore9.SCL.lombok */
    static class JdkBefore9 extends lombok.javac.JavacAST.ErrorLog {
        private JdkBefore9(com.sun.tools.javac.util.Log r8, javax.annotation.processing.Messager r9, java.lang.reflect.Field r10) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = 0
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void error1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, java.lang.String r10) {
                r8 = this;
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                boolean r0 = r0.multipleErrors
                r11 = r0
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = 1
                r0.multipleErrors = r1
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log     // Catch: java.lang.Throwable -> L25
                r1 = r9
                java.lang.String r2 = "proc.messager"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25
                r4 = r3
                r5 = 0
                r6 = r10
                r4[r5] = r6     // Catch: java.lang.Throwable -> L25
                r0.error(r1, r2, r3)     // Catch: java.lang.Throwable -> L25
                goto L32
            L25:
                r12 = move-exception
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = r11
                r0.multipleErrors = r1
                r0 = r12
                throw r0
            L32:
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = r11
                r0.multipleErrors = r1
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void warning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, java.lang.String r10) {
                r8 = this;
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = r9
                java.lang.String r2 = "proc.messager"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = r3
                r5 = 0
                r6 = r10
                r4[r5] = r6
                r0.warning(r1, r2, r3)
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void mandatoryWarning1(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, java.lang.String r10) {
                r8 = this;
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = r9
                java.lang.String r2 = "proc.messager"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = r3
                r5 = 0
                r6 = r10
                r4[r5] = r6
                r0.mandatoryWarning(r1, r2, r3)
                return
        }

        @Override // lombok.javac.JavacAST.ErrorLog
        void note(com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, java.lang.String r10) {
                r8 = this;
                r0 = r8
                com.sun.tools.javac.util.Log r0 = r0.log
                r1 = r9
                java.lang.String r2 = "proc.messager"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = r3
                r5 = 0
                r6 = r10
                r4[r5] = r6
                r0.note(r1, r2, r3)
                return
        }

        /* synthetic */ JdkBefore9(com.sun.tools.javac.util.Log r6, javax.annotation.processing.Messager r7, java.lang.reflect.Field r8, lombok.javac.JavacAST.JdkBefore9 r9) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                return
        }
    }

    static {
            java.lang.String r0 = "https://projectlombok.org/not/calculated"
            java.net.URI r0 = java.net.URI.create(r0)
            lombok.javac.JavacAST.NOT_CALCULATED_MARKER = r0
            r0 = 0
            lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD_INITIALIZED = r0
            r0 = 0
            lombok.javac.JavacAST.JCANNOTATEDTYPE_FIELDS_INITIALIZED = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            lombok.javac.JavacAST.getBodyMethods = r0
            return
    }

    public JavacAST(javax.annotation.processing.Messager r8, com.sun.tools.javac.util.Context r9, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r10, lombok.core.CleanupRegistry r11) {
            r7 = this;
            r0 = r7
            r1 = r10
            java.lang.String r1 = sourceName(r1)
            r2 = r10
            java.lang.String r2 = lombok.javac.PackageName.getPackageName(r2)
            lombok.javac.JavacImportList r3 = new lombok.javac.JavacImportList
            r4 = r3
            r5 = r10
            r4.<init>(r5)
            java.util.Collection r4 = statementTypes()
            r0.<init>(r1, r2, r3, r4)
            r0 = r7
            java.net.URI r1 = lombok.javac.JavacAST.NOT_CALCULATED_MARKER
            r0.memoizedAbsoluteFileLocation = r1
            r0 = r7
            r1 = r7
            r2 = r10
            lombok.javac.JavacNode r1 = r1.buildCompilationUnit(r2)
            r0.setTop(r1)
            r0 = r7
            r1 = r9
            r0.context = r1
            r0 = r7
            r1 = r9
            com.sun.tools.javac.util.Log r1 = com.sun.tools.javac.util.Log.instance(r1)
            r0.log = r1
            r0 = r7
            r1 = r8
            r2 = r7
            com.sun.tools.javac.util.Log r2 = r2.log
            lombok.javac.JavacAST$ErrorLog r1 = lombok.javac.JavacAST.ErrorLog.create(r1, r2)
            r0.errorLogger = r1
            r0 = r7
            r1 = r9
            com.sun.tools.javac.model.JavacElements r1 = com.sun.tools.javac.model.JavacElements.instance(r1)
            r0.elements = r1
            r0 = r7
            lombok.javac.JavacTreeMaker r1 = new lombok.javac.JavacTreeMaker
            r2 = r1
            r3 = r9
            com.sun.tools.javac.tree.TreeMaker r3 = com.sun.tools.javac.tree.TreeMaker.instance(r3)
            r2.<init>(r3)
            r0.treeMaker = r1
            r0 = r7
            r1 = r9
            com.sun.tools.javac.code.Symtab r1 = com.sun.tools.javac.code.Symtab.instance(r1)
            r0.symtab = r1
            r0 = r7
            r1 = r9
            com.sun.tools.javac.model.JavacTypes r1 = com.sun.tools.javac.model.JavacTypes.instance(r1)
            r0.javacTypes = r1
            r0 = r7
            r1 = r11
            r0.cleanup = r1
            r0 = r7
            r0.clearChanged()
            return
    }

    @Override // lombok.core.AST
    public java.net.URI getAbsoluteFileLocation() {
            r3 = this;
            r0 = r3
            java.net.URI r0 = r0.memoizedAbsoluteFileLocation
            java.net.URI r1 = lombok.javac.JavacAST.NOT_CALCULATED_MARKER
            if (r0 != r1) goto L1e
            r0 = r3
            r1 = r3
            lombok.core.LombokNode r1 = r1.top()
            lombok.javac.JavacNode r1 = (lombok.javac.JavacNode) r1
            java.lang.Object r1 = r1.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            java.net.URI r1 = getAbsoluteFileLocation(r1)
            r0.memoizedAbsoluteFileLocation = r1
        L1e:
            r0 = r3
            java.net.URI r0 = r0.memoizedAbsoluteFileLocation
            return r0
    }

    public static java.net.URI getAbsoluteFileLocation(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r3) {
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.sourcefile     // Catch: java.lang.Exception -> L2a
            java.net.URI r0 = r0.toUri()     // Catch: java.lang.Exception -> L2a
            r4 = r0
            r0 = r4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L2a
            r5 = r0
            r0 = r5
            java.lang.String r1 = "file:"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L1a
            r0 = r4
            return r0
        L1a:
            r0 = r3
            javax.tools.JavaFileObject r0 = r0.sourcefile     // Catch: java.lang.Exception -> L2a
            java.net.URI r0 = tryGetSbtFile(r0)     // Catch: java.lang.Exception -> L2a
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            return r0
        L28:
            r0 = r4
            return r0
        L2a:
            r0 = 0
            return r0
    }

    private static java.net.URI tryGetSbtFile(javax.tools.JavaFileObject r2) {
            r0 = r2
            java.net.URI r0 = tryGetSbtFile_(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static java.net.URI tryGetSbtFile_(javax.tools.JavaFileObject r7) throws java.lang.Exception {
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            java.lang.Class<?> r0 = lombok.javac.JavacAST.wrappedFileObjectClass
            if (r0 != 0) goto L1d
            r0 = r8
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.sun.tools.javac.api.ClientCodeWrapper$WrappedJavaFileObject"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = r8
            lombok.javac.JavacAST.wrappedFileObjectClass = r0
        L1d:
            r0 = r8
            java.lang.Class<?> r1 = lombok.javac.JavacAST.wrappedFileObjectClass
            if (r0 == r1) goto L26
            r0 = 0
            return r0
        L26:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.wrappedFileObjectField
            if (r0 != 0) goto L3a
            java.lang.Class<?> r0 = lombok.javac.JavacAST.wrappedFileObjectClass
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "clientFileObject"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.wrappedFileObjectField = r0
        L3a:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.wrappedFileObjectField
            if (r0 != 0) goto L42
            r0 = 0
            return r0
        L42:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.wrappedFileObjectField
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            r10 = r0
            r0 = r10
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtJavaFileObjectClass
            if (r0 != 0) goto L74
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "sbt."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L6e
            r0 = r9
            java.lang.String r1 = "JavaFileObject"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L70
        L6e:
            r0 = 0
            return r0
        L70:
            r0 = r8
            lombok.javac.JavacAST.sbtJavaFileObjectClass = r0
        L74:
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtJavaFileObjectClass
            r1 = r8
            if (r0 == r1) goto L7d
            r0 = 0
            return r0
        L7d:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtJavaFileObjectField
            if (r0 != 0) goto L8f
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtJavaFileObjectClass
            java.lang.String r1 = "underlying"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.sbtJavaFileObjectField = r0
        L8f:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtJavaFileObjectField
            if (r0 != 0) goto L97
            r0 = 0
            return r0
        L97:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtJavaFileObjectField
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            r11 = r0
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtMappedVirtualFileClass
            if (r0 != 0) goto Lcb
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "sbt."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lc5
            r0 = r9
            java.lang.String r1 = "MappedVirtualFile"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto Lc7
        Lc5:
            r0 = 0
            return r0
        Lc7:
            r0 = r8
            lombok.javac.JavacAST.sbtMappedVirtualFileClass = r0
        Lcb:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFilePathField
            if (r0 != 0) goto Ldd
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtMappedVirtualFileClass
            java.lang.String r1 = "encodedPath"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.sbtMappedVirtualFilePathField = r0
        Ldd:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFilePathField
            if (r0 != 0) goto Le5
            r0 = 0
            return r0
        Le5:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFileRootsField
            if (r0 != 0) goto Lf7
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtMappedVirtualFileClass
            java.lang.String r1 = "rootPathsMap"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.sbtMappedVirtualFileRootsField = r0
        Lf7:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFileRootsField
            if (r0 != 0) goto Lff
            r0 = 0
            return r0
        Lff:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFilePathField
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            java.lang.String r1 = "${"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L132
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            boolean r0 = r0.exists()
            if (r0 == 0) goto L130
            r0 = r13
            java.net.URI r0 = r0.toURI()
            return r0
        L130:
            r0 = 0
            return r0
        L132:
            r0 = r12
            r1 = 125(0x7d, float:1.75E-43)
            int r0 = r0.indexOf(r1)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 != r1) goto L143
            r0 = 0
            return r0
        L143:
            r0 = r12
            r1 = 2
            r2 = r13
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtMappedVirtualFileRootsField
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            r15 = r0
            java.lang.reflect.Method r0 = lombok.javac.JavacAST.sbtMapGetMethod
            if (r0 != 0) goto L174
            r0 = r15
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)
            lombok.javac.JavacAST.sbtMapGetMethod = r0
        L174:
            java.lang.reflect.Method r0 = lombok.javac.JavacAST.sbtMapGetMethod
            if (r0 != 0) goto L17c
            r0 = 0
            return r0
        L17c:
            java.lang.reflect.Method r0 = lombok.javac.JavacAST.sbtMapGetMethod
            r1 = r15
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r14
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            r16 = r0
            r0 = r16
            java.lang.Class r0 = r0.getClass()
            r8 = r0
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtOptionClass
            if (r0 != 0) goto L1ac
            r0 = r8
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "scala.Some"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ac
            r0 = r8
            lombok.javac.JavacAST.sbtOptionClass = r0
        L1ac:
            r0 = r8
            java.lang.Class<?> r1 = lombok.javac.JavacAST.sbtOptionClass
            if (r0 == r1) goto L1b5
            r0 = 0
            return r0
        L1b5:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtOptionField
            if (r0 != 0) goto L1c7
            java.lang.Class<?> r0 = lombok.javac.JavacAST.sbtOptionClass
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.sbtOptionField = r0
        L1c7:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtOptionField
            if (r0 != 0) goto L1cf
            r0 = 0
            return r0
        L1cf:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.sbtOptionField
            r1 = r16
            java.lang.Object r0 = r0.get(r1)
            r17 = r0
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r17
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            r3 = r12
            r4 = r13
            r5 = 1
            int r4 = r4 + r5
            java.lang.String r3 = r3.substring(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.net.URI r0 = r0.toURI()
            return r0
    }

    private static java.lang.String sourceName(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r2) {
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.sourcefile
            if (r0 != 0) goto Lb
            r0 = 0
            goto L12
        Lb:
            r0 = r2
            javax.tools.JavaFileObject r0 = r0.sourcefile
            java.lang.String r0 = r0.toString()
        L12:
            return r0
    }

    public com.sun.tools.javac.util.Context getContext() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.util.Context r0 = r0.context
            return r0
    }

    public void traverse(lombok.javac.JavacASTVisitor r4) {
            r3 = this;
            r0 = r3
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r1 = r4
            r0.traverse(r1)
            return
    }

    void traverseChildren(lombok.javac.JavacASTVisitor r4, lombok.javac.JavacNode r5) {
            r3 = this;
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L1c
        Lc:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            r6 = r0
            r0 = r6
            r1 = r4
            r0.traverse(r1)
        L1c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lc
            return
    }

    @Override // lombok.core.AST
    public int getSourceVersion() {
            r4 = this;
            r0 = r4
            com.sun.tools.javac.util.Context r0 = r0.context     // Catch: java.lang.Exception -> L2b
            com.sun.tools.javac.code.Source r0 = com.sun.tools.javac.code.Source.instance(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.name()     // Catch: java.lang.Exception -> L2b
            r5 = r0
            r0 = r5
            r1 = 95
            int r0 = r0.indexOf(r1)     // Catch: java.lang.Exception -> L2b
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 <= r1) goto L22
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2b
            return r0
        L22:
            r0 = r5
            r1 = 3
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            r0 = 6
            return r0
    }

    @Override // lombok.core.AST
    public int getLatestJavaSpecSupported() {
            r2 = this;
            int r0 = lombok.javac.Javac.getJavaCompilerVersion()
            return r0
    }

    public void cleanupTask(java.lang.String r6, com.sun.tools.javac.tree.JCTree r7, lombok.core.CleanupTask r8) {
            r5 = this;
            r0 = r5
            lombok.core.CleanupRegistry r0 = r0.cleanup
            r1 = r6
            r2 = r7
            r3 = r8
            r0.registerTask(r1, r2, r3)
            return
    }

    public com.sun.tools.javac.util.Name toName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            com.sun.tools.javac.model.JavacElements r0 = r0.elements
            r1 = r4
            com.sun.tools.javac.util.Name r0 = r0.getName(r1)
            return r0
    }

    public lombok.javac.JavacTreeMaker getTreeMaker() {
            r3 = this;
            r0 = r3
            lombok.javac.JavacTreeMaker r0 = r0.treeMaker
            r1 = -1
            lombok.javac.JavacTreeMaker r0 = r0.m80at(r1)
            r0 = r3
            lombok.javac.JavacTreeMaker r0 = r0.treeMaker
            return r0
    }

    public com.sun.tools.javac.code.Symtab getSymbolTable() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.code.Symtab r0 = r0.symtab
            return r0
    }

    public com.sun.tools.javac.model.JavacTypes getTypesUtil() {
            r2 = this;
            r0 = r2
            com.sun.tools.javac.model.JavacTypes r0 = r0.javacTypes
            return r0
    }

    /* renamed from: buildTree, reason: avoid collision after fix types in other method */
    protected lombok.javac.JavacNode buildTree2(com.sun.tools.javac.tree.JCTree r7, lombok.core.AST.Kind r8) {
            r6 = this;
            int[] r0 = $SWITCH_TABLE$lombok$core$AST$Kind()
            r1 = r8
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L40;
                case 2: goto L49;
                case 3: goto L52;
                case 4: goto L5b;
                case 5: goto L64;
                case 6: goto L87;
                case 7: goto L6d;
                case 8: goto L77;
                case 9: goto L81;
                case 10: goto L91;
                default: goto L97;
            }
        L40:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r1 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r1
            lombok.javac.JavacNode r0 = r0.buildCompilationUnit(r1)
            return r0
        L49:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            lombok.javac.JavacNode r0 = r0.buildType(r1)
            return r0
        L52:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            lombok.javac.JavacNode r0 = r0.buildField(r1)
            return r0
        L5b:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCBlock r1 = (com.sun.tools.javac.tree.JCTree.JCBlock) r1
            lombok.javac.JavacNode r0 = r0.buildInitializer(r1)
            return r0
        L64:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r1 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r1
            lombok.javac.JavacNode r0 = r0.buildMethod(r1)
            return r0
        L6d:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r2 = r8
            lombok.javac.JavacNode r0 = r0.buildLocalVar(r1, r2)
            return r0
        L77:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            r2 = r8
            lombok.javac.JavacNode r0 = r0.buildLocalVar(r1, r2)
            return r0
        L81:
            r0 = r6
            r1 = r7
            lombok.javac.JavacNode r0 = r0.buildStatementOrExpression(r1)
            return r0
        L87:
            r0 = r6
            r1 = r7
            com.sun.tools.javac.tree.JCTree$JCAnnotation r1 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r1
            r2 = 0
            lombok.javac.JavacNode r0 = r0.buildAnnotation(r1, r2)
            return r0
        L91:
            r0 = r6
            r1 = r7
            lombok.javac.JavacNode r0 = r0.buildTypeUse(r1)
            return r0
        L97:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Did not expect: "
            r3.<init>(r4)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private lombok.javac.JavacNode buildCompilationUnit(com.sun.tools.javac.tree.JCTree.JCCompilationUnit r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
            goto L32
        L14:
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L32
            r0 = r9
            r1 = r7
            r2 = r10
            com.sun.tools.javac.tree.JCTree$JCClassDecl r2 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r2
            lombok.javac.JavacNode r1 = r1.buildType(r2)
            addIfNotNull(r0, r1)
        L32:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
            lombok.javac.JavacNode r0 = new lombok.javac.JavacNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            lombok.core.AST$Kind r5 = lombok.core.AST.Kind.COMPILATION_UNIT
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private lombok.javac.JavacNode buildType(com.sun.tools.javac.tree.JCTree.JCClassDecl r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L36
        L21:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            r3 = 0
            lombok.javac.JavacNode r1 = r1.buildAnnotation(r2, r3)
            addIfNotNull(r0, r1)
        L36:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.defs
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto Lac
        L4c:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCMethodDecl
            if (r0 == 0) goto L6d
            r0 = r10
            r1 = r8
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCMethodDecl r2 = (com.sun.tools.javac.tree.JCTree.JCMethodDecl) r2
            lombok.javac.JavacNode r1 = r1.buildMethod(r2)
            addIfNotNull(r0, r1)
            goto Lac
        L6d:
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L83
            r0 = r10
            r1 = r8
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCClassDecl r2 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r2
            lombok.javac.JavacNode r1 = r1.buildType(r2)
            addIfNotNull(r0, r1)
            goto Lac
        L83:
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L99
            r0 = r10
            r1 = r8
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            lombok.javac.JavacNode r1 = r1.buildField(r2)
            addIfNotNull(r0, r1)
            goto Lac
        L99:
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCBlock
            if (r0 == 0) goto Lac
            r0 = r10
            r1 = r8
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = (com.sun.tools.javac.tree.JCTree.JCBlock) r2
            lombok.javac.JavacNode r1 = r1.buildInitializer(r2)
            addIfNotNull(r0, r1)
        Lac:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildField(com.sun.tools.javac.tree.JCTree.JCVariableDecl r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L36
        L21:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            r3 = 1
            lombok.javac.JavacNode r1 = r1.buildAnnotation(r2, r3)
            addIfNotNull(r0, r1)
        L36:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r10
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.vartype
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
            r0 = r10
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.init
            lombok.javac.JavacNode r1 = r1.buildExpression(r2)
            addIfNotNull(r0, r1)
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.FIELD
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildLocalVar(com.sun.tools.javac.tree.JCTree.JCVariableDecl r9, lombok.core.AST.Kind r10) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            goto L38
        L21:
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r12 = r0
            r0 = r11
            r1 = r8
            r2 = r12
            r3 = 1
            lombok.javac.JavacNode r1 = r1.buildAnnotation(r2, r3)
            addIfNotNull(r0, r1)
        L38:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r11
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.vartype
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
            r0 = r11
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r2 = r2.init
            lombok.javac.JavacNode r1 = r1.buildExpression(r2)
            addIfNotNull(r0, r1)
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r10
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildTypeUse(com.sun.tools.javac.tree.JCTree r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r9
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.sun.tools.javac.tree.JCTree$JCAnnotatedType"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La5
            r0 = r9
            java.lang.Class r0 = r0.getClass()
            initJcAnnotatedType(r0)
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Field r1 = lombok.javac.JavacAST.JCANNOTATEDTYPE_ANNOTATIONS
            r2 = r9
            java.lang.Object r0 = lombok.permit.Permit.permissiveReadField(r0, r1, r2)
            java.util.Collection r0 = (java.util.Collection) r0
            r10 = r0
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r0 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            java.lang.reflect.Field r1 = lombok.javac.JavacAST.JCANNOTATEDTYPE_UNDERLYINGTYPE
            r2 = r9
            java.lang.Object r0 = lombok.permit.Permit.permissiveReadField(r0, r1, r2)
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = (com.sun.tools.javac.tree.JCTree.JCExpression) r0
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r10
            if (r0 == 0) goto L85
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
            goto L7b
        L5b:
            r0 = r14
            java.lang.Object r0 = r0.next()
            r13 = r0
            r0 = r13
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto L7b
            r0 = r12
            r1 = r8
            r2 = r13
            com.sun.tools.javac.tree.JCTree$JCAnnotation r2 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r2
            r3 = 1
            lombok.javac.JavacNode r1 = r1.buildAnnotation(r2, r3)
            addIfNotNull(r0, r1)
        L7b:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5b
        L85:
            r0 = r12
            r1 = r8
            r2 = r11
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r12
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
        La5:
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCWildcard
            if (r0 == 0) goto Le8
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCWildcard r0 = (com.sun.tools.javac.tree.JCTree.JCWildcard) r0
            com.sun.tools.javac.tree.JCTree r0 = r0.inner
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Lbe
            java.util.List r0 = java.util.Collections.emptyList()
            goto Lc5
        Lbe:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
        Lc5:
            r11 = r0
            r0 = r10
            if (r0 == 0) goto Ld3
            r0 = r11
            r1 = r8
            r2 = r10
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
        Ld3:
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
        Le8:
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCArrayTypeTree
            if (r0 == 0) goto L12b
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCArrayTypeTree r0 = (com.sun.tools.javac.tree.JCTree.JCArrayTypeTree) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.elemtype
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L101
            java.util.List r0 = java.util.Collections.emptyList()
            goto L108
        L101:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
        L108:
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L116
            r0 = r11
            r1 = r8
            r2 = r10
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
        L116:
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
        L12b:
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCFieldAccess
            if (r0 == 0) goto L16e
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCFieldAccess r0 = (com.sun.tools.javac.tree.JCTree.JCFieldAccess) r0
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.selected
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L144
            java.util.List r0 = java.util.Collections.emptyList()
            goto L14b
        L144:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
        L14b:
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L159
            r0 = r11
            r1 = r8
            r2 = r10
            lombok.javac.JavacNode r1 = r1.buildTypeUse(r2)
            addIfNotNull(r0, r1)
        L159:
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
        L16e:
            r0 = r9
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCIdent
            if (r0 == 0) goto L18c
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            java.util.List r5 = java.util.Collections.emptyList()
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.TYPE_USE
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
        L18c:
            r0 = 0
            return r0
    }

    private static java.util.List<com.sun.tools.javac.tree.JCTree> getResourcesForTryNode(com.sun.tools.javac.tree.JCTree.JCTry r3) {
            boolean r0 = lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD_INITIALIZED
            if (r0 != 0) goto L16
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCTry> r0 = com.sun.tools.javac.tree.JCTree.JCTry.class
            java.lang.String r1 = "resources"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD = r0
            r0 = 1
            lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD_INITIALIZED = r0
        L16:
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD
            if (r0 != 0) goto L20
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L20:
            r0 = 0
            r4 = r0
            java.lang.reflect.Field r0 = lombok.javac.JavacAST.JCTRY_RESOURCES_FIELD     // Catch: java.lang.Exception -> L2d
            r1 = r3
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2d
            r4 = r0
            goto L2e
        L2d:
        L2e:
            r0 = r4
            boolean r0 = r0 instanceof java.util.List
            if (r0 == 0) goto L3a
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            return r0
        L3a:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    private static void initJcAnnotatedType(java.lang.Class<?> r3) {
            boolean r0 = lombok.javac.JavacAST.JCANNOTATEDTYPE_FIELDS_INITIALIZED
            if (r0 == 0) goto L7
            return
        L7:
            r0 = r3
            java.lang.String r1 = "annotations"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.JCANNOTATEDTYPE_ANNOTATIONS = r0
            r0 = r3
            java.lang.String r1 = "underlyingType"
            java.lang.reflect.Field r0 = lombok.permit.Permit.permissiveGetField(r0, r1)
            lombok.javac.JavacAST.JCANNOTATEDTYPE_UNDERLYINGTYPE = r0
            r0 = 1
            lombok.javac.JavacAST.JCANNOTATEDTYPE_FIELDS_INITIALIZED = r0
            return
    }

    private lombok.javac.JavacNode buildTry(com.sun.tools.javac.tree.JCTree.JCTry r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            java.util.List r0 = getResourcesForTryNode(r0)
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L41
        L20:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L41
            r0 = r10
            r1 = r8
            r2 = r11
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r2 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r2
            lombok.core.AST$Kind r3 = lombok.core.AST.Kind.LOCAL
            lombok.javac.JavacNode r1 = r1.buildLocalVar(r2, r3)
            addIfNotNull(r0, r1)
        L41:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L20
            r0 = r10
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.body
            lombok.javac.JavacNode r1 = r1.buildStatement(r2)
            addIfNotNull(r0, r1)
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.catchers
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L7a
        L63:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCCatch r0 = (com.sun.tools.javac.tree.JCTree.JCCatch) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            lombok.core.AST$Kind r3 = lombok.core.AST.Kind.STATEMENT
            lombok.javac.JavacNode r1 = r1.buildTree2(r2, r3)
            addIfNotNull(r0, r1)
        L7a:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L63
            r0 = r10
            r1 = r8
            r2 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r2 = r2.finalizer
            lombok.javac.JavacNode r1 = r1.buildStatement(r2)
            addIfNotNull(r0, r1)
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.STATEMENT
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildInitializer(com.sun.tools.javac.tree.JCTree.JCBlock r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.stats
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L32
        L1e:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            lombok.javac.JavacNode r1 = r1.buildStatement(r2)
            addIfNotNull(r0, r1)
        L32:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1e
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.INITIALIZER
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildMethod(com.sun.tools.javac.tree.JCTree.JCMethodDecl r9) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
            com.sun.tools.javac.util.List r0 = r0.annotations
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L36
        L21:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            r3 = 0
            lombok.javac.JavacNode r1 = r1.buildAnnotation(r2, r3)
            addIfNotNull(r0, r1)
        L36:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            r0 = r9
            com.sun.tools.javac.util.List r0 = r0.params
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto L63
        L4c:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            lombok.core.AST$Kind r3 = lombok.core.AST.Kind.ARGUMENT
            lombok.javac.JavacNode r1 = r1.buildLocalVar(r2, r3)
            addIfNotNull(r0, r1)
        L63:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L4c
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            if (r0 == 0) goto Lab
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            if (r0 == 0) goto Lab
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
            com.sun.tools.javac.util.List r0 = r0.stats
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            goto La1
        L8d:
            r0 = r12
            java.lang.Object r0 = r0.next()
            com.sun.tools.javac.tree.JCTree$JCStatement r0 = (com.sun.tools.javac.tree.JCTree.JCStatement) r0
            r11 = r0
            r0 = r10
            r1 = r8
            r2 = r11
            lombok.javac.JavacNode r1 = r1.buildStatement(r2)
            addIfNotNull(r0, r1)
        La1:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8d
        Lab:
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.METHOD
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildAnnotation(com.sun.tools.javac.tree.JCTree.JCAnnotation r9, boolean r10) {
            r8 = this;
            r0 = r8
            r1 = r9
            boolean r0 = r0.setAndGetAsHandled(r1)
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L10
            r0 = r11
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = 0
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.ANNOTATION
            r2.<init>(r3, r4, r5, r6)
            lombok.core.LombokNode r0 = r0.putInMap(r1)
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            return r0
    }

    private lombok.javac.JavacNode buildExpression(com.sun.tools.javac.tree.JCTree.JCExpression r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            lombok.javac.JavacNode r0 = r0.buildStatementOrExpression(r1)
            return r0
    }

    private lombok.javac.JavacNode buildStatement(com.sun.tools.javac.tree.JCTree.JCStatement r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            lombok.javac.JavacNode r0 = r0.buildStatementOrExpression(r1)
            return r0
    }

    private lombok.javac.JavacNode buildStatementOrExpression(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCAnnotation
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCClassDecl
            if (r0 == 0) goto L1f
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCClassDecl r1 = (com.sun.tools.javac.tree.JCTree.JCClassDecl) r1
            lombok.javac.JavacNode r0 = r0.buildType(r1)
            return r0
        L1f:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto L32
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r1 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r1
            lombok.core.AST$Kind r2 = lombok.core.AST.Kind.LOCAL
            lombok.javac.JavacNode r0 = r0.buildLocalVar(r1, r2)
            return r0
        L32:
            r0 = r5
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCTry
            if (r0 == 0) goto L42
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree$JCTry r1 = (com.sun.tools.javac.tree.JCTree.JCTry) r1
            lombok.javac.JavacNode r0 = r0.buildTry(r1)
            return r0
        L42:
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.sun.tools.javac.tree.JCTree$JCLambda"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
            r0 = r4
            r1 = r5
            lombok.javac.JavacNode r0 = r0.buildLambda(r1)
            return r0
        L58:
            r0 = r4
            r1 = r5
            boolean r0 = r0.setAndGetAsHandled(r1)
            if (r0 == 0) goto L62
            r0 = 0
            return r0
        L62:
            r0 = r4
            r1 = r5
            lombok.javac.JavacNode r0 = r0.drill(r1)
            return r0
    }

    private lombok.javac.JavacNode buildLambda(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            com.sun.tools.javac.tree.JCTree r1 = r1.getBody(r2)
            lombok.javac.JavacNode r0 = r0.buildStatementOrExpression(r1)
            return r0
    }

    private com.sun.tools.javac.tree.JCTree getBody(com.sun.tools.javac.tree.JCTree r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.Class r1 = r1.getClass()
            java.lang.reflect.Method r0 = r0.getBodyMethod(r1)
            r1 = r5
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = lombok.permit.Permit.invokeSneaky(r0, r1, r2)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
    }

    private java.lang.reflect.Method getBodyMethod(java.lang.Class<?> r5) {
            r4 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Method> r0 = lombok.javac.JavacAST.getBodyMethods
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L13
            r0 = r6
            return r0
        L13:
            r0 = r5
            java.lang.String r1 = "getBody"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r0 = lombok.permit.Permit.getMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L22
            r6 = r0
            goto L28
        L22:
            r7 = move-exception
            r0 = r7
            java.lang.RuntimeException r0 = lombok.javac.Javac.sneakyThrow(r0)
            throw r0
        L28:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Method> r0 = lombok.javac.JavacAST.getBodyMethods
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Method> r0 = lombok.javac.JavacAST.getBodyMethods
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    private lombok.javac.JavacNode drill(com.sun.tools.javac.tree.JCTree r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.OutOfMemoryError -> L50
            r1 = r0
            r1.<init>()     // Catch: java.lang.OutOfMemoryError -> L50
            r10 = r0
            r0 = r8
            r1 = r9
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.OutOfMemoryError -> L50
            lombok.core.AST$FieldAccess[] r0 = r0.fieldsOf(r1)     // Catch: java.lang.OutOfMemoryError -> L50
            r1 = r0
            r14 = r1
            int r0 = r0.length     // Catch: java.lang.OutOfMemoryError -> L50
            r13 = r0
            r0 = 0
            r12 = r0
            goto L34
        L1c:
            r0 = r14
            r1 = r12
            r0 = r0[r1]     // Catch: java.lang.OutOfMemoryError -> L50
            r11 = r0
            r0 = r10
            r1 = r8
            java.lang.Class<lombok.javac.JavacNode> r2 = lombok.javac.JavacNode.class
            r3 = r9
            r4 = r11
            java.util.Collection r1 = r1.buildWithField(r2, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L50
            boolean r0 = r0.addAll(r1)     // Catch: java.lang.OutOfMemoryError -> L50
            int r12 = r12 + 1
        L34:
            r0 = r12
            r1 = r13
            if (r0 < r1) goto L1c
            r0 = r8
            lombok.javac.JavacNode r1 = new lombok.javac.JavacNode     // Catch: java.lang.OutOfMemoryError -> L50
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            lombok.core.AST$Kind r6 = lombok.core.AST.Kind.STATEMENT     // Catch: java.lang.OutOfMemoryError -> L50
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L50
            lombok.core.LombokNode r0 = r0.putInMap(r1)     // Catch: java.lang.OutOfMemoryError -> L50
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.OutOfMemoryError -> L50
            return r0
        L50:
            r10 = move-exception
            r0 = r10
            java.lang.String r0 = r0.getMessage()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L5e
            java.lang.String r0 = "(no original message)"
            r11 = r0
        L5e:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r4 = r8
            java.lang.String r4 = r4.getFileName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.lang.String r3 = "@pos"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            int r3 = r3.getPreferredPosition()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            throw r0
    }

    private static java.util.Collection<java.lang.Class<? extends com.sun.tools.javac.tree.JCTree>> statementTypes() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 3
            r1.<init>(r2)
            r4 = r0
            r0 = r4
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCStatement> r1 = com.sun.tools.javac.tree.JCTree.JCStatement.class
            boolean r0 = r0.add(r1)
            r0 = r4
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCExpression> r1 = com.sun.tools.javac.tree.JCTree.JCExpression.class
            boolean r0 = r0.add(r1)
            r0 = r4
            java.lang.Class<com.sun.tools.javac.tree.JCTree$JCCatch> r1 = com.sun.tools.javac.tree.JCTree.JCCatch.class
            boolean r0 = r0.add(r1)
            r0 = r4
            return r0
    }

    private static void addIfNotNull(java.util.Collection<lombok.javac.JavacNode> r3, lombok.javac.JavacNode r4) {
            r0 = r4
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = r4
            boolean r0 = r0.add(r1)
        Lc:
            return
    }

    void removeDeferredErrors(lombok.javac.JavacNode r6) {
            r5 = this;
            r0 = r6
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r0 = r0.pos()
            r7 = r0
            r0 = r5
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r8 = r0
            r0 = r5
            r1 = r7
            int r1 = r1.getStartPosition()
            r2 = r7
            r3 = r8
            int r2 = lombok.javac.Javac.getEndPosition(r2, r3)
            r0.removeFromDeferredDiagnostics(r1, r2)
            return
    }

    void printMessage(javax.tools.Diagnostic.Kind r6, java.lang.String r7, lombok.javac.JavacNode r8, com.sun.tools.javac.util.JCDiagnostic.DiagnosticPosition r9, boolean r10) {
            r5 = this;
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r8
            if (r0 != 0) goto Le
            r0 = 0
            goto L15
        Le:
            r0 = r8
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
        L15:
            r13 = r0
            r0 = r5
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r14 = r0
            r0 = r14
            javax.tools.JavaFileObject r0 = r0.sourcefile
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L49
            r0 = r5
            com.sun.tools.javac.util.Log r0 = r0.log
            r1 = r12
            javax.tools.JavaFileObject r0 = r0.useSource(r1)
            r11 = r0
            r0 = r9
            if (r0 != 0) goto L49
            r0 = r13
            com.sun.tools.javac.util.JCDiagnostic$DiagnosticPosition r0 = r0.pos()
            r9 = r0
        L49:
            r0 = r9
            if (r0 == 0) goto L68
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r5
            r1 = r9
            int r1 = r1.getStartPosition()
            r2 = r8
            r3 = r9
            int r2 = r2.getEndPosition(r3)
            r0.removeFromDeferredDiagnostics(r1, r2)
        L68:
            int[] r0 = $SWITCH_TABLE$javax$tools$Diagnostic$Kind()     // Catch: java.lang.Throwable -> Lc4
            r1 = r6
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> Lc4
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc4
            switch(r0) {
                case 1: goto L90;
                case 2: goto Laa;
                case 3: goto L9d;
                case 4: goto Lb7;
                default: goto Lb7;
            }     // Catch: java.lang.Throwable -> Lc4
        L90:
            r0 = r5
            lombok.javac.JavacAST$ErrorLog r0 = r0.errorLogger     // Catch: java.lang.Throwable -> Lc4
            r1 = r9
            r2 = r7
            r0.error(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Ld8
        L9d:
            r0 = r5
            lombok.javac.JavacAST$ErrorLog r0 = r0.errorLogger     // Catch: java.lang.Throwable -> Lc4
            r1 = r9
            r2 = r7
            r0.mandatoryWarning(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Ld8
        Laa:
            r0 = r5
            lombok.javac.JavacAST$ErrorLog r0 = r0.errorLogger     // Catch: java.lang.Throwable -> Lc4
            r1 = r9
            r2 = r7
            r0.warning(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Ld8
        Lb7:
            r0 = r5
            lombok.javac.JavacAST$ErrorLog r0 = r0.errorLogger     // Catch: java.lang.Throwable -> Lc4
            r1 = r9
            r2 = r7
            r0.note(r1, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Ld8
        Lc4:
            r15 = move-exception
            r0 = r12
            if (r0 == 0) goto Ld5
            r0 = r5
            com.sun.tools.javac.util.Log r0 = r0.log
            r1 = r11
            javax.tools.JavaFileObject r0 = r0.useSource(r1)
        Ld5:
            r0 = r15
            throw r0
        Ld8:
            r0 = r12
            if (r0 == 0) goto Le7
            r0 = r5
            com.sun.tools.javac.util.Log r0 = r0.log
            r1 = r11
            javax.tools.JavaFileObject r0 = r0.useSource(r1)
        Le7:
            return
    }

    public void removeFromDeferredDiagnostics(int r6, int r7) {
            r5 = this;
            r0 = r5
            lombok.core.LombokNode r0 = r0.top()
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0
            java.lang.Object r0 = r0.get()
            com.sun.tools.javac.tree.JCTree$JCCompilationUnit r0 = (com.sun.tools.javac.tree.JCTree.JCCompilationUnit) r0
            r8 = r0
            lombok.javac.CompilerMessageSuppressor r0 = new lombok.javac.CompilerMessageSuppressor
            r1 = r0
            r2 = r5
            com.sun.tools.javac.util.Context r2 = r2.getContext()
            r1.<init>(r2)
            r1 = r8
            javax.tools.JavaFileObject r1 = r1.sourcefile
            r2 = r6
            r3 = r7
            r0.removeAllBetween(r1, r2, r3)
            return
    }

    /* renamed from: setElementInASTCollection, reason: avoid collision after fix types in other method */
    protected void setElementInASTCollection2(java.lang.reflect.Field r7, java.lang.Object r8, java.util.List<java.util.Collection<?>> r9, java.util.Collection<?> r10, int r11, com.sun.tools.javac.tree.JCTree r12) throws java.lang.IllegalAccessException {
            r6 = this;
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            r4 = r11
            java.lang.Object r3 = r3.get(r4)
            r4 = r12
            com.sun.tools.javac.util.List r0 = r0.setElementInConsList(r1, r2, r3, r4)
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r13
            r0.set(r1, r2)
            return
    }

    private com.sun.tools.javac.util.List<?> setElementInConsList(java.util.List<java.util.Collection<?>> r7, java.util.Collection<?> r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            r0 = r8
            com.sun.tools.javac.util.List r0 = (com.sun.tools.javac.util.List) r0
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = r9
            r3 = r10
            com.sun.tools.javac.util.List r0 = r0.replaceInConsList(r1, r2, r3)
            r12 = r0
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            r0 = r12
            return r0
        L1d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r13
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r14 = r0
            r0 = r6
            r1 = r13
            r2 = r14
            r3 = r11
            r4 = r12
            com.sun.tools.javac.util.List r0 = r0.setElementInConsList(r1, r2, r3, r4)
            return r0
    }

    private com.sun.tools.javac.util.List<?> replaceInConsList(com.sun.tools.javac.util.List<?> r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.Object[] r0 = r0.toArray()
            r9 = r0
            r0 = 0
            r10 = r0
            goto L24
        Lf:
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            r1 = r6
            if (r0 != r1) goto L21
            r0 = r9
            r1 = r10
            r2 = r7
            r0[r1] = r2
            r0 = 1
            r8 = r0
        L21:
            int r10 = r10 + 1
        L24:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 < r1) goto Lf
            r0 = r8
            if (r0 == 0) goto L37
            r0 = r9
            com.sun.tools.javac.util.List r0 = com.sun.tools.javac.util.List.from(r0)
            return r0
        L37:
            r0 = r5
            return r0
    }

    @Override // lombok.core.AST
    protected /* bridge */ /* synthetic */ void setElementInASTCollection(java.lang.reflect.Field r9, java.lang.Object r10, java.util.List r11, java.util.Collection r12, int r13, com.sun.tools.javac.tree.JCTree r14) throws java.lang.IllegalAccessException {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            com.sun.tools.javac.tree.JCTree r6 = (com.sun.tools.javac.tree.JCTree) r6
            r0.setElementInASTCollection2(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // lombok.core.AST
    protected /* bridge */ /* synthetic */ lombok.core.LombokNode buildTree(com.sun.tools.javac.tree.JCTree r5, lombok.core.AST.Kind r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r2 = r6
            lombok.javac.JavacNode r0 = r0.buildTree2(r1, r2)
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$lombok$core$AST$Kind() {
            int[] r0 = lombok.javac.JavacAST.$SWITCH_TABLE$lombok$core$AST$Kind
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
            lombok.javac.JavacAST.$SWITCH_TABLE$lombok$core$AST$Kind = r1
            return r0
    }

    static /* synthetic */ int[] $SWITCH_TABLE$javax$tools$Diagnostic$Kind() {
            int[] r0 = lombok.javac.JavacAST.$SWITCH_TABLE$javax$tools$Diagnostic$Kind
            r1 = r0
            if (r1 == 0) goto L8
            return r0
        L8:
            javax.tools.Diagnostic$Kind[] r0 = javax.tools.Diagnostic.Kind.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4 = r0
            r0 = r4
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.ERROR     // Catch: java.lang.NoSuchFieldError -> L1c
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
            goto L1d
        L1c:
        L1d:
            r0 = r4
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.MANDATORY_WARNING     // Catch: java.lang.NoSuchFieldError -> L29
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L29
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L29
            goto L2a
        L29:
        L2a:
            r0 = r4
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.NOTE     // Catch: java.lang.NoSuchFieldError -> L36
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            goto L37
        L36:
        L37:
            r0 = r4
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.OTHER     // Catch: java.lang.NoSuchFieldError -> L43
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
            r2 = 5
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            goto L44
        L43:
        L44:
            r0 = r4
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING     // Catch: java.lang.NoSuchFieldError -> L50
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            goto L51
        L50:
        L51:
            r0 = r4
            r1 = r0
            lombok.javac.JavacAST.$SWITCH_TABLE$javax$tools$Diagnostic$Kind = r1
            return r0
    }
}
