package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFromIterable<T> extends io.reactivex.Flowable<T> {
    final java.lang.Iterable<? extends T> source;

    static abstract class BaseRangeSubscription<T> extends io.reactivex.internal.subscriptions.BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;

        /* renamed from: it */
        java.util.Iterator<? extends T> f259it;
        boolean once;

        BaseRangeSubscription(java.util.Iterator<? extends T> r1) {
                r0 = this;
                r0.<init>()
                r0.f259it = r1
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
                r0 = 0
                r1.f259it = r0
                return
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
                r1 = this;
                java.util.Iterator<? extends T> r0 = r1.f259it
                if (r0 == 0) goto Ld
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
                r3 = this;
                java.util.Iterator<? extends T> r0 = r3.f259it
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                boolean r2 = r3.once
                if (r2 != 0) goto Le
                r0 = 1
                r3.once = r0
                goto L15
            Le:
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L15
                return r1
            L15:
                java.util.Iterator<? extends T> r0 = r3.f259it
                java.lang.Object r0 = r0.next()
                java.lang.String r1 = "Iterator.next() returned a null value"
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

    static final class IteratorConditionalSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;

        IteratorConditionalSubscription(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, java.util.Iterator<? extends T> r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
                r4 = this;
                java.util.Iterator<? extends T> r0 = r4.f259it
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r4.actual
            L4:
                boolean r2 = r4.cancelled
                if (r2 == 0) goto L9
                return
            L9:
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3d
                boolean r3 = r4.cancelled
                if (r3 == 0) goto L12
                return
            L12:
                if (r2 != 0) goto L1f
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "Iterator.next() returned a null value"
                r0.<init>(r2)
                r1.onError(r0)
                return
            L1f:
                r1.tryOnNext(r2)
                boolean r2 = r4.cancelled
                if (r2 == 0) goto L27
                return
            L27:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L35
                if (r2 != 0) goto L4
                boolean r0 = r4.cancelled
                if (r0 != 0) goto L34
                r1.onComplete()
            L34:
                return
            L35:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
            L3d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void slowPath(long r9) {
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f259it
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r8.actual
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.tryOnNext(r6)
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3c
                r1.onComplete()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
        }
    }

    static final class IteratorSubscription<T> extends io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final org.reactivestreams.Subscriber<? super T> actual;

        IteratorSubscription(org.reactivestreams.Subscriber<? super T> r1, java.util.Iterator<? extends T> r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void fastPath() {
                r4 = this;
                java.util.Iterator<? extends T> r0 = r4.f259it
                org.reactivestreams.Subscriber<? super T> r1 = r4.actual
            L4:
                boolean r2 = r4.cancelled
                if (r2 == 0) goto L9
                return
            L9:
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3d
                boolean r3 = r4.cancelled
                if (r3 == 0) goto L12
                return
            L12:
                if (r2 != 0) goto L1f
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "Iterator.next() returned a null value"
                r0.<init>(r2)
                r1.onError(r0)
                return
            L1f:
                r1.onNext(r2)
                boolean r2 = r4.cancelled
                if (r2 == 0) goto L27
                return
            L27:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L35
                if (r2 != 0) goto L4
                boolean r0 = r4.cancelled
                if (r0 != 0) goto L34
                r1.onComplete()
            L34:
                return
            L35:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
            L3d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        void slowPath(long r9) {
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f259it
                org.reactivestreams.Subscriber<? super T> r1 = r8.actual
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.cancelled
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.cancelled
                if (r9 != 0) goto L3b
                r1.onComplete()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
        }
    }

    public FlowableFromIterable(java.lang.Iterable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    public static <T> void subscribe(org.reactivestreams.Subscriber<? super T> r2, java.util.Iterator<? extends T> r3) {
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto La
            io.reactivex.internal.subscriptions.EmptySubscription.complete(r2)
            return
        La:
            boolean r0 = r2 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L1a
            io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorConditionalSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorConditionalSubscription
            r1 = r2
            io.reactivex.internal.fuseable.ConditionalSubscriber r1 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r1
            r0.<init>(r1, r3)
            r2.onSubscribe(r0)
            goto L22
        L1a:
            io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription r0 = new io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription
            r0.<init>(r2, r3)
            r2.onSubscribe(r0)
        L22:
            return
        L23:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r3, r2)
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            java.lang.Iterable<? extends T> r0 = r1.source     // Catch: java.lang.Throwable -> La
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La
            subscribe(r2, r0)
            return
        La:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r2)
            return
    }
}
