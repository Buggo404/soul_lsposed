package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class MenuWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.Menu {
    private final androidx.core.internal.view.SupportMenu mWrappedObject;

    public MenuWrapperICS(android.content.Context r1, androidx.core.internal.view.SupportMenu r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.mWrappedObject = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r13, int r14, int r15, android.content.ComponentName r16, android.content.Intent[] r17, android.content.Intent r18, int r19, android.view.MenuItem[] r20) {
            r12 = this;
            r0 = r12
            r1 = r20
            if (r1 == 0) goto L9
            int r2 = r1.length
            android.view.MenuItem[] r2 = new android.view.MenuItem[r2]
            goto La
        L9:
            r2 = 0
        La:
            androidx.core.internal.view.SupportMenu r3 = r0.mWrappedObject
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r2
            int r3 = r3.addIntentOptions(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L2d
            int r4 = r2.length
            r5 = 0
        L20:
            if (r5 >= r4) goto L2d
            r6 = r2[r5]
            android.view.MenuItem r6 = r12.getMenuItemWrapper(r6)
            r1[r5] = r6
            int r5 = r5 + 1
            goto L20
        L2d:
            return r3
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2, r3, r4, r5)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.SubMenu r2 = r0.addSubMenu(r2)
            android.view.SubMenu r2 = r1.getSubMenuWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            r1.internalClear()
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.clear()
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.close()
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r2 = r1.getMenuItemWrapper(r2)
            return r2
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.isShortcutKey(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.performIdentifierAction(r2, r3)
            return r2
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, android.view.KeyEvent r3, int r4) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            boolean r2 = r0.performShortcut(r2, r3, r4)
            return r2
    }

    @Override // android.view.Menu
    public void removeGroup(int r2) {
            r1 = this;
            r1.internalRemoveGroup(r2)
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.removeGroup(r2)
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            r1.internalRemoveItem(r2)
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.removeItem(r2)
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean r3, boolean r4) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupCheckable(r2, r3, r4)
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupEnabled(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setGroupVisible(r2, r3)
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            r0.setQwertyMode(r2)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            androidx.core.internal.view.SupportMenu r0 = r1.mWrappedObject
            int r0 = r0.size()
            return r0
    }
}
