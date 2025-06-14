package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class VirtualLayout extends androidx.constraintlayout.core.widgets.HelperWidget {
    protected androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedsCallFromSolver;
    private int mPaddingBottom;
    private int mPaddingEnd;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingStart;
    private int mPaddingTop;
    private int mResolvedPaddingLeft;
    private int mResolvedPaddingRight;

    public VirtualLayout() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPaddingTop = r0
            r1.mPaddingBottom = r0
            r1.mPaddingLeft = r0
            r1.mPaddingRight = r0
            r1.mPaddingStart = r0
            r1.mPaddingEnd = r0
            r1.mResolvedPaddingLeft = r0
            r1.mResolvedPaddingRight = r0
            r1.mNeedsCallFromSolver = r0
            r1.mMeasuredWidth = r0
            r1.mMeasuredHeight = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r0 = 0
            r1.mMeasurer = r0
            return
    }

    public void applyRtl(boolean r3) {
            r2 = this;
            int r0 = r2.mPaddingStart
            if (r0 > 0) goto L8
            int r1 = r2.mPaddingEnd
            if (r1 <= 0) goto L17
        L8:
            if (r3 == 0) goto L11
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingLeft = r3
            r2.mResolvedPaddingRight = r0
            goto L17
        L11:
            r2.mResolvedPaddingLeft = r0
            int r3 = r2.mPaddingEnd
            r2.mResolvedPaddingRight = r3
        L17:
            return
    }

    public void captureWidgets() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mWidgetsCount
            if (r0 >= r1) goto L12
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r3.mWidgets
            r1 = r1[r0]
            if (r1 == 0) goto Lf
            r2 = 1
            r1.setInVirtualLayout(r2)
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public boolean contains(java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r4) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.mWidgetsCount
            if (r1 >= r2) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r3.mWidgets
            r2 = r2[r1]
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L12
            r4 = 1
            return r4
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            return r0
    }

    public int getMeasuredHeight() {
            r1 = this;
            int r0 = r1.mMeasuredHeight
            return r0
    }

    public int getMeasuredWidth() {
            r1 = this;
            int r0 = r1.mMeasuredWidth
            return r0
    }

    public int getPaddingBottom() {
            r1 = this;
            int r0 = r1.mPaddingBottom
            return r0
    }

    public int getPaddingLeft() {
            r1 = this;
            int r0 = r1.mResolvedPaddingLeft
            return r0
    }

    public int getPaddingRight() {
            r1 = this;
            int r0 = r1.mResolvedPaddingRight
            return r0
    }

    public int getPaddingTop() {
            r1 = this;
            int r0 = r1.mPaddingTop
            return r0
    }

    public void measure(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    protected void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
        L0:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r1.mMeasurer
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            r1.mMeasurer = r0
            goto L0
        L17:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.verticalBehavior = r5
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.horizontalDimension = r4
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.verticalDimension = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r1.mMeasure
            r3.measure(r2, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    protected boolean measureChildren() {
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.mParent
            if (r0 == 0) goto Ld
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            r2 = r1
        L13:
            int r3 = r8.mWidgetsCount
            r4 = 1
            if (r2 >= r3) goto L82
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r8.mWidgets
            r3 = r3[r2]
            if (r3 != 0) goto L1f
            goto L7f
        L1f:
            boolean r5 = r3 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 == 0) goto L24
            goto L7f
        L24:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.getDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r3.getDimensionBehaviour(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r7) goto L3d
            int r7 = r3.mMatchConstraintDefaultWidth
            if (r7 == r4) goto L3d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L3d
            int r7 = r3.mMatchConstraintDefaultHeight
            if (r7 == r4) goto L3d
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 == 0) goto L41
            goto L7f
        L41:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r4) goto L47
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L47:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r4) goto L4d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L4d:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            r4.horizontalBehavior = r5
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            r4.verticalBehavior = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            int r5 = r3.getWidth()
            r4.horizontalDimension = r5
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            int r5 = r3.getHeight()
            r4.verticalDimension = r5
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            r0.measure(r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            int r4 = r4.measuredWidth
            r3.setWidth(r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            int r4 = r4.measuredHeight
            r3.setHeight(r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r8.mMeasure
            int r4 = r4.measuredBaseline
            r3.setBaselineDistance(r4)
        L7f:
            int r2 = r2 + 1
            goto L13
        L82:
            return r4
    }

    public boolean needSolverPass() {
            r1 = this;
            boolean r0 = r1.mNeedsCallFromSolver
            return r0
    }

    protected void needsCallbackFromSolver(boolean r1) {
            r0 = this;
            r0.mNeedsCallFromSolver = r1
            return
    }

    public void setMeasure(int r1, int r2) {
            r0 = this;
            r0.mMeasuredWidth = r1
            r0.mMeasuredHeight = r2
            return
    }

    public void setPadding(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mPaddingTop = r1
            r0.mPaddingRight = r1
            r0.mPaddingBottom = r1
            r0.mPaddingStart = r1
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingBottom(int r1) {
            r0 = this;
            r0.mPaddingBottom = r1
            return
    }

    public void setPaddingEnd(int r1) {
            r0 = this;
            r0.mPaddingEnd = r1
            return
    }

    public void setPaddingLeft(int r1) {
            r0 = this;
            r0.mPaddingLeft = r1
            r0.mResolvedPaddingLeft = r1
            return
    }

    public void setPaddingRight(int r1) {
            r0 = this;
            r0.mPaddingRight = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingStart(int r1) {
            r0 = this;
            r0.mPaddingStart = r1
            r0.mResolvedPaddingLeft = r1
            r0.mResolvedPaddingRight = r1
            return
    }

    public void setPaddingTop(int r1) {
            r0 = this;
            r0.mPaddingTop = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1) {
            r0 = this;
            r0.captureWidgets()
            return
    }
}
