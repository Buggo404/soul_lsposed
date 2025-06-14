package androidx.constraintlayout.motion.utils;

/* loaded from: classes.dex */
public abstract class ViewOscillator extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
    private static final java.lang.String TAG = "ViewOscillator";

    static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    static class CustomSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        protected androidx.constraintlayout.widget.ConstraintAttribute mCustom;
        float[] value;

        CustomSet() {
                r1 = this;
                r1.<init>()
                r0 = 1
                float[] r0 = new float[r0]
                r1.value = r0
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void setCustom(java.lang.Object r1) {
                r0 = this;
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                r0.mCustom = r1
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r3, float r4) {
                r2 = this;
                float[] r0 = r2.value
                r1 = 0
                float r4 = r2.get(r4)
                r0[r1] = r4
                androidx.constraintlayout.widget.ConstraintAttribute r4 = r2.mCustom
                float[] r0 = r2.value
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r4, r3, r0)
                return
        }
    }

    static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    public static class PathRotateSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public PathRotateSet() {
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

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        boolean mNoMethod;

        ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r9, float r10) {
                r8 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "ViewOscillator"
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

    static class RotationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public ViewOscillator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewOscillator makeSpline(java.lang.String r2) {
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Le
            androidx.constraintlayout.motion.utils.ViewOscillator$CustomSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$CustomSet
            r2.<init>()
            return r2
        Le:
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1249320806: goto Lbc;
                case -1249320805: goto Lb1;
                case -1225497657: goto La6;
                case -1225497656: goto L9b;
                case -1225497655: goto L90;
                case -1001078227: goto L85;
                case -908189618: goto L7a;
                case -908189617: goto L6f;
                case -797520672: goto L61;
                case -40300674: goto L53;
                case -4379043: goto L45;
                case 37232917: goto L37;
                case 92909918: goto L29;
                case 156108012: goto L1b;
                default: goto L19;
            }
        L19:
            goto Lc6
        L1b:
            java.lang.String r0 = "waveOffset"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L25
            goto Lc6
        L25:
            r1 = 13
            goto Lc6
        L29:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L33
            goto Lc6
        L33:
            r1 = 12
            goto Lc6
        L37:
            java.lang.String r0 = "transitionPathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto Lc6
        L41:
            r1 = 11
            goto Lc6
        L45:
            java.lang.String r0 = "elevation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4f
            goto Lc6
        L4f:
            r1 = 10
            goto Lc6
        L53:
            java.lang.String r0 = "rotation"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            goto Lc6
        L5d:
            r1 = 9
            goto Lc6
        L61:
            java.lang.String r0 = "waveVariesBy"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6b
            goto Lc6
        L6b:
            r1 = 8
            goto Lc6
        L6f:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L78
            goto Lc6
        L78:
            r1 = 7
            goto Lc6
        L7a:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L83
            goto Lc6
        L83:
            r1 = 6
            goto Lc6
        L85:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L8e
            goto Lc6
        L8e:
            r1 = 5
            goto Lc6
        L90:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L99
            goto Lc6
        L99:
            r1 = 4
            goto Lc6
        L9b:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto La4
            goto Lc6
        La4:
            r1 = 3
            goto Lc6
        La6:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Laf
            goto Lc6
        Laf:
            r1 = 2
            goto Lc6
        Lb1:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lba
            goto Lc6
        Lba:
            r1 = 1
            goto Lc6
        Lbc:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc5
            goto Lc6
        Lc5:
            r1 = 0
        Lc6:
            switch(r1) {
                case 0: goto L119;
                case 1: goto L113;
                case 2: goto L10d;
                case 3: goto L107;
                case 4: goto L101;
                case 5: goto Lfb;
                case 6: goto Lf5;
                case 7: goto Lef;
                case 8: goto Le9;
                case 9: goto Le3;
                case 10: goto Ldd;
                case 11: goto Ld7;
                case 12: goto Ld1;
                case 13: goto Lcb;
                default: goto Lc9;
            }
        Lc9:
            r2 = 0
            return r2
        Lcb:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Ld1:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Ld7:
            androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet
            r2.<init>()
            return r2
        Ldd:
            androidx.constraintlayout.motion.utils.ViewOscillator$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ElevationSet
            r2.<init>()
            return r2
        Le3:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationSet
            r2.<init>()
            return r2
        Le9:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Lef:
            androidx.constraintlayout.motion.utils.ViewOscillator$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ScaleYset
            r2.<init>()
            return r2
        Lf5:
            androidx.constraintlayout.motion.utils.ViewOscillator$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ScaleXset
            r2.<init>()
            return r2
        Lfb:
            androidx.constraintlayout.motion.utils.ViewOscillator$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ProgressSet
            r2.<init>()
            return r2
        L101:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationZset
            r2.<init>()
            return r2
        L107:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationYset
            r2.<init>()
            return r2
        L10d:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationXset
            r2.<init>()
            return r2
        L113:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationYset
            r2.<init>()
            return r2
        L119:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationXset
            r2.<init>()
            return r2
    }

    public abstract void setProperty(android.view.View r1, float r2);
}
