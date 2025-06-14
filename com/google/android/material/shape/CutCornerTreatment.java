package com.google.android.material.shape;

/* loaded from: classes.dex */
public class CutCornerTreatment extends com.google.android.material.shape.CornerTreatment {
    float size;

    public CutCornerTreatment() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.size = r0
            return
    }

    @java.lang.Deprecated
    public CutCornerTreatment(float r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            return
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(com.google.android.material.shape.ShapePath r7, float r8, float r9, float r10) {
            r6 = this;
            float r0 = r10 * r9
            r1 = 1127481344(0x43340000, float:180.0)
            float r2 = r1 - r8
            r3 = 0
            r7.reset(r3, r0, r1, r2)
            double r0 = (double) r8
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r2 = (double) r10
            double r0 = r0 * r2
            double r9 = (double) r9
            double r0 = r0 * r9
            float r0 = (float) r0
            r1 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 - r8
            double r4 = (double) r1
            double r4 = java.lang.Math.toRadians(r4)
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r2
            double r4 = r4 * r9
            float r8 = (float) r4
            r7.lineTo(r0, r8)
            return
    }
}
