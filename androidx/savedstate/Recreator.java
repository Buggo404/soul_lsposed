package androidx.savedstate;

/* loaded from: classes.dex */
final class Recreator implements androidx.lifecycle.GenericLifecycleObserver {
    static final java.lang.String CLASSES_KEY = "classes_to_restore";
    static final java.lang.String COMPONENT_KEY = "androidx.savedstate.Restarter";
    private final androidx.savedstate.SavedStateRegistryOwner mOwner;

    static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        final java.util.Set<java.lang.String> mClasses;

        SavedStateProvider(androidx.savedstate.SavedStateRegistry r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mClasses = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r2.registerSavedStateProvider(r0, r1)
                return
        }

        void add(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.mClasses
                r0.add(r2)
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public android.os.Bundle saveState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.mClasses
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    Recreator(androidx.savedstate.SavedStateRegistryOwner r1) {
            r0 = this;
            r0.<init>()
            r0.mOwner = r1
            return
    }

    private void reflectiveNew(java.lang.String r5) {
            r4 = this;
            java.lang.Class<androidx.savedstate.Recreator> r0 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5f
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r5, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L5f
            java.lang.Class<androidx.savedstate.SavedStateRegistry$AutoRecreated> r2 = androidx.savedstate.SavedStateRegistry.AutoRecreated.class
            java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L5f
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L3f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L3f
            r2 = 1
            r0.setAccessible(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L29
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L29
            androidx.savedstate.SavedStateRegistry$AutoRecreated r0 = (androidx.savedstate.SavedStateRegistry.AutoRecreated) r0     // Catch: java.lang.Exception -> L29
            androidx.savedstate.SavedStateRegistryOwner r5 = r4.mOwner
            r0.onRecreated(r5)
            return
        L29:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
        L3f:
            r5 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class"
            r2.<init>(r3)
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " must have default constructor in order to be automatically recreated"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0, r5)
            throw r1
        L5f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " wasn't found"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L3f
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r2.removeObserver(r1)
            androidx.savedstate.SavedStateRegistryOwner r2 = r1.mOwner
            androidx.savedstate.SavedStateRegistry r2 = r2.getSavedStateRegistry()
            java.lang.String r3 = "androidx.savedstate.Restarter"
            android.os.Bundle r2 = r2.consumeRestoredStateForKey(r3)
            if (r2 != 0) goto L1a
            return
        L1a:
            java.lang.String r3 = "classes_to_restore"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L37
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.reflectiveNew(r3)
            goto L26
        L36:
            return
        L37:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r2.<init>(r3)
            throw r2
        L3f:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }
}
