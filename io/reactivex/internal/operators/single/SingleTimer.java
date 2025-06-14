package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleTimer extends io.reactivex.Single<java.lang.Long> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class TimerDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final io.reactivex.SingleObserver<? super java.lang.Long> actual;

        TimerDisposable(io.reactivex.SingleObserver<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
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

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r3.actual
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        void setFuture(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }
    }

    public SingleTimer(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            r0.<init>()
            r0.delay = r1
            r0.unit = r3
            r0.scheduler = r4
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> r5) {
            r4 = this;
            io.reactivex.internal.operators.single.SingleTimer$TimerDisposable r0 = new io.reactivex.internal.operators.single.SingleTimer$TimerDisposable
            r0.<init>(r5)
            r5.onSubscribe(r0)
            io.reactivex.Scheduler r5 = r4.scheduler
            long r1 = r4.delay
            java.util.concurrent.TimeUnit r3 = r4.unit
            io.reactivex.disposables.Disposable r5 = r5.scheduleDirect(r0, r1, r3)
            r0.setFuture(r5)
            return
    }
}
