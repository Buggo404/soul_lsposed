package com.xuexiang.xhttp2;

/* loaded from: classes.dex */
public final class XHttpSDK {
    private XHttpSDK() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static void addInterceptor(okhttp3.Interceptor r1) {
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0.addInterceptor(r1)
            return
    }

    public static io.reactivex.disposables.Disposable addRequest(io.reactivex.disposables.Disposable r1, java.lang.Object r2) {
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.get()
            io.reactivex.disposables.Disposable r1 = r0.add(r1, r2)
            return r1
    }

    public static io.reactivex.disposables.Disposable addRequest(java.lang.Object r1, io.reactivex.disposables.Disposable r2) {
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.get()
            io.reactivex.disposables.Disposable r1 = r0.add(r1, r2)
            return r1
    }

    public static void cancelAll() {
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.get()
            r0.removeAll()
            return
    }

    public static void cancelRequest(java.lang.Object r1) {
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.get()
            r0.remove(r1)
            return
    }

    public static void debug() {
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            java.lang.String r1 = "[XHttp]"
            r0.debug(r1)
            return
    }

    public static void debug(com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r1) {
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0.debug(r1)
            return
    }

    public static void debug(java.lang.String r1) {
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0.debug(r1)
            return
    }

    public static io.reactivex.Observable execute(com.xuexiang.xhttp2.model.XHttpRequest r0, boolean r1, boolean r2) {
            com.xuexiang.xhttp2.request.PostRequest r1 = post(r0, r1, r2)
            java.lang.reflect.Type r0 = r0.parseReturnType()
            io.reactivex.Observable r0 = execute(r1, r0)
            return r0
    }

