package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
abstract class BaseMenuWrapper {
    final android.content.Context mContext;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> mMenuItems;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> mSubMenus;

    BaseMenuWrapper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    final android.view.MenuItem getMenuItemWrapper(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto L28
            r0 = r3
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r2.mMenuItems = r1
        L12:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            java.lang.Object r3 = r1.get(r3)
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            if (r3 != 0) goto L28
            androidx.appcompat.view.menu.MenuItemWrapperICS r3 = new androidx.appcompat.view.menu.MenuItemWrapperICS
            android.content.Context r1 = r2.mContext
            r3.<init>(r1, r0)
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            r1.put(r0, r3)
        L28:
            return r3
    }

    final android.view.SubMenu getSubMenuWrapper(android.view.SubMenu r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.core.internal.view.SupportSubMenu
            if (r0 == 0) goto L28
            androidx.core.internal.view.SupportSubMenu r3 = (androidx.core.internal.view.SupportSubMenu) r3
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r0 = r2.mSubMenus
            if (r0 != 0) goto L11
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r2.mSubMenus = r0
        L11:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r0 = r2.mSubMenus
            java.lang.Object r0 = r0.get(r3)
            android.view.SubMenu r0 = (android.view.SubMenu) r0
            if (r0 != 0) goto L27
            androidx.appcompat.view.menu.SubMenuWrapperICS r0 = new androidx.appcompat.view.menu.SubMenuWrapperICS
            android.content.Context r1 = r2.mContext
            r0.<init>(r1, r3)
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r1 = r2.mSubMenus
            r1.put(r3, r0)
        L27:
            return r0
        L28:
            return r3
    }

    final void internalClear() {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r1.mMenuItems
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r0 = r1.mSubMenus
            if (r0 == 0) goto Le
            r0.clear()
        Le:
            return
    }

    final void internalRemoveGroup(int r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r2.mMenuItems
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            java.lang.Object r1 = r1.keyAt(r0)
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L23
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            r1.removeAt(r0)
            int r0 = r0 + (-1)
        L23:
            int r0 = r0 + 1
            goto L6
        L26:
            return
    }

    final void internalRemoveItem(int r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r2.mMenuItems
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            java.lang.Object r1 = r1.keyAt(r0)
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getItemId()
            if (r1 != r3) goto L22
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r3 = r2.mMenuItems
            r3.removeAt(r0)
            goto L25
        L22:
            int r0 = r0 + 1
            goto L6
        L25:
            return
    }
}
