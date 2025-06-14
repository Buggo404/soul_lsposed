package io.reactivex.processors;

/* loaded from: classes.dex */
public final class PublishProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] EMPTY = null;
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor.PublishSubscription<T>[]> subscribers;

    static final class PublishSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.processors.PublishProcessor<T> parent;

        PublishSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.processors.PublishProcessor<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                r0 = -9223372036854775808
                long r2 = r4.getAndSet(r0)
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lf
                io.reactivex.processors.PublishProcessor<T> r0 = r4.parent
                r0.remove(r4)
            Lf:
                return
        }

        public boolean isCancelled() {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        boolean isFull() {
                r4 = this;
                long r0 = r4.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public void onComplete() {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onComplete()
            Lf:
                return
        }

        public void onError(java.lang.Throwable r5) {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L10
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onError(r5)
                goto L13
            L10:
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
            L13:
                return
        }

        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.get()
                r2 = -9223372036854775808
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto Lb
                return
            Lb:
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1c
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.producedCancel(r4, r0)
                goto L2b
            L1c:
                r4.cancel()
                org.reactivestreams.Subscriber<? super T> r5 = r4.actual
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not emit value due to lack of requests"
                r0.<init>(r1)
                r5.onError(r0)
            L2b:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.addCancel(r1, r2)
            L9:
                return
        }
    }

    static {
            r0 = 0
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = new io.reactivex.processors.PublishProcessor.PublishSubscription[r0]
            io.reactivex.processors.PublishProcessor.TERMINATED = r1
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = new io.reactivex.processors.PublishProcessor.PublishSubscription[r0]
            io.reactivex.processors.PublishProcessor.EMPTY = r0
            return
    }

    PublishProcessor() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.EMPTY
            r0.<init>(r1)
            r2.subscribers = r0
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.PublishProcessor<T> create() {
            io.reactivex.processors.PublishProcessor r0 = new io.reactivex.processors.PublishProcessor
            r0.<init>()
            return r0
    }

    boolean add(io.reactivex.processors.PublishProcessor.PublishSubscription<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r3 = new io.reactivex.processors.PublishProcessor.PublishSubscription[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r1 = r4.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto Ld
            java.lang.Throwable r0 = r2.error
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean offer(T r7) {
            r6 = this;
            r0 = 1
            if (r7 != 0) goto Le
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r1 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r1)
            r6.onError(r7)
            return r0
        Le:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r1 = r6.subscribers
            java.lang.Object r1 = r1.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L19:
            if (r4 >= r2) goto L27
            r5 = r1[r4]
            boolean r5 = r5.isFull()
            if (r5 == 0) goto L24
            return r3
        L24:
            int r4 = r4 + 1
            goto L19
        L27:
            int r2 = r1.length
        L28:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            r4.onNext(r7)
            int r3 = r3 + 1
            goto L28
        L32:
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            r3.onComplete()
            int r2 = r2 + 1
            goto L15
        L1f:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto L13
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
        L13:
            r4.error = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            int r1 = r0.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L29
            r3 = r0[r2]
            r3.onError(r5)
            int r2 = r2 + 1
            goto L1f
        L29:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T r5) {
            r4 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.onNext(r5)
            int r2 = r2 + 1
            goto Lf
        L19:
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 != r1) goto Le
            r3.cancel()
            return
        Le:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r0)
            return
    }

    void remove(io.reactivex.processors.PublishProcessor.PublishSubscription<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r0 = (io.reactivex.processors.PublishProcessor.PublishSubscription[]) r0
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.EMPTY
            if (r0 != r1) goto L11
            goto L3f
        L11:
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L1e
            r4 = r0[r3]
            if (r4 != r7) goto L1b
            goto L1f
        L1b:
            int r3 = r3 + 1
            goto L14
        L1e:
            r3 = -1
        L1f:
            if (r3 >= 0) goto L22
            return
        L22:
            r4 = 1
            if (r1 != r4) goto L28
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r1 = io.reactivex.processors.PublishProcessor.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.processors.PublishProcessor$PublishSubscription[] r5 = new io.reactivex.processors.PublishProcessor.PublishSubscription[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor$PublishSubscription<T>[]> r2 = r6.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.processors.PublishProcessor$PublishSubscription r0 = new io.reactivex.processors.PublishProcessor$PublishSubscription
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L18
            boolean r3 = r0.isCancelled()
            if (r3 == 0) goto L23
            r2.remove(r0)
            goto L23
        L18:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L20
            r3.onError(r0)
            goto L23
        L20:
            r3.onComplete()
        L23:
            return
    }
}
