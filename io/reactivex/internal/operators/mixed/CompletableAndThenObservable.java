package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class CompletableAndThenObservable<R> extends io.reactivex.Observable<R> {
    final io.reactivex.ObservableSource<? extends R> other;
    final io.reactivex.CompletableSource source;

    static final class AndThenObservableObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8948264376121066672L;
        final io.reactivex.Observer<? super R> downstream;
        io.reactivex.ObservableSource<? extends R> other;

        AndThenObservableObserver(io.reactivex.Observer<? super R> r1, io.reactivex.ObservableSource<? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.other = r2
                r0.downstream = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.ObservableSource<? extends R> r0 = r2.other
                if (r0 != 0) goto La
                io.reactivex.Observer<? super R> r0 = r2.downstream
                r0.onComplete()
                goto L10
            La:
                r1 = 0
                r2.other = r1
                r0.subscribe(r2)
            L10:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(R r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.downstream
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }
    }

    public CompletableAndThenObservable(io.reactivex.CompletableSource r1, io.reactivex.ObservableSource<? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r3) {
            r2 = this;
            io.reactivex.internal.operators.mixed.CompletableAndThenObservable$AndThenObservableObserver r0 = new io.reactivex.internal.operators.mixed.CompletableAndThenObservable$AndThenObservableObserver
            io.reactivex.ObservableSource<? extends R> r1 = r2.other
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.CompletableSource r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
