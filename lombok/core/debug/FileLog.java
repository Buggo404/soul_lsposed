package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/FileLog.SCL.lombok */
public class FileLog {
    private static java.io.FileOutputStream fos;


    public FileLog() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void log(java.lang.String r3) {
            r0 = r3
            r1 = 0
            log(r0, r1)
            return
    }

    public static synchronized void log(java.lang.String r7, java.lang.Throwable r8) {
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            if (r0 != 0) goto L2b
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L77
            r1 = r0
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L77
            r3 = r2
            java.lang.String r4 = "user.home"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.io.IOException -> L77
            java.lang.String r5 = "LOMBOK-DEBUG-OUT.txt"
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L77
            r1.<init>(r2)     // Catch: java.io.IOException -> L77
            lombok.core.debug.FileLog.fos = r0     // Catch: java.io.IOException -> L77
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.io.IOException -> L77
            lombok.core.debug.FileLog$1 r1 = new lombok.core.debug.FileLog$1     // Catch: java.io.IOException -> L77
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L77
            r0.addShutdownHook(r1)     // Catch: java.io.IOException -> L77
        L2b:
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            r1 = r7
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.io.IOException -> L77
            r0.write(r1)     // Catch: java.io.IOException -> L77
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> L77
            r0 = r8
            if (r0 == 0) goto L6e
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L77
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L77
            r9 = r0
            r0 = r8
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.io.IOException -> L77
            r2 = r1
            r3 = r9
            r2.<init>(r3)     // Catch: java.io.IOException -> L77
            r0.printStackTrace(r1)     // Catch: java.io.IOException -> L77
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L77
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.io.IOException -> L77
            r0.write(r1)     // Catch: java.io.IOException -> L77
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            r1 = 10
            r0.write(r1)     // Catch: java.io.IOException -> L77
        L6e:
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos     // Catch: java.io.IOException -> L77
            r0.flush()     // Catch: java.io.IOException -> L77
            goto L83
        L77:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Internal lombok file-based debugging not possible"
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L83:
            return
    }

    static /* synthetic */ java.io.FileOutputStream access$0() {
            java.io.FileOutputStream r0 = lombok.core.debug.FileLog.fos
            return r0
    }
}
