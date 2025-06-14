package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        volatile boolean gate;

        /* renamed from: s */
        org.reactivestreams.Subscription f315s;
        final long timeout;
        final io.reactivex.internal.disposables.SequentialDisposable timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler.Worker r6) {
                r1 = this;
                r1.<init>()
                io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.timeout = r3
                r1.unit = r5
                r1.worker = r6
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f315s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
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
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
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
                io.reactivex.Scheduler$Worker r2 = r1.worker
                r2.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r5.gate
                if (r0 != 0) goto L4e
                r0 = 1
                r5.gate = r0
                long r1 = r5.get()
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L3d
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onNext(r6)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r5, r0)
                io.reactivex.internal.disposables.SequentialDisposable r6 = r5.timer
                java.lang.Object r6 = r6.get()
                io.reactivex.disposables.Disposable r6 = (io.reactivex.disposables.Disposable) r6
                if (r6 == 0) goto L2d
                r6.dispose()
            L2d:
                io.reactivex.internal.disposables.SequentialDisposable r6 = r5.timer
                io.reactivex.Scheduler$Worker r0 = r5.worker
                long r1 = r5.timeout
                java.util.concurrent.TimeUnit r3 = r5.unit
                io.reactivex.disposables.Disposable r0 = r0.schedule(r5, r1, r3)
                r6.replace(r0)
                goto L4e
            L3d:
                r5.done = r0
                r5.cancel()
                org.reactivestreams.Subscriber<? super T> r6 = r5.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver value due to lack of requests"
                r0.<init>(r1)
                r6.onError(r0)
            L4e:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f315s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f315s = r3
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

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.gate = r0
                return
        }
    }

    public FlowableThrottleFirstTimed(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed$DebounceTimedSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed$DebounceTimedSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r9)
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            r1 = r7
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r7)
            return
    }
}
