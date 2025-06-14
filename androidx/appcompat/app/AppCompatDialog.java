package androidx.appcompat.app;

/* loaded from: classes.dex */
public class AppCompatDialog extends android.app.Dialog implements androidx.appcompat.app.AppCompatCallback {
    private androidx.appcompat.app.AppCompatDelegate mDelegate;
    private final androidx.core.view.KeyEventDispatcher.Component mKeyDispatcher;


    public AppCompatDialog(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatDialog(android.content.Context r2, int r3) {
            r1 = this;
            int r0 = getThemeResId(r2, r3)
            r1.<init>(r2, r0)
            androidx.appcompat.app.AppCompatDialog$1 r0 = new androidx.appcompat.app.AppCompatDialog$1
            r0.<init>(r1)
            r1.mKeyDispatcher = r0
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            int r2 = getThemeResId(r2, r3)
            r0.setTheme(r2)
            r2 = 0
            r0.onCreate(r2)
            return
    }

    protected AppCompatDialog(android.content.Context r1, boolean r2, android.content.DialogInterface.OnCancelListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            androidx.appcompat.app.AppCompatDialog$1 r1 = new androidx.appcompat.app.AppCompatDialog$1
            r1.<init>(r0)
            r0.mKeyDispatcher = r1
            return
    }

    private static int getThemeResId(android.content.Context r2, int r3) {
            if (r3 != 0) goto L13
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = androidx.appcompat.C0015R.attr.dialogTheme
            r1 = 1
            r2.resolveAttribute(r0, r3, r1)
            int r3 = r3.resourceId
        L13:
            return r3
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.addContentView(r2, r3)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onDestroy()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.core.view.KeyEventDispatcher$Component r1 = r2.mKeyDispatcher
            boolean r3 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r1, r0, r2, r3)
            return r3
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.mDelegate
            if (r0 != 0) goto La
            androidx.appcompat.app.AppCompatDelegate r0 = androidx.appcompat.app.AppCompatDelegate.create(r1, r1)
            r1.mDelegate = r0
        La:
            androidx.appcompat.app.AppCompatDelegate r0 = r1.mDelegate
            return r0
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            return r0
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.installViewFactory()
            super.onCreate(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onCreate(r2)
            return
    }

    @Override // android.app.Dialog
    protected void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onStop()
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(androidx.appcompat.view.ActionMode r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(androidx.appcompat.view.ActionMode r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            androidx.appcompat.app.AppCompatDelegate r0 = r2.getDelegate()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.setTitle(r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setTitle(r2)
            return
    }

    boolean superDispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            boolean r2 = r0.requestWindowFeature(r2)
            return r2
    }
}
