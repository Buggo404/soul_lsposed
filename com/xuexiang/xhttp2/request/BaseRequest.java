package com.xuexiang.xhttp2.request;

import com.xuexiang.xhttp2.request.BaseRequest;

/* loaded from: classes.dex */
public abstract class BaseRequest<R extends com.xuexiang.xhttp2.request.BaseRequest> {
    private boolean mAccessToken;
    protected java.util.List<retrofit2.CallAdapter.Factory> mAdapterFactories;
    protected com.xuexiang.xhttp2.api.ApiService mApiManager;
    protected java.lang.String mBaseUrl;
    protected okhttp3.Cache mCache;
    protected java.lang.String mCacheKey;
    protected com.xuexiang.xhttp2.cache.model.CacheMode mCacheMode;
    protected long mCacheTime;
    protected long mConnectTimeout;
    protected android.content.Context mContext;
    protected java.util.List<retrofit2.Converter.Factory> mConverterFactories;
    protected java.util.List<okhttp3.Cookie> mCookies;
    protected com.xuexiang.xhttp2.cache.converter.IDiskConverter mDiskConverter;
    protected com.xuexiang.xhttp2.model.HttpHeaders mHeaders;
    protected javax.net.ssl.HostnameVerifier mHostnameVerifier;
    protected okhttp3.HttpUrl mHttpUrl;
    protected final java.util.List<okhttp3.Interceptor> mInterceptors;
    protected boolean mIsOnMainThread;
    protected boolean mIsSyncRequest;
    protected boolean mKeepJson;
    protected final java.util.List<okhttp3.Interceptor> mNetworkInterceptors;
    protected okhttp3.OkHttpClient mOkHttpClient;
    protected com.xuexiang.xhttp2.model.HttpParams mParams;
    protected java.net.Proxy mProxy;
    protected long mReadTimeOut;
    protected retrofit2.Retrofit mRetrofit;
    protected int mRetryCount;
    protected int mRetryDelay;
    protected int mRetryIncreaseDelay;
    protected com.xuexiang.xhttp2.cache.RxCache mRxCache;
    protected com.xuexiang.xhttp2.https.HttpsUtils.SSLParams mSSLParams;
    private boolean mSign;
    private java.lang.String mSubUrl;
    private boolean mTimeStamp;
    protected java.lang.String mUrl;
    protected long mWriteTimeOut;







    /* renamed from: com.xuexiang.xhttp2.request.BaseRequest$7 */
    static /* synthetic */ class C09347 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode = null;

