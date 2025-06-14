package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
    final int maxConcurrency;

    static final class InnerSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id */
        final long f253id;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> parent;
        long produced;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> queue;

        InnerSubscriber(io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.f253id = r2
                r0.parent = r1
                int r1 = r1.bufferSize
                r0.bufferSize = r1
                int r1 = r1 >> 2
                r0.limit = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto La
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
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.lazySet(r0)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r1.parent
                r0.innerError(r1, r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U r3) {
                r2 = this;
                int r0 = r2.fusionMode
                r1 = 2
                if (r0 == r1) goto Lb
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r0 = r2.parent
                r0.tryEmit(r3, r2)
                goto L10
            Lb:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r3 = r2.parent
                r3.drain()
            L10:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
                if (r0 == 0) goto L2e
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L28
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 7
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.fusionMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber<T, U> r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L28
                r3.fusionMode = r1
                r3.queue = r0
            L28:
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
            L2e:
                return
        }

        void requestMore(long r3) {
                r2 = this;
                int r0 = r2.fusionMode
                r1 = 1
                if (r0 == r1) goto L1f
                long r0 = r2.produced
                long r0 = r0 + r3
                int r3 = r2.limit
                long r3 = (long) r3
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 < 0) goto L1d
                r3 = 0
                r2.produced = r3
                java.lang.Object r3 = r2.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r3.request(r0)
                goto L1f
            L1d:
                r2.produced = r0
            L1f:
                return
        }
    }

    static final class MergeSubscriber<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] CANCELLED = null;
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        final org.reactivestreams.Subscriber<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable errs;
        long lastId;
        int lastIndex;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;
        final int maxConcurrency;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        org.reactivestreams.Subscription upstream;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED = r0
                return
        }

        MergeSubscriber(org.reactivestreams.Subscriber<? super U> r3, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r4, boolean r5, int r6, int r7) {
                r2 = this;
                r2.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r2.errs = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.subscribers = r0
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r2.requested = r1
                r2.actual = r3
                r2.mapper = r4
                r2.delayErrors = r5
                r2.maxConcurrency = r6
                r2.bufferSize = r7
                r3 = 1
                int r4 = r6 >> 1
                int r3 = java.lang.Math.max(r3, r4)
                r2.scalarLimit = r3
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r3 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY
                r0.lazySet(r3)
                return
        }

        boolean addInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                r2 = 0
                if (r0 != r1) goto L11
                r5.dispose()
                return r2
            L11:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r3 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r1 = r4.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                r1.disposeAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                if (r0 == 0) goto L1c
                r0.clear()
            L1c:
                return
        }

        boolean checkTerminate() {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 1
                if (r0 == 0) goto L9
                r3.clearScalarQueue()
                return r1
            L9:
                boolean r0 = r3.delayErrors
                if (r0 != 0) goto L28
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errs
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L28
                r3.clearScalarQueue()
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errs
                java.lang.Throwable r0 = r0.terminate()
                java.lang.Throwable r2 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r2) goto L27
                org.reactivestreams.Subscriber<? super U> r2 = r3.actual
                r2.onError(r0)
            L27:
                return r1
            L28:
                r0 = 0
                return r0
        }

        void clearScalarQueue() {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                return
        }

        void disposeAll() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                if (r0 == r1) goto L31
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
                if (r0 == r1) goto L31
                int r1 = r0.length
                r2 = 0
            L18:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L18
            L22:
                io.reactivex.internal.util.AtomicThrowable r0 = r4.errs
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L31
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r1) goto L31
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L31:
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r24 = this;
                r1 = r24
                org.reactivestreams.Subscriber<? super U> r2 = r1.actual
                r4 = 1
            L5:
                boolean r0 = r24.checkTerminate()
                if (r0 == 0) goto Lc
                return
            Lc:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L1f
                r9 = 1
                goto L20
            L1f:
                r9 = 0
            L20:
                r12 = 1
                r14 = 0
                r16 = r14
                if (r0 == 0) goto L69
            L28:
                r7 = r14
                r18 = 0
            L2b:
                int r19 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r19 == 0) goto L49
                java.lang.Object r10 = r0.poll()
                boolean r18 = r24.checkTerminate()
                if (r18 == 0) goto L3a
                return
            L3a:
                if (r10 != 0) goto L3f
                r18 = r10
                goto L49
            L3f:
                r2.onNext(r10)
                long r16 = r16 + r12
                long r7 = r7 + r12
                long r5 = r5 - r12
                r18 = r10
                goto L2b
            L49:
                int r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r10 == 0) goto L5c
                if (r9 == 0) goto L55
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L5c
            L55:
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r6 = -r7
                long r5 = r5.addAndGet(r6)
            L5c:
                int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r7 == 0) goto L69
                if (r18 != 0) goto L63
                goto L69
            L63:
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L28
            L69:
                boolean r0 = r1.done
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r7 = r1.queue
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r8 = r1.subscribers
                java.lang.Object r8 = r8.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r8 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r8
                int r10 = r8.length
                if (r0 == 0) goto L96
                if (r7 == 0) goto L80
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto L96
            L80:
                if (r10 != 0) goto L96
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errs
                java.lang.Throwable r0 = r0.terminate()
                java.lang.Throwable r3 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r0 == r3) goto L95
                if (r0 != 0) goto L92
                r2.onComplete()
                goto L95
            L92:
                r2.onError(r0)
            L95:
                return
            L96:
                r18 = r4
                if (r10 == 0) goto L19f
                long r3 = r1.lastId
                int r0 = r1.lastIndex
                if (r10 <= r0) goto La8
                r7 = r8[r0]
                long r11 = r7.f253id
                int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r7 == 0) goto Lc7
            La8:
                if (r10 > r0) goto Lab
                r0 = 0
            Lab:
                r7 = 0
            Lac:
                if (r7 >= r10) goto Lbf
                r11 = r8[r0]
                long r11 = r11.f253id
                int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r11 != 0) goto Lb7
                goto Lbf
            Lb7:
                int r0 = r0 + 1
                if (r0 != r10) goto Lbc
                r0 = 0
            Lbc:
                int r7 = r7 + 1
                goto Lac
            Lbf:
                r1.lastIndex = r0
                r3 = r8[r0]
                long r3 = r3.f253id
                r1.lastId = r3
            Lc7:
                r3 = r0
                r0 = 0
                r4 = 0
            Lca:
                if (r4 >= r10) goto L190
                boolean r7 = r24.checkTerminate()
                if (r7 == 0) goto Ld3
                return
            Ld3:
                r7 = r8[r3]
                r11 = 0
            Ld6:
                boolean r12 = r24.checkTerminate()
                if (r12 == 0) goto Ldd
                return
            Ldd:
                io.reactivex.internal.fuseable.SimpleQueue<U> r12 = r7.queue
                if (r12 != 0) goto Le4
                r13 = r10
                goto L15b
            Le4:
                r13 = r10
                r22 = r11
                r10 = r14
            Le8:
                int r23 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r23 == 0) goto L133
                java.lang.Object r14 = r12.poll()     // Catch: java.lang.Throwable -> L10c
                if (r14 != 0) goto Lf7
                r22 = r14
                r14 = 0
                goto L133
            Lf7:
                r2.onNext(r14)
                boolean r15 = r24.checkTerminate()
                if (r15 == 0) goto L101
                return
            L101:
                r20 = 1
                long r5 = r5 - r20
                long r10 = r10 + r20
                r22 = r14
                r14 = 0
                goto Le8
            L10c:
                r0 = move-exception
                r10 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r7.dispose()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errs
                r0.addThrowable(r10)
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L122
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
            L122:
                boolean r0 = r24.checkTerminate()
                if (r0 == 0) goto L129
                return
            L129:
                r1.removeInner(r7)
                int r4 = r4 + 1
                r0 = 1
                r7 = 1
                r10 = 1
                goto L18a
            L133:
                int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r12 == 0) goto L14c
                if (r9 != 0) goto L141
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r14 = -r10
                long r5 = r5.addAndGet(r14)
                goto L146
            L141:
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L146:
                r7.requestMore(r10)
                r10 = 0
                goto L14d
            L14c:
                r10 = r14
            L14d:
                int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r12 == 0) goto L15b
                if (r22 != 0) goto L154
                goto L15b
            L154:
                r10 = r13
                r11 = r22
                r14 = 0
                goto Ld6
            L15b:
                boolean r10 = r7.done
                io.reactivex.internal.fuseable.SimpleQueue<U> r11 = r7.queue
                if (r10 == 0) goto L179
                if (r11 == 0) goto L169
                boolean r10 = r11.isEmpty()
                if (r10 == 0) goto L179
            L169:
                r1.removeInner(r7)
                boolean r0 = r24.checkTerminate()
                if (r0 == 0) goto L173
                return
            L173:
                r10 = 1
                long r16 = r16 + r10
                r0 = 1
                goto L17b
            L179:
                r10 = 1
            L17b:
                r14 = 0
                int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r7 != 0) goto L184
                r10 = r0
                r7 = 1
                goto L192
            L184:
                int r3 = r3 + 1
                if (r3 != r13) goto L189
                r3 = 0
            L189:
                r7 = 1
            L18a:
                int r4 = r4 + r7
                r10 = r13
                r14 = 0
                goto Lca
            L190:
                r7 = 1
                r10 = r0
            L192:
                r1.lastIndex = r3
                r0 = r8[r3]
                long r3 = r0.f253id
                r1.lastId = r3
                r3 = r16
                r5 = 0
                goto L1a4
            L19f:
                r7 = 1
                r5 = r14
                r3 = r16
                r10 = 0
            L1a4:
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L1b1
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1b1
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.request(r3)
            L1b1:
                if (r10 == 0) goto L1b7
                r4 = r18
                goto L5
            L1b7:
                r3 = r18
                int r0 = -r3
                int r4 = r1.addAndGet(r0)
                if (r4 != 0) goto L5
                return
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getInnerQueue(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r3) {
                r2 = this;
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r3.queue
                if (r0 != 0) goto Ld
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                r3.queue = r0
            Ld:
                return r0
        }

        io.reactivex.internal.fuseable.SimpleQueue<U> getMainQueue() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                if (r0 != 0) goto L1c
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L13
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = r2.bufferSize
                r0.<init>(r1)
                goto L1a
            L13:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.maxConcurrency
                r0.<init>(r1)
            L1a:
                r2.queue = r0
            L1c:
                return r0
        }

        void innerError(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r3, java.lang.Throwable r4) {
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errs
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L2e
                r4 = 1
                r3.done = r4
                boolean r3 = r2.delayErrors
                if (r3 != 0) goto L2a
                org.reactivestreams.Subscription r3 = r2.upstream
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r3 = r2.subscribers
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r4 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.CANCELLED
                java.lang.Object r3 = r3.getAndSet(r4)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r3 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r3
                int r4 = r3.length
                r0 = 0
            L20:
                if (r0 >= r4) goto L2a
                r1 = r3[r0]
                r1.dispose()
                int r0 = r0 + 1
                goto L20
            L2a:
                r2.drain()
                goto L31
            L2e:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L31:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.drain()
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
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errs
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L17
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1a
            L17:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1a:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r0 = r5.mapper     // Catch: java.lang.Throwable -> L65
                java.lang.Object r6 = r0.apply(r6)     // Catch: java.lang.Throwable -> L65
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)     // Catch: java.lang.Throwable -> L65
                org.reactivestreams.Publisher r6 = (org.reactivestreams.Publisher) r6     // Catch: java.lang.Throwable -> L65
                boolean r0 = r6 instanceof java.util.concurrent.Callable
                if (r0 == 0) goto L4f
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6     // Catch: java.lang.Throwable -> L42
                java.lang.Object r6 = r6.call()     // Catch: java.lang.Throwable -> L42
                if (r6 == 0) goto L23
                r5.tryEmitScalar(r6)
                goto L64
            L23:
                int r6 = r5.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r0) goto L64
                boolean r6 = r5.cancelled
                if (r6 != 0) goto L64
                int r6 = r5.scalarEmitted
                int r6 = r6 + 1
                r5.scalarEmitted = r6
                int r0 = r5.scalarLimit
                if (r6 != r0) goto L64
                r6 = 0
                r5.scalarEmitted = r6
                org.reactivestreams.Subscription r6 = r5.upstream
                long r0 = (long) r0
                r6.request(r0)
                goto L64
            L42:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.internal.util.AtomicThrowable r0 = r5.errs
                r0.addThrowable(r6)
                r5.drain()
                return
            L4f:
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber
                long r1 = r5.uniqueId
                r3 = 1
                long r3 = r3 + r1
                r5.uniqueId = r3
                r0.<init>(r5, r1)
                boolean r1 = r5.addInner(r0)
                if (r1 == 0) goto L64
                r6.subscribe(r0)
            L64:
                return
            L65:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                org.reactivestreams.Subscription r0 = r5.upstream
                r0.cancel()
                r5.onError(r6)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L27
                r2.upstream = r3
                org.reactivestreams.Subscriber<? super U> r0 = r2.actual
                r0.onSubscribe(r2)
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L27
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L23
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                goto L27
            L23:
                long r0 = (long) r0
                r3.request(r0)
            L27:
                return
        }

        void removeInner(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[]) r0
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
                return
            L1c:
                r4 = 1
                if (r1 != r4) goto L22
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.EMPTY
                goto L31
            L22:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber[] r5 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L31:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap$InnerSubscriber<?, ?>[]> r2 = r6.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
                return
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

        void tryEmit(U r7, io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> r8) {
                r6 = this;
                int r0 = r6.get()
                java.lang.String r1 = "Inner queue full?!"
                if (r0 != 0) goto L5b
                r0 = 0
                r2 = 1
                boolean r0 = r6.compareAndSet(r0, r2)
                if (r0 == 0) goto L5b
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                long r2 = r0.get()
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r8.queue
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 == 0) goto L3f
                if (r0 == 0) goto L26
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L3f
            L26:
                org.reactivestreams.Subscriber<? super U> r0 = r6.actual
                r0.onNext(r7)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r7 == 0) goto L39
                java.util.concurrent.atomic.AtomicLong r7 = r6.requested
                r7.decrementAndGet()
            L39:
                r0 = 1
                r8.requestMore(r0)
                goto L54
            L3f:
                if (r0 != 0) goto L45
                io.reactivex.internal.fuseable.SimpleQueue r0 = r6.getInnerQueue(r8)
            L45:
                boolean r7 = r0.offer(r7)
                if (r7 != 0) goto L54
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                r7.<init>(r1)
                r6.onError(r7)
                return
            L54:
                int r7 = r6.decrementAndGet()
                if (r7 != 0) goto L7e
                return
            L5b:
                io.reactivex.internal.fuseable.SimpleQueue<U> r0 = r8.queue
                if (r0 != 0) goto L68
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r2 = r6.bufferSize
                r0.<init>(r2)
                r8.queue = r0
            L68:
                boolean r7 = r0.offer(r7)
                if (r7 != 0) goto L77
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                r7.<init>(r1)
                r6.onError(r7)
                return
            L77:
                int r7 = r6.getAndIncrement()
                if (r7 == 0) goto L7e
                return
            L7e:
                r6.drainLoop()
                return
        }

        void tryEmitScalar(U r9) {
                r8 = this;
                int r0 = r8.get()
                java.lang.String r1 = "Scalar queue full?!"
                if (r0 != 0) goto L72
                r0 = 0
                r2 = 1
                boolean r3 = r8.compareAndSet(r0, r2)
                if (r3 == 0) goto L72
                java.util.concurrent.atomic.AtomicLong r3 = r8.requested
                long r3 = r3.get()
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r5 = r8.queue
                r6 = 0
                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r6 == 0) goto L56
                if (r5 == 0) goto L26
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L56
            L26:
                org.reactivestreams.Subscriber<? super U> r1 = r8.actual
                r1.onNext(r9)
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 == 0) goto L39
                java.util.concurrent.atomic.AtomicLong r9 = r8.requested
                r9.decrementAndGet()
            L39:
                int r9 = r8.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r9 == r1) goto L6b
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L6b
                int r9 = r8.scalarEmitted
                int r9 = r9 + r2
                r8.scalarEmitted = r9
                int r1 = r8.scalarLimit
                if (r9 != r1) goto L6b
                r8.scalarEmitted = r0
                org.reactivestreams.Subscription r9 = r8.upstream
                long r0 = (long) r1
                r9.request(r0)
                goto L6b
            L56:
                if (r5 != 0) goto L5c
                io.reactivex.internal.fuseable.SimpleQueue r5 = r8.getMainQueue()
            L5c:
                boolean r9 = r5.offer(r9)
                if (r9 != 0) goto L6b
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r1)
                r8.onError(r9)
                return
            L6b:
                int r9 = r8.decrementAndGet()
                if (r9 != 0) goto L8c
                return
            L72:
                io.reactivex.internal.fuseable.SimpleQueue r0 = r8.getMainQueue()
                boolean r9 = r0.offer(r9)
                if (r9 != 0) goto L85
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r1)
                r8.onError(r9)
                return
            L85:
                int r9 = r8.getAndIncrement()
                if (r9 == 0) goto L8c
                return
            L8c:
                r8.drainLoop()
                return
        }
    }

    public FlowableFlatMap(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            r0.bufferSize = r5
            return
    }

    public static <T, U> io.reactivex.FlowableSubscriber<T> subscribe(org.reactivestreams.Subscriber<? super U> r7, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r8, boolean r9, int r10, int r11) {
            io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber r6 = new io.reactivex.internal.operators.flowable.FlowableFlatMap$MergeSubscriber
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r6, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r1 = r5.mapper
            boolean r2 = r5.delayErrors
            int r3 = r5.maxConcurrency
            int r4 = r5.bufferSize
            io.reactivex.FlowableSubscriber r6 = subscribe(r6, r1, r2, r3, r4)
            r0.subscribe(r6)
            return
    }
}
