package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableCombineLatest<T, R> extends io.reactivex.Flowable<R> {
    final org.reactivestreams.Publisher<? extends T>[] array;
    final int bufferSize;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
    final boolean delayErrors;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable;

    static final class CombineLatestCoordinator<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final java.lang.Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, int r5, boolean r6) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                r1.combiner = r3
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber[] r2 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber[r4]
                r3 = 0
            La:
                if (r3 >= r4) goto L16
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber
                r0.<init>(r1, r3, r5)
                r2[r3] = r0
                int r3 = r3 + 1
                goto La
            L16:
                r1.subscribers = r2
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r1.latest = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r5)
                r1.queue = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.error = r2
                r1.delayErrors = r6
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
                return
        }

        void cancelAll() {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] r0 = r4.subscribers
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

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<?> r5, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r6) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto Lc
                r2.cancelAll()
                r6.clear()
                return r1
            Lc:
                if (r3 == 0) goto L4a
                boolean r3 = r2.delayErrors
                if (r3 == 0) goto L2b
                if (r4 == 0) goto L4a
                r2.cancelAll()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r2.error
                java.lang.Throwable r3 = io.reactivex.internal.util.ExceptionHelper.terminate(r3)
                if (r3 == 0) goto L27
                java.lang.Throwable r4 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r3 == r4) goto L27
                r5.onError(r3)
                goto L2a
            L27:
                r5.onComplete()
            L2a:
                return r1
            L2b:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r2.error
                java.lang.Throwable r3 = io.reactivex.internal.util.ExceptionHelper.terminate(r3)
                if (r3 == 0) goto L41
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r3 == r0) goto L41
                r2.cancelAll()
                r6.clear()
                r5.onError(r3)
                return r1
            L41:
                if (r4 == 0) goto L4a
                r2.cancelAll()
                r5.onComplete()
                return r1
            L4a:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
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
                r1.drainOutput()
                goto L12
            Lf:
                r1.drainAsync()
            L12:
                return
        }

        void drainAsync() {
                r14 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r14.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r14.queue
                r2 = 1
                r3 = r2
            L6:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            Lf:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L5e
                boolean r11 = r14.done
                java.lang.Object r12 = r1.poll()
                if (r12 != 0) goto L1d
                r13 = r2
                goto L1e
            L1d:
                r13 = 0
            L1e:
                boolean r11 = r14.checkTerminated(r11, r13, r0, r1)
                if (r11 == 0) goto L25
                return
            L25:
                if (r13 == 0) goto L28
                goto L5e
            L28:
                java.lang.Object r10 = r1.poll()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r11 = r14.combiner     // Catch: java.lang.Throwable -> L48
                java.lang.Object r10 = r11.apply(r10)     // Catch: java.lang.Throwable -> L48
                java.lang.String r11 = "The combiner returned a null value"
                java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r11)     // Catch: java.lang.Throwable -> L48
                r0.onNext(r10)
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber r12 = (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) r12
                r12.requestOne()
                r10 = 1
                long r8 = r8 + r10
                goto Lf
            L48:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r14.cancelAll()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2 = r14.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r2, r1)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r1 = r14.error
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.terminate(r1)
                r0.onError(r1)
                return
            L5e:
                if (r10 != 0) goto L6d
                boolean r10 = r14.done
                boolean r11 = r1.isEmpty()
                boolean r10 = r14.checkTerminated(r10, r11, r0, r1)
                if (r10 == 0) goto L6d
                return
            L6d:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L80
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L80
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L80:
                int r3 = -r3
                int r3 = r14.addAndGet(r3)
                if (r3 != 0) goto L6
                return
        }

        void drainOutput() {
                r6 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r6.queue
                r2 = 1
            L5:
                boolean r3 = r6.cancelled
                if (r3 == 0) goto Ld
                r1.clear()
                return
            Ld:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r6.error
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L1e
                r1.clear()
                r0.onError(r3)
                return
            L1e:
                boolean r3 = r6.done
                boolean r4 = r1.isEmpty()
                if (r4 != 0) goto L2a
                r5 = 0
                r0.onNext(r5)
            L2a:
                if (r3 == 0) goto L32
                if (r4 == 0) goto L32
                r0.onComplete()
                return
            L32:
                int r2 = -r2
                int r2 = r6.addAndGet(r2)
                if (r2 != 0) goto L5
                return
        }

        void innerComplete(int r3) {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object[] r0 = r2.latest     // Catch: java.lang.Throwable -> L1c
                r3 = r0[r3]     // Catch: java.lang.Throwable -> L1c
                r1 = 1
                if (r3 == 0) goto L15
                int r3 = r2.completedSources     // Catch: java.lang.Throwable -> L1c
                int r3 = r3 + r1
                int r0 = r0.length     // Catch: java.lang.Throwable -> L1c
                if (r3 != r0) goto L11
                r2.done = r1     // Catch: java.lang.Throwable -> L1c
                goto L17
            L11:
                r2.completedSources = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                return
            L15:
                r2.done = r1     // Catch: java.lang.Throwable -> L1c
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                r2.drain()
                return
            L1c:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r3
        }

        void innerError(int r2, java.lang.Throwable r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r3)
                if (r0 == 0) goto L1a
                boolean r3 = r1.delayErrors
                if (r3 != 0) goto L16
                r1.cancelAll()
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1d
            L16:
                r1.innerComplete(r2)
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1d:
                return
        }

        void innerValue(int r4, T r5) {
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L31
                int r1 = r3.nonEmptySources     // Catch: java.lang.Throwable -> L31
                r2 = r0[r4]     // Catch: java.lang.Throwable -> L31
                if (r2 != 0) goto Ld
                int r1 = r1 + 1
                r3.nonEmptySources = r1     // Catch: java.lang.Throwable -> L31
            Ld:
                r0[r4] = r5     // Catch: java.lang.Throwable -> L31
                int r5 = r0.length     // Catch: java.lang.Throwable -> L31
                if (r5 != r1) goto L21
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r5 = r3.queue     // Catch: java.lang.Throwable -> L31
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] r1 = r3.subscribers     // Catch: java.lang.Throwable -> L31
                r1 = r1[r4]     // Catch: java.lang.Throwable -> L31
                java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L31
                r5.offer(r1, r0)     // Catch: java.lang.Throwable -> L31
                r5 = 0
                goto L22
            L21:
                r5 = 1
            L22:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L2d
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] r5 = r3.subscribers
                r4 = r5[r4]
                r4.requestOne()
                goto L30
            L2d:
                r3.drain()
            L30:
                return
            L31:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                throw r4
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r3.queue
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r3.queue
                java.lang.Object r1 = r1.poll()
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2 = r3.combiner
                java.lang.Object r1 = r2.apply(r1)
                java.lang.String r2 = "The combiner returned a null value"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) r0
                r0.requestOne()
                return r1
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
        public int requestFusion(int r3) {
                r2 = this;
                r0 = r3 & 4
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lb
                r1 = 1
            Lb:
                r2.outputFused = r1
                return r3
        }

        void subscribe(org.reactivestreams.Publisher<? extends T>[] r5, int r6) {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] r0 = r4.subscribers
                r1 = 0
            L3:
                if (r1 >= r6) goto L18
                boolean r2 = r4.done
                if (r2 != 0) goto L18
                boolean r2 = r4.cancelled
                if (r2 == 0) goto Le
                goto L18
            Le:
                r2 = r5[r1]
                r3 = r0[r1]
                r2.subscribe(r3)
                int r1 = r1 + 1
                goto L3
            L18:
                return
        }
    }

    static final class CombineLatestInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                r0.prefetch = r3
                int r1 = r3 >> 2
                int r3 = r3 - r1
                r0.limit = r3
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator<T, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerComplete(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator<T, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r1, r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator<T, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerValue(r1, r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                int r0 = r2.prefetch
                long r0 = (long) r0
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }

        public void requestOne() {
                r4 = this;
                int r0 = r4.produced
                int r0 = r0 + 1
                int r1 = r4.limit
                if (r0 != r1) goto L16
                r1 = 0
                r4.produced = r1
                java.lang.Object r1 = r4.get()
                org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
                long r2 = (long) r0
                r1.request(r2)
                goto L18
            L16:
                r4.produced = r0
            L18:
                return
        }
    }

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableCombineLatest this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.flowable.FlowableCombineLatest r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = r3.this$0
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r0.combiner
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                return r4
        }
    }

    public FlowableCombineLatest(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.array = r0
            r1.iterable = r2
            r1.combiner = r3
            r1.bufferSize = r4
            r1.delayErrors = r5
            return
    }

    public FlowableCombineLatest(org.reactivestreams.Publisher<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r1 = 0
            r0.iterable = r1
            r0.combiner = r2
            r0.bufferSize = r3
            r0.delayErrors = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r10) {
            r9 = this;
            org.reactivestreams.Publisher<? extends T>[] r0 = r9.array
            r1 = 0
            if (r0 != 0) goto L55
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2 = r9.iterable     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "The iterator returned is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r2 = (java.util.Iterator) r2     // Catch: java.lang.Throwable -> L4d
            r3 = r1
        L18:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L1f
            goto L56
        L1f:
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "The publisher returned by the iterator is null"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L3d
            org.reactivestreams.Publisher r4 = (org.reactivestreams.Publisher) r4     // Catch: java.lang.Throwable -> L3d
            int r5 = r0.length
            if (r3 != r5) goto L37
            int r5 = r3 >> 2
            int r5 = r5 + r3
            org.reactivestreams.Publisher[] r5 = new org.reactivestreams.Publisher[r5]
            java.lang.System.arraycopy(r0, r1, r5, r1, r3)
            r0 = r5
        L37:
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
            goto L18
        L3d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r10)
            return
        L45:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r10)
            return
        L4d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r10)
            return
        L55:
            int r3 = r0.length
        L56:
            r8 = r3
            if (r8 != 0) goto L5d
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r10)
            return
        L5d:
            r2 = 1
            if (r8 != r2) goto L70
            r0 = r0[r1]
            io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber
            io.reactivex.internal.operators.flowable.FlowableCombineLatest$SingletonArrayFunc r2 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest$SingletonArrayFunc
            r2.<init>(r9)
            r1.<init>(r10, r2)
            r0.subscribe(r1)
            return
        L70:
            io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator r1 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest$CombineLatestCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4 = r9.combiner
            int r6 = r9.bufferSize
            boolean r7 = r9.delayErrors
            r2 = r1
            r3 = r10
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r10.onSubscribe(r1)
            r1.subscribe(r0, r8)
            return
    }
}