        static {
                com.xuexiang.xhttp2.cache.model.CacheMode[] r0 = com.xuexiang.xhttp2.cache.model.CacheMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode = r0
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L1d
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L28
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.FIRST_REMOTE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L33
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.FIRST_CACHE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L3e
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.ONLY_REMOTE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L49
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.ONLY_CACHE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L54
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.CACHE_REMOTE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode     // Catch: java.lang.NoSuchFieldError -> L60
                com.xuexiang.xhttp2.cache.model.CacheMode r1 = com.xuexiang.xhttp2.cache.model.CacheMode.CACHE_REMOTE_DISTINCT     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    public BaseRequest(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mIsSyncRequest = r0
            r1 = 1
            r2.mIsOnMainThread = r1
            r2.mKeepJson = r0
            r2.mSign = r0
            r2.mTimeStamp = r0
            r2.mAccessToken = r0
            com.xuexiang.xhttp2.model.HttpHeaders r0 = new com.xuexiang.xhttp2.model.HttpHeaders
            r0.<init>()
            r2.mHeaders = r0
            com.xuexiang.xhttp2.model.HttpParams r0 = new com.xuexiang.xhttp2.model.HttpParams
            r0.<init>()
            r2.mParams = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mNetworkInterceptors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mInterceptors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mConverterFactories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mAdapterFactories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mCookies = r0
            android.content.Context r0 = com.xuexiang.xhttp2.XHttp.getContext()
            r2.mContext = r0
            r2.mUrl = r3
            java.lang.String r3 = com.xuexiang.xhttp2.XHttp.getBaseUrl()
            r2.mBaseUrl = r3
            java.lang.String r3 = com.xuexiang.xhttp2.XHttp.getSubUrl()
            r2.mSubUrl = r3
            java.lang.String r3 = r2.mBaseUrl
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L66
            java.lang.String r3 = r2.mBaseUrl
            okhttp3.HttpUrl r3 = okhttp3.HttpUrl.parse(r3)
            r2.mHttpUrl = r3
        L66:
            com.xuexiang.xhttp2.cache.model.CacheMode r3 = com.xuexiang.xhttp2.XHttp.getCacheMode()
            r2.mCacheMode = r3
            long r0 = com.xuexiang.xhttp2.XHttp.getCacheTime()
            r2.mCacheTime = r0
            int r3 = com.xuexiang.xhttp2.XHttp.getRetryCount()
            r2.mRetryCount = r3
            int r3 = com.xuexiang.xhttp2.XHttp.getRetryDelay()
            r2.mRetryDelay = r3
            int r3 = com.xuexiang.xhttp2.XHttp.getRetryIncreaseDelay()
            r2.mRetryIncreaseDelay = r3
            okhttp3.Cache r3 = com.xuexiang.xhttp2.XHttp.getHttpCache()
            r2.mCache = r3
            java.lang.String r3 = com.xuexiang.xhttp2.model.HttpHeaders.getAcceptLanguage()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L99
            java.lang.String r0 = "Accept-Language"
            r2.headers(r0, r3)
        L99:
            java.lang.String r3 = com.xuexiang.xhttp2.model.HttpHeaders.getUserAgent()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto La8
            java.lang.String r0 = "User-Agent"
            r2.headers(r0, r3)
        La8:
            com.xuexiang.xhttp2.model.HttpParams r3 = com.xuexiang.xhttp2.XHttp.getCommonParams()
            if (r3 == 0) goto Lb7
            com.xuexiang.xhttp2.model.HttpParams r3 = r2.mParams
            com.xuexiang.xhttp2.model.HttpParams r0 = com.xuexiang.xhttp2.XHttp.getCommonParams()
            r3.put(r0)
        Lb7:
            com.xuexiang.xhttp2.model.HttpHeaders r3 = com.xuexiang.xhttp2.XHttp.getCommonHeaders()
            if (r3 == 0) goto Lc6
            com.xuexiang.xhttp2.model.HttpHeaders r3 = r2.mHeaders
            com.xuexiang.xhttp2.model.HttpHeaders r0 = com.xuexiang.xhttp2.XHttp.getCommonHeaders()
            r3.put(r0)
        Lc6:
            return
    }

    private okhttp3.OkHttpClient.Builder generateOkClient() {
            r6 = this;
            long r0 = r6.mReadTimeOut
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L61
            long r0 = r6.mWriteTimeOut
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L61
            long r0 = r6.mConnectTimeout
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L61
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r0 = r6.mSSLParams
            if (r0 != 0) goto L61
            java.util.List<okhttp3.Cookie> r0 = r6.mCookies
            int r0 = r0.size()
            if (r0 != 0) goto L61
            javax.net.ssl.HostnameVerifier r0 = r6.mHostnameVerifier
            if (r0 != 0) goto L61
            java.net.Proxy r0 = r6.mProxy
            if (r0 != 0) goto L61
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r6.mHeaders
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L61
            okhttp3.OkHttpClient$Builder r0 = com.xuexiang.xhttp2.XHttp.getOkHttpClientBuilder()
            java.util.List r1 = r0.interceptors()
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            boolean r3 = r2 instanceof com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor
            if (r3 == 0) goto L3c
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = (com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor) r2
            boolean r3 = r6.mSign
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = r2.sign(r3)
            boolean r3 = r6.mTimeStamp
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = r2.timeStamp(r3)
            boolean r3 = r6.mAccessToken
            r2.accessToken(r3)
            goto L3c
        L60:
            return r0
        L61:
            okhttp3.OkHttpClient r0 = com.xuexiang.xhttp2.XHttp.getOkHttpClient()
            okhttp3.OkHttpClient$Builder r0 = r0.newBuilder()
            long r4 = r6.mReadTimeOut
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L74
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.readTimeout(r4, r1)
        L74:
            long r4 = r6.mWriteTimeOut
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L7f
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.writeTimeout(r4, r1)
        L7f:
            long r4 = r6.mConnectTimeout
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L8a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.connectTimeout(r4, r1)
        L8a:
            javax.net.ssl.HostnameVerifier r1 = r6.mHostnameVerifier
            if (r1 == 0) goto L91
            r0.hostnameVerifier(r1)
        L91:
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r1 = r6.mSSLParams
            if (r1 == 0) goto L9e
            javax.net.ssl.SSLSocketFactory r1 = r1.sSLSocketFactory
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r2 = r6.mSSLParams
            javax.net.ssl.X509TrustManager r2 = r2.trustManager
            r0.sslSocketFactory(r1, r2)
        L9e:
            java.net.Proxy r1 = r6.mProxy
            if (r1 == 0) goto La5
            r0.proxy(r1)
        La5:
            java.util.List<okhttp3.Cookie> r1 = r6.mCookies
            int r1 = r1.size()
            if (r1 <= 0) goto Lb6
            com.xuexiang.xhttp2.cookie.CookieManager r1 = com.xuexiang.xhttp2.XHttp.getCookieJar()
            java.util.List<okhttp3.Cookie> r2 = r6.mCookies
            r1.addCookies(r2)
        Lb6:
            java.util.List<okhttp3.Interceptor> r1 = r6.mInterceptors
            java.util.Iterator r1 = r1.iterator()
        Lbc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r1.next()
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            boolean r3 = r2 instanceof com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor
            if (r3 == 0) goto Le0
            r3 = r2
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r3 = (com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor) r3
            boolean r4 = r6.mSign
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r3 = r3.sign(r4)
            boolean r4 = r6.mTimeStamp
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r3 = r3.timeStamp(r4)
            boolean r4 = r6.mAccessToken
            r3.accessToken(r4)
        Le0:
            r0.addInterceptor(r2)
            goto Lbc
        Le4:
            java.util.List r1 = r0.interceptors()
            java.util.Iterator r1 = r1.iterator()
        Lec:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L110
            java.lang.Object r2 = r1.next()
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            boolean r3 = r2 instanceof com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor
            if (r3 == 0) goto Lec
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = (com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor) r2
            boolean r3 = r6.mSign
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = r2.sign(r3)
            boolean r3 = r6.mTimeStamp
            com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor r2 = r2.timeStamp(r3)
            boolean r3 = r6.mAccessToken
            r2.accessToken(r3)
            goto Lec
        L110:
            java.util.List<okhttp3.Interceptor> r1 = r6.mNetworkInterceptors
            int r1 = r1.size()
            if (r1 <= 0) goto L12e
            java.util.List<okhttp3.Interceptor> r1 = r6.mNetworkInterceptors
            java.util.Iterator r1 = r1.iterator()
        L11e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L12e
            java.lang.Object r2 = r1.next()
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            r0.addNetworkInterceptor(r2)
            goto L11e
        L12e:
            com.xuexiang.xhttp2.interceptor.HeadersInterceptor r1 = new com.xuexiang.xhttp2.interceptor.HeadersInterceptor
            com.xuexiang.xhttp2.model.HttpHeaders r2 = r6.mHeaders
            r1.<init>(r2)
            r0.addInterceptor(r1)
            return r0
    }

    private retrofit2.Retrofit.Builder generateRetrofit() {
            r3 = this;
            java.util.List<retrofit2.Converter$Factory> r0 = r3.mConverterFactories
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            java.util.List<retrofit2.CallAdapter$Factory> r0 = r3.mAdapterFactories
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            retrofit2.Retrofit$Builder r0 = com.xuexiang.xhttp2.XHttp.getRetrofitBuilder()
            java.lang.String r1 = r3.mBaseUrl
            retrofit2.Retrofit$Builder r0 = r0.baseUrl(r1)
            return r0
        L1b:
            retrofit2.Retrofit$Builder r0 = new retrofit2.Retrofit$Builder
            r0.<init>()
            java.util.List<retrofit2.Converter$Factory> r1 = r3.mConverterFactories
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e
            java.util.List<retrofit2.Converter$Factory> r1 = r3.mConverterFactories
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            retrofit2.Converter$Factory r2 = (retrofit2.Converter.Factory) r2
            r0.addConverterFactory(r2)
            goto L2e
        L3e:
            retrofit2.Retrofit$Builder r1 = com.xuexiang.xhttp2.XHttp.getRetrofitBuilder()
            java.util.List r1 = r1.converterFactories()
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()
            retrofit2.Converter$Factory r2 = (retrofit2.Converter.Factory) r2
            r0.addConverterFactory(r2)
            goto L4a
        L5a:
            java.util.List<retrofit2.CallAdapter$Factory> r1 = r3.mAdapterFactories
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L78
            java.util.List<retrofit2.CallAdapter$Factory> r1 = r3.mAdapterFactories
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r1.next()
            retrofit2.CallAdapter$Factory r2 = (retrofit2.CallAdapter.Factory) r2
            r0.addCallAdapterFactory(r2)
            goto L68
        L78:
            retrofit2.Retrofit$Builder r1 = com.xuexiang.xhttp2.XHttp.getRetrofitBuilder()
            java.util.List r1 = r1.callAdapterFactories()
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r1.next()
            retrofit2.CallAdapter$Factory r2 = (retrofit2.CallAdapter.Factory) r2
            r0.addCallAdapterFactory(r2)
            goto L84
        L94:
            java.lang.String r1 = r3.mBaseUrl
            retrofit2.Retrofit$Builder r0 = r0.baseUrl(r1)
            return r0
    }

    private com.xuexiang.xhttp2.cache.RxCache.Builder generateRxCache() {
            r7 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = com.xuexiang.xhttp2.XHttp.getRxCacheBuilder()
            int[] r1 = com.xuexiang.xhttp2.request.BaseRequest.C09347.$SwitchMap$com$xuexiang$xhttp2$cache$model$CacheMode
            com.xuexiang.xhttp2.cache.model.CacheMode r2 = r7.mCacheMode
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto Lca;
                case 2: goto L55;
                case 3: goto L13;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L13;
                case 7: goto L13;
                case 8: goto L13;
                default: goto L11;
            }
        L11:
            goto Ld9
        L13:
            java.util.List<okhttp3.Interceptor> r1 = r7.mInterceptors
            com.xuexiang.xhttp2.interceptor.NoCacheInterceptor r2 = new com.xuexiang.xhttp2.interceptor.NoCacheInterceptor
            r2.<init>()
            r1.add(r2)
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r1 = r7.mDiskConverter
            java.lang.String r2 = "mCacheKey == null"
            if (r1 != 0) goto L35
            java.lang.String r1 = r7.mCacheKey
            java.lang.Object r1 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            com.xuexiang.xhttp2.cache.RxCache$Builder r1 = r0.cacheKey(r1)
            long r2 = r7.mCacheTime
            r1.cacheTime(r2)
            return r0
        L35:
            com.xuexiang.xhttp2.cache.RxCache r0 = com.xuexiang.xhttp2.XHttp.getRxCache()
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r0.newBuilder()
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r1 = r7.mDiskConverter
            com.xuexiang.xhttp2.cache.RxCache$Builder r1 = r0.diskConverter(r1)
            java.lang.String r3 = r7.mCacheKey
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            com.xuexiang.xhttp2.cache.RxCache$Builder r1 = r1.cacheKey(r2)
            long r2 = r7.mCacheTime
            r1.cacheTime(r2)
            return r0
        L55:
            okhttp3.Cache r1 = r7.mCache
            if (r1 != 0) goto L90
            java.io.File r1 = com.xuexiang.xhttp2.XHttp.getCacheDirectory()
            if (r1 != 0) goto L6f
            java.io.File r1 = new java.io.File
            android.content.Context r2 = com.xuexiang.xhttp2.XHttp.getContext()
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r3 = "okhttp-cache"
            r1.<init>(r2, r3)
            goto L7e
        L6f:
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L7e
            boolean r2 = r1.exists()
            if (r2 != 0) goto L7e
            r1.mkdirs()
        L7e:
            okhttp3.Cache r2 = new okhttp3.Cache
            r3 = 5242880(0x500000, double:2.590327E-317)
            long r5 = com.xuexiang.xhttp2.XHttp.getCacheMaxSize()
            long r3 = java.lang.Math.max(r3, r5)
            r2.<init>(r1, r3)
            r7.mCache = r2
        L90:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = -1
            long r4 = r7.mCacheTime
            long r2 = java.lang.Math.max(r2, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "max-age=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            com.xuexiang.xhttp2.interceptor.CacheInterceptor r2 = new com.xuexiang.xhttp2.interceptor.CacheInterceptor
            android.content.Context r3 = com.xuexiang.xhttp2.XHttp.getContext()
            r2.<init>(r3, r1)
            com.xuexiang.xhttp2.interceptor.CacheInterceptorOffline r3 = new com.xuexiang.xhttp2.interceptor.CacheInterceptorOffline
            android.content.Context r4 = com.xuexiang.xhttp2.XHttp.getContext()
            r3.<init>(r4, r1)
            java.util.List<okhttp3.Interceptor> r1 = r7.mNetworkInterceptors
            r1.add(r2)
            java.util.List<okhttp3.Interceptor> r1 = r7.mNetworkInterceptors
            r1.add(r3)
            java.util.List<okhttp3.Interceptor> r1 = r7.mInterceptors
            r1.add(r3)
            goto Ld9
        Lca:
            com.xuexiang.xhttp2.interceptor.NoCacheInterceptor r1 = new com.xuexiang.xhttp2.interceptor.NoCacheInterceptor
            r1.<init>()
            java.util.List<okhttp3.Interceptor> r2 = r7.mInterceptors
            r2.add(r1)
            java.util.List<okhttp3.Interceptor> r2 = r7.mNetworkInterceptors
            r2.add(r1)
        Ld9:
            return r0
    }

    public R accessToken(boolean r1) {
            r0 = this;
            r0.mAccessToken = r1
            return r0
    }

    public R addCallAdapterFactory(retrofit2.CallAdapter.Factory r2) {
            r1 = this;
            java.util.List<retrofit2.CallAdapter$Factory> r0 = r1.mAdapterFactories
            r0.add(r2)
            return r1
    }

    public R addConverterFactory(retrofit2.Converter.Factory r2) {
            r1 = this;
            java.util.List<retrofit2.Converter$Factory> r0 = r1.mConverterFactories
            r0.add(r2)
            return r1
    }

    public R addCookie(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            okhttp3.Cookie$Builder r0 = new okhttp3.Cookie$Builder
            r0.<init>()
            okhttp3.Cookie$Builder r2 = r0.name(r2)
            okhttp3.Cookie$Builder r2 = r2.value(r3)
            okhttp3.HttpUrl r3 = r1.mHttpUrl
            java.lang.String r3 = r3.host()
            okhttp3.Cookie$Builder r2 = r2.domain(r3)
            okhttp3.Cookie r2 = r2.build()
            java.util.List<okhttp3.Cookie> r3 = r1.mCookies
            r3.add(r2)
            return r1
    }

    public R addCookie(okhttp3.Cookie r2) {
            r1 = this;
            java.util.List<okhttp3.Cookie> r0 = r1.mCookies
            r0.add(r2)
            return r1
    }

    public R addCookies(java.util.List<okhttp3.Cookie> r2) {
            r1 = this;
            java.util.List<okhttp3.Cookie> r0 = r1.mCookies
            r0.addAll(r2)
            return r1
    }

    public R addInterceptor(okhttp3.Interceptor r3) {
            r2 = this;
            java.util.List<okhttp3.Interceptor> r0 = r2.mInterceptors
            java.lang.String r1 = "interceptor == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            r0.add(r3)
            return r2
    }

    public R addNetworkInterceptor(okhttp3.Interceptor r3) {
            r2 = this;
            java.util.List<okhttp3.Interceptor> r0 = r2.mNetworkInterceptors
            java.lang.String r1 = "interceptor == null"
            java.lang.Object r3 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r1)
            r0.add(r3)
            return r2
    }

