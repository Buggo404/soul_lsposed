package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> state;

    static final class CacheState<T> extends io.reactivex.internal.util.LinkedArrayList implements io.reactivex.FlowableSubscriber<T> {
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] EMPTY = null;
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] TERMINATED = null;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> connection;
        volatile boolean isConnected;
        final io.reactivex.Flowable<T> source;
        boolean sourceDone;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T>[]> subscribers;

        static {
                r0 = 0
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableCache.CacheState.EMPTY = r1
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r0]
                io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED = r0
                return
        }

        CacheState(io.reactivex.Flowable<T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r0.connection = r2
                r0.source = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r2 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.EMPTY
                r1.<init>(r2)
                r0.subscribers = r1
                return
        }

        public boolean addChild(io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r4.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r3 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r1 = r4.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        public void connect() {
                r1 = this;
                io.reactivex.Flowable<T> r0 = r1.source
                r0.subscribe(r1)
                r0 = 1
                r1.isConnected = r0
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                boolean r0 = r4.sourceDone
                if (r0 != 0) goto L29
                r0 = 1
                r4.sourceDone = r0
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r4.add(r0)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.connection
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r4.subscribers
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                int r1 = r0.length
                r2 = 0
            L1f:
                if (r2 >= r1) goto L29
                r3 = r0[r2]
                r3.replay()
                int r2 = r2 + 1
                goto L1f
            L29:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L29
                r0 = 1
                r3.sourceDone = r0
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)
                r3.add(r4)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.connection
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r4 = r3.subscribers
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.TERMINATED
                java.lang.Object r4 = r4.getAndSet(r0)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r4 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r4
                int r0 = r4.length
                r1 = 0
            L1f:
                if (r1 >= r0) goto L2c
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L1f
            L29:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L2c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L1f
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.next(r4)
                r3.add(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r4 = r3.subscribers
                java.lang.Object r4 = r4.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r4 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r4
                int r0 = r4.length
                r1 = 0
            L15:
                if (r1 >= r0) goto L1f
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L15
            L1f:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r3.connection
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r4, r1)
                return
        }

        public void removeChild(io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r6.subscribers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                return
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
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r1 = io.reactivex.internal.operators.flowable.FlowableCache.CacheState.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r5 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r2 = r6.subscribers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
                return
        }
    }

    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -2557562030197141021L;
        final org.reactivestreams.Subscriber<? super T> child;
        java.lang.Object[] currentBuffer;
        int currentIndexInBuffer;
        long emitted;
        int index;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> state;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> r2) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                r0.state = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r5 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r5.requested
                r1 = -9223372036854775808
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L11
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r5.state
                r0.removeChild(r5)
            L11:
                return
        }

        public void replay() {
                r19 = this;
                r0 = r19
                int r1 = r19.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super T> r1 = r0.child
                java.util.concurrent.atomic.AtomicLong r2 = r0.requested
                long r3 = r0.emitted
                r5 = 1
                r6 = r5
            L11:
                long r7 = r2.get()
                r9 = -9223372036854775808
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 != 0) goto L1c
                return
            L1c:
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r11 = r0.state
                int r11 = r11.size()
                if (r11 == 0) goto L8e
                java.lang.Object[] r12 = r0.currentBuffer
                if (r12 != 0) goto L30
                io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r12 = r0.state
                java.lang.Object[] r12 = r12.head()
                r0.currentBuffer = r12
            L30:
                int r13 = r12.length
                int r13 = r13 - r5
                int r14 = r0.index
                int r15 = r0.currentIndexInBuffer
            L36:
                if (r14 >= r11) goto L61
                int r16 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r16 == 0) goto L61
                long r16 = r2.get()
                int r16 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
                if (r16 != 0) goto L45
                return
            L45:
                if (r15 != r13) goto L4e
                r12 = r12[r13]
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                r15 = 0
            L4e:
                r5 = r12[r15]
                boolean r5 = io.reactivex.internal.util.NotificationLite.accept(r5, r1)
                if (r5 == 0) goto L57
                return
            L57:
                int r15 = r15 + 1
                int r14 = r14 + 1
                r17 = 1
                long r3 = r3 + r17
                r5 = 1
                goto L36
            L61:
                long r17 = r2.get()
                int r5 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
                if (r5 != 0) goto L6a
                return
            L6a:
                int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r5 != 0) goto L88
                r5 = r12[r15]
                boolean r7 = io.reactivex.internal.util.NotificationLite.isComplete(r5)
                if (r7 == 0) goto L7a
                r1.onComplete()
                return
            L7a:
                boolean r7 = io.reactivex.internal.util.NotificationLite.isError(r5)
                if (r7 == 0) goto L88
                java.lang.Throwable r2 = io.reactivex.internal.util.NotificationLite.getError(r5)
                r1.onError(r2)
                return
            L88:
                r0.index = r14
                r0.currentIndexInBuffer = r15
                r0.currentBuffer = r12
            L8e:
                r0.emitted = r3
                int r5 = -r6
                int r6 = r0.addAndGet(r5)
                if (r6 != 0) goto L98
                return
            L98:
                r5 = 1
                goto L11
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.addCancel(r0, r2)
                r1.replay()
            Le:
                return
        }
    }

    public FlowableCache(io.reactivex.Flowable<T> r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState r0 = new io.reactivex.internal.operators.flowable.FlowableCache$CacheState
            r0.<init>(r2, r3)
            r1.state = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r1.once = r2
            return
    }

    int cachedEventCount() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            int r0 = r0.size()
            return r0
    }

    boolean hasSubscribers() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription<T>[]> r0 = r0.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription[] r0 = (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    boolean isConnected() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r0 = r1.state
            boolean r0 = r0.isConnected
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r8) {
            r7 = this;
            io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription r0 = new io.reactivex.internal.operators.flowable.FlowableCache$ReplaySubscription
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r1 = r7.state
            r0.<init>(r8, r1)
            r8.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r8 = r7.state
            boolean r8 = r8.addChild(r0)
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L27
            java.util.concurrent.atomic.AtomicLong r8 = r0.requested
            long r3 = r8.get()
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L27
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r8 = r7.state
            r8.removeChild(r0)
            r8 = r1
            goto L28
        L27:
            r8 = r2
        L28:
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.once
            boolean r3 = r3.get()
            if (r3 != 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.once
            boolean r1 = r3.compareAndSet(r1, r2)
            if (r1 == 0) goto L3d
            io.reactivex.internal.operators.flowable.FlowableCache$CacheState<T> r1 = r7.state
            r1.connect()
        L3d:
            if (r8 == 0) goto L42
            r0.replay()
        L42:
            return
    }
}
