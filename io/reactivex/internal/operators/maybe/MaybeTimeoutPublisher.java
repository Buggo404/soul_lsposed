package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeTimeoutPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> fallback;
    final org.reactivestreams.Publisher<U> other;

    static final class TimeoutFallbackMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.MaybeObserver<? super T> actual;

        TimeoutFallbackMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    static final class TimeoutMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.MaybeSource<? extends T> fallback;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutOtherMaybeObserver<T, U> other;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutFallbackMaybeObserver<T> otherObserver;

        TimeoutMainMaybeObserver(io.reactivex.MaybeObserver<? super T> r2, io.reactivex.MaybeSource<? extends T> r3) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver
                r0.<init>(r1)
                r1.other = r0
                r1.fallback = r3
                if (r3 == 0) goto L16
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver r3 = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver
                r3.<init>(r2)
                goto L17
            L16:
                r3 = 0
            L17:
                r1.otherObserver = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver<T> r0 = r1.otherObserver
                if (r0 == 0) goto Lf
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            Lf:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L15
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L18:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L14:
                return
        }

        public void otherComplete() {
                r2 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                if (r0 == 0) goto L1a
                io.reactivex.MaybeSource<? extends T> r0 = r2.fallback
                if (r0 != 0) goto L15
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
                r1.<init>()
                r0.onError(r1)
                goto L1a
            L15:
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver<T> r1 = r2.otherObserver
                r0.subscribe(r1)
            L1a:
                return
        }

        public void otherError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r0 == 0) goto Lc
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }
    }

    static final class TimeoutOtherMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver<T, U> parent;

        TimeoutOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver<T, U> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> r0 = r1.parent
                r0.otherComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> r0 = r1.parent
                r0.otherError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r1) {
                r0 = this;
                java.lang.Object r1 = r0.get()
                org.reactivestreams.Subscription r1 = (org.reactivestreams.Subscription) r1
                r1.cancel()
                io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> r1 = r0.parent
                r1.otherComplete()
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

    public MaybeTimeoutPublisher(io.reactivex.MaybeSource<T> r1, org.reactivestreams.Publisher<U> r2, io.reactivex.MaybeSource<? extends T> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.fallback = r3
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutMainMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutMainMaybeObserver
            io.reactivex.MaybeSource<? extends T> r1 = r2.fallback
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r3 = r2.other
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.MaybeSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
