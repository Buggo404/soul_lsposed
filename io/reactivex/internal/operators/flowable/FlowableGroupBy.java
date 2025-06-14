package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableGroupBy<T, K, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.flowables.GroupedFlowable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
    final io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> mapFactory;
    final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

    static final class EvictionAction<K, V> implements io.reactivex.functions.Consumer<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> {
        final java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> evictedGroups;

        EvictionAction(java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> r1) {
                r0 = this;
                r0.<init>()
                r0.evictedGroups = r1
                return
        }

        public void accept(io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V> r2) {
                r1 = this;
                java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r1.evictedGroups
                r0.offer(r2)
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r1 = (io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) r1
                r0.accept(r1)
                return
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<io.reactivex.flowables.GroupedFlowable<K, V>> implements io.reactivex.FlowableSubscriber<T> {
        static final java.lang.Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        final org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> actual;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicBoolean cancelled;
        final boolean delayError;
        boolean done;
        java.lang.Throwable error;
        final java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> evictedGroups;
        volatile boolean finished;
        final java.util.concurrent.atomic.AtomicInteger groupCount;
        final java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> groups;
        final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        boolean outputFused;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f262s;
        final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber.NULL_KEY = r0
                return
        }

        public GroupBySubscriber(org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> r3, io.reactivex.functions.Function<? super T, ? extends K> r4, io.reactivex.functions.Function<? super T, ? extends V> r5, int r6, boolean r7, java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> r8, java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> r9) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r2.cancelled = r0
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r2.requested = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.groupCount = r0
                r2.actual = r3
                r2.keySelector = r4
                r2.valueSelector = r5
                r2.bufferSize = r6
                r2.delayError = r7
                r2.groups = r8
                r2.evictedGroups = r9
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r3.<init>(r6)
                r2.queue = r3
                return
        }

        private void completeEvictions() {
                r2 = this;
                java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r2.evictedGroups
                if (r0 == 0) goto L1d
                r0 = 0
            L5:
                java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r1 = r2.evictedGroups
                java.lang.Object r1 = r1.poll()
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r1 = (io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) r1
                if (r1 == 0) goto L15
                r1.onComplete()
                int r0 = r0 + 1
                goto L5
            L15:
                if (r0 == 0) goto L1d
                java.util.concurrent.atomic.AtomicInteger r1 = r2.groupCount
                int r0 = -r0
                r1.addAndGet(r0)
            L1d:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1a
                r3.completeEvictions()
                java.util.concurrent.atomic.AtomicInteger r0 = r3.groupCount
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1a
                org.reactivestreams.Subscription r0 = r3.f262s
                r0.cancel()
            L1a:
                return
        }

        public void cancel(K r2) {
                r1 = this;
                if (r2 == 0) goto L3
                goto L5
            L3:
                java.lang.Object r2 = io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber.NULL_KEY
            L5:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r1.groups
                r0.remove(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.groupCount
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto L22
                org.reactivestreams.Subscription r2 = r1.f262s
                r2.cancel()
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L22
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r2 = r1.queue
                r2.clear()
            L22:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<?> r5, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r6) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.cancelled
                boolean r0 = r0.get()
                r1 = 1
                if (r0 == 0) goto Ld
                r6.clear()
                return r1
            Ld:
                boolean r0 = r2.delayError
                if (r0 == 0) goto L21
                if (r3 == 0) goto L34
                if (r4 == 0) goto L34
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L1d
                r5.onError(r3)
                goto L20
            L1d:
                r5.onComplete()
            L20:
                return r1
            L21:
                if (r3 == 0) goto L34
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L2e
                r6.clear()
                r5.onError(r3)
                return r1
            L2e:
                if (r4 == 0) goto L34
                r5.onComplete()
                return r1
            L34:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r1.queue
                r0.clear()
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r1.outputFused
                if (r0 == 0) goto Lf
                r1.drainFused()
                goto L12
            Lf:
                r1.drainNormal()
            L12:
                return
        }

        void drainFused() {
                r5 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r5.queue
                org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> r1 = r5.actual
                r2 = 1
            L5:
                java.util.concurrent.atomic.AtomicBoolean r3 = r5.cancelled
                boolean r3 = r3.get()
                if (r3 == 0) goto L11
                r0.clear()
                return
            L11:
                boolean r3 = r5.finished
                if (r3 == 0) goto L24
                boolean r4 = r5.delayError
                if (r4 != 0) goto L24
                java.lang.Throwable r4 = r5.error
                if (r4 == 0) goto L24
                r0.clear()
                r1.onError(r4)
                return
            L24:
                r4 = 0
                r1.onNext(r4)
                if (r3 == 0) goto L36
                java.lang.Throwable r0 = r5.error
                if (r0 == 0) goto L32
                r1.onError(r0)
                goto L35
            L32:
                r1.onComplete()
            L35:
                return
            L36:
                int r2 = -r2
                int r2 = r5.addAndGet(r2)
                if (r2 != 0) goto L5
                return
        }

        void drainNormal() {
                r14 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r14.queue
                org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> r1 = r14.actual
                r2 = 1
                r3 = r2
            L6:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            Lf:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L31
                boolean r11 = r14.finished
                java.lang.Object r12 = r0.poll()
                io.reactivex.flowables.GroupedFlowable r12 = (io.reactivex.flowables.GroupedFlowable) r12
                if (r12 != 0) goto L1f
                r13 = r2
                goto L20
            L1f:
                r13 = 0
            L20:
                boolean r11 = r14.checkTerminated(r11, r13, r1, r0)
                if (r11 == 0) goto L27
                return
            L27:
                if (r13 == 0) goto L2a
                goto L31
            L2a:
                r1.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto Lf
            L31:
                if (r10 != 0) goto L40
                boolean r10 = r14.finished
                boolean r11 = r0.isEmpty()
                boolean r10 = r14.checkTerminated(r10, r11, r1, r0)
                if (r10 == 0) goto L40
                return
            L40:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L58
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L53
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L53:
                org.reactivestreams.Subscription r4 = r14.f262s
                r4.request(r8)
            L58:
                int r3 = -r3
                int r3 = r14.addAndGet(r3)
                if (r3 != 0) goto L6
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L32
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r2.groups
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r1 = (io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) r1
                r1.onComplete()
                goto Le
            L1e:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r2.groups
                r0.clear()
                java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r0 = r2.evictedGroups
                if (r0 == 0) goto L2a
                r0.clear()
            L2a:
                r0 = 1
                r2.done = r0
                r2.finished = r0
                r2.drain()
            L32:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
            L8:
                r0 = 1
                r3.done = r0
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r1 = r3.groups
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L25
                java.lang.Object r2 = r1.next()
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r2 = (io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) r2
                r2.onError(r4)
                goto L15
            L25:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r1 = r3.groups
                r1.clear()
                java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r1 = r3.evictedGroups
                if (r1 == 0) goto L31
                r1.clear()
            L31:
                r3.error = r4
                r3.finished = r0
                r3.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r5.queue
                io.reactivex.functions.Function<? super T, ? extends K> r1 = r5.keySelector     // Catch: java.lang.Throwable -> L63
                java.lang.Object r1 = r1.apply(r6)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L11
                r2 = r1
                goto L13
            L11:
                java.lang.Object r2 = io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber.NULL_KEY
            L13:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r3 = r5.groups
                java.lang.Object r3 = r3.get(r2)
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r3 = (io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) r3
                if (r3 != 0) goto L3a
                java.util.concurrent.atomic.AtomicBoolean r3 = r5.cancelled
                boolean r3 = r3.get()
                if (r3 == 0) goto L26
                return
            L26:
                int r3 = r5.bufferSize
                boolean r4 = r5.delayError
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r3 = io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast.createWith(r1, r3, r5, r4)
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast<K, V>> r1 = r5.groups
                r1.put(r2, r3)
                java.util.concurrent.atomic.AtomicInteger r1 = r5.groupCount
                r1.getAndIncrement()
                r1 = 1
                goto L3b
            L3a:
                r1 = 0
            L3b:
                io.reactivex.functions.Function<? super T, ? extends V> r2 = r5.valueSelector     // Catch: java.lang.Throwable -> L56
                java.lang.Object r6 = r2.apply(r6)     // Catch: java.lang.Throwable -> L56
                java.lang.String r2 = "The valueSelector returned null"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r2)     // Catch: java.lang.Throwable -> L56
                r3.onNext(r6)
                r5.completeEvictions()
                if (r1 == 0) goto L55
                r0.offer(r3)
                r5.drain()
            L55:
                return
            L56:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                org.reactivestreams.Subscription r0 = r5.f262s
                r0.cancel()
                r5.onError(r6)
                return
            L63:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                org.reactivestreams.Subscription r0 = r5.f262s
                r0.cancel()
                r5.onError(r6)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f262s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L15
                r2.f262s = r3
                org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.bufferSize
                long r0 = (long) r0
                r3.request(r0)
            L15:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public io.reactivex.flowables.GroupedFlowable<K, V> poll() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r1.queue
                java.lang.Object r0 = r0.poll()
                io.reactivex.flowables.GroupedFlowable r0 = (io.reactivex.flowables.GroupedFlowable) r0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                io.reactivex.flowables.GroupedFlowable r0 = r1.poll()
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }
    }

    static final class GroupedUnicast<K, T> extends io.reactivex.flowables.GroupedFlowable<K, T> {
        final io.reactivex.internal.operators.flowable.FlowableGroupBy.State<T, K> state;

        protected GroupedUnicast(K r1, io.reactivex.internal.operators.flowable.FlowableGroupBy.State<T, K> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.state = r2
                return
        }

        public static <T, K> io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, T> createWith(K r1, int r2, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> r3, boolean r4) {
                io.reactivex.internal.operators.flowable.FlowableGroupBy$State r0 = new io.reactivex.internal.operators.flowable.FlowableGroupBy$State
                r0.<init>(r2, r3, r1, r4)
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast r2 = new io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupedUnicast
                r2.<init>(r1, r0)
                return r2
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupBy$State<T, K> r0 = r1.state
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupBy$State<T, K> r0 = r1.state
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupBy$State<T, K> r0 = r1.state
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableGroupBy$State<T, K> r0 = r1.state
                r0.subscribe(r2)
                return
        }
    }

    static final class State<T, K> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements org.reactivestreams.Publisher<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> actual;
        final java.util.concurrent.atomic.AtomicBoolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final K key;
        final java.util.concurrent.atomic.AtomicBoolean once;
        boolean outputFused;
        final io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> parent;
        int produced;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        State(int r2, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> r3, K r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.cancelled = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.actual = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0.<init>(r2)
                r1.queue = r0
                r1.parent = r3
                r1.key = r4
                r1.delayError = r5
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L11
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber<?, K, T> r0 = r3.parent
                K r1 = r3.key
                r0.cancel(r1)
            L11:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<? super T> r5, boolean r6) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.cancelled
                boolean r0 = r0.get()
                r1 = 1
                if (r0 == 0) goto Lf
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3 = r2.queue
                r3.clear()
                return r1
            Lf:
                if (r3 == 0) goto L34
                if (r6 == 0) goto L21
                if (r4 == 0) goto L34
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L1d
                r5.onError(r3)
                goto L20
            L1d:
                r5.onComplete()
            L20:
                return r1
            L21:
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L2e
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r4 = r2.queue
                r4.clear()
                r5.onError(r3)
                return r1
            L2e:
                if (r4 == 0) goto L34
                r5.onComplete()
                return r1
            L34:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r1.outputFused
                if (r0 == 0) goto Lf
                r1.drainFused()
                goto L12
            Lf:
                r1.drainNormal()
            L12:
                return
        }

        void drainFused() {
                r5 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r5.queue
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r1 = r5.actual
                java.lang.Object r1 = r1.get()
                org.reactivestreams.Subscriber r1 = (org.reactivestreams.Subscriber) r1
                r2 = 1
            Lb:
                if (r1 == 0) goto L3e
                java.util.concurrent.atomic.AtomicBoolean r3 = r5.cancelled
                boolean r3 = r3.get()
                if (r3 == 0) goto L19
                r0.clear()
                return
            L19:
                boolean r3 = r5.done
                if (r3 == 0) goto L2c
                boolean r4 = r5.delayError
                if (r4 != 0) goto L2c
                java.lang.Throwable r4 = r5.error
                if (r4 == 0) goto L2c
                r0.clear()
                r1.onError(r4)
                return
            L2c:
                r4 = 0
                r1.onNext(r4)
                if (r3 == 0) goto L3e
                java.lang.Throwable r0 = r5.error
                if (r0 == 0) goto L3a
                r1.onError(r0)
                goto L3d
            L3a:
                r1.onComplete()
            L3d:
                return
            L3e:
                int r2 = -r2
                int r2 = r5.addAndGet(r2)
                if (r2 != 0) goto L46
                return
            L46:
                if (r1 != 0) goto Lb
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r1 = r5.actual
                java.lang.Object r1 = r1.get()
                org.reactivestreams.Subscriber r1 = (org.reactivestreams.Subscriber) r1
                goto Lb
        }

        void drainNormal() {
                r15 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r15.queue
                boolean r1 = r15.delayError
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r2 = r15.actual
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscriber r2 = (org.reactivestreams.Subscriber) r2
                r3 = 1
                r4 = r3
            Le:
                if (r2 == 0) goto L62
                java.util.concurrent.atomic.AtomicLong r5 = r15.requested
                long r5 = r5.get()
                r7 = 0
                r9 = r7
            L19:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r11 == 0) goto L39
                boolean r12 = r15.done
                java.lang.Object r13 = r0.poll()
                if (r13 != 0) goto L27
                r14 = r3
                goto L28
            L27:
                r14 = 0
            L28:
                boolean r12 = r15.checkTerminated(r12, r14, r2, r1)
                if (r12 == 0) goto L2f
                return
            L2f:
                if (r14 == 0) goto L32
                goto L39
            L32:
                r2.onNext(r13)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L39:
                if (r11 != 0) goto L48
                boolean r11 = r15.done
                boolean r12 = r0.isEmpty()
                boolean r11 = r15.checkTerminated(r11, r12, r2, r1)
                if (r11 == 0) goto L48
                return
            L48:
                int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r7 == 0) goto L62
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L5b
                java.util.concurrent.atomic.AtomicLong r5 = r15.requested
                long r6 = -r9
                r5.addAndGet(r6)
            L5b:
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber<?, K, T> r5 = r15.parent
                org.reactivestreams.Subscription r5 = r5.f262s
                r5.request(r9)
            L62:
                int r4 = -r4
                int r4 = r15.addAndGet(r4)
                if (r4 != 0) goto L6a
                return
            L6a:
                if (r2 != 0) goto Le
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r2 = r15.actual
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscriber r2 = (org.reactivestreams.Subscriber) r2
                goto Le
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r4 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r4.queue
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto Lf
                int r1 = r4.produced
                int r1 = r1 + 1
                r4.produced = r1
                return r0
            Lf:
                int r0 = r4.produced
                if (r0 == 0) goto L1e
                r1 = 0
                r4.produced = r1
                io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber<?, K, T> r1 = r4.parent
                org.reactivestreams.Subscription r1 = r1.f262s
                long r2 = (long) r0
                r1.request(r2)
            L1e:
                r0 = 0
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L16
                r4.onSubscribe(r3)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> r0 = r3.actual
                r0.lazySet(r4)
                r3.drain()
                goto L20
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Only one Subscriber allowed!"
                r0.<init>(r1)
                io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
            L20:
                return
        }
    }

    public FlowableGroupBy(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, int r4, boolean r5, io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> r6) {
            r0 = this;
            r0.<init>(r1)
            r0.keySelector = r2
            r0.valueSelector = r3
            r0.bufferSize = r4
            r0.delayError = r5
            r0.mapFactory = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> r11) {
            r10 = this;
            io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> r0 = r10.mapFactory     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto Ld
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Exception -> L35
            r0.<init>()     // Catch: java.lang.Exception -> L35
            r1 = 0
        La:
            r8 = r0
            r9 = r1
            goto L20
        Ld:
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch: java.lang.Exception -> L35
            r1.<init>()     // Catch: java.lang.Exception -> L35
            io.reactivex.internal.operators.flowable.FlowableGroupBy$EvictionAction r0 = new io.reactivex.internal.operators.flowable.FlowableGroupBy$EvictionAction     // Catch: java.lang.Exception -> L35
            r0.<init>(r1)     // Catch: java.lang.Exception -> L35
            io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> r2 = r10.mapFactory     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r2.apply(r0)     // Catch: java.lang.Exception -> L35
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L35
            goto La
        L20:
            io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableGroupBy$GroupBySubscriber
            io.reactivex.functions.Function<? super T, ? extends K> r4 = r10.keySelector
            io.reactivex.functions.Function<? super T, ? extends V> r5 = r10.valueSelector
            int r6 = r10.bufferSize
            boolean r7 = r10.delayError
            r2 = r0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            io.reactivex.Flowable<T> r11 = r10.source
            r11.subscribe(r0)
            return
        L35:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.util.EmptyComponent r1 = io.reactivex.internal.util.EmptyComponent.INSTANCE
            r11.onSubscribe(r1)
            r11.onError(r0)
            return
    }
}
