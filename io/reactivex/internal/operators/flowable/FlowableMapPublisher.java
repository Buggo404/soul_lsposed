package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMapPublisher<T, U> extends io.reactivex.Flowable<U> {
    final io.reactivex.functions.Function<? super T, ? extends U> mapper;
    final org.reactivestreams.Publisher<T> source;

    public FlowableMapPublisher(org.reactivestreams.Publisher<T> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r4) {
            r3 = this;
            org.reactivestreams.Publisher<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMap$MapSubscriber
            io.reactivex.functions.Function<? super T, ? extends U> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
