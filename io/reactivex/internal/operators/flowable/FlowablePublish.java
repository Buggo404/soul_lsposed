package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowablePublish<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
    final org.reactivestreams.Publisher<T> onSubscribe;
    final io.reactivex.Flowable<T> source;

    static final class FlowablePublisher<T> implements org.reactivestreams.Publisher<T> {
        private final int bufferSize;
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> curr;

        FlowablePublisher(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.curr = r1
                r0.bufferSize = r2
                return
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(org.reactivestreams.Subscriber<? super T> r6) {
                r5 = this;
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber
                r0.<init>(r6)
                r6.onSubscribe(r0)
            L8:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r6 = r5.curr
                java.lang.Object r6 = r6.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r6 = (io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber) r6
                if (r6 == 0) goto L18
                boolean r1 = r6.isDisposed()
                if (r1 == 0) goto L2b
            L18:
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r5.curr
                int r3 = r5.bufferSize
                r1.<init>(r2, r3)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r5.curr
                boolean r6 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r6, r1)
                if (r6 != 0) goto L2a
                goto L8
            L2a:
                r6 = r1
            L2b:
                boolean r1 = r6.add(r0)
                if (r1 == 0) goto L8
                long r1 = r0.get()
                r3 = -9223372036854775808
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L3f
                r6.remove(r0)
                goto L41
            L3f:
                r0.parent = r6
            L41:
                r6.dispatch()
                return
        }
    }

    static final class InnerSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.Subscriber<? super T> child;
        long emitted;
        volatile io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> parent;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1c
                long r0 = r4.getAndSet(r2)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1c
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T> r0 = r4.parent
                if (r0 == 0) goto L1c
                r0.remove(r4)
                r0.dispatch()
            L1c:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L10
                io.reactivex.internal.util.BackpressureHelper.addCancel(r1, r2)
                io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T> r2 = r1.parent
                if (r2 == 0) goto L10
                r2.dispatch()
            L10:
                return
        }
    }

    static final class PublishSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] TERMINATED = null;
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> current;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> queue;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> f276s;
        final java.util.concurrent.atomic.AtomicBoolean shouldConnect;
        int sourceMode;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[]> subscribers;
        volatile java.lang.Object terminalEvent;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r0]
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED = r0
                return
        }

        PublishSubscriber(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> r3, int r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r2.f276s = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY
                r0.<init>(r1)
                r2.subscribers = r0
                r2.current = r3
                java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                r3.<init>()
                r2.shouldConnect = r3
                r2.bufferSize = r4
                return
        }

        boolean add(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r3 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r1 = r4.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        boolean checkTerminated(java.lang.Object r5, boolean r6) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L51
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2a
                if (r6 == 0) goto L51
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r5 = r4.current
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r5, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r5 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                java.lang.Object r5 = r5.getAndSet(r6)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r5 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r5
                int r6 = r5.length
            L1d:
                if (r0 >= r6) goto L29
                r1 = r5[r0]
                org.reactivestreams.Subscriber<? super T> r1 = r1.child
                r1.onComplete()
                int r0 = r0 + 1
                goto L1d
            L29:
                return r3
            L2a:
                java.lang.Throwable r5 = io.reactivex.internal.util.NotificationLite.getError(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r6 = r4.current
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r6, r4, r2)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r6 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                java.lang.Object r6 = r6.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r6 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r6
                int r1 = r6.length
                if (r1 == 0) goto L4d
                int r1 = r6.length
            L41:
                if (r0 >= r1) goto L50
                r2 = r6[r0]
                org.reactivestreams.Subscriber<? super T> r2 = r2.child
                r2.onError(r5)
                int r0 = r0 + 1
                goto L41
            L4d:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L50:
                return r3
            L51:
                return r0
        }

        void dispatch() {
                r25 = this;
                r1 = r25
                int r0 = r25.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r2 = r1.subscribers
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                r3 = 1
                r4 = r0
                r5 = r3
            L14:
                java.lang.Object r0 = r1.terminalEvent
                io.reactivex.internal.fuseable.SimpleQueue<T> r6 = r1.queue
                if (r6 == 0) goto L23
                boolean r8 = r6.isEmpty()
                if (r8 == 0) goto L21
                goto L23
            L21:
                r8 = 0
                goto L24
            L23:
                r8 = r3
            L24:
                boolean r0 = r1.checkTerminated(r0, r8)
                if (r0 == 0) goto L2b
                return
            L2b:
                if (r8 != 0) goto L146
                int r0 = r4.length
                int r9 = r4.length
                r12 = 0
                r13 = 0
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L36:
                r16 = -9223372036854775808
                if (r12 >= r9) goto L52
                r7 = r4[r12]
                long r18 = r7.get()
                int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r16 == 0) goto L4d
                long r10 = r7.emitted
                long r10 = r18 - r10
                long r14 = java.lang.Math.min(r14, r10)
                goto L4f
            L4d:
                int r13 = r13 + 1
            L4f:
                int r12 = r12 + 1
                goto L36
            L52:
                r9 = 1
                if (r0 != r13) goto L90
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r7 = r6.poll()     // Catch: java.lang.Throwable -> L5d
                goto L74
            L5d:
                r0 = move-exception
                r6 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f276s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.error(r6)
                r1.terminalEvent = r0
                r7 = 0
            L74:
                if (r7 != 0) goto L78
                r7 = r3
                goto L79
            L78:
                r7 = 0
            L79:
                boolean r0 = r1.checkTerminated(r0, r7)
                if (r0 == 0) goto L80
                return
            L80:
                int r0 = r1.sourceMode
                if (r0 == r3) goto L14
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f276s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r9)
                goto L14
            L90:
                r11 = 0
            L91:
                long r12 = (long) r11
                int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r0 >= 0) goto L128
                java.lang.Object r0 = r1.terminalEvent
                java.lang.Object r8 = r6.poll()     // Catch: java.lang.Throwable -> L9d
                goto Lb4
            L9d:
                r0 = move-exception
                r8 = r0
                io.reactivex.exceptions.Exceptions.throwIfFatal(r8)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f276s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.cancel()
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.error(r8)
                r1.terminalEvent = r0
                r8 = 0
            Lb4:
                if (r8 != 0) goto Lb8
                r7 = r3
                goto Lb9
            Lb8:
                r7 = 0
            Lb9:
                boolean r0 = r1.checkTerminated(r0, r7)
                if (r0 == 0) goto Lc0
                return
            Lc0:
                if (r7 == 0) goto Lc5
                r8 = r7
                goto L128
            Lc5:
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r8)
                int r8 = r4.length
                r12 = 0
                r13 = 0
            Lcc:
                if (r12 >= r8) goto L107
                r3 = r4[r12]
                long r22 = r3.get()
                int r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
                if (r24 == 0) goto Lf5
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r22 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
                if (r22 == 0) goto Leb
                r22 = r6
                r23 = r7
                long r6 = r3.emitted
                long r6 = r6 + r9
                r3.emitted = r6
                goto Lef
            Leb:
                r22 = r6
                r23 = r7
            Lef:
                org.reactivestreams.Subscriber<? super T> r3 = r3.child
                r3.onNext(r0)
                goto Lff
            Lf5:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r13 = 1
            Lff:
                int r12 = r12 + 1
                r6 = r22
                r7 = r23
                r3 = 1
                goto Lcc
            L107:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = r11 + 1
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                if (r13 != 0) goto L124
                if (r0 == r4) goto L11d
                goto L124
            L11d:
                r6 = r22
                r8 = r23
                r3 = 1
                goto L91
            L124:
                r4 = r0
                r3 = 1
                goto L14
            L128:
                if (r11 <= 0) goto L13b
                int r0 = r1.sourceMode
                r3 = 1
                if (r0 == r3) goto L13c
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.f276s
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                r0.request(r12)
                goto L13c
            L13b:
                r3 = 1
            L13c:
                r6 = 0
                int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r0 == 0) goto L146
                if (r8 != 0) goto L146
                goto L14
            L146:
                int r0 = -r5
                int r5 = r1.addAndGet(r0)
                if (r5 != 0) goto L14e
                return
            L14e:
                java.lang.Object r0 = r2.get()
                r4 = r0
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r4 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r4
                goto L14
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                if (r0 == r1) goto L1f
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r2.current
                r1 = 0
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r2, r1)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.f276s
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            L1f:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r2.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.TERMINATED
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                java.lang.Object r0 = r1.terminalEvent
                if (r0 != 0) goto Ld
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r1.terminalEvent = r0
                r1.dispatch()
            Ld:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Object r0 = r1.terminalEvent
                if (r0 != 0) goto Le
                java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
                r1.terminalEvent = r2
                r1.dispatch()
                goto L11
            Le:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L11:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L17
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L17
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Prefetch queue is full?!"
                r2.<init>(r0)
                r1.onError(r2)
                return
            L17:
                r1.dispatch()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.f276s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4)
                if (r0 == 0) goto L42
                boolean r0 = r4 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L33
                r0 = r4
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r1 = 3
                int r1 = r0.requestFusion(r1)
                r2 = 1
                if (r1 != r2) goto L25
                r3.sourceMode = r1
                r3.queue = r0
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.complete()
                r3.terminalEvent = r4
                r3.dispatch()
                return
            L25:
                r2 = 2
                if (r1 != r2) goto L33
                r3.sourceMode = r1
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
                return
            L33:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r3.bufferSize
                r0.<init>(r1)
                r3.queue = r0
                int r0 = r3.bufferSize
                long r0 = (long) r0
                r4.request(r0)
            L42:
                return
        }

        void remove(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                goto L3d
            Lc:
                r2 = 0
                r3 = r2
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                return
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r1 = io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber[] r5 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$InnerSubscriber<T>[]> r2 = r6.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
            L3d:
                return
        }
    }

    private FlowablePublish(org.reactivestreams.Publisher<T> r1, io.reactivex.Flowable<T> r2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.onSubscribe = r1
            r0.source = r2
            r0.current = r3
            r0.bufferSize = r4
            return
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> r3, int r4) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.operators.flowable.FlowablePublish$FlowablePublisher r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$FlowablePublisher
            r1.<init>(r0, r4)
            io.reactivex.internal.operators.flowable.FlowablePublish r2 = new io.reactivex.internal.operators.flowable.FlowablePublish
            r2.<init>(r1, r3, r0, r4)
            io.reactivex.flowables.ConnectableFlowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r0 = r4.current
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L23
        L10:
            io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.current
            int r3 = r4.bufferSize
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish$PublishSubscriber<T>> r2 = r4.current
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 != 0) goto L22
            goto L0
        L22:
            r0 = r1
        L23:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L36
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L36
            r2 = r3
        L36:
            r5.accept(r0)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            io.reactivex.Flowable<T> r5 = r4.source
            r5.subscribe(r0)
        L40:
            return
        L41:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            java.lang.RuntimeException r5 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r5)
            throw r5
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
            r1 = this;
            io.reactivex.Flowable<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            org.reactivestreams.Publisher<T> r0 = r1.onSubscribe
            r0.subscribe(r2)
            return
    }
}
