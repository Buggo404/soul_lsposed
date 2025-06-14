package androidx.transition;

/* loaded from: classes.dex */
class ViewUtilsApi22 extends androidx.transition.ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    static {
            return
    }

    ViewUtilsApi22() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom
            if (r0 == 0) goto Lb
            r2.setLeftTopRightBottom(r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom = r2
        Lb:
            return
    }
}
