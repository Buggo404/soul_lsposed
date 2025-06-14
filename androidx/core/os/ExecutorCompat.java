package androidx.core.os;

/* loaded from: classes.dex */
public final class ExecutorCompat {

    private static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        HandlerExecutor(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto Lf
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " is shutting down"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    private ExecutorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor create(android.os.Handler r1) {
            androidx.core.os.ExecutorCompat$HandlerExecutor r0 = new androidx.core.os.ExecutorCompat$HandlerExecutor
            r0.<init>(r1)
            return r0
    }
}
