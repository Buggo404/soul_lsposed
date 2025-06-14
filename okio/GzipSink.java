package okio;

/* loaded from: classes.dex */
public final class GzipSink implements okio.Sink {
    private boolean closed;
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Deflater deflater;
    private final okio.DeflaterSink deflaterSink;
    private final okio.BufferedSink sink;

    public GzipSink(okio.Sink r4) {
            r3 = this;
            r3.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3.crc = r0
            if (r4 == 0) goto L26
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = -1
            r2 = 1
            r0.<init>(r1, r2)
            r3.deflater = r0
            okio.BufferedSink r4 = okio.Okio.buffer(r4)
            r3.sink = r4
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r4, r0)
            r3.deflaterSink = r1
            r3.writeHeader()
            return
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sink == null"
            r4.<init>(r0)
            throw r4
    }

    private void updateCrc(okio.Buffer r5, long r6) {
            r4 = this;
            okio.Segment r5 = r5.head
        L2:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L21
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r6, r0)
            int r0 = (int) r0
            java.util.zip.CRC32 r1 = r4.crc
            byte[] r2 = r5.data
            int r3 = r5.pos
            r1.update(r2, r3, r0)
            long r0 = (long) r0
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            goto L2
        L21:
            return
    }

    private void writeFooter() throws java.io.IOException {
            r3 = this;
            okio.BufferedSink r0 = r3.sink
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            r0.writeIntLe(r1)
            okio.BufferedSink r0 = r3.sink
            java.util.zip.Deflater r1 = r3.deflater
            long r1 = r1.getBytesRead()
            int r1 = (int) r1
            r0.writeIntLe(r1)
            return
    }

    private void writeHeader() {
            r2 = this;
            okio.BufferedSink r0 = r2.sink
            okio.Buffer r0 = r0.buffer()
            r1 = 8075(0x1f8b, float:1.1315E-41)
            r0.writeShort(r1)
            r1 = 8
            r0.writeByte(r1)
            r1 = 0
            r0.writeByte(r1)
            r0.writeInt(r1)
            r0.writeByte(r1)
            r0.writeByte(r1)
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            okio.DeflaterSink r0 = r2.deflaterSink     // Catch: java.lang.Throwable -> Lf
            r0.finishDeflate()     // Catch: java.lang.Throwable -> Lf
            r2.writeFooter()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L16
            r1.end()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            r1 = 1
            r2.closed = r1
            if (r0 == 0) goto L2c
            okio.Util.sneakyRethrow(r0)
        L2c:
            return
    }

    public final java.util.zip.Deflater deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
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

    @Override // okio.Sink
    public void write(okio.Buffer r3, long r4) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            if (r0 != 0) goto L9
            return
        L9:
            r2.updateCrc(r3, r4)
            okio.DeflaterSink r0 = r2.deflaterSink
            r0.write(r3, r4)
            return
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
