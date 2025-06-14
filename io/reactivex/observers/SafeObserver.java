package io.reactivex.observers;

/* loaded from: classes.dex */
public final class SafeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final io.reactivex.Observer<? super T> actual;
    boolean done;

    /* renamed from: s */
    io.reactivex.disposables.Disposable f562s;

    public SafeObserver(io.reactivex.Observer<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f562s
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f562s
            boolean r0 = r0.isDisposed()
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.done = r0
            io.reactivex.disposables.Disposable r0 = r1.f562s
            if (r0 != 0) goto L10
            r1.onCompleteNoSubscription()
            return
        L10:
            io.reactivex.Observer<? super T> r0 = r1.actual     // Catch: java.lang.Throwable -> L16
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
            io.reactivex.Observer<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L2a
            io.reactivex.internal.disposables.EmptyDisposable r5 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE     // Catch: java.lang.Throwable -> L2a
            r4.onSubscribe(r5)     // Catch: java.lang.Throwable -> L2a
            io.reactivex.Observer<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L17
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

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r9) {
            r8 = this;
            boolean r0 = r8.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r9)
            return
        L8:
            r0 = 1
            r8.done = r0
            io.reactivex.disposables.Disposable r1 = r8.f562s
            r2 = 0
            r3 = 2
            if (r1 != 0) goto L5b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r4 = "Subscription not set!"
            r1.<init>(r4)
            r4 = 3
            io.reactivex.Observer<? super T> r5 = r8.actual     // Catch: java.lang.Throwable -> L46
            io.reactivex.internal.disposables.EmptyDisposable r6 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE     // Catch: java.lang.Throwable -> L46
            r5.onSubscribe(r6)     // Catch: java.lang.Throwable -> L46
            io.reactivex.Observer<? super T> r5 = r8.actual     // Catch: java.lang.Throwable -> L31
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
            io.reactivex.Observer<? super T> r1 = r8.actual     // Catch: java.lang.Throwable -> L6a
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

    @Override // io.reactivex.Observer
    public void onNext(T r6) {
            r5 = this;
            boolean r0 = r5.done
            if (r0 == 0) goto L5
            return
        L5:
            io.reactivex.disposables.Disposable r0 = r5.f562s
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
            io.reactivex.disposables.Disposable r3 = r5.f562s     // Catch: java.lang.Throwable -> L22
            r3.dispose()     // Catch: java.lang.Throwable -> L22
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
            io.reactivex.Observer<? super T> r3 = r5.actual     // Catch: java.lang.Throwable -> L3b
            r3.onNext(r6)     // Catch: java.lang.Throwable -> L3b
            goto L47
        L3b:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            io.reactivex.disposables.Disposable r3 = r5.f562s     // Catch: java.lang.Throwable -> L48
            r3.dispose()     // Catch: java.lang.Throwable -> L48
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
            io.reactivex.Observer<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L2c
            io.reactivex.internal.disposables.EmptyDisposable r5 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE     // Catch: java.lang.Throwable -> L2c
            r4.onSubscribe(r5)     // Catch: java.lang.Throwable -> L2c
            io.reactivex.Observer<? super T> r4 = r6.actual     // Catch: java.lang.Throwable -> L19
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

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r6) {
            r5 = this;
            io.reactivex.disposables.Disposable r0 = r5.f562s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r6)
            if (r0 == 0) goto L32
            r5.f562s = r6
            io.reactivex.Observer<? super T> r0 = r5.actual     // Catch: java.lang.Throwable -> L10
            r0.onSubscribe(r5)     // Catch: java.lang.Throwable -> L10
            goto L32
        L10:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r1 = 1
            r5.done = r1
            r6.dispose()     // Catch: java.lang.Throwable -> L1e
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
}
