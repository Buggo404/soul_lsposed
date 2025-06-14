package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRefCount<T> extends io.reactivex.Observable<T> {
    io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection connection;

    /* renamed from: n */
    final int f428n;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.observables.ConnectableObservable<T> source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class RefConnection extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        final io.reactivex.internal.operators.observable.ObservableRefCount<?> parent;
        long subscriberCount;
        io.reactivex.disposables.Disposable timer;

        RefConnection(io.reactivex.internal.operators.observable.ObservableRefCount<?> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(io.reactivex.disposables.Disposable r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(io.reactivex.disposables.Disposable r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
                r0.accept2(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableRefCount<?> r0 = r1.parent
                r0.timeout(r1)
                return
        }
    }

    static final class RefCountObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection connection;
        final io.reactivex.internal.operators.observable.ObservableRefCount<T> parent;
        io.reactivex.disposables.Disposable upstream;

        RefCountObserver(io.reactivex.Observer<? super T> r1, io.reactivex.internal.operators.observable.ObservableRefCount<T> r2, io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                r0.connection = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.upstream
                r0.dispose()
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L14
                io.reactivex.internal.operators.observable.ObservableRefCount<T> r0 = r2.parent
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r1 = r2.connection
                r0.cancel(r1)
            L14:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L14
                io.reactivex.internal.operators.observable.ObservableRefCount<T> r0 = r2.parent
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r1 = r2.connection
                r0.terminated(r1)
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.internal.operators.observable.ObservableRefCount<T> r0 = r2.parent
                io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r1 = r2.connection
                r0.terminated(r1)
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L18:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> r8) {
            r7 = this;
            r2 = 1
            r3 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.trampoline()
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return
    }

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> r1, int r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.f428n = r2
            r0.timeout = r3
            r0.unit = r5
            r0.scheduler = r6
            return
    }

    void cancel(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection r6) {
            r5 = this;
            monitor-enter(r5)
            io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r0 = r5.connection     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L7
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            return
        L7:
            long r0 = r6.subscriberCount     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            long r0 = r0 - r2
            r6.subscriberCount = r0     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3a
            boolean r0 = r6.connected     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L19
            goto L3a
        L19:
            long r0 = r5.timeout     // Catch: java.lang.Throwable -> L3c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L24
            r5.timeout(r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            return
        L24:
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            r6.timer = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            io.reactivex.Scheduler r1 = r5.scheduler
            long r2 = r5.timeout
            java.util.concurrent.TimeUnit r4 = r5.unit
            io.reactivex.disposables.Disposable r6 = r1.scheduleDirect(r6, r2, r4)
            r0.replace(r6)
            return
        L3a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r6
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            monitor-enter(r5)
            io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r0 = r5.connection     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto Lc
            io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r0 = new io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection     // Catch: java.lang.Throwable -> L45
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L45
            r5.connection = r0     // Catch: java.lang.Throwable -> L45
        Lc:
            long r1 = r0.subscriberCount     // Catch: java.lang.Throwable -> L45
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L1d
            io.reactivex.disposables.Disposable r3 = r0.timer     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L1d
            io.reactivex.disposables.Disposable r3 = r0.timer     // Catch: java.lang.Throwable -> L45
            r3.dispose()     // Catch: java.lang.Throwable -> L45
        L1d:
            r3 = 1
            long r1 = r1 + r3
            r0.subscriberCount = r1     // Catch: java.lang.Throwable -> L45
            boolean r3 = r0.connected     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L31
            int r3 = r5.f428n     // Catch: java.lang.Throwable -> L45
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L45
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            r1 = 1
            r0.connected = r1     // Catch: java.lang.Throwable -> L45
            goto L32
        L31:
            r1 = 0
        L32:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L45
            io.reactivex.observables.ConnectableObservable<T> r2 = r5.source
            io.reactivex.internal.operators.observable.ObservableRefCount$RefCountObserver r3 = new io.reactivex.internal.operators.observable.ObservableRefCount$RefCountObserver
            r3.<init>(r6, r5, r0)
            r2.subscribe(r3)
            if (r1 == 0) goto L44
            io.reactivex.observables.ConnectableObservable<T> r6 = r5.source
            r6.connect(r0)
        L44:
            return
        L45:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L45
            throw r6
    }

    void terminated(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection r2) {
            r1 = this;
            monitor-enter(r1)
            io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r0 = r1.connection     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
            r0 = 0
            r1.connection = r0     // Catch: java.lang.Throwable -> L1e
            io.reactivex.disposables.Disposable r0 = r2.timer     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L11
            io.reactivex.disposables.Disposable r2 = r2.timer     // Catch: java.lang.Throwable -> L1e
            r2.dispose()     // Catch: java.lang.Throwable -> L1e
        L11:
            io.reactivex.observables.ConnectableObservable<T> r2 = r1.source     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r2 instanceof io.reactivex.disposables.Disposable     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2     // Catch: java.lang.Throwable -> L1e
            r2.dispose()     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    void timeout(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = r5.subscriberCount     // Catch: java.lang.Throwable -> L20
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection r0 = r4.connection     // Catch: java.lang.Throwable -> L20
            if (r5 != r0) goto L1e
            r0 = 0
            r4.connection = r0     // Catch: java.lang.Throwable -> L20
            io.reactivex.internal.disposables.DisposableHelper.dispose(r5)     // Catch: java.lang.Throwable -> L20
            io.reactivex.observables.ConnectableObservable<T> r5 = r4.source     // Catch: java.lang.Throwable -> L20
            boolean r0 = r5 instanceof io.reactivex.disposables.Disposable     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            io.reactivex.disposables.Disposable r5 = (io.reactivex.disposables.Disposable) r5     // Catch: java.lang.Throwable -> L20
            r5.dispose()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
    }
}
