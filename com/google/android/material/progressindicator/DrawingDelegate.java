package com.google.android.material.progressindicator;

import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    protected com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S r1) {
            r0 = this;
            r0.<init>()
            r0.spec = r1
            return
    }

    abstract void adjustCanvas(android.graphics.Canvas r1, float r2);

    abstract void fillIndicator(android.graphics.Canvas r1, android.graphics.Paint r2, float r3, float r4, int r5);

    abstract void fillTrack(android.graphics.Canvas r1, android.graphics.Paint r2);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    protected void registerDrawable(com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange r1) {
            r0 = this;
            r0.drawable = r1
            return
    }

    void validateSpecAndAdjustCanvas(android.graphics.Canvas r2, float r3) {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            r0.validateSpec()
            r1.adjustCanvas(r2, r3)
            return
    }
}