    public static io.reactivex.Observable execute(com.xuexiang.xhttp2.request.PostRequest r0, com.xuexiang.xhttp2.model.XHttpRequest r1) {
            java.lang.reflect.Type r1 = r1.parseReturnType()
            io.reactivex.Observable r0 = execute(r0, r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> execute(com.xuexiang.xhttp2.request.PostRequest r0, java.lang.Class<T> r1) {
            io.reactivex.Observable r0 = r0.execute(r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> execute(com.xuexiang.xhttp2.request.PostRequest r0, java.lang.reflect.Type r1) {
            io.reactivex.Observable r0 = r0.execute(r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> execute(java.lang.String r0, boolean r1, java.lang.String r2, boolean r3, boolean r4, java.lang.Class<T> r5) {
            com.xuexiang.xhttp2.request.PostRequest r0 = post(r0, r1, r2, r3, r4)
            io.reactivex.Observable r0 = r0.execute(r5)
            return r0
    }

    public static <T> io.reactivex.Observable<T> execute(java.lang.String r0, boolean r1, java.lang.String r2, boolean r3, boolean r4, java.lang.reflect.Type r5) {
            com.xuexiang.xhttp2.request.PostRequest r0 = post(r0, r1, r2, r3, r4)
            io.reactivex.Observable r0 = r0.execute(r5)
            return r0
    }

    public static <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.request.PostRequest r0, com.xuexiang.xhttp2.model.XHttpRequest r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2, java.lang.Object r3) {
            io.reactivex.Observable r0 = execute(r0, r1)
            io.reactivex.Observer r0 = r0.subscribeWith(r2)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.disposables.Disposable r0 = addRequest(r3, r0)
            return r0
    }

    public static <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.request.PostRequest r1, java.lang.Class<T> r2, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r3) {
            java.lang.String r0 = r1.getUrl()
            io.reactivex.Observable r1 = r1.execute(r2)
            io.reactivex.Observer r1 = r1.subscribeWith(r3)
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            io.reactivex.disposables.Disposable r1 = addRequest(r0, r1)
            return r1
    }

    public static <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.request.PostRequest r0, java.lang.reflect.Type r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2, java.lang.Object r3) {
            io.reactivex.Observable r0 = executePost(r0, r1)
            io.reactivex.Observer r0 = r0.subscribeWith(r2)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.disposables.Disposable r0 = addRequest(r3, r0)
            return r0
    }

    public static io.reactivex.Observable executeInThread(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r0 = 1
            r1 = 0
            io.reactivex.Observable r2 = execute(r2, r0, r1)
            return r2
    }

    public static <T> io.reactivex.disposables.Disposable executeInThread(com.xuexiang.xhttp2.model.XHttpRequest r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2) {
            java.lang.String r0 = r1.getUrl()
            io.reactivex.Observable r1 = executeInThread(r1)
            io.reactivex.Observer r1 = r1.subscribeWith(r2)
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            io.reactivex.disposables.Disposable r1 = addRequest(r0, r1)
            return r1
    }

    public static <T> io.reactivex.disposables.Disposable executeInThread(com.xuexiang.xhttp2.model.XHttpRequest r0, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r1, java.lang.Object r2) {
            io.reactivex.Observable r0 = executeInThread(r0)
            io.reactivex.Observer r0 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.disposables.Disposable r0 = addRequest(r2, r0)
            return r0
    }

    public static io.reactivex.Observable executePost(com.xuexiang.xhttp2.request.PostRequest r0, java.lang.reflect.Type r1) {
            io.reactivex.Observable r0 = execute(r0, r1)
            return r0
    }

    public static io.reactivex.Observable executeToIO(com.xuexiang.xhttp2.model.XHttpRequest r1) {
            r0 = 0
            io.reactivex.Observable r1 = execute(r1, r0, r0)
            return r1
    }

    public static <T> io.reactivex.disposables.Disposable executeToIO(com.xuexiang.xhttp2.model.XHttpRequest r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2) {
            java.lang.String r0 = r1.getUrl()
            io.reactivex.Observable r1 = executeToIO(r1)
            io.reactivex.Observer r1 = r1.subscribeWith(r2)
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            io.reactivex.disposables.Disposable r1 = addRequest(r0, r1)
            return r1
    }

    public static <T> io.reactivex.disposables.Disposable executeToIO(com.xuexiang.xhttp2.model.XHttpRequest r0, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r1, java.lang.Object r2) {
            io.reactivex.Observable r0 = executeToIO(r0)
            io.reactivex.Observer r0 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.disposables.Disposable r0 = addRequest(r2, r0)
            return r0
    }

    public static io.reactivex.Observable executeToMain(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r0 = 0
            r1 = 1
            io.reactivex.Observable r2 = execute(r2, r0, r1)
            return r2
    }

    public static <T> io.reactivex.disposables.Disposable executeToMain(com.xuexiang.xhttp2.model.XHttpRequest r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2) {
            java.lang.String r0 = r1.getUrl()
            io.reactivex.Observable r1 = executeToMain(r1)
            io.reactivex.Observer r1 = r1.subscribeWith(r2)
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            io.reactivex.disposables.Disposable r1 = addRequest(r0, r1)
            return r1
    }

    public static <T> io.reactivex.disposables.Disposable executeToMain(com.xuexiang.xhttp2.model.XHttpRequest r0, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r1, java.lang.Object r2) {
            io.reactivex.Observable r0 = executeToMain(r0)
            io.reactivex.Observer r0 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.disposables.Disposable r0 = addRequest(r2, r0)
            return r0
    }

    public static void init(android.app.Application r2) {
            com.xuexiang.xhttp2.XHttp.init(r2)
            com.xuexiang.xhttp2.XHttp r2 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0 = 15000(0x3a98, double:7.411E-320)
            com.xuexiang.xhttp2.XHttp r2 = r2.setTimeout(r0)
            r0 = 0
            com.xuexiang.xhttp2.XHttp r2 = r2.setRetryCount(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            com.xuexiang.xhttp2.XHttp r2 = r2.setRetryDelay(r0)
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            com.xuexiang.xhttp2.XHttp r2 = r2.setCacheMode(r0)
            com.xuexiang.xhttp2.cache.converter.GsonDiskConverter r0 = new com.xuexiang.xhttp2.cache.converter.GsonDiskConverter
            r0.<init>()
            com.xuexiang.xhttp2.XHttp r2 = r2.setCacheDiskConverter(r0)
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            r2.setCacheMaxSize(r0)
            return
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(com.xuexiang.xhttp2.model.XHttpRequest r1, boolean r2, boolean r3) {
            java.lang.String r0 = r1.toString()
            java.lang.Class r1 = r1.getClass()
            com.xuexiang.xhttp2.request.PostRequest r1 = post(r0, r1, r2, r3)
            return r1
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(java.lang.String r9, java.lang.Class<?> r10, boolean r11, boolean r12) {
            java.lang.Class<com.xuexiang.xhttp2.annotation.RequestParams> r0 = com.xuexiang.xhttp2.annotation.RequestParams.class
            java.lang.annotation.Annotation r10 = r10.getAnnotation(r0)
            com.xuexiang.xhttp2.annotation.RequestParams r10 = (com.xuexiang.xhttp2.annotation.RequestParams) r10
            java.lang.String r0 = "requestParams == null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r10, r0)
            java.lang.String r0 = r10.baseUrl()
            java.lang.String r1 = r10.url()
            long r2 = r10.timeout()
            boolean r4 = r10.accessToken()
            com.xuexiang.xhttp2.cache.model.CacheMode r5 = r10.cacheMode()
            com.xuexiang.xhttp2.request.PostRequest r6 = com.xuexiang.xhttp2.XHttp.post(r1)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L2e
            r6.baseUrl(r0)
        L2e:
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L4c
            com.xuexiang.xhttp2.request.BaseRequest r0 = r6.cacheMode(r5)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            r0.cacheKey(r1)
            long r0 = r10.cacheTime()
            r7 = -2
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L4c
            r6.cacheTime(r0)
        L4c:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L54
            r2 = 15000(0x3a98, double:7.411E-320)
        L54:
            com.xuexiang.xhttp2.request.BaseRequest r0 = r6.accessToken(r4)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.timeOut(r2)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseBodyRequest r9 = r0.upJson(r9)
            com.xuexiang.xhttp2.request.PostRequest r9 = (com.xuexiang.xhttp2.request.PostRequest) r9
            boolean r10 = r10.keepJson()
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.keepJson(r10)
            com.xuexiang.xhttp2.request.PostRequest r9 = (com.xuexiang.xhttp2.request.PostRequest) r9
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.syncRequest(r11)
            com.xuexiang.xhttp2.request.PostRequest r9 = (com.xuexiang.xhttp2.request.PostRequest) r9
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.onMainThread(r12)
            com.xuexiang.xhttp2.request.PostRequest r9 = (com.xuexiang.xhttp2.request.PostRequest) r9
            return r9
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            com.xuexiang.xhttp2.request.PostRequest r1 = post(r1, r0, r2, r3)
            return r1
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(java.lang.String r0, boolean r1, java.lang.String r2, java.lang.String r3) {
            com.xuexiang.xhttp2.request.PostRequest r0 = com.xuexiang.xhttp2.XHttp.post(r0)
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.accessToken(r1)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseBodyRequest r0 = r0.upJson(r2)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.threadType(r3)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            return r0
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(java.lang.String r0, boolean r1, java.lang.String r2, boolean r3, boolean r4) {
            com.xuexiang.xhttp2.request.PostRequest r0 = com.xuexiang.xhttp2.XHttp.post(r0)
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.accessToken(r1)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseBodyRequest r0 = r0.upJson(r2)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.syncRequest(r3)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.onMainThread(r4)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            return r0
    }

    public static com.xuexiang.xhttp2.request.PostRequest postInThread(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r0 = 1
            r1 = 0
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r0, r1)
            return r2
    }

    public static com.xuexiang.xhttp2.request.PostRequest postInThread(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            r1 = 0
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r0, r3, r0, r1)
            return r2
    }

    public static <T> io.reactivex.Observable<T> postInThread(com.xuexiang.xhttp2.model.XHttpRequest r0, java.lang.Class<T> r1) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postInThread(r0)
            io.reactivex.Observable r0 = execute(r0, r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> postInThread(java.lang.String r0, java.lang.String r1, java.lang.Class<T> r2) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postInThread(r0, r1)
            io.reactivex.Observable r0 = execute(r0, r2)
            return r0
    }

    public static com.xuexiang.xhttp2.request.PostRequest postJson(com.xuexiang.xhttp2.model.XHttpRequest r2, boolean r3, boolean r4) {
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = com.xuexiang.xhttp2.utils.HttpUtils.getAnnotationParamString(r2)     // Catch: java.lang.IllegalAccessException -> L9
            goto Ld
        L9:
            r1 = move-exception
            r1.printStackTrace()
        Ld:
            java.lang.Class r2 = r2.getClass()
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r0, r2, r3, r4)
            return r2
    }

    public static com.xuexiang.xhttp2.request.PostRequest postJsonToMain(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r0 = 0
            r1 = 1
            com.xuexiang.xhttp2.request.PostRequest r2 = postJson(r2, r0, r1)
            return r2
    }

    public static com.xuexiang.xhttp2.request.PostRequest postToIO(com.xuexiang.xhttp2.model.XHttpRequest r1) {
            r0 = 0
            com.xuexiang.xhttp2.request.PostRequest r1 = post(r1, r0, r0)
            return r1
    }

    public static com.xuexiang.xhttp2.request.PostRequest postToIO(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            r1 = 0
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r0, r3, r1, r1)
            return r2
    }

    public static <T> io.reactivex.Observable<T> postToIO(com.xuexiang.xhttp2.model.XHttpRequest r0, java.lang.Class<T> r1) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postToIO(r0)
            io.reactivex.Observable r0 = execute(r0, r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> postToIO(java.lang.String r0, java.lang.String r1, java.lang.Class<T> r2) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postToIO(r0, r1)
            io.reactivex.Observable r0 = execute(r0, r2)
            return r0
    }

    public static com.xuexiang.xhttp2.request.PostRequest postToMain(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r0 = 0
            r1 = 1
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r0, r1)
            return r2
    }

    public static com.xuexiang.xhttp2.request.PostRequest postToMain(java.lang.String r2, java.lang.Class<?> r3) {
            r0 = 0
            r1 = 1
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r3, r0, r1)
            return r2
    }

    public static com.xuexiang.xhttp2.request.PostRequest postToMain(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            r1 = 0
            com.xuexiang.xhttp2.request.PostRequest r2 = post(r2, r0, r3, r1, r0)
            return r2
    }

    public static <T> io.reactivex.Observable<T> postToMain(com.xuexiang.xhttp2.model.XHttpRequest r0, java.lang.Class<T> r1) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postToMain(r0)
            io.reactivex.Observable r0 = execute(r0, r1)
            return r0
    }

    public static <T> io.reactivex.Observable<T> postToMain(java.lang.String r0, java.lang.String r1, java.lang.Class<T> r2) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postToMain(r0, r1)
            io.reactivex.Observable r0 = execute(r0, r2)
            return r0
    }

