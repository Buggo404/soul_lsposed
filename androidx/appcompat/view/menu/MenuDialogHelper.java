package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
class MenuDialogHelper implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.MenuPresenter.Callback {
    private androidx.appcompat.app.AlertDialog mDialog;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.ListMenuPresenter mPresenter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.<init>()
            r0.mMenu = r1
            return
    }

    public void dismiss() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.mDialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            androidx.appcompat.view.menu.ListMenuPresenter r0 = r1.mPresenter
            android.widget.ListAdapter r0 = r0.getAdapter()
            java.lang.Object r3 = r0.getItem(r3)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            r0 = 0
            r2.performItemAction(r3, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L6
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            if (r2 != r0) goto L9
        L6:
            r1.dismiss()
        L9:
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto L10
            r0.onCloseMenu(r2, r3)
        L10:
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            androidx.appcompat.view.menu.ListMenuPresenter r3 = r2.mPresenter
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 1
            r3.onCloseMenu(r0, r1)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L7
            r0 = 4
            if (r4 != r0) goto L5b
        L7:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2c
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2c
            androidx.appcompat.app.AlertDialog r3 = r2.mDialog
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5b
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            r3.startTracking(r5, r2)
            return r1
        L2c:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5b
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5b
            androidx.appcompat.app.AlertDialog r0 = r2.mDialog
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5b
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5b
            androidx.appcompat.view.menu.MenuBuilder r4 = r2.mMenu
            r4.close(r1)
            r3.dismiss()
            return r1
        L5b:
            androidx.appcompat.view.menu.MenuBuilder r3 = r2.mMenu
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto L9
            boolean r2 = r0.onOpenSubMenu(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    public void show(android.os.IBinder r6) {
            r5 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r5.mMenu
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            androidx.appcompat.view.menu.ListMenuPresenter r2 = new androidx.appcompat.view.menu.ListMenuPresenter
            android.content.Context r3 = r1.getContext()
            int r4 = androidx.appcompat.C0015R.layout.abc_list_menu_item_layout
            r2.<init>(r3, r4)
            r5.mPresenter = r2
            r2.setCallback(r5)
            androidx.appcompat.view.menu.MenuBuilder r2 = r5.mMenu
            androidx.appcompat.view.menu.ListMenuPresenter r3 = r5.mPresenter
            r2.addMenuPresenter(r3)
            androidx.appcompat.view.menu.ListMenuPresenter r2 = r5.mPresenter
            android.widget.ListAdapter r2 = r2.getAdapter()
            r1.setAdapter(r2, r5)
            android.view.View r2 = r0.getHeaderView()
            if (r2 == 0) goto L35
            r1.setCustomTitle(r2)
            goto L44
        L35:
            android.graphics.drawable.Drawable r2 = r0.getHeaderIcon()
            androidx.appcompat.app.AlertDialog$Builder r2 = r1.setIcon(r2)
            java.lang.CharSequence r0 = r0.getHeaderTitle()
            r2.setTitle(r0)
        L44:
            r1.setOnKeyListener(r5)
            androidx.appcompat.app.AlertDialog r0 = r1.create()
            r5.mDialog = r0
            r0.setOnDismissListener(r5)
            androidx.appcompat.app.AlertDialog r0 = r5.mDialog
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.type = r1
            if (r6 == 0) goto L62
            r0.token = r6
        L62:
            int r6 = r0.flags
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r1
            r0.flags = r6
            androidx.appcompat.app.AlertDialog r6 = r5.mDialog
            r6.show()
            return
    }
}
