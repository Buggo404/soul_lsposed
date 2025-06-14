package com.google.android.material.shape;

/* loaded from: classes.dex */
public class CornerTreatment {
    public CornerTreatment() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public void getCornerPath(float r1, float r2, com.google.android.material.shape.ShapePath r3) {
            r0 = this;
            return
    }

    public void getCornerPath(com.google.android.material.shape.ShapePath r1, float r2, float r3, float r4) {
            r0 = this;
            r0.getCornerPath(r2, r3, r1)
            return
    }

    public void getCornerPath(com.google.android.material.shape.ShapePath r1, float r2, float r3, android.graphics.RectF r4, com.google.android.material.shape.CornerSize r5) {
            r0 = this;
            float r4 = r5.getCornerSize(r4)
            r0.getCornerPath(r1, r2, r3, r4)
            return
    }
}
