package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class InnerQueuedObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final io.reactivex.internal.observers.InnerQueuedObserverSupport<T> parent;
    final int prefetch;
    io.reactivex.internal.fuseable.SimpleQueue<T> queue;

    public InnerQueuedObserver(io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            r0.prefetch = r2
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            return
    }

    public int fusionMode() {
            r1 = this;
            int r0 = r1.fusionMode
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    public boolean isDone() {
            r1 = this;
            boolean r0 = r1.done
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r0 = r1.parent
            r0.innerComplete(r1)
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r0 = r1.parent
            r0.innerError(r1, r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            int r0 = r1.fusionMode
            if (r0 != 0) goto La
            io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r0 = r1.parent
            r0.innerNext(r1, r2)
            goto Lf
        La:
            io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r2 = r1.parent
            r2.drain()
        Lf:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r2, r3)
            if (r0 == 0) goto L31
            boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
            if (r0 == 0) goto L28
            io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
            r0 = 3
            int r0 = r3.requestFusion(r0)
            r1 = 1
            if (r0 != r1) goto L20
            r2.fusionMode = r0
            r2.queue = r3
            r2.done = r1
            io.reactivex.internal.observers.InnerQueuedObserverSupport<T> r3 = r2.parent
            r3.innerComplete(r2)
            return
        L20:
            r1 = 2
            if (r0 != r1) goto L28
            r2.fusionMode = r0
            r2.queue = r3
            return
        L28:
            int r3 = r2.prefetch
            int r3 = -r3
            io.reactivex.internal.fuseable.SimpleQueue r3 = io.reactivex.internal.util.QueueDrainHelper.createQueue(r3)
            r2.queue = r3
        L31:
            return
    }

    public io.reactivex.internal.fuseable.SimpleQueue<T> queue() {
            r1 = this;
            io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
            return r0
    }

    public void setDone() {
            r1 = this;
            r0 = 1
            r1.done = r0
            return
    }
}
