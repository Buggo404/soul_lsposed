package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFlatMapPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> mapper;
    final io.reactivex.SingleSource<T> source;

    static final class SingleFlatMapPublisherObserver<S, T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.SingleObserver<S>, io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7759721921468635667L;
        final org.reactivestreams.Subscriber<? super T> actual;
        io.reactivex.disposables.Disposable disposable;
        final io.reactivex.functions.Function<? super S, ? extends org.reactivestreams.Publisher<? extends T>> mapper;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> parent;

        SingleFlatMapPublisherObserver(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super S, ? extends org.reactivestreams.Publisher<? extends T>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.parent = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.disposable
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.parent
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                r0.disposable = r1
                org.reactivestreams.Subscriber<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.parent
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S r2) {
                r1 = this;
                io.reactivex.functions.Function<? super S, ? extends org.reactivestreams.Publisher<? extends T>> r0 = r1.mapper     // Catch: java.lang.Throwable -> L12
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L12
                java.lang.String r0 = "the mapper returned a null Publisher"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L12
                org.reactivestreams.Publisher r2 = (org.reactivestreams.Publisher) r2     // Catch: java.lang.Throwable -> L12
                r2.subscribe(r1)
                return
            L12:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.parent
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r2)
                return
        }
    }

    public SingleFlatMapPublisher(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleFlatMapPublisher$SingleFlatMapPublisherObserver r1 = new io.reactivex.internal.operators.single.SingleFlatMapPublisher$SingleFlatMapPublisherObserver
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
