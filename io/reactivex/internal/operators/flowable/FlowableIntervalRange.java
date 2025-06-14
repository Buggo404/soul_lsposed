package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableIntervalRange extends io.reactivex.Flowable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    static final class IntervalRangeSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> actual;
        long count;
        final long end;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

        IntervalRangeSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> r2, long r3, long r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.resource = r0
                r1.actual = r2
                r1.count = r3
                r1.end = r5
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
            L9:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r6.resource
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L72
                long r0 = r6.get()
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L4c
                long r2 = r6.count
                org.reactivestreams.Subscriber<? super java.lang.Long> r4 = r6.actual
                java.lang.Long r5 = java.lang.Long.valueOf(r2)
                r4.onNext(r5)
                long r4 = r6.end
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto L3a
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r6.resource
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L34
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r6.actual
                r0.onComplete()
            L34:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r6.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
            L3a:
                r4 = 1
                long r2 = r2 + r4
                r6.count = r2
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L72
                r6.decrementAndGet()
                goto L72
            L4c:
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r6.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Can't deliver value "
                r2.<init>(r3)
                long r3 = r6.count
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " due to lack of requests"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.onError(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r6.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L72:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    public FlowableIntervalRange(long r1, long r3, long r5, long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
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

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r9) {
            r8 = this;
            io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableIntervalRange$IntervalRangeSubscriber
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
