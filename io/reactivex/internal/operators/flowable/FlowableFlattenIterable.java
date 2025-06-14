package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final int prefetch;

    static final class FlattenIterableSubscriber<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        int consumed;
        java.util.Iterator<? extends R> current;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        int fusionMode;
        final int limit;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f258s;

        FlattenIterableSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.prefetch = r3
                int r1 = r3 >> 2
                int r3 = r3 - r1
                r0.limit = r3
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.error = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f258s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        boolean checkTerminated(boolean r4, boolean r5, org.reactivestreams.Subscriber<?> r6, io.reactivex.internal.fuseable.SimpleQueue<?> r7) {
                r3 = this;
                boolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Lc
                r3.current = r1
                r7.clear()
                return r2
            Lc:
                if (r4 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L27
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r3.error
                java.lang.Throwable r4 = io.reactivex.internal.util.ExceptionHelper.terminate(r4)
                r3.current = r1
                r7.clear()
                r6.onError(r4)
                return r2
            L27:
                if (r5 == 0) goto L2d
                r6.onComplete()
                return r2
            L2d:
                r4 = 0
                return r4
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 0
                r1.current = r0
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        void consumedOne(boolean r4) {
                r3 = this;
                if (r4 == 0) goto L16
                int r4 = r3.consumed
                int r4 = r4 + 1
                int r0 = r3.limit
                if (r4 != r0) goto L14
                r0 = 0
                r3.consumed = r0
                org.reactivestreams.Subscription r0 = r3.f258s
                long r1 = (long) r4
                r0.request(r1)
                goto L16
            L14:
                r3.consumed = r4
            L16:
                return
        }

        void drain() {
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r1.queue
                int r0 = r1.fusionMode
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L15
                r0 = r5
                goto L16
            L15:
                r0 = r4
            L16:
                java.util.Iterator<? extends R> r6 = r1.current
                r7 = r5
            L19:
                r8 = 0
                if (r6 != 0) goto L80
                boolean r9 = r1.done
                java.lang.Object r10 = r3.poll()     // Catch: java.lang.Throwable -> L62
                if (r10 != 0) goto L26
                r11 = r5
                goto L27
            L26:
                r11 = r4
            L27:
                boolean r9 = r1.checkTerminated(r9, r11, r2, r3)
                if (r9 == 0) goto L2e
                return
            L2e:
                if (r10 == 0) goto L80
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.mapper     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r6 = r6.apply(r10)     // Catch: java.lang.Throwable -> L4a
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L4a
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L4a
                boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L4a
                if (r9 != 0) goto L47
                r1.consumedOne(r0)
                r6 = r8
                goto L19
            L47:
                r1.current = r6
                goto L80
            L4a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscription r3 = r1.f258s
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            L62:
                r0 = move-exception
                r4 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.reactivestreams.Subscription r0 = r1.f258s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r1.current = r8
                r3.clear()
                r2.onError(r0)
                return
            L80:
                if (r6 == 0) goto L124
                java.util.concurrent.atomic.AtomicLong r9 = r1.requested
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L8b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto Lf6
                boolean r15 = r1.done
                boolean r15 = r1.checkTerminated(r15, r4, r2, r3)
                if (r15 == 0) goto L98
                return
            L98:
                java.lang.Object r15 = r6.next()     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r15, r5)     // Catch: java.lang.Throwable -> Ldc
                r2.onNext(r5)
                boolean r5 = r1.done
                boolean r5 = r1.checkTerminated(r5, r4, r2, r3)
                if (r5 == 0) goto Lae
                return
            Lae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch: java.lang.Throwable -> Lc1
                if (r5 != 0) goto Lbf
                r1.consumedOne(r0)
                r1.current = r8
                r6 = r8
                goto Lf6
            Lbf:
                r5 = 1
                goto L8b
            Lc1:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r1.current = r8
                org.reactivestreams.Subscription r0 = r1.f258s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            Ldc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.current = r8
                org.reactivestreams.Subscription r3 = r1.f258s
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                r2.onError(r0)
                return
            Lf6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L10e
                boolean r5 = r1.done
                boolean r8 = r3.isEmpty()
                if (r8 == 0) goto L106
                if (r6 != 0) goto L106
                r8 = 1
                goto L107
            L106:
                r8 = r4
            L107:
                boolean r5 = r1.checkTerminated(r5, r8, r2, r3)
                if (r5 == 0) goto L10e
                return
            L10e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L121
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r8 = -r13
                r5.addAndGet(r8)
            L121:
                if (r6 != 0) goto L124
                goto L12c
            L124:
                int r5 = -r7
                int r7 = r1.addAndGet(r5)
                if (r7 != 0) goto L12c
                return
            L12c:
                r5 = 1
                goto L19
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                java.util.Iterator<? extends R> r0 = r1.current
                if (r0 != 0) goto Le
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
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
                if (r0 != 0) goto L13
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto L13
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L16:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.fusionMode
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L1c
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue is full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L1c:
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.f258s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L4c
                r3.f258s = r4
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L38
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.fusionMode = r1
                r3.queue = r0
                r3.done = r2
                org.reactivestreams.Subscriber<? super R> r4 = r3.actual
                r4.onSubscribe(r3)
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L38
                r3.fusionMode = r1
                r3.queue = r0
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L38:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                org.reactivestreams.Subscriber<? super R> r0 = r3.actual
                r0.onSubscribe(r3)
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L4c:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
                r4 = this;
                java.util.Iterator<? extends R> r0 = r4.current
            L2:
                r1 = 0
                if (r0 != 0) goto L24
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r4.queue
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto Le
                return r1
            Le:
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r4.mapper
                java.lang.Object r0 = r2.apply(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 != 0) goto L22
                r0 = r1
                goto L2
            L22:
                r4.current = r0
            L24:
                java.lang.Object r2 = r0.next()
                java.lang.String r3 = "The iterator returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L36
                r4.current = r1
            L36:
                return r2
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
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L9
                int r2 = r1.fusionMode
                if (r2 != r0) goto L9
                return r0
            L9:
                r2 = 0
                return r2
        }
    }

    public FlowableFlattenIterable(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.prefetch = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            boolean r0 = r0 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L34
            io.reactivex.Flowable<T> r0 = r4.source     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L14
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r5)
            return
        L14:
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r1 = r4.mapper     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.apply(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L24
            io.reactivex.internal.operators.flowable.FlowableFromIterable.subscribe(r5, r0)
            return
        L24:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
        L2c:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
        L34:
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFlattenIterable$FlattenIterableSubscriber
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r4.mapper
            int r3 = r4.prefetch
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
