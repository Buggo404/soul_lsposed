package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/AssertionLogger.SCL.lombok */
public class AssertionLogger {
    private static final java.lang.String LOG_PATH = null;
    private static final java.util.concurrent.atomic.AtomicBoolean loggedIntro = null;
    private static final java.lang.String PROCESS_ID = null;
    private static final java.lang.String ID_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    static {
            java.lang.String r0 = "lombok.assertion.log"
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1d
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
            r0 = 0
            goto L17
        L16:
            r0 = r4
        L17:
            lombok.core.debug.AssertionLogger.LOG_PATH = r0
            goto L3c
        L1d:
            java.lang.String r0 = "LOMBOK_ASSERTION_LOG"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch: java.lang.Exception -> L26
            r4 = r0
            goto L29
        L26:
            r0 = 0
            r4 = r0
        L29:
            r0 = r4
            if (r0 == 0) goto L34
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L38
        L34:
            r0 = 0
            goto L39
        L38:
            r0 = r4
        L39:
            lombok.core.debug.AssertionLogger.LOG_PATH = r0
        L3c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.debug.AssertionLogger.loggedIntro = r0
            java.lang.String r0 = generateProcessId()
            lombok.core.debug.AssertionLogger.PROCESS_ID = r0
            return
    }

    public AssertionLogger() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.String generateProcessId() {
            r0 = 4
            char[] r0 = new char[r0]
            r6 = r0
            java.util.Random r0 = new java.util.Random
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
            goto L25
        L11:
            r0 = r6
            r1 = r8
            java.lang.String r2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
            r3 = r7
            java.lang.String r4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
            int r4 = r4.length()
            int r3 = r3.nextInt(r4)
            char r2 = r2.charAt(r3)
            r0[r1] = r2
            int r8 = r8 + 1
        L25:
            r0 = r8
            r1 = r6
            int r1 = r1.length
            if (r0 < r1) goto L11
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    private static synchronized void logToFile(java.lang.String r5) {
            r0 = r5
            if (r0 != 0) goto L5
            return
        L5:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L22
            r1 = r0
            java.lang.String r2 = lombok.core.debug.AssertionLogger.LOG_PATH     // Catch: java.lang.Exception -> L22
            r3 = 1
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L22
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L22
            r0.write(r1)     // Catch: java.lang.Exception -> L22
            r0 = r6
            r0.close()     // Catch: java.lang.Exception -> L22
            goto L2e
        L22:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "assertion logging can't write to log file"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L2e:
            return
    }

    private static void logIntro() {
            java.util.concurrent.atomic.AtomicBoolean r0 = lombok.core.debug.AssertionLogger.loggedIntro
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = lombok.core.Version.getFullVersion()     // Catch: java.lang.Exception -> L12
            r7 = r0
            goto L17
        L12:
            java.lang.String r0 = lombok.core.Version.getVersion()
            r7 = r0
        L17:
            java.lang.String r0 = "{%s} [%s -- START %s]\n"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = lombok.core.debug.AssertionLogger.PROCESS_ID
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.util.Date r4 = new java.util.Date
            r5 = r4
            r5.<init>()
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r7
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            logToFile(r0)
            return
    }

    public static <T extends java.lang.Throwable> T assertLog(java.lang.String r7, T r8) {
            java.lang.String r0 = lombok.core.debug.AssertionLogger.LOG_PATH
            if (r0 != 0) goto L8
            r0 = r8
            return r0
        L8:
            logIntro()
            r0 = r7
            if (r0 != 0) goto L12
            java.lang.String r0 = "(No message)"
            r7 = r0
        L12:
            java.lang.String r0 = ""
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L5b
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = r0
            r1.<init>()
            r10 = r0
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r8
            r1 = r11
            r0.printStackTrace(r1)
            r0 = r11
            r0.close()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "\n  "
            r1.<init>(r2)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "\r"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r2 = "\n"
            java.lang.String r3 = "\n  "
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
        L5b:
            java.lang.String r0 = "{%s} [%ty%<tm%<tdT%<tH%<tM%<tS.%<tL] %s%s\n"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = lombok.core.debug.AssertionLogger.PROCESS_ID
            r2[r3] = r4
            r2 = r1
            r3 = 1
            java.util.Date r4 = new java.util.Date
            r5 = r4
            r5.<init>()
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r7
            r2[r3] = r4
            r2 = r1
            r3 = 3
            r4 = r9
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            logToFile(r0)
            r0 = r8
            return r0
    }

    public static void assertLog(java.lang.String r3) {
            java.lang.String r0 = lombok.core.debug.AssertionLogger.LOG_PATH
            if (r0 != 0) goto L7
            return
        L7:
            r0 = r3
            r1 = 0
            java.lang.Throwable r0 = assertLog(r0, r1)
            return
    }
}
