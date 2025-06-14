package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {
    private android.view.View mClose;
    private android.view.View mCloseButton;
    private int mCloseItemLayout;
    private android.view.View mCustomView;
    private java.lang.CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private android.widget.TextView mSubtitleView;
    private java.lang.CharSequence mTitle;
    private android.widget.LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private android.widget.TextView mTitleView;


    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.actionModeStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            int[] r0 = androidx.appcompat.C0015R.styleable.ActionMode
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r4, r0, r5, r1)
            int r4 = androidx.appcompat.C0015R.styleable.ActionMode_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            androidx.core.view.ViewCompat.setBackground(r2, r4)
            int r4 = androidx.appcompat.C0015R.styleable.ActionMode_titleTextStyle
            int r4 = r3.getResourceId(r4, r1)
            r2.mTitleStyleRes = r4
            int r4 = androidx.appcompat.C0015R.styleable.ActionMode_subtitleTextStyle
            int r4 = r3.getResourceId(r4, r1)
            r2.mSubtitleStyleRes = r4
            int r4 = androidx.appcompat.C0015R.styleable.ActionMode_height
            int r4 = r3.getLayoutDimension(r4, r1)
            r2.mContentHeight = r4
            int r4 = androidx.appcompat.C0015R.styleable.ActionMode_closeItemLayout
            int r5 = androidx.appcompat.C0015R.layout.abc_action_mode_close_item_material
            int r4 = r3.getResourceId(r4, r5)
            r2.mCloseItemLayout = r4
            r3.recycle()
            return
    }

    private void initTitle() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.mTitleLayout
            if (r0 != 0) goto L53
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.appcompat.C0015R.layout.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.mTitleLayout = r0
            int r1 = androidx.appcompat.C0015R.id.action_bar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.mTitleView = r0
            android.widget.LinearLayout r0 = r6.mTitleLayout
            int r1 = androidx.appcompat.C0015R.id.action_bar_subtitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.mSubtitleView = r0
            int r0 = r6.mTitleStyleRes
            if (r0 == 0) goto L44
            android.widget.TextView r0 = r6.mTitleView
            android.content.Context r1 = r6.getContext()
            int r2 = r6.mTitleStyleRes
            r0.setTextAppearance(r1, r2)
        L44:
            int r0 = r6.mSubtitleStyleRes
            if (r0 == 0) goto L53
            android.widget.TextView r0 = r6.mSubtitleView
            android.content.Context r1 = r6.getContext()
            int r2 = r6.mSubtitleStyleRes
            r0.setTextAppearance(r1, r2)
        L53:
            android.widget.TextView r0 = r6.mTitleView
            java.lang.CharSequence r1 = r6.mTitle
            r0.setText(r1)
            android.widget.TextView r0 = r6.mSubtitleView
            java.lang.CharSequence r1 = r6.mSubtitle
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.mSubtitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.mSubtitleView
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L7a
            r5 = r3
            goto L7b
        L7a:
            r5 = r4
        L7b:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.mTitleLayout
            if (r0 != 0) goto L86
            if (r1 == 0) goto L85
            goto L86
        L85:
            r3 = r4
        L86:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.mTitleLayout
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L96
            android.widget.LinearLayout r0 = r6.mTitleLayout
            r6.addView(r0)
        L96:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int r1) {
            r0 = this;
            super.animateToVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
            r1 = this;
            boolean r0 = super.canShowOverflowMenu()
            return r0
    }

    public void closeMode() {
            r1 = this;
            android.view.View r0 = r1.mClose
            if (r0 != 0) goto L7
            r1.killMode()
        L7:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
            r0 = this;
            super.dismissPopupMenus()
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.hideOverflowMenu()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void initForMode(androidx.appcompat.view.ActionMode r4) {
            r3 = this;
            android.view.View r0 = r3.mClose
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.mCloseItemLayout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.mClose = r0
            r3.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r3.mClose
            r3.addView(r0)
        L24:
            android.view.View r0 = r3.mClose
            int r1 = androidx.appcompat.C0015R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.mCloseButton = r0
            androidx.appcompat.widget.ActionBarContextView$1 r1 = new androidx.appcompat.widget.ActionBarContextView$1
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.getMenu()
            androidx.appcompat.view.menu.MenuBuilder r4 = (androidx.appcompat.view.menu.MenuBuilder) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            if (r0 == 0) goto L45
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            r0.dismissPopupMenus()
        L45:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.mActionMenuPresenter = r0
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            r1 = 1
            r0.setReserveOverflow(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.mActionMenuPresenter
            android.content.Context r2 = r3.mPopupContext
            r4.addMenuPresenter(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.mActionMenuPresenter
            androidx.appcompat.view.menu.MenuView r4 = r4.getMenuView(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.mMenuView = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.mMenuView
            r1 = 0
            androidx.core.view.ViewCompat.setBackground(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.mMenuView
            r3.addView(r4, r0)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
            r1 = this;
            boolean r0 = super.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = super.isOverflowReserved()
            return r0
    }

    public boolean isTitleOptional() {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            return r0
    }

    public void killMode() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.mCustomView = r0
            r2.mMenuView = r0
            r2.mActionMenuPresenter = r0
            android.view.View r1 = r2.mCloseButton
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L11
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            r0.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            r0.hideSubMenus()
        L11:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onHoverEvent(r1)
            return r1
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            int r0 = r3.getEventType()
            r1 = 32
            if (r0 != r1) goto L27
            r3.setSource(r2)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackageName(r0)
            java.lang.CharSequence r0 = r2.mTitle
            r3.setContentDescription(r0)
            goto L2a
        L27:
            super.onInitializeAccessibilityEvent(r3)
        L2a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r10 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r9)
            if (r10 == 0) goto Le
            int r0 = r13 - r11
            int r1 = r9.getPaddingRight()
            int r0 = r0 - r1
            goto L12
        Le:
            int r0 = r9.getPaddingLeft()
        L12:
            int r6 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottom()
            int r12 = r14 - r12
            android.view.View r14 = r9.mClose
            r7 = 8
            if (r14 == 0) goto L58
            int r14 = r14.getVisibility()
            if (r14 == r7) goto L58
            android.view.View r14 = r9.mClose
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            if (r10 == 0) goto L3b
            int r1 = r14.rightMargin
            goto L3d
        L3b:
            int r1 = r14.leftMargin
        L3d:
            if (r10 == 0) goto L42
            int r14 = r14.leftMargin
            goto L44
        L42:
            int r14 = r14.rightMargin
        L44:
            int r8 = next(r0, r1, r10)
            android.view.View r1 = r9.mClose
            r0 = r9
            r2 = r8
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.positionChild(r1, r2, r3, r4, r5)
            int r8 = r8 + r0
            int r0 = next(r8, r14, r10)
        L58:
            r14 = r0
            android.widget.LinearLayout r0 = r9.mTitleLayout
            if (r0 == 0) goto L73
            android.view.View r1 = r9.mCustomView
            if (r1 != 0) goto L73
            int r0 = r0.getVisibility()
            if (r0 == r7) goto L73
            android.widget.LinearLayout r1 = r9.mTitleLayout
            r0 = r9
            r2 = r14
            r3 = r6
            r4 = r12
            r5 = r10
            int r0 = r0.positionChild(r1, r2, r3, r4, r5)
            int r14 = r14 + r0
        L73:
            r2 = r14
            android.view.View r1 = r9.mCustomView
            if (r1 == 0) goto L7f
            r0 = r9
            r3 = r6
            r4 = r12
            r5 = r10
            r0.positionChild(r1, r2, r3, r4, r5)
        L7f:
            if (r10 == 0) goto L87
            int r11 = r9.getPaddingLeft()
            r3 = r11
            goto L8e
        L87:
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r13 = r13 - r11
            r3 = r13
        L8e:
            androidx.appcompat.widget.ActionMenuView r11 = r9.mMenuView
            if (r11 == 0) goto L9d
            androidx.appcompat.widget.ActionMenuView r2 = r9.mMenuView
            r10 = r10 ^ 1
            r1 = r9
            r4 = r6
            r5 = r12
            r6 = r10
            r1.positionChild(r2, r3, r4, r5, r6)
        L9d:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L10f
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Lee
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.mContentHeight
            if (r0 <= 0) goto L19
            int r12 = r10.mContentHeight
            goto L1d
        L19:
            int r12 = android.view.View.MeasureSpec.getSize(r12)
        L1d:
            int r0 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r0 = r0 + r2
            int r2 = r10.getPaddingLeft()
            int r2 = r11 - r2
            int r3 = r10.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r12 - r0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.mClose
            r7 = 0
            if (r6 == 0) goto L50
            int r2 = r10.measureChildView(r6, r2, r5, r7)
            android.view.View r6 = r10.mClose
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r8 = r6.leftMargin
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r2 = r2 - r8
        L50:
            androidx.appcompat.widget.ActionMenuView r6 = r10.mMenuView
            if (r6 == 0) goto L62
            androidx.appcompat.widget.ActionMenuView r6 = r10.mMenuView
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L62
            androidx.appcompat.widget.ActionMenuView r6 = r10.mMenuView
            int r2 = r10.measureChildView(r6, r2, r5, r7)
        L62:
            android.widget.LinearLayout r6 = r10.mTitleLayout
            if (r6 == 0) goto L95
            android.view.View r8 = r10.mCustomView
            if (r8 != 0) goto L95
            boolean r8 = r10.mTitleOptional
            if (r8 == 0) goto L91
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.mTitleLayout
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.mTitleLayout
            int r5 = r5.getMeasuredWidth()
            if (r5 > r2) goto L81
            r6 = 1
            goto L82
        L81:
            r6 = r7
        L82:
            if (r6 == 0) goto L85
            int r2 = r2 - r5
        L85:
            android.widget.LinearLayout r5 = r10.mTitleLayout
            if (r6 == 0) goto L8b
            r6 = r7
            goto L8d
        L8b:
            r6 = 8
        L8d:
            r5.setVisibility(r6)
            goto L95
        L91:
            int r2 = r10.measureChildView(r6, r2, r5, r7)
        L95:
            android.view.View r5 = r10.mCustomView
            if (r5 == 0) goto Lcc
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La4
            r6 = r1
            goto La5
        La4:
            r6 = r4
        La5:
            int r9 = r5.width
            if (r9 < 0) goto Laf
            int r9 = r5.width
            int r2 = java.lang.Math.min(r9, r2)
        Laf:
            int r9 = r5.height
            if (r9 == r8) goto Lb4
            goto Lb5
        Lb4:
            r1 = r4
        Lb5:
            int r4 = r5.height
            if (r4 < 0) goto Lbf
            int r4 = r5.height
            int r3 = java.lang.Math.min(r4, r3)
        Lbf:
            android.view.View r4 = r10.mCustomView
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r2, r1)
        Lcc:
            int r1 = r10.mContentHeight
            if (r1 > 0) goto Lea
            int r12 = r10.getChildCount()
            r1 = r7
        Ld5:
            if (r7 >= r12) goto Le6
            android.view.View r2 = r10.getChildAt(r7)
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r0
            if (r2 <= r1) goto Le3
            r1 = r2
        Le3:
            int r7 = r7 + 1
            goto Ld5
        Le6:
            r10.setMeasuredDimension(r11, r1)
            goto Led
        Lea:
            r10.setMeasuredDimension(r11, r12)
        Led:
            return
        Lee:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L10f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
            r0 = this;
            super.postShowOverflowMenu()
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.mCustomView = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.mTitleLayout
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.mTitleLayout = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mSubtitle = r1
            r0.initTitle()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            r0.initTitle()
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mTitleOptional = r2
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r1, long r2) {
            r0 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r1 = super.setupAnimatorToVisibility(r1, r2)
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.showOverflowMenu()
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
