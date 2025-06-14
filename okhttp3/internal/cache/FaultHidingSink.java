package okhttp3.internal.cache;

/* loaded from: classes.dex */
class FaultHidingSink extends okio.ForwardingSink {
    private boolean hasErrors;

    FaultHidingSink(okio.Sink r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.hasErrors
            if (r0 == 0) goto L5
            return
        L5:
            super.close()     // Catch: java.io.IOException -> L9
            goto L10
        L9:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            r2.onException(r0)
        L10:
            return
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.hasErrors
            if (r0 == 0) goto L5
            return
        L5:
            super.flush()     // Catch: java.io.IOException -> L9
            goto L10
        L9:
            r0 = move-exception
            r1 = 1
            r2.hasErrors = r1
            r2.onException(r0)
        L10:
            return
    }

    protected void onException(java.io.IOException r1) {
            r0 = this;
            return
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer r2, long r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.hasErrors
            if (r0 == 0) goto L8
            r2.skip(r3)
            return
        L8:
            super.write(r2, r3)     // Catch: java.io.IOException -> Lc
            goto L13
        Lc:
            r2 = move-exception
            r3 = 1
            r1.hasErrors = r3
            r1.onException(r2)
        L13:
            return
    }
}
