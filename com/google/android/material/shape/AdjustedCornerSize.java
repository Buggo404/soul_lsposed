package com.google.android.material.shape;

/* loaded from: classes.dex */
public final class AdjustedCornerSize implements com.google.android.material.shape.CornerSize {
    private final float adjustment;
    private final com.google.android.material.shape.CornerSize other;

    public AdjustedCornerSize(float r2, com.google.android.material.shape.CornerSize r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof com.google.android.material.shape.AdjustedCornerSize
            if (r0 == 0) goto L12
            com.google.android.material.shape.AdjustedCornerSize r3 = (com.google.android.material.shape.AdjustedCornerSize) r3
            com.google.android.material.shape.CornerSize r3 = r3.other
            r0 = r3
            com.google.android.material.shape.AdjustedCornerSize r0 = (com.google.android.material.shape.AdjustedCornerSize) r0
            float r0 = r0.adjustment
            float r2 = r2 + r0
            goto L3
        L12:
            r1.other = r3
            r1.adjustment = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.shape.AdjustedCornerSize
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.shape.AdjustedCornerSize r5 = (com.google.android.material.shape.AdjustedCornerSize) r5
            com.google.android.material.shape.CornerSize r1 = r4.other
            com.google.android.material.shape.CornerSize r3 = r5.other
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            float r1 = r4.adjustment
            float r5 = r5.adjustment
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            goto L20
        L1f:
            r0 = r2
        L20:
            return r0
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(android.graphics.RectF r2) {
            r1 = this;
            com.google.android.material.shape.CornerSize r0 = r1.other
            float r2 = r0.getCornerSize(r2)
            float r0 = r1.adjustment
            float r2 = r2 + r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            com.google.android.material.shape.CornerSize r2 = r3.other
            r0[r1] = r2
            float r1 = r3.adjustment
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
