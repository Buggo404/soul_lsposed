package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSerialized<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableSerialized(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.subscribers.SerializedSubscriber r1 = new io.reactivex.subscribers.SerializedSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
