package retrofit2;

/* loaded from: classes.dex */
public final class Retrofit {
    final okhttp3.HttpUrl baseUrl;
    final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories;
    final okhttp3.Call.Factory callFactory;

    @javax.annotation.Nullable
    final java.util.concurrent.Executor callbackExecutor;
    final java.util.List<retrofit2.Converter.Factory> converterFactories;
    private final java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> serviceMethodCache;
    final boolean validateEagerly;


    public static final class Builder {

        @javax.annotation.Nullable
        private okhttp3.HttpUrl baseUrl;
        private final java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories;

        @javax.annotation.Nullable
        private okhttp3.Call.Factory callFactory;

        @javax.annotation.Nullable
        private java.util.concurrent.Executor callbackExecutor;
        private final java.util.List<retrofit2.Converter.Factory> converterFactories;
        private final retrofit2.Platform platform;
        private boolean validateEagerly;

        public Builder() {
                r1 = this;
                retrofit2.Platform r0 = retrofit2.Platform.get()
                r1.<init>(r0)
                return
        }

        Builder(retrofit2.Platform r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.converterFactories = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.callAdapterFactories = r0
                r1.platform = r2
                return
        }

        Builder(retrofit2.Retrofit r5) {
                r4 = this;
                r4.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.converterFactories = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.callAdapterFactories = r0
                retrofit2.Platform r0 = retrofit2.Platform.get()
                r4.platform = r0
                okhttp3.Call$Factory r1 = r5.callFactory
                r4.callFactory = r1
                okhttp3.HttpUrl r1 = r5.baseUrl
                r4.baseUrl = r1
                java.util.List<retrofit2.Converter$Factory> r1 = r5.converterFactories
                int r1 = r1.size()
                int r0 = r0.defaultConverterFactoriesSize()
                int r1 = r1 - r0
                r0 = 1
            L2b:
                if (r0 >= r1) goto L3d
                java.util.List<retrofit2.Converter$Factory> r2 = r4.converterFactories
                java.util.List<retrofit2.Converter$Factory> r3 = r5.converterFactories
                java.lang.Object r3 = r3.get(r0)
                retrofit2.Converter$Factory r3 = (retrofit2.Converter.Factory) r3
                r2.add(r3)
                int r0 = r0 + 1
                goto L2b
            L3d:
                java.util.List<retrofit2.CallAdapter$Factory> r0 = r5.callAdapterFactories
                int r0 = r0.size()
                retrofit2.Platform r1 = r4.platform
                int r1 = r1.defaultCallAdapterFactoriesSize()
                int r0 = r0 - r1
                r1 = 0
            L4b:
                if (r1 >= r0) goto L5d
                java.util.List<retrofit2.CallAdapter$Factory> r2 = r4.callAdapterFactories
                java.util.List<retrofit2.CallAdapter$Factory> r3 = r5.callAdapterFactories
                java.lang.Object r3 = r3.get(r1)
                retrofit2.CallAdapter$Factory r3 = (retrofit2.CallAdapter.Factory) r3
                r2.add(r3)
                int r1 = r1 + 1
                goto L4b
            L5d:
                java.util.concurrent.Executor r0 = r5.callbackExecutor
                r4.callbackExecutor = r0
                boolean r5 = r5.validateEagerly
                r4.validateEagerly = r5
                return
        }

        public retrofit2.Retrofit.Builder addCallAdapterFactory(retrofit2.CallAdapter.Factory r3) {
                r2 = this;
                java.util.List<retrofit2.CallAdapter$Factory> r0 = r2.callAdapterFactories
                java.lang.String r1 = "factory == null"
                java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
                retrofit2.CallAdapter$Factory r3 = (retrofit2.CallAdapter.Factory) r3
                r0.add(r3)
                return r2
        }

        public retrofit2.Retrofit.Builder addConverterFactory(retrofit2.Converter.Factory r3) {
                r2 = this;
                java.util.List<retrofit2.Converter$Factory> r0 = r2.converterFactories
                java.lang.String r1 = "factory == null"
                java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
                retrofit2.Converter$Factory r3 = (retrofit2.Converter.Factory) r3
                r0.add(r3)
                return r2
        }

