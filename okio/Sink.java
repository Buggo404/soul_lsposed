package okio;

/* loaded from: classes.dex */
public interface Sink extends java.io.Closeable, java.io.Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    void flush() throws java.io.IOException;

    okio.Timeout timeout();

    void write(okio.Buffer r1, long r2) throws java.io.IOException;
}
