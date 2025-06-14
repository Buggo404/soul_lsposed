package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriberPad4 implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.util.QueueDrain<U, V> {
    protected final org.reactivestreams.Subscriber<? super V> actual;
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected java.lang.Throwable error;
    protected final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(org.reactivestreams.Subscriber<? super V> r1, io.reactivex.internal.fuseable.SimplePlainQueue<U> r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.queue = r2
            return
    }

    public boolean accept(org.reactivestreams.Subscriber<? super V> r1, U r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
            r1 = this;
            boolean r0 = r1.done
            return r0
    }

    @Override // io.reactivex.internal.util.QueueDrain
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

    @Override // io.reactivex.internal.util.QueueDrain
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

    protected final void fastPathEmitMax(U r7, boolean r8, io.reactivex.disposables.Disposable r9) {
            r6 = this;
            org.reactivestreams.Subscriber<? super V> r0 = r6.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r6.queue
            boolean r2 = r6.fastEnter()
            if (r2 == 0) goto L40
            java.util.concurrent.atomic.AtomicLong r2 = r6.requested
            long r2 = r2.get()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L32
            boolean r7 = r6.accept(r0, r7)
            if (r7 == 0) goto L2a
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L2a
            r2 = 1
            r6.produced(r2)
        L2a:
            r7 = -1
            int r7 = r6.leave(r7)
            if (r7 != 0) goto L4a
            return
        L32:
            r9.dispose()
            io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r8 = "Could not emit buffer due to lack of requests"
            r7.<init>(r8)
            r0.onError(r7)
            return
        L40:
            r1.offer(r7)
            boolean r7 = r6.enter()
            if (r7 != 0) goto L4a
            return
        L4a:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r1, r0, r8, r9, r6)
            return
    }

    protected final void fastPathOrderedEmitMax(U r7, boolean r8, io.reactivex.disposables.Disposable r9) {
            r6 = this;
            org.reactivestreams.Subscriber<? super V> r0 = r6.actual
            io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r6.queue
            boolean r2 = r6.fastEnter()
            if (r2 == 0) goto L4d
            java.util.concurrent.atomic.AtomicLong r2 = r6.requested
            long r2 = r2.get()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L3c
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L38
            boolean r7 = r6.accept(r0, r7)
            if (r7 == 0) goto L30
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L30
            r2 = 1
            r6.produced(r2)
        L30:
            r7 = -1
            int r7 = r6.leave(r7)
            if (r7 != 0) goto L57
            return
        L38:
            r1.offer(r7)
            goto L57
        L3c:
            r7 = 1
            r6.cancelled = r7
            r9.dispose()
            io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r8 = "Could not emit buffer due to lack of requests"
            r7.<init>(r8)
            r0.onError(r7)
            return
        L4d:
            r1.offer(r7)
            boolean r7 = r6.enter()
            if (r7 != 0) goto L57
            return
        L57:
            io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(r1, r0, r8, r9, r6)
            return
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
            int r2 = r0.addAndGet(r2)
            return r2
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            long r2 = -r2
            long r2 = r0.addAndGet(r2)
            return r2
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.requested
            long r0 = r0.get()
            return r0
    }

    public final void requested(long r2) {
            r1 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r0 == 0) goto Lb
            java.util.concurrent.atomic.AtomicLong r0 = r1.requested
            io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
        Lb:
            return
    }
}
