package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFromPublisher<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T> publisher;

    public FlowableFromPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.publisher = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r1.publisher
            r0.subscribe(r2)
            return
    }
}
