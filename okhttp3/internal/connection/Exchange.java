package okhttp3.internal.connection;

/* loaded from: classes.dex */
public final class Exchange {
    final okhttp3.Call call;
    final okhttp3.internal.http.ExchangeCodec codec;
    private boolean duplex;
    final okhttp3.EventListener eventListener;
    final okhttp3.internal.connection.ExchangeFinder finder;
    final okhttp3.internal.connection.Transmitter transmitter;

    private final class RequestBodySink extends okio.ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private long contentLength;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        RequestBodySink(okhttp3.internal.connection.Exchange r1, okio.Sink r2, long r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.contentLength = r3
                return
        }

        @javax.annotation.Nullable
        private java.io.IOException complete(@javax.annotation.Nullable java.io.IOException r8) {
                r7 = this;
                boolean r0 = r7.completed
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.completed = r0
                okhttp3.internal.connection.Exchange r1 = r7.this$0
                long r2 = r7.bytesReceived
                r4 = 0
                r5 = 1
                r6 = r8
                java.io.IOException r8 = r1.bodyComplete(r2, r4, r5, r6)
                return r8
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r4.closed = r0
                long r0 = r4.contentLength
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L1f
                long r2 = r4.bytesReceived
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 != 0) goto L17
                goto L1f
            L17:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r1 = "unexpected end of stream"
                r0.<init>(r1)
                throw r0
            L1f:
                super.close()     // Catch: java.io.IOException -> L27
                r0 = 0
                r4.complete(r0)     // Catch: java.io.IOException -> L27
                return
            L27:
                r0 = move-exception
                java.io.IOException r0 = r4.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                super.flush()     // Catch: java.io.IOException -> L4
                return
            L4:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(okio.Buffer r5, long r6) throws java.io.IOException {
                r4 = this;
                boolean r0 = r4.closed
                if (r0 != 0) goto L47
                long r0 = r4.contentLength
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L38
                long r2 = r4.bytesReceived
                long r2 = r2 + r6
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 > 0) goto L14
                goto L38
            L14:
                java.net.ProtocolException r5 = new java.net.ProtocolException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "expected "
                r0.<init>(r1)
                long r1 = r4.contentLength
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " bytes but received "
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r4.bytesReceived
                long r1 = r1 + r6
                java.lang.StringBuilder r6 = r0.append(r1)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L38:
                super.write(r5, r6)     // Catch: java.io.IOException -> L41
                long r0 = r4.bytesReceived     // Catch: java.io.IOException -> L41
                long r0 = r0 + r6
                r4.bytesReceived = r0     // Catch: java.io.IOException -> L41
                return
            L41:
                r5 = move-exception
                java.io.IOException r5 = r4.complete(r5)
                throw r5
            L47:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "closed"
                r5.<init>(r6)
                throw r5
        }
    }

    final class ResponseBodySource extends okio.ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ okhttp3.internal.connection.Exchange this$0;

        ResponseBodySource(okhttp3.internal.connection.Exchange r1, okio.Source r2, long r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.contentLength = r3
                r1 = 0
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 != 0) goto L11
                r1 = 0
                r0.complete(r1)
            L11:
                return
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.closed = r0
                super.close()     // Catch: java.io.IOException -> L10
                r0 = 0
                r1.complete(r0)     // Catch: java.io.IOException -> L10
                return
            L10:
                r0 = move-exception
                java.io.IOException r0 = r1.complete(r0)
                throw r0
        }

        @javax.annotation.Nullable
        java.io.IOException complete(@javax.annotation.Nullable java.io.IOException r8) {
                r7 = this;
                boolean r0 = r7.completed
                if (r0 == 0) goto L5
                return r8
            L5:
                r0 = 1
                r7.completed = r0
                okhttp3.internal.connection.Exchange r1 = r7.this$0
                long r2 = r7.bytesReceived
                r4 = 1
                r5 = 0
                r6 = r8
                java.io.IOException r8 = r1.bodyComplete(r2, r4, r5, r6)
                return r8
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(okio.Buffer r9, long r10) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "expected "
                boolean r1 = r8.closed
                if (r1 != 0) goto L56
                okio.Source r1 = r8.delegate()     // Catch: java.io.IOException -> L50
                long r9 = r1.read(r9, r10)     // Catch: java.io.IOException -> L50
                r1 = -1
                int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                r3 = 0
                if (r11 != 0) goto L19
                r8.complete(r3)     // Catch: java.io.IOException -> L50
                return r1
            L19:
                long r4 = r8.bytesReceived     // Catch: java.io.IOException -> L50
                long r4 = r4 + r9
                long r6 = r8.contentLength     // Catch: java.io.IOException -> L50
                int r11 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r11 == 0) goto L46
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 > 0) goto L27
                goto L46
            L27:
                java.net.ProtocolException r9 = new java.net.ProtocolException     // Catch: java.io.IOException -> L50
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L50
                r10.<init>(r0)     // Catch: java.io.IOException -> L50
                long r0 = r8.contentLength     // Catch: java.io.IOException -> L50
                java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.io.IOException -> L50
                java.lang.String r11 = " bytes but received "
                java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.io.IOException -> L50
                java.lang.StringBuilder r10 = r10.append(r4)     // Catch: java.io.IOException -> L50
                java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> L50
                r9.<init>(r10)     // Catch: java.io.IOException -> L50
                throw r9     // Catch: java.io.IOException -> L50
            L46:
                r8.bytesReceived = r4     // Catch: java.io.IOException -> L50
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L4f
                r8.complete(r3)     // Catch: java.io.IOException -> L50
            L4f:
                return r9
            L50:
                r9 = move-exception
                java.io.IOException r9 = r8.complete(r9)
                throw r9
            L56:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "closed"
                r9.<init>(r10)
                throw r9
        }
    }

    public Exchange(okhttp3.internal.connection.Transmitter r1, okhttp3.Call r2, okhttp3.EventListener r3, okhttp3.internal.connection.ExchangeFinder r4, okhttp3.internal.http.ExchangeCodec r5) {
            r0 = this;
            r0.<init>()
            r0.transmitter = r1
            r0.call = r2
            r0.eventListener = r3
            r0.finder = r4
            r0.codec = r5
            return
    }

    @javax.annotation.Nullable
    java.io.IOException bodyComplete(long r3, boolean r5, boolean r6, @javax.annotation.Nullable java.io.IOException r7) {
            r2 = this;
            if (r7 == 0) goto L5
            r2.trackFailure(r7)
        L5:
            if (r6 == 0) goto L18
            if (r7 == 0) goto L11
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.requestFailed(r1, r7)
            goto L18
        L11:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.requestBodyEnd(r1, r3)
        L18:
            if (r5 == 0) goto L2b
            if (r7 == 0) goto L24
            okhttp3.EventListener r3 = r2.eventListener
            okhttp3.Call r4 = r2.call
            r3.responseFailed(r4, r7)
            goto L2b
        L24:
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.responseBodyEnd(r1, r3)
        L2b:
            okhttp3.internal.connection.Transmitter r3 = r2.transmitter
            java.io.IOException r3 = r3.exchangeMessageDone(r2, r6, r5, r7)
            return r3
    }

    public void cancel() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            r0.cancel()
            return
    }

    public okhttp3.internal.connection.RealConnection connection() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.connection()
            return r0
    }

    public okio.Sink createRequestBody(okhttp3.Request r4, boolean r5) throws java.io.IOException {
            r3 = this;
            r3.duplex = r5
            okhttp3.RequestBody r5 = r4.body()
            long r0 = r5.contentLength()
            okhttp3.EventListener r5 = r3.eventListener
            okhttp3.Call r2 = r3.call
            r5.requestBodyStart(r2)
            okhttp3.internal.http.ExchangeCodec r5 = r3.codec
            okio.Sink r4 = r5.createRequestBody(r4, r0)
            okhttp3.internal.connection.Exchange$RequestBodySink r5 = new okhttp3.internal.connection.Exchange$RequestBodySink
            r5.<init>(r3, r4, r0)
            return r5
    }

    public void detachWithViolence() {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec
            r0.cancel()
            okhttp3.internal.connection.Transmitter r0 = r3.transmitter
            r1 = 1
            r2 = 0
            r0.exchangeMessageDone(r3, r1, r1, r2)
            return
    }

    public void finishRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.finishRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.Call r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public void flushRequest() throws java.io.IOException {
            r3 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r3.codec     // Catch: java.io.IOException -> L6
            r0.flushRequest()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            okhttp3.EventListener r1 = r3.eventListener
            okhttp3.Call r2 = r3.call
            r1.requestFailed(r2, r0)
            r3.trackFailure(r0)
            throw r0
    }

    public boolean isDuplex() {
            r1 = this;
            boolean r0 = r1.duplex
            return r0
    }

    public okhttp3.internal.ws.RealWebSocket.Streams newWebSocketStreams() throws java.net.SocketException {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            r0.timeoutEarlyExit()
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.connection()
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r0.newWebSocketStreams(r1)
            return r0
    }

    public void noNewExchangesOnConnection() {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.connection()
            r0.noNewExchanges()
            return
    }

    public void noRequestBody() {
            r4 = this;
            okhttp3.internal.connection.Transmitter r0 = r4.transmitter
            r1 = 0
            r2 = 0
            r3 = 1
            r0.exchangeMessageDone(r4, r3, r1, r2)
            return
    }

    public okhttp3.ResponseBody openResponseBody(okhttp3.Response r5) throws java.io.IOException {
            r4 = this;
            okhttp3.EventListener r0 = r4.eventListener     // Catch: java.io.IOException -> L28
            okhttp3.Call r1 = r4.call     // Catch: java.io.IOException -> L28
            r0.responseBodyStart(r1)     // Catch: java.io.IOException -> L28
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r5.header(r0)     // Catch: java.io.IOException -> L28
            okhttp3.internal.http.ExchangeCodec r1 = r4.codec     // Catch: java.io.IOException -> L28
            long r1 = r1.reportedContentLength(r5)     // Catch: java.io.IOException -> L28
            okhttp3.internal.http.ExchangeCodec r3 = r4.codec     // Catch: java.io.IOException -> L28
            okio.Source r5 = r3.openResponseBodySource(r5)     // Catch: java.io.IOException -> L28
            okhttp3.internal.connection.Exchange$ResponseBodySource r3 = new okhttp3.internal.connection.Exchange$ResponseBodySource     // Catch: java.io.IOException -> L28
            r3.<init>(r4, r5, r1)     // Catch: java.io.IOException -> L28
            okhttp3.internal.http.RealResponseBody r5 = new okhttp3.internal.http.RealResponseBody     // Catch: java.io.IOException -> L28
            okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.io.IOException -> L28
            r5.<init>(r0, r1, r3)     // Catch: java.io.IOException -> L28
            return r5
        L28:
            r5 = move-exception
            okhttp3.EventListener r0 = r4.eventListener
            okhttp3.Call r1 = r4.call
            r0.responseFailed(r1, r5)
            r4.trackFailure(r5)
            throw r5
    }

    @javax.annotation.Nullable
    public okhttp3.Response.Builder readResponseHeaders(boolean r3) throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> Le
            okhttp3.Response$Builder r3 = r0.readResponseHeaders(r3)     // Catch: java.io.IOException -> Le
            if (r3 == 0) goto Ld
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance     // Catch: java.io.IOException -> Le
            r0.initExchange(r3, r2)     // Catch: java.io.IOException -> Le
        Ld:
            return r3
        Le:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.responseFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }

    public void responseHeadersEnd(okhttp3.Response r3) {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.responseHeadersEnd(r1, r3)
            return
    }

    public void responseHeadersStart() {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.responseHeadersStart(r1)
            return
    }

    public void timeoutEarlyExit() {
            r1 = this;
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter
            r0.timeoutEarlyExit()
            return
    }

    void trackFailure(java.io.IOException r2) {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.finder
            r0.trackFailure()
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.internal.connection.RealConnection r0 = r0.connection()
            r0.trackFailure(r2)
            return
    }

    public okhttp3.Headers trailers() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.http.ExchangeCodec r0 = r1.codec
            okhttp3.Headers r0 = r0.trailers()
            return r0
    }

    public void webSocketUpgradeFailed() {
            r6 = this;
            r1 = -1
            r3 = 1
            r4 = 1
            r5 = 0
            r0 = r6
            r0.bodyComplete(r1, r3, r4, r5)
            return
    }

    public void writeRequestHeaders(okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L14
            okhttp3.Call r1 = r2.call     // Catch: java.io.IOException -> L14
            r0.requestHeadersStart(r1)     // Catch: java.io.IOException -> L14
            okhttp3.internal.http.ExchangeCodec r0 = r2.codec     // Catch: java.io.IOException -> L14
            r0.writeRequestHeaders(r3)     // Catch: java.io.IOException -> L14
            okhttp3.EventListener r0 = r2.eventListener     // Catch: java.io.IOException -> L14
            okhttp3.Call r1 = r2.call     // Catch: java.io.IOException -> L14
            r0.requestHeadersEnd(r1, r3)     // Catch: java.io.IOException -> L14
            return
        L14:
            r3 = move-exception
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.requestFailed(r1, r3)
            r2.trackFailure(r3)
            throw r3
    }
}
