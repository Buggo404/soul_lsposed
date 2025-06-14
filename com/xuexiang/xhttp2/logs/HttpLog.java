package com.xuexiang.xhttp2.logs;

/* loaded from: classes.dex */
public final class HttpLog {
    public static final java.lang.String DEFAULT_LOG_TAG = "[XHttp]";
    private static final int MAX_LOG_PRIORITY = 10;
    private static final int MIN_LOG_PRIORITY = 0;
    private static com.xuexiang.xhttp2.logs.ILogger sILogger;
    private static boolean sIsDebug;
    private static int sLogPriority;
    private static java.lang.String sTag;

    static {
            com.xuexiang.xhttp2.logs.LogcatLogger r0 = new com.xuexiang.xhttp2.logs.LogcatLogger
            r0.<init>()
            com.xuexiang.xhttp2.logs.HttpLog.sILogger = r0
            java.lang.String r0 = "[XHttp]"
            com.xuexiang.xhttp2.logs.HttpLog.sTag = r0
            r0 = 0
            com.xuexiang.xhttp2.logs.HttpLog.sIsDebug = r0
            r0 = 10
            com.xuexiang.xhttp2.logs.HttpLog.sLogPriority = r0
            return
    }

    public HttpLog() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static void m33d(java.lang.String r4) {
            r0 = 3
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }

    public static void debug(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 1
            setDebug(r0)
            setPriority(r1)
            setTag(r2)
            goto L1f
        L12:
            setDebug(r1)
            r2 = 10
            setPriority(r2)
            java.lang.String r2 = ""
            setTag(r2)
        L1f:
            return
    }

    public static void debug(boolean r0) {
            if (r0 == 0) goto L8
            java.lang.String r0 = "[XHttp]"
            debug(r0)
            goto Ld
        L8:
            java.lang.String r0 = ""
            debug(r0)
        Ld:
            return
    }

    /* renamed from: e */
    public static void m34e(java.lang.String r4) {
            r0 = 6
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }

    /* renamed from: e */
    public static void m35e(java.lang.String r3, java.lang.Throwable r4) {
            r0 = 6
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Le
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r1.log(r0, r2, r3, r4)
        Le:
            return
    }

    /* renamed from: e */
    public static void m36e(java.lang.Throwable r4) {
            r0 = 6
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r3, r4)
        Lf:
            return
    }

    private static boolean enableLog(int r1) {
            com.xuexiang.xhttp2.logs.ILogger r0 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            if (r0 == 0) goto Le
            boolean r0 = com.xuexiang.xhttp2.logs.HttpLog.sIsDebug
            if (r0 == 0) goto Le
            int r0 = com.xuexiang.xhttp2.logs.HttpLog.sLogPriority
            if (r1 < r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* renamed from: i */
    public static void m37i(java.lang.String r4) {
            r0 = 4
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }

    public static void setDebug(boolean r0) {
            com.xuexiang.xhttp2.logs.HttpLog.sIsDebug = r0
            return
    }

    public static void setLogger(com.xuexiang.xhttp2.logs.ILogger r0) {
            com.xuexiang.xhttp2.logs.HttpLog.sILogger = r0
            return
    }

    public static void setPriority(int r0) {
            com.xuexiang.xhttp2.logs.HttpLog.sLogPriority = r0
            return
    }

    public static void setTag(java.lang.String r0) {
            com.xuexiang.xhttp2.logs.HttpLog.sTag = r0
            return
    }

    /* renamed from: v */
    public static void m38v(java.lang.String r4) {
            r0 = 2
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }

    /* renamed from: w */
    public static void m39w(java.lang.String r4) {
            r0 = 5
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }

    public static void wtf(java.lang.String r4) {
            r0 = 7
            boolean r1 = enableLog(r0)
            if (r1 == 0) goto Lf
            com.xuexiang.xhttp2.logs.ILogger r1 = com.xuexiang.xhttp2.logs.HttpLog.sILogger
            java.lang.String r2 = com.xuexiang.xhttp2.logs.HttpLog.sTag
            r3 = 0
            r1.log(r0, r2, r4, r3)
        Lf:
            return
    }
}
