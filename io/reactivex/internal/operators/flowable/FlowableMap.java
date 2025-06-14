package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> mapper;

    static final class MapConditionalSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super U> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mapper = r2
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
                if (r0 == 0) goto L10
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Function<? super T, ? extends U> r0 = r1.mapper     // Catch: java.lang.Throwable -> L22
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r0 = "The mapper function returned a null value."
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L22
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L22:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public U poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f523qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L15
                io.reactivex.functions.Function<? super T, ? extends U> r1 = r2.mapper
                java.lang.Object r0 = r1.apply(r0)
                java.lang.String r1 = "The mapper function returned a null value."
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L6
                r2 = 0
                return r2
            L6:
                io.reactivex.functions.Function<? super T, ? extends U> r0 = r1.mapper     // Catch: java.lang.Throwable -> L19
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "The mapper function returned a null value."
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L19
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                boolean r2 = r0.tryOnNext(r2)
                return r2
            L19:
                r2 = move-exception
                r1.fail(r2)
                r2 = 1
                return r2
        }
    }

    static final class MapSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapSubscriber(org.reactivestreams.Subscriber<? super U> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mapper = r2
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
                if (r0 == 0) goto L10
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Function<? super T, ? extends U> r0 = r1.mapper     // Catch: java.lang.Throwable -> L22
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r0 = "The mapper function returned a null value."
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L22
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L22:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public U poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f525qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L15
                io.reactivex.functions.Function<? super T, ? extends U> r1 = r2.mapper
                java.lang.Object r0 = r1.apply(r0)
                java.lang.String r1 = "The mapper function returned a null value."
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public FlowableMap(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L13
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableMap$MapConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMap$MapConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r4 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r4
            io.reactivex.functions.Function<? super T, ? extends U> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            goto L1f
        L13:
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber
            io.reactivex.functions.Function<? super T, ? extends U> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
        L1f:
            return
    }
}
