package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelFromPublisher<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final org.reactivestreams.Publisher<? extends T> source;

    static final class ParallelDispatcher<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        java.lang.Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLongArray requests;

        /* renamed from: s */
        org.reactivestreams.Subscription f485s;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicInteger subscriberCount;
        final org.reactivestreams.Subscriber<? super T>[] subscribers;

        final class RailSubscription implements org.reactivestreams.Subscription {

            /* renamed from: j */
            final int f486j;

            /* renamed from: m */
            final int f487m;
            final /* synthetic */ io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher this$0;

            RailSubscription(io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher r1, int r2, int r3) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f486j = r2
                    r0.f487m = r3
                    return
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                    r7 = this;
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r0 = r7.this$0
                    java.util.concurrent.atomic.AtomicLongArray r1 = r0.requests
                    int r0 = r7.f487m
                    int r2 = r7.f486j
                    int r2 = r2 + r0
                    r3 = 0
                    r5 = 1
                    boolean r0 = r1.compareAndSet(r2, r3, r5)
                    if (r0 == 0) goto L1b
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r0 = r7.this$0
                    int r1 = r7.f487m
                    int r1 = r1 + r1
                    r0.cancel(r1)
                L1b:
                    return
            }

            @Override // org.reactivestreams.Subscription
            public void request(long r8) {
                    r7 = this;
                    boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r8)
                    if (r0 == 0) goto L38
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r0 = r7.this$0
                    java.util.concurrent.atomic.AtomicLongArray r0 = r0.requests
                La:
                    int r1 = r7.f486j
                    long r3 = r0.get(r1)
                    r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r1 != 0) goto L1a
                    return
                L1a:
                    long r5 = io.reactivex.internal.util.BackpressureHelper.addCap(r3, r8)
                    int r2 = r7.f486j
                    r1 = r0
                    boolean r1 = r1.compareAndSet(r2, r3, r5)
                    if (r1 == 0) goto La
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r8 = r7.this$0
                    java.util.concurrent.atomic.AtomicInteger r8 = r8.subscriberCount
                    int r8 = r8.get()
                    int r9 = r7.f487m
                    if (r8 != r9) goto L38
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r8 = r7.this$0
                    r8.drain()
                L38:
                    return
            }
        }

        ParallelDispatcher(org.reactivestreams.Subscriber<? super T>[] r4, int r5) {
                r3 = this;
                r3.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r3.subscriberCount = r0
                r3.subscribers = r4
                r3.prefetch = r5
                int r0 = r5 >> 2
                int r5 = r5 - r0
                r3.limit = r5
                int r4 = r4.length
                java.util.concurrent.atomic.AtomicLongArray r5 = new java.util.concurrent.atomic.AtomicLongArray
                int r0 = r4 + r4
                int r1 = r0 + 1
                r5.<init>(r1)
                r3.requests = r5
                long r1 = (long) r4
                r5.lazySet(r0, r1)
                long[] r4 = new long[r4]
                r3.emissions = r4
                return
        }

        void cancel(int r5) {
                r4 = this;
                java.util.concurrent.atomic.AtomicLongArray r0 = r4.requests
                long r0 = r0.decrementAndGet(r5)
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L1f
                r5 = 1
                r4.cancelled = r5
                org.reactivestreams.Subscription r5 = r4.f485s
                r5.cancel()
                int r5 = r4.getAndIncrement()
                if (r5 != 0) goto L1f
                io.reactivex.internal.fuseable.SimpleQueue<T> r5 = r4.queue
                r5.clear()
            L1f:
                return
        }

        void drain() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                int r0 = r2.sourceMode
                r1 = 1
                if (r0 != r1) goto L10
                r2.drainSync()
                goto L13
            L10:
                r2.drainAsync()
            L13:
                return
        }

        void drainAsync() {
                r18 = this;
                r1 = r18
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                org.reactivestreams.Subscriber<? super T>[] r2 = r1.subscribers
                java.util.concurrent.atomic.AtomicLongArray r3 = r1.requests
                long[] r4 = r1.emissions
                int r5 = r4.length
                int r6 = r1.index
                int r7 = r1.produced
                r8 = 1
                r9 = r8
            L11:
                r10 = 0
                r11 = r10
            L13:
                boolean r12 = r1.cancelled
                if (r12 == 0) goto L1b
                r0.clear()
                return
            L1b:
                boolean r12 = r1.done
                if (r12 == 0) goto L32
                java.lang.Throwable r13 = r1.error
                if (r13 == 0) goto L32
                r0.clear()
                int r0 = r2.length
            L27:
                if (r10 >= r0) goto L31
                r3 = r2[r10]
                r3.onError(r13)
                int r10 = r10 + 1
                goto L27
            L31:
                return
            L32:
                boolean r13 = r0.isEmpty()
                if (r12 == 0) goto L46
                if (r13 == 0) goto L46
                int r0 = r2.length
            L3b:
                if (r10 >= r0) goto L45
                r3 = r2[r10]
                r3.onComplete()
                int r10 = r10 + 1
                goto L3b
            L45:
                return
            L46:
                if (r13 == 0) goto L49
                goto L9d
            L49:
                long r12 = r3.get(r6)
                r14 = r4[r6]
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L95
                int r12 = r5 + r6
                long r12 = r3.get(r12)
                r16 = 0
                int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r12 != 0) goto L95
                java.lang.Object r11 = r0.poll()     // Catch: java.lang.Throwable -> L7f
                if (r11 != 0) goto L66
                goto L9d
            L66:
                r12 = r2[r6]
                r12.onNext(r11)
                r11 = 1
                long r14 = r14 + r11
                r4[r6] = r14
                int r7 = r7 + 1
                int r11 = r1.limit
                if (r7 != r11) goto L7d
                org.reactivestreams.Subscription r11 = r1.f485s
                long r12 = (long) r7
                r11.request(r12)
                r7 = r10
            L7d:
                r11 = r10
                goto L96
            L7f:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r1.f485s
                r0.cancel()
                int r0 = r2.length
            L8a:
                if (r10 >= r0) goto L94
                r4 = r2[r10]
                r4.onError(r3)
                int r10 = r10 + 1
                goto L8a
            L94:
                return
            L95:
                int r11 = r11 + r8
            L96:
                int r6 = r6 + 1
                if (r6 != r5) goto L9b
                r6 = r10
            L9b:
                if (r11 != r5) goto L13
            L9d:
                int r10 = r18.get()
                if (r10 != r9) goto Laf
                r1.index = r6
                r1.produced = r7
                int r9 = -r9
                int r9 = r1.addAndGet(r9)
                if (r9 != 0) goto L11
                return
            Laf:
                r9 = r10
                goto L11
        }

        void drainSync() {
                r17 = this;
                r1 = r17
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                org.reactivestreams.Subscriber<? super T>[] r2 = r1.subscribers
                java.util.concurrent.atomic.AtomicLongArray r3 = r1.requests
                long[] r4 = r1.emissions
                int r5 = r4.length
                int r6 = r1.index
                r7 = 1
                r8 = r7
            Lf:
                r9 = 0
                r10 = r9
            L11:
                boolean r11 = r1.cancelled
                if (r11 == 0) goto L19
                r0.clear()
                return
            L19:
                boolean r11 = r0.isEmpty()
                if (r11 == 0) goto L2b
                int r0 = r2.length
            L20:
                if (r9 >= r0) goto L2a
                r3 = r2[r9]
                r3.onComplete()
                int r9 = r9 + 1
                goto L20
            L2a:
                return
            L2b:
                long r11 = r3.get(r6)
                r13 = r4[r6]
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 == 0) goto L75
                int r11 = r5 + r6
                long r11 = r3.get(r11)
                r15 = 0
                int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r11 != 0) goto L75
                java.lang.Object r10 = r0.poll()     // Catch: java.lang.Throwable -> L5f
                if (r10 != 0) goto L53
                int r0 = r2.length
            L48:
                if (r9 >= r0) goto L52
                r3 = r2[r9]
                r3.onComplete()
                int r9 = r9 + 1
                goto L48
            L52:
                return
            L53:
                r11 = r2[r6]
                r11.onNext(r10)
                r10 = 1
                long r13 = r13 + r10
                r4[r6] = r13
                r10 = r9
                goto L76
            L5f:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r1.f485s
                r0.cancel()
                int r0 = r2.length
            L6a:
                if (r9 >= r0) goto L74
                r4 = r2[r9]
                r4.onError(r3)
                int r9 = r9 + 1
                goto L6a
            L74:
                return
            L75:
                int r10 = r10 + r7
            L76:
                int r6 = r6 + 1
                if (r6 != r5) goto L7b
                r6 = r9
            L7b:
                if (r10 != r5) goto L11
                int r9 = r17.get()
                if (r9 != r8) goto L8d
                r1.index = r6
                int r8 = -r8
                int r8 = r1.addAndGet(r8)
                if (r8 != 0) goto Lf
                return
            L8d:
                r8 = r9
                goto Lf
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
                int r0 = r1.sourceMode
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L1c
                org.reactivestreams.Subscription r2 = r1.f485s
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue is full?"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L1c:
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.f485s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L49
                r3.f485s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L37
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 7
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L26
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                r3.setupSubscribers()
                r3.drain()
                return
            L26:
                r2 = 2
                if (r1 != r2) goto L37
                r3.sourceMode = r1
                r3.queue = r0
                r3.setupSubscribers()
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L37:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                r3.setupSubscribers()
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L49:
                return
        }

        void setupSubscribers() {
                r6 = this;
                org.reactivestreams.Subscriber<? super T>[] r0 = r6.subscribers
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L1e
                boolean r3 = r6.cancelled
                if (r3 == 0) goto Lb
                return
            Lb:
                java.util.concurrent.atomic.AtomicInteger r3 = r6.subscriberCount
                int r4 = r2 + 1
                r3.lazySet(r4)
                r3 = r0[r2]
                io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher$RailSubscription r5 = new io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher$RailSubscription
                r5.<init>(r6, r2, r1)
                r3.onSubscribe(r5)
                r2 = r4
                goto L4
            L1e:
                return
        }
    }

    public ParallelFromPublisher(org.reactivestreams.Publisher<? extends T> r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.parallelism = r2
            r0.prefetch = r3
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            int r0 = r1.parallelism
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r4) {
            r3 = this;
            boolean r0 = r3.validate(r4)
            if (r0 != 0) goto L7
            return
        L7:
            org.reactivestreams.Publisher<? extends T> r0 = r3.source
            io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher r1 = new io.reactivex.internal.operators.parallel.ParallelFromPublisher$ParallelDispatcher
            int r2 = r3.prefetch
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
