package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableIntervalRange extends io.reactivex.Observable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    static final class IntervalRangeObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        final io.reactivex.Observer<? super java.lang.Long> actual;
        long count;
        final long end;

        IntervalRangeObserver(io.reactivex.Observer<? super java.lang.Long> r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.end = r4
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
                r4 = this;
                boolean r0 = r4.isDisposed()
                if (r0 != 0) goto L25
                long r0 = r4.count
                io.reactivex.Observer<? super java.lang.Long> r2 = r4.actual
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                r2.onNext(r3)
                long r2 = r4.end
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L20
                io.reactivex.internal.disposables.DisposableHelper.dispose(r4)
                io.reactivex.Observer<? super java.lang.Long> r0 = r4.actual
                r0.onComplete()
                return
            L20:
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
            L25:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableIntervalRange(long r1, long r3, long r5, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r5
            r0.period = r7
            r0.unit = r9
            r0.scheduler = r10
            r0.start = r1
            r0.end = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r9) {
            r8 = this;
            io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver r7 = new io.reactivex.internal.operators.observable.ObservableIntervalRange$IntervalRangeObserver
            long r2 = r8.start
            long r4 = r8.end
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r4)
            r9.onSubscribe(r7)
            io.reactivex.Scheduler r0 = r8.scheduler
            boolean r9 = r0 instanceof io.reactivex.internal.schedulers.TrampolineScheduler
            if (r9 == 0) goto L26
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            r7.setResource(r0)
            long r2 = r8.initialDelay
            long r4 = r8.period
            java.util.concurrent.TimeUnit r6 = r8.unit
            r1 = r7
            r0.schedulePeriodically(r1, r2, r4, r6)
            goto L34
        L26:
            long r2 = r8.initialDelay
            long r4 = r8.period
            java.util.concurrent.TimeUnit r6 = r8.unit
            r1 = r7
            io.reactivex.disposables.Disposable r9 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
            r7.setResource(r9)
        L34:
            return
    }
}
