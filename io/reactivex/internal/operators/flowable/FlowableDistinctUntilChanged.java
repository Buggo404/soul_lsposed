package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    static final class DistinctUntilChangedConditionalSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final io.reactivex.functions.Function<? super T, K> keySelector;
        K last;

        DistinctUntilChangedConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Function<? super T, K> r2, io.reactivex.functions.BiPredicate<? super K, ? super K> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.keySelector = r2
                r0.comparer = r3
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto Ld
                org.reactivestreams.Subscription r3 = r2.f524s
                r0 = 1
                r3.request(r0)
            Ld:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r5 = this;
            L0:
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r5.f523qs
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                io.reactivex.functions.Function<? super T, K> r1 = r5.keySelector
                java.lang.Object r1 = r1.apply(r0)
                boolean r2 = r5.hasValue
                r3 = 1
                if (r2 != 0) goto L1a
                r5.hasValue = r3
                r5.last = r1
                return r0
            L1a:
                io.reactivex.functions.BiPredicate<? super K, ? super K> r2 = r5.comparer
                K r4 = r5.last
                boolean r2 = r2.test(r4, r1)
                if (r2 != 0) goto L27
                r5.last = r1
                return r0
            L27:
                r5.last = r1
                int r0 = r5.sourceMode
                if (r0 == r3) goto L0
                org.reactivestreams.Subscription r0 = r5.f524s
                r1 = 1
                r0.request(r1)
                goto L0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                int r0 = r5.sourceMode
                if (r0 == 0) goto L11
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r5.actual
                boolean r6 = r0.tryOnNext(r6)
                return r6
            L11:
                r0 = 1
                io.reactivex.functions.Function<? super T, K> r2 = r5.keySelector     // Catch: java.lang.Throwable -> L33
                java.lang.Object r2 = r2.apply(r6)     // Catch: java.lang.Throwable -> L33
                boolean r3 = r5.hasValue     // Catch: java.lang.Throwable -> L33
                if (r3 == 0) goto L29
                io.reactivex.functions.BiPredicate<? super K, ? super K> r3 = r5.comparer     // Catch: java.lang.Throwable -> L33
                K r4 = r5.last     // Catch: java.lang.Throwable -> L33
                boolean r3 = r3.test(r4, r2)     // Catch: java.lang.Throwable -> L33
                r5.last = r2     // Catch: java.lang.Throwable -> L33
                if (r3 == 0) goto L2d
                return r1
            L29:
                r5.hasValue = r0     // Catch: java.lang.Throwable -> L33
                r5.last = r2     // Catch: java.lang.Throwable -> L33
            L2d:
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r1 = r5.actual
                r1.onNext(r6)
                return r0
            L33:
                r6 = move-exception
                r5.fail(r6)
                return r0
        }
    }

    static final class DistinctUntilChangedSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final io.reactivex.functions.Function<? super T, K> keySelector;
        K last;

        DistinctUntilChangedSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super T, K> r2, io.reactivex.functions.BiPredicate<? super K, ? super K> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.keySelector = r2
                r0.comparer = r3
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto Ld
                org.reactivestreams.Subscription r3 = r2.f526s
                r0 = 1
                r3.request(r0)
            Ld:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r5 = this;
            L0:
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r5.f525qs
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                io.reactivex.functions.Function<? super T, K> r1 = r5.keySelector
                java.lang.Object r1 = r1.apply(r0)
                boolean r2 = r5.hasValue
                r3 = 1
                if (r2 != 0) goto L1a
                r5.hasValue = r3
                r5.last = r1
                return r0
            L1a:
                io.reactivex.functions.BiPredicate<? super K, ? super K> r2 = r5.comparer
                K r4 = r5.last
                boolean r2 = r2.test(r4, r1)
                if (r2 != 0) goto L27
                r5.last = r1
                return r0
            L27:
                r5.last = r1
                int r0 = r5.sourceMode
                if (r0 == r3) goto L0
                org.reactivestreams.Subscription r0 = r5.f526s
                r1 = 1
                r0.request(r1)
                goto L0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                int r0 = r5.sourceMode
                r2 = 1
                if (r0 == 0) goto L11
                org.reactivestreams.Subscriber<? super R> r0 = r5.actual
                r0.onNext(r6)
                return r2
            L11:
                io.reactivex.functions.Function<? super T, K> r0 = r5.keySelector     // Catch: java.lang.Throwable -> L32
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L32
                boolean r3 = r5.hasValue     // Catch: java.lang.Throwable -> L32
                if (r3 == 0) goto L28
                io.reactivex.functions.BiPredicate<? super K, ? super K> r3 = r5.comparer     // Catch: java.lang.Throwable -> L32
                K r4 = r5.last     // Catch: java.lang.Throwable -> L32
                boolean r3 = r3.test(r4, r0)     // Catch: java.lang.Throwable -> L32
                r5.last = r0     // Catch: java.lang.Throwable -> L32
                if (r3 == 0) goto L2c
                return r1
            L28:
                r5.hasValue = r2     // Catch: java.lang.Throwable -> L32
                r5.last = r0     // Catch: java.lang.Throwable -> L32
            L2c:
                org.reactivestreams.Subscriber<? super R> r0 = r5.actual
                r0.onNext(r6)
                return r2
            L32:
                r6 = move-exception
                r5.fail(r6)
                return r2
        }
    }

    public FlowableDistinctUntilChanged(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, K> r2, io.reactivex.functions.BiPredicate<? super K, ? super K> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.keySelector = r2
            r0.comparer = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L15
            io.reactivex.internal.fuseable.ConditionalSubscriber r5 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r5
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$DistinctUntilChangedConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$DistinctUntilChangedConditionalSubscriber
            io.reactivex.functions.Function<? super T, K> r2 = r4.keySelector
            io.reactivex.functions.BiPredicate<? super K, ? super K> r3 = r4.comparer
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            goto L23
        L15:
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$DistinctUntilChangedSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged$DistinctUntilChangedSubscriber
            io.reactivex.functions.Function<? super T, K> r2 = r4.keySelector
            io.reactivex.functions.BiPredicate<? super K, ? super K> r3 = r4.comparer
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
        L23:
            return
    }
}
