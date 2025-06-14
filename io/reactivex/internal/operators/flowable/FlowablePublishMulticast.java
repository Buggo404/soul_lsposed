package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> selector;

    static final class MulticastProcessor<T> extends io.reactivex.Flowable<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] TERMINATED = null;
        int consumed;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final int limit;
        final int prefetch;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f277s;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> subscribers;
        final java.util.concurrent.atomic.AtomicInteger wip;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r0]
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED = r0
                return
        }

        MulticastProcessor(int r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r1.prefetch = r2
                int r0 = r2 >> 2
                int r2 = r2 - r0
                r1.limit = r2
                r1.delayError = r3
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r2.<init>()
                r1.wip = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.f277s = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r3 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY
                r2.<init>(r3)
                r1.subscribers = r2
                return
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r3 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r1 = r4.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        void completeAll() {
                r8 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r8.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                long r4 = r3.get()
                r6 = -9223372036854775808
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L1f
                org.reactivestreams.Subscriber<? super T> r3 = r3.actual
                r3.onComplete()
            L1f:
                int r2 = r2 + 1
                goto Lc
            L22:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f277s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L14
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                if (r0 == 0) goto L14
                r0.clear()
            L14:
                return
        }

        void drain() {
                r24 = this;
                r1 = r24
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto Lb
                return
            Lb:
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                int r2 = r1.consumed
                int r3 = r1.limit
                int r4 = r1.sourceMode
                r6 = 1
                if (r4 == r6) goto L18
                r4 = r6
                goto L19
            L18:
                r4 = 0
            L19:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r7 = r1.subscribers
                java.lang.Object r8 = r7.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r8 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r8
                r9 = r6
            L22:
                int r10 = r8.length
                if (r0 == 0) goto L128
                if (r10 == 0) goto L128
                int r11 = r8.length
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r15 = r12
                r14 = 0
            L2f:
                r17 = -9223372036854775808
                if (r14 >= r11) goto L52
                r5 = r8[r14]
                long r19 = r5.get()
                r21 = r7
                long r6 = r5.emitted
                long r19 = r19 - r6
                int r5 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
                if (r5 == 0) goto L4a
                int r5 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
                if (r5 <= 0) goto L4c
                r15 = r19
                goto L4c
            L4a:
                int r10 = r10 + (-1)
            L4c:
                int r14 = r14 + 1
                r7 = r21
                r6 = 1
                goto L2f
            L52:
                r21 = r7
                r5 = 0
                if (r10 != 0) goto L59
                r15 = r5
            L59:
                int r7 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r7 == 0) goto Lf8
                boolean r10 = r24.isDisposed()
                if (r10 == 0) goto L67
                r0.clear()
                return
            L67:
                boolean r10 = r1.done
                if (r10 == 0) goto L77
                boolean r11 = r1.delayError
                if (r11 != 0) goto L77
                java.lang.Throwable r11 = r1.error
                if (r11 == 0) goto L77
                r1.errorAll(r11)
                return
            L77:
                java.lang.Object r11 = r0.poll()     // Catch: java.lang.Throwable -> Lea
                if (r11 != 0) goto L7f
                r14 = 1
                goto L80
            L7f:
                r14 = 0
            L80:
                if (r10 == 0) goto L90
                if (r14 == 0) goto L90
                java.lang.Throwable r0 = r1.error
                if (r0 == 0) goto L8c
                r1.errorAll(r0)
                goto L8f
            L8c:
                r24.completeAll()
            L8f:
                return
            L90:
                if (r14 == 0) goto L93
                goto Lf8
            L93:
                int r7 = r8.length
                r10 = 0
                r14 = 0
            L96:
                r19 = 1
                if (r10 >= r7) goto Lbf
                r5 = r8[r10]
                long r22 = r5.get()
                int r6 = (r22 > r17 ? 1 : (r22 == r17 ? 0 : -1))
                if (r6 == 0) goto Lb4
                int r6 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
                if (r6 == 0) goto Lae
                long r12 = r5.emitted
                long r12 = r12 + r19
                r5.emitted = r12
            Lae:
                org.reactivestreams.Subscriber<? super T> r5 = r5.actual
                r5.onNext(r11)
                goto Lb5
            Lb4:
                r14 = 1
            Lb5:
                int r10 = r10 + 1
                r5 = 0
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L96
            Lbf:
                long r15 = r15 - r19
                if (r4 == 0) goto Ld4
                int r2 = r2 + 1
                if (r2 != r3) goto Ld4
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.f277s
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                long r5 = (long) r3
                r2.request(r5)
                r2 = 0
            Ld4:
                java.lang.Object r5 = r21.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r5 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r5
                if (r14 != 0) goto Le8
                if (r5 == r8) goto Ldf
                goto Le8
            Ldf:
                r5 = 0
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L59
            Le8:
                r8 = r5
                goto L141
            Lea:
                r0 = move-exception
                r2 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f277s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r1.errorAll(r2)
                return
            Lf8:
                if (r7 != 0) goto L12a
                boolean r5 = r24.isDisposed()
                if (r5 == 0) goto L104
                r0.clear()
                return
            L104:
                boolean r5 = r1.done
                if (r5 == 0) goto L114
                boolean r6 = r1.delayError
                if (r6 != 0) goto L114
                java.lang.Throwable r6 = r1.error
                if (r6 == 0) goto L114
                r1.errorAll(r6)
                return
            L114:
                if (r5 == 0) goto L12a
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto L12a
                java.lang.Throwable r0 = r1.error
                if (r0 == 0) goto L124
                r1.errorAll(r0)
                goto L127
            L124:
                r24.completeAll()
            L127:
                return
            L128:
                r21 = r7
            L12a:
                r1.consumed = r2
                java.util.concurrent.atomic.AtomicInteger r5 = r1.wip
                int r6 = -r9
                int r9 = r5.addAndGet(r6)
                if (r9 != 0) goto L136
                return
            L136:
                if (r0 != 0) goto L13a
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
            L13a:
                java.lang.Object r5 = r21.get()
                r8 = r5
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r8 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r8
            L141:
                r7 = r21
                r6 = 1
                goto L22
        }

        void errorAll(java.lang.Throwable r9) {
                r8 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r8.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
                int r1 = r0.length
                r2 = 0
            Lc:
                if (r2 >= r1) goto L22
                r3 = r0[r2]
                long r4 = r3.get()
                r6 = -9223372036854775808
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L1f
                org.reactivestreams.Subscriber<? super T> r3 = r3.actual
                r3.onError(r9)
            L1f:
                int r2 = r2 + 1
                goto Lc
            L22:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f277s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto La
                r0 = 1
                r1.done = r0
                r1.drain()
            La:
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
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 != 0) goto L25
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L25
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.f277s
                java.lang.Object r2 = r2.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L25:
                r1.drain()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.f277s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4)
                if (r0 == 0) goto L3b
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L2e
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L21
                r3.sourceMode = r1
                r3.queue = r0
                r3.done = r2
                r3.drain()
                return
            L21:
                r2 = 2
                if (r1 != r2) goto L2e
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.prefetch
                io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
                return
            L2e:
                int r0 = r3.prefetch
                io.reactivex.internal.fuseable.SimpleQueue r0 = io.reactivex.internal.util.QueueDrainHelper.createQueue(r0)
                r3.queue = r0
                int r0 = r3.prefetch
                io.reactivex.internal.util.QueueDrainHelper.request(r4, r0)
            L3b:
                return
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[]) r0
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
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r1 = io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor.EMPTY
                goto L31
            L22:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription[] r5 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L31:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription<T>[]> r2 = r6.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
                return
        }

        @Override // io.reactivex.Flowable
        protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastSubscription
                r0.<init>(r3, r2)
                r3.onSubscribe(r0)
                boolean r1 = r2.add(r0)
                if (r1 == 0) goto L1c
                boolean r3 = r0.isCancelled()
                if (r3 == 0) goto L18
                r2.remove(r0)
                return
            L18:
                r2.drain()
                goto L27
            L1c:
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto L24
                r3.onError(r0)
                goto L27
            L24:
                r3.onComplete()
            L27:
                return
        }
    }

    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long emitted;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> parent;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                r0 = -9223372036854775808
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L14
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<T> r0 = r4.parent
                r0.remove(r4)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<T> r0 = r4.parent
                r0.drain()
            L14:
                return
        }

        public boolean isCancelled() {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                io.reactivex.internal.util.BackpressureHelper.addCancel(r1, r2)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<T> r2 = r1.parent
                r2.drain()
            Le:
                return
        }
    }

    static final class OutputCanceller<R> implements io.reactivex.FlowableSubscriber<R>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> actual;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> processor;

        /* renamed from: s */
        org.reactivestreams.Subscription f278s;

        OutputCanceller(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.processor = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f278s
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r0 = r1.processor
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r0 = r1.processor
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor<?> r2 = r1.processor
                r2.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f278s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f278s = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f278s
                r0.request(r2)
                return
        }
    }

    public FlowablePublishMulticast(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.selector = r2
            r0.prefetch = r3
            r0.delayError = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r4) {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$MulticastProcessor
            int r1 = r3.prefetch
            boolean r2 = r3.delayError
            r0.<init>(r1, r2)
            io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> r1 = r3.selector     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "selector returned a null Publisher"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L25
            org.reactivestreams.Publisher r1 = (org.reactivestreams.Publisher) r1     // Catch: java.lang.Throwable -> L25
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast$OutputCanceller r2 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast$OutputCanceller
            r2.<init>(r4, r0)
            r1.subscribe(r2)
            io.reactivex.Flowable<T> r4 = r3.source
            r4.subscribe(r0)
            return
        L25:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r4)
            return
    }
}
