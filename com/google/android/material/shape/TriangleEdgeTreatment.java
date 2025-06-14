package com.google.android.material.shape;

/* loaded from: classes.dex */
public class TriangleEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            r0.inside = r2
            return
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float r3, float r4, float r5, com.google.android.material.shape.ShapePath r6) {
            r2 = this;
            float r0 = r2.size
            float r0 = r0 * r5
            float r0 = r4 - r0
            r1 = 0
            r6.lineTo(r0, r1)
            boolean r0 = r2.inside
            if (r0 == 0) goto L10
            float r0 = r2.size
            goto L13
        L10:
            float r0 = r2.size
            float r0 = -r0
        L13:
            float r0 = r0 * r5
            r6.lineTo(r4, r0)
            float r0 = r2.size
            float r0 = r0 * r5
            float r4 = r4 + r0
            r6.lineTo(r4, r1)
            r6.lineTo(r3, r1)
            return
    }
}
