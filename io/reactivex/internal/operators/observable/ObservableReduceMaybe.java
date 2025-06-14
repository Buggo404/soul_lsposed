package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableReduceMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.ObservableSource<T> source;

    static final class ReduceObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f426d;
        boolean done;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        T value;

        ReduceObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.reducer = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f426d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f426d
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
                T r0 = r2.value
                r1 = 0
                r2.value = r1
                if (r0 == 0) goto L15
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L1a
            L15:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L1a:
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
                r0 = 0
                r1.value = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L26
                T r0 = r2.value
                if (r0 != 0) goto Lb
                r2.value = r3
                goto L26
            Lb:
                io.reactivex.functions.BiFunction<T, T, T> r1 = r2.reducer     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1a
                r2.value = r3     // Catch: java.lang.Throwable -> L1a
                goto L26
            L1a:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.disposables.Disposable r0 = r2.f426d
                r0.dispose()
                r2.onError(r3)
            L26:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f426d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f426d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableReduceMaybe(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.reducer = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableReduceMaybe$ReduceObserver r1 = new io.reactivex.internal.operators.observable.ObservableReduceMaybe$ReduceObserver
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.reducer
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
