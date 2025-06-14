package okio;

/* loaded from: classes.dex */
final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer buffer;
    boolean closed;
    public final okio.Source source;


    RealBufferedSource(okio.Source r2) {
            r1 = this;
            r1.<init>()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.buffer = r0
            if (r2 == 0) goto Lf
            r1.source = r2
            return
        Lf:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "source == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r0 = r1.buffer
            r0.clear()
            return
    }

    @Override // okio.BufferedSource
    public boolean exhausted() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L20
            okio.Buffer r0 = r4.buffer
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1e
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.buffer
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSource
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) throws java.io.IOException {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) throws java.io.IOException {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.indexOf(r1, r2, r4)
            return r7
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r10, long r11, long r13) throws java.io.IOException {
            r9 = this;
            boolean r0 = r9.closed
            if (r0 != 0) goto L5c
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L3f
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 < 0) goto L3f
        Le:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r7 = -1
            if (r0 >= 0) goto L3e
            okio.Buffer r1 = r9.buffer
            r2 = r10
            r3 = r11
            r5 = r13
            long r0 = r1.indexOf(r2, r3, r5)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L22
            return r0
        L22:
            okio.Buffer r0 = r9.buffer
            long r0 = r0.size
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L3e
            okio.Source r2 = r9.source
            okio.Buffer r3 = r9.buffer
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L3e
        L39:
            long r11 = java.lang.Math.max(r11, r0)
            goto Le
        L3e:
            return r7
        L3f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0[r1] = r11
            r11 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r0[r11] = r12
            java.lang.String r11 = "fromIndex=%s toIndex=%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            r10.<init>(r11)
            throw r10
        L5c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            r10.<init>(r11)
            throw r10
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r9, long r10) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L32
        L4:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            return r0
        L11:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.buffer
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L24
            return r2
        L24:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto L4
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r9, long r10) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.closed
            if (r0 != 0) goto L29
        L4:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            return r0
        L11:
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.buffer
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L24
            return r2
        L24:
            long r10 = java.lang.Math.max(r10, r0)
            goto L4
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.RealBufferedSource$1 r0 = new okio.RealBufferedSource$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
            r1 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r0.<init>(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9) throws java.io.IOException {
            r6 = this;
            r4 = 0
            int r5 = r9.size()
            r0 = r6
            r1 = r7
            r3 = r9
            boolean r7 = r0.rangeEquals(r1, r3, r4, r5)
            return r7
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9, int r10, int r11) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 != 0) goto L3b
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3a
            if (r10 < 0) goto L3a
            if (r11 < 0) goto L3a
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L17
            goto L3a
        L17:
            r0 = r1
        L18:
            if (r0 >= r11) goto L38
            long r2 = (long) r0
            long r2 = r2 + r7
            r4 = 1
            long r4 = r4 + r2
            boolean r4 = r6.request(r4)
            if (r4 != 0) goto L26
            return r1
        L26:
            okio.Buffer r4 = r6.buffer
            byte r2 = r4.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L35
            return r1
        L35:
            int r0 = r0 + 1
            goto L18
        L38:
            r7 = 1
            return r7
        L3a:
            return r1
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r5) throws java.io.IOException {
            r4 = this;
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.buffer
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            r5 = -1
            return r5
        L1c:
            okio.Buffer r0 = r4.buffer
            int r5 = r0.read(r5)
            return r5
    }

    @Override // okio.BufferedSource
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSource
    public int read(byte[] r10, int r11, int r12) throws java.io.IOException {
            r9 = this;
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r12 = r9.buffer
            long r0 = r12.size
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            okio.Source r12 = r9.source
            okio.Buffer r0 = r9.buffer
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r12.read(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            r10 = -1
            return r10
        L24:
            okio.Buffer r12 = r9.buffer
            long r0 = r12.size
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            okio.Buffer r0 = r9.buffer
            int r10 = r0.read(r10, r11, r12)
            return r10
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) throws java.io.IOException {
            r4 = this;
            if (r5 == 0) goto L51
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L3c
            boolean r2 = r4.closed
            if (r2 != 0) goto L34
            okio.Buffer r2 = r4.buffer
            long r2 = r2.size
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L25
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.buffer
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L25
            return r2
        L25:
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size
            long r6 = java.lang.Math.min(r6, r0)
            okio.Buffer r0 = r4.buffer
            long r5 = r0.read(r5, r6)
            return r5
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L51:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "sink == null"
            r5.<init>(r6)
            throw r5
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r9) throws java.io.IOException {
            r8 = this;
            if (r9 == 0) goto L41
            r0 = 0
            r2 = r0
        L5:
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.buffer
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L26
            okio.Buffer r4 = r8.buffer
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L5
            long r2 = r2 + r4
            okio.Buffer r6 = r8.buffer
            r9.write(r6, r4)
            goto L5
        L26:
            okio.Buffer r4 = r8.buffer
            long r4 = r4.size()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L40
            okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r0 = r8.buffer
            long r4 = r0.size()
            r9.write(r0, r4)
        L40:
            return r2
        L41:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sink == null"
            r9.<init>(r0)
            throw r9
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            byte r0 = r0.readByte()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() throws java.io.IOException {
            r2 = this;
            okio.Buffer r0 = r2.buffer
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.buffer
            byte[] r0 = r0.readByteArray()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r2) throws java.io.IOException {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.buffer
            byte[] r2 = r0.readByteArray(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() throws java.io.IOException {
            r2 = this;
            okio.Buffer r0 = r2.buffer
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.buffer
            okio.ByteString r0 = r0.readByteString()
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r2) throws java.io.IOException {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.buffer
            okio.ByteString r2 = r0.readByteString(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.IOException {
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L40
            okio.Buffer r3 = r6.buffer
            long r4 = (long) r1
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L26
        L1f:
            if (r1 != 0) goto L28
            r4 = 45
            if (r3 == r4) goto L26
            goto L28
        L26:
            r1 = r2
            goto L7
        L28:
            if (r1 == 0) goto L2b
            goto L40
        L2b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L40:
            okio.Buffer r0 = r6.buffer
            long r0 = r0.readDecimalLong()
            return r0
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r2, long r3) throws java.io.IOException {
            r1 = this;
            r1.require(r3)     // Catch: java.io.EOFException -> L9
            okio.Buffer r0 = r1.buffer
            r0.readFully(r2, r3)
            return
        L9:
            r3 = move-exception
            okio.Buffer r4 = r1.buffer
            r2.writeAll(r4)
            throw r3
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.length     // Catch: java.io.EOFException -> Lb
            long r0 = (long) r0     // Catch: java.io.EOFException -> Lb
            r6.require(r0)     // Catch: java.io.EOFException -> Lb
            okio.Buffer r0 = r6.buffer
            r0.readFully(r7)
            return
        Lb:
            r0 = move-exception
            r1 = 0
        Ld:
            okio.Buffer r2 = r6.buffer
            long r2 = r2.size
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2b
            okio.Buffer r2 = r6.buffer
            long r3 = r2.size
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L25
            int r1 = r1 + r2
            goto Ld
        L25:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L2b:
            throw r0
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L4a
            okio.Buffer r3 = r6.buffer
            long r4 = (long) r1
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            okio.Buffer r0 = r6.buffer
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.IOException {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            int r0 = r0.readInt()
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.IOException {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            int r0 = r0.readIntLe()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.IOException {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            long r0 = r0.readLong()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.IOException {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            long r0 = r0.readLongLe()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.IOException {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            short r0 = r0.readShort()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.IOException {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.buffer
            short r0 = r0.readShortLe()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r2, java.nio.charset.Charset r4) throws java.io.IOException {
            r1 = this;
            r1.require(r2)
            if (r4 == 0) goto Lc
            okio.Buffer r0 = r1.buffer
            java.lang.String r2 = r0.readString(r2, r4)
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "charset == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L10
            okio.Buffer r0 = r2.buffer
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.buffer
            java.lang.String r3 = r0.readString(r3)
            return r3
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "charset == null"
            r3.<init>(r0)
            throw r3
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() throws java.io.IOException {
            r2 = this;
            okio.Buffer r0 = r2.buffer
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.buffer
            java.lang.String r0 = r0.readUtf8()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) throws java.io.IOException {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.buffer
            java.lang.String r2 = r0.readUtf8(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.IOException {
            r3 = this;
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.buffer
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L19
            r0 = 2
            r3.require(r0)
            goto L30
        L19:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L25
            r0 = 3
            r3.require(r0)
            goto L30
        L25:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L30
            r0 = 4
            r3.require(r0)
        L30:
            okio.Buffer r0 = r3.buffer
            int r0 = r0.readUtf8CodePoint()
            return r0
    }

    @Override // okio.BufferedSource
    @javax.annotation.Nullable
    public java.lang.String readUtf8Line() throws java.io.IOException {
            r4 = this;
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L21
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1f
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size
            java.lang.String r0 = r4.readUtf8(r0)
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
        L21:
            okio.Buffer r2 = r4.buffer
            java.lang.String r0 = r2.readUtf8Line(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.IOException {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r14) throws java.io.IOException {
            r13 = this;
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto La8
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L13
            r5 = r0
            goto L15
        L13:
            long r5 = r14 + r3
        L15:
            r8 = 10
            r9 = 0
            r7 = r13
            r11 = r5
            long r7 = r7.indexOf(r8, r9, r11)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L2c
            okio.Buffer r14 = r13.buffer
            java.lang.String r14 = r14.readUtf8Line(r7)
            return r14
        L2c:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5a
            boolean r0 = r13.request(r5)
            if (r0 == 0) goto L5a
            okio.Buffer r0 = r13.buffer
            long r1 = r5 - r3
            byte r0 = r0.getByte(r1)
            r1 = 13
            if (r0 != r1) goto L5a
            long r3 = r3 + r5
            boolean r0 = r13.request(r3)
            if (r0 == 0) goto L5a
            okio.Buffer r0 = r13.buffer
            byte r0 = r0.getByte(r5)
            r1 = 10
            if (r0 != r1) goto L5a
            okio.Buffer r14 = r13.buffer
            java.lang.String r14 = r14.readUtf8Line(r5)
            return r14
        L5a:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            okio.Buffer r0 = r13.buffer
            r2 = 0
            r4 = 32
            long r7 = r0.size()
            long r4 = java.lang.Math.min(r4, r7)
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\n not found: limit="
            r1.<init>(r2)
            okio.Buffer r2 = r13.buffer
            long r2 = r2.size()
            long r14 = java.lang.Math.min(r2, r14)
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r15 = " content="
            java.lang.StringBuilder r14 = r14.append(r15)
            okio.ByteString r15 = r6.readByteString()
            java.lang.String r15 = r15.hex()
            java.lang.StringBuilder r14 = r14.append(r15)
            r15 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        La8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "limit < 0: "
            r1.<init>(r2)
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
    }

    @Override // okio.BufferedSource
    public boolean request(long r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2e
            boolean r0 = r4.closed
            if (r0 != 0) goto L26
        La:
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L24
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.buffer
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r5 = 0
            return r5
        L24:
            r5 = 1
            return r5
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "byteCount < 0: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // okio.BufferedSource
    public void require(long r1) throws java.io.IOException {
            r0 = this;
            boolean r1 = r0.request(r1)
            if (r1 == 0) goto L7
            return
        L7:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 != 0) goto L32
        L4:
            okio.Buffer r0 = r6.buffer
            r1 = 1
            int r0 = r0.selectPrefix(r7, r1)
            r1 = -1
            if (r0 != r1) goto Lf
            return r1
        Lf:
            r2 = -2
            if (r0 != r2) goto L23
            okio.Source r0 = r6.source
            okio.Buffer r2 = r6.buffer
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r0.read(r2, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L4
            return r1
        L23:
            okio.ByteString[] r7 = r7.byteStrings
            r7 = r7[r0]
            int r7 = r7.size()
            okio.Buffer r1 = r6.buffer
            long r2 = (long) r7
            r1.skip(r2)
            return r0
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r7.<init>(r0)
            throw r7
    }

    @Override // okio.BufferedSource
    public void skip(long r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L3b
        L4:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3a
            okio.Buffer r2 = r4.buffer
            long r2 = r2.size
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L29
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.buffer
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            goto L29
        L23:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L29:
            okio.Buffer r0 = r4.buffer
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r5, r0)
            okio.Buffer r2 = r4.buffer
            r2.skip(r0)
            long r5 = r5 - r0
            goto L4
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Source r1 = r2.source
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
