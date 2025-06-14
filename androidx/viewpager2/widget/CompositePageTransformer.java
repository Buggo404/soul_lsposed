package androidx.viewpager2.widget;

/* loaded from: classes.dex */
public final class CompositePageTransformer implements androidx.viewpager2.widget.ViewPager2.PageTransformer {
    private final java.util.List<androidx.viewpager2.widget.ViewPager2.PageTransformer> mTransformers;

    public CompositePageTransformer() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransformers = r0
            return
    }

    public void addTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer r2) {
            r1 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$PageTransformer> r0 = r1.mTransformers
            r0.add(r2)
            return
    }

    public void removeTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer r2) {
            r1 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$PageTransformer> r0 = r1.mTransformers
            r0.remove(r2)
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(android.view.View r3, float r4) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$PageTransformer> r0 = r2.mTransformers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.viewpager2.widget.ViewPager2$PageTransformer r1 = (androidx.viewpager2.widget.ViewPager2.PageTransformer) r1
            r1.transformPage(r3, r4)
            goto L6
        L16:
            return
    }
}
