package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.KeyedFactory {
    private static final java.lang.Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = null;
    private static final java.lang.Class<?>[] VIEWMODEL_SIGNATURE = null;
    private final android.app.Application mApplication;
    private final android.os.Bundle mDefaultArgs;
    private final androidx.lifecycle.ViewModelProvider.Factory mFactory;
    private final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r1 = androidx.lifecycle.SavedStateHandle.class
            r3 = 1
            r0[r3] = r1
            androidx.lifecycle.SavedStateViewModelFactory.ANDROID_VIEWMODEL_SIGNATURE = r0
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r1 = androidx.lifecycle.SavedStateHandle.class
            r0[r2] = r1
            androidx.lifecycle.SavedStateViewModelFactory.VIEWMODEL_SIGNATURE = r0
            return
    }

    public SavedStateViewModelFactory(android.app.Application r2, androidx.savedstate.SavedStateRegistryOwner r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SavedStateViewModelFactory(android.app.Application r2, androidx.savedstate.SavedStateRegistryOwner r3, android.os.Bundle r4) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            r1.mSavedStateRegistry = r0
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r1.mLifecycle = r3
            r1.mDefaultArgs = r4
            r1.mApplication = r2
            if (r2 == 0) goto L1a
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getInstance(r2)
            goto L1e
        L1a:
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory r2 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getInstance()
        L1e:
            r1.mFactory = r2
            return
    }

    private static <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> r4, java.lang.Class<?>[] r5) {
            java.lang.reflect.Constructor[] r4 = r4.getConstructors()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L18
            r2 = r4[r1]
            java.lang.Class[] r3 = r2.getParameterTypes()
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L15
            return r2
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            r4 = 0
            return r4
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2) {
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
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r6, java.lang.Class<T> r7) {
            r5 = this;
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r0 = androidx.lifecycle.AndroidViewModel.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 == 0) goto L13
            android.app.Application r1 = r5.mApplication
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = androidx.lifecycle.SavedStateViewModelFactory.ANDROID_VIEWMODEL_SIGNATURE
            java.lang.reflect.Constructor r1 = findMatchingConstructor(r7, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = androidx.lifecycle.SavedStateViewModelFactory.VIEWMODEL_SIGNATURE
            java.lang.reflect.Constructor r1 = findMatchingConstructor(r7, r1)
        L19:
            if (r1 != 0) goto L22
            androidx.lifecycle.ViewModelProvider$Factory r6 = r5.mFactory
            androidx.lifecycle.ViewModel r6 = r6.create(r7)
            return r6
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r5.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r3 = r5.mLifecycle
            android.os.Bundle r4 = r5.mDefaultArgs
            androidx.lifecycle.SavedStateHandleController r6 = androidx.lifecycle.SavedStateHandleController.create(r2, r3, r6, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L46
            android.app.Application r0 = r5.mApplication     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            if (r0 == 0) goto L46
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            r4[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            androidx.lifecycle.SavedStateHandle r0 = r6.getHandle()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            r4[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            java.lang.Object r0 = r1.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            goto L54
        L46:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            androidx.lifecycle.SavedStateHandle r3 = r6.getHandle()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            r0[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
        L54:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.setTagIfAbsent(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.InstantiationException -> L74 java.lang.IllegalAccessException -> L90
            return r0
        L5a:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An exception happened in constructor of "
            r1.<init>(r2)
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Throwable r6 = r6.getCause()
            r0.<init>(r7, r6)
            throw r0
        L74:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A "
            r1.<init>(r2)
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r1 = " cannot be instantiated."
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7, r6)
            throw r0
        L90:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to access "
            r1.<init>(r2)
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7, r6)
            throw r0
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            androidx.savedstate.SavedStateRegistry r0 = r2.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r1 = r2.mLifecycle
            androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
            return
    }
}
