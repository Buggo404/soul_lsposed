package androidx.interpolator.view.animation;

/* loaded from: classes.dex */
abstract class LookupTableInterpolator implements android.view.animation.Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    protected LookupTableInterpolator(float[] r2) {
            r1 = this;
            r1.<init>()
            r1.mValues = r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            float r2 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            r1.mStepSize = r0
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            return r0
        L7:
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Ld
            return r0
        Ld:
            float[] r0 = r3.mValues
            int r1 = r0.length
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = (int) r1
            int r0 = r0.length
            int r0 = r0 + (-2)
            int r0 = java.lang.Math.min(r1, r0)
            float r1 = (float) r0
            float r2 = r3.mStepSize
            float r1 = r1 * r2
            float r4 = r4 - r1
            float r4 = r4 / r2
            float[] r1 = r3.mValues
            r2 = r1[r0]
            int r0 = r0 + 1
            r0 = r1[r0]
            float r0 = r0 - r2
            float r4 = r4 * r0
            float r2 = r2 + r4
            return r2
    }
}
