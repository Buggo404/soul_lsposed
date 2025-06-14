package okio;

/* loaded from: classes.dex */
public final class Okio {
    static final java.util.logging.Logger logger = null;





    static {
            java.lang.Class<okio.Okio> r0 = okio.Okio.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okio.Okio.logger = r0
            return
    }

    private Okio() {
            r0 = this;
            r0.<init>()
            return
    }

    public static okio.Sink appendingSink(java.io.File r2) throws java.io.FileNotFoundException {
            if (r2 == 0) goto Ld
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            okio.Sink r2 = sink(r0)
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "file == null"
            r2.<init>(r0)
            throw r2
    }

    public static okio.Sink blackhole() {
            okio.Okio$3 r0 = new okio.Okio$3
            r0.<init>()
            return r0
    }

    public static okio.BufferedSink buffer(okio.Sink r1) {
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r1)
            return r0
    }

    public static okio.BufferedSource buffer(okio.Source r1) {
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r1)
            return r0
    }

    static boolean isAndroidGetsocknameError(java.lang.AssertionError r1) {
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L1a
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "getsockname failed"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public static okio.Sink sink(java.io.File r1) throws java.io.FileNotFoundException {
            if (r1 == 0) goto Lc
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            okio.Sink r1 = sink(r0)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "file == null"
            r1.<init>(r0)
            throw r1
    }

    public static okio.Sink sink(java.io.OutputStream r1) {
            okio.Timeout r0 = new okio.Timeout
            r0.<init>()
            okio.Sink r1 = sink(r1, r0)
            return r1
    }

    private static okio.Sink sink(java.io.OutputStream r1, okio.Timeout r2) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto La
            okio.Okio$1 r0 = new okio.Okio$1
            r0.<init>(r2, r1)
            return r0
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "timeout == null"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "out == null"
            r1.<init>(r2)
            throw r1
    }

    public static okio.Sink sink(java.net.Socket r1) throws java.io.IOException {
            if (r1 == 0) goto L21
            java.io.OutputStream r0 = r1.getOutputStream()
            if (r0 == 0) goto L19
            okio.AsyncTimeout r0 = timeout(r1)
            java.io.OutputStream r1 = r1.getOutputStream()
            okio.Sink r1 = sink(r1, r0)
            okio.Sink r1 = r0.sink(r1)
            return r1
        L19:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "socket's output stream == null"
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "socket == null"
            r1.<init>(r0)
            throw r1
    }

    public static okio.Sink sink(java.nio.file.Path r0, java.nio.file.OpenOption... r1) throws java.io.IOException {
            if (r0 == 0) goto Lb
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r0, r1)
            okio.Sink r0 = sink(r0)
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "path == null"
            r0.<init>(r1)
            throw r0
    }

    public static okio.Source source(java.io.File r1) throws java.io.FileNotFoundException {
            if (r1 == 0) goto Lc
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            okio.Source r1 = source(r0)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "file == null"
            r1.<init>(r0)
            throw r1
    }

    public static okio.Source source(java.io.InputStream r1) {
            okio.Timeout r0 = new okio.Timeout
            r0.<init>()
            okio.Source r1 = source(r1, r0)
            return r1
    }

    private static okio.Source source(java.io.InputStream r1, okio.Timeout r2) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto La
            okio.Okio$2 r0 = new okio.Okio$2
            r0.<init>(r2, r1)
            return r0
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "timeout == null"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "in == null"
            r1.<init>(r2)
            throw r1
    }

    public static okio.Source source(java.net.Socket r1) throws java.io.IOException {
            if (r1 == 0) goto L21
            java.io.InputStream r0 = r1.getInputStream()
            if (r0 == 0) goto L19
            okio.AsyncTimeout r0 = timeout(r1)
            java.io.InputStream r1 = r1.getInputStream()
            okio.Source r1 = source(r1, r0)
            okio.Source r1 = r0.source(r1)
            return r1
        L19:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "socket's input stream == null"
            r1.<init>(r0)
            throw r1
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "socket == null"
            r1.<init>(r0)
            throw r1
    }

    public static okio.Source source(java.nio.file.Path r0, java.nio.file.OpenOption... r1) throws java.io.IOException {
            if (r0 == 0) goto Lb
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)
            okio.Source r0 = source(r0)
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "path == null"
            r0.<init>(r1)
            throw r0
    }

    private static okio.AsyncTimeout timeout(java.net.Socket r1) {
            okio.Okio$4 r0 = new okio.Okio$4
            r0.<init>(r1)
            return r0
    }
}
