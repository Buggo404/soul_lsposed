package com.google.android.material.tabs;

/* loaded from: classes.dex */
class TabIndicatorInterpolator {
    private static final int MIN_INDICATOR_WIDTH = 24;

    TabIndicatorInterpolator() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.graphics.RectF calculateIndicatorWidthForTab(com.google.android.material.tabs.TabLayout r3, android.view.View r4) {
            if (r4 != 0) goto L8
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            return r3
        L8:
            boolean r3 = r3.isTabIndicatorFullWidth()
            if (r3 != 0) goto L1b
            boolean r3 = r4 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r3 == 0) goto L1b
            com.google.android.material.tabs.TabLayout$TabView r4 = (com.google.android.material.tabs.TabLayout.TabView) r4
            r3 = 24
            android.graphics.RectF r3 = calculateTabViewContentBounds(r4, r3)
            return r3
        L1b:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r3.<init>(r0, r1, r2, r4)
            return r3
    }

    static android.graphics.RectF calculateTabViewContentBounds(com.google.android.material.tabs.TabLayout.TabView r3, int r4) {
            int r0 = r3.getContentWidth()
            int r1 = r3.getContentHeight()
            android.content.Context r2 = r3.getContext()
            float r4 = com.google.android.material.internal.ViewUtils.dpToPx(r2, r4)
            int r4 = (int) r4
            if (r0 >= r4) goto L14
            r0 = r4
        L14:
            int r4 = r3.getLeft()
            int r2 = r3.getRight()
            int r4 = r4 + r2
            int r4 = r4 / 2
            int r2 = r3.getTop()
            int r3 = r3.getBottom()
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r0 = r0 / 2
            int r3 = r4 - r0
            int r1 = r1 / 2
            int r1 = r2 - r1
            int r0 = r0 + r4
            int r4 = r4 / 2
            int r2 = r2 + r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            r4.<init>(r3, r1, r0, r2)
            return r4
    }

    void setIndicatorBoundsForOffset(com.google.android.material.tabs.TabLayout r2, android.view.View r3, android.view.View r4, float r5, android.graphics.drawable.Drawable r6) {
            r1 = this;
            android.graphics.RectF r3 = calculateIndicatorWidthForTab(r2, r3)
            android.graphics.RectF r2 = calculateIndicatorWidthForTab(r2, r4)
            float r4 = r3.left
            int r4 = (int) r4
            float r0 = r2.left
            int r0 = (int) r0
            int r4 = com.google.android.material.animation.AnimationUtils.lerp(r4, r0, r5)
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.top
            float r3 = r3.right
            int r3 = (int) r3
            float r2 = r2.right
            int r2 = (int) r2
            int r2 = com.google.android.material.animation.AnimationUtils.lerp(r3, r2, r5)
            android.graphics.Rect r3 = r6.getBounds()
            int r3 = r3.bottom
            r6.setBounds(r4, r0, r2, r3)
            return
    }

    void setIndicatorBoundsForTab(com.google.android.material.tabs.TabLayout r3, android.view.View r4, android.graphics.drawable.Drawable r5) {
            r2 = this;
            android.graphics.RectF r3 = calculateIndicatorWidthForTab(r3, r4)
            float r4 = r3.left
            int r4 = (int) r4
            android.graphics.Rect r0 = r5.getBounds()
            int r0 = r0.top
            float r3 = r3.right
            int r3 = (int) r3
            android.graphics.Rect r1 = r5.getBounds()
            int r1 = r1.bottom
            r5.setBounds(r4, r0, r3, r1)
            return
    }
}
