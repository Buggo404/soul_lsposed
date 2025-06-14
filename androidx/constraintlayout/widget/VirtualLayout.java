package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends androidx.constraintlayout.widget.ConstraintHelper {
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;

    public VirtualLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public VirtualLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public VirtualLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            r0.applyLayoutFeatures(r1)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r6) {
            r5 = this;
            super.init(r6)
            if (r6 == 0) goto L2e
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2b
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_visibility
            r4 = 1
            if (r2 != r3) goto L22
            r5.mApplyVisibilityOnAttach = r4
            goto L28
        L22:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_elevation
            if (r2 != r3) goto L28
            r5.mApplyElevationOnAttach = r4
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            r6.recycle()
        L2e:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.mApplyVisibilityOnAttach
            if (r0 != 0) goto Lb
            boolean r0 = r6.mApplyElevationOnAttach
            if (r0 == 0) goto L47
        Lb:
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L47
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L1e:
            int r4 = r6.mCount
            if (r3 >= r4) goto L47
            int[] r4 = r6.mIds
            r4 = r4[r3]
            android.view.View r4 = r0.getViewById(r4)
            if (r4 == 0) goto L44
            boolean r5 = r6.mApplyVisibilityOnAttach
            if (r5 == 0) goto L33
            r4.setVisibility(r1)
        L33:
            boolean r5 = r6.mApplyElevationOnAttach
            if (r5 == 0) goto L44
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L44
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L44:
            int r3 = r3 + 1
            goto L1e
        L47:
            return
    }

    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout r1, int r2, int r3) {
            r0 = this;
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
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.applyLayoutFeatures()
            return
    }
}
