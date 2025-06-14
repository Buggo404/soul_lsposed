package androidx.constraintlayout.motion.utils;

/* loaded from: classes.dex */
public abstract class ViewTimeCycle extends androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet {
    private static final java.lang.String TAG = "ViewTimeCycle";

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setAlpha(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        java.lang.String mAttributeName;
        float[] mCache;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        android.util.SparseArray<float[]> mWaveProperties;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
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

        public void setPoint(int r3, androidx.constraintlayout.widget.ConstraintAttribute r4, float r5, int r6, float r7) {
                r2 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mConstraintAttributeList
                r0.append(r3, r4)
                android.util.SparseArray<float[]> r4 = r2.mWaveProperties
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

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r17, float r18, long r19, androidx.constraintlayout.core.motion.utils.KeyCache r21) {
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
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r0.mConstraintAttributeList
                java.lang.Object r2 = r2.valueAt(r11)
                androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
                float[] r3 = r0.mCache
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r2, r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L94
                r0.mContinue = r7
            L94:
                boolean r1 = r0.mContinue
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int r15) {
                r14 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r14.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r14.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
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
            L30:
                if (r5 >= r0) goto L77
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r7 = r14.mConstraintAttributeList
                int r7 = r7.keyAt(r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r8 = r14.mConstraintAttributeList
                java.lang.Object r8 = r8.valueAt(r5)
                androidx.constraintlayout.widget.ConstraintAttribute r8 = (androidx.constraintlayout.widget.ConstraintAttribute) r8
                android.util.SparseArray<float[]> r9 = r14.mWaveProperties
                java.lang.Object r9 = r9.valueAt(r5)
                float[] r9 = (float[]) r9
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.mTempValues
                r8.getValuesToInterpolate(r7)
                r7 = r2
            L57:
                float[] r8 = r14.mTempValues
                int r10 = r8.length
                if (r7 >= r10) goto L66
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L57
            L66:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L30
            L77:
                androidx.constraintlayout.core.motion.utils.CurveFit r15 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r15, r3, r4)
                r14.mCurveFit = r15
                return
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setElevation(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        public PathRotate() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean setPathRotate(android.view.View r7, androidx.constraintlayout.core.motion.utils.KeyCache r8, float r9, long r10, double r12, double r14) {
                r6 = this;
                r0 = r6
                r1 = r9
                r2 = r10
                r4 = r7
                r5 = r8
                float r8 = r0.get(r1, r2, r4, r5)
                double r9 = java.lang.Math.atan2(r14, r12)
                double r9 = java.lang.Math.toDegrees(r9)
                float r9 = (float) r9
                float r8 = r8 + r9
                r7.setRotation(r8)
                boolean r7 = r6.mContinue
                return r7
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.core.motion.utils.KeyCache r5) {
                r0 = this;
                boolean r1 = r0.mContinue
                return r1
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r14, float r15, long r16, androidx.constraintlayout.core.motion.utils.KeyCache r18) {
                r13 = this;
                r7 = r13
                r0 = r14
                java.lang.String r8 = "unable to setProgress"
                java.lang.String r9 = "ViewTimeCycle"
                boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r1 == 0) goto L1c
                r8 = r0
                androidx.constraintlayout.motion.widget.MotionLayout r8 = (androidx.constraintlayout.motion.widget.MotionLayout) r8
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r0 = r1.get(r2, r3, r5, r6)
                r8.setProgress(r0)
                goto L5a
            L1c:
                boolean r1 = r7.mNoMethod
                r10 = 0
                if (r1 == 0) goto L22
                return r10
            L22:
                r1 = 1
                java.lang.Class r2 = r14.getClass()     // Catch: java.lang.NoSuchMethodException -> L34
                java.lang.String r3 = "setProgress"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L34
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L34
                r4[r10] = r5     // Catch: java.lang.NoSuchMethodException -> L34
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L34
                goto L37
            L34:
                r7.mNoMethod = r1
                r2 = 0
            L37:
                r11 = r2
                if (r11 == 0) goto L5a
                java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L56
                r1 = r13
                r2 = r15
                r3 = r16
                r5 = r14
                r6 = r18
                float r1 = r1.get(r2, r3, r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L56
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L56
                r12[r10] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L56
                r11.invoke(r14, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L51 java.lang.IllegalAccessException -> L56
                goto L5a
            L51:
                r0 = move-exception
                android.util.Log.e(r9, r8, r0)
                goto L5a
            L56:
                r0 = move-exception
                android.util.Log.e(r9, r8, r0)
            L5a:
                boolean r0 = r7.mContinue
                return r0
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotation(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotationX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setRotationY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setScaleX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setScaleY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationX(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationY(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewTimeCycle {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(android.view.View r7, float r8, long r9, androidx.constraintlayout.core.motion.utils.KeyCache r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.get(r1, r2, r4, r5)
                r7.setTranslationZ(r8)
                boolean r7 = r6.mContinue
                return r7
        }
    }

    public ViewTimeCycle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet r0 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.motion.utils.ViewTimeCycle makeSpline(java.lang.String r2, long r3) {
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto L92;
                case -1249320805: goto L87;
                case -1225497657: goto L7c;
                case -1225497656: goto L71;
                case -1225497655: goto L66;
                case -1001078227: goto L5b;
                case -908189618: goto L50;
                case -908189617: goto L45;
                case -40300674: goto L37;
                case -4379043: goto L29;
                case 37232917: goto L1b;
                case 92909918: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9c
        Ld:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto L9c
        L17:
            r1 = 11
            goto L9c
        L1b:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            goto L9c
        L25:
            r1 = 10
            goto L9c
        L29:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto L9c
        L33:
            r1 = 9
            goto L9c
        L37:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L9c
        L41:
            r1 = 8
            goto L9c
        L45:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L9c
        L4e:
            r1 = 7
            goto L9c
        L50:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L59
            goto L9c
        L59:
            r1 = 6
            goto L9c
        L5b:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L64
            goto L9c
        L64:
            r1 = 5
            goto L9c
        L66:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6f
            goto L9c
        L6f:
            r1 = 4
            goto L9c
        L71:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7a
            goto L9c
        L7a:
            r1 = 3
            goto L9c
        L7c:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L85
            goto L9c
        L85:
            r1 = 2
            goto L9c
        L87:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L90
            goto L9c
        L90:
            r1 = 1
            goto L9c
        L92:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9b
            goto L9c
        L9b:
            r1 = 0
        L9c:
            switch(r1) {
                case 0: goto Le3;
                case 1: goto Ldd;
                case 2: goto Ld7;
                case 3: goto Ld1;
                case 4: goto Lcb;
                case 5: goto Lc5;
                case 6: goto Lbf;
                case 7: goto Lb9;
                case 8: goto Lb3;
                case 9: goto Lad;
                case 10: goto La7;
                case 11: goto La1;
                default: goto L9f;
            }
        L9f:
            r2 = 0
            return r2
        La1:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$AlphaSet
            r2.<init>()
            goto Le8
        La7:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate
            r2.<init>()
            goto Le8
        Lad:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ElevationSet
            r2.<init>()
            goto Le8
        Lb3:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationSet
            r2.<init>()
            goto Le8
        Lb9:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleYset
            r2.<init>()
            goto Le8
        Lbf:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ScaleXset
            r2.<init>()
            goto Le8
        Lc5:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$ProgressSet
            r2.<init>()
            goto Le8
        Lcb:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationZset
            r2.<init>()
            goto Le8
        Ld1:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationYset
            r2.<init>()
            goto Le8
        Ld7:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$TranslationXset
            r2.<init>()
            goto Le8
        Ldd:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationYset
            r2.<init>()
            goto Le8
        Le3:
            androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewTimeCycle$RotationXset
            r2.<init>()
        Le8:
            r2.setStartTime(r3)
            return r2
    }

    public float get(float r18, long r19, android.view.View r21, androidx.constraintlayout.core.motion.utils.KeyCache r22) {
            r17 = this;
            r0 = r17
            r1 = r19
            r3 = r21
            r4 = r22
            androidx.constraintlayout.core.motion.utils.CurveFit r5 = r0.mCurveFit
            r6 = r18
            double r6 = (double) r6
            float[] r8 = r0.mCache
            r5.getPos(r6, r8)
            float[] r5 = r0.mCache
            r6 = 1
            r5 = r5[r6]
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r9 = 2
            r10 = 0
            if (r8 != 0) goto L25
            r0.mContinue = r10
            float[] r1 = r0.mCache
            r1 = r1[r9]
            return r1
        L25:
            float r11 = r0.last_cycle
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L3f
            java.lang.String r11 = r0.mType
            float r11 = r4.getFloatValue(r3, r11, r10)
            r0.last_cycle = r11
            float r11 = r0.last_cycle
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 == 0) goto L3f
            r0.last_cycle = r7
        L3f:
            long r11 = r0.last_time
            long r11 = r1 - r11
            float r13 = r0.last_cycle
            double r13 = (double) r13
            double r11 = (double) r11
            r15 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r11 = r11 * r15
            double r6 = (double) r5
            double r11 = r11 * r6
            double r13 = r13 + r11
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 % r5
            float r5 = (float) r13
            r0.last_cycle = r5
            java.lang.String r5 = r0.mType
            float r6 = r0.last_cycle
            r4.setFloatValue(r3, r5, r10, r6)
            r0.last_time = r1
            float[] r1 = r0.mCache
            r1 = r1[r10]
            float r2 = r0.last_cycle
            float r2 = r0.calcWave(r2)
            float[] r3 = r0.mCache
            r3 = r3[r9]
            float r2 = r2 * r1
            float r2 = r2 + r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L79
            if (r8 == 0) goto L77
            goto L79
        L77:
            r6 = r10
            goto L7a
        L79:
            r6 = 1
        L7a:
            r0.mContinue = r6
            return r2
    }

    public abstract boolean setProperty(android.view.View r1, float r2, long r3, androidx.constraintlayout.core.motion.utils.KeyCache r5);
}
