package androidx.constraintlayout.motion.utils;

/* loaded from: classes.dex */
public abstract class ViewSpline extends androidx.constraintlayout.core.motion.utils.SplineSet {
    private static final java.lang.String TAG = "ViewSpline";

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        java.lang.String mAttributeName;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r3) {
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

        public void setPoint(int r2, androidx.constraintlayout.widget.ConstraintAttribute r3) {
                r1 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mConstraintAttributeList
                r0.append(r2, r3)
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r4, float r5) {
                r3 = this;
                androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mCurveFit
                double r1 = (double) r5
                float[] r5 = r3.mTempValues
                r0.getPos(r1, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r3.mConstraintAttributeList
                r0 = 0
                java.lang.Object r5 = r5.valueAt(r0)
                androidx.constraintlayout.widget.ConstraintAttribute r5 = (androidx.constraintlayout.widget.ConstraintAttribute) r5
                float[] r0 = r3.mTempValues
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r5, r4, r0)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int r12) {
                r11 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r0 = r11.mConstraintAttributeList
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r1 = r11.mConstraintAttributeList
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
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
            L2a:
                if (r4 >= r0) goto L5b
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r5 = r11.mConstraintAttributeList
                int r5 = r5.keyAt(r4)
                android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r6 = r11.mConstraintAttributeList
                java.lang.Object r6 = r6.valueAt(r4)
                androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.mTempValues
                r6.getValuesToInterpolate(r5)
                r5 = r2
            L49:
                float[] r6 = r11.mTempValues
                int r7 = r6.length
                if (r5 >= r7) goto L58
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L49
            L58:
                int r4 = r4 + 1
                goto L2a
            L5b:
                androidx.constraintlayout.core.motion.utils.CurveFit r12 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r12, r3, r1)
                r11.mCurveFit = r12
                return
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    public static class PathRotate extends androidx.constraintlayout.motion.utils.ViewSpline {
        public PathRotate() {
                r0 = this;
                r0.<init>()
                return
        }

        public void setPathRotate(android.view.View r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.get(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotation(r2)
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    static class PivotXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotX(r2)
                return
        }
    }

    static class PivotYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        PivotYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setPivotY(r2)
                return
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r9, float r10) {
                r8 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "ViewSpline"
                boolean r2 = r9 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r2 == 0) goto L12
                androidx.constraintlayout.motion.widget.MotionLayout r9 = (androidx.constraintlayout.motion.widget.MotionLayout) r9
                float r10 = r8.get(r10)
                r9.setProgress(r10)
                goto L48
            L12:
                boolean r2 = r8.mNoMethod
                if (r2 == 0) goto L17
                return
            L17:
                r2 = 0
                r3 = 1
                java.lang.Class r4 = r9.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a
                java.lang.String r5 = "setProgress"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L2a
                java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2a
                r6[r2] = r7     // Catch: java.lang.NoSuchMethodException -> L2a
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L2a
                goto L2d
            L2a:
                r8.mNoMethod = r3
                r4 = 0
            L2d:
                if (r4 == 0) goto L48
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L44
                float r10 = r8.get(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L44
                java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L44
                r3[r2] = r10     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L44
                r4.invoke(r9, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L3f java.lang.IllegalAccessException -> L44
                goto L48
            L3f:
                r9 = move-exception
                android.util.Log.e(r1, r0, r9)
                goto L48
            L44:
                r9 = move-exception
                android.util.Log.e(r1, r0, r9)
            L48:
                return
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewSpline {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public ViewSpline() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewSpline makeCustomSpline(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2) {
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r0 = new androidx.constraintlayout.motion.utils.ViewSpline$CustomSet
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.constraintlayout.motion.utils.ViewSpline makeSpline(java.lang.String r2) {
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lca;
                case -1249320805: goto Lbf;
                case -1225497657: goto Lb4;
                case -1225497656: goto La9;
                case -1225497655: goto L9e;
                case -1001078227: goto L93;
                case -908189618: goto L88;
                case -908189617: goto L7d;
                case -797520672: goto L6f;
                case -760884510: goto L61;
                case -760884509: goto L53;
                case -40300674: goto L45;
                case -4379043: goto L37;
                case 37232917: goto L29;
                case 92909918: goto L1b;
                case 156108012: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ld4
        Ld:
            java.lang.String r0 = "waveOffset"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto Ld4
        L17:
            r1 = 15
            goto Ld4
        L1b:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            goto Ld4
        L25:
            r1 = 14
            goto Ld4
        L29:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto Ld4
        L33:
            r1 = 13
            goto Ld4
        L37:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto Ld4
        L41:
            r1 = 12
            goto Ld4
        L45:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4f
            goto Ld4
        L4f:
            r1 = 11
            goto Ld4
        L53:
            java.lang.String r0 = "transformPivotY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            goto Ld4
        L5d:
            r1 = 10
            goto Ld4
        L61:
            java.lang.String r0 = "transformPivotX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6b
            goto Ld4
        L6b:
            r1 = 9
            goto Ld4
        L6f:
            java.lang.String r0 = "waveVariesBy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L79
            goto Ld4
        L79:
            r1 = 8
            goto Ld4
        L7d:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L86
            goto Ld4
        L86:
            r1 = 7
            goto Ld4
        L88:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L91
            goto Ld4
        L91:
            r1 = 6
            goto Ld4
        L93:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L9c
            goto Ld4
        L9c:
            r1 = 5
            goto Ld4
        L9e:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La7
            goto Ld4
        La7:
            r1 = 4
            goto Ld4
        La9:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb2
            goto Ld4
        Lb2:
            r1 = 3
            goto Ld4
        Lb4:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lbd
            goto Ld4
        Lbd:
            r1 = 2
            goto Ld4
        Lbf:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc8
            goto Ld4
        Lc8:
            r1 = 1
            goto Ld4
        Lca:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld3
            goto Ld4
        Ld3:
            r1 = 0
        Ld4:
            switch(r1) {
                case 0: goto L133;
                case 1: goto L12d;
                case 2: goto L127;
                case 3: goto L121;
                case 4: goto L11b;
                case 5: goto L115;
                case 6: goto L10f;
                case 7: goto L109;
                case 8: goto L103;
                case 9: goto Lfd;
                case 10: goto Lf7;
                case 11: goto Lf1;
                case 12: goto Leb;
                case 13: goto Le5;
                case 14: goto Ldf;
                case 15: goto Ld9;
                default: goto Ld7;
            }
        Ld7:
            r2 = 0
            return r2
        Ld9:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        Ldf:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        Le5:
            androidx.constraintlayout.motion.utils.ViewSpline$PathRotate r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PathRotate
            r2.<init>()
            return r2
        Leb:
            androidx.constraintlayout.motion.utils.ViewSpline$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ElevationSet
            r2.<init>()
            return r2
        Lf1:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationSet
            r2.<init>()
            return r2
        Lf7:
            androidx.constraintlayout.motion.utils.ViewSpline$PivotYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PivotYset
            r2.<init>()
            return r2
        Lfd:
            androidx.constraintlayout.motion.utils.ViewSpline$PivotXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$PivotXset
            r2.<init>()
            return r2
        L103:
            androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$AlphaSet
            r2.<init>()
            return r2
        L109:
            androidx.constraintlayout.motion.utils.ViewSpline$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ScaleYset
            r2.<init>()
            return r2
        L10f:
            androidx.constraintlayout.motion.utils.ViewSpline$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ScaleXset
            r2.<init>()
            return r2
        L115:
            androidx.constraintlayout.motion.utils.ViewSpline$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewSpline$ProgressSet
            r2.<init>()
            return r2
        L11b:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationZset
            r2.<init>()
            return r2
        L121:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationYset
            r2.<init>()
            return r2
        L127:
            androidx.constraintlayout.motion.utils.ViewSpline$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$TranslationXset
            r2.<init>()
            return r2
        L12d:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationYset
            r2.<init>()
            return r2
        L133:
            androidx.constraintlayout.motion.utils.ViewSpline$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewSpline$RotationXset
            r2.<init>()
            return r2
    }

    public abstract void setProperty(android.view.View r1, float r2);
}
