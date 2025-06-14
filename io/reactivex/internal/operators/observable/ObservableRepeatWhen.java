package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRepeatWhen<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> handler;

    static final class RepeatWhenObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        volatile boolean active;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: d */
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f431d;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver<T>.InnerRepeatObserver inner;
        final io.reactivex.subjects.Subject<java.lang.Object> signaller;
        final io.reactivex.ObservableSource<T> source;
        final java.util.concurrent.atomic.AtomicInteger wip;

        final class InnerRepeatObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object> {
            private static final long serialVersionUID = 3254781284376480842L;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver this$0;

            InnerRepeatObserver(io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver r0 = r1.this$0
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver r0 = r1.this$0
                    r0.innerError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(java.lang.Object r1) {
                    r0 = this;
                    io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver r1 = r0.this$0
                    r1.innerNext()
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        RepeatWhenObserver(io.reactivex.Observer<? super T> r1, io.reactivex.subjects.Subject<java.lang.Object> r2, io.reactivex.ObservableSource<T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.signaller = r2
                r0.source = r3
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver r1 = new io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver
                r1.<init>(r0)
                r0.inner = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.f431d = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f431d
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver<T>$InnerRepeatObserver r0 = r1.inner
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void innerComplete() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f431d
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
                return
        }

        void innerError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f431d
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        void innerNext() {
                r0 = this;
                r0.subscribeNext()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f431d
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                r0 = 0
                r2.active = r0
                io.reactivex.subjects.Subject<java.lang.Object> r1 = r2.signaller
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.onNext(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver<T>$InnerRepeatObserver r0 = r2.inner
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f431d
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
                return
        }

        void subscribeNext() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L23
            L8:
                boolean r0 = r1.isDisposed()
                if (r0 == 0) goto Lf
                return
            Lf:
                boolean r0 = r1.active
                if (r0 != 0) goto L1b
                r0 = 1
                r1.active = r0
                io.reactivex.ObservableSource<T> r0 = r1.source
                r0.subscribe(r1)
            L1b:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L8
            L23:
                return
        }
    }

    public ObservableRepeatWhen(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.handler = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.subjects.PublishSubject r0 = io.reactivex.subjects.PublishSubject.create()
            io.reactivex.subjects.Subject r0 = r0.toSerialized()
            io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r1 = r4.handler     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "The handler returned a null ObservableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L29
            io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L29
            io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver r2 = new io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver
            io.reactivex.ObservableSource<T> r3 = r4.source
            r2.<init>(r5, r0, r3)
            r5.onSubscribe(r2)
            io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver<T>$InnerRepeatObserver r5 = r2.inner
            r1.subscribe(r5)
            r2.subscribeNext()
            return
        L29:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
