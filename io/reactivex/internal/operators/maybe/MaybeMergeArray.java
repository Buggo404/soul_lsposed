package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeMergeArray<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] sources;

    static final class ClqSimpleQueue<T> extends java.util.concurrent.ConcurrentLinkedQueue<T> implements io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        int consumerIndex;
        final java.util.concurrent.atomic.AtomicInteger producerIndex;

        ClqSimpleQueue() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.producerIndex = r0
                return
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
                r1 = this;
                int r0 = r1.consumerIndex
                return r0
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
                r0 = this;
                r0.poll()
                return
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.producerIndex
                r0.getAndIncrement()
                boolean r2 = super.offer(r2)
                return r2
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r1, T r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r2 = this;
                java.lang.Object r0 = super.poll()
                if (r0 == 0) goto Lc
                int r1 = r2.consumerIndex
                int r1 = r1 + 1
                r2.consumerIndex = r1
            Lc:
                return r0
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.producerIndex
                int r0 = r0.get()
                return r0
        }
    }

    static final class MergeMaybeObserver<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        long consumed;
        final io.reactivex.internal.util.AtomicThrowable error;
        boolean outputFused;
        final io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.disposables.CompositeDisposable set;
        final int sourceCount;

        MergeMaybeObserver(org.reactivestreams.Subscriber<? super T> r1, int r2, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sourceCount = r2
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                r0.queue = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r1.queue
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
                r6 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r1 = r6.queue
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r6.cancelled
                if (r4 == 0) goto Le
                r1.clear()
                return
            Le:
                io.reactivex.internal.util.AtomicThrowable r4 = r6.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L1f
                r1.clear()
                r0.onError(r4)
                return
            L1f:
                int r4 = r1.producerIndex()
                int r5 = r6.sourceCount
                if (r4 != r5) goto L29
                r4 = r2
                goto L2a
            L29:
                r4 = 0
            L2a:
                boolean r5 = r1.isEmpty()
                if (r5 != 0) goto L34
                r5 = 0
                r0.onNext(r5)
            L34:
                if (r4 == 0) goto L3a
                r0.onComplete()
                return
            L3a:
                int r3 = -r3
                int r3 = r6.addAndGet(r3)
                if (r3 != 0) goto L6
                return
        }

        void drainNormal() {
                r10 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r10.actual
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r1 = r10.queue
                long r2 = r10.consumed
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r10.requested
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L4e
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L19
                r1.clear()
                return
            L19:
                io.reactivex.internal.util.AtomicThrowable r8 = r10.error
                java.lang.Object r8 = r8.get()
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                if (r8 == 0) goto L30
                r1.clear()
                io.reactivex.internal.util.AtomicThrowable r1 = r10.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L30:
                int r8 = r1.consumerIndex()
                int r9 = r10.sourceCount
                if (r8 != r9) goto L3c
                r0.onComplete()
                return
            L3c:
                java.lang.Object r8 = r1.poll()
                if (r8 != 0) goto L43
                goto L4e
            L43:
                io.reactivex.internal.util.NotificationLite r7 = io.reactivex.internal.util.NotificationLite.COMPLETE
                if (r8 == r7) goto Ld
                r0.onNext(r8)
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L4e:
                if (r7 != 0) goto L7f
                io.reactivex.internal.util.AtomicThrowable r5 = r10.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L67
                r1.clear()
                io.reactivex.internal.util.AtomicThrowable r1 = r10.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L67:
                java.lang.Object r5 = r1.peek()
                io.reactivex.internal.util.NotificationLite r6 = io.reactivex.internal.util.NotificationLite.COMPLETE
                if (r5 != r6) goto L73
                r1.drop()
                goto L67
            L73:
                int r5 = r1.consumerIndex()
                int r6 = r10.sourceCount
                if (r5 != r6) goto L7f
                r0.onComplete()
                return
            L7f:
                r10.consumed = r2
                int r4 = -r4
                int r4 = r10.addAndGet(r4)
                if (r4 != 0) goto L7
                return
        }

        boolean isCancelled() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r2.queue
                io.reactivex.internal.util.NotificationLite r1 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r0.offer(r1)
                r2.drain()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L18
                io.reactivex.disposables.CompositeDisposable r2 = r1.set
                r2.dispose()
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r2 = r1.queue
                io.reactivex.internal.util.NotificationLite r0 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r2.offer(r0)
                r1.drain()
                goto L1b
            L18:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1b:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
            L0:
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r0 = r2.queue
                java.lang.Object r0 = r0.poll()
                io.reactivex.internal.util.NotificationLite r1 = io.reactivex.internal.util.NotificationLite.COMPLETE
                if (r0 == r1) goto L0
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

    static final class MpscFillOnceSimpleQueue<T> extends java.util.concurrent.atomic.AtomicReferenceArray<T> implements io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        int consumerIndex;
        final java.util.concurrent.atomic.AtomicInteger producerIndex;

        MpscFillOnceSimpleQueue(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.producerIndex = r1
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
            L0:
                java.lang.Object r0 = r1.poll()
                if (r0 == 0) goto Ld
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Ld
                goto L0
            Ld:
                return
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
                r1 = this;
                int r0 = r1.consumerIndex
                return r0
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
                r2 = this;
                int r0 = r2.consumerIndex
                r1 = 0
                r2.lazySet(r0, r1)
                int r0 = r0 + 1
                r2.consumerIndex = r0
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r2 = this;
                int r0 = r2.consumerIndex
                int r1 = r2.producerIndex()
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r3) {
                r2 = this;
                java.lang.String r0 = "value is null"
                io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
                java.util.concurrent.atomic.AtomicInteger r0 = r2.producerIndex
                int r0 = r0.getAndIncrement()
                int r1 = r2.length()
                if (r0 >= r1) goto L16
                r2.lazySet(r0, r3)
                r3 = 1
                return r3
            L16:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T r1, T r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public T peek() {
                r2 = this;
                int r0 = r2.consumerIndex
                int r1 = r2.length()
                if (r0 != r1) goto La
                r0 = 0
                return r0
            La:
                java.lang.Object r0 = r2.get(r0)
                return r0
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r4 = this;
                int r0 = r4.consumerIndex
                int r1 = r4.length()
                r2 = 0
                if (r0 != r1) goto La
                return r2
            La:
                java.util.concurrent.atomic.AtomicInteger r1 = r4.producerIndex
            Lc:
                java.lang.Object r3 = r4.get(r0)
                if (r3 == 0) goto L1a
                int r1 = r0 + 1
                r4.consumerIndex = r1
                r4.lazySet(r0, r2)
                return r3
            L1a:
                int r3 = r1.get()
                if (r3 != r0) goto Lc
                return r2
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.producerIndex
                int r0 = r0.get()
                return r0
        }
    }

    interface SimpleQueueWithConsumerIndex<T> extends io.reactivex.internal.fuseable.SimpleQueue<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        T poll();

        int producerIndex();
    }

    public MaybeMergeArray(io.reactivex.MaybeSource<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r7) {
            r6 = this;
            io.reactivex.MaybeSource<? extends T>[] r0 = r6.sources
            int r1 = r0.length
            int r2 = bufferSize()
            if (r1 > r2) goto Lf
            io.reactivex.internal.operators.maybe.MaybeMergeArray$MpscFillOnceSimpleQueue r2 = new io.reactivex.internal.operators.maybe.MaybeMergeArray$MpscFillOnceSimpleQueue
            r2.<init>(r1)
            goto L14
        Lf:
            io.reactivex.internal.operators.maybe.MaybeMergeArray$ClqSimpleQueue r2 = new io.reactivex.internal.operators.maybe.MaybeMergeArray$ClqSimpleQueue
            r2.<init>()
        L14:
            io.reactivex.internal.operators.maybe.MaybeMergeArray$MergeMaybeObserver r3 = new io.reactivex.internal.operators.maybe.MaybeMergeArray$MergeMaybeObserver
            r3.<init>(r7, r1, r2)
            r7.onSubscribe(r3)
            io.reactivex.internal.util.AtomicThrowable r7 = r3.error
            int r1 = r0.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L37
            r4 = r0[r2]
            boolean r5 = r3.isCancelled()
            if (r5 != 0) goto L37
            java.lang.Object r5 = r7.get()
            if (r5 == 0) goto L31
            goto L37
        L31:
            r4.subscribe(r3)
            int r2 = r2 + 1
            goto L20
        L37:
            return
    }
}
