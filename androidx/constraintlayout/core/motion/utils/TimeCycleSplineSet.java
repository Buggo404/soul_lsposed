package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final java.lang.String TAG = "SplineSet";
    protected static float VAL_2PI = 6.2831855f;
    protected int count;
    protected float last_cycle;
    protected long last_time;
    protected float[] mCache;
    protected boolean mContinue;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    protected int[] mTimePoints;
    protected java.lang.String mType;
    protected float[][] mValues;
    protected int mWaveShape;

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties;

        public CustomSet(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray r3) {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r0 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray
                r0.<init>()
                r1.mWaveProperties = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r3, androidx.constraintlayout.core.motion.CustomAttribute r4, float r5, int r6, float r7) {
                r2 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r4 = r2.mWaveProperties
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r7
                r4.append(r3, r0)
                int r3 = r2.mWaveShape
                int r3 = java.lang.Math.max(r3, r6)
                r2.mWaveShape = r3
                return
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget r17, float r18, long r19, androidx.constraintlayout.core.motion.utils.KeyCache r21) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                androidx.constraintlayout.core.motion.utils.CurveFit r4 = r0.mCurveFit
                r5 = r18
                double r5 = (double) r5
                float[] r7 = r0.mTempValues
                r4.getPos(r5, r7)
                float[] r4 = r0.mTempValues
                int r5 = r4.length
                int r5 = r5 + (-2)
                r5 = r4[r5]
                int r6 = r4.length
                r7 = 1
                int r6 = r6 - r7
                r4 = r4[r6]
                long r8 = r0.last_time
                long r8 = r2 - r8
                float r6 = r0.last_cycle
                boolean r6 = java.lang.Float.isNaN(r6)
                r10 = 0
                r11 = 0
                if (r6 == 0) goto L3e
                java.lang.String r6 = r0.mAttributeName
                r12 = r21
                float r6 = r12.getFloatValue(r1, r6, r11)
                r0.last_cycle = r6
                float r6 = r0.last_cycle
                boolean r6 = java.lang.Float.isNaN(r6)
                if (r6 == 0) goto L3e
                r0.last_cycle = r10
            L3e:
                float r6 = r0.last_cycle
                double r12 = (double) r6
                double r8 = (double) r8
                r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r8 = r8 * r14
                double r14 = (double) r5
                double r8 = r8 * r14
                double r12 = r12 + r8
                r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r12 = r12 % r8
                float r6 = (float) r12
                r0.last_cycle = r6
                r0.last_time = r2
                float r2 = r0.last_cycle
                float r2 = r0.calcWave(r2)
                r0.mContinue = r11
                r3 = r11
            L5c:
                float[] r6 = r0.mCache
                int r6 = r6.length
                if (r3 >= r6) goto L81
                boolean r6 = r0.mContinue
                float[] r8 = r0.mTempValues
                r8 = r8[r3]
                double r8 = (double) r8
                r12 = 0
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 == 0) goto L70
                r8 = r7
                goto L71
            L70:
                r8 = r11
            L71:
                r6 = r6 | r8
                r0.mContinue = r6
                float[] r6 = r0.mCache
                float[] r8 = r0.mTempValues
                r8 = r8[r3]
                float r8 = r8 * r2
                float r8 = r8 + r4
                r6[r3] = r8
                int r3 = r3 + 1
                goto L5c
            L81:
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r2 = r0.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomAttribute r2 = r2.valueAt(r11)
                float[] r3 = r0.mCache
                r1.setInterpolatedValue(r2, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L92
                r0.mContinue = r7
            L92:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r1 = r14.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomAttribute r1 = r1.valueAt(r2)
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.mTempValues = r5
                float[] r5 = new float[r1]
                r14.mCache = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class r4 = java.lang.Double.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = r2
            L2e:
                if (r5 >= r0) goto L71
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r8 = r14.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomAttribute r8 = r8.valueAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r9 = r14.mWaveProperties
                float[] r9 = r9.valueAt(r5)
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = r2
            L51:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L60
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L51
            L60:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L2e
            L71:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    public static class CustomVarSet extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.FloatArray mWaveProperties;

        public CustomVarSet(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar r3) {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r0 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray
                r0.<init>()
                r1.mWaveProperties = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r3, androidx.constraintlayout.core.motion.CustomVariable r4, float r5, int r6, float r7) {
                r2 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r4 = r2.mWaveProperties
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r7
                r4.append(r3, r0)
                int r3 = r2.mWaveShape
                int r3 = java.lang.Math.max(r3, r6)
                r2.mWaveShape = r3
                return
        }

        public boolean setProperty(androidx.constraintlayout.core.motion.MotionWidget r17, float r18, long r19, androidx.constraintlayout.core.motion.utils.KeyCache r21) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                androidx.constraintlayout.core.motion.utils.CurveFit r4 = r0.mCurveFit
                r5 = r18
                double r5 = (double) r5
                float[] r7 = r0.mTempValues
                r4.getPos(r5, r7)
                float[] r4 = r0.mTempValues
                int r5 = r4.length
                int r5 = r5 + (-2)
                r5 = r4[r5]
                int r6 = r4.length
                r7 = 1
                int r6 = r6 - r7
                r4 = r4[r6]
                long r8 = r0.last_time
                long r8 = r2 - r8
                float r6 = r0.last_cycle
                boolean r6 = java.lang.Float.isNaN(r6)
                r10 = 0
                r11 = 0
                if (r6 == 0) goto L3e
                java.lang.String r6 = r0.mAttributeName
                r12 = r21
                float r6 = r12.getFloatValue(r1, r6, r11)
                r0.last_cycle = r6
                float r6 = r0.last_cycle
                boolean r6 = java.lang.Float.isNaN(r6)
                if (r6 == 0) goto L3e
                r0.last_cycle = r10
            L3e:
                float r6 = r0.last_cycle
                double r12 = (double) r6
                double r8 = (double) r8
                r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r8 = r8 * r14
                double r14 = (double) r5
                double r8 = r8 * r14
                double r12 = r12 + r8
                r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r12 = r12 % r8
                float r6 = (float) r12
                r0.last_cycle = r6
                r0.last_time = r2
                float r2 = r0.last_cycle
                float r2 = r0.calcWave(r2)
                r0.mContinue = r11
                r3 = r11
            L5c:
                float[] r6 = r0.mCache
                int r6 = r6.length
                if (r3 >= r6) goto L81
                boolean r6 = r0.mContinue
                float[] r8 = r0.mTempValues
                r8 = r8[r3]
                double r8 = (double) r8
                r12 = 0
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 == 0) goto L70
                r8 = r7
                goto L71
            L70:
                r8 = r11
            L71:
                r6 = r6 | r8
                r0.mContinue = r6
                float[] r6 = r0.mCache
                float[] r8 = r0.mTempValues
                r8 = r8[r3]
                float r8 = r8 * r2
                float r8 = r8 + r4
                r6[r3] = r8
                int r3 = r3 + 1
                goto L5c
            L81:
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r2 = r0.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomVariable r2 = r2.valueAt(r11)
                float[] r3 = r0.mCache
                r2.setInterpolatedValue(r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L92
                r0.mContinue = r7
            L92:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r1 = r14.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomVariable r1 = r1.valueAt(r2)
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.mTempValues = r5
                float[] r5 = new float[r1]
                r14.mCache = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class r4 = java.lang.Double.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = r2
            L2e:
                if (r5 >= r0) goto L71
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r8 = r14.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomVariable r8 = r8.valueAt(r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$FloatArray r9 = r14.mWaveProperties
                float[] r9 = r9.valueAt(r5)
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = r2
            L51:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L60
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L51
            L60:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L2e
            L71:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    protected static class Sort {
        protected Sort() {
                r0 = this;
                r0.<init>()
                return
        }

        static void doubleQuickSort(int[] r6, float[][] r7, int r8, int r9) {
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

        private static int partition(int[] r3, float[][] r4, int r5, int r6) {
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

        private static void swap(int[] r2, float[][] r3, int r4, int r5) {
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

    static {
            return
    }

    public TimeCycleSplineSet() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mWaveShape = r0
            r1 = 10
            int[] r1 = new int[r1]
            r3.mTimePoints = r1
            r1 = 2
            int[] r1 = new int[r1]
            r1 = {x0028: FILL_ARRAY_DATA , data: [10, 3} // fill-array
            java.lang.Class r2 = java.lang.Float.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            float[][] r1 = (float[][]) r1
            r3.mValues = r1
            r1 = 3
            float[] r1 = new float[r1]
            r3.mCache = r1
            r3.mContinue = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.last_cycle = r0
            return
    }

    protected float calcWave(float r4) {
            r3 = this;
            int r0 = r3.mWaveShape
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            switch(r0) {
                case 1: goto L39;
                case 2: goto L34;
                case 3: goto L2f;
                case 4: goto L2b;
                case 5: goto L21;
                case 6: goto L13;
                default: goto L9;
            }
        L9:
            float r0 = androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.sin(r0)
            float r4 = (float) r0
            return r4
        L13:
            r0 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r0
            float r4 = r4 % r0
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            float r4 = r2 - r4
            float r4 = r4 * r4
        L1f:
            float r2 = r2 - r4
            return r2
        L21:
            float r0 = androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.cos(r0)
            float r4 = (float) r0
            return r4
        L2b:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            goto L1f
        L2f:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            float r4 = r4 - r2
            return r4
        L34:
            float r4 = java.lang.Math.abs(r4)
            goto L1f
        L39:
            float r0 = androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.VAL_2PI
            float r4 = r4 * r0
            float r4 = java.lang.Math.signum(r4)
            return r4
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public void setPoint(int r3, float r4, float r5, int r6, float r7) {
            r2 = this;
            int[] r0 = r2.mTimePoints
            int r1 = r2.count
            r0[r1] = r3
            float[][] r3 = r2.mValues
            r3 = r3[r1]
            r0 = 0
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r5 = 2
            r3[r5] = r7
            int r3 = r2.mWaveShape
            int r3 = java.lang.Math.max(r3, r6)
            r2.mWaveShape = r3
            int r3 = r2.count
            int r3 = r3 + r4
            r2.count = r3
            return
    }

    protected void setStartTime(long r1) {
            r0 = this;
            r0.last_time = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(int r12) {
            r11 = this;
            int r0 = r11.count
            if (r0 != 0) goto L1b
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error no points added to "
            r0.<init>(r1)
            java.lang.String r1 = r11.mType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L1b:
            int[] r1 = r11.mTimePoints
            float[][] r2 = r11.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L27:
            int[] r2 = r11.mTimePoints
            int r5 = r2.length
            if (r0 >= r5) goto L39
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L36
            int r1 = r1 + 1
        L36:
            int r0 = r0 + 1
            goto L27
        L39:
            if (r1 != 0) goto L3c
            r1 = r3
        L3c:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L50:
            int r7 = r11.count
            if (r5 >= r7) goto L88
            if (r5 <= 0) goto L61
            int[] r7 = r11.mTimePoints
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L61
            goto L85
        L61:
            int[] r7 = r11.mTimePoints
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.mValues
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L85:
            int r5 = r5 + 1
            goto L50
        L88:
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r0, r1)
            r11.mCurveFit = r12
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.count
            if (r2 >= r3) goto L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r4.mTimePoints
            r3 = r3[r2]
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = " , "
            java.lang.StringBuilder r0 = r0.append(r3)
            float[][] r3 = r4.mValues
            r3 = r3[r2]
            java.lang.String r3 = r1.format(r3)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = "] "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L44:
            return r0
    }
}
