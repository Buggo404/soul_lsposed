package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;
    final org.reactivestreams.Publisher<?>[] otherArray;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> otherIterable;

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany r0 = r3.this$0
                io.reactivex.functions.Function<? super java.lang.Object[], R> r0 = r0.combiner
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
                return r4
        }
    }

    static final class WithLatestFromSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 1577321883966341961L;
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f333s;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] subscribers;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> values;

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                r1.combiner = r3
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r2 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[r4]
                r3 = 0
            La:
                if (r3 >= r4) goto L16
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber
                r0.<init>(r1, r3)
                r2[r3] = r0
                int r3 = r3 + 1
                goto La
            L16:
                r1.subscribers = r2
                java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
                r2.<init>(r4)
                r1.values = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.f333s = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.f333s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        void cancelAllBut(int r4) {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r3.subscribers
                r1 = 0
            L3:
                int r2 = r0.length
                if (r1 >= r2) goto L10
                if (r1 == r4) goto Ld
                r2 = r0[r1]
                r2.dispose()
            Ld:
                int r1 = r1 + 1
                goto L3
            L10:
                return
        }

        void innerComplete(int r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L14
                r2 = 1
                r0.done = r2
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r0.f333s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
                r0.cancelAllBut(r1)
                org.reactivestreams.Subscriber<? super R> r1 = r0.actual
                io.reactivex.internal.util.AtomicThrowable r2 = r0.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r1, r0, r2)
            L14:
                return
        }

        void innerError(int r2, java.lang.Throwable r3) {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f333s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r1.cancelAllBut(r2)
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                io.reactivex.internal.util.HalfSerializer.onError(r2, r3, r1, r0)
                return
        }

        void innerNext(int r2, java.lang.Object r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.values
                r0.set(r2, r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L12
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            L12:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto L17
                boolean r3 = r2.done
                if (r3 != 0) goto L17
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.f333s
                java.lang.Object r3 = r3.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r0 = 1
                r3.request(r0)
            L17:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f333s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f333s
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }

        void subscribe(org.reactivestreams.Publisher<?>[] r6, int r7) {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestInnerSubscriber[] r0 = r5.subscribers
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r1 = r5.f333s
                r2 = 0
            L5:
                if (r2 >= r7) goto L1e
                java.lang.Object r3 = r1.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                boolean r3 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r3)
                if (r3 == 0) goto L14
                return
            L14:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L5
            L1e:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r5.values
                int r2 = r0.length()
                int r3 = r2 + 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r1] = r6
                r6 = r1
            L13:
                if (r6 >= r2) goto L21
                java.lang.Object r4 = r0.get(r6)
                if (r4 != 0) goto L1c
                return r1
            L1c:
                int r6 = r6 + 1
                r3[r6] = r4
                goto L13
            L21:
                io.reactivex.functions.Function<? super java.lang.Object[], R> r6 = r5.combiner     // Catch: java.lang.Throwable -> L36
                java.lang.Object r6 = r6.apply(r3)     // Catch: java.lang.Throwable -> L36
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)     // Catch: java.lang.Throwable -> L36
                org.reactivestreams.Subscriber<? super R> r0 = r5.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r5.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r6, r5, r1)
                r6 = 1
                return r6
            L36:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                r5.cancel()
                r5.onError(r6)
                return r1
        }
    }

    static final class WithLatestInnerSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> parent;

        WithLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r3.parent
                int r1 = r3.index
                boolean r2 = r3.hasValue
                r0.innerComplete(r1, r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r1, r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r2.hasValue
                if (r0 != 0) goto L7
                r0 = 1
                r2.hasValue = r0
            L7:
                io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerNext(r1, r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }
    }

    public FlowableWithLatestFromMany(io.reactivex.Flowable<T> r1, java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.otherArray = r1
            r0.otherIterable = r2
            r0.combiner = r3
            return
    }

    public FlowableWithLatestFromMany(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<?>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.otherArray = r2
            r1 = 0
            r0.otherIterable = r1
            r0.combiner = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            org.reactivestreams.Publisher<?>[] r0 = r5.otherArray
            if (r0 != 0) goto L35
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> r1 = r5.otherIterable     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
        Lf:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2d
            org.reactivestreams.Publisher r3 = (org.reactivestreams.Publisher) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.length     // Catch: java.lang.Throwable -> L2d
            if (r2 != r4) goto L27
            int r4 = r2 >> 1
            int r4 = r4 + r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L2d
            org.reactivestreams.Publisher[] r0 = (org.reactivestreams.Publisher[]) r0     // Catch: java.lang.Throwable -> L2d
        L27:
            int r4 = r2 + 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2d
            r2 = r4
            goto Lf
        L2d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
        L35:
            int r2 = r0.length
        L36:
            if (r2 != 0) goto L48
            io.reactivex.internal.operators.flowable.FlowableMap r0 = new io.reactivex.internal.operators.flowable.FlowableMap
            io.reactivex.Flowable<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$SingletonArrayFunc r2 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$SingletonArrayFunc
            r2.<init>(r5)
            r0.<init>(r1, r2)
            r0.subscribeActual(r6)
            return
        L48:
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany$WithLatestFromSubscriber
            io.reactivex.functions.Function<? super java.lang.Object[], R> r3 = r5.combiner
            r1.<init>(r6, r3, r2)
            r6.onSubscribe(r1)
            r1.subscribe(r0, r2)
            io.reactivex.Flowable<T> r6 = r5.source
            r6.subscribe(r1)
            return
    }
}
