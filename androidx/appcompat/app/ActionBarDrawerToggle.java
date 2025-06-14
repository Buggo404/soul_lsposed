package androidx.appcompat.app;

/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private final androidx.appcompat.app.ActionBarDrawerToggle.Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final androidx.drawerlayout.widget.DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private boolean mHasCustomUpIndicator;
    private android.graphics.drawable.Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private androidx.appcompat.graphics.drawable.DrawerArrowDrawable mSlider;
    android.view.View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;


    public interface Delegate {
        android.content.Context getActionBarThemedContext();

        android.graphics.drawable.Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(int r1);

        void setActionBarUpIndicator(android.graphics.drawable.Drawable r1, int r2);
    }

    public interface DelegateProvider {
        androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
    }

    private static class FrameworkActionBarDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        private final android.app.Activity mActivity;
        private androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

        FrameworkActionBarDelegate(android.app.Activity r1) {
                r0 = this;
                r0.<init>()
                r0.mActivity = r1
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Ld
                android.content.Context r0 = r0.getThemedContext()
                return r0
            Ld:
                android.app.Activity r0 = r1.mActivity
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
                r5 = this;
                android.content.Context r0 = r5.getActionBarThemedContext()
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16843531(0x101030b, float:2.369574E-38)
                r3 = 0
                r1[r3] = r2
                r2 = 16843470(0x10102ce, float:2.369557E-38)
                r4 = 0
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1, r2, r3)
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r3)
                r0.recycle()
                return r1
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto L12
                int r0 = r0.getDisplayOptions()
                r0 = r0 & 4
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Lb
                r0.setHomeActionContentDescription(r2)
            Lb:
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                android.app.ActionBar r0 = r0.getActionBar()
                if (r0 == 0) goto Le
                r0.setHomeAsUpIndicator(r2)
                r0.setHomeActionContentDescription(r3)
            Le:
                return
        }
    }

    static class ToolbarCompatDelegate implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        final java.lang.CharSequence mDefaultContentDescription;
        final android.graphics.drawable.Drawable mDefaultUpIndicator;
        final androidx.appcompat.widget.Toolbar mToolbar;

        ToolbarCompatDelegate(androidx.appcompat.widget.Toolbar r2) {
                r1 = this;
                r1.<init>()
                r1.mToolbar = r2
                android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
                r1.mDefaultUpIndicator = r0
                java.lang.CharSequence r2 = r2.getNavigationContentDescription()
                r1.mDefaultContentDescription = r2
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
                android.content.Context r0 = r0.getContext()
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDefaultUpIndicator
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int r2) {
                r1 = this;
                if (r2 != 0) goto La
                androidx.appcompat.widget.Toolbar r2 = r1.mToolbar
                java.lang.CharSequence r0 = r1.mDefaultContentDescription
                r2.setNavigationContentDescription(r0)
                goto Lf
            La:
                androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
                r0.setNavigationContentDescription(r2)
            Lf:
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
                r0.setNavigationIcon(r2)
                r1.setActionBarDescription(r3)
                return
        }
    }

    ActionBarDrawerToggle(android.app.Activity r2, androidx.appcompat.widget.Toolbar r3, androidx.drawerlayout.widget.DrawerLayout r4, androidx.appcompat.graphics.drawable.DrawerArrowDrawable r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mDrawerSlideAnimationEnabled = r0
            r1.mDrawerIndicatorEnabled = r0
            r0 = 0
            r1.mWarnedForDisplayHomeAsUp = r0
            if (r3 == 0) goto L1d
            androidx.appcompat.app.ActionBarDrawerToggle$ToolbarCompatDelegate r2 = new androidx.appcompat.app.ActionBarDrawerToggle$ToolbarCompatDelegate
            r2.<init>(r3)
            r1.mActivityImpl = r2
            androidx.appcompat.app.ActionBarDrawerToggle$1 r2 = new androidx.appcompat.app.ActionBarDrawerToggle$1
            r2.<init>(r1)
            r3.setNavigationOnClickListener(r2)
            goto L31
        L1d:
            boolean r3 = r2 instanceof androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider
            if (r3 == 0) goto L2a
            androidx.appcompat.app.ActionBarDrawerToggle$DelegateProvider r2 = (androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider) r2
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r2 = r2.getDrawerToggleDelegate()
            r1.mActivityImpl = r2
            goto L31
        L2a:
            androidx.appcompat.app.ActionBarDrawerToggle$FrameworkActionBarDelegate r3 = new androidx.appcompat.app.ActionBarDrawerToggle$FrameworkActionBarDelegate
            r3.<init>(r2)
            r1.mActivityImpl = r3
        L31:
            r1.mDrawerLayout = r4
            r1.mOpenDrawerContentDescRes = r6
            r1.mCloseDrawerContentDescRes = r7
            if (r5 != 0) goto L47
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r2 = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r3 = r1.mActivityImpl
            android.content.Context r3 = r3.getActionBarThemedContext()
            r2.<init>(r3)
            r1.mSlider = r2
            goto L49
        L47:
            r1.mSlider = r5
        L49:
            android.graphics.drawable.Drawable r2 = r1.getThemeUpIndicator()
            r1.mHomeAsUpIndicator = r2
            return
    }

    public ActionBarDrawerToggle(android.app.Activity r8, androidx.drawerlayout.widget.DrawerLayout r9, int r10, int r11) {
            r7 = this;
            r2 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ActionBarDrawerToggle(android.app.Activity r8, androidx.drawerlayout.widget.DrawerLayout r9, androidx.appcompat.widget.Toolbar r10, int r11, int r12) {
            r7 = this;
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private void setPosition(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r2.mSlider
            r1 = 1
            r0.setVerticalMirror(r1)
            goto L18
        Ld:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r2.mSlider
            r1 = 0
            r0.setVerticalMirror(r1)
        L18:
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r2.mSlider
            r0.setProgress(r3)
            return
    }

    public androidx.appcompat.graphics.drawable.DrawerArrowDrawable getDrawerArrowDrawable() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r1.mSlider
            return r0
    }

    android.graphics.drawable.Drawable getThemeUpIndicator() {
            r1 = this;
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r1.mActivityImpl
            android.graphics.drawable.Drawable r0 = r0.getThemeUpIndicator()
            return r0
    }

    public android.view.View.OnClickListener getToolbarNavigationClickListener() {
            r1 = this;
            android.view.View$OnClickListener r0 = r1.mToolbarNavigationClickListener
            return r0
    }

    public boolean isDrawerIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawerIndicatorEnabled
            return r0
    }

    public boolean isDrawerSlideAnimationEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawerSlideAnimationEnabled
            return r0
    }

    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            boolean r1 = r0.mHasCustomUpIndicator
            if (r1 != 0) goto La
            android.graphics.drawable.Drawable r1 = r0.getThemeUpIndicator()
            r0.mHomeAsUpIndicator = r1
        La:
            r0.syncState()
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.setPosition(r1)
            boolean r1 = r0.mDrawerIndicatorEnabled
            if (r1 == 0) goto Ld
            int r1 = r0.mOpenDrawerContentDescRes
            r0.setActionBarDescription(r1)
        Ld:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(android.view.View r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setPosition(r1)
            boolean r1 = r0.mDrawerIndicatorEnabled
            if (r1 == 0) goto Le
            int r1 = r0.mCloseDrawerContentDescRes
            r0.setActionBarDescription(r1)
        Le:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(android.view.View r2, float r3) {
            r1 = this;
            boolean r2 = r1.mDrawerSlideAnimationEnabled
            r0 = 0
            if (r2 == 0) goto L13
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r0, r3)
            float r2 = java.lang.Math.min(r2, r3)
            r1.setPosition(r2)
            goto L16
        L13:
            r1.setPosition(r0)
        L16:
            return
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int r1) {
            r0 = this;
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            if (r2 == 0) goto L14
            int r2 = r2.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r2 != r0) goto L14
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 == 0) goto L14
            r1.toggle()
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    void setActionBarDescription(int r2) {
            r1 = this;
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r1.mActivityImpl
            r0.setActionBarDescription(r2)
            return
    }

    void setActionBarUpIndicator(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            boolean r0 = r2.mWarnedForDisplayHomeAsUp
            if (r0 != 0) goto L16
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r2.mActivityImpl
            boolean r0 = r0.isNavigationVisible()
            if (r0 != 0) goto L16
            java.lang.String r0 = "ActionBarDrawerToggle"
            java.lang.String r1 = "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"
            android.util.Log.w(r0, r1)
            r0 = 1
            r2.mWarnedForDisplayHomeAsUp = r0
        L16:
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r2.mActivityImpl
            r0.setActionBarUpIndicator(r3, r4)
            return
    }

    public void setDrawerArrowDrawable(androidx.appcompat.graphics.drawable.DrawerArrowDrawable r1) {
            r0 = this;
            r0.mSlider = r1
            r0.syncState()
            return
    }

    public void setDrawerIndicatorEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDrawerIndicatorEnabled
            if (r4 == r0) goto L24
            if (r4 == 0) goto L1c
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r3.mSlider
            androidx.drawerlayout.widget.DrawerLayout r1 = r3.mDrawerLayout
            r2 = 8388611(0x800003, float:1.1754948E-38)
            boolean r1 = r1.isDrawerOpen(r2)
            if (r1 == 0) goto L16
            int r1 = r3.mCloseDrawerContentDescRes
            goto L18
        L16:
            int r1 = r3.mOpenDrawerContentDescRes
        L18:
            r3.setActionBarUpIndicator(r0, r1)
            goto L22
        L1c:
            android.graphics.drawable.Drawable r0 = r3.mHomeAsUpIndicator
            r1 = 0
            r3.setActionBarUpIndicator(r0, r1)
        L22:
            r3.mDrawerIndicatorEnabled = r4
        L24:
            return
    }

    public void setDrawerSlideAnimationEnabled(boolean r1) {
            r0 = this;
            r0.mDrawerSlideAnimationEnabled = r1
            if (r1 != 0) goto L8
            r1 = 0
            r0.setPosition(r1)
        L8:
            return
    }

    public void setHomeAsUpIndicator(int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.drawerlayout.widget.DrawerLayout r0 = r1.mDrawerLayout
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            r1.setHomeAsUpIndicator(r2)
            return
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto Lc
            android.graphics.drawable.Drawable r2 = r1.getThemeUpIndicator()
            r1.mHomeAsUpIndicator = r2
            r1.mHasCustomUpIndicator = r0
            goto L11
        Lc:
            r1.mHomeAsUpIndicator = r2
            r2 = 1
            r1.mHasCustomUpIndicator = r2
        L11:
            boolean r2 = r1.mDrawerIndicatorEnabled
            if (r2 != 0) goto L1a
            android.graphics.drawable.Drawable r2 = r1.mHomeAsUpIndicator
            r1.setActionBarUpIndicator(r2, r0)
        L1a:
            return
    }

    public void setToolbarNavigationClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.mToolbarNavigationClickListener = r1
            return
    }

    public void syncState() {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.mDrawerLayout
            r1 = 8388611(0x800003, float:1.1754948E-38)
            boolean r0 = r0.isDrawerOpen(r1)
            if (r0 == 0) goto L11
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setPosition(r0)
            goto L15
        L11:
            r0 = 0
            r3.setPosition(r0)
        L15:
            boolean r0 = r3.mDrawerIndicatorEnabled
            if (r0 == 0) goto L2b
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable r0 = r3.mSlider
            androidx.drawerlayout.widget.DrawerLayout r2 = r3.mDrawerLayout
            boolean r1 = r2.isDrawerOpen(r1)
            if (r1 == 0) goto L26
            int r1 = r3.mCloseDrawerContentDescRes
            goto L28
        L26:
            int r1 = r3.mOpenDrawerContentDescRes
        L28:
            r3.setActionBarUpIndicator(r0, r1)
        L2b:
            return
    }

    void toggle() {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.mDrawerLayout
            r1 = 8388611(0x800003, float:1.1754948E-38)
            int r0 = r0.getDrawerLockMode(r1)
            androidx.drawerlayout.widget.DrawerLayout r2 = r3.mDrawerLayout
            boolean r2 = r2.isDrawerVisible(r1)
            if (r2 == 0) goto L1a
            r2 = 2
            if (r0 == r2) goto L1a
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.mDrawerLayout
            r0.closeDrawer(r1)
            goto L22
        L1a:
            r2 = 1
            if (r0 == r2) goto L22
            androidx.drawerlayout.widget.DrawerLayout r0 = r3.mDrawerLayout
            r0.openDrawer(r1)
        L22:
            return
    }
}
