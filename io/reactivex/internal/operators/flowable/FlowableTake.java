package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTake<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long limit;

    static final class TakeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5636543848937116287L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final long limit;
        long remaining;
        org.reactivestreams.Subscription subscription;

        TakeSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.limit = r2
                r0.remaining = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.subscription
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L12
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscription r0 = r1.subscription
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                goto L15
            L12:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L15:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 != 0) goto L28
                long r0 = r6.remaining
                r2 = 1
                long r2 = r0 - r2
                r6.remaining = r2
                r4 = 0
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 <= 0) goto L28
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                org.reactivestreams.Subscriber<? super T> r1 = r6.actual
                r1.onNext(r7)
                if (r0 == 0) goto L28
                org.reactivestreams.Subscription r7 = r6.subscription
                r7.cancel()
                r6.onComplete()
            L28:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r5) {
                r4 = this;
                org.reactivestreams.Subscription r0 = r4.subscription
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r5)
                if (r0 == 0) goto L23
                r4.subscription = r5
                long r0 = r4.limit
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L1e
                r5.cancel()
                r5 = 1
                r4.done = r5
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                io.reactivex.internal.subscriptions.EmptySubscription.complete(r5)
                goto L23
            L1e:
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                r5.onSubscribe(r4)
            L23:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r3)
                if (r0 != 0) goto L7
                return
            L7:
                boolean r0 = r2.get()
                if (r0 != 0) goto L26
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L26
                long r0 = r2.limit
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L26
                org.reactivestreams.Subscription r3 = r2.subscription
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                return
            L26:
                org.reactivestreams.Subscription r0 = r2.subscription
                r0.request(r3)
                return
        }
    }

    public FlowableTake(io.reactivex.Flowable<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.limit = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber
            long r2 = r4.limit
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
