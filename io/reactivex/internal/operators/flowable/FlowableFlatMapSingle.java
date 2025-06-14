package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFlatMapSingle<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final int maxConcurrency;

    static final class FlatMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        final java.util.concurrent.atomic.AtomicInteger active;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        final boolean delayErrors;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        final int maxConcurrency;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f257s;
        final io.reactivex.disposables.CompositeDisposable set;

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber this$0;

            InnerObserver(io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                    boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                    return r0
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber r0 = r1.this$0
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber r0 = r1.this$0
                    r0.innerSuccess(r1, r2)
                    return
            }
        }

        FlatMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.delayErrors = r3
                r0.maxConcurrency = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.active = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.queue = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f257s
                r0.cancel()
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                return
        }

        void clear() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r0 = r1.queue
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r0
                if (r0 == 0) goto Ld
                r0.clear()
            Ld:
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
                r17 = this;
                r0 = r17
                org.reactivestreams.Subscriber<? super R> r1 = r0.actual
                java.util.concurrent.atomic.AtomicInteger r2 = r0.active
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r3 = r0.queue
                r4 = 1
                r5 = r4
            La:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L13:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                r13 = 0
                if (r12 == 0) goto L77
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L20
                r17.clear()
                return
            L20:
                boolean r14 = r0.delayErrors
                if (r14 != 0) goto L3b
                io.reactivex.internal.util.AtomicThrowable r14 = r0.errors
                java.lang.Object r14 = r14.get()
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto L3b
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                java.lang.Throwable r2 = r2.terminate()
                r17.clear()
                r1.onError(r2)
                return
            L3b:
                int r14 = r2.get()
                if (r14 != 0) goto L43
                r14 = r4
                goto L44
            L43:
                r14 = r13
            L44:
                java.lang.Object r15 = r3.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r15 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r15
                if (r15 == 0) goto L51
                java.lang.Object r15 = r15.poll()
                goto L52
            L51:
                r15 = 0
            L52:
                if (r15 != 0) goto L57
                r16 = r4
                goto L59
            L57:
                r16 = r13
            L59:
                if (r14 == 0) goto L6d
                if (r16 == 0) goto L6d
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                java.lang.Throwable r2 = r2.terminate()
                if (r2 == 0) goto L69
                r1.onError(r2)
                goto L6c
            L69:
                r1.onComplete()
            L6c:
                return
            L6d:
                if (r16 == 0) goto L70
                goto L77
            L70:
                r1.onNext(r15)
                r12 = 1
                long r10 = r10 + r12
                goto L13
            L77:
                if (r12 != 0) goto Lc8
                boolean r6 = r0.cancelled
                if (r6 == 0) goto L81
                r17.clear()
                return
            L81:
                boolean r6 = r0.delayErrors
                if (r6 != 0) goto L9c
                io.reactivex.internal.util.AtomicThrowable r6 = r0.errors
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto L9c
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                java.lang.Throwable r2 = r2.terminate()
                r17.clear()
                r1.onError(r2)
                return
            L9c:
                int r6 = r2.get()
                if (r6 != 0) goto La4
                r6 = r4
                goto La5
            La4:
                r6 = r13
            La5:
                java.lang.Object r7 = r3.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r7 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r7
                if (r7 == 0) goto Lb3
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto Lb4
            Lb3:
                r13 = r4
            Lb4:
                if (r6 == 0) goto Lc8
                if (r13 == 0) goto Lc8
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                java.lang.Throwable r2 = r2.terminate()
                if (r2 == 0) goto Lc4
                r1.onError(r2)
                goto Lc7
            Lc4:
                r1.onComplete()
            Lc7:
                return
            Lc8:
                int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r6 == 0) goto Ldd
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r6, r10)
                int r6 = r0.maxConcurrency
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r7) goto Ldd
                org.reactivestreams.Subscription r6 = r0.f257s
                r6.request(r10)
            Ldd:
                int r5 = -r5
                int r5 = r0.addAndGet(r5)
                if (r5 != 0) goto La
                return
        }

        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> getOrCreateQueue() {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r0 = r3.queue
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = io.reactivex.Flowable.bufferSize()
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r1 = r3.queue
                r2 = 0
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r2, r0)
                if (r1 == 0) goto L0
                return r0
        }

        void innerError(io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber<T, R>.InnerObserver r3, java.lang.Throwable r4) {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.delete(r3)
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L33
                boolean r3 = r2.delayErrors
                if (r3 != 0) goto L1c
                org.reactivestreams.Subscription r3 = r2.f257s
                r3.cancel()
                io.reactivex.disposables.CompositeDisposable r3 = r2.set
                r3.dispose()
                goto L2a
            L1c:
                int r3 = r2.maxConcurrency
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r4) goto L2a
                org.reactivestreams.Subscription r3 = r2.f257s
                r0 = 1
                r3.request(r0)
            L2a:
                java.util.concurrent.atomic.AtomicInteger r3 = r2.active
                r3.decrementAndGet()
                r2.drain()
                goto L36
            L33:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L36:
                return
        }

        void innerSuccess(io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber<T, R>.InnerObserver r5, R r6) {
                r4 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r4.set
                r0.delete(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L7a
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L7a
                java.util.concurrent.atomic.AtomicInteger r1 = r4.active
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.requested
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L67
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                r0.onNext(r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> r6 = r4.queue
                java.lang.Object r6 = r6.get()
                io.reactivex.internal.queue.SpscLinkedArrayQueue r6 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r6
                if (r5 == 0) goto L53
                if (r6 == 0) goto L3f
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L53
            L3f:
                io.reactivex.internal.util.AtomicThrowable r5 = r4.errors
                java.lang.Throwable r5 = r5.terminate()
                if (r5 == 0) goto L4d
                org.reactivestreams.Subscriber<? super R> r6 = r4.actual
                r6.onError(r5)
                goto L52
            L4d:
                org.reactivestreams.Subscriber<? super R> r5 = r4.actual
                r5.onComplete()
            L52:
                return
            L53:
                java.util.concurrent.atomic.AtomicLong r5 = r4.requested
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r5, r0)
                int r5 = r4.maxConcurrency
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L70
                org.reactivestreams.Subscription r5 = r4.f257s
                r5.request(r0)
                goto L70
            L67:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r5 = r4.getOrCreateQueue()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            L70:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L8f
                return
            L77:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
                throw r6
            L7a:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r5 = r4.getOrCreateQueue()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L93
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
                java.util.concurrent.atomic.AtomicInteger r5 = r4.active
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L8f
                return
            L8f:
                r4.drainLoop()
                return
            L93:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
                throw r6
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                r0.decrementAndGet()
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                r0.decrementAndGet()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1a
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto L16
                io.reactivex.disposables.CompositeDisposable r2 = r1.set
                r2.dispose()
            L16:
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1d:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L28
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L28
                io.reactivex.SingleSource r3 = (io.reactivex.SingleSource) r3     // Catch: java.lang.Throwable -> L28
                java.util.concurrent.atomic.AtomicInteger r0 = r2.active
                r0.getAndIncrement()
                io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber$InnerObserver r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber$InnerObserver
                r0.<init>(r2)
                boolean r1 = r2.cancelled
                if (r1 != 0) goto L27
                io.reactivex.disposables.CompositeDisposable r1 = r2.set
                boolean r1 = r1.add(r0)
                if (r1 == 0) goto L27
                r3.subscribe(r0)
            L27:
                return
            L28:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f257s
                r0.cancel()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f257s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L23
                r2.f257s = r3
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L1f
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                goto L23
            L1f:
                long r0 = (long) r0
                r3.request(r0)
            L23:
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
    }

    public FlowableFlatMapSingle(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$FlatMapSingleSubscriber
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2 = r5.mapper
            boolean r3 = r5.delayErrors
            int r4 = r5.maxConcurrency
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
