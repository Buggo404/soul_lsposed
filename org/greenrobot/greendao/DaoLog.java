package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class DaoLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final java.lang.String TAG = "greenDAO";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public DaoLog() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static int m100d(java.lang.String r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.d(r0, r1)
            return r1
    }

    /* renamed from: d */
    public static int m101d(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.d(r0, r1, r2)
            return r1
    }

    /* renamed from: e */
    public static int m102e(java.lang.String r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.w(r0, r1)
            return r1
    }

    /* renamed from: e */
    public static int m103e(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.e(r0, r1, r2)
            return r1
    }

    public static java.lang.String getStackTraceString(java.lang.Throwable r0) {
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            return r0
    }

    /* renamed from: i */
    public static int m104i(java.lang.String r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.i(r0, r1)
            return r1
    }

    /* renamed from: i */
    public static int m105i(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.i(r0, r1, r2)
            return r1
    }

    public static boolean isLoggable(int r1) {
            java.lang.String r0 = "greenDAO"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            return r1
    }

    public static int println(int r1, java.lang.String r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.println(r1, r0, r2)
            return r1
    }

    /* renamed from: v */
    public static int m106v(java.lang.String r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.v(r0, r1)
            return r1
    }

    /* renamed from: v */
    public static int m107v(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.v(r0, r1, r2)
            return r1
    }

    /* renamed from: w */
    public static int m108w(java.lang.String r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.w(r0, r1)
            return r1
    }

    /* renamed from: w */
    public static int m109w(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.w(r0, r1, r2)
            return r1
    }

    /* renamed from: w */
    public static int m110w(java.lang.Throwable r1) {
            java.lang.String r0 = "greenDAO"
            int r1 = android.util.Log.w(r0, r1)
            return r1
    }
}
