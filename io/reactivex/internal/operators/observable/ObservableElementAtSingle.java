package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableElementAtSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final T defaultValue;
    final long index;
    final io.reactivex.ObservableSource<T> source;

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;
        long count;
        final T defaultValue;
        boolean done;
        final long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f403s;

        ElementAtObserver(io.reactivex.SingleObserver<? super T> r1, long r2, T r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.defaultValue = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f403s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f403s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L1b
                r0 = 1
                r2.done = r0
                T r0 = r2.defaultValue
                if (r0 == 0) goto L11
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L1b
            L11:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
            L1b:
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
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.count
                long r2 = r4.index
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L1b
                r0 = 1
                r4.done = r0
                io.reactivex.disposables.Disposable r0 = r4.f403s
                r0.dispose()
                io.reactivex.SingleObserver<? super T> r0 = r4.actual
                r0.onSuccess(r5)
                return
            L1b:
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f403s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f403s = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableElementAtSingle(io.reactivex.ObservableSource<T> r1, long r2, T r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.index = r2
            r0.defaultValue = r4
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableElementAt r6 = new io.reactivex.internal.operators.observable.ObservableElementAt
            io.reactivex.ObservableSource<T> r1 = r7.source
            long r2 = r7.index
            T r4 = r7.defaultValue
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r6)
            return r0
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super T> r6) {
            r5 = this;
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableElementAtSingle$ElementAtObserver r1 = new io.reactivex.internal.operators.observable.ObservableElementAtSingle$ElementAtObserver
            long r2 = r5.index
            T r4 = r5.defaultValue
            r1.<init>(r6, r2, r4)
            r0.subscribe(r1)
            return
    }
}
