package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSequenceEqual<T> extends io.reactivex.Flowable<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
    final org.reactivestreams.Publisher<? extends T> first;
    final int prefetch;
    final org.reactivestreams.Publisher<? extends T> second;

    static final class EqualCoordinator<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Boolean> implements io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> first;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> second;

        /* renamed from: v1 */
        T f292v1;

        /* renamed from: v2 */
        T f293v2;
        final java.util.concurrent.atomic.AtomicInteger wip;

        EqualCoordinator(org.reactivestreams.Subscriber<? super java.lang.Boolean> r1, int r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.comparer = r3
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber
                r1.<init>(r0, r2)
                r0.first = r1
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber
                r1.<init>(r0, r2)
                r0.second = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.cancel()
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L1f
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.clear()
            L1f:
                return
        }

        void cancelAndClear() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
                r11 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r11.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                r0 = 1
                r1 = r0
            Lb:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r2 = r11.first
                io.reactivex.internal.fuseable.SimpleQueue<T> r2 = r2.queue
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r3 = r11.second
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r3.queue
                if (r2 == 0) goto Lfc
                if (r3 == 0) goto Lfc
            L17:
                boolean r4 = r11.isCancelled()
                if (r4 == 0) goto L28
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.second
                r0.clear()
                return
            L28:
                io.reactivex.internal.util.AtomicThrowable r4 = r11.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L41
                r11.cancelAndClear()
                org.reactivestreams.Subscriber<? super T> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L41:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.first
                boolean r4 = r4.done
                T r5 = r11.f292v1
                if (r5 != 0) goto L68
                java.lang.Object r5 = r2.poll()     // Catch: java.lang.Throwable -> L50
                r11.f292v1 = r5
                goto L68
            L50:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L68:
                r6 = 0
                if (r5 != 0) goto L6d
                r7 = r0
                goto L6e
            L6d:
                r7 = r6
            L6e:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r8 = r11.second
                boolean r8 = r8.done
                T r9 = r11.f293v2
                if (r9 != 0) goto L95
                java.lang.Object r9 = r3.poll()     // Catch: java.lang.Throwable -> L7d
                r11.f293v2 = r9
                goto L95
            L7d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L95:
                if (r9 != 0) goto L99
                r10 = r0
                goto L9a
            L99:
                r10 = r6
            L9a:
                if (r4 == 0) goto Laa
                if (r8 == 0) goto Laa
                if (r7 == 0) goto Laa
                if (r10 == 0) goto Laa
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r11.complete(r0)
                return
            Laa:
                if (r4 == 0) goto Lbb
                if (r8 == 0) goto Lbb
                if (r7 == r10) goto Lbb
                r11.cancelAndClear()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                r11.complete(r0)
                return
            Lbb:
                if (r7 != 0) goto L126
                if (r10 == 0) goto Lc0
                goto L126
            Lc0:
                io.reactivex.functions.BiPredicate<? super T, ? super T> r4 = r11.comparer     // Catch: java.lang.Throwable -> Le4
                boolean r4 = r4.test(r5, r9)     // Catch: java.lang.Throwable -> Le4
                if (r4 != 0) goto Ld3
                r11.cancelAndClear()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                r11.complete(r0)
                return
            Ld3:
                r4 = 0
                r11.f292v1 = r4
                r11.f293v2 = r4
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.first
                r4.request()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.second
                r4.request()
                goto L17
            Le4:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            Lfc:
                boolean r2 = r11.isCancelled()
                if (r2 == 0) goto L10d
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.second
                r0.clear()
                return
            L10d:
                io.reactivex.internal.util.AtomicThrowable r2 = r11.error
                java.lang.Object r2 = r2.get()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                if (r2 == 0) goto L126
                r11.cancelAndClear()
                org.reactivestreams.Subscriber<? super T> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L126:
                java.util.concurrent.atomic.AtomicInteger r2 = r11.wip
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto Lb
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lc
                r1.drain()
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }

        void subscribe(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r2.subscribe(r0)
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r2 = r1.second
                r3.subscribe(r2)
                return
        }
    }

    interface EqualCoordinatorHelper {
        void drain();

        void innerError(java.lang.Throwable r1);
    }

    static final class EqualSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        volatile boolean done;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper parent;
        final int prefetch;
        long produced;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        EqualSubscriber(io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                int r1 = r2 >> 2
                int r1 = r2 - r1
                r0.limit = r1
                r0.prefetch = r2
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper r0 = r1.parent
                r0.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L15
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L15
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L15:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper r2 = r1.parent
                r2.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
                if (r0 == 0) goto L3e
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L2f
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2f
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L2f:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L3e:
                return
        }

        public void request() {
                r4 = this;
                int r0 = r4.sourceMode
                r1 = 1
                if (r0 == r1) goto L21
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                int r2 = r4.limit
                long r2 = (long) r2
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 < 0) goto L1f
                r2 = 0
                r4.produced = r2
                java.lang.Object r2 = r4.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                r2.request(r0)
                goto L21
            L1f:
                r4.produced = r0
            L21:
                return
        }
    }

    public FlowableSequenceEqual(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            r0.comparer = r3
            r0.prefetch = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Boolean> r4) {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinator r0 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinator
            int r1 = r3.prefetch
            io.reactivex.functions.BiPredicate<? super T, ? super T> r2 = r3.comparer
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            org.reactivestreams.Publisher<? extends T> r4 = r3.first
            org.reactivestreams.Publisher<? extends T> r1 = r3.second
            r0.subscribe(r4, r1)
            return
    }
}
