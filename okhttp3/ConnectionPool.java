package okhttp3;

/* loaded from: classes.dex */
public final class ConnectionPool {
    final okhttp3.internal.connection.RealConnectionPool delegate;

    public ConnectionPool() {
            r4 = this;
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 5
            r4.<init>(r3, r0, r2)
            return
    }

    public ConnectionPool(int r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            r1.<init>()
            okhttp3.internal.connection.RealConnectionPool r0 = new okhttp3.internal.connection.RealConnectionPool
            r0.<init>(r2, r3, r5)
            r1.delegate = r0
            return
    }

    public int connectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.connectionCount()
            return r0
    }

    public void evictAll() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            r0.evictAll()
            return
    }

    public int idleConnectionCount() {
            r1 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r1.delegate
            int r0 = r0.idleConnectionCount()
            return r0
    }
}
