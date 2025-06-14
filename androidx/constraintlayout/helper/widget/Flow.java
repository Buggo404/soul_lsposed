package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class Flow extends androidx.constraintlayout.widget.VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final java.lang.String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.Flow mFlow;

    public Flow(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public Flow(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public Flow(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r7) {
            r6 = this;
            super.init(r7)
            androidx.constraintlayout.core.widgets.Flow r0 = new androidx.constraintlayout.core.widgets.Flow
            r0.<init>()
            r6.mFlow = r0
            if (r7 == 0) goto L1aa
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L1a7
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_orientation
            if (r3 != r4) goto L31
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setOrientation(r3)
            goto L1a3
        L31:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_padding
            if (r3 != r4) goto L40
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPadding(r3)
            goto L1a3
        L40:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingStart
            if (r3 != r4) goto L4f
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingStart(r3)
            goto L1a3
        L4f:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingEnd
            if (r3 != r4) goto L5e
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingEnd(r3)
            goto L1a3
        L5e:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingLeft
            if (r3 != r4) goto L6d
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingLeft(r3)
            goto L1a3
        L6d:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingTop
            if (r3 != r4) goto L7c
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingTop(r3)
            goto L1a3
        L7c:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingRight
            if (r3 != r4) goto L8b
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingRight(r3)
            goto L1a3
        L8b:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_android_paddingBottom
            if (r3 != r4) goto L9a
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setPaddingBottom(r3)
            goto L1a3
        L9a:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_wrapMode
            if (r3 != r4) goto La9
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setWrapMode(r3)
            goto L1a3
        La9:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_horizontalStyle
            if (r3 != r4) goto Lb8
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setHorizontalStyle(r3)
            goto L1a3
        Lb8:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_verticalStyle
            if (r3 != r4) goto Lc7
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setVerticalStyle(r3)
            goto L1a3
        Lc7:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle
            if (r3 != r4) goto Ld6
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setFirstHorizontalStyle(r3)
            goto L1a3
        Ld6:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle
            if (r3 != r4) goto Le5
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setLastHorizontalStyle(r3)
            goto L1a3
        Le5:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle
            if (r3 != r4) goto Lf4
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setFirstVerticalStyle(r3)
            goto L1a3
        Lf4:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle
            if (r3 != r4) goto L103
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r1)
            r4.setLastVerticalStyle(r3)
            goto L1a3
        L103:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_horizontalBias
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 != r4) goto L114
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setHorizontalBias(r3)
            goto L1a3
        L114:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias
            if (r3 != r4) goto L123
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setFirstHorizontalBias(r3)
            goto L1a3
        L123:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias
            if (r3 != r4) goto L132
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setLastHorizontalBias(r3)
            goto L1a3
        L132:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias
            if (r3 != r4) goto L140
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setFirstVerticalBias(r3)
            goto L1a3
        L140:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias
            if (r3 != r4) goto L14e
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setLastVerticalBias(r3)
            goto L1a3
        L14e:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_verticalBias
            if (r3 != r4) goto L15c
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            float r3 = r7.getFloat(r3, r5)
            r4.setVerticalBias(r3)
            goto L1a3
        L15c:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_horizontalAlign
            r5 = 2
            if (r3 != r4) goto L16b
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r5)
            r4.setHorizontalAlign(r3)
            goto L1a3
        L16b:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_verticalAlign
            if (r3 != r4) goto L179
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getInt(r3, r5)
            r4.setVerticalAlign(r3)
            goto L1a3
        L179:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_horizontalGap
            if (r3 != r4) goto L187
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setHorizontalGap(r3)
            goto L1a3
        L187:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_verticalGap
            if (r3 != r4) goto L195
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            int r3 = r7.getDimensionPixelSize(r3, r1)
            r4.setVerticalGap(r3)
            goto L1a3
        L195:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap
            if (r3 != r4) goto L1a3
            androidx.constraintlayout.core.widgets.Flow r4 = r6.mFlow
            r5 = -1
            int r3 = r7.getInt(r3, r5)
            r4.setMaxElementsWrap(r3)
        L1a3:
            int r2 = r2 + 1
            goto L1c
        L1a7:
            r7.recycle()
        L1aa:
            androidx.constraintlayout.core.widgets.Flow r7 = r6.mFlow
            r6.mHelperWidget = r7
            r6.validateParams()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, androidx.constraintlayout.core.widgets.HelperWidget r2, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r4) {
            r0 = this;
            super.loadParameters(r1, r2, r3, r4)
            boolean r1 = r2 instanceof androidx.constraintlayout.core.widgets.Flow
            if (r1 == 0) goto L13
            androidx.constraintlayout.core.widgets.Flow r2 = (androidx.constraintlayout.core.widgets.Flow) r2
            int r1 = r3.orientation
            r4 = -1
            if (r1 == r4) goto L13
            int r1 = r3.orientation
            r2.setOrientation(r1)
        L13:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
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
    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.core.widgets.Flow r1 = r0.mFlow
            r1.applyRtl(r2)
            return
    }

    public void setFirstHorizontalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setFirstHorizontalBias(r2)
            r1.requestLayout()
            return
    }

    public void setFirstHorizontalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setFirstHorizontalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setFirstVerticalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setFirstVerticalBias(r2)
            r1.requestLayout()
            return
    }

    public void setFirstVerticalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setFirstVerticalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setHorizontalAlign(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setHorizontalAlign(r2)
            r1.requestLayout()
            return
    }

    public void setHorizontalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setHorizontalBias(r2)
            r1.requestLayout()
            return
    }

    public void setHorizontalGap(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setHorizontalGap(r2)
            r1.requestLayout()
            return
    }

    public void setHorizontalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setHorizontalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setLastHorizontalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setLastHorizontalBias(r2)
            r1.requestLayout()
            return
    }

    public void setLastHorizontalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setLastHorizontalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setLastVerticalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setLastVerticalBias(r2)
            r1.requestLayout()
            return
    }

    public void setLastVerticalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setLastVerticalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setMaxElementsWrap(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setMaxElementsWrap(r2)
            r1.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setOrientation(r2)
            r1.requestLayout()
            return
    }

    public void setPadding(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setPadding(r2)
            r1.requestLayout()
            return
    }

    public void setPaddingBottom(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setPaddingBottom(r2)
            r1.requestLayout()
            return
    }

    public void setPaddingLeft(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setPaddingLeft(r2)
            r1.requestLayout()
            return
    }

    public void setPaddingRight(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setPaddingRight(r2)
            r1.requestLayout()
            return
    }

    public void setPaddingTop(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setPaddingTop(r2)
            r1.requestLayout()
            return
    }

    public void setVerticalAlign(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setVerticalAlign(r2)
            r1.requestLayout()
            return
    }

    public void setVerticalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setVerticalBias(r2)
            r1.requestLayout()
            return
    }

    public void setVerticalGap(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setVerticalGap(r2)
            r1.requestLayout()
            return
    }

    public void setVerticalStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setVerticalStyle(r2)
            r1.requestLayout()
            return
    }

    public void setWrapMode(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.Flow r0 = r1.mFlow
            r0.setWrapMode(r2)
            r1.requestLayout()
            return
    }
}
