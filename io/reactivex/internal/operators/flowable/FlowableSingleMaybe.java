package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSingleMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> source;

    static final class SingleElementSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        boolean done;

        /* renamed from: s */
        org.reactivestreams.Subscription f297s;
        T value;

        SingleElementSubscriber(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f297s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f297s = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f297s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f297s = r0
                T r0 = r2.value
                r1 = 0
                r2.value = r1
                if (r0 != 0) goto L19
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
                goto L1e
            L19:
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
            L1e:
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
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f297s = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
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
                T r0 = r2.value
                if (r0 == 0) goto L22
                r3 = 1
                r2.done = r3
                org.reactivestreams.Subscription r3 = r2.f297s
                r3.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r3 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f297s = r3
                io.reactivex.MaybeObserver<? super T> r3 = r2.actual
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Sequence contains more than one element!"
                r0.<init>(r1)
                r3.onError(r0)
                return
            L22:
                r2.value = r3
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f297s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f297s = r3
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableSingleMaybe(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<T> fuseToFlowable() {
            r4 = this;
            io.reactivex.internal.operators.flowable.FlowableSingle r0 = new io.reactivex.internal.operators.flowable.FlowableSingle
            io.reactivex.Flowable<T> r1 = r4.source
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.Flowable<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableSingleMaybe$SingleElementSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSingleMaybe$SingleElementSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
