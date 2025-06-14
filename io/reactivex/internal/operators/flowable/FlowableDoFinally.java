package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDoFinally<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Action onFinally;

    static final class DoFinallyConditionalSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;
        final io.reactivex.functions.Action onFinally;

        /* renamed from: qs */
        io.reactivex.internal.fuseable.QueueSubscription<T> f245qs;

        /* renamed from: s */
        org.reactivestreams.Subscription f246s;
        boolean syncFused;

        DoFinallyConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onFinally = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f246s
                r0.cancel()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f245qs
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f245qs
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onComplete()
                r1.runFinally()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                r1.runFinally()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f246s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto L17
                r1.f246s = r2
                boolean r0 = r2 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L12
                io.reactivex.internal.fuseable.QueueSubscription r2 = (io.reactivex.internal.fuseable.QueueSubscription) r2
                r1.f245qs = r2
            L12:
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f245qs
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto Lf
                boolean r1 = r2.syncFused
                if (r1 == 0) goto Lf
                r2.runFinally()
            Lf:
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f246s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r4) {
                r3 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r3.f245qs
                r1 = 0
                if (r0 == 0) goto L16
                r2 = r4 & 4
                if (r2 != 0) goto L16
                int r4 = r0.requestFusion(r4)
                if (r4 == 0) goto L15
                r0 = 1
                if (r4 != r0) goto L13
                r1 = r0
            L13:
                r3.syncFused = r1
            L15:
                return r4
            L16:
                return r1
        }

        void runFinally() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.functions.Action r0 = r2.onFinally     // Catch: java.lang.Throwable -> Le
                r0.run()     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L15:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                boolean r2 = r0.tryOnNext(r2)
                return r2
        }
    }

    static final class DoFinallySubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Action onFinally;

        /* renamed from: qs */
        io.reactivex.internal.fuseable.QueueSubscription<T> f247qs;

        /* renamed from: s */
        org.reactivestreams.Subscription f248s;
        boolean syncFused;

        DoFinallySubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onFinally = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f248s
                r0.cancel()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f247qs
                r0.clear()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r1.f247qs
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                r1.runFinally()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                r1.runFinally()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f248s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto L17
                r1.f248s = r2
                boolean r0 = r2 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L12
                io.reactivex.internal.fuseable.QueueSubscription r2 = (io.reactivex.internal.fuseable.QueueSubscription) r2
                r1.f247qs = r2
            L12:
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r2.f247qs
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto Lf
                boolean r1 = r2.syncFused
                if (r1 == 0) goto Lf
                r2.runFinally()
            Lf:
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f248s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r4) {
                r3 = this;
                io.reactivex.internal.fuseable.QueueSubscription<T> r0 = r3.f247qs
                r1 = 0
                if (r0 == 0) goto L16
                r2 = r4 & 4
                if (r2 != 0) goto L16
                int r4 = r0.requestFusion(r4)
                if (r4 == 0) goto L15
                r0 = 1
                if (r4 != r0) goto L13
                r1 = r0
            L13:
                r3.syncFused = r1
            L15:
                return r4
            L16:
                return r1
        }

        void runFinally() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.functions.Action r0 = r2.onFinally     // Catch: java.lang.Throwable -> Le
                r0.run()     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L15:
                return
        }
    }

    public FlowableDoFinally(io.reactivex.Flowable<T> r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onFinally = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L13
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableDoFinally$DoFinallyConditionalSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoFinally$DoFinallyConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r4 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r4
            io.reactivex.functions.Action r2 = r3.onFinally
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            goto L1f
        L13:
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableDoFinally$DoFinallySubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDoFinally$DoFinallySubscriber
            io.reactivex.functions.Action r2 = r3.onFinally
            r1.<init>(r4, r2)
            r0.subscribe(r1)
        L1f:
            return
    }
}
