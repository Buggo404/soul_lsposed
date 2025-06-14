package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
class SubMenuWrapperICS extends androidx.appcompat.view.menu.MenuWrapperICS implements android.view.SubMenu {
    private final androidx.core.internal.view.SupportSubMenu mSubMenu;

    SubMenuWrapperICS(android.content.Context r1, androidx.core.internal.view.SupportSubMenu r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mSubMenu = r2
            return
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.clearHeader()
            return
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            android.view.MenuItem r0 = r0.getItem()
            android.view.MenuItem r0 = r1.getMenuItemWrapper(r0)
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setHeaderIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setHeaderTitle(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setHeaderView(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.core.internal.view.SupportSubMenu r0 = r1.mSubMenu
            r0.setIcon(r2)
            return r1
    }
}
