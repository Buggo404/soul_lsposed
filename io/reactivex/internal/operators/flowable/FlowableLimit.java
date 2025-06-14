package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableLimit<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f269n;

    static final class LimitSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 2288246011222124525L;
        final org.reactivestreams.Subscriber<? super T> actual;
        long remaining;
        org.reactivestreams.Subscription upstream;

        LimitSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                r0.lazySet(r2)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r4 = this;
                long r0 = r4.remaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto Lf
                r4.remaining = r2
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                long r0 = r4.remaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L10
                r4.remaining = r2
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                goto L13
            L10:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L13:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r7) {
                r6 = this;
                long r0 = r6.remaining
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L20
                r4 = 1
                long r0 = r0 - r4
                r6.remaining = r0
                org.reactivestreams.Subscriber<? super T> r4 = r6.actual
                r4.onNext(r7)
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L20
                org.reactivestreams.Subscription r7 = r6.upstream
                r7.cancel()
                org.reactivestreams.Subscriber<? super T> r7 = r6.actual
                r7.onComplete()
            L20:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r5) {
                r4 = this;
                org.reactivestreams.Subscription r0 = r4.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r5)
                if (r0 == 0) goto L20
                long r0 = r4.remaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L19
                r5.cancel()
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                io.reactivex.internal.subscriptions.EmptySubscription.complete(r5)
                goto L20
            L19:
                r4.upstream = r5
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                r5.onSubscribe(r4)
            L20:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r7) {
                r6 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r7)
                if (r0 == 0) goto L25
            L6:
                long r0 = r6.get()
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L11
                goto L25
            L11:
                int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r2 > 0) goto L17
                r2 = r0
                goto L18
            L17:
                r2 = r7
            L18:
                long r4 = r0 - r2
                boolean r0 = r6.compareAndSet(r0, r4)
                if (r0 == 0) goto L6
                org.reactivestreams.Subscription r7 = r6.upstream
                r7.request(r2)
            L25:
                return
        }
    }

    public FlowableLimit(io.reactivex.Flowable<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f269n = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableLimit$LimitSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableLimit$LimitSubscriber
            long r2 = r4.f269n
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
