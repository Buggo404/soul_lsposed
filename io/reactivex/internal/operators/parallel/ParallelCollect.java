package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelCollect<T, C> extends io.reactivex.parallel.ParallelFlowable<C> {
    final io.reactivex.functions.BiConsumer<? super C, ? super T> collector;
    final java.util.concurrent.Callable<? extends C> initialCollection;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    static final class ParallelCollectSubscriber<T, C> extends io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C collection;
        final io.reactivex.functions.BiConsumer<? super C, ? super T> collector;
        boolean done;

        ParallelCollectSubscriber(org.reactivestreams.Subscriber<? super C> r1, C r2, io.reactivex.functions.BiConsumer<? super C, ? super T> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.collection = r2
                r0.collector = r3
                return
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f528s
                r0.cancel()
                return
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                C r0 = r2.collection
                r1 = 0
                r2.collection = r1
                r2.complete(r0)
                return
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                r0 = 0
                r1.collection = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.BiConsumer<? super C, ? super T> r0 = r2.collector     // Catch: java.lang.Throwable -> Ld
                C r1 = r2.collection     // Catch: java.lang.Throwable -> Ld
                r0.accept(r1, r3)     // Catch: java.lang.Throwable -> Ld
                goto L17
            Ld:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                r2.onError(r3)
            L17:
                return
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f528s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f528s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public ParallelCollect(io.reactivex.parallel.ParallelFlowable<? extends T> r1, java.util.concurrent.Callable<? extends C> r2, io.reactivex.functions.BiConsumer<? super C, ? super T> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.initialCollection = r2
            r0.collector = r3
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable<? extends T> r0 = r1.source
            int r0 = r0.parallelism()
            return r0
    }

    void reportError(org.reactivestreams.Subscriber<?>[] r4, java.lang.Throwable r5) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            io.reactivex.internal.subscriptions.EmptySubscription.error(r5, r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super C>[] r8) {
            r7 = this;
            boolean r0 = r7.validate(r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r8.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2f
            java.util.concurrent.Callable<? extends C> r3 = r7.initialCollection     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "The initialSupplier returned a null value"
            java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L27
            io.reactivex.internal.operators.parallel.ParallelCollect$ParallelCollectSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelCollect$ParallelCollectSubscriber
            r5 = r8[r2]
            io.reactivex.functions.BiConsumer<? super C, ? super T> r6 = r7.collector
            r4.<init>(r5, r3, r6)
            r1[r2] = r4
            int r2 = r2 + 1
            goto Lb
        L27:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r7.reportError(r8, r0)
            return
        L2f:
            io.reactivex.parallel.ParallelFlowable<? extends T> r8 = r7.source
            r8.subscribe(r1)
            return
    }
}
