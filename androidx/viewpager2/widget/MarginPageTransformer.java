package androidx.viewpager2.widget;

/* loaded from: classes.dex */
public final class MarginPageTransformer implements androidx.viewpager2.widget.ViewPager2.PageTransformer {
    private final int mMarginPx;

    public MarginPageTransformer(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Margin must be non-negative"
            androidx.core.util.Preconditions.checkArgumentNonnegative(r2, r0)
            r1.mMarginPx = r2
            return
    }

    private androidx.viewpager2.widget.ViewPager2 requireViewPager(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewParent r0 = r2.getParent()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L13
            boolean r2 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r2 == 0) goto L13
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            return r0
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the page view to be managed by a ViewPager2 instance."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(android.view.View r3, float r4) {
            r2 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r2.requireViewPager(r3)
            int r1 = r2.mMarginPx
            float r1 = (float) r1
            float r1 = r1 * r4
            int r4 = r0.getOrientation()
            if (r4 != 0) goto L19
            boolean r4 = r0.isRtl()
            if (r4 == 0) goto L15
            float r1 = -r1
        L15:
            r3.setTranslationX(r1)
            goto L1c
        L19:
            r3.setTranslationY(r1)
        L1c:
            return
    }
}
