package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
public final class MaterialArcMotion extends android.transition.PathMotion {
    public MaterialArcMotion() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.PointF getControlPoint(float r1, float r2, float r3, float r4) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r3, r2)
            return r1
        La:
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r1, r4)
            return r2
    }

    @Override // android.transition.PathMotion
    public android.graphics.Path getPath(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r0.moveTo(r2, r3)
            android.graphics.PointF r2 = getControlPoint(r2, r3, r4, r5)
            float r3 = r2.x
            float r2 = r2.y
            r0.quadTo(r3, r2, r4, r5)
            return r0
    }
}
