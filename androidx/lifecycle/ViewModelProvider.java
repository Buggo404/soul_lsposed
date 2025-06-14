package androidx.lifecycle;

/* loaded from: classes.dex */
public class ViewModelProvider {
    private static final java.lang.String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
    private final androidx.lifecycle.ViewModelProvider.Factory mFactory;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;
        private android.app.Application mApplication;

        public AndroidViewModelFactory(android.app.Application r1) {
                r0 = this;
                r0.<init>()
                r0.mApplication = r1
                return
        }

        public static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application r1) {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance
                if (r0 != 0) goto Lb
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance = r0
            Lb:
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance
                return r1
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r6) {
                r5 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
                boolean r1 = r1.isAssignableFrom(r6)
                if (r1 == 0) goto L73
                r1 = 1
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                java.lang.Class<android.app.Application> r3 = android.app.Application.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                java.lang.reflect.Constructor r2 = r6.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                android.app.Application r3 = r5.mApplication     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                r1[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L4b java.lang.NoSuchMethodException -> L5f
                return r1
            L23:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r6 = r3.append(r6)
                java.lang.String r6 = r6.toString()
                r2.<init>(r6, r1)
                throw r2
            L37:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r6 = r3.append(r6)
                java.lang.String r6 = r6.toString()
                r2.<init>(r6, r1)
                throw r2
            L4b:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r6 = r3.append(r6)
                java.lang.String r6 = r6.toString()
                r2.<init>(r6, r1)
                throw r2
            L5f:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r6 = r3.append(r6)
                java.lang.String r6 = r6.toString()
                r2.<init>(r6, r1)
                throw r2
            L73:
                androidx.lifecycle.ViewModel r6 = super.create(r6)
                return r6
        }
    }

    public interface Factory {
        <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r1);
    }

    static abstract class KeyedFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        KeyedFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "create(String, Class<?>) must be called on implementaions of KeyedFactory"
                r2.<init>(r0)
                throw r2
        }

        public abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r1, java.lang.Class<T> r2);
    }

    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        public NewInstanceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance
                if (r0 != 0) goto Lb
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory
                r0.<init>()
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance = r0
            Lb:
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance
                return r0
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r5) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Object r1 = r5.newInstance()     // Catch: java.lang.IllegalAccessException -> L9 java.lang.InstantiationException -> L1d
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.IllegalAccessException -> L9 java.lang.InstantiationException -> L1d
                return r1
            L9:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r5 = r3.append(r5)
                java.lang.String r5 = r5.toString()
                r2.<init>(r5, r1)
                throw r2
            L1d:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r0)
                java.lang.StringBuilder r5 = r3.append(r5)
                java.lang.String r5 = r5.toString()
                r2.<init>(r5, r1)
                throw r2
        }
    }

    static class OnRequeryFactory {
        OnRequeryFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        void onRequery(androidx.lifecycle.ViewModel r1) {
                r0 = this;
                return
        }
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore r1, androidx.lifecycle.ViewModelProvider.Factory r2) {
            r0 = this;
            r0.<init>()
            r0.mFactory = r2
            r0.mViewModelStore = r1
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r3) {
            r2 = this;
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto Lf
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            androidx.lifecycle.ViewModelProvider$Factory r3 = r3.getDefaultViewModelProviderFactory()
            goto L13
        Lf:
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory r3 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getInstance()
        L13:
            r2.<init>(r0, r3)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r1, androidx.lifecycle.ViewModelProvider.Factory r2) {
            r0 = this;
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r1, r2)
            return
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            androidx.lifecycle.ViewModel r4 = r3.get(r0, r4)
            return r4
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r4.<init>(r0)
            throw r4
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.String r3, java.lang.Class<T> r4) {
            r2 = this;
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            androidx.lifecycle.ViewModel r0 = r0.get(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L18
            androidx.lifecycle.ViewModelProvider$Factory r3 = r2.mFactory
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory
            if (r4 == 0) goto L17
            androidx.lifecycle.ViewModelProvider$OnRequeryFactory r3 = (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) r3
            r3.onRequery(r0)
        L17:
            return r0
        L18:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r2.mFactory
            boolean r1 = r0 instanceof androidx.lifecycle.ViewModelProvider.KeyedFactory
            if (r1 == 0) goto L25
            androidx.lifecycle.ViewModelProvider$KeyedFactory r0 = (androidx.lifecycle.ViewModelProvider.KeyedFactory) r0
            androidx.lifecycle.ViewModel r4 = r0.create(r3, r4)
            goto L29
        L25:
            androidx.lifecycle.ViewModel r4 = r0.create(r4)
        L29:
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            r0.put(r3, r4)
            return r4
    }
}
