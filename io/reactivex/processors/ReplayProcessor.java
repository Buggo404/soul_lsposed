package io.reactivex.processors;

/* loaded from: classes.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] EMPTY = null;
    private static final java.lang.Object[] EMPTY_ARRAY = null;
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] TERMINATED = null;
    final io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> buffer;
    boolean done;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[]> subscribers;

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }
    }

    interface ReplayBuffer<T> {
        void complete();

        void error(java.lang.Throwable r1);

        java.lang.Throwable getError();

        T getValue();

        T[] getValues(T[] r1);

        boolean isDone();

        void next(T r1);

        void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r1);

        int size();

        void trimHead();
    }

    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        long emitted;
        java.lang.Object index;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.processors.ReplayProcessor<T> state;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.ReplayProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.state = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.processors.ReplayProcessor<T> r0 = r1.state
                r0.remove(r1)
            Lc:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L12
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                io.reactivex.processors.ReplayProcessor<T> r2 = r1.state
                io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r2 = r2.buffer
                r2.replay(r1)
            L12:
                return
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        volatile io.reactivex.processors.ReplayProcessor.TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final io.reactivex.Scheduler scheduler;
        int size;
        io.reactivex.processors.ReplayProcessor.TimedNode<T> tail;
        final java.util.concurrent.TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "maxSize"
                int r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
                r1.maxSize = r2
                java.lang.String r2 = "maxAge"
                long r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r2)
                r1.maxAge = r2
                java.lang.String r2 = "unit is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r2)
                java.util.concurrent.TimeUnit r2 = (java.util.concurrent.TimeUnit) r2
                r1.unit = r2
                java.lang.String r2 = "scheduler is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r2)
                io.reactivex.Scheduler r2 = (io.reactivex.Scheduler) r2
                r1.scheduler = r2
                io.reactivex.processors.ReplayProcessor$TimedNode r2 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r3 = 0
                r4 = 0
                r2.<init>(r3, r4)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
                r1 = this;
                r1.trimFinal()
                r0 = 1
                r1.done = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable r1) {
                r0 = this;
                r0.trimFinal()
                r0.error = r1
                r1 = 1
                r0.done = r1
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
                r1 = this;
                java.lang.Throwable r0 = r1.error
                return r0
        }

        io.reactivex.processors.ReplayProcessor.TimedNode<T> getHead() {
                r7 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r0 = r7.head
                io.reactivex.Scheduler r1 = r7.scheduler
                java.util.concurrent.TimeUnit r2 = r7.unit
                long r1 = r1.now(r2)
                long r3 = r7.maxAge
                long r1 = r1 - r3
                java.lang.Object r3 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
            L13:
                r6 = r3
                r3 = r0
                r0 = r6
                if (r0 == 0) goto L26
                long r4 = r0.time
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 <= 0) goto L1f
                goto L26
            L1f:
                java.lang.Object r3 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                goto L13
            L26:
                return r3
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r5 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r0 = r5.head
            L2:
                java.lang.Object r1 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r1 = (io.reactivex.processors.ReplayProcessor.TimedNode) r1
                if (r1 != 0) goto L20
                io.reactivex.Scheduler r1 = r5.scheduler
                java.util.concurrent.TimeUnit r2 = r5.unit
                long r1 = r1.now(r2)
                long r3 = r5.maxAge
                long r1 = r1 - r3
                long r3 = r0.time
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 >= 0) goto L1d
                r0 = 0
                return r0
            L1d:
                T r0 = r0.value
                return r0
            L20:
                r0 = r1
                goto L2
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = r5.getHead()
                int r1 = r5.size(r0)
                r2 = 0
                r3 = 0
                if (r1 != 0) goto L12
                int r0 = r6.length
                if (r0 == 0) goto L39
                r6[r3] = r2
                goto L39
            L12:
                int r4 = r6.length
                if (r4 >= r1) goto L25
                java.lang.Class r6 = r6.getClass()
                java.lang.Class r6 = r6.getComponentType()
                java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                java.lang.Object[] r6 = (java.lang.Object[]) r6
            L25:
                if (r3 == r1) goto L34
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = (io.reactivex.processors.ReplayProcessor.TimedNode) r0
                T r4 = r0.value
                r6[r3] = r4
                int r3 = r3 + 1
                goto L25
            L34:
                int r0 = r6.length
                if (r0 <= r1) goto L39
                r6[r1] = r2
            L39:
                return r6
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T r4) {
                r3 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                io.reactivex.Scheduler r1 = r3.scheduler
                java.util.concurrent.TimeUnit r2 = r3.unit
                long r1 = r1.now(r2)
                r0.<init>(r4, r1)
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r4 = r3.tail
                r3.tail = r0
                int r1 = r3.size
                int r1 = r1 + 1
                r3.size = r1
                r4.set(r0)
                r3.trim()
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r14) {
                r13 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r14.actual
                java.lang.Object r1 = r14.index
                io.reactivex.processors.ReplayProcessor$TimedNode r1 = (io.reactivex.processors.ReplayProcessor.TimedNode) r1
                if (r1 != 0) goto L13
                io.reactivex.processors.ReplayProcessor$TimedNode r1 = r13.getHead()
            L13:
                long r2 = r14.emitted
                r4 = 1
                r5 = r4
            L17:
                java.util.concurrent.atomic.AtomicLong r6 = r14.requested
                long r6 = r6.get()
            L1d:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                r9 = 0
                if (r8 == 0) goto L57
                boolean r10 = r14.cancelled
                if (r10 == 0) goto L29
                r14.index = r9
                return
            L29:
                boolean r10 = r13.done
                java.lang.Object r11 = r1.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r11 = (io.reactivex.processors.ReplayProcessor.TimedNode) r11
                if (r11 != 0) goto L35
                r12 = r4
                goto L36
            L35:
                r12 = 0
            L36:
                if (r10 == 0) goto L4a
                if (r12 == 0) goto L4a
                r14.index = r9
                r14.cancelled = r4
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L46
                r0.onComplete()
                goto L49
            L46:
                r0.onError(r14)
            L49:
                return
            L4a:
                if (r12 == 0) goto L4d
                goto L57
            L4d:
                T r1 = r11.value
                r0.onNext(r1)
                r8 = 1
                long r2 = r2 + r8
                r1 = r11
                goto L1d
            L57:
                if (r8 != 0) goto L7a
                boolean r6 = r14.cancelled
                if (r6 == 0) goto L60
                r14.index = r9
                return
            L60:
                boolean r6 = r13.done
                if (r6 == 0) goto L7a
                java.lang.Object r6 = r1.get()
                if (r6 != 0) goto L7a
                r14.index = r9
                r14.cancelled = r4
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L76
                r0.onComplete()
                goto L79
            L76:
                r0.onError(r14)
            L79:
                return
            L7a:
                r14.index = r1
                r14.emitted = r2
                int r5 = -r5
                int r5 = r14.addAndGet(r5)
                if (r5 != 0) goto L17
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r1 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = r1.getHead()
                int r0 = r1.size(r0)
                return r0
        }

        int size(io.reactivex.processors.ReplayProcessor.TimedNode<T> r3) {
                r2 = this;
                r0 = 0
            L1:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L12
                java.lang.Object r3 = r3.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                if (r3 != 0) goto Lf
                goto L12
            Lf:
                int r0 = r0 + 1
                goto L1
            L12:
                return r0
        }

        void trim() {
                r6 = this;
                int r0 = r6.size
                int r1 = r6.maxSize
                if (r0 <= r1) goto L14
                int r0 = r0 + (-1)
                r6.size = r0
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r0 = r6.head
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = (io.reactivex.processors.ReplayProcessor.TimedNode) r0
                r6.head = r0
            L14:
                io.reactivex.Scheduler r0 = r6.scheduler
                java.util.concurrent.TimeUnit r1 = r6.unit
                long r0 = r0.now(r1)
                long r2 = r6.maxAge
                long r0 = r0 - r2
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r2 = r6.head
            L21:
                java.lang.Object r3 = r2.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                if (r3 != 0) goto L2c
                r6.head = r2
                goto L34
            L2c:
                long r4 = r3.time
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 <= 0) goto L35
                r6.head = r2
            L34:
                return
            L35:
                r2 = r3
                goto L21
        }

        void trimFinal() {
                r9 = this;
                io.reactivex.Scheduler r0 = r9.scheduler
                java.util.concurrent.TimeUnit r1 = r9.unit
                long r0 = r0.now(r1)
                long r2 = r9.maxAge
                long r0 = r0 - r2
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r2 = r9.head
            Ld:
                java.lang.Object r3 = r2.get()
                io.reactivex.processors.ReplayProcessor$TimedNode r3 = (io.reactivex.processors.ReplayProcessor.TimedNode) r3
                r4 = 0
                r6 = 0
                if (r3 != 0) goto L27
                T r0 = r2.value
                if (r0 == 0) goto L24
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r0.<init>(r6, r4)
                r9.head = r0
                goto L42
            L24:
                r9.head = r2
                goto L42
            L27:
                long r7 = r3.time
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 <= 0) goto L43
                T r0 = r2.value
                if (r0 == 0) goto L40
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r0.<init>(r6, r4)
                java.lang.Object r1 = r2.get()
                r0.lazySet(r1)
                r9.head = r0
                goto L42
            L40:
                r9.head = r2
            L42:
                return
            L43:
                r2 = r3
                goto Ld
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
                r4 = this;
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r0 = r4.head
                T r0 = r0.value
                if (r0 == 0) goto L19
                io.reactivex.processors.ReplayProcessor$TimedNode r0 = new io.reactivex.processors.ReplayProcessor$TimedNode
                r1 = 0
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.processors.ReplayProcessor$TimedNode<T> r1 = r4.head
                java.lang.Object r1 = r1.get()
                r0.lazySet(r1)
                r4.head = r0
            L19:
                return
        }
    }

    static final class SizeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        volatile io.reactivex.processors.ReplayProcessor.Node<T> head;
        final int maxSize;
        int size;
        io.reactivex.processors.ReplayProcessor.Node<T> tail;

        SizeBoundReplayBuffer(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "maxSize"
                int r2 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
                r1.maxSize = r2
                io.reactivex.processors.ReplayProcessor$Node r2 = new io.reactivex.processors.ReplayProcessor$Node
                r0 = 0
                r2.<init>(r0)
                r1.tail = r2
                r1.head = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
                r1 = this;
                r1.trimHead()
                r0 = 1
                r1.done = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r0.trimHead()
                r1 = 1
                r0.done = r1
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
                r1 = this;
                java.lang.Throwable r0 = r1.error
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r2 = this;
                io.reactivex.processors.ReplayProcessor$Node<T> r0 = r2.head
            L2:
                java.lang.Object r1 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r1 = (io.reactivex.processors.ReplayProcessor.Node) r1
                if (r1 != 0) goto Ld
                T r0 = r0.value
                return r0
            Ld:
                r0 = r1
                goto L2
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r5) {
                r4 = this;
                io.reactivex.processors.ReplayProcessor$Node<T> r0 = r4.head
                r1 = 0
                r2 = r0
                r3 = r1
            L5:
                java.lang.Object r2 = r2.get()
                io.reactivex.processors.ReplayProcessor$Node r2 = (io.reactivex.processors.ReplayProcessor.Node) r2
                if (r2 != 0) goto L36
                int r2 = r5.length
                if (r2 >= r3) goto L20
                java.lang.Class r5 = r5.getClass()
                java.lang.Class r5 = r5.getComponentType()
                java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r3)
                java.lang.Object[] r5 = (java.lang.Object[]) r5
                java.lang.Object[] r5 = (java.lang.Object[]) r5
            L20:
                if (r1 >= r3) goto L2f
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r0 = (io.reactivex.processors.ReplayProcessor.Node) r0
                T r2 = r0.value
                r5[r1] = r2
                int r1 = r1 + 1
                goto L20
            L2f:
                int r0 = r5.length
                if (r0 <= r3) goto L35
                r0 = 0
                r5[r3] = r0
            L35:
                return r5
            L36:
                int r3 = r3 + 1
                goto L5
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T r3) {
                r2 = this;
                io.reactivex.processors.ReplayProcessor$Node r0 = new io.reactivex.processors.ReplayProcessor$Node
                r0.<init>(r3)
                io.reactivex.processors.ReplayProcessor$Node<T> r3 = r2.tail
                r2.tail = r0
                int r1 = r2.size
                int r1 = r1 + 1
                r2.size = r1
                r3.set(r0)
                r2.trim()
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r14) {
                r13 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r14.actual
                java.lang.Object r1 = r14.index
                io.reactivex.processors.ReplayProcessor$Node r1 = (io.reactivex.processors.ReplayProcessor.Node) r1
                if (r1 != 0) goto L11
                io.reactivex.processors.ReplayProcessor$Node<T> r1 = r13.head
            L11:
                long r2 = r14.emitted
                r4 = 1
                r5 = r4
            L15:
                java.util.concurrent.atomic.AtomicLong r6 = r14.requested
                long r6 = r6.get()
            L1b:
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                r9 = 0
                if (r8 == 0) goto L55
                boolean r10 = r14.cancelled
                if (r10 == 0) goto L27
                r14.index = r9
                return
            L27:
                boolean r10 = r13.done
                java.lang.Object r11 = r1.get()
                io.reactivex.processors.ReplayProcessor$Node r11 = (io.reactivex.processors.ReplayProcessor.Node) r11
                if (r11 != 0) goto L33
                r12 = r4
                goto L34
            L33:
                r12 = 0
            L34:
                if (r10 == 0) goto L48
                if (r12 == 0) goto L48
                r14.index = r9
                r14.cancelled = r4
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L44
                r0.onComplete()
                goto L47
            L44:
                r0.onError(r14)
            L47:
                return
            L48:
                if (r12 == 0) goto L4b
                goto L55
            L4b:
                T r1 = r11.value
                r0.onNext(r1)
                r8 = 1
                long r2 = r2 + r8
                r1 = r11
                goto L1b
            L55:
                if (r8 != 0) goto L78
                boolean r6 = r14.cancelled
                if (r6 == 0) goto L5e
                r14.index = r9
                return
            L5e:
                boolean r6 = r13.done
                if (r6 == 0) goto L78
                java.lang.Object r6 = r1.get()
                if (r6 != 0) goto L78
                r14.index = r9
                r14.cancelled = r4
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L74
                r0.onComplete()
                goto L77
            L74:
                r0.onError(r14)
            L77:
                return
            L78:
                r14.index = r1
                r14.emitted = r2
                int r5 = -r5
                int r5 = r14.addAndGet(r5)
                if (r5 != 0) goto L15
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r3 = this;
                io.reactivex.processors.ReplayProcessor$Node<T> r0 = r3.head
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L14
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r0 = (io.reactivex.processors.ReplayProcessor.Node) r0
                if (r0 != 0) goto L11
                goto L14
            L11:
                int r1 = r1 + 1
                goto L3
            L14:
                return r1
        }

        void trim() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.maxSize
                if (r0 <= r1) goto L14
                int r0 = r0 + (-1)
                r2.size = r0
                io.reactivex.processors.ReplayProcessor$Node<T> r0 = r2.head
                java.lang.Object r0 = r0.get()
                io.reactivex.processors.ReplayProcessor$Node r0 = (io.reactivex.processors.ReplayProcessor.Node) r0
                r2.head = r0
            L14:
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
                r2 = this;
                io.reactivex.processors.ReplayProcessor$Node<T> r0 = r2.head
                T r0 = r0.value
                if (r0 == 0) goto L17
                io.reactivex.processors.ReplayProcessor$Node r0 = new io.reactivex.processors.ReplayProcessor$Node
                r1 = 0
                r0.<init>(r1)
                io.reactivex.processors.ReplayProcessor$Node<T> r1 = r2.head
                java.lang.Object r1 = r1.get()
                r0.lazySet(r1)
                r2.head = r0
            L17:
                return
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.time = r2
                return
        }
    }

    static final class UnboundedReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        final java.util.List<T> buffer;
        volatile boolean done;
        java.lang.Throwable error;
        volatile int size;

        UnboundedReplayBuffer(int r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                java.lang.String r1 = "capacityHint"
                int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
                r0.<init>(r3)
                r2.buffer = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public java.lang.Throwable getError() {
                r1 = this;
                java.lang.Throwable r0 = r1.error
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
                r2 = this;
                int r0 = r2.size
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                java.util.List<T> r1 = r2.buffer
                int r0 = r0 + (-1)
                java.lang.Object r0 = r1.get(r0)
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] r6) {
                r5 = this;
                int r0 = r5.size
                r1 = 0
                r2 = 0
                if (r0 != 0) goto Lc
                int r0 = r6.length
                if (r0 == 0) goto Lb
                r6[r2] = r1
            Lb:
                return r6
            Lc:
                java.util.List<T> r3 = r5.buffer
                int r4 = r6.length
                if (r4 >= r0) goto L21
                java.lang.Class r6 = r6.getClass()
                java.lang.Class r6 = r6.getComponentType()
                java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r0)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                java.lang.Object[] r6 = (java.lang.Object[]) r6
            L21:
                if (r2 >= r0) goto L2c
                java.lang.Object r4 = r3.get(r2)
                r6[r2] = r4
                int r2 = r2 + 1
                goto L21
            L2c:
                int r2 = r6.length
                if (r2 <= r0) goto L31
                r6[r0] = r1
            L31:
                return r6
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T r2) {
                r1 = this;
                java.util.List<T> r0 = r1.buffer
                r0.add(r2)
                int r2 = r1.size
                int r2 = r2 + 1
                r1.size = r2
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r14) {
                r13 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.List<T> r0 = r13.buffer
                org.reactivestreams.Subscriber<? super T> r1 = r14.actual
                java.lang.Object r2 = r14.index
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L16
                int r2 = r2.intValue()
                goto L1d
            L16:
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r14.index = r3
            L1d:
                long r3 = r14.emitted
                r5 = 1
                r6 = r5
            L21:
                java.util.concurrent.atomic.AtomicLong r7 = r14.requested
                long r7 = r7.get()
            L27:
                int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                r10 = 0
                if (r9 == 0) goto L5b
                boolean r11 = r14.cancelled
                if (r11 == 0) goto L33
                r14.index = r10
                return
            L33:
                boolean r11 = r13.done
                int r12 = r13.size
                if (r11 == 0) goto L4b
                if (r2 != r12) goto L4b
                r14.index = r10
                r14.cancelled = r5
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L47
                r1.onComplete()
                goto L4a
            L47:
                r1.onError(r14)
            L4a:
                return
            L4b:
                if (r2 != r12) goto L4e
                goto L5b
            L4e:
                java.lang.Object r9 = r0.get(r2)
                r1.onNext(r9)
                int r2 = r2 + 1
                r9 = 1
                long r3 = r3 + r9
                goto L27
            L5b:
                if (r9 != 0) goto L7c
                boolean r7 = r14.cancelled
                if (r7 == 0) goto L64
                r14.index = r10
                return
            L64:
                boolean r7 = r13.done
                int r8 = r13.size
                if (r7 == 0) goto L7c
                if (r2 != r8) goto L7c
                r14.index = r10
                r14.cancelled = r5
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L78
                r1.onComplete()
                goto L7b
            L78:
                r1.onError(r14)
            L7b:
                return
            L7c:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                r14.index = r7
                r14.emitted = r3
                int r6 = -r6
                int r6 = r14.addAndGet(r6)
                if (r6 != 0) goto L21
                return
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
                r0 = this;
                return
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            io.reactivex.processors.ReplayProcessor.EMPTY_ARRAY = r1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r0]
            io.reactivex.processors.ReplayProcessor.EMPTY = r1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r0]
            io.reactivex.processors.ReplayProcessor.TERMINATED = r0
            return
    }

    ReplayProcessor(io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> r2) {
            r1 = this;
            r1.<init>()
            r1.buffer = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = io.reactivex.processors.ReplayProcessor.EMPTY
            r2.<init>(r0)
            r1.subscribers = r2
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create() {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer
            r2 = 16
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create(int r2) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$UnboundedReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static <T> io.reactivex.processors.ReplayProcessor<T> createUnbounded() {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithSize(int r2) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer r1 = new io.reactivex.processors.ReplayProcessor$SizeBoundReplayBuffer
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTime(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer r7 = new io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r7)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTimeAndSize(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11, int r12) {
            io.reactivex.processors.ReplayProcessor r0 = new io.reactivex.processors.ReplayProcessor
            io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer r7 = new io.reactivex.processors.ReplayProcessor$SizeAndTimeBoundReplayBuffer
            r1 = r7
            r2 = r12
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r7)
            return r0
    }

    boolean add(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r3 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r1 = r4.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    public void cleanupBuffer() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            r0.trimHead()
            return
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r2 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r2.buffer
            boolean r1 = r0.isDone()
            if (r1 == 0) goto Ld
            java.lang.Throwable r0 = r0.getError()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public T getValue() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public java.lang.Object[] getValues() {
            r2 = this;
            java.lang.Object[] r0 = io.reactivex.processors.ReplayProcessor.EMPTY_ARRAY
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r1 = r2.getValues(r1)
            if (r1 != r0) goto Lf
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lf:
            return r1
    }

    public T[] getValues(T[] r2) {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            java.lang.Object[] r2 = r0.getValues(r2)
            return r2
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r2 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r2.buffer
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L10
            java.lang.Throwable r0 = r0.getError()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
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
            r2 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r2.buffer
            boolean r1 = r0.isDone()
            if (r1 == 0) goto L10
            java.lang.Throwable r0 = r0.getError()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean hasValue() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
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
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r5.done = r0
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r5.buffer
            r0.complete()
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r1 = r5.subscribers
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r2 = io.reactivex.processors.ReplayProcessor.TERMINATED
            java.lang.Object r1 = r1.getAndSet(r2)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r1
            int r2 = r1.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L23
            r4 = r1[r3]
            r0.replay(r4)
            int r3 = r3 + 1
            goto L19
        L23:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            boolean r0 = r4.done
            if (r0 == 0) goto Ld
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
        Ld:
            r0 = 1
            r4.done = r0
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r4.buffer
            r0.error(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r5 = r4.subscribers
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            java.lang.Object r5 = r5.getAndSet(r1)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r5
            int r1 = r5.length
            r2 = 0
        L21:
            if (r2 >= r1) goto L2b
            r3 = r5[r2]
            r0.replay(r3)
            int r2 = r2 + 1
            goto L21
        L2b:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r5) {
            r4 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            boolean r0 = r4.done
            if (r0 == 0) goto La
            return
        La:
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r4.buffer
            r0.next(r5)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r5 = r4.subscribers
            java.lang.Object r5 = r5.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r5
            int r1 = r5.length
            r2 = 0
        L19:
            if (r2 >= r1) goto L23
            r3 = r5[r2]
            r0.replay(r3)
            int r2 = r2 + 1
            goto L19
        L23:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L8
            r3.cancel()
            return
        L8:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
    }

    void remove(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.EMPTY
            if (r0 != r1) goto L11
            goto L3f
        L11:
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L1e
            r4 = r0[r3]
            if (r4 != r7) goto L1b
            goto L1f
        L1b:
            int r3 = r3 + 1
            goto L14
        L1e:
            r3 = -1
        L1f:
            if (r3 >= 0) goto L22
            return
        L22:
            r4 = 1
            if (r1 != r4) goto L28
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r1 = io.reactivex.processors.ReplayProcessor.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r5 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r2 = r6.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    int size() {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r0 = r1.buffer
            int r0 = r0.size()
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.processors.ReplayProcessor$ReplaySubscription r0 = new io.reactivex.processors.ReplayProcessor$ReplaySubscription
            r0.<init>(r2, r1)
            r2.onSubscribe(r0)
            boolean r2 = r1.add(r0)
            if (r2 == 0) goto L16
            boolean r2 = r0.cancelled
            if (r2 == 0) goto L16
            r1.remove(r0)
            return
        L16:
            io.reactivex.processors.ReplayProcessor$ReplayBuffer<T> r2 = r1.buffer
            r2.replay(r0)
            return
    }

    int subscriberCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor$ReplaySubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.ReplayProcessor$ReplaySubscription[] r0 = (io.reactivex.processors.ReplayProcessor.ReplaySubscription[]) r0
            int r0 = r0.length
            return r0
    }
}
