package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDelayWithObservable<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.ObservableSource<U> other;
    final io.reactivex.SingleSource<T> source;

    static final class OtherSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> actual;
        boolean done;
        final io.reactivex.SingleSource<T> source;

        OtherSubscriber(io.reactivex.SingleObserver<? super T> r1, io.reactivex.SingleSource<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.source = r2
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
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.done = r0
                io.reactivex.SingleSource<T> r0 = r3.source
                io.reactivex.internal.observers.ResumeSingleObserver r1 = new io.reactivex.internal.observers.ResumeSingleObserver
                io.reactivex.SingleObserver<? super T> r2 = r3.actual
                r1.<init>(r3, r2)
                r0.subscribe(r1)
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
        public void onNext(U r1) {
                r0 = this;
                java.lang.Object r1 = r0.get()
                io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
                r1.dispose()
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.SingleObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }
    }

    public SingleDelayWithObservable(io.reactivex.SingleSource<T> r1, io.reactivex.ObservableSource<U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<U> r0 = r3.other
            io.reactivex.internal.operators.single.SingleDelayWithObservable$OtherSubscriber r1 = new io.reactivex.internal.operators.single.SingleDelayWithObservable$OtherSubscriber
            io.reactivex.SingleSource<T> r2 = r3.source
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
