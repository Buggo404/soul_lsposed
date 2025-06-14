package okio;

/* loaded from: classes.dex */
public final class DeflaterSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.Deflater deflater;
    private final okio.BufferedSink sink;

    DeflaterSink(okio.BufferedSink r1, java.util.zip.Deflater r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.sink = r1
            r0.deflater = r2
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

    public DeflaterSink(okio.Sink r1, java.util.zip.Deflater r2) {
            r0 = this;
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return
    }

    private void deflate(boolean r8) throws java.io.IOException {
            r7 = this;
            okio.BufferedSink r0 = r7.sink
            okio.Buffer r0 = r0.buffer()
        L6:
            r1 = 1
            okio.Segment r1 = r0.writableSegment(r1)
            if (r8 == 0) goto L1d
            java.util.zip.Deflater r2 = r7.deflater
            byte[] r3 = r1.data
            int r4 = r1.limit
            int r5 = r1.limit
            int r5 = 8192 - r5
            r6 = 2
            int r2 = r2.deflate(r3, r4, r5, r6)
            goto L2b
        L1d:
            java.util.zip.Deflater r2 = r7.deflater
            byte[] r3 = r1.data
            int r4 = r1.limit
            int r5 = r1.limit
            int r5 = 8192 - r5
            int r2 = r2.deflate(r3, r4, r5)
        L2b:
            if (r2 <= 0) goto L3e
            int r3 = r1.limit
            int r3 = r3 + r2
            r1.limit = r3
            long r3 = r0.size
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.size = r3
            okio.BufferedSink r1 = r7.sink
            r1.emitCompleteSegments()
            goto L6
        L3e:
            java.util.zip.Deflater r2 = r7.deflater
            boolean r2 = r2.needsInput()
            if (r2 == 0) goto L6
            int r8 = r1.pos
            int r2 = r1.limit
            if (r8 != r2) goto L55
            okio.Segment r8 = r1.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r1)
        L55:
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r2.finishDeflate()     // Catch: java.lang.Throwable -> La
            r0 = 0
            goto Lb
        La:
            r0 = move-exception
        Lb:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L11
            r1.end()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r1 = move-exception
            if (r0 != 0) goto L15
            r0 = r1
        L15:
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r1 = move-exception
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            r1 = 1
            r2.closed = r1
            if (r0 == 0) goto L27
            okio.Util.sneakyRethrow(r0)
        L27:
            return
    }

    void finishDeflate() throws java.io.IOException {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            r0.finish()
            r0 = 0
            r1.deflate(r0)
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.deflate(r0)
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeflaterSink("
            r0.<init>(r1)
            okio.BufferedSink r1 = r2.sink
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r7, long r8) throws java.io.IOException {
            r6 = this;
            long r0 = r7.size
            r2 = 0
            r4 = r8
            okio.Util.checkOffsetAndCount(r0, r2, r4)
        L8:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L44
            okio.Segment r0 = r7.head
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r8, r1)
            int r1 = (int) r1
            java.util.zip.Deflater r2 = r6.deflater
            byte[] r3 = r0.data
            int r4 = r0.pos
            r2.setInput(r3, r4, r1)
            r2 = 0
            r6.deflate(r2)
            long r2 = r7.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r7.size = r2
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto L42
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
        L42:
            long r8 = r8 - r4
            goto L8
        L44:
            return
    }
}
