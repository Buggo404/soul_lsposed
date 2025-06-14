package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTakePublisher<T> extends io.reactivex.Flowable<T> {
    final long limit;
    final org.reactivestreams.Publisher<T> source;

    public FlowableTakePublisher(org.reactivestreams.Publisher<T> r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.limit = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTake$TakeSubscriber
            long r2 = r4.limit
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
