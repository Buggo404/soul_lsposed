package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
class AnimatorTracker {
    private android.animation.Animator currentAnimator;

    AnimatorTracker() {
            r0 = this;
            r0.<init>()
            return
    }

    public void cancelCurrent() {
            r1 = this;
            android.animation.Animator r0 = r1.currentAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.currentAnimator = r0
            return
    }

    public void onNextAnimationStart(android.animation.Animator r1) {
            r0 = this;
            r0.cancelCurrent()
            r0.currentAnimator = r1
            return
    }
}
