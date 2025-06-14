package okio;

/* loaded from: classes.dex */
public final class Pipe {
    final okio.Buffer buffer;

    @javax.annotation.Nullable
    private okio.Sink foldedSink;
    final long maxBufferSize;
    private final okio.Sink sink;
    boolean sinkClosed;
    private final okio.Source source;
    boolean sourceClosed;

    final class PipeSink implements okio.Sink {
        final /* synthetic */ okio.Pipe this$0;
        final okio.PushableTimeout timeout;

        PipeSink(okio.Pipe r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.PushableTimeout r1 = new okio.PushableTimeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r5 = this;
                okio.Pipe r0 = r5.this$0
                okio.Buffer r0 = r0.buffer
                monitor-enter(r0)
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                boolean r1 = r1.sinkClosed     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
                return
            Ld:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                okio.Sink r1 = okio.Pipe.access$000(r1)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L1c
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                okio.Sink r1 = okio.Pipe.access$000(r1)     // Catch: java.lang.Throwable -> L63
                goto L46
            L1c:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                boolean r1 = r1.sourceClosed     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L39
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L63
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L63
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L31
                goto L39
            L31:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L63
                throw r1     // Catch: java.lang.Throwable -> L63
            L39:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                r2 = 1
                r1.sinkClosed = r2     // Catch: java.lang.Throwable -> L63
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L63
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L63
                r1.notifyAll()     // Catch: java.lang.Throwable -> L63
                r1 = 0
            L46:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L62
                okio.PushableTimeout r0 = r5.timeout
                okio.Timeout r2 = r1.timeout()
                r0.push(r2)
                r1.close()     // Catch: java.lang.Throwable -> L5b
                okio.PushableTimeout r0 = r5.timeout
                r0.pop()
                goto L62
            L5b:
                r0 = move-exception
                okio.PushableTimeout r1 = r5.timeout
                r1.pop()
                throw r0
            L62:
                return
            L63:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r5 = this;
                okio.Pipe r0 = r5.this$0
                okio.Buffer r0 = r0.buffer
                monitor-enter(r0)
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                boolean r1 = r1.sinkClosed     // Catch: java.lang.Throwable -> L5d
                if (r1 != 0) goto L55
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                okio.Sink r1 = okio.Pipe.access$000(r1)     // Catch: java.lang.Throwable -> L5d
                if (r1 == 0) goto L1a
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                okio.Sink r1 = okio.Pipe.access$000(r1)     // Catch: java.lang.Throwable -> L5d
                goto L38
            L1a:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                boolean r1 = r1.sourceClosed     // Catch: java.lang.Throwable -> L5d
                if (r1 == 0) goto L37
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L5d
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L5d
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L2f
                goto L37
            L2f:
                java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d
                throw r1     // Catch: java.lang.Throwable -> L5d
            L37:
                r1 = 0
            L38:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
                if (r1 == 0) goto L54
                okio.PushableTimeout r0 = r5.timeout
                okio.Timeout r2 = r1.timeout()
                r0.push(r2)
                r1.flush()     // Catch: java.lang.Throwable -> L4d
                okio.PushableTimeout r0 = r5.timeout
                r0.pop()
                goto L54
            L4d:
                r0 = move-exception
                okio.PushableTimeout r1 = r5.timeout
                r1.pop()
                throw r0
            L54:
                return
            L55:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
                java.lang.String r2 = "closed"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d
                throw r1     // Catch: java.lang.Throwable -> L5d
            L5d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
                throw r1
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.PushableTimeout r0 = r1.timeout
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r8, long r9) throws java.io.IOException {
                r7 = this;
                okio.Pipe r0 = r7.this$0
                okio.Buffer r0 = r0.buffer
                monitor-enter(r0)
                okio.Pipe r1 = r7.this$0     // Catch: java.lang.Throwable -> L83
                boolean r1 = r1.sinkClosed     // Catch: java.lang.Throwable -> L83
                if (r1 != 0) goto L7b
            Lb:
                r1 = 0
                int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r3 <= 0) goto L5d
                okio.Pipe r3 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Sink r3 = okio.Pipe.access$000(r3)     // Catch: java.lang.Throwable -> L83
                if (r3 == 0) goto L20
                okio.Pipe r1 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Sink r1 = okio.Pipe.access$000(r1)     // Catch: java.lang.Throwable -> L83
                goto L5e
            L20:
                okio.Pipe r3 = r7.this$0     // Catch: java.lang.Throwable -> L83
                boolean r3 = r3.sourceClosed     // Catch: java.lang.Throwable -> L83
                if (r3 != 0) goto L55
                okio.Pipe r3 = r7.this$0     // Catch: java.lang.Throwable -> L83
                long r3 = r3.maxBufferSize     // Catch: java.lang.Throwable -> L83
                okio.Pipe r5 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Buffer r5 = r5.buffer     // Catch: java.lang.Throwable -> L83
                long r5 = r5.size()     // Catch: java.lang.Throwable -> L83
                long r3 = r3 - r5
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 != 0) goto L41
                okio.PushableTimeout r1 = r7.timeout     // Catch: java.lang.Throwable -> L83
                okio.Pipe r2 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Buffer r2 = r2.buffer     // Catch: java.lang.Throwable -> L83
                r1.waitUntilNotified(r2)     // Catch: java.lang.Throwable -> L83
                goto Lb
            L41:
                long r1 = java.lang.Math.min(r3, r9)     // Catch: java.lang.Throwable -> L83
                okio.Pipe r3 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Buffer r3 = r3.buffer     // Catch: java.lang.Throwable -> L83
                r3.write(r8, r1)     // Catch: java.lang.Throwable -> L83
                long r9 = r9 - r1
                okio.Pipe r1 = r7.this$0     // Catch: java.lang.Throwable -> L83
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L83
                r1.notifyAll()     // Catch: java.lang.Throwable -> L83
                goto Lb
            L55:
                java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L83
                java.lang.String r9 = "source is closed"
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L83
                throw r8     // Catch: java.lang.Throwable -> L83
            L5d:
                r1 = 0
            L5e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                if (r1 == 0) goto L7a
                okio.PushableTimeout r0 = r7.timeout
                okio.Timeout r2 = r1.timeout()
                r0.push(r2)
                r1.write(r8, r9)     // Catch: java.lang.Throwable -> L73
                okio.PushableTimeout r8 = r7.timeout
                r8.pop()
                goto L7a
            L73:
                r8 = move-exception
                okio.PushableTimeout r9 = r7.timeout
                r9.pop()
                throw r8
            L7a:
                return
            L7b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
                java.lang.String r9 = "closed"
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L83
                throw r8     // Catch: java.lang.Throwable -> L83
            L83:
                r8 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
                throw r8
        }
    }

    final class PipeSource implements okio.Source {
        final /* synthetic */ okio.Pipe this$0;
        final okio.Timeout timeout;

        PipeSource(okio.Pipe r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Timeout r1 = new okio.Timeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r3 = this;
                okio.Pipe r0 = r3.this$0
                okio.Buffer r0 = r0.buffer
                monitor-enter(r0)
                okio.Pipe r1 = r3.this$0     // Catch: java.lang.Throwable -> L13
                r2 = 1
                r1.sourceClosed = r2     // Catch: java.lang.Throwable -> L13
                okio.Pipe r1 = r3.this$0     // Catch: java.lang.Throwable -> L13
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L13
                r1.notifyAll()     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r1
        }

        @Override // okio.Source
        public long read(okio.Buffer r6, long r7) throws java.io.IOException {
                r5 = this;
                okio.Pipe r0 = r5.this$0
                okio.Buffer r0 = r0.buffer
                monitor-enter(r0)
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L46
                boolean r1 = r1.sourceClosed     // Catch: java.lang.Throwable -> L46
                if (r1 != 0) goto L3e
            Lb:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L46
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L46
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L46
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L2d
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L46
                boolean r1 = r1.sinkClosed     // Catch: java.lang.Throwable -> L46
                if (r1 == 0) goto L23
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                r6 = -1
                return r6
            L23:
                okio.Timeout r1 = r5.timeout     // Catch: java.lang.Throwable -> L46
                okio.Pipe r2 = r5.this$0     // Catch: java.lang.Throwable -> L46
                okio.Buffer r2 = r2.buffer     // Catch: java.lang.Throwable -> L46
                r1.waitUntilNotified(r2)     // Catch: java.lang.Throwable -> L46
                goto Lb
            L2d:
                okio.Pipe r1 = r5.this$0     // Catch: java.lang.Throwable -> L46
                okio.Buffer r1 = r1.buffer     // Catch: java.lang.Throwable -> L46
                long r6 = r1.read(r6, r7)     // Catch: java.lang.Throwable -> L46
                okio.Pipe r8 = r5.this$0     // Catch: java.lang.Throwable -> L46
                okio.Buffer r8 = r8.buffer     // Catch: java.lang.Throwable -> L46
                r8.notifyAll()     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                return r6
            L3e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46
                java.lang.String r7 = "closed"
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L46
                throw r6     // Catch: java.lang.Throwable -> L46
            L46:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                throw r6
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    public Pipe(long r4) {
            r3 = this;
            r3.<init>()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.buffer = r0
            okio.Pipe$PipeSink r0 = new okio.Pipe$PipeSink
            r0.<init>(r3)
            r3.sink = r0
            okio.Pipe$PipeSource r0 = new okio.Pipe$PipeSource
            r0.<init>(r3)
            r3.source = r0
            r0 = 1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            r3.maxBufferSize = r4
            return
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "maxBufferSize < 1: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    static /* synthetic */ okio.Sink access$000(okio.Pipe r0) {
            okio.Sink r0 = r0.foldedSink
            return r0
    }

    public void fold(okio.Sink r7) throws java.io.IOException {
            r6 = this;
        L0:
            okio.Buffer r0 = r6.buffer
            monitor-enter(r0)
            okio.Sink r1 = r6.foldedSink     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L41
            okio.Buffer r1 = r6.buffer     // Catch: java.lang.Throwable -> L49
            boolean r1 = r1.exhausted()     // Catch: java.lang.Throwable -> L49
            r2 = 1
            if (r1 == 0) goto L16
            r6.sourceClosed = r2     // Catch: java.lang.Throwable -> L49
            r6.foldedSink = r7     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return
        L16:
            okio.Buffer r1 = new okio.Buffer     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            okio.Buffer r3 = r6.buffer     // Catch: java.lang.Throwable -> L49
            long r4 = r3.size     // Catch: java.lang.Throwable -> L49
            r1.write(r3, r4)     // Catch: java.lang.Throwable -> L49
            okio.Buffer r3 = r6.buffer     // Catch: java.lang.Throwable -> L49
            r3.notifyAll()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            long r3 = r1.size     // Catch: java.lang.Throwable -> L31
            r7.write(r1, r3)     // Catch: java.lang.Throwable -> L31
            r7.flush()     // Catch: java.lang.Throwable -> L31
            goto L0
        L31:
            r7 = move-exception
            okio.Buffer r1 = r6.buffer
            monitor-enter(r1)
            r6.sourceClosed = r2     // Catch: java.lang.Throwable -> L3e
            okio.Buffer r0 = r6.buffer     // Catch: java.lang.Throwable -> L3e
            r0.notifyAll()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            throw r7
        L3e:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "sink already folded"
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L49
            throw r7     // Catch: java.lang.Throwable -> L49
        L49:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r7
    }

    public final okio.Sink sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    public final okio.Source source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }
}
