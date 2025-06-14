package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSingleMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.ObservableSource<T> source;

    static final class SingleElementObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        boolean done;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f444s;
        T value;

        SingleElementObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f444s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f444s
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
                if (r0 != 0) goto L15
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
                goto L1a
            L15:
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
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
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
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
                T r0 = r2.value
                if (r0 == 0) goto L1e
                r3 = 1
                r2.done = r3
                io.reactivex.disposables.Disposable r3 = r2.f444s
                r3.dispose()
                io.reactivex.MaybeObserver<? super T> r3 = r2.actual
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Sequence contains more than one element!"
                r0.<init>(r1)
                r3.onError(r0)
                return
            L1e:
                r2.value = r3
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f444s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f444s = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSingleMaybe(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableSingleMaybe$SingleElementObserver r1 = new io.reactivex.internal.operators.observable.ObservableSingleMaybe$SingleElementObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
