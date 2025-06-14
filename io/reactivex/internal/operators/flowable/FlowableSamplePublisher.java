package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSamplePublisher<T> extends io.reactivex.Flowable<T> {
    final boolean emitLast;
    final org.reactivestreams.Publisher<?> other;
    final org.reactivestreams.Publisher<T> source;

    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleMainEmitLast(org.reactivestreams.Subscriber<? super T> r1, org.reactivestreams.Publisher<?> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completeMain() {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L13
                r1.emit()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            L13:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completeOther() {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L13
                r1.emit()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            L13:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void run() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L1d
            L8:
                boolean r0 = r1.done
                r1.emit()
                if (r0 == 0) goto L15
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
            L15:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L8
            L1d:
                return
        }
    }

    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(org.reactivestreams.Subscriber<? super T> r1, org.reactivestreams.Publisher<?> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completeMain() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void completeOther() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        void run() {
                r0 = this;
                r0.emit()
                return
        }
    }

    static abstract class SamplePublisherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> other;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f288s;
        final org.reactivestreams.Publisher<?> sampler;

        SamplePublisherSubscriber(org.reactivestreams.Subscriber<? super T> r2, org.reactivestreams.Publisher<?> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.sampler = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscription r0 = r1.f288s
                r0.cancel()
                return
        }

        public void complete() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f288s
                r0.cancel()
                r1.completeOther()
                return
        }

        abstract void completeMain();

        abstract void completeOther();

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

        public void error(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f288s
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r1.completeMain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
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
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f288s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L29
                r2.f288s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.other
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L29
                org.reactivestreams.Publisher<?> r0 = r2.sampler
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplerSubscriber
                r1.<init>(r2)
                r0.subscribe(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L29:
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

        abstract void run();

        void setOther(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.other
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4, r1)
                return
        }
    }

    static final class SamplerSubscriber<T> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        final io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> parent;

        SamplerSubscriber(io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r1.parent
                r0.complete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r1.parent
                r0.error(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r1 = r0.parent
                r1.run()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SamplePublisherSubscriber<T> r0 = r1.parent
                r0.setOther(r2)
                return
        }
    }

    public FlowableSamplePublisher(org.reactivestreams.Publisher<T> r1, org.reactivestreams.Publisher<?> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            r0.emitLast = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r4)
            boolean r4 = r3.emitLast
            if (r4 == 0) goto L16
            org.reactivestreams.Publisher<T> r4 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainEmitLast r1 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainEmitLast
            org.reactivestreams.Publisher<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
            goto L22
        L16:
            org.reactivestreams.Publisher<T> r4 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainNoLast r1 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher$SampleMainNoLast
            org.reactivestreams.Publisher<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
        L22:
            return
    }
}
