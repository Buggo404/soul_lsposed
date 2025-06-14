package io.reactivex.observers;

/* loaded from: classes.dex */
public class TestObserver<T> extends io.reactivex.observers.BaseTestConsumer<T, io.reactivex.observers.TestObserver<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.MaybeObserver<T>, io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver {
    private final io.reactivex.Observer<? super T> actual;

    /* renamed from: qs */
    private io.reactivex.internal.fuseable.QueueDisposable<T> f564qs;
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> subscription;

    enum EmptyObserver extends java.lang.Enum<io.reactivex.observers.TestObserver.EmptyObserver> implements io.reactivex.Observer<java.lang.Object> {
        private static final /* synthetic */ io.reactivex.observers.TestObserver.EmptyObserver[] $VALUES = null;
        public static final io.reactivex.observers.TestObserver.EmptyObserver INSTANCE = null;

        static {
                io.reactivex.observers.TestObserver$EmptyObserver r0 = new io.reactivex.observers.TestObserver$EmptyObserver
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.observers.TestObserver.EmptyObserver.INSTANCE = r0
                r1 = 1
                io.reactivex.observers.TestObserver$EmptyObserver[] r1 = new io.reactivex.observers.TestObserver.EmptyObserver[r1]
                r1[r2] = r0
                io.reactivex.observers.TestObserver.EmptyObserver.$VALUES = r1
                return
        }

        EmptyObserver(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.observers.TestObserver.EmptyObserver valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.observers.TestObserver$EmptyObserver> r0 = io.reactivex.observers.TestObserver.EmptyObserver.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.observers.TestObserver$EmptyObserver r1 = (io.reactivex.observers.TestObserver.EmptyObserver) r1
                return r1
        }

        public static io.reactivex.observers.TestObserver.EmptyObserver[] values() {
                io.reactivex.observers.TestObserver$EmptyObserver[] r0 = io.reactivex.observers.TestObserver.EmptyObserver.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.observers.TestObserver$EmptyObserver[] r0 = (io.reactivex.observers.TestObserver.EmptyObserver[]) r0
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                return
        }
    }

    public TestObserver() {
            r1 = this;
            io.reactivex.observers.TestObserver$EmptyObserver r0 = io.reactivex.observers.TestObserver.EmptyObserver.INSTANCE
            r1.<init>(r0)
            return
    }

    public TestObserver(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.subscription = r0
            r1.actual = r2
            return
    }

    public static <T> io.reactivex.observers.TestObserver<T> create() {
            io.reactivex.observers.TestObserver r0 = new io.reactivex.observers.TestObserver
            r0.<init>()
            return r0
    }

    public static <T> io.reactivex.observers.TestObserver<T> create(io.reactivex.Observer<? super T> r1) {
            io.reactivex.observers.TestObserver r0 = new io.reactivex.observers.TestObserver
            r0.<init>(r1)
            return r0
    }

