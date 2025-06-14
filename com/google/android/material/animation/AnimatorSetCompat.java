package com.google.android.material.animation;

/* loaded from: classes.dex */
public class AnimatorSetCompat {
    public AnimatorSetCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void playTogether(android.animation.AnimatorSet r10, java.util.List<android.animation.Animator> r11) {
            int r0 = r11.size()
            r1 = 0
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r0) goto L20
            java.lang.Object r5 = r11.get(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r6 = r6 + r8
            long r1 = java.lang.Math.max(r1, r6)
            int r4 = r4 + 1
            goto L8
        L20:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0034: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r1)
            r11.add(r3, r0)
            r10.playTogether(r11)
            return
    }
}
