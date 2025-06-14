package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDoAfterNext<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> onAfterNext;

    static final class DoAfterConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super T> onAfterNext;

        DoAfterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.onAfterNext = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                int r0 = r1.sourceMode
                if (r0 != 0) goto L13
                io.reactivex.functions.Consumer<? super T> r0 = r1.onAfterNext     // Catch: java.lang.Throwable -> Lf
                r0.accept(r2)     // Catch: java.lang.Throwable -> Lf
                goto L13
            Lf:
                r2 = move-exception
                r1.fail(r2)
            L13:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f523qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto Ld
                io.reactivex.functions.Consumer<? super T> r1 = r2.onAfterNext
                r1.accept(r0)
            Ld:
                return r0
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
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r2.actual
                boolean r0 = r0.tryOnNext(r3)
                io.reactivex.functions.Consumer<? super T> r1 = r2.onAfterNext     // Catch: java.lang.Throwable -> Lc
                r1.accept(r3)     // Catch: java.lang.Throwable -> Lc
                goto L10
            Lc:
                r3 = move-exception
                r2.fail(r3)
            L10:
                return r0
        }
    }

    static final class DoAfterSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super T> onAfterNext;

        DoAfterSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.onAfterNext = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                int r0 = r1.sourceMode
                if (r0 != 0) goto L18
                io.reactivex.functions.Consumer<? super T> r0 = r1.onAfterNext     // Catch: java.lang.Throwable -> L14
                r0.accept(r2)     // Catch: java.lang.Throwable -> L14
                goto L18
            L14:
                r2 = move-exception
                r1.fail(r2)
            L18:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f525qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto Ld
                io.reactivex.functions.Consumer<? super T> r1 = r2.onAfterNext
                r1.accept(r0)
            Ld:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public FlowableDoAfterNext(io.reactivex.Flowable<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onAfterNext = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L13
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableDoAfterNext$DoAfterConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoAfterNext$DoAfterConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r4 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r4
            io.reactivex.functions.Consumer<? super T> r2 = r3.onAfterNext
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            goto L1f
        L13:
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableDoAfterNext$DoAfterSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoAfterNext$DoAfterSubscriber
            io.reactivex.functions.Consumer<? super T> r2 = r3.onAfterNext
            r1.<init>(r4, r2)
            r0.subscribe(r1)
        L1f:
            return
    }
}
