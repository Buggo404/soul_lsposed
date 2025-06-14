package com.google.android.material.appbar;

/* loaded from: classes.dex */
class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = null;

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843848(0x1010448, float:2.369663E-38)
            r0[r1] = r2
            com.google.android.material.appbar.ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS = r0
            return
    }

    ViewUtilsLollipop() {
            r0 = this;
            r0.<init>()
            return
    }

    static void setBoundsViewOutlineProvider(android.view.View r1) {
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r1.setOutlineProvider(r0)
            return
    }

    static void setDefaultAppBarLayoutStateListAnimator(android.view.View r11, float r12) {
            android.content.res.Resources r0 = r11.getResources()
            int r1 = com.google.android.material.C0479R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            android.animation.StateListAnimator r1 = new android.animation.StateListAnimator
            r1.<init>()
            r2 = 3
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 16842766(0x101000e, float:2.3693597E-38)
            r2[r3] = r4
            int r5 = com.google.android.material.C0479R.attr.state_liftable
            r6 = 1
            r2[r6] = r5
            int r5 = com.google.android.material.C0479R.attr.state_lifted
            int r5 = -r5
            r7 = 2
            r2[r7] = r5
            float[] r5 = new float[r6]
            r7 = 0
            r5[r3] = r7
            java.lang.String r8 = "elevation"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r11, r8, r5)
            long r9 = (long) r0
            android.animation.ObjectAnimator r0 = r5.setDuration(r9)
            r1.addState(r2, r0)
            int[] r0 = new int[r6]
            r0[r3] = r4
            float[] r2 = new float[r6]
            r2[r3] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r11, r8, r2)
            android.animation.ObjectAnimator r12 = r12.setDuration(r9)
            r1.addState(r0, r12)
            int[] r12 = new int[r3]
            float[] r0 = new float[r6]
            r0[r3] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r8, r0)
            r2 = 0
            android.animation.ObjectAnimator r0 = r0.setDuration(r2)
            r1.addState(r12, r0)
            r11.setStateListAnimator(r1)
            return
    }

    static void setStateListAnimatorFromAttrs(android.view.View r8, android.util.AttributeSet r9, int r10, int r11) {
            android.content.Context r6 = r8.getContext()
            int[] r2 = com.google.android.material.appbar.ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r6
            r1 = r9
            r3 = r10
            r4 = r11
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            boolean r10 = r9.hasValue(r7)     // Catch: java.lang.Throwable -> L26
            if (r10 == 0) goto L22
            int r10 = r9.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L26
            android.animation.StateListAnimator r10 = android.animation.AnimatorInflater.loadStateListAnimator(r6, r10)     // Catch: java.lang.Throwable -> L26
            r8.setStateListAnimator(r10)     // Catch: java.lang.Throwable -> L26
        L22:
            r9.recycle()
            return
        L26:
            r8 = move-exception
            r9.recycle()
            throw r8
    }
}
