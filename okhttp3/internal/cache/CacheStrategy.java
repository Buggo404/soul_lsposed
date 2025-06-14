package okhttp3.internal.cache;

/* loaded from: classes.dex */
public final class CacheStrategy {

    @javax.annotation.Nullable
    public final okhttp3.Response cacheResponse;

    @javax.annotation.Nullable
    public final okhttp3.Request networkRequest;

    public static class Factory {
        private int ageSeconds;
        final okhttp3.Response cacheResponse;
        private java.lang.String etag;
        private java.util.Date expires;
        private java.util.Date lastModified;
        private java.lang.String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final okhttp3.Request request;
        private long sentRequestMillis;
        private java.util.Date servedDate;
        private java.lang.String servedDateString;

        public Factory(long r4, okhttp3.Request r6, okhttp3.Response r7) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.ageSeconds = r0
                r3.nowMillis = r4
                r3.request = r6
                r3.cacheResponse = r7
                if (r7 == 0) goto L7a
                long r4 = r7.sentRequestAtMillis()
                r3.sentRequestMillis = r4
                long r4 = r7.receivedResponseAtMillis()
                r3.receivedResponseMillis = r4
                okhttp3.Headers r4 = r7.headers()
                int r5 = r4.size()
                r6 = 0
            L23:
                if (r6 >= r5) goto L7a
                java.lang.String r7 = r4.name(r6)
                java.lang.String r1 = r4.value(r6)
                java.lang.String r2 = "Date"
                boolean r2 = r2.equalsIgnoreCase(r7)
                if (r2 == 0) goto L3e
                java.util.Date r7 = okhttp3.internal.http.HttpDate.parse(r1)
                r3.servedDate = r7
                r3.servedDateString = r1
                goto L77
            L3e:
                java.lang.String r2 = "Expires"
                boolean r2 = r2.equalsIgnoreCase(r7)
                if (r2 == 0) goto L4d
                java.util.Date r7 = okhttp3.internal.http.HttpDate.parse(r1)
                r3.expires = r7
                goto L77
            L4d:
                java.lang.String r2 = "Last-Modified"
                boolean r2 = r2.equalsIgnoreCase(r7)
                if (r2 == 0) goto L5e
                java.util.Date r7 = okhttp3.internal.http.HttpDate.parse(r1)
                r3.lastModified = r7
                r3.lastModifiedString = r1
                goto L77
            L5e:
                java.lang.String r2 = "ETag"
                boolean r2 = r2.equalsIgnoreCase(r7)
                if (r2 == 0) goto L69
                r3.etag = r1
                goto L77
            L69:
                java.lang.String r2 = "Age"
                boolean r7 = r2.equalsIgnoreCase(r7)
                if (r7 == 0) goto L77
                int r7 = okhttp3.internal.http.HttpHeaders.parseSeconds(r1, r0)
                r3.ageSeconds = r7
            L77:
                int r6 = r6 + 1
                goto L23
            L7a:
                return
        }

        private long cacheResponseAge() {
                r9 = this;
                java.util.Date r0 = r9.servedDate
                r1 = 0
                if (r0 == 0) goto L11
                long r3 = r9.receivedResponseMillis
                long r5 = r0.getTime()
                long r3 = r3 - r5
                long r1 = java.lang.Math.max(r1, r3)
            L11:
                int r0 = r9.ageSeconds
                r3 = -1
                if (r0 == r3) goto L23
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                int r3 = r9.ageSeconds
                long r3 = (long) r3
                long r3 = r0.toMillis(r3)
                long r1 = java.lang.Math.max(r1, r3)
            L23:
                long r3 = r9.receivedResponseMillis
                long r5 = r9.sentRequestMillis
                long r5 = r3 - r5
                long r7 = r9.nowMillis
                long r7 = r7 - r3
                long r1 = r1 + r5
                long r1 = r1 + r7
                return r1
        }

