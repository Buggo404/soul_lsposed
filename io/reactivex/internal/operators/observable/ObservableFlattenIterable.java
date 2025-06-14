package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFlattenIterable<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;

    static final class FlattenIterableObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f410d;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;

        FlattenIterableObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f410d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f410d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f410d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f410d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f410d = r0
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f410d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            La:
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f410d = r0
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                io.reactivex.disposables.Disposable r0 = r3.f410d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r3.mapper     // Catch: java.lang.Throwable -> L43
                java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L43
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L43
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L43
                io.reactivex.Observer<? super R> r0 = r3.actual
            L15:
                boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L36
                if (r1 == 0) goto L35
                java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L29
                java.lang.String r2 = "The iterator returned a null value"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L29
                r0.onNext(r1)
                goto L15
            L29:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r0 = r3.f410d
                r0.dispose()
                r3.onError(r4)
            L35:
                return
            L36:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r0 = r3.f410d
                r0.dispose()
                r3.onError(r4)
                return
            L43:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r0 = r3.f410d
                r0.dispose()
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f410d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f410d = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableFlattenIterable(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableFlattenIterable$FlattenIterableObserver r1 = new io.reactivex.internal.operators.observable.ObservableFlattenIterable$FlattenIterableObserver
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
