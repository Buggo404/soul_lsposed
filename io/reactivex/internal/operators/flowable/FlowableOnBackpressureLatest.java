package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableOnBackpressureLatest<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    static final class BackpressureLatestSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 163080509307634843L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final java.util.concurrent.atomic.AtomicReference<T> current;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f275s;

        BackpressureLatestSubscriber(org.reactivestreams.Subscriber<? super T> r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.current = r0
                r1.actual = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L18
                r0 = 1
                r2.cancelled = r0
                org.reactivestreams.Subscription r0 = r2.f275s
                r0.cancel()
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L18
                java.util.concurrent.atomic.AtomicReference<T> r0 = r2.current
                r1 = 0
                r0.lazySet(r1)
            L18:
                return
        }

        boolean checkTerminated(boolean r4, boolean r5, org.reactivestreams.Subscriber<?> r6, java.util.concurrent.atomic.AtomicReference<T> r7) {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                if (r0 == 0) goto La
                r7.lazySet(r1)
                return r2
            La:
                if (r4 == 0) goto L1d
                java.lang.Throwable r4 = r3.error
                if (r4 == 0) goto L17
                r7.lazySet(r1)
                r6.onError(r4)
                return r2
            L17:
                if (r5 == 0) goto L1d
                r6.onComplete()
                return r2
            L1d:
                r4 = 0
                return r4
        }

        void drain() {
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r13.actual
                java.util.concurrent.atomic.AtomicLong r1 = r13.requested
                java.util.concurrent.atomic.AtomicReference<T> r2 = r13.current
                r3 = 1
                r4 = r3
            Lf:
                r5 = 0
                r7 = r5
            L12:
                long r9 = r1.get()
                int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                r10 = 0
                if (r9 == 0) goto L38
                boolean r9 = r13.done
                r11 = 0
                java.lang.Object r11 = r2.getAndSet(r11)
                if (r11 != 0) goto L26
                r12 = r3
                goto L27
            L26:
                r12 = r10
            L27:
                boolean r9 = r13.checkTerminated(r9, r12, r0, r2)
                if (r9 == 0) goto L2e
                return
            L2e:
                if (r12 == 0) goto L31
                goto L38
            L31:
                r0.onNext(r11)
                r9 = 1
                long r7 = r7 + r9
                goto L12
            L38:
                long r11 = r1.get()
                int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r9 != 0) goto L50
                boolean r9 = r13.done
                java.lang.Object r11 = r2.get()
                if (r11 != 0) goto L49
                r10 = r3
            L49:
                boolean r9 = r13.checkTerminated(r9, r10, r0, r2)
                if (r9 == 0) goto L50
                return
            L50:
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 == 0) goto L57
                io.reactivex.internal.util.BackpressureHelper.produced(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<T> r0 = r1.current
                r0.lazySet(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f275s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f275s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public FlowableOnBackpressureLatest(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest$BackpressureLatestSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest$BackpressureLatestSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
