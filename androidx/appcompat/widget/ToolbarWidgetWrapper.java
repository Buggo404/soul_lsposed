package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ToolbarWidgetWrapper implements androidx.appcompat.widget.DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final java.lang.String TAG = "ToolbarWidgetWrapper";
    private androidx.appcompat.widget.ActionMenuPresenter mActionMenuPresenter;
    private android.view.View mCustomView;
    private int mDefaultNavigationContentDescription;
    private android.graphics.drawable.Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private java.lang.CharSequence mHomeDescription;
    private android.graphics.drawable.Drawable mIcon;
    private android.graphics.drawable.Drawable mLogo;
    boolean mMenuPrepared;
    private android.graphics.drawable.Drawable mNavIcon;
    private int mNavigationMode;
    private android.widget.Spinner mSpinner;
    private java.lang.CharSequence mSubtitle;
    private android.view.View mTabView;
    java.lang.CharSequence mTitle;
    private boolean mTitleSet;
    androidx.appcompat.widget.Toolbar mToolbar;
    android.view.Window.Callback mWindowCallback;



    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar r3, boolean r4) {
            r2 = this;
            int r0 = androidx.appcompat.C0015R.string.abc_action_bar_up_description
            int r1 = androidx.appcompat.C0015R.drawable.abc_ic_ab_back_material
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar r4, boolean r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = 0
            r3.mNavigationMode = r7
            r3.mDefaultNavigationContentDescription = r7
            r3.mToolbar = r4
            java.lang.CharSequence r0 = r4.getTitle()
            r3.mTitle = r0
            java.lang.CharSequence r0 = r4.getSubtitle()
            r3.mSubtitle = r0
            java.lang.CharSequence r0 = r3.mTitle
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = r7
        L1d:
            r3.mTitleSet = r0
            android.graphics.drawable.Drawable r0 = r4.getNavigationIcon()
            r3.mNavIcon = r0
            android.content.Context r4 = r4.getContext()
            int[] r0 = androidx.appcompat.C0015R.styleable.ActionBar
            int r1 = androidx.appcompat.C0015R.attr.actionBarStyle
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r2, r0, r1, r7)
            int r0 = androidx.appcompat.C0015R.styleable.ActionBar_homeAsUpIndicator
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r3.mDefaultNavigationIcon = r0
            if (r5 == 0) goto L109
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_title
            java.lang.CharSequence r5 = r4.getText(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4b
            r3.setTitle(r5)
        L4b:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_subtitle
            java.lang.CharSequence r5 = r4.getText(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L5a
            r3.setSubtitle(r5)
        L5a:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_logo
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            if (r5 == 0) goto L65
            r3.setLogo(r5)
        L65:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_icon
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            if (r5 == 0) goto L70
            r3.setIcon(r5)
        L70:
            android.graphics.drawable.Drawable r5 = r3.mNavIcon
            if (r5 != 0) goto L7b
            android.graphics.drawable.Drawable r5 = r3.mDefaultNavigationIcon
            if (r5 == 0) goto L7b
            r3.setNavigationIcon(r5)
        L7b:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_displayOptions
            int r5 = r4.getInt(r5, r7)
            r3.setDisplayOptions(r5)
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_customNavigationLayout
            int r5 = r4.getResourceId(r5, r7)
            if (r5 == 0) goto La6
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            android.view.View r5 = r0.inflate(r5, r1, r7)
            r3.setCustomView(r5)
            int r5 = r3.mDisplayOpts
            r5 = r5 | 16
            r3.setDisplayOptions(r5)
        La6:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_height
            int r5 = r4.getLayoutDimension(r5, r7)
            if (r5 <= 0) goto Lbb
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r5
            androidx.appcompat.widget.Toolbar r5 = r3.mToolbar
            r5.setLayoutParams(r0)
        Lbb:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_contentInsetStart
            r0 = -1
            int r5 = r4.getDimensionPixelOffset(r5, r0)
            int r1 = androidx.appcompat.C0015R.styleable.ActionBar_contentInsetEnd
            int r0 = r4.getDimensionPixelOffset(r1, r0)
            if (r5 >= 0) goto Lcc
            if (r0 < 0) goto Ld9
        Lcc:
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            int r5 = java.lang.Math.max(r5, r7)
            int r0 = java.lang.Math.max(r0, r7)
            r1.setContentInsetsRelative(r5, r0)
        Ld9:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_titleTextStyle
            int r5 = r4.getResourceId(r5, r7)
            if (r5 == 0) goto Lea
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.content.Context r1 = r0.getContext()
            r0.setTitleTextAppearance(r1, r5)
        Lea:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_subtitleTextStyle
            int r5 = r4.getResourceId(r5, r7)
            if (r5 == 0) goto Lfb
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.content.Context r1 = r0.getContext()
            r0.setSubtitleTextAppearance(r1, r5)
        Lfb:
            int r5 = androidx.appcompat.C0015R.styleable.ActionBar_popupTheme
            int r5 = r4.getResourceId(r5, r7)
            if (r5 == 0) goto L10f
            androidx.appcompat.widget.Toolbar r7 = r3.mToolbar
            r7.setPopupTheme(r5)
            goto L10f
        L109:
            int r5 = r3.detectDisplayOptions()
            r3.mDisplayOpts = r5
        L10f:
            r4.recycle()
            r3.setDefaultNavigationContentDescription(r6)
            androidx.appcompat.widget.Toolbar r4 = r3.mToolbar
            java.lang.CharSequence r4 = r4.getNavigationContentDescription()
            r3.mHomeDescription = r4
            androidx.appcompat.widget.Toolbar r4 = r3.mToolbar
            androidx.appcompat.widget.ToolbarWidgetWrapper$1 r5 = new androidx.appcompat.widget.ToolbarWidgetWrapper$1
            r5.<init>(r3)
            r4.setNavigationOnClickListener(r5)
            return
    }

    private int detectDisplayOptions() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()
            r1.mDefaultNavigationIcon = r0
            r0 = 15
            goto L15
        L13:
            r0 = 11
        L15:
            return r0
    }

    private void ensureSpinner() {
            r4 = this;
            android.widget.Spinner r0 = r4.mSpinner
            if (r0 != 0) goto L20
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.C0015R.attr.actionDropDownStyle
            r0.<init>(r1, r2, r3)
            r4.mSpinner = r0
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = 8388627(0x800013, float:1.175497E-38)
            r2 = -2
            r0.<init>(r2, r2, r1)
            android.widget.Spinner r1 = r4.mSpinner
            r1.setLayoutParams(r0)
        L20:
            return
    }

    private void setTitleInt(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            int r0 = r1.mDisplayOpts
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setTitle(r2)
        Ld:
            return
    }

    private void updateHomeAccessibility() {
            r2 = this;
            int r0 = r2.mDisplayOpts
            r0 = r0 & 4
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r2.mHomeDescription
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            int r1 = r2.mDefaultNavigationContentDescription
            r0.setNavigationContentDescription(r1)
            goto L1d
        L16:
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            java.lang.CharSequence r1 = r2.mHomeDescription
            r0.setNavigationContentDescription(r1)
        L1d:
            return
    }

    private void updateNavigationIcon() {
            r2 = this;
            int r0 = r2.mDisplayOpts
            r0 = r0 & 4
            if (r0 == 0) goto L13
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            android.graphics.drawable.Drawable r1 = r2.mNavIcon
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            android.graphics.drawable.Drawable r1 = r2.mDefaultNavigationIcon
        Lf:
            r0.setNavigationIcon(r1)
            goto L19
        L13:
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            r1 = 0
            r0.setNavigationIcon(r1)
        L19:
            return
    }

    private void updateToolbarLogo() {
            r2 = this;
            int r0 = r2.mDisplayOpts
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.mLogo
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.mIcon
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.mIcon
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            r1.setLogo(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int r3) {
            r2 = this;
            r0 = 200(0xc8, double:9.9E-322)
            androidx.core.view.ViewPropertyAnimatorCompat r3 = r2.setupAnimatorToVisibility(r3, r0)
            if (r3 == 0) goto Lb
            r3.start()
        Lb:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.collapseActionView()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.dismissPopupMenus()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.content.Context getContext() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.View getCustomView() {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
            r1 = this;
            int r0 = r1.mDisplayOpts
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
            r1 = this;
            android.widget.Spinner r0 = r1.mSpinner
            if (r0 == 0) goto L9
            int r0 = r0.getCount()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
            r1 = this;
            android.widget.Spinner r0 = r1.mSpinner
            if (r0 == 0) goto L9
            int r0 = r0.getSelectedItemPosition()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.Menu getMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
            r1 = this;
            int r0 = r1.mNavigationMode
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.ViewGroup getViewGroup() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            int r0 = r0.getVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
            r1 = this;
            android.view.View r0 = r1.mTabView
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.hasExpandedActionView()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIcon
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLogo
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isTitleTruncated()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.saveHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            androidx.core.view.ViewCompat.setBackground(r0, r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setCollapsible(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.mCustomView
            if (r0 == 0) goto Lf
            int r1 = r2.mDisplayOpts
            r1 = r1 & 16
            if (r1 == 0) goto Lf
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            r1.removeView(r0)
        Lf:
            r2.mCustomView = r3
            if (r3 == 0) goto L1e
            int r0 = r2.mDisplayOpts
            r0 = r0 & 16
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            r0.addView(r3)
        L1e:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int r2) {
            r1 = this;
            int r0 = r1.mDefaultNavigationContentDescription
            if (r2 != r0) goto L5
            return
        L5:
            r1.mDefaultNavigationContentDescription = r2
            androidx.appcompat.widget.Toolbar r2 = r1.mToolbar
            java.lang.CharSequence r2 = r2.getNavigationContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L18
            int r2 = r1.mDefaultNavigationContentDescription
            r1.setNavigationContentDescription(r2)
        L18:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDefaultNavigationIcon
            if (r0 == r2) goto L9
            r1.mDefaultNavigationIcon = r2
            r1.updateNavigationIcon()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int r4) {
            r3 = this;
            int r0 = r3.mDisplayOpts
            r0 = r0 ^ r4
            r3.mDisplayOpts = r4
            if (r0 == 0) goto L55
            r1 = r0 & 4
            if (r1 == 0) goto L15
            r1 = r4 & 4
            if (r1 == 0) goto L12
            r3.updateHomeAccessibility()
        L12:
            r3.updateNavigationIcon()
        L15:
            r1 = r0 & 3
            if (r1 == 0) goto L1c
            r3.updateToolbarLogo()
        L1c:
            r1 = r0 & 8
            if (r1 == 0) goto L3e
            r1 = r4 & 8
            if (r1 == 0) goto L33
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            java.lang.CharSequence r2 = r3.mTitle
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            java.lang.CharSequence r2 = r3.mSubtitle
            r1.setSubtitle(r2)
            goto L3e
        L33:
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            r2 = 0
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            r1.setSubtitle(r2)
        L3e:
            r0 = r0 & 16
            if (r0 == 0) goto L55
            android.view.View r0 = r3.mCustomView
            if (r0 == 0) goto L55
            r4 = r4 & 16
            if (r4 == 0) goto L50
            androidx.appcompat.widget.Toolbar r4 = r3.mToolbar
            r4.addView(r0)
            goto L55
        L50:
            androidx.appcompat.widget.Toolbar r4 = r3.mToolbar
            r4.removeView(r0)
        L55:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(android.widget.SpinnerAdapter r2, android.widget.AdapterView.OnItemSelectedListener r3) {
            r1 = this;
            r1.ensureSpinner()
            android.widget.Spinner r0 = r1.mSpinner
            r0.setAdapter(r2)
            android.widget.Spinner r2 = r1.mSpinner
            r2.setOnItemSelectedListener(r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int r2) {
            r1 = this;
            android.widget.Spinner r0 = r1.mSpinner
            if (r0 == 0) goto L8
            r0.setSelection(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't set dropdown selected position without an adapter"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView r3) {
            r2 = this;
            android.view.View r0 = r2.mTabView
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            if (r0 != r1) goto L11
            android.view.View r0 = r2.mTabView
            r1.removeView(r0)
        L11:
            r2.mTabView = r3
            if (r3 == 0) goto L36
            int r0 = r2.mNavigationMode
            r1 = 2
            if (r0 != r1) goto L36
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            r1 = 0
            r0.addView(r3, r1)
            android.view.View r0 = r2.mTabView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = (androidx.appcompat.widget.Toolbar.LayoutParams) r0
            r1 = -2
            r0.width = r1
            r0.height = r1
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0.gravity = r1
            r0 = 1
            r3.setAllowCollapse(r0)
        L36:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mIcon = r1
            r0.updateToolbarLogo()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mLogo = r1
            r0.updateToolbarLogo()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(android.view.Menu r3, androidx.appcompat.view.menu.MenuPresenter.Callback r4) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mActionMenuPresenter
            if (r0 != 0) goto L16
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r2.mActionMenuPresenter = r0
            int r1 = androidx.appcompat.C0015R.id.action_menu_presenter
            r0.setId(r1)
        L16:
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mActionMenuPresenter
            r0.setCallback(r4)
            androidx.appcompat.widget.Toolbar r4 = r2.mToolbar
            androidx.appcompat.view.menu.MenuBuilder r3 = (androidx.appcompat.view.menu.MenuBuilder) r3
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mActionMenuPresenter
            r4.setMenu(r3, r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r2, androidx.appcompat.view.menu.MenuBuilder.Callback r3) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setMenuCallbacks(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
            r1 = this;
            r0 = 1
            r1.mMenuPrepared = r0
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r0.getString(r2)
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mHomeDescription = r1
            r0.updateHomeAccessibility()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mNavIcon = r1
            r0.updateNavigationIcon()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int r5) {
            r4 = this;
            int r0 = r4.mNavigationMode
            if (r5 == r0) goto L72
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L1d
            if (r0 == r1) goto Lb
            goto L2e
        Lb:
            android.view.View r0 = r4.mTabView
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.mToolbar
            if (r0 != r3) goto L2e
            android.view.View r0 = r4.mTabView
            r3.removeView(r0)
            goto L2e
        L1d:
            android.widget.Spinner r0 = r4.mSpinner
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.mToolbar
            if (r0 != r3) goto L2e
            android.widget.Spinner r0 = r4.mSpinner
            r3.removeView(r0)
        L2e:
            r4.mNavigationMode = r5
            if (r5 == 0) goto L72
            r0 = 0
            if (r5 == r2) goto L68
            if (r5 != r1) goto L53
            android.view.View r5 = r4.mTabView
            if (r5 == 0) goto L72
            androidx.appcompat.widget.Toolbar r1 = r4.mToolbar
            r1.addView(r5, r0)
            android.view.View r5 = r4.mTabView
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r5 = (androidx.appcompat.widget.Toolbar.LayoutParams) r5
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r5.gravity = r0
            goto L72
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid navigation mode "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L68:
            r4.ensureSpinner()
            androidx.appcompat.widget.Toolbar r5 = r4.mToolbar
            android.widget.Spinner r1 = r4.mSpinner
            r5.addView(r1, r0)
        L72:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mSubtitle = r2
            int r0 = r1.mDisplayOpts
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setSubtitle(r2)
        Ld:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 1
            r1.mTitleSet = r0
            r1.setTitleInt(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setVisibility(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.mWindowCallback = r1
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.mTitleSet
            if (r0 != 0) goto L7
            r1.setTitleInt(r2)
        L7:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r3, long r4) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r0 = androidx.core.view.ViewCompat.animate(r0)
            if (r3 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.alpha(r1)
            androidx.core.view.ViewPropertyAnimatorCompat r4 = r0.setDuration(r4)
            androidx.appcompat.widget.ToolbarWidgetWrapper$2 r5 = new androidx.appcompat.widget.ToolbarWidgetWrapper$2
            r5.<init>(r2, r3)
            androidx.core.view.ViewPropertyAnimatorCompat r3 = r4.setListener(r5)
            return r3
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.showOverflowMenu()
            return r0
    }
}
