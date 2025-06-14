package okio;

/* loaded from: classes.dex */
public interface BufferedSink extends okio.Sink, java.nio.channels.WritableByteChannel {
    okio.Buffer buffer();

    okio.BufferedSink emit() throws java.io.IOException;

    okio.BufferedSink emitCompleteSegments() throws java.io.IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws java.io.IOException;

    java.io.OutputStream outputStream();

    okio.BufferedSink write(okio.ByteString r1) throws java.io.IOException;

    okio.BufferedSink write(okio.Source r1, long r2) throws java.io.IOException;

    okio.BufferedSink write(byte[] r1) throws java.io.IOException;

    okio.BufferedSink write(byte[] r1, int r2, int r3) throws java.io.IOException;

    long writeAll(okio.Source r1) throws java.io.IOException;

    okio.BufferedSink writeByte(int r1) throws java.io.IOException;

    okio.BufferedSink writeDecimalLong(long r1) throws java.io.IOException;

    okio.BufferedSink writeHexadecimalUnsignedLong(long r1) throws java.io.IOException;

    okio.BufferedSink writeInt(int r1) throws java.io.IOException;

    okio.BufferedSink writeIntLe(int r1) throws java.io.IOException;

    okio.BufferedSink writeLong(long r1) throws java.io.IOException;

    okio.BufferedSink writeLongLe(long r1) throws java.io.IOException;

    okio.BufferedSink writeShort(int r1) throws java.io.IOException;

    okio.BufferedSink writeShortLe(int r1) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String r1, int r2, int r3, java.nio.charset.Charset r4) throws java.io.IOException;

    okio.BufferedSink writeString(java.lang.String r1, java.nio.charset.Charset r2) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String r1) throws java.io.IOException;

    okio.BufferedSink writeUtf8(java.lang.String r1, int r2, int r3) throws java.io.IOException;

    okio.BufferedSink writeUtf8CodePoint(int r1) throws java.io.IOException;
}
