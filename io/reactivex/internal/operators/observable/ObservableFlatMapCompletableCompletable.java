package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final io.reactivex.ObservableSource<T> source;

    static final class FlatMapCompletableMainObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f407d;
        final boolean delayErrors;
        volatile boolean disposed;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        final io.reactivex.disposables.CompositeDisposable set;

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver this$0;

            InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
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

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver r0 = r1.this$0
                    r0.innerComplete(r1)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver r0 = r1.this$0
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        FlatMapCompletableMainObserver(io.reactivex.CompletableObserver r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                r1 = 1
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.disposables.Disposable r0 = r1.f407d
                r0.dispose()
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                return
        }

        void innerComplete(io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver<T>.InnerObserver r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.delete(r2)
                r1.onComplete()
                return
        }

        void innerError(io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver<T>.InnerObserver r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.delete(r2)
                r1.onError(r3)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f407d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                int r0 = r2.decrementAndGet()
                if (r0 != 0) goto L19
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L14
                io.reactivex.CompletableObserver r1 = r2.actual
                r1.onError(r0)
                goto L19
            L14:
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
            L19:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L34
                boolean r2 = r1.delayErrors
                if (r2 == 0) goto L1e
                int r2 = r1.decrementAndGet()
                if (r2 != 0) goto L37
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                goto L37
            L1e:
                r1.dispose()
                r2 = 0
                int r2 = r1.getAndSet(r2)
                if (r2 <= 0) goto L37
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                goto L37
            L34:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L37:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r0 = r2.mapper     // Catch: java.lang.Throwable -> L26
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L26
                java.lang.String r0 = "The mapper returned a null CompletableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L26
                io.reactivex.CompletableSource r3 = (io.reactivex.CompletableSource) r3     // Catch: java.lang.Throwable -> L26
                r2.getAndIncrement()
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver
                r0.<init>(r2)
                boolean r1 = r2.disposed
                if (r1 != 0) goto L25
                io.reactivex.disposables.CompositeDisposable r1 = r2.set
                boolean r1 = r1.add(r0)
                if (r1 == 0) goto L25
                r3.subscribe(r0)
            L25:
                return
            L26:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.f407d
                r0.dispose()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f407d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f407d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableFlatMapCompletableCompletable(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
            r4 = this;
            io.reactivex.internal.operators.observable.ObservableFlatMapCompletable r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable
            io.reactivex.ObservableSource<T> r1 = r4.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver r1 = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
