package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/ProblemReporter.SCL.lombok */
public class ProblemReporter {
    private static lombok.core.debug.ProblemReporter.ErrorLogger logger;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/ProblemReporter$EclipseWorkspaceLogger.SCL.lombok */
    private static class EclipseWorkspaceLogger implements lombok.core.debug.ProblemReporter.ErrorLogger {
        private static final java.lang.String DEFAULT_BUNDLE_NAME = "org.eclipse.jdt.core";
        private static final org.osgi.framework.Bundle bundle = null;
        private static final int MAX_LOG = 200;
        private static final long SQUELCH_TIMEOUT = 0;
        private static final java.util.concurrent.atomic.AtomicInteger counter = null;
        private static volatile long squelchTimeout;

        static {
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
                r1 = 1
                long r0 = r0.toMillis(r1)
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.SQUELCH_TIMEOUT = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = r0
                r1.<init>()
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.counter = r0
                r0 = 0
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout = r0
                java.lang.String r0 = "org.eclipse.jdt.core"
                org.osgi.framework.Bundle r0 = org.eclipse.core.runtime.Platform.getBundle(r0)
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.bundle = r0
                org.osgi.framework.Bundle r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.bundle
                if (r0 != 0) goto L2e
                java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
                r1 = r0
                r1.<init>()
                throw r0
            L2e:
                return
        }

