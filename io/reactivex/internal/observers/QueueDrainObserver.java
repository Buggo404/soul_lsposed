package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public abstract class QueueDrainObserver<T, U, V> extends io.reactivex.internal.observers.QueueDrainSubscriberPad2 implements io.reactivex.Observer<T>, io.reactivex.internal.util.ObservableQueueDrain<U, V> {
    protected final io.reactivex.Observer<? super V> actual;
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected java.lang.Throwable error;
    protected final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    public QueueDrainObserver(io.reactivex.Observer<? super V> r1, io.reactivex.internal.fuseable.SimplePlainQueue<U> r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.queue = r2
            return
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public void accept(io.reactivex.Observer<? super V> r1, U r2) {
            r0 = this;
            return
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean cancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean done() {
            r1 = this;
            boolean r0 = r1.done
            return r0
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean enter() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r0 = r0.getAndIncrement()
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final java.lang.Throwable error() {
            r1 = this;
            java.lang.Throwable r0 = r1.error
            return r0
    }

    public final boolean fastEnter() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.wip
            int r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicInteger r0 = r3.wip
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L13
            r1 = r2
        L13:
            return r1
    }

    protected final void fastPathEmit(U r6, boolean r7, io.reactivex.disposables.Disposable r8) {
            r5 = this;
            io.reactivex.Observer<? super V> r0 = r5.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r5.queue
            java.util.concurrent.atomic.AtomicInteger r2 = r5.wip
            int r2 = r2.get()
            if (r2 != 0) goto L21
            java.util.concurrent.atomic.AtomicInteger r2 = r5.wip
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L21
            r5.accept(r0, r6)
            r6 = -1
            int r6 = r5.leave(r6)
            if (r6 != 0) goto L2b
            return
        L21:
            r1.offer(r6)
            boolean r6 = r5.enter()
            if (r6 != 0) goto L2b
            return
        L2b:
            io.reactivex.internal.util.QueueDrainHelper.drainLoop(r1, r0, r7, r8, r5)
            return
    }

    protected final void fastPathOrderedEmit(U r6, boolean r7, io.reactivex.disposables.Disposable r8) {
            r5 = this;
            io.reactivex.Observer<? super V> r0 = r5.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r5.queue
            java.util.concurrent.atomic.AtomicInteger r2 = r5.wip
            int r2 = r2.get()
            if (r2 != 0) goto L2b
            java.util.concurrent.atomic.AtomicInteger r2 = r5.wip
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L2b
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L27
            r5.accept(r0, r6)
            r6 = -1
            int r6 = r5.leave(r6)
            if (r6 != 0) goto L35
            return
        L27:
            r1.offer(r6)
            goto L35
        L2b:
            r1.offer(r6)
            boolean r6 = r5.enter()
            if (r6 != 0) goto L35
            return
        L35:
            io.reactivex.internal.util.QueueDrainHelper.drainLoop(r1, r0, r7, r8, r5)
            return
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final int leave(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r2 = r0.addAndGet(r2)
            return r2
    }
}
