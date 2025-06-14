package io.reactivex.processors;

/* loaded from: classes.dex */
public final class UnicastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> actual;
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final java.util.concurrent.atomic.AtomicLong requested;
    final io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> wip;

    final class UnicastQueueSubscription extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;
        final /* synthetic */ io.reactivex.processors.UnicastProcessor this$0;

        UnicastQueueSubscription(io.reactivex.processors.UnicastProcessor r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r2 = this;
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                boolean r0 = r0.cancelled
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                r1 = 1
                r0.cancelled = r1
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                r0.doTerminate()
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                boolean r0 = r0.enableOperatorFusion
                if (r0 != 0) goto L30
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r0.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L30
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                io.reactivex.processors.UnicastProcessor r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r0.actual
                r1 = 0
                r0.lazySet(r1)
            L30:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r1 = this;
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L12
                io.reactivex.processors.UnicastProcessor r0 = r1.this$0
                java.util.concurrent.atomic.AtomicLong r0 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                io.reactivex.processors.UnicastProcessor r2 = r1.this$0
                r2.drain()
            L12:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r3) {
                r2 = this;
                r0 = 2
                r3 = r3 & r0
                if (r3 == 0) goto La
                io.reactivex.processors.UnicastProcessor r3 = r2.this$0
                r1 = 1
                r3.enableOperatorFusion = r1
                return r0
            La:
                r3 = 0
                return r3
        }
    }

    UnicastProcessor(int r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    UnicastProcessor(int r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    UnicastProcessor(int r3, java.lang.Runnable r4, boolean r5) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>(r4)
            r2.onTerminate = r3
            r2.delayError = r5
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription r3 = new io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription
            r3.<init>(r2)
            r2.wip = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>()
            r2.requested = r3
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create() {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            int r1 = bufferSize()
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int r1) {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int r1, java.lang.Runnable r2) {
            java.lang.String r0 = "onTerminate"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int r1, java.lang.Runnable r2, boolean r3) {
            java.lang.String r0 = "onTerminate"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            r0.<init>(r1, r2, r3)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(boolean r3) {
            io.reactivex.processors.UnicastProcessor r0 = new io.reactivex.processors.UnicastProcessor
            int r1 = bufferSize()
            r2 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    boolean checkTerminated(boolean r4, boolean r5, boolean r6, org.reactivestreams.Subscriber<? super T> r7, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r8) {
            r3 = this;
            boolean r0 = r3.cancelled
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            r8.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r4 = r3.actual
            r4.lazySet(r2)
            return r1
        Lf:
            if (r5 == 0) goto L38
            if (r4 == 0) goto L25
            java.lang.Throwable r4 = r3.error
            if (r4 == 0) goto L25
            r8.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r4 = r3.actual
            r4.lazySet(r2)
            java.lang.Throwable r4 = r3.error
            r7.onError(r4)
            return r1
        L25:
            if (r6 == 0) goto L38
            java.lang.Throwable r4 = r3.error
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r5 = r3.actual
            r5.lazySet(r2)
            if (r4 == 0) goto L34
            r7.onError(r4)
            goto L37
        L34:
            r7.onComplete()
        L37:
            return r1
        L38:
            r4 = 0
            return r4
    }

    void doTerminate() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r2.onTerminate
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto Le
            r0.run()
        Le:
            return
    }

    void drain() {
            r2 = this;
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r2.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscriber r0 = (org.reactivestreams.Subscriber) r0
            r1 = 1
        L12:
            if (r0 == 0) goto L20
            boolean r1 = r2.enableOperatorFusion
            if (r1 == 0) goto L1c
            r2.drainFused(r0)
            goto L1f
        L1c:
            r2.drainRegular(r0)
        L1f:
            return
        L20:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r2.wip
            int r1 = -r1
            int r1 = r0.addAndGet(r1)
            if (r1 != 0) goto L2a
            return
        L2a:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscriber r0 = (org.reactivestreams.Subscriber) r0
            goto L12
    }

    void drainFused(org.reactivestreams.Subscriber<? super T> r7) {
            r6 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r6.queue
            boolean r1 = r6.delayError
            r2 = 1
            r1 = r1 ^ r2
        L6:
            boolean r3 = r6.cancelled
            r4 = 0
            if (r3 == 0) goto L14
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r7 = r6.actual
            r7.lazySet(r4)
            return
        L14:
            boolean r3 = r6.done
            if (r1 == 0) goto L2c
            if (r3 == 0) goto L2c
            java.lang.Throwable r5 = r6.error
            if (r5 == 0) goto L2c
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r6.actual
            r0.lazySet(r4)
            java.lang.Throwable r0 = r6.error
            r7.onError(r0)
            return
        L2c:
            r7.onNext(r4)
            if (r3 == 0) goto L42
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r6.actual
            r0.lazySet(r4)
            java.lang.Throwable r0 = r6.error
            if (r0 == 0) goto L3e
            r7.onError(r0)
            goto L41
        L3e:
            r7.onComplete()
        L41:
            return
        L42:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r3 = r6.wip
            int r2 = -r2
            int r2 = r3.addAndGet(r2)
            if (r2 != 0) goto L6
            return
    }

    void drainRegular(org.reactivestreams.Subscriber<? super T> r18) {
            r17 = this;
            r6 = r17
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r7 = r6.queue
            boolean r0 = r6.delayError
            r8 = 1
            r9 = r0 ^ 1
            r10 = r8
        La:
            java.util.concurrent.atomic.AtomicLong r0 = r6.requested
            long r11 = r0.get()
            r4 = 0
        L12:
            int r15 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r15 == 0) goto L43
            boolean r2 = r6.done
            java.lang.Object r3 = r7.poll()
            if (r3 != 0) goto L21
            r16 = r8
            goto L24
        L21:
            r0 = 0
            r16 = r0
        L24:
            r0 = r17
            r1 = r9
            r8 = r3
            r3 = r16
            r13 = r4
            r4 = r18
            r5 = r7
            boolean r0 = r0.checkTerminated(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L35
            return
        L35:
            if (r16 == 0) goto L38
            goto L44
        L38:
            r5 = r18
            r5.onNext(r8)
            r0 = 1
            long r0 = r0 + r13
            r4 = r0
            r8 = 1
            goto L12
        L43:
            r13 = r4
        L44:
            r5 = r18
            if (r15 != 0) goto L5b
            boolean r2 = r6.done
            boolean r3 = r7.isEmpty()
            r0 = r17
            r1 = r9
            r4 = r18
            r5 = r7
            boolean r0 = r0.checkTerminated(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L5b
            return
        L5b:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L70
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L70
            java.util.concurrent.atomic.AtomicLong r0 = r6.requested
            long r1 = -r13
            r0.addAndGet(r1)
        L70:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r6.wip
            int r1 = -r10
            int r10 = r0.addAndGet(r1)
            if (r10 != 0) goto L7a
            return
        L7a:
            r8 = 1
            goto La
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L7
            java.lang.Throwable r0 = r1.error
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r1.actual
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L12
            boolean r0 = r1.cancelled
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 1
            r1.done = r0
            r1.doTerminate()
            r1.drain()
        L12:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.done
            if (r0 != 0) goto L1a
            boolean r0 = r1.cancelled
            if (r0 == 0) goto Le
            goto L1a
        Le:
            r1.error = r2
            r2 = 1
            r1.done = r2
            r1.doTerminate()
            r1.drain()
            return
        L1a:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r2) {
            r1 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.done
            if (r0 != 0) goto L16
            boolean r0 = r1.cancelled
            if (r0 == 0) goto Le
            goto L16
        Le:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
            r0.offer(r2)
            r1.drain()
        L16:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 != 0) goto L12
            boolean r0 = r2.cancelled
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            goto L15
        L12:
            r3.cancel()
        L15:
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            boolean r0 = r0.get()
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2b
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r3.wip
            r4.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r3.actual
            r0.set(r4)
            boolean r4 = r3.cancelled
            if (r4 == 0) goto L27
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r4 = r3.actual
            r0 = 0
            r4.lazySet(r0)
            goto L35
        L27:
            r3.drain()
            goto L35
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This processor allows only a single Subscriber"
            r0.<init>(r1)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
        L35:
            return
    }
}
