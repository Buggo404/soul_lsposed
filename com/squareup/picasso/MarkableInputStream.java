package com.squareup.picasso;

/* loaded from: classes.dex */
final class MarkableInputStream extends java.io.InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private long defaultMark;

    /* renamed from: in */
    private final java.io.InputStream f127in;
    private long limit;
    private long offset;
    private long reset;

    public MarkableInputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2, r0)
            return
    }

    public MarkableInputStream(java.io.InputStream r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.defaultMark = r0
            boolean r0 = r3.markSupported()
            if (r0 != 0) goto L13
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3, r4)
            r3 = r0
        L13:
            r2.f127in = r3
            return
    }

    private void setLimit(long r5) {
            r4 = this;
            long r0 = r4.reset     // Catch: java.io.IOException -> L32
            long r2 = r4.offset     // Catch: java.io.IOException -> L32
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L25
            long r0 = r4.limit     // Catch: java.io.IOException -> L32
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L25
            java.io.InputStream r0 = r4.f127in     // Catch: java.io.IOException -> L32
            r0.reset()     // Catch: java.io.IOException -> L32
            java.io.InputStream r0 = r4.f127in     // Catch: java.io.IOException -> L32
            long r1 = r4.reset     // Catch: java.io.IOException -> L32
            long r1 = r5 - r1
            int r1 = (int) r1     // Catch: java.io.IOException -> L32
            r0.mark(r1)     // Catch: java.io.IOException -> L32
            long r0 = r4.reset     // Catch: java.io.IOException -> L32
            long r2 = r4.offset     // Catch: java.io.IOException -> L32
            r4.skip(r0, r2)     // Catch: java.io.IOException -> L32
            goto L2f
        L25:
            r4.reset = r2     // Catch: java.io.IOException -> L32
            java.io.InputStream r0 = r4.f127in     // Catch: java.io.IOException -> L32
            long r1 = r5 - r2
            int r1 = (int) r1     // Catch: java.io.IOException -> L32
            r0.mark(r1)     // Catch: java.io.IOException -> L32
        L2f:
            r4.limit = r5     // Catch: java.io.IOException -> L32
            return
        L32:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to mark: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private void skip(long r5, long r7) throws java.io.IOException {
            r4 = this;
        L0:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L1e
            java.io.InputStream r0 = r4.f127in
            long r1 = r7 - r5
            long r0 = r0.skip(r1)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L1c
            int r0 = r4.read()
            r1 = -1
            if (r0 != r1) goto L1a
            goto L1e
        L1a:
            r0 = 1
        L1c:
            long r5 = r5 + r0
            goto L0
        L1e:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.f127in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.f127in
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public void mark(int r3) {
            r2 = this;
            long r0 = r2.savePosition(r3)
            r2.defaultMark = r0
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.f127in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.f127in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L10
            long r1 = r5.offset
            r3 = 1
            long r1 = r1 + r3
            r5.offset = r1
        L10:
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r5) throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.f127in
            int r5 = r0.read(r5)
            r0 = -1
            if (r5 == r0) goto Lf
            long r0 = r4.offset
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.offset = r0
        Lf:
            return r5
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.f127in
            int r3 = r0.read(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.offset
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.offset = r4
        Lf:
            return r3
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
            r2 = this;
            long r0 = r2.defaultMark
            r2.reset(r0)
            return
    }

    public void reset(long r5) throws java.io.IOException {
            r4 = this;
            long r0 = r4.offset
            long r2 = r4.limit
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1b
            long r0 = r4.reset
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            java.io.InputStream r0 = r4.f127in
            r0.reset()
            long r0 = r4.reset
            r4.skip(r0, r5)
            r4.offset = r5
            return
        L1b:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Cannot reset"
            r5.<init>(r6)
            throw r5
    }

    public long savePosition(int r5) {
            r4 = this;
            long r0 = r4.offset
            long r2 = (long) r5
            long r0 = r0 + r2
            long r2 = r4.limit
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto Ld
            r4.setLimit(r0)
        Ld:
            long r0 = r4.offset
            return r0
    }

    @Override // java.io.InputStream
    public long skip(long r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.f127in
            long r3 = r0.skip(r3)
            long r0 = r2.offset
            long r0 = r0 + r3
            r2.offset = r0
            return r3
    }
}
