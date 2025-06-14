package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelSortedJoin<T> extends io.reactivex.Flowable<T> {
    final java.util.Comparator<? super T> comparator;
    final io.reactivex.parallel.ParallelFlowable<java.util.List<T>> source;

    static final class SortedJoinInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.util.List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int index;
        final io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> parent;

        SortedJoinInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        void cancel() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription<T> r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                r0.onNext(r1)
                return
        }

        public void onNext(java.util.List<T> r3) {
                r2 = this;
                io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription<T> r0 = r2.parent
                int r1 = r2.index
                r0.innerNext(r3, r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }
    }

    static final class SortedJoinSubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3481980673745556697L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final java.util.Comparator<? super T> comparator;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final int[] indexes;
        final java.util.List<T>[] lists;
        final java.util.concurrent.atomic.AtomicInteger remaining;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T>[] subscribers;

        SortedJoinSubscription(org.reactivestreams.Subscriber<? super T> r2, int r3, java.util.Comparator<? super T> r4) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.remaining = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.error = r0
                r1.actual = r2
                r1.comparator = r4
                io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber[] r2 = new io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber[r3]
                r4 = 0
            L1f:
                if (r4 >= r3) goto L2b
                io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber r0 = new io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber
                r0.<init>(r1, r4)
                r2[r4] = r0
                int r4 = r4 + 1
                goto L1f
            L2b:
                r1.subscribers = r2
                java.util.List[] r2 = new java.util.List[r3]
                r1.lists = r2
                int[] r2 = new int[r3]
                r1.indexes = r2
                java.util.concurrent.atomic.AtomicInteger r2 = r1.remaining
                r2.lazySet(r3)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L16
                r0 = 1
                r2.cancelled = r0
                r2.cancelAll()
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L16
                java.util.List<T>[] r0 = r2.lists
                r1 = 0
                java.util.Arrays.fill(r0, r1)
            L16:
                return
        }

        void cancelAll() {
                r4 = this;
                io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] r0 = r4.subscribers
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
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                java.util.List<T>[] r3 = r1.lists
                int[] r0 = r1.indexes
                int r4 = r0.length
                r6 = 1
            L11:
                java.util.concurrent.atomic.AtomicLong r7 = r1.requested
                long r7 = r7.get()
                r11 = 0
            L19:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                r15 = 0
                if (r13 == 0) goto La2
                boolean r13 = r1.cancelled
                if (r13 == 0) goto L26
                java.util.Arrays.fill(r3, r15)
                return
            L26:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r13 = r1.error
                java.lang.Object r13 = r13.get()
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto L3a
                r16.cancelAll()
                java.util.Arrays.fill(r3, r15)
                r2.onError(r13)
                return
            L3a:
                r13 = -1
                r9 = r15
                r14 = 0
            L3d:
                if (r14 >= r4) goto L8a
                r10 = r3[r14]
                r5 = r0[r14]
                int r15 = r10.size()
                if (r15 == r5) goto L86
                if (r9 != 0) goto L51
                java.lang.Object r9 = r10.get(r5)
            L4f:
                r13 = r14
                goto L86
            L51:
                java.lang.Object r5 = r10.get(r5)
                java.util.Comparator<? super T> r10 = r1.comparator     // Catch: java.lang.Throwable -> L64
                int r10 = r10.compare(r9, r5)     // Catch: java.lang.Throwable -> L64
                if (r10 <= 0) goto L5f
                r10 = 1
                goto L60
            L5f:
                r10 = 0
            L60:
                if (r10 == 0) goto L86
                r9 = r5
                goto L4f
            L64:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r16.cancelAll()
                r4 = 0
                java.util.Arrays.fill(r3, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.error
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r3, r4, r0)
                if (r3 != 0) goto L7a
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L7a:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r2.onError(r0)
                return
            L86:
                int r14 = r14 + 1
                r15 = 0
                goto L3d
            L8a:
                if (r9 != 0) goto L94
                r5 = 0
                java.util.Arrays.fill(r3, r5)
                r2.onComplete()
                return
            L94:
                r2.onNext(r9)
                r5 = r0[r13]
                r9 = 1
                int r5 = r5 + r9
                r0[r13] = r5
                r13 = 1
                long r11 = r11 + r13
                goto L19
            La2:
                r9 = 1
                if (r13 != 0) goto Le0
                boolean r5 = r1.cancelled
                if (r5 == 0) goto Lae
                r5 = 0
                java.util.Arrays.fill(r3, r5)
                return
            Lae:
                r5 = 0
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r10 = r1.error
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto Lc3
                r16.cancelAll()
                java.util.Arrays.fill(r3, r5)
                r2.onError(r10)
                return
            Lc3:
                r5 = 0
            Lc4:
                if (r5 >= r4) goto Ld5
                r10 = r0[r5]
                r13 = r3[r5]
                int r13 = r13.size()
                if (r10 == r13) goto Ld2
                r14 = 0
                goto Ld6
            Ld2:
                int r5 = r5 + 1
                goto Lc4
            Ld5:
                r14 = r9
            Ld6:
                if (r14 == 0) goto Le0
                r5 = 0
                java.util.Arrays.fill(r3, r5)
                r2.onComplete()
                return
            Le0:
                r13 = 0
                int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r5 == 0) goto Lf5
                r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r5 == 0) goto Lf5
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r7 = -r11
                r5.addAndGet(r7)
            Lf5:
                int r5 = r16.get()
                if (r5 != r6) goto L103
                int r5 = -r6
                int r5 = r1.addAndGet(r5)
                if (r5 != 0) goto L103
                return
            L103:
                r6 = r5
                goto L11
        }

        void innerError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                r1 = 0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r3)
                if (r0 == 0) goto Ld
                r2.drain()
                goto L18
            Ld:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                java.lang.Object r0 = r0.get()
                if (r3 == r0) goto L18
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L18:
                return
        }

        void innerNext(java.util.List<T> r2, int r3) {
                r1 = this;
                java.util.List<T>[] r0 = r1.lists
                r0[r3] = r2
                java.util.concurrent.atomic.AtomicInteger r2 = r1.remaining
                int r2 = r2.decrementAndGet()
                if (r2 != 0) goto Lf
                r1.drain()
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L16
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.remaining
                int r2 = r2.get()
                if (r2 != 0) goto L16
                r1.drain()
            L16:
                return
        }
    }

    public ParallelSortedJoin(io.reactivex.parallel.ParallelFlowable<java.util.List<T>> r1, java.util.Comparator<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.comparator = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription r0 = new io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinSubscription
            io.reactivex.parallel.ParallelFlowable<java.util.List<T>> r1 = r3.source
            int r1 = r1.parallelism()
            java.util.Comparator<? super T> r2 = r3.comparator
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            io.reactivex.parallel.ParallelFlowable<java.util.List<T>> r4 = r3.source
            io.reactivex.internal.operators.parallel.ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] r0 = r0.subscribers
            r4.subscribe(r0)
            return
    }
}
