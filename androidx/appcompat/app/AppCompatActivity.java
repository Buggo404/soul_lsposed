package androidx.appcompat.app;

/* loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements androidx.appcompat.app.AppCompatCallback, androidx.core.app.TaskStackBuilder.SupportParentable, androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider {
    private static final java.lang.String DELEGATE_TAG = "androidx:appcompat";
    private androidx.appcompat.app.AppCompatDelegate mDelegate;
    private android.content.res.Resources mResources;



    public AppCompatActivity() {
            r0 = this;
            r0.<init>()
            r0.initDelegate()
            return
    }

    public AppCompatActivity(int r1) {
            r0 = this;
            r0.<init>(r1)
            r0.initDelegate()
            return
    }

    private void initDelegate() {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            androidx.appcompat.app.AppCompatActivity$1 r1 = new androidx.appcompat.app.AppCompatActivity$1
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.registerSavedStateProvider(r2, r1)
            androidx.appcompat.app.AppCompatActivity$2 r0 = new androidx.appcompat.app.AppCompatActivity$2
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
    }

    private void initViewTreeOwners() {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
            return
    }

    private boolean performMenuItemShortcut(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L3e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L3e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L3e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L3e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L3e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L3e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L3e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L3e
            r3 = 1
            return r3
        L3e:
            r3 = 0
            return r3
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.addContentView(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            android.content.Context r2 = r0.attachBaseContext2(r2)
            super.attachBaseContext(r2)
            return
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.closeOptionsMenu()
            if (r0 != 0) goto L1a
        L17:
            super.closeOptionsMenu()
        L1a:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            androidx.appcompat.app.ActionBar r1 = r3.getSupportActionBar()
            r2 = 82
            if (r0 != r2) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.onMenuKeyEvent(r4)
            if (r0 == 0) goto L16
            r4 = 1
            return r4
        L16:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.app.Activity
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

    @Override // androidx.appcompat.app.ActionBarDrawerToggle.DelegateProvider
    public androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r0.getDrawerToggleDelegate()
            return r0
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            android.view.MenuInflater r0 = r0.getMenuInflater()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r2 = this;
            android.content.res.Resources r0 = r2.mResources
            if (r0 != 0) goto L15
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r0 == 0) goto L15
            androidx.appcompat.widget.VectorEnabledTintResources r0 = new androidx.appcompat.widget.VectorEnabledTintResources
            android.content.res.Resources r1 = super.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
        L15:
            android.content.res.Resources r0 = r2.mResources
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = super.getResources()
        L1d:
            return r0
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            return r0
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public android.content.Intent getSupportParentActivityIntent() {
            r1 = this;
            android.content.Intent r0 = androidx.core.app.NavUtils.getParentActivityIntent(r1)
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.invalidateOptionsMenu()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            android.content.res.Resources r0 = r2.mResources
            if (r0 == 0) goto L14
            android.content.res.Resources r0 = super.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.res.Resources r1 = r2.mResources
            r1.updateConfiguration(r3, r0)
        L14:
            androidx.appcompat.app.AppCompatDelegate r0 = r2.getDelegate()
            r0.onConfigurationChanged(r3)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r0 = this;
            r0.onSupportContentChanged()
            return
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.TaskStackBuilder r1) {
            r0 = this;
            r1.addParentStack(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onDestroy()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.performMenuItemShortcut(r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L8
            r2 = 1
            return r2
        L8:
            androidx.appcompat.app.ActionBar r2 = r1.getSupportActionBar()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L24
            if (r2 == 0) goto L24
            int r2 = r2.getDisplayOptions()
            r2 = r2 & 4
            if (r2 == 0) goto L24
            boolean r2 = r1.onSupportNavigateUp()
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super.onMenuOpened(r1, r2)
            return r1
    }

    protected void onNightModeChanged(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle r2) {
            r1 = this;
            super.onPostCreate(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onPostCreate(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
            r1 = this;
            super.onPostResume()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onPostResume()
            return
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.TaskStackBuilder r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onStart()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
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

    @java.lang.Deprecated
    public void onSupportContentChanged() {
            r0 = this;
            return
    }

    public boolean onSupportNavigateUp() {
            r2 = this;
            android.content.Intent r0 = r2.getSupportParentActivityIntent()
            if (r0 == 0) goto L26
            boolean r1 = r2.supportShouldUpRecreateTask(r0)
            if (r1 == 0) goto L21
            androidx.core.app.TaskStackBuilder r0 = androidx.core.app.TaskStackBuilder.create(r2)
            r2.onCreateSupportNavigateUpTaskStack(r0)
            r2.onPrepareSupportNavigateUpTaskStack(r0)
            r0.startActivities()
            androidx.core.app.ActivityCompat.finishAffinity(r2)     // Catch: java.lang.IllegalStateException -> L1d
            goto L24
        L1d:
            r2.finish()
            goto L24
        L21:
            r2.supportNavigateUpTo(r0)
        L24:
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    protected void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            androidx.appcompat.app.AppCompatDelegate r2 = r0.getDelegate()
            r2.setTitle(r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.openOptionsMenu()
            if (r0 != 0) goto L1a
        L17:
            super.openOptionsMenu()
        L1a:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int r2) {
            r1 = this;
            r1.initViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.initViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2, r3)
            return
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setSupportActionBar(r2)
            return
    }

    @java.lang.Deprecated
    public void setSupportProgress(int r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminate(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarVisibility(boolean r1) {
            r0 = this;
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            super.setTheme(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setTheme(r2)
            return
    }

    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            androidx.appcompat.view.ActionMode r2 = r0.startSupportActionMode(r2)
            return r2
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.invalidateOptionsMenu()
            return
    }

    public void supportNavigateUpTo(android.content.Intent r1) {
            r0 = this;
            androidx.core.app.NavUtils.navigateUpTo(r0, r1)
            return
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            boolean r2 = r0.requestWindowFeature(r2)
            return r2
    }

    public boolean supportShouldUpRecreateTask(android.content.Intent r1) {
            r0 = this;
            boolean r1 = androidx.core.app.NavUtils.shouldUpRecreateTask(r0, r1)
            return r1
    }
}
