package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
final class InstantPeriodicTask implements java.util.concurrent.Callable<java.lang.Void>, io.reactivex.disposables.Disposable {
    static final java.util.concurrent.FutureTask<java.lang.Void> CANCELLED = null;
    final java.util.concurrent.ExecutorService executor;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> first;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> rest;
    java.lang.Thread runner;
    final java.lang.Runnable task;

    static {
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            java.lang.Runnable r1 = io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.schedulers.InstantPeriodicTask.CANCELLED = r0
            return
    }

    InstantPeriodicTask(java.lang.Runnable r1, java.util.concurrent.ExecutorService r2) {
            r0 = this;
            r0.<init>()
            r0.task = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.first = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.rest = r1
            r0.executor = r2
            return
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Void call() throws java.lang.Exception {
            r1 = this;
            java.lang.Void r0 = r1.call2()
            return r0
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.lang.Void call2() throws java.lang.Exception {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r2.runner = r0
            r0 = 0
            java.lang.Runnable r1 = r2.task     // Catch: java.lang.Throwable -> L18
            r1.run()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.ExecutorService r1 = r2.executor     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch: java.lang.Throwable -> L18
            r2.setRest(r1)     // Catch: java.lang.Throwable -> L18
            r2.runner = r0     // Catch: java.lang.Throwable -> L18
            goto L1e
        L18:
            r1 = move-exception
            r2.runner = r0
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
        L1e:
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r6.first
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.InstantPeriodicTask.CANCELLED
            java.lang.Object r0 = r0.getAndSet(r1)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L1e
            java.lang.Thread r4 = r6.runner
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            if (r4 == r5) goto L1a
            r4 = r2
            goto L1b
        L1a:
            r4 = r3
        L1b:
            r0.cancel(r4)
        L1e:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r6.rest
            java.lang.Object r0 = r0.getAndSet(r1)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 == 0) goto L37
            if (r0 == r1) goto L37
            java.lang.Thread r1 = r6.runner
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r1 == r4) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r0.cancel(r2)
        L37:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r2.first
            java.lang.Object r0 = r0.get()
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.InstantPeriodicTask.CANCELLED
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    void setFirst(java.util.concurrent.Future<?> r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r2.first
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.InstantPeriodicTask.CANCELLED
            if (r0 != r1) goto L1b
            java.lang.Thread r0 = r2.runner
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r3.cancel(r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r1 = r2.first
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            return
    }

    void setRest(java.util.concurrent.Future<?> r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r2.rest
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = io.reactivex.internal.schedulers.InstantPeriodicTask.CANCELLED
            if (r0 != r1) goto L1b
            java.lang.Thread r0 = r2.runner
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r3.cancel(r0)
            return
        L1b:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r1 = r2.rest
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            return
    }
}
