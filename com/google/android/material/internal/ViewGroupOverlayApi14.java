package com.google.android.material.internal;

/* loaded from: classes.dex */
class ViewGroupOverlayApi14 extends com.google.android.material.internal.ViewOverlayApi14 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    ViewGroupOverlayApi14(android.content.Context r1, android.view.ViewGroup r2, android.view.View r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    static com.google.android.material.internal.ViewGroupOverlayApi14 createFrom(android.view.ViewGroup r0) {
            com.google.android.material.internal.ViewOverlayApi14 r0 = com.google.android.material.internal.ViewOverlayApi14.createFrom(r0)
            com.google.android.material.internal.ViewGroupOverlayApi14 r0 = (com.google.android.material.internal.ViewGroupOverlayApi14) r0
            return r0
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayApi14$OverlayViewGroup r0 = r1.overlayViewGroup
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayApi14$OverlayViewGroup r0 = r1.overlayViewGroup
            r0.remove(r2)
            return
    }
}
