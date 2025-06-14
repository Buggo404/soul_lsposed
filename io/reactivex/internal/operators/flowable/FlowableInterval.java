package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableInterval extends io.reactivex.Flowable<java.lang.Long> {
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class IntervalSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> actual;
        long count;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource;

        IntervalSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.resource = r0
                r1.actual = r2
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
                r7 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.resource
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L4f
                long r0 = r7.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L29
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r7.actual
                long r1 = r7.count
                r3 = 1
                long r5 = r1 + r3
                r7.count = r5
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onNext(r1)
                io.reactivex.internal.util.BackpressureHelper.produced(r7, r3)
                goto L4f
            L29:
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r7.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Can't deliver value "
                r2.<init>(r3)
                long r3 = r7.count
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " due to lack of requests"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r0.onError(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.resource
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L4f:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.resource
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    public FlowableInterval(long r1, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r0 = this;
            r0.<init>()
            r0.initialDelay = r1
            r0.period = r3
            r0.unit = r5
            r0.scheduler = r6
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r9) {
            r8 = this;
            io.reactivex.internal.operators.flowable.FlowableInterval$IntervalSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableInterval$IntervalSubscriber
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
