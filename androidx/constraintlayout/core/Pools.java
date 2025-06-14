package androidx.constraintlayout.core;

/* loaded from: classes.dex */
final class Pools {
    private static final boolean DEBUG = false;

    interface Pool<T> {
        T acquire();

        boolean release(T r1);

        void releaseAll(T[] r1, int r2);
    }

    static class SimplePool<T> implements androidx.constraintlayout.core.Pools.Pool<T> {
        private final java.lang.Object[] mPool;
        private int mPoolSize;

        SimplePool(int r2) {
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

        @Override // androidx.constraintlayout.core.Pools.Pool
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

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T r4) {
                r3 = this;
                int r0 = r3.mPoolSize
                java.lang.Object[] r1 = r3.mPool
                int r2 = r1.length
                if (r0 >= r2) goto Le
                r1[r0] = r4
                r4 = 1
                int r0 = r0 + r4
                r3.mPoolSize = r0
                return r4
            Le:
                r4 = 0
                return r4
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] r6, int r7) {
                r5 = this;
                int r0 = r6.length
                if (r7 <= r0) goto L4
                int r7 = r6.length
            L4:
                r0 = 0
            L5:
                if (r0 >= r7) goto L19
                r1 = r6[r0]
                int r2 = r5.mPoolSize
                java.lang.Object[] r3 = r5.mPool
                int r4 = r3.length
                if (r2 >= r4) goto L16
                r3[r2] = r1
                int r2 = r2 + 1
                r5.mPoolSize = r2
            L16:
                int r0 = r0 + 1
                goto L5
            L19:
                return
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
