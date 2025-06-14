package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDebounceTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> parent;
        final T value;

        DebounceEmitter(T r2, long r3, io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                r1.value = r2
                r1.idx = r3
                r1.parent = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void emit() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L13
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber<T> r0 = r4.parent
                long r1 = r4.idx
                T r3 = r4.value
                r0.emit(r1, r3, r4)
            L13:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                r0.emit()
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }
    }

    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        volatile long index;

        /* renamed from: s */
        org.reactivestreams.Subscription f237s;
        final long timeout;
        io.reactivex.disposables.Disposable timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f237s
                r0.cancel()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        void emit(long r3, T r5, io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter<T> r6) {
                r2 = this;
                long r0 = r2.index
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L2d
                long r3 = r2.get()
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto L1e
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onNext(r5)
                r3 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r2, r3)
                r6.dispose()
                goto L2d
            L1e:
                r2.cancel()
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                io.reactivex.exceptions.MissingBackpressureException r4 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r5 = "Could not deliver value due to lack of requests"
                r4.<init>(r5)
                r3.onError(r4)
            L2d:
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
                io.reactivex.disposables.Disposable r0 = r1.timer
                if (r0 == 0) goto Lf
                r0.dispose()
            Lf:
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter r0 = (io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter) r0
                if (r0 == 0) goto L16
                r0.emit()
            L16:
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
                io.reactivex.disposables.Disposable r0 = r1.timer
                if (r0 == 0) goto L12
                r0.dispose()
            L12:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.worker
                r2.dispose()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.disposables.Disposable r2 = r4.timer
                if (r2 == 0) goto L13
                r2.dispose()
            L13:
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter r2 = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceEmitter
                r2.<init>(r5, r0, r4)
                r4.timer = r2
                io.reactivex.Scheduler$Worker r5 = r4.worker
                long r0 = r4.timeout
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r5 = r5.schedule(r2, r0, r3)
                r2.setResource(r5)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f237s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f237s = r3
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

    public FlowableDebounceTimed(io.reactivex.Flowable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
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
            io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed$DebounceTimedSubscriber
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