        public retrofit2.Retrofit.Builder baseUrl(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r2, r0)
                okhttp3.HttpUrl r2 = okhttp3.HttpUrl.get(r2)
                retrofit2.Retrofit$Builder r2 = r1.baseUrl(r2)
                return r2
        }

        public retrofit2.Retrofit.Builder baseUrl(java.net.URL r2) {
                r1 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = r2.toString()
                okhttp3.HttpUrl r2 = okhttp3.HttpUrl.get(r2)
                retrofit2.Retrofit$Builder r2 = r1.baseUrl(r2)
                return r2
        }

        public retrofit2.Retrofit.Builder baseUrl(okhttp3.HttpUrl r4) {
                r3 = this;
                java.lang.String r0 = "baseUrl == null"
                java.util.Objects.requireNonNull(r4, r0)
                java.util.List r0 = r4.pathSegments()
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = ""
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L1e
                r3.baseUrl = r4
                return r3
            L1e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "baseUrl must end in /: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public retrofit2.Retrofit build() {
                r9 = this;
                okhttp3.HttpUrl r0 = r9.baseUrl
                if (r0 == 0) goto L66
                okhttp3.Call$Factory r0 = r9.callFactory
                if (r0 != 0) goto Ld
                okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
                r0.<init>()
            Ld:
                r2 = r0
                java.util.concurrent.Executor r0 = r9.callbackExecutor
                if (r0 != 0) goto L18
                retrofit2.Platform r0 = r9.platform
                java.util.concurrent.Executor r0 = r0.defaultCallbackExecutor()
            L18:
                r6 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<retrofit2.CallAdapter$Factory> r1 = r9.callAdapterFactories
                r0.<init>(r1)
                retrofit2.Platform r1 = r9.platform
                java.util.List r1 = r1.defaultCallAdapterFactories(r6)
                r0.addAll(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<retrofit2.Converter$Factory> r3 = r9.converterFactories
                int r3 = r3.size()
                int r3 = r3 + 1
                retrofit2.Platform r4 = r9.platform
                int r4 = r4.defaultConverterFactoriesSize()
                int r3 = r3 + r4
                r1.<init>(r3)
                retrofit2.BuiltInConverters r3 = new retrofit2.BuiltInConverters
                r3.<init>()
                r1.add(r3)
                java.util.List<retrofit2.Converter$Factory> r3 = r9.converterFactories
                r1.addAll(r3)
                retrofit2.Platform r3 = r9.platform
                java.util.List r3 = r3.defaultConverterFactories()
                r1.addAll(r3)
                retrofit2.Retrofit r8 = new retrofit2.Retrofit
                okhttp3.HttpUrl r3 = r9.baseUrl
                java.util.List r4 = java.util.Collections.unmodifiableList(r1)
                java.util.List r5 = java.util.Collections.unmodifiableList(r0)
                boolean r7 = r9.validateEagerly
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r8
            L66:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Base URL required."
                r0.<init>(r1)
                throw r0
        }

        public java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
                r1 = this;
                java.util.List<retrofit2.CallAdapter$Factory> r0 = r1.callAdapterFactories
                return r0
        }

        public retrofit2.Retrofit.Builder callFactory(okhttp3.Call.Factory r2) {
                r1 = this;
                java.lang.String r0 = "factory == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                okhttp3.Call$Factory r2 = (okhttp3.Call.Factory) r2
                r1.callFactory = r2
                return r1
        }

