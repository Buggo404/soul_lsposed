package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSingle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final boolean failOnEmpty;

    static final class SingleElementSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;

        /* renamed from: s */
        org.reactivestreams.Subscription f296s;

        SingleElementSubscriber(org.reactivestreams.Subscriber<? super T> r1, T r2, boolean r3) {
                r0 = this;
                r0.<init>(r1)
                r0.defaultValue = r2
                r0.failOnEmpty = r3
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f296s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                T r0 = r2.value
                r1 = 0
                r2.value = r1
                if (r0 != 0) goto L11
                T r0 = r2.defaultValue
            L11:
                if (r0 != 0) goto L28
                boolean r0 = r2.failOnEmpty
                if (r0 == 0) goto L22
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                goto L2b
            L22:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L2b
            L28:
                r2.complete(r0)
            L2b:
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
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                T r0 = r2.value
                if (r0 == 0) goto L1e
                r3 = 1
                r2.done = r3
                org.reactivestreams.Subscription r3 = r2.f296s
                r3.cancel()
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Sequence contains more than one element!"
                r0.<init>(r1)
                r3.onError(r0)
                return
            L1e:
                r2.value = r3
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f296s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f296s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableSingle(io.reactivex.Flowable<T> r1, T r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.defaultValue = r2
            r0.failOnEmpty = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableSingle$SingleElementSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSingle$SingleElementSubscriber
            T r2 = r4.defaultValue
            boolean r3 = r4.failOnEmpty
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
