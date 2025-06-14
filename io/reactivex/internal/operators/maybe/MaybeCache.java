package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeCache<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] EMPTY = null;
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[]> observers;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.MaybeSource<T>> source;
    T value;

    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final io.reactivex.MaybeObserver<? super T> actual;

        CacheDisposable(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.internal.operators.maybe.MaybeCache<T> r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                java.lang.Object r0 = r1.getAndSet(r0)
                io.reactivex.internal.operators.maybe.MaybeCache r0 = (io.reactivex.internal.operators.maybe.MaybeCache) r0
                if (r0 == 0) goto Lc
                r0.remove(r1)
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            r0 = 0
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[r0]
            io.reactivex.internal.operators.maybe.MaybeCache.EMPTY = r1
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[r0]
            io.reactivex.internal.operators.maybe.MaybeCache.TERMINATED = r0
            return
    }

    public MaybeCache(io.reactivex.MaybeSource<T> r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.source = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = io.reactivex.internal.operators.maybe.MaybeCache.EMPTY
            r2.<init>(r0)
            r1.observers = r2
            return
    }

    boolean add(io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r0 = r4.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[]) r0
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = io.reactivex.internal.operators.maybe.MaybeCache.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r3 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r1 = r4.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r0 = r5.observers
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = io.reactivex.internal.operators.maybe.MaybeCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            boolean r4 = r3.isDisposed()
            if (r4 != 0) goto L1b
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onComplete()
        L1b:
            int r2 = r2 + 1
            goto Lc
        L1e:
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(java.lang.Throwable r6) {
            r5 = this;
            r5.error = r6
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r0 = r5.observers
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = io.reactivex.internal.operators.maybe.MaybeCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            boolean r4 = r3.isDisposed()
            if (r4 != 0) goto L1d
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onError(r6)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T r6) {
            r5 = this;
            r5.value = r6
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r0 = r5.observers
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = io.reactivex.internal.operators.maybe.MaybeCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            boolean r4 = r3.isDisposed()
            if (r4 != 0) goto L1d
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onSuccess(r6)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            return
    }

    void remove(io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r0 = r6.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r0 = (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[]) r0
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
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r1 = io.reactivex.internal.operators.maybe.MaybeCache.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable[] r5 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable<T>[]> r2 = r6.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable r0 = new io.reactivex.internal.operators.maybe.MaybeCache$CacheDisposable
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L27
            boolean r3 = r0.isDisposed()
            if (r3 == 0) goto L18
            r2.remove(r0)
            return
        L18:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.MaybeSource<T>> r3 = r2.source
            r0 = 0
            java.lang.Object r3 = r3.getAndSet(r0)
            io.reactivex.MaybeSource r3 = (io.reactivex.MaybeSource) r3
            if (r3 == 0) goto L26
            r3.subscribe(r2)
        L26:
            return
        L27:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L40
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L35
            r3.onError(r0)
            goto L40
        L35:
            T r0 = r2.value
            if (r0 == 0) goto L3d
            r3.onSuccess(r0)
            goto L40
        L3d:
            r3.onComplete()
        L40:
            return
    }
}
