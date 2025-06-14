package androidx.core.provider;

/* loaded from: classes.dex */
class CalleeHandler {
    private CalleeHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.os.Handler create() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L10
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            goto L15
        L10:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L15:
            return r0
    }
}
