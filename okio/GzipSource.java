package okio;

/* loaded from: classes.dex */
public final class GzipSource implements okio.Source {
    private static final byte FCOMMENT = 4;
    private static final byte FEXTRA = 2;
    private static final byte FHCRC = 1;
    private static final byte FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private int section;
    private final okio.BufferedSource source;

    public GzipSource(okio.Source r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.section = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.crc = r0
            if (r3 == 0) goto L25
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r2.inflater = r0
            okio.BufferedSource r3 = okio.Okio.buffer(r3)
            r2.source = r3
            okio.InflaterSource r1 = new okio.InflaterSource
            r1.<init>(r3, r0)
            r2.inflaterSource = r1
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "source == null"
            r3.<init>(r0)
            throw r3
    }

    private void checkEqual(java.lang.String r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r6 != r5) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r4] = r6
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r4] = r5
            java.lang.String r4 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    private void consumeHeader() throws java.io.IOException {
            r17 = this;
            r6 = r17
            okio.BufferedSource r0 = r6.source
            r1 = 10
            r0.require(r1)
            okio.BufferedSource r0 = r6.source
            okio.Buffer r0 = r0.buffer()
            r1 = 3
            byte r7 = r0.getByte(r1)
            int r0 = r7 >> 1
            r8 = 1
            r0 = r0 & r8
            r9 = 0
            if (r0 != r8) goto L1e
            r10 = r8
            goto L1f
        L1e:
            r10 = r9
        L1f:
            if (r10 == 0) goto L30
            okio.BufferedSource r0 = r6.source
            okio.Buffer r1 = r0.buffer()
            r2 = 0
            r4 = 10
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L30:
            okio.BufferedSource r0 = r6.source
            short r0 = r0.readShort()
            java.lang.String r1 = "ID1ID2"
            r2 = 8075(0x1f8b, float:1.1315E-41)
            r6.checkEqual(r1, r2, r0)
            okio.BufferedSource r0 = r6.source
            r1 = 8
            r0.skip(r1)
            int r0 = r7 >> 2
            r0 = r0 & r8
            if (r0 != r8) goto L86
            okio.BufferedSource r0 = r6.source
            r1 = 2
            r0.require(r1)
            if (r10 == 0) goto L61
            okio.BufferedSource r0 = r6.source
            okio.Buffer r1 = r0.buffer()
            r2 = 0
            r4 = 2
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L61:
            okio.BufferedSource r0 = r6.source
            okio.Buffer r0 = r0.buffer()
            short r0 = r0.readShortLe()
            okio.BufferedSource r1 = r6.source
            long r11 = (long) r0
            r1.require(r11)
            if (r10 == 0) goto L81
            okio.BufferedSource r0 = r6.source
            okio.Buffer r1 = r0.buffer()
            r2 = 0
            r0 = r17
            r4 = r11
            r0.updateCrc(r1, r2, r4)
        L81:
            okio.BufferedSource r0 = r6.source
            r0.skip(r11)
        L86:
            int r0 = r7 >> 3
            r0 = r0 & r8
            r11 = -1
            r13 = 1
            if (r0 != r8) goto Lb8
            okio.BufferedSource r0 = r6.source
            long r15 = r0.indexOf(r9)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto Lb2
            if (r10 == 0) goto Laa
            okio.BufferedSource r0 = r6.source
            okio.Buffer r1 = r0.buffer()
            r2 = 0
            long r4 = r15 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        Laa:
            okio.BufferedSource r0 = r6.source
            long r1 = r15 + r13
            r0.skip(r1)
            goto Lb8
        Lb2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb8:
            int r0 = r7 >> 4
            r0 = r0 & r8
            if (r0 != r8) goto Le5
            okio.BufferedSource r0 = r6.source
            long r7 = r0.indexOf(r9)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto Ldf
            if (r10 == 0) goto Ld8
            okio.BufferedSource r0 = r6.source
            okio.Buffer r1 = r0.buffer()
            r2 = 0
            long r4 = r7 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        Ld8:
            okio.BufferedSource r0 = r6.source
            long r7 = r7 + r13
            r0.skip(r7)
            goto Le5
        Ldf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Le5:
            if (r10 == 0) goto Lff
            okio.BufferedSource r0 = r6.source
            short r0 = r0.readShortLe()
            java.util.zip.CRC32 r1 = r6.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            short r1 = (short) r1
            java.lang.String r2 = "FHCRC"
            r6.checkEqual(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.crc
            r0.reset()
        Lff:
            return
    }

    private void consumeTrailer() throws java.io.IOException {
            r3 = this;
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            java.lang.String r2 = "CRC"
            r3.checkEqual(r2, r0, r1)
            okio.BufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.Inflater r1 = r3.inflater
            long r1 = r1.getBytesWritten()
            int r1 = (int) r1
            java.lang.String r2 = "ISIZE"
            r3.checkEqual(r2, r0, r1)
            return
    }

    private void updateCrc(okio.Buffer r5, long r6, long r8) {
            r4 = this;
            okio.Segment r5 = r5.head
        L2:
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            goto L2
        L16:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L37
            int r2 = r5.pos
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.limit
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.crc
            byte[] r3 = r5.data
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            okio.Segment r5 = r5.next
            r6 = r0
            goto L16
        L37:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r12, long r13) throws java.io.IOException {
            r11 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L4b
            if (r2 != 0) goto L9
            return r0
        L9:
            int r0 = r11.section
            r1 = 1
            if (r0 != 0) goto L13
            r11.consumeHeader()
            r11.section = r1
        L13:
            int r0 = r11.section
            r2 = -1
            r4 = 2
            if (r0 != r1) goto L2f
            long r7 = r12.size
            okio.InflaterSource r0 = r11.inflaterSource
            long r13 = r0.read(r12, r13)
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            r5 = r11
            r6 = r12
            r9 = r13
            r5.updateCrc(r6, r7, r9)
            return r13
        L2d:
            r11.section = r4
        L2f:
            int r12 = r11.section
            if (r12 != r4) goto L4a
            r11.consumeTrailer()
            r12 = 3
            r11.section = r12
            okio.BufferedSource r12 = r11.source
            boolean r12 = r12.exhausted()
            if (r12 == 0) goto L42
            goto L4a
        L42:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "gzip finished without exhausting source"
            r12.<init>(r13)
            throw r12
        L4a:
            return r2
        L4b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
