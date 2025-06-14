package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final io.reactivex.Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final java.util.concurrent.TimeUnit unit;

    static final class WindowExactBoundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;

        /* renamed from: s */
        org.reactivestreams.Subscription f328s;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.processors.UnicastProcessor<T> window;
        final io.reactivex.Scheduler.Worker worker;

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final long index;
            final io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> parent;

            ConsumerIndexHolder(long r1, io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.index = r1
                    r0.parent = r3
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber<?> r0 = r2.parent
                    boolean r1 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.access$000(r0)
                    if (r1 != 0) goto L10
                    io.reactivex.internal.fuseable.SimplePlainQueue r1 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.access$100(r0)
                    r1.offer(r2)
                    goto L16
                L10:
                    r1 = 1
                    r0.terminated = r1
                    r0.dispose()
                L16:
                    boolean r1 = r0.enter()
                    if (r1 == 0) goto L1f
                    r0.drainLoop()
                L1f:
                    return
            }
        }

        WindowExactBoundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6, int r7, long r8, boolean r10) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                io.reactivex.internal.disposables.SequentialDisposable r2 = new io.reactivex.internal.disposables.SequentialDisposable
                r2.<init>()
                r1.timer = r2
                r1.timespan = r3
                r1.unit = r5
                r1.scheduler = r6
                r1.bufferSize = r7
                r1.maxSize = r8
                r1.restartTimerOnMaxSize = r10
                if (r10 == 0) goto L24
                io.reactivex.Scheduler$Worker r2 = r6.createWorker()
                r1.worker = r2
                goto L27
            L24:
                r2 = 0
                r1.worker = r2
            L27:
                return
        }

        static /* synthetic */ boolean access$000(io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber r0) {
                boolean r0 = r0.cancelled
                return r0
        }

        static /* synthetic */ io.reactivex.internal.fuseable.SimplePlainQueue access$100(io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber r0) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r0.queue
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Scheduler$Worker r0 = r1.worker
                if (r0 == 0) goto Lc
                r0.dispose()
            Lc:
                return
        }

        void drainLoop() {
                r16 = this;
                r0 = r16
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r0.queue
                org.reactivestreams.Subscriber<? super V> r2 = r0.actual
                io.reactivex.processors.UnicastProcessor<T> r3 = r0.window
                r5 = 1
            L9:
                boolean r6 = r0.terminated
                if (r6 == 0) goto L19
                org.reactivestreams.Subscription r2 = r0.f328s
                r2.cancel()
                r1.clear()
                r16.dispose()
                return
            L19:
                boolean r6 = r0.done
                java.lang.Object r7 = r1.poll()
                if (r7 != 0) goto L23
                r8 = 1
                goto L24
            L23:
                r8 = 0
            L24:
                boolean r9 = r7 instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder
                r10 = 0
                if (r6 == 0) goto L41
                if (r8 != 0) goto L2d
                if (r9 == 0) goto L41
            L2d:
                r0.window = r10
                r1.clear()
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L3a
                r3.onError(r1)
                goto L3d
            L3a:
                r3.onComplete()
            L3d:
                r16.dispose()
                return
            L41:
                if (r8 == 0) goto L4b
                int r5 = -r5
                int r5 = r0.leave(r5)
                if (r5 != 0) goto L9
                return
            L4b:
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r13 = 0
                r8 = r5
                if (r9 == 0) goto La2
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder r7 = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder) r7
                boolean r9 = r0.restartTimerOnMaxSize
                if (r9 != 0) goto L66
                long r4 = r0.producerIndex
                long r6 = r7.index
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 != 0) goto L64
                goto L66
            L64:
                r5 = r8
                goto L9
            L66:
                r3.onComplete()
                r0.count = r13
                int r3 = r0.bufferSize
                io.reactivex.processors.UnicastProcessor r3 = io.reactivex.processors.UnicastProcessor.create(r3)
                r0.window = r3
                long r4 = r16.requested()
                int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r6 == 0) goto L88
                r2.onNext(r3)
                int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r4 == 0) goto L64
                r4 = 1
                r0.produced(r4)
                goto L64
            L88:
                r0.window = r10
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r0.queue
                r1.clear()
                org.reactivestreams.Subscription r1 = r0.f328s
                r1.cancel()
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r3 = "Could not deliver first window due to lack of requests."
                r1.<init>(r3)
                r2.onError(r1)
                r16.dispose()
                return
            La2:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r7)
                r3.onNext(r4)
                long r4 = r0.count
                r6 = 1
                long r4 = r4 + r6
                long r9 = r0.maxSize
                int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r9 < 0) goto L11d
                long r4 = r0.producerIndex
                long r4 = r4 + r6
                r0.producerIndex = r4
                r0.count = r13
                r3.onComplete()
                long r3 = r16.requested()
                int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r5 == 0) goto L105
                int r5 = r0.bufferSize
                io.reactivex.processors.UnicastProcessor r5 = io.reactivex.processors.UnicastProcessor.create(r5)
                r0.window = r5
                org.reactivestreams.Subscriber<? super V> r6 = r0.actual
                r6.onNext(r5)
                int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r3 == 0) goto Ldc
                r3 = 1
                r0.produced(r3)
            Ldc:
                boolean r3 = r0.restartTimerOnMaxSize
                if (r3 == 0) goto L102
                io.reactivex.internal.disposables.SequentialDisposable r3 = r0.timer
                java.lang.Object r3 = r3.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                r3.dispose()
                io.reactivex.Scheduler$Worker r9 = r0.worker
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder r10 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder
                long r3 = r0.producerIndex
                r10.<init>(r3, r0)
                long r13 = r0.timespan
                java.util.concurrent.TimeUnit r15 = r0.unit
                r11 = r13
                io.reactivex.disposables.Disposable r3 = r9.schedulePeriodically(r10, r11, r13, r15)
                io.reactivex.internal.disposables.SequentialDisposable r4 = r0.timer
                r4.replace(r3)
            L102:
                r3 = r5
                goto L64
            L105:
                r3 = 0
                r0.window = r3
                org.reactivestreams.Subscription r1 = r0.f328s
                r1.cancel()
                org.reactivestreams.Subscriber<? super V> r1 = r0.actual
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r3 = "Could not deliver window due to lack of requests"
                r2.<init>(r3)
                r1.onError(r2)
                r16.dispose()
                return
            L11d:
                r0.count = r4
                goto L64
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onComplete()
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r8) {
                r7 = this;
                boolean r0 = r7.terminated
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r7.fastEnter()
                if (r0 == 0) goto L91
                io.reactivex.processors.UnicastProcessor<T> r0 = r7.window
                r0.onNext(r8)
                long r1 = r7.count
                r3 = 1
                long r1 = r1 + r3
                long r5 = r7.maxSize
                int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r8 < 0) goto L87
                long r1 = r7.producerIndex
                long r1 = r1 + r3
                r7.producerIndex = r1
                r1 = 0
                r7.count = r1
                r0.onComplete()
                long r5 = r7.requested()
                int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r8 == 0) goto L6f
                int r8 = r7.bufferSize
                io.reactivex.processors.UnicastProcessor r8 = io.reactivex.processors.UnicastProcessor.create(r8)
                r7.window = r8
                org.reactivestreams.Subscriber<? super V> r0 = r7.actual
                r0.onNext(r8)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r8 == 0) goto L48
                r7.produced(r3)
            L48:
                boolean r8 = r7.restartTimerOnMaxSize
                if (r8 == 0) goto L89
                io.reactivex.internal.disposables.SequentialDisposable r8 = r7.timer
                java.lang.Object r8 = r8.get()
                io.reactivex.disposables.Disposable r8 = (io.reactivex.disposables.Disposable) r8
                r8.dispose()
                io.reactivex.Scheduler$Worker r0 = r7.worker
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder r1 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder
                long r2 = r7.producerIndex
                r1.<init>(r2, r7)
                long r4 = r7.timespan
                java.util.concurrent.TimeUnit r6 = r7.unit
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodically(r1, r2, r4, r6)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r7.timer
                r0.replace(r8)
                goto L89
            L6f:
                r8 = 0
                r7.window = r8
                org.reactivestreams.Subscription r8 = r7.f328s
                r8.cancel()
                org.reactivestreams.Subscriber<? super V> r8 = r7.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver window due to lack of requests"
                r0.<init>(r1)
                r8.onError(r0)
                r7.dispose()
                return
            L87:
                r7.count = r1
            L89:
                r8 = -1
                int r8 = r7.leave(r8)
                if (r8 != 0) goto La1
                return
            L91:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r7.queue
                java.lang.Object r8 = io.reactivex.internal.util.NotificationLite.next(r8)
                r0.offer(r8)
                boolean r8 = r7.enter()
                if (r8 != 0) goto La1
                return
            La1:
                r7.drainLoop()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r12) {
                r11 = this;
                org.reactivestreams.Subscription r0 = r11.f328s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r12)
                if (r0 == 0) goto L75
                r11.f328s = r12
                org.reactivestreams.Subscriber<? super V> r0 = r11.actual
                r0.onSubscribe(r11)
                boolean r1 = r11.cancelled
                if (r1 == 0) goto L14
                return
            L14:
                int r1 = r11.bufferSize
                io.reactivex.processors.UnicastProcessor r1 = io.reactivex.processors.UnicastProcessor.create(r1)
                r11.window = r1
                long r2 = r11.requested()
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 == 0) goto L65
                r0.onNext(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 == 0) goto L37
                r2 = 1
                r11.produced(r2)
            L37:
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder r5 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber$ConsumerIndexHolder
                long r2 = r11.producerIndex
                r5.<init>(r2, r11)
                boolean r2 = r11.restartTimerOnMaxSize
                if (r2 == 0) goto L4e
                io.reactivex.Scheduler$Worker r4 = r11.worker
                long r8 = r11.timespan
                java.util.concurrent.TimeUnit r10 = r11.unit
                r6 = r8
                io.reactivex.disposables.Disposable r2 = r4.schedulePeriodically(r5, r6, r8, r10)
                goto L59
            L4e:
                io.reactivex.Scheduler r4 = r11.scheduler
                long r8 = r11.timespan
                java.util.concurrent.TimeUnit r10 = r11.unit
                r6 = r8
                io.reactivex.disposables.Disposable r2 = r4.schedulePeriodicallyDirect(r5, r6, r8, r10)
            L59:
                io.reactivex.internal.disposables.SequentialDisposable r3 = r11.timer
                boolean r2 = r3.replace(r2)
                if (r2 == 0) goto L75
                r12.request(r0)
                goto L75
            L65:
                r1 = 1
                r11.cancelled = r1
                r12.cancel()
                io.reactivex.exceptions.MissingBackpressureException r12 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver initial window due to lack of requests."
                r12.<init>(r1)
                r0.onError(r12)
            L75:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }
    }

    static final class WindowExactUnboundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final java.lang.Object NEXT = null;
        final int bufferSize;

        /* renamed from: s */
        org.reactivestreams.Subscription f329s;
        final io.reactivex.Scheduler scheduler;
        volatile boolean terminated;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        io.reactivex.processors.UnicastProcessor<T> window;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT = r0
                return
        }

        WindowExactUnboundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6, int r7) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                io.reactivex.internal.disposables.SequentialDisposable r2 = new io.reactivex.internal.disposables.SequentialDisposable
                r2.<init>()
                r1.timer = r2
                r1.timespan = r3
                r1.unit = r5
                r1.scheduler = r6
                r1.bufferSize = r7
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void drainLoop() {
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                org.reactivestreams.Subscriber<? super V> r1 = r10.actual
                io.reactivex.processors.UnicastProcessor<T> r2 = r10.window
                r3 = 1
            L7:
                boolean r4 = r10.terminated
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r5 == 0) goto L2c
                if (r6 == 0) goto L18
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                if (r6 != r5) goto L2c
            L18:
                r10.window = r7
                r0.clear()
                r10.dispose()
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L28
                r2.onError(r0)
                goto L2b
            L28:
                r2.onComplete()
            L2b:
                return
            L2c:
                if (r6 != 0) goto L36
                int r3 = -r3
                int r3 = r10.leave(r3)
                if (r3 != 0) goto L7
                return
            L36:
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                if (r6 != r5) goto L83
                r2.onComplete()
                if (r4 != 0) goto L7d
                int r2 = r10.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                r10.window = r2
                long r4 = r10.requested()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L63
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L7
                r4 = 1
                r10.produced(r4)
                goto L7
            L63:
                r10.window = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                r0.clear()
                org.reactivestreams.Subscription r0 = r10.f329s
                r0.cancel()
                r10.dispose()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Could not deliver first window due to lack of requests."
                r0.<init>(r2)
                r1.onError(r0)
                return
            L7d:
                org.reactivestreams.Subscription r4 = r10.f329s
                r4.cancel()
                goto L7
            L83:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L7
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onComplete()
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.terminated
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r1.fastEnter()
                if (r0 == 0) goto L18
                io.reactivex.processors.UnicastProcessor<T> r0 = r1.window
                r0.onNext(r2)
                r2 = -1
                int r2 = r1.leave(r2)
                if (r2 != 0) goto L28
                return
            L18:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
                r0.offer(r2)
                boolean r2 = r1.enter()
                if (r2 != 0) goto L28
                return
            L28:
                r1.drainLoop()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r13) {
                r12 = this;
                org.reactivestreams.Subscription r0 = r12.f329s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r13)
                if (r0 == 0) goto L60
                r12.f329s = r13
                int r0 = r12.bufferSize
                io.reactivex.processors.UnicastProcessor r0 = io.reactivex.processors.UnicastProcessor.create(r0)
                r12.window = r0
                org.reactivestreams.Subscriber<? super V> r0 = r12.actual
                r0.onSubscribe(r12)
                long r1 = r12.requested()
                r3 = 0
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 == 0) goto L50
                io.reactivex.processors.UnicastProcessor<T> r3 = r12.window
                r0.onNext(r3)
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 == 0) goto L34
                r0 = 1
                r12.produced(r0)
            L34:
                boolean r0 = r12.cancelled
                if (r0 != 0) goto L60
                io.reactivex.internal.disposables.SequentialDisposable r0 = r12.timer
                io.reactivex.Scheduler r5 = r12.scheduler
                long r9 = r12.timespan
                java.util.concurrent.TimeUnit r11 = r12.unit
                r6 = r12
                r7 = r9
                io.reactivex.disposables.Disposable r1 = r5.schedulePeriodicallyDirect(r6, r7, r9, r11)
                boolean r0 = r0.replace(r1)
                if (r0 == 0) goto L60
                r13.request(r3)
                goto L60
            L50:
                r1 = 1
                r12.cancelled = r1
                r13.cancel()
                io.reactivex.exceptions.MissingBackpressureException r13 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver first window due to lack of requests."
                r13.<init>(r1)
                r0.onError(r13)
            L60:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto La
                r0 = 1
                r2.terminated = r0
                r2.dispose()
            La:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                java.lang.Object r1 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                r0.offer(r1)
                boolean r0 = r2.enter()
                if (r0 == 0) goto L1a
                r2.drainLoop()
            L1a:
                return
        }
    }

    static final class WindowSkipSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription, java.lang.Runnable {
        final int bufferSize;

        /* renamed from: s */
        org.reactivestreams.Subscription f330s;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final java.util.concurrent.TimeUnit unit;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> windows;
        final io.reactivex.Scheduler.Worker worker;

        final class Completion implements java.lang.Runnable {
            private final io.reactivex.processors.UnicastProcessor<T> processor;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber this$0;

            Completion(io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber r1, io.reactivex.processors.UnicastProcessor<T> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.processor = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber r0 = r2.this$0
                    io.reactivex.processors.UnicastProcessor<T> r1 = r2.processor
                    r0.complete(r1)
                    return
            }
        }

        static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w */
            final io.reactivex.processors.UnicastProcessor<T> f331w;

            SubjectWork(io.reactivex.processors.UnicastProcessor<T> r1, boolean r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f331w = r1
                    r0.open = r2
                    return
            }
        }

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r2, long r3, long r5, java.util.concurrent.TimeUnit r7, io.reactivex.Scheduler.Worker r8, int r9) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.timespan = r3
                r1.timeskip = r5
                r1.unit = r7
                r1.worker = r8
                r1.bufferSize = r9
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.windows = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        void complete(io.reactivex.processors.UnicastProcessor<T> r4) {
                r3 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$SubjectWork r1 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$SubjectWork
                r2 = 0
                r1.<init>(r4, r2)
                r0.offer(r1)
                boolean r4 = r3.enter()
                if (r4 == 0) goto L14
                r3.drainLoop()
            L14:
                return
        }

        public void dispose() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        void drainLoop() {
                r10 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                org.reactivestreams.Subscriber<? super V> r1 = r10.actual
                java.util.List<io.reactivex.processors.UnicastProcessor<T>> r2 = r10.windows
                r3 = 1
                r4 = r3
            L8:
                boolean r5 = r10.terminated
                if (r5 == 0) goto L1b
                org.reactivestreams.Subscription r1 = r10.f330s
                r1.cancel()
                r10.dispose()
                r0.clear()
                r2.clear()
                return
            L1b:
                boolean r5 = r10.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L25
                r7 = r3
                goto L26
            L25:
                r7 = 0
            L26:
                boolean r8 = r6 instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork
                if (r5 == 0) goto L64
                if (r7 != 0) goto L2e
                if (r8 == 0) goto L64
            L2e:
                r0.clear()
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L49
                java.util.Iterator r1 = r2.iterator()
            L39:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L5d
                java.lang.Object r3 = r1.next()
                io.reactivex.processors.UnicastProcessor r3 = (io.reactivex.processors.UnicastProcessor) r3
                r3.onError(r0)
                goto L39
            L49:
                java.util.Iterator r0 = r2.iterator()
            L4d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5d
                java.lang.Object r1 = r0.next()
                io.reactivex.processors.UnicastProcessor r1 = (io.reactivex.processors.UnicastProcessor) r1
                r1.onComplete()
                goto L4d
            L5d:
                r2.clear()
                r10.dispose()
                return
            L64:
                if (r7 == 0) goto L6e
                int r4 = -r4
                int r4 = r10.leave(r4)
                if (r4 != 0) goto L8
                return
            L6e:
                if (r8 == 0) goto Ld3
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$SubjectWork r6 = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork) r6
                boolean r5 = r6.open
                if (r5 == 0) goto Lbb
                boolean r5 = r10.cancelled
                if (r5 == 0) goto L7b
                goto L8
            L7b:
                long r5 = r10.requested()
                r7 = 0
                int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r7 == 0) goto Laf
                int r7 = r10.bufferSize
                io.reactivex.processors.UnicastProcessor r7 = io.reactivex.processors.UnicastProcessor.create(r7)
                r2.add(r7)
                r1.onNext(r7)
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 == 0) goto L9f
                r5 = 1
                r10.produced(r5)
            L9f:
                io.reactivex.Scheduler$Worker r5 = r10.worker
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$Completion r6 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$Completion
                r6.<init>(r10, r7)
                long r7 = r10.timespan
                java.util.concurrent.TimeUnit r9 = r10.unit
                r5.schedule(r6, r7, r9)
                goto L8
            Laf:
                io.reactivex.exceptions.MissingBackpressureException r5 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r6 = "Can't emit window due to lack of requests"
                r5.<init>(r6)
                r1.onError(r5)
                goto L8
            Lbb:
                io.reactivex.processors.UnicastProcessor<T> r5 = r6.f331w
                r2.remove(r5)
                io.reactivex.processors.UnicastProcessor<T> r5 = r6.f331w
                r5.onComplete()
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L8
                boolean r5 = r10.cancelled
                if (r5 == 0) goto L8
                r10.terminated = r3
                goto L8
            Ld3:
                java.util.Iterator r5 = r2.iterator()
            Ld7:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L8
                java.lang.Object r7 = r5.next()
                io.reactivex.processors.UnicastProcessor r7 = (io.reactivex.processors.UnicastProcessor) r7
                r7.onNext(r6)
                goto Ld7
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Lc
                r1.drainLoop()
            Lc:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onComplete()
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.enter()
                if (r0 == 0) goto Le
                r1.drainLoop()
            Le:
                org.reactivestreams.Subscriber<? super V> r0 = r1.actual
                r0.onError(r2)
                r1.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.fastEnter()
                if (r0 == 0) goto L24
                java.util.List<io.reactivex.processors.UnicastProcessor<T>> r0 = r2.windows
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                io.reactivex.processors.UnicastProcessor r1 = (io.reactivex.processors.UnicastProcessor) r1
                r1.onNext(r3)
                goto Lc
            L1c:
                r3 = -1
                int r3 = r2.leave(r3)
                if (r3 != 0) goto L30
                return
            L24:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r2.queue
                r0.offer(r3)
                boolean r3 = r2.enter()
                if (r3 != 0) goto L30
                return
            L30:
                r2.drainLoop()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r15) {
                r14 = this;
                org.reactivestreams.Subscription r0 = r14.f330s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r15)
                if (r0 == 0) goto L68
                r14.f330s = r15
                org.reactivestreams.Subscriber<? super V> r0 = r14.actual
                r0.onSubscribe(r14)
                boolean r0 = r14.cancelled
                if (r0 == 0) goto L14
                return
            L14:
                long r0 = r14.requested()
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L59
                int r2 = r14.bufferSize
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                java.util.List<io.reactivex.processors.UnicastProcessor<T>> r3 = r14.windows
                r3.add(r2)
                org.reactivestreams.Subscriber<? super V> r3 = r14.actual
                r3.onNext(r2)
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 == 0) goto L3c
                r0 = 1
                r14.produced(r0)
            L3c:
                io.reactivex.Scheduler$Worker r0 = r14.worker
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$Completion r1 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$Completion
                r1.<init>(r14, r2)
                long r5 = r14.timespan
                java.util.concurrent.TimeUnit r2 = r14.unit
                r0.schedule(r1, r5, r2)
                io.reactivex.Scheduler$Worker r7 = r14.worker
                long r11 = r14.timeskip
                java.util.concurrent.TimeUnit r13 = r14.unit
                r8 = r14
                r9 = r11
                r7.schedulePeriodically(r8, r9, r11, r13)
                r15.request(r3)
                goto L68
            L59:
                r15.cancel()
                org.reactivestreams.Subscriber<? super V> r15 = r14.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not emit the first window due to lack of requests"
                r0.<init>(r1)
                r15.onError(r0)
            L68:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                r0.requested(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                int r0 = r3.bufferSize
                io.reactivex.processors.UnicastProcessor r0 = io.reactivex.processors.UnicastProcessor.create(r0)
                io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$SubjectWork r1 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber$SubjectWork
                r2 = 1
                r1.<init>(r0, r2)
                boolean r0 = r3.cancelled
                if (r0 != 0) goto L15
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                r0.offer(r1)
            L15:
                boolean r0 = r3.enter()
                if (r0 == 0) goto L1e
                r3.drainLoop()
            L1e:
                return
        }
    }

    public FlowableWindowTimed(io.reactivex.Flowable<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, long r8, int r10, boolean r11) {
            r0 = this;
            r0.<init>(r1)
            r0.timespan = r2
            r0.timeskip = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.maxSize = r8
            r0.bufferSize = r10
            r0.restartTimerOnMaxSize = r11
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> r12) {
            r11 = this;
            io.reactivex.subscribers.SerializedSubscriber r1 = new io.reactivex.subscribers.SerializedSubscriber
            r1.<init>(r12)
            long r2 = r11.timespan
            long r4 = r11.timeskip
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 != 0) goto L44
            long r2 = r11.maxSize
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 != 0) goto L2c
            io.reactivex.Flowable<T> r12 = r11.source
            io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactUnboundedSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactUnboundedSubscriber
            long r2 = r11.timespan
            java.util.concurrent.TimeUnit r4 = r11.unit
            io.reactivex.Scheduler r5 = r11.scheduler
            int r6 = r11.bufferSize
            r0 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            r12.subscribe(r7)
            return
        L2c:
            io.reactivex.Flowable<T> r12 = r11.source
            io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber r10 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowExactBoundedSubscriber
            long r2 = r11.timespan
            java.util.concurrent.TimeUnit r4 = r11.unit
            io.reactivex.Scheduler r5 = r11.scheduler
            int r6 = r11.bufferSize
            long r7 = r11.maxSize
            boolean r9 = r11.restartTimerOnMaxSize
            r0 = r10
            r0.<init>(r1, r2, r4, r5, r6, r7, r9)
            r12.subscribe(r10)
            return
        L44:
            io.reactivex.Flowable<T> r12 = r11.source
            io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber r9 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed$WindowSkipSubscriber
            long r2 = r11.timespan
            long r4 = r11.timeskip
            java.util.concurrent.TimeUnit r6 = r11.unit
            io.reactivex.Scheduler r0 = r11.scheduler
            io.reactivex.Scheduler$Worker r7 = r0.createWorker()
            int r8 = r11.bufferSize
            r0 = r9
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r12.subscribe(r9)
            return
    }
}
