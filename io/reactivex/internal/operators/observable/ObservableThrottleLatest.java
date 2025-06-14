package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableThrottleLatest<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class ThrottleLatestObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final io.reactivex.Observer<? super T> downstream;
        final boolean emitLast;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicReference<T> latest;
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.disposables.Disposable upstream;
        final io.reactivex.Scheduler.Worker worker;

        ThrottleLatestObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                r0.emitLast = r6
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.latest = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 1
                r2.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r2.upstream
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r2.worker
                r0.dispose()
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L19
                java.util.concurrent.atomic.AtomicReference<T> r0 = r2.latest
                r1 = 0
                r0.lazySet(r1)
            L19:
                return
        }

        void drain() {
                r8 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.concurrent.atomic.AtomicReference<T> r0 = r8.latest
                io.reactivex.Observer<? super T> r1 = r8.downstream
                r2 = 1
                r3 = r2
            Ld:
                boolean r4 = r8.cancelled
                r5 = 0
                if (r4 == 0) goto L16
                r0.lazySet(r5)
                return
            L16:
                boolean r4 = r8.done
                if (r4 == 0) goto L2c
                java.lang.Throwable r6 = r8.error
                if (r6 == 0) goto L2c
                r0.lazySet(r5)
                java.lang.Throwable r0 = r8.error
                r1.onError(r0)
                io.reactivex.Scheduler$Worker r0 = r8.worker
                r0.dispose()
                return
            L2c:
                java.lang.Object r6 = r0.get()
                r7 = 0
                if (r6 != 0) goto L35
                r6 = r2
                goto L36
            L35:
                r6 = r7
            L36:
                if (r4 == 0) goto L4e
                java.lang.Object r0 = r0.getAndSet(r5)
                if (r6 != 0) goto L45
                boolean r2 = r8.emitLast
                if (r2 == 0) goto L45
                r1.onNext(r0)
            L45:
                r1.onComplete()
                io.reactivex.Scheduler$Worker r0 = r8.worker
                r0.dispose()
                return
            L4e:
                if (r6 == 0) goto L59
                boolean r4 = r8.timerFired
                if (r4 == 0) goto L62
                r8.timerRunning = r7
                r8.timerFired = r7
                goto L62
            L59:
                boolean r4 = r8.timerRunning
                if (r4 == 0) goto L6a
                boolean r4 = r8.timerFired
                if (r4 == 0) goto L62
                goto L6a
            L62:
                int r3 = -r3
                int r3 = r8.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
            L6a:
                java.lang.Object r4 = r0.getAndSet(r5)
                r1.onNext(r4)
                r8.timerFired = r7
                r8.timerRunning = r2
                io.reactivex.Scheduler$Worker r4 = r8.worker
                long r5 = r8.timeout
                java.util.concurrent.TimeUnit r7 = r8.unit
                r4.schedule(r8, r5, r7)
                goto Ld
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<T> r0 = r1.latest
                r0.set(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                io.reactivex.Observer<? super T> r2 = r1.downstream
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 1
                r1.timerFired = r0
                r1.drain()
                return
        }
    }

    public ObservableThrottleLatest(io.reactivex.Observable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.emitLast = r6
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r10) {
            r9 = this;
            io.reactivex.ObservableSource<T> r0 = r9.source
            io.reactivex.internal.operators.observable.ObservableThrottleLatest$ThrottleLatestObserver r8 = new io.reactivex.internal.operators.observable.ObservableThrottleLatest$ThrottleLatestObserver
            long r3 = r9.timeout
            java.util.concurrent.TimeUnit r5 = r9.unit
            io.reactivex.Scheduler r1 = r9.scheduler
            io.reactivex.Scheduler$Worker r6 = r1.createWorker()
            boolean r7 = r9.emitLast
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r6, r7)
            r0.subscribe(r8)
            return
    }
}
