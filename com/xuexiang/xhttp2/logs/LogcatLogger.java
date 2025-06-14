package com.xuexiang.xhttp2.logs;

/* loaded from: classes.dex */
public class LogcatLogger implements com.xuexiang.xhttp2.logs.ILogger {
    private static final int MAX_LOG_LENGTH = 4000;

    public LogcatLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String getStackTraceString(java.lang.Throwable r4) {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = 0
            r1.<init>(r0, r2)
            r4.printStackTrace(r1)
            r1.flush()
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void log(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            int r0 = r7.length()
            int r0 = r0 / 4000
            if (r0 <= 0) goto L25
            r1 = 0
            r2 = r1
        La:
            if (r1 >= r0) goto L19
            int r3 = r2 + 4000
            java.lang.String r2 = r7.substring(r2, r3)
            r4.logSub(r5, r6, r2)
            int r1 = r1 + 1
            r2 = r3
            goto La
        L19:
            int r0 = r7.length()
            java.lang.String r7 = r7.substring(r2, r0)
            r4.logSub(r5, r6, r7)
            goto L28
        L25:
            r4.logSub(r5, r6, r7)
        L28:
            return
    }

    private void logSub(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            switch(r1) {
                case 2: goto L1b;
                case 3: goto L17;
                case 4: goto L13;
                case 5: goto Lf;
                case 6: goto Lb;
                case 7: goto L7;
                default: goto L3;
            }
        L3:
            android.util.Log.v(r2, r3)
            goto L1e
        L7:
            android.util.Log.wtf(r2, r3)
            goto L1e
        Lb:
            android.util.Log.e(r2, r3)
            goto L1e
        Lf:
            android.util.Log.w(r2, r3)
            goto L1e
        L13:
            android.util.Log.i(r2, r3)
            goto L1e
        L17:
            android.util.Log.d(r2, r3)
            goto L1e
        L1b:
            android.util.Log.v(r2, r3)
        L1e:
            return
    }

    @Override // com.xuexiang.xhttp2.logs.ILogger
    public void log(int r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
            r1 = this;
            if (r4 == 0) goto L9
            int r0 = r4.length()
            if (r0 != 0) goto L9
            r4 = 0
        L9:
            if (r4 != 0) goto L13
            if (r5 != 0) goto Le
            return
        Le:
            java.lang.String r4 = r1.getStackTraceString(r5)
            goto L30
        L13:
            if (r5 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = r1.getStackTraceString(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L30:
            r1.log(r2, r3, r4)
            return
    }
}
