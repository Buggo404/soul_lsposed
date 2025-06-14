package com.squareup.picasso;

/* loaded from: classes.dex */
public class UrlConnectionDownloader implements com.squareup.picasso.Downloader {
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> CACHE_HEADER_BUILDER = null;
    private static final java.lang.String FORCE_CACHE = "only-if-cached,max-age=2147483647";
    static final java.lang.String RESPONSE_SOURCE = "X-Android-Response-Source";
    static volatile java.lang.Object cache;
    private static final java.lang.Object lock = null;
    private final android.content.Context context;


    private static class ResponseCacheIcs {
        private ResponseCacheIcs() {
                r0 = this;
                r0.<init>()
                return
        }

        static void close(java.lang.Object r0) {
                android.net.http.HttpResponseCache r0 = (android.net.http.HttpResponseCache) r0     // Catch: java.io.IOException -> L5
                r0.close()     // Catch: java.io.IOException -> L5
            L5:
                return
        }

        static java.lang.Object install(android.content.Context r2) throws java.io.IOException {
                java.io.File r2 = com.squareup.picasso.Utils.createDefaultCacheDir(r2)
                android.net.http.HttpResponseCache r0 = android.net.http.HttpResponseCache.getInstalled()
                if (r0 != 0) goto L12
                long r0 = com.squareup.picasso.Utils.calculateDiskCacheSize(r2)
                android.net.http.HttpResponseCache r0 = android.net.http.HttpResponseCache.install(r2, r0)
            L12:
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.squareup.picasso.UrlConnectionDownloader.lock = r0
            com.squareup.picasso.UrlConnectionDownloader$1 r0 = new com.squareup.picasso.UrlConnectionDownloader$1
            r0.<init>()
            com.squareup.picasso.UrlConnectionDownloader.CACHE_HEADER_BUILDER = r0
            return
    }

    public UrlConnectionDownloader(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            return
    }

    private static void installCacheIfNeeded(android.content.Context r2) {
            java.lang.Object r0 = com.squareup.picasso.UrlConnectionDownloader.cache
            if (r0 != 0) goto L16
            java.lang.Object r0 = com.squareup.picasso.UrlConnectionDownloader.lock     // Catch: java.io.IOException -> L16
            monitor-enter(r0)     // Catch: java.io.IOException -> L16
            java.lang.Object r1 = com.squareup.picasso.UrlConnectionDownloader.cache     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L11
            java.lang.Object r2 = com.squareup.picasso.UrlConnectionDownloader.ResponseCacheIcs.install(r2)     // Catch: java.lang.Throwable -> L13
            com.squareup.picasso.UrlConnectionDownloader.cache = r2     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.io.IOException -> L16
        L16:
            return
    }

    @Override // com.squareup.picasso.Downloader
    public com.squareup.picasso.Downloader.Response load(android.net.Uri r5, int r6) throws java.io.IOException {
            r4 = this;
            android.content.Context r0 = r4.context
            installCacheIfNeeded(r0)
            java.net.HttpURLConnection r5 = r4.openConnection(r5)
            r0 = 1
            r5.setUseCaches(r0)
            if (r6 == 0) goto L4e
            boolean r0 = com.squareup.picasso.NetworkPolicy.isOfflineOnly(r6)
            if (r0 == 0) goto L18
            java.lang.String r0 = "only-if-cached,max-age=2147483647"
            goto L49
        L18:
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = com.squareup.picasso.UrlConnectionDownloader.CACHE_HEADER_BUILDER
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r1 = 0
            r0.setLength(r1)
            boolean r1 = com.squareup.picasso.NetworkPolicy.shouldReadFromDiskCache(r6)
            if (r1 != 0) goto L2f
            java.lang.String r1 = "no-cache"
            r0.append(r1)
        L2f:
            boolean r1 = com.squareup.picasso.NetworkPolicy.shouldWriteToDiskCache(r6)
            if (r1 != 0) goto L45
            int r1 = r0.length()
            if (r1 <= 0) goto L40
            r1 = 44
            r0.append(r1)
        L40:
            java.lang.String r1 = "no-store"
            r0.append(r1)
        L45:
            java.lang.String r0 = r0.toString()
        L49:
            java.lang.String r1 = "Cache-Control"
            r5.setRequestProperty(r1, r0)
        L4e:
            int r0 = r5.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L72
            java.lang.String r6 = "Content-Length"
            r0 = -1
            int r6 = r5.getHeaderFieldInt(r6, r0)
            long r0 = (long) r6
            java.lang.String r6 = "X-Android-Response-Source"
            java.lang.String r6 = r5.getHeaderField(r6)
            boolean r6 = com.squareup.picasso.Utils.parseResponseSourceHeader(r6)
            com.squareup.picasso.Downloader$Response r2 = new com.squareup.picasso.Downloader$Response
            java.io.InputStream r5 = r5.getInputStream()
            r2.<init>(r5, r6, r0)
            return r2
        L72:
            r5.disconnect()
            com.squareup.picasso.Downloader$ResponseException r1 = new com.squareup.picasso.Downloader$ResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r5 = r5.getResponseMessage()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r6, r0)
            throw r1
    }

    protected java.net.HttpURLConnection openConnection(android.net.Uri r2) throws java.io.IOException {
            r1 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r2.setReadTimeout(r0)
            return r2
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
            r1 = this;
            java.lang.Object r0 = com.squareup.picasso.UrlConnectionDownloader.cache
            if (r0 == 0) goto L9
            java.lang.Object r0 = com.squareup.picasso.UrlConnectionDownloader.cache
            com.squareup.picasso.UrlConnectionDownloader.ResponseCacheIcs.close(r0)
        L9:
            return
    }
}
