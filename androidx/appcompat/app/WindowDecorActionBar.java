package androidx.appcompat.app;

/* loaded from: classes.dex */
public class WindowDecorActionBar extends androidx.appcompat.app.ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final long FADE_IN_DURATION_MS = 200;
    private static final long FADE_OUT_DURATION_MS = 100;
    private static final int INVALID_POSITION = -1;
    private static final java.lang.String TAG = "WindowDecorActionBar";
    private static final android.view.animation.Interpolator sHideInterpolator = null;
    private static final android.view.animation.Interpolator sShowInterpolator = null;
    androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl mActionMode;
    private android.app.Activity mActivity;
    androidx.appcompat.widget.ActionBarContainer mContainerView;
    boolean mContentAnimations;
    android.view.View mContentView;
    android.content.Context mContext;
    androidx.appcompat.widget.ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    androidx.appcompat.view.ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    androidx.appcompat.view.ActionMode mDeferredDestroyActionMode;
    androidx.appcompat.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    boolean mHiddenByApp;
    boolean mHiddenBySystem;
    final androidx.core.view.ViewPropertyAnimatorListener mHideListener;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private java.util.ArrayList<androidx.appcompat.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners;
    private boolean mNowShowing;
    androidx.appcompat.widget.ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private androidx.appcompat.app.WindowDecorActionBar.TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final androidx.core.view.ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    androidx.appcompat.widget.ScrollingTabContainerView mTabScrollView;
    private java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar.TabImpl> mTabs;
    private android.content.Context mThemedContext;
    final androidx.core.view.ViewPropertyAnimatorUpdateListener mUpdateListener;




    public class ActionModeImpl extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        private final android.content.Context mActionModeContext;
        private androidx.appcompat.view.ActionMode.Callback mCallback;
        private java.lang.ref.WeakReference<android.view.View> mCustomView;
        private final androidx.appcompat.view.menu.MenuBuilder mMenu;
        final /* synthetic */ androidx.appcompat.app.WindowDecorActionBar this$0;

        public ActionModeImpl(androidx.appcompat.app.WindowDecorActionBar r1, android.content.Context r2, androidx.appcompat.view.ActionMode.Callback r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mActionModeContext = r2
                r0.mCallback = r3
                androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
                r1.<init>(r2)
                r2 = 1
                androidx.appcompat.view.menu.MenuBuilder r1 = r1.setDefaultShowAsAction(r2)
                r0.mMenu = r1
                r1.setCallback(r0)
                return
        }

        public boolean dispatchOnCreate() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.stopDispatchingItemsChanged()
                androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L13
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu     // Catch: java.lang.Throwable -> L13
                boolean r0 = r0.onCreateActionMode(r2, r1)     // Catch: java.lang.Throwable -> L13
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                return r0
            L13:
                r0 = move-exception
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                throw r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
                r3 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r0.mActionMode
                if (r0 == r3) goto L7
                return
            L7:
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                boolean r0 = r0.mHiddenByApp
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                boolean r1 = r1.mHiddenBySystem
                r2 = 0
                boolean r0 = androidx.appcompat.app.WindowDecorActionBar.checkShowingFlags(r0, r1, r2)
                if (r0 != 0) goto L21
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                r0.mDeferredDestroyActionMode = r3
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                androidx.appcompat.view.ActionMode$Callback r1 = r3.mCallback
                r0.mDeferredModeDestroyCallback = r1
                goto L26
            L21:
                androidx.appcompat.view.ActionMode$Callback r0 = r3.mCallback
                r0.onDestroyActionMode(r3)
            L26:
                r0 = 0
                r3.mCallback = r0
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                r1.animateToMode(r2)
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.mContextView
                r1.closeMode()
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                androidx.appcompat.widget.DecorToolbar r1 = r1.mDecorToolbar
                android.view.ViewGroup r1 = r1.getViewGroup()
                r2 = 32
                r1.sendAccessibilityEvent(r2)
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                androidx.appcompat.widget.ActionBarOverlayLayout r1 = r1.mOverlayLayout
                androidx.appcompat.app.WindowDecorActionBar r2 = r3.this$0
                boolean r2 = r2.mHideOnContentScroll
                r1.setHideOnContentScrollEnabled(r2)
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                r1.mActionMode = r0
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.View getCustomView() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.mCustomView
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.Menu getMenu() {
                r1 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.MenuInflater getMenuInflater() {
                r2 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
                android.content.Context r1 = r2.mActionModeContext
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getSubtitle() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getTitle() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
                r2 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r0.mActionMode
                if (r0 == r2) goto L7
                return
            L7:
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.stopDispatchingItemsChanged()
                androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L19
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu     // Catch: java.lang.Throwable -> L19
                r0.onPrepareActionMode(r2, r1)     // Catch: java.lang.Throwable -> L19
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.startDispatchingItemsChanged()
                return
            L19:
                r0 = move-exception
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                throw r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                boolean r0 = r0.isTitleOptional()
                return r0
        }

        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
        }

        public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r1, android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.view.ActionMode$Callback r1 = r0.mCallback
                if (r1 == 0) goto L9
                boolean r1 = r1.onActionItemClicked(r0, r2)
                return r1
            L9:
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r1) {
                r0 = this;
                androidx.appcompat.view.ActionMode$Callback r1 = r0.mCallback
                if (r1 != 0) goto L5
                return
            L5:
                r0.invalidate()
                androidx.appcompat.app.WindowDecorActionBar r1 = r0.this$0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.mContextView
                r1.showOverflowMenu()
                return
        }

        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r4) {
                r3 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r3.mCallback
                if (r0 != 0) goto L6
                r4 = 0
                return r4
            L6:
                boolean r0 = r4.hasVisibleItems()
                r1 = 1
                if (r0 != 0) goto Le
                return r1
            Le:
                androidx.appcompat.view.menu.MenuPopupHelper r0 = new androidx.appcompat.view.menu.MenuPopupHelper
                androidx.appcompat.app.WindowDecorActionBar r2 = r3.this$0
                android.content.Context r2 = r2.getThemedContext()
                r0.<init>(r2, r4)
                r0.show()
                return r1
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCustomView = r0
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.setSubtitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setSubtitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.setTitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setTitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean r2) {
                r1 = this;
                super.setTitleOptionalHint(r2)
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setTitleOptional(r2)
                return
        }
    }

    public class TabImpl extends androidx.appcompat.app.ActionBar.Tab {
        private androidx.appcompat.app.ActionBar.TabListener mCallback;
        private java.lang.CharSequence mContentDesc;
        private android.view.View mCustomView;
        private android.graphics.drawable.Drawable mIcon;
        private int mPosition;
        private java.lang.Object mTag;
        private java.lang.CharSequence mText;
        final /* synthetic */ androidx.appcompat.app.WindowDecorActionBar this$0;

        public TabImpl(androidx.appcompat.app.WindowDecorActionBar r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.mPosition = r1
                return
        }

        public androidx.appcompat.app.ActionBar.TabListener getCallback() {
                r1 = this;
                androidx.appcompat.app.ActionBar$TabListener r0 = r1.mCallback
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getContentDescription() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mContentDesc
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.view.View getCustomView() {
                r1 = this;
                android.view.View r0 = r1.mCustomView
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.graphics.drawable.Drawable getIcon() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mIcon
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.Object getTag() {
                r1 = this;
                java.lang.Object r0 = r1.mTag
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mText
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                r0.selectTab(r1)
                return
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                androidx.appcompat.app.ActionBar$Tab r2 = r1.setContentDescription(r2)
                return r2
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence r2) {
                r1 = this;
                r1.mContentDesc = r2
                int r2 = r1.mPosition
                if (r2 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r2 = r1.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r2.mTabScrollView
                int r0 = r1.mPosition
                r2.updateTab(r0)
            Lf:
                return r1
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(int r3) {
                r2 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                android.content.Context r0 = r0.getThemedContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                android.view.View r3 = r0.inflate(r3, r1)
                androidx.appcompat.app.ActionBar$Tab r3 = r2.setCustomView(r3)
                return r3
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View r2) {
                r1 = this;
                r1.mCustomView = r2
                int r2 = r1.mPosition
                if (r2 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r2 = r1.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r2.mTabScrollView
                int r0 = r1.mPosition
                r2.updateTab(r0)
            Lf:
                return r1
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                androidx.appcompat.app.ActionBar$Tab r2 = r1.setIcon(r2)
                return r2
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.mIcon = r2
                int r2 = r1.mPosition
                if (r2 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r2 = r1.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r2.mTabScrollView
                int r0 = r1.mPosition
                r2.updateTab(r0)
            Lf:
                return r1
        }

        public void setPosition(int r1) {
                r0 = this;
                r0.mPosition = r1
                return
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener r1) {
                r0 = this;
                r0.mCallback = r1
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object r1) {
                r0 = this;
                r0.mTag = r1
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r2 = r0.getText(r2)
                androidx.appcompat.app.ActionBar$Tab r2 = r1.setText(r2)
                return r2
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence r2) {
                r1 = this;
                r1.mText = r2
                int r2 = r1.mPosition
                if (r2 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r2 = r1.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r2 = r2.mTabScrollView
                int r0 = r1.mPosition
                r2.updateTab(r0)
            Lf:
                return r1
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.WindowDecorActionBar.sHideInterpolator = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.WindowDecorActionBar.sShowInterpolator = r0
            return
    }

    public WindowDecorActionBar(android.app.Activity r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r0 = -1
            r1.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMenuVisibilityListeners = r0
            r0 = 0
            r1.mCurWindowVisibility = r0
            r0 = 1
            r1.mContentAnimations = r0
            r1.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r1)
            r1.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r1)
            r1.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r1)
            r1.mUpdateListener = r0
            r1.mActivity = r2
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.init(r2)
            if (r3 != 0) goto L49
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r1.mContentView = r2
        L49:
            return
    }

    public WindowDecorActionBar(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r0 = -1
            r1.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMenuVisibilityListeners = r0
            r0 = 0
            r1.mCurWindowVisibility = r0
            r0 = 1
            r1.mContentAnimations = r0
            r1.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r1)
            r1.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r1)
            r1.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r1)
            r1.mUpdateListener = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.init(r2)
            return
    }

    public WindowDecorActionBar(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r0 = -1
            r1.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMenuVisibilityListeners = r0
            r0 = 0
            r1.mCurWindowVisibility = r0
            r0 = 1
            r1.mContentAnimations = r0
            r1.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r1)
            r1.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r1)
            r1.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r1)
            r1.mUpdateListener = r0
            r1.init(r2)
            return
    }

    static boolean checkShowingFlags(boolean r1, boolean r2, boolean r3) {
            r0 = 1
            if (r3 == 0) goto L4
            return r0
        L4:
            if (r1 != 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return r0
        La:
            r1 = 0
            return r1
    }

    private void cleanupTabs() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r1.mSelectedTab
            if (r0 == 0) goto L8
            r0 = 0
            r1.selectTab(r0)
        L8:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            r0.clear()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            if (r0 == 0) goto L14
            r0.removeAllTabs()
        L14:
            r0 = -1
            r1.mSavedTabPosition = r0
            return
    }

    private void configureTab(androidx.appcompat.app.ActionBar.Tab r2, int r3) {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r2
            androidx.appcompat.app.ActionBar$TabListener r0 = r2.getCallback()
            if (r0 == 0) goto L27
            r2.setPosition(r3)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            r0.add(r3, r2)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r2 = r1.mTabs
            int r2 = r2.size()
        L16:
            int r3 = r3 + 1
            if (r3 >= r2) goto L26
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            java.lang.Object r0 = r0.get(r3)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r0
            r0.setPosition(r3)
            goto L16
        L26:
            return
        L27:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Action Bar Tab must have a Callback"
            r2.<init>(r3)
            throw r2
    }

    private void ensureTabsExist() {
            r4 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            if (r0 == 0) goto L5
            return
        L5:
            androidx.appcompat.widget.ScrollingTabContainerView r0 = new androidx.appcompat.widget.ScrollingTabContainerView
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            boolean r1 = r4.mHasEmbeddedTabs
            r2 = 0
            if (r1 == 0) goto L1a
            r0.setVisibility(r2)
            androidx.appcompat.widget.DecorToolbar r1 = r4.mDecorToolbar
            r1.setEmbeddedTabView(r0)
            goto L36
        L1a:
            int r1 = r4.getNavigationMode()
            r3 = 2
            if (r1 != r3) goto L2c
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r4.mOverlayLayout
            if (r1 == 0) goto L31
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            goto L31
        L2c:
            r1 = 8
            r0.setVisibility(r1)
        L31:
            androidx.appcompat.widget.ActionBarContainer r1 = r4.mContainerView
            r1.setTabContainer(r0)
        L36:
            r4.mTabScrollView = r0
            return
    }

    private androidx.appcompat.widget.DecorToolbar getDecorToolbar(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.DecorToolbar
            if (r0 == 0) goto L7
            androidx.appcompat.widget.DecorToolbar r4 = (androidx.appcompat.widget.DecorToolbar) r4
            return r4
        L7:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L12
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            androidx.appcompat.widget.DecorToolbar r4 = r4.getWrapper()
            return r4
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't make a decor toolbar out of "
            r1.<init>(r2)
            if (r4 == 0) goto L26
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            goto L28
        L26:
            java.lang.String r4 = "null"
        L28:
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private void hideForActionMode() {
            r2 = this;
            boolean r0 = r2.mShowingForMode
            if (r0 == 0) goto L11
            r0 = 0
            r2.mShowingForMode = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            if (r1 == 0) goto Le
            r1.setShowingForActionMode(r0)
        Le:
            r2.updateVisibility(r0)
        L11:
            return
    }

    private void init(android.view.View r6) {
            r5 = this;
            int r0 = androidx.appcompat.C0015R.id.decor_content_parent
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r5.mOverlayLayout = r0
            if (r0 == 0) goto Lf
            r0.setActionBarVisibilityCallback(r5)
        Lf:
            int r0 = androidx.appcompat.C0015R.id.action_bar
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.DecorToolbar r0 = r5.getDecorToolbar(r0)
            r5.mDecorToolbar = r0
            int r0 = androidx.appcompat.C0015R.id.action_context_bar
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r5.mContextView = r0
            int r0 = androidx.appcompat.C0015R.id.action_bar_container
            android.view.View r6 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r6 = (androidx.appcompat.widget.ActionBarContainer) r6
            r5.mContainerView = r6
            androidx.appcompat.widget.DecorToolbar r0 = r5.mDecorToolbar
            if (r0 == 0) goto L94
            androidx.appcompat.widget.ActionBarContextView r1 = r5.mContextView
            if (r1 == 0) goto L94
            if (r6 == 0) goto L94
            android.content.Context r6 = r0.getContext()
            r5.mContext = r6
            androidx.appcompat.widget.DecorToolbar r6 = r5.mDecorToolbar
            int r6 = r6.getDisplayOptions()
            r6 = r6 & 4
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L4d
            r6 = r0
            goto L4e
        L4d:
            r6 = r1
        L4e:
            if (r6 == 0) goto L52
            r5.mDisplayHomeAsUpSet = r0
        L52:
            android.content.Context r2 = r5.mContext
            androidx.appcompat.view.ActionBarPolicy r2 = androidx.appcompat.view.ActionBarPolicy.get(r2)
            boolean r3 = r2.enableHomeButtonByDefault()
            if (r3 != 0) goto L63
            if (r6 == 0) goto L61
            goto L63
        L61:
            r6 = r1
            goto L64
        L63:
            r6 = r0
        L64:
            r5.setHomeButtonEnabled(r6)
            boolean r6 = r2.hasEmbeddedTabs()
            r5.setHasEmbeddedTabs(r6)
            android.content.Context r6 = r5.mContext
            int[] r2 = androidx.appcompat.C0015R.styleable.ActionBar
            int r3 = androidx.appcompat.C0015R.attr.actionBarStyle
            r4 = 0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4, r2, r3, r1)
            int r2 = androidx.appcompat.C0015R.styleable.ActionBar_hideOnContentScroll
            boolean r2 = r6.getBoolean(r2, r1)
            if (r2 == 0) goto L84
            r5.setHideOnContentScrollEnabled(r0)
        L84:
            int r0 = androidx.appcompat.C0015R.styleable.ActionBar_elevation
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == 0) goto L90
            float r0 = (float) r0
            r5.setElevation(r0)
        L90:
            r6.recycle()
            return
        L94:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " can only be used with a compatible window decor layout"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    private void setHasEmbeddedTabs(boolean r5) {
            r4 = this;
            r4.mHasEmbeddedTabs = r5
            r0 = 0
            if (r5 != 0) goto L12
            androidx.appcompat.widget.DecorToolbar r5 = r4.mDecorToolbar
            r5.setEmbeddedTabView(r0)
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            r5.setTabContainer(r0)
            goto L1e
        L12:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            r5.setTabContainer(r0)
            androidx.appcompat.widget.DecorToolbar r5 = r4.mDecorToolbar
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            r5.setEmbeddedTabView(r0)
        L1e:
            int r5 = r4.getNavigationMode()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L29
            r5 = r1
            goto L2a
        L29:
            r5 = r2
        L2a:
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            if (r0 == 0) goto L40
            if (r5 == 0) goto L3b
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r4.mOverlayLayout
            if (r0 == 0) goto L40
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto L40
        L3b:
            r3 = 8
            r0.setVisibility(r3)
        L40:
            androidx.appcompat.widget.DecorToolbar r0 = r4.mDecorToolbar
            boolean r3 = r4.mHasEmbeddedTabs
            if (r3 != 0) goto L4a
            if (r5 == 0) goto L4a
            r3 = r1
            goto L4b
        L4a:
            r3 = r2
        L4b:
            r0.setCollapsible(r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r4.mOverlayLayout
            boolean r3 = r4.mHasEmbeddedTabs
            if (r3 != 0) goto L57
            if (r5 == 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            r0.setHasNonEmbeddedTabs(r1)
            return
    }

    private boolean shouldAnimateContextView() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            return r0
    }

    private void showForActionMode() {
            r2 = this;
            boolean r0 = r2.mShowingForMode
            if (r0 != 0) goto L12
            r0 = 1
            r2.mShowingForMode = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            if (r1 == 0) goto Le
            r1.setShowingForActionMode(r0)
        Le:
            r0 = 0
            r2.updateVisibility(r0)
        L12:
            return
    }

    private void updateVisibility(boolean r4) {
            r3 = this;
            boolean r0 = r3.mHiddenByApp
            boolean r1 = r3.mHiddenBySystem
            boolean r2 = r3.mShowingForMode
            boolean r0 = checkShowingFlags(r0, r1, r2)
            if (r0 == 0) goto L17
            boolean r0 = r3.mNowShowing
            if (r0 != 0) goto L21
            r0 = 1
            r3.mNowShowing = r0
            r3.doShow(r4)
            goto L21
        L17:
            boolean r0 = r3.mNowShowing
            if (r0 == 0) goto L21
            r0 = 0
            r3.mNowShowing = r0
            r3.doHide(r4)
        L21:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r1.mMenuVisibilityListeners
            r0.add(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, int r3) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r3, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, int r3, boolean r4) {
            r1 = this;
            r1.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            r0.addTab(r2, r3, r4)
            r1.configureTab(r2, r3)
            if (r4 == 0) goto L10
            r1.selectTab(r2)
        L10:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, boolean r3) {
            r1 = this;
            r1.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            r0.addTab(r2, r3)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            int r0 = r0.size()
            r1.configureTab(r2, r0)
            if (r3 == 0) goto L16
            r1.selectTab(r2)
        L16:
            return
    }

    public void animateToMode(boolean r9) {
            r8 = this;
            if (r9 == 0) goto L6
            r8.showForActionMode()
            goto L9
        L6:
            r8.hideForActionMode()
        L9:
            boolean r0 = r8.shouldAnimateContextView()
            r1 = 4
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L3e
            r4 = 100
            r6 = 200(0xc8, double:9.9E-322)
            if (r9 == 0) goto L26
            androidx.appcompat.widget.DecorToolbar r9 = r8.mDecorToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r9 = r9.setupAnimatorToVisibility(r1, r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.mContextView
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.setupAnimatorToVisibility(r3, r6)
            goto L32
        L26:
            androidx.appcompat.widget.DecorToolbar r9 = r8.mDecorToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r9.setupAnimatorToVisibility(r3, r6)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.mContextView
            androidx.core.view.ViewPropertyAnimatorCompat r9 = r9.setupAnimatorToVisibility(r2, r4)
        L32:
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r1 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r1.<init>()
            r1.playSequentially(r9, r0)
            r1.start()
            goto L55
        L3e:
            if (r9 == 0) goto L4b
            androidx.appcompat.widget.DecorToolbar r9 = r8.mDecorToolbar
            r9.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.mContextView
            r9.setVisibility(r3)
            goto L55
        L4b:
            androidx.appcompat.widget.DecorToolbar r9 = r8.mDecorToolbar
            r9.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.mContextView
            r9.setVisibility(r2)
        L55:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            if (r0 == 0) goto L11
            boolean r0 = r0.hasExpandedActionView()
            if (r0 == 0) goto L11
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.collapseActionView()
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    void completeDeferredDestroyActionMode() {
            r2 = this;
            androidx.appcompat.view.ActionMode$Callback r0 = r2.mDeferredModeDestroyCallback
            if (r0 == 0) goto Le
            androidx.appcompat.view.ActionMode r1 = r2.mDeferredDestroyActionMode
            r0.onDestroyActionMode(r1)
            r0 = 0
            r2.mDeferredDestroyActionMode = r0
            r2.mDeferredModeDestroyCallback = r0
        Le:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mLastMenuVisibility
            if (r4 != r0) goto L5
            return
        L5:
            r3.mLastMenuVisibility = r4
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r3.mMenuVisibilityListeners
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r2 = r3.mMenuVisibilityListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.app.ActionBar$OnMenuVisibilityListener r2 = (androidx.appcompat.app.ActionBar.OnMenuVisibilityListener) r2
            r2.onMenuVisibilityChanged(r4)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    public void doHide(boolean r5) {
            r4 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r4.mCurrentShowAnim
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            int r0 = r4.mCurWindowVisibility
            if (r0 != 0) goto L76
            boolean r0 = r4.mShowHideAnimationEnabled
            if (r0 != 0) goto L11
            if (r5 == 0) goto L76
        L11:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.mContainerView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r4.mContainerView
            r1 = 1
            r0.setTransitioning(r1)
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r4.mContainerView
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            if (r5 == 0) goto L3c
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x007e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r3 = r4.mContainerView
            r3.getLocationInWindow(r5)
            r5 = r5[r1]
            float r5 = (float) r5
            float r2 = r2 - r5
        L3c:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            androidx.core.view.ViewPropertyAnimatorCompat r5 = androidx.core.view.ViewCompat.animate(r5)
            androidx.core.view.ViewPropertyAnimatorCompat r5 = r5.translationY(r2)
            androidx.core.view.ViewPropertyAnimatorUpdateListener r1 = r4.mUpdateListener
            r5.setUpdateListener(r1)
            r0.play(r5)
            boolean r5 = r4.mContentAnimations
            if (r5 == 0) goto L61
            android.view.View r5 = r4.mContentView
            if (r5 == 0) goto L61
            androidx.core.view.ViewPropertyAnimatorCompat r5 = androidx.core.view.ViewCompat.animate(r5)
            androidx.core.view.ViewPropertyAnimatorCompat r5 = r5.translationY(r2)
            r0.play(r5)
        L61:
            android.view.animation.Interpolator r5 = androidx.appcompat.app.WindowDecorActionBar.sHideInterpolator
            r0.setInterpolator(r5)
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            androidx.core.view.ViewPropertyAnimatorListener r5 = r4.mHideListener
            r0.setListener(r5)
            r4.mCurrentShowAnim = r0
            r0.start()
            goto L7c
        L76:
            androidx.core.view.ViewPropertyAnimatorListener r5 = r4.mHideListener
            r0 = 0
            r5.onAnimationEnd(r0)
        L7c:
            return
    }

    public void doShow(boolean r5) {
            r4 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r4.mCurrentShowAnim
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.mContainerView
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r4.mCurWindowVisibility
            r1 = 0
            if (r0 != 0) goto L80
            boolean r0 = r4.mShowHideAnimationEnabled
            if (r0 != 0) goto L18
            if (r5 == 0) goto L80
        L18:
            androidx.appcompat.widget.ActionBarContainer r0 = r4.mContainerView
            r0.setTranslationY(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r4.mContainerView
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r5 == 0) goto L37
            r5 = 2
            int[] r5 = new int[r5]
            r5 = {x00a6: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r2 = r4.mContainerView
            r2.getLocationInWindow(r5)
            r2 = 1
            r5 = r5[r2]
            float r5 = (float) r5
            float r0 = r0 - r5
        L37:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            r5.setTranslationY(r0)
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r5 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r5.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r4.mContainerView
            androidx.core.view.ViewPropertyAnimatorCompat r2 = androidx.core.view.ViewCompat.animate(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r2 = r2.translationY(r1)
            androidx.core.view.ViewPropertyAnimatorUpdateListener r3 = r4.mUpdateListener
            r2.setUpdateListener(r3)
            r5.play(r2)
            boolean r2 = r4.mContentAnimations
            if (r2 == 0) goto L6b
            android.view.View r2 = r4.mContentView
            if (r2 == 0) goto L6b
            r2.setTranslationY(r0)
            android.view.View r0 = r4.mContentView
            androidx.core.view.ViewPropertyAnimatorCompat r0 = androidx.core.view.ViewCompat.animate(r0)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.translationY(r1)
            r5.play(r0)
        L6b:
            android.view.animation.Interpolator r0 = androidx.appcompat.app.WindowDecorActionBar.sShowInterpolator
            r5.setInterpolator(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r5.setDuration(r0)
            androidx.core.view.ViewPropertyAnimatorListener r0 = r4.mShowListener
            r5.setListener(r0)
            r4.mCurrentShowAnim = r5
            r5.start()
            goto L9d
        L80:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContainer r5 = r4.mContainerView
            r5.setTranslationY(r1)
            boolean r5 = r4.mContentAnimations
            if (r5 == 0) goto L97
            android.view.View r5 = r4.mContentView
            if (r5 == 0) goto L97
            r5.setTranslationY(r1)
        L97:
            androidx.core.view.ViewPropertyAnimatorListener r5 = r4.mShowListener
            r0 = 0
            r5.onAnimationEnd(r0)
        L9d:
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r4.mOverlayLayout
            if (r5 == 0) goto La4
            androidx.core.view.ViewCompat.requestApplyInsets(r5)
        La4:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean r1) {
            r0 = this;
            r0.mContentAnimations = r1
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.view.View getCustomView() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getDisplayOptions()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            float r0 = androidx.core.view.ViewCompat.getElevation(r0)
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            int r0 = r0.getActionBarHideOffset()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getNavigationMode()
            r1 = 1
            if (r0 == r1) goto L15
            r1 = 2
            if (r0 == r1) goto Le
            r0 = 0
            return r0
        Le:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r2.mTabs
            int r0 = r0.size()
            return r0
        L15:
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getDropdownItemCount()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getNavigationMode()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
            r3 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r3.mDecorToolbar
            int r0 = r0.getNavigationMode()
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            r2 = -1
            if (r0 == r1) goto Le
            return r2
        Le:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r3.mSelectedTab
            if (r0 == 0) goto L16
            int r2 = r0.getPosition()
        L16:
            return r2
        L17:
            androidx.appcompat.widget.DecorToolbar r0 = r3.mDecorToolbar
            int r0 = r0.getDropdownSelectedPosition()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getSelectedTab() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r1.mSelectedTab
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getTabAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            java.lang.Object r2 = r0.get(r2)
            androidx.appcompat.app.ActionBar$Tab r2 = (androidx.appcompat.app.ActionBar.Tab) r2
            return r2
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.content.Context getThemedContext() {
            r4 = this;
            android.content.Context r0 = r4.mThemedContext
            if (r0 != 0) goto L27
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.mContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.C0015R.attr.actionBarWidgetTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L23
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.mContext
            r1.<init>(r2, r0)
            r4.mThemedContext = r1
            goto L27
        L23:
            android.content.Context r0 = r4.mContext
            r4.mThemedContext = r0
        L27:
            android.content.Context r0 = r4.mThemedContext
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public boolean hasIcon() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasIcon()
            return r0
    }

    public boolean hasLogo() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasLogo()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
            r1 = this;
            boolean r0 = r1.mHiddenByApp
            if (r0 != 0) goto Lb
            r0 = 1
            r1.mHiddenByApp = r0
            r0 = 0
            r1.updateVisibility(r0)
        Lb:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
            r1 = this;
            boolean r0 = r1.mHiddenBySystem
            if (r0 != 0) goto La
            r0 = 1
            r1.mHiddenBySystem = r0
            r1.updateVisibility(r0)
        La:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            boolean r0 = r0.isHideOnContentScrollEnabled()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
            r2 = this;
            int r0 = r2.getHeight()
            boolean r1 = r2.mNowShowing
            if (r1 == 0) goto L12
            if (r0 == 0) goto L10
            int r1 = r2.getHideOffset()
            if (r1 >= r0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            if (r0 == 0) goto Lc
            boolean r0 = r0.isTitleTruncated()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab newTab() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = new androidx.appcompat.app.WindowDecorActionBar$TabImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            android.content.Context r1 = r0.mContext
            androidx.appcompat.view.ActionBarPolicy r1 = androidx.appcompat.view.ActionBarPolicy.get(r1)
            boolean r1 = r1.hasEmbeddedTabs()
            r0.setHasEmbeddedTabs(r1)
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
            r1 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r1.mCurrentShowAnim
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.mCurrentShowAnim = r0
        La:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int r5, android.view.KeyEvent r6) {
            r4 = this;
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r4.mActionMode
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L29
            if (r6 == 0) goto L13
            int r2 = r6.getDeviceId()
            goto L14
        L13:
            r2 = -1
        L14:
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L29:
            return r1
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int r1) {
            r0 = this;
            r0.mCurWindowVisibility = r1
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
            r0 = this;
            r0.cleanupTabs()
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r1.mMenuVisibilityListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(androidx.appcompat.app.ActionBar.Tab r1) {
            r0 = this;
            int r1 = r1.getPosition()
            r0.removeTabAt(r1)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int r5) {
            r4 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r4.mSelectedTab
            if (r0 == 0) goto Le
            int r0 = r0.getPosition()
            goto L10
        Le:
            int r0 = r4.mSavedTabPosition
        L10:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r4.mTabScrollView
            r1.removeTabAt(r5)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r1 = r4.mTabs
            java.lang.Object r1 = r1.remove(r5)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r1
            if (r1 == 0) goto L23
            r2 = -1
            r1.setPosition(r2)
        L23:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r1 = r4.mTabs
            int r1 = r1.size()
            r2 = r5
        L2a:
            if (r2 >= r1) goto L3a
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r3 = r4.mTabs
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r3 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r3
            r3.setPosition(r2)
            int r2 = r2 + 1
            goto L2a
        L3a:
            if (r0 != r5) goto L58
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r4.mTabs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L46
            r5 = 0
            goto L55
        L46:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r4.mTabs
            r1 = 0
            int r5 = r5 + (-1)
            int r5 = java.lang.Math.max(r1, r5)
            java.lang.Object r5 = r0.get(r5)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r5 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r5
        L55:
            r4.selectTab(r5)
        L58:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            android.view.ViewGroup r0 = r0.getViewGroup()
            if (r0 == 0) goto L13
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L13
            r0.requestFocus()
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(androidx.appcompat.app.ActionBar.Tab r4) {
            r3 = this;
            int r0 = r3.getNavigationMode()
            r1 = 2
            r2 = -1
            if (r0 == r1) goto L11
            if (r4 == 0) goto Le
            int r2 = r4.getPosition()
        Le:
            r3.mSavedTabPosition = r2
            return
        L11:
            android.app.Activity r0 = r3.mActivity
            boolean r0 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L34
            androidx.appcompat.widget.DecorToolbar r0 = r3.mDecorToolbar
            android.view.ViewGroup r0 = r0.getViewGroup()
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L34
            android.app.Activity r0 = r3.mActivity
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            androidx.fragment.app.FragmentTransaction r0 = r0.disallowAddToBackStack()
            goto L35
        L34:
            r0 = 0
        L35:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 != r4) goto L4e
            if (r1 == 0) goto L75
            androidx.appcompat.app.ActionBar$TabListener r1 = r1.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = r3.mSelectedTab
            r1.onTabReselected(r2, r0)
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r3.mTabScrollView
            int r4 = r4.getPosition()
            r1.animateToTab(r4)
            goto L75
        L4e:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r3.mTabScrollView
            if (r4 == 0) goto L56
            int r2 = r4.getPosition()
        L56:
            r1.setTabSelected(r2)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 == 0) goto L66
            androidx.appcompat.app.ActionBar$TabListener r1 = r1.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = r3.mSelectedTab
            r1.onTabUnselected(r2, r0)
        L66:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r4 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r4
            r3.mSelectedTab = r4
            if (r4 == 0) goto L75
            androidx.appcompat.app.ActionBar$TabListener r4 = r4.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            r4.onTabSelected(r1, r0)
        L75:
            if (r0 == 0) goto L80
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L80
            r0.commit()
        L80:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            r0.setPrimaryBackground(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getThemedContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.widget.DecorToolbar r1 = r3.mDecorToolbar
            android.view.ViewGroup r1 = r1.getViewGroup()
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.setCustomView(r4)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setCustomView(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View r1, androidx.appcompat.app.ActionBar.LayoutParams r2) {
            r0 = this;
            r1.setLayoutParams(r2)
            androidx.appcompat.widget.DecorToolbar r2 = r0.mDecorToolbar
            r2.setCustomView(r1)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mDisplayHomeAsUpSet
            if (r0 != 0) goto L7
            r1.setDisplayHomeAsUpEnabled(r2)
        L7:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean r2) {
            r1 = this;
            r0 = 4
            if (r2 == 0) goto L5
            r2 = r0
            goto L6
        L5:
            r2 = 0
        L6:
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int r2) {
            r1 = this;
            r0 = r2 & 4
            if (r0 == 0) goto L7
            r0 = 1
            r1.mDisplayHomeAsUpSet = r0
        L7:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setDisplayOptions(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int r3, int r4) {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getDisplayOptions()
            r1 = r4 & 4
            if (r1 == 0) goto Ld
            r1 = 1
            r2.mDisplayHomeAsUpSet = r1
        Ld:
            androidx.appcompat.widget.DecorToolbar r1 = r2.mDecorToolbar
            r3 = r3 & r4
            int r4 = ~r4
            r4 = r4 & r0
            r3 = r3 | r4
            r1.setDisplayOptions(r3)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean r2) {
            r1 = this;
            r0 = 16
            if (r2 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = 0
        L7:
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean r2) {
            r1 = this;
            r0 = 2
            if (r2 == 0) goto L5
            r2 = r0
            goto L6
        L5:
            r2 = 0
        L6:
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean r2) {
            r1 = this;
            r0 = 8
            if (r2 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = 0
        L7:
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean r2) {
            r1 = this;
            r0 = 1
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            androidx.core.view.ViewCompat.setElevation(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int r2) {
            r1 = this;
            if (r2 == 0) goto L13
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            boolean r0 = r0.isInOverlayMode()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset"
            r2.<init>(r0)
            throw r2
        L13:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            r0.setActionBarHideOffset(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L13
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            boolean r0 = r0.isInOverlayMode()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r2.<init>(r0)
            throw r2
        L13:
            r1.mHideOnContentScroll = r2
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            r0.setHideOnContentScrollEnabled(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationContentDescription(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationContentDescription(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setHomeButtonEnabled(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter r3, androidx.appcompat.app.ActionBar.OnNavigationListener r4) {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            androidx.appcompat.app.NavItemSelectedListener r1 = new androidx.appcompat.app.NavItemSelectedListener
            r1.<init>(r4)
            r0.setDropdownParams(r3, r1)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int r6) {
            r5 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r5.mDecorToolbar
            int r0 = r0.getNavigationMode()
            r1 = 2
            if (r0 == r1) goto La
            goto L1b
        La:
            int r2 = r5.getSelectedNavigationIndex()
            r5.mSavedTabPosition = r2
            r2 = 0
            r5.selectTab(r2)
            androidx.appcompat.widget.ScrollingTabContainerView r2 = r5.mTabScrollView
            r3 = 8
            r2.setVisibility(r3)
        L1b:
            if (r0 == r6) goto L28
            boolean r0 = r5.mHasEmbeddedTabs
            if (r0 != 0) goto L28
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.mOverlayLayout
            if (r0 == 0) goto L28
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
        L28:
            androidx.appcompat.widget.DecorToolbar r0 = r5.mDecorToolbar
            r0.setNavigationMode(r6)
            r0 = 0
            if (r6 == r1) goto L31
            goto L43
        L31:
            r5.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r2 = r5.mTabScrollView
            r2.setVisibility(r0)
            int r2 = r5.mSavedTabPosition
            r3 = -1
            if (r2 == r3) goto L43
            r5.setSelectedNavigationItem(r2)
            r5.mSavedTabPosition = r3
        L43:
            androidx.appcompat.widget.DecorToolbar r2 = r5.mDecorToolbar
            r3 = 1
            if (r6 != r1) goto L4e
            boolean r4 = r5.mHasEmbeddedTabs
            if (r4 != 0) goto L4e
            r4 = r3
            goto L4f
        L4e:
            r4 = r0
        L4f:
            r2.setCollapsible(r4)
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.mOverlayLayout
            if (r6 != r1) goto L5b
            boolean r6 = r5.mHasEmbeddedTabs
            if (r6 != 0) goto L5b
            r0 = r3
        L5b:
            r2.setHasNonEmbeddedTabs(r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int r3) {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getNavigationMode()
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L18
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r2.mTabs
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.app.ActionBar$Tab r3 = (androidx.appcompat.app.ActionBar.Tab) r3
            r2.selectTab(r3)
            goto L25
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "setSelectedNavigationIndex not valid for current navigation mode"
            r3.<init>(r0)
            throw r3
        L20:
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            r0.setDropdownSelectedPosition(r3)
        L25:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean r1) {
            r0 = this;
            r0.mShowHideAnimationEnabled = r1
            if (r1 != 0) goto Lb
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r1 = r0.mCurrentShowAnim
            if (r1 == 0) goto Lb
            r1.cancel()
        Lb:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            r0.setStackedBackground(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setSubtitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setSubtitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
            r1 = this;
            boolean r0 = r1.mHiddenByApp
            if (r0 == 0) goto La
            r0 = 0
            r1.mHiddenByApp = r0
            r1.updateVisibility(r0)
        La:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
            r1 = this;
            boolean r0 = r1.mHiddenBySystem
            if (r0 == 0) goto Lb
            r0 = 0
            r1.mHiddenBySystem = r0
            r0 = 1
            r1.updateVisibility(r0)
        Lb:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback r3) {
            r2 = this;
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r2.mActionMode
            if (r0 == 0) goto L7
            r0.finish()
        L7:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.mContextView
            r0.killMode()
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = new androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl
            androidx.appcompat.widget.ActionBarContextView r1 = r2.mContextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            boolean r3 = r0.dispatchOnCreate()
            if (r3 == 0) goto L39
            r2.mActionMode = r0
            r0.invalidate()
            androidx.appcompat.widget.ActionBarContextView r3 = r2.mContextView
            r3.initForMode(r0)
            r3 = 1
            r2.animateToMode(r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r2.mContextView
            r1 = 32
            r3.sendAccessibilityEvent(r1)
            return r0
        L39:
            r3 = 0
            return r3
    }
}
