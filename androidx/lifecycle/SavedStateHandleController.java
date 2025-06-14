package androidx.lifecycle;

/* loaded from: classes.dex */
final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final androidx.lifecycle.SavedStateHandle mHandle;
    private boolean mIsAttached;
    private final java.lang.String mKey;


    static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner r6) {
                r5 = this;
                boolean r0 = r6 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L3f
                r0 = r6
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L17:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r3 = r0.get(r3)
                androidx.lifecycle.Lifecycle r4 = r6.getLifecycle()
                androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(r3, r1, r4)
                goto L17
            L2f:
                java.util.Set r6 = r0.keys()
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L3e
                java.lang.Class<androidx.lifecycle.SavedStateHandleController$OnRecreation> r6 = androidx.lifecycle.SavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r6)
            L3e:
                return
            L3f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner"
                r6.<init>(r0)
                throw r6
        }
    }

    SavedStateHandleController(java.lang.String r2, androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsAttached = r0
            r1.mKey = r2
            r1.mHandle = r3
            return
    }

    static void attachHandleIfNeeded(androidx.lifecycle.ViewModel r1, androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r1 = r1.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L16
            boolean r0 = r1.isAttached()
            if (r0 != 0) goto L16
            r1.attachToLifecycle(r2, r3)
            tryToAddRecreator(r2, r3)
        L16:
            return
    }

    static androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.Lifecycle r2, java.lang.String r3, android.os.Bundle r4) {
            android.os.Bundle r0 = r1.consumeRestoredStateForKey(r3)
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandle.createHandle(r0, r4)
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r3, r4)
            r0.attachToLifecycle(r1, r2)
            tryToAddRecreator(r1, r2)
            return r0
    }

    private static void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L11
            goto L1a
        L11:
            androidx.lifecycle.SavedStateHandleController$1 r0 = new androidx.lifecycle.SavedStateHandleController$1
            r0.<init>(r3, r2)
            r3.addObserver(r0)
            goto L1f
        L1a:
            java.lang.Class<androidx.lifecycle.SavedStateHandleController$OnRecreation> r3 = androidx.lifecycle.SavedStateHandleController.OnRecreation.class
            r2.runOnNextRecreation(r3)
        L1f:
            return
    }

    void attachToLifecycle(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            r1 = this;
            boolean r0 = r1.mIsAttached
            if (r0 != 0) goto L16
            r0 = 1
            r1.mIsAttached = r0
            r3.addObserver(r1)
            java.lang.String r3 = r1.mKey
            androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r0.savedStateProvider()
            r2.registerSavedStateProvider(r3, r0)
            return
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached to lifecycleOwner"
            r2.<init>(r3)
            throw r2
    }

    androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.mHandle
            return r0
    }

    boolean isAttached() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.mIsAttached = r3
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
        Le:
            return
    }
}
