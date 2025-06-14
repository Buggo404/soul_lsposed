package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static java.lang.String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double PI2;
    double[] mArea;
    androidx.constraintlayout.core.motion.utils.MonotonicCurveFit mCustomCurve;
    java.lang.String mCustomType;
    private boolean mNormalized;
    float[] mPeriod;
    double[] mPosition;
    int mType;

    static {
            return
    }

    public Oscillator() {
            r3 = this;
            r3.<init>()
            r0 = 0
            float[] r1 = new float[r0]
            r3.mPeriod = r1
            double[] r1 = new double[r0]
            r3.mPosition = r1
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r3.PI2 = r1
            r3.mNormalized = r0
            return
    }

    public void addPoint(double r5, float r7) {
            r4 = this;
            float[] r0 = r4.mPeriod
            int r0 = r0.length
            int r0 = r0 + 1
            double[] r1 = r4.mPosition
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L10
            int r1 = -r1
            int r1 = r1 + (-1)
        L10:
            double[] r2 = r4.mPosition
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPosition = r2
            float[] r2 = r4.mPeriod
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.mPeriod = r2
            double[] r2 = new double[r0]
            r4.mArea = r2
            double[] r2 = r4.mPosition
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            double[] r0 = r4.mPosition
            r0[r1] = r5
            float[] r5 = r4.mPeriod
            r5[r1] = r7
            r5 = 0
            r4.mNormalized = r5
            return
    }

    double getDP(double r11) {
            r10 = this;
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc
            r11 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto L17
        Lc:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 < 0) goto L17
            r11 = 4607182409792818153(0x3feffffde7210be9, double:0.999999)
        L17:
            double[] r2 = r10.mPosition
            int r2 = java.util.Arrays.binarySearch(r2, r11)
            if (r2 <= 0) goto L20
            return r0
        L20:
            if (r2 == 0) goto L3c
            int r0 = -r2
            int r0 = r0 + (-1)
            float[] r1 = r10.mPeriod
            r2 = r1[r0]
            int r3 = r0 + (-1)
            r1 = r1[r3]
            float r2 = r2 - r1
            double r4 = (double) r2
            double[] r2 = r10.mPosition
            r6 = r2[r0]
            r8 = r2[r3]
            double r6 = r6 - r8
            double r4 = r4 / r6
            double r11 = r11 * r4
            double r0 = (double) r1
            double r4 = r4 * r8
            double r0 = r0 - r4
            double r0 = r0 + r11
        L3c:
            return r0
    }

    double getP(double r11) {
            r10 = this;
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 >= 0) goto La
            r11 = r0
            goto Lf
        La:
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r11 = r3
        Lf:
            double[] r2 = r10.mPosition
            int r2 = java.util.Arrays.binarySearch(r2, r11)
            if (r2 <= 0) goto L19
            r0 = r3
            goto L45
        L19:
            if (r2 == 0) goto L45
            int r0 = -r2
            int r0 = r0 + (-1)
            float[] r1 = r10.mPeriod
            r2 = r1[r0]
            int r3 = r0 + (-1)
            r1 = r1[r3]
            float r2 = r2 - r1
            double r4 = (double) r2
            double[] r2 = r10.mPosition
            r6 = r2[r0]
            r8 = r2[r3]
            double r6 = r6 - r8
            double r4 = r4 / r6
            double[] r0 = r10.mArea
            r2 = r0[r3]
            double r0 = (double) r1
            double r6 = r4 * r8
            double r0 = r0 - r6
            double r6 = r11 - r8
            double r0 = r0 * r6
            double r2 = r2 + r0
            double r11 = r11 * r11
            double r8 = r8 * r8
            double r11 = r11 - r8
            double r4 = r4 * r11
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r11
            double r0 = r2 + r4
        L45:
            return r0
    }

    public double getSlope(double r5, double r7, double r9) {
            r4 = this;
            double r0 = r4.getP(r5)
            double r7 = r7 + r0
            double r5 = r4.getDP(r5)
            double r5 = r5 + r9
            int r9 = r4.mType
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r9) {
                case 1: goto L4c;
                case 2: goto L3f;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L2f;
                case 6: goto L28;
                case 7: goto L1d;
                default: goto L13;
            }
        L13:
            double r9 = r4.PI2
            double r5 = r5 * r9
            double r9 = r9 * r7
            double r7 = java.lang.Math.cos(r9)
            double r5 = r5 * r7
            return r5
        L1d:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r5 = r4.mCustomCurve
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 % r9
            r6 = 0
            double r5 = r5.getSlope(r7, r6)
            return r5
        L28:
            double r5 = r5 * r2
            double r7 = r7 * r2
            double r7 = r7 + r0
            double r7 = r7 % r2
            double r7 = r7 - r0
            double r5 = r5 * r7
            return r5
        L2f:
            double r9 = r4.PI2
            double r0 = -r9
            double r0 = r0 * r5
            double r9 = r9 * r7
            double r5 = java.lang.Math.sin(r9)
            double r0 = r0 * r5
            return r0
        L3a:
            double r5 = -r5
            double r5 = r5 * r0
            return r5
        L3d:
            double r5 = r5 * r0
            return r5
        L3f:
            double r5 = r5 * r2
            double r7 = r7 * r2
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r7 = r7 + r9
            double r7 = r7 % r2
            double r7 = r7 - r0
            double r7 = java.lang.Math.signum(r7)
            double r5 = r5 * r7
            return r5
        L4c:
            r5 = 0
            return r5
    }

    public double getValue(double r8, double r10) {
            r7 = this;
            double r8 = r7.getP(r8)
            double r8 = r8 + r10
            int r0 = r7.mType
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r0) {
                case 1: goto L48;
                case 2: goto L3f;
                case 3: goto L3a;
                case 4: goto L36;
                case 5: goto L2d;
                case 6: goto L21;
                case 7: goto L18;
                default: goto L10;
            }
        L10:
            double r10 = r7.PI2
            double r10 = r10 * r8
            double r8 = java.lang.Math.sin(r10)
            return r8
        L18:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r10 = r7.mCustomCurve
            double r8 = r8 % r5
            r11 = 0
            double r8 = r10.getPos(r8, r11)
            return r8
        L21:
            double r8 = r8 * r1
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            double r8 = r5 - r8
            double r8 = r8 * r8
        L2b:
            double r5 = r5 - r8
            return r5
        L2d:
            double r0 = r7.PI2
            double r10 = r10 + r8
            double r0 = r0 * r10
            double r8 = java.lang.Math.cos(r0)
            return r8
        L36:
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            goto L2b
        L3a:
            double r8 = r8 * r3
            double r8 = r8 + r5
            double r8 = r8 % r3
            double r8 = r8 - r5
            return r8
        L3f:
            double r8 = r8 * r1
            double r8 = r8 + r5
            double r8 = r8 % r1
            double r8 = r8 - r3
            double r8 = java.lang.Math.abs(r8)
            goto L2b
        L48:
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 % r5
            double r10 = r10 - r8
            double r8 = java.lang.Math.signum(r10)
            return r8
    }

    public void normalize() {
            r17 = this;
            r0 = r17
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        L7:
            float[] r7 = r0.mPeriod
            int r8 = r7.length
            if (r4 >= r8) goto L13
            r7 = r7[r4]
            double r7 = (double) r7
            double r5 = r5 + r7
            int r4 = r4 + 1
            goto L7
        L13:
            r4 = 1
            r8 = r1
            r7 = r4
        L16:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r11) goto L32
            int r11 = r7 + (-1)
            r13 = r10[r11]
            r10 = r10[r7]
            float r13 = r13 + r10
            float r13 = r13 / r12
            double[] r10 = r0.mPosition
            r14 = r10[r7]
            r11 = r10[r11]
            double r14 = r14 - r11
            double r10 = (double) r13
            double r14 = r14 * r10
            double r8 = r8 + r14
            int r7 = r7 + 1
            goto L16
        L32:
            r7 = r3
        L33:
            float[] r10 = r0.mPeriod
            int r11 = r10.length
            if (r7 >= r11) goto L44
            r11 = r10[r7]
            double r13 = (double) r11
            double r15 = r5 / r8
            double r13 = r13 * r15
            float r11 = (float) r13
            r10[r7] = r11
            int r7 = r7 + 1
            goto L33
        L44:
            double[] r5 = r0.mArea
            r5[r3] = r1
            r1 = r4
        L49:
            float[] r2 = r0.mPeriod
            int r3 = r2.length
            if (r1 >= r3) goto L69
            int r3 = r1 + (-1)
            r5 = r2[r3]
            r2 = r2[r1]
            float r5 = r5 + r2
            float r5 = r5 / r12
            double[] r2 = r0.mPosition
            r6 = r2[r1]
            r8 = r2[r3]
            double r6 = r6 - r8
            double[] r2 = r0.mArea
            r8 = r2[r3]
            double r10 = (double) r5
            double r6 = r6 * r10
            double r8 = r8 + r6
            r2[r1] = r8
            int r1 = r1 + 1
            goto L49
        L69:
            r0.mNormalized = r4
            return
    }

    public void setType(int r1, java.lang.String r2) {
            r0 = this;
            r0.mType = r1
            r0.mCustomType = r2
            if (r2 == 0) goto Lc
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r1 = androidx.constraintlayout.core.motion.utils.MonotonicCurveFit.buildWave(r2)
            r0.mCustomCurve = r1
        Lc:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "pos ="
            r0.<init>(r1)
            double[] r1 = r2.mPosition
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " period="
            java.lang.StringBuilder r0 = r0.append(r1)
            float[] r1 = r2.mPeriod
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
