package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleCache<T> extends io.reactivex.Single<T> implements io.reactivex.SingleObserver<T> {
    static final io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] EMPTY = null;
    static final io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T>[]> observers;
    final io.reactivex.SingleSource<? extends T> source;
    T value;
    final java.util.concurrent.atomic.AtomicInteger wip;

    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.internal.operators.single.SingleCache<T> parent;

        CacheDisposable(io.reactivex.SingleObserver<? super T> r1, io.reactivex.internal.operators.single.SingleCache<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                io.reactivex.internal.operators.single.SingleCache<T> r0 = r2.parent
                r0.remove(r2)
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }
    }

    static {
            r0 = 0
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r1 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[r0]
            io.reactivex.internal.operators.single.SingleCache.EMPTY = r1
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[r0]
            io.reactivex.internal.operators.single.SingleCache.TERMINATED = r0
            return
    }

    public SingleCache(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            r1.<init>()
            r1.source = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.wip = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = io.reactivex.internal.operators.single.SingleCache.EMPTY
            r2.<init>(r0)
            r1.observers = r2
            return
    }

    boolean add(io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r0 = r4.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.single.SingleCache.CacheDisposable[]) r0
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r1 = io.reactivex.internal.operators.single.SingleCache.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r3 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r1 = r4.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable r6) {
            r5 = this;
            r5.error = r6
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r0 = r5.observers
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r1 = io.reactivex.internal.operators.single.SingleCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.single.SingleCache.CacheDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            boolean r4 = r3.isDisposed()
            if (r4 != 0) goto L1d
            io.reactivex.SingleObserver<? super T> r3 = r3.actual
            r3.onError(r6)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            return
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T r6) {
            r5 = this;
            r5.value = r6
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r0 = r5.observers
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r1 = io.reactivex.internal.operators.single.SingleCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.single.SingleCache.CacheDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            boolean r4 = r3.isDisposed()
            if (r4 != 0) goto L1d
            io.reactivex.SingleObserver<? super T> r3 = r3.actual
            r3.onSuccess(r6)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            return
    }

    void remove(io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r0 = r6.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.single.SingleCache.CacheDisposable[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 != r7) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1c
            return
        L1c:
            r4 = 1
            if (r1 != r4) goto L22
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r1 = io.reactivex.internal.operators.single.SingleCache.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable[] r5 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache$CacheDisposable<T>[]> r2 = r6.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.single.SingleCache$CacheDisposable r0 = new io.reactivex.internal.operators.single.SingleCache$CacheDisposable
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L25
            boolean r3 = r0.isDisposed()
            if (r3 == 0) goto L17
            r2.remove(r0)
        L17:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.wip
            int r3 = r3.getAndIncrement()
            if (r3 != 0) goto L24
            io.reactivex.SingleSource<? extends T> r3 = r2.source
            r3.subscribe(r2)
        L24:
            return
        L25:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L2d
            r3.onError(r0)
            goto L32
        L2d:
            T r0 = r2.value
            r3.onSuccess(r0)
        L32:
            return
    }
}
