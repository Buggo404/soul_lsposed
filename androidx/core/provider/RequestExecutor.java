package androidx.core.provider;

/* loaded from: classes.dex */
class RequestExecutor {

    private static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private int mPriority;
        private java.lang.String mThreadName;

        private static class ProcessPriorityThread extends java.lang.Thread {
            private final int mPriority;

            ProcessPriorityThread(java.lang.Runnable r1, java.lang.String r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.mPriority = r3
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r1 = this;
                    int r0 = r1.mPriority
                    android.os.Process.setThreadPriority(r0)
                    super.run()
                    return
            }
        }

        DefaultThreadFactory(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mThreadName = r1
                r0.mPriority = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread r0 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
                java.lang.String r1 = r3.mThreadName
                int r2 = r3.mPriority
                r0.<init>(r4, r1, r2)
                return r0
        }
    }

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

    private static class ReplyRunnable<T> implements java.lang.Runnable {
        private java.util.concurrent.Callable<T> mCallable;
        private androidx.core.util.Consumer<T> mConsumer;
        private android.os.Handler mHandler;


        ReplyRunnable(android.os.Handler r1, java.util.concurrent.Callable<T> r2, androidx.core.util.Consumer<T> r3) {
                r0 = this;
                r0.<init>()
                r0.mCallable = r2
                r0.mConsumer = r3
                r0.mHandler = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.concurrent.Callable<T> r0 = r4.mCallable     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto L8
            L7:
                r0 = 0
            L8:
                androidx.core.util.Consumer<T> r1 = r4.mConsumer
                android.os.Handler r2 = r4.mHandler
                androidx.core.provider.RequestExecutor$ReplyRunnable$1 r3 = new androidx.core.provider.RequestExecutor$ReplyRunnable$1
                r3.<init>(r4, r1, r0)
                r2.post(r3)
                return
        }
    }

    private RequestExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.concurrent.ThreadPoolExecutor createDefaultExecutor(java.lang.String r8, int r9, int r10) {
            androidx.core.provider.RequestExecutor$DefaultThreadFactory r7 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory
            r7.<init>(r8, r9)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 0
            r2 = 1
            long r3 = (long) r10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r8.allowCoreThreadTimeOut(r9)
            return r8
    }

    static java.util.concurrent.Executor createHandlerExecutor(android.os.Handler r1) {
            androidx.core.provider.RequestExecutor$HandlerExecutor r0 = new androidx.core.provider.RequestExecutor$HandlerExecutor
            r0.<init>(r1)
            return r0
    }

    static <T> void execute(java.util.concurrent.Executor r2, java.util.concurrent.Callable<T> r3, androidx.core.util.Consumer<T> r4) {
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.RequestExecutor$ReplyRunnable r1 = new androidx.core.provider.RequestExecutor$ReplyRunnable
            r1.<init>(r0, r3, r4)
            r2.execute(r1)
            return
    }

    static <T> T submit(java.util.concurrent.ExecutorService r1, java.util.concurrent.Callable<T> r2, int r3) throws java.lang.InterruptedException {
            java.util.concurrent.Future r1 = r1.submit(r2)
            long r2 = (long) r3
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> Lc java.lang.InterruptedException -> L14 java.util.concurrent.ExecutionException -> L16
            java.lang.Object r1 = r1.get(r2, r0)     // Catch: java.util.concurrent.TimeoutException -> Lc java.lang.InterruptedException -> L14 java.util.concurrent.ExecutionException -> L16
            return r1
        Lc:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            java.lang.String r2 = "timeout"
            r1.<init>(r2)
            throw r1
        L14:
            r1 = move-exception
            throw r1
        L16:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
