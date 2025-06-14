package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class SplineSet {
    private static final java.lang.String TAG = "SplineSet";
    private int count;
    protected androidx.constraintlayout.core.motion.utils.CurveFit mCurveFit;
    protected int[] mTimePoints;
    private java.lang.String mType;
    protected float[] mValues;

    private static class CoreSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        long start;
        java.lang.String type;

        public CoreSpline(java.lang.String r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.start = r2
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues r2, float r3) {
                r1 = this;
                java.lang.String r0 = r1.type
                int r0 = r2.getId(r0)
                float r3 = r1.get(r3)
                r2.setValue(r0, r3)
                return
        }
    }

    public static class CustomSet extends androidx.constraintlayout.core.motion.utils.SplineSet {
        java.lang.String mAttributeName;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r2, androidx.constraintlayout.core.motion.CustomAttribute r3) {
                r1 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r1.mConstraintAttributeList
                r0.append(r2, r3)
                return
        }

        public void setProperty(androidx.constraintlayout.core.state.WidgetFrame r4, float r5) {
                r3 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
                double r1 = (double) r5
                float[] r5 = r3.mTempValues
                r0.getPos(r1, r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r5 = r3.mConstraintAttributeList
                r0 = 0
                androidx.constraintlayout.core.motion.CustomAttribute r5 = r5.valueAt(r0)
                float[] r0 = r3.mTempValues
                r4.setCustomValue(r5, r0)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int r12) {
                r11 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r0 = r11.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r1 = r11.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomAttribute r1 = r1.valueAt(r2)
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.mTempValues = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = r2
            L28:
                if (r4 >= r0) goto L57
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r5 = r11.mConstraintAttributeList
                int r5 = r5.keyAt(r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomArray r6 = r11.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomAttribute r6 = r6.valueAt(r4)
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.mTempValues
                r6.getValuesToInterpolate(r5)
                r5 = r2
            L45:
                float[] r6 = r11.mTempValues
                int r7 = r6.length
                if (r5 >= r7) goto L54
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L45
            L54:
                int r4 = r4 + 1
                goto L28
            L57:
                androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r3, r1)
                r11.mCurveFit = r12
                return
        }
    }

    public static class CustomSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
        java.lang.String mAttributeName;
        androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;

        public CustomSpline(java.lang.String r2, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.mAttributeName = r2
                r1.mConstraintAttributeList = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        public void setPoint(int r2, androidx.constraintlayout.core.motion.CustomVariable r3) {
                r1 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r1.mConstraintAttributeList
                r0.append(r2, r3)
                return
        }

        public void setProperty(androidx.constraintlayout.core.motion.MotionWidget r4, float r5) {
                r3 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
                double r1 = (double) r5
                float[] r5 = r3.mTempValues
                r0.getPos(r1, r5)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r5 = r3.mConstraintAttributeList
                r0 = 0
                androidx.constraintlayout.core.motion.CustomVariable r5 = r5.valueAt(r0)
                float[] r0 = r3.mTempValues
                r5.setInterpolatedValue(r4, r0)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues r1, float r2) {
                r0 = this;
                androidx.constraintlayout.core.motion.MotionWidget r1 = (androidx.constraintlayout.core.motion.MotionWidget) r1
                r0.setProperty(r1, r2)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int r12) {
                r11 = this;
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r0 = r11.mConstraintAttributeList
                int r0 = r0.size()
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r1 = r11.mConstraintAttributeList
                r2 = 0
                androidx.constraintlayout.core.motion.CustomVariable r1 = r1.valueAt(r2)
                int r1 = r1.numberOfInterpolatedValues()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.mTempValues = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = r2
            L28:
                if (r4 >= r0) goto L57
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r5 = r11.mConstraintAttributeList
                int r5 = r5.keyAt(r4)
                androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r6 = r11.mConstraintAttributeList
                androidx.constraintlayout.core.motion.CustomVariable r6 = r6.valueAt(r4)
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.mTempValues
                r6.getValuesToInterpolate(r5)
                r5 = r2
            L45:
                float[] r6 = r11.mTempValues
                int r7 = r6.length
                if (r5 >= r7) goto L54
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L45
            L54:
                int r4 = r4 + 1
                goto L28
            L57:
                androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r3, r1)
                r11.mCurveFit = r12
                return
        }
    }

    private static class Sort {
        private Sort() {
                r0 = this;
                r0.<init>()
                return
        }

        static void doubleQuickSort(int[] r6, float[] r7, int r8, int r9) {
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

    public SplineSet() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r2.mTimePoints = r1
            float[] r0 = new float[r0]
            r2.mValues = r0
            return
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSpline(java.lang.String r1, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray r2) {
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSet r0 = new androidx.constraintlayout.core.motion.utils.SplineSet$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeCustomSplineSet(java.lang.String r1, androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar r2) {
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r0 = new androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.core.motion.utils.SplineSet makeSpline(java.lang.String r1, long r2) {
            androidx.constraintlayout.core.motion.utils.SplineSet$CoreSpline r0 = new androidx.constraintlayout.core.motion.utils.SplineSet$CoreSpline
            r0.<init>(r1, r2)
            return r0
    }

    public float get(float r4) {
            r3 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.getPos(r1, r4)
            float r4 = (float) r0
            return r4
    }

    public androidx.constraintlayout.core.motion.utils.CurveFit getCurveFit() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r1.mCurveFit
            return r0
    }

    public float getSlope(float r4) {
            r3 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.getSlope(r1, r4)
            float r4 = (float) r0
            return r4
    }

    public void setPoint(int r4, float r5) {
            r3 = this;
            int[] r0 = r3.mTimePoints
            int r1 = r0.length
            int r2 = r3.count
            int r2 = r2 + 1
            if (r1 >= r2) goto L1d
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mTimePoints = r0
            float[] r0 = r3.mValues
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mValues = r0
        L1d:
            int[] r0 = r3.mTimePoints
            int r1 = r3.count
            r0[r1] = r4
            float[] r4 = r3.mValues
            r4[r1] = r5
            int r1 = r1 + 1
            r3.count = r1
            return
    }

    public void setProperty(androidx.constraintlayout.core.motion.utils.TypedValues r2, float r3) {
            r1 = this;
            java.lang.String r0 = r1.mType
            int r0 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(r0)
            float r3 = r1.get(r3)
            r2.setValue(r0, r3)
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setup(int r10) {
            r9 = this;
            int r0 = r9.count
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.mTimePoints
            float[] r2 = r9.mValues
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            androidx.constraintlayout.core.motion.utils.SplineSet.Sort.doubleQuickSort(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.count
            if (r0 >= r2) goto L24
            int[] r2 = r9.mTimePoints
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.count
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.mTimePoints
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.mTimePoints
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.mValues
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            androidx.constraintlayout.core.motion.utils.CurveFit r10 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r10, r0, r1)
            r9.mCurveFit = r10
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.mType
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r5.count
            if (r2 >= r3) goto L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r5.mTimePoints
            r3 = r3[r2]
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = " , "
            java.lang.StringBuilder r0 = r0.append(r3)
            float[] r3 = r5.mValues
            r3 = r3[r2]
            double r3 = (double) r3
            java.lang.String r3 = r1.format(r3)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = "] "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto La
        L45:
            return r0
    }
}
