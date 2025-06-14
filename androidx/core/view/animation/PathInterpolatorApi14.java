package androidx.core.view.animation;

/* loaded from: classes.dex */
class PathInterpolatorApi14 implements android.view.animation.Interpolator {
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private final float[] f70mX;

    /* renamed from: mY */
    private final float[] f71mY;

    PathInterpolatorApi14(float r1, float r2) {
            r0 = this;
            android.graphics.Path r1 = createQuad(r1, r2)
            r0.<init>(r1)
            return
    }

    PathInterpolatorApi14(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.graphics.Path r1 = createCubic(r1, r2, r3, r4)
            r0.<init>(r1)
            return
    }

    PathInterpolatorApi14(android.graphics.Path r9) {
            r8 = this;
            r8.<init>()
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r9, r1)
            float r9 = r0.getLength()
            r2 = 990057071(0x3b03126f, float:0.002)
            float r2 = r9 / r2
            int r2 = (int) r2
            r3 = 1
            int r2 = r2 + r3
            float[] r4 = new float[r2]
            r8.f70mX = r4
            float[] r4 = new float[r2]
            r8.f71mY = r4
            r4 = 2
            float[] r4 = new float[r4]
            r5 = r1
        L21:
            if (r5 >= r2) goto L3c
            float r6 = (float) r5
            float r6 = r6 * r9
            int r7 = r2 + (-1)
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 0
            r0.getPosTan(r6, r4, r7)
            float[] r6 = r8.f70mX
            r7 = r4[r1]
            r6[r5] = r7
            float[] r6 = r8.f71mY
            r7 = r4[r3]
            r6[r5] = r7
            int r5 = r5 + 1
            goto L21
        L3c:
            return
    }

    private static android.graphics.Path createCubic(float r8, float r9, float r10, float r11) {
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r0 = 0
            r7.moveTo(r0, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.graphics.Path createQuad(float r2, float r3) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r0.moveTo(r1, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.quadTo(r2, r3, r1, r1)
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r7) {
            r6 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 > 0) goto L6
            return r0
        L6:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 < 0) goto Ld
            return r1
        Ld:
            float[] r1 = r6.f70mX
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
        L13:
            int r4 = r1 - r3
            if (r4 <= r2) goto L27
            int r4 = r3 + r1
            int r4 = r4 / 2
            float[] r5 = r6.f70mX
            r5 = r5[r4]
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L25
            r1 = r4
            goto L13
        L25:
            r3 = r4
            goto L13
        L27:
            float[] r2 = r6.f70mX
            r4 = r2[r1]
            r2 = r2[r3]
            float r4 = r4 - r2
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L37
            float[] r7 = r6.f71mY
            r7 = r7[r3]
            return r7
        L37:
            float r7 = r7 - r2
            float r7 = r7 / r4
            float[] r0 = r6.f71mY
            r2 = r0[r3]
            r0 = r0[r1]
            float r0 = r0 - r2
            float r7 = r7 * r0
            float r2 = r2 + r7
            return r2
    }
}
