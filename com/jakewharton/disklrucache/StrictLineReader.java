package com.jakewharton.disklrucache;

/* loaded from: classes.dex */
class StrictLineReader implements java.io.Closeable {

    /* renamed from: CR */
    private static final byte f124CR = 13;

    /* renamed from: LF */
    private static final byte f125LF = 10;
    private byte[] buf;
    private final java.nio.charset.Charset charset;
    private int end;

    /* renamed from: in */
    private final java.io.InputStream f126in;
    private int pos;


    public StrictLineReader(java.io.InputStream r2, int r3, java.nio.charset.Charset r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2a
            if (r4 == 0) goto L2a
            if (r3 < 0) goto L22
            java.nio.charset.Charset r0 = com.jakewharton.disklrucache.Util.US_ASCII
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1a
            r1.f126in = r2
            r1.charset = r4
            byte[] r2 = new byte[r3]
            r1.buf = r2
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported encoding"
            r2.<init>(r3)
            throw r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "capacity <= 0"
            r2.<init>(r3)
            throw r2
        L2a:
            r2 = 0
            throw r2
    }

    public StrictLineReader(java.io.InputStream r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r0, r3)
            return
    }

    static /* synthetic */ java.nio.charset.Charset access$000(com.jakewharton.disklrucache.StrictLineReader r0) {
            java.nio.charset.Charset r0 = r0.charset
            return r0
    }

    private void fillBuf() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.f126in
            byte[] r1 = r4.buf
            int r2 = r1.length
            r3 = 0
            int r0 = r0.read(r1, r3, r2)
            r1 = -1
            if (r0 == r1) goto L12
            r4.pos = r3
            r4.end = r0
            return
        L12:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.f126in
            monitor-enter(r0)
            byte[] r1 = r2.buf     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            r1 = 0
            r2.buf = r1     // Catch: java.lang.Throwable -> L11
            java.io.InputStream r1 = r2.f126in     // Catch: java.lang.Throwable -> L11
            r1.close()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public java.lang.String readLine() throws java.io.IOException {
            r7 = this;
            java.io.InputStream r0 = r7.f126in
            monitor-enter(r0)
            byte[] r1 = r7.buf     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L83
            int r1 = r7.pos     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.end     // Catch: java.lang.Throwable -> L8b
            if (r1 < r2) goto L10
            r7.fillBuf()     // Catch: java.lang.Throwable -> L8b
        L10:
            int r1 = r7.pos     // Catch: java.lang.Throwable -> L8b
        L12:
            int r2 = r7.end     // Catch: java.lang.Throwable -> L8b
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L8b
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L8b
            if (r4 != r3) goto L42
            int r3 = r7.pos     // Catch: java.lang.Throwable -> L8b
            if (r1 == r3) goto L2b
            int r3 = r1 + (-1)
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L8b
            r4 = 13
            if (r2 != r4) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8b
            byte[] r4 = r7.buf     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.pos     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 - r5
            java.nio.charset.Charset r6 = r7.charset     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 + 1
            r7.pos = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r2
        L42:
            int r1 = r1 + 1
            goto L12
        L45:
            com.jakewharton.disklrucache.StrictLineReader$1 r1 = new com.jakewharton.disklrucache.StrictLineReader$1     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.end     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.pos     // Catch: java.lang.Throwable -> L8b
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L8b
        L51:
            byte[] r2 = r7.buf     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.pos     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.end     // Catch: java.lang.Throwable -> L8b
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L8b
            r2 = -1
            r7.end = r2     // Catch: java.lang.Throwable -> L8b
            r7.fillBuf()     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.pos     // Catch: java.lang.Throwable -> L8b
        L63:
            int r4 = r7.end     // Catch: java.lang.Throwable -> L8b
            if (r2 == r4) goto L51
            byte[] r4 = r7.buf     // Catch: java.lang.Throwable -> L8b
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L8b
            if (r5 != r3) goto L80
            int r3 = r7.pos     // Catch: java.lang.Throwable -> L8b
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L8b
        L76:
            int r2 = r2 + 1
            r7.pos = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1
    }
}
