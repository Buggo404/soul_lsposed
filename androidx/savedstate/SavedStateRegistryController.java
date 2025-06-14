package androidx.savedstate;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {
    private final androidx.savedstate.SavedStateRegistryOwner mOwner;
    private final androidx.savedstate.SavedStateRegistry mRegistry;

    private SavedStateRegistryController(androidx.savedstate.SavedStateRegistryOwner r1) {
            r0 = this;
            r0.<init>()
            r0.mOwner = r1
            androidx.savedstate.SavedStateRegistry r1 = new androidx.savedstate.SavedStateRegistry
            r1.<init>()
            r0.mRegistry = r1
            return
    }

    public static androidx.savedstate.SavedStateRegistryController create(androidx.savedstate.SavedStateRegistryOwner r1) {
            androidx.savedstate.SavedStateRegistryController r0 = new androidx.savedstate.SavedStateRegistryController
            r0.<init>(r1)
            return r0
    }

    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r0 = r1.mRegistry
            return r0
    }

    public void performRestore(android.os.Bundle r4) {
            r3 = this;
            androidx.savedstate.SavedStateRegistryOwner r0 = r3.mOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r1 != r2) goto L1e
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            androidx.savedstate.SavedStateRegistryOwner r2 = r3.mOwner
            r1.<init>(r2)
            r0.addObserver(r1)
            androidx.savedstate.SavedStateRegistry r1 = r3.mRegistry
            r1.performRestore(r0, r4)
            return
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Restarter must be created only during owner's initialization stage"
            r4.<init>(r0)
            throw r4
    }

    public void performSave(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r0 = r1.mRegistry
            r0.performSave(r2)
            return
    }
}