    public static <T> io.reactivex.disposables.Disposable postToMain(com.xuexiang.xhttp2.model.XHttpRequest r0, java.lang.Class<T> r1, com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> r2) {
            com.xuexiang.xhttp2.request.PostRequest r0 = postToMain(r0)
            io.reactivex.disposables.Disposable r0 = execute(r0, r1, r2)
            return r0
    }

    public static boolean setBaseUrl(java.lang.String r1) {
            boolean r0 = verifyBaseUrl(r1)
            if (r0 == 0) goto Lf
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0.setBaseUrl(r1)
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static void setICacheKeyCreator(com.xuexiang.xhttp2.cache.key.ICacheKeyCreator r0) {
            com.xuexiang.xhttp2.cache.RxCache.setICacheKeyCreator(r0)
            return
    }

    public static void setISerializer(com.xuexiang.xhttp2.cache.key.IObjectSerializer r0) {
            com.xuexiang.xhttp2.cache.key.Strings.setISerializer(r0)
            return
    }

    public static void setSubUrl(java.lang.String r1) {
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            r0.setSubUrl(r1)
            return
    }

    public static void setSuccessCode(int r0) {
            com.xuexiang.xhttp2.utils.ApiUtils.setSuccessCode(r0)
            return
    }

    public static boolean verifyBaseUrl(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L21
            okhttp3.HttpUrl r1 = okhttp3.HttpUrl.parse(r1)
            if (r1 == 0) goto L21
            java.util.List r1 = r1.pathSegments()
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = ""
            boolean r1 = r0.equals(r1)
            return r1
        L21:
            r1 = 0
            return r1
    }
}
