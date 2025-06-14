package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableScan<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> accumulator;

    static final class ScanObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiFunction<T, T, T> accumulator;
        final io.reactivex.Observer<? super T> actual;
        boolean done;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f438s;
        T value;

        ScanObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f438s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f438s
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
                io.reactivex.Observer<? super T> r0 = r1.actual
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
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.Observer<? super T> r0 = r3.actual
                T r1 = r3.value
                if (r1 != 0) goto L11
                r3.value = r4
                r0.onNext(r4)
                goto L22
            L11:
                io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator     // Catch: java.lang.Throwable -> L23
                java.lang.Object r4 = r2.apply(r1, r4)     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "The value returned by the accumulator is null"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)     // Catch: java.lang.Throwable -> L23
                r3.value = r4
                r0.onNext(r4)
            L22:
                return
            L23:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                io.reactivex.disposables.Disposable r0 = r3.f438s
                r0.dispose()
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f438s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f438s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableScan(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableScan$ScanObserver r1 = new io.reactivex.internal.operators.observable.ObservableScan$ScanObserver
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
