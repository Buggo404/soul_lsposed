package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment r2, androidx.lifecycle.ViewModelStore r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLifecycleRegistry = r0
            r1.mSavedStateRegistryController = r0
            r1.mFragment = r2
            r1.mViewModelStore = r3
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.mDefaultFactory
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L13
            r3.mDefaultFactory = r0
            return r0
        L13:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L41
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L21:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L33
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L2c
            android.app.Application r0 = (android.app.Application) r0
            goto L34
        L2c:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L21
        L33:
            r0 = 0
        L34:
            androidx.lifecycle.SavedStateViewModelFactory r1 = new androidx.lifecycle.SavedStateViewModelFactory
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.os.Bundle r2 = r2.getArguments()
            r1.<init>(r0, r3, r2)
            r3.mDefaultFactory = r1
        L41:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            r1.initialize()
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            return r0
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.handleLifecycleEvent(r2)
            return
    }

    void initialize() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 != 0) goto L11
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
        L11:
            return
    }

    boolean isInitialized() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void performRestore(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            return
    }

    void performSave(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r2)
            return
    }
}
