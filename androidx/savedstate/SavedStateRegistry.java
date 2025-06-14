package androidx.savedstate;

/* loaded from: classes.dex */
public final class SavedStateRegistry {
    private static final java.lang.String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    boolean mAllowingSavingState;
    private androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> mComponents;
    private androidx.savedstate.Recreator.SavedStateProvider mRecreatorProvider;
    private boolean mRestored;
    private android.os.Bundle mRestoredState;


    public interface AutoRecreated {
        void onRecreated(androidx.savedstate.SavedStateRegistryOwner r1);
    }

    public interface SavedStateProvider {
        android.os.Bundle saveState();
    }

    SavedStateRegistry() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.mComponents = r0
            r0 = 1
            r1.mAllowingSavingState = r0
            return
    }

    public android.os.Bundle consumeRestoredStateForKey(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.mRestored
            if (r0 == 0) goto L1e
            android.os.Bundle r0 = r3.mRestoredState
            r1 = 0
            if (r0 == 0) goto L1d
            android.os.Bundle r0 = r0.getBundle(r4)
            android.os.Bundle r2 = r3.mRestoredState
            r2.remove(r4)
            android.os.Bundle r4 = r3.mRestoredState
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1c
            r3.mRestoredState = r1
        L1c:
            return r0
        L1d:
            return r1
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            r4.<init>(r0)
            throw r4
    }

    public boolean isRestored() {
            r1 = this;
            boolean r0 = r1.mRestored
            return r0
    }

    void performRestore(androidx.lifecycle.Lifecycle r2, android.os.Bundle r3) {
            r1 = this;
            boolean r0 = r1.mRestored
            if (r0 != 0) goto L1a
            if (r3 == 0) goto Le
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r3.getBundle(r0)
            r1.mRestoredState = r3
        Le:
            androidx.savedstate.SavedStateRegistry$1 r3 = new androidx.savedstate.SavedStateRegistry$1
            r3.<init>(r1)
            r2.addObserver(r3)
            r2 = 1
            r1.mRestored = r2
            return
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "SavedStateRegistry was already restored."
            r2.<init>(r3)
            throw r2
    }

    void performSave(android.os.Bundle r5) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r4.mRestoredState
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r4.mComponents
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r2 = r2.saveState()
            r0.putBundle(r3, r2)
            goto L12
        L32:
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r1, r0)
            return
    }

    public void registerSavedStateProvider(java.lang.String r2, androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.mComponents
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            r2.<init>(r3)
            throw r2
    }

    public void runOnNextRecreation(java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> r5) {
            r4 = this;
            boolean r0 = r4.mAllowingSavingState
            if (r0 == 0) goto L3f
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.mRecreatorProvider
            if (r0 != 0) goto Lf
            androidx.savedstate.Recreator$SavedStateProvider r0 = new androidx.savedstate.Recreator$SavedStateProvider
            r0.<init>(r4)
            r4.mRecreatorProvider = r0
        Lf:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1f
            r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L1f
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.mRecreatorProvider
            java.lang.String r5 = r5.getName()
            r0.add(r5)
            return
        L1f:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class"
            r2.<init>(r3)
            java.lang.String r5 = r5.getSimpleName()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " must have default constructor in order to be automatically recreated"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r5.<init>(r0)
            throw r5
    }

    public void unregisterSavedStateProvider(java.lang.String r2) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.mComponents
            r0.remove(r2)
            return
    }
}
