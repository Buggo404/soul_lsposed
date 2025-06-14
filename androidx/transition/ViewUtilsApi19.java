package androidx.transition;

/* loaded from: classes.dex */
class ViewUtilsApi19 extends androidx.transition.ViewUtilsBase {
    private static boolean sTryHiddenTransitionAlpha = true;

    static {
            return
    }

    ViewUtilsApi19() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(android.view.View r2) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha
            if (r0 == 0) goto Lc
            float r2 = r2.getTransitionAlpha()     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha
            if (r0 == 0) goto Lb
            r2.setTransitionAlpha(r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            androidx.transition.ViewUtilsApi19.sTryHiddenTransitionAlpha = r0
        Lb:
            r2.setAlpha(r3)
            return
    }
}
