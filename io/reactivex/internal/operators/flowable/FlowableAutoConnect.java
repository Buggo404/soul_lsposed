package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableAutoConnect<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.atomic.AtomicInteger clients;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> connection;
    final int numberOfSubscribers;
    final io.reactivex.flowables.ConnectableFlowable<? extends T> source;

    public FlowableAutoConnect(io.reactivex.flowables.ConnectableFlowable<? extends T> r1, int r2, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.numberOfSubscribers = r2
            r0.connection = r3
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.clients = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.flowables.ConnectableFlowable<? extends T> r0 = r1.source
            r0.subscribe(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r1.clients
            int r2 = r2.incrementAndGet()
            int r0 = r1.numberOfSubscribers
            if (r2 != r0) goto L16
            io.reactivex.flowables.ConnectableFlowable<? extends T> r2 = r1.source
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r1.connection
            r2.connect(r0)
        L16:
            return
    }
}
