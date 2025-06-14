package io.reactivex.processors;

@io.reactivex.annotations.SchedulerSupport("none")
@io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
/* loaded from: classes.dex */
public final class MulticastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] EMPTY = null;
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] TERMINATED = null;
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile java.lang.Throwable error;
    int fusionMode;
    final int limit;
    final java.util.concurrent.atomic.AtomicBoolean once;
    volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;
    final boolean refcount;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
    final java.util.concurrent.atomic.AtomicInteger wip;

    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long emitted;
        final io.reactivex.processors.MulticastProcessor<T> parent;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.MulticastProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                r0 = -9223372036854775808
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                io.reactivex.processors.MulticastProcessor<T> r0 = r4.parent
                r0.remove(r4)
            Lf:
                return
        }

        void onComplete() {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            Lf:
                return
        }

        void onError(java.lang.Throwable r5) {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
            Lf:
                return
        }

        void onNext(T r5) {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L16
                long r0 = r4.emitted
                r2 = 1
                long r0 = r0 + r2
                r4.emitted = r0
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
            L16:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r9) {
                r8 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r9)
                if (r0 == 0) goto L2f
            L6:
                long r0 = r8.get()
                r2 = -9223372036854775808
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L2f
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1a
                goto L2f
            L1a:
                long r4 = r0 + r9
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L24
            L23:
                r2 = r4
            L24:
                boolean r0 = r8.compareAndSet(r0, r2)
                if (r0 == 0) goto L6
                io.reactivex.processors.MulticastProcessor<T> r9 = r8.parent
                r9.drain()
            L2f:
                return
        }
    }

    static {
            r0 = 0
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r1 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[r0]
            io.reactivex.processors.MulticastProcessor.EMPTY = r1
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[r0]
            io.reactivex.processors.MulticastProcessor.TERMINATED = r0
            return
    }

    MulticastProcessor(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            r1.bufferSize = r2
            int r0 = r2 >> 2
            int r2 = r2 - r0
            r1.limit = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.wip = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = io.reactivex.processors.MulticastProcessor.EMPTY
            r2.<init>(r0)
            r1.subscribers = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.upstream = r2
            r1.refcount = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r1.once = r2
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create() {
            io.reactivex.processors.MulticastProcessor r0 = new io.reactivex.processors.MulticastProcessor
            int r1 = bufferSize()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int r2) {
            io.reactivex.processors.MulticastProcessor r0 = new io.reactivex.processors.MulticastProcessor
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int r1, boolean r2) {
            io.reactivex.processors.MulticastProcessor r0 = new io.reactivex.processors.MulticastProcessor
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(boolean r2) {
            io.reactivex.processors.MulticastProcessor r0 = new io.reactivex.processors.MulticastProcessor
            int r1 = bufferSize()
            r0.<init>(r1, r2)
            return r0
    }

    boolean add(io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r1 = io.reactivex.processors.MulticastProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r3 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r1 = r4.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    void drain() {
            r20 = this;
            r1 = r20
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r2 = r1.subscribers
            int r0 = r1.consumed
            int r3 = r1.limit
            int r4 = r1.fusionMode
            r5 = 1
            r6 = r5
        L15:
            io.reactivex.internal.fuseable.SimpleQueue<T> r7 = r1.queue
            if (r7 == 0) goto L11f
            java.lang.Object r8 = r2.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r8 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r8
            int r9 = r8.length
            if (r9 == 0) goto L11f
            int r9 = r8.length
            r10 = -1
            r14 = r10
            r13 = 0
        L27:
            r16 = 0
            if (r13 >= r9) goto L4b
            r12 = r8[r13]
            long r18 = r12.get()
            int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r16 < 0) goto L46
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 != 0) goto L3e
            long r14 = r12.emitted
            long r14 = r18 - r14
            goto L46
        L3e:
            long r10 = r12.emitted
            long r10 = r18 - r10
            long r14 = java.lang.Math.min(r14, r10)
        L46:
            int r13 = r13 + 1
            r10 = -1
            goto L27
        L4b:
            r9 = r0
        L4c:
            int r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r10 <= 0) goto Ld6
            java.lang.Object r0 = r2.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r11 = io.reactivex.processors.MulticastProcessor.TERMINATED
            if (r0 != r11) goto L5e
            r7.clear()
            return
        L5e:
            if (r8 == r0) goto L62
            goto Le8
        L62:
            boolean r0 = r1.done
            java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> L69
            goto L79
        L69:
            r0 = move-exception
            r11 = r0
            io.reactivex.exceptions.Exceptions.throwIfFatal(r11)
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            r1.error = r11
            r1.done = r5
            r11 = 0
            r0 = r5
        L79:
            if (r11 != 0) goto L7d
            r12 = r5
            goto L7e
        L7d:
            r12 = 0
        L7e:
            if (r0 == 0) goto Laf
            if (r12 == 0) goto Laf
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto L9a
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r3 = io.reactivex.processors.MulticastProcessor.TERMINATED
            java.lang.Object r2 = r2.getAndSet(r3)
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r2 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r2
            int r3 = r2.length
            r12 = 0
        L90:
            if (r12 >= r3) goto Lae
            r4 = r2[r12]
            r4.onError(r0)
            int r12 = r12 + 1
            goto L90
        L9a:
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = io.reactivex.processors.MulticastProcessor.TERMINATED
            java.lang.Object r0 = r2.getAndSet(r0)
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            int r2 = r0.length
            r12 = 0
        La4:
            if (r12 >= r2) goto Lae
            r3 = r0[r12]
            r3.onComplete()
            int r12 = r12 + 1
            goto La4
        Lae:
            return
        Laf:
            if (r12 == 0) goto Lb2
            goto Ld6
        Lb2:
            int r0 = r8.length
            r10 = 0
        Lb4:
            if (r10 >= r0) goto Lbe
            r12 = r8[r10]
            r12.onNext(r11)
            int r10 = r10 + 1
            goto Lb4
        Lbe:
            r10 = 1
            long r14 = r14 - r10
            if (r4 == r5) goto L4c
            int r9 = r9 + 1
            if (r9 != r3) goto L4c
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
            java.lang.Object r0 = r0.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            long r9 = (long) r3
            r0.request(r9)
            r9 = 0
            goto L4c
        Ld6:
            if (r10 != 0) goto L11e
            java.lang.Object r0 = r2.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r10 = io.reactivex.processors.MulticastProcessor.TERMINATED
            if (r0 != r10) goto Le6
            r7.clear()
            return
        Le6:
            if (r8 == r0) goto Leb
        Le8:
            r0 = r9
            goto L15
        Leb:
            boolean r0 = r1.done
            if (r0 == 0) goto L11e
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L11e
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto L10b
            java.lang.Object r2 = r2.getAndSet(r10)
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r2 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r2
            int r3 = r2.length
            r12 = 0
        L101:
            if (r12 >= r3) goto L11d
            r4 = r2[r12]
            r4.onError(r0)
            int r12 = r12 + 1
            goto L101
        L10b:
            java.lang.Object r0 = r2.getAndSet(r10)
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            int r2 = r0.length
            r12 = 0
        L113:
            if (r12 >= r2) goto L11d
            r3 = r0[r12]
            r3.onComplete()
            int r12 = r12 + 1
            goto L113
        L11d:
            return
        L11e:
            r0 = r9
        L11f:
            java.util.concurrent.atomic.AtomicInteger r7 = r1.wip
            int r6 = -r6
            int r6 = r7.addAndGet(r6)
            if (r6 != 0) goto L15
            return
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
            boolean r0 = r0.get()
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = r1.error
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
            boolean r0 = r0.get()
            if (r0 == 0) goto Le
            java.lang.Throwable r0 = r1.error
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
            boolean r0 = r0.get()
            if (r0 == 0) goto Le
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean offer(T r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.once
            boolean r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "offer called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            int r0 = r2.fusionMode
            if (r0 != 0) goto L20
            io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
            boolean r3 = r0.offer(r3)
            if (r3 == 0) goto L20
            r2.drain()
            r3 = 1
            return r3
        L20:
            return r1
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lf
            r3.done = r2
            r3.drain()
        Lf:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r4) {
            r3 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L17
            r3.error = r4
            r3.done = r2
            r3.drain()
            goto L1a
        L17:
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
        L1a:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            int r0 = r1.fusionMode
            if (r0 != 0) goto L28
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
            boolean r2 = r0.offer(r2)
            if (r2 != 0) goto L28
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.upstream
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
            io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
            r2.<init>()
            r1.onError(r2)
            return
        L28:
            r1.drain()
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.upstream
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4)
            if (r0 == 0) goto L3e
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
            if (r0 == 0) goto L2f
            r0 = r4
            io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
            r1 = 3
            int r1 = r0.requestFusion(r1)
            r2 = 1
            if (r1 != r2) goto L21
            r3.fusionMode = r1
            r3.queue = r0
            r3.done = r2
            r3.drain()
            return
        L21:
            r2 = 2
            if (r1 != r2) goto L2f
            r3.fusionMode = r1
            r3.queue = r0
            int r0 = r3.bufferSize
            long r0 = (long) r0
            r4.request(r0)
            return
        L2f:
            io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
            int r1 = r3.bufferSize
            r0.<init>(r1)
            r3.queue = r0
            int r0 = r3.bufferSize
            long r0 = (long) r0
            r4.request(r0)
        L3e:
            return
    }

    void remove(io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r0 = (io.reactivex.processors.MulticastProcessor.MulticastSubscription[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 != r7) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1c
            goto L59
        L1c:
            r4 = 1
            if (r1 != r4) goto L43
            boolean r1 = r6.refcount
            if (r1 == 0) goto L38
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r1 = r6.subscribers
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r2 = io.reactivex.processors.MulticastProcessor.TERMINATED
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r7 = r6.upstream
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.once
            r7.set(r4)
            goto L59
        L38:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r1 = r6.subscribers
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r2 = io.reactivex.processors.MulticastProcessor.EMPTY
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 == 0) goto L0
            goto L59
        L43:
            int r5 = r1 + (-1)
            io.reactivex.processors.MulticastProcessor$MulticastSubscription[] r5 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor$MulticastSubscription<T>[]> r1 = r6.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r5)
            if (r0 == 0) goto L0
        L59:
            return
    }

    public void start() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
            io.reactivex.internal.subscriptions.EmptySubscription r1 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r1)
            if (r0 == 0) goto L13
            io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
            int r1 = r2.bufferSize
            r0.<init>(r1)
            r2.queue = r0
        L13:
            return
    }

    public void startUnbounded() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
            io.reactivex.internal.subscriptions.EmptySubscription r1 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r1)
            if (r0 == 0) goto L13
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            int r1 = r2.bufferSize
            r0.<init>(r1)
            r2.queue = r0
        L13:
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.processors.MulticastProcessor$MulticastSubscription r0 = new io.reactivex.processors.MulticastProcessor$MulticastSubscription
            r0.<init>(r6, r5)
            r6.onSubscribe(r0)
            boolean r1 = r5.add(r0)
            if (r1 == 0) goto L20
            long r1 = r0.get()
            r3 = -9223372036854775808
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1c
            r5.remove(r0)
            goto L37
        L1c:
            r5.drain()
            goto L37
        L20:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.once
            boolean r0 = r0.get()
            if (r0 != 0) goto L2c
            boolean r0 = r5.refcount
            if (r0 != 0) goto L34
        L2c:
            java.lang.Throwable r0 = r5.error
            if (r0 == 0) goto L34
            r6.onError(r0)
            return
        L34:
            r6.onComplete()
        L37:
            return
    }
}
