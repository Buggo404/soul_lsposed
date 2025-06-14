package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.mBaselineAligned = r0
            r1 = -1
            r11.mBaselineAlignedChildIndex = r1
            r2 = 0
            r11.mBaselineChildTop = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.mGravity = r3
            int[] r3 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r3, r14, r2)
            int[] r6 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat
            android.content.res.TypedArray r8 = r3.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_orientation
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L30
            r11.setOrientation(r12)
        L30:
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_gravity
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L3b
            r11.setGravity(r12)
        L3b:
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r12 = r3.getBoolean(r12, r0)
            if (r12 != 0) goto L46
            r11.setBaselineAligned(r12)
        L46:
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_weightSum
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = r3.getFloat(r12, r13)
            r11.mWeightSum = r12
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r12 = r3.getInt(r12, r1)
            r11.mBaselineAlignedChildIndex = r12
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r12 = r3.getBoolean(r12, r2)
            r11.mUseLargestChild = r12
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r12)
            r11.setDividerDrawable(r12)
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_showDividers
            int r12 = r3.getInt(r12, r2)
            r11.mShowDividers = r12
            int r12 = androidx.appcompat.C0015R.styleable.LinearLayoutCompat_dividerPadding
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.mDividerPadding = r12
            r3.recycle()
            return
    }

    private void forceUniformHeight(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.getVirtualChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            int r2 = r8.height
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.width
            int r2 = r3.getMeasuredWidth()
            r8.width = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r12
            r6 = r0
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.width = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private void forceUniformWidth(int r11, int r12) {
            r10 = this;
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lb:
            if (r1 >= r11) goto L3a
            android.view.View r3 = r10.getVirtualChildAt(r1)
            int r2 = r3.getVisibility()
            r4 = 8
            if (r2 == r4) goto L37
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            int r2 = r8.width
            r4 = -1
            if (r2 != r4) goto L37
            int r9 = r8.height
            int r2 = r3.getMeasuredHeight()
            r8.height = r2
            r5 = 0
            r7 = 0
            r2 = r10
            r4 = r0
            r6 = r12
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r8.height = r9
        L37:
            int r1 = r1 + 1
            goto Lb
        L3a:
            return
    }

    private void setChildFrame(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r4 = r4 + r2
            int r5 = r5 + r3
            r1.layout(r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            return r1
    }

    void drawDividersHorizontal(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r6)
            r2 = 0
        L9:
            if (r2 >= r0) goto L3f
            android.view.View r3 = r6.getVirtualChildAt(r2)
            if (r3 == 0) goto L3c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L3c
            boolean r4 = r6.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L3c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r1 == 0) goto L2f
            int r3 = r3.getRight()
            int r4 = r4.rightMargin
            int r3 = r3 + r4
            goto L39
        L2f:
            int r3 = r3.getLeft()
            int r4 = r4.leftMargin
            int r3 = r3 - r4
            int r4 = r6.mDividerWidth
            int r3 = r3 - r4
        L39:
            r6.drawVerticalDivider(r7, r3)
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            boolean r2 = r6.hasDividerBeforeChildAt(r0)
            if (r2 == 0) goto L7d
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getVirtualChildAt(r0)
            if (r0 != 0) goto L60
            if (r1 == 0) goto L54
            int r0 = r6.getPaddingLeft()
            goto L7a
        L54:
            int r0 = r6.getWidth()
            int r1 = r6.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
            goto L71
        L60:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            if (r1 == 0) goto L73
            int r0 = r0.getLeft()
            int r1 = r2.leftMargin
            int r0 = r0 - r1
            int r1 = r6.mDividerWidth
        L71:
            int r0 = r0 - r1
            goto L7a
        L73:
            int r0 = r0.getRight()
            int r1 = r2.rightMargin
            int r0 = r0 + r1
        L7a:
            r6.drawVerticalDivider(r7, r0)
        L7d:
            return
    }

    void drawDividersVertical(android.graphics.Canvas r6) {
            r5 = this;
            int r0 = r5.getVirtualChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r5.getVirtualChildAt(r1)
            if (r2 == 0) goto L2e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L2e
            boolean r3 = r5.hasDividerBeforeChildAt(r1)
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r2 = r2.getTop()
            int r3 = r3.topMargin
            int r2 = r2 - r3
            int r3 = r5.mDividerHeight
            int r2 = r2 - r3
            r5.drawHorizontalDivider(r6, r2)
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            boolean r1 = r5.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto L5c
            int r0 = r0 + (-1)
            android.view.View r0 = r5.getVirtualChildAt(r0)
            if (r0 != 0) goto L4c
            int r0 = r5.getHeight()
            int r1 = r5.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r5.mDividerHeight
            int r0 = r0 - r1
            goto L59
        L4c:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L59:
            r5.drawHorizontalDivider(r6, r0)
        L5c:
            return
    }

    void drawHorizontalDivider(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mDivider
            int r1 = r4.getPaddingLeft()
            int r2 = r4.mDividerPadding
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.mDividerPadding
            int r2 = r2 - r3
            int r3 = r4.mDividerHeight
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r6 = r4.mDivider
            r6.draw(r5)
            return
    }

    void drawVerticalDivider(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDivider
            int r1 = r5.getPaddingTop()
            int r2 = r5.mDividerPadding
            int r1 = r1 + r2
            int r2 = r5.mDividerWidth
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mDividerPadding
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r7 = r5.mDivider
            r7.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r1, r1)
            return r0
        Lb:
            r2 = 1
            if (r0 != r2) goto L15
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.mBaselineAlignedChildIndex
            if (r0 <= r1) goto L77
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L29
            int r0 = r5.mBaselineAlignedChildIndex
            if (r0 != 0) goto L21
            return r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r0.<init>(r1)
            throw r0
        L29:
            int r2 = r5.mBaselineChildTop
            int r3 = r5.mOrientation
            r4 = 1
            if (r3 != r4) goto L6c
            int r3 = r5.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6c
            r4 = 16
            if (r3 == r4) goto L53
            r4 = 80
            if (r3 == r4) goto L41
            goto L6c
        L41:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r5.mTotalLength
            int r2 = r2 - r3
            goto L6c
        L53:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mTotalLength
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            int r0 = r0.topMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.mBaselineAlignedChildIndex
            return r0
    }

    int getChildrenSkipCount(android.view.View r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.mDividerPadding
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.mDividerWidth
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    int getLocationOffset(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    int getNextLocationOffset(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.mShowDividers
            return r0
    }

    android.view.View getVirtualChildAt(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            return r1
    }

    int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.mWeightSum
            return r0
    }

    protected boolean hasDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r5 = r4.mShowDividers
            r5 = r5 & r1
            if (r5 == 0) goto La
            r0 = r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r5 = r4.mShowDividers
            r5 = r5 & 4
            if (r5 == 0) goto L18
            r0 = r1
        L18:
            return r0
        L19:
            int r2 = r4.mShowDividers
            r2 = r2 & 2
            if (r2 == 0) goto L33
            int r5 = r5 - r1
        L20:
            if (r5 < 0) goto L33
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L30
            r0 = r1
            goto L33
        L30:
            int r5 = r5 + (-1)
            goto L20
        L33:
            return r0
    }

    public boolean isBaselineAligned() {
            r1 = this;
            boolean r0 = r1.mBaselineAligned
            return r0
    }

    public boolean isMeasureWithLargestChildEnabled() {
            r1 = this;
            boolean r0 = r1.mUseLargestChild
            return r0
    }

    void layoutHorizontal(int r25, int r26, int r27, int r28) {
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.mGravity
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.mBaselineAligned
            int[] r13 = r6.mMaxAscent
            int[] r14 = r6.mMaxDescent
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r24)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L4b
            r2 = 5
            if (r1 == r2) goto L3f
            int r1 = r24.getPaddingLeft()
            goto L56
        L3f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            goto L56
        L4b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.mTotalLength
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L56:
            r2 = 0
            if (r0 == 0) goto L60
            int r0 = r10 + (-1)
            r16 = r0
            r17 = -1
            goto L64
        L60:
            r16 = r2
            r17 = r5
        L64:
            r3 = r2
        L65:
            if (r3 >= r10) goto L149
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.getVirtualChildAt(r2)
            if (r0 != 0) goto L80
            int r0 = r6.measureNullChild(r2)
            int r1 = r1 + r0
            r21 = r5
            r22 = r7
            r19 = r10
            r20 = r11
            goto L13a
        L80:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L130
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            r18 = r3
            if (r12 == 0) goto La8
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto Laa
            int r10 = r0.getBaseline()
            goto Lab
        La8:
            r19 = r10
        Laa:
            r10 = -1
        Lab:
            int r3 = r4.gravity
            if (r3 >= 0) goto Lb0
            r3 = r11
        Lb0:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto Leb
            r11 = 48
            if (r3 == r11) goto Ld9
            r11 = 80
            if (r3 == r11) goto Lc3
            r3 = r7
            r11 = -1
            goto Le8
        Lc3:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto Le8
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto Le8
        Ld9:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto Le8
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto Lf9
        Le8:
            r21 = 1
            goto Lf9
        Leb:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        Lf9:
            boolean r10 = r6.hasDividerBeforeChildAt(r2)
            if (r10 == 0) goto L102
            int r10 = r6.mDividerWidth
            int r1 = r1 + r10
        L102:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.getLocationOffset(r0)
            int r22 = r10 + r1
            r25 = r0
            r0 = r24
            r1 = r25
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.getNextLocationOffset(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.getChildrenSkipCount(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L13c
        L130:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
        L13a:
            r23 = -1
        L13c:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r22
            r15 = 2
            goto L65
        L149:
            return
    }

    void layoutVertical(int r18, int r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.getVirtualChildAt(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.measureNullChild(r12)
            int r0 = r0 + r1
            goto Lc7
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc7
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r17)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.hasDividerBeforeChildAt(r12)
            if (r1 == 0) goto La2
            int r1 = r6.mDividerHeight
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.getLocationOffset(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.getNextLocationOffset(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.getChildrenSkipCount(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc8
        Lc7:
            r1 = r14
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
    }

    void measureChildBeforeLayout(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    void measureHorizontal(int r39, int r40) {
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.mMaxAscent
            r14 = 4
            if (r0 == 0) goto L1e
            int[] r0 = r7.mMaxDescent
            if (r0 != 0) goto L26
        L1e:
            int[] r0 = new int[r14]
            r7.mMaxAscent = r0
            int[] r0 = new int[r14]
            r7.mMaxDescent = r0
        L26:
            int[] r15 = r7.mMaxAscent
            int[] r6 = r7.mMaxDescent
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.mBaselineAligned
            boolean r3 = r7.mUseLargestChild
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L4c
            r19 = r18
            goto L4e
        L4c:
            r19 = r10
        L4e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L62:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L20a
            android.view.View r6 = r7.getVirtualChildAt(r1)
            if (r6 != 0) goto L82
            int r5 = r7.mTotalLength
            int r6 = r7.measureNullChild(r1)
            int r5 = r5 + r6
            r7.mTotalLength = r5
        L77:
            r32 = r3
            r36 = r4
            r37 = r2
            r2 = r1
            r1 = r37
            goto L1f7
        L82:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L8e
            int r5 = r7.getChildrenSkipCount(r6, r1)
            int r1 = r1 + r5
            goto L77
        L8e:
            boolean r5 = r7.hasDividerBeforeChildAt(r1)
            if (r5 == 0) goto L9b
            int r5 = r7.mTotalLength
            int r10 = r7.mDividerWidth
            int r5 = r5 + r10
            r7.mTotalLength = r5
        L9b:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r5 = r10.weight
            float r31 = r0 + r5
            if (r12 != r2) goto Lf1
            int r0 = r10.width
            if (r0 != 0) goto Lf1
            float r0 = r10.weight
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto Lf1
            if (r19 == 0) goto Lbf
            int r0 = r7.mTotalLength
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.mTotalLength = r0
            goto Lcd
        Lbf:
            int r0 = r7.mTotalLength
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.mTotalLength = r0
        Lcd:
            if (r4 == 0) goto Le2
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L16d
        Le2:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = -2
            goto L16f
        Lf1:
            int r0 = r10.width
            if (r0 != 0) goto L100
            float r0 = r10.weight
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L100
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L103
        L100:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L103:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L10c
            int r0 = r7.mTotalLength
            r29 = r0
            goto L10e
        L10c:
            r29 = 0
        L10e:
            r33 = 0
            r0 = r38
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r39
            r36 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r40
            r30 = r29
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r6
            r6 = r33
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L137
            r10.width = r0
        L137:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L150
            int r1 = r7.mTotalLength
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.mTotalLength = r1
            goto L167
        L150:
            r3 = r29
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r1
        L167:
            if (r32 == 0) goto L16d
            int r14 = java.lang.Math.max(r0, r14)
        L16d:
            r1 = 1073741824(0x40000000, float:2.0)
        L16f:
            if (r13 == r1) goto L17b
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L17b
            r0 = r18
            r27 = r0
            goto L17c
        L17b:
            r0 = 0
        L17c:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L1bc
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L1bc
            int r6 = r10.gravity
            if (r6 >= 0) goto L1a0
            int r6 = r7.mGravity
            goto L1a2
        L1a0:
            int r6 = r10.gravity
        L1a2:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & (-2)
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L1bc:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L1cc
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L1cc
            r26 = r18
            goto L1ce
        L1cc:
            r26 = 0
        L1ce:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L1df
            if (r0 == 0) goto L1d7
            goto L1d8
        L1d7:
            r2 = r4
        L1d8:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L1ed
        L1df:
            r10 = r23
            if (r0 == 0) goto L1e4
            goto L1e5
        L1e4:
            r2 = r4
        L1e5:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L1ed:
            r10 = r34
            int r0 = r7.getChildrenSkipCount(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L1f7:
            int r2 = r2 + 1
            r9 = r40
            r6 = r28
            r3 = r32
            r4 = r36
            r5 = -1
            r10 = 0
            r37 = r2
            r2 = r1
            r1 = r37
            goto L62
        L20a:
            r1 = r2
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.mTotalLength
            if (r3 <= 0) goto L22c
            boolean r3 = r7.hasDividerBeforeChildAt(r11)
            if (r3 == 0) goto L22c
            int r3 = r7.mTotalLength
            int r1 = r7.mDividerWidth
            int r3 = r3 + r1
            r7.mTotalLength = r3
        L22c:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L244
            r21 = 0
            r5 = r15[r21]
            if (r5 != r3) goto L244
            r5 = r15[r17]
            if (r5 != r3) goto L244
            r5 = r15[r16]
            if (r5 == r3) goto L240
            goto L244
        L240:
            r1 = r2
            r23 = r6
            goto L273
        L244:
            r3 = r15[r16]
            r5 = 0
            r9 = r15[r5]
            r5 = r15[r17]
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L273:
            if (r32 == 0) goto L2d6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L27b
            if (r12 != 0) goto L2d6
        L27b:
            r2 = 0
            r7.mTotalLength = r2
            r2 = 0
        L27f:
            if (r2 >= r11) goto L2d6
            android.view.View r3 = r7.getVirtualChildAt(r2)
            if (r3 != 0) goto L291
            int r3 = r7.mTotalLength
            int r5 = r7.measureNullChild(r2)
            int r3 = r3 + r5
            r7.mTotalLength = r3
            goto L29e
        L291:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L2a1
            int r3 = r7.getChildrenSkipCount(r3, r2)
            int r2 = r2 + r3
        L29e:
            r21 = r1
            goto L2d1
        L2a1:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            if (r19 == 0) goto L2ba
            int r6 = r7.mTotalLength
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.getNextLocationOffset(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.mTotalLength = r6
            goto L29e
        L2ba:
            int r6 = r7.mTotalLength
            int r9 = r6 + r14
            r21 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.getNextLocationOffset(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.mTotalLength = r1
        L2d1:
            int r2 = r2 + 1
            r1 = r21
            goto L27f
        L2d6:
            r21 = r1
            int r1 = r7.mTotalLength
            int r2 = r38.getPaddingLeft()
            int r3 = r38.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.mTotalLength = r1
            int r2 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.mTotalLength
            int r2 = r2 - r3
            if (r24 != 0) goto L347
            if (r2 == 0) goto L303
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L303
            goto L347
        L303:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L33f
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L33f
            r10 = 0
        L30e:
            if (r10 >= r11) goto L33f
            android.view.View r2 = r7.getVirtualChildAt(r10)
            if (r2 == 0) goto L33c
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L31f
            goto L33c
        L31f:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L33c
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L33c:
            int r10 = r10 + 1
            goto L30e
        L33f:
            r2 = r40
            r25 = r11
            r3 = r21
            goto L4e3
        L347:
            float r5 = r7.mWeightSum
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L34e
            r0 = r5
        L34e:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.mTotalLength = r6
            r6 = r4
            r4 = r5
            r9 = r23
            r10 = 0
        L367:
            if (r10 >= r11) goto L48c
            android.view.View r14 = r7.getVirtualChildAt(r10)
            if (r14 == 0) goto L47d
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L379
            goto L47d
        L379:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r3 = r5.weight
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L3e1
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r40
            int r0 = getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L3bf
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L3b3
            goto L3c1
        L3b3:
            if (r8 <= 0) goto L3b6
            goto L3b7
        L3b6:
            r8 = 0
        L3b7:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            goto L3d1
        L3bf:
            r3 = 1073741824(0x40000000, float:2.0)
        L3c1:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L3ca
            r8 = 0
        L3ca:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
        L3d1:
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L3e7
        L3e1:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r40
        L3e7:
            if (r19 == 0) goto L404
            int r8 = r7.mTotalLength
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.getNextLocationOffset(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.mTotalLength = r8
            r23 = r0
            goto L41e
        L404:
            int r8 = r7.mTotalLength
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.getNextLocationOffset(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.mTotalLength = r0
        L41e:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L42a
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L42a
            r0 = r18
            goto L42b
        L42a:
            r0 = 0
        L42b:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L43c
            goto L43d
        L43c:
            r8 = r11
        L43d:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L44b
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L44c
            r6 = r18
            goto L44d
        L44b:
            r8 = -1
        L44c:
            r6 = 0
        L44d:
            if (r36 == 0) goto L477
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L477
            int r8 = r5.gravity
            if (r8 >= 0) goto L45c
            int r5 = r7.mGravity
            goto L45e
        L45c:
            int r5 = r5.gravity
        L45e:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & (-2)
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L477:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L482
        L47d:
            r3 = r2
            r25 = r11
            r2 = r40
        L482:
            int r10 = r10 + 1
            r8 = r39
            r2 = r3
            r11 = r25
            r5 = -1
            goto L367
        L48c:
            r2 = r40
            r25 = r11
            int r0 = r7.mTotalLength
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.mTotalLength = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L4b3
            r5 = 0
            r8 = r15[r5]
            if (r8 != r3) goto L4b3
            r5 = r15[r17]
            if (r5 != r3) goto L4b3
            r5 = r15[r16]
            if (r5 == r3) goto L4b1
            goto L4b3
        L4b1:
            r0 = r4
            goto L4df
        L4b3:
            r3 = r15[r16]
            r5 = 0
            r8 = r15[r5]
            r10 = r15[r17]
            int r0 = java.lang.Math.max(r0, r10)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r3, r0)
            r3 = r28[r16]
            r5 = r28[r5]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L4df:
            r3 = r0
            r0 = r6
            r23 = r9
        L4e3:
            if (r26 != 0) goto L4ea
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L4ea
            goto L4eb
        L4ea:
            r0 = r3
        L4eb:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L514
            r0 = r39
            r1 = r25
            r7.forceUniformHeight(r1, r0)
        L514:
            return
    }

    int measureNullChild(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    void measureVertical(int r34, int r35) {
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.mBaselineAlignedChildIndex
            boolean r15 = r7.mUseLargestChild
            r16 = 1
            r17 = 0
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r19 = r16
            r0 = r17
        L2b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L19f
            android.view.View r4 = r7.getVirtualChildAt(r6)
            if (r4 != 0) goto L48
            int r4 = r7.mTotalLength
            int r10 = r7.measureNullChild(r6)
            int r4 = r4 + r10
            r7.mTotalLength = r4
            r23 = r11
            r24 = r13
            r4 = r22
            goto L193
        L48:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L5f
            int r1 = r7.getChildrenSkipCount(r4, r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L193
        L5f:
            boolean r1 = r7.hasDividerBeforeChildAt(r6)
            if (r1 == 0) goto L6c
            int r1 = r7.mTotalLength
            int r10 = r7.mDividerHeight
            int r1 = r1 + r10
            r7.mTotalLength = r1
        L6c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto La8
            int r0 = r10.height
            if (r0 != 0) goto La8
            float r0 = r10.weight
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto La8
            int r0 = r7.mTotalLength
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r18 = r16
            r8 = r24
            r29 = r26
            r11 = r6
            r24 = r13
            r13 = r22
            goto L11a
        La8:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto Lb9
            float r0 = r10.weight
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            r0 = -2
            r10.height = r0
            r2 = 0
            goto Lbb
        Lb9:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        Lbb:
            r27 = 0
            int r0 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r0 != 0) goto Lc6
            int r0 = r7.mTotalLength
            r28 = r0
            goto Lc8
        Lc6:
            r28 = 0
        Lc8:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r13
            r13 = r22
            r22 = r4
            r32 = r23
            r23 = r11
            r11 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto Lf7
            r10.height = r0
        Lf7:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r1
            if (r15 == 0) goto L119
            int r0 = java.lang.Math.max(r0, r9)
            goto L11a
        L119:
            r0 = r9
        L11a:
            if (r14 < 0) goto L124
            int r6 = r11 + 1
            if (r14 != r6) goto L124
            int r1 = r7.mTotalLength
            r7.mBaselineChildTop = r1
        L124:
            if (r11 >= r14) goto L135
            float r1 = r10.weight
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 > 0) goto L12d
            goto L135
        L12d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L135:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L143
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L143
            r1 = r16
            r20 = r1
            goto L144
        L143:
            r1 = 0
        L144:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L166
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L166
            r19 = r16
            goto L168
        L166:
            r19 = 0
        L168:
            float r8 = r10.weight
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L179
            if (r1 == 0) goto L171
            goto L172
        L171:
            r2 = r4
        L172:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L184
        L179:
            if (r1 == 0) goto L17c
            goto L17d
        L17c:
            r2 = r4
        L17d:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L184:
            int r2 = r7.getChildrenSkipCount(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L193:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r11 = r23
            r13 = r24
            goto L2b
        L19f:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.mTotalLength
            if (r2 <= 0) goto L1bd
            r2 = r23
            boolean r3 = r7.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L1bf
            int r3 = r7.mTotalLength
            int r4 = r7.mDividerHeight
            int r3 = r3 + r4
            r7.mTotalLength = r3
            goto L1bf
        L1bd:
            r2 = r23
        L1bf:
            r3 = r24
            if (r15 == 0) goto L20e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L1c9
            if (r3 != 0) goto L20e
        L1c9:
            r4 = 0
            r7.mTotalLength = r4
            r4 = 0
        L1cd:
            if (r4 >= r2) goto L20e
            android.view.View r6 = r7.getVirtualChildAt(r4)
            if (r6 != 0) goto L1df
            int r6 = r7.mTotalLength
            int r11 = r7.measureNullChild(r4)
            int r6 = r6 + r11
            r7.mTotalLength = r6
            goto L209
        L1df:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L1eb
            int r6 = r7.getChildrenSkipCount(r6, r4)
            int r4 = r4 + r6
            goto L209
        L1eb:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r14 = r7.mTotalLength
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.getNextLocationOffset(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.mTotalLength = r6
        L209:
            int r4 = r4 + 1
            r10 = 8
            goto L1cd
        L20e:
            int r4 = r7.mTotalLength
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.mTotalLength = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.mTotalLength
            int r9 = r9 - r11
            if (r18 != 0) goto L27d
            if (r9 == 0) goto L23c
            int r11 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r11 <= 0) goto L23c
            goto L27d
        L23c:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L278
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L278
            r1 = 0
        L247:
            if (r1 >= r2) goto L278
            android.view.View r3 = r7.getVirtualChildAt(r1)
            if (r3 == 0) goto L275
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L258
            goto L275
        L258:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            float r9 = r9.weight
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L275
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L275:
            int r1 = r1 + 1
            goto L247
        L278:
            r11 = r34
            r1 = r8
            goto L371
        L27d:
            float r10 = r7.mWeightSum
            int r11 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r11 <= 0) goto L284
            r0 = r10
        L284:
            r10 = 0
            r7.mTotalLength = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = r10
        L28b:
            if (r8 >= r2) goto L360
            android.view.View r13 = r7.getVirtualChildAt(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L29f
            r21 = r11
            r11 = r34
            goto L359
        L29f:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r10 = r14.weight
            int r18 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r18 <= 0) goto L301
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L2e2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L2d6
            goto L2e4
        L2d6:
            if (r15 <= 0) goto L2d9
            goto L2da
        L2d9:
            r15 = 0
        L2da:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            goto L2f4
        L2e2:
            r10 = 1073741824(0x40000000, float:2.0)
        L2e4:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L2ed
            r15 = 0
        L2ed:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
        L2f4:
            int r0 = r13.getMeasuredState()
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L306
        L301:
            r10 = r11
            r11 = r34
            r21 = r10
        L306:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L324
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L327
            r0 = r16
            goto L328
        L324:
            r23 = r1
            r1 = -1
        L327:
            r0 = 0
        L328:
            if (r0 == 0) goto L32b
            goto L32c
        L32b:
            r10 = r15
        L32c:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L339
            int r9 = r14.width
            if (r9 != r1) goto L339
            r9 = r16
            goto L33a
        L339:
            r9 = 0
        L33a:
            int r10 = r7.mTotalLength
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.getNextLocationOffset(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.mTotalLength = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L359:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L28b
        L360:
            r11 = r34
            int r0 = r7.mTotalLength
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.mTotalLength = r0
            r0 = r9
        L371:
            if (r19 != 0) goto L378
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L378
            goto L379
        L378:
            r0 = r5
        L379:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L397
            r7.forceUniformWidth(r2, r6)
        L397:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto Le
            r2.drawDividersVertical(r3)
            goto L11
        Le:
            r2.drawDividersHorizontal(r3)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r2 = r1.mOrientation
            r0 = 1
            if (r2 != r0) goto L9
            r1.layoutVertical(r3, r4, r5, r6)
            goto Lc
        L9:
            r1.layoutHorizontal(r3, r4, r5, r6)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.measureVertical(r3, r4)
            goto Lc
        L9:
            r2.measureHorizontal(r3, r4)
        Lc:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.mBaselineAligned = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r3) {
            r2 = this;
            if (r3 < 0) goto Lb
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto Lb
            r2.mBaselineAlignedChildIndex = r3
            return
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "base aligned child index out of range (0, "
            r0.<init>(r1)
            int r1 = r2.getChildCount()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r3 != r0) goto L5
            return
        L5:
            r2.mDivider = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.mDividerWidth = r1
            int r1 = r3.getIntrinsicHeight()
            r2.mDividerHeight = r1
            goto L1b
        L17:
            r2.mDividerWidth = r0
            r2.mDividerHeight = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.mDividerPadding = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.mGravity = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.mGravity
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.mUseLargestChild = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 == r2) goto L9
            r1.mOrientation = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.mShowDividers
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mShowDividers = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.mGravity
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.mGravity = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.mWeightSum = r2
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
