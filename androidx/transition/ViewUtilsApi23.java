package androidx.transition;

/* loaded from: classes.dex */
class ViewUtilsApi23 extends androidx.transition.ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    static {
            return
    }

    ViewUtilsApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.setTransitionVisibility(r3, r4)
            goto L15
        La:
            boolean r0 = androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility
            if (r0 == 0) goto L15
            r3.setTransitionVisibility(r4)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r3 = 0
            androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility = r3
        L15:
            return
    }
}
