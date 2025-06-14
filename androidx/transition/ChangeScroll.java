package androidx.transition;

/* loaded from: classes.dex */
public class ChangeScroll extends androidx.transition.Transition {
    private static final java.lang.String[] PROPERTIES = null;
    private static final java.lang.String PROPNAME_SCROLL_X = "android:changeScroll:x";
    private static final java.lang.String PROPNAME_SCROLL_Y = "android:changeScroll:y";

    static {
            java.lang.String r0 = "android:changeScroll:x"
            java.lang.String r1 = "android:changeScroll:y"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.transition.ChangeScroll.PROPERTIES = r0
            return
    }

    public ChangeScroll() {
            r0 = this;
            r0.<init>()
            return
    }

    public ChangeScroll(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r1 = r4.view
            int r1 = r1.getScrollX()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android:changeScroll:x"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r4 = r4.view
            int r4 = r4.getScrollY()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "android:changeScroll:y"
            r0.put(r1, r4)
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r8, androidx.transition.TransitionValues r9, androidx.transition.TransitionValues r10) {
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L67
            if (r10 != 0) goto L6
            goto L67
        L6:
            android.view.View r0 = r10.view
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.values
            java.lang.String r2 = "android:changeScroll:x"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.values
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.values
            java.lang.String r3 = "android:changeScroll:y"
            java.lang.Object r9 = r9.get(r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r10 = r10.values
            java.lang.Object r10 = r10.get(r3)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3 = 1
            r4 = 0
            r5 = 2
            if (r1 == r2) goto L51
            r0.setScrollX(r1)
            int[] r6 = new int[r5]
            r6[r4] = r1
            r6[r3] = r2
            java.lang.String r1 = "scrollX"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r0, r1, r6)
            goto L52
        L51:
            r1 = r8
        L52:
            if (r9 == r10) goto L63
            r0.setScrollY(r9)
            int[] r8 = new int[r5]
            r8[r4] = r9
            r8[r3] = r10
            java.lang.String r9 = "scrollY"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofInt(r0, r9, r8)
        L63:
            android.animation.Animator r8 = androidx.transition.TransitionUtils.mergeAnimators(r1, r8)
        L67:
            return r8
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeScroll.PROPERTIES
            return r0
    }
}
