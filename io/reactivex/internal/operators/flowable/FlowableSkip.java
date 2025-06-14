package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSkip<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f299n;

    static final class SkipSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        long remaining;

        /* renamed from: s */
        org.reactivestreams.Subscription f300s;

        SkipSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f300s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
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
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.remaining
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto Le
                r2 = 1
                long r0 = r0 - r2
                r4.remaining = r0
                goto L13
            Le:
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
            L13:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r4) {
                r3 = this;
                org.reactivestreams.Subscription r0 = r3.f300s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r4)
                if (r0 == 0) goto L14
                long r0 = r3.remaining
                r3.f300s = r4
                org.reactivestreams.Subscriber<? super T> r2 = r3.actual
                r2.onSubscribe(r3)
                r4.request(r0)
            L14:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f300s
                r0.request(r2)
                return
        }
    }

    public FlowableSkip(io.reactivex.Flowable<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f299n = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableSkip$SkipSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkip$SkipSubscriber
            long r2 = r4.f299n
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
