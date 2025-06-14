package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class LinearCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    private static final java.lang.String TAG = "LinearCurveFit";
    private boolean mExtrapolate;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f28mT;
    private double mTotalLength;

    /* renamed from: mY */
    private double[][] f29mY;

    public LinearCurveFit(double[] r12, double[][] r13) {
            r11 = this;
            r11.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r11.mTotalLength = r0
            r0 = 1
            r11.mExtrapolate = r0
            int r0 = r12.length
            r0 = 0
            r1 = r13[r0]
            int r1 = r1.length
            double[] r2 = new double[r1]
            r11.mSlopeTemp = r2
            r11.f28mT = r12
            r11.f29mY = r13
            r2 = 2
            if (r1 <= r2) goto L35
            r1 = 0
            r3 = r0
            r4 = r1
        L1e:
            r6 = r4
            int r8 = r12.length
            if (r3 >= r8) goto L33
            r8 = r13[r3]
            r9 = r8[r0]
            if (r3 <= 0) goto L2f
            double r4 = r9 - r4
            double r6 = r9 - r6
            java.lang.Math.hypot(r4, r6)
        L2f:
            int r3 = r3 + 1
            r4 = r9
            goto L1e
        L33:
            r11.mTotalLength = r1
        L35:
            return
    }

    private double getLength2D(double r23) {
            r22 = this;
            r0 = r22
            double r1 = r0.mTotalLength
            boolean r1 = java.lang.Double.isNaN(r1)
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            double[] r1 = r0.f28mT
            int r4 = r1.length
            r5 = 0
            r6 = r1[r5]
            int r6 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r6 > 0) goto L18
            return r2
        L18:
            r6 = 1
            int r4 = r4 - r6
            r7 = r1[r4]
            int r1 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            if (r1 < 0) goto L23
            double r1 = r0.mTotalLength
            return r1
        L23:
            r7 = r2
            r9 = r7
            r11 = r9
            r1 = r5
        L27:
            if (r1 >= r4) goto L7c
            double[][] r13 = r0.f29mY
            r13 = r13[r1]
            r14 = r13[r5]
            r16 = r13[r6]
            if (r1 <= 0) goto L3c
            double r9 = r14 - r9
            double r11 = r16 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r7 = r7 + r9
        L3c:
            double[] r9 = r0.f28mT
            r10 = r9[r1]
            int r12 = (r23 > r10 ? 1 : (r23 == r10 ? 0 : -1))
            if (r12 != 0) goto L45
            return r7
        L45:
            int r12 = r1 + 1
            r18 = r9[r12]
            int r9 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r9 >= 0) goto L77
            double r18 = r18 - r10
            double r2 = r23 - r10
            double r2 = r2 / r18
            double[][] r4 = r0.f29mY
            r1 = r4[r1]
            r9 = r1[r5]
            r4 = r4[r12]
            r11 = r4[r5]
            r18 = r1[r6]
            r5 = r4[r6]
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r20 = r20 - r2
            double r18 = r18 * r20
            double r5 = r5 * r2
            double r18 = r18 + r5
            double r4 = r16 - r18
            double r9 = r9 * r20
            double r11 = r11 * r2
            double r9 = r9 + r11
            double r14 = r14 - r9
            double r1 = java.lang.Math.hypot(r4, r14)
            double r7 = r7 + r1
            return r7
        L77:
            r1 = r12
            r9 = r14
            r11 = r16
            goto L27
        L7c:
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r9, int r11) {
            r8 = this;
            double[] r0 = r8.f28mT
            int r1 = r0.length
            boolean r2 = r8.mExtrapolate
            r3 = 0
            if (r2 == 0) goto L30
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L1c
            double[][] r0 = r8.f29mY
            r0 = r0[r3]
            r1 = r0[r11]
            double r9 = r9 - r4
            double r3 = r8.getSlope(r4, r11)
        L19:
            double r9 = r9 * r3
            double r1 = r1 + r9
            return r1
        L1c:
            int r2 = r1 + (-1)
            r4 = r0[r2]
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L4c
            double[][] r0 = r8.f29mY
            r0 = r0[r2]
            r1 = r0[r11]
            double r9 = r9 - r4
            double r3 = r8.getSlope(r4, r11)
            goto L19
        L30:
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L3d
            double[][] r9 = r8.f29mY
            r9 = r9[r3]
            r10 = r9[r11]
            return r10
        L3d:
            int r2 = r1 + (-1)
            r4 = r0[r2]
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L4c
            double[][] r9 = r8.f29mY
            r9 = r9[r2]
            r10 = r9[r11]
            return r10
        L4c:
            int r0 = r1 + (-1)
            if (r3 >= r0) goto L7d
            double[] r0 = r8.f28mT
            r4 = r0[r3]
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L5f
            double[][] r9 = r8.f29mY
            r9 = r9[r3]
            r10 = r9[r11]
            return r10
        L5f:
            int r2 = r3 + 1
            r6 = r0[r2]
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L7b
            double r6 = r6 - r4
            double r9 = r9 - r4
            double r9 = r9 / r6
            double[][] r0 = r8.f29mY
            r1 = r0[r3]
            r3 = r1[r11]
            r0 = r0[r2]
            r1 = r0[r11]
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 - r9
            double r3 = r3 * r5
            double r1 = r1 * r9
            double r3 = r3 + r1
            return r3
        L7b:
            r3 = r2
            goto L4c
        L7d:
            r9 = 0
            return r9
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.f28mT
            int r1 = r0.length
            double[][] r2 = r12.f29mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            boolean r4 = r12.mExtrapolate
            if (r4 == 0) goto L5a
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r4, r0)
            r0 = r3
        L19:
            if (r0 >= r2) goto L32
            double[][] r1 = r12.f29mY
            r1 = r1[r3]
            r4 = r1[r0]
            double[] r1 = r12.f28mT
            r6 = r1[r3]
            double r6 = r13 - r6
            double[] r1 = r12.mSlopeTemp
            r8 = r1[r0]
            double r6 = r6 * r8
            double r4 = r4 + r6
            r15[r0] = r4
            int r0 = r0 + 1
            goto L19
        L32:
            return
        L33:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L85
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r5, r0)
        L40:
            if (r3 >= r2) goto L59
            double[][] r0 = r12.f29mY
            r0 = r0[r4]
            r5 = r0[r3]
            double[] r0 = r12.f28mT
            r7 = r0[r4]
            double r0 = r13 - r7
            double[] r7 = r12.mSlopeTemp
            r8 = r7[r3]
            double r0 = r0 * r8
            double r5 = r5 + r0
            r15[r3] = r5
            int r3 = r3 + 1
            goto L40
        L59:
            return
        L5a:
            r4 = r0[r3]
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 > 0) goto L6f
            r13 = r3
        L61:
            if (r13 >= r2) goto L6e
            double[][] r14 = r12.f29mY
            r14 = r14[r3]
            r0 = r14[r13]
            r15[r13] = r0
            int r13 = r13 + 1
            goto L61
        L6e:
            return
        L6f:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L85
        L77:
            if (r3 >= r2) goto L84
            double[][] r13 = r12.f29mY
            r13 = r13[r4]
            r0 = r13[r3]
            r15[r3] = r0
            int r3 = r3 + 1
            goto L77
        L84:
            return
        L85:
            r0 = r3
        L86:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto Lc9
            double[] r4 = r12.f28mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto La0
            r4 = r3
        L93:
            if (r4 >= r2) goto La0
            double[][] r5 = r12.f29mY
            r5 = r5[r0]
            r6 = r5[r4]
            r15[r4] = r6
            int r4 = r4 + 1
            goto L93
        La0:
            double[] r4 = r12.f28mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lc7
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        Laf:
            if (r3 >= r2) goto Lc6
            double[][] r1 = r12.f29mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            r15[r3] = r6
            int r3 = r3 + 1
            goto Laf
        Lc6:
            return
        Lc7:
            r0 = r5
            goto L86
        Lc9:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r13, float[] r15) {
            r12 = this;
            double[] r0 = r12.f28mT
            int r1 = r0.length
            double[][] r2 = r12.f29mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            boolean r4 = r12.mExtrapolate
            if (r4 == 0) goto L5c
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L34
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r4, r0)
            r0 = r3
        L19:
            if (r0 >= r2) goto L33
            double[][] r1 = r12.f29mY
            r1 = r1[r3]
            r4 = r1[r0]
            double[] r1 = r12.f28mT
            r6 = r1[r3]
            double r6 = r13 - r6
            double[] r1 = r12.mSlopeTemp
            r8 = r1[r0]
            double r6 = r6 * r8
            double r4 = r4 + r6
            float r1 = (float) r4
            r15[r0] = r1
            int r0 = r0 + 1
            goto L19
        L33:
            return
        L34:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L89
            double[] r0 = r12.mSlopeTemp
            r12.getSlope(r5, r0)
        L41:
            if (r3 >= r2) goto L5b
            double[][] r0 = r12.f29mY
            r0 = r0[r4]
            r5 = r0[r3]
            double[] r0 = r12.f28mT
            r7 = r0[r4]
            double r0 = r13 - r7
            double[] r7 = r12.mSlopeTemp
            r8 = r7[r3]
            double r0 = r0 * r8
            double r5 = r5 + r0
            float r0 = (float) r5
            r15[r3] = r0
            int r3 = r3 + 1
            goto L41
        L5b:
            return
        L5c:
            r4 = r0[r3]
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 > 0) goto L72
            r13 = r3
        L63:
            if (r13 >= r2) goto L71
            double[][] r14 = r12.f29mY
            r14 = r14[r3]
            r0 = r14[r13]
            float r14 = (float) r0
            r15[r13] = r14
            int r13 = r13 + 1
            goto L63
        L71:
            return
        L72:
            int r4 = r1 + (-1)
            r5 = r0[r4]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 < 0) goto L89
        L7a:
            if (r3 >= r2) goto L88
            double[][] r13 = r12.f29mY
            r13 = r13[r4]
            r0 = r13[r3]
            float r13 = (float) r0
            r15[r3] = r13
            int r3 = r3 + 1
            goto L7a
        L88:
            return
        L89:
            r0 = r3
        L8a:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto Lcf
            double[] r4 = r12.f28mT
            r5 = r4[r0]
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto La5
            r4 = r3
        L97:
            if (r4 >= r2) goto La5
            double[][] r5 = r12.f29mY
            r5 = r5[r0]
            r6 = r5[r4]
            float r5 = (float) r6
            r15[r4] = r5
            int r4 = r4 + 1
            goto L97
        La5:
            double[] r4 = r12.f28mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lcd
            r8 = r4[r0]
            double r6 = r6 - r8
            double r13 = r13 - r8
            double r13 = r13 / r6
        Lb4:
            if (r3 >= r2) goto Lcc
            double[][] r1 = r12.f29mY
            r4 = r1[r0]
            r6 = r4[r3]
            r1 = r1[r5]
            r8 = r1[r3]
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r13
            double r6 = r6 * r10
            double r8 = r8 * r13
            double r6 = r6 + r8
            float r1 = (float) r6
            r15[r3] = r1
            int r3 = r3 + 1
            goto Lb4
        Lcc:
            return
        Lcd:
            r0 = r5
            goto L8a
        Lcf:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r8, int r10) {
            r7 = this;
            double[] r0 = r7.f28mT
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f28mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f29mY
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r13, double[] r15) {
            r12 = this;
            double[] r0 = r12.f28mT
            int r1 = r0.length
            double[][] r2 = r12.f29mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r12.f28mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r13 = r4[r0]
            double r6 = r6 - r13
        L2c:
            if (r3 >= r2) goto L41
            double[][] r13 = r12.f29mY
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.f28mT
            return r0
    }
}
