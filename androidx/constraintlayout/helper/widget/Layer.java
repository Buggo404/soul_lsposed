package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class Layer extends androidx.constraintlayout.widget.ConstraintHelper {
    private static final java.lang.String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;
    androidx.constraintlayout.widget.ConstraintLayout mContainer;
    private float mGroupRotateAngle;
    boolean mNeedBounds;
    private float mRotationCenterX;
    private float mRotationCenterY;
    private float mScaleX;
    private float mScaleY;
    private float mShiftX;
    private float mShiftY;
    android.view.View[] mViews;

    public Layer(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2143289344(0x7fc00000, float:NaN)
            r1.mRotationCenterX = r2
            r1.mRotationCenterY = r2
            r1.mGroupRotateAngle = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mScaleX = r0
            r1.mScaleY = r0
            r1.mComputedCenterX = r2
            r1.mComputedCenterY = r2
            r1.mComputedMaxX = r2
            r1.mComputedMaxY = r2
            r1.mComputedMinX = r2
            r1.mComputedMinY = r2
            r2 = 1
            r1.mNeedBounds = r2
            r2 = 0
            r1.mViews = r2
            r2 = 0
            r1.mShiftX = r2
            r1.mShiftY = r2
            return
    }

    public Layer(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.mRotationCenterX = r1
            r0.mRotationCenterY = r1
            r0.mGroupRotateAngle = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mScaleX = r2
            r0.mScaleY = r2
            r0.mComputedCenterX = r1
            r0.mComputedCenterY = r1
            r0.mComputedMaxX = r1
            r0.mComputedMaxY = r1
            r0.mComputedMinX = r1
            r0.mComputedMinY = r1
            r1 = 1
            r0.mNeedBounds = r1
            r1 = 0
            r0.mViews = r1
            r1 = 0
            r0.mShiftX = r1
            r0.mShiftY = r1
            return
    }

    public Layer(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.mRotationCenterX = r1
            r0.mRotationCenterY = r1
            r0.mGroupRotateAngle = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mScaleX = r2
            r0.mScaleY = r2
            r0.mComputedCenterX = r1
            r0.mComputedCenterY = r1
            r0.mComputedMaxX = r1
            r0.mComputedMaxY = r1
            r0.mComputedMinX = r1
            r0.mComputedMinY = r1
            r1 = 1
            r0.mNeedBounds = r1
            r1 = 0
            r0.mViews = r1
            r1 = 0
            r0.mShiftX = r1
            r0.mShiftY = r1
            return
    }

    private void reCacheViews() {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.mContainer
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.mCount
            if (r0 != 0) goto La
            return
        La:
            android.view.View[] r0 = r4.mViews
            if (r0 == 0) goto L13
            int r0 = r0.length
            int r1 = r4.mCount
            if (r0 == r1) goto L19
        L13:
            int r0 = r4.mCount
            android.view.View[] r0 = new android.view.View[r0]
            r4.mViews = r0
        L19:
            r0 = 0
        L1a:
            int r1 = r4.mCount
            if (r0 >= r1) goto L2f
            int[] r1 = r4.mIds
            r1 = r1[r0]
            android.view.View[] r2 = r4.mViews
            androidx.constraintlayout.widget.ConstraintLayout r3 = r4.mContainer
            android.view.View r1 = r3.getViewById(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L1a
        L2f:
            return
    }

    private void transform() {
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.mContainer
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View[] r0 = r10.mViews
            if (r0 != 0) goto Lc
            r10.reCacheViews()
        Lc:
            r10.calcCenters()
            float r0 = r10.mGroupRotateAngle
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L1a
            r0 = 0
            goto L21
        L1a:
            float r0 = r10.mGroupRotateAngle
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
        L21:
            double r2 = java.lang.Math.sin(r0)
            float r2 = (float) r2
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r1 = r10.mScaleX
            float r3 = r1 * r0
            float r4 = r10.mScaleY
            float r5 = -r4
            float r5 = r5 * r2
            float r1 = r1 * r2
            float r4 = r4 * r0
            r0 = 0
        L36:
            int r2 = r10.mCount
            if (r0 >= r2) goto L8d
            android.view.View[] r2 = r10.mViews
            r2 = r2[r0]
            int r6 = r2.getLeft()
            int r7 = r2.getRight()
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r7 = r2.getTop()
            int r8 = r2.getBottom()
            int r7 = r7 + r8
            int r7 = r7 / 2
            float r6 = (float) r6
            float r8 = r10.mComputedCenterX
            float r6 = r6 - r8
            float r7 = (float) r7
            float r8 = r10.mComputedCenterY
            float r7 = r7 - r8
            float r8 = r3 * r6
            float r9 = r5 * r7
            float r8 = r8 + r9
            float r8 = r8 - r6
            float r9 = r10.mShiftX
            float r8 = r8 + r9
            float r6 = r6 * r1
            float r9 = r4 * r7
            float r6 = r6 + r9
            float r6 = r6 - r7
            float r7 = r10.mShiftY
            float r6 = r6 + r7
            r2.setTranslationX(r8)
            r2.setTranslationY(r6)
            float r6 = r10.mScaleY
            r2.setScaleY(r6)
            float r6 = r10.mScaleX
            r2.setScaleX(r6)
            float r6 = r10.mGroupRotateAngle
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L8a
            float r6 = r10.mGroupRotateAngle
            r2.setRotation(r6)
        L8a:
            int r0 = r0 + 1
            goto L36
        L8d:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            r0.applyLayoutFeatures(r1)
            return
    }

    protected void calcCenters() {
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.mContainer
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r8.mNeedBounds
            if (r0 != 0) goto L1a
            float r0 = r8.mComputedCenterX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            float r0 = r8.mComputedCenterY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            return
        L1a:
            float r0 = r8.mRotationCenterX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L35
            float r0 = r8.mRotationCenterY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2b
            goto L35
        L2b:
            float r0 = r8.mRotationCenterY
            r8.mComputedCenterY = r0
            float r0 = r8.mRotationCenterX
            r8.mComputedCenterX = r0
            goto Laf
        L35:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.mContainer
            android.view.View[] r0 = r8.getViews(r0)
            r1 = 0
            r2 = r0[r1]
            int r2 = r2.getLeft()
            r3 = r0[r1]
            int r3 = r3.getTop()
            r4 = r0[r1]
            int r4 = r4.getRight()
            r5 = r0[r1]
            int r5 = r5.getBottom()
        L54:
            int r6 = r8.mCount
            if (r1 >= r6) goto L7d
            r6 = r0[r1]
            int r7 = r6.getLeft()
            int r2 = java.lang.Math.min(r2, r7)
            int r7 = r6.getTop()
            int r3 = java.lang.Math.min(r3, r7)
            int r7 = r6.getRight()
            int r4 = java.lang.Math.max(r4, r7)
            int r6 = r6.getBottom()
            int r5 = java.lang.Math.max(r5, r6)
            int r1 = r1 + 1
            goto L54
        L7d:
            float r0 = (float) r4
            r8.mComputedMaxX = r0
            float r0 = (float) r5
            r8.mComputedMaxY = r0
            float r0 = (float) r2
            r8.mComputedMinX = r0
            float r0 = (float) r3
            r8.mComputedMinY = r0
            float r0 = r8.mRotationCenterX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L98
            int r2 = r2 + r4
            int r2 = r2 / 2
            float r0 = (float) r2
            r8.mComputedCenterX = r0
            goto L9c
        L98:
            float r0 = r8.mRotationCenterX
            r8.mComputedCenterX = r0
        L9c:
            float r0 = r8.mRotationCenterY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Lab
            int r3 = r3 + r5
            int r3 = r3 / 2
            float r0 = (float) r3
            r8.mComputedCenterY = r0
            goto Laf
        Lab:
            float r0 = r8.mRotationCenterY
            r8.mComputedCenterY = r0
        Laf:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r6) {
            r5 = this;
            super.init(r6)
            r0 = 0
            r5.mUseViewMeasure = r0
            if (r6 == 0) goto L30
            android.content.Context r1 = r5.getContext()
            int[] r2 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2)
            int r1 = r6.getIndexCount()
        L16:
            if (r0 >= r1) goto L2d
            int r2 = r6.getIndex(r0)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_visibility
            r4 = 1
            if (r2 != r3) goto L24
            r5.mApplyVisibilityOnAttach = r4
            goto L2a
        L24:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_elevation
            if (r2 != r3) goto L2a
            r5.mApplyElevationOnAttach = r4
        L2a:
            int r0 = r0 + 1
            goto L16
        L2d:
            r6.recycle()
        L30:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r5.mContainer = r0
            boolean r0 = r5.mApplyVisibilityOnAttach
            if (r0 != 0) goto L13
            boolean r0 = r5.mApplyElevationOnAttach
            if (r0 == 0) goto L47
        L13:
            int r0 = r5.getVisibility()
            float r1 = r5.getElevation()
            r2 = 0
        L1c:
            int r3 = r5.mCount
            if (r2 >= r3) goto L47
            int[] r3 = r5.mIds
            r3 = r3[r2]
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.mContainer
            android.view.View r3 = r4.getViewById(r3)
            if (r3 == 0) goto L44
            boolean r4 = r5.mApplyVisibilityOnAttach
            if (r4 == 0) goto L33
            r3.setVisibility(r0)
        L33:
            boolean r4 = r5.mApplyElevationOnAttach
            if (r4 == 0) goto L44
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r4 = r3.getTranslationZ()
            float r4 = r4 + r1
            r3.setTranslationZ(r4)
        L44:
            int r2 = r2 + 1
            goto L1c
        L47:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.applyLayoutFeatures()
            return
    }

    @Override // android.view.View
    public void setPivotX(float r1) {
            r0 = this;
            r0.mRotationCenterX = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setPivotY(float r1) {
            r0 = this;
            r0.mRotationCenterY = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setRotation(float r1) {
            r0 = this;
            r0.mGroupRotateAngle = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setScaleX(float r1) {
            r0 = this;
            r0.mScaleX = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setScaleY(float r1) {
            r0 = this;
            r0.mScaleY = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setTranslationX(float r1) {
            r0 = this;
            r0.mShiftX = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            r0.mShiftY = r1
            r0.transform()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.applyLayoutFeatures()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout r5) {
            r4 = this;
            r4.reCacheViews()
            r5 = 2143289344(0x7fc00000, float:NaN)
            r4.mComputedCenterX = r5
            r4.mComputedCenterY = r5
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.getConstraintWidget()
            r0 = 0
            r5.setWidth(r0)
            r5.setHeight(r0)
            r4.calcCenters()
            float r5 = r4.mComputedMinX
            int r5 = (int) r5
            int r0 = r4.getPaddingLeft()
            int r5 = r5 - r0
            float r0 = r4.mComputedMinY
            int r0 = (int) r0
            int r1 = r4.getPaddingTop()
            int r0 = r0 - r1
            float r1 = r4.mComputedMaxX
            int r1 = (int) r1
            int r2 = r4.getPaddingRight()
            int r1 = r1 + r2
            float r2 = r4.mComputedMaxY
            int r2 = (int) r2
            int r3 = r4.getPaddingBottom()
            int r2 = r2 + r3
            r4.layout(r5, r0, r1, r2)
            r4.transform()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r1.mContainer = r2
            float r2 = r1.getRotation()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L16
            float r0 = r1.mGroupRotateAngle
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L18
            r1.mGroupRotateAngle = r2
            goto L18
        L16:
            r1.mGroupRotateAngle = r2
        L18:
            return
    }
}
