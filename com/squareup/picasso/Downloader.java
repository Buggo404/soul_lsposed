package com.squareup.picasso;

/* loaded from: classes.dex */
public interface Downloader {

    public static class Response {
        final android.graphics.Bitmap bitmap;
        final boolean cached;
        final long contentLength;
        final java.io.InputStream stream;

        @java.lang.Deprecated
        public Response(android.graphics.Bitmap r2, boolean r3) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L11
                r0 = 0
                r1.stream = r0
                r1.bitmap = r2
                r1.cached = r3
                r2 = -1
                r1.contentLength = r2
                return
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Bitmap may not be null."
                r2.<init>(r3)
                throw r2
        }

        @java.lang.Deprecated
        public Response(android.graphics.Bitmap r1, boolean r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @java.lang.Deprecated
        public Response(java.io.InputStream r3, boolean r4) {
                r2 = this;
                r0 = -1
                r2.<init>(r3, r4, r0)
                return
        }

        public Response(java.io.InputStream r1, boolean r2, long r3) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto Lf
                r0.stream = r1
                r1 = 0
                r0.bitmap = r1
                r0.cached = r2
                r0.contentLength = r3
                return
            Lf:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Stream may not be null."
                r1.<init>(r2)
                throw r1
        }

        @java.lang.Deprecated
        public android.graphics.Bitmap getBitmap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.bitmap
                return r0
        }

        public long getContentLength() {
                r2 = this;
                long r0 = r2.contentLength
                return r0
        }

        public java.io.InputStream getInputStream() {
                r1 = this;
                java.io.InputStream r0 = r1.stream
                return r0
        }
    }

    public static class ResponseException extends java.io.IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public ResponseException(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = com.squareup.picasso.NetworkPolicy.isOfflineOnly(r2)
                r0.localCacheOnly = r1
                r0.responseCode = r3
                return
        }
    }

    com.squareup.picasso.Downloader.Response load(android.net.Uri r1, int r2) throws java.io.IOException;

    void shutdown();
}
