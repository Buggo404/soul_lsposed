package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> firstTimeoutIndicator;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> itemTimeoutIndicator;
    final org.reactivestreams.Publisher<? extends T> other;

    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport parent;

        TimeoutConsumer(long r1, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport r3) {
                r0 = this;
                r0.<init>()
                r0.idx = r1
                r0.parent = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L14
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r3.lazySet(r0)
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSelectorSupport r0 = r3.parent
                long r1 = r3.idx
                r0.onTimeout(r1)
            L14:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L15
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r3.lazySet(r0)
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSelectorSupport r0 = r3.parent
                long r1 = r3.idx
                r0.onTimeoutError(r1, r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r3 = r2.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r3 == r0) goto L19
                r3.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r3 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.lazySet(r3)
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSelectorSupport r3 = r2.parent
                long r0 = r2.idx
                r3.onTimeout(r0)
            L19:
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

    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long consumed;
        org.reactivestreams.Publisher<? extends T> fallback;
        final java.util.concurrent.atomic.AtomicLong index;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> itemTimeoutIndicator;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> r2, org.reactivestreams.Publisher<? extends T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.itemTimeoutIndicator = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                r0.fallback = r3
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.index = r1
                return
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r5.task
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
                io.reactivex.internal.disposables.SequentialDisposable r6 = r5.task
                r6.dispose()
                goto L22
            L1f:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L22:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r10) {
                r9 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r9.index
                long r0 = r0.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L6b
                java.util.concurrent.atomic.AtomicLong r4 = r9.index
                r5 = 1
                long r7 = r0 + r5
                boolean r0 = r4.compareAndSet(r0, r7)
                if (r0 != 0) goto L1c
                goto L6b
            L1c:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r9.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto L29
                r0.dispose()
            L29:
                long r0 = r9.consumed
                long r0 = r0 + r5
                r9.consumed = r0
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                r0.onNext(r10)
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> r0 = r9.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L52
                java.lang.Object r10 = r0.apply(r10)     // Catch: java.lang.Throwable -> L52
                java.lang.String r0 = "The itemTimeoutIndicator returned a null Publisher."
                java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)     // Catch: java.lang.Throwable -> L52
                org.reactivestreams.Publisher r10 = (org.reactivestreams.Publisher) r10     // Catch: java.lang.Throwable -> L52
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer
                r0.<init>(r7, r9)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r9.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L51
                r10.subscribe(r0)
            L51:
                return
            L52:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r9.upstream
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                java.util.concurrent.atomic.AtomicLong r0 = r9.index
                r0.getAndSet(r2)
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                r0.onError(r10)
            L6b:
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
        public void onTimeout(long r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r4.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r5 = r0.compareAndSet(r5, r1)
                if (r5 == 0) goto L2c
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r5 = r4.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r5)
                org.reactivestreams.Publisher<? extends T> r5 = r4.fallback
                r6 = 0
                r4.fallback = r6
                long r0 = r4.consumed
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 == 0) goto L22
                r4.produced(r0)
            L22:
                io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$FallbackSubscriber r6 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed$FallbackSubscriber
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r6.<init>(r0, r4)
                r5.subscribe(r6)
            L2c:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long r4, java.lang.Throwable r6) {
                r3 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r3.index
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r4 = r0.compareAndSet(r4, r1)
                if (r4 == 0) goto L18
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
                org.reactivestreams.Subscriber<? super T> r4 = r3.actual
                r4.onError(r6)
                goto L1b
            L18:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L1b:
                return
        }

        void startFirstTimeout(org.reactivestreams.Publisher<?> r4) {
                r3 = this;
                if (r4 == 0) goto L14
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer
                r1 = 0
                r0.<init>(r1, r3)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L14
                r4.subscribe(r0)
            L14:
                return
        }
    }

    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long r1, java.lang.Throwable r3);
    }

    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> itemTimeoutIndicator;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.disposables.SequentialDisposable task;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.itemTimeoutIndicator = r2
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L17
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            L17:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L18
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.task
                r0.dispose()
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                goto L1b
            L18:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L1b:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r7) {
                r6 = this;
                long r0 = r6.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L5f
                r4 = 1
                long r4 = r4 + r0
                boolean r0 = r6.compareAndSet(r0, r4)
                if (r0 != 0) goto L17
                goto L5f
            L17:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r6.task
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                if (r0 == 0) goto L24
                r0.dispose()
            L24:
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onNext(r7)
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> r0 = r6.itemTimeoutIndicator     // Catch: java.lang.Throwable -> L48
                java.lang.Object r7 = r0.apply(r7)     // Catch: java.lang.Throwable -> L48
                java.lang.String r0 = "The itemTimeoutIndicator returned a null Publisher."
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)     // Catch: java.lang.Throwable -> L48
                org.reactivestreams.Publisher r7 = (org.reactivestreams.Publisher) r7     // Catch: java.lang.Throwable -> L48
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer
                r0.<init>(r4, r6)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r6.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L47
                r7.subscribe(r0)
            L47:
                return
            L48:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r6.upstream
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                r6.getAndSet(r2)
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onError(r7)
            L5f:
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
                if (r3 == 0) goto L1a
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r3)
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException
                r4.<init>()
                r3.onError(r4)
            L1a:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long r3, java.lang.Throwable r5) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                boolean r3 = r2.compareAndSet(r3, r0)
                if (r3 == 0) goto L16
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r3 = r2.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r3)
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onError(r5)
                goto L19
            L16:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L19:
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

        void startFirstTimeout(org.reactivestreams.Publisher<?> r4) {
                r3 = this;
                if (r4 == 0) goto L14
                io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutConsumer
                r1 = 0
                r0.<init>(r1, r3)
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.task
                boolean r1 = r1.replace(r0)
                if (r1 == 0) goto L14
                r4.subscribe(r0)
            L14:
                return
        }
    }

    public FlowableTimeout(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3, org.reactivestreams.Publisher<? extends T> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.firstTimeoutIndicator = r2
            r0.itemTimeoutIndicator = r3
            r0.other = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r3.other
            if (r0 != 0) goto L19
            io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r1 = r3.itemTimeoutIndicator
            r0.<init>(r4, r1)
            r4.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r4 = r3.firstTimeoutIndicator
            r0.startFirstTimeout(r4)
            io.reactivex.Flowable<T> r4 = r3.source
            r4.subscribe(r0)
            goto L2f
        L19:
            io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutFallbackSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout$TimeoutFallbackSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r1 = r3.itemTimeoutIndicator
            org.reactivestreams.Publisher<? extends T> r2 = r3.other
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r4 = r3.firstTimeoutIndicator
            r0.startFirstTimeout(r4)
            io.reactivex.Flowable<T> r4 = r3.source
            r4.subscribe(r0)
        L2f:
            return
    }
}
