package com.google.android.material.tabs;

/* loaded from: classes.dex */
class ElasticTabIndicatorInterpolator extends com.google.android.material.tabs.TabIndicatorInterpolator {
    ElasticTabIndicatorInterpolator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float accInterp(float r4) {
            double r0 = (double) r4
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.cos(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            float r4 = (float) r2
            return r4
    }

    private static float decInterp(float r4) {
            double r0 = (double) r4
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.sin(r0)
            float r4 = (float) r0
            return r4
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void setIndicatorBoundsForOffset(com.google.android.material.tabs.TabLayout r3, android.view.View r4, android.view.View r5, float r6, android.graphics.drawable.Drawable r7) {
            r2 = this;
            android.graphics.RectF r4 = calculateIndicatorWidthForTab(r3, r4)
            android.graphics.RectF r3 = calculateIndicatorWidthForTab(r3, r5)
            float r5 = r4.left
            float r0 = r3.left
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = 0
        L13:
            if (r5 == 0) goto L1e
            float r5 = accInterp(r6)
            float r6 = decInterp(r6)
            goto L26
        L1e:
            float r5 = decInterp(r6)
            float r6 = accInterp(r6)
        L26:
            float r0 = r4.left
            int r0 = (int) r0
            float r1 = r3.left
            int r1 = (int) r1
            int r5 = com.google.android.material.animation.AnimationUtils.lerp(r0, r1, r5)
            android.graphics.Rect r0 = r7.getBounds()
            int r0 = r0.top
            float r4 = r4.right
            int r4 = (int) r4
            float r3 = r3.right
            int r3 = (int) r3
            int r3 = com.google.android.material.animation.AnimationUtils.lerp(r4, r3, r6)
            android.graphics.Rect r4 = r7.getBounds()
            int r4 = r4.bottom
            r7.setBounds(r5, r0, r3, r4)
            return
    }
}
