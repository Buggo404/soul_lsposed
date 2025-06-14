package okio;

/* loaded from: classes.dex */
public abstract class ForwardingSource implements okio.Source {
    private final okio.Source delegate;

    public ForwardingSource(okio.Source r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.delegate = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "delegate == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.Source r0 = r1.delegate
            r0.close()
            return
    }

    public final okio.Source delegate() {
            r1 = this;
            okio.Source r0 = r1.delegate
            return r0
    }

    @Override // okio.Source
    public long read(okio.Buffer r2, long r3) throws java.io.IOException {
            r1 = this;
            okio.Source r0 = r1.delegate
            long r2 = r0.read(r2, r3)
            return r2
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.delegate
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            okio.Source r1 = r2.delegate
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
