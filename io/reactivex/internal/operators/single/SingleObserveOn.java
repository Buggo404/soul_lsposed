package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleObserveOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<T> source;

    static final class ObserveOnSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final io.reactivex.SingleObserver<? super T> actual;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        T value;

        ObserveOnSingleObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r2
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

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                io.reactivex.Scheduler r1 = r0.scheduler
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0)
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.SingleObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.value = r1
                io.reactivex.Scheduler r1 = r0.scheduler
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0)
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto La
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r1.onError(r0)
                goto L11
            La:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                T r1 = r2.value
                r0.onSuccess(r1)
            L11:
                return
        }
    }

    public SingleObserveOn(io.reactivex.SingleSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver r1 = new io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
