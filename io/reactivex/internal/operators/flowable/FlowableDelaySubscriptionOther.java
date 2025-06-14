package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T> main;
    final org.reactivestreams.Publisher<U> other;

    final class DelaySubscriber implements io.reactivex.FlowableSubscriber<U> {
        final org.reactivestreams.Subscriber<? super T> child;
        boolean done;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter serial;
        final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther this$0;

        final class DelaySubscription implements org.reactivestreams.Subscription {

            /* renamed from: s */
            private final org.reactivestreams.Subscription f242s;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber this$1;

            DelaySubscription(io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber r1, org.reactivestreams.Subscription r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    r0.f242s = r2
                    return
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                    r1 = this;
                    org.reactivestreams.Subscription r0 = r1.f242s
                    r0.cancel()
                    return
            }

            @Override // org.reactivestreams.Subscription
            public void request(long r1) {
                    r0 = this;
                    return
            }
        }

        final class OnCompleteSubscriber implements io.reactivex.FlowableSubscriber<T> {
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber this$1;

            OnCompleteSubscriber(io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber r0 = r1.this$1
                    org.reactivestreams.Subscriber<? super T> r0 = r0.child
                    r0.onComplete()
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber r0 = r1.this$1
                    org.reactivestreams.Subscriber<? super T> r0 = r0.child
                    r0.onError(r2)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(T r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber r0 = r1.this$1
                    org.reactivestreams.Subscriber<? super T> r0 = r0.child
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public void onSubscribe(org.reactivestreams.Subscription r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber r0 = r1.this$1
                    io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r0.serial
                    r0.setSubscription(r2)
                    return
            }
        }

        DelaySubscriber(io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther r1, io.reactivex.internal.subscriptions.SubscriptionArbiter r2, org.reactivestreams.Subscriber<? super T> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.serial = r2
                r0.child = r3
                return
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
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther r0 = r2.this$0
                org.reactivestreams.Publisher<? extends T> r0 = r0.main
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber$OnCompleteSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber$OnCompleteSubscriber
                r1.<init>(r2)
                r0.subscribe(r1)
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
                org.reactivestreams.Subscriber<? super T> r0 = r1.child
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U r1) {
                r0 = this;
                r0.onComplete()
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = r2.serial
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber$DelaySubscription r1 = new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber$DelaySubscription
                r1.<init>(r2, r3)
                r0.setSubscription(r1)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                return
        }
    }

    public FlowableDelaySubscriptionOther(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>()
            r0.main = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.subscriptions.SubscriptionArbiter r0 = new io.reactivex.internal.subscriptions.SubscriptionArbiter
            r0.<init>()
            r3.onSubscribe(r0)
            io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther$DelaySubscriber
            r1.<init>(r2, r0, r3)
            org.reactivestreams.Publisher<U> r3 = r2.other
            r3.subscribe(r1)
            return
    }
}
