package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTakeUntilPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class InnerSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        org.reactivestreams.Subscription f313s;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f313s
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
                if (r0 != 0) goto Ld
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                goto L10
            Ld:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L10:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L2b
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                io.reactivex.functions.Predicate<? super T> r0 = r1.predicate     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r0.test(r2)     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L2b
                r2 = 1
                r1.done = r2
                org.reactivestreams.Subscription r2 = r1.f313s
                r2.cancel()
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onComplete()
                goto L2b
            L1f:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscription r0 = r1.f313s
                r0.cancel()
                r1.onError(r2)
            L2b:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f313s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f313s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f313s
                r0.request(r2)
                return
        }
    }

    public FlowableTakeUntilPredicate(io.reactivex.Flowable<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$InnerSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$InnerSubscriber
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
