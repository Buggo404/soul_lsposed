package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Group extends androidx.constraintlayout.widget.ConstraintHelper {
    public Group(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public Group(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public Group(android.content.Context r1, android.util.AttributeSet r2, int r3) {
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
    protected void init(android.util.AttributeSet r1) {
            r0 = this;
            super.init(r1)
            r1 = 0
            r0.mUseViewMeasure = r1
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.applyLayoutFeatures()
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

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.widget
            r1 = 0
            r0.setWidth(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.widget
            r3.setHeight(r1)
            return
    }
}
