package com.google.android.material.animation;

/* loaded from: classes.dex */
public class AnimationUtils {
    public static final android.animation.TimeInterpolator DECELERATE_INTERPOLATOR = null;
    public static final android.animation.TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = null;
    public static final android.animation.TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = null;
    public static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    public static final android.animation.TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = null;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR = r0
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r0 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r0.<init>()
            com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR = r0
            androidx.interpolator.view.animation.FastOutLinearInInterpolator r0 = new androidx.interpolator.view.animation.FastOutLinearInInterpolator
            r0.<init>()
            com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR = r0
            androidx.interpolator.view.animation.LinearOutSlowInInterpolator r0 = new androidx.interpolator.view.animation.LinearOutSlowInInterpolator
            r0.<init>()
            com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR = r0
            return
    }

    public AnimationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float lerp(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r0 = r0 + r2
            return r0
    }

    public static float lerp(float r1, float r2, float r3, float r4, float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto La
            return r2
        La:
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = lerp(r1, r2, r5)
            return r1
    }

    public static int lerp(int r0, int r1, float r2) {
            int r1 = r1 - r0
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            int r0 = r0 + r1
            return r0
    }
}
