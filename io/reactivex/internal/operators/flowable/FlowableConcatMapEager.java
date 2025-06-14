package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatMapEager<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        volatile io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f233s;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> subscribers;

        ConcatMapEagerDelayErrorSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.maxConcurrency = r3
                r0.prefetch = r4
                r0.errorMode = r5
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r2 = java.lang.Math.min(r4, r3)
                r1.<init>(r2)
                r0.subscribers = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f233s
                r0.cancel()
                r1.drainAndCancel()
                return
        }

        void cancelAll() {
                r1 = this;
            L0:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> r0 = r1.subscribers
                java.lang.Object r0 = r0.poll()
                io.reactivex.internal.subscribers.InnerQueuedSubscriber r0 = (io.reactivex.internal.subscribers.InnerQueuedSubscriber) r0
                if (r0 == 0) goto Le
                r0.cancel()
                goto L0
            Le:
                return
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void drain() {
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r0 = r1.current
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                io.reactivex.internal.util.ErrorMode r3 = r1.errorMode
                r5 = 1
            L10:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                if (r0 != 0) goto L56
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.END
                if (r3 == r0) goto L33
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L33
                r17.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L33:
                boolean r0 = r1.done
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> r8 = r1.subscribers
                java.lang.Object r8 = r8.poll()
                io.reactivex.internal.subscribers.InnerQueuedSubscriber r8 = (io.reactivex.internal.subscribers.InnerQueuedSubscriber) r8
                if (r0 == 0) goto L51
                if (r8 != 0) goto L51
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L4d
                r2.onError(r0)
                goto L50
            L4d:
                r2.onComplete()
            L50:
                return
            L51:
                if (r8 == 0) goto L57
                r1.current = r8
                goto L57
            L56:
                r8 = r0
            L57:
                if (r8 == 0) goto L10e
                io.reactivex.internal.fuseable.SimpleQueue r11 = r8.queue()
                if (r11 == 0) goto L10e
                r12 = 0
            L61:
                int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                r16 = r5
                r4 = 1
                r15 = 0
                if (r14 == 0) goto Lcb
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L72
                r17.cancelAll()
                return
            L72:
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r0) goto L92
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L92
                r1.current = r15
                r8.cancel()
                r17.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L92:
                boolean r0 = r8.isDone()
                java.lang.Object r9 = r11.poll()     // Catch: java.lang.Throwable -> Lba
                if (r9 != 0) goto L9e
                r10 = 1
                goto L9f
            L9e:
                r10 = 0
            L9f:
                if (r0 == 0) goto Lad
                if (r10 == 0) goto Lad
                r1.current = r15
                org.reactivestreams.Subscription r0 = r1.f233s
                r0.request(r4)
                r8 = r15
                r0 = 1
                goto Lcc
            Lad:
                if (r10 == 0) goto Lb0
                goto Lcb
            Lb0:
                r2.onNext(r9)
                long r12 = r12 + r4
                r8.requestOne()
                r5 = r16
                goto L61
            Lba:
                r0 = move-exception
                r3 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r1.current = r15
                r8.cancel()
                r17.cancelAll()
                r2.onError(r3)
                return
            Lcb:
                r0 = 0
            Lcc:
                if (r14 != 0) goto L10b
                boolean r9 = r1.cancelled
                if (r9 == 0) goto Ld6
                r17.cancelAll()
                return
            Ld6:
                io.reactivex.internal.util.ErrorMode r9 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r3 != r9) goto Lf6
                io.reactivex.internal.util.AtomicThrowable r9 = r1.errors
                java.lang.Object r9 = r9.get()
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto Lf6
                r1.current = r15
                r8.cancel()
                r17.cancelAll()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            Lf6:
                boolean r9 = r8.isDone()
                boolean r10 = r11.isEmpty()
                if (r9 == 0) goto L10b
                if (r10 == 0) goto L10b
                r1.current = r15
                org.reactivestreams.Subscription r0 = r1.f233s
                r0.request(r4)
                r8 = r15
                r0 = 1
            L10b:
                r4 = 0
                goto L115
            L10e:
                r16 = r5
                r0 = 0
                r4 = 0
                r12 = 0
            L115:
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 == 0) goto L128
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 == 0) goto L128
                java.util.concurrent.atomic.AtomicLong r4 = r1.requested
                long r5 = -r12
                r4.addAndGet(r5)
            L128:
                if (r0 == 0) goto L12f
                r0 = r8
                r5 = r16
                goto L10
            L12f:
                r4 = r16
                int r0 = -r4
                int r5 = r1.addAndGet(r0)
                if (r5 != 0) goto L139
                return
            L139:
                r0 = r8
                goto L10
        }

        void drainAndCancel() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto Lf
            L6:
                r1.cancelAll()
                int r0 = r1.decrementAndGet()
                if (r0 != 0) goto L6
            Lf:
                return
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r1) {
                r0 = this;
                r1.setDone()
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto L1a
                r2.setDone()
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
                if (r2 == r3) goto L16
                org.reactivestreams.Subscription r2 = r1.f233s
                r2.cancel()
            L16:
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1d:
                return
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> r2, R r3) {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue r0 = r2.queue()
                boolean r3 = r0.offer(r3)
                if (r3 == 0) goto Le
                r1.drain()
                goto L19
            Le:
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r3 = new io.reactivex.exceptions.MissingBackpressureException
                r3.<init>()
                r1.innerError(r2, r3)
            L19:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lf
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L12
            Lf:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L12:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r0 = "The mapper returned a null Publisher"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L2d
                org.reactivestreams.Publisher r3 = (org.reactivestreams.Publisher) r3     // Catch: java.lang.Throwable -> L2d
                io.reactivex.internal.subscribers.InnerQueuedSubscriber r0 = new io.reactivex.internal.subscribers.InnerQueuedSubscriber
                int r1 = r2.prefetch
                r0.<init>(r2, r1)
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L1a
                return
            L1a:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> r1 = r2.subscribers
                r1.offer(r0)
                r3.subscribe(r0)
                boolean r3 = r2.cancelled
                if (r3 == 0) goto L2c
                r0.cancel()
                r2.drainAndCancel()
            L2c:
                return
            L2d:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f233s
                r0.cancel()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f233s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L20
                r2.f233s = r3
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L1c
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L1d
            L1c:
                long r0 = (long) r0
            L1d:
                r3.request(r0)
            L20:
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

    public FlowableConcatMapEager(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, int r4, io.reactivex.internal.util.ErrorMode r5) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.maxConcurrency = r3
            r0.prefetch = r4
            r0.errorMode = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r9) {
            r8 = this;
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager$ConcatMapEagerDelayErrorSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3 = r8.mapper
            int r4 = r8.maxConcurrency
            int r5 = r8.prefetch
            io.reactivex.internal.util.ErrorMode r6 = r8.errorMode
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
