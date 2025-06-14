package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMergeWithMaybe<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> other;

    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        int consumed;
        long emitted;
        final io.reactivex.internal.util.AtomicThrowable error;
        final int limit;
        volatile boolean mainDone;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> mainSubscription;
        final io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver.OtherObserver<T> otherObserver;
        volatile int otherState;
        final int prefetch;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        T singleItem;

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> parent;

            OtherObserver(io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherSuccess(r2)
                    return
            }
        }

        MergeWithObserver(org.reactivestreams.Subscriber<? super T> r2) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.mainSubscription = r2
                io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver r2 = new io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver
                r2.<init>(r1)
                r1.otherObserver = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.requested = r2
                int r2 = io.reactivex.Flowable.bufferSize()
                r1.prefetch = r2
                int r0 = r2 >> 2
                int r2 = r2 - r0
                r1.limit = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver<T> r0 = r1.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                r0 = 0
                r1.queue = r0
                r1.singleItem = r0
            L18:
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
                r18 = this;
                r0 = r18
                org.reactivestreams.Subscriber<? super T> r1 = r0.actual
                long r2 = r0.emitted
                int r4 = r0.consumed
                int r5 = r0.limit
                r6 = 1
                r7 = r6
            Lc:
                java.util.concurrent.atomic.AtomicLong r8 = r0.requested
                long r8 = r8.get()
            L12:
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                r12 = 2
                r13 = 0
                if (r10 == 0) goto L81
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r0.singleItem = r13
                r0.queue = r13
                return
            L21:
                io.reactivex.internal.util.AtomicThrowable r14 = r0.error
                java.lang.Object r14 = r14.get()
                if (r14 == 0) goto L37
                r0.singleItem = r13
                r0.queue = r13
                io.reactivex.internal.util.AtomicThrowable r2 = r0.error
                java.lang.Throwable r2 = r2.terminate()
                r1.onError(r2)
                return
            L37:
                int r14 = r0.otherState
                r15 = 1
                if (r14 != r6) goto L48
                T r10 = r0.singleItem
                r0.singleItem = r13
                r0.otherState = r12
                r1.onNext(r10)
                long r2 = r2 + r15
                goto L12
            L48:
                boolean r6 = r0.mainDone
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r11 = r0.queue
                if (r11 == 0) goto L53
                java.lang.Object r11 = r11.poll()
                goto L54
            L53:
                r11 = r13
            L54:
                if (r11 != 0) goto L59
                r17 = 1
                goto L5b
            L59:
                r17 = 0
            L5b:
                if (r6 == 0) goto L67
                if (r17 == 0) goto L67
                if (r14 != r12) goto L67
                r0.queue = r13
                r1.onComplete()
                return
            L67:
                if (r17 == 0) goto L6a
                goto L81
            L6a:
                r1.onNext(r11)
                long r2 = r2 + r15
                int r4 = r4 + 1
                if (r4 != r5) goto L7f
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r0.mainSubscription
                java.lang.Object r4 = r4.get()
                org.reactivestreams.Subscription r4 = (org.reactivestreams.Subscription) r4
                long r10 = (long) r5
                r4.request(r10)
                r4 = 0
            L7f:
                r6 = 1
                goto L12
            L81:
                if (r10 != 0) goto Lc0
                boolean r6 = r0.cancelled
                if (r6 == 0) goto L8c
                r0.singleItem = r13
                r0.queue = r13
                return
            L8c:
                io.reactivex.internal.util.AtomicThrowable r6 = r0.error
                java.lang.Object r6 = r6.get()
                if (r6 == 0) goto La2
                r0.singleItem = r13
                r0.queue = r13
                io.reactivex.internal.util.AtomicThrowable r2 = r0.error
                java.lang.Throwable r2 = r2.terminate()
                r1.onError(r2)
                return
            La2:
                boolean r6 = r0.mainDone
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r8 = r0.queue
                if (r8 == 0) goto Lb1
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto Laf
                goto Lb1
            Laf:
                r11 = 0
                goto Lb2
            Lb1:
                r11 = 1
            Lb2:
                if (r6 == 0) goto Lc0
                if (r11 == 0) goto Lc0
                int r6 = r0.otherState
                if (r6 != r12) goto Lc0
                r0.queue = r13
                r1.onComplete()
                return
            Lc0:
                r0.emitted = r2
                r0.consumed = r4
                int r6 = -r7
                int r7 = r0.addAndGet(r6)
                if (r7 != 0) goto Lcc
                return
            Lcc:
                r6 = 1
                goto Lc
        }

        io.reactivex.internal.fuseable.SimplePlainQueue<T> getOrCreateQueue() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r2.queue
                if (r0 != 0) goto Lf
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = io.reactivex.Flowable.bufferSize()
                r0.<init>(r1)
                r2.queue = r0
            Lf:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.mainDone = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
                r1.drain()
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r7) {
                r6 = this;
                r0 = 0
                r1 = 1
                boolean r2 = r6.compareAndSet(r0, r1)
                if (r2 == 0) goto L54
                long r2 = r6.emitted
                java.util.concurrent.atomic.AtomicLong r4 = r6.requested
                long r4 = r4.get()
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r4 == 0) goto L46
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r4 = r6.queue
                if (r4 == 0) goto L23
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L1f
                goto L23
            L1f:
                r4.offer(r7)
                goto L4d
            L23:
                r4 = 1
                long r2 = r2 + r4
                r6.emitted = r2
                org.reactivestreams.Subscriber<? super T> r2 = r6.actual
                r2.onNext(r7)
                int r7 = r6.consumed
                int r7 = r7 + r1
                int r1 = r6.limit
                if (r7 != r1) goto L43
                r6.consumed = r0
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r6.mainSubscription
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                long r1 = (long) r7
                r0.request(r1)
                goto L4d
            L43:
                r6.consumed = r7
                goto L4d
            L46:
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r6.getOrCreateQueue()
                r0.offer(r7)
            L4d:
                int r7 = r6.decrementAndGet()
                if (r7 != 0) goto L62
                return
            L54:
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r6.getOrCreateQueue()
                r0.offer(r7)
                int r7 = r6.getAndIncrement()
                if (r7 == 0) goto L62
                return
            L62:
                r6.drainLoop()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.mainSubscription
                int r1 = r3.prefetch
                long r1 = (long) r1
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4, r1)
                return
        }

        void otherComplete() {
                r1 = this;
                r0 = 2
                r1.otherState = r0
                r1.drain()
                return
        }

        void otherError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
                r1.drain()
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        void otherSuccess(T r7) {
                r6 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r6.compareAndSet(r0, r1)
                if (r0 == 0) goto L2d
                long r2 = r6.emitted
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                long r4 = r0.get()
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 == 0) goto L22
                r0 = 1
                long r2 = r2 + r0
                r6.emitted = r2
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onNext(r7)
                r7 = 2
                r6.otherState = r7
                goto L38
            L22:
                r6.singleItem = r7
                r6.otherState = r1
                int r7 = r6.decrementAndGet()
                if (r7 != 0) goto L38
                return
            L2d:
                r6.singleItem = r7
                r6.otherState = r1
                int r7 = r6.getAndIncrement()
                if (r7 == 0) goto L38
                return
            L38:
                r6.drainLoop()
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
                return
        }
    }

    public FlowableMergeWithMaybe(io.reactivex.Flowable<T> r1, io.reactivex.MaybeSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver r0 = new io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.Flowable<T> r2 = r1.source
            r2.subscribe(r0)
            io.reactivex.MaybeSource<? extends T> r2 = r1.other
            io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe$MergeWithObserver$OtherObserver<T> r0 = r0.otherObserver
            r2.subscribe(r0)
            return
    }
}
