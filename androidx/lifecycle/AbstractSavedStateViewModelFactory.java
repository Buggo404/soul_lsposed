package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.KeyedFactory {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final android.os.Bundle mDefaultArgs;
    private final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    public AbstractSavedStateViewModelFactory(androidx.savedstate.SavedStateRegistryOwner r2, android.os.Bundle r3) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            r1.mSavedStateRegistry = r0
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.mLifecycle = r2
            r1.mDefaultArgs = r3
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto Lb
            androidx.lifecycle.ViewModel r2 = r1.create(r0, r2)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r1 = r3.mLifecycle
            android.os.Bundle r2 = r3.mDefaultArgs
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.SavedStateHandleController.create(r0, r1, r4, r2)
            androidx.lifecycle.SavedStateHandle r1 = r0.getHandle()
            androidx.lifecycle.ViewModel r4 = r3.create(r4, r5, r1)
            java.lang.String r5 = "androidx.lifecycle.savedstate.vm.tag"
            r4.setTagIfAbsent(r5, r0)
            return r4
    }

    protected abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r1, java.lang.Class<T> r2, androidx.lifecycle.SavedStateHandle r3);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r0 = r2.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r1 = r2.mLifecycle
            androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
            return
    }
}
