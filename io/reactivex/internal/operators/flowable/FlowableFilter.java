package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFilter<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class FilterConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Predicate<? super T> filter;

        FilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.filter = r2
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
                r4 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r4.f523qs
                io.reactivex.functions.Predicate<? super T> r1 = r4.filter
            L4:
                java.lang.Object r2 = r0.poll()
                if (r2 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                boolean r3 = r1.test(r2)
                if (r3 == 0) goto L13
                return r2
            L13:
                int r2 = r4.sourceMode
                r3 = 2
                if (r2 != r3) goto L4
                r2 = 1
                r0.request(r2)
                goto L4
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r4) {
                r3 = this;
                boolean r0 = r3.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                int r0 = r3.sourceMode
                if (r0 == 0) goto L12
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r4 = r3.actual
                r0 = 0
                boolean r4 = r4.tryOnNext(r0)
                return r4
            L12:
                r0 = 1
                io.reactivex.functions.Predicate<? super T> r2 = r3.filter     // Catch: java.lang.Throwable -> L25
                boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L25
                if (r2 == 0) goto L24
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r3.actual
                boolean r4 = r2.tryOnNext(r4)
                if (r4 == 0) goto L24
                r1 = r0
            L24:
                return r1
            L25:
                r4 = move-exception
                r3.fail(r4)
                return r0
        }
    }

    static final class FilterSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        final io.reactivex.functions.Predicate<? super T> filter;

        FilterSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.filter = r2
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
                r4 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r4.f525qs
                io.reactivex.functions.Predicate<? super T> r1 = r4.filter
            L4:
                java.lang.Object r2 = r0.poll()
                if (r2 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                boolean r3 = r1.test(r2)
                if (r3 == 0) goto L13
                return r2
            L13:
                int r2 = r4.sourceMode
                r3 = 2
                if (r2 != r3) goto L4
                r2 = 1
                r0.request(r2)
                goto L4
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L6
                r3 = 0
                return r3
            L6:
                int r0 = r2.sourceMode
                r1 = 1
                if (r0 == 0) goto L12
                org.reactivestreams.Subscriber<? super R> r3 = r2.actual
                r0 = 0
                r3.onNext(r0)
                return r1
            L12:
                io.reactivex.functions.Predicate<? super T> r0 = r2.filter     // Catch: java.lang.Throwable -> L20
                boolean r0 = r0.test(r3)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1f
                org.reactivestreams.Subscriber<? super R> r1 = r2.actual
                r1.onNext(r3)
            L1f:
                return r0
            L20:
                r3 = move-exception
                r2.fail(r3)
                return r1
        }
    }

    public FlowableFilter(io.reactivex.Flowable<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L13
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableFilter$FilterConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFilter$FilterConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r4 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r4
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            goto L1f
        L13:
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableFilter$FilterSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFilter$FilterSubscriber
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
        L1f:
            return
    }
}
