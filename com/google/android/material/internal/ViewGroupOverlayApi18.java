package com.google.android.material.internal;

/* loaded from: classes.dex */
class ViewGroupOverlayApi18 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay viewGroupOverlay;

    ViewGroupOverlayApi18(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r0.viewGroupOverlay = r1
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }
}
