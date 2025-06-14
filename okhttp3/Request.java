package okhttp3;

/* loaded from: classes.dex */
public final class Request {

    @javax.annotation.Nullable
    final okhttp3.RequestBody body;

    @javax.annotation.Nullable
    private volatile okhttp3.CacheControl cacheControl;
    final okhttp3.Headers headers;
    final java.lang.String method;
    final java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
    final okhttp3.HttpUrl url;

    public static class Builder {

        @javax.annotation.Nullable
        okhttp3.RequestBody body;
        okhttp3.Headers.Builder headers;
        java.lang.String method;
        java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

        @javax.annotation.Nullable
        okhttp3.HttpUrl url;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.Map r0 = java.util.Collections.emptyMap()
                r1.tags = r0
                java.lang.String r0 = "GET"
                r1.method = r0
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                r1.headers = r0
                return
        }

        Builder(okhttp3.Request r3) {
                r2 = this;
                r2.<init>()
                java.util.Map r0 = java.util.Collections.emptyMap()
                r2.tags = r0
                okhttp3.HttpUrl r0 = r3.url
                r2.url = r0
                java.lang.String r0 = r3.method
                r2.method = r0
                okhttp3.RequestBody r0 = r3.body
                r2.body = r0
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r3.tags
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L22
                java.util.Map r0 = java.util.Collections.emptyMap()
                goto L29
            L22:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r3.tags
                r0.<init>(r1)
            L29:
                r2.tags = r0
                okhttp3.Headers r3 = r3.headers
                okhttp3.Headers$Builder r3 = r3.newBuilder()
                r2.headers = r3
                return
        }

