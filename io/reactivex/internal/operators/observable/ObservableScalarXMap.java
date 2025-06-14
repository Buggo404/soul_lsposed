package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueDisposable<T>, java.lang.Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final io.reactivex.Observer<? super T> observer;
        final T value;

        public ScalarDisposable(io.reactivex.Observer<? super T> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                r0.value = r2
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 3
                r1.lazySet(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 3
                r1.set(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                int r0 = r2.get()
                r1 = 3
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.get()
                r1 = 1
                if (r0 == r1) goto L8
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Should not be called!"
                r2.<init>(r0)
                throw r2
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r1, T r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Should not be called!"
                r1.<init>(r2)
                throw r1
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                int r0 = r2.get()
                r1 = 1
                if (r0 != r1) goto Le
                r0 = 3
                r2.lazySet(r0)
                T r0 = r2.value
                return r0
            Le:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r1.lazySet(r0)
                return r0
            L8:
                r2 = 0
                return r2
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                int r0 = r3.get()
                if (r0 != 0) goto L24
                r0 = 0
                r1 = 2
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L24
                io.reactivex.Observer<? super T> r0 = r3.observer
                T r2 = r3.value
                r0.onNext(r2)
                int r0 = r3.get()
                if (r0 != r1) goto L24
                r0 = 3
                r3.lazySet(r0)
                io.reactivex.Observer<? super T> r0 = r3.observer
                r0.onComplete()
            L24:
                return
        }
    }

    static final class ScalarXMapObservable<T, R> extends io.reactivex.Observable<R> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> mapper;
        final T value;

        ScalarXMapObservable(T r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(io.reactivex.Observer<? super R> r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L38
                T r1 = r2.value     // Catch: java.lang.Throwable -> L38
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L38
                java.lang.String r1 = "The mapper returned a null ObservableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L38
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L38
                boolean r1 = r0 instanceof java.util.concurrent.Callable
                if (r1 == 0) goto L34
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2c
                if (r0 != 0) goto L20
                io.reactivex.internal.disposables.EmptyDisposable.complete(r3)
                return
            L20:
                io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable r1 = new io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable
                r1.<init>(r3, r0)
                r3.onSubscribe(r1)
                r1.run()
                goto L37
            L2c:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
                return
            L34:
                r0.subscribe(r3)
            L37:
                return
            L38:
                r0 = move-exception
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
                return
        }
    }

    private ObservableScalarXMap() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> io.reactivex.Observable<U> scalarXMap(T r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2) {
            io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarXMapObservable r0 = new io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarXMapObservable
            r0.<init>(r1, r2)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    public static <T, R> boolean tryScalarXMapSubscribe(io.reactivex.ObservableSource<T> r1, io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3) {
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L55
            r0 = 1
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L11
            io.reactivex.internal.disposables.EmptyDisposable.complete(r2)
            return r0
        L11:
            java.lang.Object r1 = r3.apply(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "The mapper returned a null ObservableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r3)     // Catch: java.lang.Throwable -> L45
            io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L45
            boolean r3 = r1 instanceof java.util.concurrent.Callable
            if (r3 == 0) goto L41
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L2d
            io.reactivex.internal.disposables.EmptyDisposable.complete(r2)
            return r0
        L2d:
            io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable r3 = new io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable
            r3.<init>(r2, r1)
            r2.onSubscribe(r3)
            r3.run()
            goto L44
        L39:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r2)
            return r0
        L41:
            r1.subscribe(r2)
        L44:
            return r0
        L45:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r2)
            return r0
        L4d:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r2)
            return r0
        L55:
            r1 = 0
            return r1
    }
}
