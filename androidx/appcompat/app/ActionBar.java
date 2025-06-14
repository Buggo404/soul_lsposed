package androidx.appcompat.app;

/* loaded from: classes.dex */
public abstract class ActionBar {
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;

    @java.lang.Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(int r3) {
                r2 = this;
                r0 = -2
                r1 = -1
                r2.<init>(r0, r1, r3)
                return
        }

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.gravity = r1
                return
        }

        public LayoutParams(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.gravity = r3
                return
        }

        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.gravity = r0
                int[] r1 = androidx.appcompat.C0015R.styleable.ActionBarLayout
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = androidx.appcompat.C0015R.styleable.ActionBarLayout_android_layout_gravity
                int r4 = r3.getInt(r4, r0)
                r2.gravity = r4
                r3.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.gravity = r1
                return
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.gravity = r0
                int r2 = r2.gravity
                r1.gravity = r2
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean r1);
    }

    @java.lang.Deprecated
    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int r1, long r2);
    }

    @java.lang.Deprecated
    public static abstract class Tab {
        public static final int INVALID_POSITION = -1;

        public Tab() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.CharSequence getContentDescription();

        public abstract android.view.View getCustomView();

        public abstract android.graphics.drawable.Drawable getIcon();

        public abstract int getPosition();

        public abstract java.lang.Object getTag();

        public abstract java.lang.CharSequence getText();

        public abstract void select();

        public abstract androidx.appcompat.app.ActionBar.Tab setContentDescription(int r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setCustomView(int r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setIcon(int r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setText(int r1);

        public abstract androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence r1);
    }

    @java.lang.Deprecated
    public interface TabListener {
        void onTabReselected(androidx.appcompat.app.ActionBar.Tab r1, androidx.fragment.app.FragmentTransaction r2);

        void onTabSelected(androidx.appcompat.app.ActionBar.Tab r1, androidx.fragment.app.FragmentTransaction r2);

        void onTabUnselected(androidx.appcompat.app.ActionBar.Tab r1, androidx.fragment.app.FragmentTransaction r2);
    }

    public ActionBar() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r1);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab r1);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab r1, int r2);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab r1, int r2, boolean r3);

    @java.lang.Deprecated
    public abstract void addTab(androidx.appcompat.app.ActionBar.Tab r1, boolean r2);

    public boolean closeOptionsMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean collapseActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void dispatchMenuVisibilityChanged(boolean r1) {
            r0 = this;
            return
    }

    public abstract android.view.View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract int getHeight();

    public int getHideOffset() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public abstract int getNavigationItemCount();

    @java.lang.Deprecated
    public abstract int getNavigationMode();

    @java.lang.Deprecated
    public abstract int getSelectedNavigationIndex();

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab getSelectedTab();

    public abstract java.lang.CharSequence getSubtitle();

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab getTabAt(int r1);

    @java.lang.Deprecated
    public abstract int getTabCount();

    public android.content.Context getThemedContext() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract java.lang.CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public abstract androidx.appcompat.app.ActionBar.Tab newTab();

    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    void onDestroy() {
            r0 = this;
            return
    }

    public boolean onKeyShortcut(int r1, android.view.KeyEvent r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean onMenuKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean openOptionsMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r1);

    @java.lang.Deprecated
    public abstract void removeTab(androidx.appcompat.app.ActionBar.Tab r1);

    @java.lang.Deprecated
    public abstract void removeTabAt(int r1);

    boolean requestFocus() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public abstract void selectTab(androidx.appcompat.app.ActionBar.Tab r1);

    public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

    public abstract void setCustomView(int r1);

    public abstract void setCustomView(android.view.View r1);

    public abstract void setCustomView(android.view.View r1, androidx.appcompat.app.ActionBar.LayoutParams r2);

    public void setDefaultDisplayHomeAsUpEnabled(boolean r1) {
            r0 = this;
            return
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean r1);

    public abstract void setDisplayOptions(int r1);

    public abstract void setDisplayOptions(int r1, int r2);

    public abstract void setDisplayShowCustomEnabled(boolean r1);

    public abstract void setDisplayShowHomeEnabled(boolean r1);

    public abstract void setDisplayShowTitleEnabled(boolean r1);

    public abstract void setDisplayUseLogoEnabled(boolean r1);

    public void setElevation(float r2) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L6
            return
        L6:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Setting a non-zero elevation is not supported in this action bar configuration."
            r2.<init>(r0)
            throw r2
    }

    public void setHideOffset(int r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Setting an explicit action bar hide offset is not supported in this action bar configuration."
            r2.<init>(r0)
            throw r2
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Hide on content scroll is not supported in this action bar configuration."
            r2.<init>(r0)
            throw r2
    }

    public void setHomeActionContentDescription(int r1) {
            r0 = this;
            return
    }

    public void setHomeActionContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void setHomeAsUpIndicator(int r1) {
            r0 = this;
            return
    }

    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    public void setHomeButtonEnabled(boolean r1) {
            r0 = this;
            return
    }

    public abstract void setIcon(int r1);

    public abstract void setIcon(android.graphics.drawable.Drawable r1);

    @java.lang.Deprecated
    public abstract void setListNavigationCallbacks(android.widget.SpinnerAdapter r1, androidx.appcompat.app.ActionBar.OnNavigationListener r2);

    public abstract void setLogo(int r1);

    public abstract void setLogo(android.graphics.drawable.Drawable r1);

    @java.lang.Deprecated
    public abstract void setNavigationMode(int r1);

    @java.lang.Deprecated
    public abstract void setSelectedNavigationItem(int r1);

    public void setShowHideAnimationEnabled(boolean r1) {
            r0 = this;
            return
    }

    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    public abstract void setSubtitle(int r1);

    public abstract void setSubtitle(java.lang.CharSequence r1);

    public abstract void setTitle(int r1);

    public abstract void setTitle(java.lang.CharSequence r1);

    public void setWindowTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public abstract void show();

    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
