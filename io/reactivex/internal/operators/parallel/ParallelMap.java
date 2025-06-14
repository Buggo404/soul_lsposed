package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends R> mapper;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    static final class ParallelMapConditionalSubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> actual;
        boolean done;
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;

        /* renamed from: s */
        org.reactivestreams.Subscription f488s;

        ParallelMapConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f488s
                r0.cancel()
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
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onComplete()
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
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r1.mapper     // Catch: java.lang.Throwable -> L17
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = "The mapper returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L17
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L17:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.cancel()
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f488s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f488s = r2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f488s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r2.mapper     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "The mapper returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L19
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r2.actual
                boolean r3 = r0.tryOnNext(r3)
                return r3
            L19:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                r2.onError(r3)
                return r1
        }
    }

    static final class ParallelMapSubscriber<T, R> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> actual;
        boolean done;
        final io.reactivex.functions.Function<? super T, ? extends R> mapper;

        /* renamed from: s */
        org.reactivestreams.Subscription f489s;

        ParallelMapSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f489s
                r0.cancel()
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
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
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
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r1.mapper     // Catch: java.lang.Throwable -> L17
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = "The mapper returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L17
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L17:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.cancel()
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f489s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f489s = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f489s
                r0.request(r2)
                return
        }
    }

    public ParallelMap(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable<T> r0 = r1.source
            int r0 = r0.parallelism()
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super R>[] r7) {
            r6 = this;
            boolean r0 = r6.validate(r7)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r7.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2b
            r3 = r7[r2]
            boolean r4 = r3 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r4 == 0) goto L1f
            io.reactivex.internal.operators.parallel.ParallelMap$ParallelMapConditionalSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelMap$ParallelMapConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r3 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r3
            io.reactivex.functions.Function<? super T, ? extends R> r5 = r6.mapper
            r4.<init>(r3, r5)
            r1[r2] = r4
            goto L28
        L1f:
            io.reactivex.internal.operators.parallel.ParallelMap$ParallelMapSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelMap$ParallelMapSubscriber
            io.reactivex.functions.Function<? super T, ? extends R> r5 = r6.mapper
            r4.<init>(r3, r5)
            r1[r2] = r4
        L28:
            int r2 = r2 + 1
            goto Lb
        L2b:
            io.reactivex.parallel.ParallelFlowable<T> r7 = r6.source
            r7.subscribe(r1)
            return
    }
}
