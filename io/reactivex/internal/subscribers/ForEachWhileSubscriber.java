package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public final class ForEachWhileSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Predicate<? super T> onNext;

    public ForEachWhileSubscriber(io.reactivex.functions.Predicate<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            r0.<init>()
            r0.onNext = r1
            r0.onError = r2
            r0.onComplete = r3
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.done = r0
            io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> Le
            r0.run()     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L15:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r6) {
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            return
        L8:
            r0 = 1
            r5.done = r0
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r5.onError     // Catch: java.lang.Throwable -> L11
            r1.accept(r6)     // Catch: java.lang.Throwable -> L11
            goto L25
        L11:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
            r3 = 2
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r6
            r3[r0] = r1
            r2.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        L25:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L5
            return
        L5:
            io.reactivex.functions.Predicate<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L14
            boolean r2 = r0.test(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L13
            r1.dispose()
            r1.onComplete()
        L13:
            return
        L14:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r1.dispose()
            r1.onError(r2)
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
