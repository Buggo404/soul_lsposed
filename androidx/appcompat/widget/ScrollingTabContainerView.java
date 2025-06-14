package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final java.lang.String TAG = "ScrollingTabContainerView";
    private static final android.view.animation.Interpolator sAlphaInterpolator = null;
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener mTabClickListener;
    androidx.appcompat.widget.LinearLayoutCompat mTabLayout;
    java.lang.Runnable mTabSelector;
    private android.widget.Spinner mTabSpinner;
    protected final androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener;
    protected android.view.ViewPropertyAnimator mVisibilityAnim;


    private class TabAdapter extends android.widget.BaseAdapter {
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        TabAdapter(androidx.appcompat.widget.ScrollingTabContainerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.mTabLayout
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.mTabLayout
                android.view.View r2 = r0.getChildAt(r2)
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r2
                androidx.appcompat.app.ActionBar$Tab r2 = r2.getTab()
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                if (r2 != 0) goto L10
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r0.this$0
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.ActionBar$Tab r1 = (androidx.appcompat.app.ActionBar.Tab) r1
                r3 = 1
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = r2.createTabView(r1, r3)
                goto L1c
            L10:
                r3 = r2
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r3 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r3
                java.lang.Object r1 = r0.getItem(r1)
                androidx.appcompat.app.ActionBar$Tab r1 = (androidx.appcompat.app.ActionBar.Tab) r1
                r3.bindTab(r1)
            L1c:
                return r2
        }
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        TabClickListener(androidx.appcompat.widget.ScrollingTabContainerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = r6
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
                androidx.appcompat.app.ActionBar$Tab r0 = r0.getTab()
                r0.select()
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r5.this$0
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.mTabLayout
                int r0 = r0.getChildCount()
                r1 = 0
                r2 = r1
            L14:
                if (r2 >= r0) goto L29
                androidx.appcompat.widget.ScrollingTabContainerView r3 = r5.this$0
                androidx.appcompat.widget.LinearLayoutCompat r3 = r3.mTabLayout
                android.view.View r3 = r3.getChildAt(r2)
                if (r3 != r6) goto L22
                r4 = 1
                goto L23
            L22:
                r4 = r1
            L23:
                r3.setSelected(r4)
                int r2 = r2 + 1
                goto L14
            L29:
                return
        }
    }

    private class TabView extends android.widget.LinearLayout {
        private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] BG_ATTRS;
        private android.view.View mCustomView;
        private android.widget.ImageView mIconView;
        private androidx.appcompat.app.ActionBar.Tab mTab;
        private android.widget.TextView mTextView;
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        public TabView(androidx.appcompat.widget.ScrollingTabContainerView r4, android.content.Context r5, androidx.appcompat.app.ActionBar.Tab r6, boolean r7) {
                r3 = this;
                r3.this$0 = r4
                int r4 = androidx.appcompat.C0015R.attr.actionBarTabStyle
                r0 = 0
                r3.<init>(r5, r0, r4)
                r4 = 1
                int[] r4 = new int[r4]
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                r2 = 0
                r4[r2] = r1
                r3.BG_ATTRS = r4
                r3.mTab = r6
                int r6 = androidx.appcompat.C0015R.attr.actionBarTabStyle
                androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r0, r4, r6, r2)
                boolean r5 = r4.hasValue(r2)
                if (r5 == 0) goto L28
                android.graphics.drawable.Drawable r5 = r4.getDrawable(r2)
                r3.setBackgroundDrawable(r5)
            L28:
                r4.recycle()
                if (r7 == 0) goto L33
                r4 = 8388627(0x800013, float:1.175497E-38)
                r3.setGravity(r4)
            L33:
                r3.update()
                return
        }

        public void bindTab(androidx.appcompat.app.ActionBar.Tab r1) {
                r0 = this;
                r0.mTab = r1
                r0.update()
                return
        }

        public androidx.appcompat.app.ActionBar.Tab getTab() {
                r1 = this;
                androidx.appcompat.app.ActionBar$Tab r0 = r1.mTab
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.this$0
                int r2 = r2.mMaxTabWidth
                if (r2 <= 0) goto L20
                int r2 = r1.getMeasuredWidth()
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                int r0 = r0.mMaxTabWidth
                if (r2 <= r0) goto L20
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.this$0
                int r2 = r2.mMaxTabWidth
                r0 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
                super.onMeasure(r2, r3)
            L20:
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                if (r0 == 0) goto L14
                if (r2 == 0) goto L14
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L14:
                return
        }

        public void update() {
                r10 = this;
                androidx.appcompat.app.ActionBar$Tab r0 = r10.mTab
                android.view.View r1 = r0.getCustomView()
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L32
                android.view.ViewParent r0 = r1.getParent()
                if (r0 == r10) goto L1b
                if (r0 == 0) goto L18
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r0.removeView(r1)
            L18:
                r10.addView(r1)
            L1b:
                r10.mCustomView = r1
                android.widget.TextView r0 = r10.mTextView
                if (r0 == 0) goto L24
                r0.setVisibility(r2)
            L24:
                android.widget.ImageView r0 = r10.mIconView
                if (r0 == 0) goto Ld3
                r0.setVisibility(r2)
                android.widget.ImageView r0 = r10.mIconView
                r0.setImageDrawable(r3)
                goto Ld3
            L32:
                android.view.View r1 = r10.mCustomView
                if (r1 == 0) goto L3b
                r10.removeView(r1)
                r10.mCustomView = r3
            L3b:
                android.graphics.drawable.Drawable r1 = r0.getIcon()
                java.lang.CharSequence r4 = r0.getText()
                r5 = 16
                r6 = 0
                r7 = -2
                if (r1 == 0) goto L70
                android.widget.ImageView r8 = r10.mIconView
                if (r8 != 0) goto L65
                androidx.appcompat.widget.AppCompatImageView r8 = new androidx.appcompat.widget.AppCompatImageView
                android.content.Context r9 = r10.getContext()
                r8.<init>(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r9.<init>(r7, r7)
                r9.gravity = r5
                r8.setLayoutParams(r9)
                r10.addView(r8, r6)
                r10.mIconView = r8
            L65:
                android.widget.ImageView r8 = r10.mIconView
                r8.setImageDrawable(r1)
                android.widget.ImageView r1 = r10.mIconView
                r1.setVisibility(r6)
                goto L7c
            L70:
                android.widget.ImageView r1 = r10.mIconView
                if (r1 == 0) goto L7c
                r1.setVisibility(r2)
                android.widget.ImageView r1 = r10.mIconView
                r1.setImageDrawable(r3)
            L7c:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                r1 = r1 ^ 1
                if (r1 == 0) goto Lb2
                android.widget.TextView r2 = r10.mTextView
                if (r2 != 0) goto La7
                androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
                android.content.Context r8 = r10.getContext()
                int r9 = androidx.appcompat.C0015R.attr.actionBarTabTextStyle
                r2.<init>(r8, r3, r9)
                android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r8)
                android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
                r8.<init>(r7, r7)
                r8.gravity = r5
                r2.setLayoutParams(r8)
                r10.addView(r2)
                r10.mTextView = r2
            La7:
                android.widget.TextView r2 = r10.mTextView
                r2.setText(r4)
                android.widget.TextView r2 = r10.mTextView
                r2.setVisibility(r6)
                goto Lbe
            Lb2:
                android.widget.TextView r4 = r10.mTextView
                if (r4 == 0) goto Lbe
                r4.setVisibility(r2)
                android.widget.TextView r2 = r10.mTextView
                r2.setText(r3)
            Lbe:
                android.widget.ImageView r2 = r10.mIconView
                if (r2 == 0) goto Lc9
                java.lang.CharSequence r4 = r0.getContentDescription()
                r2.setContentDescription(r4)
            Lc9:
                if (r1 == 0) goto Lcc
                goto Ld0
            Lcc:
                java.lang.CharSequence r3 = r0.getContentDescription()
            Ld0:
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r10, r3)
            Ld3:
                return
        }
    }

    protected class VisibilityAnimListener extends android.animation.AnimatorListenerAdapter {
        private boolean mCanceled;
        private int mFinalVisibility;
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        protected VisibilityAnimListener(androidx.appcompat.widget.ScrollingTabContainerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mCanceled
                if (r2 == 0) goto L5
                return
            L5:
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.this$0
                r0 = 0
                r2.mVisibilityAnim = r0
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.this$0
                int r0 = r1.mFinalVisibility
                r2.setVisibility(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r1.this$0
                r0 = 0
                r2.setVisibility(r0)
                r1.mCanceled = r0
                return
        }

        public androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(android.view.ViewPropertyAnimator r1, int r2) {
                r0 = this;
                r0.mFinalVisibility = r2
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r0.this$0
                r2.mVisibilityAnim = r1
                return r0
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator = r0
            return
    }

    public ScrollingTabContainerView(android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = new androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener
            r0.<init>(r3)
            r3.mVisAnimListener = r0
            r0 = 0
            r3.setHorizontalScrollBarEnabled(r0)
            androidx.appcompat.view.ActionBarPolicy r4 = androidx.appcompat.view.ActionBarPolicy.get(r4)
            int r0 = r4.getTabContainerHeight()
            r3.setContentHeight(r0)
            int r4 = r4.getStackedTabMaxWidth()
            r3.mStackedTabMaxWidth = r4
            androidx.appcompat.widget.LinearLayoutCompat r4 = r3.createTabLayout()
            r3.mTabLayout = r4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            r3.addView(r4, r0)
            return
    }

    private android.widget.Spinner createSpinner() {
            r4 = this;
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.C0015R.attr.actionDropDownStyle
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r0.setOnItemSelectedListener(r4)
            return r0
    }

    private androidx.appcompat.widget.LinearLayoutCompat createTabLayout() {
            r4 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = new androidx.appcompat.widget.LinearLayoutCompat
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.C0015R.attr.actionBarTabBarStyle
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.setMeasureWithLargestChildEnabled(r1)
            r1 = 17
            r0.setGravity(r1)
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            return r0
    }

    private boolean isCollapsed() {
            r1 = this;
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto Lc
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void performCollapse() {
            r4 = this;
            boolean r0 = r4.isCollapsed()
            if (r0 == 0) goto L7
            return
        L7:
            android.widget.Spinner r0 = r4.mTabSpinner
            if (r0 != 0) goto L11
            android.widget.Spinner r0 = r4.createSpinner()
            r4.mTabSpinner = r0
        L11:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r4.mTabLayout
            r4.removeView(r0)
            android.widget.Spinner r0 = r4.mTabSpinner
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r4.addView(r0, r1)
            android.widget.Spinner r0 = r4.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L34
            android.widget.Spinner r0 = r4.mTabSpinner
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r1 = new androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter
            r1.<init>(r4)
            r0.setAdapter(r1)
        L34:
            java.lang.Runnable r0 = r4.mTabSelector
            if (r0 == 0) goto L3e
            r4.removeCallbacks(r0)
            r0 = 0
            r4.mTabSelector = r0
        L3e:
            android.widget.Spinner r0 = r4.mTabSpinner
            int r1 = r4.mSelectedTabIndex
            r0.setSelection(r1)
            return
    }

    private boolean performExpand() {
            r5 = this;
            boolean r0 = r5.isCollapsed()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.widget.Spinner r0 = r5.mTabSpinner
            r5.removeView(r0)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r5.mTabLayout
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r0, r2)
            android.widget.Spinner r0 = r5.mTabSpinner
            int r0 = r0.getSelectedItemPosition()
            r5.setTabSelected(r0)
            return r1
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab r6, int r7, boolean r8) {
            r5 = this;
            r0 = 0
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r6 = r5.createTabView(r6, r0)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r5.mTabLayout
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r3, r4)
            r1.addView(r6, r7, r2)
            android.widget.Spinner r7 = r5.mTabSpinner
            if (r7 == 0) goto L1f
            android.widget.SpinnerAdapter r7 = r7.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r7 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r7
            r7.notifyDataSetChanged()
        L1f:
            if (r8 == 0) goto L25
            r7 = 1
            r6.setSelected(r7)
        L25:
            boolean r6 = r5.mAllowCollapse
            if (r6 == 0) goto L2c
            r5.requestLayout()
        L2c:
            return
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab r6, boolean r7) {
            r5 = this;
            r0 = 0
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r6 = r5.createTabView(r6, r0)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r5.mTabLayout
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r3, r4)
            r1.addView(r6, r2)
            android.widget.Spinner r0 = r5.mTabSpinner
            if (r0 == 0) goto L1f
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L1f:
            if (r7 == 0) goto L25
            r7 = 1
            r6.setSelected(r7)
        L25:
            boolean r6 = r5.mAllowCollapse
            if (r6 == 0) goto L2c
            r5.requestLayout()
        L2c:
            return
    }

    public void animateToTab(int r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            android.view.View r2 = r0.getChildAt(r2)
            java.lang.Runnable r0 = r1.mTabSelector
            if (r0 == 0) goto Ld
            r1.removeCallbacks(r0)
        Ld:
            androidx.appcompat.widget.ScrollingTabContainerView$1 r0 = new androidx.appcompat.widget.ScrollingTabContainerView$1
            r0.<init>(r1, r2)
            r1.mTabSelector = r0
            r1.post(r0)
            return
    }

    public void animateToVisibility(int r5) {
            r4 = this;
            android.view.ViewPropertyAnimator r0 = r4.mVisibilityAnim
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 200(0xc8, double:9.9E-322)
            r2 = 0
            if (r5 != 0) goto L34
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L15
            r4.setAlpha(r2)
        L15:
            android.view.ViewPropertyAnimator r2 = r4.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r4.mVisAnimListener
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r5 = r0.withFinalVisibility(r2, r5)
            r2.setListener(r5)
            r2.start()
            goto L50
        L34:
            android.view.ViewPropertyAnimator r3 = r4.animate()
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r4.mVisAnimListener
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r5 = r0.withFinalVisibility(r2, r5)
            r2.setListener(r5)
            r2.start()
        L50:
            return
    }

    androidx.appcompat.widget.ScrollingTabContainerView.TabView createTabView(androidx.appcompat.app.ActionBar.Tab r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = new androidx.appcompat.widget.ScrollingTabContainerView$TabView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1, r3, r4)
            if (r4 == 0) goto L1b
            r3 = 0
            r0.setBackgroundDrawable(r3)
            android.widget.AbsListView$LayoutParams r3 = new android.widget.AbsListView$LayoutParams
            r4 = -1
            int r1 = r2.mContentHeight
            r3.<init>(r4, r1)
            r0.setLayoutParams(r3)
            goto L2f
        L1b:
            r3 = 1
            r0.setFocusable(r3)
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r3 = r2.mTabClickListener
            if (r3 != 0) goto L2a
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r3 = new androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener
            r3.<init>(r2)
            r2.mTabClickListener = r3
        L2a:
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r3 = r2.mTabClickListener
            r0.setOnClickListener(r3)
        L2f:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.mTabSelector
            if (r0 == 0) goto La
            r1.post(r0)
        La:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r2 = r1.getContext()
            androidx.appcompat.view.ActionBarPolicy r2 = androidx.appcompat.view.ActionBarPolicy.get(r2)
            int r0 = r2.getTabContainerHeight()
            r1.setContentHeight(r0)
            int r2 = r2.getStackedTabMaxWidth()
            r1.mStackedTabMaxWidth = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.mTabSelector
            if (r0 == 0) goto La
            r1.removeCallbacks(r0)
        La:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r2
            androidx.appcompat.app.ActionBar$Tab r1 = r2.getTab()
            r1.select()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.LinearLayoutCompat r4 = r6.mTabLayout
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L40
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L40
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2e
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.mMaxTabWidth = r8
            goto L35
        L2e:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.mMaxTabWidth = r4
        L35:
            int r8 = r6.mMaxTabWidth
            int r4 = r6.mStackedTabMaxWidth
            int r8 = java.lang.Math.min(r8, r4)
            r6.mMaxTabWidth = r8
            goto L43
        L40:
            r8 = -1
            r6.mMaxTabWidth = r8
        L43:
            int r8 = r6.mContentHeight
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L50
            boolean r2 = r6.mAllowCollapse
            if (r2 == 0) goto L50
            goto L51
        L50:
            r0 = r1
        L51:
            if (r0 == 0) goto L6c
            androidx.appcompat.widget.LinearLayoutCompat r0 = r6.mTabLayout
            r0.measure(r1, r8)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r6.mTabLayout
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L68
            r6.performCollapse()
            goto L6f
        L68:
            r6.performExpand()
            goto L6f
        L6c:
            r6.performExpand()
        L6f:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L83
            if (r0 == r7) goto L83
            int r7 = r6.mSelectedTabIndex
            r6.setTabSelected(r7)
        L83:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void removeAllTabs() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            r0.removeAllViews()
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto L12
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L12:
            boolean r0 = r1.mAllowCollapse
            if (r0 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    public void removeTabAt(int r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            r0.removeViewAt(r2)
            android.widget.Spinner r2 = r1.mTabSpinner
            if (r2 == 0) goto L12
            android.widget.SpinnerAdapter r2 = r2.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r2
            r2.notifyDataSetChanged()
        L12:
            boolean r2 = r1.mAllowCollapse
            if (r2 == 0) goto L19
            r1.requestLayout()
        L19:
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.mAllowCollapse = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r6) {
            r5 = this;
            r5.mSelectedTabIndex = r6
            androidx.appcompat.widget.LinearLayoutCompat r0 = r5.mTabLayout
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L22
            androidx.appcompat.widget.LinearLayoutCompat r3 = r5.mTabLayout
            android.view.View r3 = r3.getChildAt(r2)
            if (r2 != r6) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = r1
        L17:
            r3.setSelected(r4)
            if (r4 == 0) goto L1f
            r5.animateToTab(r6)
        L1f:
            int r2 = r2 + 1
            goto La
        L22:
            android.widget.Spinner r0 = r5.mTabSpinner
            if (r0 == 0) goto L2b
            if (r6 < 0) goto L2b
            r0.setSelection(r6)
        L2b:
            return
    }

    public void updateTab(int r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            android.view.View r2 = r0.getChildAt(r2)
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r2
            r2.update()
            android.widget.Spinner r2 = r1.mTabSpinner
            if (r2 == 0) goto L18
            android.widget.SpinnerAdapter r2 = r2.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r2
            r2.notifyDataSetChanged()
        L18:
            boolean r2 = r1.mAllowCollapse
            if (r2 == 0) goto L1f
            r1.requestLayout()
        L1f:
            return
    }
}
