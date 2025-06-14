package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class ArcCurveFit extends androidx.constraintlayout.core.motion.utils.CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[] mArcs;
    private boolean mExtrapolate;
    private final double[] mTime;

    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final java.lang.String TAG = "Arc";
        private static double[] ourPercent;
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        static {
                r0 = 91
                double[] r0 = new double[r0]
                androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent = r0
                return
        }

        Arc(int r21, double r22, double r24, double r26, double r28, double r30, double r32) {
                r20 = this;
                r9 = r20
                r0 = r21
                r1 = r22
                r3 = r24
                r5 = r26
                r7 = r28
                r10 = r30
                r12 = r32
                r20.<init>()
                r14 = 0
                r9.linear = r14
                r15 = 1
                if (r0 != r15) goto L1a
                r14 = r15
            L1a:
                r9.mVertical = r14
                r9.mTime1 = r1
                r9.mTime2 = r3
                r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r1 = r3 - r1
                double r1 = r16 / r1
                r9.mOneOverDeltaTime = r1
                r1 = 3
                if (r1 != r0) goto L2d
                r9.linear = r15
            L2d:
                double r0 = r10 - r5
                double r2 = r12 - r7
                boolean r4 = r9.linear
                if (r4 != 0) goto L88
                double r16 = java.lang.Math.abs(r0)
                r18 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r4 < 0) goto L88
                double r16 = java.lang.Math.abs(r2)
                int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r4 >= 0) goto L4b
                goto L88
            L4b:
                r4 = 101(0x65, float:1.42E-43)
                double[] r4 = new double[r4]
                r9.mLut = r4
                boolean r4 = r9.mVertical
                if (r4 == 0) goto L57
                r14 = -1
                goto L58
            L57:
                r14 = r15
            L58:
                double r12 = (double) r14
                double r0 = r0 * r12
                r9.mEllipseA = r0
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r15 = -1
            L60:
                double r0 = (double) r15
                double r2 = r2 * r0
                r9.mEllipseB = r2
                if (r4 == 0) goto L68
                r0 = r10
                goto L69
            L68:
                r0 = r5
            L69:
                r9.mEllipseCenterX = r0
                if (r4 == 0) goto L6f
                r0 = r7
                goto L71
            L6f:
                r0 = r32
            L71:
                r9.mEllipseCenterY = r0
                r0 = r20
                r1 = r26
                r3 = r28
                r5 = r30
                r7 = r32
                r0.buildTable(r1, r3, r5, r7)
                double r0 = r9.mArcDistance
                double r2 = r9.mOneOverDeltaTime
                double r0 = r0 * r2
                r9.mArcVelocity = r0
                return
            L88:
                r9.linear = r15
                r9.mX1 = r5
                r9.mX2 = r10
                r9.mY1 = r7
                r4 = r32
                r9.mY2 = r4
                double r4 = java.lang.Math.hypot(r2, r0)
                r9.mArcDistance = r4
                double r6 = r9.mOneOverDeltaTime
                double r4 = r4 * r6
                r9.mArcVelocity = r4
                double r4 = r9.mTime2
                double r6 = r9.mTime1
                double r10 = r4 - r6
                double r0 = r0 / r10
                r9.mEllipseCenterX = r0
                double r4 = r4 - r6
                double r2 = r2 / r4
                r9.mEllipseCenterY = r2
                return
        }

        private void buildTable(double r21, double r23, double r25, double r27) {
                r20 = this;
                r0 = r20
                double r1 = r25 - r21
                double r3 = r23 - r27
                r8 = 0
                r9 = 0
                r11 = 0
                r13 = 0
            Ld:
                double[] r15 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r7 = r15.length
                if (r8 >= r7) goto L4d
                r16 = 4636033603912859648(0x4056800000000000, double:90.0)
                double r5 = (double) r8
                double r5 = r5 * r16
                int r7 = r15.length
                int r7 = r7 + (-1)
                r24 = r9
                double r9 = (double) r7
                double r5 = r5 / r9
                double r5 = java.lang.Math.toRadians(r5)
                double r9 = java.lang.Math.sin(r5)
                double r5 = java.lang.Math.cos(r5)
                double r9 = r9 * r1
                double r5 = r5 * r3
                if (r8 <= 0) goto L41
                double r11 = r9 - r11
                double r13 = r5 - r13
                double r11 = java.lang.Math.hypot(r11, r13)
                r13 = r24
                double r11 = r11 + r13
                double[] r7 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                r7[r8] = r11
                goto L44
            L41:
                r13 = r24
                r11 = r13
            L44:
                int r8 = r8 + 1
                r13 = r5
                r18 = r9
                r9 = r11
                r11 = r18
                goto Ld
            L4d:
                r13 = r9
                r0.mArcDistance = r13
                r1 = 0
            L51:
                double[] r2 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r3 = r2.length
                if (r1 >= r3) goto L5e
                r3 = r2[r1]
                double r3 = r3 / r13
                r2[r1] = r3
                int r1 = r1 + 1
                goto L51
            L5e:
                r7 = 0
            L5f:
                double[] r1 = r0.mLut
                int r2 = r1.length
                if (r7 >= r2) goto La9
                double r2 = (double) r7
                int r1 = r1.length
                int r1 = r1 + (-1)
                double r4 = (double) r1
                double r2 = r2 / r4
                double[] r1 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r1 = java.util.Arrays.binarySearch(r1, r2)
                if (r1 < 0) goto L81
                double[] r2 = r0.mLut
                double r3 = (double) r1
                double[] r1 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                int r1 = r1.length
                int r1 = r1 + (-1)
                double r5 = (double) r1
                double r3 = r3 / r5
                r2[r7] = r3
                r4 = 0
                goto La6
            L81:
                r4 = -1
                if (r1 != r4) goto L8b
                double[] r1 = r0.mLut
                r4 = 0
                r1[r7] = r4
                goto La6
            L8b:
                r4 = 0
                int r1 = -r1
                int r6 = r1 + (-2)
                int r1 = r1 + (-1)
                double r8 = (double) r6
                double[] r10 = androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.ourPercent
                r11 = r10[r6]
                double r2 = r2 - r11
                r13 = r10[r1]
                double r13 = r13 - r11
                double r2 = r2 / r13
                double r8 = r8 + r2
                int r1 = r10.length
                int r1 = r1 + (-1)
                double r1 = (double) r1
                double r8 = r8 / r1
                double[] r1 = r0.mLut
                r1[r7] = r8
            La6:
                int r7 = r7 + 1
                goto L5f
            La9:
                return
        }

        double getDX() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r2 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r2
                boolean r2 = r6.mVertical
                if (r2 == 0) goto L17
                double r0 = -r0
            L17:
                double r0 = r0 * r4
                return r0
        }

        double getDY() {
                r6 = this;
                double r0 = r6.mEllipseA
                double r2 = r6.mTmpCosAngle
                double r0 = r0 * r2
                double r2 = r6.mEllipseB
                double r2 = -r2
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r4 = r6.mArcVelocity
                double r0 = java.lang.Math.hypot(r0, r2)
                double r4 = r4 / r0
                boolean r0 = r6.mVertical
                if (r0 == 0) goto L19
                double r0 = -r2
                double r0 = r0 * r4
                goto L1b
            L19:
                double r0 = r2 * r4
            L1b:
                return r0
        }

        public double getLinearDX(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterX
                return r1
        }

        public double getLinearDY(double r1) {
                r0 = this;
                double r1 = r0.mEllipseCenterY
                return r1
        }

        public double getLinearX(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mX1
                double r2 = r4.mX2
                double r2 = r2 - r0
                double r5 = r5 * r2
                double r0 = r0 + r5
                return r0
        }

        public double getLinearY(double r5) {
                r4 = this;
                double r0 = r4.mTime1
                double r5 = r5 - r0
                double r0 = r4.mOneOverDeltaTime
                double r5 = r5 * r0
                double r0 = r4.mY1
                double r2 = r4.mY2
                double r2 = r2 - r0
                double r5 = r5 * r2
                double r0 = r0 + r5
                return r0
        }

        double getX() {
                r6 = this;
                double r0 = r6.mEllipseCenterX
                double r2 = r6.mEllipseA
                double r4 = r6.mTmpSinAngle
                double r2 = r2 * r4
                double r0 = r0 + r2
                return r0
        }

        double getY() {
                r6 = this;
                double r0 = r6.mEllipseCenterY
                double r2 = r6.mEllipseB
                double r4 = r6.mTmpCosAngle
                double r2 = r2 * r4
                double r0 = r0 + r2
                return r0
        }

        double lookup(double r7) {
                r6 = this;
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                double[] r0 = r6.mLut
                int r1 = r0.length
                int r1 = r1 + (-1)
                double r1 = (double) r1
                double r7 = r7 * r1
                int r1 = (int) r7
                double r2 = (double) r1
                double r7 = r7 - r2
                r2 = r0[r1]
                int r1 = r1 + 1
                r4 = r0[r1]
                double r4 = r4 - r2
                double r7 = r7 * r4
                double r2 = r2 + r7
                return r2
        }

        void setPoint(double r3) {
                r2 = this;
                boolean r0 = r2.mVertical
                if (r0 == 0) goto L8
                double r0 = r2.mTime2
                double r0 = r0 - r3
                goto Lc
            L8:
                double r0 = r2.mTime1
                double r0 = r3 - r0
            Lc:
                double r3 = r2.mOneOverDeltaTime
                double r0 = r0 * r3
                r3 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
                double r0 = r2.lookup(r0)
                double r0 = r0 * r3
                double r3 = java.lang.Math.sin(r0)
                r2.mTmpSinAngle = r3
                double r3 = java.lang.Math.cos(r0)
                r2.mTmpCosAngle = r3
                return
        }
    }

    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L4f
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2f
            if (r8 == r2) goto L2c
            r10 = 2
            if (r8 == r10) goto L2a
            if (r8 == r9) goto L28
            goto L30
        L28:
            if (r5 != r2) goto L2c
        L2a:
            r5 = r10
            goto L2d
        L2c:
            r5 = r2
        L2d:
            r6 = r5
            goto L30
        L2f:
            r6 = r9
        L30:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L16
        L4f:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double r7, int r9) {
            r6 = this;
            boolean r0 = r6.mExtrapolate
            r1 = 0
            if (r0 == 0) goto Lb3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            double r2 = r0.mTime1
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L77
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            double r2 = r0.mTime1
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            double r4 = r0.mTime1
            double r7 = r7 - r4
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            boolean r0 = r0.linear
            if (r0 == 0) goto L4a
            if (r9 != 0) goto L39
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r4 = r9.getLinearX(r2)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getLinearDX(r2)
        L36:
            double r7 = r7 * r0
            double r4 = r4 + r7
            return r4
        L39:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r4 = r9.getLinearY(r2)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getLinearDY(r2)
            goto L36
        L4a:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            r0.setPoint(r2)
            if (r9 != 0) goto L66
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r2 = r9.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getDX()
        L63:
            double r7 = r7 * r0
            double r2 = r2 + r7
            return r2
        L66:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r2 = r9.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r0 = r9.getDY()
            goto L63
        L77:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            double r2 = r0.mTime2
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lda
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            double r0 = r0.mTime2
            double r7 = r7 - r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r6.mArcs
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r9 != 0) goto La4
            r9 = r2[r3]
            double r4 = r9.getLinearX(r0)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r3]
            double r0 = r9.getLinearDX(r0)
            goto L36
        La4:
            r9 = r2[r3]
            double r4 = r9.getLinearY(r0)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r3]
            double r0 = r9.getLinearDY(r0)
            goto L36
        Lb3:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            double r2 = r0.mTime1
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lc4
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            r7 = r7[r1]
            double r7 = r7.mTime1
            goto Lda
        Lc4:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            double r2 = r0.mTime2
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lda
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            int r8 = r7.length
            int r8 = r8 + (-1)
            r7 = r7[r8]
            double r7 = r7.mTime2
        Lda:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L121
            r0 = r0[r1]
            double r2 = r0.mTime2
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L11e
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            boolean r0 = r0.linear
            if (r0 == 0) goto L103
            if (r9 != 0) goto Lfa
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r7 = r9.getLinearX(r7)
            return r7
        Lfa:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r9 = r6.mArcs
            r9 = r9[r1]
            double r7 = r9.getLinearY(r7)
            return r7
        L103:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r6.mArcs
            r0 = r0[r1]
            r0.setPoint(r7)
            if (r9 != 0) goto L115
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            r7 = r7[r1]
            double r7 = r7.getX()
            return r7
        L115:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r6.mArcs
            r7 = r7[r1]
            double r7 = r7.getY()
            return r7
        L11e:
            int r1 = r1 + 1
            goto Lda
        L121:
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r7
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r11, double[] r13) {
            r10 = this;
            boolean r0 = r10.mExtrapolate
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf7
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L7e
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.mTime1
            double r11 = r11 - r5
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            boolean r0 = r0.linear
            if (r0 == 0) goto L4e
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r7 = r0.getLinearDX(r3)
            double r7 = r7 * r11
            double r5 = r5 + r7
            r13[r2] = r5
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r2 = r0.getLinearDY(r3)
            double r11 = r11 * r2
            double r5 = r5 + r11
            r13[r1] = r5
            goto L7d
        L4e:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            r0.setPoint(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDX()
            double r5 = r5 * r11
            double r3 = r3 + r5
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDY()
            double r11 = r11 * r5
            double r3 = r3 + r11
            r13[r1] = r3
        L7d:
            return
        L7e:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L11b
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            double r5 = r11 - r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r7 = r0.length
            int r7 = r7 - r1
            r0 = r0[r7]
            boolean r0 = r0.linear
            if (r0 == 0) goto Lc7
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r8 = r0.getLinearDX(r3)
            double r8 = r8 * r5
            double r11 = r11 + r8
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getLinearDY(r3)
            double r5 = r5 * r2
            double r11 = r11 + r5
            r13[r1] = r11
            goto Lf6
        Lc7:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            r0.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r3 = r0.getDX()
            double r3 = r3 * r5
            double r11 = r11 + r3
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getDY()
            double r5 = r5 * r2
            double r11 = r11 + r5
            r13[r1] = r11
        Lf6:
            return
        Lf7:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L107
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r2]
            double r11 = r11.mTime1
        L107:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L11b
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            int r12 = r11.length
            int r12 = r12 - r1
            r11 = r11[r12]
            double r11 = r11.mTime2
        L11b:
            r0 = r2
        L11c:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            int r4 = r3.length
            if (r0 >= r4) goto L165
            r3 = r3[r0]
            double r3 = r3.mTime2
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 > 0) goto L162
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            boolean r3 = r3.linear
            if (r3 == 0) goto L146
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            double r3 = r3.getLinearX(r11)
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r10.mArcs
            r0 = r2[r0]
            double r11 = r0.getLinearY(r11)
            r13[r1] = r11
            return
        L146:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            r3.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getX()
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getY()
            r13[r1] = r11
            return
        L162:
            int r0 = r0 + 1
            goto L11c
        L165:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double r11, float[] r13) {
            r10 = this;
            boolean r0 = r10.mExtrapolate
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Leb
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L82
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.mTime1
            double r11 = r11 - r5
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            boolean r0 = r0.linear
            if (r0 == 0) goto L50
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r7 = r0.getLinearDX(r3)
            double r7 = r7 * r11
            double r5 = r5 + r7
            float r0 = (float) r5
            r13[r2] = r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r2 = r0.getLinearDY(r3)
            double r11 = r11 * r2
            double r5 = r5 + r11
            float r11 = (float) r5
            r13[r1] = r11
            goto L81
        L50:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            r0.setPoint(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getX()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDX()
            double r5 = r5 * r11
            double r3 = r3 + r5
            float r0 = (float) r3
            r13[r2] = r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.getY()
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r5 = r0.getDY()
            double r11 = r11 * r5
            double r3 = r3 + r11
            float r11 = (float) r3
            r13[r1] = r11
        L81:
            return
        L82:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L110
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            double r5 = r11 - r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r7 = r0.length
            int r7 = r7 - r1
            r0 = r0[r7]
            boolean r0 = r0.linear
            if (r0 == 0) goto Lcd
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearX(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r8 = r0.getLinearDX(r3)
            double r8 = r8 * r5
            double r11 = r11 + r8
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getLinearY(r3)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            double r2 = r0.getLinearDY(r3)
            double r5 = r5 * r2
            double r11 = r11 + r5
            float r11 = (float) r11
            r13[r1] = r11
            goto Lea
        Lcd:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r7]
            r0.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getX()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r7]
            double r11 = r11.getY()
            float r11 = (float) r11
            r13[r1] = r11
        Lea:
            return
        Leb:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            r0 = r0[r2]
            double r3 = r0.mTime1
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lfc
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r2]
            double r11 = r11.mTime1
            goto L110
        Lfc:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r10.mArcs
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            double r3 = r0.mTime2
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L110
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            int r12 = r11.length
            int r12 = r12 - r1
            r11 = r11[r12]
            double r11 = r11.mTime2
        L110:
            r0 = r2
        L111:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            int r4 = r3.length
            if (r0 >= r4) goto L15e
            r3 = r3[r0]
            double r3 = r3.mTime2
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 > 0) goto L15b
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            boolean r3 = r3.linear
            if (r3 == 0) goto L13d
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            double r3 = r3.getLinearX(r11)
            float r3 = (float) r3
            r13[r2] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r10.mArcs
            r0 = r2[r0]
            double r11 = r0.getLinearY(r11)
            float r11 = (float) r11
            r13[r1] = r11
            return
        L13d:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r10.mArcs
            r3 = r3[r0]
            r3.setPoint(r11)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getX()
            float r11 = (float) r11
            r13[r2] = r11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r11 = r10.mArcs
            r11 = r11[r0]
            double r11 = r11.getY()
            float r11 = (float) r11
            r13[r1] = r11
            return
        L15b:
            int r0 = r0 + 1
            goto L111
        L15e:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double r5, int r7) {
            r4 = this;
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r4.mArcs
            r1 = 0
            r0 = r0[r1]
            double r2 = r0.mTime1
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L11
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r4.mArcs
            r5 = r5[r1]
            double r5 = r5.mTime1
        L11:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r4.mArcs
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            double r2 = r0.mTime2
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r4.mArcs
            int r6 = r5.length
            int r6 = r6 + (-1)
            r5 = r5[r6]
            double r5 = r5.mTime2
        L27:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r4.mArcs
            int r2 = r0.length
            if (r1 >= r2) goto L6e
            r0 = r0[r1]
            double r2 = r0.mTime2
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L6b
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r4.mArcs
            r0 = r0[r1]
            boolean r0 = r0.linear
            if (r0 == 0) goto L50
            if (r7 != 0) goto L47
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r4.mArcs
            r7 = r7[r1]
            double r5 = r7.getLinearDX(r5)
            return r5
        L47:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r4.mArcs
            r7 = r7[r1]
            double r5 = r7.getLinearDY(r5)
            return r5
        L50:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r4.mArcs
            r0 = r0[r1]
            r0.setPoint(r5)
            if (r7 != 0) goto L62
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r4.mArcs
            r5 = r5[r1]
            double r5 = r5.getDX()
            return r5
        L62:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r4.mArcs
            r5 = r5[r1]
            double r5 = r5.getDY()
            return r5
        L6b:
            int r1 = r1 + 1
            goto L27
        L6e:
            r5 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r5
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double r6, double[] r8) {
            r5 = this;
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            r1 = 0
            r0 = r0[r1]
            double r2 = r0.mTime1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L13
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r1]
            double r6 = r6.mTime1
            goto L27
        L13:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            int r3 = r0.length
            int r3 = r3 - r2
            r0 = r0[r3]
            double r3 = r0.mTime2
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L27
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            int r7 = r6.length
            int r7 = r7 - r2
            r6 = r6[r7]
            double r6 = r6.mTime2
        L27:
            r0 = r1
        L28:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r5.mArcs
            int r4 = r3.length
            if (r0 >= r4) goto L71
            r3 = r3[r0]
            double r3 = r3.mTime2
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L6e
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r5.mArcs
            r3 = r3[r0]
            boolean r3 = r3.linear
            if (r3 == 0) goto L52
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r5.mArcs
            r3 = r3[r0]
            double r3 = r3.getLinearDX(r6)
            r8[r1] = r3
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r1 = r5.mArcs
            r0 = r1[r0]
            double r6 = r0.getLinearDY(r6)
            r8[r2] = r6
            return
        L52:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = r5.mArcs
            r3 = r3[r0]
            r3.setPoint(r6)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r0]
            double r6 = r6.getDX()
            r8[r1] = r6
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r0]
            double r6 = r6.getDY()
            r8[r2] = r6
            return
        L6e:
            int r0 = r0 + 1
            goto L28
        L71:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
            r1 = this;
            double[] r0 = r1.mTime
            return r0
    }
}
