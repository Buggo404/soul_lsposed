package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableAny<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class AnySubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Boolean> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        boolean done;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        org.reactivestreams.Subscription f216s;

        AnySubscriber(org.reactivestreams.Subscriber<? super java.lang.Boolean> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.predicate = r2
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f216s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lf
                r0 = 1
                r1.done = r0
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.complete(r0)
            Lf:
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
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
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
                io.reactivex.functions.Predicate<? super T> r0 = r1.predicate     // Catch: java.lang.Throwable -> L1d
                boolean r2 = r0.test(r2)     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L1c
                r2 = 1
                r1.done = r2
                org.reactivestreams.Subscription r0 = r1.f216s
                r0.cancel()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.complete(r2)
            L1c:
                return
            L1d:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscription r0 = r1.f216s
                r0.cancel()
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f216s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f216s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableAny(io.reactivex.Flowable<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Boolean> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableAny$AnySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableAny$AnySubscriber
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
