package retrofit2;

/* loaded from: classes.dex */
class Platform {
    private static final retrofit2.Platform PLATFORM = null;
    private final boolean hasJava8Types;

    @javax.annotation.Nullable
    private final java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> lookupConstructor;

    static final class Android extends retrofit2.Platform {

        static final class MainThreadExecutor implements java.util.concurrent.Executor {
            private final android.os.Handler handler;

            MainThreadExecutor() {
                    r2 = this;
                    r2.<init>()
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    r2.handler = r0
                    return
            }

            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable r2) {
                    r1 = this;
                    android.os.Handler r0 = r1.handler
                    r0.post(r2)
                    return
            }
        }

        Android() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // retrofit2.Platform
        public java.util.concurrent.Executor defaultCallbackExecutor() {
                r1 = this;
                retrofit2.Platform$Android$MainThreadExecutor r0 = new retrofit2.Platform$Android$MainThreadExecutor
                r0.<init>()
                return r0
        }

        @Override // retrofit2.Platform
        @javax.annotation.Nullable
        java.lang.Object invokeDefaultMethod(java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Object r5, java.lang.Object... r6) throws java.lang.Throwable {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto Lb
                java.lang.Object r3 = super.invokeDefaultMethod(r3, r4, r5, r6)
                return r3
            Lb:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r4 = "Calling default methods on API 24 and 25 is not supported"
                r3.<init>(r4)
                throw r3
        }
    }

    static {
            retrofit2.Platform r0 = findPlatform()
            retrofit2.Platform.PLATFORM = r0
            return
    }

    Platform(boolean r5) {
            r4 = this;
            r4.<init>()
            r4.hasJava8Types = r5
            r0 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<java.lang.invoke.MethodHandles$Lookup> r5 = java.lang.invoke.MethodHandles.Lookup.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1e
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Constructor r0 = r5.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1e
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L1e
        L1e:
            r4.lookupConstructor = r0
            return
    }

    private static retrofit2.Platform findPlatform() {
            java.lang.String r0 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            retrofit2.Platform$Android r0 = new retrofit2.Platform$Android
            r0.<init>()
            goto L1a
        L14:
            retrofit2.Platform r0 = new retrofit2.Platform
            r1 = 1
            r0.<init>(r1)
        L1a:
            return r0
    }

    static retrofit2.Platform get() {
            retrofit2.Platform r0 = retrofit2.Platform.PLATFORM
            return r0
    }

    java.util.List<? extends retrofit2.CallAdapter.Factory> defaultCallAdapterFactories(@javax.annotation.Nullable java.util.concurrent.Executor r4) {
            r3 = this;
            retrofit2.DefaultCallAdapterFactory r0 = new retrofit2.DefaultCallAdapterFactory
            r0.<init>(r4)
            boolean r4 = r3.hasJava8Types
            if (r4 == 0) goto L19
            r4 = 2
            retrofit2.CallAdapter$Factory[] r4 = new retrofit2.CallAdapter.Factory[r4]
            r1 = 0
            retrofit2.CallAdapter$Factory r2 = retrofit2.CompletableFutureCallAdapterFactory.INSTANCE
            r4[r1] = r2
            r1 = 1
            r4[r1] = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            goto L1d
        L19:
            java.util.List r4 = java.util.Collections.singletonList(r0)
        L1d:
            return r4
    }

    int defaultCallAdapterFactoriesSize() {
            r1 = this;
            boolean r0 = r1.hasJava8Types
            if (r0 == 0) goto L6
            r0 = 2
            goto L7
        L6:
            r0 = 1
        L7:
            return r0
    }

    @javax.annotation.Nullable
    java.util.concurrent.Executor defaultCallbackExecutor() {
            r1 = this;
            r0 = 0
            return r0
    }

    java.util.List<? extends retrofit2.Converter.Factory> defaultConverterFactories() {
            r1 = this;
            boolean r0 = r1.hasJava8Types
            if (r0 == 0) goto Lb
            retrofit2.Converter$Factory r0 = retrofit2.OptionalConverterFactory.INSTANCE
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto Lf
        Lb:
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            return r0
    }

    int defaultConverterFactoriesSize() {
            r1 = this;
            boolean r0 = r1.hasJava8Types
            return r0
    }

    @javax.annotation.Nullable
    java.lang.Object invokeDefaultMethod(java.lang.reflect.Method r5, java.lang.Class<?> r6, java.lang.Object r7, java.lang.Object... r8) throws java.lang.Throwable {
            r4 = this;
            java.lang.reflect.Constructor<java.lang.invoke.MethodHandles$Lookup> r0 = r4.lookupConstructor
            if (r0 == 0) goto L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.Object r0 = r0.newInstance(r1)
            java.lang.invoke.MethodHandles$Lookup r0 = (java.lang.invoke.MethodHandles.Lookup) r0
            goto L1d
        L19:
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()
        L1d:
            java.lang.invoke.MethodHandle r5 = r0.unreflectSpecial(r5, r6)
            java.lang.invoke.MethodHandle r5 = r5.bindTo(r7)
            java.lang.Object r5 = r5.invokeWithArguments(r8)
            return r5
    }

    boolean isDefaultMethod(java.lang.reflect.Method r2) {
            r1 = this;
            boolean r0 = r1.hasJava8Types
            if (r0 == 0) goto Lc
            boolean r2 = r2.isDefault()
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }
}
