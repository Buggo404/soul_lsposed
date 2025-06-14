package com.google.android.material.shape;

/* loaded from: classes.dex */
public class EdgeTreatment {
    public EdgeTreatment() {
            r0 = this;
            r0.<init>()
            return
    }

    boolean forceIntersection() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void getEdgePath(float r1, float r2, float r3, com.google.android.material.shape.ShapePath r4) {
            r0 = this;
            r2 = 0
            r4.lineTo(r1, r2)
            return
    }

    @java.lang.Deprecated
    public void getEdgePath(float r2, float r3, com.google.android.material.shape.ShapePath r4) {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            r1.getEdgePath(r2, r0, r3, r4)
            return
    }
}
