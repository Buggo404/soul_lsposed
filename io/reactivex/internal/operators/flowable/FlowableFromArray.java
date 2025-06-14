package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFromArray<T> extends io.reactivex.Flowable<T> {
    final T[] array;

    static final class ArrayConditionalSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;

        ArrayConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, T[] r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
                r5 = this;
                T[] r0 = r5.array
                int r1 = r0.length
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r5.actual
                int r3 = r5.index
            L7:
                if (r3 == r1) goto L23
                boolean r4 = r5.cancelled
                if (r4 == 0) goto Le
                return
            Le:
                r4 = r0[r3]
                if (r4 != 0) goto L1d
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "array element is null"
                r0.<init>(r1)
                r2.onError(r0)
                return
            L1d:
                r2.tryOnNext(r4)
                int r3 = r3 + 1
                goto L7
            L23:
                boolean r0 = r5.cancelled
                if (r0 == 0) goto L28
                return
            L28:
                r2.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void slowPath(long r11) {
                r10 = this;
                T[] r0 = r10.array
                int r1 = r0.length
                int r2 = r10.index
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r3 = r10.actual
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L30
                if (r2 == r1) goto L30
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                boolean r8 = r3.tryOnNext(r8)
                if (r8 == 0) goto L2d
                r8 = 1
                long r6 = r6 + r8
            L2d:
                int r2 = r2 + 1
                goto La
            L30:
                if (r2 != r1) goto L3a
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L39
                r3.onComplete()
            L39:
                return
            L3a:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.index = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
        }
    }

    static final class ArraySubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super T> actual;

        ArraySubscription(org.reactivestreams.Subscriber<? super T> r1, T[] r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
                r5 = this;
                T[] r0 = r5.array
                int r1 = r0.length
                org.reactivestreams.Subscriber<? super T> r2 = r5.actual
                int r3 = r5.index
            L7:
                if (r3 == r1) goto L23
                boolean r4 = r5.cancelled
                if (r4 == 0) goto Le
                return
            Le:
                r4 = r0[r3]
                if (r4 != 0) goto L1d
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "array element is null"
                r0.<init>(r1)
                r2.onError(r0)
                return
            L1d:
                r2.onNext(r4)
                int r3 = r3 + 1
                goto L7
            L23:
                boolean r0 = r5.cancelled
                if (r0 == 0) goto L28
                return
            L28:
                r2.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void slowPath(long r11) {
                r10 = this;
                T[] r0 = r10.array
                int r1 = r0.length
                int r2 = r10.index
                org.reactivestreams.Subscriber<? super T> r3 = r10.actual
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L2d
                if (r2 == r1) goto L2d
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L24
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "array element is null"
                r11.<init>(r12)
                r3.onError(r11)
                return
            L24:
                r3.onNext(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L2d:
                if (r2 != r1) goto L37
                boolean r11 = r10.cancelled
                if (r11 != 0) goto L36
                r3.onComplete()
            L36:
                return
            L37:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.index = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
        }
    }

    static abstract class BaseArraySubscription<T> extends io.reactivex.internal.subscriptions.BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        BaseArraySubscription(T[] r1) {
                r0 = this;
                r0.<init>()
                r0.array = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
                r1 = this;
                T[] r0 = r1.array
                int r0 = r0.length
                r1.index = r0
                return
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
                r2 = this;
                int r0 = r2.index
                T[] r1 = r2.array
                int r1 = r1.length
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
                r3 = this;
                int r0 = r3.index
                T[] r1 = r3.array
                int r2 = r1.length
                if (r0 != r2) goto L9
                r0 = 0
                return r0
            L9:
                int r2 = r0 + 1
                r3.index = r2
                r0 = r1[r0]
                java.lang.String r1 = "array element is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r5) {
                r4 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r5)
                if (r0 == 0) goto L20
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r4, r5)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L20
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 != 0) goto L1d
                r4.fastPath()
                goto L20
            L1d:
                r4.slowPath(r5)
            L20:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int r1) {
                r0 = this;
                r1 = r1 & 1
                return r1
        }

        abstract void slowPath(long r1);
    }

    public FlowableFromArray(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L12
            io.reactivex.internal.operators.flowable.FlowableFromArray$ArrayConditionalSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableFromArray$ArrayConditionalSubscription
            r1 = r4
            io.reactivex.internal.fuseable.ConditionalSubscriber r1 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r1
            T[] r2 = r3.array
            r0.<init>(r1, r2)
            r4.onSubscribe(r0)
            goto L1c
        L12:
            io.reactivex.internal.operators.flowable.FlowableFromArray$ArraySubscription r0 = new io.reactivex.internal.operators.flowable.FlowableFromArray$ArraySubscription
            T[] r1 = r3.array
            r0.<init>(r4, r1)
            r4.onSubscribe(r0)
        L1c:
            return
    }
}
