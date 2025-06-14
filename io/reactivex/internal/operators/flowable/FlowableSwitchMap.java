package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;

    static final class SwitchMapInnerSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> parent;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> queue;

        SwitchMapInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                r0.bufferSize = r4
                return
        }

        public void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber<T, R> r0 = r5.parent
                long r1 = r5.index
                long r3 = r0.unique
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L10
                r1 = 1
                r5.done = r1
                r0.drain()
            L10:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber<T, R> r0 = r5.parent
                long r1 = r5.index
                long r3 = r0.unique
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L22
                io.reactivex.internal.util.AtomicThrowable r1 = r0.error
                boolean r1 = r1.addThrowable(r6)
                if (r1 == 0) goto L22
                boolean r6 = r0.delayErrors
                if (r6 != 0) goto L1b
                org.reactivestreams.Subscription r6 = r0.f308s
                r6.cancel()
            L1b:
                r6 = 1
                r5.done = r6
                r0.drain()
                goto L25
            L22:
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L25:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r6) {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber<T, R> r0 = r5.parent
                long r1 = r5.index
                long r3 = r0.unique
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L24
                int r1 = r5.fusionMode
                if (r1 != 0) goto L21
                io.reactivex.internal.fuseable.SimpleQueue<R> r1 = r5.queue
                boolean r6 = r1.offer(r6)
                if (r6 != 0) goto L21
                io.reactivex.exceptions.MissingBackpressureException r6 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue full?!"
                r6.<init>(r0)
                r5.onError(r6)
                return
            L21:
                r0.drain()
            L24:
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
                r3.fusionMode = r1
                r3.queue = r0
                r3.done = r2
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber<T, R> r4 = r3.parent
                r4.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2f
                r3.fusionMode = r1
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
                return
            L2f:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.bufferSize
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
            L3e:
                return
        }
    }

    static final class SwitchMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R>> active;
        final org.reactivestreams.Subscriber<? super R> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f308s;
        volatile long unique;

        static {
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber
                r1 = -1
                r3 = 1
                r4 = 0
                r0.<init>(r4, r1, r3)
                io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.CANCELLED = r0
                r0.cancel()
                return
        }

        SwitchMapSubscriber(org.reactivestreams.Subscriber<? super R> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.active = r0
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                r1.actual = r2
                r1.mapper = r3
                r1.bufferSize = r4
                r1.delayErrors = r5
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lf
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f308s
                r0.cancel()
                r1.disposeInner()
            Lf:
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r0
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.CANCELLED
                if (r0 == r1) goto L1b
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r2.active
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r0
                if (r0 == r1) goto L1b
                if (r0 == 0) goto L1b
                r0.cancel()
            L1b:
                return
        }

        void drain() {
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r4 = 1
            Lc:
                boolean r0 = r1.cancelled
                r5 = 0
                if (r0 == 0) goto L17
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                r0.lazySet(r5)
                return
            L17:
                boolean r0 = r1.done
                if (r0 == 0) goto L62
                boolean r0 = r1.delayErrors
                if (r0 == 0) goto L3f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L62
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L3b
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                goto L3e
            L3b:
                r2.onComplete()
            L3e:
                return
            L3f:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L56
                r17.disposeInner()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L56:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L62
                r2.onComplete()
                return
            L62:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                java.lang.Object r0 = r0.get()
                r6 = r0
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r6 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r6
                if (r6 == 0) goto L71
                io.reactivex.internal.fuseable.SimpleQueue<R> r0 = r6.queue
                r7 = r0
                goto L72
            L71:
                r7 = r5
            L72:
                if (r7 == 0) goto L13f
                boolean r0 = r6.done
                if (r0 == 0) goto Lad
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto La0
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L93
                r17.disposeInner()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L93:
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto Lad
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r6, r5)
                goto Lc
            La0:
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto Lad
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r6, r5)
                goto Lc
            Lad:
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r8 = r0.get()
                r10 = 0
                r12 = r10
            Lb6:
                int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                r14 = 0
                if (r0 == 0) goto L11b
                boolean r0 = r1.cancelled
                if (r0 == 0) goto Lc0
                return
            Lc0:
                boolean r0 = r6.done
                java.lang.Object r15 = r7.poll()     // Catch: java.lang.Throwable -> Lc7
                goto Ld6
            Lc7:
                r0 = move-exception
                r15 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r15)
                r6.cancel()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                r0.addThrowable(r15)
                r15 = r5
                r0 = 1
            Ld6:
                if (r15 != 0) goto Ldb
                r16 = 1
                goto Ldd
            Ldb:
                r16 = r14
            Ldd:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r3 = r1.active
                java.lang.Object r3 = r3.get()
                if (r6 == r3) goto Le7
            Le5:
                r14 = 1
                goto L11b
            Le7:
                if (r0 == 0) goto L111
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L109
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L101
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L101:
                if (r16 == 0) goto L111
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r6, r5)
                goto Le5
            L109:
                if (r16 == 0) goto L111
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r1.active
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r6, r5)
                goto Le5
            L111:
                if (r16 == 0) goto L114
                goto L11b
            L114:
                r2.onNext(r15)
                r14 = 1
                long r12 = r12 + r14
                goto Lb6
            L11b:
                int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r0 == 0) goto L13b
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L13b
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 == 0) goto L132
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                long r7 = -r12
                r0.addAndGet(r7)
            L132:
                java.lang.Object r0 = r6.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r12)
            L13b:
                if (r14 == 0) goto L13f
                goto Lc
            L13f:
                int r0 = -r4
                int r4 = r1.addAndGet(r0)
                if (r4 != 0) goto Lc
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
                if (r0 != 0) goto L1a
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1a
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto L13
                r1.disposeInner()
            L13:
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1d:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.unique
                r2 = 1
                long r0 = r0 + r2
                r4.unique = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r2 = r4.active
                java.lang.Object r2 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r2 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r2
                if (r2 == 0) goto L19
                r2.cancel()
            L19:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2 = r4.mapper     // Catch: java.lang.Throwable -> L47
                java.lang.Object r5 = r2.apply(r5)     // Catch: java.lang.Throwable -> L47
                java.lang.String r2 = "The publisher returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r2)     // Catch: java.lang.Throwable -> L47
                org.reactivestreams.Publisher r5 = (org.reactivestreams.Publisher) r5     // Catch: java.lang.Throwable -> L47
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber
                int r3 = r4.bufferSize
                r2.<init>(r4, r0, r3)
            L2e:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r0 = r4.active
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) r0
                io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> r1 = io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.CANCELLED
                if (r0 != r1) goto L3b
                goto L46
            L3b:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapInnerSubscriber<T, R>> r1 = r4.active
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
                if (r0 == 0) goto L2e
                r5.subscribe(r2)
            L46:
                return
            L47:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                org.reactivestreams.Subscription r0 = r4.f308s
                r0.cancel()
                r4.onError(r5)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f308s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f308s = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r3)
                if (r0 == 0) goto L21
                java.util.concurrent.atomic.AtomicLong r0 = r2.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r3)
                long r3 = r2.unique
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L1e
                org.reactivestreams.Subscription r3 = r2.f308s
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                goto L21
            L1e:
                r2.drain()
            L21:
                return
        }
    }

    public FlowableSwitchMap(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.bufferSize = r3
            r0.delayErrors = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(r0, r6, r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap$SwitchMapSubscriber
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2 = r5.mapper
            int r3 = r5.bufferSize
            boolean r4 = r5.delayErrors
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
