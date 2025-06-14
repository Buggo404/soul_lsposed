package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> state;

    static final class CacheState<T> extends io.reactivex.internal.util.LinkedArrayList implements io.reactivex.Observer<T> {
        static final io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] EMPTY = null;
        static final io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] TERMINATED = null;
        final io.reactivex.internal.disposables.SequentialDisposable connection;
        volatile boolean isConnected;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T>[]> observers;
        final io.reactivex.Observable<? extends T> source;
        boolean sourceDone;

        static {
                r0 = 0
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r1 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[r0]
                io.reactivex.internal.operators.observable.ObservableCache.CacheState.EMPTY = r1
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[r0]
                io.reactivex.internal.operators.observable.ObservableCache.CacheState.TERMINATED = r0
                return
        }

        CacheState(io.reactivex.Observable<? extends T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.source = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r2 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.EMPTY
                r1.<init>(r2)
                r0.observers = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.connection = r1
                return
        }

        public boolean addChild(io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T> r5) {
                r4 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r0 = r4.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r0
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.TERMINATED
                r2 = 0
                if (r0 != r1) goto Le
                return r2
            Le:
                int r1 = r0.length
                int r3 = r1 + 1
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r3 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r1 = r4.observers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
                if (r0 == 0) goto L0
                r5 = 1
                return r5
        }

        public void connect() {
                r1 = this;
                io.reactivex.Observable<? extends T> r0 = r1.source
                r0.subscribe(r1)
                r0 = 1
                r1.isConnected = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                boolean r0 = r4.sourceDone
                if (r0 != 0) goto L29
                r0 = 1
                r4.sourceDone = r0
                java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
                r4.add(r0)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r4.connection
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r0 = r4.observers
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.TERMINATED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r0
                int r1 = r0.length
                r2 = 0
            L1f:
                if (r2 >= r1) goto L29
                r3 = r0[r2]
                r3.replay()
                int r2 = r2 + 1
                goto L1f
            L29:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L29
                r0 = 1
                r3.sourceDone = r0
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.error(r4)
                r3.add(r4)
                io.reactivex.internal.disposables.SequentialDisposable r4 = r3.connection
                r4.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r4 = r3.observers
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.TERMINATED
                java.lang.Object r4 = r4.getAndSet(r0)
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r4 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r4
                int r0 = r4.length
                r1 = 0
            L1f:
                if (r1 >= r0) goto L29
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L1f
            L29:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.sourceDone
                if (r0 != 0) goto L1f
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.next(r4)
                r3.add(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r4 = r3.observers
                java.lang.Object r4 = r4.get()
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r4 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r4
                int r0 = r4.length
                r1 = 0
            L15:
                if (r1 >= r0) goto L1f
                r2 = r4[r1]
                r2.replay()
                int r1 = r1 + 1
                goto L15
            L1f:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.connection
                r0.update(r2)
                return
        }

        public void removeChild(io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r0 = r6.observers
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                return
            Lc:
                r2 = 0
                r3 = r2
            Le:
                if (r3 >= r1) goto L1c
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L19
                goto L1d
            L19:
                int r3 = r3 + 1
                goto Le
            L1c:
                r3 = -1
            L1d:
                if (r3 >= 0) goto L20
                return
            L20:
                r4 = 1
                if (r1 != r4) goto L26
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r1 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.EMPTY
                goto L35
            L26:
                int r5 = r1 + (-1)
                io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r5 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L35:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r2 = r6.observers
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
                if (r0 == 0) goto L0
                return
        }
    }

    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7058506693698832024L;
        volatile boolean cancelled;
        final io.reactivex.Observer<? super T> child;
        java.lang.Object[] currentBuffer;
        int currentIndexInBuffer;
        int index;
        final io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> state;

        ReplayDisposable(io.reactivex.Observer<? super T> r1, io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> r2) {
                r0 = this;
                r0.<init>()
                r0.child = r1
                r0.state = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r0 = r1.state
                r0.removeChild(r1)
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        public void replay() {
                r9 = this;
                int r0 = r9.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.Observer<? super T> r0 = r9.child
                r1 = 1
                r2 = r1
            Lb:
                boolean r3 = r9.cancelled
                if (r3 == 0) goto L10
                return
            L10:
                io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r3 = r9.state
                int r3 = r3.size()
                if (r3 == 0) goto L53
                java.lang.Object[] r4 = r9.currentBuffer
                if (r4 != 0) goto L24
                io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r4 = r9.state
                java.lang.Object[] r4 = r4.head()
                r9.currentBuffer = r4
            L24:
                int r5 = r4.length
                int r5 = r5 - r1
                int r6 = r9.index
                int r7 = r9.currentIndexInBuffer
            L2a:
                if (r6 >= r3) goto L48
                boolean r8 = r9.cancelled
                if (r8 == 0) goto L31
                return
            L31:
                if (r7 != r5) goto L3a
                r4 = r4[r5]
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r7 = 0
            L3a:
                r8 = r4[r7]
                boolean r8 = io.reactivex.internal.util.NotificationLite.accept(r8, r0)
                if (r8 == 0) goto L43
                return
            L43:
                int r7 = r7 + 1
                int r6 = r6 + 1
                goto L2a
            L48:
                boolean r3 = r9.cancelled
                if (r3 == 0) goto L4d
                return
            L4d:
                r9.index = r6
                r9.currentIndexInBuffer = r7
                r9.currentBuffer = r4
            L53:
                int r2 = -r2
                int r2 = r9.addAndGet(r2)
                if (r2 != 0) goto Lb
                return
        }
    }

    private ObservableCache(io.reactivex.Observable<T> r1, io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.state = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r0.once = r1
            return
    }

    public static <T> io.reactivex.Observable<T> from(io.reactivex.Observable<T> r1) {
            r0 = 16
            io.reactivex.Observable r1 = from(r1, r0)
            return r1
    }

    public static <T> io.reactivex.Observable<T> from(io.reactivex.Observable<T> r1, int r2) {
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.observable.ObservableCache$CacheState r0 = new io.reactivex.internal.operators.observable.ObservableCache$CacheState
            r0.<init>(r1, r2)
            io.reactivex.internal.operators.observable.ObservableCache r2 = new io.reactivex.internal.operators.observable.ObservableCache
            r2.<init>(r1, r0)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r1
    }

    int cachedEventCount() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r0 = r1.state
            int r0 = r0.size()
            return r0
    }

    boolean hasObservers() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r0 = r1.state
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable<T>[]> r0 = r0.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable[] r0 = (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    boolean isConnected() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r0 = r1.state
            boolean r0 = r0.isConnected
            return r0
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable r0 = new io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r1 = r3.state
            r0.<init>(r4, r1)
            r4.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r4 = r3.state
            r4.addChild(r0)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.once
            boolean r4 = r4.get()
            if (r4 != 0) goto L26
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.once
            r1 = 0
            r2 = 1
            boolean r4 = r4.compareAndSet(r1, r2)
            if (r4 == 0) goto L26
            io.reactivex.internal.operators.observable.ObservableCache$CacheState<T> r4 = r3.state
            r4.connect()
        L26:
            r0.replay()
            return
    }
}
