package androidx.transition;

/* loaded from: classes.dex */
class WindowIdApi14 implements androidx.transition.WindowIdImpl {
    private final android.os.IBinder mToken;

    WindowIdApi14(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.mToken = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.transition.WindowIdApi14
            if (r0 == 0) goto L12
            androidx.transition.WindowIdApi14 r2 = (androidx.transition.WindowIdApi14) r2
            android.os.IBinder r2 = r2.mToken
            android.os.IBinder r0 = r1.mToken
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            android.os.IBinder r0 = r1.mToken
            int r0 = r0.hashCode()
            return r0
    }
}
