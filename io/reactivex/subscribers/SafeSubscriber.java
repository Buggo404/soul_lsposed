package io.reactivex.subscribers;

/* loaded from: classes.dex */
public final class SafeSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    final org.reactivestreams.Subscriber<? super T> actual;
    boolean done;

    /* renamed from: s */
    org.reactivestreams.Subscription f569s;

    public SafeSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f569s     // Catch: java.lang.Throwable -> L6
            r0.cancel()     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        Ld:
            return
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
            org.reactivestreams.Subscription r0 = r1.f569s
            if (r0 != 0) goto L10
            r1.onCompleteNoSubscription()
            return
        L10:
            org.reactivestreams.Subscriber<? super T> r0 = r1.actual     // Catch: java.lang.Throwable -> L16
            r0.onComplete()     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L1d:
            return
    }

    void onCompleteNoSubscription() {
            r6 = this;
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Subscription not set!"
            r0.<init>(r1)
            r1 = 1
            r2 = 0
            r3 = 2
            org.reactivestreams.Subscriber<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L2a
            io.reactivex.internal.subscriptions.EmptySubscription r5 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r4.onSubscribe(r5)     // Catch: java.lang.Throwable -> L2a
            org.reactivestreams.Subscriber<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L17
            r4.onError(r0)     // Catch: java.lang.Throwable -> L17
            goto L29
        L17:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r0
            r3[r1] = r4
            r5.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
        L29:
            return
        L2a:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r0
            r3[r1] = r4
            r5.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r9) {
            r8 = this;
            boolean r0 = r8.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            return
        L8:
            r0 = 1
            r8.done = r0
            org.reactivestreams.Subscription r1 = r8.f569s
            r2 = 0
            r3 = 2
            if (r1 != 0) goto L5b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r4 = "Subscription not set!"
            r1.<init>(r4)
            r4 = 3
            org.reactivestreams.Subscriber<? super T> r5 = r8.actual     // Catch: java.lang.Throwable -> L46
            io.reactivex.internal.subscriptions.EmptySubscription r6 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE     // Catch: java.lang.Throwable -> L46
            r5.onSubscribe(r6)     // Catch: java.lang.Throwable -> L46
            org.reactivestreams.Subscriber<? super T> r5 = r8.actual     // Catch: java.lang.Throwable -> L31
            io.reactivex.exceptions.CompositeException r6 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L31
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L31
            r7[r2] = r9     // Catch: java.lang.Throwable -> L31
            r7[r0] = r1     // Catch: java.lang.Throwable -> L31
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L31
            r5.onError(r6)     // Catch: java.lang.Throwable -> L31
            goto L45
        L31:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            io.reactivex.exceptions.CompositeException r6 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r2] = r9
            r4[r0] = r1
            r4[r3] = r5
            r6.<init>(r4)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
        L45:
            return
        L46:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            io.reactivex.exceptions.CompositeException r6 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r2] = r9
            r4[r0] = r1
            r4[r3] = r5
            r6.<init>(r4)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            return
        L5b:
            if (r9 != 0) goto L64
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r1 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r9.<init>(r1)
        L64:
            org.reactivestreams.Subscriber<? super T> r1 = r8.actual     // Catch: java.lang.Throwable -> L6a
            r1.onError(r9)     // Catch: java.lang.Throwable -> L6a
            goto L7c
        L6a:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r9
            r3[r0] = r1
            r4.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
        L7c:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r6) {
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L5
            return
        L5:
            org.reactivestreams.Subscription r0 = r5.f569s
            if (r0 != 0) goto Ld
            r5.onNextNoSubscription()
            return
        Ld:
            r0 = 1
            r1 = 0
            r2 = 2
            if (r6 != 0) goto L35
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r3 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r6.<init>(r3)
            org.reactivestreams.Subscription r3 = r5.f569s     // Catch: java.lang.Throwable -> L22
            r3.cancel()     // Catch: java.lang.Throwable -> L22
            r5.onError(r6)
            return
        L22:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r2[r1] = r6
            r2[r0] = r3
            r4.<init>(r2)
            r5.onError(r4)
            return
        L35:
            org.reactivestreams.Subscriber<? super T> r3 = r5.actual     // Catch: java.lang.Throwable -> L3b
            r3.onNext(r6)     // Catch: java.lang.Throwable -> L3b
            goto L47
        L3b:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            org.reactivestreams.Subscription r3 = r5.f569s     // Catch: java.lang.Throwable -> L48
            r3.cancel()     // Catch: java.lang.Throwable -> L48
            r5.onError(r6)
        L47:
            return
        L48:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r2[r1] = r6
            r2[r0] = r3
            r4.<init>(r2)
            r5.onError(r4)
            return
    }

    void onNextNoSubscription() {
            r6 = this;
            r0 = 1
            r6.done = r0
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Subscription not set!"
            r1.<init>(r2)
            r2 = 0
            r3 = 2
            org.reactivestreams.Subscriber<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L2c
            io.reactivex.internal.subscriptions.EmptySubscription r5 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE     // Catch: java.lang.Throwable -> L2c
            r4.onSubscribe(r5)     // Catch: java.lang.Throwable -> L2c
            org.reactivestreams.Subscriber<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L19
            r4.onError(r1)     // Catch: java.lang.Throwable -> L19
            goto L2b
        L19:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r1
            r3[r0] = r4
            r5.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
        L2b:
            return
        L2c:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r3[r2] = r1
            r3[r0] = r4
            r5.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r6) {
            r5 = this;
            org.reactivestreams.Subscription r0 = r5.f569s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r6)
            if (r0 == 0) goto L32
            r5.f569s = r6
            org.reactivestreams.Subscriber<? super T> r0 = r5.actual     // Catch: java.lang.Throwable -> L10
            r0.onSubscribe(r5)     // Catch: java.lang.Throwable -> L10
            goto L32
        L10:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r1 = 1
            r5.done = r1
            r6.cancel()     // Catch: java.lang.Throwable -> L1e
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            goto L32
        L1e:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
            r3 = 2
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r0
            r3[r1] = r6
            r2.<init>(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        L32:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r4) {
            r3 = this;
            org.reactivestreams.Subscription r0 = r3.f569s     // Catch: java.lang.Throwable -> L6
            r0.request(r4)     // Catch: java.lang.Throwable -> L6
            goto L12
        L6:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            org.reactivestreams.Subscription r5 = r3.f569s     // Catch: java.lang.Throwable -> L13
            r5.cancel()     // Catch: java.lang.Throwable -> L13
            io.reactivex.plugins.RxJavaPlugins.onError(r4)
        L12:
            return
        L13:
            r5 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            r1 = 2
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r1)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }
}
