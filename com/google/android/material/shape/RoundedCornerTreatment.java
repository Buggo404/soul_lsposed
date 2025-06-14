package com.google.android.material.shape;

/* loaded from: classes.dex */
public class RoundedCornerTreatment extends com.google.android.material.shape.CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.radius = r0
            return
    }

    @java.lang.Deprecated
    public RoundedCornerTreatment(float r1) {
            r0 = this;
            r0.<init>()
            r0.radius = r1
            return
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(com.google.android.material.shape.ShapePath r12, float r13, float r14, float r15) {
            r11 = this;
            float r0 = r15 * r14
            r1 = 1127481344(0x43340000, float:180.0)
            float r2 = r1 - r13
            r3 = 0
            r12.reset(r3, r0, r1, r2)
            r5 = 0
            r6 = 0
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r0
            float r8 = r15 * r14
            r9 = 1127481344(0x43340000, float:180.0)
            r4 = r12
            r7 = r8
            r10 = r13
            r4.addArc(r5, r6, r7, r8, r9, r10)
            return
    }
}