        public okhttp3.Request.Builder addHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                r0.add(r2, r3)
                return r1
        }

        public okhttp3.Request build() {
                r2 = this;
                okhttp3.HttpUrl r0 = r2.url
                if (r0 == 0) goto La
                okhttp3.Request r0 = new okhttp3.Request
                r0.<init>(r2)
                return r0
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "url == null"
                r0.<init>(r1)
                throw r0
        }

        public okhttp3.Request.Builder cacheControl(okhttp3.CacheControl r3) {
                r2 = this;
                java.lang.String r3 = r3.toString()
                boolean r0 = r3.isEmpty()
                java.lang.String r1 = "Cache-Control"
                if (r0 == 0) goto L11
                okhttp3.Request$Builder r3 = r2.removeHeader(r1)
                return r3
            L11:
                okhttp3.Request$Builder r3 = r2.header(r1, r3)
                return r3
        }

        public okhttp3.Request.Builder delete() {
                r1 = this;
                okhttp3.RequestBody r0 = okhttp3.internal.Util.EMPTY_REQUEST
                okhttp3.Request$Builder r0 = r1.delete(r0)
                return r0
        }

        public okhttp3.Request.Builder delete(@javax.annotation.Nullable okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "DELETE"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder get() {
                r2 = this;
                java.lang.String r0 = "GET"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        public okhttp3.Request.Builder head() {
                r2 = this;
                java.lang.String r0 = "HEAD"
                r1 = 0
                okhttp3.Request$Builder r0 = r2.method(r0, r1)
                return r0
        }

        public okhttp3.Request.Builder header(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                r0.set(r2, r3)
                return r1
        }

        public okhttp3.Request.Builder headers(okhttp3.Headers r1) {
                r0 = this;
                okhttp3.Headers$Builder r1 = r1.newBuilder()
                r0.headers = r1
                return r0
        }

        public okhttp3.Request.Builder method(java.lang.String r3, @javax.annotation.Nullable okhttp3.RequestBody r4) {
                r2 = this;
                if (r3 == 0) goto L5b
                int r0 = r3.length()
                if (r0 == 0) goto L53
                java.lang.String r0 = "method "
                if (r4 == 0) goto L2c
                boolean r1 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
                if (r1 == 0) goto L13
                goto L2c
            L13:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r0 = " must not have a request body."
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L2c:
                if (r4 != 0) goto L4e
                boolean r1 = okhttp3.internal.http.HttpMethod.requiresRequestBody(r3)
                if (r1 != 0) goto L35
                goto L4e
            L35:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r0 = " must have a request body."
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
            L4e:
                r2.method = r3
                r2.body = r4
                return r2
            L53:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "method.length() == 0"
                r3.<init>(r4)
                throw r3
            L5b:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "method == null"
                r3.<init>(r4)
                throw r3
        }

        public okhttp3.Request.Builder patch(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "PATCH"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder post(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "POST"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder put(okhttp3.RequestBody r2) {
                r1 = this;
                java.lang.String r0 = "PUT"
                okhttp3.Request$Builder r2 = r1.method(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder removeHeader(java.lang.String r2) {
                r1 = this;
                okhttp3.Headers$Builder r0 = r1.headers
                r0.removeAll(r2)
                return r1
        }

        public <T> okhttp3.Request.Builder tag(java.lang.Class<? super T> r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                if (r2 == 0) goto L23
                if (r3 != 0) goto La
                java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r1.tags
                r3.remove(r2)
                goto L22
            La:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L19
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.tags = r0
            L19:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
                java.lang.Object r3 = r2.cast(r3)
                r0.put(r2, r3)
            L22:
                return r1
            L23:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "type == null"
                r2.<init>(r3)
                throw r2
        }

        public okhttp3.Request.Builder tag(@javax.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                okhttp3.Request$Builder r2 = r1.tag(r0, r2)
                return r2
        }

        public okhttp3.Request.Builder url(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto L4e
                r1 = 1
                r2 = 0
                java.lang.String r3 = "ws:"
                r4 = 0
                r5 = 3
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L24
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "http:"
                r0.<init>(r1)
                r1 = 3
                java.lang.String r7 = r7.substring(r1)
                java.lang.StringBuilder r7 = r0.append(r7)
                java.lang.String r7 = r7.toString()
                goto L45
            L24:
                r1 = 1
                r2 = 0
                java.lang.String r3 = "wss:"
                r4 = 0
                r5 = 4
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L45
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "https:"
                r0.<init>(r1)
                r1 = 4
                java.lang.String r7 = r7.substring(r1)
                java.lang.StringBuilder r7 = r0.append(r7)
                java.lang.String r7 = r7.toString()
            L45:
                okhttp3.HttpUrl r7 = okhttp3.HttpUrl.get(r7)
                okhttp3.Request$Builder r7 = r6.url(r7)
                return r7
            L4e:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
        }

        public okhttp3.Request.Builder url(java.net.URL r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                java.lang.String r2 = r2.toString()
                okhttp3.HttpUrl r2 = okhttp3.HttpUrl.get(r2)
                okhttp3.Request$Builder r2 = r1.url(r2)
                return r2
            Lf:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r2.<init>(r0)
                throw r2
        }

        public okhttp3.Request.Builder url(okhttp3.HttpUrl r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.url = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r2.<init>(r0)
                throw r2
        }
    }

    Request(okhttp3.Request.Builder r2) {
            r1 = this;
            r1.<init>()
            okhttp3.HttpUrl r0 = r2.url
            r1.url = r0
            java.lang.String r0 = r2.method
            r1.method = r0
            okhttp3.Headers$Builder r0 = r2.headers
            okhttp3.Headers r0 = r0.build()
            r1.headers = r0
            okhttp3.RequestBody r0 = r2.body
            r1.body = r0
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r2.tags
            java.util.Map r2 = okhttp3.internal.Util.immutableMap(r2)
            r1.tags = r2
            return
    }

    @javax.annotation.Nullable
    public okhttp3.RequestBody body() {
            r1 = this;
            okhttp3.RequestBody r0 = r1.body
            return r0
    }

    public okhttp3.CacheControl cacheControl() {
            r1 = this;
            okhttp3.CacheControl r0 = r1.cacheControl
            if (r0 == 0) goto L5
            goto Ld
        L5:
            okhttp3.Headers r0 = r1.headers
            okhttp3.CacheControl r0 = okhttp3.CacheControl.parse(r0)
            r1.cacheControl = r0
        Ld:
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.String header(java.lang.String r2) {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            java.lang.String r2 = r0.get(r2)
            return r2
    }

    public java.util.List<java.lang.String> headers(java.lang.String r2) {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            java.util.List r2 = r0.values(r2)
            return r2
    }

    public okhttp3.Headers headers() {
            r1 = this;
            okhttp3.Headers r0 = r1.headers
            return r0
    }

    public boolean isHttps() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            boolean r0 = r0.isHttps()
            return r0
    }

    public java.lang.String method() {
            r1 = this;
            java.lang.String r0 = r1.method
            return r0
    }

    public okhttp3.Request.Builder newBuilder() {
            r1 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>(r1)
            return r0
    }

    @javax.annotation.Nullable
    public java.lang.Object tag() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = r1.tag(r0)
            return r0
    }

    @javax.annotation.Nullable
    public <T> T tag(java.lang.Class<? extends T> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.tags
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request{method="
            r0.<init>(r1)
            java.lang.String r1 = r2.method
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", url="
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.HttpUrl r1 = r2.url
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", tags="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.tags
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
