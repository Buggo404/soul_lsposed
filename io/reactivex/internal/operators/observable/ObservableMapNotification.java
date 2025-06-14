package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableMapNotification<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.ObservableSource<? extends R>> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> onCompleteSupplier;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> onErrorMapper;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> onNextMapper;

    static final class MapNotificationObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> actual;
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> onCompleteSupplier;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> onErrorMapper;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> onNextMapper;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f420s;

        MapNotificationObserver(io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onNextMapper = r2
                r0.onErrorMapper = r3
                r0.onCompleteSupplier = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f420s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f420s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r0 = r2.onCompleteSupplier     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = "The onComplete ObservableSource returned is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L19
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r1 = r2.actual
                r1.onNext(r0)
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r0 = r2.actual
                r0.onComplete()
                return
            L19:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r0 = r5.onErrorMapper     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = "The onError ObservableSource returned is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0     // Catch: java.lang.Throwable -> L19
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r6 = r5.actual
                r6.onNext(r0)
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r6 = r5.actual
                r6.onComplete()
                return
            L19:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r0 = r1.onNextMapper     // Catch: java.lang.Throwable -> L14
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L14
                java.lang.String r0 = "The onNext ObservableSource returned is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L14
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2     // Catch: java.lang.Throwable -> L14
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r0 = r1.actual
                r0.onNext(r2)
                return
            L14:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f420s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f420s = r2
                io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableMapNotification(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.onNextMapper = r2
            r0.onErrorMapper = r3
            r0.onCompleteSupplier = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableMapNotification$MapNotificationObserver r1 = new io.reactivex.internal.operators.observable.ObservableMapNotification$MapNotificationObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2 = r5.onNextMapper
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r3 = r5.onErrorMapper
            java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r4 = r5.onCompleteSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
