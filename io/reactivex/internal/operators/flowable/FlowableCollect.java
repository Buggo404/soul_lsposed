package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableCollect<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
    final java.util.concurrent.Callable<? extends U> initialSupplier;

    static final class CollectSubscriber<T, U> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<U> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> collector;
        boolean done;

        /* renamed from: s */
        org.reactivestreams.Subscription f228s;

        /* renamed from: u */
        final U f229u;

        CollectSubscriber(org.reactivestreams.Subscriber<? super U> r1, U r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.collector = r3
                r0.f229u = r2
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f228s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                U r0 = r1.f229u
                r1.complete(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.BiConsumer<? super U, ? super T> r0 = r2.collector     // Catch: java.lang.Throwable -> Ld
                U r1 = r2.f229u     // Catch: java.lang.Throwable -> Ld
                r0.accept(r1, r3)     // Catch: java.lang.Throwable -> Ld
                goto L19
            Ld:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f228s
                r0.cancel()
                r2.onError(r3)
            L19:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f228s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f228s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableCollect(io.reactivex.Flowable<T> r1, java.util.concurrent.Callable<? extends U> r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.initialSupplier = r2
            r0.collector = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r5) {
            r4 = this;
            java.util.concurrent.Callable<? extends U> r0 = r4.initialSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The initial value supplied is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            io.reactivex.Flowable<T> r1 = r4.source
            io.reactivex.internal.operators.flowable.FlowableCollect$CollectSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableCollect$CollectSubscriber
            io.reactivex.functions.BiConsumer<? super U, ? super T> r3 = r4.collector
            r2.<init>(r5, r0, r3)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
    }
}
