package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelJoin<T> extends io.reactivex.Flowable<T> {
    final boolean delayErrors;
    final int prefetch;
    final io.reactivex.parallel.ParallelFlowable<? extends T> source;

    static final class JoinInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> parent;
        final int prefetch;
        long produced;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;

        JoinInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.prefetch = r2
                int r1 = r2 >> 2
                int r2 = r2 - r1
                r0.limit = r2
                return
        }

        public boolean cancel() {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                return r0
        }

        io.reactivex.internal.fuseable.SimplePlainQueue<T> getQueue() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r2.queue
                if (r0 != 0) goto Ld
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r2.prefetch
                r0.<init>(r1)
                r2.queue = r0
            Ld:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase<T> r0 = r1.parent
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase<T> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase<T> r0 = r1.parent
                r0.onNext(r1, r2)
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

        public void request(long r3) {
                r2 = this;
                long r0 = r2.produced
                long r0 = r0 + r3
                int r3 = r2.limit
                long r3 = (long) r3
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 < 0) goto L18
                r3 = 0
                r2.produced = r3
                java.lang.Object r3 = r2.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                r3.request(r0)
                goto L1a
            L18:
                r2.produced = r0
            L1a:
                return
        }

        public void requestOne() {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                int r2 = r4.limit
                long r2 = (long) r2
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L1a
                r2 = 0
                r4.produced = r2
                java.lang.Object r2 = r4.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                r2.request(r0)
                goto L1c
            L1a:
                r4.produced = r0
            L1c:
                return
        }
    }

    static final class JoinSubscription<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        JoinSubscription(org.reactivestreams.Subscriber<? super T> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                r1.drainLoop()
                return
        }

        void drainLoop() {
                r18 = this;
                r0 = r18
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber<T>[] r1 = r0.subscribers
                int r2 = r1.length
                org.reactivestreams.Subscriber<? super T> r3 = r0.actual
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L67
                boolean r12 = r0.cancelled
                if (r12 == 0) goto L1d
                r18.cleanup()
                return
            L1d:
                io.reactivex.internal.util.AtomicThrowable r12 = r0.errors
                java.lang.Object r12 = r12.get()
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                if (r12 == 0) goto L2e
                r18.cleanup()
                r3.onError(r12)
                return
            L2e:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.done
                int r12 = r12.get()
                if (r12 != 0) goto L38
                r12 = 1
                goto L39
            L38:
                r12 = 0
            L39:
                r14 = 0
                r15 = 1
            L3b:
                int r4 = r1.length
                if (r14 >= r4) goto L5d
                r4 = r1[r14]
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r13 = r4.queue
                if (r13 == 0) goto L5a
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L5a
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L59
                goto L67
            L59:
                r15 = 0
            L5a:
                int r14 = r14 + 1
                goto L3b
            L5d:
                if (r12 == 0) goto L65
                if (r15 == 0) goto L65
                r3.onComplete()
                return
            L65:
                if (r15 == 0) goto L11
            L67:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto Lac
                boolean r4 = r0.cancelled
                if (r4 == 0) goto L73
                r18.cleanup()
                return
            L73:
                io.reactivex.internal.util.AtomicThrowable r4 = r0.errors
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L84
                r18.cleanup()
                r3.onError(r4)
                return
            L84:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.done
                int r4 = r4.get()
                if (r4 != 0) goto L8e
                r4 = 1
                goto L8f
            L8e:
                r4 = 0
            L8f:
                r12 = 0
            L90:
                if (r12 >= r2) goto La3
                r13 = r1[r12]
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r13 = r13.queue
                if (r13 == 0) goto La0
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto La0
                r13 = 0
                goto La4
            La0:
                int r12 = r12 + 1
                goto L90
            La3:
                r13 = 1
            La4:
                if (r4 == 0) goto Lac
                if (r13 == 0) goto Lac
                r3.onComplete()
                return
            Lac:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto Lbf
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto Lbf
                java.util.concurrent.atomic.AtomicLong r4 = r0.requested
                long r6 = -r10
                r4.addAndGet(r6)
            Lbf:
                int r4 = r18.get()
                if (r4 != r5) goto Lcd
                int r4 = -r5
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto Lcd
                return
            Lcd:
                r5 = r4
                goto L8
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.done
                r0.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                r1 = 0
                boolean r0 = r0.compareAndSet(r1, r3)
                if (r0 == 0) goto L10
                r2.cancelAll()
                r2.drain()
                goto L1b
            L10:
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                java.lang.Object r0 = r0.get()
                if (r3 == r0) goto L1b
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1b:
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> r7, T r8) {
                r6 = this;
                int r0 = r6.get()
                java.lang.String r1 = "Queue full?!"
                if (r0 != 0) goto L67
                r0 = 0
                r2 = 1
                boolean r0 = r6.compareAndSet(r0, r2)
                if (r0 == 0) goto L67
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L3b
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onNext(r8)
                java.util.concurrent.atomic.AtomicLong r8 = r6.requested
                long r0 = r8.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 == 0) goto L35
                java.util.concurrent.atomic.AtomicLong r8 = r6.requested
                r8.decrementAndGet()
            L35:
                r0 = 1
                r7.request(r0)
                goto L60
            L3b:
                io.reactivex.internal.fuseable.SimplePlainQueue r7 = r7.getQueue()
                boolean r7 = r7.offer(r8)
                if (r7 != 0) goto L60
                r6.cancelAll()
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                r7.<init>(r1)
                io.reactivex.internal.util.AtomicThrowable r8 = r6.errors
                r0 = 0
                boolean r8 = r8.compareAndSet(r0, r7)
                if (r8 == 0) goto L5c
                org.reactivestreams.Subscriber<? super T> r8 = r6.actual
                r8.onError(r7)
                goto L5f
            L5c:
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
            L5f:
                return
            L60:
                int r7 = r6.decrementAndGet()
                if (r7 != 0) goto L84
                return
            L67:
                io.reactivex.internal.fuseable.SimplePlainQueue r7 = r7.getQueue()
                boolean r7 = r7.offer(r8)
                if (r7 != 0) goto L7d
                r6.cancelAll()
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                r7.<init>(r1)
                r6.onError(r7)
                return
            L7d:
                int r7 = r6.getAndIncrement()
                if (r7 == 0) goto L84
                return
            L84:
                r6.drainLoop()
                return
        }
    }

    static abstract class JoinSubscriptionBase<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final java.util.concurrent.atomic.AtomicInteger done;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] subscribers;

        JoinSubscriptionBase(org.reactivestreams.Subscriber<? super T> r3, int r4, int r5) {
                r2 = this;
                r2.<init>()
                io.reactivex.internal.util.AtomicThrowable r0 = new io.reactivex.internal.util.AtomicThrowable
                r0.<init>()
                r2.errors = r0
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r2.requested = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r2.done = r0
                r2.actual = r3
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber[] r3 = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber[r4]
                r0 = 0
            L1d:
                if (r0 >= r4) goto L29
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber r1 = new io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber
                r1.<init>(r2, r5)
                r3[r0] = r1
                int r0 = r0 + 1
                goto L1d
            L29:
                r2.subscribers = r3
                java.util.concurrent.atomic.AtomicInteger r3 = r2.done
                r3.lazySet(r4)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L13
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L13
                r1.cleanup()
            L13:
                return
        }

        void cancelAll() {
                r3 = this;
                r0 = 0
            L1:
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber<T>[] r1 = r3.subscribers
                int r2 = r1.length
                if (r0 >= r2) goto Le
                r1 = r1[r0]
                r1.cancel()
                int r0 = r0 + 1
                goto L1
            Le:
                return
        }

        void cleanup() {
                r3 = this;
                r0 = 0
            L1:
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber<T>[] r1 = r3.subscribers
                int r2 = r1.length
                if (r0 >= r2) goto Le
                r1 = r1[r0]
                r2 = 0
                r1.queue = r2
                int r0 = r0 + 1
                goto L1
            Le:
                return
        }

        abstract void drain();

        abstract void onComplete();

        abstract void onError(java.lang.Throwable r1);

        abstract void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> r1, T r2);

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

    static final class JoinSubscriptionDelayError<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        JoinSubscriptionDelayError(org.reactivestreams.Subscriber<? super T> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                r1.drainLoop()
                return
        }

        void drainLoop() {
                r18 = this;
                r0 = r18
                io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber<T>[] r1 = r0.subscribers
                int r2 = r1.length
                org.reactivestreams.Subscriber<? super T> r3 = r0.actual
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.requested
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L69
                boolean r12 = r0.cancelled
                if (r12 == 0) goto L1d
                r18.cleanup()
                return
            L1d:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.done
                int r12 = r12.get()
                if (r12 != 0) goto L27
                r12 = 1
                goto L28
            L27:
                r12 = 0
            L28:
                r14 = 0
                r15 = 1
            L2a:
                if (r14 >= r2) goto L4b
                r4 = r1[r14]
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r13 = r4.queue
                if (r13 == 0) goto L48
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L48
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L47
                goto L69
            L47:
                r15 = 0
            L48:
                int r14 = r14 + 1
                goto L2a
            L4b:
                if (r12 == 0) goto L67
                if (r15 == 0) goto L67
                io.reactivex.internal.util.AtomicThrowable r1 = r0.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L63
                io.reactivex.internal.util.AtomicThrowable r1 = r0.errors
                java.lang.Throwable r1 = r1.terminate()
                r3.onError(r1)
                goto L66
            L63:
                r3.onComplete()
            L66:
                return
            L67:
                if (r15 == 0) goto L11
            L69:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto Lb1
                boolean r4 = r0.cancelled
                if (r4 == 0) goto L75
                r18.cleanup()
                return
            L75:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.done
                int r4 = r4.get()
                if (r4 != 0) goto L7f
                r4 = 1
                goto L80
            L7f:
                r4 = 0
            L80:
                r12 = 0
            L81:
                if (r12 >= r2) goto L94
                r13 = r1[r12]
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r13 = r13.queue
                if (r13 == 0) goto L91
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L91
                r13 = 0
                goto L95
            L91:
                int r12 = r12 + 1
                goto L81
            L94:
                r13 = 1
            L95:
                if (r4 == 0) goto Lb1
                if (r13 == 0) goto Lb1
                io.reactivex.internal.util.AtomicThrowable r1 = r0.errors
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto Lad
                io.reactivex.internal.util.AtomicThrowable r1 = r0.errors
                java.lang.Throwable r1 = r1.terminate()
                r3.onError(r1)
                goto Lb0
            Lad:
                r3.onComplete()
            Lb0:
                return
            Lb1:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto Lc4
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto Lc4
                java.util.concurrent.atomic.AtomicLong r4 = r0.requested
                long r6 = -r10
                r4.addAndGet(r6)
            Lc4:
                int r4 = r18.get()
                if (r4 != r5) goto Ld2
                int r4 = -r5
                int r4 = r0.addAndGet(r4)
                if (r4 != 0) goto Ld2
                return
            Ld2:
                r5 = r4
                goto L8
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.done
                r0.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                r0.addThrowable(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.done
                r2.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        void onNext(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> r7, T r8) {
                r6 = this;
                int r0 = r6.get()
                java.lang.String r1 = "Queue full?!"
                if (r0 != 0) goto L62
                r0 = 0
                r2 = 1
                boolean r0 = r6.compareAndSet(r0, r2)
                if (r0 == 0) goto L62
                java.util.concurrent.atomic.AtomicLong r0 = r6.requested
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L3b
                org.reactivestreams.Subscriber<? super T> r0 = r6.actual
                r0.onNext(r8)
                java.util.concurrent.atomic.AtomicLong r8 = r6.requested
                long r0 = r8.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 == 0) goto L35
                java.util.concurrent.atomic.AtomicLong r8 = r6.requested
                r8.decrementAndGet()
            L35:
                r0 = 1
                r7.request(r0)
                goto L5b
            L3b:
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r7.getQueue()
                boolean r8 = r0.offer(r8)
                if (r8 != 0) goto L5b
                r7.cancel()
                io.reactivex.internal.util.AtomicThrowable r7 = r6.errors
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                r8.<init>(r1)
                r7.addThrowable(r8)
                java.util.concurrent.atomic.AtomicInteger r7 = r6.done
                r7.decrementAndGet()
                r6.drainLoop()
                return
            L5b:
                int r7 = r6.decrementAndGet()
                if (r7 != 0) goto L88
                return
            L62:
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r7.getQueue()
                boolean r8 = r0.offer(r8)
                if (r8 != 0) goto L81
                boolean r7 = r7.cancel()
                if (r7 == 0) goto L81
                io.reactivex.internal.util.AtomicThrowable r7 = r6.errors
                io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
                r8.<init>(r1)
                r7.addThrowable(r8)
                java.util.concurrent.atomic.AtomicInteger r7 = r6.done
                r7.decrementAndGet()
            L81:
                int r7 = r6.getAndIncrement()
                if (r7 == 0) goto L88
                return
            L88:
                r6.drainLoop()
                return
        }
    }

    public ParallelJoin(io.reactivex.parallel.ParallelFlowable<? extends T> r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.prefetch = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            boolean r0 = r3.delayErrors
            if (r0 == 0) goto L12
            io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionDelayError r0 = new io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionDelayError
            io.reactivex.parallel.ParallelFlowable<? extends T> r1 = r3.source
            int r1 = r1.parallelism()
            int r2 = r3.prefetch
            r0.<init>(r4, r1, r2)
            goto L1f
        L12:
            io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscription r0 = new io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscription
            io.reactivex.parallel.ParallelFlowable<? extends T> r1 = r3.source
            int r1 = r1.parallelism()
            int r2 = r3.prefetch
            r0.<init>(r4, r1, r2)
        L1f:
            r4.onSubscribe(r0)
            io.reactivex.parallel.ParallelFlowable<? extends T> r4 = r3.source
            io.reactivex.internal.operators.parallel.ParallelJoin$JoinInnerSubscriber<T>[] r0 = r0.subscribers
            r4.subscribe(r0)
            return
    }
}
