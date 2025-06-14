package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableWindow<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    static final class WindowExactSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> actual;
        final int bufferSize;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;

        /* renamed from: s */
        org.reactivestreams.Subscription f321s;
        final long size;
        io.reactivex.processors.UnicastProcessor<T> window;

        WindowExactSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, int r5) {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                r1.actual = r2
                r1.size = r3
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.once = r2
                r1.bufferSize = r5
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto Ld
                r3.run()
            Ld:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.processors.UnicastProcessor<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onComplete()
            La:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.processors.UnicastProcessor<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onError(r3)
            La:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r8) {
                r7 = this;
                long r0 = r7.index
                io.reactivex.processors.UnicastProcessor<T> r2 = r7.window
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L1a
                r7.getAndIncrement()
                int r2 = r7.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2, r7)
                r7.window = r2
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r5 = r7.actual
                r5.onNext(r2)
            L1a:
                r5 = 1
                long r0 = r0 + r5
                r2.onNext(r8)
                long r5 = r7.size
                int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r8 != 0) goto L2f
                r7.index = r3
                r8 = 0
                r7.window = r8
                r2.onComplete()
                goto L31
            L2f:
                r7.index = r0
            L31:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f321s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f321s = r2
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r3)
                if (r0 == 0) goto L11
                long r0 = r2.size
                long r3 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r0, r3)
                org.reactivestreams.Subscription r0 = r2.f321s
                r0.request(r3)
            L11:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                int r0 = r1.decrementAndGet()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscription r0 = r1.f321s
                r0.cancel()
            Lb:
                return
        }
    }

    static final class WindowOverlapSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> actual;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicBoolean firstRequest;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;
        long produced;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f322s;
        final long size;
        final long skip;
        final java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> windows;
        final java.util.concurrent.atomic.AtomicInteger wip;

        WindowOverlapSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, long r5, int r7) {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                r1.actual = r2
                r1.size = r3
                r1.skip = r5
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r7)
                r1.queue = r2
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>()
                r1.windows = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.once = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.firstRequest = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.wip = r2
                r1.bufferSize = r7
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                r0 = 1
                r3.cancelled = r0
                java.util.concurrent.atomic.AtomicBoolean r1 = r3.once
                r2 = 0
                boolean r0 = r1.compareAndSet(r2, r0)
                if (r0 == 0) goto Lf
                r3.run()
            Lf:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<?> r5, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r6) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r6.clear()
                return r1
            L9:
                if (r3 == 0) goto L1c
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L16
                r6.clear()
                r5.onError(r3)
                return r1
            L16:
                if (r4 == 0) goto L1c
                r5.onComplete()
                return r1
            L1c:
                r3 = 0
                return r3
        }

        void drain() {
                r14 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r14.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r14.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> r1 = r14.queue
                r2 = 1
                r3 = r2
            Lf:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L18:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L3a
                boolean r11 = r14.done
                java.lang.Object r12 = r1.poll()
                io.reactivex.processors.UnicastProcessor r12 = (io.reactivex.processors.UnicastProcessor) r12
                if (r12 != 0) goto L28
                r13 = r2
                goto L29
            L28:
                r13 = 0
            L29:
                boolean r11 = r14.checkTerminated(r11, r13, r0, r1)
                if (r11 == 0) goto L30
                return
            L30:
                if (r13 == 0) goto L33
                goto L3a
            L33:
                r0.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L18
            L3a:
                if (r10 != 0) goto L49
                boolean r10 = r14.done
                boolean r11 = r1.isEmpty()
                boolean r10 = r14.checkTerminated(r10, r11, r0, r1)
                if (r10 == 0) goto L49
                return
            L49:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L5c
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L5c
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L5c:
                java.util.concurrent.atomic.AtomicInteger r4 = r14.wip
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Lf
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.windows
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                org.reactivestreams.Processor r1 = (org.reactivestreams.Processor) r1
                r1.onComplete()
                goto Lb
            L1b:
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.windows
                r0.clear()
                r0 = 1
                r2.done = r0
                r2.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.windows
                java.util.Iterator r0 = r0.iterator()
            Le:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1e
                java.lang.Object r1 = r0.next()
                org.reactivestreams.Processor r1 = (org.reactivestreams.Processor) r1
                r1.onError(r3)
                goto Le
            L1e:
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.windows
                r0.clear()
                r2.error = r3
                r3 = 1
                r2.done = r3
                r2.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r9) {
                r8 = this;
                boolean r0 = r8.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r8.index
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L27
                boolean r4 = r8.cancelled
                if (r4 != 0) goto L27
                r8.getAndIncrement()
                int r4 = r8.bufferSize
                io.reactivex.processors.UnicastProcessor r4 = io.reactivex.processors.UnicastProcessor.create(r4, r8)
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r5 = r8.windows
                r5.offer(r4)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> r5 = r8.queue
                r5.offer(r4)
                r8.drain()
            L27:
                r4 = 1
                long r0 = r0 + r4
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r6 = r8.windows
                java.util.Iterator r6 = r6.iterator()
            L30:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L40
                java.lang.Object r7 = r6.next()
                org.reactivestreams.Processor r7 = (org.reactivestreams.Processor) r7
                r7.onNext(r9)
                goto L30
            L40:
                long r6 = r8.produced
                long r6 = r6 + r4
                long r4 = r8.size
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 != 0) goto L5c
                long r4 = r8.skip
                long r6 = r6 - r4
                r8.produced = r6
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r9 = r8.windows
                java.lang.Object r9 = r9.poll()
                org.reactivestreams.Processor r9 = (org.reactivestreams.Processor) r9
                if (r9 == 0) goto L5e
                r9.onComplete()
                goto L5e
            L5c:
                r8.produced = r6
            L5e:
                long r4 = r8.skip
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 != 0) goto L67
                r8.index = r2
                goto L69
            L67:
                r8.index = r0
            L69:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f322s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f322s = r2
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r5) {
                r4 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r5)
                if (r0 == 0) goto L40
                java.util.concurrent.atomic.AtomicLong r0 = r4.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r5)
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.firstRequest
                boolean r0 = r0.get()
                if (r0 != 0) goto L32
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.firstRequest
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L32
                long r0 = r4.skip
                r2 = 1
                long r5 = r5 - r2
                long r5 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r0, r5)
                long r0 = r4.size
                long r5 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r5)
                org.reactivestreams.Subscription r0 = r4.f322s
                r0.request(r5)
                goto L3d
            L32:
                long r0 = r4.skip
                long r5 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r0, r5)
                org.reactivestreams.Subscription r0 = r4.f322s
                r0.request(r5)
            L3d:
                r4.drain()
            L40:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                int r0 = r1.decrementAndGet()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscription r0 = r1.f322s
                r0.cancel()
            Lb:
                return
        }
    }

    static final class WindowSkipSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> actual;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicBoolean firstRequest;
        long index;
        final java.util.concurrent.atomic.AtomicBoolean once;

        /* renamed from: s */
        org.reactivestreams.Subscription f323s;
        final long size;
        final long skip;
        io.reactivex.processors.UnicastProcessor<T> window;

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, long r5, int r7) {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                r1.actual = r2
                r1.size = r3
                r1.skip = r5
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.once = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r2.<init>()
                r1.firstRequest = r2
                r1.bufferSize = r7
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto Ld
                r3.run()
            Ld:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.processors.UnicastProcessor<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onComplete()
            La:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.processors.UnicastProcessor<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onError(r3)
            La:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r8) {
                r7 = this;
                long r0 = r7.index
                io.reactivex.processors.UnicastProcessor<T> r2 = r7.window
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 != 0) goto L1a
                r7.getAndIncrement()
                int r2 = r7.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2, r7)
                r7.window = r2
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r5 = r7.actual
                r5.onNext(r2)
            L1a:
                r5 = 1
                long r0 = r0 + r5
                if (r2 == 0) goto L22
                r2.onNext(r8)
            L22:
                long r5 = r7.size
                int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r8 != 0) goto L2e
                r8 = 0
                r7.window = r8
                r2.onComplete()
            L2e:
                long r5 = r7.skip
                int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r8 != 0) goto L37
                r7.index = r3
                goto L39
            L37:
                r7.index = r0
            L39:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f323s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f323s = r2
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r7) {
                r6 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r7)
                if (r0 == 0) goto L3f
                java.util.concurrent.atomic.AtomicBoolean r0 = r6.firstRequest
                boolean r0 = r0.get()
                if (r0 != 0) goto L34
                java.util.concurrent.atomic.AtomicBoolean r0 = r6.firstRequest
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L34
                long r0 = r6.size
                long r0 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r0, r7)
                long r2 = r6.skip
                long r4 = r6.size
                long r2 = r2 - r4
                r4 = 1
                long r7 = r7 - r4
                long r7 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r2, r7)
                long r7 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r7)
                org.reactivestreams.Subscription r0 = r6.f323s
                r0.request(r7)
                goto L3f
            L34:
                long r0 = r6.skip
                long r7 = io.reactivex.internal.util.BackpressureHelper.multiplyCap(r0, r7)
                org.reactivestreams.Subscription r0 = r6.f323s
                r0.request(r7)
            L3f:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                int r0 = r1.decrementAndGet()
                if (r0 != 0) goto Lb
                org.reactivestreams.Subscription r0 = r1.f323s
                r0.cancel()
            Lb:
                return
        }
    }

    public FlowableWindow(io.reactivex.Flowable<T> r1, long r2, long r4, int r6) {
            r0 = this;
            r0.<init>(r1)
            r0.size = r2
            r0.skip = r4
            r0.bufferSize = r6
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r10) {
            r9 = this;
            long r0 = r9.skip
            long r2 = r9.size
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L17
            io.reactivex.Flowable<T> r0 = r9.source
            io.reactivex.internal.operators.flowable.FlowableWindow$WindowExactSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWindow$WindowExactSubscriber
            long r2 = r9.size
            int r4 = r9.bufferSize
            r1.<init>(r10, r2, r4)
            r0.subscribe(r1)
            goto L40
        L17:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2e
            io.reactivex.Flowable<T> r0 = r9.source
            io.reactivex.internal.operators.flowable.FlowableWindow$WindowSkipSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableWindow$WindowSkipSubscriber
            long r3 = r9.size
            long r5 = r9.skip
            int r7 = r9.bufferSize
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r7)
            r0.subscribe(r8)
            goto L40
        L2e:
            io.reactivex.Flowable<T> r0 = r9.source
            io.reactivex.internal.operators.flowable.FlowableWindow$WindowOverlapSubscriber r8 = new io.reactivex.internal.operators.flowable.FlowableWindow$WindowOverlapSubscriber
            long r3 = r9.size
            long r5 = r9.skip
            int r7 = r9.bufferSize
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r7)
            r0.subscribe(r8)
        L40:
            return
    }
}
