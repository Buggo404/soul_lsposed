package androidx.transition;

/* loaded from: classes.dex */
class ViewOverlayApi18 implements androidx.transition.ViewOverlayImpl {
    private final android.view.ViewOverlay mViewOverlay;

    ViewOverlayApi18(android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewOverlay r1 = r1.getOverlay()
            r0.mViewOverlay = r1
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.mViewOverlay
            r0.add(r2)
            return
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.mViewOverlay
            r0.remove(r2)
            return
    }
}
