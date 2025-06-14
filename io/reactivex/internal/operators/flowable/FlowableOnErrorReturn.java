package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableOnErrorReturn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    static final class OnErrorReturnSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

        OnErrorReturnSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.valueSupplier = r2
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r0 = r5.valueSupplier     // Catch: java.lang.Throwable -> L10
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L10
                java.lang.String r1 = "The valueSupplier returned a null value"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L10
                r5.complete(r6)
                return
            L10:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super R> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                r0.onNext(r5)
                return
        }
    }

    public FlowableOnErrorReturn(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.valueSupplier = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableOnErrorReturn$OnErrorReturnSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableOnErrorReturn$OnErrorReturnSubscriber
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2 = r3.valueSupplier
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
