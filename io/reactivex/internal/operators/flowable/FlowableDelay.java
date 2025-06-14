package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDelay<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class DelaySubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        final long delay;
        final boolean delayError;

        /* renamed from: s */
        org.reactivestreams.Subscription f238s;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f239w;

        final class OnComplete implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber this$0;

            OnComplete(io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = r2.this$0     // Catch: java.lang.Throwable -> Lf
                    org.reactivestreams.Subscriber<? super T> r0 = r0.actual     // Catch: java.lang.Throwable -> Lf
                    r0.onComplete()     // Catch: java.lang.Throwable -> Lf
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = r2.this$0
                    io.reactivex.Scheduler$Worker r0 = r0.f239w
                    r0.dispose()
                    return
                Lf:
                    r0 = move-exception
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r1 = r2.this$0
                    io.reactivex.Scheduler$Worker r1 = r1.f239w
                    r1.dispose()
                    throw r0
            }
        }

        final class OnError implements java.lang.Runnable {

            /* renamed from: t */
            private final java.lang.Throwable f240t;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber this$0;

            OnError(io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber r1, java.lang.Throwable r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f240t = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = r2.this$0     // Catch: java.lang.Throwable -> L11
                    org.reactivestreams.Subscriber<? super T> r0 = r0.actual     // Catch: java.lang.Throwable -> L11
                    java.lang.Throwable r1 = r2.f240t     // Catch: java.lang.Throwable -> L11
                    r0.onError(r1)     // Catch: java.lang.Throwable -> L11
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = r2.this$0
                    io.reactivex.Scheduler$Worker r0 = r0.f239w
                    r0.dispose()
                    return
                L11:
                    r0 = move-exception
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r1 = r2.this$0
                    io.reactivex.Scheduler$Worker r1 = r1.f239w
                    r1.dispose()
                    throw r0
            }
        }

        final class OnNext implements java.lang.Runnable {

            /* renamed from: t */
            private final T f241t;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber this$0;

            OnNext(io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber r1, T r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f241t = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = r2.this$0
                    org.reactivestreams.Subscriber<? super T> r0 = r0.actual
                    T r1 = r2.f241t
                    r0.onNext(r1)
                    return
            }
        }

        DelaySubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.delay = r2
                r0.unit = r4
                r0.f239w = r5
                r0.delayError = r6
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f238s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.f239w
                r0.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r5 = this;
                io.reactivex.Scheduler$Worker r0 = r5.f239w
                io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnComplete r1 = new io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnComplete
                r1.<init>(r5)
                long r2 = r5.delay
                java.util.concurrent.TimeUnit r4 = r5.unit
                r0.schedule(r1, r2, r4)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.f239w
                io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnError r1 = new io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnError
                r1.<init>(r4, r5)
                boolean r5 = r4.delayError
                if (r5 == 0) goto Le
                long r2 = r4.delay
                goto L10
            Le:
                r2 = 0
            L10:
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.f239w
                io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnNext r1 = new io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnNext
                r1.<init>(r4, r5)
                long r2 = r4.delay
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f238s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f238s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f238s
                r0.request(r2)
                return
        }
    }

    public FlowableDelay(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            boolean r0 = r8.delayError
            if (r0 == 0) goto L6
            r2 = r9
            goto Lc
        L6:
            io.reactivex.subscribers.SerializedSubscriber r0 = new io.reactivex.subscribers.SerializedSubscriber
            r0.<init>(r9)
            r2 = r0
        Lc:
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            io.reactivex.Flowable<T> r9 = r8.source
            io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber
            long r3 = r8.delay
            java.util.concurrent.TimeUnit r5 = r8.unit
            boolean r7 = r8.delayError
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7)
            r9.subscribe(r0)
            return
    }
}
