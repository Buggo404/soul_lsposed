package androidx.transition;

/* loaded from: classes.dex */
public class Fade extends androidx.transition.Visibility {

    /* renamed from: IN */
    public static final int f86IN = 1;
    private static final java.lang.String LOG_TAG = "Fade";
    public static final int OUT = 2;
    private static final java.lang.String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";


    private static class FadeAnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean mLayerTypeChanged;
        private final android.view.View mView;

        FadeAnimatorListener(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mLayerTypeChanged = r0
                r1.mView = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.mView
                r0 = 1065353216(0x3f800000, float:1.0)
                androidx.transition.ViewUtils.setTransitionAlpha(r3, r0)
                boolean r3 = r2.mLayerTypeChanged
                if (r3 == 0) goto L12
                android.view.View r3 = r2.mView
                r0 = 0
                r1 = 0
                r3.setLayerType(r0, r1)
            L12:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.mView
                boolean r3 = androidx.core.view.ViewCompat.hasOverlappingRendering(r3)
                if (r3 == 0) goto L1a
                android.view.View r3 = r2.mView
                int r3 = r3.getLayerType()
                if (r3 != 0) goto L1a
                r3 = 1
                r2.mLayerTypeChanged = r3
                android.view.View r3 = r2.mView
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
            L1a:
                return
        }
    }

    public Fade() {
            r0 = this;
            r0.<init>()
            return
    }

    public Fade(int r1) {
            r0 = this;
            r0.<init>()
            r0.setMode(r1)
            return
    }

    public Fade(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            int[] r0 = androidx.transition.Styleable.FADE
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            android.content.res.XmlResourceParser r5 = (android.content.res.XmlResourceParser) r5
            r0 = 0
            int r1 = r3.getMode()
            java.lang.String r2 = "fadingMode"
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r4, r5, r2, r0, r1)
            r3.setMode(r5)
            r4.recycle()
            return
    }

    private android.animation.Animator createAnimation(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            androidx.transition.ViewUtils.setTransitionAlpha(r3, r4)
            android.util.Property<android.view.View, java.lang.Float> r4 = androidx.transition.ViewUtils.TRANSITION_ALPHA
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            androidx.transition.Fade$FadeAnimatorListener r5 = new androidx.transition.Fade$FadeAnimatorListener
            r5.<init>(r3)
            r4.addListener(r5)
            androidx.transition.Fade$1 r5 = new androidx.transition.Fade$1
            r5.<init>(r2, r3)
            r2.addListener(r5)
            return r4
    }

    private static float getStartAlpha(androidx.transition.TransitionValues r1, float r2) {
            if (r1 == 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L12
            float r2 = r1.floatValue()
        L12:
            return r2
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r3) {
            r2 = this;
            super.captureStartValues(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.values
            android.view.View r3 = r3.view
            float r3 = androidx.transition.ViewUtils.getTransitionAlpha(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.String r1 = "android:fade:transitionAlpha"
            r0.put(r1, r3)
            return
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup r2, android.view.View r3, androidx.transition.TransitionValues r4, androidx.transition.TransitionValues r5) {
            r1 = this;
            r2 = 0
            float r4 = getStartAlpha(r4, r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r2 = r4
        Ld:
            android.animation.Animator r2 = r1.createAnimation(r3, r2, r5)
            return r2
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            androidx.transition.ViewUtils.saveNonTransitionAlpha(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = getStartAlpha(r3, r1)
            r3 = 0
            android.animation.Animator r1 = r0.createAnimation(r2, r1, r3)
            return r1
    }
}
