package com.google.android.material.progressindicator;

import android.animation.Animator;

/* loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends android.animation.Animator> {
    protected com.google.android.material.progressindicator.IndeterminateDrawable drawable;
    protected final int[] segmentColors;
    protected final float[] segmentPositions;

    protected IndeterminateAnimatorDelegate(int r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2 * 2
            float[] r0 = new float[r0]
            r1.segmentPositions = r0
            int[] r2 = new int[r2]
            r1.segmentColors = r2
            return
    }

    abstract void cancelAnimatorImmediately();

    protected float getFractionInRange(int r1, int r2, int r3) {
            r0 = this;
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = (float) r3
            float r1 = r1 / r2
            return r1
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r1);

    protected void registerDrawable(com.google.android.material.progressindicator.IndeterminateDrawable r1) {
            r0 = this;
            r0.drawable = r1
            return
    }

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
