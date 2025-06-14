package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class HyperSpline {
    double[][] mCtl;
    androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    public static class Cubic {

        /* renamed from: mA */
        double f24mA;

        /* renamed from: mB */
        double f25mB;

        /* renamed from: mC */
        double f26mC;

        /* renamed from: mD */
        double f27mD;

        public Cubic(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.<init>()
                r0.f24mA = r1
                r0.f25mB = r3
                r0.f26mC = r5
                r0.f27mD = r7
                return
        }

        public double eval(double r5) {
                r4 = this;
                double r0 = r4.f27mD
                double r0 = r0 * r5
                double r2 = r4.f26mC
                double r0 = r0 + r2
                double r0 = r0 * r5
                double r2 = r4.f25mB
                double r0 = r0 + r2
                double r0 = r0 * r5
                double r5 = r4.f24mA
                double r0 = r0 + r5
                return r0
        }

        public double vel(double r7) {
                r6 = this;
                double r0 = r6.f27mD
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r6.f26mC
                r4 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r2 = r2 * r4
                double r0 = r0 + r2
                double r0 = r0 * r7
                double r7 = r6.f25mB
                double r0 = r0 + r7
                return r0
        }
    }

    public HyperSpline() {
            r0 = this;
            r0.<init>()
            return
    }

    public HyperSpline(double[][] r1) {
            r0 = this;
            r0.<init>()
            r0.setup(r1)
            return
    }

    static androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] calcNaturalCubic(int r24, double[] r25) {
            r0 = r24
            double[] r1 = new double[r0]
            double[] r2 = new double[r0]
            double[] r3 = new double[r0]
            int r0 = r0 + (-1)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 0
            r1[r6] = r4
            r4 = 1
            r5 = r4
        L11:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r5 >= r0) goto L22
            int r9 = r5 + (-1)
            r9 = r1[r9]
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r11 = r11 - r9
            double r7 = r7 / r11
            r1[r5] = r7
            int r5 = r5 + 1
            goto L11
        L22:
            int r5 = r0 + (-1)
            r9 = r1[r5]
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = r11 - r9
            double r7 = r7 / r9
            r1[r0] = r7
            r7 = r25[r4]
            r9 = r25[r6]
            double r7 = r7 - r9
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r7 = r7 * r9
            r13 = r1[r6]
            double r7 = r7 * r13
            r2[r6] = r7
        L3a:
            if (r4 >= r0) goto L50
            int r7 = r4 + 1
            r13 = r25[r7]
            int r8 = r4 + (-1)
            r15 = r25[r8]
            double r13 = r13 - r15
            double r13 = r13 * r9
            r15 = r2[r8]
            double r13 = r13 - r15
            r15 = r1[r4]
            double r13 = r13 * r15
            r2[r4] = r13
            r4 = r7
            goto L3a
        L50:
            r7 = r25[r0]
            r13 = r25[r5]
            double r7 = r7 - r13
            double r7 = r7 * r9
            r13 = r2[r5]
            double r7 = r7 - r13
            r13 = r1[r0]
            double r7 = r7 * r13
            r2[r0] = r7
            r3[r0] = r7
        L60:
            if (r5 < 0) goto L71
            r7 = r2[r5]
            r13 = r1[r5]
            int r4 = r5 + 1
            r15 = r3[r4]
            double r13 = r13 * r15
            double r7 = r7 - r13
            r3[r5] = r7
            int r5 = r5 + (-1)
            goto L60
        L71:
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[] r1 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r0]
        L73:
            if (r6 >= r0) goto La0
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic r2 = new androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic
            r4 = r25[r6]
            float r7 = (float) r4
            double r14 = (double) r7
            r16 = r3[r6]
            int r7 = r6 + 1
            r18 = r25[r7]
            double r20 = r18 - r4
            double r20 = r20 * r9
            double r22 = r16 * r11
            double r20 = r20 - r22
            r22 = r3[r7]
            double r20 = r20 - r22
            double r4 = r4 - r18
            double r4 = r4 * r11
            double r4 = r4 + r16
            double r4 = r4 + r22
            r13 = r2
            r18 = r20
            r20 = r4
            r13.<init>(r14, r16, r18, r20)
            r1[r6] = r2
            r6 = r7
            goto L73
        La0:
            return r1
    }

    public double approxLength(androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[] r17) {
            r16 = this;
            r0 = r17
            int r1 = r0.length
            int r1 = r0.length
            double[] r1 = new double[r1]
            r2 = 0
            r4 = r2
            r6 = r4
        La:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r11 = 0
            if (r10 >= 0) goto L35
            r8 = r2
        L12:
            int r10 = r0.length
            if (r11 >= r10) goto L25
            r12 = r1[r11]
            r10 = r0[r11]
            double r14 = r10.eval(r4)
            r1[r11] = r14
            double r12 = r12 - r14
            double r12 = r12 * r12
            double r8 = r8 + r12
            int r11 = r11 + 1
            goto L12
        L25:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L2e
            double r8 = java.lang.Math.sqrt(r8)
            double r6 = r6 + r8
        L2e:
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r4 = r4 + r8
            goto La
        L35:
            int r4 = r0.length
            if (r11 >= r4) goto L48
            r4 = r1[r11]
            r10 = r0[r11]
            double r12 = r10.eval(r8)
            r1[r11] = r12
            double r4 = r4 - r12
            double r4 = r4 * r4
            double r2 = r2 + r4
            int r11 = r11 + 1
            goto L35
        L48:
            double r0 = java.lang.Math.sqrt(r2)
            double r6 = r6 + r0
            return r6
    }

    public double getPos(double r6, int r8) {
            r5 = this;
            double r0 = r5.mTotalLength
            double r6 = r6 * r0
            r0 = 0
        L4:
            double[] r1 = r5.mCurveLength
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L15
            r2 = r1[r0]
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L15
            double r6 = r6 - r2
            int r0 = r0 + 1
            goto L4
        L15:
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r5.mCurve
            r8 = r2[r8]
            r8 = r8[r0]
            r0 = r1[r0]
            double r6 = r6 / r0
            double r6 = r8.eval(r6)
            return r6
    }

    public void getPos(double r7, double[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = r0
        L5:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L16
            r3 = r2[r1]
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L16
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L5
        L16:
            int r2 = r9.length
            if (r0 >= r2) goto L2e
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.eval(r3)
            r9[r0] = r2
            int r0 = r0 + 1
            goto L16
        L2e:
            return
    }

    public void getPos(double r7, float[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = r0
        L5:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L16
            r3 = r2[r1]
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L16
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L5
        L16:
            int r2 = r9.length
            if (r0 >= r2) goto L2f
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.eval(r3)
            float r2 = (float) r2
            r9[r0] = r2
            int r0 = r0 + 1
            goto L16
        L2f:
            return
    }

    public void getVelocity(double r7, double[] r9) {
            r6 = this;
            double r0 = r6.mTotalLength
            double r7 = r7 * r0
            r0 = 0
            r1 = r0
        L5:
            double[] r2 = r6.mCurveLength
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r1 >= r3) goto L16
            r3 = r2[r1]
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L16
            double r7 = r7 - r3
            int r1 = r1 + 1
            goto L5
        L16:
            int r2 = r9.length
            if (r0 >= r2) goto L2e
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r2 = r6.mCurve
            r2 = r2[r0]
            r2 = r2[r1]
            double[] r3 = r6.mCurveLength
            r4 = r3[r1]
            double r3 = r7 / r4
            double r2 = r2.vel(r3)
            r9[r0] = r2
            int r0 = r0 + 1
            goto L16
        L2e:
            return
    }

    public void setup(double[][] r9) {
            r8 = this;
            r0 = 0
            r1 = r9[r0]
            int r1 = r1.length
            r8.mDimensionality = r1
            int r2 = r9.length
            r8.mPoints = r2
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 1
            r3[r4] = r2
            r3[r0] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r3)
            double[][] r1 = (double[][]) r1
            r8.mCtl = r1
            int r1 = r8.mDimensionality
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r1 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r1][]
            r8.mCurve = r1
            r1 = r0
        L22:
            int r2 = r8.mDimensionality
            if (r1 >= r2) goto L3b
            r2 = r0
        L27:
            int r3 = r8.mPoints
            if (r2 >= r3) goto L38
            double[][] r3 = r8.mCtl
            r3 = r3[r1]
            r5 = r9[r2]
            r6 = r5[r1]
            r3[r2] = r6
            int r2 = r2 + 1
            goto L27
        L38:
            int r1 = r1 + 1
            goto L22
        L3b:
            r9 = r0
        L3c:
            int r1 = r8.mDimensionality
            if (r9 >= r1) goto L50
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r1 = r8.mCurve
            double[][] r2 = r8.mCtl
            r2 = r2[r9]
            int r3 = r2.length
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[] r2 = calcNaturalCubic(r3, r2)
            r1[r9] = r2
            int r9 = r9 + 1
            goto L3c
        L50:
            int r9 = r8.mPoints
            int r9 = r9 - r4
            double[] r9 = new double[r9]
            r8.mCurveLength = r9
            r2 = 0
            r8.mTotalLength = r2
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[] r9 = new androidx.constraintlayout.core.motion.utils.HyperSpline.Cubic[r1]
            r1 = r0
        L5e:
            double[] r2 = r8.mCurveLength
            int r2 = r2.length
            if (r1 >= r2) goto L83
            r2 = r0
        L64:
            int r3 = r8.mDimensionality
            if (r2 >= r3) goto L73
            androidx.constraintlayout.core.motion.utils.HyperSpline$Cubic[][] r3 = r8.mCurve
            r3 = r3[r2]
            r3 = r3[r1]
            r9[r2] = r3
            int r2 = r2 + 1
            goto L64
        L73:
            double r2 = r8.mTotalLength
            double[] r4 = r8.mCurveLength
            double r5 = r8.approxLength(r9)
            r4[r1] = r5
            double r2 = r2 + r5
            r8.mTotalLength = r2
            int r1 = r1 + 1
            goto L5e
        L83:
            return
    }
}
