package com.xuexiang.xhttp2;

/* loaded from: classes.dex */
public class XHttpRequestPool {
    private static com.xuexiang.xhttp2.XHttpRequestPool sInstance;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> maps;

    private XHttpRequestPool() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.maps = r0
            return
    }

    public static void dispose(io.reactivex.disposables.Disposable r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto Lb
            r1.dispose()
        Lb:
            return
    }

    public static com.xuexiang.xhttp2.XHttpRequestPool get() {
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.sInstance
            if (r0 != 0) goto L17
            java.lang.Class<com.xuexiang.xhttp2.XHttpRequestPool> r0 = com.xuexiang.xhttp2.XHttpRequestPool.class
            monitor-enter(r0)
            com.xuexiang.xhttp2.XHttpRequestPool r1 = com.xuexiang.xhttp2.XHttpRequestPool.sInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.xuexiang.xhttp2.XHttpRequestPool r1 = new com.xuexiang.xhttp2.XHttpRequestPool     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.xuexiang.xhttp2.XHttpRequestPool.sInstance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.xuexiang.xhttp2.XHttpRequestPool r0 = com.xuexiang.xhttp2.XHttpRequestPool.sInstance
            return r0
    }

    public io.reactivex.disposables.Disposable add(io.reactivex.disposables.Disposable r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r2.maps
            java.lang.Object r0 = r0.get(r4)
            io.reactivex.disposables.CompositeDisposable r0 = (io.reactivex.disposables.CompositeDisposable) r0
            if (r0 != 0) goto L14
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r1 = r2.maps
            r1.put(r4, r0)
        L14:
            r0.add(r3)
            return r3
    }

    public io.reactivex.disposables.Disposable add(java.lang.Object r3, io.reactivex.disposables.Disposable r4) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r2.maps
            java.lang.Object r0 = r0.get(r3)
            io.reactivex.disposables.CompositeDisposable r0 = (io.reactivex.disposables.CompositeDisposable) r0
            if (r0 != 0) goto L14
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r1 = r2.maps
            r1.put(r3, r0)
        L14:
            r0.add(r4)
            return r4
    }

    public void remove(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r1.maps
            java.lang.Object r0 = r0.get(r2)
            io.reactivex.disposables.CompositeDisposable r0 = (io.reactivex.disposables.CompositeDisposable) r0
            if (r0 == 0) goto L12
            r0.dispose()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r1.maps
            r0.remove(r2)
        L12:
            return
    }

    public void remove(java.lang.Object r2, io.reactivex.disposables.Disposable r3) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r1.maps
            java.lang.Object r0 = r0.get(r2)
            io.reactivex.disposables.CompositeDisposable r0 = (io.reactivex.disposables.CompositeDisposable) r0
            if (r0 == 0) goto L18
            r0.remove(r3)
            int r3 = r0.size()
            if (r3 != 0) goto L18
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r3 = r1.maps
            r3.remove(r2)
        L18:
            return
    }

    public void removeAll() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r2.maps
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            io.reactivex.disposables.CompositeDisposable r1 = (io.reactivex.disposables.CompositeDisposable) r1
            if (r1 == 0) goto La
            r1.dispose()
            r0.remove()
            goto La
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, io.reactivex.disposables.CompositeDisposable> r0 = r2.maps
            r0.clear()
            return
    }
}
