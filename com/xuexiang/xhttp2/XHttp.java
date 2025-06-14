package com.xuexiang.xhttp2;

/* loaded from: classes.dex */
public final class XHttp {
    public static final long DEFAULT_CACHE_NEVER_EXPIRE = -1;
    public static final int DEFAULT_RETRY_COUNT = 0;
    public static final int DEFAULT_RETRY_DELAY = 500;
    public static final int DEFAULT_RETRY_INCREASE_DELAY = 0;
    public static final int DEFAULT_TIMEOUT_MILLISECONDS = 15000;
    private static android.app.Application sContext;
    private static volatile com.xuexiang.xhttp2.XHttp sInstance;
    private java.lang.String mBaseUrl;
    private okhttp3.Cache mCache;
    private java.io.File mCacheDirectory;
    private long mCacheMaxSize;
    private com.xuexiang.xhttp2.cache.model.CacheMode mCacheMode;
    private long mCacheTime;
    private com.xuexiang.xhttp2.model.HttpHeaders mCommonHeaders;
    private com.xuexiang.xhttp2.model.HttpParams mCommonParams;
    private com.xuexiang.xhttp2.cookie.CookieManager mCookieJar;
    private okhttp3.OkHttpClient.Builder mOkHttpClientBuilder;
    private retrofit2.Retrofit.Builder mRetrofitBuilder;
    private int mRetryCount;
    private int mRetryDelay;
    private int mRetryIncreaseDelay;
    private com.xuexiang.xhttp2.cache.RxCache.Builder mRxCacheBuilder;
    private boolean mStrictMode;
    private java.lang.String mSubUrl;





    static {
            return
    }

