package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableZip<T, R> extends io.reactivex.Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final org.reactivestreams.Publisher<? extends T>[] sources;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> sourcesIterable;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        final java.lang.Object[] current;
        final boolean delayErrors;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] subscribers;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipCoordinator(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2, int r3, int r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.zipper = r2
                r0.delayErrors = r5
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber[r3]
                r2 = 0
            Lc:
                if (r2 >= r3) goto L18
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber r5 = new io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber
                r5.<init>(r0, r4)
                r1[r2] = r5
                int r2 = r2 + 1
                goto Lc
            L18:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r0.current = r2
                r0.subscribers = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto La
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
            La:
                return
        }

        void cancelAll() {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r0 = r4.subscribers
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

        void drain() {
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r3 = r1.subscribers
                int r4 = r3.length
                java.lang.Object[] r5 = r1.current
                r7 = 1
            L11:
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = r0.get()
                r12 = 0
            L19:
                int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                r15 = 0
                r16 = 0
                if (r14 == 0) goto Ld2
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L25
                return
            L25:
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L3e
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L3e
                r18.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L3e:
                r0 = r16
                r6 = r0
            L41:
                if (r6 >= r4) goto L9e
                r10 = r3[r6]
                r11 = r5[r6]
                if (r11 != 0) goto L9b
                boolean r11 = r10.done     // Catch: java.lang.Throwable -> L80
                io.reactivex.internal.fuseable.SimpleQueue<T> r10 = r10.queue     // Catch: java.lang.Throwable -> L80
                if (r10 == 0) goto L54
                java.lang.Object r10 = r10.poll()     // Catch: java.lang.Throwable -> L80
                goto L55
            L54:
                r10 = r15
            L55:
                if (r10 != 0) goto L5a
                r17 = 1
                goto L5c
            L5a:
                r17 = r16
            L5c:
                if (r11 == 0) goto L7b
                if (r17 == 0) goto L7b
                r18.cancelAll()     // Catch: java.lang.Throwable -> L80
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L80
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L80
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L80
                if (r0 == 0) goto L77
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L80
                java.lang.Throwable r0 = r0.terminate()     // Catch: java.lang.Throwable -> L80
                r2.onError(r0)     // Catch: java.lang.Throwable -> L80
                goto L7a
            L77:
                r2.onComplete()     // Catch: java.lang.Throwable -> L80
            L7a:
                return
            L7b:
                if (r17 != 0) goto L9a
                r5[r6] = r10     // Catch: java.lang.Throwable -> L80
                goto L9b
            L80:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.util.AtomicThrowable r10 = r1.errors
                r10.addThrowable(r0)
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L9a
                r18.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L9a:
                r0 = 1
            L9b:
                int r6 = r6 + 1
                goto L41
            L9e:
                if (r0 == 0) goto La1
                goto Ld2
            La1:
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r1.zipper     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r6 = r5.clone()     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r6 = "The zipper returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r6)     // Catch: java.lang.Throwable -> Lbc
                r2.onNext(r0)
                r10 = 1
                long r12 = r12 + r10
                java.util.Arrays.fill(r5, r15)
                goto L19
            Lbc:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r18.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r3 = r1.errors
                r3.addThrowable(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Ld2:
                if (r14 != 0) goto L14f
                boolean r0 = r1.cancelled
                if (r0 == 0) goto Ld9
                return
            Ld9:
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto Lf2
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto Lf2
                r18.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lf2:
                r6 = r16
            Lf4:
                if (r6 >= r4) goto L14f
                r0 = r3[r6]
                r10 = r5[r6]
                if (r10 != 0) goto L14c
                boolean r10 = r0.done     // Catch: java.lang.Throwable -> L132
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r0.queue     // Catch: java.lang.Throwable -> L132
                if (r0 == 0) goto L107
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L132
                goto L108
            L107:
                r0 = r15
            L108:
                if (r0 != 0) goto L10c
                r11 = 1
                goto L10e
            L10c:
                r11 = r16
            L10e:
                if (r10 == 0) goto L12d
                if (r11 == 0) goto L12d
                r18.cancelAll()     // Catch: java.lang.Throwable -> L132
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L132
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L132
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L132
                if (r0 == 0) goto L129
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors     // Catch: java.lang.Throwable -> L132
                java.lang.Throwable r0 = r0.terminate()     // Catch: java.lang.Throwable -> L132
                r2.onError(r0)     // Catch: java.lang.Throwable -> L132
                goto L12c
            L129:
                r2.onComplete()     // Catch: java.lang.Throwable -> L132
            L12c:
                return
            L12d:
                if (r11 != 0) goto L14c
                r5[r6] = r0     // Catch: java.lang.Throwable -> L132
                goto L14c
            L132:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.util.AtomicThrowable r10 = r1.errors
                r10.addThrowable(r0)
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L14c
                r18.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L14c:
                int r6 = r6 + 1
                goto Lf4
            L14f:
                r10 = 0
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 == 0) goto L171
                int r0 = r3.length
                r6 = r16
            L158:
                if (r6 >= r0) goto L162
                r10 = r3[r6]
                r10.request(r12)
                int r6 = r6 + 1
                goto L158
            L162:
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 == 0) goto L171
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = -r12
                r0.addAndGet(r8)
            L171:
                int r0 = -r7
                int r7 = r1.addAndGet(r0)
                if (r7 != 0) goto L11
                return
        }

        void error(io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto Lf
                r3 = 1
                r2.done = r3
                r1.drain()
                goto L12
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L12:
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

        void subscribe(org.reactivestreams.Publisher<? extends T>[] r5, int r6) {
                r4 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipSubscriber<T, R>[] r0 = r4.subscribers
                r1 = 0
            L3:
                if (r1 >= r6) goto L20
                boolean r2 = r4.cancelled
                if (r2 != 0) goto L20
                boolean r2 = r4.delayErrors
                if (r2 != 0) goto L16
                io.reactivex.internal.util.AtomicThrowable r2 = r4.errors
                java.lang.Object r2 = r2.get()
                if (r2 == 0) goto L16
                goto L20
            L16:
                r2 = r5[r1]
                r3 = r0[r1]
                r2.subscribe(r3)
                int r1 = r1 + 1
                goto L3
            L20:
                return
        }
    }

    static final class ZipSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        int sourceMode;

        ZipSubscriber(io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.prefetch = r2
                int r1 = r2 >> 2
                int r2 = r2 - r1
                r0.limit = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r0 = r1.parent
                r0.error(r1, r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.sourceMode
                r1 = 2
                if (r0 == r1) goto La
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
                r0.offer(r3)
            La:
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r3 = r2.parent
                r3.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r3, r4)
                if (r0 == 0) goto L3e
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L2f
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 7
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator<T, R> r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2f
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
                return
            L2f:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.prefetch
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.prefetch
                long r0 = (long) r0
                r4.request(r0)
            L3e:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                int r0 = r2.sourceMode
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

    public FlowableZip(org.reactivestreams.Publisher<? extends T>[] r1, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            r0.zipper = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r10) {
            r9 = this;
            org.reactivestreams.Publisher<? extends T>[] r0 = r9.sources
            if (r0 != 0) goto L2e
            r0 = 8
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1 = r9.sourcesIterable
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r1.next()
            org.reactivestreams.Publisher r4 = (org.reactivestreams.Publisher) r4
            int r5 = r0.length
            if (r3 != r5) goto L28
            int r5 = r3 >> 2
            int r5 = r5 + r3
            org.reactivestreams.Publisher[] r5 = new org.reactivestreams.Publisher[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            r0 = r5
        L28:
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
            goto L10
        L2e:
            int r3 = r0.length
        L2f:
            r7 = r3
            if (r7 != 0) goto L36
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r10)
            return
        L36:
            io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator r8 = new io.reactivex.internal.operators.flowable.FlowableZip$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3 = r9.zipper
            int r5 = r9.bufferSize
            boolean r6 = r9.delayError
            r1 = r8
            r2 = r10
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r10.onSubscribe(r8)
            r8.subscribe(r0, r7)
            return
    }
}
