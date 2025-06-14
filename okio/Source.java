package okio;

/* loaded from: classes.dex */
public interface Source extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    long read(okio.Buffer r1, long r2) throws java.io.IOException;

    okio.Timeout timeout();
}
