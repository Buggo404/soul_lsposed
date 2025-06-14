package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class CompletableAndThenPublisher<R> extends io.reactivex.Flowable<R> {
    final org.reactivestreams.Publisher<? extends R> other;
    final io.reactivex.CompletableSource source;

    static final class AndThenPublisherSubscriber<R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<R>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8948264376121066672L;
        final org.reactivestreams.Subscriber<? super R> downstream;
        org.reactivestreams.Publisher<? extends R> other;
        final java.util.concurrent.atomic.AtomicLong requested;
        io.reactivex.disposables.Disposable upstream;

        AndThenPublisherSubscriber(org.reactivestreams.Subscriber<? super R> r1, org.reactivestreams.Publisher<? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.other = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                r0.dispose()
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                org.reactivestreams.Publisher<? extends R> r0 = r2.other
                if (r0 != 0) goto La
                org.reactivestreams.Subscriber<? super R> r0 = r2.downstream
                r0.onComplete()
                goto L10
            La:
                r1 = 0
                r2.other = r1
                r0.subscribe(r2)
            L10:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.downstream
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.downstream
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.downstream
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r1, r0, r2)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r1, r0, r2)
                return
        }
    }

    public CompletableAndThenPublisher(io.reactivex.CompletableSource r1, org.reactivestreams.Publisher<? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r4) {
            r3 = this;
            io.reactivex.CompletableSource r0 = r3.source
            io.reactivex.internal.operators.mixed.CompletableAndThenPublisher$AndThenPublisherSubscriber r1 = new io.reactivex.internal.operators.mixed.CompletableAndThenPublisher$AndThenPublisherSubscriber
            org.reactivestreams.Publisher<? extends R> r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
