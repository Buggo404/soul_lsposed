package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatArray<T> extends io.reactivex.Flowable<T> {
    final boolean delayError;
    final org.reactivestreams.Publisher<? extends T>[] sources;

    static final class ConcatArraySubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final boolean delayError;
        java.util.List<java.lang.Throwable> errors;
        int index;
        long produced;
        final org.reactivestreams.Publisher<? extends T>[] sources;
        final java.util.concurrent.atomic.AtomicInteger wip;

        ConcatArraySubscriber(org.reactivestreams.Publisher<? extends T>[] r1, boolean r2, org.reactivestreams.Subscriber<? super T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r3
                r0.sources = r1
                r0.delayError = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r9 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r9.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L7d
                org.reactivestreams.Publisher<? extends T>[] r0 = r9.sources
                int r1 = r0.length
                int r2 = r9.index
            Ld:
                r3 = 1
                if (r2 != r1) goto L38
                java.util.List<java.lang.Throwable> r0 = r9.errors
                if (r0 == 0) goto L32
                int r1 = r0.size()
                if (r1 != r3) goto L27
                org.reactivestreams.Subscriber<? super T> r1 = r9.actual
                r2 = 0
                java.lang.Object r0 = r0.get(r2)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.onError(r0)
                goto L37
            L27:
                org.reactivestreams.Subscriber<? super T> r1 = r9.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r2.<init>(r0)
                r1.onError(r2)
                goto L37
            L32:
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                r0.onComplete()
            L37:
                return
            L38:
                r4 = r0[r2]
                if (r4 != 0) goto L61
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "A Publisher entry is null"
                r4.<init>(r5)
                boolean r5 = r9.delayError
                if (r5 == 0) goto L5b
                java.util.List<java.lang.Throwable> r5 = r9.errors
                if (r5 != 0) goto L55
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r1 - r2
                int r6 = r6 + r3
                r5.<init>(r6)
                r9.errors = r5
            L55:
                r5.add(r4)
                int r2 = r2 + 1
                goto Ld
            L5b:
                org.reactivestreams.Subscriber<? super T> r0 = r9.actual
                r0.onError(r4)
                return
            L61:
                long r5 = r9.produced
                r7 = 0
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r3 == 0) goto L6e
                r9.produced = r7
                r9.produced(r5)
            L6e:
                r4.subscribe(r9)
                int r2 = r2 + 1
                r9.index = r2
                java.util.concurrent.atomic.AtomicInteger r3 = r9.wip
                int r3 = r3.decrementAndGet()
                if (r3 != 0) goto Ld
            L7d:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                boolean r0 = r3.delayError
                if (r0 == 0) goto L1e
                java.util.List<java.lang.Throwable> r0 = r3.errors
                if (r0 != 0) goto L17
                java.util.ArrayList r0 = new java.util.ArrayList
                org.reactivestreams.Publisher<? extends T>[] r1 = r3.sources
                int r1 = r1.length
                int r2 = r3.index
                int r1 = r1 - r2
                int r1 = r1 + 1
                r0.<init>(r1)
                r3.errors = r0
            L17:
                r0.add(r4)
                r3.onComplete()
                goto L23
            L1e:
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                r0.onError(r4)
            L23:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r1) {
                r0 = this;
                r0.setSubscription(r1)
                return
        }
    }

    public FlowableConcatArray(org.reactivestreams.Publisher<? extends T>[] r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.delayError = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableConcatArray$ConcatArraySubscriber
            org.reactivestreams.Publisher<? extends T>[] r1 = r3.sources
            boolean r2 = r3.delayError
            r0.<init>(r1, r2, r4)
            r4.onSubscribe(r0)
            r0.onComplete()
            return
    }
}
