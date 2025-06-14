package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public class HttpLoggingInterceptor implements okhttp3.Interceptor {
    private boolean isPrintStack;
    private volatile com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level level;
    protected java.util.logging.Logger logger;
    protected java.lang.String tag;

    public enum Level extends java.lang.Enum<com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level> {
        private static final /* synthetic */ com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level[] $VALUES = null;
        public static final com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level BASIC = null;
        public static final com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level BODY = null;
        public static final com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level HEADERS = null;
        public static final com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level NONE = null;
        public static final com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level PARAM = null;

        static {
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r0 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.NONE = r0
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level
                java.lang.String r3 = "BASIC"
                r4 = 1
                r1.<init>(r3, r4)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BASIC = r1
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level
                java.lang.String r5 = "HEADERS"
                r6 = 2
                r3.<init>(r5, r6)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.HEADERS = r3
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r5 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level
                java.lang.String r7 = "BODY"
                r8 = 3
                r5.<init>(r7, r8)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY = r5
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r7 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level
                java.lang.String r9 = "PARAM"
                r10 = 4
                r7.<init>(r9, r10)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM = r7
                r9 = 5
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level[] r9 = new com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.$VALUES = r9
                return
        }

        Level(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level valueOf(java.lang.String r1) {
                java.lang.Class<com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level> r0 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = (com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level) r1
                return r1
        }

        public static com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level[] values() {
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level[] r0 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.$VALUES
                java.lang.Object r0 = r0.clone()
                com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level[] r0 = (com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level[]) r0
                return r0
        }
    }

    public HttpLoggingInterceptor(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r0 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.NONE
            r1.level = r0
            r0 = 1
            r1.isPrintStack = r0
            r1.setTag(r2)
            return
    }

    public HttpLoggingInterceptor(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r0 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.NONE
            r1.level = r0
            r0 = 1
            r1.isPrintStack = r0
            r1.setTag(r2)
            r1.isPrintStack = r3
            return
    }

    protected java.lang.String bodyToString(okhttp3.Request r3) {
            r2 = this;
            okhttp3.Request$Builder r3 = r3.newBuilder()     // Catch: java.lang.Exception -> L35
            okhttp3.Request r3 = r3.build()     // Catch: java.lang.Exception -> L35
            okio.Buffer r0 = new okio.Buffer     // Catch: java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Exception -> L35
            okhttp3.RequestBody r1 = r3.body()     // Catch: java.lang.Exception -> L35
            r1.writeTo(r0)     // Catch: java.lang.Exception -> L35
            java.nio.charset.Charset r1 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.lang.Exception -> L35
            okhttp3.RequestBody r3 = r3.body()     // Catch: java.lang.Exception -> L35
            okhttp3.MediaType r3 = r3.contentType()     // Catch: java.lang.Exception -> L35
            if (r3 == 0) goto L26
            java.nio.charset.Charset r1 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.lang.Exception -> L35
            java.nio.charset.Charset r1 = r3.charset(r1)     // Catch: java.lang.Exception -> L35
        L26:
            java.lang.String r3 = r0.readString(r1)     // Catch: java.lang.Exception -> L35
            java.nio.charset.Charset r0 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.name()     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r0)     // Catch: java.lang.Exception -> L35
            return r3
        L35:
            r3 = move-exception
            r2.onError(r3)
            java.lang.String r3 = ""
            return r3
    }

    public com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level getLevel() {
            r1 = this;
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r0 = r1.level
            return r0
    }

    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.tag
            return r0
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r6) throws java.io.IOException {
            r5 = this;
            okhttp3.Request r0 = r6.request()
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.NONE
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = r5.level
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L13
            okhttp3.Response r6 = r6.proceed(r0)
            return r6
        L13:
            okhttp3.Connection r1 = r6.connection()
            r5.logForRequest(r0, r1)
            long r1 = java.lang.System.nanoTime()
            okhttp3.Response r6 = r6.proceed(r0)     // Catch: java.lang.Exception -> L32
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r1
            long r0 = r0.toMillis(r3)
            okhttp3.Response r6 = r5.logForResponse(r6, r0)
            return r6
        L32:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<-- HTTP FAILED: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.log(r0)
            throw r6
    }

    public void log(java.lang.String r3) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            r0.log(r1, r3)
            return
    }

    protected void logForRequest(okhttp3.Request r10, okhttp3.Connection r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "--> END "
            java.lang.String r1 = "--> "
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r2 == r3) goto Lf
            java.lang.String r2 = "-------------------------------request-------------------------------"
            r9.log(r2)
        Lf:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L20
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r2 != r3) goto L1e
            goto L20
        L1e:
            r2 = r4
            goto L21
        L20:
            r2 = r5
        L21:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r6 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            if (r3 == r6) goto L30
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r6 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.HEADERS
            if (r3 != r6) goto L2e
            goto L30
        L2e:
            r3 = r4
            goto L31
        L30:
            r3 = r5
        L31:
            okhttp3.RequestBody r6 = r10.body()
            if (r6 == 0) goto L38
            goto L39
        L38:
            r5 = r4
        L39:
            if (r11 == 0) goto L40
            okhttp3.Protocol r11 = r11.protocol()
            goto L42
        L40:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r1 = r10.method()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r1 = r7.append(r1)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r7 = 32
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            okhttp3.HttpUrl r8 = r10.url()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r11 = r1.append(r11)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r9.log(r11)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            if (r3 == 0) goto La3
            okhttp3.Headers r11 = r10.headers()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            int r1 = r11.size()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
        L76:
            if (r4 >= r1) goto La3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r3.<init>()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r7 = "\t"
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r7 = r11.name(r4)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r7 = ": "
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r7 = r11.value(r4)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r9.log(r3)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            int r4 = r4 + 1
            goto L76
        La3:
            if (r2 == 0) goto Ld1
            if (r5 == 0) goto Ld1
            okhttp3.MediaType r11 = r6.contentType()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            boolean r11 = com.xuexiang.xhttp2.utils.HttpUtils.isPlaintext(r11)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            if (r11 == 0) goto Lcc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r11.<init>()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r1 = "\tbody:"
            java.lang.StringBuilder r11 = r11.append(r1)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r1 = r9.bodyToString(r10)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.StringBuilder r11 = r11.append(r1)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            r9.log(r11)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
            goto Ld1
        Lcc:
            java.lang.String r11 = "\tbody: maybe [file part] , too large too print , ignored!"
            r9.log(r11)     // Catch: java.lang.Throwable -> Ldd java.lang.Exception -> Ldf
        Ld1:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r1) goto Lfd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            goto Lee
        Ldd:
            r11 = move-exception
            goto Lfe
        Ldf:
            r11 = move-exception
            r9.onError(r11)     // Catch: java.lang.Throwable -> Ldd
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r1) goto Lfd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
        Lee:
            java.lang.String r10 = r10.method()
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.log(r10)
        Lfd:
            return
        Lfe:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r1 == r2) goto L118
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r10 = r10.method()
            java.lang.StringBuilder r10 = r1.append(r10)
            java.lang.String r10 = r10.toString()
            r9.log(r10)
        L118:
            throw r11
    }

    protected okhttp3.Response logForResponse(okhttp3.Response r10, long r11) {
            r9 = this;
            java.lang.String r0 = "<-- END HTTP"
            java.lang.String r1 = "<-- "
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r2 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r3 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r2 == r3) goto Lf
            java.lang.String r2 = "-------------------------------response-------------------------------"
            r9.log(r2)
        Lf:
            okhttp3.Response$Builder r2 = r10.newBuilder()
            okhttp3.Response r2 = r2.build()
            okhttp3.ResponseBody r3 = r2.body()
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r4 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r5 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L2c
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r4 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r5 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r4 != r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L2d
        L2c:
            r4 = r7
        L2d:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r5 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r8 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.BODY
            if (r5 == r8) goto L3b
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r5 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r8 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.HEADERS
            if (r5 != r8) goto L3a
            goto L3b
        L3a:
            r7 = r6
        L3b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            int r1 = r2.code()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r5 = 32
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r8 = r2.message()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.Request r5 = r2.request()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.HttpUrl r5 = r5.url()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r5 = " ("
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r11 = r1.append(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r12 = "ms）"
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r9.log(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r11 = " "
            if (r7 == 0) goto Lbc
            r9.log(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.Headers r12 = r2.headers()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
        L8c:
            if (r6 >= r1) goto Lb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r5.<init>()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r7 = "\t"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r7 = r12.name(r6)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r7 = ": "
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r7 = r12.value(r6)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r9.log(r5)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            int r6 = r6 + 1
            goto L8c
        Lb9:
            r9.log(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
        Lbc:
            if (r4 == 0) goto L114
            boolean r12 = okhttp3.internal.http.HttpHeaders.hasBody(r2)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            if (r12 == 0) goto L114
            okhttp3.MediaType r12 = r3.contentType()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            boolean r12 = com.xuexiang.xhttp2.utils.HttpUtils.isPlaintext(r12)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            if (r12 == 0) goto L106
            java.lang.String r11 = r3.string()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r12.<init>()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r1 = "\tbody:"
            java.lang.StringBuilder r12 = r12.append(r1)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.StringBuilder r12 = r12.append(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            r9.log(r12)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.MediaType r12 = r3.contentType()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.ResponseBody r11 = okhttp3.ResponseBody.create(r12, r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.Response$Builder r12 = r10.newBuilder()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.Response$Builder r11 = r12.body(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            okhttp3.Response r10 = r11.build()     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r12 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r12) goto L105
            r9.log(r0)
        L105:
            return r10
        L106:
            java.lang.String r12 = "\tbody: maybe [file part] , too large too print , ignored!"
            r9.log(r12)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r12 = r9.level     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r1 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
            if (r12 == r1) goto L114
            r9.log(r11)     // Catch: java.lang.Throwable -> L11b java.lang.Exception -> L11d
        L114:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r12 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r12) goto L12a
            goto L127
        L11b:
            r10 = move-exception
            goto L12b
        L11d:
            r11 = move-exception
            r9.onError(r11)     // Catch: java.lang.Throwable -> L11b
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r12 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r12) goto L12a
        L127:
            r9.log(r0)
        L12a:
            return r10
        L12b:
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r11 = r9.level
            com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor$Level r12 = com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level.PARAM
            if (r11 == r12) goto L134
            r9.log(r0)
        L134:
            throw r10
    }

    protected void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.isPrintStack
            if (r0 == 0) goto L7
            r2.printStackTrace()
        L7:
            return
    }

    public com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor setLevel(com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor.Level r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.level = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "level == null. Use Level.NONE instead."
            r2.<init>(r0)
            throw r2
    }

    public com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor setTag(java.lang.String r1) {
            r0 = this;
            r0.tag = r1
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            r0.logger = r1
            return r0
    }
}
