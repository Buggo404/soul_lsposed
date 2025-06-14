package androidx.transition;

/* loaded from: classes.dex */
public abstract class Visibility extends androidx.transition.Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final java.lang.String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final java.lang.String[] sTransitionProperties = null;
    private int mMode;


    private static class DisappearListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat {
        boolean mCanceled;
        private final int mFinalVisibility;
        private boolean mLayoutSuppressed;
        private final android.view.ViewGroup mParent;
        private final boolean mSuppressLayout;
        private final android.view.View mView;

        DisappearListener(android.view.View r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mCanceled = r0
                r1.mView = r2
                r1.mFinalVisibility = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.mParent = r2
                r1.mSuppressLayout = r4
                r2 = 1
                r1.suppressLayout(r2)
                return
        }

        private void hideViewWhenNotCanceled() {
                r2 = this;
                boolean r0 = r2.mCanceled
                if (r0 != 0) goto L12
                android.view.View r0 = r2.mView
                int r1 = r2.mFinalVisibility
                androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
                android.view.ViewGroup r0 = r2.mParent
                if (r0 == 0) goto L12
                r0.invalidate()
            L12:
                r0 = 0
                r2.suppressLayout(r0)
                return
        }

        private void suppressLayout(boolean r2) {
                r1 = this;
                boolean r0 = r1.mSuppressLayout
                if (r0 == 0) goto L11
                boolean r0 = r1.mLayoutSuppressed
                if (r0 == r2) goto L11
                android.view.ViewGroup r0 = r1.mParent
                if (r0 == 0) goto L11
                r1.mLayoutSuppressed = r2
                androidx.transition.ViewGroupUtils.suppressLayout(r0, r2)
            L11:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.hideViewWhenNotCanceled()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 != 0) goto Lb
                android.view.View r2 = r1.mView
                int r0 = r1.mFinalVisibility
                androidx.transition.ViewUtils.setTransitionVisibility(r2, r0)
            Lb:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.AnimatorUtils.AnimatorPauseListenerCompat
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 != 0) goto La
                android.view.View r2 = r1.mView
                r0 = 0
                androidx.transition.ViewUtils.setTransitionVisibility(r2, r0)
            La:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r1) {
                r0 = this;
                r0.hideViewWhenNotCanceled()
                r1.removeListener(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r1) {
                r0 = this;
                r1 = 0
                r0.suppressLayout(r1)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r1) {
                r0 = this;
                r1 = 1
                r0.suppressLayout(r1)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private static class VisibilityInfo {
        android.view.ViewGroup mEndParent;
        int mEndVisibility;
        boolean mFadeIn;
        android.view.ViewGroup mStartParent;
        int mStartVisibility;
        boolean mVisibilityChange;

        VisibilityInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.transition.Visibility.sTransitionProperties = r0
            return
    }

    public Visibility() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.mMode = r0
            return
    }

    public Visibility(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 3
            r2.mMode = r0
            int[] r0 = androidx.transition.Styleable.VISIBILITY_TRANSITION
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r0 = "transitionVisibilityMode"
            r1 = 0
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r0, r1, r1)
            r3.recycle()
            if (r4 == 0) goto L1d
            r2.setMode(r4)
        L1d:
            return
    }

    private void captureValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r4.view
            int r0 = r0.getVisibility()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.values
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            android.view.View r1 = r4.view
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r0.put(r2, r1)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r1 = r4.view
            r1.getLocationOnScreen(r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.values
            java.lang.String r1 = "android:visibility:screenLocation"
            r4.put(r1, r0)
            return
    }

    private androidx.transition.Visibility.VisibilityInfo getVisibilityChangeInfo(androidx.transition.TransitionValues r8, androidx.transition.TransitionValues r9) {
            r7 = this;
            androidx.transition.Visibility$VisibilityInfo r0 = new androidx.transition.Visibility$VisibilityInfo
            r0.<init>()
            r1 = 0
            r0.mVisibilityChange = r1
            r0.mFadeIn = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.mStartVisibility = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.values
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.mStartParent = r6
            goto L37
        L33:
            r0.mStartVisibility = r4
            r0.mStartParent = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.values
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.values
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.mEndVisibility = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.values
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.mEndParent = r2
            goto L5e
        L5a:
            r0.mEndVisibility = r4
            r0.mEndParent = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L9a
            if (r9 == 0) goto L9a
            int r8 = r0.mStartVisibility
            int r9 = r0.mEndVisibility
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.mStartParent
            android.view.ViewGroup r9 = r0.mEndParent
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.mStartVisibility
            int r9 = r0.mEndVisibility
            if (r8 == r9) goto L88
            int r8 = r0.mStartVisibility
            if (r8 != 0) goto L7f
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
            goto Laf
        L7f:
            int r8 = r0.mEndVisibility
            if (r8 != 0) goto Laf
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto Laf
        L88:
            android.view.ViewGroup r8 = r0.mEndParent
            if (r8 != 0) goto L91
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
            goto Laf
        L91:
            android.view.ViewGroup r8 = r0.mStartParent
            if (r8 != 0) goto Laf
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto Laf
        L9a:
            if (r8 != 0) goto La5
            int r8 = r0.mEndVisibility
            if (r8 != 0) goto La5
            r0.mFadeIn = r2
            r0.mVisibilityChange = r2
            goto Laf
        La5:
            if (r9 != 0) goto Laf
            int r8 = r0.mStartVisibility
            if (r8 != 0) goto Laf
            r0.mFadeIn = r1
            r0.mVisibilityChange = r2
        Laf:
            return r0
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
    public android.animation.Animator createAnimator(android.view.ViewGroup r9, androidx.transition.TransitionValues r10, androidx.transition.TransitionValues r11) {
            r8 = this;
            androidx.transition.Visibility$VisibilityInfo r0 = r8.getVisibilityChangeInfo(r10, r11)
            boolean r1 = r0.mVisibilityChange
            if (r1 == 0) goto L2e
            android.view.ViewGroup r1 = r0.mStartParent
            if (r1 != 0) goto L10
            android.view.ViewGroup r1 = r0.mEndParent
            if (r1 == 0) goto L2e
        L10:
            boolean r1 = r0.mFadeIn
            if (r1 == 0) goto L21
            int r5 = r0.mStartVisibility
            int r7 = r0.mEndVisibility
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            android.animation.Animator r9 = r2.onAppear(r3, r4, r5, r6, r7)
            return r9
        L21:
            int r3 = r0.mStartVisibility
            int r5 = r0.mEndVisibility
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            android.animation.Animator r9 = r0.onDisappear(r1, r2, r3, r4, r5)
            return r9
        L2e:
            r9 = 0
            return r9
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mMode
            return r0
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.Visibility.sTransitionProperties
            return r0
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(androidx.transition.TransitionValues r5, androidx.transition.TransitionValues r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L6
            if (r6 != 0) goto L6
            return r0
        L6:
            if (r5 == 0) goto L1b
            if (r6 == 0) goto L1b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.values
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.values
            boolean r2 = r3.containsKey(r2)
            if (r1 == r2) goto L1b
            return r0
        L1b:
            androidx.transition.Visibility$VisibilityInfo r5 = r4.getVisibilityChangeInfo(r5, r6)
            boolean r6 = r5.mVisibilityChange
            if (r6 == 0) goto L2c
            int r6 = r5.mStartVisibility
            if (r6 == 0) goto L2b
            int r5 = r5.mEndVisibility
            if (r5 != 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    public boolean isVisible(androidx.transition.TransitionValues r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.values
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.values
            java.lang.String r2 = "android:visibility:parent"
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            if (r1 != 0) goto L21
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    public android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.animation.Animator onAppear(android.view.ViewGroup r3, androidx.transition.TransitionValues r4, int r5, androidx.transition.TransitionValues r6, int r7) {
            r2 = this;
            int r5 = r2.mMode
            r7 = 1
            r5 = r5 & r7
            r0 = 0
            if (r5 != r7) goto L2d
            if (r6 != 0) goto La
            goto L2d
        La:
            if (r4 != 0) goto L26
            android.view.View r5 = r6.view
            android.view.ViewParent r5 = r5.getParent()
            android.view.View r5 = (android.view.View) r5
            r7 = 0
            androidx.transition.TransitionValues r1 = r2.getMatchedTransitionValues(r5, r7)
            androidx.transition.TransitionValues r5 = r2.getTransitionValues(r5, r7)
            androidx.transition.Visibility$VisibilityInfo r5 = r2.getVisibilityChangeInfo(r1, r5)
            boolean r5 = r5.mVisibilityChange
            if (r5 == 0) goto L26
            return r0
        L26:
            android.view.View r5 = r6.view
            android.animation.Animator r3 = r2.onAppear(r3, r5, r4, r6)
            return r3
        L2d:
            return r0
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, androidx.transition.TransitionValues r3, androidx.transition.TransitionValues r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.animation.Animator onDisappear(android.view.ViewGroup r11, androidx.transition.TransitionValues r12, int r13, androidx.transition.TransitionValues r14, int r15) {
            r10 = this;
            int r13 = r10.mMode
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L8
            return r1
        L8:
            if (r12 != 0) goto Lb
            return r1
        Lb:
            android.view.View r13 = r12.view
            if (r14 == 0) goto L12
            android.view.View r2 = r14.view
            goto L13
        L12:
            r2 = r1
        L13:
            int r3 = androidx.transition.C0425R.id.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L23
            r2 = r1
            r6 = r5
            goto L89
        L23:
            if (r2 == 0) goto L36
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L2c
            goto L36
        L2c:
            r3 = 4
            if (r15 != r3) goto L30
            goto L32
        L30:
            if (r13 != r2) goto L3b
        L32:
            r3 = r2
            r6 = r4
            r2 = r1
            goto L3e
        L36:
            if (r2 == 0) goto L3b
            r3 = r1
            r6 = r4
            goto L3e
        L3b:
            r2 = r1
            r3 = r2
            r6 = r5
        L3e:
            if (r6 == 0) goto L85
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L47
            goto L81
        L47:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L85
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            androidx.transition.TransitionValues r7 = r10.getTransitionValues(r6, r5)
            androidx.transition.TransitionValues r8 = r10.getMatchedTransitionValues(r6, r5)
            androidx.transition.Visibility$VisibilityInfo r7 = r10.getVisibilityChangeInfo(r7, r8)
            boolean r7 = r7.mVisibilityChange
            if (r7 != 0) goto L6a
            android.view.View r2 = androidx.transition.TransitionUtils.copyViewImage(r11, r13, r6)
            goto L85
        L6a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L85
            r6 = -1
            if (r7 == r6) goto L85
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L85
            boolean r6 = r10.mCanRemoveViews
            if (r6 == 0) goto L85
        L81:
            r2 = r3
            r6 = r4
            r3 = r13
            goto L89
        L85:
            r6 = r4
            r9 = r3
            r3 = r2
            r2 = r9
        L89:
            if (r3 == 0) goto Ldd
            if (r6 != 0) goto Lbf
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.values
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            androidx.transition.ViewGroupOverlayImpl r15 = androidx.transition.ViewGroupUtils.getOverlay(r11)
            r15.add(r3)
        Lbf:
            android.animation.Animator r12 = r10.onDisappear(r11, r3, r12, r14)
            if (r6 != 0) goto Ldc
            if (r12 != 0) goto Lcf
            androidx.transition.ViewGroupOverlayImpl r11 = androidx.transition.ViewGroupUtils.getOverlay(r11)
            r11.remove(r3)
            goto Ldc
        Lcf:
            int r14 = androidx.transition.C0425R.id.save_overlay_view
            r13.setTag(r14, r3)
            androidx.transition.Visibility$1 r14 = new androidx.transition.Visibility$1
            r14.<init>(r10, r11, r3, r13)
            r10.addListener(r14)
        Ldc:
            return r12
        Ldd:
            if (r2 == 0) goto Lff
            int r13 = r2.getVisibility()
            androidx.transition.ViewUtils.setTransitionVisibility(r2, r4)
            android.animation.Animator r11 = r10.onDisappear(r11, r2, r12, r14)
            if (r11 == 0) goto Lfb
            androidx.transition.Visibility$DisappearListener r12 = new androidx.transition.Visibility$DisappearListener
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            androidx.transition.AnimatorUtils.addPauseListener(r11, r12)
            r10.addListener(r12)
            goto Lfe
        Lfb:
            androidx.transition.ViewUtils.setTransitionVisibility(r2, r13)
        Lfe:
            return r11
        Lff:
            return r1
    }

    public void setMode(int r2) {
            r1 = this;
            r0 = r2 & (-4)
            if (r0 != 0) goto L7
            r1.mMode = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only MODE_IN and MODE_OUT flags are allowed"
            r2.<init>(r0)
            throw r2
    }
}