        private long computeFreshnessLifetime() {
                r7 = this;
                okhttp3.Response r0 = r7.cacheResponse
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r1 = r0.maxAgeSeconds()
                r2 = -1
                if (r1 == r2) goto L19
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxAgeSeconds()
                long r2 = (long) r0
                long r0 = r1.toMillis(r2)
                return r0
            L19:
                java.util.Date r0 = r7.expires
                r1 = 0
                if (r0 == 0) goto L37
                java.util.Date r0 = r7.servedDate
                if (r0 == 0) goto L28
                long r3 = r0.getTime()
                goto L2a
            L28:
                long r3 = r7.receivedResponseMillis
            L2a:
                java.util.Date r0 = r7.expires
                long r5 = r0.getTime()
                long r5 = r5 - r3
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 <= 0) goto L36
                r1 = r5
            L36:
                return r1
            L37:
                java.util.Date r0 = r7.lastModified
                if (r0 == 0) goto L65
                okhttp3.Response r0 = r7.cacheResponse
                okhttp3.Request r0 = r0.request()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.query()
                if (r0 != 0) goto L65
                java.util.Date r0 = r7.servedDate
                if (r0 == 0) goto L54
                long r3 = r0.getTime()
                goto L56
            L54:
                long r3 = r7.sentRequestMillis
            L56:
                java.util.Date r0 = r7.lastModified
                long r5 = r0.getTime()
                long r3 = r3 - r5
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L65
                r0 = 10
                long r1 = r3 / r0
            L65:
                return r1
        }

        private okhttp3.internal.cache.CacheStrategy getCandidate() {
                r13 = this;
                okhttp3.Response r0 = r13.cacheResponse
                r1 = 0
                if (r0 != 0) goto Ld
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            Ld:
                okhttp3.Request r0 = r13.request
                boolean r0 = r0.isHttps()
                if (r0 == 0) goto L25
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Handshake r0 = r0.handshake()
                if (r0 != 0) goto L25
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L25:
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Request r2 = r13.request
                boolean r0 = okhttp3.internal.cache.CacheStrategy.isCacheable(r0, r2)
                if (r0 != 0) goto L37
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L37:
                okhttp3.Request r0 = r13.request
                okhttp3.CacheControl r0 = r0.cacheControl()
                boolean r2 = r0.noCache()
                if (r2 != 0) goto L11f
                okhttp3.Request r2 = r13.request
                boolean r2 = hasConditions(r2)
                if (r2 == 0) goto L4d
                goto L11f
            L4d:
                okhttp3.Response r2 = r13.cacheResponse
                okhttp3.CacheControl r2 = r2.cacheControl()
                long r3 = r13.cacheResponseAge()
                long r5 = r13.computeFreshnessLifetime()
                int r7 = r0.maxAgeSeconds()
                r8 = -1
                if (r7 == r8) goto L71
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r9 = r0.maxAgeSeconds()
                long r9 = (long) r9
                long r9 = r7.toMillis(r9)
                long r5 = java.lang.Math.min(r5, r9)
            L71:
                int r7 = r0.minFreshSeconds()
                r9 = 0
                if (r7 == r8) goto L85
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r11 = r0.minFreshSeconds()
                long r11 = (long) r11
                long r11 = r7.toMillis(r11)
                goto L86
            L85:
                r11 = r9
            L86:
                boolean r7 = r2.mustRevalidate()
                if (r7 != 0) goto L9d
                int r7 = r0.maxStaleSeconds()
                if (r7 == r8) goto L9d
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.maxStaleSeconds()
                long r8 = (long) r0
                long r9 = r7.toMillis(r8)
            L9d:
                boolean r0 = r2.noCache()
                if (r0 != 0) goto Ld6
                long r11 = r11 + r3
                long r9 = r9 + r5
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 >= 0) goto Ld6
                okhttp3.Response r0 = r13.cacheResponse
                okhttp3.Response$Builder r0 = r0.newBuilder()
                int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                java.lang.String r5 = "Warning"
                if (r2 < 0) goto Lba
                java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
                r0.addHeader(r5, r2)
            Lba:
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r2 <= 0) goto Lcc
                boolean r2 = r13.isFreshnessLifetimeHeuristic()
                if (r2 == 0) goto Lcc
                java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.addHeader(r5, r2)
            Lcc:
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r0 = r0.build()
                r2.<init>(r1, r0)
                return r2
            Ld6:
                java.lang.String r0 = r13.etag
                if (r0 == 0) goto Ldd
                java.lang.String r1 = "If-None-Match"
                goto Lee
            Ldd:
                java.util.Date r0 = r13.lastModified
                java.lang.String r2 = "If-Modified-Since"
                if (r0 == 0) goto Le7
                java.lang.String r0 = r13.lastModifiedString
            Le5:
                r1 = r2
                goto Lee
            Le7:
                java.util.Date r0 = r13.servedDate
                if (r0 == 0) goto L117
                java.lang.String r0 = r13.servedDateString
                goto Le5
            Lee:
                okhttp3.Request r2 = r13.request
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                okhttp3.internal.Internal r3 = okhttp3.internal.Internal.instance
                r3.addLenient(r2, r1, r0)
                okhttp3.Request r0 = r13.request
                okhttp3.Request$Builder r0 = r0.newBuilder()
                okhttp3.Headers r1 = r2.build()
                okhttp3.Request$Builder r0 = r0.headers(r1)
                okhttp3.Request r0 = r0.build()
                okhttp3.internal.cache.CacheStrategy r1 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r2 = r13.cacheResponse
                r1.<init>(r0, r2)
                return r1
            L117:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
            L11f:
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Request r2 = r13.request
                r0.<init>(r2, r1)
                return r0
        }

        private static boolean hasConditions(okhttp3.Request r1) {
                java.lang.String r0 = "If-Modified-Since"
                java.lang.String r0 = r1.header(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "If-None-Match"
                java.lang.String r1 = r1.header(r0)
                if (r1 == 0) goto L11
                goto L13
            L11:
                r1 = 0
                goto L14
            L13:
                r1 = 1
            L14:
                return r1
        }

        private boolean isFreshnessLifetimeHeuristic() {
                r2 = this;
                okhttp3.Response r0 = r2.cacheResponse
                okhttp3.CacheControl r0 = r0.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L13
                java.util.Date r0 = r2.expires
                if (r0 != 0) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                return r0
        }

        public okhttp3.internal.cache.CacheStrategy get() {
                r2 = this;
                okhttp3.internal.cache.CacheStrategy r0 = r2.getCandidate()
                okhttp3.Request r1 = r0.networkRequest
                if (r1 == 0) goto L1a
                okhttp3.Request r1 = r2.request
                okhttp3.CacheControl r1 = r1.cacheControl()
                boolean r1 = r1.onlyIfCached()
                if (r1 == 0) goto L1a
                okhttp3.internal.cache.CacheStrategy r0 = new okhttp3.internal.cache.CacheStrategy
                r1 = 0
                r0.<init>(r1, r1)
            L1a:
                return r0
        }
    }

    CacheStrategy(okhttp3.Request r1, okhttp3.Response r2) {
            r0 = this;
            r0.<init>()
            r0.networkRequest = r1
            r0.cacheResponse = r2
            return
    }

    public static boolean isCacheable(okhttp3.Response r3, okhttp3.Request r4) {
            int r0 = r3.code()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L5a
            okhttp3.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r1 = -1
            if (r0 != r1) goto L5a
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L5a
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            okhttp3.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            okhttp3.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
    }
}
