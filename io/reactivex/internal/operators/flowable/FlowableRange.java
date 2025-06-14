package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRange extends io.reactivex.Flowable<java.lang.Integer> {
    final int end;
    final int start;

    static abstract class BaseRangeSubscription extends io.reactivex.internal.subscriptions.BasicQueueSubscription<java.lang.Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        BaseRangeSubscription(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.end = r2
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
                int r0 = r1.end
                r1.index = r0
                return
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
                r2 = this;
                int r0 = r2.index
                int r1 = r2.end
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final java.lang.Integer poll() {
                r2 = this;
                int r0 = r2.index
                int r1 = r2.end
                if (r0 != r1) goto L8
                r0 = 0
                return r0
            L8:
                int r1 = r0 + 1
                r2.index = r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                java.lang.Integer r0 = r1.poll()
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

    static final class RangeConditionalSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> actual;

        RangeConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
                r4 = this;
                int r0 = r4.end
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> r1 = r4.actual
                int r2 = r4.index
            L6:
                if (r2 == r0) goto L17
                boolean r3 = r4.cancelled
                if (r3 == 0) goto Ld
                return
            Ld:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r1.tryOnNext(r3)
                int r2 = r2 + 1
                goto L6
            L17:
                boolean r0 = r4.cancelled
                if (r0 == 0) goto L1c
                return
            L1c:
                r1.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long r10) {
                r9 = this;
                int r0 = r9.end
                int r1 = r9.index
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> r2 = r9.actual
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.cancelled
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.tryOnNext(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.cancelled
                if (r10 != 0) goto L2d
                r2.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.index = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
        }
    }

    static final class RangeSubscription extends io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final org.reactivestreams.Subscriber<? super java.lang.Integer> actual;

        RangeSubscription(org.reactivestreams.Subscriber<? super java.lang.Integer> r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
                r4 = this;
                int r0 = r4.end
                org.reactivestreams.Subscriber<? super java.lang.Integer> r1 = r4.actual
                int r2 = r4.index
            L6:
                if (r2 == r0) goto L17
                boolean r3 = r4.cancelled
                if (r3 == 0) goto Ld
                return
            Ld:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r1.onNext(r3)
                int r2 = r2 + 1
                goto L6
            L17:
                boolean r0 = r4.cancelled
                if (r0 == 0) goto L1c
                return
            L1c:
                r1.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long r10) {
                r9 = this;
                int r0 = r9.end
                int r1 = r9.index
                org.reactivestreams.Subscriber<? super java.lang.Integer> r2 = r9.actual
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.cancelled
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.cancelled
                if (r10 != 0) goto L2a
                r2.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.index = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
        }
    }

    public FlowableRange(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.start = r1
            int r1 = r1 + r2
            r0.end = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Integer> r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L14
            io.reactivex.internal.operators.flowable.FlowableRange$RangeConditionalSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableRange$RangeConditionalSubscription
            r1 = r5
            io.reactivex.internal.fuseable.ConditionalSubscriber r1 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r1
            int r2 = r4.start
            int r3 = r4.end
            r0.<init>(r1, r2, r3)
            r5.onSubscribe(r0)
            goto L20
        L14:
            io.reactivex.internal.operators.flowable.FlowableRange$RangeSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableRange$RangeSubscription
            int r1 = r4.start
            int r2 = r4.end
            r0.<init>(r5, r1, r2)
            r5.onSubscribe(r0)
        L20:
            return
    }
}
