package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class BoundedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final int bufferSize;
    int consumed;
    final int limit;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;

    public BoundedSubscriber(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.onNext = r1
            r0.onError = r2
            r0.onComplete = r3
            r0.onSubscribe = r4
            r0.bufferSize = r5
            int r1 = r5 >> 2
            int r5 = r5 - r1
            r0.limit = r5
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            r0.cancel()
            return
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
            r2 = this;
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r2.onError
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L1a
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r2.lazySet(r0)
            io.reactivex.functions.Action r0 = r2.onComplete     // Catch: java.lang.Throwable -> L13
            r0.run()     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L1a:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Object r0 = r4.get()
            io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            if (r0 == r1) goto L29
            io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
            r4.lazySet(r0)
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r4.onError     // Catch: java.lang.Throwable -> L13
            r0.accept(r5)     // Catch: java.lang.Throwable -> L13
            goto L2c
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            goto L2c
        L29:
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
        L2c:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r3) {
            r2 = this;
            boolean r0 = r2.isDisposed()
            if (r0 != 0) goto L36
            io.reactivex.functions.Consumer<? super T> r0 = r2.onNext     // Catch: java.lang.Throwable -> L26
            r0.accept(r3)     // Catch: java.lang.Throwable -> L26
            int r3 = r2.consumed     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            int r0 = r2.limit     // Catch: java.lang.Throwable -> L26
            if (r3 != r0) goto L23
            r3 = 0
            r2.consumed = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L26
            org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3     // Catch: java.lang.Throwable -> L26
            int r0 = r2.limit     // Catch: java.lang.Throwable -> L26
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L26
            r3.request(r0)     // Catch: java.lang.Throwable -> L26
            goto L36
        L23:
            r2.consumed = r3     // Catch: java.lang.Throwable -> L26
            goto L36
        L26:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            java.lang.Object r0 = r2.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.cancel()
            r2.onError(r3)
        L36:
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r1, r2)
            if (r0 == 0) goto L16
            io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r0 = r1.onSubscribe     // Catch: java.lang.Throwable -> Lc
            r0.accept(r1)     // Catch: java.lang.Throwable -> Lc
            goto L16
        Lc:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r2.cancel()
            r1.onError(r0)
        L16:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            r0.request(r2)
            return
    }
}
