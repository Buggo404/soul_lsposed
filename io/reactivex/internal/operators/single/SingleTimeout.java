package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleTimeout<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class TimeoutMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 37497744973048446L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<T> fallback;
        io.reactivex.SingleSource<? extends T> other;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> task;

        static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final io.reactivex.SingleObserver<? super T> actual;

            TimeoutFallbackObserver(io.reactivex.SingleObserver<? super T> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.SingleObserver<? super T> r0 = r1.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T r2) {
                    r1 = this;
                    io.reactivex.SingleObserver<? super T> r0 = r1.actual
                    r0.onSuccess(r2)
                    return
            }
        }

        TimeoutMainObserver(io.reactivex.SingleObserver<? super T> r2, io.reactivex.SingleSource<? extends T> r3) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                r1.other = r3
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.task = r0
                if (r3 == 0) goto L18
                io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver r3 = new io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver
                r3.<init>(r2)
                r1.fallback = r3
                goto L1b
            L18:
                r2 = 0
                r1.fallback = r2
            L1b:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.task
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver<T> r0 = r1.fallback
                if (r0 == 0) goto Lf
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            Lf:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1d
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.task
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L20
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L20:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1c
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1c
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.task
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L1c:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L2e
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                boolean r1 = r2.compareAndSet(r0, r1)
                if (r1 == 0) goto L2e
                if (r0 == 0) goto L17
                r0.dispose()
            L17:
                io.reactivex.SingleSource<? extends T> r0 = r2.other
                if (r0 != 0) goto L26
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
                r1.<init>()
                r0.onError(r1)
                goto L2e
            L26:
                r1 = 0
                r2.other = r1
                io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver$TimeoutFallbackObserver<T> r1 = r2.fallback
                r0.subscribe(r1)
            L2e:
                return
        }
    }

    public SingleTimeout(io.reactivex.SingleSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.SingleSource<? extends T> r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r6) {
            r5 = this;
            io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver r0 = new io.reactivex.internal.operators.single.SingleTimeout$TimeoutMainObserver
            io.reactivex.SingleSource<? extends T> r1 = r5.other
            r0.<init>(r6, r1)
            r6.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r6 = r0.task
            io.reactivex.Scheduler r1 = r5.scheduler
            long r2 = r5.timeout
            java.util.concurrent.TimeUnit r4 = r5.unit
            io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0, r2, r4)
            io.reactivex.internal.disposables.DisposableHelper.replace(r6, r1)
            io.reactivex.SingleSource<T> r6 = r5.source
            r6.subscribe(r0)
            return
    }
}