        public retrofit2.Retrofit.Builder callbackExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.String r0 = "executor == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                r1.callbackExecutor = r2
                return r1
        }

        public retrofit2.Retrofit.Builder client(okhttp3.OkHttpClient r2) {
                r1 = this;
                java.lang.String r0 = "client == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                okhttp3.Call$Factory r2 = (okhttp3.Call.Factory) r2
                retrofit2.Retrofit$Builder r2 = r1.callFactory(r2)
                return r2
        }

        public java.util.List<retrofit2.Converter.Factory> converterFactories() {
                r1 = this;
                java.util.List<retrofit2.Converter$Factory> r0 = r1.converterFactories
                return r0
        }

        public retrofit2.Retrofit.Builder validateEagerly(boolean r1) {
                r0 = this;
                r0.validateEagerly = r1
                return r0
        }
    }

    Retrofit(okhttp3.Call.Factory r2, okhttp3.HttpUrl r3, java.util.List<retrofit2.Converter.Factory> r4, java.util.List<retrofit2.CallAdapter.Factory> r5, @javax.annotation.Nullable java.util.concurrent.Executor r6, boolean r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.serviceMethodCache = r0
            r1.callFactory = r2
            r1.baseUrl = r3
            r1.converterFactories = r4
            r1.callAdapterFactories = r5
            r1.callbackExecutor = r6
            r1.validateEagerly = r7
            return
    }

    private void validateServiceInterface(java.lang.Class<?> r6) {
            r5 = this;
            boolean r0 = r6.isInterface()
            if (r0 == 0) goto L7b
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 1
            r0.<init>(r1)
            r0.add(r6)
        Lf:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L52
            java.lang.Object r1 = r0.removeFirst()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.TypeVariable[] r2 = r1.getTypeParameters()
            int r2 = r2.length
            if (r2 == 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Type parameters are unsupported on "
            r0.<init>(r2)
            java.lang.String r2 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r2)
            if (r1 == r6) goto L40
            java.lang.String r1 = " which is an interface of "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r6 = r6.getName()
            r1.append(r6)
        L40:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4a:
            java.lang.Class[] r1 = r1.getInterfaces()
            java.util.Collections.addAll(r0, r1)
            goto Lf
        L52:
            boolean r0 = r5.validateEagerly
            if (r0 == 0) goto L7a
            retrofit2.Platform r0 = retrofit2.Platform.get()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r1 = r6.length
            r2 = 0
        L60:
            if (r2 >= r1) goto L7a
            r3 = r6[r2]
            boolean r4 = r0.isDefaultMethod(r3)
            if (r4 != 0) goto L77
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L77
            r5.loadServiceMethod(r3)
        L77:
            int r2 = r2 + 1
            goto L60
        L7a:
            return
        L7b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "API declarations must be interfaces."
            r6.<init>(r0)
            throw r6
    }

    public okhttp3.HttpUrl baseUrl() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.baseUrl
            return r0
    }

    public retrofit2.CallAdapter<?, ?> callAdapter(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            r0 = 0
            retrofit2.CallAdapter r2 = r1.nextCallAdapter(r0, r2, r3)
            return r2
    }

    public java.util.List<retrofit2.CallAdapter.Factory> callAdapterFactories() {
            r1 = this;
            java.util.List<retrofit2.CallAdapter$Factory> r0 = r1.callAdapterFactories
            return r0
    }

    public okhttp3.Call.Factory callFactory() {
            r1 = this;
            okhttp3.Call$Factory r0 = r1.callFactory
            return r0
    }

    @javax.annotation.Nullable
    public java.util.concurrent.Executor callbackExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.callbackExecutor
            return r0
    }

    public java.util.List<retrofit2.Converter.Factory> converterFactories() {
            r1 = this;
            java.util.List<retrofit2.Converter$Factory> r0 = r1.converterFactories
            return r0
    }

    public <T> T create(java.lang.Class<T> r4) {
            r3 = this;
            r3.validateServiceInterface(r4)
            java.lang.ClassLoader r0 = r4.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r4
            retrofit2.Retrofit$1 r2 = new retrofit2.Retrofit$1
            r2.<init>(r3, r4)
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r4
    }

    retrofit2.ServiceMethod<?> loadServiceMethod(java.lang.reflect.Method r4) {
            r3 = this;
            java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> r0 = r3.serviceMethodCache
            java.lang.Object r0 = r0.get(r4)
            retrofit2.ServiceMethod r0 = (retrofit2.ServiceMethod) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> r0 = r3.serviceMethodCache
            monitor-enter(r0)
            java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> r1 = r3.serviceMethodCache     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L23
            retrofit2.ServiceMethod r1 = (retrofit2.ServiceMethod) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L21
            retrofit2.ServiceMethod r1 = retrofit2.ServiceMethod.parseAnnotations(r3, r4)     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.reflect.Method, retrofit2.ServiceMethod<?>> r2 = r3.serviceMethodCache     // Catch: java.lang.Throwable -> L23
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public retrofit2.Retrofit.Builder newBuilder() {
            r1 = this;
            retrofit2.Retrofit$Builder r0 = new retrofit2.Retrofit$Builder
            r0.<init>(r1)
            return r0
    }

    public retrofit2.CallAdapter<?, ?> nextCallAdapter(@javax.annotation.Nullable retrofit2.CallAdapter.Factory r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7) {
            r4 = this;
            java.lang.String r0 = "returnType == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.List<retrofit2.CallAdapter$Factory> r0 = r4.callAdapterFactories
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.CallAdapter$Factory> r1 = r4.callAdapterFactories
            int r1 = r1.size()
            r2 = r0
        L19:
            if (r2 >= r1) goto L2d
            java.util.List<retrofit2.CallAdapter$Factory> r3 = r4.callAdapterFactories
            java.lang.Object r3 = r3.get(r2)
            retrofit2.CallAdapter$Factory r3 = (retrofit2.CallAdapter.Factory) r3
            retrofit2.CallAdapter r3 = r3.get(r6, r7, r4)
            if (r3 == 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate call adapter for "
            r7.<init>(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ".\n"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "\n   * "
            if (r5 == 0) goto L69
            java.lang.String r5 = "  Skipped:"
            r6.append(r5)
            r5 = 0
        L48:
            if (r5 >= r0) goto L64
            java.lang.StringBuilder r1 = r6.append(r7)
            java.util.List<retrofit2.CallAdapter$Factory> r2 = r4.callAdapterFactories
            java.lang.Object r2 = r2.get(r5)
            retrofit2.CallAdapter$Factory r2 = (retrofit2.CallAdapter.Factory) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            int r5 = r5 + 1
            goto L48
        L64:
            r5 = 10
            r6.append(r5)
        L69:
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<retrofit2.CallAdapter$Factory> r5 = r4.callAdapterFactories
            int r5 = r5.size()
        L74:
            if (r0 >= r5) goto L90
            java.lang.StringBuilder r1 = r6.append(r7)
            java.util.List<retrofit2.CallAdapter$Factory> r2 = r4.callAdapterFactories
            java.lang.Object r2 = r2.get(r0)
            retrofit2.CallAdapter$Factory r2 = (retrofit2.CallAdapter.Factory) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            int r0 = r0 + 1
            goto L74
        L90:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.Converter<T, okhttp3.RequestBody> nextRequestBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7, java.lang.annotation.Annotation[] r8) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "parameterAnnotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "methodAnnotations == null"
            java.util.Objects.requireNonNull(r8, r0)
            java.util.List<retrofit2.Converter$Factory> r0 = r4.converterFactories
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.Converter$Factory> r1 = r4.converterFactories
            int r1 = r1.size()
            r2 = r0
        L1e:
            if (r2 >= r1) goto L32
            java.util.List<retrofit2.Converter$Factory> r3 = r4.converterFactories
            java.lang.Object r3 = r3.get(r2)
            retrofit2.Converter$Factory r3 = (retrofit2.Converter.Factory) r3
            retrofit2.Converter r3 = r3.requestBodyConverter(r6, r7, r8, r4)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            int r2 = r2 + 1
            goto L1e
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Could not locate RequestBody converter for "
            r7.<init>(r8)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ".\n"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "\n   * "
            if (r5 == 0) goto L6e
            java.lang.String r5 = "  Skipped:"
            r6.append(r5)
            r5 = 0
        L4d:
            if (r5 >= r0) goto L69
            java.lang.StringBuilder r8 = r6.append(r7)
            java.util.List<retrofit2.Converter$Factory> r1 = r4.converterFactories
            java.lang.Object r1 = r1.get(r5)
            retrofit2.Converter$Factory r1 = (retrofit2.Converter.Factory) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r8.append(r1)
            int r5 = r5 + 1
            goto L4d
        L69:
            r5 = 10
            r6.append(r5)
        L6e:
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<retrofit2.Converter$Factory> r5 = r4.converterFactories
            int r5 = r5.size()
        L79:
            if (r0 >= r5) goto L95
            java.lang.StringBuilder r8 = r6.append(r7)
            java.util.List<retrofit2.Converter$Factory> r1 = r4.converterFactories
            java.lang.Object r1 = r1.get(r0)
            retrofit2.Converter$Factory r1 = (retrofit2.Converter.Factory) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r8.append(r1)
            int r0 = r0 + 1
            goto L79
        L95:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.Converter<okhttp3.ResponseBody, T> nextResponseBodyConverter(@javax.annotation.Nullable retrofit2.Converter.Factory r5, java.lang.reflect.Type r6, java.lang.annotation.Annotation[] r7) {
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.List<retrofit2.Converter$Factory> r0 = r4.converterFactories
            int r0 = r0.indexOf(r5)
            int r0 = r0 + 1
            java.util.List<retrofit2.Converter$Factory> r1 = r4.converterFactories
            int r1 = r1.size()
            r2 = r0
        L19:
            if (r2 >= r1) goto L2d
            java.util.List<retrofit2.Converter$Factory> r3 = r4.converterFactories
            java.lang.Object r3 = r3.get(r2)
            retrofit2.Converter$Factory r3 = (retrofit2.Converter.Factory) r3
            retrofit2.Converter r3 = r3.responseBodyConverter(r6, r7, r4)
            if (r3 == 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not locate ResponseBody converter for "
            r7.<init>(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = ".\n"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "\n   * "
            if (r5 == 0) goto L69
            java.lang.String r5 = "  Skipped:"
            r6.append(r5)
            r5 = 0
        L48:
            if (r5 >= r0) goto L64
            java.lang.StringBuilder r1 = r6.append(r7)
            java.util.List<retrofit2.Converter$Factory> r2 = r4.converterFactories
            java.lang.Object r2 = r2.get(r5)
            retrofit2.Converter$Factory r2 = (retrofit2.Converter.Factory) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            int r5 = r5 + 1
            goto L48
        L64:
            r5 = 10
            r6.append(r5)
        L69:
            java.lang.String r5 = "  Tried:"
            r6.append(r5)
            java.util.List<retrofit2.Converter$Factory> r5 = r4.converterFactories
            int r5 = r5.size()
        L74:
            if (r0 >= r5) goto L90
            java.lang.StringBuilder r1 = r6.append(r7)
            java.util.List<retrofit2.Converter$Factory> r2 = r4.converterFactories
            java.lang.Object r2 = r2.get(r0)
            retrofit2.Converter$Factory r2 = (retrofit2.Converter.Factory) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            int r0 = r0 + 1
            goto L74
        L90:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public <T> retrofit2.Converter<T, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3, java.lang.annotation.Annotation[] r4) {
            r1 = this;
            r0 = 0
            retrofit2.Converter r2 = r1.nextRequestBodyConverter(r0, r2, r3, r4)
            return r2
    }

    public <T> retrofit2.Converter<okhttp3.ResponseBody, T> responseBodyConverter(java.lang.reflect.Type r2, java.lang.annotation.Annotation[] r3) {
            r1 = this;
            r0 = 0
            retrofit2.Converter r2 = r1.nextResponseBodyConverter(r0, r2, r3)
            return r2
    }

    public <T> retrofit2.Converter<T, java.lang.String> stringConverter(java.lang.reflect.Type r4, java.lang.annotation.Annotation[] r5) {
            r3 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.util.List<retrofit2.Converter$Factory> r0 = r3.converterFactories
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L25
            java.util.List<retrofit2.Converter$Factory> r2 = r3.converterFactories
            java.lang.Object r2 = r2.get(r1)
            retrofit2.Converter$Factory r2 = (retrofit2.Converter.Factory) r2
            retrofit2.Converter r2 = r2.stringConverter(r4, r5, r3)
            if (r2 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L11
        L25:
            retrofit2.BuiltInConverters$ToStringConverter r4 = retrofit2.BuiltInConverters.ToStringConverter.INSTANCE
            return r4
    }
}
