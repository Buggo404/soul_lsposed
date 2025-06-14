package com.xuexiang.xhttp2.cookie;

/* loaded from: classes.dex */
public class CookieManager implements okhttp3.CookieJar {
    private static com.xuexiang.xhttp2.cookie.CookieManager sInstance;
    private final com.xuexiang.xhttp2.cookie.PersistentCookieStore mCookieStore;

    private CookieManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = new com.xuexiang.xhttp2.cookie.PersistentCookieStore
            r0.<init>(r2)
            r1.mCookieStore = r0
            return
    }

    public static com.xuexiang.xhttp2.cookie.CookieManager getInstance(android.content.Context r2) {
            com.xuexiang.xhttp2.cookie.CookieManager r0 = com.xuexiang.xhttp2.cookie.CookieManager.sInstance
            if (r0 != 0) goto L1b
            java.lang.Class<com.xuexiang.xhttp2.cookie.CookieManager> r0 = com.xuexiang.xhttp2.cookie.CookieManager.class
            monitor-enter(r0)
            com.xuexiang.xhttp2.cookie.CookieManager r1 = com.xuexiang.xhttp2.cookie.CookieManager.sInstance     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            com.xuexiang.xhttp2.cookie.CookieManager r1 = new com.xuexiang.xhttp2.cookie.CookieManager     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.xuexiang.xhttp2.cookie.CookieManager.sInstance = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
        L1b:
            com.xuexiang.xhttp2.cookie.CookieManager r2 = com.xuexiang.xhttp2.cookie.CookieManager.sInstance
            return r2
    }

    public void addCookies(java.util.List<okhttp3.Cookie> r2) {
            r1 = this;
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            r0.addCookies(r2)
            return
    }

    public com.xuexiang.xhttp2.cookie.PersistentCookieStore getCookieStore() {
            r1 = this;
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            return r0
    }

    @Override // okhttp3.CookieJar
    public java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl r2) {
            r1 = this;
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            java.util.List r2 = r0.get(r2)
            if (r2 == 0) goto L9
            goto Le
        L9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Le:
            return r2
    }

    public void remove(okhttp3.HttpUrl r2, okhttp3.Cookie r3) {
            r1 = this;
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            r0.remove(r2, r3)
            return
    }

    public void removeAll() {
            r1 = this;
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            r0.removeAll()
            return
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(okhttp3.HttpUrl r3, java.util.List<okhttp3.Cookie> r4) {
            r2 = this;
            if (r4 == 0) goto L1e
            int r0 = r4.size()
            if (r0 <= 0) goto L1e
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r4.next()
            okhttp3.Cookie r0 = (okhttp3.Cookie) r0
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r1 = r2.mCookieStore
            r1.add(r3, r0)
            goto Lc
        L1e:
            return
    }

    public void saveFromResponse(okhttp3.HttpUrl r2, okhttp3.Cookie r3) {
            r1 = this;
            if (r3 == 0) goto L7
            com.xuexiang.xhttp2.cookie.PersistentCookieStore r0 = r1.mCookieStore
            r0.add(r2, r3)
        L7:
            return
    }
}
