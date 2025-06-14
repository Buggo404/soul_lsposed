package com.google.android.material.circularreveal;

/* loaded from: classes.dex */
public final class CircularRevealCompat {


    private CircularRevealCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.animation.Animator createCircularReveal(com.google.android.material.circularreveal.CircularRevealWidget r6, float r7, float r8, float r9) {
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r0 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL
            android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r1 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL
            r2 = 1
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo[] r3 = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo[r2]
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r4 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r4.<init>(r7, r8, r9)
            r5 = 0
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r6, r0, r1, r3)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r6.getRevealInfo()
            if (r1 == 0) goto L33
            float r1 = r1.radius
            android.view.View r6 = (android.view.View) r6
            int r7 = (int) r7
            int r8 = (int) r8
            android.animation.Animator r6 = android.view.ViewAnimationUtils.createCircularReveal(r6, r7, r8, r1, r9)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r8 = 2
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r5] = r0
            r8[r2] = r6
            r7.playTogether(r8)
            return r7
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Caller must set a non-null RevealInfo before calling this."
            r6.<init>(r7)
            throw r6
    }

    public static android.animation.Animator createCircularReveal(com.google.android.material.circularreveal.CircularRevealWidget r7, float r8, float r9, float r10, float r11) {
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r0 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL
            android.animation.TypeEvaluator<com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo> r1 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL
            r2 = 2
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo[] r3 = new com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo[r2]
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r4 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r4.<init>(r8, r9, r10)
            r5 = 0
            r3[r5] = r4
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r4 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r4.<init>(r8, r9, r11)
            r6 = 1
            r3[r6] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r7, r0, r1, r3)
            android.view.View r7 = (android.view.View) r7
            int r8 = (int) r8
            int r9 = (int) r9
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r7, r8, r9, r10, r11)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            android.animation.Animator[] r9 = new android.animation.Animator[r2]
            r9[r5] = r0
            r9[r6] = r7
            r8.playTogether(r9)
            return r8
    }

    public static android.animation.Animator.AnimatorListener createCircularRevealListener(com.google.android.material.circularreveal.CircularRevealWidget r1) {
            com.google.android.material.circularreveal.CircularRevealCompat$1 r0 = new com.google.android.material.circularreveal.CircularRevealCompat$1
            r0.<init>(r1)
            return r0
    }
}
