package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleSubscribeOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.SingleSource<? extends T> source;

    static final class SubscribeOnObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.SingleSource<? extends T> source;
        final io.reactivex.internal.disposables.SequentialDisposable task;

        SubscribeOnObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.SingleSource<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.source = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
                r0.dispose()
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
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                io.reactivex.SingleSource<? extends T> r0 = r1.source
                r0.subscribe(r1)
                return
        }
    }

    public SingleSubscribeOn(io.reactivex.SingleSource<? extends T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver r0 = new io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver
            io.reactivex.SingleSource<? extends T> r1 = r2.source
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.Scheduler r3 = r2.scheduler
            io.reactivex.disposables.Disposable r3 = r3.scheduleDirect(r0)
            io.reactivex.internal.disposables.SequentialDisposable r0 = r0.task
            r0.replace(r3)
            return
    }
}
