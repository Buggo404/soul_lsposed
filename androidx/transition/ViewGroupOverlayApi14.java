package androidx.transition;

/* loaded from: classes.dex */
class ViewGroupOverlayApi14 extends androidx.transition.ViewOverlayApi14 implements androidx.transition.ViewGroupOverlayImpl {
    ViewGroupOverlayApi14(android.content.Context r1, android.view.ViewGroup r2, android.view.View r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    static androidx.transition.ViewGroupOverlayApi14 createFrom(android.view.ViewGroup r0) {
            androidx.transition.ViewOverlayApi14 r0 = androidx.transition.ViewOverlayApi14.createFrom(r0)
            androidx.transition.ViewGroupOverlayApi14 r0 = (androidx.transition.ViewGroupOverlayApi14) r0
            return r0
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(android.view.View r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(android.view.View r2) {
            r1 = this;
            androidx.transition.ViewOverlayApi14$OverlayViewGroup r0 = r1.mOverlayViewGroup
            r0.remove(r2)
            return
    }
}
