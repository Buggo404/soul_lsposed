package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSampleTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class SampleTimedEmitLast<T> extends io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleTimedEmitLast(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.wip = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        void complete() {
                r1 = this;
                r1.emit()
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L10
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            L10:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.incrementAndGet()
                r1 = 2
                if (r0 != r1) goto L19
                r2.emit()
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L19
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
            L19:
                return
        }
    }

    static final class SampleTimedNoLast<T> extends io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        void complete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                r0.emit()
                return
        }
    }

    static abstract class SampleTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final long period;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f289s;
        final io.reactivex.Scheduler scheduler;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final java.util.concurrent.TimeUnit unit;

        SampleTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.period = r3
                r1.unit = r5
                r1.scheduler = r6
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r1.cancelTimer()
                org.reactivestreams.Subscription r0 = r1.f289s
                r0.cancel()
                return
        }

        void cancelTimer() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        abstract void complete();

        void emit() {
                r5 = this;
                r0 = 0
                java.lang.Object r0 = r5.getAndSet(r0)
                if (r0 == 0) goto L2f
                java.util.concurrent.atomic.AtomicLong r1 = r5.requested
                long r1 = r1.get()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L20
                org.reactivestreams.Subscriber<? super T> r1 = r5.actual
                r1.onNext(r0)
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r1 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r1)
                goto L2f
            L20:
                r5.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Couldn't emit value due to lack of requests!"
                r1.<init>(r2)
                r0.onError(r1)
            L2f:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r0 = this;
                r0.cancelTimer()
                r0.complete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancelTimer()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r9) {
                r8 = this;
                org.reactivestreams.Subscription r0 = r8.f289s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r9)
                if (r0 == 0) goto L28
                r8.f289s = r9
                org.reactivestreams.Subscriber<? super T> r0 = r8.actual
                r0.onSubscribe(r8)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r8.timer
                io.reactivex.Scheduler r1 = r8.scheduler
                long r5 = r8.period
                java.util.concurrent.TimeUnit r7 = r8.unit
                r2 = r8
                r3 = r5
                io.reactivex.disposables.Disposable r1 = r1.schedulePeriodicallyDirect(r2, r3, r5, r7)
                r0.replace(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9.request(r0)
            L28:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lb
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
            Lb:
                return
        }
    }

    public FlowableSampleTimed(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.period = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.emitLast = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            io.reactivex.subscribers.SerializedSubscriber r1 = new io.reactivex.subscribers.SerializedSubscriber
            r1.<init>(r8)
            boolean r8 = r7.emitLast
            if (r8 == 0) goto L1b
            io.reactivex.Flowable<T> r8 = r7.source
            io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedEmitLast r6 = new io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedEmitLast
            long r2 = r7.period
            java.util.concurrent.TimeUnit r4 = r7.unit
            io.reactivex.Scheduler r5 = r7.scheduler
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            r8.subscribe(r6)
            goto L2c
        L1b:
            io.reactivex.Flowable<T> r8 = r7.source
            io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedNoLast r6 = new io.reactivex.internal.operators.flowable.FlowableSampleTimed$SampleTimedNoLast
            long r2 = r7.period
            java.util.concurrent.TimeUnit r4 = r7.unit
            io.reactivex.Scheduler r5 = r7.scheduler
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            r8.subscribe(r6)
        L2c:
            return
    }
}
