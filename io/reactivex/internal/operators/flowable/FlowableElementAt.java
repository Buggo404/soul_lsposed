package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableElementAt<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    static final class ElementAtSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;

        /* renamed from: s */
        org.reactivestreams.Subscription f250s;

        ElementAtSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, T r4, boolean r5) {
                r0 = this;
                r0.<init>(r1)
                r0.index = r2
                r0.defaultValue = r4
                r0.errorOnFewer = r5
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                org.reactivestreams.Subscription r0 = r1.f250s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L23
                r0 = 1
                r2.done = r0
                T r0 = r2.defaultValue
                if (r0 != 0) goto L20
                boolean r0 = r2.errorOnFewer
                if (r0 == 0) goto L1a
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                goto L23
            L1a:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L23
            L20:
                r2.complete(r0)
            L23:
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
                long r0 = r4.count
                long r2 = r4.index
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L19
                r0 = 1
                r4.done = r0
                org.reactivestreams.Subscription r0 = r4.f250s
                r0.cancel()
                r4.complete(r5)
                return
            L19:
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f250s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f250s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableElementAt(io.reactivex.Flowable<T> r1, long r2, T r4, boolean r5) {
            r0 = this;
            r0.<init>(r1)
            r0.index = r2
            r0.defaultValue = r4
            r0.errorOnFewer = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableElementAt$ElementAtSubscriber
            long r3 = r8.index
            T r5 = r8.defaultValue
            boolean r6 = r8.errorOnFewer
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r7)
            return
    }
}
