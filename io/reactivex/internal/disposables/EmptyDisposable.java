package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public enum EmptyDisposable extends java.lang.Enum<io.reactivex.internal.disposables.EmptyDisposable> implements io.reactivex.internal.fuseable.QueueDisposable<java.lang.Object> {
    private static final /* synthetic */ io.reactivex.internal.disposables.EmptyDisposable[] $VALUES = null;
    public static final io.reactivex.internal.disposables.EmptyDisposable INSTANCE = null;
    public static final io.reactivex.internal.disposables.EmptyDisposable NEVER = null;

    static {
            io.reactivex.internal.disposables.EmptyDisposable r0 = new io.reactivex.internal.disposables.EmptyDisposable
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.disposables.EmptyDisposable.INSTANCE = r0
            io.reactivex.internal.disposables.EmptyDisposable r1 = new io.reactivex.internal.disposables.EmptyDisposable
            java.lang.String r3 = "NEVER"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.internal.disposables.EmptyDisposable.NEVER = r1
            r3 = 2
            io.reactivex.internal.disposables.EmptyDisposable[] r3 = new io.reactivex.internal.disposables.EmptyDisposable[r3]
            r3[r2] = r0
            r3[r4] = r1
            io.reactivex.internal.disposables.EmptyDisposable.$VALUES = r3
            return
    }

    EmptyDisposable(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static void complete(io.reactivex.CompletableObserver r1) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r1.onSubscribe(r0)
            r1.onComplete()
            return
    }

    public static void complete(io.reactivex.MaybeObserver<?> r1) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r1.onSubscribe(r0)
            r1.onComplete()
            return
    }

    public static void complete(io.reactivex.Observer<?> r1) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r1.onSubscribe(r0)
            r1.onComplete()
            return
    }

    public static void error(java.lang.Throwable r1, io.reactivex.CompletableObserver r2) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r2.onSubscribe(r0)
            r2.onError(r1)
            return
    }

    public static void error(java.lang.Throwable r1, io.reactivex.MaybeObserver<?> r2) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r2.onSubscribe(r0)
            r2.onError(r1)
            return
    }

    public static void error(java.lang.Throwable r1, io.reactivex.Observer<?> r2) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r2.onSubscribe(r0)
            r2.onError(r1)
            return
    }

    public static void error(java.lang.Throwable r1, io.reactivex.SingleObserver<?> r2) {
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            r2.onSubscribe(r0)
            r2.onError(r1)
            return
    }

    public static io.reactivex.internal.disposables.EmptyDisposable valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.disposables.EmptyDisposable> r0 = io.reactivex.internal.disposables.EmptyDisposable.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.disposables.EmptyDisposable r1 = (io.reactivex.internal.disposables.EmptyDisposable) r1
            return r1
    }

    public static io.reactivex.internal.disposables.EmptyDisposable[] values() {
            io.reactivex.internal.disposables.EmptyDisposable[] r0 = io.reactivex.internal.disposables.EmptyDisposable.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.disposables.EmptyDisposable[] r0 = (io.reactivex.internal.disposables.EmptyDisposable[]) r0
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
            r0 = this;
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Should not be called!"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called!"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public java.lang.Object poll() throws java.lang.Exception {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int r1) {
            r0 = this;
            r1 = r1 & 2
            return r1
    }
}
