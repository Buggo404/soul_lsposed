package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableOnErrorReturn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    static final class OnErrorReturnObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f423s;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

        OnErrorReturnObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.valueSupplier = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f423s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f423s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r0 = r5.valueSupplier     // Catch: java.lang.Throwable -> L23
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L23
                if (r0 != 0) goto L18
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "The supplied value is null"
                r0.<init>(r1)
                r0.initCause(r6)
                io.reactivex.Observer<? super T> r6 = r5.actual
                r6.onError(r0)
                return
            L18:
                io.reactivex.Observer<? super T> r6 = r5.actual
                r6.onNext(r0)
                io.reactivex.Observer<? super T> r6 = r5.actual
                r6.onComplete()
                return
            L23:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r5.actual
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
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f423s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f423s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableOnErrorReturn(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.valueSupplier = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableOnErrorReturn$OnErrorReturnObserver r1 = new io.reactivex.internal.operators.observable.ObservableOnErrorReturn$OnErrorReturnObserver
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2 = r3.valueSupplier
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
