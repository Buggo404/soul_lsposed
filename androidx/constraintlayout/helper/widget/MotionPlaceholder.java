package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class MotionPlaceholder extends androidx.constraintlayout.widget.VirtualLayout {
    private static final java.lang.String TAG = "MotionPlaceholder";
    androidx.constraintlayout.core.widgets.Placeholder mPlaceholder;

    public MotionPlaceholder(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MotionPlaceholder(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public MotionPlaceholder(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public MotionPlaceholder(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r1) {
            r0 = this;
            super.init(r1)
            androidx.constraintlayout.core.widgets.Placeholder r1 = new androidx.constraintlayout.core.widgets.Placeholder
            r1.<init>()
            r0.mHelperWidget = r1
            r0.validateParams()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Placeholder r0 = r1.mPlaceholder
            r1.onMeasure(r0, r2, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout r3, int r4, int r5) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r3 == 0) goto L21
            r3.measure(r0, r4, r1, r5)
            int r4 = r3.getMeasuredWidth()
            int r3 = r3.getMeasuredHeight()
            r2.setMeasuredDimension(r4, r3)
            goto L25
        L21:
            r3 = 0
            r2.setMeasuredDimension(r3, r3)
        L25:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, androidx.constraintlayout.core.widgets.Helper r2, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r3) {
            r0 = this;
            return
    }
}
