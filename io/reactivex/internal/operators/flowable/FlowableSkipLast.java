package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSkipLast<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int skip;

    static final class SkipLastSubscriber<T> extends java.util.ArrayDeque<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3807491841935125653L;
        final org.reactivestreams.Subscriber<? super T> actual;

        /* renamed from: s */
        org.reactivestreams.Subscription f301s;
        final int skip;

        SkipLastSubscriber(org.reactivestreams.Subscriber<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                r0.skip = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f301s
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
        public void onNext(T r4) {
                r3 = this;
                int r0 = r3.skip
                int r1 = r3.size()
                if (r0 != r1) goto L12
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                java.lang.Object r1 = r3.poll()
                r0.onNext(r1)
                goto L19
            L12:
                org.reactivestreams.Subscription r0 = r3.f301s
                r1 = 1
                r0.request(r1)
            L19:
                r3.offer(r4)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f301s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f301s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f301s
                r0.request(r2)
                return
        }
    }

    public FlowableSkipLast(io.reactivex.Flowable<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.skip = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSkipLast$SkipLastSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkipLast$SkipLastSubscriber
            int r2 = r3.skip
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
