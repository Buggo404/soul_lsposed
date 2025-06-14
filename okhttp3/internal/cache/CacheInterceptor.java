package okhttp3.internal.cache;

/* loaded from: classes.dex */
public final class CacheInterceptor implements okhttp3.Interceptor {

    @javax.annotation.Nullable
    final okhttp3.internal.cache.InternalCache cache;


    public CacheInterceptor(@javax.annotation.Nullable okhttp3.internal.cache.InternalCache r1) {
            r0 = this;
            r0.<init>()
            r0.cache = r1
            return
    }

    private okhttp3.Response cacheWritingResponse(okhttp3.internal.cache.CacheRequest r5, okhttp3.Response r6) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L3
            return r6
        L3:
            okio.Sink r0 = r5.body()
            if (r0 != 0) goto La
            return r6
        La:
            okhttp3.ResponseBody r1 = r6.body()
            okio.BufferedSource r1 = r1.source()
            okio.BufferedSink r0 = okio.Okio.buffer(r0)
            okhttp3.internal.cache.CacheInterceptor$1 r2 = new okhttp3.internal.cache.CacheInterceptor$1
            r2.<init>(r4, r1, r5, r0)
            java.lang.String r5 = "Content-Type"
            java.lang.String r5 = r6.header(r5)
            okhttp3.ResponseBody r0 = r6.body()
            long r0 = r0.contentLength()
            okhttp3.Response$Builder r6 = r6.newBuilder()
            okhttp3.internal.http.RealResponseBody r3 = new okhttp3.internal.http.RealResponseBody
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r3.<init>(r5, r0, r2)
            okhttp3.Response$Builder r5 = r6.body(r3)
            okhttp3.Response r5 = r5.build()
            return r5
    }

    private static okhttp3.Headers combine(okhttp3.Headers r7, okhttp3.Headers r8) {
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L40
            java.lang.String r4 = r7.name(r3)
            java.lang.String r5 = r7.value(r3)
            java.lang.String r6 = "Warning"
            boolean r6 = r6.equalsIgnoreCase(r4)
            if (r6 == 0) goto L26
            java.lang.String r6 = "1"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L26
            goto L3d
        L26:
            boolean r6 = isContentSpecificHeader(r4)
            if (r6 != 0) goto L38
            boolean r6 = isEndToEnd(r4)
            if (r6 == 0) goto L38
            java.lang.String r6 = r8.get(r4)
            if (r6 != 0) goto L3d
        L38:
            okhttp3.internal.Internal r6 = okhttp3.internal.Internal.instance
            r6.addLenient(r0, r4, r5)
        L3d:
            int r3 = r3 + 1
            goto Lb
        L40:
            int r7 = r8.size()
        L44:
            if (r2 >= r7) goto L62
            java.lang.String r1 = r8.name(r2)
            boolean r3 = isContentSpecificHeader(r1)
            if (r3 != 0) goto L5f
            boolean r3 = isEndToEnd(r1)
            if (r3 == 0) goto L5f
            okhttp3.internal.Internal r3 = okhttp3.internal.Internal.instance
            java.lang.String r4 = r8.value(r2)
            r3.addLenient(r0, r1, r4)
        L5f:
            int r2 = r2 + 1
            goto L44
        L62:
            okhttp3.Headers r7 = r0.build()
            return r7
    }

    static boolean isContentSpecificHeader(java.lang.String r1) {
            java.lang.String r0 = "Content-Length"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Content-Encoding"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Content-Type"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    static boolean isEndToEnd(java.lang.String r1) {
            java.lang.String r0 = "Connection"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Keep-Alive"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authenticate"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "TE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Trailers"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Transfer-Encoding"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Upgrade"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L42
            r1 = 1
            goto L43
        L42:
            r1 = 0
        L43:
            return r1
    }

    private static okhttp3.Response stripBody(okhttp3.Response r1) {
            if (r1 == 0) goto L15
            okhttp3.ResponseBody r0 = r1.body()
            if (r0 == 0) goto L15
            okhttp3.Response$Builder r1 = r1.newBuilder()
            r0 = 0
            okhttp3.Response$Builder r1 = r1.body(r0)
            okhttp3.Response r1 = r1.build()
        L15:
            return r1
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r6) throws java.io.IOException {
            r5 = this;
            okhttp3.internal.cache.InternalCache r0 = r5.cache
            if (r0 == 0) goto Ld
            okhttp3.Request r1 = r6.request()
            okhttp3.Response r0 = r0.get(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = java.lang.System.currentTimeMillis()
            okhttp3.internal.cache.CacheStrategy$Factory r3 = new okhttp3.internal.cache.CacheStrategy$Factory
            okhttp3.Request r4 = r6.request()
            r3.<init>(r1, r4, r0)
            okhttp3.internal.cache.CacheStrategy r1 = r3.get()
            okhttp3.Request r2 = r1.networkRequest
            okhttp3.Response r3 = r1.cacheResponse
            okhttp3.internal.cache.InternalCache r4 = r5.cache
            if (r4 == 0) goto L2a
            r4.trackResponse(r1)
        L2a:
            if (r0 == 0) goto L35
            if (r3 != 0) goto L35
            okhttp3.ResponseBody r1 = r0.body()
            okhttp3.internal.Util.closeQuietly(r1)
        L35:
            if (r2 != 0) goto L71
            if (r3 != 0) goto L71
            okhttp3.Response$Builder r0 = new okhttp3.Response$Builder
            r0.<init>()
            okhttp3.Request r6 = r6.request()
            okhttp3.Response$Builder r6 = r0.request(r6)
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            okhttp3.Response$Builder r6 = r6.protocol(r0)
            r0 = 504(0x1f8, float:7.06E-43)
            okhttp3.Response$Builder r6 = r6.code(r0)
            java.lang.String r0 = "Unsatisfiable Request (only-if-cached)"
            okhttp3.Response$Builder r6 = r6.message(r0)
            okhttp3.ResponseBody r0 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r6 = r6.body(r0)
            r0 = -1
            okhttp3.Response$Builder r6 = r6.sentRequestAtMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r6 = r6.receivedResponseAtMillis(r0)
            okhttp3.Response r6 = r6.build()
            return r6
        L71:
            if (r2 != 0) goto L84
            okhttp3.Response$Builder r6 = r3.newBuilder()
            okhttp3.Response r0 = stripBody(r3)
            okhttp3.Response$Builder r6 = r6.cacheResponse(r0)
            okhttp3.Response r6 = r6.build()
            return r6
        L84:
            okhttp3.Response r6 = r6.proceed(r2)     // Catch: java.lang.Throwable -> L131
            if (r6 != 0) goto L93
            if (r0 == 0) goto L93
            okhttp3.ResponseBody r0 = r0.body()
            okhttp3.internal.Util.closeQuietly(r0)
        L93:
            if (r3 == 0) goto Lee
            int r0 = r6.code()
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto Le7
            okhttp3.Response$Builder r0 = r3.newBuilder()
            okhttp3.Headers r1 = r3.headers()
            okhttp3.Headers r2 = r6.headers()
            okhttp3.Headers r1 = combine(r1, r2)
            okhttp3.Response$Builder r0 = r0.headers(r1)
            long r1 = r6.sentRequestAtMillis()
            okhttp3.Response$Builder r0 = r0.sentRequestAtMillis(r1)
            long r1 = r6.receivedResponseAtMillis()
            okhttp3.Response$Builder r0 = r0.receivedResponseAtMillis(r1)
            okhttp3.Response r1 = stripBody(r3)
            okhttp3.Response$Builder r0 = r0.cacheResponse(r1)
            okhttp3.Response r1 = stripBody(r6)
            okhttp3.Response$Builder r0 = r0.networkResponse(r1)
            okhttp3.Response r0 = r0.build()
            okhttp3.ResponseBody r6 = r6.body()
            r6.close()
            okhttp3.internal.cache.InternalCache r6 = r5.cache
            r6.trackConditionalCacheHit()
            okhttp3.internal.cache.InternalCache r6 = r5.cache
            r6.update(r3, r0)
            return r0
        Le7:
            okhttp3.ResponseBody r0 = r3.body()
            okhttp3.internal.Util.closeQuietly(r0)
        Lee:
            okhttp3.Response$Builder r0 = r6.newBuilder()
            okhttp3.Response r1 = stripBody(r3)
            okhttp3.Response$Builder r0 = r0.cacheResponse(r1)
            okhttp3.Response r6 = stripBody(r6)
            okhttp3.Response$Builder r6 = r0.networkResponse(r6)
            okhttp3.Response r6 = r6.build()
            okhttp3.internal.cache.InternalCache r0 = r5.cache
            if (r0 == 0) goto L130
            boolean r0 = okhttp3.internal.http.HttpHeaders.hasBody(r6)
            if (r0 == 0) goto L121
            boolean r0 = okhttp3.internal.cache.CacheStrategy.isCacheable(r6, r2)
            if (r0 == 0) goto L121
            okhttp3.internal.cache.InternalCache r0 = r5.cache
            okhttp3.internal.cache.CacheRequest r0 = r0.put(r6)
            okhttp3.Response r6 = r5.cacheWritingResponse(r0, r6)
            return r6
        L121:
            java.lang.String r0 = r2.method()
            boolean r0 = okhttp3.internal.http.HttpMethod.invalidatesCache(r0)
            if (r0 == 0) goto L130
            okhttp3.internal.cache.InternalCache r0 = r5.cache     // Catch: java.io.IOException -> L130
            r0.remove(r2)     // Catch: java.io.IOException -> L130
        L130:
            return r6
        L131:
            r6 = move-exception
            if (r0 == 0) goto L13b
            okhttp3.ResponseBody r0 = r0.body()
            okhttp3.internal.Util.closeQuietly(r0)
        L13b:
            throw r6
    }
}