    static java.lang.String fusionModeToString(int r2) {
            if (r2 == 0) goto L24
            r0 = 1
            if (r2 == r0) goto L21
            r0 = 2
            if (r2 == r0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown("
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L1e:
            java.lang.String r2 = "ASYNC"
            return r2
        L21:
            java.lang.String r2 = "SYNC"
            return r2
        L24:
            java.lang.String r2 = "NONE"
            return r2
    }

    final io.reactivex.observers.TestObserver<T> assertFuseable() {
            r2 = this;
            io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f564qs
            if (r0 == 0) goto L5
            return r2
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Upstream is not fuseable."
            r0.<init>(r1)
            throw r0
    }

    final io.reactivex.observers.TestObserver<T> assertFusionMode(int r5) {
            r4 = this;
            int r0 = r4.establishedFusionMode
            if (r0 == r5) goto L36
            io.reactivex.internal.fuseable.QueueDisposable<T> r1 = r4.f564qs
            if (r1 == 0) goto L2f
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fusion mode different. Expected: "
            r2.<init>(r3)
            java.lang.String r5 = fusionModeToString(r5)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ", actual: "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r0 = fusionModeToString(r0)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L2f:
            java.lang.String r5 = "Upstream is not fuseable"
            java.lang.AssertionError r5 = r4.fail(r5)
            throw r5
        L36:
            return r4
    }

    final io.reactivex.observers.TestObserver<T> assertNotFuseable() {
            r2 = this;
            io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f564qs
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Upstream is fuseable."
            r0.<init>(r1)
            throw r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ io.reactivex.observers.BaseTestConsumer assertNotSubscribed() {
            r1 = this;
            io.reactivex.observers.TestObserver r0 = r1.assertNotSubscribed()
            return r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertNotSubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L18
            java.util.List<java.lang.Throwable> r0 = r1.errors
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.String r0 = "Not subscribed but errors found"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
        L18:
            java.lang.String r0 = "Subscribed!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final io.reactivex.observers.TestObserver<T> assertOf(io.reactivex.functions.Consumer<? super io.reactivex.observers.TestObserver<T>> r1) {
            r0 = this;
            r1.accept(r0)     // Catch: java.lang.Throwable -> L4
            return r0
        L4:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)
            throw r1
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ io.reactivex.observers.BaseTestConsumer assertSubscribed() {
            r1 = this;
            io.reactivex.observers.TestObserver r0 = r1.assertSubscribed()
            return r0
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertSubscribed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "Not subscribed!"
            java.lang.AssertionError r0 = r1.fail(r0)
            throw r0
    }

    public final void cancel() {
            r0 = this;
            r0.dispose()
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    public final boolean hasSubscription() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.isDisposed()
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.subscription
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r4 = this;
            boolean r0 = r4.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r4.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r4.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L33
            r4.lastThread = r0     // Catch: java.lang.Throwable -> L33
            long r0 = r4.completions     // Catch: java.lang.Throwable -> L33
            r2 = 1
            long r0 = r0 + r2
            r4.completions = r0     // Catch: java.lang.Throwable -> L33
            io.reactivex.Observer<? super T> r0 = r4.actual     // Catch: java.lang.Throwable -> L33
            r0.onComplete()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.CountDownLatch r0 = r4.done
            r0.countDown()
            return
        L33:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r4.done
            r1.countDown()
            throw r0
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r3.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L40
            r3.lastThread = r0     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L30
            java.util.List<java.lang.Throwable> r0 = r3.errors     // Catch: java.lang.Throwable -> L40
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "onError received a null Throwable"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            r0.add(r1)     // Catch: java.lang.Throwable -> L40
            goto L35
        L30:
            java.util.List<java.lang.Throwable> r0 = r3.errors     // Catch: java.lang.Throwable -> L40
            r0.add(r4)     // Catch: java.lang.Throwable -> L40
        L35:
            io.reactivex.Observer<? super T> r0 = r3.actual     // Catch: java.lang.Throwable -> L40
            r0.onError(r4)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.CountDownLatch r4 = r3.done
            r4.countDown()
            return
        L40:
            r4 = move-exception
            java.util.concurrent.CountDownLatch r0 = r3.done
            r0.countDown()
            throw r4
    }

    @Override // io.reactivex.Observer
    public void onNext(T r4) {
            r3 = this;
            boolean r0 = r3.checkSubscriptionOnce
            if (r0 != 0) goto L1b
            r0 = 1
            r3.checkSubscriptionOnce = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r3.subscription
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L1b
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "onSubscribe not called in proper order"
            r1.<init>(r2)
            r0.add(r1)
        L1b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.lastThread = r0
            int r0 = r3.establishedFusionMode
            r1 = 2
            if (r0 != r1) goto L40
        L26:
            io.reactivex.internal.fuseable.QueueDisposable<T> r4 = r3.f564qs     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3f
            java.util.List<T> r0 = r3.values     // Catch: java.lang.Throwable -> L34
            r0.add(r4)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r4 = move-exception
            java.util.List<java.lang.Throwable> r0 = r3.errors
            r0.add(r4)
            io.reactivex.internal.fuseable.QueueDisposable<T> r4 = r3.f564qs
            r4.dispose()
        L3f:
            return
        L40:
            java.util.List<T> r0 = r3.values
            r0.add(r4)
            if (r4 != 0) goto L53
            java.util.List<java.lang.Throwable> r0 = r3.errors
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "onNext received a null value"
            r1.<init>(r2)
            r0.add(r1)
        L53:
            io.reactivex.Observer<? super T> r0 = r3.actual
            r0.onNext(r4)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r5) {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r4.lastThread = r0
            if (r5 != 0) goto L15
            java.util.List<java.lang.Throwable> r5 = r4.errors
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "onSubscribe received a null Subscription"
            r0.<init>(r1)
            r5.add(r0)
            return
        L15:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.subscription
            r1 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r5)
            if (r0 != 0) goto L45
            r5.dispose()
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.subscription
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 == r1) goto L44
            java.util.List<java.lang.Throwable> r0 = r4.errors
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onSubscribe received multiple subscriptions: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r0.add(r1)
        L44:
            return
        L45:
            int r0 = r4.initialFusionMode
            if (r0 == 0) goto L89
            boolean r0 = r5 instanceof io.reactivex.internal.fuseable.QueueDisposable
            if (r0 == 0) goto L89
            r0 = r5
            io.reactivex.internal.fuseable.QueueDisposable r0 = (io.reactivex.internal.fuseable.QueueDisposable) r0
            r4.f564qs = r0
            int r1 = r4.initialFusionMode
            int r0 = r0.requestFusion(r1)
            r4.establishedFusionMode = r0
            r1 = 1
            if (r0 != r1) goto L89
            r4.checkSubscriptionOnce = r1
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r4.lastThread = r5
        L65:
            io.reactivex.internal.fuseable.QueueDisposable<T> r5 = r4.f564qs     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L73
            java.util.List<T> r0 = r4.values     // Catch: java.lang.Throwable -> L82
            r0.add(r5)     // Catch: java.lang.Throwable -> L82
            goto L65
        L73:
            long r0 = r4.completions     // Catch: java.lang.Throwable -> L82
            r2 = 1
            long r0 = r0 + r2
            r4.completions = r0     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r5 = r4.subscription     // Catch: java.lang.Throwable -> L82
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED     // Catch: java.lang.Throwable -> L82
            r5.lazySet(r0)     // Catch: java.lang.Throwable -> L82
            goto L88
        L82:
            r5 = move-exception
            java.util.List<java.lang.Throwable> r0 = r4.errors
            r0.add(r5)
        L88:
            return
        L89:
            io.reactivex.Observer<? super T> r0 = r4.actual
            r0.onSubscribe(r5)
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T r1) {
            r0 = this;
            r0.onNext(r1)
            r0.onComplete()
            return
    }

    final io.reactivex.observers.TestObserver<T> setInitialFusionMode(int r1) {
            r0 = this;
            r0.initialFusionMode = r1
            return r0
    }
}
