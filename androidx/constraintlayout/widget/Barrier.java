package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Barrier extends androidx.constraintlayout.widget.ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.core.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Barrier(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Barrier(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    private void updateType(androidx.constraintlayout.core.widgets.ConstraintWidget r4, int r5, boolean r6) {
            r3 = this;
            r3.mResolvedType = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L14
            int r6 = r3.mIndicatedType
            if (r6 != r2) goto Lf
            r3.mResolvedType = r5
            goto L1f
        Lf:
            if (r6 != r1) goto L1f
            r3.mResolvedType = r0
            goto L1f
        L14:
            int r6 = r3.mIndicatedType
            if (r6 != r2) goto L1b
            r3.mResolvedType = r0
            goto L1f
        L1b:
            if (r6 != r1) goto L1f
            r3.mResolvedType = r5
        L1f:
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 == 0) goto L2a
            androidx.constraintlayout.core.widgets.Barrier r4 = (androidx.constraintlayout.core.widgets.Barrier) r4
            int r5 = r3.mResolvedType
            r4.setBarrierType(r5)
        L2a:
            return
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            boolean r0 = r0.getAllowsGoneWidget()
            return r0
    }

    public boolean getAllowsGoneWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            boolean r0 = r0.getAllowsGoneWidget()
            return r0
    }

    public int getMargin() {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            int r0 = r0.getMargin()
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.mIndicatedType
            return r0
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r7) {
            r6 = this;
            super.init(r7)
            androidx.constraintlayout.core.widgets.Barrier r0 = new androidx.constraintlayout.core.widgets.Barrier
            r0.<init>()
            r6.mBarrier = r0
            if (r7 == 0) goto L50
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L4d
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_barrierDirection
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L4a
        L2e:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets
            if (r3 != r4) goto L3d
            androidx.constraintlayout.core.widgets.Barrier r4 = r6.mBarrier
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.setAllowsGoneWidget(r3)
            goto L4a
        L3d:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_barrierMargin
            if (r3 != r4) goto L4a
            int r3 = r7.getDimensionPixelSize(r3, r1)
            androidx.constraintlayout.core.widgets.Barrier r4 = r6.mBarrier
            r4.setMargin(r3)
        L4a:
            int r2 = r2 + 1
            goto L1c
        L4d:
            r7.recycle()
        L50:
            androidx.constraintlayout.core.widgets.Barrier r7 = r6.mBarrier
            r6.mHelperWidget = r7
            r6.validateParams()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, androidx.constraintlayout.core.widgets.HelperWidget r2, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r4) {
            r0 = this;
            super.loadParameters(r1, r2, r3, r4)
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L29
            r3 = r2
            androidx.constraintlayout.core.widgets.Barrier r3 = (androidx.constraintlayout.core.widgets.Barrier) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r2
            boolean r2 = r2.isRtl()
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r1.layout
            int r4 = r4.mBarrierDirection
            r0.updateType(r3, r4, r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
            boolean r2 = r2.mBarrierAllowsGoneWidgets
            r3.setAllowsGoneWidget(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r1 = r1.mBarrierMargin
            r3.setMargin(r1)
        L29:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget r2, boolean r3) {
            r1 = this;
            int r0 = r1.mIndicatedType
            r1.updateType(r2, r0, r3)
            return
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            r0.setAllowsGoneWidget(r2)
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            r0.setMargin(r2)
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrier
            r0.setMargin(r2)
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.mIndicatedType = r1
            return
    }
}
