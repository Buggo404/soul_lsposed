package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forWebSocket = r1
            return
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
            r8 = this;
            okhttp3.internal.http.RealInterceptorChain r9 = (okhttp3.internal.http.RealInterceptorChain) r9
            okhttp3.internal.connection.Exchange r0 = r9.exchange()
            okhttp3.Request r9 = r9.request()
            long r1 = java.lang.System.currentTimeMillis()
            r0.writeRequestHeaders(r9)
            java.lang.String r3 = r9.method()
            boolean r3 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L82
            okhttp3.RequestBody r3 = r9.body()
            if (r3 == 0) goto L82
            java.lang.String r3 = "Expect"
            java.lang.String r3 = r9.header(r3)
            java.lang.String r6 = "100-continue"
            boolean r3 = r6.equalsIgnoreCase(r3)
            r6 = 1
            if (r3 == 0) goto L3e
            r0.flushRequest()
            r0.responseHeadersStart()
            okhttp3.Response$Builder r5 = r0.readResponseHeaders(r6)
            r3 = r6
            goto L3f
        L3e:
            r3 = r4
        L3f:
            if (r5 != 0) goto L71
            okhttp3.RequestBody r7 = r9.body()
            boolean r7 = r7.isDuplex()
            if (r7 == 0) goto L5e
            r0.flushRequest()
            okio.Sink r6 = r0.createRequestBody(r9, r6)
            okio.BufferedSink r6 = okio.Okio.buffer(r6)
            okhttp3.RequestBody r7 = r9.body()
            r7.writeTo(r6)
            goto L86
        L5e:
            okio.Sink r6 = r0.createRequestBody(r9, r4)
            okio.BufferedSink r6 = okio.Okio.buffer(r6)
            okhttp3.RequestBody r7 = r9.body()
            r7.writeTo(r6)
            r6.close()
            goto L86
        L71:
            r0.noRequestBody()
            okhttp3.internal.connection.RealConnection r6 = r0.connection()
            boolean r6 = r6.isMultiplexed()
            if (r6 != 0) goto L86
            r0.noNewExchangesOnConnection()
            goto L86
        L82:
            r0.noRequestBody()
            r3 = r4
        L86:
            okhttp3.RequestBody r6 = r9.body()
            if (r6 == 0) goto L96
            okhttp3.RequestBody r6 = r9.body()
            boolean r6 = r6.isDuplex()
            if (r6 != 0) goto L99
        L96:
            r0.finishRequest()
        L99:
            if (r3 != 0) goto L9e
            r0.responseHeadersStart()
        L9e:
            if (r5 != 0) goto La4
            okhttp3.Response$Builder r5 = r0.readResponseHeaders(r4)
        La4:
            okhttp3.Response$Builder r3 = r5.request(r9)
            okhttp3.internal.connection.RealConnection r5 = r0.connection()
            okhttp3.Handshake r5 = r5.handshake()
            okhttp3.Response$Builder r3 = r3.handshake(r5)
            okhttp3.Response$Builder r3 = r3.sentRequestAtMillis(r1)
            long r5 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r3 = r3.receivedResponseAtMillis(r5)
            okhttp3.Response r3 = r3.build()
            int r5 = r3.code()
            r6 = 100
            if (r5 != r6) goto Lf4
            okhttp3.Response$Builder r3 = r0.readResponseHeaders(r4)
            okhttp3.Response$Builder r9 = r3.request(r9)
            okhttp3.internal.connection.RealConnection r3 = r0.connection()
            okhttp3.Handshake r3 = r3.handshake()
            okhttp3.Response$Builder r9 = r9.handshake(r3)
            okhttp3.Response$Builder r9 = r9.sentRequestAtMillis(r1)
            long r1 = java.lang.System.currentTimeMillis()
            okhttp3.Response$Builder r9 = r9.receivedResponseAtMillis(r1)
            okhttp3.Response r3 = r9.build()
            int r5 = r3.code()
        Lf4:
            r0.responseHeadersEnd(r3)
            boolean r9 = r8.forWebSocket
            if (r9 == 0) goto L10e
            r9 = 101(0x65, float:1.42E-43)
            if (r5 != r9) goto L10e
            okhttp3.Response$Builder r9 = r3.newBuilder()
            okhttp3.ResponseBody r1 = okhttp3.internal.Util.EMPTY_RESPONSE
            okhttp3.Response$Builder r9 = r9.body(r1)
            okhttp3.Response r9 = r9.build()
            goto L11e
        L10e:
            okhttp3.Response$Builder r9 = r3.newBuilder()
            okhttp3.ResponseBody r1 = r0.openResponseBody(r3)
            okhttp3.Response$Builder r9 = r9.body(r1)
            okhttp3.Response r9 = r9.build()
        L11e:
            okhttp3.Request r1 = r9.request()
            java.lang.String r2 = "Connection"
            java.lang.String r1 = r1.header(r2)
            java.lang.String r3 = "close"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L13a
            java.lang.String r1 = r9.header(r2)
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L13d
        L13a:
            r0.noNewExchangesOnConnection()
        L13d:
            r0 = 204(0xcc, float:2.86E-43)
            if (r5 == r0) goto L145
            r0 = 205(0xcd, float:2.87E-43)
            if (r5 != r0) goto L153
        L145:
            okhttp3.ResponseBody r0 = r9.body()
            long r0 = r0.contentLength()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L154
        L153:
            return r9
        L154:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " had non-zero Content-Length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            okhttp3.ResponseBody r9 = r9.body()
            long r2 = r9.contentLength()
            java.lang.StringBuilder r9 = r1.append(r2)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
    }
}
