package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableElementAtMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final long index;
    final io.reactivex.ObservableSource<T> source;

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        long count;
        boolean done;
        final long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f402s;

        ElementAtObserver(io.reactivex.MaybeObserver<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f402s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f402s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
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
                io.reactivex.disposables.Disposable r0 = r4.f402s
                r0.dispose()
                io.reactivex.MaybeObserver<? super T> r0 = r4.actual
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
                io.reactivex.disposables.Disposable r0 = r1.f402s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f402s = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableElementAtMaybe(io.reactivex.ObservableSource<T> r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.index = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableElementAt r6 = new io.reactivex.internal.operators.observable.ObservableElementAt
            io.reactivex.ObservableSource<T> r1 = r7.source
            long r2 = r7.index
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r6)
            return r0
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(io.reactivex.MaybeObserver<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableElementAtMaybe$ElementAtObserver r1 = new io.reactivex.internal.operators.observable.ObservableElementAtMaybe$ElementAtObserver
            long r2 = r4.index
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
