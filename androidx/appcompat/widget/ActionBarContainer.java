package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {
    private android.view.View mActionBarView;
    android.graphics.drawable.Drawable mBackground;
    private android.view.View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    android.graphics.drawable.Drawable mSplitBackground;
    android.graphics.drawable.Drawable mStackedBackground;
    private android.view.View mTabContainer;

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            androidx.appcompat.widget.ActionBarBackgroundDrawable r0 = new androidx.appcompat.widget.ActionBarBackgroundDrawable
            r0.<init>(r2)
            androidx.core.view.ViewCompat.setBackground(r2, r0)
            int[] r0 = androidx.appcompat.C0015R.styleable.ActionBar
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            int r4 = androidx.appcompat.C0015R.styleable.ActionBar_background
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.mBackground = r4
            int r4 = androidx.appcompat.C0015R.styleable.ActionBar_backgroundStacked
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.mStackedBackground = r4
            int r4 = androidx.appcompat.C0015R.styleable.ActionBar_height
            r0 = -1
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.mHeight = r4
            int r4 = r2.getId()
            int r0 = androidx.appcompat.C0015R.id.split_action_bar
            r1 = 1
            if (r4 != r0) goto L3d
            r2.mIsSplit = r1
            int r4 = androidx.appcompat.C0015R.styleable.ActionBar_backgroundSplit
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.mSplitBackground = r4
        L3d:
            r3.recycle()
            boolean r3 = r2.mIsSplit
            r4 = 0
            if (r3 == 0) goto L4a
            android.graphics.drawable.Drawable r3 = r2.mSplitBackground
            if (r3 != 0) goto L53
            goto L54
        L4a:
            android.graphics.drawable.Drawable r3 = r2.mBackground
            if (r3 != 0) goto L53
            android.graphics.drawable.Drawable r3 = r2.mStackedBackground
            if (r3 != 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            r2.setWillNotDraw(r1)
            return
    }

    private int getMeasuredHeightWithMargins(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r3 = r3.getMeasuredHeight()
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    private boolean isCollapsed(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L13
            int r3 = r3.getMeasuredHeight()
            if (r3 != 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.mBackground
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.mBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.mStackedBackground
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.mStackedBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.mSplitBackground
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.mSplitBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            android.view.View r0 = r1.mTabContainer
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.mBackground
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.mStackedBackground
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r0 = r1.mSplitBackground
            if (r0 == 0) goto L18
            r0.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = androidx.appcompat.C0015R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.mActionBarView = r0
            int r0 = androidx.appcompat.C0015R.id.action_context_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.mContextView = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.mIsTransitioning
            if (r0 != 0) goto Ld
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.mTabContainer
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L13
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L13
            r1 = r10
            goto L14
        L13:
            r1 = r0
        L14:
            if (r6 == 0) goto L35
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L35
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L35:
            boolean r7 = r5.mIsSplit
            if (r7 == 0) goto L4d
            android.graphics.drawable.Drawable r6 = r5.mSplitBackground
            if (r6 == 0) goto L4a
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto Lc0
        L4a:
            r10 = r0
            goto Lc0
        L4d:
            android.graphics.drawable.Drawable r7 = r5.mBackground
            if (r7 == 0) goto La5
            android.view.View r7 = r5.mActionBarView
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L77
            android.graphics.drawable.Drawable r7 = r5.mBackground
            android.view.View r8 = r5.mActionBarView
            int r8 = r8.getLeft()
            android.view.View r9 = r5.mActionBarView
            int r9 = r9.getTop()
            android.view.View r0 = r5.mActionBarView
            int r0 = r0.getRight()
            android.view.View r2 = r5.mActionBarView
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto La4
        L77:
            android.view.View r7 = r5.mContextView
            if (r7 == 0) goto L9f
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9f
            android.graphics.drawable.Drawable r7 = r5.mBackground
            android.view.View r8 = r5.mContextView
            int r8 = r8.getLeft()
            android.view.View r9 = r5.mContextView
            int r9 = r9.getTop()
            android.view.View r0 = r5.mContextView
            int r0 = r0.getRight()
            android.view.View r2 = r5.mContextView
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto La4
        L9f:
            android.graphics.drawable.Drawable r7 = r5.mBackground
            r7.setBounds(r0, r0, r0, r0)
        La4:
            r0 = r10
        La5:
            r5.mIsStacked = r1
            if (r1 == 0) goto L4a
            android.graphics.drawable.Drawable r7 = r5.mStackedBackground
            if (r7 == 0) goto L4a
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
        Lc0:
            if (r10 == 0) goto Lc5
            r5.invalidate()
        Lc5:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.mActionBarView
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.mHeight
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.mActionBarView
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.mTabContainer
            if (r0 == 0) goto L73
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L73
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L73
            android.view.View r0 = r3.mActionBarView
            boolean r0 = r3.isCollapsed(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.mActionBarView
            int r0 = r3.getMeasuredHeightWithMargins(r0)
            goto L57
        L47:
            android.view.View r0 = r3.mContextView
            boolean r0 = r3.isCollapsed(r0)
            if (r0 != 0) goto L56
            android.view.View r0 = r3.mContextView
            int r0 = r3.getMeasuredHeightWithMargins(r0)
            goto L57
        L56:
            r0 = 0
        L57:
            if (r4 != r1) goto L5e
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L61
        L5e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L61:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.mTabContainer
            int r1 = r3.getMeasuredHeightWithMargins(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L73:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r1 = 1
            return r1
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mBackground
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.mBackground
            r4.unscheduleDrawable(r0)
        Ld:
            r4.mBackground = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.mActionBarView
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.mBackground
            int r5 = r5.getLeft()
            android.view.View r1 = r4.mActionBarView
            int r1 = r1.getTop()
            android.view.View r2 = r4.mActionBarView
            int r2 = r2.getRight()
            android.view.View r3 = r4.mActionBarView
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.mIsSplit
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L3e
            android.graphics.drawable.Drawable r5 = r4.mSplitBackground
            if (r5 != 0) goto L47
            goto L48
        L3e:
            android.graphics.drawable.Drawable r5 = r4.mBackground
            if (r5 != 0) goto L47
            android.graphics.drawable.Drawable r5 = r4.mStackedBackground
            if (r5 != 0) goto L47
            goto L48
        L47:
            r0 = r1
        L48:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.mSplitBackground
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r3.mSplitBackground
            r3.unscheduleDrawable(r0)
        Ld:
            r3.mSplitBackground = r4
            r0 = 0
            if (r4 == 0) goto L28
            r4.setCallback(r3)
            boolean r4 = r3.mIsSplit
            if (r4 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.mSplitBackground
            if (r4 == 0) goto L28
            int r1 = r3.getMeasuredWidth()
            int r2 = r3.getMeasuredHeight()
            r4.setBounds(r0, r0, r1, r2)
        L28:
            boolean r4 = r3.mIsSplit
            r1 = 1
            if (r4 == 0) goto L33
            android.graphics.drawable.Drawable r4 = r3.mSplitBackground
            if (r4 != 0) goto L3c
        L31:
            r0 = r1
            goto L3c
        L33:
            android.graphics.drawable.Drawable r4 = r3.mBackground
            if (r4 != 0) goto L3c
            android.graphics.drawable.Drawable r4 = r3.mStackedBackground
            if (r4 != 0) goto L3c
            goto L31
        L3c:
            r3.setWillNotDraw(r0)
            r3.invalidate()
            r3.invalidateOutline()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mStackedBackground
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.mStackedBackground
            r4.unscheduleDrawable(r0)
        Ld:
            r4.mStackedBackground = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.mIsStacked
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.mStackedBackground
            if (r5 == 0) goto L37
            android.view.View r0 = r4.mTabContainer
            int r0 = r0.getLeft()
            android.view.View r1 = r4.mTabContainer
            int r1 = r1.getTop()
            android.view.View r2 = r4.mTabContainer
            int r2 = r2.getRight()
            android.view.View r3 = r4.mTabContainer
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.mIsSplit
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L42
            android.graphics.drawable.Drawable r5 = r4.mSplitBackground
            if (r5 != 0) goto L4b
            goto L4c
        L42:
            android.graphics.drawable.Drawable r5 = r4.mBackground
            if (r5 != 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.mStackedBackground
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setTabContainer(androidx.appcompat.widget.ScrollingTabContainerView r3) {
            r2 = this;
            android.view.View r0 = r2.mTabContainer
            if (r0 == 0) goto L7
            r2.removeView(r0)
        L7:
            r2.mTabContainer = r3
            if (r3 == 0) goto L1c
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = -1
            r0.width = r1
            r1 = -2
            r0.height = r1
            r0 = 0
            r3.setAllowCollapse(r0)
        L1c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.mIsTransitioning = r1
            if (r1 == 0) goto L7
            r1 = 393216(0x60000, float:5.51013E-40)
            goto L9
        L7:
            r1 = 262144(0x40000, float:3.67342E-40)
        L9:
            r0.setDescendantFocusability(r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.mBackground
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.mStackedBackground
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r1 = r2.mSplitBackground
            if (r1 == 0) goto L1e
            r1.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r1 = super.startActionModeForChild(r1, r2, r3)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBackground
            if (r2 != r0) goto L8
            boolean r0 = r1.mIsSplit
            if (r0 == 0) goto L1e
        L8:
            android.graphics.drawable.Drawable r0 = r1.mStackedBackground
            if (r2 != r0) goto L10
            boolean r0 = r1.mIsStacked
            if (r0 != 0) goto L1e
        L10:
            android.graphics.drawable.Drawable r0 = r1.mSplitBackground
            if (r2 != r0) goto L18
            boolean r0 = r1.mIsSplit
            if (r0 != 0) goto L1e
        L18:
            boolean r2 = super.verifyDrawable(r2)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
    }
}
