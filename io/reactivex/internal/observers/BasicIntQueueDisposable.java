package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public abstract class BasicIntQueueDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueDisposable<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public BasicIntQueueDisposable() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Should not be called"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T r1, T r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called"
            r1.<init>(r2)
            throw r1
    }
}
