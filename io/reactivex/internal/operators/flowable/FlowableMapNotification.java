package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMapNotification<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final java.util.concurrent.Callable<? extends R> onCompleteSupplier;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> onErrorMapper;
    final io.reactivex.functions.Function<? super T, ? extends R> onNextMapper;

    static final class MapNotificationSubscriber<T, R> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        final java.util.concurrent.Callable<? extends R> onCompleteSupplier;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> onErrorMapper;
        final io.reactivex.functions.Function<? super T, ? extends R> onNextMapper;

        MapNotificationSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends R> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> r3, java.util.concurrent.Callable<? extends R> r4) {
                r0 = this;
                r0.<init>(r1)
                r0.onNextMapper = r2
                r0.onErrorMapper = r3
                r0.onCompleteSupplier = r4
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                java.util.concurrent.Callable<? extends R> r0 = r2.onCompleteSupplier     // Catch: java.lang.Throwable -> L10
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L10
                java.lang.String r1 = "The onComplete publisher returned is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L10
                r2.complete(r0)
                return
            L10:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super R> r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> r0 = r5.onErrorMapper     // Catch: java.lang.Throwable -> L10
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L10
                java.lang.String r1 = "The onError publisher returned is null"
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
                io.reactivex.functions.Function<? super T, ? extends R> r0 = r4.onNextMapper     // Catch: java.lang.Throwable -> L19
                java.lang.Object r5 = r0.apply(r5)     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "The onNext publisher returned is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)     // Catch: java.lang.Throwable -> L19
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                r0.onNext(r5)
                return
            L19:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                r0.onError(r5)
                return
        }
    }

    public FlowableMapNotification(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends R> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> r3, java.util.concurrent.Callable<? extends R> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.onNextMapper = r2
            r0.onErrorMapper = r3
            r0.onCompleteSupplier = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableMapNotification$MapNotificationSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMapNotification$MapNotificationSubscriber
            io.reactivex.functions.Function<? super T, ? extends R> r2 = r5.onNextMapper
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> r3 = r5.onErrorMapper
            java.util.concurrent.Callable<? extends R> r4 = r5.onCompleteSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
