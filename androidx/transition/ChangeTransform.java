package androidx.transition;

/* loaded from: classes.dex */
public class ChangeTransform extends androidx.transition.Transition {
    private static final android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY = null;
    private static final java.lang.String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final java.lang.String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final java.lang.String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final java.lang.String PROPNAME_PARENT = "android:changeTransform:parent";
    private static final java.lang.String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final java.lang.String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION = false;
    private static final android.util.Property<androidx.transition.ChangeTransform.PathAnimatorMatrix, android.graphics.PointF> TRANSLATIONS_PROPERTY = null;
    private static final java.lang.String[] sTransitionProperties = null;
    private boolean mReparent;
    private android.graphics.Matrix mTempMatrix;
    boolean mUseOverlay;




    private static class GhostListener extends androidx.transition.TransitionListenerAdapter {
        private androidx.transition.GhostView mGhostView;
        private android.view.View mView;

        GhostListener(android.view.View r1, androidx.transition.GhostView r2) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                r0.mGhostView = r2
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r3) {
                r2 = this;
                r3.removeListener(r2)
                android.view.View r3 = r2.mView
                androidx.transition.GhostViewUtils.removeGhost(r3)
                android.view.View r3 = r2.mView
                int r0 = androidx.transition.C0425R.id.transition_transform
                r1 = 0
                r3.setTag(r0, r1)
                android.view.View r3 = r2.mView
                int r0 = androidx.transition.C0425R.id.parent_matrix
                r3.setTag(r0, r1)
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r2) {
                r1 = this;
                androidx.transition.GhostView r2 = r1.mGhostView
                r0 = 4
                r2.setVisibility(r0)
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r2) {
                r1 = this;
                androidx.transition.GhostView r2 = r1.mGhostView
                r0 = 0
                r2.setVisibility(r0)
                return
        }
    }

    private static class PathAnimatorMatrix {
        private final android.graphics.Matrix mMatrix;
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final android.view.View mView;

        PathAnimatorMatrix(android.view.View r2, float[] r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.mMatrix = r0
                r1.mView = r2
                java.lang.Object r2 = r3.clone()
                float[] r2 = (float[]) r2
                r1.mValues = r2
                r3 = 2
                r3 = r2[r3]
                r1.mTranslationX = r3
                r3 = 5
                r2 = r2[r3]
                r1.mTranslationY = r2
                r1.setAnimationMatrix()
                return
        }

        private void setAnimationMatrix() {
                r3 = this;
                float[] r0 = r3.mValues
                r1 = 2
                float r2 = r3.mTranslationX
                r0[r1] = r2
                r1 = 5
                float r2 = r3.mTranslationY
                r0[r1] = r2
                android.graphics.Matrix r1 = r3.mMatrix
                r1.setValues(r0)
                android.view.View r0 = r3.mView
                android.graphics.Matrix r1 = r3.mMatrix
                androidx.transition.ViewUtils.setAnimationMatrix(r0, r1)
                return
        }

        android.graphics.Matrix getMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.mMatrix
                return r0
        }

        void setTranslation(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                r1.mTranslationX = r0
                float r2 = r2.y
                r1.mTranslationY = r2
                r1.setAnimationMatrix()
                return
        }

        void setValues(float[] r4) {
                r3 = this;
                float[] r0 = r3.mValues
                int r1 = r4.length
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)
                r3.setAnimationMatrix()
                return
        }
    }

    private static class Transforms {
        final float mRotationX;
        final float mRotationY;
        final float mRotationZ;
        final float mScaleX;
        final float mScaleY;
        final float mTranslationX;
        final float mTranslationY;
        final float mTranslationZ;

        Transforms(android.view.View r2) {
                r1 = this;
                r1.<init>()
                float r0 = r2.getTranslationX()
                r1.mTranslationX = r0
                float r0 = r2.getTranslationY()
                r1.mTranslationY = r0
                float r0 = androidx.core.view.ViewCompat.getTranslationZ(r2)
                r1.mTranslationZ = r0
                float r0 = r2.getScaleX()
                r1.mScaleX = r0
                float r0 = r2.getScaleY()
                r1.mScaleY = r0
                float r0 = r2.getRotationX()
                r1.mRotationX = r0
                float r0 = r2.getRotationY()
                r1.mRotationY = r0
                float r2 = r2.getRotation()
                r1.mRotationZ = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.transition.ChangeTransform.Transforms
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.transition.ChangeTransform$Transforms r4 = (androidx.transition.ChangeTransform.Transforms) r4
                float r0 = r4.mTranslationX
                float r2 = r3.mTranslationX
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mTranslationY
                float r2 = r3.mTranslationY
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mTranslationZ
                float r2 = r3.mTranslationZ
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mScaleX
                float r2 = r3.mScaleX
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mScaleY
                float r2 = r3.mScaleY
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mRotationX
                float r2 = r3.mRotationX
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r0 = r4.mRotationY
                float r2 = r3.mRotationY
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L49
                float r4 = r4.mRotationZ
                float r0 = r3.mRotationZ
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 != 0) goto L49
                r1 = 1
            L49:
                return r1
        }

        public int hashCode() {
                r5 = this;
                float r0 = r5.mTranslationX
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 0
                if (r2 == 0) goto Ld
                int r0 = java.lang.Float.floatToIntBits(r0)
                goto Le
            Ld:
                r0 = r3
            Le:
                int r0 = r0 * 31
                float r2 = r5.mTranslationY
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L1b
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L1c
            L1b:
                r2 = r3
            L1c:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mTranslationZ
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L2a
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L2b
            L2a:
                r2 = r3
            L2b:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mScaleX
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L39
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L3a
            L39:
                r2 = r3
            L3a:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mScaleY
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L48
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L49
            L48:
                r2 = r3
            L49:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mRotationX
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L57
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L58
            L57:
                r2 = r3
            L58:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mRotationY
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L66
                int r2 = java.lang.Float.floatToIntBits(r2)
                goto L67
            L66:
                r2 = r3
            L67:
                int r0 = r0 + r2
                int r0 = r0 * 31
                float r2 = r5.mRotationZ
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 == 0) goto L74
                int r3 = java.lang.Float.floatToIntBits(r2)
            L74:
                int r0 = r0 + r3
                return r0
        }

        public void restore(android.view.View r10) {
                r9 = this;
                float r1 = r9.mTranslationX
                float r2 = r9.mTranslationY
                float r3 = r9.mTranslationZ
                float r4 = r9.mScaleX
                float r5 = r9.mScaleY
                float r6 = r9.mRotationX
                float r7 = r9.mRotationY
                float r8 = r9.mRotationZ
                r0 = r10
                androidx.transition.ChangeTransform.setTransforms(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeTransform:transforms"
            java.lang.String r1 = "android:changeTransform:parentMatrix"
            java.lang.String r2 = "android:changeTransform:matrix"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            androidx.transition.ChangeTransform.sTransitionProperties = r0
            androidx.transition.ChangeTransform$1 r0 = new androidx.transition.ChangeTransform$1
            java.lang.Class<float[]> r1 = float[].class
            java.lang.String r2 = "nonTranslations"
            r0.<init>(r1, r2)
            androidx.transition.ChangeTransform.NON_TRANSLATIONS_PROPERTY = r0
            androidx.transition.ChangeTransform$2 r0 = new androidx.transition.ChangeTransform$2
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "translations"
            r0.<init>(r1, r2)
            androidx.transition.ChangeTransform.TRANSLATIONS_PROPERTY = r0
            r0 = 1
            androidx.transition.ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION = r0
            return
    }

    public ChangeTransform() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mUseOverlay = r0
            r1.mReparent = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mTempMatrix = r0
            return
    }

    public ChangeTransform(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 1
            r3.mUseOverlay = r0
            r3.mReparent = r0
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.mTempMatrix = r1
            int[] r1 = androidx.transition.Styleable.CHANGE_TRANSFORM
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1)
            org.xmlpull.v1.XmlPullParser r5 = (org.xmlpull.v1.XmlPullParser) r5
            java.lang.String r1 = "reparentWithOverlay"
            boolean r1 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r4, r5, r1, r0, r0)
            r3.mUseOverlay = r1
            java.lang.String r1 = "reparent"
            r2 = 0
            boolean r5 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r4, r5, r1, r2, r0)
            r3.mReparent = r5
            r4.recycle()
            return
    }

    private void captureValues(androidx.transition.TransitionValues r5) {
            r4 = this;
            android.view.View r0 = r5.view
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lb
            return
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.values
            java.lang.String r2 = "android:changeTransform:parent"
            android.view.ViewParent r3 = r0.getParent()
            r1.put(r2, r3)
            androidx.transition.ChangeTransform$Transforms r1 = new androidx.transition.ChangeTransform$Transforms
            r1.<init>(r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.values
            java.lang.String r3 = "android:changeTransform:transforms"
            r2.put(r3, r1)
            android.graphics.Matrix r1 = r0.getMatrix()
            if (r1 == 0) goto L35
            boolean r2 = r1.isIdentity()
            if (r2 == 0) goto L2f
            goto L35
        L2f:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            goto L36
        L35:
            r2 = 0
        L36:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.values
            java.lang.String r3 = "android:changeTransform:matrix"
            r1.put(r3, r2)
            boolean r1 = r4.mReparent
            if (r1 == 0) goto L7f
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            android.view.ViewParent r2 = r0.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.transition.ViewUtils.transformMatrixToGlobal(r2, r1)
            int r3 = r2.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            int r2 = r2.getScrollY()
            int r2 = -r2
            float r2 = (float) r2
            r1.preTranslate(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.values
            java.lang.String r3 = "android:changeTransform:parentMatrix"
            r2.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.values
            int r2 = androidx.transition.C0425R.id.transition_transform
            java.lang.Object r2 = r0.getTag(r2)
            java.lang.String r3 = "android:changeTransform:intermediateMatrix"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.values
            int r1 = androidx.transition.C0425R.id.parent_matrix
            java.lang.Object r0 = r0.getTag(r1)
            java.lang.String r1 = "android:changeTransform:intermediateParentMatrix"
            r5.put(r1, r0)
        L7f:
            return
    }

    private void createGhostView(android.view.ViewGroup r4, androidx.transition.TransitionValues r5, androidx.transition.TransitionValues r6) {
            r3 = this;
            android.view.View r0 = r6.view
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.values
            java.lang.String r2 = "android:changeTransform:parentMatrix"
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            androidx.transition.ViewUtils.transformMatrixToLocal(r4, r2)
            androidx.transition.GhostView r4 = androidx.transition.GhostViewUtils.addGhost(r0, r4, r2)
            if (r4 != 0) goto L1b
            return
        L1b:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.values
            java.lang.String r2 = "android:changeTransform:parent"
            java.lang.Object r1 = r1.get(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r2 = r5.view
            r4.reserveEndViewTransition(r1, r2)
            r1 = r3
        L2b:
            androidx.transition.TransitionSet r2 = r1.mParent
            if (r2 == 0) goto L32
            androidx.transition.TransitionSet r1 = r1.mParent
            goto L2b
        L32:
            androidx.transition.ChangeTransform$GhostListener r2 = new androidx.transition.ChangeTransform$GhostListener
            r2.<init>(r0, r4)
            r1.addListener(r2)
            boolean r4 = androidx.transition.ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION
            if (r4 == 0) goto L4f
            android.view.View r4 = r5.view
            android.view.View r6 = r6.view
            if (r4 == r6) goto L4a
            android.view.View r4 = r5.view
            r5 = 0
            androidx.transition.ViewUtils.setTransitionAlpha(r4, r5)
        L4a:
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.transition.ViewUtils.setTransitionAlpha(r0, r4)
        L4f:
            return
    }

    private android.animation.ObjectAnimator createTransformAnimator(androidx.transition.TransitionValues r13, androidx.transition.TransitionValues r14, boolean r15) {
            r12 = this;
            java.util.Map<java.lang.String, java.lang.Object> r13 = r13.values
            java.lang.String r0 = "android:changeTransform:matrix"
            java.lang.Object r13 = r13.get(r0)
            android.graphics.Matrix r13 = (android.graphics.Matrix) r13
            java.util.Map<java.lang.String, java.lang.Object> r1 = r14.values
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            if (r13 != 0) goto L16
            android.graphics.Matrix r13 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
        L16:
            if (r0 != 0) goto L1a
            android.graphics.Matrix r0 = androidx.transition.MatrixUtils.IDENTITY_MATRIX
        L1a:
            r4 = r0
            boolean r0 = r13.equals(r4)
            if (r0 == 0) goto L23
            r13 = 0
            return r13
        L23:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.values
            java.lang.String r1 = "android:changeTransform:transforms"
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            androidx.transition.ChangeTransform$Transforms r6 = (androidx.transition.ChangeTransform.Transforms) r6
            android.view.View r5 = r14.view
            setIdentityTransforms(r5)
            r14 = 9
            float[] r0 = new float[r14]
            r13.getValues(r0)
            float[] r13 = new float[r14]
            r4.getValues(r13)
            androidx.transition.ChangeTransform$PathAnimatorMatrix r7 = new androidx.transition.ChangeTransform$PathAnimatorMatrix
            r7.<init>(r5, r0)
            android.util.Property<androidx.transition.ChangeTransform$PathAnimatorMatrix, float[]> r1 = androidx.transition.ChangeTransform.NON_TRANSLATIONS_PROPERTY
            androidx.transition.FloatArrayEvaluator r2 = new androidx.transition.FloatArrayEvaluator
            float[] r14 = new float[r14]
            r2.<init>(r14)
            r14 = 2
            float[][] r3 = new float[r14][]
            r8 = 0
            r3[r8] = r0
            r9 = 1
            r3[r9] = r13
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r1, r2, r3)
            androidx.transition.PathMotion r2 = r12.getPathMotion()
            r3 = r0[r14]
            r10 = 5
            r0 = r0[r10]
            r11 = r13[r14]
            r13 = r13[r10]
            android.graphics.Path r13 = r2.getPath(r3, r0, r11, r13)
            android.util.Property<androidx.transition.ChangeTransform$PathAnimatorMatrix, android.graphics.PointF> r0 = androidx.transition.ChangeTransform.TRANSLATIONS_PROPERTY
            android.animation.PropertyValuesHolder r13 = androidx.transition.PropertyValuesHolderUtils.ofPointF(r0, r13)
            android.animation.PropertyValuesHolder[] r14 = new android.animation.PropertyValuesHolder[r14]
            r14[r8] = r1
            r14[r9] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r14)
            androidx.transition.ChangeTransform$3 r14 = new androidx.transition.ChangeTransform$3
            r1 = r14
            r2 = r12
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r13.addListener(r14)
            androidx.transition.AnimatorUtils.addPauseListener(r13, r14)
            return r13
    }

    private boolean parentsMatch(android.view.ViewGroup r4, android.view.ViewGroup r5) {
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            androidx.transition.TransitionValues r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.view
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            r2 = r1
        L1f:
            return r2
    }

    static void setIdentityTransforms(android.view.View r9) {
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r9
            setTransforms(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private void setMatricesForParent(androidx.transition.TransitionValues r5, androidx.transition.TransitionValues r6) {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.values
            java.lang.String r1 = "android:changeTransform:parentMatrix"
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            android.view.View r6 = r6.view
            int r2 = androidx.transition.C0425R.id.parent_matrix
            r6.setTag(r2, r0)
            android.graphics.Matrix r6 = r4.mTempMatrix
            r6.reset()
            r0.invert(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.values
            java.lang.String r2 = "android:changeTransform:matrix"
            java.lang.Object r0 = r0.get(r2)
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            if (r0 != 0) goto L2f
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.values
            r3.put(r2, r0)
        L2f:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.values
            java.lang.Object r5 = r5.get(r1)
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            r0.postConcat(r5)
            r0.postConcat(r6)
            return
    }

    static void setTransforms(android.view.View r0, float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8) {
            r0.setTranslationX(r1)
            r0.setTranslationY(r2)
            androidx.core.view.ViewCompat.setTranslationZ(r0, r3)
            r0.setScaleX(r4)
            r0.setScaleY(r5)
            r0.setRotationX(r6)
            r0.setRotationY(r7)
            r0.setRotation(r8)
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r2) {
            r1 = this;
            r1.captureValues(r2)
            boolean r0 = androidx.transition.ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION
            if (r0 != 0) goto L14
            android.view.View r0 = r2.view
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r2.view
            r0.startViewTransition(r2)
        L14:
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r6, androidx.transition.TransitionValues r7, androidx.transition.TransitionValues r8) {
            r5 = this;
            if (r7 == 0) goto L79
            if (r8 == 0) goto L79
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values
            java.lang.String r1 = "android:changeTransform:parent"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L79
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.values
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L17
            goto L79
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.values
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.values
            java.lang.Object r1 = r2.get(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r5.mReparent
            if (r2 == 0) goto L33
            boolean r1 = r5.parentsMatch(r0, r1)
            if (r1 != 0) goto L33
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.lang.String r3 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r2 = r2.get(r3)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r2 == 0) goto L47
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.values
            java.lang.String r4 = "android:changeTransform:matrix"
            r3.put(r4, r2)
        L47:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.lang.String r3 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r2 = r2.get(r3)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r2 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.values
            java.lang.String r4 = "android:changeTransform:parentMatrix"
            r3.put(r4, r2)
        L5a:
            if (r1 == 0) goto L5f
            r5.setMatricesForParent(r7, r8)
        L5f:
            android.animation.ObjectAnimator r2 = r5.createTransformAnimator(r7, r8, r1)
            if (r1 == 0) goto L6f
            if (r2 == 0) goto L6f
            boolean r1 = r5.mUseOverlay
            if (r1 == 0) goto L6f
            r5.createGhostView(r6, r7, r8)
            goto L78
        L6f:
            boolean r6 = androidx.transition.ChangeTransform.SUPPORTS_VIEW_REMOVAL_SUPPRESSION
            if (r6 != 0) goto L78
            android.view.View r6 = r7.view
            r0.endViewTransition(r6)
        L78:
            return r2
        L79:
            r6 = 0
            return r6
    }

    public boolean getReparent() {
            r1 = this;
            boolean r0 = r1.mReparent
            return r0
    }

    public boolean getReparentWithOverlay() {
            r1 = this;
            boolean r0 = r1.mUseOverlay
            return r0
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeTransform.sTransitionProperties
            return r0
    }

    public void setReparent(boolean r1) {
            r0 = this;
            r0.mReparent = r1
            return
    }

    public void setReparentWithOverlay(boolean r1) {
            r0 = this;
            r0.mUseOverlay = r1
            return
    }
}
