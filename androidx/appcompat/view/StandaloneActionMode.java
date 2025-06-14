package androidx.appcompat.view;

/* loaded from: classes.dex */
public class StandaloneActionMode extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
    private androidx.appcompat.view.ActionMode.Callback mCallback;
    private android.content.Context mContext;
    private androidx.appcompat.widget.ActionBarContextView mContextView;
    private java.lang.ref.WeakReference<android.view.View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;

    public StandaloneActionMode(android.content.Context r1, androidx.appcompat.widget.ActionBarContextView r2, androidx.appcompat.view.ActionMode.Callback r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mContextView = r2
            r0.mCallback = r3
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 1
            androidx.appcompat.view.menu.MenuBuilder r1 = r1.setDefaultShowAsAction(r2)
            r0.mMenu = r1
            r1.setCallback(r0)
            r0.mFocusable = r4
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
            r2 = this;
            boolean r0 = r2.mFinished
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.mFinished = r0
            androidx.appcompat.widget.ActionBarContextView r0 = r2.mContextView
            r1 = 32
            r0.sendAccessibilityEvent(r1)
            androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback
            r0.onDestroyActionMode(r2)
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
            androidx.appcompat.widget.ActionBarContextView r1 = r2.mContextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.appcompat.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
            r2 = this;
            androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback
            androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
            r0.onPrepareActionMode(r2, r1)
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            boolean r0 = r0.isTitleOptional()
            return r0
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isUiFocusable() {
            r1 = this;
            boolean r0 = r1.mFocusable
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
            boolean r1 = r1.onActionItemClicked(r0, r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.invalidate()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.mContextView
            r1.showOverflowMenu()
            return
    }

    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r4) {
            r3 = this;
            boolean r0 = r4.hasVisibleItems()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.appcompat.view.menu.MenuPopupHelper r0 = new androidx.appcompat.view.menu.MenuPopupHelper
            androidx.appcompat.widget.ActionBarContextView r2 = r3.mContextView
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2, r4)
            r0.show()
            return r1
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.mCustomView = r0
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setSubtitle(r2)
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            r0.setSubtitle(r2)
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            r0.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean r2) {
            r1 = this;
            super.setTitleOptionalHint(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.mContextView
            r0.setTitleOptional(r2)
            return
    }
}
