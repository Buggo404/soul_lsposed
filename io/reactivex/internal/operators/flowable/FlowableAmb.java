package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableAmb<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T>[] sources;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> sourcesIterable;

    static final class AmbCoordinator<T> implements org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T>[] subscribers;
        final java.util.concurrent.atomic.AtomicInteger winner;

        AmbCoordinator(org.reactivestreams.Subscriber<? super T> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.winner = r0
                r1.actual = r2
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber[] r2 = new io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber[r3]
                r1.subscribers = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                int r0 = r0.get()
                r1 = -1
                if (r0 == r1) goto L1c
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                r0.lazySet(r1)
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber<T>[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L12:
                if (r2 >= r1) goto L1c
                r3 = r0[r2]
                r3.cancel()
                int r2 = r2 + 1
                goto L12
            L1c:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r5) {
                r4 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r5)
                if (r0 == 0) goto L28
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                int r0 = r0.get()
                if (r0 <= 0) goto L18
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber<T>[] r1 = r4.subscribers
                int r0 = r0 + (-1)
                r0 = r1[r0]
                r0.request(r5)
                goto L28
            L18:
                if (r0 != 0) goto L28
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber<T>[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L1e:
                if (r2 >= r1) goto L28
                r3 = r0[r2]
                r3.request(r5)
                int r2 = r2 + 1
                goto L1e
            L28:
                return
        }

        public void subscribe(org.reactivestreams.Publisher<? extends T>[] r8) {
                r7 = this;
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber<T>[] r0 = r7.subscribers
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L14
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber r4 = new io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber
                int r5 = r3 + 1
                org.reactivestreams.Subscriber<? super T> r6 = r7.actual
                r4.<init>(r7, r5, r6)
                r0[r3] = r4
                r3 = r5
                goto L5
            L14:
                java.util.concurrent.atomic.AtomicInteger r3 = r7.winner
                r3.lazySet(r2)
                org.reactivestreams.Subscriber<? super T> r3 = r7.actual
                r3.onSubscribe(r7)
            L1e:
                if (r2 >= r1) goto L33
                java.util.concurrent.atomic.AtomicInteger r3 = r7.winner
                int r3 = r3.get()
                if (r3 == 0) goto L29
                return
            L29:
                r3 = r8[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L1e
            L33:
                return
        }

        public boolean win(int r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                int r0 = r0.get()
                r1 = 0
                if (r0 != 0) goto L23
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                boolean r0 = r0.compareAndSet(r1, r5)
                if (r0 == 0) goto L23
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbInnerSubscriber<T>[] r0 = r4.subscribers
                int r2 = r0.length
            L14:
                if (r1 >= r2) goto L21
                int r3 = r1 + 1
                if (r3 == r5) goto L1f
                r1 = r0[r1]
                r1.cancel()
            L1f:
                r1 = r3
                goto L14
            L21:
                r5 = 1
                return r5
            L23:
                return r1
        }
    }

    static final class AmbInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final int index;
        final java.util.concurrent.atomic.AtomicLong missedRequested;
        final io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator<T> parent;
        boolean won;

        AmbInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator<T> r2, int r3, org.reactivestreams.Subscriber<? super T> r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.missedRequested = r0
                r1.parent = r2
                r1.index = r3
                r1.actual = r4
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L26
            La:
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                r2.won = r0
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L26
            L1d:
                java.lang.Object r0 = r2.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
            L26:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L29
            La:
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                r2.won = r0
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L29
            L1d:
                java.lang.Object r0 = r2.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L29:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
                goto L26
            La:
                io.reactivex.internal.operators.flowable.FlowableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                r2.won = r0
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
                goto L26
            L1d:
                java.lang.Object r3 = r2.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r3.cancel()
            L26:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.missedRequested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r1, r0, r2)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.missedRequested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r1, r0, r2)
                return
        }
    }

    public FlowableAmb(org.reactivestreams.Publisher<? extends T>[] r1, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r7) {
            r6 = this;
            org.reactivestreams.Publisher<? extends T>[] r0 = r6.sources
            r1 = 0
            if (r0 != 0) goto L43
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2 = r6.sourcesIterable     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3b
            r3 = r1
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3b
            org.reactivestreams.Publisher r4 = (org.reactivestreams.Publisher) r4     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L29
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "One of the sources is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r7)     // Catch: java.lang.Throwable -> L3b
            return
        L29:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r3 != r5) goto L35
            int r5 = r3 >> 2
            int r5 = r5 + r3
            org.reactivestreams.Publisher[] r5 = new org.reactivestreams.Publisher[r5]     // Catch: java.lang.Throwable -> L3b
            java.lang.System.arraycopy(r0, r1, r5, r1, r3)     // Catch: java.lang.Throwable -> L3b
            r0 = r5
        L35:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L3b
            r3 = r5
            goto L10
        L3b:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r7)
            return
        L43:
            int r3 = r0.length
        L44:
            if (r3 != 0) goto L4a
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r7)
            return
        L4a:
            r2 = 1
            if (r3 != r2) goto L53
            r0 = r0[r1]
            r0.subscribe(r7)
            return
        L53:
            io.reactivex.internal.operators.flowable.FlowableAmb$AmbCoordinator r1 = new io.reactivex.internal.operators.flowable.FlowableAmb$AmbCoordinator
            r1.<init>(r7, r3)
            r1.subscribe(r0)
            return
    }
}
