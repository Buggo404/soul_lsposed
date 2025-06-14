package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableRetryWhen<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> handler;

    static final class RetryWhenSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber<T, java.lang.Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.FlowableProcessor<java.lang.Throwable> r2, org.reactivestreams.Subscription r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.receiver
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.again(r1)
                return
        }
    }

    public FlowableRetryWhen(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.handler = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r6)
            r1 = 8
            io.reactivex.processors.UnicastProcessor r1 = io.reactivex.processors.UnicastProcessor.create(r1)
            io.reactivex.processors.FlowableProcessor r1 = r1.toSerialized()
            io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2 = r5.handler     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.apply(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "handler returned a null Publisher"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L3a
            org.reactivestreams.Publisher r2 = (org.reactivestreams.Publisher) r2     // Catch: java.lang.Throwable -> L3a
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver r3 = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenReceiver
            io.reactivex.Flowable<T> r4 = r5.source
            r3.<init>(r4)
            io.reactivex.internal.operators.flowable.FlowableRetryWhen$RetryWhenSubscriber r4 = new io.reactivex.internal.operators.flowable.FlowableRetryWhen$RetryWhenSubscriber
            r4.<init>(r0, r1, r3)
            r3.subscriber = r4
            r6.onSubscribe(r4)
            r2.subscribe(r3)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.onNext(r6)
            return
        L3a:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
    }
}
