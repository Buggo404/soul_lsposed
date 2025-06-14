package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class BlockingObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    public static final java.lang.Object TERMINATED = null;
    private static final long serialVersionUID = -4875965440900746268L;
    final java.util.Queue<java.lang.Object> queue;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.observers.BlockingObserver.TERMINATED = r0
            return
    }

    public BlockingObserver(java.util.Queue<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.queue = r1
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r2 = this;
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
            if (r0 == 0) goto Ld
            java.util.Queue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.observers.BlockingObserver.TERMINATED
            r0.offer(r1)
        Ld:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r2 = this;
            java.lang.Object r0 = r2.get()
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            java.util.Queue<java.lang.Object> r0 = r2.queue
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()
            r0.offer(r1)
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.error(r2)
            r0.offer(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            java.util.Queue<java.lang.Object> r0 = r1.queue
            java.lang.Object r2 = io.reactivex.internal.util.NotificationLite.next(r2)
            r0.offer(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
            return
    }
}