    public R baseUrl(java.lang.String r2) {
            r1 = this;
            r1.mBaseUrl = r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            okhttp3.HttpUrl r2 = okhttp3.HttpUrl.parse(r2)
            r1.mHttpUrl = r2
        Le:
            return r1
    }

    protected R build() {
            r4 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = r4.generateRxCache()
            okhttp3.OkHttpClient$Builder r1 = r4.generateOkClient()
            com.xuexiang.xhttp2.cache.model.CacheMode r2 = r4.mCacheMode
            com.xuexiang.xhttp2.cache.model.CacheMode r3 = com.xuexiang.xhttp2.cache.model.CacheMode.DEFAULT
            if (r2 != r3) goto L13
            okhttp3.Cache r2 = r4.mCache
            r1.cache(r2)
        L13:
            retrofit2.Retrofit$Builder r2 = r4.generateRetrofit()
            retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory r3 = retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create()
            r2.addCallAdapterFactory(r3)
            okhttp3.OkHttpClient r1 = r1.build()
            r4.mOkHttpClient = r1
            r2.client(r1)
            retrofit2.Retrofit r1 = r2.build()
            r4.mRetrofit = r1
            com.xuexiang.xhttp2.cache.RxCache r0 = r0.build()
            r4.mRxCache = r0
            retrofit2.Retrofit r0 = r4.mRetrofit
            java.lang.Class<com.xuexiang.xhttp2.api.ApiService> r1 = com.xuexiang.xhttp2.api.ApiService.class
            java.lang.Object r0 = r0.create(r1)
            com.xuexiang.xhttp2.api.ApiService r0 = (com.xuexiang.xhttp2.api.ApiService) r0
            r4.mApiManager = r0
            return r4
    }

