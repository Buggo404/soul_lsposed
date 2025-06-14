package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
public final class MaterialSharedAxis extends com.google.android.material.transition.platform.MaterialVisibility<com.google.android.material.transition.platform.VisibilityAnimatorProvider> {

    /* renamed from: X */
    public static final int f120X = 0;

    /* renamed from: Y */
    public static final int f121Y = 1;

    /* renamed from: Z */
    public static final int f122Z = 2;
    private final int axis;
    private final boolean forward;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int r3, boolean r4) {
            r2 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = createPrimaryAnimatorProvider(r3, r4)
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r1 = createSecondaryAnimatorProvider()
            r2.<init>(r0, r1)
            r2.axis = r3
            r2.forward = r4
            return
    }

    private static com.google.android.material.transition.platform.VisibilityAnimatorProvider createPrimaryAnimatorProvider(int r2, boolean r3) {
            if (r2 == 0) goto L30
            r0 = 1
            if (r2 == r0) goto L23
            r0 = 2
            if (r2 != r0) goto Le
            com.google.android.material.transition.platform.ScaleProvider r2 = new com.google.android.material.transition.platform.ScaleProvider
            r2.<init>(r3)
            return r2
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid axis: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L23:
            com.google.android.material.transition.platform.SlideDistanceProvider r2 = new com.google.android.material.transition.platform.SlideDistanceProvider
            if (r3 == 0) goto L2a
            r3 = 80
            goto L2c
        L2a:
            r3 = 48
        L2c:
            r2.<init>(r3)
            return r2
        L30:
            com.google.android.material.transition.platform.SlideDistanceProvider r2 = new com.google.android.material.transition.platform.SlideDistanceProvider
            if (r3 == 0) goto L38
            r3 = 8388613(0x800005, float:1.175495E-38)
            goto L3b
        L38:
            r3 = 8388611(0x800003, float:1.1754948E-38)
        L3b:
            r2.<init>(r3)
            return r2
    }

    private static com.google.android.material.transition.platform.VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
            com.google.android.material.transition.platform.FadeThroughProvider r0 = new com.google.android.material.transition.platform.FadeThroughProvider
            r0.<init>()
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.addAdditionalAnimatorProvider(r1)
            return
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
            r0 = this;
            super.clearAdditionalAnimatorProvider()
            return
    }

    public int getAxis() {
            r1 = this;
            int r0 = r1.axis
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = super.getPrimaryAnimatorProvider()
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ com.google.android.material.transition.platform.VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
            r1 = this;
            com.google.android.material.transition.platform.VisibilityAnimatorProvider r0 = super.getSecondaryAnimatorProvider()
            return r0
    }

    public boolean isForward() {
            r1 = this;
            boolean r0 = r1.forward
            return r0
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onAppear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onAppear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ android.animation.Animator onDisappear(android.view.ViewGroup r1, android.view.View r2, android.transition.TransitionValues r3, android.transition.TransitionValues r4) {
            r0 = this;
            android.animation.Animator r1 = super.onDisappear(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            boolean r1 = super.removeAdditionalAnimatorProvider(r1)
            return r1
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(com.google.android.material.transition.platform.VisibilityAnimatorProvider r1) {
            r0 = this;
            super.setSecondaryAnimatorProvider(r1)
            return
    }
}