    private XHttp() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = ""
            r4.mSubUrl = r0
            r0 = 0
            r4.mCache = r0
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            r4.mCacheMode = r0
            r0 = -1
            r4.mCacheTime = r0
            r0 = 0
            r4.mRetryCount = r0
            r1 = 500(0x1f4, float:7.0E-43)
            r4.mRetryDelay = r1
            r4.mRetryIncreaseDelay = r0
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r4.mOkHttpClientBuilder = r0
            com.xuexiang.xhttp2.https.DefaultHostnameVerifier r1 = new com.xuexiang.xhttp2.https.DefaultHostnameVerifier
            r1.<init>()
            r0.hostnameVerifier(r1)
            okhttp3.OkHttpClient$Builder r0 = r4.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.connectTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r4.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.readTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r4.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.writeTimeout(r2, r1)
            retrofit2.Retrofit$Builder r0 = new retrofit2.Retrofit$Builder
            r0.<init>()
            r4.mRetrofitBuilder = r0
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = new com.xuexiang.xhttp2.cache.RxCache$Builder
            r0.<init>()
            android.app.Application r1 = com.xuexiang.xhttp2.XHttp.sContext
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r0.init(r1)
            com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter r1 = new com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter
            r1.<init>()
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r0.diskConverter(r1)
            r4.mRxCacheBuilder = r0
            return
    }

    public static void clearCache() {
            com.xuexiang.xhttp2.cache.RxCache r0 = getRxCache()
            io.reactivex.Observable r0 = r0.clear()
            io.reactivex.ObservableTransformer r1 = com.xuexiang.xhttp2.utils.RxSchedulers._io_main()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.XHttp$1 r1 = new com.xuexiang.xhttp2.XHttp$1
            r1.<init>()
            com.xuexiang.xhttp2.XHttp$2 r2 = new com.xuexiang.xhttp2.XHttp$2
            r2.<init>()
            r0.subscribe(r1, r2)
            return
    }

    public static com.xuexiang.xhttp2.request.CustomRequest custom() {
            com.xuexiang.xhttp2.request.CustomRequest r0 = new com.xuexiang.xhttp2.request.CustomRequest
            r0.<init>()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            retrofit2.converter.gson.GsonConverterFactory r1 = retrofit2.converter.gson.GsonConverterFactory.create(r1)
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.addConverterFactory(r1)
            com.xuexiang.xhttp2.request.CustomRequest r0 = (com.xuexiang.xhttp2.request.CustomRequest) r0
            return r0
    }

    public static <T> T custom(java.lang.Class<T> r2) {
            com.xuexiang.xhttp2.request.CustomRequest r0 = new com.xuexiang.xhttp2.request.CustomRequest
            r0.<init>()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            retrofit2.converter.gson.GsonConverterFactory r1 = retrofit2.converter.gson.GsonConverterFactory.create(r1)
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.addConverterFactory(r1)
            com.xuexiang.xhttp2.request.CustomRequest r0 = (com.xuexiang.xhttp2.request.CustomRequest) r0
            com.xuexiang.xhttp2.request.CustomRequest r0 = r0.build()
            java.lang.Object r2 = r0.create(r2)
            return r2
    }

    public static com.xuexiang.xhttp2.request.DeleteRequest delete(java.lang.String r1) {
            com.xuexiang.xhttp2.request.DeleteRequest r0 = new com.xuexiang.xhttp2.request.DeleteRequest
            r0.<init>(r1)
            return r0
    }

    public static com.xuexiang.xhttp2.request.DownloadRequest downLoad(java.lang.String r1) {
            com.xuexiang.xhttp2.request.DownloadRequest r0 = new com.xuexiang.xhttp2.request.DownloadRequest
            r0.<init>(r1)
            return r0
    }

    public static com.xuexiang.xhttp2.request.GetRequest get(java.lang.String r1) {
            com.xuexiang.xhttp2.request.GetRequest r0 = new com.xuexiang.xhttp2.request.GetRequest
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String getBaseUrl() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            java.lang.String r0 = r0.mBaseUrl
            return r0
    }

    public static java.io.File getCacheDirectory() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            java.io.File r0 = r0.mCacheDirectory
            return r0
    }

    public static long getCacheMaxSize() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            long r0 = r0.mCacheMaxSize
            return r0
    }

    public static com.xuexiang.xhttp2.cache.model.CacheMode getCacheMode() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = r0.mCacheMode
            return r0
    }

    public static long getCacheTime() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            long r0 = r0.mCacheTime
            return r0
    }

    public static com.xuexiang.xhttp2.model.HttpHeaders getCommonHeaders() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r0.mCommonHeaders
            return r0
    }

    public static com.xuexiang.xhttp2.model.HttpParams getCommonParams() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.model.HttpParams r0 = r0.mCommonParams
            return r0
    }

    public static android.content.Context getContext() {
            testInitialize()
            android.app.Application r0 = com.xuexiang.xhttp2.XHttp.sContext
            return r0
    }

    public static com.xuexiang.xhttp2.cookie.CookieManager getCookieJar() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.cookie.CookieManager r0 = r0.mCookieJar
            return r0
    }

    public static okhttp3.Cache getHttpCache() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            okhttp3.Cache r0 = r0.mCache
            return r0
    }

    public static com.xuexiang.xhttp2.XHttp getInstance() {
            testInitialize()
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.sInstance
            if (r0 != 0) goto L1a
            java.lang.Class<com.xuexiang.xhttp2.XHttp> r0 = com.xuexiang.xhttp2.XHttp.class
            monitor-enter(r0)
            com.xuexiang.xhttp2.XHttp r1 = com.xuexiang.xhttp2.XHttp.sInstance     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            com.xuexiang.xhttp2.XHttp r1 = new com.xuexiang.xhttp2.XHttp     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            com.xuexiang.xhttp2.XHttp.sInstance = r1     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1a:
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.sInstance
            return r0
    }

    public static okhttp3.OkHttpClient getOkHttpClient() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            okhttp3.OkHttpClient$Builder r0 = r0.mOkHttpClientBuilder
            okhttp3.OkHttpClient r0 = r0.build()
            return r0
    }

    public static okhttp3.OkHttpClient.Builder getOkHttpClientBuilder() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            okhttp3.OkHttpClient$Builder r0 = r0.mOkHttpClientBuilder
            return r0
    }

    public static retrofit2.Retrofit.Builder getRetrofitBuilder() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            retrofit2.Retrofit$Builder r0 = r0.mRetrofitBuilder
            return r0
    }

    public static int getRetryCount() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            int r0 = r0.mRetryCount
            return r0
    }

    public static int getRetryDelay() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            int r0 = r0.mRetryDelay
            return r0
    }

    public static int getRetryIncreaseDelay() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            int r0 = r0.mRetryIncreaseDelay
            return r0
    }

    public static com.xuexiang.xhttp2.cache.RxCache getRxCache() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r0.mRxCacheBuilder
            com.xuexiang.xhttp2.cache.RxCache r0 = r0.build()
            return r0
    }

    public static com.xuexiang.xhttp2.cache.RxCache.Builder getRxCacheBuilder() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r0.mRxCacheBuilder
            return r0
    }

    public static java.lang.String getSubUrl() {
            com.xuexiang.xhttp2.XHttp r0 = getInstance()
            java.lang.String r0 = r0.mSubUrl
            return r0
    }

    public static void init(android.app.Application r0) {
            com.xuexiang.xhttp2.XHttp.sContext = r0
            return
    }

    public static com.xuexiang.xhttp2.request.PostRequest post(java.lang.String r1) {
            com.xuexiang.xhttp2.request.PostRequest r0 = new com.xuexiang.xhttp2.request.PostRequest
            r0.<init>(r1)
            return r0
    }

    public static com.xuexiang.xhttp2.request.PutRequest put(java.lang.String r1) {
            com.xuexiang.xhttp2.request.PutRequest r0 = new com.xuexiang.xhttp2.request.PutRequest
            r0.<init>(r1)
            return r0
    }

    public static void removeCache(java.lang.String r2) {
            com.xuexiang.xhttp2.cache.RxCache r0 = getRxCache()
            io.reactivex.Observable r2 = r0.remove(r2)
            io.reactivex.ObservableTransformer r0 = com.xuexiang.xhttp2.utils.RxSchedulers._io_main()
            io.reactivex.Observable r2 = r2.compose(r0)
            com.xuexiang.xhttp2.XHttp$3 r0 = new com.xuexiang.xhttp2.XHttp$3
            r0.<init>()
            com.xuexiang.xhttp2.XHttp$4 r1 = new com.xuexiang.xhttp2.XHttp$4
            r1.<init>()
            r2.subscribe(r0, r1)
            return
    }

    private static void testInitialize() {
            android.app.Application r0 = com.xuexiang.xhttp2.XHttp.sContext
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.ExceptionInInitializerError r0 = new java.lang.ExceptionInInitializerError
            java.lang.String r1 = "请先在全局Application中调用 XHttp.init() 初始化！"
            r0.<init>(r1)
            throw r0
    }

    public com.xuexiang.xhttp2.XHttp addCallAdapterFactory(retrofit2.CallAdapter.Factory r3) {
            r2 = this;
            retrofit2.Retrofit$Builder r0 = r2.mRetrofitBuilder
            java.lang.String r1 = "factory == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            retrofit2.CallAdapter$Factory r3 = (retrofit2.CallAdapter.Factory) r3
            r0.addCallAdapterFactory(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp addCommonHeaders(com.xuexiang.xhttp2.model.HttpHeaders r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mCommonHeaders
            if (r0 != 0) goto Lb
            com.xuexiang.xhttp2.model.HttpHeaders r0 = new com.xuexiang.xhttp2.model.HttpHeaders
            r0.<init>()
            r1.mCommonHeaders = r0
        Lb:
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mCommonHeaders
            r0.put(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp addCommonParams(com.xuexiang.xhttp2.model.HttpParams r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mCommonParams
            if (r0 != 0) goto Lb
            com.xuexiang.xhttp2.model.HttpParams r0 = new com.xuexiang.xhttp2.model.HttpParams
            r0.<init>()
            r1.mCommonParams = r0
        Lb:
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mCommonParams
            r0.put(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp addConverterFactory(retrofit2.Converter.Factory r3) {
            r2 = this;
            retrofit2.Retrofit$Builder r0 = r2.mRetrofitBuilder
            java.lang.String r1 = "factory == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            retrofit2.Converter$Factory r3 = (retrofit2.Converter.Factory) r3
            r0.addConverterFactory(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp addInterceptor(okhttp3.Interceptor r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.lang.String r1 = "interceptor == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            okhttp3.Interceptor r3 = (okhttp3.Interceptor) r3
            r0.addInterceptor(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp addNetworkInterceptor(okhttp3.Interceptor r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.lang.String r1 = "interceptor == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            okhttp3.Interceptor r3 = (okhttp3.Interceptor) r3
            r0.addNetworkInterceptor(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp debug(com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            okhttp3.OkHttpClient$Builder r0 = r1.mOkHttpClientBuilder
            r0.addInterceptor(r2)
            r2 = 1
            com.xuexiang.xhttp2.logs.HttpLog.debug(r2)
            goto L10
        Lc:
            r2 = 0
            com.xuexiang.xhttp2.logs.HttpLog.debug(r2)
        L10:
            return r1
    }

    public com.xuexiang.xhttp2.XHttp debug(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L19
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r0 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor
            r1 = 1
            r0.<init>(r3, r1)
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r0 = r0.setLevel(r1)
            r2.debug(r0)
            com.xuexiang.xhttp2.logs.HttpLog.debug(r3)
            goto L1d
        L19:
            r3 = 0
            com.xuexiang.xhttp2.logs.HttpLog.debug(r3)
        L1d:
            return r2
    }

    public com.xuexiang.xhttp2.XHttp debug(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L13
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r0 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor
            java.lang.String r1 = "[XHttp]"
            r2 = 1
            r0.<init>(r1, r2)
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor r0 = r0.setLevel(r1)
            r3.debug(r0)
        L13:
            com.xuexiang.xhttp2.logs.HttpLog.debug(r4)
            return r3
    }

    public boolean isInStrictMode() {
            r1 = this;
            boolean r0 = r1.mStrictMode
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setBaseUrl(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "mBaseUrl == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mBaseUrl = r2
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setCacheDirectory(java.io.File r2) {
            r1 = this;
            java.lang.String r0 = "directory == null"
            java.lang.Object r0 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            java.io.File r0 = (java.io.File) r0
            r1.mCacheDirectory = r0
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r1.mRxCacheBuilder
            r0.diskDir(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setCacheDiskConverter(com.xuexiang.xhttp2.cache.converter.IDiskConverter r3) {
            r2 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r2.mRxCacheBuilder
            java.lang.String r1 = "converter == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r3 = (com.xuexiang.xhttp2.cache.converter.IDiskConverter) r3
            r0.diskConverter(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setCacheMaxSize(long r1) {
            r0 = this;
            r0.mCacheMaxSize = r1
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setCacheMode(com.xuexiang.xhttp2.cache.model.CacheMode r1) {
            r0 = this;
            r0.mCacheMode = r1
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setCacheTime(long r4) {
            r3 = this;
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            r4 = r0
        L7:
            r3.mCacheTime = r4
            return r3
    }

    public com.xuexiang.xhttp2.XHttp setCacheVersion(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r1.mRxCacheBuilder
            r0.appVersion(r2)
            return r1
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cache version must > 0"
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.XHttp setCallFactory(okhttp3.Call.Factory r3) {
            r2 = this;
            retrofit2.Retrofit$Builder r0 = r2.mRetrofitBuilder
            java.lang.String r1 = "factory == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            okhttp3.Call$Factory r3 = (okhttp3.Call.Factory) r3
            r0.callFactory(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setCallbackExecutor(java.util.concurrent.Executor r3) {
            r2 = this;
            retrofit2.Retrofit$Builder r0 = r2.mRetrofitBuilder
            java.lang.String r1 = "executor == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
            r0.callbackExecutor(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setCertificates(java.io.InputStream r1, java.lang.String r2, java.io.InputStream... r3) {
            r0 = this;
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r1 = com.xuexiang.xhttp2.https.HttpsUtils.getSslSocketFactory(r1, r2, r3)
            okhttp3.OkHttpClient$Builder r2 = r0.mOkHttpClientBuilder
            javax.net.ssl.SSLSocketFactory r3 = r1.sSLSocketFactory
            javax.net.ssl.X509TrustManager r1 = r1.trustManager
            r2.sslSocketFactory(r3, r1)
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setCertificates(java.io.InputStream... r3) {
            r2 = this;
            r0 = 0
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r3 = com.xuexiang.xhttp2.https.HttpsUtils.getSslSocketFactory(r0, r0, r3)
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            javax.net.ssl.SSLSocketFactory r1 = r3.sSLSocketFactory
            javax.net.ssl.X509TrustManager r3 = r3.trustManager
            r0.sslSocketFactory(r1, r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setConnectTimeout(long r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.connectTimeout(r3, r1)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setCookieStore(com.xuexiang.xhttp2.cookie.CookieManager r2) {
            r1 = this;
            r1.mCookieJar = r2
            okhttp3.OkHttpClient$Builder r0 = r1.mOkHttpClientBuilder
            r0.cookieJar(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setHostnameVerifier(javax.net.ssl.HostnameVerifier r2) {
            r1 = this;
            okhttp3.OkHttpClient$Builder r0 = r1.mOkHttpClientBuilder
            r0.hostnameVerifier(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setHttpCache(okhttp3.Cache r1) {
            r0 = this;
            r0.mCache = r1
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setIsDiskCache(boolean r2) {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r1.mRxCacheBuilder
            r0.isDiskCache(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setMemoryMaxSize(int r2) {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r1.mRxCacheBuilder
            r0.memoryMaxSize(r2)
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setOkclient(okhttp3.OkHttpClient r3) {
            r2 = this;
            retrofit2.Retrofit$Builder r0 = r2.mRetrofitBuilder
            java.lang.String r1 = "client == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            okhttp3.OkHttpClient r3 = (okhttp3.OkHttpClient) r3
            r0.client(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setOkconnectionPool(okhttp3.ConnectionPool r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.lang.String r1 = "connectionPool == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            okhttp3.ConnectionPool r3 = (okhttp3.ConnectionPool) r3
            r0.connectionPool(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setOkproxy(java.net.Proxy r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.lang.String r1 = "mProxy == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            java.net.Proxy r3 = (java.net.Proxy) r3
            r0.proxy(r3)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setReadTimeOut(long r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.readTimeout(r3, r1)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setRetryCount(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.mRetryCount = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mRetryCount must >= 0"
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.XHttp setRetryDelay(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.mRetryDelay = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mRetryDelay must > 0"
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.XHttp setRetryIncreaseDelay(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.mRetryIncreaseDelay = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mRetryIncreaseDelay must >= 0"
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.XHttp setStrictMode(boolean r1) {
            r0 = this;
            r0.mStrictMode = r1
            return r0
    }

    public com.xuexiang.xhttp2.XHttp setSubUrl(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "mSubUrl == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mSubUrl = r2
            return r1
    }

    public com.xuexiang.xhttp2.XHttp setTimeout(long r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.readTimeout(r3, r1)
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.writeTimeout(r3, r1)
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.connectTimeout(r3, r1)
            return r2
    }

    public com.xuexiang.xhttp2.XHttp setWriteTimeOut(long r3) {
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = r2.mOkHttpClientBuilder
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.writeTimeout(r3, r1)
            return r2
    }
}
