package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public class DeferredScalarSubscription<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final org.reactivestreams.Subscriber<? super T> actual;
    protected T value;

    public DeferredScalarSubscription(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    public void cancel() {
            r1 = this;
            r0 = 4
            r1.set(r0)
            r0 = 0
            r1.value = r0
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
            r1 = this;
            r0 = 32
            r1.lazySet(r0)
            r0 = 0
            r1.value = r0
            return
    }

    public final void complete(T r4) {
            r3 = this;
            int r0 = r3.get()
        L4:
            r1 = 8
            r2 = 4
            if (r0 != r1) goto L1f
            r3.value = r4
            r0 = 16
            r3.lazySet(r0)
            org.reactivestreams.Subscriber<? super T> r0 = r3.actual
            r0.onNext(r4)
            int r4 = r3.get()
            if (r4 == r2) goto L1e
            r0.onComplete()
        L1e:
            return
        L1f:
            r1 = r0 & (-3)
            if (r1 == 0) goto L24
            return
        L24:
            r1 = 2
            if (r0 != r1) goto L3a
            r0 = 3
            r3.lazySet(r0)
            org.reactivestreams.Subscriber<? super T> r0 = r3.actual
            r0.onNext(r4)
            int r4 = r3.get()
            if (r4 == r2) goto L39
            r0.onComplete()
        L39:
            return
        L3a:
            r3.value = r4
            r0 = 0
            r1 = 1
            boolean r0 = r3.compareAndSet(r0, r1)
            if (r0 == 0) goto L45
            return
        L45:
            int r0 = r3.get()
            if (r0 != r2) goto L4
            r4 = 0
            r3.value = r4
            return
    }

    public final boolean isCancelled() {
            r2 = this;
            int r0 = r2.get()
            r1 = 4
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.get()
            r1 = 16
            if (r0 == r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final T poll() {
            r3 = this;
            int r0 = r3.get()
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L13
            r0 = 32
            r3.lazySet(r0)
            T r0 = r3.value
            r3.value = r2
            return r0
        L13:
            return r2
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long r2) {
            r1 = this;
            boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
            if (r2 == 0) goto L38
        L6:
            int r2 = r1.get()
            r3 = r2 & (-2)
            if (r3 == 0) goto Lf
            return
        Lf:
            r3 = 1
            if (r2 != r3) goto L30
            r2 = 3
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L2f
            T r2 = r1.value
            if (r2 == 0) goto L2f
            r3 = 0
            r1.value = r3
            org.reactivestreams.Subscriber<? super T> r3 = r1.actual
            r3.onNext(r2)
            int r2 = r1.get()
            r0 = 4
            if (r2 == r0) goto L2f
            r3.onComplete()
        L2f:
            return
        L30:
            r2 = 0
            r3 = 2
            boolean r2 = r1.compareAndSet(r2, r3)
            if (r2 == 0) goto L6
        L38:
            return
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int r2) {
            r1 = this;
            r0 = 2
            r2 = r2 & r0
            if (r2 == 0) goto La
            r2 = 8
            r1.lazySet(r2)
            return r0
        La:
            r2 = 0
            return r2
    }

    public final boolean tryCancel() {
            r2 = this;
            r0 = 4
            int r1 = r2.getAndSet(r0)
            if (r1 == r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
