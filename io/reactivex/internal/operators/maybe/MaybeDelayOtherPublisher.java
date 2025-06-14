package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDelayOtherPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    static final class DelayMaybeObserver<T, U> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {

        /* renamed from: d */
        io.reactivex.disposables.Disposable f337d;
        final io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher.OtherSubscriber<T> other;
        final org.reactivestreams.Publisher<U> otherSource;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> r2, org.reactivestreams.Publisher<U> r3) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber r0 = new io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber
                r0.<init>(r2)
                r1.other = r0
                r1.otherSource = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f337d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f337d = r0
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r0 = r1.other
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f337d = r0
                r1.subscribeNext()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f337d = r0
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r0 = r1.other
                r0.error = r2
                r1.subscribeNext()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f337d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L11
                r1.f337d = r2
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r2 = r1.other
                io.reactivex.MaybeObserver<? super T> r2 = r2.actual
                r2.onSubscribe(r1)
            L11:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f337d = r0
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r0 = r1.other
                r0.value = r2
                r1.subscribeNext()
                return
        }

        void subscribeNext() {
                r2 = this;
                org.reactivestreams.Publisher<U> r0 = r2.otherSource
                io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$OtherSubscriber<T> r1 = r2.other
                r0.subscribe(r1)
                return
        }
    }

    static final class OtherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final io.reactivex.MaybeObserver<? super T> actual;
        java.lang.Throwable error;
        T value;

        OtherSubscriber(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto La
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onError(r0)
                goto L19
            La:
                T r0 = r2.value
                if (r0 == 0) goto L14
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L19
            L14:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L19:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                java.lang.Throwable r0 = r5.error
                if (r0 != 0) goto La
                io.reactivex.MaybeObserver<? super T> r0 = r5.actual
                r0.onError(r6)
                goto L1d
            La:
                io.reactivex.MaybeObserver<? super T> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r6
                r2.<init>(r3)
                r1.onError(r2)
            L1d:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r2 = r1.get()
                org.reactivestreams.Subscription r2 = (org.reactivestreams.Subscription) r2
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r2 == r0) goto L15
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.lazySet(r0)
                r2.cancel()
                r1.onComplete()
            L15:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }
    }

    public MaybeDelayOtherPublisher(io.reactivex.MaybeSource<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$DelayMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher$DelayMaybeObserver
            org.reactivestreams.Publisher<U> r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
