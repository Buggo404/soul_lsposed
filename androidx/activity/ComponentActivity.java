package androidx.activity;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.ContextAware, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.activity.result.ActivityResultCaller {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final androidx.activity.contextaware.ContextAwareHelper mContextAwareHelper;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;








    static final class NonConfigurationInstances {
        java.lang.Object custom;
        androidx.lifecycle.ViewModelStore viewModelStore;

        NonConfigurationInstances() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r3 = this;
            r3.<init>()
            androidx.activity.contextaware.ContextAwareHelper r0 = new androidx.activity.contextaware.ContextAwareHelper
            r0.<init>()
            r3.mContextAwareHelper = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r3)
            r3.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r3)
            r3.mSavedStateRegistryController = r0
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$1 r1 = new androidx.activity.ComponentActivity$1
            r1.<init>(r3)
            r0.<init>(r1)
            r3.mOnBackPressedDispatcher = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r3.mNextLocalRequestCode = r0
            androidx.activity.ComponentActivity$2 r0 = new androidx.activity.ComponentActivity$2
            r0.<init>(r3)
            r3.mActivityResultRegistry = r0
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            if (r0 == 0) goto L72
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$3 r1 = new androidx.activity.ComponentActivity$3
            r1.<init>(r3)
            r0.addObserver(r1)
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$4 r1 = new androidx.activity.ComponentActivity$4
            r1.<init>(r3)
            r0.addObserver(r1)
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.activity.ComponentActivity$5 r1 = new androidx.activity.ComponentActivity$5
            r1.<init>(r3)
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            androidx.activity.ComponentActivity$6 r1 = new androidx.activity.ComponentActivity$6
            r1.<init>(r3)
            java.lang.String r2 = "android:support:activity-result"
            r0.registerSavedStateProvider(r2, r1)
            androidx.activity.ComponentActivity$7 r0 = new androidx.activity.ComponentActivity$7
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            r0.<init>(r1)
            throw r0
    }

    public ComponentActivity(int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    static /* synthetic */ void access$001(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    static /* synthetic */ androidx.activity.result.ActivityResultRegistry access$100(androidx.activity.ComponentActivity r0) {
            androidx.activity.result.ActivityResultRegistry r0 = r0.mActivityResultRegistry
            return r0
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

    @Override // android.app.Activity
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.initViewTreeOwners()
            super.addContentView(r1, r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.addOnContextAvailableListener(r2)
            return
    }

    void ensureViewModelStore() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModelStore r0 = r0.viewModelStore
            r1.mViewModelStore = r0
        L10:
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            r1.mViewModelStore = r0
        L1b:
            return
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            android.app.Application r0 = r3.getApplication()
            if (r0 == 0) goto L28
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L25
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.app.Application r1 = r3.getApplication()
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L1f
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L20
        L1f:
            r2 = 0
        L20:
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L25:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r1 = this;
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.custom
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.ensureViewModelStore()
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            boolean r0 = r0.dispatchResult(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.dispatchOnContextAvailable(r1)
            super.onCreate(r2)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r1)
            int r2 = r1.mContentLayoutId
            if (r2 == 0) goto L17
            r1.setContentView(r2)
        L17:
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r3.mActivityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.dispatchResult(r4, r2, r1)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            androidx.lifecycle.ViewModelStore r1 = r3.mViewModelStore
            if (r1 != 0) goto L12
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r2
            if (r2 == 0) goto L12
            androidx.lifecycle.ViewModelStore r1 = r2.viewModelStore
        L12:
            if (r1 != 0) goto L18
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = new androidx.activity.ComponentActivity$NonConfigurationInstances
            r2.<init>()
            r2.custom = r0
            r2.viewModelStore = r1
            return r2
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r1 == 0) goto Lf
            androidx.lifecycle.LifecycleRegistry r0 = (androidx.lifecycle.LifecycleRegistry) r0
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
        Lf:
            super.onSaveInstanceState(r3)
            androidx.savedstate.SavedStateRegistryController r0 = r2.mSavedStateRegistryController
            r0.performSave(r3)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public android.content.Context peekAvailableContext() {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            android.content.Context r0 = r0.peekAvailableContext()
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            androidx.activity.result.ActivityResultLauncher r2 = r1.registerForActivityResult(r2, r0, r3)
            return r2
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r3, androidx.activity.result.ActivityResultRegistry r4, androidx.activity.result.ActivityResultCallback<O> r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "activity_rq#"
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.ActivityResultLauncher r3 = r4.register(r0, r2, r3, r5)
            return r3
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.removeOnContextAvailableListener(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r2 = this;
            java.lang.String r0 = "reportFullyDrawn() for "
            boolean r1 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            android.content.ComponentName r0 = r2.getComponentName()     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L23
        L1c:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L23
            androidx.tracing.Trace.endSection()
            return
        L23:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
