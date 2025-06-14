package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableInterval extends io.reactivex.Observable<java.lang.Long> {
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class IntervalObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        final io.reactivex.Observer<? super java.lang.Long> actual;
        long count;

        IntervalObserver(io.reactivex.Observer<? super java.lang.Long> r1) {
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
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.Object r0 = r5.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L18
                io.reactivex.Observer<? super java.lang.Long> r0 = r5.actual
                long r1 = r5.count
                r3 = 1
                long r3 = r3 + r1
                r5.count = r3
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onNext(r1)
            L18:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableInterval(long r1, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r1
            r0.period = r3
            r0.unit = r5
            r0.scheduler = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r9) {
            r8 = this;
            io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver r7 = new io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver
            r7.<init>(r9)
            r9.onSubscribe(r7)
            io.reactivex.Scheduler r0 = r8.scheduler
            boolean r9 = r0 instanceof io.reactivex.internal.schedulers.TrampolineScheduler
            if (r9 == 0) goto L20
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            r7.setResource(r0)
            long r2 = r8.initialDelay
            long r4 = r8.period
            java.util.concurrent.TimeUnit r6 = r8.unit
            r1 = r7
            r0.schedulePeriodically(r1, r2, r4, r6)
            goto L2e
        L20:
            long r2 = r8.initialDelay
            long r4 = r8.period
            java.util.concurrent.TimeUnit r6 = r8.unit
            r1 = r7
            io.reactivex.disposables.Disposable r9 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
            r7.setResource(r9)
        L2e:
            return
    }
}
