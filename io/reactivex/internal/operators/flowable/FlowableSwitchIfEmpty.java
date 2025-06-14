package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSwitchIfEmpty<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> other;

    static final class SwitchIfEmptySubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter arbiter;
        boolean empty;
        final org.reactivestreams.Publisher<? extends T> other;

        SwitchIfEmptySubscriber(org.reactivestreams.Subscriber<? super T> r1, org.reactivestreams.Publisher<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.other = r2
                r1 = 1
                r0.empty = r1
                io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
                r1.<init>()
                r0.arbiter = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.empty
                if (r0 == 0) goto Ld
                r0 = 0
                r1.empty = r0
                org.reactivestreams.Publisher<? extends T> r0 = r1.other
                r0.subscribe(r1)
                goto L12
            Ld:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            L12:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.empty
                if (r0 == 0) goto L7
                r0 = 0
                r1.empty = r0
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r1.arbiter
                r0.setSubscription(r2)
                return
        }
    }

    public FlowableSwitchIfEmpty(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty$SwitchIfEmptySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty$SwitchIfEmptySubscriber
            org.reactivestreams.Publisher<? extends T> r1 = r2.other
            r0.<init>(r3, r1)
            io.reactivex.internal.subscriptions.SubscriptionArbiter r1 = r0.arbiter
            r3.onSubscribe(r1)
            io.reactivex.Flowable<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
