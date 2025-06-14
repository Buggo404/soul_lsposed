package com.google.android.material.shape;

/* loaded from: classes.dex */
public final class MarkerEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float r2) {
            r1 = this;
            r1.<init>()
            r0 = 981668463(0x3a83126f, float:0.001)
            float r2 = r2 - r0
            r1.radius = r2
            return
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r9, float r10, float r11, com.google.android.material.shape.ShapePath r12) {
            r8 = this;
            float r9 = r8.radius
            double r0 = (double) r9
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.sqrt(r2)
            double r0 = r0 * r4
            double r0 = r0 / r2
            float r9 = (float) r0
            float r11 = r8.radius
            double r0 = (double) r11
            double r0 = java.lang.Math.pow(r0, r2)
            double r4 = (double) r9
            double r4 = java.lang.Math.pow(r4, r2)
            double r0 = r0 - r4
            double r0 = java.lang.Math.sqrt(r0)
            float r11 = (float) r0
            float r0 = r10 - r9
            float r1 = r8.radius
            double r4 = (double) r1
            double r6 = java.lang.Math.sqrt(r2)
            double r4 = r4 * r6
            float r1 = r8.radius
            double r6 = (double) r1
            double r4 = r4 - r6
            double r4 = -r4
            float r1 = (float) r4
            float r1 = r1 + r11
            r12.reset(r0, r1)
            float r0 = r8.radius
            double r0 = (double) r0
            double r4 = java.lang.Math.sqrt(r2)
            double r0 = r0 * r4
            float r4 = r8.radius
            double r4 = (double) r4
            double r0 = r0 - r4
            double r0 = -r0
            float r0 = (float) r0
            r12.lineTo(r10, r0)
            float r10 = r10 + r9
            float r9 = r8.radius
            double r0 = (double) r9
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = r0 * r2
            float r9 = r8.radius
            double r2 = (double) r9
            double r0 = r0 - r2
            double r0 = -r0
            float r9 = (float) r0
            float r9 = r9 + r11
            r12.lineTo(r10, r9)
            return
    }
}
