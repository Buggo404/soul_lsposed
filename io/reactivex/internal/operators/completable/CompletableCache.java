package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableCache extends io.reactivex.Completable implements io.reactivex.CompletableObserver {
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] EMPTY = null;
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]> observers;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.CompletableSource source;

    final class InnerCompletableCache extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        final io.reactivex.CompletableObserver actual;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableCache this$0;

        InnerCompletableCache(io.reactivex.internal.operators.completable.CompletableCache r1, io.reactivex.CompletableObserver r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.actual = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                io.reactivex.internal.operators.completable.CompletableCache r0 = r2.this$0
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
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r1 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[r0]
            io.reactivex.internal.operators.completable.CompletableCache.EMPTY = r1
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[r0]
            io.reactivex.internal.operators.completable.CompletableCache.TERMINATED = r0
            return
    }

    public CompletableCache(io.reactivex.CompletableSource r2) {
            r1 = this;
            r1.<init>()
            r1.source = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = io.reactivex.internal.operators.completable.CompletableCache.EMPTY
            r2.<init>(r0)
            r1.observers = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r1.once = r2
            return
    }

    boolean add(io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r0 = r4.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]) r0
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r1 = io.reactivex.internal.operators.completable.CompletableCache.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r3 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r1 = r4.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r0 = r5.observers
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r1 = io.reactivex.internal.operators.completable.CompletableCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]) r0
            int r1 = r0.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]
            boolean r4 = r3.get()
            if (r4 != 0) goto L1b
            io.reactivex.CompletableObserver r3 = r3.actual
            r3.onComplete()
        L1b:
            int r2 = r2 + 1
            goto Lc
        L1e:
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable r6) {
            r5 = this;
            r5.error = r6
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r0 = r5.observers
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r1 = io.reactivex.internal.operators.completable.CompletableCache.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]) r0
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            r3 = r0[r2]
            boolean r4 = r3.get()
            if (r4 != 0) goto L1d
            io.reactivex.CompletableObserver r3 = r3.actual
            r3.onError(r6)
        L1d:
            int r2 = r2 + 1
            goto Le
        L20:
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            return
    }

    void remove(io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r0 = r6.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r0 = (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]) r0
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
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r1 = io.reactivex.internal.operators.completable.CompletableCache.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[] r5 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache[]> r2 = r6.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache r0 = new io.reactivex.internal.operators.completable.CompletableCache$InnerCompletableCache
            r0.<init>(r2, r3)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L27
            boolean r3 = r0.isDisposed()
            if (r3 == 0) goto L17
            r2.remove(r0)
        L17:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.once
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L32
            io.reactivex.CompletableSource r3 = r2.source
            r3.subscribe(r2)
            goto L32
        L27:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L2f
            r3.onError(r0)
            goto L32
        L2f:
            r3.onComplete()
        L32:
            return
    }
}
