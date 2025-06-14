package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTimeInterval<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class TimeIntervalSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> actual;
        long lastTime;

        /* renamed from: s */
        org.reactivestreams.Subscription f316s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        TimeIntervalSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r1, java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r3
                r0.unit = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f316s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r6) {
                r5 = this;
                io.reactivex.Scheduler r0 = r5.scheduler
                java.util.concurrent.TimeUnit r1 = r5.unit
                long r0 = r0.now(r1)
                long r2 = r5.lastTime
                r5.lastTime = r0
                long r0 = r0 - r2
                org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r2 = r5.actual
                io.reactivex.schedulers.Timed r3 = new io.reactivex.schedulers.Timed
                java.util.concurrent.TimeUnit r4 = r5.unit
                r3.<init>(r6, r0, r4)
                r2.onNext(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f316s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L19
                io.reactivex.Scheduler r0 = r2.scheduler
                java.util.concurrent.TimeUnit r1 = r2.unit
                long r0 = r0.now(r1)
                r2.lastTime = r0
                r2.f316s = r3
                org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r3 = r2.actual
                r3.onSubscribe(r2)
            L19:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f316s
                r0.request(r2)
                return
        }
    }

    public FlowableTimeInterval(io.reactivex.Flowable<T> r1, java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r3
            r0.unit = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableTimeInterval$TimeIntervalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableTimeInterval$TimeIntervalSubscriber
            java.util.concurrent.TimeUnit r2 = r4.unit
            io.reactivex.Scheduler r3 = r4.scheduler
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
