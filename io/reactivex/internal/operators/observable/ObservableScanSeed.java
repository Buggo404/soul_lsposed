package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableScanSeed<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
    final java.util.concurrent.Callable<R> seedSupplier;

    static final class ScanSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
        final io.reactivex.Observer<? super R> actual;
        boolean done;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f439s;
        R value;

        ScanSeedObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.BiFunction<R, ? super T, R> r2, R r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                r0.value = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f439s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f439s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onComplete()
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
                io.reactivex.Observer<? super R> r0 = r1.actual
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
                R r0 = r2.value
                io.reactivex.functions.BiFunction<R, ? super T, R> r1 = r2.accumulator     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1b
                java.lang.String r0 = "The accumulator returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1b
                r2.value = r3
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onNext(r3)
                return
            L1b:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.f439s
                r0.dispose()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f439s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L16
                r1.f439s = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
                io.reactivex.Observer<? super R> r2 = r1.actual
                R r0 = r1.value
                r2.onNext(r0)
            L16:
                return
        }
    }

    public ObservableScanSeed(io.reactivex.ObservableSource<T> r1, java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r3
            r0.seedSupplier = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r5) {
            r4 = this;
            java.util.concurrent.Callable<R> r0 = r4.seedSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The seed supplied is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            io.reactivex.ObservableSource<T> r1 = r4.source
            io.reactivex.internal.operators.observable.ObservableScanSeed$ScanSeedObserver r2 = new io.reactivex.internal.operators.observable.ObservableScanSeed$ScanSeedObserver
            io.reactivex.functions.BiFunction<R, ? super T, R> r3 = r4.accumulator
            r2.<init>(r5, r3, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
