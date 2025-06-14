package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int capacityHint;
    final org.reactivestreams.Publisher<B> other;

    static final class WindowBoundaryInnerSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        boolean done;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> parent;

        WindowBoundaryInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
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
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r0 = r1.parent
                r0.innerComplete()
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
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.done
                if (r1 == 0) goto L5
                return
            L5:
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> r1 = r0.parent
                r1.innerNext()
                return
        }
    }

    static final class WindowBoundaryMainSubscriber<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final java.lang.Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryInnerSubscriber<T, B> boundarySubscriber;
        final int capacityHint;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> downstream;
        long emitted;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final java.util.concurrent.atomic.AtomicBoolean stopWindows;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;
        io.reactivex.processors.UnicastProcessor<T> window;
        final java.util.concurrent.atomic.AtomicInteger windows;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT_WINDOW = r0
                return
        }

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.capacityHint = r2
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber
                r1.<init>(r0)
                r0.boundarySubscriber = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.windows = r1
                io.reactivex.internal.queue.MpscLinkedQueue r1 = new io.reactivex.internal.queue.MpscLinkedQueue
                r1.<init>()
                r0.queue = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.stopWindows = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.stopWindows
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1c
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber<T, B> r0 = r3.boundarySubscriber
                r0.dispose()
                java.util.concurrent.atomic.AtomicInteger r0 = r3.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1c
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            L1c:
                return
        }

        void drain() {
                r12 = this;
                int r0 = r12.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r0 = r12.downstream
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r1 = r12.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r12.errors
                long r3 = r12.emitted
                r5 = 1
                r6 = r5
            L11:
                java.util.concurrent.atomic.AtomicInteger r7 = r12.windows
                int r7 = r7.get()
                r8 = 0
                if (r7 != 0) goto L20
                r1.clear()
                r12.window = r8
                return
            L20:
                io.reactivex.processors.UnicastProcessor<T> r7 = r12.window
                boolean r9 = r12.done
                if (r9 == 0) goto L3e
                java.lang.Object r10 = r2.get()
                if (r10 == 0) goto L3e
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                if (r7 == 0) goto L3a
                r12.window = r8
                r7.onError(r1)
            L3a:
                r0.onError(r1)
                return
            L3e:
                java.lang.Object r10 = r1.poll()
                if (r10 != 0) goto L46
                r11 = r5
                goto L47
            L46:
                r11 = 0
            L47:
                if (r9 == 0) goto L67
                if (r11 == 0) goto L67
                java.lang.Throwable r1 = r2.terminate()
                if (r1 != 0) goto L5c
                if (r7 == 0) goto L58
                r12.window = r8
                r7.onComplete()
            L58:
                r0.onComplete()
                goto L66
            L5c:
                if (r7 == 0) goto L63
                r12.window = r8
                r7.onError(r1)
            L63:
                r0.onError(r1)
            L66:
                return
            L67:
                if (r11 == 0) goto L73
                r12.emitted = r3
                int r6 = -r6
                int r6 = r12.addAndGet(r6)
                if (r6 != 0) goto L11
                return
            L73:
                java.lang.Object r9 = io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT_WINDOW
                if (r10 == r9) goto L7b
                r7.onNext(r10)
                goto L11
            L7b:
                if (r7 == 0) goto L82
                r12.window = r8
                r7.onComplete()
            L82:
                java.util.concurrent.atomic.AtomicBoolean r7 = r12.stopWindows
                boolean r7 = r7.get()
                if (r7 != 0) goto L11
                int r7 = r12.capacityHint
                io.reactivex.processors.UnicastProcessor r7 = io.reactivex.processors.UnicastProcessor.create(r7, r12)
                r12.window = r7
                java.util.concurrent.atomic.AtomicInteger r8 = r12.windows
                r8.getAndIncrement()
                java.util.concurrent.atomic.AtomicLong r8 = r12.requested
                long r8 = r8.get()
                int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r8 == 0) goto La9
                r8 = 1
                long r3 = r3 + r8
                r0.onNext(r7)
                goto L11
            La9:
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r7 = r12.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r7)
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber<T, B> r7 = r12.boundarySubscriber
                r7.dispose()
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r8 = "Could not deliver a window due to lack of requests"
                r7.<init>(r8)
                r2.addThrowable(r7)
                r12.done = r5
                goto L11
        }

        void innerComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        void innerError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L14
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L17
            L14:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L17:
                return
        }

        void innerNext() {
                r2 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.NEXT_WINDOW
                r0.offer(r1)
                r2.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber<T, B> r0 = r1.boundarySubscriber
                r0.dispose()
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber<T, B> r0 = r1.boundarySubscriber
                r0.dispose()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L14
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L17
            L14:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.upstream
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4, r1)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.windows
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto Ld
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            Ld:
                return
        }
    }

    public FlowableWindowBoundary(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<B> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.capacityHint = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r3) {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryMainSubscriber
            int r1 = r2.capacityHint
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            r0.innerNext()
            org.reactivestreams.Publisher<B> r3 = r2.other
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary$WindowBoundaryInnerSubscriber<T, B> r1 = r0.boundarySubscriber
            r3.subscribe(r1)
            io.reactivex.Flowable<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