    public R cacheDiskConverter(com.xuexiang.xhttp2.cache.converter.IDiskConverter r2) {
            r1 = this;
            java.lang.String r0 = "converter == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r2 = (com.xuexiang.xhttp2.cache.converter.IDiskConverter) r2
            r1.mDiskConverter = r2
            return r1
    }

    public R cacheKey(java.lang.String r1) {
            r0 = this;
            r0.mCacheKey = r1
            return r0
    }

    public R cacheMode(com.xuexiang.xhttp2.cache.model.CacheMode r1) {
            r0 = this;
            r0.mCacheMode = r1
            return r0
    }

    public R cacheTime(long r4) {
            r3 = this;
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            r4 = r0
        L7:
            r3.mCacheTime = r4
            return r3
    }

    public R certificates(java.io.InputStream r1, java.lang.String r2, java.io.InputStream... r3) {
            r0 = this;
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r1 = com.xuexiang.xhttp2.https.HttpsUtils.getSslSocketFactory(r1, r2, r3)
            r0.mSSLParams = r1
            return r0
    }

    public R certificates(java.io.InputStream... r2) {
            r1 = this;
            r0 = 0
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r2 = com.xuexiang.xhttp2.https.HttpsUtils.getSslSocketFactory(r0, r0, r2)
            r1.mSSLParams = r2
            return r1
    }

