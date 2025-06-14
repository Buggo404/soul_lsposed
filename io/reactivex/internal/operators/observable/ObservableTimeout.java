package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> itemTimeoutIndicator;
    final io.reactivex.ObservableSource<? extends T> other;

    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport parent;

        TimeoutConsumer(long r1, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport r3) {
                r0 = this;
                r0.<init>()
                r0.idx = r1
                r0.parent = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
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

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.lazySet(r0)
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutSelectorSupport r0 = r3.parent
                long r1 = r3.idx
                r0.onTimeout(r1)
            L14:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L15
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.lazySet(r0)
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutSelectorSupport r0 = r3.parent
                long r1 = r3.idx
                r0.onTimeoutError(r1, r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r3 = r2.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r3 == r0) goto L19
                r3.dispose()
                io.reactivex.internal.disposables.DisposableHelper r3 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.lazySet(r3)
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutSelectorSupport r3 = r2.parent
                long r0 = r2.idx
                r3.onTimeout(r0)
            L19:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = -7508389464265974549L;
        final io.reactivex.Observer<? super T> actual;
        io.reactivex.ObservableSource<? extends T> fallback;
        final java.util.concurrent.atomic.AtomicLong index;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;

        TimeoutFallbackObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> r2, io.reactivex.ObservableSource<? extends T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.itemTimeoutIndicator = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                r0.fallback = r3
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.index = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
                r0.dispose()
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

        @Override // io.reactivex.Observer
        public void onComplete() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1e
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onComplete()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
                r0.dispose()
            L1e:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1f
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                io.reactivex.internal.disposables.SequentialDisposable r6 = r5.task
                r6.dispose()
                goto L22
            L1f:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L22:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r8) {
                r7 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r7.index
                long r0 = r0.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L65
                java.util.concurrent.atomic.AtomicLong r4 = r7.index
                r5 = 1
                long r5 = r5 + r0
                boolean r0 = r4.compareAndSet(r0, r5)
                if (r0 != 0) goto L1b
                goto L65
            L1b:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r7.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto L28
                r0.dispose()
            L28:
                io.reactivex.Observer<? super T> r0 = r7.actual
                r0.onNext(r8)
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> r0 = r7.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r8 = r0.apply(r8)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r0 = "The itemTimeoutIndicator returned a null ObservableSource."
                java.lang.Object r8 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L4c
                io.reactivex.ObservableSource r8 = (io.reactivex.ObservableSource) r8     // Catch: java.lang.Throwable -> L4c
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer
                r0.<init>(r5, r7)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r7.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L4b
                r8.subscribe(r0)
            L4b:
                return
            L4c:
                r8 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.upstream
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                r0.dispose()
                java.util.concurrent.atomic.AtomicLong r0 = r7.index
                r0.getAndSet(r2)
                io.reactivex.Observer<? super T> r0 = r7.actual
                r0.onError(r8)
            L65:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 == 0) goto L21
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r4 = r3.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
                io.reactivex.ObservableSource<? extends T> r4 = r3.fallback
                r5 = 0
                r3.fallback = r5
                io.reactivex.internal.operators.observable.ObservableTimeoutTimed$FallbackObserver r5 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed$FallbackObserver
                io.reactivex.Observer<? super T> r0 = r3.actual
                r5.<init>(r0, r3)
                r4.subscribe(r5)
            L21:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long r4, java.lang.Throwable r6) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 == 0) goto L16
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.Observer<? super T> r4 = r3.actual
                r4.onError(r6)
                goto L19
            L16:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L19:
                return
        }

        void startFirstTimeout(io.reactivex.ObservableSource<?> r4) {
                r3 = this;
                if (r4 == 0) goto L14
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer
                r1 = 0
                r0.<init>(r1, r3)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L14
                r4.subscribe(r0)
            L14:
                return
        }
    }

    static final class TimeoutObserver<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;

        TimeoutObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.itemTimeoutIndicator = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L17
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onComplete()
            L17:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L18
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onError(r5)
                goto L1b
            L18:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L1b:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r7) {
                r6 = this;
                long r0 = r6.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L5f
                r4 = 1
                long r4 = r4 + r0
                boolean r0 = r6.compareAndSet(r0, r4)
                if (r0 != 0) goto L17
                goto L5f
            L17:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r6.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto L24
                r0.dispose()
            L24:
                io.reactivex.Observer<? super T> r0 = r6.actual
                r0.onNext(r7)
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> r0 = r6.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L48
                java.lang.Object r7 = r0.apply(r7)     // Catch: java.lang.Throwable -> L48
                java.lang.String r0 = "The itemTimeoutIndicator returned a null ObservableSource."
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)     // Catch: java.lang.Throwable -> L48
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> L48
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer
                r0.<init>(r4, r6)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r6.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L47
                r7.subscribe(r0)
            L47:
                return
            L48:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r6.upstream
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                r0.dispose()
                r6.getAndSet(r2)
                io.reactivex.Observer<? super T> r0 = r6.actual
                r0.onError(r7)
            L5f:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public void onTimeout(long r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r3 = r2.compareAndSet(r3, r0)
                if (r3 == 0) goto L1a
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r2.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.Observer<? super T> r3 = r2.actual
                java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
                r4.<init>()
                r3.onError(r4)
            L1a:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long r3, java.lang.Throwable r5) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r3 = r2.compareAndSet(r3, r0)
                if (r3 == 0) goto L16
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r2.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onError(r5)
                goto L19
            L16:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L19:
                return
        }

        void startFirstTimeout(io.reactivex.ObservableSource<?> r4) {
                r3 = this;
                if (r4 == 0) goto L14
                io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer
                r1 = 0
                r0.<init>(r1, r3)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L14
                r4.subscribe(r0)
            L14:
                return
        }
    }

    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long r1, java.lang.Throwable r3);
    }

    public ObservableTimeout(io.reactivex.Observable<T> r1, io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3, io.reactivex.ObservableSource<? extends T> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.firstTimeoutIndicator = r2
            r0.itemTimeoutIndicator = r3
            r0.other = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<? extends T> r0 = r3.other
            if (r0 != 0) goto L19
            io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r1 = r3.itemTimeoutIndicator
            r0.<init>(r4, r1)
            r4.onSubscribe(r0)
            io.reactivex.ObservableSource<U> r4 = r3.firstTimeoutIndicator
            r0.startFirstTimeout(r4)
            io.reactivex.ObservableSource<T> r4 = r3.source
            r4.subscribe(r0)
            goto L2f
        L19:
            io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutFallbackObserver r0 = new io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutFallbackObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r1 = r3.itemTimeoutIndicator
            io.reactivex.ObservableSource<? extends T> r2 = r3.other
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            io.reactivex.ObservableSource<U> r4 = r3.firstTimeoutIndicator
            r0.startFirstTimeout(r4)
            io.reactivex.ObservableSource<T> r4 = r3.source
            r4.subscribe(r0)
        L2f:
            return
    }
}
