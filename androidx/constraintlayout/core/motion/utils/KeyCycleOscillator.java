package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class KeyCycleOscillator {
    private static final java.lang.String TAG = "KeyCycleOscillator";
    private androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    private androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.CycleOscillator mCycleOscillator;
    private java.lang.String mType;
    public int mVariesBy;
    java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint> mWavePoints;
    private int mWaveShape;
    private java.lang.String mWaveString;


    private static class CoreSpline extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String type;
        int typeId;

        public CoreSpline(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(r1)
                r0.typeId = r1
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget r2, float r3) {
                r1 = this;
                int r0 = r1.typeId
                float r3 = r1.get(r3)
                r2.setValue(r0, r3)
                return
        }
    }

    static class CycleOscillator {
        private static final java.lang.String TAG = "CycleOscillator";
        static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
        float[] mOffset;
        androidx.constraintlayout.core.motion.utils.Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int r3, java.lang.String r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                androidx.constraintlayout.core.motion.utils.Oscillator r0 = new androidx.constraintlayout.core.motion.utils.Oscillator
                r0.<init>()
                r2.mOscillator = r0
                r1 = 0
                r2.OFFST = r1
                r1 = 1
                r2.PHASE = r1
                r1 = 2
                r2.VALUE = r1
                r2.mWaveShape = r3
                r2.mVariesBy = r5
                r0.setType(r3, r4)
                float[] r3 = new float[r6]
                r2.mValues = r3
                double[] r3 = new double[r6]
                r2.mPosition = r3
                float[] r3 = new float[r6]
                r2.mPeriod = r3
                float[] r3 = new float[r6]
                r2.mOffset = r3
                float[] r3 = new float[r6]
                r2.mPhase = r3
                float[] r3 = new float[r6]
                r2.mScale = r3
                return
        }

        public double getLastPhase() {
                r3 = this;
                double[] r0 = r3.mSplineValueCache
                r1 = 1
                r1 = r0[r1]
                return r1
        }

        public double getSlope(float r14) {
                r13 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r13.mCurveFit
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L15
                double r4 = (double) r14
                double[] r6 = r13.mSplineSlopeCache
                r0.getSlope(r4, r6)
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r13.mCurveFit
                double[] r6 = r13.mSplineValueCache
                r0.getPos(r4, r6)
                goto L1f
            L15:
                double[] r0 = r13.mSplineSlopeCache
                r4 = 0
                r0[r1] = r4
                r0[r3] = r4
                r0[r2] = r4
            L1f:
                androidx.constraintlayout.core.motion.utils.Oscillator r0 = r13.mOscillator
                double r5 = (double) r14
                double[] r14 = r13.mSplineValueCache
                r7 = r14[r3]
                double r11 = r0.getValue(r5, r7)
                androidx.constraintlayout.core.motion.utils.Oscillator r4 = r13.mOscillator
                double[] r14 = r13.mSplineValueCache
                r7 = r14[r3]
                double[] r14 = r13.mSplineSlopeCache
                r9 = r14[r3]
                double r3 = r4.getSlope(r5, r7, r9)
                double[] r14 = r13.mSplineSlopeCache
                r0 = r14[r1]
                r5 = r14[r2]
                double r11 = r11 * r5
                double r0 = r0 + r11
                double[] r14 = r13.mSplineValueCache
                r5 = r14[r2]
                double r3 = r3 * r5
                double r0 = r0 + r3
                return r0
        }

        public double getValues(float r10) {
                r9 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r9.mCurveFit
                r1 = 2
                r2 = 1
                r3 = 0
                if (r0 == 0) goto Le
                double r4 = (double) r10
                double[] r6 = r9.mSplineValueCache
                r0.getPos(r4, r6)
                goto L25
            Le:
                double[] r0 = r9.mSplineValueCache
                float[] r4 = r9.mOffset
                r4 = r4[r3]
                double r4 = (double) r4
                r0[r3] = r4
                float[] r4 = r9.mPhase
                r4 = r4[r3]
                double r4 = (double) r4
                r0[r2] = r4
                float[] r4 = r9.mValues
                r4 = r4[r3]
                double r4 = (double) r4
                r0[r1] = r4
            L25:
                double[] r0 = r9.mSplineValueCache
                r3 = r0[r3]
                r5 = r0[r2]
                androidx.constraintlayout.core.motion.utils.Oscillator r0 = r9.mOscillator
                double r7 = (double) r10
                double r5 = r0.getValue(r7, r5)
                double[] r10 = r9.mSplineValueCache
                r0 = r10[r1]
                double r5 = r5 * r0
                double r3 = r3 + r5
                return r3
        }

        public void setPoint(int r6, int r7, float r8, float r9, float r10, float r11) {
                r5 = this;
                double[] r0 = r5.mPosition
                double r1 = (double) r7
                r3 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r1 = r1 / r3
                r0[r6] = r1
                float[] r7 = r5.mPeriod
                r7[r6] = r8
                float[] r7 = r5.mOffset
                r7[r6] = r9
                float[] r7 = r5.mPhase
                r7[r6] = r10
                float[] r7 = r5.mValues
                r7[r6] = r11
                return
        }

        public void setup(float r10) {
                r9 = this;
                r9.mPathLength = r10
                double[] r10 = r9.mPosition
                int r10 = r10.length
                r0 = 2
                int[] r1 = new int[r0]
                r2 = 1
                r3 = 3
                r1[r2] = r3
                r3 = 0
                r1[r3] = r10
                java.lang.Class r10 = java.lang.Double.TYPE
                java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r1)
                double[][] r10 = (double[][]) r10
                float[] r1 = r9.mValues
                int r4 = r1.length
                int r4 = r4 + r0
                double[] r4 = new double[r4]
                r9.mSplineValueCache = r4
                int r1 = r1.length
                int r1 = r1 + r0
                double[] r1 = new double[r1]
                r9.mSplineSlopeCache = r1
                double[] r1 = r9.mPosition
                r4 = r1[r3]
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 <= 0) goto L38
                androidx.constraintlayout.core.motion.utils.Oscillator r1 = r9.mOscillator
                float[] r4 = r9.mPeriod
                r4 = r4[r3]
                r1.addPoint(r6, r4)
            L38:
                double[] r1 = r9.mPosition
                int r4 = r1.length
                int r4 = r4 - r2
                r5 = r1[r4]
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 >= 0) goto L4d
                androidx.constraintlayout.core.motion.utils.Oscillator r1 = r9.mOscillator
                float[] r5 = r9.mPeriod
                r4 = r5[r4]
                r1.addPoint(r7, r4)
            L4d:
                r1 = r3
            L4e:
                int r4 = r10.length
                if (r1 >= r4) goto L78
                r4 = r10[r1]
                float[] r5 = r9.mOffset
                r5 = r5[r1]
                double r5 = (double) r5
                r4[r3] = r5
                float[] r5 = r9.mPhase
                r5 = r5[r1]
                double r5 = (double) r5
                r4[r2] = r5
                float[] r5 = r9.mValues
                r5 = r5[r1]
                double r5 = (double) r5
                r4[r0] = r5
                androidx.constraintlayout.core.motion.utils.Oscillator r4 = r9.mOscillator
                double[] r5 = r9.mPosition
                r6 = r5[r1]
                float[] r5 = r9.mPeriod
                r5 = r5[r1]
                r4.addPoint(r6, r5)
                int r1 = r1 + 1
                goto L4e
            L78:
                androidx.constraintlayout.core.motion.utils.Oscillator r0 = r9.mOscillator
                r0.normalize()
                double[] r0 = r9.mPosition
                int r1 = r0.length
                if (r1 <= r2) goto L89
                androidx.constraintlayout.core.motion.utils.CurveFit r10 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r3, r0, r10)
                r9.mCurveFit = r10
                goto L8c
            L89:
                r10 = 0
                r9.mCurveFit = r10
            L8c:
                return
        }
    }

    private static class IntDoubleSort {
        private IntDoubleSort() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partition(int[] r3, float[] r4, int r5, int r6) {
                r0 = r3[r6]
                r1 = r5
            L3:
                if (r5 >= r6) goto L11
                r2 = r3[r5]
                if (r2 > r0) goto Le
                swap(r3, r4, r1, r5)
                int r1 = r1 + 1
            Le:
                int r5 = r5 + 1
                goto L3
            L11:
                swap(r3, r4, r1, r6)
                return r1
        }

        static void sort(int[] r6, float[] r7, int r8, int r9) {
                int r0 = r6.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r9
                r9 = 1
                r0[r9] = r8
                r8 = 2
            Lc:
                if (r8 <= 0) goto L30
                int r8 = r8 + (-1)
                r1 = r0[r8]
                int r8 = r8 + (-1)
                r2 = r0[r8]
                if (r1 >= r2) goto Lc
                int r3 = partition(r6, r7, r1, r2)
                int r4 = r8 + 1
                int r5 = r3 + (-1)
                r0[r8] = r5
                int r8 = r4 + 1
                r0[r4] = r1
                int r1 = r8 + 1
                r0[r8] = r2
                int r8 = r1 + 1
                int r3 = r3 + r9
                r0[r1] = r3
                goto Lc
            L30:
                return
        }

        private static void swap(int[] r2, float[] r3, int r4, int r5) {
                r0 = r2[r4]
                r1 = r2[r5]
                r2[r4] = r1
                r2[r5] = r0
                r2 = r3[r4]
                r0 = r3[r5]
                r3[r4] = r0
                r3[r5] = r2
                return
        }
    }

    private static class IntFloatFloatSort {
        private IntFloatFloatSort() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partition(int[] r3, float[] r4, float[] r5, int r6, int r7) {
                r0 = r3[r7]
                r1 = r6
            L3:
                if (r6 >= r7) goto L11
                r2 = r3[r6]
                if (r2 > r0) goto Le
                swap(r3, r4, r5, r1, r6)
                int r1 = r1 + 1
            Le:
                int r6 = r6 + 1
                goto L3
            L11:
                swap(r3, r4, r5, r1, r7)
                return r1
        }

        static void sort(int[] r6, float[] r7, float[] r8, int r9, int r10) {
                int r0 = r6.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r10
                r10 = 1
                r0[r10] = r9
                r9 = 2
            Lc:
                if (r9 <= 0) goto L30
                int r9 = r9 + (-1)
                r1 = r0[r9]
                int r9 = r9 + (-1)
                r2 = r0[r9]
                if (r1 >= r2) goto Lc
                int r3 = partition(r6, r7, r8, r1, r2)
                int r4 = r9 + 1
                int r5 = r3 + (-1)
                r0[r9] = r5
                int r9 = r4 + 1
                r0[r4] = r1
                int r1 = r9 + 1
                r0[r9] = r2
                int r9 = r1 + 1
                int r3 = r3 + r10
                r0[r1] = r3
                goto Lc
            L30:
                return
        }

        private static void swap(int[] r2, float[] r3, float[] r4, int r5, int r6) {
                r0 = r2[r5]
                r1 = r2[r6]
                r2[r5] = r1
                r2[r6] = r0
                r2 = r3[r5]
                r0 = r3[r6]
                r3[r5] = r0
                r3[r6] = r2
                r2 = r4[r5]
                r3 = r4[r6]
                r4[r5] = r3
                r4[r6] = r2
                return
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
        java.lang.String type;
        int typeId;

        public PathRotateSet(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.getId(r1)
                r0.typeId = r1
                return
        }

        public void setPathRotate(androidx.constraintlayout.core.motion.MotionWidget r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.get(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotationZ(r2)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget r2, float r3) {
                r1 = this;
                int r0 = r1.typeId
                float r3 = r1.get(r3)
                r2.setValue(r0, r3)
                return
        }
    }

    static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int r1, float r2, float r3, float r4, float r5) {
                r0 = this;
                r0.<init>()
                r0.mPosition = r1
                r0.mValue = r5
                r0.mOffset = r3
                r0.mPeriod = r2
                r0.mPhase = r4
                return
        }
    }

    public KeyCycleOscillator() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mWaveShape = r0
            r1 = 0
            r2.mWaveString = r1
            r2.mVariesBy = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mWavePoints = r0
            return
    }

    public static androidx.constraintlayout.core.motion.utils.KeyCycleOscillator makeWidgetCycle(java.lang.String r1) {
            java.lang.String r0 = "pathRotate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$PathRotateSet r0 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$PathRotateSet
            r0.<init>(r1)
            return r0
        Le:
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CoreSpline r0 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CoreSpline
            r0.<init>(r1)
            return r0
    }

    public float get(float r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator r0 = r2.mCycleOscillator
            double r0 = r0.getValues(r3)
            float r3 = (float) r0
            return r3
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public float getSlope(float r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator r0 = r2.mCycleOscillator
            double r0 = r0.getSlope(r3)
            float r3 = (float) r0
            return r3
    }

    protected void setCustom(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void setPoint(int r11, int r12, java.lang.String r13, int r14, float r15, float r16, float r17, float r18) {
            r10 = this;
            r0 = r10
            r1 = r14
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r2 = r0.mWavePoints
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint r9 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint
            r3 = r9
            r4 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            r2.add(r9)
            r2 = -1
            if (r1 == r2) goto L1a
            r0.mVariesBy = r1
        L1a:
            r1 = r12
            r0.mWaveShape = r1
            r1 = r13
            r0.mWaveString = r1
            return
    }

    public void setPoint(int r11, int r12, java.lang.String r13, int r14, float r15, float r16, float r17, float r18, java.lang.Object r19) {
            r10 = this;
            r0 = r10
            r1 = r14
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r2 = r0.mWavePoints
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint r9 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint
            r3 = r9
            r4 = r11
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            r2.add(r9)
            r2 = -1
            if (r1 == r2) goto L1a
            r0.mVariesBy = r1
        L1a:
            r1 = r12
            r0.mWaveShape = r1
            r1 = r19
            r10.setCustom(r1)
            r1 = r13
            r0.mWaveString = r1
            return
    }

    public void setProperty(androidx.constraintlayout.core.motion.MotionWidget r1, float r2) {
            r0 = this;
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(float r15) {
            r14 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r0 = r14.mWavePoints
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r1 = r14.mWavePoints
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$1 r2 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$1
            r2.<init>(r14)
            java.util.Collections.sort(r1, r2)
            double[] r1 = new double[r0]
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 1
            r5 = 3
            r3[r4] = r5
            r5 = 0
            r3[r5] = r0
            java.lang.Class r6 = java.lang.Double.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r6, r3)
            double[][] r3 = (double[][]) r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator r6 = new androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator
            int r7 = r14.mWaveShape
            java.lang.String r8 = r14.mWaveString
            int r9 = r14.mVariesBy
            r6.<init>(r7, r8, r9, r0)
            r14.mCycleOscillator = r6
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r0 = r14.mWavePoints
            java.util.Iterator r0 = r0.iterator()
            r13 = r5
        L3b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r0.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint r6 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint) r6
            float r7 = r6.mPeriod
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r1[r13] = r7
            r7 = r3[r13]
            float r8 = r6.mValue
            double r8 = (double) r8
            r7[r5] = r8
            r7 = r3[r13]
            float r8 = r6.mOffset
            double r8 = (double) r8
            r7[r4] = r8
            r7 = r3[r13]
            float r8 = r6.mPhase
            double r8 = (double) r8
            r7[r2] = r8
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator r7 = r14.mCycleOscillator
            int r8 = r6.mPosition
            float r9 = r6.mPeriod
            float r10 = r6.mOffset
            float r11 = r6.mPhase
            float r12 = r6.mValue
            r6 = r7
            r7 = r13
            r6.setPoint(r7, r8, r9, r10, r11, r12)
            int r13 = r13 + r4
            goto L3b
        L7a:
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$CycleOscillator r0 = r14.mCycleOscillator
            r0.setup(r15)
            androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r5, r1, r3)
            r14.mCurveFit = r15
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            java.util.ArrayList<androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint> r2 = r5.mWavePoints
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.WavePoint) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = "["
            java.lang.StringBuilder r0 = r0.append(r4)
            int r4 = r3.mPosition
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = " , "
            java.lang.StringBuilder r0 = r0.append(r4)
            float r3 = r3.mValue
            double r3 = (double) r3
            java.lang.String r3 = r1.format(r3)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = "] "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto Lf
        L4c:
            return r0
    }

    public boolean variesByPath() {
            r2 = this;
            int r0 = r2.mVariesBy
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }
}
