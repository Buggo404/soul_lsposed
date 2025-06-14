package com.squareup.picasso;

/* loaded from: classes.dex */
public class OkHttpDownloader implements com.squareup.picasso.Downloader {
    private final com.squareup.okhttp.OkHttpClient client;

    public OkHttpDownloader(android.content.Context r1) {
            r0 = this;
            java.io.File r1 = com.squareup.picasso.Utils.createDefaultCacheDir(r1)
            r0.<init>(r1)
            return
    }

    public OkHttpDownloader(android.content.Context r1, long r2) {
            r0 = this;
            java.io.File r1 = com.squareup.picasso.Utils.createDefaultCacheDir(r1)
            r0.<init>(r1, r2)
            return
    }

    public OkHttpDownloader(com.squareup.okhttp.OkHttpClient r1) {
            r0 = this;
            r0.<init>()
            r0.client = r1
            return
    }

    public OkHttpDownloader(java.io.File r3) {
            r2 = this;
            long r0 = com.squareup.picasso.Utils.calculateDiskCacheSize(r3)
            r2.<init>(r3, r0)
            return
    }

    public OkHttpDownloader(java.io.File r3, long r4) {
            r2 = this;
            com.squareup.okhttp.OkHttpClient r0 = defaultOkHttpClient()
            r2.<init>(r0)
            com.squareup.okhttp.OkHttpClient r0 = r2.client     // Catch: java.io.IOException -> L11
            com.squareup.okhttp.Cache r1 = new com.squareup.okhttp.Cache     // Catch: java.io.IOException -> L11
            r1.<init>(r3, r4)     // Catch: java.io.IOException -> L11
            r0.setCache(r1)     // Catch: java.io.IOException -> L11
        L11:
            return
    }

    private static com.squareup.okhttp.OkHttpClient defaultOkHttpClient() {
            com.squareup.okhttp.OkHttpClient r0 = new com.squareup.okhttp.OkHttpClient
            r0.<init>()
            r1 = 15000(0x3a98, double:7.411E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setConnectTimeout(r1, r3)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.setReadTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setWriteTimeout(r2, r1)
            return r0
    }

    protected final com.squareup.okhttp.OkHttpClient getClient() {
            r1 = this;
            com.squareup.okhttp.OkHttpClient r0 = r1.client
            return r0
    }

    @Override // com.squareup.picasso.Downloader
    public com.squareup.picasso.Downloader.Response load(android.net.Uri r5, int r6) throws java.io.IOException {
            r4 = this;
            if (r6 == 0) goto L27
            boolean r0 = com.squareup.picasso.NetworkPolicy.isOfflineOnly(r6)
            if (r0 == 0) goto Lb
            com.squareup.okhttp.CacheControl r0 = com.squareup.okhttp.CacheControl.FORCE_CACHE
            goto L28
        Lb:
            com.squareup.okhttp.CacheControl$Builder r0 = new com.squareup.okhttp.CacheControl$Builder
            r0.<init>()
            boolean r1 = com.squareup.picasso.NetworkPolicy.shouldReadFromDiskCache(r6)
            if (r1 != 0) goto L19
            r0.noCache()
        L19:
            boolean r1 = com.squareup.picasso.NetworkPolicy.shouldWriteToDiskCache(r6)
            if (r1 != 0) goto L22
            r0.noStore()
        L22:
            com.squareup.okhttp.CacheControl r0 = r0.build()
            goto L28
        L27:
            r0 = 0
        L28:
            com.squareup.okhttp.Request$Builder r1 = new com.squareup.okhttp.Request$Builder
            r1.<init>()
            java.lang.String r5 = r5.toString()
            com.squareup.okhttp.Request$Builder r5 = r1.url(r5)
            if (r0 == 0) goto L3a
            r5.cacheControl(r0)
        L3a:
            com.squareup.okhttp.OkHttpClient r0 = r4.client
            com.squareup.okhttp.Request r5 = r5.build()
            com.squareup.okhttp.Call r5 = r0.newCall(r5)
            com.squareup.okhttp.Response r5 = r5.execute()
            int r0 = r5.code()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L6b
            com.squareup.okhttp.Response r6 = r5.cacheResponse()
            if (r6 == 0) goto L58
            r6 = 1
            goto L59
        L58:
            r6 = 0
        L59:
            com.squareup.okhttp.ResponseBody r5 = r5.body()
            com.squareup.picasso.Downloader$Response r0 = new com.squareup.picasso.Downloader$Response
            java.io.InputStream r1 = r5.byteStream()
            long r2 = r5.contentLength()
            r0.<init>(r1, r6, r2)
            return r0
        L6b:
            com.squareup.okhttp.ResponseBody r1 = r5.body()
            r1.close()
            com.squareup.picasso.Downloader$ResponseException r1 = new com.squareup.picasso.Downloader$ResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r5 = r5.message()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r6, r0)
            throw r1
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
            r1 = this;
            com.squareup.okhttp.OkHttpClient r0 = r1.client
            com.squareup.okhttp.Cache r0 = r0.getCache()
            if (r0 == 0) goto Lb
            r0.close()     // Catch: java.io.IOException -> Lb
        Lb:
            return
    }
}