    public R connectTimeout(long r1) {
            r0 = this;
            r0.mConnectTimeout = r1
            return r0
    }

    public <T> io.reactivex.Observable<T> execute(com.xuexiang.xhttp2.callback.CallClazzProxy<? extends com.xuexiang.xhttp2.model.ApiResult<T>, T> r8) {
            r7 = this;
            com.xuexiang.xhttp2.request.BaseRequest r0 = r7.build()
            io.reactivex.Observable r0 = r0.generateRequest()
            com.xuexiang.xhttp2.transform.func.ApiResultFunc r1 = new com.xuexiang.xhttp2.transform.func.ApiResultFunc
            java.lang.reflect.Type r2 = r8.getType()
            boolean r3 = r7.mKeepJson
            r1.<init>(r2, r3)
            io.reactivex.Observable r0 = r0.map(r1)
            com.xuexiang.xhttp2.transform.HttpResultTransformer r1 = new com.xuexiang.xhttp2.transform.HttpResultTransformer
            r1.<init>()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r1 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            boolean r2 = r7.mIsSyncRequest
            boolean r3 = r7.mIsOnMainThread
            r1.<init>(r2, r3)
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.cache.RxCache r1 = r7.mRxCache
            com.xuexiang.xhttp2.cache.model.CacheMode r2 = r7.mCacheMode
            java.lang.reflect.Type r8 = r8.getCallType()
            io.reactivex.ObservableTransformer r8 = r1.transformer(r2, r8)
            io.reactivex.Observable r8 = r0.compose(r8)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r6 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r1 = r7.mRetryCount
            int r0 = r7.mRetryDelay
            long r2 = (long) r0
            int r0 = r7.mRetryIncreaseDelay
            long r4 = (long) r0
            r0 = r6
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r8 = r8.retryWhen(r6)
            com.xuexiang.xhttp2.request.BaseRequest$6 r0 = new com.xuexiang.xhttp2.request.BaseRequest$6
            r0.<init>(r7)
            io.reactivex.Observable r8 = r8.compose(r0)
            return r8
    }

