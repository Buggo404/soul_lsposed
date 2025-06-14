package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationSubMenu extends androidx.appcompat.view.menu.SubMenuBuilder {
    public NavigationSubMenu(android.content.Context r1, com.google.android.material.internal.NavigationMenu r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void onItemsChanged(boolean r2) {
            r1 = this;
            super.onItemsChanged(r2)
            android.view.Menu r0 = r1.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r0.onItemsChanged(r2)
            return
    }
}
