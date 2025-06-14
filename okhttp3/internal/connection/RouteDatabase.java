package okhttp3.internal.connection;

/* loaded from: classes.dex */
final class RouteDatabase {
    private final java.util.Set<okhttp3.Route> failedRoutes;

    RouteDatabase() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.failedRoutes = r0
            return
    }

    public synchronized void connected(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void failed(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized boolean shouldPostpone(okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<okhttp3.Route> r0 = r1.failedRoutes     // Catch: java.lang.Throwable -> L9
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
