package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableCollectSingle<T, U> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToObservable<U> {
    final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
    final java.util.concurrent.Callable<? extends U> initialSupplier;
    final io.reactivex.ObservableSource<T> source;

    static final class CollectObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super U> actual;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
        boolean done;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f384s;

        /* renamed from: u */
        final U f385u;

        CollectObserver(io.reactivex.SingleObserver<? super U> r1, U r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.collector = r3
                r0.f385u = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f384s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f384s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.SingleObserver<? super U> r0 = r2.actual
                U r1 = r2.f385u
                r0.onSuccess(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.SingleObserver<? super U> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.BiConsumer<? super U, ? super T> r0 = r2.collector     // Catch: java.lang.Throwable -> Ld
                U r1 = r2.f385u     // Catch: java.lang.Throwable -> Ld
                r0.accept(r1, r3)     // Catch: java.lang.Throwable -> Ld
                goto L16
            Ld:
                r3 = move-exception
                io.reactivex.disposables.Disposable r0 = r2.f384s
                r0.dispose()
                r2.onError(r3)
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f384s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f384s = r2
                io.reactivex.SingleObserver<? super U> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableCollectSingle(io.reactivex.ObservableSource<T> r1, java.util.concurrent.Callable<? extends U> r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialSupplier = r2
            r0.collector = r3
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<U> fuseToObservable() {
            r4 = this;
            io.reactivex.internal.operators.observable.ObservableCollect r0 = new io.reactivex.internal.operators.observable.ObservableCollect
            io.reactivex.ObservableSource<T> r1 = r4.source
            java.util.concurrent.Callable<? extends U> r2 = r4.initialSupplier
            io.reactivex.functions.BiConsumer<? super U, ? super T> r3 = r4.collector
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super U> r5) {
            r4 = this;
            java.util.concurrent.Callable<? extends U> r0 = r4.initialSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The initialSupplier returned a null value"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            io.reactivex.ObservableSource<T> r1 = r4.source
            io.reactivex.internal.operators.observable.ObservableCollectSingle$CollectObserver r2 = new io.reactivex.internal.operators.observable.ObservableCollectSingle$CollectObserver
            io.reactivex.functions.BiConsumer<? super U, ? super T> r3 = r4.collector
            r2.<init>(r5, r0, r3)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
