package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableOnBackpressureDrop<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> implements io.reactivex.functions.Consumer<T> {
    final io.reactivex.functions.Consumer<? super T> onDrop;

    static final class BackpressureDropSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final io.reactivex.functions.Consumer<? super T> onDrop;

        /* renamed from: s */
        org.reactivestreams.Subscription f273s;

        BackpressureDropSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onDrop = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f273s
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
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
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
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1a
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r0)
                goto L2a
            L1a:
                io.reactivex.functions.Consumer<? super T> r0 = r4.onDrop     // Catch: java.lang.Throwable -> L20
                r0.accept(r5)     // Catch: java.lang.Throwable -> L20
                goto L2a
            L20:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r4.cancel()
                r4.onError(r5)
            L2a:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f273s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f273s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
            L9:
                return
        }
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> r1) {
            r0 = this;
            r0.<init>(r1)
            r0.onDrop = r0
            return
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onDrop = r2
            return
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(T r1) {
            r0 = this;
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber
            io.reactivex.functions.Consumer<? super T> r2 = r3.onDrop
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
