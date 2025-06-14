package com.google.android.material.transition;

/* loaded from: classes.dex */
public final class SlideDistanceProvider implements com.google.android.material.transition.VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance;
    private int slideEdge;



    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.slideDistance = r0
            r1.slideEdge = r2
            return
    }

    private static android.animation.Animator createTranslationAppearAnimator(android.view.View r3, android.view.View r4, int r5, int r6) {
            float r0 = r4.getTranslationX()
            float r1 = r4.getTranslationY()
            r2 = 3
            if (r5 == r2) goto L6e
            r2 = 5
            if (r5 == r2) goto L66
            r2 = 48
            if (r5 == r2) goto L5e
            r2 = 80
            if (r5 == r2) goto L57
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r1) goto L46
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r1) goto L31
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L2a
            float r3 = (float) r6
            float r3 = r0 - r3
            goto L2c
        L2a:
            float r3 = (float) r6
            float r3 = r3 + r0
        L2c:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid slide direction: "
            r4.<init>(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L46:
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L4f
            float r3 = (float) r6
            float r3 = r3 + r0
            goto L52
        L4f:
            float r3 = (float) r6
            float r3 = r0 - r3
        L52:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L57:
            float r3 = (float) r6
            float r3 = r3 + r1
            android.animation.Animator r3 = createTranslationYAnimator(r4, r3, r1, r1)
            return r3
        L5e:
            float r3 = (float) r6
            float r3 = r1 - r3
            android.animation.Animator r3 = createTranslationYAnimator(r4, r3, r1, r1)
            return r3
        L66:
            float r3 = (float) r6
            float r3 = r0 - r3
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
        L6e:
            float r3 = (float) r6
            float r3 = r3 + r0
            android.animation.Animator r3 = createTranslationXAnimator(r4, r3, r0, r0)
            return r3
    }

    private static android.animation.Animator createTranslationDisappearAnimator(android.view.View r3, android.view.View r4, int r5, int r6) {
            float r0 = r4.getTranslationX()
            float r1 = r4.getTranslationY()
            r2 = 3
            if (r5 == r2) goto L6d
            r2 = 5
            if (r5 == r2) goto L66
            r2 = 48
            if (r5 == r2) goto L5f
            r2 = 80
            if (r5 == r2) goto L57
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r1) goto L46
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r1) goto L31
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L29
            float r3 = (float) r6
            float r3 = r3 + r0
            goto L2c
        L29:
            float r3 = (float) r6
            float r3 = r0 - r3
        L2c:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid slide direction: "
            r4.<init>(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L46:
            boolean r3 = isRtl(r3)
            if (r3 == 0) goto L50
            float r3 = (float) r6
            float r3 = r0 - r3
            goto L52
        L50:
            float r3 = (float) r6
            float r3 = r3 + r0
        L52:
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L57:
            float r3 = (float) r6
            float r3 = r1 - r3
            android.animation.Animator r3 = createTranslationYAnimator(r4, r1, r3, r1)
            return r3
        L5f:
            float r3 = (float) r6
            float r3 = r3 + r1
            android.animation.Animator r3 = createTranslationYAnimator(r4, r1, r3, r1)
            return r3
        L66:
            float r3 = (float) r6
            float r3 = r3 + r0
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
        L6d:
            float r3 = (float) r6
            float r3 = r0 - r3
            android.animation.Animator r3 = createTranslationXAnimator(r4, r0, r3, r0)
            return r3
    }

    private static android.animation.Animator createTranslationXAnimator(android.view.View r5, float r6, float r7, float r8) {
            r0 = 1
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r0]
            android.util.Property r2 = android.view.View.TRANSLATION_X
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r6
            r3[r0] = r7
            android.animation.PropertyValuesHolder r6 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            r1[r4] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r5, r1)
            com.google.android.material.transition.SlideDistanceProvider$1 r7 = new com.google.android.material.transition.SlideDistanceProvider$1
            r7.<init>(r5, r8)
            r6.addListener(r7)
            return r6
    }

    private static android.animation.Animator createTranslationYAnimator(android.view.View r5, float r6, float r7, float r8) {
            r0 = 1
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r0]
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r6
            r3[r0] = r7
            android.animation.PropertyValuesHolder r6 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            r1[r4] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r5, r1)
            com.google.android.material.transition.SlideDistanceProvider$2 r7 = new com.google.android.material.transition.SlideDistanceProvider$2
            r7.<init>(r5, r8)
            r6.addListener(r7)
            return r6
    }

    private int getSlideDistanceOrDefault(android.content.Context r3) {
            r2 = this;
            int r0 = r2.slideDistance
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            android.content.res.Resources r3 = r3.getResources()
            int r0 = com.google.android.material.C0479R.dimen.mtrl_transition_shared_axis_slide_distance
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    private static boolean isRtl(android.view.View r1) {
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public android.animation.Animator createAppear(android.view.ViewGroup r3, android.view.View r4) {
            r2 = this;
            int r0 = r2.slideEdge
            android.content.Context r1 = r4.getContext()
            int r1 = r2.getSlideDistanceOrDefault(r1)
            android.animation.Animator r3 = createTranslationAppearAnimator(r3, r4, r0, r1)
            return r3
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    public android.animation.Animator createDisappear(android.view.ViewGroup r3, android.view.View r4) {
            r2 = this;
            int r0 = r2.slideEdge
            android.content.Context r1 = r4.getContext()
            int r1 = r2.getSlideDistanceOrDefault(r1)
            android.animation.Animator r3 = createTranslationDisappearAnimator(r3, r4, r0, r1)
            return r3
    }

    public int getSlideDistance() {
            r1 = this;
            int r0 = r1.slideDistance
            return r0
    }

    public int getSlideEdge() {
            r1 = this;
            int r0 = r1.slideEdge
            return r0
    }

    public void setSlideDistance(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.slideDistance = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead."
            r2.<init>(r0)
            throw r2
    }

    public void setSlideEdge(int r1) {
            r0 = this;
            r0.slideEdge = r1
            return
    }
}
