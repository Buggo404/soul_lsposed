package androidx.transition;

/* loaded from: classes.dex */
class WindowIdApi18 implements androidx.transition.WindowIdImpl {
    private final android.view.WindowId mWindowId;

    WindowIdApi18(android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.WindowId r1 = r1.getWindowId()
            r0.mWindowId = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.transition.WindowIdApi18
            if (r0 == 0) goto L12
            androidx.transition.WindowIdApi18 r2 = (androidx.transition.WindowIdApi18) r2
            android.view.WindowId r2 = r2.mWindowId
            android.view.WindowId r0 = r1.mWindowId
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
            android.view.WindowId r0 = r1.mWindowId
            int r0 = r0.hashCode()
            return r0
    }
}
