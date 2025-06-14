package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Placeholder extends android.view.View {
    private android.view.View mContent;
    private int mContentId;
    private int mEmptyVisibility;

    public Placeholder(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.mContentId = r2
            r2 = 0
            r1.mContent = r2
            r0 = 4
            r1.mEmptyVisibility = r0
            r1.init(r2)
            return
    }

    public Placeholder(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.mContentId = r1
            r1 = 0
            r0.mContent = r1
            r1 = 4
            r0.mEmptyVisibility = r1
            r0.init(r2)
            return
    }

    public Placeholder(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mContentId = r1
            r1 = 0
            r0.mContent = r1
            r1 = 4
            r0.mEmptyVisibility = r1
            r0.init(r2)
            return
    }

    public Placeholder(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mContentId = r1
            r1 = 0
            r0.mContent = r1
            r1 = 4
            r0.mEmptyVisibility = r1
            r0.init(r2)
            return
    }

    private void init(android.util.AttributeSet r5) {
            r4 = this;
            int r0 = r4.mEmptyVisibility
            super.setVisibility(r0)
            r0 = -1
            r4.mContentId = r0
            if (r5 == 0) goto L3e
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_placeholder
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L19:
            if (r1 >= r0) goto L3b
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_placeholder_content
            if (r2 != r3) goto L2c
            int r3 = r4.mContentId
            int r2 = r5.getResourceId(r2, r3)
            r4.mContentId = r2
            goto L38
        L2c:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility
            if (r2 != r3) goto L38
            int r3 = r4.mEmptyVisibility
            int r2 = r5.getInt(r2, r3)
            r4.mEmptyVisibility = r2
        L38:
            int r1 = r1 + 1
            goto L19
        L3b:
            r5.recycle()
        L3e:
            return
    }

    public android.view.View getContent() {
            r1 = this;
            android.view.View r0 = r1.mContent
            return r0
    }

    public int getEmptyVisibility() {
            r1 = this;
            int r0 = r1.mEmptyVisibility
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 == 0) goto L68
            r0 = 223(0xdf, float:3.12E-43)
            r8.drawRGB(r0, r0, r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 210(0xd2, float:2.94E-43)
            r0.setARGB(r1, r2, r2, r2)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r2 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            r0.setTypeface(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.getClipBounds(r1)
            int r3 = r1.height()
            float r3 = (float) r3
            r0.setTextSize(r3)
            int r3 = r1.height()
            int r4 = r1.width()
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r5)
            r5 = 1
            java.lang.String r6 = "?"
            r0.getTextBounds(r6, r2, r5, r1)
            float r2 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            int r5 = r1.width()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r2 = r2 - r5
            int r5 = r1.left
            float r5 = (float) r5
            float r2 = r2 - r5
            float r3 = (float) r3
            float r3 = r3 / r4
            int r5 = r1.height()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r3 = r3 + r5
            int r1 = r1.bottom
            float r1 = (float) r1
            float r3 = r3 - r1
            r8.drawText(r6, r2, r3, r0)
        L68:
            return
    }

    public void setContentId(int r3) {
            r2 = this;
            int r0 = r2.mContentId
            if (r0 != r3) goto L5
            return
        L5:
            android.view.View r0 = r2.mContent
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.mContent
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.isInPlaceholder = r1
            r0 = 0
            r2.mContent = r0
        L1a:
            r2.mContentId = r3
            r0 = -1
            if (r3 == r0) goto L30
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L30
            r0 = 8
            r3.setVisibility(r0)
        L30:
            return
    }

    public void setEmptyVisibility(int r1) {
            r0 = this;
            r0.mEmptyVisibility = r1
            return
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout r4) {
            r3 = this;
            android.view.View r4 = r3.mContent
            if (r4 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            android.view.View r0 = r3.mContent
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            r2 = 0
            r1.setVisibility(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r4.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 == r2) goto L2e
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r4.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.widget
            int r2 = r2.getWidth()
            r1.setWidth(r2)
        L2e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r4.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 == r2) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            int r1 = r1.getHeight()
            r4.setHeight(r1)
        L43:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.widget
            r0 = 8
            r4.setVisibility(r0)
            return
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r3) {
            r2 = this;
            int r0 = r2.mContentId
            r1 = -1
            if (r0 != r1) goto L10
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L10
            int r0 = r2.mEmptyVisibility
            r2.setVisibility(r0)
        L10:
            int r0 = r2.mContentId
            android.view.View r3 = r3.findViewById(r0)
            r2.mContent = r3
            if (r3 == 0) goto L2c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            r0 = 1
            r3.isInPlaceholder = r0
            android.view.View r3 = r2.mContent
            r0 = 0
            r3.setVisibility(r0)
            r2.setVisibility(r0)
        L2c:
            return
    }
}