    public <T> io.reactivex.Observable<T> execute(java.lang.Class<T> r2) {
            r1 = this;
            com.xuexiang.xhttp2.request.BaseRequest$1 r0 = new com.xuexiang.xhttp2.request.BaseRequest$1
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = r1.execute(r0)
            return r2
    }

    public <T> io.reactivex.Observable<T> execute(java.lang.reflect.Type r2) {
            r1 = this;
            com.xuexiang.xhttp2.request.BaseRequest$2 r0 = new com.xuexiang.xhttp2.request.BaseRequest$2
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = r1.execute(r0)
            return r2
    }

    public <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.callback.CallBack<T> r2) {
            r1 = this;
            com.xuexiang.xhttp2.request.BaseRequest$3 r0 = new com.xuexiang.xhttp2.request.BaseRequest$3
            r0.<init>(r1, r2)
            io.reactivex.disposables.Disposable r2 = r1.execute(r0)
            return r2
    }

    public <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.callback.CallBackProxy<? extends com.xuexiang.xhttp2.model.ApiResult<T>, T> r4) {
            r3 = this;
            com.xuexiang.xhttp2.request.BaseRequest r0 = r3.build()
            io.reactivex.Observable r1 = r3.generateRequest()
            io.reactivex.Observable r0 = r0.toObservable(r1, r4)
            java.lang.Class<com.xuexiang.xhttp2.cache.model.CacheResult> r1 = com.xuexiang.xhttp2.cache.model.CacheResult.class
            java.lang.reflect.Type r2 = r4.getRawType()
            if (r1 == r2) goto L2d
            com.xuexiang.xhttp2.request.BaseRequest$5 r1 = new com.xuexiang.xhttp2.request.BaseRequest$5
            r1.<init>(r3)
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.subsciber.CallBackSubscriber r1 = new com.xuexiang.xhttp2.subsciber.CallBackSubscriber
            com.xuexiang.xhttp2.callback.CallBack r4 = r4.getCallBack()
            r1.<init>(r4)
            io.reactivex.Observer r4 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4
            return r4
        L2d:
            com.xuexiang.xhttp2.subsciber.CallBackSubscriber r1 = new com.xuexiang.xhttp2.subsciber.CallBackSubscriber
            com.xuexiang.xhttp2.callback.CallBack r4 = r4.getCallBack()
            r1.<init>(r4)
            io.reactivex.Observer r4 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4
            return r4
    }

    protected abstract io.reactivex.Observable<okhttp3.ResponseBody> generateRequest();

    public java.lang.String getBaseUrl() {
            r1 = this;
            java.lang.String r0 = r1.mBaseUrl
            return r0
    }

    public com.xuexiang.xhttp2.model.HttpParams getParams() {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            return r0
    }

    public java.lang.String getUrl() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mSubUrl
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.mUrl
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public R headers(com.xuexiang.xhttp2.model.HttpHeaders r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mHeaders
            r0.put(r2)
            return r1
    }

    public R headers(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mHeaders
            r0.put(r2, r3)
            return r1
    }

    public R hostnameVerifier(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.mHostnameVerifier = r1
            return r0
    }

    public R keepJson(boolean r1) {
            r0 = this;
            r0.mKeepJson = r1
            return r0
    }

    public R okCache(okhttp3.Cache r1) {
            r0 = this;
            r0.mCache = r1
            return r0
    }

    public R okproxy(java.net.Proxy r1) {
            r0 = this;
            r0.mProxy = r1
            return r0
    }

    public R onMainThread(boolean r1) {
            r0 = this;
            r0.mIsOnMainThread = r1
            return r0
    }

    public R params(com.xuexiang.xhttp2.model.HttpParams r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2)
            return r1
    }

    public R params(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2, r3)
            return r1
    }

    public R params(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2)
            return r1
    }

    public R readTimeOut(long r1) {
            r0 = this;
            r0.mReadTimeOut = r1
            return r0
    }

    public R removeAllHeaders() {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mHeaders
            r0.clear()
            return r1
    }

    public R removeAllParams() {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.clear()
            return r1
    }

    public R removeHeader(java.lang.String r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpHeaders r0 = r1.mHeaders
            r0.remove(r2)
            return r1
    }

    public R removeParam(java.lang.String r2) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.remove(r2)
            return r1
    }

    public R retryCount(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.mRetryCount = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mRetryCount must > 0"
            r2.<init>(r0)
            throw r2
    }

    public R retryDelay(int r2) {
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

    public R retryIncreaseDelay(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.mRetryIncreaseDelay = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mRetryIncreaseDelay must > 0"
            r2.<init>(r0)
            throw r2
    }

    public R sign(boolean r1) {
            r0 = this;
            r0.mSign = r1
            return r0
    }

    public R subUrl(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "mSubUrl == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mSubUrl = r2
            return r1
    }

    public R syncRequest(boolean r1) {
            r0 = this;
            r0.mIsSyncRequest = r1
            return r0
    }

    public R threadType(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "executeToMain"
            boolean r0 = r0.equals(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            com.xuexiang.xhttp2.request.BaseRequest r4 = r3.syncRequest(r2)
            r4.onMainThread(r1)
            goto L31
        L12:
            java.lang.String r0 = "executeToIO"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L22
            com.xuexiang.xhttp2.request.BaseRequest r4 = r3.syncRequest(r2)
            r4.onMainThread(r2)
            goto L31
        L22:
            java.lang.String r0 = "executeInThread"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L31
            com.xuexiang.xhttp2.request.BaseRequest r4 = r3.syncRequest(r1)
            r4.onMainThread(r2)
        L31:
            return r3
    }

    public R timeOut(long r1) {
            r0 = this;
            r0.mReadTimeOut = r1
            r0.mWriteTimeOut = r1
            r0.mConnectTimeout = r1
            return r0
    }

    public R timeStamp(boolean r1) {
            r0 = this;
            r0.mTimeStamp = r1
            return r0
    }

    protected <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> toObservable(io.reactivex.Observable r7, com.xuexiang.xhttp2.callback.CallBackProxy<? extends com.xuexiang.xhttp2.model.ApiResult<T>, T> r8) {
            r6 = this;
            com.xuexiang.xhttp2.transform.func.ApiResultFunc r0 = new com.xuexiang.xhttp2.transform.func.ApiResultFunc
            if (r8 == 0) goto L9
            java.lang.reflect.Type r1 = r8.getType()
            goto L12
        L9:
            com.xuexiang.xhttp2.request.BaseRequest$4 r1 = new com.xuexiang.xhttp2.request.BaseRequest$4
            r1.<init>(r6)
            java.lang.reflect.Type r1 = r1.getType()
        L12:
            boolean r2 = r6.mKeepJson
            r0.<init>(r1, r2)
            io.reactivex.Observable r7 = r7.map(r0)
            com.xuexiang.xhttp2.transform.HttpResultTransformer r0 = new com.xuexiang.xhttp2.transform.HttpResultTransformer
            r0.<init>()
            io.reactivex.Observable r7 = r7.compose(r0)
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            boolean r1 = r6.mIsSyncRequest
            boolean r2 = r6.mIsOnMainThread
            r0.<init>(r1, r2)
            io.reactivex.Observable r7 = r7.compose(r0)
            com.xuexiang.xhttp2.cache.RxCache r0 = r6.mRxCache
            com.xuexiang.xhttp2.cache.model.CacheMode r1 = r6.mCacheMode
            com.xuexiang.xhttp2.callback.CallBack r8 = r8.getCallBack()
            java.lang.reflect.Type r8 = r8.getType()
            io.reactivex.ObservableTransformer r8 = r0.transformer(r1, r8)
            io.reactivex.Observable r7 = r7.compose(r8)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r8 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r1 = r6.mRetryCount
            int r0 = r6.mRetryDelay
            long r2 = (long) r0
            int r0 = r6.mRetryIncreaseDelay
            long r4 = (long) r0
            r0 = r8
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r7 = r7.retryWhen(r8)
            return r7
    }

    public R url(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "mUrl == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mUrl = r2
            return r1
    }

    public R writeTimeOut(long r1) {
            r0 = this;
            r0.mWriteTimeOut = r1
            return r0
    }
}
