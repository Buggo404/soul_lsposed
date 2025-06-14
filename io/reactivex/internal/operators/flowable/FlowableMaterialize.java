package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMaterialize<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Notification<T>> {

    static final class MaterializeSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, io.reactivex.Notification<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        MaterializeSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Notification<T>> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.Notification r0 = io.reactivex.Notification.createOnComplete()
                r1.complete(r0)
                return
        }

        protected void onDrop(io.reactivex.Notification<T> r2) {
                r1 = this;
                boolean r0 = r2.isOnError()
                if (r0 == 0) goto Ld
                java.lang.Throwable r2 = r2.getError()
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Ld:
                return
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        protected /* bridge */ /* synthetic */ void onDrop(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onDrop(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                io.reactivex.Notification r1 = io.reactivex.Notification.createOnError(r1)
                r0.complete(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                io.reactivex.Notification r5 = io.reactivex.Notification.createOnNext(r5)
                r0.onNext(r5)
                return
        }
    }

    public FlowableMaterialize(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Notification<T>> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableMaterialize$MaterializeSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableMaterialize$MaterializeSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
