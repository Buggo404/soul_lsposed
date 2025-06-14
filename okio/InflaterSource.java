package okio;

/* loaded from: classes.dex */
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final java.util.zip.Inflater inflater;
    private final okio.BufferedSource source;

    InflaterSource(okio.BufferedSource r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.source = r1
            r0.inflater = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "inflater == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "source == null"
            r1.<init>(r2)
            throw r1
    }

    public InflaterSource(okio.Source r1, java.util.zip.Inflater r2) {
            r0 = this;
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return
    }

    private void releaseInflatedBytes() throws java.io.IOException {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.inflater
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.bufferBytesHeldByInflater
            int r1 = r1 - r0
            r4.bufferBytesHeldByInflater = r1
            okio.BufferedSource r1 = r4.source
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.inflater
            r0.end()
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r7, long r8) throws java.io.IOException {
            r6 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L78
            boolean r3 = r6.closed
            if (r3 != 0) goto L70
            if (r2 != 0) goto Ld
            return r0
        Ld:
            boolean r0 = r6.refill()
            r1 = 1
            okio.Segment r1 = r7.writableSegment(r1)     // Catch: java.util.zip.DataFormatException -> L69
            int r2 = r1.limit     // Catch: java.util.zip.DataFormatException -> L69
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L69
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.util.zip.DataFormatException -> L69
            int r2 = (int) r2     // Catch: java.util.zip.DataFormatException -> L69
            java.util.zip.Inflater r3 = r6.inflater     // Catch: java.util.zip.DataFormatException -> L69
            byte[] r4 = r1.data     // Catch: java.util.zip.DataFormatException -> L69
            int r5 = r1.limit     // Catch: java.util.zip.DataFormatException -> L69
            int r2 = r3.inflate(r4, r5, r2)     // Catch: java.util.zip.DataFormatException -> L69
            if (r2 <= 0) goto L38
            int r8 = r1.limit     // Catch: java.util.zip.DataFormatException -> L69
            int r8 = r8 + r2
            r1.limit = r8     // Catch: java.util.zip.DataFormatException -> L69
            long r8 = r7.size     // Catch: java.util.zip.DataFormatException -> L69
            long r0 = (long) r2     // Catch: java.util.zip.DataFormatException -> L69
            long r8 = r8 + r0
            r7.size = r8     // Catch: java.util.zip.DataFormatException -> L69
            return r0
        L38:
            java.util.zip.Inflater r2 = r6.inflater     // Catch: java.util.zip.DataFormatException -> L69
            boolean r2 = r2.finished()     // Catch: java.util.zip.DataFormatException -> L69
            if (r2 != 0) goto L54
            java.util.zip.Inflater r2 = r6.inflater     // Catch: java.util.zip.DataFormatException -> L69
            boolean r2 = r2.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L69
            if (r2 == 0) goto L49
            goto L54
        L49:
            if (r0 != 0) goto L4c
            goto Ld
        L4c:
            java.io.EOFException r7 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L69
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)     // Catch: java.util.zip.DataFormatException -> L69
            throw r7     // Catch: java.util.zip.DataFormatException -> L69
        L54:
            r6.releaseInflatedBytes()     // Catch: java.util.zip.DataFormatException -> L69
            int r8 = r1.pos     // Catch: java.util.zip.DataFormatException -> L69
            int r9 = r1.limit     // Catch: java.util.zip.DataFormatException -> L69
            if (r8 != r9) goto L66
            okio.Segment r8 = r1.pop()     // Catch: java.util.zip.DataFormatException -> L69
            r7.head = r8     // Catch: java.util.zip.DataFormatException -> L69
            okio.SegmentPool.recycle(r1)     // Catch: java.util.zip.DataFormatException -> L69
        L66:
            r7 = -1
            return r7
        L69:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public final boolean refill() throws java.io.IOException {
            r5 = this;
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r5.releaseInflatedBytes()
            java.util.zip.Inflater r0 = r5.inflater
            int r0 = r0.getRemaining()
            if (r0 != 0) goto L3a
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.buffer()
            okio.Segment r0 = r0.head
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r5.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r2 = r5.inflater
            byte[] r3 = r0.data
            int r0 = r0.pos
            int r4 = r5.bufferBytesHeldByInflater
            r2.setInput(r3, r0, r4)
            return r1
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "?"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
