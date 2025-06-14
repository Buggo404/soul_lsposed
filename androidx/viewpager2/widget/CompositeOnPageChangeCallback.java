package androidx.viewpager2.widget;

/* loaded from: classes.dex */
final class CompositeOnPageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final java.util.List<androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback> mCallbacks;

    CompositeOnPageChangeCallback(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.mCallbacks = r0
            return
    }

    private void throwCallbackListModifiedWhileInUse(java.util.ConcurrentModificationException r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Adding and removing callbacks during dispatch to callbacks is not supported"
            r0.<init>(r1, r3)
            throw r0
    }

    void addOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r2) {
            r1 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback> r0 = r1.mCallbacks
            r0.add(r2)
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int r3) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback> r0 = r2.mCallbacks     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r1 = (androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageScrollStateChanged(r3)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.throwCallbackListModifiedWhileInUse(r3)
        L1a:
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int r3, float r4, int r5) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback> r0 = r2.mCallbacks     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r1 = (androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageScrolled(r3, r4, r5)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.throwCallbackListModifiedWhileInUse(r3)
        L1a:
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int r3) {
            r2 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback> r0 = r2.mCallbacks     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r1 = (androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageSelected(r3)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.throwCallbackListModifiedWhileInUse(r3)
        L1a:
            return
    }

    void removeOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r2) {
            r1 = this;
            java.util.List<androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback> r0 = r1.mCallbacks
            r0.remove(r2)
            return
    }
}
