package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableTimer extends io.reactivex.Flowable<java.lang.Long> {
    final long delay;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class TimerSubscriber extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> actual;
        volatile boolean requested;

        TimerSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r1)
                if (r1 == 0) goto L9
                r1 = 1
                r0.requested = r1
            L9:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L33
                boolean r0 = r3.requested
                if (r0 == 0) goto L22
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r3.actual
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onNext(r1)
                io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                r3.lazySet(r0)
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r3.actual
                r0.onComplete()
                goto L33
            L22:
                io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.INSTANCE
                r3.lazySet(r0)
                org.reactivestreams.Subscriber<? super java.lang.Long> r0 = r3.actual
                io.reactivex.exceptions.MissingBackpressureException r1 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r2 = "Can't deliver value due to lack of requests"
                r1.<init>(r2)
                r0.onError(r1)
            L33:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.trySet(r0, r1)
                return
        }
    }

    public FlowableTimer(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            r0.<init>()
            r0.delay = r1
            r0.unit = r3
            r0.scheduler = r4
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> r5) {
            r4 = this;
            io.reactivex.internal.operators.flowable.FlowableTimer$TimerSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableTimer$TimerSubscriber
            r0.<init>(r5)
            r5.onSubscribe(r0)
            io.reactivex.Scheduler r5 = r4.scheduler
            long r1 = r4.delay
            java.util.concurrent.TimeUnit r3 = r4.unit
            io.reactivex.disposables.Disposable r5 = r5.scheduleDirect(r0, r1, r3)
            r0.setResource(r5)
            return
    }
}
