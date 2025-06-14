package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public final class BottomNavigationMenu extends androidx.appcompat.view.menu.MenuBuilder {
    public static final int MAX_ITEM_COUNT = 5;

    public BottomNavigationMenu(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    protected android.view.MenuItem addInternal(int r4, int r5, int r6, java.lang.CharSequence r7) {
            r3 = this;
            int r0 = r3.size()
            r1 = 1
            int r0 = r0 + r1
            r2 = 5
            if (r0 > r2) goto L1e
            r3.stopDispatchingItemsChanged()
            android.view.MenuItem r4 = super.addInternal(r4, r5, r6, r7)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.MenuItemImpl
            if (r5 == 0) goto L1a
            r5 = r4
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            r5.setExclusiveCheckable(r1)
        L1a:
            r3.startDispatchingItemsChanged()
            return r4
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()"
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BottomNavigationView does not support submenus"
            r1.<init>(r2)
            throw r1
    }
}
