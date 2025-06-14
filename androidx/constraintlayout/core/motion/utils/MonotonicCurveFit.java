package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class MonotonicCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    private static final java.lang.String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f30mT;
    private double[][] mTangent;

    /* renamed from: mY */
    private double[][] f31mY;

    public MonotonicCurveFit(double[] r22, double[][] r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r21.<init>()
            r3 = 1
            r0.mExtrapolate = r3
            int r4 = r1.length
            r5 = 0
            r6 = r2[r5]
            int r6 = r6.length
            double[] r7 = new double[r6]
            r0.mSlopeTemp = r7
            int r7 = r4 + (-1)
            r8 = 2
            int[] r9 = new int[r8]
            r9[r3] = r6
            r9[r5] = r7
            java.lang.Class r10 = java.lang.Double.TYPE
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r9)
            double[][] r9 = (double[][]) r9
            int[] r10 = new int[r8]
            r10[r3] = r6
            r10[r5] = r4
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r10)
            double[][] r3 = (double[][]) r3
            r10 = r5
        L35:
            if (r10 >= r6) goto L77
            r11 = r5
        L38:
            if (r11 >= r7) goto L6a
            int r12 = r11 + 1
            r13 = r1[r12]
            r15 = r1[r11]
            double r13 = r13 - r15
            r15 = r9[r11]
            r16 = r2[r12]
            r17 = r16[r10]
            r16 = r2[r11]
            r19 = r16[r10]
            double r17 = r17 - r19
            double r17 = r17 / r13
            r15[r10] = r17
            if (r11 != 0) goto L58
            r11 = r3[r11]
            r11[r10] = r17
            goto L68
        L58:
            r13 = r3[r11]
            int r11 = r11 + (-1)
            r11 = r9[r11]
            r14 = r11[r10]
            double r14 = r14 + r17
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r14 = r14 * r16
            r13[r10] = r14
        L68:
            r11 = r12
            goto L38
        L6a:
            r11 = r3[r7]
            int r12 = r4 + (-2)
            r12 = r9[r12]
            r13 = r12[r10]
            r11[r10] = r13
            int r10 = r10 + 1
            goto L35
        L77:
            r4 = r5
        L78:
            if (r4 >= r7) goto Lc9
            r8 = r5
        L7b:
            if (r8 >= r6) goto Lc6
            r10 = r9[r4]
            r11 = r10[r8]
            r13 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L92
            r10 = r3[r4]
            r10[r8] = r13
            int r10 = r4 + 1
            r10 = r3[r10]
            r10[r8] = r13
            goto Lc3
        L92:
            r10 = r3[r4]
            r13 = r10[r8]
            double r13 = r13 / r11
            int r10 = r4 + 1
            r15 = r3[r10]
            r16 = r15[r8]
            double r11 = r16 / r11
            double r15 = java.lang.Math.hypot(r13, r11)
            r17 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto Lc3
            r17 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r17 = r17 / r15
            r15 = r3[r4]
            double r13 = r13 * r17
            r16 = r9[r4]
            r19 = r16[r8]
            double r13 = r13 * r19
            r15[r8] = r13
            r10 = r3[r10]
            double r17 = r17 * r11
            r11 = r16[r8]
            double r17 = r17 * r11
            r10[r8] = r17
        Lc3:
            int r8 = r8 + 1
            goto L7b
        Lc6:
            int r4 = r4 + 1
            goto L78
        Lc9:
            r0.f30mT = r1
            r0.f31mY = r2
            r0.mTangent = r3
            return
    }

    public static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit buildWave(java.lang.String r8) {
            int r0 = r8.length()
            int r0 = r0 / 2
            double[] r0 = new double[r0]
            r1 = 40
            int r1 = r8.indexOf(r1)
            int r1 = r1 + 1
            r2 = 44
            int r3 = r8.indexOf(r2, r1)
            r4 = 0
        L17:
            r5 = -1
            if (r3 == r5) goto L32
            java.lang.String r1 = r8.substring(r1, r3)
            java.lang.String r1 = r1.trim()
            int r5 = r4 + 1
            double r6 = java.lang.Double.parseDouble(r1)
            r0[r4] = r6
            int r1 = r3 + 1
            int r3 = r8.indexOf(r2, r1)
            r4 = r5
            goto L17
        L32:
            r2 = 41
            int r2 = r8.indexOf(r2, r1)
            java.lang.String r8 = r8.substring(r1, r2)
            java.lang.String r8 = r8.trim()
            int r1 = r4 + 1
            double r2 = java.lang.Double.parseDouble(r8)
            r0[r4] = r2
            double[] r8 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r8 = buildWave(r8)
            return r8
    }

    private static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit buildWave(double[] r18) {
            r0 = r18
            int r1 = r0.length
            int r1 = r1 * 3
            r2 = 2
            int r1 = r1 - r2
            int r3 = r0.length
            r4 = 1
            int r3 = r3 - r4
            double r5 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r7 / r5
            int[] r2 = new int[r2]
            r2[r4] = r4
            r4 = 0
            r2[r4] = r1
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r9, r2)
            double[][] r2 = (double[][]) r2
            double[] r1 = new double[r1]
            r9 = r4
        L21:
            int r10 = r0.length
            if (r9 >= r10) goto L50
            r10 = r0[r9]
            int r12 = r9 + r3
            r13 = r2[r12]
            r13[r4] = r10
            double r13 = (double) r9
            double r13 = r13 * r5
            r1[r12] = r13
            if (r9 <= 0) goto L4d
            int r12 = r3 * 2
            int r12 = r12 + r9
            r15 = r2[r12]
            double r16 = r10 + r7
            r15[r4] = r16
            double r15 = r13 + r7
            r1[r12] = r15
            int r12 = r9 + (-1)
            r15 = r2[r12]
            double r10 = r10 - r7
            double r10 = r10 - r5
            r15[r4] = r10
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r13 = r13 + r10
            double r13 = r13 - r5
            r1[r12] = r13
        L4d:
            int r9 = r9 + 1
            goto L21
        L50:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r0 = new androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
            r0.<init>(r1, r2)
            return r0
    }

    private static double diff(double r10, double r12, double r14, double r16, double r18, double r20) {
            double r0 = r12 * r12
            r2 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r2 = r2 * r0
            double r2 = r2 * r16
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r6 = r12 * r4
            double r8 = r6 * r16
            double r2 = r2 + r8
            double r4 = r4 * r0
            double r4 = r4 * r14
            double r2 = r2 + r4
            double r6 = r6 * r14
            double r2 = r2 - r6
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = r4 * r10
            double r6 = r4 * r20
            double r6 = r6 * r0
            double r2 = r2 + r6
            double r4 = r4 * r18
            double r4 = r4 * r0
            double r2 = r2 + r4
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r10
            double r0 = r0 * r20
            double r0 = r0 * r12
            double r2 = r2 - r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r10
            double r0 = r0 * r18
            double r0 = r0 * r12
            double r2 = r2 - r0
            double r0 = r10 * r18
            double r2 = r2 + r0
            return r2
    }

    private static double interpolate(double r12, double r14, double r16, double r18, double r20, double r22) {
            double r0 = r14 * r14
            double r2 = r0 * r14
            r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
            double r4 = r4 * r2
            double r4 = r4 * r18
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r6 * r0
            double r8 = r6 * r18
            double r4 = r4 + r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r2 * r8
            double r10 = r10 * r16
            double r4 = r4 + r10
            double r6 = r6 * r16
            double r4 = r4 - r6
            double r4 = r4 + r16
            double r6 = r12 * r22
            double r10 = r6 * r2
            double r4 = r4 + r10
            double r10 = r12 * r20
            double r2 = r2 * r10
            double r4 = r4 + r2
            double r6 = r6 * r0
            double r4 = r4 - r6
            double r2 = r12 * r8
            double r2 = r2 * r20
            double r2 = r2 * r0
            double r4 = r4 - r2
            double r10 = r10 * r14
            double r4 = r4 + r10
            return r4
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r23, int r25) {
            r22 = this;
            r0 = r22
            r1 = r25
            double[] r2 = r0.f30mT
            int r3 = r2.length
            boolean r4 = r0.mExtrapolate
            r5 = 0
            if (r4 == 0) goto L36
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 > 0) goto L21
            double[][] r2 = r0.f31mY
            r2 = r2[r5]
            r3 = r2[r1]
            double r8 = r23 - r6
            double r1 = r0.getSlope(r6, r1)
        L1e:
            double r8 = r8 * r1
            double r3 = r3 + r8
            return r3
        L21:
            int r4 = r3 + (-1)
            r6 = r2[r4]
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 < 0) goto L52
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r3 = r2[r1]
            double r8 = r23 - r6
            double r1 = r0.getSlope(r6, r1)
            goto L1e
        L36:
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 > 0) goto L43
            double[][] r2 = r0.f31mY
            r2 = r2[r5]
            r1 = r2[r1]
            return r1
        L43:
            int r4 = r3 + (-1)
            r6 = r2[r4]
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 < 0) goto L52
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r1 = r2[r1]
            return r1
        L52:
            int r2 = r3 + (-1)
            if (r5 >= r2) goto L8e
            double[] r2 = r0.f30mT
            r6 = r2[r5]
            int r4 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r4 != 0) goto L65
            double[][] r2 = r0.f31mY
            r2 = r2[r5]
            r1 = r2[r1]
            return r1
        L65:
            int r4 = r5 + 1
            r8 = r2[r4]
            int r2 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r2 >= 0) goto L8c
            double r10 = r8 - r6
            double r2 = r23 - r6
            double r12 = r2 / r10
            double[][] r2 = r0.f31mY
            r3 = r2[r5]
            r14 = r3[r1]
            r2 = r2[r4]
            r16 = r2[r1]
            double[][] r2 = r0.mTangent
            r3 = r2[r5]
            r18 = r3[r1]
            r2 = r2[r4]
            r20 = r2[r1]
            double r1 = interpolate(r10, r12, r14, r16, r18, r20)
            return r1
        L8c:
            r5 = r4
            goto L52
        L8e:
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r24, double[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f30mT
            int r2 = r1.length
            double[][] r3 = r0.f31mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            boolean r5 = r0.mExtrapolate
            if (r5 == 0) goto L5c
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L35
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r5, r1)
            r1 = r4
        L1b:
            if (r1 >= r3) goto L34
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r5 = r2[r1]
            double[] r2 = r0.f30mT
            r7 = r2[r4]
            double r7 = r24 - r7
            double[] r2 = r0.mSlopeTemp
            r9 = r2[r1]
            double r7 = r7 * r9
            double r5 = r5 + r7
            r26[r1] = r5
            int r1 = r1 + 1
            goto L1b
        L34:
            return
        L35:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L87
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r6, r1)
        L42:
            if (r4 >= r3) goto L5b
            double[][] r1 = r0.f31mY
            r1 = r1[r5]
            r6 = r1[r4]
            double[] r1 = r0.f30mT
            r8 = r1[r5]
            double r1 = r24 - r8
            double[] r8 = r0.mSlopeTemp
            r9 = r8[r4]
            double r1 = r1 * r9
            double r6 = r6 + r1
            r26[r4] = r6
            int r4 = r4 + 1
            goto L42
        L5b:
            return
        L5c:
            r5 = r1[r4]
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 > 0) goto L71
            r1 = r4
        L63:
            if (r1 >= r3) goto L70
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r5 = r2[r1]
            r26[r1] = r5
            int r1 = r1 + 1
            goto L63
        L70:
            return
        L71:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L87
        L79:
            if (r4 >= r3) goto L86
            double[][] r1 = r0.f31mY
            r1 = r1[r5]
            r6 = r1[r4]
            r26[r4] = r6
            int r4 = r4 + 1
            goto L79
        L86:
            return
        L87:
            r1 = r4
        L88:
            int r5 = r2 + (-1)
            if (r1 >= r5) goto Ld6
            double[] r5 = r0.f30mT
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto La2
            r5 = r4
        L95:
            if (r5 >= r3) goto La2
            double[][] r6 = r0.f31mY
            r6 = r6[r1]
            r7 = r6[r5]
            r26[r5] = r7
            int r5 = r5 + 1
            goto L95
        La2:
            double[] r5 = r0.f30mT
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto Ld4
            r9 = r5[r1]
            double r7 = r7 - r9
            double r9 = r24 - r9
            double r9 = r9 / r7
        Lb2:
            if (r4 >= r3) goto Ld3
            double[][] r2 = r0.f31mY
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.mTangent
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = interpolate(r11, r13, r15, r17, r19, r21)
            r26[r4] = r11
            int r4 = r4 + 1
            goto Lb2
        Ld3:
            return
        Ld4:
            r1 = r6
            goto L88
        Ld6:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r24, float[] r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f30mT
            int r2 = r1.length
            double[][] r3 = r0.f31mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            boolean r5 = r0.mExtrapolate
            if (r5 == 0) goto L5e
            r5 = r1[r4]
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 > 0) goto L36
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r5, r1)
            r1 = r4
        L1b:
            if (r1 >= r3) goto L35
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r5 = r2[r1]
            double[] r2 = r0.f30mT
            r7 = r2[r4]
            double r7 = r24 - r7
            double[] r2 = r0.mSlopeTemp
            r9 = r2[r1]
            double r7 = r7 * r9
            double r5 = r5 + r7
            float r2 = (float) r5
            r26[r1] = r2
            int r1 = r1 + 1
            goto L1b
        L35:
            return
        L36:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L8b
            double[] r1 = r0.mSlopeTemp
            r0.getSlope(r6, r1)
        L43:
            if (r4 >= r3) goto L5d
            double[][] r1 = r0.f31mY
            r1 = r1[r5]
            r6 = r1[r4]
            double[] r1 = r0.f30mT
            r8 = r1[r5]
            double r1 = r24 - r8
            double[] r8 = r0.mSlopeTemp
            r9 = r8[r4]
            double r1 = r1 * r9
            double r6 = r6 + r1
            float r1 = (float) r6
            r26[r4] = r1
            int r4 = r4 + 1
            goto L43
        L5d:
            return
        L5e:
            r5 = r1[r4]
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 > 0) goto L74
            r1 = r4
        L65:
            if (r1 >= r3) goto L73
            double[][] r2 = r0.f31mY
            r2 = r2[r4]
            r5 = r2[r1]
            float r2 = (float) r5
            r26[r1] = r2
            int r1 = r1 + 1
            goto L65
        L73:
            return
        L74:
            int r5 = r2 + (-1)
            r6 = r1[r5]
            int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r1 < 0) goto L8b
        L7c:
            if (r4 >= r3) goto L8a
            double[][] r1 = r0.f31mY
            r1 = r1[r5]
            r6 = r1[r4]
            float r1 = (float) r6
            r26[r4] = r1
            int r4 = r4 + 1
            goto L7c
        L8a:
            return
        L8b:
            r1 = r4
        L8c:
            int r5 = r2 + (-1)
            if (r1 >= r5) goto Ldc
            double[] r5 = r0.f30mT
            r6 = r5[r1]
            int r5 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r5 != 0) goto La7
            r5 = r4
        L99:
            if (r5 >= r3) goto La7
            double[][] r6 = r0.f31mY
            r6 = r6[r1]
            r7 = r6[r5]
            float r6 = (float) r7
            r26[r5] = r6
            int r5 = r5 + 1
            goto L99
        La7:
            double[] r5 = r0.f30mT
            int r6 = r1 + 1
            r7 = r5[r6]
            int r9 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lda
            r9 = r5[r1]
            double r7 = r7 - r9
            double r9 = r24 - r9
            double r9 = r9 / r7
        Lb7:
            if (r4 >= r3) goto Ld9
            double[][] r2 = r0.f31mY
            r5 = r2[r1]
            r15 = r5[r4]
            r2 = r2[r6]
            r17 = r2[r4]
            double[][] r2 = r0.mTangent
            r5 = r2[r1]
            r19 = r5[r4]
            r2 = r2[r6]
            r21 = r2[r4]
            r11 = r7
            r13 = r9
            double r11 = interpolate(r11, r13, r15, r17, r19, r21)
            float r2 = (float) r11
            r26[r4] = r2
            int r4 = r4 + 1
            goto Lb7
        Ld9:
            return
        Lda:
            r1 = r6
            goto L8c
        Ldc:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r24, int r26) {
            r23 = this;
            r0 = r23
            double[] r1 = r0.f30mT
            int r2 = r1.length
            r3 = 0
            r4 = r1[r3]
            int r6 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            goto L18
        Ld:
            int r4 = r2 + (-1)
            r4 = r1[r4]
            int r1 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r1 < 0) goto L16
            goto L18
        L16:
            r4 = r24
        L18:
            int r1 = r2 + (-1)
            if (r3 >= r1) goto L49
            double[] r1 = r0.f30mT
            int r6 = r3 + 1
            r7 = r1[r6]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L47
            r9 = r1[r3]
            double r7 = r7 - r9
            double r4 = r4 - r9
            double r13 = r4 / r7
            double[][] r1 = r0.f31mY
            r2 = r1[r3]
            r15 = r2[r26]
            r1 = r1[r6]
            r17 = r1[r26]
            double[][] r1 = r0.mTangent
            r2 = r1[r3]
            r19 = r2[r26]
            r1 = r1[r6]
            r21 = r1[r26]
            r11 = r7
            double r1 = diff(r11, r13, r15, r17, r19, r21)
            double r1 = r1 / r7
            return r1
        L47:
            r3 = r6
            goto L18
        L49:
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r26, double[] r28) {
            r25 = this;
            r0 = r25
            double[] r1 = r0.f30mT
            int r2 = r1.length
            double[][] r3 = r0.f31mY
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.length
            r5 = r1[r4]
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 > 0) goto L12
            goto L1d
        L12:
            int r5 = r2 + (-1)
            r5 = r1[r5]
            int r1 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r1 < 0) goto L1b
            goto L1d
        L1b:
            r5 = r26
        L1d:
            r1 = r4
        L1e:
            int r7 = r2 + (-1)
            if (r1 >= r7) goto L55
            double[] r7 = r0.f30mT
            int r8 = r1 + 1
            r9 = r7[r8]
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L53
            r11 = r7[r1]
            double r9 = r9 - r11
            double r5 = r5 - r11
            double r5 = r5 / r9
        L31:
            if (r4 >= r3) goto L55
            double[][] r2 = r0.f31mY
            r7 = r2[r1]
            r17 = r7[r4]
            r2 = r2[r8]
            r19 = r2[r4]
            double[][] r2 = r0.mTangent
            r7 = r2[r1]
            r21 = r7[r4]
            r2 = r2[r8]
            r23 = r2[r4]
            r13 = r9
            r15 = r5
            double r11 = diff(r13, r15, r17, r19, r21, r23)
            double r11 = r11 / r9
            r28[r4] = r11
            int r4 = r4 + 1
            goto L31
        L53:
            r1 = r8
            goto L1e
        L55:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.f30mT
            return r0
    }
}
