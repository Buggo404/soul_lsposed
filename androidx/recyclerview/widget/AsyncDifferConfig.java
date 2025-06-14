package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class AsyncDifferConfig<T> {
    private final java.util.concurrent.Executor mBackgroundThreadExecutor;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> mDiffCallback;
    private final java.util.concurrent.Executor mMainThreadExecutor;

    public static final class Builder<T> {
        private static java.util.concurrent.Executor sDiffExecutor;
        private static final java.lang.Object sExecutorLock = null;
        private java.util.concurrent.Executor mBackgroundThreadExecutor;
        private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> mDiffCallback;
        private java.util.concurrent.Executor mMainThreadExecutor;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.recyclerview.widget.AsyncDifferConfig.Builder.sExecutorLock = r0
                return
        }

        public Builder(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r1) {
                r0 = this;
                r0.<init>()
                r0.mDiffCallback = r1
                return
        }

        public androidx.recyclerview.widget.AsyncDifferConfig<T> build() {
                r4 = this;
                java.util.concurrent.Executor r0 = r4.mBackgroundThreadExecutor
                if (r0 != 0) goto L1b
                java.lang.Object r0 = androidx.recyclerview.widget.AsyncDifferConfig.Builder.sExecutorLock
                monitor-enter(r0)
                java.util.concurrent.Executor r1 = androidx.recyclerview.widget.AsyncDifferConfig.Builder.sDiffExecutor     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L12
                r1 = 2
                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)     // Catch: java.lang.Throwable -> L18
                androidx.recyclerview.widget.AsyncDifferConfig.Builder.sDiffExecutor = r1     // Catch: java.lang.Throwable -> L18
            L12:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                java.util.concurrent.Executor r0 = androidx.recyclerview.widget.AsyncDifferConfig.Builder.sDiffExecutor
                r4.mBackgroundThreadExecutor = r0
                goto L1b
            L18:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
            L1b:
                androidx.recyclerview.widget.AsyncDifferConfig r0 = new androidx.recyclerview.widget.AsyncDifferConfig
                java.util.concurrent.Executor r1 = r4.mMainThreadExecutor
                java.util.concurrent.Executor r2 = r4.mBackgroundThreadExecutor
                androidx.recyclerview.widget.DiffUtil$ItemCallback<T> r3 = r4.mDiffCallback
                r0.<init>(r1, r2, r3)
                return r0
        }

        public androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setBackgroundThreadExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.mBackgroundThreadExecutor = r1
                return r0
        }

        public androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setMainThreadExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.mMainThreadExecutor = r1
                return r0
        }
    }

    AsyncDifferConfig(java.util.concurrent.Executor r1, java.util.concurrent.Executor r2, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r3) {
            r0 = this;
            r0.<init>()
            r0.mMainThreadExecutor = r1
            r0.mBackgroundThreadExecutor = r2
            r0.mDiffCallback = r3
            return
    }

    public java.util.concurrent.Executor getBackgroundThreadExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mBackgroundThreadExecutor
            return r0
    }

    public androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getDiffCallback() {
            r1 = this;
            androidx.recyclerview.widget.DiffUtil$ItemCallback<T> r0 = r1.mDiffCallback
            return r0
    }

    public java.util.concurrent.Executor getMainThreadExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mMainThreadExecutor
            return r0
    }
}
