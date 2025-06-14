package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenu extends androidx.appcompat.view.menu.MenuBuilder {
    public NavigationMenu(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.addInternal(r1, r2, r3, r4)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            com.google.android.material.internal.NavigationSubMenu r2 = new com.google.android.material.internal.NavigationSubMenu
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3, r0, r1)
            r1.setSubMenu(r2)
            return r2
    }
}
