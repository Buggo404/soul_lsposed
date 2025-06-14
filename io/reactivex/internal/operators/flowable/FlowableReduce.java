package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableReduce<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;

    static final class ReduceSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;

        /* renamed from: s */
        org.reactivestreams.Subscription f279s;

        ReduceSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.reducer = r2
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f279s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f279s = r0
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f279s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f279s = r0
                T r0 = r2.value
                if (r0 == 0) goto L13
                r2.complete(r0)
                goto L18
            L13:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
            L18:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f279s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            La:
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f279s = r0
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f279s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L7
                return
            L7:
                T r0 = r2.value
                if (r0 != 0) goto Le
                r2.value = r3
                goto L29
            Le:
                io.reactivex.functions.BiFunction<T, T, T> r1 = r2.reducer     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1d
                r2.value = r3     // Catch: java.lang.Throwable -> L1d
                goto L29
            L1d:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f279s
                r0.cancel()
                r2.onError(r3)
            L29:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f279s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f279s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableReduce(io.reactivex.Flowable<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.reducer = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableReduce$ReduceSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableReduce$ReduceSubscriber
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.reducer
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
