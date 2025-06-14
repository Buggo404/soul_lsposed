package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSkipWhile<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class SkipWhileSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean notSkipping;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        org.reactivestreams.Subscription f304s;

        SkipWhileSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f304s
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
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.notSkipping
                if (r0 == 0) goto La
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
                goto L22
            La:
                io.reactivex.functions.Predicate<? super T> r0 = r2.predicate     // Catch: java.lang.Throwable -> L23
                boolean r0 = r0.test(r3)     // Catch: java.lang.Throwable -> L23
                if (r0 == 0) goto L1a
                org.reactivestreams.Subscription r3 = r2.f304s
                r0 = 1
                r3.request(r0)
                goto L22
            L1a:
                r0 = 1
                r2.notSkipping = r0
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
            L22:
                return
            L23:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f304s
                r0.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f304s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f304s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f304s
                r0.request(r2)
                return
        }
    }

    public FlowableSkipWhile(io.reactivex.Flowable<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableSkipWhile$SkipWhileSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSkipWhile$SkipWhileSubscriber
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
