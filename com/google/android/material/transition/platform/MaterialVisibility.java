package com.google.android.material.transition.platform;

import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

/* loaded from: classes.dex */
abstract class MaterialVisibility<P extends com.google.android.material.transition.platform.VisibilityAnimatorProvider> extends android.transition.Visibility {
    private final java.util.List<com.google.android.material.transition.platform.VisibilityAnimatorProvider> additionalAnimatorProviders;
    private final P primaryAnimatorProvider;
    private com.google.android.material.transition.platform.VisibilityAnimatorProvider secondaryAnimatorProvider;

    protected MaterialVisibility(P r2, com.google.android.material.transition.platform.VisibilityAnimatorProvider r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.additionalAnimatorProviders = r0
            r1.primaryAnimatorProvider = r2
            r1.secondaryAnimatorProvider = r3
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r1.setInterpolator(r2)
            return
    }

    private static void addAnimatorIfNeeded(java.util.List<android.animation.Animator> r0, com.google.android.material.transition.platform.VisibilityAnimatorProvider r1, android.view.ViewGroup r2, android.view.View r3, boolean r4) {
            if (r1 != 0) goto L3
            return
        L3:
            if (r4 == 0) goto La
            android.animation.Animator r1 = r1.createAppear(r2, r3)
            goto Le
        La:
            android.animation.Animator r1 = r1.createDisappear(r2, r3)
        Le:
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            return
    }

    private android.animation.Animator createAnimator(android.view.ViewGroup r5, android.view.View r6, boolean r7) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            P extends com.google.android.material.transition.platform.VisibilityAnimatorProvider r2 = r4.primaryAnimatorProvider
            addAnimatorIfNeeded(r1, r2, r5, r6, r7)
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r2 = r4.secondaryAnimatorProvider
            addAnimatorIfNeeded(r1, r2, r5, r6, r7)
            java.util.List<com.google.android.material.transition.platform.VisibilityAnimatorProvider> r2 = r4.additionalAnimatorProviders
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r3 = (com.google.android.material.transition.platform.VisibilityAnimatorProvider) r3
            addAnimatorIfNeeded(r1, r3, r5, r6, r7)
            goto L1a
        L2a:
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r0, r1)
            return r0
    }

    public void addAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r2) {
            r1 = this;
            java.util.List<com.google.android.material.transition.platform.VisibilityAnimatorProvider> r0 = r1.additionalAnimatorProviders
            r0.add(r2)
            return
    }

    public void clearAdditionalAnimatorProvider() {
            r1 = this;
            java.util.List<com.google.android.material.transition.platform.VisibilityAnimatorProvider> r0 = r1.additionalAnimatorProviders
            r0.clear()
            return
    }

    public P getPrimaryAnimatorProvider() {
            r1 = this;
            P extends com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = r1.primaryAnimatorProvider
            return r0
    }

    public com.google.android.material.transition.platform.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = r1.secondaryAnimatorProvider
            return r0
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            r3 = 1
            android.animation.Animator r1 = r0.createAnimator(r1, r2, r3)
            return r1
    }

    @Override // android.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            r3 = 0
            android.animation.Animator r1 = r0.createAnimator(r1, r2, r3)
            return r1
    }

    public boolean removeAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r2) {
            r1 = this;
            java.util.List<com.google.android.material.transition.platform.VisibilityAnimatorProvider> r0 = r1.additionalAnimatorProviders
            boolean r2 = r0.remove(r2)
            return r2
    }

    public void setSecondaryAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            r0.secondaryAnimatorProvider = r1
            return
    }
}