        private EclipseWorkspaceLogger() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void info(java.lang.String r6, java.lang.Throwable r7) {
                r5 = this;
                r0 = r5
                r1 = 1
                r2 = r6
                r3 = r7
                r0.msg(r1, r2, r3)
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void warning(java.lang.String r6, java.lang.Throwable r7) {
                r5 = this;
                r0 = r5
                r1 = 2
                r2 = r6
                r3 = r7
                r0.msg(r1, r2, r3)
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void error(java.lang.String r6, java.lang.Throwable r7) {
                r5 = this;
                r0 = r5
                r1 = 4
                r2 = r6
                r3 = r7
                r0.msg(r1, r2, r3)
                return
        }

        private void msg(int r9, java.lang.String r10, java.lang.Throwable r11) {
                r8 = this;
                long r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto Lc
                r0 = 0
                goto L12
            Lc:
                java.util.concurrent.atomic.AtomicInteger r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.counter
                int r0 = r0.incrementAndGet()
            L12:
                r12 = r0
                r0 = 0
                r13 = r0
                long r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L3d
                long r0 = java.lang.System.currentTimeMillis()
                r14 = r0
                long r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout
                r1 = r14
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L2e
                return
            L2e:
                r0 = r14
                long r1 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.SQUELCH_TIMEOUT
                long r0 = r0 + r1
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout = r0
                r0 = 1
                r13 = r0
                goto L52
            L3d:
                r0 = r12
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 < r1) goto L52
                long r0 = java.lang.System.currentTimeMillis()
                long r1 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.SQUELCH_TIMEOUT
                long r0 = r0 + r1
                lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.squelchTimeout = r0
                r0 = 1
                r13 = r0
            L52:
                org.osgi.framework.Bundle r0 = lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger.bundle
                org.eclipse.core.runtime.ILog r0 = org.eclipse.core.runtime.Platform.getLog(r0)
                r14 = r0
                r0 = r14
                org.eclipse.core.runtime.Status r1 = new org.eclipse.core.runtime.Status
                r2 = r1
                r3 = r9
                java.lang.String r4 = "org.eclipse.jdt.core"
                r5 = r10
                r6 = r11
                r2.<init>(r3, r4, r5, r6)
                r0.log(r1)
                r0 = r13
                if (r0 == 0) goto L85
                r0 = r14
                org.eclipse.core.runtime.Status r1 = new org.eclipse.core.runtime.Status
                r2 = r1
                r3 = 2
                java.lang.String r4 = "org.eclipse.jdt.core"
                java.lang.String r5 = "Lombok has logged too many messages; to avoid memory issues, further lombok logs will be squelched for a while. Restart eclipse to start over."
                r2.<init>(r3, r4, r5)
                r0.log(r1)
            L85:
                return
        }

        /* synthetic */ EclipseWorkspaceLogger(lombok.core.debug.ProblemReporter.EclipseWorkspaceLogger r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/ProblemReporter$ErrorLogger.SCL.lombok */
    private interface ErrorLogger {
        void info(java.lang.String r1, java.lang.Throwable r2);

        void warning(java.lang.String r1, java.lang.Throwable r2);

        void error(java.lang.String r1, java.lang.Throwable r2);
    }

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/ProblemReporter$TerminalLogger.SCL.lombok */
    private static class TerminalLogger implements lombok.core.debug.ProblemReporter.ErrorLogger {
        private TerminalLogger() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void info(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.io.PrintStream r0 = java.lang.System.err
                r1 = r4
                r0.println(r1)
                r0 = r5
                if (r0 == 0) goto Lf
                r0 = r5
                r0.printStackTrace()
            Lf:
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void warning(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.io.PrintStream r0 = java.lang.System.err
                r1 = r4
                r0.println(r1)
                r0 = r5
                if (r0 == 0) goto Lf
                r0 = r5
                r0.printStackTrace()
            Lf:
                return
        }

        @Override // lombok.core.debug.ProblemReporter.ErrorLogger
        public void error(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.io.PrintStream r0 = java.lang.System.err
                r1 = r4
                r0.println(r1)
                r0 = r5
                if (r0 == 0) goto Lf
                r0 = r5
                r0.printStackTrace()
            Lf:
                return
        }

        /* synthetic */ TerminalLogger(lombok.core.debug.ProblemReporter.TerminalLogger r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public ProblemReporter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void info(java.lang.String r4, java.lang.Throwable r5) {
            init()
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger     // Catch: java.lang.Throwable -> L10
            r1 = r4
            r2 = r5
            r0.info(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L26
        L10:
            lombok.core.debug.ProblemReporter$TerminalLogger r0 = new lombok.core.debug.ProblemReporter$TerminalLogger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.debug.ProblemReporter.logger = r0
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger
            r1 = r4
            r2 = r5
            r0.info(r1, r2)
        L26:
            return
    }

    public static void warning(java.lang.String r4, java.lang.Throwable r5) {
            init()
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger     // Catch: java.lang.Throwable -> L10
            r1 = r4
            r2 = r5
            r0.warning(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L26
        L10:
            lombok.core.debug.ProblemReporter$TerminalLogger r0 = new lombok.core.debug.ProblemReporter$TerminalLogger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.debug.ProblemReporter.logger = r0
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger
            r1 = r4
            r2 = r5
            r0.warning(r1, r2)
        L26:
            return
    }

    public static void error(java.lang.String r4, java.lang.Throwable r5) {
            init()
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger     // Catch: java.lang.Throwable -> L10
            r1 = r4
            r2 = r5
            r0.error(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L26
        L10:
            lombok.core.debug.ProblemReporter$TerminalLogger r0 = new lombok.core.debug.ProblemReporter$TerminalLogger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.debug.ProblemReporter.logger = r0
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger
            r1 = r4
            r2 = r5
            r0.error(r1, r2)
        L26:
            return
    }

    private static void init() {
            lombok.core.debug.ProblemReporter$ErrorLogger r0 = lombok.core.debug.ProblemReporter.logger
            if (r0 == 0) goto L7
            return
        L7:
            lombok.core.debug.ProblemReporter$EclipseWorkspaceLogger r0 = new lombok.core.debug.ProblemReporter$EclipseWorkspaceLogger     // Catch: java.lang.Throwable -> L15
            r1 = r0
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            lombok.core.debug.ProblemReporter.logger = r0     // Catch: java.lang.Throwable -> L15
            goto L21
        L15:
            lombok.core.debug.ProblemReporter$TerminalLogger r0 = new lombok.core.debug.ProblemReporter$TerminalLogger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.debug.ProblemReporter.logger = r0
        L21:
            return
    }
}
