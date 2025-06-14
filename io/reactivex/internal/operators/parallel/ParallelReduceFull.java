package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelReduceFull<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    static final class ParallelReduceFullInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        boolean done;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> parent;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        T value;

        ParallelReduceFullInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.reducer = r2
                return
        }

        void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto Le
                r0 = 1
                r2.done = r0
                io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber<T> r0 = r2.parent
                T r1 = r2.value
                r0.innerComplete(r1)
            Le:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber<T> r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L2a
                T r0 = r2.value
                if (r0 != 0) goto Lb
                r2.value = r3
                goto L2a
            Lb:
                io.reactivex.functions.BiFunction<T, T, T> r1 = r2.reducer     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1a
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1a
                r2.value = r3
                goto L2a
            L1a:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                java.lang.Object r0 = r2.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                r2.onError(r3)
            L2a:
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

    static final class ParallelReduceFullMainSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T>> current;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;
        final java.util.concurrent.atomic.AtomicInteger remaining;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T>[] subscribers;

        ParallelReduceFullMainSubscriber(org.reactivestreams.Subscriber<? super T> r3, int r4, io.reactivex.functions.BiFunction<T, T, T> r5) {
                r2 = this;
                r2.<init>(r3)
                java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
                r3.<init>()
                r2.current = r3
                java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                r3.<init>()
                r2.remaining = r3
                java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
                r3.<init>()
                r2.error = r3
                io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber[] r3 = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber[r4]
                r0 = 0
            L1b:
                if (r0 >= r4) goto L27
                io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber r1 = new io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber
                r1.<init>(r2, r5)
                r3[r0] = r1
                int r0 = r0 + 1
                goto L1b
            L27:
                r2.subscribers = r3
                r2.reducer = r5
                java.util.concurrent.atomic.AtomicInteger r3 = r2.remaining
                r3.lazySet(r4)
                return
        }

        io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> addValue(T r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r0 = r3.current
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r0 = (io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair) r0
                r1 = 0
                if (r0 != 0) goto L19
                io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r0 = new io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair
                r0.<init>()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r2 = r3.current
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r1, r0)
                if (r2 != 0) goto L19
                goto L0
            L19:
                int r2 = r0.tryAcquireSlot()
                if (r2 >= 0) goto L25
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r2 = r3.current
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                goto L0
            L25:
                if (r2 != 0) goto L2a
                r0.first = r4
                goto L2c
            L2a:
                r0.second = r4
            L2c:
                boolean r4 = r0.releaseSlot()
                if (r4 == 0) goto L38
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r4 = r3.current
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r4, r0, r1)
                return r0
            L38:
                return r1
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] r0 = r4.subscribers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.cancel()
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        void innerComplete(T r3) {
                r2 = this;
                if (r3 == 0) goto L21
            L2:
                io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r3 = r2.addValue(r3)
                if (r3 == 0) goto L21
                io.reactivex.functions.BiFunction<T, T, T> r0 = r2.reducer     // Catch: java.lang.Throwable -> L19
                T r1 = r3.first     // Catch: java.lang.Throwable -> L19
                T r3 = r3.second     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r0.apply(r1, r3)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L19
                goto L2
            L19:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.innerError(r3)
                return
            L21:
                java.util.concurrent.atomic.AtomicInteger r3 = r2.remaining
                int r3 = r3.decrementAndGet()
                if (r3 != 0) goto L44
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r3 = r2.current
                java.lang.Object r3 = r3.get()
                io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair r3 = (io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair) r3
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull$SlotPair<T>> r0 = r2.current
                r1 = 0
                r0.lazySet(r1)
                if (r3 == 0) goto L3f
                T r3 = r3.first
                r2.complete(r3)
                goto L44
            L3f:
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onComplete()
            L44:
                return
        }

        void innerError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                r1 = 0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r3)
                if (r0 == 0) goto L12
                r2.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L1d
            L12:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                java.lang.Object r0 = r0.get()
                if (r3 == r0) goto L1d
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1d:
                return
        }
    }

    static final class SlotPair<T> extends java.util.concurrent.atomic.AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final java.util.concurrent.atomic.AtomicInteger releaseIndex;
        T second;

        SlotPair() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.releaseIndex = r0
                return
        }

        boolean releaseSlot() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.releaseIndex
                int r0 = r0.incrementAndGet()
                r1 = 2
                if (r0 != r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        int tryAcquireSlot() {
                r2 = this;
            L0:
                int r0 = r2.get()
                r1 = 2
                if (r0 < r1) goto L9
                r0 = -1
                return r0
            L9:
                int r1 = r0 + 1
                boolean r1 = r2.compareAndSet(r0, r1)
                if (r1 == 0) goto L0
                return r0
        }
    }

    public ParallelReduceFull(io.reactivex.parallel.ParallelFlowable<? extends T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.reducer = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber r0 = new io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullMainSubscriber
            io.reactivex.parallel.ParallelFlowable<? extends T> r1 = r3.source
            int r1 = r1.parallelism()
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.reducer
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            io.reactivex.parallel.ParallelFlowable<? extends T> r4 = r3.source
            io.reactivex.internal.operators.parallel.ParallelReduceFull$ParallelReduceFullInnerSubscriber<T>[] r0 = r0.subscribers
            r4.subscribe(r0)
            return
    }
}
