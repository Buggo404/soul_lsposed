package com.google.android.material.tabs;

@androidx.viewpager.widget.ViewPager.DecorView
/* loaded from: classes.dex */
public class TabLayout extends android.widget.HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int DEF_STYLE_RES = 0;
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final java.lang.String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.Tab> tabPool = null;
    private com.google.android.material.tabs.TabLayout.AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;
    private com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener pageChangeListener;
    private androidx.viewpager.widget.PagerAdapter pagerAdapter;
    private android.database.DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private android.animation.ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener selectedListener;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener> selectedListeners;
    private com.google.android.material.tabs.TabLayout.Tab selectedTab;
    private boolean setupViewPagerImplicitly;
    final com.google.android.material.tabs.TabLayout.SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    android.content.res.ColorStateList tabIconTint;
    android.graphics.PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    private com.google.android.material.tabs.TabIndicatorInterpolator tabIndicatorInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    android.content.res.ColorStateList tabRippleColorStateList;
    android.graphics.drawable.Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    int tabTextAppearance;
    android.content.res.ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final androidx.core.util.Pools.Pool<com.google.android.material.tabs.TabLayout.TabView> tabViewPool;
    private final java.util.ArrayList<com.google.android.material.tabs.TabLayout.Tab> tabs;
    boolean unboundedRipple;
    androidx.viewpager.widget.ViewPager viewPager;


    private class AdapterChangeListener implements androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;

        AdapterChangeListener(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager r1, androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3) {
                r0 = this;
                com.google.android.material.tabs.TabLayout r2 = r0.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.viewPager
                if (r2 != r1) goto Ld
                com.google.android.material.tabs.TabLayout r1 = r0.this$0
                boolean r2 = r0.autoRefresh
                r1.setPagerAdapter(r3, r2)
            Ld:
                return
        }

        void setAutoRefresh(boolean r1) {
                r0 = this;
                r0.autoRefresh = r1
                return
        }
    }

    @java.lang.Deprecated
    public interface BaseOnTabSelectedListener<T extends com.google.android.material.tabs.TabLayout.Tab> {
        void onTabReselected(T r1);

        void onTabSelected(T r1);

        void onTabUnselected(T r1);
    }

    public @interface LabelVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener<com.google.android.material.tabs.TabLayout.Tab> {
    }

    private class PagerAdapterObserver extends android.database.DataSetObserver {
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;

        PagerAdapterObserver(com.google.android.material.tabs.TabLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                r0.populateFromPagerAdapter()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.this$0
                r0.populateFromPagerAdapter()
                return
        }
    }

    class SlidingTabIndicator extends android.widget.LinearLayout {
        android.animation.ValueAnimator indicatorAnimator;
        private int layoutDirection;
        int selectedPosition;
        float selectionOffset;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;



        SlidingTabIndicator(com.google.android.material.tabs.TabLayout r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r1 = -1
                r0.selectedPosition = r1
                r0.layoutDirection = r1
                r1 = 0
                r0.setWillNotDraw(r1)
                return
        }

        static /* synthetic */ void access$1300(com.google.android.material.tabs.TabLayout.SlidingTabIndicator r0, android.view.View r1, android.view.View r2, float r3) {
                r0.tweenIndicatorPosition(r1, r2, r3)
                return
        }

        private void jumpIndicatorToSelectedPosition() {
                r4 = this;
                int r0 = r4.selectedPosition
                android.view.View r0 = r4.getChildAt(r0)
                com.google.android.material.tabs.TabLayout r1 = r4.this$0
                com.google.android.material.tabs.TabIndicatorInterpolator r1 = com.google.android.material.tabs.TabLayout.access$1200(r1)
                com.google.android.material.tabs.TabLayout r2 = r4.this$0
                android.graphics.drawable.Drawable r3 = r2.tabSelectedIndicator
                r1.setIndicatorBoundsForTab(r2, r0, r3)
                return
        }

        private void tweenIndicatorPosition(android.view.View r8, android.view.View r9, float r10) {
                r7 = this;
                if (r8 == 0) goto La
                int r0 = r8.getWidth()
                if (r0 <= 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L1e
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                com.google.android.material.tabs.TabIndicatorInterpolator r1 = com.google.android.material.tabs.TabLayout.access$1200(r0)
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                android.graphics.drawable.Drawable r6 = r2.tabSelectedIndicator
                r3 = r8
                r4 = r9
                r5 = r10
                r1.setIndicatorBoundsForOffset(r2, r3, r4, r5, r6)
                goto L3a
            L1e:
                com.google.android.material.tabs.TabLayout r8 = r7.this$0
                android.graphics.drawable.Drawable r8 = r8.tabSelectedIndicator
                com.google.android.material.tabs.TabLayout r9 = r7.this$0
                android.graphics.drawable.Drawable r9 = r9.tabSelectedIndicator
                android.graphics.Rect r9 = r9.getBounds()
                int r9 = r9.top
                com.google.android.material.tabs.TabLayout r10 = r7.this$0
                android.graphics.drawable.Drawable r10 = r10.tabSelectedIndicator
                android.graphics.Rect r10 = r10.getBounds()
                int r10 = r10.bottom
                r0 = -1
                r8.setBounds(r0, r9, r0, r10)
            L3a:
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
                return
        }

        private void updateOrRecreateIndicatorAnimation(boolean r4, int r5, int r6) {
                r3 = this;
                int r0 = r3.selectedPosition
                android.view.View r0 = r3.getChildAt(r0)
                android.view.View r1 = r3.getChildAt(r5)
                if (r1 != 0) goto L10
                r3.jumpIndicatorToSelectedPosition()
                return
            L10:
                com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1 r2 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator$1
                r2.<init>(r3, r0, r1)
                if (r4 == 0) goto L3f
                android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
                r4.<init>()
                r3.indicatorAnimator = r4
                android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
                r4.setInterpolator(r0)
                long r0 = (long) r6
                r4.setDuration(r0)
                r6 = 2
                float[] r6 = new float[r6]
                r6 = {x004a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r4.setFloatValues(r6)
                r4.addUpdateListener(r2)
                com.google.android.material.tabs.TabLayout$SlidingTabIndicator$2 r6 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator$2
                r6.<init>(r3, r5)
                r4.addListener(r6)
                r4.start()
                goto L49
            L3f:
                android.animation.ValueAnimator r4 = r3.indicatorAnimator
                r4.removeAllUpdateListeners()
                android.animation.ValueAnimator r4 = r3.indicatorAnimator
                r4.addUpdateListener(r2)
            L49:
                return
        }

        void animateIndicatorToPosition(int r2, int r3) {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                if (r0 == 0) goto Lf
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lf
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                r0.cancel()
            Lf:
                r0 = 1
                r1.updateOrRecreateIndicatorAnimation(r0, r2, r3)
                return
        }

        boolean childrenNeedLayout() {
                r4 = this;
                int r0 = r4.getChildCount()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L17
                android.view.View r3 = r4.getChildAt(r2)
                int r3 = r3.getWidth()
                if (r3 > 0) goto L14
                r0 = 1
                return r0
            L14:
                int r2 = r2 + 1
                goto L6
            L17:
                return r1
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                int r1 = r1.tabIndicatorGravity
                if (r1 == 0) goto L3c
                r2 = 1
                r3 = 2
                if (r1 == r2) goto L2d
                r2 = 0
                if (r1 == r3) goto L46
                r0 = 3
                if (r1 == r0) goto L28
                r0 = r2
                goto L46
            L28:
                int r0 = r5.getHeight()
                goto L46
            L2d:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L46
            L3c:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
                int r0 = r5.getHeight()
            L46:
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L83
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = r5.this$0
                android.graphics.drawable.Drawable r3 = r3.tabSelectedIndicator
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                int r1 = com.google.android.material.tabs.TabLayout.access$1400(r1)
                if (r1 == 0) goto L80
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                int r1 = com.google.android.material.tabs.TabLayout.access$1400(r1)
                androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r1)
            L80:
                r0.draw(r6)
            L83:
                super.draw(r6)
                return
        }

        float getIndicatorPosition() {
                r2 = this;
                int r0 = r2.selectedPosition
                float r0 = (float) r0
                float r1 = r2.selectionOffset
                float r0 = r0 + r1
                return r0
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                super.onLayout(r1, r2, r3, r4, r5)
                android.animation.ValueAnimator r1 = r0.indicatorAnimator
                if (r1 == 0) goto L15
                boolean r1 = r1.isRunning()
                if (r1 == 0) goto L15
                int r1 = r0.selectedPosition
                r2 = -1
                r3 = 0
                r0.updateOrRecreateIndicatorAnimation(r3, r1, r2)
                goto L18
            L15:
                r0.jumpIndicatorToSelectedPosition()
            L18:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int r9, int r10) {
                r8 = this;
                super.onMeasure(r9, r10)
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto Lc
                return
            Lc:
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                int r0 = r0.tabGravity
                r1 = 2
                r2 = 1
                if (r0 == r2) goto L1a
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                int r0 = r0.mode
                if (r0 != r1) goto L80
            L1a:
                int r0 = r8.getChildCount()
                r3 = 0
                r4 = r3
                r5 = r4
            L21:
                if (r4 >= r0) goto L38
                android.view.View r6 = r8.getChildAt(r4)
                int r7 = r6.getVisibility()
                if (r7 != 0) goto L35
                int r6 = r6.getMeasuredWidth()
                int r5 = java.lang.Math.max(r5, r6)
            L35:
                int r4 = r4 + 1
                goto L21
            L38:
                if (r5 > 0) goto L3b
                return
            L3b:
                android.content.Context r4 = r8.getContext()
                r6 = 16
                float r4 = com.google.android.material.internal.ViewUtils.dpToPx(r4, r6)
                int r4 = (int) r4
                int r6 = r5 * r0
                int r7 = r8.getMeasuredWidth()
                int r4 = r4 * r1
                int r7 = r7 - r4
                if (r6 > r7) goto L72
                r1 = r3
            L51:
                if (r3 >= r0) goto L70
                android.view.View r4 = r8.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                int r6 = r4.width
                r7 = 0
                if (r6 != r5) goto L68
                float r6 = r4.weight
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 == 0) goto L6d
            L68:
                r4.width = r5
                r4.weight = r7
                r1 = r2
            L6d:
                int r3 = r3 + 1
                goto L51
            L70:
                r2 = r1
                goto L7b
            L72:
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                r0.tabGravity = r3
                com.google.android.material.tabs.TabLayout r0 = r8.this$0
                r0.updateTabViews(r3)
            L7b:
                if (r2 == 0) goto L80
                super.onMeasure(r9, r10)
            L80:
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int r1) {
                r0 = this;
                super.onRtlPropertiesChanged(r1)
                return
        }

        void setIndicatorPositionFromTabPosition(int r2, float r3) {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                if (r0 == 0) goto Lf
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lf
                android.animation.ValueAnimator r0 = r1.indicatorAnimator
                r0.cancel()
            Lf:
                r1.selectedPosition = r2
                r1.selectionOffset = r3
                android.view.View r2 = r1.getChildAt(r2)
                int r3 = r1.selectedPosition
                int r3 = r3 + 1
                android.view.View r3 = r1.getChildAt(r3)
                float r0 = r1.selectionOffset
                r1.tweenIndicatorPosition(r2, r3, r0)
                return
        }

        void setSelectedIndicatorHeight(int r5) {
                r4 = this;
                com.google.android.material.tabs.TabLayout r0 = r4.this$0
                android.graphics.drawable.Drawable r0 = r0.tabSelectedIndicator
                android.graphics.Rect r0 = r0.getBounds()
                com.google.android.material.tabs.TabLayout r1 = r4.this$0
                android.graphics.drawable.Drawable r1 = r1.tabSelectedIndicator
                int r2 = r0.left
                r3 = 0
                int r0 = r0.right
                r1.setBounds(r2, r3, r0, r5)
                r4.requestLayout()
                return
        }
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        private java.lang.CharSequence contentDesc;
        private android.view.View customView;
        private android.graphics.drawable.Drawable icon;

        /* renamed from: id */
        private int f114id;
        private int labelVisibilityMode;
        public com.google.android.material.tabs.TabLayout parent;
        private int position;
        private java.lang.Object tag;
        private java.lang.CharSequence text;
        public com.google.android.material.tabs.TabLayout.TabView view;

        public Tab() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.position = r0
                r1 = 1
                r2.labelVisibilityMode = r1
                r2.f114id = r0
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.tabs.TabLayout.Tab r0) {
                int r0 = r0.f114id
                return r0
        }

        static /* synthetic */ int access$1100(com.google.android.material.tabs.TabLayout.Tab r0) {
                int r0 = r0.labelVisibilityMode
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$200(com.google.android.material.tabs.TabLayout.Tab r0) {
                java.lang.CharSequence r0 = r0.contentDesc
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$300(com.google.android.material.tabs.TabLayout.Tab r0) {
                java.lang.CharSequence r0 = r0.text
                return r0
        }

        public com.google.android.material.badge.BadgeDrawable getBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.tabs.TabLayout.TabView.access$900(r0)
                return r0
        }

        public java.lang.CharSequence getContentDescription() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                java.lang.CharSequence r0 = r0.getContentDescription()
            La:
                return r0
        }

        public android.view.View getCustomView() {
                r1 = this;
                android.view.View r0 = r1.customView
                return r0
        }

        public android.graphics.drawable.Drawable getIcon() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.icon
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.f114id
                return r0
        }

        public com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.tabs.TabLayout.TabView.access$700(r0)
                return r0
        }

        public int getPosition() {
                r1 = this;
                int r0 = r1.position
                return r0
        }

        public int getTabLabelVisibility() {
                r1 = this;
                int r0 = r1.labelVisibilityMode
                return r0
        }

        public java.lang.Object getTag() {
                r1 = this;
                java.lang.Object r0 = r1.tag
                return r0
        }

        public java.lang.CharSequence getText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.text
                return r0
        }

        public boolean isSelected() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.parent
                if (r0 == 0) goto L10
                int r0 = r0.getSelectedTabPosition()
                int r1 = r2.position
                if (r0 != r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
        }

        public void removeBadge() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                com.google.android.material.tabs.TabLayout.TabView.access$800(r0)
                return
        }

        void reset() {
                r2 = this;
                r0 = 0
                r2.parent = r0
                r2.view = r0
                r2.tag = r0
                r2.icon = r0
                r1 = -1
                r2.f114id = r1
                r2.text = r0
                r2.contentDesc = r0
                r2.position = r1
                r2.customView = r0
                return
        }

        public void select() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.parent
                if (r0 == 0) goto L8
                r0.selectTab(r2)
                return
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setContentDescription(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setContentDescription(java.lang.CharSequence r1) {
                r0 = this;
                r0.contentDesc = r1
                r0.updateView()
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(int r4) {
                r3 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r3.view
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                com.google.android.material.tabs.TabLayout$TabView r1 = r3.view
                r2 = 0
                android.view.View r4 = r0.inflate(r4, r1, r2)
                com.google.android.material.tabs.TabLayout$Tab r4 = r3.setCustomView(r4)
                return r4
        }

        public com.google.android.material.tabs.TabLayout.Tab setCustomView(android.view.View r1) {
                r0 = this;
                r0.customView = r1
                r0.updateView()
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.Context r0 = r0.getContext()
                android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setIcon(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setIcon(android.graphics.drawable.Drawable r3) {
                r2 = this;
                r2.icon = r3
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.tabGravity
                r0 = 1
                if (r3 == r0) goto L10
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.mode
                r1 = 2
                if (r3 != r1) goto L15
            L10:
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                r3.updateTabViews(r0)
            L15:
                r2.updateView()
                boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                boolean r3 = com.google.android.material.tabs.TabLayout.TabView.access$500(r3)
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.tabs.TabLayout.TabView.access$600(r3)
                boolean r3 = r3.isVisible()
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                r3.invalidate()
            L35:
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setId(int r2) {
                r1 = this;
                r1.f114id = r2
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 == 0) goto L9
                r0.setId(r2)
            L9:
                return r1
        }

        void setPosition(int r1) {
                r0 = this;
                r0.position = r1
                return
        }

        public com.google.android.material.tabs.TabLayout.Tab setTabLabelVisibility(int r3) {
                r2 = this;
                r2.labelVisibilityMode = r3
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.tabGravity
                r0 = 1
                if (r3 == r0) goto L10
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                int r3 = r3.mode
                r1 = 2
                if (r3 != r1) goto L15
            L10:
                com.google.android.material.tabs.TabLayout r3 = r2.parent
                r3.updateTabViews(r0)
            L15:
                r2.updateView()
                boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                boolean r3 = com.google.android.material.tabs.TabLayout.TabView.access$500(r3)
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                com.google.android.material.badge.BadgeDrawable r3 = com.google.android.material.tabs.TabLayout.TabView.access$600(r3)
                boolean r3 = r3.isVisible()
                if (r3 == 0) goto L35
                com.google.android.material.tabs.TabLayout$TabView r3 = r2.view
                r3.invalidate()
            L35:
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setTag(java.lang.Object r1) {
                r0 = this;
                r0.tag = r1
                return r0
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(int r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout r0 = r1.parent
                if (r0 == 0) goto L11
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                com.google.android.material.tabs.TabLayout$Tab r2 = r1.setText(r2)
                return r2
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Tab not attached to a TabLayout"
                r2.<init>(r0)
                throw r2
        }

        public com.google.android.material.tabs.TabLayout.Tab setText(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.CharSequence r0 = r1.contentDesc
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L13
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L13
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                r0.setContentDescription(r2)
            L13:
                r1.text = r2
                r1.updateView()
                return r1
        }

        void updateView() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$TabView r0 = r1.view
                if (r0 == 0) goto L7
                r0.update()
            L7:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;
        private final java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(com.google.android.material.tabs.TabLayout r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.tabLayoutRef = r0
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r2) {
                r1 = this;
                int r0 = r1.scrollState
                r1.previousScrollState = r0
                r1.scrollState = r2
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r6, float r7, int r8) {
                r5 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r8 = r5.tabLayoutRef
                java.lang.Object r8 = r8.get()
                com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
                if (r8 == 0) goto L23
                int r0 = r5.scrollState
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 != r2) goto L18
                int r4 = r5.previousScrollState
                if (r4 != r3) goto L16
                goto L18
            L16:
                r4 = r1
                goto L19
            L18:
                r4 = r3
            L19:
                if (r0 != r2) goto L1f
                int r0 = r5.previousScrollState
                if (r0 == 0) goto L20
            L1f:
                r1 = r3
            L20:
                r8.setScrollPosition(r6, r7, r4, r1)
            L23:
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r4) {
                r3 = this;
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r0 = r3.tabLayoutRef
                java.lang.Object r0 = r0.get()
                com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
                if (r0 == 0) goto L2c
                int r1 = r0.getSelectedTabPosition()
                if (r1 == r4) goto L2c
                int r1 = r0.getTabCount()
                if (r4 >= r1) goto L2c
                int r1 = r3.scrollState
                if (r1 == 0) goto L24
                r2 = 2
                if (r1 != r2) goto L22
                int r1 = r3.previousScrollState
                if (r1 != 0) goto L22
                goto L24
            L22:
                r1 = 0
                goto L25
            L24:
                r1 = 1
            L25:
                com.google.android.material.tabs.TabLayout$Tab r4 = r0.getTabAt(r4)
                r0.selectTab(r4, r1)
            L2c:
                return
        }

        void reset() {
                r1 = this;
                r0 = 0
                r1.scrollState = r0
                r1.previousScrollState = r0
                return
        }
    }

    public final class TabView extends android.widget.LinearLayout {
        private android.view.View badgeAnchorView;
        private com.google.android.material.badge.BadgeDrawable badgeDrawable;
        private android.graphics.drawable.Drawable baseBackgroundDrawable;
        private android.widget.ImageView customIconView;
        private android.widget.TextView customTextView;
        private android.view.View customView;
        private int defaultMaxLines;
        private android.widget.ImageView iconView;
        private com.google.android.material.tabs.TabLayout.Tab tab;
        private android.widget.TextView textView;
        final /* synthetic */ com.google.android.material.tabs.TabLayout this$0;


        public TabView(com.google.android.material.tabs.TabLayout r4, android.content.Context r5) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>(r5)
                r0 = 2
                r3.defaultMaxLines = r0
                r3.updateBackgroundDrawable(r5)
                int r5 = r4.tabPaddingStart
                int r0 = r4.tabPaddingTop
                int r1 = r4.tabPaddingEnd
                int r2 = r4.tabPaddingBottom
                androidx.core.view.ViewCompat.setPaddingRelative(r3, r5, r0, r1, r2)
                r5 = 17
                r3.setGravity(r5)
                boolean r4 = r4.inlineLabel
                r5 = 1
                r4 = r4 ^ r5
                r3.setOrientation(r4)
                r3.setClickable(r5)
                android.content.Context r4 = r3.getContext()
                r5 = 1002(0x3ea, float:1.404E-42)
                androidx.core.view.PointerIconCompat r4 = androidx.core.view.PointerIconCompat.getSystemIcon(r4, r5)
                androidx.core.view.ViewCompat.setPointerIcon(r3, r4)
                return
        }

        static /* synthetic */ void access$100(com.google.android.material.tabs.TabLayout.TabView r0, android.content.Context r1) {
                r0.updateBackgroundDrawable(r1)
                return
        }

        static /* synthetic */ void access$1000(com.google.android.material.tabs.TabLayout.TabView r0, android.view.View r1) {
                r0.tryUpdateBadgeDrawableBounds(r1)
                return
        }

        static /* synthetic */ void access$400(com.google.android.material.tabs.TabLayout.TabView r0, android.graphics.Canvas r1) {
                r0.drawBackground(r1)
                return
        }

        static /* synthetic */ boolean access$500(com.google.android.material.tabs.TabLayout.TabView r0) {
                boolean r0 = r0.hasBadgeDrawable()
                return r0
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$600(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.badgeDrawable
                return r0
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$700(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.getOrCreateBadge()
                return r0
        }

        static /* synthetic */ void access$800(com.google.android.material.tabs.TabLayout.TabView r0) {
                r0.removeBadge()
                return
        }

        static /* synthetic */ com.google.android.material.badge.BadgeDrawable access$900(com.google.android.material.tabs.TabLayout.TabView r0) {
                com.google.android.material.badge.BadgeDrawable r0 = r0.getBadge()
                return r0
        }

        private void addOnLayoutChangeListener(android.view.View r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                com.google.android.material.tabs.TabLayout$TabView$1 r0 = new com.google.android.material.tabs.TabLayout$TabView$1
                r0.<init>(r1, r2)
                r2.addOnLayoutChangeListener(r0)
                return
        }

        private float approximateLineWidth(android.text.Layout r1, int r2, float r3) {
                r0 = this;
                float r2 = r1.getLineWidth(r2)
                android.text.TextPaint r1 = r1.getPaint()
                float r1 = r1.getTextSize()
                float r3 = r3 / r1
                float r2 = r2 * r3
                return r2
        }

        private void clipViewToPaddingForBadge(boolean r2) {
                r1 = this;
                r1.setClipChildren(r2)
                r1.setClipToPadding(r2)
                android.view.ViewParent r0 = r1.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                if (r0 == 0) goto L14
                r0.setClipChildren(r2)
                r0.setClipToPadding(r2)
            L14:
                return
        }

        private android.widget.FrameLayout createPreApi18BadgeAnchorRoot() {
                r3 = this;
                android.widget.FrameLayout r0 = new android.widget.FrameLayout
                android.content.Context r1 = r3.getContext()
                r0.<init>(r1)
                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                r2 = -2
                r1.<init>(r2, r2)
                r0.setLayoutParams(r1)
                return r0
        }

        private void drawBackground(android.graphics.Canvas r6) {
                r5 = this;
                android.graphics.drawable.Drawable r0 = r5.baseBackgroundDrawable
                if (r0 == 0) goto L1c
                int r1 = r5.getLeft()
                int r2 = r5.getTop()
                int r3 = r5.getRight()
                int r4 = r5.getBottom()
                r0.setBounds(r1, r2, r3, r4)
                android.graphics.drawable.Drawable r0 = r5.baseBackgroundDrawable
                r0.draw(r6)
            L1c:
                return
        }

        private com.google.android.material.badge.BadgeDrawable getBadge() {
                r1 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
                return r0
        }

        private android.widget.FrameLayout getCustomParentForBadge(android.view.View r3) {
                r2 = this;
                android.widget.ImageView r0 = r2.iconView
                r1 = 0
                if (r3 == r0) goto La
                android.widget.TextView r0 = r2.textView
                if (r3 == r0) goto La
                return r1
            La:
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r0 == 0) goto L15
                android.view.ViewParent r3 = r3.getParent()
                r1 = r3
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            L15:
                return r1
        }

        private com.google.android.material.badge.BadgeDrawable getOrCreateBadge() {
                r2 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                if (r0 != 0) goto Le
                android.content.Context r0 = r2.getContext()
                com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.badge.BadgeDrawable.create(r0)
                r2.badgeDrawable = r0
            Le:
                r2.tryUpdateBadgeAnchor()
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                if (r0 == 0) goto L16
                return r0
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unable to create badge"
                r0.<init>(r1)
                throw r0
        }

        private boolean hasBadgeDrawable() {
                r1 = this;
                com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private void inflateAndAddDefaultIconView() {
                r4 = this;
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                r1 = 0
                if (r0 == 0) goto Ld
                android.widget.FrameLayout r0 = r4.createPreApi18BadgeAnchorRoot()
                r4.addView(r0, r1)
                goto Le
            Ld:
                r0 = r4
            Le:
                android.content.Context r2 = r4.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                int r3 = com.google.android.material.C0479R.layout.design_layout_tab_icon
                android.view.View r2 = r2.inflate(r3, r0, r1)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r4.iconView = r2
                r0.addView(r2, r1)
                return
        }

        private void inflateAndAddDefaultTextView() {
                r4 = this;
                boolean r0 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
                if (r0 == 0) goto Lc
                android.widget.FrameLayout r0 = r4.createPreApi18BadgeAnchorRoot()
                r4.addView(r0)
                goto Ld
            Lc:
                r0 = r4
            Ld:
                android.content.Context r1 = r4.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                int r2 = com.google.android.material.C0479R.layout.design_layout_tab_text
                r3 = 0
                android.view.View r1 = r1.inflate(r2, r0, r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r4.textView = r1
                r0.addView(r1)
                return
        }

        private void removeBadge() {
                r1 = this;
                android.view.View r0 = r1.badgeAnchorView
                if (r0 == 0) goto L7
                r1.tryRemoveBadgeFromAnchor()
            L7:
                r0 = 0
                r1.badgeDrawable = r0
                return
        }

        private void tryAttachBadgeToAnchor(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                if (r3 == 0) goto L18
                r0 = 0
                r2.clipViewToPaddingForBadge(r0)
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
                com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(r0, r3, r1)
                r2.badgeAnchorView = r3
            L18:
                return
        }

        private void tryRemoveBadgeFromAnchor() {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 1
                r2.clipViewToPaddingForBadge(r0)
                android.view.View r0 = r2.badgeAnchorView
                if (r0 == 0) goto L17
                com.google.android.material.badge.BadgeDrawable r1 = r2.badgeDrawable
                com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(r1, r0)
                r0 = 0
                r2.badgeAnchorView = r0
            L17:
                return
        }

        private void tryUpdateBadgeAnchor() {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 != 0) goto L7
                return
            L7:
                android.view.View r0 = r2.customView
                if (r0 == 0) goto Lf
                r2.tryRemoveBadgeFromAnchor()
                goto L55
            Lf:
                android.widget.ImageView r0 = r2.iconView
                if (r0 == 0) goto L30
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                if (r0 == 0) goto L30
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L30
                android.view.View r0 = r2.badgeAnchorView
                android.widget.ImageView r1 = r2.iconView
                if (r0 == r1) goto L2c
                r2.tryRemoveBadgeFromAnchor()
                android.widget.ImageView r0 = r2.iconView
                r2.tryAttachBadgeToAnchor(r0)
                goto L55
            L2c:
                r2.tryUpdateBadgeDrawableBounds(r1)
                goto L55
            L30:
                android.widget.TextView r0 = r2.textView
                if (r0 == 0) goto L52
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                if (r0 == 0) goto L52
                int r0 = r0.getTabLabelVisibility()
                r1 = 1
                if (r0 != r1) goto L52
                android.view.View r0 = r2.badgeAnchorView
                android.widget.TextView r1 = r2.textView
                if (r0 == r1) goto L4e
                r2.tryRemoveBadgeFromAnchor()
                android.widget.TextView r0 = r2.textView
                r2.tryAttachBadgeToAnchor(r0)
                goto L55
            L4e:
                r2.tryUpdateBadgeDrawableBounds(r1)
                goto L55
            L52:
                r2.tryRemoveBadgeFromAnchor()
            L55:
                return
        }

        private void tryUpdateBadgeDrawableBounds(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.hasBadgeDrawable()
                if (r0 == 0) goto L13
                android.view.View r0 = r2.badgeAnchorView
                if (r3 != r0) goto L13
                com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
                android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
                com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(r0, r3, r1)
            L13:
                return
        }

        private void updateBackgroundDrawable(android.content.Context r6) {
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L23
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                int r0 = r0.tabBackgroundResId
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r6, r0)
                r5.baseBackgroundDrawable = r6
                if (r6 == 0) goto L25
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L25
                android.graphics.drawable.Drawable r6 = r5.baseBackgroundDrawable
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L25
            L23:
                r5.baseBackgroundDrawable = r1
            L25:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = r6
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = r5.this$0
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L63
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.content.res.ColorStateList r2 = r2.tabRippleColorStateList
                android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = r5.this$0
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L57
                r6 = r1
            L57:
                com.google.android.material.tabs.TabLayout r4 = r5.this$0
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L5e
                goto L5f
            L5e:
                r1 = r0
            L5f:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L63:
                androidx.core.view.ViewCompat.setBackground(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = r5.this$0
                r6.invalidate()
                return
        }

        private void updateTextAndIcon(android.widget.TextView r8, android.widget.ImageView r9) {
                r7 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r7.tab
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$Tab r0 = r7.tab
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                com.google.android.material.tabs.TabLayout$Tab r2 = r7.tab
                if (r2 == 0) goto L24
                java.lang.CharSequence r2 = r2.getText()
                goto L25
            L24:
                r2 = r1
            L25:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L3c
                if (r0 == 0) goto L36
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L3c
            L36:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L3c:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r5 = 1
                r0 = r0 ^ r5
                if (r8 == 0) goto L62
                if (r0 == 0) goto L5c
                r8.setText(r2)
                com.google.android.material.tabs.TabLayout$Tab r6 = r7.tab
                int r6 = com.google.android.material.tabs.TabLayout.Tab.access$1100(r6)
                if (r6 != r5) goto L55
                r8.setVisibility(r4)
                goto L58
            L55:
                r8.setVisibility(r3)
            L58:
                r7.setVisibility(r4)
                goto L62
            L5c:
                r8.setVisibility(r3)
                r8.setText(r1)
            L62:
                if (r9 == 0) goto La4
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r0 == 0) goto L7c
                int r5 = r9.getVisibility()
                if (r5 != 0) goto L7c
                android.content.Context r5 = r7.getContext()
                float r3 = com.google.android.material.internal.ViewUtils.dpToPx(r5, r3)
                int r3 = (int) r3
                goto L7d
            L7c:
                r3 = r4
            L7d:
                com.google.android.material.tabs.TabLayout r5 = r7.this$0
                boolean r5 = r5.inlineLabel
                if (r5 == 0) goto L95
                int r5 = androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(r8)
                if (r3 == r5) goto La4
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r3)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto La4
            L95:
                int r5 = r8.bottomMargin
                if (r3 == r5) goto La4
                r8.bottomMargin = r3
                androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r8, r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            La4:
                com.google.android.material.tabs.TabLayout$Tab r8 = r7.tab
                if (r8 == 0) goto Lac
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$200(r8)
            Lac:
                if (r0 == 0) goto Laf
                goto Lb0
            Laf:
                r2 = r1
            Lb0:
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r7, r2)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
                r3 = this;
                super.drawableStateChanged()
                int[] r0 = r3.getDrawableState()
                android.graphics.drawable.Drawable r1 = r3.baseBackgroundDrawable
                r2 = 0
                if (r1 == 0) goto L19
                boolean r1 = r1.isStateful()
                if (r1 == 0) goto L19
                android.graphics.drawable.Drawable r1 = r3.baseBackgroundDrawable
                boolean r0 = r1.setState(r0)
                r2 = r2 | r0
            L19:
                if (r2 == 0) goto L23
                r3.invalidate()
                com.google.android.material.tabs.TabLayout r0 = r3.this$0
                r0.invalidate()
            L23:
                return
        }

        int getContentHeight() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.textView
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.iconView
                r4 = 1
                r1[r4] = r2
                r2 = 2
                android.view.View r5 = r9.customView
                r1[r2] = r5
                r2 = r3
                r5 = r2
                r6 = r5
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getTop()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getTop()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getBottom()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getBottom()
            L3f:
                r6 = r4
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        int getContentWidth() {
                r9 = this;
                r0 = 3
                android.view.View[] r1 = new android.view.View[r0]
                android.widget.TextView r2 = r9.textView
                r3 = 0
                r1[r3] = r2
                android.widget.ImageView r2 = r9.iconView
                r4 = 1
                r1[r4] = r2
                r2 = 2
                android.view.View r5 = r9.customView
                r1[r2] = r5
                r2 = r3
                r5 = r2
                r6 = r5
            L15:
                if (r3 >= r0) goto L43
                r7 = r1[r3]
                if (r7 == 0) goto L40
                int r8 = r7.getVisibility()
                if (r8 != 0) goto L40
                if (r6 == 0) goto L2c
                int r8 = r7.getLeft()
                int r5 = java.lang.Math.min(r5, r8)
                goto L30
            L2c:
                int r5 = r7.getLeft()
            L30:
                if (r6 == 0) goto L3b
                int r6 = r7.getRight()
                int r2 = java.lang.Math.max(r2, r6)
                goto L3f
            L3b:
                int r2 = r7.getRight()
            L3f:
                r6 = r4
            L40:
                int r3 = r3 + 1
                goto L15
            L43:
                int r2 = r2 - r5
                return r2
        }

        public com.google.android.material.tabs.TabLayout.Tab getTab() {
                r1 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r1.tab
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
                r6 = this;
                super.onInitializeAccessibilityNodeInfo(r7)
                com.google.android.material.badge.BadgeDrawable r0 = r6.badgeDrawable
                if (r0 == 0) goto L31
                boolean r0 = r0.isVisible()
                if (r0 == 0) goto L31
                java.lang.CharSequence r0 = r6.getContentDescription()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                com.google.android.material.badge.BadgeDrawable r1 = r6.badgeDrawable
                java.lang.CharSequence r1 = r1.getContentDescription()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.setContentDescription(r0)
            L31:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r7)
                r0 = 0
                r1 = 1
                com.google.android.material.tabs.TabLayout$Tab r2 = r6.tab
                int r2 = r2.getPosition()
                r3 = 1
                r4 = 0
                boolean r5 = r6.isSelected()
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r0, r1, r2, r3, r4, r5)
                r7.setCollectionItemInfo(r0)
                boolean r0 = r6.isSelected()
                if (r0 == 0) goto L59
                r0 = 0
                r7.setClickable(r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
                r7.removeAction(r0)
            L59:
                android.content.res.Resources r0 = r6.getResources()
                int r1 = com.google.android.material.C0479R.string.item_view_role_description
                java.lang.String r0 = r0.getString(r1)
                r7.setRoleDescription(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r8, int r9) {
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = r7.this$0
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = r7.this$0
                int r8 = r8.tabMaxWidth
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.textView
                if (r0 == 0) goto L9a
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                float r0 = r0.tabTextSize
                int r1 = r7.defaultMaxLines
                android.widget.ImageView r2 = r7.iconView
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = r3
                goto L46
            L38:
                android.widget.TextView r2 = r7.textView
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = r7.this$0
                float r0 = r0.tabTextMultiLineSize
            L46:
                android.widget.TextView r2 = r7.textView
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.textView
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.textView
                int r5 = androidx.core.widget.TextViewCompat.getMaxLines(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto L9a
                if (r1 == r5) goto L9a
            L60:
                com.google.android.material.tabs.TabLayout r5 = r7.this$0
                int r5 = r5.mode
                r6 = 0
                if (r5 != r3) goto L8b
                if (r2 <= 0) goto L8b
                if (r4 != r3) goto L8b
                android.widget.TextView r2 = r7.textView
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L8a
                float r2 = r7.approximateLineWidth(r2, r6, r0)
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L8b
            L8a:
                r3 = r6
            L8b:
                if (r3 == 0) goto L9a
                android.widget.TextView r2 = r7.textView
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.textView
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L9a:
                return
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                com.google.android.material.tabs.TabLayout$Tab r1 = r2.tab
                if (r1 == 0) goto L14
                if (r0 != 0) goto Le
                r0 = 0
                r2.playSoundEffect(r0)
            Le:
                com.google.android.material.tabs.TabLayout$Tab r0 = r2.tab
                r0.select()
                r0 = 1
            L14:
                return r0
        }

        void reset() {
                r1 = this;
                r0 = 0
                r1.setTab(r0)
                r0 = 0
                r1.setSelected(r0)
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
                android.widget.TextView r0 = r1.textView
                if (r0 == 0) goto L13
                r0.setSelected(r2)
            L13:
                android.widget.ImageView r0 = r1.iconView
                if (r0 == 0) goto L1a
                r0.setSelected(r2)
            L1a:
                android.view.View r0 = r1.customView
                if (r0 == 0) goto L21
                r0.setSelected(r2)
            L21:
                return
        }

        void setTab(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r1.tab
                if (r2 == r0) goto L9
                r1.tab = r2
                r1.update()
            L9:
                return
        }

        final void update() {
                r5 = this;
                com.google.android.material.tabs.TabLayout$Tab r0 = r5.tab
                r1 = 0
                if (r0 == 0) goto La
                android.view.View r2 = r0.getCustomView()
                goto Lb
            La:
                r2 = r1
            Lb:
                if (r2 == 0) goto L53
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r5) goto L1d
                if (r3 == 0) goto L1a
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L1a:
                r5.addView(r2)
            L1d:
                r5.customView = r2
                android.widget.TextView r3 = r5.textView
                r4 = 8
                if (r3 == 0) goto L28
                r3.setVisibility(r4)
            L28:
                android.widget.ImageView r3 = r5.iconView
                if (r3 == 0) goto L34
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r5.iconView
                r3.setImageDrawable(r1)
            L34:
                r3 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r5.customTextView = r3
                if (r3 == 0) goto L47
                int r3 = androidx.core.widget.TextViewCompat.getMaxLines(r3)
                r5.defaultMaxLines = r3
            L47:
                r3 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r2 = r2.findViewById(r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r5.customIconView = r2
                goto L60
            L53:
                android.view.View r2 = r5.customView
                if (r2 == 0) goto L5c
                r5.removeView(r2)
                r5.customView = r1
            L5c:
                r5.customTextView = r1
                r5.customIconView = r1
            L60:
                android.view.View r2 = r5.customView
                if (r2 != 0) goto Ld1
                android.widget.ImageView r2 = r5.iconView
                if (r2 != 0) goto L6b
                r5.inflateAndAddDefaultIconView()
            L6b:
                if (r0 == 0) goto L7f
                android.graphics.drawable.Drawable r2 = r0.getIcon()
                if (r2 == 0) goto L7f
                android.graphics.drawable.Drawable r1 = r0.getIcon()
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.DrawableCompat.wrap(r1)
                android.graphics.drawable.Drawable r1 = r1.mutate()
            L7f:
                if (r1 == 0) goto L95
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.content.res.ColorStateList r2 = r2.tabIconTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r1, r2)
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                if (r2 == 0) goto L95
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r1, r2)
            L95:
                android.widget.TextView r1 = r5.textView
                if (r1 != 0) goto La4
                r5.inflateAndAddDefaultTextView()
                android.widget.TextView r1 = r5.textView
                int r1 = androidx.core.widget.TextViewCompat.getMaxLines(r1)
                r5.defaultMaxLines = r1
            La4:
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                int r2 = r2.tabTextAppearance
                androidx.core.widget.TextViewCompat.setTextAppearance(r1, r2)
                com.google.android.material.tabs.TabLayout r1 = r5.this$0
                android.content.res.ColorStateList r1 = r1.tabTextColors
                if (r1 == 0) goto Lbc
                android.widget.TextView r1 = r5.textView
                com.google.android.material.tabs.TabLayout r2 = r5.this$0
                android.content.res.ColorStateList r2 = r2.tabTextColors
                r1.setTextColor(r2)
            Lbc:
                android.widget.TextView r1 = r5.textView
                android.widget.ImageView r2 = r5.iconView
                r5.updateTextAndIcon(r1, r2)
                r5.tryUpdateBadgeAnchor()
                android.widget.ImageView r1 = r5.iconView
                r5.addOnLayoutChangeListener(r1)
                android.widget.TextView r1 = r5.textView
                r5.addOnLayoutChangeListener(r1)
                goto Lde
            Ld1:
                android.widget.TextView r1 = r5.customTextView
                if (r1 != 0) goto Ld9
                android.widget.ImageView r2 = r5.customIconView
                if (r2 == 0) goto Lde
            Ld9:
                android.widget.ImageView r2 = r5.customIconView
                r5.updateTextAndIcon(r1, r2)
            Lde:
                if (r0 == 0) goto Lf1
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$200(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto Lf1
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$200(r0)
                r5.setContentDescription(r1)
            Lf1:
                if (r0 == 0) goto Lfb
                boolean r0 = r0.isSelected()
                if (r0 == 0) goto Lfb
                r0 = 1
                goto Lfc
            Lfb:
                r0 = 0
            Lfc:
                r5.setSelected(r0)
                return
        }

        final void updateOrientation() {
                r2 = this;
                com.google.android.material.tabs.TabLayout r0 = r2.this$0
                boolean r0 = r0.inlineLabel
                r0 = r0 ^ 1
                r2.setOrientation(r0)
                android.widget.TextView r0 = r2.customTextView
                if (r0 != 0) goto L1a
                android.widget.ImageView r1 = r2.customIconView
                if (r1 == 0) goto L12
                goto L1a
            L12:
                android.widget.TextView r0 = r2.textView
                android.widget.ImageView r1 = r2.iconView
                r2.updateTextAndIcon(r0, r1)
                goto L1f
            L1a:
                android.widget.ImageView r1 = r2.customIconView
                r2.updateTextAndIcon(r0, r1)
            L1f:
                return
        }
    }

    public static class ViewPagerOnTabSelectedListener implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
        private final androidx.viewpager.widget.ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.<init>()
                r0.viewPager = r1
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab r2) {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.viewPager
                int r2 = r2.getPosition()
                r0.setCurrentItem(r2)
                return
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab r1) {
                r0 = this;
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_TabLayout
            com.google.android.material.tabs.TabLayout.DEF_STYLE_RES = r0
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 16
            r0.<init>(r1)
            com.google.android.material.tabs.TabLayout.tabPool = r0
            return
    }

    public TabLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TabLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.tabStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TabLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r4 = com.google.android.material.tabs.TabLayout.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.tabs = r11
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            r10.tabSelectedIndicator = r11
            r11 = 0
            r10.tabSelectedIndicatorColor = r11
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.tabMaxWidth = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.selectedListeners = r0
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 12
            r0.<init>(r1)
            r10.tabViewPool = r0
            android.content.Context r6 = r10.getContext()
            r10.setHorizontalScrollBarEnabled(r11)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r7 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator
            r7.<init>(r10, r6)
            r10.slidingTabIndicator = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r11, r0)
            int[] r2 = com.google.android.material.C0479R.styleable.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r0 = com.google.android.material.C0479R.styleable.TabLayout_tabTextAppearance
            r5[r11] = r0
            r0 = r6
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L82
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.setFillColor(r13)
            r0.initializeElevationOverlay(r6)
            float r13 = androidx.core.view.ViewCompat.getElevation(r10)
            r0.setElevation(r13)
            androidx.core.view.ViewCompat.setBackground(r10, r0)
        L82:
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r13 = com.google.android.material.resources.MaterialResources.getDrawable(r6, r12, r13)
            r10.setSelectedTabIndicator(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorColor
            int r13 = r12.getColor(r13, r11)
            r10.setSelectedTabIndicatorColor(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorHeight
            int r13 = r12.getDimensionPixelSize(r13, r8)
            r7.setSelectedIndicatorHeight(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorGravity
            int r13 = r12.getInt(r13, r11)
            r10.setSelectedTabIndicatorGravity(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorFullWidth
            boolean r13 = r12.getBoolean(r13, r9)
            r10.setTabIndicatorFullWidth(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorAnimationMode
            int r13 = r12.getInt(r13, r11)
            r10.setTabIndicatorAnimationMode(r13)
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabPadding
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.tabPaddingBottom = r13
            r10.tabPaddingEnd = r13
            r10.tabPaddingTop = r13
            r10.tabPaddingStart = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabPaddingStart
            int r0 = r10.tabPaddingStart
            int r13 = r12.getDimensionPixelSize(r13, r0)
            r10.tabPaddingStart = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabPaddingTop
            int r0 = r10.tabPaddingTop
            int r13 = r12.getDimensionPixelSize(r13, r0)
            r10.tabPaddingTop = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabPaddingEnd
            int r0 = r10.tabPaddingEnd
            int r13 = r12.getDimensionPixelSize(r13, r0)
            r10.tabPaddingEnd = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabPaddingBottom
            int r0 = r10.tabPaddingBottom
            int r13 = r12.getDimensionPixelSize(r13, r0)
            r10.tabPaddingBottom = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabTextAppearance
            int r0 = com.google.android.material.C0479R.style.TextAppearance_Design_Tab
            int r13 = r12.getResourceId(r13, r0)
            r10.tabTextAppearance = r13
            int[] r0 = androidx.appcompat.C0015R.styleable.TextAppearance
            android.content.res.TypedArray r13 = r6.obtainStyledAttributes(r13, r0)
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize     // Catch: java.lang.Throwable -> L1bf
            int r0 = r13.getDimensionPixelSize(r0, r11)     // Catch: java.lang.Throwable -> L1bf
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1bf
            r10.tabTextSize = r0     // Catch: java.lang.Throwable -> L1bf
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textColor     // Catch: java.lang.Throwable -> L1bf
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r13, r0)     // Catch: java.lang.Throwable -> L1bf
            r10.tabTextColors = r0     // Catch: java.lang.Throwable -> L1bf
            r13.recycle()
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabTextColor
            boolean r13 = r12.hasValue(r13)
            if (r13 == 0) goto L122
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabTextColor
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r12, r13)
            r10.tabTextColors = r13
        L122:
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabSelectedTextColor
            boolean r13 = r12.hasValue(r13)
            if (r13 == 0) goto L13c
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabSelectedTextColor
            int r13 = r12.getColor(r13, r11)
            android.content.res.ColorStateList r0 = r10.tabTextColors
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r13 = createColorStateList(r0, r13)
            r10.tabTextColors = r13
        L13c:
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIconTint
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r12, r13)
            r10.tabIconTint = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIconTintMode
            int r13 = r12.getInt(r13, r8)
            r0 = 0
            android.graphics.PorterDuff$Mode r13 = com.google.android.material.internal.ViewUtils.parseTintMode(r13, r0)
            r10.tabIconTintMode = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabRippleColor
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r12, r13)
            r10.tabRippleColorStateList = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r13 = r12.getInt(r13, r0)
            r10.tabIndicatorAnimationDuration = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabMinWidth
            int r13 = r12.getDimensionPixelSize(r13, r8)
            r10.requestedTabMinWidth = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabMaxWidth
            int r13 = r12.getDimensionPixelSize(r13, r8)
            r10.requestedTabMaxWidth = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabBackground
            int r13 = r12.getResourceId(r13, r11)
            r10.tabBackgroundResId = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabContentStart
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.contentInsetStart = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabMode
            int r13 = r12.getInt(r13, r9)
            r10.mode = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabGravity
            int r13 = r12.getInt(r13, r11)
            r10.tabGravity = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabInlineLabel
            boolean r13 = r12.getBoolean(r13, r11)
            r10.inlineLabel = r13
            int r13 = com.google.android.material.C0479R.styleable.TabLayout_tabUnboundedRipple
            boolean r11 = r12.getBoolean(r13, r11)
            r10.unboundedRipple = r11
            r12.recycle()
            android.content.res.Resources r11 = r10.getResources()
            int r12 = com.google.android.material.C0479R.dimen.design_tab_text_size_2line
            int r12 = r11.getDimensionPixelSize(r12)
            float r12 = (float) r12
            r10.tabTextMultiLineSize = r12
            int r12 = com.google.android.material.C0479R.dimen.design_tab_scrollable_min_width
            int r11 = r11.getDimensionPixelSize(r12)
            r10.scrollableTabMinWidth = r11
            r10.applyModeAndGravity()
            return
        L1bf:
            r11 = move-exception
            r13.recycle()
            throw r11
    }

    static /* synthetic */ com.google.android.material.tabs.TabIndicatorInterpolator access$1200(com.google.android.material.tabs.TabLayout r0) {
            com.google.android.material.tabs.TabIndicatorInterpolator r0 = r0.tabIndicatorInterpolator
            return r0
    }

    static /* synthetic */ int access$1400(com.google.android.material.tabs.TabLayout r0) {
            int r0 = r0.tabSelectedIndicatorColor
            return r0
    }

    private void addTabFromItemView(com.google.android.material.tabs.TabItem r3) {
            r2 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r2.newTab()
            java.lang.CharSequence r1 = r3.text
            if (r1 == 0) goto Ld
            java.lang.CharSequence r1 = r3.text
            r0.setText(r1)
        Ld:
            android.graphics.drawable.Drawable r1 = r3.icon
            if (r1 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r3.icon
            r0.setIcon(r1)
        L16:
            int r1 = r3.customLayout
            if (r1 == 0) goto L1f
            int r1 = r3.customLayout
            r0.setCustomView(r1)
        L1f:
            java.lang.CharSequence r1 = r3.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L30
            java.lang.CharSequence r3 = r3.getContentDescription()
            r0.setContentDescription(r3)
        L30:
            r2.addTab(r0)
            return
    }

    private void addTabView(com.google.android.material.tabs.TabLayout.Tab r4) {
            r3 = this;
            com.google.android.material.tabs.TabLayout$TabView r0 = r4.view
            r1 = 0
            r0.setSelected(r1)
            r0.setActivated(r1)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r4 = r4.getPosition()
            android.widget.LinearLayout$LayoutParams r2 = r3.createLayoutParamsForTabs()
            r1.addView(r0, r4, r2)
            return
    }

    private void addViewInternal(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.tabs.TabItem
            if (r0 == 0) goto La
            com.google.android.material.tabs.TabItem r2 = (com.google.android.material.tabs.TabItem) r2
            r1.addTabFromItemView(r2)
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only TabItem instances can be added to TabLayout"
            r2.<init>(r0)
            throw r2
    }

    private void animateToTab(int r7) {
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L4
            return
        L4:
            android.os.IBinder r0 = r6.getWindowToken()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L42
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r6)
            if (r0 == 0) goto L42
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r6.slidingTabIndicator
            boolean r0 = r0.childrenNeedLayout()
            if (r0 == 0) goto L1b
            goto L42
        L1b:
            int r0 = r6.getScrollX()
            int r2 = r6.calculateScrollXForTab(r7, r2)
            if (r0 == r2) goto L3a
            r6.ensureScrollAnimator()
            android.animation.ValueAnimator r3 = r6.scrollAnimator
            r4 = 2
            int[] r4 = new int[r4]
            r5 = 0
            r4[r5] = r0
            r4[r1] = r2
            r3.setIntValues(r4)
            android.animation.ValueAnimator r0 = r6.scrollAnimator
            r0.start()
        L3a:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r6.slidingTabIndicator
            int r1 = r6.tabIndicatorAnimationDuration
            r0.animateIndicatorToPosition(r7, r1)
            return
        L42:
            r6.setScrollPosition(r7, r2, r1)
            return
    }

    private void applyGravityForModeScrollable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 1
            if (r2 == r0) goto L9
            r0 = 2
            if (r2 == r0) goto L16
            goto L1e
        L9:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            r2.setGravity(r0)
            goto L1e
        Lf:
            java.lang.String r2 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L16:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2.setGravity(r0)
        L1e:
            return
    }

    private void applyModeAndGravity() {
            r4 = this;
            int r0 = r4.mode
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.contentInsetStart
            int r3 = r4.tabPaddingStart
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            androidx.core.view.ViewCompat.setPaddingRelative(r3, r0, r2, r2, r2)
            int r0 = r4.mode
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 == r2) goto L23
            if (r0 == r1) goto L23
            goto L39
        L23:
            int r0 = r4.tabGravity
            if (r0 != r1) goto L2e
            java.lang.String r0 = "TabLayout"
            java.lang.String r1 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r0, r1)
        L2e:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.slidingTabIndicator
            r0.setGravity(r2)
            goto L39
        L34:
            int r0 = r4.tabGravity
            r4.applyGravityForModeScrollable(r0)
        L39:
            r4.updateTabViews(r2)
            return
    }

    private int calculateScrollXForTab(int r5, float r6) {
            r4 = this;
            int r0 = r4.mode
            r1 = 0
            r2 = 2
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            goto La
        L9:
            return r1
        La:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r4.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r5)
            int r5 = r5 + 1
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            int r3 = r3.getChildCount()
            if (r5 >= r3) goto L21
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r4.slidingTabIndicator
            android.view.View r5 = r3.getChildAt(r5)
            goto L22
        L21:
            r5 = 0
        L22:
            if (r0 == 0) goto L29
            int r3 = r0.getWidth()
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r5 == 0) goto L30
            int r1 = r5.getWidth()
        L30:
            int r5 = r0.getLeft()
            int r0 = r3 / 2
            int r5 = r5 + r0
            int r0 = r4.getWidth()
            int r0 = r0 / r2
            int r5 = r5 - r0
            int r3 = r3 + r1
            float r0 = (float) r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            float r0 = r0 * r6
            int r6 = (int) r0
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            if (r0 != 0) goto L4c
            int r5 = r5 + r6
            goto L4d
        L4c:
            int r5 = r5 - r6
        L4d:
            return r5
    }

    private void configureTab(com.google.android.material.tabs.TabLayout.Tab r2, int r3) {
            r1 = this;
            r2.setPosition(r3)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            r0.add(r3, r2)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r1.tabs
            int r2 = r2.size()
        Le:
            int r3 = r3 + 1
            if (r3 >= r2) goto L1e
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.tabs.TabLayout$Tab r0 = (com.google.android.material.tabs.TabLayout.Tab) r0
            r0.setPosition(r3)
            goto Le
        L1e:
            return
    }

    private static android.content.res.ColorStateList createColorStateList(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r2 = com.google.android.material.tabs.TabLayout.SELECTED_STATE_SET
            r3 = 0
            r1[r3] = r2
            r0[r3] = r5
            int[] r5 = com.google.android.material.tabs.TabLayout.EMPTY_STATE_SET
            r2 = 1
            r1[r2] = r5
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs() {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            r3.updateTabViewLayoutParams(r0)
            return r0
    }

    private com.google.android.material.tabs.TabLayout.TabView createTabView(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$TabView> r0 = r2.tabViewPool
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L17
            com.google.android.material.tabs.TabLayout$TabView r0 = new com.google.android.material.tabs.TabLayout$TabView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1)
        L17:
            r0.setTab(r3)
            r1 = 1
            r0.setFocusable(r1)
            int r1 = r2.getTabMinWidth()
            r0.setMinimumWidth(r1)
            java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.Tab.access$200(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L37
            java.lang.CharSequence r3 = com.google.android.material.tabs.TabLayout.Tab.access$300(r3)
            r0.setContentDescription(r3)
            goto L3e
        L37:
            java.lang.CharSequence r3 = com.google.android.material.tabs.TabLayout.Tab.access$200(r3)
            r0.setContentDescription(r3)
        L3e:
            return r0
    }

    private void dispatchTabReselected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabReselected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void dispatchTabSelected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabSelected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void dispatchTabUnselected(com.google.android.material.tabs.TabLayout.Tab r3) {
            r2 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r2.selectedListeners
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r1 = r2.selectedListeners
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r1 = (com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener) r1
            r1.onTabUnselected(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    private void ensureScrollAnimator() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            if (r0 != 0) goto L22
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r3.scrollAnimator = r0
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            int r1 = r3.tabIndicatorAnimationDuration
            long r1 = (long) r1
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.scrollAnimator
            com.google.android.material.tabs.TabLayout$1 r1 = new com.google.android.material.tabs.TabLayout$1
            r1.<init>(r3)
            r0.addUpdateListener(r1)
        L22:
            return
    }

    private int getDefaultHeight() {
            r5 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r5.tabs
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L29
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r3 = r5.tabs
            java.lang.Object r3 = r3.get(r2)
            com.google.android.material.tabs.TabLayout$Tab r3 = (com.google.android.material.tabs.TabLayout.Tab) r3
            if (r3 == 0) goto L26
            android.graphics.drawable.Drawable r4 = r3.getIcon()
            if (r4 == 0) goto L26
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L26
            r1 = 1
            goto L29
        L26:
            int r2 = r2 + 1
            goto L8
        L29:
            if (r1 == 0) goto L32
            boolean r0 = r5.inlineLabel
            if (r0 != 0) goto L32
            r0 = 72
            goto L34
        L32:
            r0 = 48
        L34:
            return r0
    }

    private int getTabMinWidth() {
            r2 = this;
            int r0 = r2.requestedTabMinWidth
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r2.mode
            if (r0 == 0) goto L10
            r1 = 2
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L12
        L10:
            int r0 = r2.scrollableTabMinWidth
        L12:
            return r0
    }

    private int getTabScrollRange() {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getWidth()
            int r1 = r2.getWidth()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private void removeTabViewAt(int r3) {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r2.slidingTabIndicator
            r1.removeViewAt(r3)
            if (r0 == 0) goto L17
            r0.reset()
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$TabView> r3 = r2.tabViewPool
            r3.release(r0)
        L17:
            r2.requestLayout()
            return
    }

    private void setSelectedTabView(int r7) {
            r6 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r6.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r7 >= r0) goto L25
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r3 = r6.slidingTabIndicator
            android.view.View r3 = r3.getChildAt(r2)
            r4 = 1
            if (r2 != r7) goto L17
            r5 = r4
            goto L18
        L17:
            r5 = r1
        L18:
            r3.setSelected(r5)
            if (r2 != r7) goto L1e
            goto L1f
        L1e:
            r4 = r1
        L1f:
            r3.setActivated(r4)
            int r2 = r2 + 1
            goto La
        L25:
            return
    }

    private void setupWithViewPager(androidx.viewpager.widget.ViewPager r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.viewPager
            if (r0 == 0) goto L14
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r1 = r2.pageChangeListener
            if (r1 == 0) goto Lb
            r0.removeOnPageChangeListener(r1)
        Lb:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            if (r0 == 0) goto L14
            androidx.viewpager.widget.ViewPager r1 = r2.viewPager
            r1.removeOnAdapterChangeListener(r0)
        L14:
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r0 = r2.currentVpSelectedListener
            r1 = 0
            if (r0 == 0) goto L1e
            r2.removeOnTabSelectedListener(r0)
            r2.currentVpSelectedListener = r1
        L1e:
            if (r3 == 0) goto L69
            r2.viewPager = r3
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            if (r0 != 0) goto L2d
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = new com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener
            r0.<init>(r2)
            r2.pageChangeListener = r0
        L2d:
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            r0.reset()
            com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener r0 = r2.pageChangeListener
            r3.addOnPageChangeListener(r0)
            com.google.android.material.tabs.TabLayout$ViewPagerOnTabSelectedListener r0 = new com.google.android.material.tabs.TabLayout$ViewPagerOnTabSelectedListener
            r0.<init>(r3)
            r2.currentVpSelectedListener = r0
            r2.addOnTabSelectedListener(r0)
            androidx.viewpager.widget.PagerAdapter r0 = r3.getAdapter()
            if (r0 == 0) goto L4a
            r2.setPagerAdapter(r0, r4)
        L4a:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            if (r0 != 0) goto L55
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = new com.google.android.material.tabs.TabLayout$AdapterChangeListener
            r0.<init>(r2)
            r2.adapterChangeListener = r0
        L55:
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r0 = r2.adapterChangeListener
            r0.setAutoRefresh(r4)
            com.google.android.material.tabs.TabLayout$AdapterChangeListener r4 = r2.adapterChangeListener
            r3.addOnAdapterChangeListener(r4)
            int r3 = r3.getCurrentItem()
            r4 = 0
            r0 = 1
            r2.setScrollPosition(r3, r4, r0)
            goto L6f
        L69:
            r2.viewPager = r1
            r3 = 0
            r2.setPagerAdapter(r1, r3)
        L6f:
            r2.setupViewPagerImplicitly = r5
            return
    }

    private void updateAllTabs() {
            r3 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r3.tabs
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r3.tabs
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            r2.updateView()
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams r3) {
            r2 = this;
            int r0 = r2.mode
            r1 = 1
            if (r0 != r1) goto L11
            int r0 = r2.tabGravity
            if (r0 != 0) goto L11
            r0 = 0
            r3.width = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r0
            goto L17
        L11:
            r0 = -2
            r3.width = r0
            r0 = 0
            r3.weight = r0
        L17:
            return
    }

    @java.lang.Deprecated
    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.add(r2)
        Ld:
            return
    }

    public void addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.addOnTabSelectedListener(r1)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r0)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, int r3) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r3, r0)
            return
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, int r3, boolean r4) {
            r1 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.parent
            if (r0 != r1) goto L10
            r1.configureTab(r2, r3)
            r1.addTabView(r2)
            if (r4 == 0) goto Lf
            r2.select()
        Lf:
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Tab belongs to a different TabLayout."
            r2.<init>(r3)
            throw r2
    }

    public void addTab(com.google.android.material.tabs.TabLayout.Tab r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            int r0 = r0.size()
            r1.addTab(r2, r0, r3)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.addViewInternal(r1)
            return
    }

    public void clearOnTabSelectedListeners() {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.clear()
            return
    }

    protected com.google.android.material.tabs.TabLayout.Tab createTabFromPool() {
            r1 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$Tab> r0 = com.google.android.material.tabs.TabLayout.tabPool
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.tabs.TabLayout$Tab r0 = (com.google.android.material.tabs.TabLayout.Tab) r0
            if (r0 != 0) goto Lf
            com.google.android.material.tabs.TabLayout$Tab r0 = new com.google.android.material.tabs.TabLayout$Tab
            r0.<init>()
        Lf:
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            android.widget.FrameLayout$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public int getSelectedTabPosition() {
            r1 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r1.selectedTab
            if (r0 == 0) goto L9
            int r0 = r0.getPosition()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    public com.google.android.material.tabs.TabLayout.Tab getTabAt(int r2) {
            r1 = this;
            if (r2 < 0) goto L12
            int r0 = r1.getTabCount()
            if (r2 < r0) goto L9
            goto L12
        L9:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int getTabCount() {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r1.tabs
            int r0 = r0.size()
            return r0
    }

    public int getTabGravity() {
            r1 = this;
            int r0 = r1.tabGravity
            return r0
    }

    public android.content.res.ColorStateList getTabIconTint() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabIconTint
            return r0
    }

    public int getTabIndicatorAnimationMode() {
            r1 = this;
            int r0 = r1.tabIndicatorAnimationMode
            return r0
    }

    public int getTabIndicatorGravity() {
            r1 = this;
            int r0 = r1.tabIndicatorGravity
            return r0
    }

    int getTabMaxWidth() {
            r1 = this;
            int r0 = r1.tabMaxWidth
            return r0
    }

    public int getTabMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    public android.content.res.ColorStateList getTabRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabRippleColorStateList
            return r0
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tabSelectedIndicator
            return r0
    }

    public android.content.res.ColorStateList getTabTextColors() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabTextColors
            return r0
    }

    public boolean hasUnboundedRipple() {
            r1 = this;
            boolean r0 = r1.unboundedRipple
            return r0
    }

    public boolean isInlineLabel() {
            r1 = this;
            boolean r0 = r1.inlineLabel
            return r0
    }

    public boolean isTabIndicatorFullWidth() {
            r1 = this;
            boolean r0 = r1.tabIndicatorFullWidth
            return r0
    }

    public com.google.android.material.tabs.TabLayout.Tab newTab() {
            r3 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r3.createTabFromPool()
            r0.parent = r3
            com.google.android.material.tabs.TabLayout$TabView r1 = r3.createTabView(r0)
            r0.view = r1
            int r1 = com.google.android.material.tabs.TabLayout.Tab.access$000(r0)
            r2 = -1
            if (r1 == r2) goto L1c
            com.google.android.material.tabs.TabLayout$TabView r1 = r0.view
            int r2 = com.google.android.material.tabs.TabLayout.Tab.access$000(r0)
            r1.setId(r2)
        L1c:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2)
            androidx.viewpager.widget.ViewPager r0 = r2.viewPager
            if (r0 != 0) goto L18
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r1 == 0) goto L18
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r1 = 1
            r2.setupWithViewPager(r0, r1, r1)
        L18:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            boolean r0 = r1.setupViewPagerImplicitly
            if (r0 == 0) goto Le
            r0 = 0
            r1.setupWithViewPager(r0)
            r0 = 0
            r1.setupViewPagerImplicitly = r0
        Le:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L1b
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r2 == 0) goto L18
            com.google.android.material.tabs.TabLayout$TabView r1 = (com.google.android.material.tabs.TabLayout.TabView) r1
            com.google.android.material.tabs.TabLayout.TabView.access$400(r1, r4)
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            super.onDraw(r4)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            int r0 = r3.getTabCount()
            r1 = 0
            r2 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.tabMaxWidth = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.mode
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
    }

    void populateFromPagerAdapter() {
            r5 = this;
            r5.removeAllTabs()
            androidx.viewpager.widget.PagerAdapter r0 = r5.pagerAdapter
            if (r0 == 0) goto L40
            int r0 = r0.getCount()
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L23
            com.google.android.material.tabs.TabLayout$Tab r3 = r5.newTab()
            androidx.viewpager.widget.PagerAdapter r4 = r5.pagerAdapter
            java.lang.CharSequence r4 = r4.getPageTitle(r2)
            com.google.android.material.tabs.TabLayout$Tab r3 = r3.setText(r4)
            r5.addTab(r3, r1)
            int r2 = r2 + 1
            goto Ld
        L23:
            androidx.viewpager.widget.ViewPager r1 = r5.viewPager
            if (r1 == 0) goto L40
            if (r0 <= 0) goto L40
            int r0 = r1.getCurrentItem()
            int r1 = r5.getSelectedTabPosition()
            if (r0 == r1) goto L40
            int r1 = r5.getTabCount()
            if (r0 >= r1) goto L40
            com.google.android.material.tabs.TabLayout$Tab r0 = r5.getTabAt(r0)
            r5.selectTab(r0)
        L40:
            return
    }

    protected boolean releaseFromTabPool(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.tabs.TabLayout$Tab> r0 = com.google.android.material.tabs.TabLayout.tabPool
            boolean r2 = r0.release(r2)
            return r2
    }

    public void removeAllTabs() {
            r2 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L10
            r2.removeTabViewAt(r0)
            int r0 = r0 + (-1)
            goto L8
        L10:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r2.tabs
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.google.android.material.tabs.TabLayout$Tab r1 = (com.google.android.material.tabs.TabLayout.Tab) r1
            r0.remove()
            r1.reset()
            r2.releaseFromTabPool(r1)
            goto L16
        L2c:
            r0 = 0
            r2.selectedTab = r0
            return
    }

    @java.lang.Deprecated
    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener> r0 = r1.selectedListeners
            r0.remove(r2)
            return
    }

    public void removeOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.removeOnTabSelectedListener(r1)
            return
    }

    public void removeTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout r0 = r2.parent
            if (r0 != r1) goto Lc
            int r2 = r2.getPosition()
            r1.removeTabAt(r2)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tab does not belong to this TabLayout."
            r2.<init>(r0)
            throw r2
    }

    public void removeTabAt(int r6) {
            r5 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r5.selectedTab
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.getPosition()
            goto Lb
        La:
            r0 = r1
        Lb:
            r5.removeTabViewAt(r6)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r5.tabs
            java.lang.Object r2 = r2.remove(r6)
            com.google.android.material.tabs.TabLayout$Tab r2 = (com.google.android.material.tabs.TabLayout.Tab) r2
            if (r2 == 0) goto L1e
            r2.reset()
            r5.releaseFromTabPool(r2)
        L1e:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r2 = r5.tabs
            int r2 = r2.size()
            r3 = r6
        L25:
            if (r3 >= r2) goto L35
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r4 = r5.tabs
            java.lang.Object r4 = r4.get(r3)
            com.google.android.material.tabs.TabLayout$Tab r4 = (com.google.android.material.tabs.TabLayout.Tab) r4
            r4.setPosition(r3)
            int r3 = r3 + 1
            goto L25
        L35:
            if (r0 != r6) goto L52
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r5.tabs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
            r6 = 0
            goto L4f
        L41:
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$Tab> r0 = r5.tabs
            int r6 = r6 + (-1)
            int r6 = java.lang.Math.max(r1, r6)
            java.lang.Object r6 = r0.get(r6)
            com.google.android.material.tabs.TabLayout$Tab r6 = (com.google.android.material.tabs.TabLayout.Tab) r6
        L4f:
            r5.selectTab(r6)
        L52:
            return
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab r2) {
            r1 = this;
            r0 = 1
            r1.selectTab(r2, r0)
            return
    }

    public void selectTab(com.google.android.material.tabs.TabLayout.Tab r5, boolean r6) {
            r4 = this;
            com.google.android.material.tabs.TabLayout$Tab r0 = r4.selectedTab
            if (r0 != r5) goto L11
            if (r0 == 0) goto L40
            r4.dispatchTabReselected(r5)
            int r5 = r5.getPosition()
            r4.animateToTab(r5)
            goto L40
        L11:
            r1 = -1
            if (r5 == 0) goto L19
            int r2 = r5.getPosition()
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r6 == 0) goto L34
            if (r0 == 0) goto L24
            int r6 = r0.getPosition()
            if (r6 != r1) goto L2c
        L24:
            if (r2 == r1) goto L2c
            r6 = 0
            r3 = 1
            r4.setScrollPosition(r2, r6, r3)
            goto L2f
        L2c:
            r4.animateToTab(r2)
        L2f:
            if (r2 == r1) goto L34
            r4.setSelectedTabView(r2)
        L34:
            r4.selectedTab = r5
            if (r0 == 0) goto L3b
            r4.dispatchTabUnselected(r0)
        L3b:
            if (r5 == 0) goto L40
            r4.dispatchTabSelected(r5)
        L40:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setInlineLabel(boolean r3) {
            r2 = this;
            boolean r0 = r2.inlineLabel
            if (r0 == r3) goto L24
            r2.inlineLabel = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L21
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L1e
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            r0.updateOrientation()
        L1e:
            int r3 = r3 + 1
            goto L7
        L21:
            r2.applyModeAndGravity()
        L24:
            return
    }

    public void setInlineLabelResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setInlineLabel(r2)
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener r0 = r1.selectedListener
            if (r0 == 0) goto L7
            r1.removeOnTabSelectedListener(r0)
        L7:
            r1.selectedListener = r2
            if (r2 == 0) goto Le
            r1.addOnTabSelectedListener(r2)
        Le:
            return
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(com.google.android.material.tabs.TabLayout.OnTabSelectedListener r1) {
            r0 = this;
            r0.setOnTabSelectedListener(r1)
            return
    }

    void setPagerAdapter(androidx.viewpager.widget.PagerAdapter r3, boolean r4) {
            r2 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r2.pagerAdapter
            if (r0 == 0) goto Lb
            android.database.DataSetObserver r1 = r2.pagerAdapterObserver
            if (r1 == 0) goto Lb
            r0.unregisterDataSetObserver(r1)
        Lb:
            r2.pagerAdapter = r3
            if (r4 == 0) goto L21
            if (r3 == 0) goto L21
            android.database.DataSetObserver r4 = r2.pagerAdapterObserver
            if (r4 != 0) goto L1c
            com.google.android.material.tabs.TabLayout$PagerAdapterObserver r4 = new com.google.android.material.tabs.TabLayout$PagerAdapterObserver
            r4.<init>(r2)
            r2.pagerAdapterObserver = r4
        L1c:
            android.database.DataSetObserver r4 = r2.pagerAdapterObserver
            r3.registerDataSetObserver(r4)
        L21:
            r2.populateFromPagerAdapter()
            return
    }

    void setScrollAnimatorListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            r1.ensureScrollAnimator()
            android.animation.ValueAnimator r0 = r1.scrollAnimator
            r0.addListener(r2)
            return
    }

    public void setScrollPosition(int r2, float r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.setScrollPosition(r2, r3, r4, r0)
            return
    }

    public void setScrollPosition(int r3, float r4, boolean r5, boolean r6) {
            r2 = this;
            float r0 = (float) r3
            float r0 = r0 + r4
            int r0 = java.lang.Math.round(r0)
            if (r0 < 0) goto L34
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r2.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 < r1) goto L11
            goto L34
        L11:
            if (r6 == 0) goto L18
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r6 = r2.slidingTabIndicator
            r6.setIndicatorPositionFromTabPosition(r3, r4)
        L18:
            android.animation.ValueAnimator r6 = r2.scrollAnimator
            if (r6 == 0) goto L27
            boolean r6 = r6.isRunning()
            if (r6 == 0) goto L27
            android.animation.ValueAnimator r6 = r2.scrollAnimator
            r6.cancel()
        L27:
            int r3 = r2.calculateScrollXForTab(r3, r4)
            r4 = 0
            r2.scrollTo(r3, r4)
            if (r5 == 0) goto L34
            r2.setSelectedTabView(r0)
        L34:
            return
    }

    public void setSelectedTabIndicator(int r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setSelectedTabIndicator(r2)
            goto L12
        Le:
            r2 = 0
            r1.setSelectedTabIndicator(r2)
        L12:
            return
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.tabSelectedIndicator
            if (r0 == r2) goto Le
            if (r2 == 0) goto L7
            goto Lc
        L7:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
        Lc:
            r1.tabSelectedIndicator = r2
        Le:
            return
    }

    public void setSelectedTabIndicatorColor(int r1) {
            r0 = this;
            r0.tabSelectedIndicatorColor = r1
            return
    }

    public void setSelectedTabIndicatorGravity(int r2) {
            r1 = this;
            int r0 = r1.tabIndicatorGravity
            if (r0 == r2) goto Lb
            r1.tabIndicatorGravity = r2
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r2 = r1.slidingTabIndicator
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        Lb:
            return
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int r2) {
            r1 = this;
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r1.slidingTabIndicator
            r0.setSelectedIndicatorHeight(r2)
            return
    }

    public void setTabGravity(int r2) {
            r1 = this;
            int r0 = r1.tabGravity
            if (r0 == r2) goto L9
            r1.tabGravity = r2
            r1.applyModeAndGravity()
        L9:
            return
    }

    public void setTabIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabIconTint
            if (r0 == r2) goto L9
            r1.tabIconTint = r2
            r1.updateAllTabs()
        L9:
            return
    }

    public void setTabIconTintResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setTabIconTint(r2)
            return
    }

    public void setTabIndicatorAnimationMode(int r3) {
            r2 = this;
            r2.tabIndicatorAnimationMode = r3
            if (r3 == 0) goto L28
            r0 = 1
            if (r3 != r0) goto Lf
            com.google.android.material.tabs.ElasticTabIndicatorInterpolator r3 = new com.google.android.material.tabs.ElasticTabIndicatorInterpolator
            r3.<init>()
            r2.tabIndicatorInterpolator = r3
            goto L2f
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is not a valid TabIndicatorAnimationMode"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L28:
            com.google.android.material.tabs.TabIndicatorInterpolator r3 = new com.google.android.material.tabs.TabIndicatorInterpolator
            r3.<init>()
            r2.tabIndicatorInterpolator = r3
        L2f:
            return
    }

    public void setTabIndicatorFullWidth(boolean r1) {
            r0 = this;
            r0.tabIndicatorFullWidth = r1
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r0.slidingTabIndicator
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    public void setTabMode(int r2) {
            r1 = this;
            int r0 = r1.mode
            if (r2 == r0) goto L9
            r1.mode = r2
            r1.applyModeAndGravity()
        L9:
            return
    }

    public void setTabRippleColor(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.tabRippleColorStateList
            if (r0 == r3) goto L25
            r2.tabRippleColorStateList = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L22
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            android.content.Context r1 = r2.getContext()
            com.google.android.material.tabs.TabLayout.TabView.access$100(r0, r1)
        L22:
            int r3 = r3 + 1
            goto L7
        L25:
            return
    }

    public void setTabRippleColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setTabRippleColor(r2)
            return
    }

    public void setTabTextColors(int r1, int r2) {
            r0 = this;
            android.content.res.ColorStateList r1 = createColorStateList(r1, r2)
            r0.setTabTextColors(r1)
            return
    }

    public void setTabTextColors(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tabTextColors
            if (r0 == r2) goto L9
            r1.tabTextColors = r2
            r1.updateAllTabs()
        L9:
            return
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.PagerAdapter r2) {
            r1 = this;
            r0 = 0
            r1.setPagerAdapter(r2, r0)
            return
    }

    public void setUnboundedRipple(boolean r3) {
            r2 = this;
            boolean r0 = r2.unboundedRipple
            if (r0 == r3) goto L25
            r2.unboundedRipple = r3
            r3 = 0
        L7:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L25
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r0 = r2.slidingTabIndicator
            android.view.View r0 = r0.getChildAt(r3)
            boolean r1 = r0 instanceof com.google.android.material.tabs.TabLayout.TabView
            if (r1 == 0) goto L22
            com.google.android.material.tabs.TabLayout$TabView r0 = (com.google.android.material.tabs.TabLayout.TabView) r0
            android.content.Context r1 = r2.getContext()
            com.google.android.material.tabs.TabLayout.TabView.access$100(r0, r1)
        L22:
            int r3 = r3 + 1
            goto L7
        L25:
            return
    }

    public void setUnboundedRippleResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setUnboundedRipple(r2)
            return
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager r2) {
            r1 = this;
            r0 = 1
            r1.setupWithViewPager(r2, r0)
            return
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.setupWithViewPager(r2, r3, r0)
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            int r0 = r1.getTabScrollRange()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    void updateTabViews(boolean r4) {
            r3 = this;
            r0 = 0
        L1:
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L27
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r1 = r3.slidingTabIndicator
            android.view.View r1 = r1.getChildAt(r0)
            int r2 = r3.getTabMinWidth()
            r1.setMinimumWidth(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r3.updateTabViewLayoutParams(r2)
            if (r4 == 0) goto L24
            r1.requestLayout()
        L24:
            int r0 = r0 + 1
            goto L1
        L27:
            return
    }
}
