package androidx.appcompat.widget;

/* loaded from: classes.dex */
abstract class AbsActionBarView extends android.view.ViewGroup {
    private static final int FADE_DURATION = 200;
    protected androidx.appcompat.widget.ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected androidx.appcompat.widget.ActionMenuView mMenuView;
    protected final android.content.Context mPopupContext;
    protected final androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener mVisAnimListener;
    protected androidx.core.view.ViewPropertyAnimatorCompat mVisibilityAnim;


    protected class VisibilityAnimListener implements androidx.core.view.ViewPropertyAnimatorListener {
        private boolean mCanceled;
        int mFinalVisibility;
        final /* synthetic */ androidx.appcompat.widget.AbsActionBarView this$0;

        protected VisibilityAnimListener(androidx.appcompat.widget.AbsActionBarView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mCanceled = r1
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.mCanceled = r1
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 == 0) goto L5
                return
            L5:
                androidx.appcompat.widget.AbsActionBarView r2 = r1.this$0
                r0 = 0
                r2.mVisibilityAnim = r0
                androidx.appcompat.widget.AbsActionBarView r2 = r1.this$0
                int r0 = r1.mFinalVisibility
                androidx.appcompat.widget.AbsActionBarView.access$101(r2, r0)
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.AbsActionBarView r2 = r1.this$0
                r0 = 0
                androidx.appcompat.widget.AbsActionBarView.access$001(r2, r0)
                r1.mCanceled = r0
                return
        }

        public androidx.appcompat.widget.AbsActionBarView.VisibilityAnimListener withFinalVisibility(androidx.core.view.ViewPropertyAnimatorCompat r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.AbsActionBarView r0 = r1.this$0
                r0.mVisibilityAnim = r2
                r1.mFinalVisibility = r3
                return r1
        }
    }

    AbsActionBarView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    AbsActionBarView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    AbsActionBarView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r4 = new androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener
            r4.<init>(r2)
            r2.mVisAnimListener = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            int r0 = androidx.appcompat.C0015R.attr.actionBarPopupTheme
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2a
            int r5 = r4.resourceId
            if (r5 == 0) goto L2a
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.mPopupContext = r5
            goto L2c
        L2a:
            r2.mPopupContext = r3
        L2c:
            return
    }

    static /* synthetic */ void access$001(androidx.appcompat.widget.AbsActionBarView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    static /* synthetic */ void access$101(androidx.appcompat.widget.AbsActionBarView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    protected static int next(int r0, int r1, boolean r2) {
            if (r2 == 0) goto L4
            int r0 = r0 - r1
            goto L5
        L4:
            int r0 = r0 + r1
        L5:
            return r0
    }

    public void animateToVisibility(int r3) {
            r2 = this;
            r0 = 200(0xc8, double:9.9E-322)
            androidx.core.view.ViewPropertyAnimatorCompat r3 = r2.setupAnimatorToVisibility(r3, r0)
            r3.start()
            return
    }

    public boolean canShowOverflowMenu() {
            r1 = this;
            boolean r0 = r1.isOverflowReserved()
            if (r0 == 0) goto Le
            int r0 = r1.getVisibility()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L7
            r0.dismissPopupMenus()
        L7:
            return
    }

    public int getAnimatedVisibility() {
            r1 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.mVisibilityAnim
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r0 = r1.mVisAnimListener
            int r0 = r0.mFinalVisibility
            return r0
        L9:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.mContentHeight
            return r0
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.hideOverflowMenu()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean isOverflowReserved() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOverflowReserved()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected int measureChildView(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r2.measure(r0, r4)
            int r2 = r2.getMeasuredWidth()
            int r3 = r3 - r2
            int r3 = r3 - r5
            r2 = 0
            int r2 = java.lang.Math.max(r2, r3)
            return r2
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r0 = r5.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.ActionBar
            int r2 = androidx.appcompat.C0015R.attr.actionBarStyle
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r1, r2, r4)
            int r1 = androidx.appcompat.C0015R.styleable.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r4)
            r5.setContentHeight(r1)
            r0.recycle()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r5.mActionMenuPresenter
            if (r0 == 0) goto L24
            r0.onConfigurationChanged(r6)
        L24:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.mEatingHover = r1
        Lb:
            boolean r3 = r5.mEatingHover
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.mEatingHover = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.mEatingHover = r1
        L23:
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.mEatingTouch = r1
        L9:
            boolean r2 = r4.mEatingTouch
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.mEatingTouch = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.mEatingTouch = r1
        L1f:
            return r3
    }

    protected int positionChild(android.view.View r3, int r4, int r5, int r6, boolean r7) {
            r2 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r5 = r5 + r6
            if (r7 == 0) goto L15
            int r6 = r4 - r0
            int r1 = r1 + r5
            r3.layout(r6, r5, r4, r1)
            goto L1b
        L15:
            int r6 = r4 + r0
            int r1 = r1 + r5
            r3.layout(r4, r5, r6, r1)
        L1b:
            if (r7 == 0) goto L1e
            int r0 = -r0
        L1e:
            return r0
    }

    public void postShowOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.AbsActionBarView$1 r0 = new androidx.appcompat.widget.AbsActionBarView$1
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            r0.requestLayout()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.mVisibilityAnim
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r3, long r4) {
            r2 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r2.mVisibilityAnim
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            if (r3 != 0) goto L2a
            int r1 = r2.getVisibility()
            if (r1 == 0) goto L13
            r2.setAlpha(r0)
        L13:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = androidx.core.view.ViewCompat.animate(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.alpha(r1)
            r0.setDuration(r4)
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r4 = r2.mVisAnimListener
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r3 = r4.withFinalVisibility(r0, r3)
            r0.setListener(r3)
            return r0
        L2a:
            androidx.core.view.ViewPropertyAnimatorCompat r1 = androidx.core.view.ViewCompat.animate(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.alpha(r0)
            r0.setDuration(r4)
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r4 = r2.mVisAnimListener
            androidx.appcompat.widget.AbsActionBarView$VisibilityAnimListener r3 = r4.withFinalVisibility(r0, r3)
            r0.setListener(r3)
            return r0
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L9
            boolean r0 = r0.showOverflowMenu()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
