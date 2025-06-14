package androidx.core.util;

/* loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T r1);
    }

    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {
        private final java.lang.Object[] mPool;
        private int mPoolSize;

        public SimplePool(int r2) {
                r1 = this;
                r1.<init>()
                if (r2 <= 0) goto La
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.mPool = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The max pool size must be > 0"
                r2.<init>(r0)
                throw r2
        }

        private boolean isInPool(T r4) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r3.mPoolSize
                if (r1 >= r2) goto L11
                java.lang.Object[] r2 = r3.mPool
                r2 = r2[r1]
                if (r2 != r4) goto Le
                r4 = 1
                return r4
            Le:
                int r1 = r1 + 1
                goto L2
            L11:
                return r0
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
                r5 = this;
                int r0 = r5.mPoolSize
                r1 = 0
                if (r0 <= 0) goto L12
                int r2 = r0 + (-1)
                java.lang.Object[] r3 = r5.mPool
                r4 = r3[r2]
                r3[r2] = r1
                int r0 = r0 + (-1)
                r5.mPoolSize = r0
                return r4
            L12:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T r4) {
                r3 = this;
                boolean r0 = r3.isInPool(r4)
                if (r0 != 0) goto L16
                int r0 = r3.mPoolSize
                java.lang.Object[] r1 = r3.mPool
                int r2 = r1.length
                if (r0 >= r2) goto L14
                r1[r0] = r4
                r4 = 1
                int r0 = r0 + r4
                r3.mPoolSize = r0
                return r4
            L14:
                r4 = 0
                return r4
            L16:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Already in the pool!"
                r4.<init>(r0)
                throw r4
        }
    }

    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {
        private final java.lang.Object mLock;

        public SynchronizedPool(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.mLock = r1
                return
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.lang.Object r1 = super.acquire()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r1
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                boolean r2 = super.release(r2)     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                return r2
            L9:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
                throw r2
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
