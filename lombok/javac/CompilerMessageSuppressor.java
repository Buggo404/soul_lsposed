package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CompilerMessageSuppressor.SCL.lombok */
public final class CompilerMessageSuppressor {
    private final com.sun.tools.javac.util.Log log;
    private static final lombok.javac.CompilerMessageSuppressor.WriterField errWriterField = null;
    private static final lombok.javac.CompilerMessageSuppressor.WriterField warnWriterField = null;
    private static final lombok.javac.CompilerMessageSuppressor.WriterField noticeWriterField = null;
    private static final java.lang.reflect.Field dumpOnErrorField = null;
    private static final java.lang.reflect.Field promptOnErrorField = null;
    private static final java.lang.reflect.Field diagnosticListenerField = null;
    private static final java.lang.reflect.Field deferDiagnosticsField = null;
    private static final java.lang.reflect.Field deferredDiagnosticsField = null;
    private static final java.lang.reflect.Field diagnosticHandlerField = null;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> handlerDeferredFields = null;
    private static final java.lang.reflect.Field NULL_FIELD = null;
    private java.lang.Boolean dumpOnError;
    private java.lang.Boolean promptOnError;
    private javax.tools.DiagnosticListener<?> contextDiagnosticListener;
    private javax.tools.DiagnosticListener<?> logDiagnosticListener;
    private final com.sun.tools.javac.util.Context context;
    private static final java.lang.ThreadLocal<java.util.Queue<?>> queueCache = null;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CompilerMessageSuppressor$Java8WriterField.SCL.lombok */
    static class Java8WriterField implements lombok.javac.CompilerMessageSuppressor.WriterField {
        private final java.lang.reflect.Field field;
        private java.io.PrintWriter writer;

        public Java8WriterField(java.lang.reflect.Field r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.field = r1
                return
        }

        @Override // lombok.javac.CompilerMessageSuppressor.WriterField
        public void pauze(com.sun.tools.javac.util.Log r5) {
                r4 = this;
                r0 = r4
                r1 = r4
                java.lang.reflect.Field r1 = r1.field     // Catch: java.lang.Exception -> L1d
                r2 = r5
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L1d
                java.io.PrintWriter r1 = (java.io.PrintWriter) r1     // Catch: java.lang.Exception -> L1d
                r0.writer = r1     // Catch: java.lang.Exception -> L1d
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Exception -> L1d
                r1 = r5
                java.io.PrintWriter r2 = lombok.javac.CompilerMessageSuppressor.Java8WriterField.NO_WRITER     // Catch: java.lang.Exception -> L1d
                r0.set(r1, r2)     // Catch: java.lang.Exception -> L1d
                goto L1e
            L1d:
            L1e:
                return
        }

