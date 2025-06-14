package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableScan<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> accumulator;

    static final class ScanSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.BiFunction<T, T, T> accumulator;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;

        /* renamed from: s */
        org.reactivestreams.Subscription f290s;
        T value;

        ScanSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f290s
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
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                T r1 = r3.value
                if (r1 != 0) goto L11
                r3.value = r4
                r0.onNext(r4)
                goto L22
            L11:
                io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator     // Catch: java.lang.Throwable -> L23
                java.lang.Object r4 = r2.apply(r1, r4)     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "The value returned by the accumulator is null"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)     // Catch: java.lang.Throwable -> L23
                r3.value = r4
                r0.onNext(r4)
            L22:
                return
            L23:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.reactivestreams.Subscription r0 = r3.f290s
                r0.cancel()
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f290s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f290s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f290s
                r0.request(r2)
                return
        }
    }

    public FlowableScan(io.reactivex.Flowable<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableScan$ScanSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableScan$ScanSubscriber
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.accumulator
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
