package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ToolbarUtils {
    private ToolbarUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.appcompat.view.menu.ActionMenuItemView getActionMenuItemView(androidx.appcompat.widget.Toolbar r3, int r4) {
            androidx.appcompat.widget.ActionMenuView r3 = getActionMenuView(r3)
            if (r3 == 0) goto L25
            r0 = 0
        L7:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r2 == 0) goto L22
            androidx.appcompat.view.menu.ActionMenuItemView r1 = (androidx.appcompat.view.menu.ActionMenuItemView) r1
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.getItemData()
            int r2 = r2.getItemId()
            if (r2 != r4) goto L22
            return r1
        L22:
            int r0 = r0 + 1
            goto L7
        L25:
            r3 = 0
            return r3
    }

    public static androidx.appcompat.widget.ActionMenuView getActionMenuView(androidx.appcompat.widget.Toolbar r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L12
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r3 = 0
            return r3
    }

    public static android.widget.ImageButton getNavigationIconButton(androidx.appcompat.widget.Toolbar r1) {
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L12
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            boolean r0 = r1 instanceof android.widget.ImageButton
            if (r0 == 0) goto L12
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static android.view.View getSecondaryActionMenuItemView(androidx.appcompat.widget.Toolbar r2) {
            androidx.appcompat.widget.ActionMenuView r2 = getActionMenuView(r2)
            if (r2 == 0) goto L13
            int r0 = r2.getChildCount()
            r1 = 1
            if (r0 <= r1) goto L13
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            return r2
        L13:
            r2 = 0
            return r2
    }
}
