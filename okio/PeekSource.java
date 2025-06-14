package okio;

/* loaded from: classes.dex */
final class PeekSource implements okio.Source {
    private final okio.Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private okio.Segment expectedSegment;
    private long pos;
    private final okio.BufferedSource upstream;

    PeekSource(okio.BufferedSource r1) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            okio.Buffer r1 = r1.buffer()
            r0.buffer = r1
            okio.Segment r1 = r1.head
            r0.expectedSegment = r1
            if (r1 == 0) goto L14
            int r1 = r1.pos
            goto L15
        L14:
            r1 = -1
        L15:
            r0.expectedPos = r1
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.closed = r0
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r9, long r10) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L64
            okio.Segment r0 = r8.expectedSegment
            if (r0 == 0) goto L21
            okio.Buffer r1 = r8.buffer
            okio.Segment r1 = r1.head
            if (r0 != r1) goto L19
            int r0 = r8.expectedPos
            okio.Buffer r1 = r8.buffer
            okio.Segment r1 = r1.head
            int r1 = r1.pos
            if (r0 != r1) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L21:
            okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            long r1 = r1 + r10
            r0.request(r1)
            okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L41
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            if (r0 == 0) goto L41
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            r8.expectedSegment = r0
            okio.Buffer r0 = r8.buffer
            okio.Segment r0 = r0.head
            int r0 = r0.pos
            r8.expectedPos = r0
        L41:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size
            long r2 = r8.pos
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
            r9 = -1
            return r9
        L55:
            okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r10
            r2.copyTo(r3, r4, r6)
            long r0 = r8.pos
            long r0 = r0 + r10
            r8.pos = r0
            return r10
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.upstream
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
