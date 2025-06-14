package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final io.reactivex.Scheduler scheduler;

    static final class SubscribeOnSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final boolean nonScheduledRequests;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f305s;
        org.reactivestreams.Publisher<T> source;
        final io.reactivex.Scheduler.Worker worker;

        static final class Request implements java.lang.Runnable {

            /* renamed from: n */
            private final long f306n;

            /* renamed from: s */
            private final org.reactivestreams.Subscription f307s;

            Request(org.reactivestreams.Subscription r1, long r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f307s = r1
                    r0.f306n = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    org.reactivestreams.Subscription r0 = r3.f307s
                    long r1 = r3.f306n
                    r0.request(r1)
                    return
            }
        }

        SubscribeOnSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.Scheduler.Worker r2, org.reactivestreams.Publisher<T> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.worker = r2
                r0.source = r3
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.f305s = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                r1 = r4 ^ 1
                r0.nonScheduledRequests = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f305s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.worker
                r2.dispose()
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
        public void onSubscribe(org.reactivestreams.Subscription r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.f305s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r6)
                if (r0 == 0) goto L17
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r1 = 0
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L17
                r5.requestUpstream(r3, r6)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r5) {
                r4 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r5)
                if (r0 == 0) goto L32
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.f305s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                if (r0 == 0) goto L14
                r4.requestUpstream(r5, r0)
                goto L32
            L14:
                java.util.concurrent.atomic.AtomicLong r0 = r4.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r5)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r5 = r4.f305s
                java.lang.Object r5 = r5.get()
                org.reactivestreams.Subscription r5 = (org.reactivestreams.Subscription) r5
                if (r5 == 0) goto L32
                java.util.concurrent.atomic.AtomicLong r6 = r4.requested
                r0 = 0
                long r2 = r6.getAndSet(r0)
                int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r6 == 0) goto L32
                r4.requestUpstream(r2, r5)
            L32:
                return
        }

        void requestUpstream(long r3, org.reactivestreams.Subscription r5) {
                r2 = this;
                boolean r0 = r2.nonScheduledRequests
                if (r0 != 0) goto L1a
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.Object r1 = r2.get()
                if (r0 != r1) goto Lf
                goto L1a
            Lf:
                io.reactivex.Scheduler$Worker r0 = r2.worker
                io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$Request r1 = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$Request
                r1.<init>(r5, r3)
                r0.schedule(r1)
                goto L1d
            L1a:
                r5.request(r3)
            L1d:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r2.lazySet(r0)
                org.reactivestreams.Publisher<T> r0 = r2.source
                r1 = 0
                r2.source = r1
                r0.subscribe(r2)
                return
        }
    }

    public FlowableSubscribeOn(io.reactivex.Flowable<T> r1, io.reactivex.Scheduler r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            r0.nonScheduledRequests = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Scheduler r0 = r4.scheduler
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber
            io.reactivex.Flowable<T> r2 = r4.source
            boolean r3 = r4.nonScheduledRequests
            r1.<init>(r5, r0, r2, r3)
            r5.onSubscribe(r1)
            r0.schedule(r1)
            return
    }
}
