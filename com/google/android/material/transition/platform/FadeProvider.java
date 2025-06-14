package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
public final class FadeProvider implements com.google.android.material.transition.platform.VisibilityAnimatorProvider {
    private float incomingEndThreshold;



    public FadeProvider() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.incomingEndThreshold = r0
            return
    }

    private static android.animation.Animator createFadeAnimator(android.view.View r8, float r9, float r10, float r11, float r12, float r13) {
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            com.google.android.material.transition.platform.FadeProvider$1 r7 = new com.google.android.material.transition.platform.FadeProvider$1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.addUpdateListener(r7)
            com.google.android.material.transition.platform.FadeProvider$2 r9 = new com.google.android.material.transition.platform.FadeProvider$2
            r9.<init>(r8, r13)
            r0.addListener(r9)
            return r0
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public android.animation.Animator createAppear(android.view.ViewGroup r7, android.view.View r8) {
            r6 = this;
            float r7 = r8.getAlpha()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto Lc
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L10
        Lc:
            float r7 = r8.getAlpha()
        L10:
            r5 = r7
            r1 = 0
            r3 = 0
            float r4 = r6.incomingEndThreshold
            r0 = r8
            r2 = r5
            android.animation.Animator r7 = createFadeAnimator(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public android.animation.Animator createDisappear(android.view.ViewGroup r7, android.view.View r8) {
            r6 = this;
            float r7 = r8.getAlpha()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 != 0) goto Lc
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L10
        Lc:
            float r7 = r8.getAlpha()
        L10:
            r5 = r7
            r2 = 0
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r8
            r1 = r5
            android.animation.Animator r7 = createFadeAnimator(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public float getIncomingEndThreshold() {
            r1 = this;
            float r0 = r1.incomingEndThreshold
            return r0
    }

    public void setIncomingEndThreshold(float r1) {
            r0 = this;
            r0.incomingEndThreshold = r1
            return
    }
}
