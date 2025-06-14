package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> other;
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class FallbackSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter arbiter;

        FallbackSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.subscriptions.SubscriptionArbiter r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.arbiter = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.arbiter
                r0.setSubscription(r2)
                return
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long consumed;
        org.reactivestreams.Publisher<? extends T> fallback;
        final java.util.concurrent.atomic.AtomicLong index;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
        final io.reactivex.Scheduler.Worker worker;

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, org.reactivestreams.Publisher<? extends T> r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                r0.fallback = r6
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.index = r1
                return
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1e
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r5.worker
                r0.dispose()
            L1e:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L1f
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onError(r6)
                io.reactivex.Scheduler$Worker r6 = r5.worker
                r6.dispose()
                goto L22
            L1f:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L22:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r8) {
                r7 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r7.index
                long r0 = r0.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L34
                java.util.concurrent.atomic.AtomicLong r2 = r7.index
                r3 = 1
                long r5 = r0 + r3
                boolean r0 = r2.compareAndSet(r0, r5)
                if (r0 != 0) goto L1c
                goto L34
            L1c:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r7.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                r0.dispose()
                long r0 = r7.consumed
                long r0 = r0 + r3
                r7.consumed = r0
                org.reactivestreams.Subscriber<? super T> r0 = r7.actual
                r0.onNext(r8)
                r7.startTimeout(r5)
            L34:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r2)
                if (r0 == 0) goto Lb
                r1.setSubscription(r2)
            Lb:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 == 0) goto L31
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
                long r4 = r3.consumed
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 == 0) goto L1d
                r3.produced(r4)
            L1d:
                org.reactivestreams.Publisher<? extends T> r4 = r3.fallback
                r5 = 0
                r3.fallback = r5
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$FallbackSubscriber r5 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$FallbackSubscriber
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                r5.<init>(r0, r3)
                r4.subscribe(r5)
                io.reactivex.Scheduler$Worker r4 = r3.worker
                r4.dispose()
            L31:
                return
        }

        void startTimeout(long r5) {
                r4 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                io.reactivex.Scheduler$Worker r1 = r4.worker
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTask r2 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTask
                r2.<init>(r5, r4)
                long r5 = r4.timeout
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r5 = r1.schedule(r2, r5, r3)
                r0.replace(r5)
                return
        }
    }

    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final long timeout;
        final java.util.concurrent.TimeUnit unit;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
        final io.reactivex.Scheduler.Worker worker;

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L1c
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r4.worker
                r0.dispose()
            L1c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L1d
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                io.reactivex.Scheduler$Worker r5 = r4.worker
                r5.dispose()
                goto L20
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L20:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L2a
                r2 = 1
                long r2 = r2 + r0
                boolean r0 = r4.compareAndSet(r0, r2)
                if (r0 != 0) goto L17
                goto L2a
            L17:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                r4.startTimeout(r2)
            L2a:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r3 = r2.compareAndSet(r3, r0)
                if (r3 == 0) goto L1f
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r3)
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
                r4.<init>()
                r3.onError(r4)
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
            L1f:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }

        void startTimeout(long r5) {
                r4 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                io.reactivex.Scheduler$Worker r1 = r4.worker
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTask r2 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutTask
                r2.<init>(r5, r4)
                long r5 = r4.timeout
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r5 = r1.schedule(r2, r5, r3)
                r0.replace(r5)
                return
        }
    }

    interface TimeoutSupport {
        void onTimeout(long r1);
    }

    static final class TimeoutTask implements java.lang.Runnable {
        final long idx;
        final io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport parent;

        TimeoutTask(long r1, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport r3) {
                r0 = this;
                r0.<init>()
                r0.idx = r1
                r0.parent = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSupport r0 = r3.parent
                long r1 = r3.idx
                r0.onTimeout(r1)
                return
        }
    }

    public FlowableTimeoutTimed(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, org.reactivestreams.Publisher<? extends T> r6) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r11) {
            r10 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r10.other
            r1 = 0
            if (r0 != 0) goto L23
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutSubscriber
            long r5 = r10.timeout
            java.util.concurrent.TimeUnit r7 = r10.unit
            io.reactivex.Scheduler r3 = r10.scheduler
            io.reactivex.Scheduler$Worker r8 = r3.createWorker()
            r3 = r0
            r4 = r11
            r3.<init>(r4, r5, r7, r8)
            r11.onSubscribe(r0)
            r0.startTimeout(r1)
            io.reactivex.Flowable<T> r11 = r10.source
            r11.subscribe(r0)
            goto L41
        L23:
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutFallbackSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$TimeoutFallbackSubscriber
            long r5 = r10.timeout
            java.util.concurrent.TimeUnit r7 = r10.unit
            io.reactivex.Scheduler r3 = r10.scheduler
            io.reactivex.Scheduler$Worker r8 = r3.createWorker()
            org.reactivestreams.Publisher<? extends T> r9 = r10.other
            r3 = r0
            r4 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r11.onSubscribe(r0)
            r0.startTimeout(r1)
            io.reactivex.Flowable<T> r11 = r10.source
            r11.subscribe(r0)
        L41:
            return
    }
}
