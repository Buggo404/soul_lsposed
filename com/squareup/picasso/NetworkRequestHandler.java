package com.squareup.picasso;

/* loaded from: classes.dex */
class NetworkRequestHandler extends com.squareup.picasso.RequestHandler {
    static final int RETRY_COUNT = 2;
    private static final java.lang.String SCHEME_HTTP = "http";
    private static final java.lang.String SCHEME_HTTPS = "https";
    private final com.squareup.picasso.Downloader downloader;
    private final com.squareup.picasso.Stats stats;

    static class ContentLengthException extends java.io.IOException {
        public ContentLengthException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public NetworkRequestHandler(com.squareup.picasso.Downloader r1, com.squareup.picasso.Stats r2) {
            r0 = this;
            r0.<init>()
            r0.downloader = r1
            r0.stats = r2
            return
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request r2) {
            r1 = this;
            android.net.Uri r2 = r2.uri
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L19
            java.lang.String r0 = "https"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            return r2
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r7, int r8) throws java.io.IOException {
            r6 = this;
            com.squareup.picasso.Downloader r8 = r6.downloader
            android.net.Uri r0 = r7.uri
            int r7 = r7.networkPolicy
            com.squareup.picasso.Downloader$Response r7 = r8.load(r0, r7)
            r8 = 0
            if (r7 != 0) goto Le
            return r8
        Le:
            boolean r0 = r7.cached
            if (r0 == 0) goto L15
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            goto L17
        L15:
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.NETWORK
        L17:
            android.graphics.Bitmap r1 = r7.getBitmap()
            if (r1 == 0) goto L23
            com.squareup.picasso.RequestHandler$Result r7 = new com.squareup.picasso.RequestHandler$Result
            r7.<init>(r1, r0)
            return r7
        L23:
            java.io.InputStream r1 = r7.getInputStream()
            if (r1 != 0) goto L2a
            return r8
        L2a:
            com.squareup.picasso.Picasso$LoadedFrom r8 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r2 = 0
            if (r0 != r8) goto L44
            long r4 = r7.getContentLength()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L39
            goto L44
        L39:
            com.squareup.picasso.Utils.closeQuietly(r1)
            com.squareup.picasso.NetworkRequestHandler$ContentLengthException r7 = new com.squareup.picasso.NetworkRequestHandler$ContentLengthException
            java.lang.String r8 = "Received response with 0 content-length header."
            r7.<init>(r8)
            throw r7
        L44:
            com.squareup.picasso.Picasso$LoadedFrom r8 = com.squareup.picasso.Picasso.LoadedFrom.NETWORK
            if (r0 != r8) goto L59
            long r4 = r7.getContentLength()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L59
            com.squareup.picasso.Stats r8 = r6.stats
            long r2 = r7.getContentLength()
            r8.dispatchDownloadFinished(r2)
        L59:
            com.squareup.picasso.RequestHandler$Result r7 = new com.squareup.picasso.RequestHandler$Result
            r7.<init>(r1, r0)
            return r7
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean r1, android.net.NetworkInfo r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            boolean r1 = r2.isConnected()
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
            r1 = this;
            r0 = 1
            return r0
    }
}