        @Override // lombok.javac.CompilerMessageSuppressor.WriterField
        public void resume(com.sun.tools.javac.util.Log r5) {
                r4 = this;
                r0 = r4
                java.io.PrintWriter r0 = r0.writer
                if (r0 == 0) goto L17
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Exception -> L16
                r1 = r5
                r2 = r4
                java.io.PrintWriter r2 = r2.writer     // Catch: java.lang.Exception -> L16
                r0.set(r1, r2)     // Catch: java.lang.Exception -> L16
                goto L17
            L16:
            L17:
                r0 = r4
                r1 = 0
                r0.writer = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CompilerMessageSuppressor$Java9WriterField.SCL.lombok */
    static class Java9WriterField implements lombok.javac.CompilerMessageSuppressor.WriterField {
        private final java.lang.reflect.Field field;
        private final java.lang.Object key;
        private java.io.PrintWriter writer;

        public Java9WriterField(java.lang.reflect.Field r4, java.lang.Object r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.field = r1
                r0 = r3
                r1 = r5
                r0.key = r1
                return
        }

        @Override // lombok.javac.CompilerMessageSuppressor.WriterField
        public void pauze(com.sun.tools.javac.util.Log r5) {
                r4 = this;
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Exception -> L2e
                r1 = r5
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2e
                java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L2e
                r6 = r0
                r0 = r4
                r1 = r6
                r2 = r4
                java.lang.Object r2 = r2.key     // Catch: java.lang.Exception -> L2e
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L2e
                java.io.PrintWriter r1 = (java.io.PrintWriter) r1     // Catch: java.lang.Exception -> L2e
                r0.writer = r1     // Catch: java.lang.Exception -> L2e
                r0 = r6
                r1 = r4
                java.lang.Object r1 = r1.key     // Catch: java.lang.Exception -> L2e
                java.io.PrintWriter r2 = lombok.javac.CompilerMessageSuppressor.Java9WriterField.NO_WRITER     // Catch: java.lang.Exception -> L2e
                java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Exception -> L2e
                goto L2f
            L2e:
            L2f:
                return
        }

        @Override // lombok.javac.CompilerMessageSuppressor.WriterField
        public void resume(com.sun.tools.javac.util.Log r5) {
                r4 = this;
                r0 = r4
                java.io.PrintWriter r0 = r0.writer
                if (r0 == 0) goto L26
                r0 = r4
                java.lang.reflect.Field r0 = r0.field     // Catch: java.lang.Exception -> L25
                r1 = r5
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L25
                java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L25
                r6 = r0
                r0 = r6
                r1 = r4
                java.lang.Object r1 = r1.key     // Catch: java.lang.Exception -> L25
                r2 = r4
                java.io.PrintWriter r2 = r2.writer     // Catch: java.lang.Exception -> L25
                java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Exception -> L25
                goto L26
            L25:
            L26:
                r0 = r4
                r1 = 0
                r0.writer = r1
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CompilerMessageSuppressor$WriterField.SCL.lombok */
    interface WriterField {
        public static final java.io.PrintWriter NO_WRITER = null;
        public static final lombok.javac.CompilerMessageSuppressor.WriterField NONE = null;



        static {
                java.io.PrintWriter r0 = new java.io.PrintWriter
                r1 = r0
                lombok.javac.CompilerMessageSuppressor$WriterField$1 r2 = new lombok.javac.CompilerMessageSuppressor$WriterField$1
                r3 = r2
                r3.<init>()
                r1.<init>(r2)
                lombok.javac.CompilerMessageSuppressor.WriterField.NO_WRITER = r0
                lombok.javac.CompilerMessageSuppressor$WriterField$2 r0 = new lombok.javac.CompilerMessageSuppressor$WriterField$2
                r1 = r0
                r1.<init>()
                lombok.javac.CompilerMessageSuppressor.WriterField.NONE = r0
                return
        }

        void pauze(com.sun.tools.javac.util.Log r1);

        void resume(com.sun.tools.javac.util.Log r1);
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/CompilerMessageSuppressor$Writers.SCL.lombok */
    enum Writers extends java.lang.Enum<lombok.javac.CompilerMessageSuppressor.Writers> {
        public static final lombok.javac.CompilerMessageSuppressor.Writers ERROR = null;
        public static final lombok.javac.CompilerMessageSuppressor.Writers WARNING = null;
        public static final lombok.javac.CompilerMessageSuppressor.Writers NOTICE = null;
        final java.lang.String fieldName;
        final java.lang.String keyName;
        private static final /* synthetic */ lombok.javac.CompilerMessageSuppressor.Writers[] ENUM$VALUES = null;

        static {
                lombok.javac.CompilerMessageSuppressor$Writers r0 = new lombok.javac.CompilerMessageSuppressor$Writers
                r1 = r0
                java.lang.String r2 = "ERROR"
                r3 = 0
                java.lang.String r4 = "errWriter"
                java.lang.String r5 = "ERROR"
                r1.<init>(r2, r3, r4, r5)
                lombok.javac.CompilerMessageSuppressor.Writers.ERROR = r0
                lombok.javac.CompilerMessageSuppressor$Writers r0 = new lombok.javac.CompilerMessageSuppressor$Writers
                r1 = r0
                java.lang.String r2 = "WARNING"
                r3 = 1
                java.lang.String r4 = "warnWriter"
                java.lang.String r5 = "WARNING"
                r1.<init>(r2, r3, r4, r5)
                lombok.javac.CompilerMessageSuppressor.Writers.WARNING = r0
                lombok.javac.CompilerMessageSuppressor$Writers r0 = new lombok.javac.CompilerMessageSuppressor$Writers
                r1 = r0
                java.lang.String r2 = "NOTICE"
                r3 = 2
                java.lang.String r4 = "noticeWriter"
                java.lang.String r5 = "NOTICE"
                r1.<init>(r2, r3, r4, r5)
                lombok.javac.CompilerMessageSuppressor.Writers.NOTICE = r0
                r0 = 3
                lombok.javac.CompilerMessageSuppressor$Writers[] r0 = new lombok.javac.CompilerMessageSuppressor.Writers[r0]
                r1 = r0
                r2 = 0
                lombok.javac.CompilerMessageSuppressor$Writers r3 = lombok.javac.CompilerMessageSuppressor.Writers.ERROR
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.javac.CompilerMessageSuppressor$Writers r3 = lombok.javac.CompilerMessageSuppressor.Writers.WARNING
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.javac.CompilerMessageSuppressor$Writers r3 = lombok.javac.CompilerMessageSuppressor.Writers.NOTICE
                r1[r2] = r3
                lombok.javac.CompilerMessageSuppressor.Writers.ENUM$VALUES = r0
                return
        }

        Writers(java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.fieldName = r1
                r0 = r4
                r1 = r8
                r0.keyName = r1
                return
        }

        public static lombok.javac.CompilerMessageSuppressor.Writers[] values() {
                lombok.javac.CompilerMessageSuppressor$Writers[] r0 = lombok.javac.CompilerMessageSuppressor.Writers.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.javac.CompilerMessageSuppressor$Writers[] r2 = new lombok.javac.CompilerMessageSuppressor.Writers[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.javac.CompilerMessageSuppressor.Writers valueOf(java.lang.String r3) {
                java.lang.Class<lombok.javac.CompilerMessageSuppressor$Writers> r0 = lombok.javac.CompilerMessageSuppressor.Writers.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.javac.CompilerMessageSuppressor$Writers r0 = (lombok.javac.CompilerMessageSuppressor.Writers) r0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = r0
            r1.<init>()
            lombok.javac.CompilerMessageSuppressor.handlerDeferredFields = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            lombok.javac.CompilerMessageSuppressor.queueCache = r0
            lombok.javac.CompilerMessageSuppressor$Writers r0 = lombok.javac.CompilerMessageSuppressor.Writers.ERROR
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = createWriterField(r0)
            lombok.javac.CompilerMessageSuppressor.errWriterField = r0
            lombok.javac.CompilerMessageSuppressor$Writers r0 = lombok.javac.CompilerMessageSuppressor.Writers.WARNING
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = createWriterField(r0)
            lombok.javac.CompilerMessageSuppressor.warnWriterField = r0
            lombok.javac.CompilerMessageSuppressor$Writers r0 = lombok.javac.CompilerMessageSuppressor.Writers.NOTICE
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = createWriterField(r0)
            lombok.javac.CompilerMessageSuppressor.noticeWriterField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "dumpOnError"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.dumpOnErrorField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "promptOnError"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.promptOnErrorField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "diagListener"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.diagnosticListenerField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "deferDiagnostics"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "deferredDiagnostics"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.deferredDiagnosticsField = r0
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "diagnosticHandler"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField = r0
            java.lang.Class<lombok.javac.JavacResolution> r0 = lombok.javac.JavacResolution.class
            java.lang.String r1 = "NULL_FIELD"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            lombok.javac.CompilerMessageSuppressor.NULL_FIELD = r0
            return
    }

    static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = r3
            r1 = r4
            java.lang.reflect.Field r0 = lombok.permit.Permit.getField(r0, r1)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            r0 = 0
            return r0
    }

    public CompilerMessageSuppressor(com.sun.tools.javac.util.Context r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            com.sun.tools.javac.util.Log r1 = com.sun.tools.javac.util.Log.instance(r1)
            r0.log = r1
            r0 = r3
            r1 = r4
            r0.context = r1
            return
    }

    public void disableLoggers() {
            r4 = this;
            r0 = r4
            r1 = r4
            com.sun.tools.javac.util.Context r1 = r1.context
            java.lang.Class<javax.tools.DiagnosticListener> r2 = javax.tools.DiagnosticListener.class
            java.lang.Object r1 = r1.get(r2)
            javax.tools.DiagnosticListener r1 = (javax.tools.DiagnosticListener) r1
            r0.contextDiagnosticListener = r1
            r0 = r4
            com.sun.tools.javac.util.Context r0 = r0.context
            java.lang.Class<javax.tools.DiagnosticListener> r1 = javax.tools.DiagnosticListener.class
            r2 = 0
            r0.put(r1, r2)
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.errWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.pauze(r1)
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.warnWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.pauze(r1)
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.noticeWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.pauze(r1)
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField
            if (r0 == 0) goto L81
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L80
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField     // Catch: java.lang.Exception -> L80
            r2 = r4
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> L80
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L80
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L81
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> L80
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.deferredDiagnosticsField     // Catch: java.lang.Exception -> L80
            r2 = r4
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> L80
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L80
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Exception -> L80
            r0.set(r1)     // Catch: java.lang.Exception -> L80
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Exception -> L80
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L80
            r5 = r0
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferredDiagnosticsField     // Catch: java.lang.Exception -> L80
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L80
            r2 = r5
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L80
            goto L81
        L80:
        L81:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField
            if (r0 == 0) goto Lbb
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField     // Catch: java.lang.Exception -> Lba
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> Lba
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lba
            r5 = r0
            r0 = r5
            java.lang.reflect.Field r0 = getDeferredField(r0)     // Catch: java.lang.Exception -> Lba
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Lbb
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> Lba
            r1 = r6
            r2 = r5
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lba
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Exception -> Lba
            r0.set(r1)     // Catch: java.lang.Exception -> Lba
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Exception -> Lba
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> Lba
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = r7
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lba
            goto Lbb
        Lba:
        Lbb:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.dumpOnErrorField
            if (r0 == 0) goto Le4
            r0 = r4
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.dumpOnErrorField     // Catch: java.lang.Exception -> Le3
            r2 = r4
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> Le3
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Le3
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Le3
            r0.dumpOnError = r1     // Catch: java.lang.Exception -> Le3
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.dumpOnErrorField     // Catch: java.lang.Exception -> Le3
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> Le3
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> Le3
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Le3
            goto Le4
        Le3:
        Le4:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.promptOnErrorField
            if (r0 == 0) goto L10d
            r0 = r4
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.promptOnErrorField     // Catch: java.lang.Exception -> L10c
            r2 = r4
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> L10c
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L10c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L10c
            r0.promptOnError = r1     // Catch: java.lang.Exception -> L10c
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.promptOnErrorField     // Catch: java.lang.Exception -> L10c
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L10c
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L10c
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L10c
            goto L10d
        L10c:
        L10d:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticListenerField
            if (r0 == 0) goto L133
            r0 = r4
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.diagnosticListenerField     // Catch: java.lang.Exception -> L132
            r2 = r4
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> L132
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L132
            javax.tools.DiagnosticListener r1 = (javax.tools.DiagnosticListener) r1     // Catch: java.lang.Exception -> L132
            r0.logDiagnosticListener = r1     // Catch: java.lang.Exception -> L132
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticListenerField     // Catch: java.lang.Exception -> L132
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L132
            r2 = 0
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L132
            goto L133
        L132:
        L133:
            return
    }

    private static java.lang.reflect.Field getDeferredField(java.lang.Object r4) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r5 = r0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> r0 = lombok.javac.CompilerMessageSuppressor.handlerDeferredFields
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L23
            r0 = r6
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.NULL_FIELD
            if (r0 != r1) goto L21
            r0 = 0
            goto L22
        L21:
            r0 = r6
        L22:
            return r0
        L23:
            r0 = r5
            java.lang.String r1 = "deferred"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            r7 = r0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.reflect.Field> r0 = lombok.javac.CompilerMessageSuppressor.handlerDeferredFields
            r1 = r5
            r2 = r7
            if (r2 != 0) goto L38
            java.lang.reflect.Field r2 = lombok.javac.CompilerMessageSuppressor.NULL_FIELD
            goto L39
        L38:
            r2 = r7
        L39:
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            java.lang.reflect.Field r0 = getDeferredField(r0)
            return r0
    }

    public void enableLoggers() {
            r4 = this;
            r0 = r4
            javax.tools.DiagnosticListener<?> r0 = r0.contextDiagnosticListener
            if (r0 == 0) goto L19
            r0 = r4
            com.sun.tools.javac.util.Context r0 = r0.context
            java.lang.Class<javax.tools.DiagnosticListener> r1 = javax.tools.DiagnosticListener.class
            r2 = r4
            javax.tools.DiagnosticListener<?> r2 = r2.contextDiagnosticListener
            r0.put(r1, r2)
            r0 = r4
            r1 = 0
            r0.contextDiagnosticListener = r1
        L19:
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.errWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.resume(r1)
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.warnWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.resume(r1)
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.noticeWriterField
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log
            r0.resume(r1)
            r0 = r4
            java.lang.Boolean r0 = r0.dumpOnError
            if (r0 == 0) goto L5b
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.dumpOnErrorField     // Catch: java.lang.Exception -> L5a
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L5a
            r2 = r4
            java.lang.Boolean r2 = r2.dumpOnError     // Catch: java.lang.Exception -> L5a
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L5a
            r0 = r4
            r1 = 0
            r0.dumpOnError = r1     // Catch: java.lang.Exception -> L5a
            goto L5b
        L5a:
        L5b:
            r0 = r4
            java.lang.Boolean r0 = r0.promptOnError
            if (r0 == 0) goto L79
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.promptOnErrorField     // Catch: java.lang.Exception -> L78
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L78
            r2 = r4
            java.lang.Boolean r2 = r2.promptOnError     // Catch: java.lang.Exception -> L78
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L78
            r0 = r4
            r1 = 0
            r0.promptOnError = r1     // Catch: java.lang.Exception -> L78
            goto L79
        L78:
        L79:
            r0 = r4
            javax.tools.DiagnosticListener<?> r0 = r0.logDiagnosticListener
            if (r0 == 0) goto L97
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticListenerField     // Catch: java.lang.Exception -> L96
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L96
            r2 = r4
            javax.tools.DiagnosticListener<?> r2 = r2.logDiagnosticListener     // Catch: java.lang.Exception -> L96
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L96
            r0 = r4
            r1 = 0
            r0.logDiagnosticListener = r1     // Catch: java.lang.Exception -> L96
            goto L97
        L96:
        L97:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField
            if (r0 == 0) goto Ld0
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Ld0
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField     // Catch: java.lang.Exception -> Lcf
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> Lcf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lcf
            r5 = r0
            r0 = r5
            java.lang.reflect.Field r0 = getDeferredField(r0)     // Catch: java.lang.Exception -> Lcf
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Ld0
            r0 = r6
            r1 = r5
            java.lang.ThreadLocal<java.util.Queue<?>> r2 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> Lcf
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> Lcf
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lcf
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> Lcf
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Exception -> Lcf
            goto Ld0
        Lcf:
        Ld0:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField
            if (r0 == 0) goto Lfa
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lfa
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferredDiagnosticsField     // Catch: java.lang.Exception -> Lf9
            r1 = r4
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> Lf9
            java.lang.ThreadLocal<java.util.Queue<?>> r2 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> Lf9
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> Lf9
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lf9
            java.lang.ThreadLocal<java.util.Queue<?>> r0 = lombok.javac.CompilerMessageSuppressor.queueCache     // Catch: java.lang.Exception -> Lf9
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Exception -> Lf9
            goto Lfa
        Lf9:
        Lfa:
            return
    }

    public void removeAllBetween(javax.tools.JavaFileObject r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            com.sun.tools.javac.util.Context r0 = r0.context
            java.lang.Class<javax.tools.DiagnosticListener> r1 = javax.tools.DiagnosticListener.class
            java.lang.Object r0 = r0.get(r1)
            javax.tools.DiagnosticListener r0 = (javax.tools.DiagnosticListener) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof lombok.javac.CapturingDiagnosticListener
            if (r0 == 0) goto L20
            r0 = r9
            lombok.javac.CapturingDiagnosticListener r0 = (lombok.javac.CapturingDiagnosticListener) r0
            r1 = r7
            r2 = r8
            r0.suppress(r1, r2)
        L20:
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Field r1 = lombok.javac.CompilerMessageSuppressor.deferDiagnosticsField     // Catch: java.lang.Exception -> L4d
            r2 = r5
            com.sun.tools.javac.util.Log r2 = r2.log     // Catch: java.lang.Exception -> L4d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L4d
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L4d
            if (r0 == 0) goto L4e
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.deferredDiagnosticsField     // Catch: java.lang.Exception -> L4d
            r10 = r0
            r0 = r5
            com.sun.tools.javac.util.Log r0 = r0.log     // Catch: java.lang.Exception -> L4d
            r11 = r0
            goto L4e
        L4d:
        L4e:
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField
            if (r0 == 0) goto L6f
            java.lang.reflect.Field r0 = lombok.javac.CompilerMessageSuppressor.diagnosticHandlerField     // Catch: java.lang.Exception -> L6e
            r1 = r5
            com.sun.tools.javac.util.Log r1 = r1.log     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L6e
            r12 = r0
            r0 = r12
            java.lang.reflect.Field r0 = getDeferredField(r0)     // Catch: java.lang.Exception -> L6e
            r10 = r0
            r0 = r12
            r11 = r0
            goto L6f
        L6e:
        L6f:
            r0 = r10
            if (r0 == 0) goto L79
            r0 = r11
            if (r0 != 0) goto L7a
        L79:
            return
        L7a:
            r0 = r10
            r1 = r11
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lfa
            com.sun.tools.javac.util.ListBuffer r0 = (com.sun.tools.javac.util.ListBuffer) r0     // Catch: java.lang.Exception -> Lfa
            r12 = r0
            com.sun.tools.javac.util.ListBuffer r0 = new com.sun.tools.javac.util.ListBuffer     // Catch: java.lang.Exception -> Lfa
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> Lfa
            r13 = r0
            r0 = r12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lfa
            r15 = r0
            goto Le4
        L99:
            r0 = r15
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> Lfa
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof com.sun.tools.javac.util.JCDiagnostic     // Catch: java.lang.Exception -> Lfa
            if (r0 != 0) goto Lb5
            r0 = r13
            r1 = r14
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)     // Catch: java.lang.Exception -> Lfa
            goto Le4
        Lb5:
            r0 = r14
            com.sun.tools.javac.util.JCDiagnostic r0 = (com.sun.tools.javac.util.JCDiagnostic) r0     // Catch: java.lang.Exception -> Lfa
            r16 = r0
            r0 = r16
            long r0 = r0.getStartPosition()     // Catch: java.lang.Exception -> Lfa
            r17 = r0
            r0 = r17
            r1 = r7
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lfa
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Ldc
            r0 = r17
            r1 = r8
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lfa
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ldc
            r0 = r16
            javax.tools.JavaFileObject r0 = r0.getSource()     // Catch: java.lang.Exception -> Lfa
            r1 = r6
            if (r0 == r1) goto Le4
        Ldc:
            r0 = r13
            r1 = r16
            com.sun.tools.javac.util.ListBuffer r0 = r0.append(r1)     // Catch: java.lang.Exception -> Lfa
        Le4:
            r0 = r15
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> Lfa
            if (r0 != 0) goto L99
            r0 = r10
            r1 = r11
            r2 = r13
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lfa
            goto Lfb
        Lfa:
        Lfb:
            return
    }

    private static lombok.javac.CompilerMessageSuppressor.WriterField createWriterField(lombok.javac.CompilerMessageSuppressor.Writers r5) {
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            java.lang.String r1 = "writer"
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)     // Catch: java.lang.Exception -> L50
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L51
            java.lang.String r0 = "com.sun.tools.javac.util.Log$WriterKind"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L50
            r7 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.getEnumConstants()     // Catch: java.lang.Exception -> L50
            r1 = r0
            r11 = r1
            int r0 = r0.length     // Catch: java.lang.Exception -> L50
            r10 = r0
            r0 = 0
            r9 = r0
            goto L45
        L24:
            r0 = r11
            r1 = r9
            r0 = r0[r1]     // Catch: java.lang.Exception -> L50
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L50
            r1 = r5
            java.lang.String r1 = r1.keyName     // Catch: java.lang.Exception -> L50
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L42
            lombok.javac.CompilerMessageSuppressor$Java9WriterField r0 = new lombok.javac.CompilerMessageSuppressor$Java9WriterField     // Catch: java.lang.Exception -> L50
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L50
            return r0
        L42:
            int r9 = r9 + 1
        L45:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L24
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.WriterField.NONE     // Catch: java.lang.Exception -> L50
            return r0
        L50:
        L51:
            java.lang.Class<com.sun.tools.javac.util.Log> r0 = com.sun.tools.javac.util.Log.class
            r1 = r5
            java.lang.String r1 = r1.fieldName
            java.lang.reflect.Field r0 = getDeclaredField(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L68
            lombok.javac.CompilerMessageSuppressor$Java8WriterField r0 = new lombok.javac.CompilerMessageSuppressor$Java8WriterField
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
        L68:
            lombok.javac.CompilerMessageSuppressor$WriterField r0 = lombok.javac.CompilerMessageSuppressor.WriterField.NONE
            return r0
    }
}
