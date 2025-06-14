package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableCreate<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.BackpressureStrategy backpressure;
    final io.reactivex.FlowableOnSubscribe<T> source;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    static /* synthetic */ class C09551 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy = null;

        static {
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.FlowableCreate.C09551.$SwitchMap$io$reactivex$BackpressureStrategy = r0
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.C09551.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.C09551.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L28
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.C09551.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L33
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    static abstract class BaseEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableEmitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.disposables.SequentialDisposable serial;

        BaseEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.serial = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.dispose()
                r1.onUnsubscribed()
                return
        }

        protected void complete() {
                r2 = this;
                boolean r0 = r2.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual     // Catch: java.lang.Throwable -> L12
                r0.onComplete()     // Catch: java.lang.Throwable -> L12
                io.reactivex.internal.disposables.SequentialDisposable r0 = r2.serial
                r0.dispose()
                return
            L12:
                r0 = move-exception
                io.reactivex.internal.disposables.SequentialDisposable r1 = r2.serial
                r1.dispose()
                throw r0
        }

        protected boolean error(java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L9
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L9:
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto L11
                r2 = 0
                return r2
            L11:
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual     // Catch: java.lang.Throwable -> L1d
                r0.onError(r2)     // Catch: java.lang.Throwable -> L1d
                io.reactivex.internal.disposables.SequentialDisposable r2 = r1.serial
                r2.dispose()
                r2 = 1
                return r2
            L1d:
                r2 = move-exception
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.dispose()
                throw r2
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r0 = this;
                r0.complete()
                return
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.tryOnError(r2)
                if (r0 != 0) goto L9
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L9:
                return
        }

        void onRequested() {
                r0 = this;
                return
        }

        void onUnsubscribed() {
                r0 = this;
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Lc
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
                r1.onRequested()
            Lc:
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
                r2 = this;
                long r0 = r2.get()
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public final io.reactivex.FlowableEmitter<T> serialize() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter
                r0.<init>(r1)
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.update(r2)
                return
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public java.lang.String toString() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                java.lang.String r2 = super.toString()
                r0[r1] = r2
                java.lang.String r1 = "%s{%s}"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable r1) {
                r0 = this;
                boolean r1 = r0.error(r1)
                return r1
        }
    }

    static final class BufferAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        BufferAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r2)
                r0.queue = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        void drain() {
                r14 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r14.wip
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super T> r0 = r14.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r1 = r14.queue
                r2 = 1
                r3 = r2
            Lf:
                long r4 = r14.get()
                r6 = 0
                r8 = r6
            L16:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L49
                boolean r11 = r14.isCancelled()
                if (r11 == 0) goto L24
                r1.clear()
                return
            L24:
                boolean r11 = r14.done
                java.lang.Object r12 = r1.poll()
                if (r12 != 0) goto L2e
                r13 = r2
                goto L2f
            L2e:
                r13 = 0
            L2f:
                if (r11 == 0) goto L3f
                if (r13 == 0) goto L3f
                java.lang.Throwable r0 = r14.error
                if (r0 == 0) goto L3b
                r14.error(r0)
                goto L3e
            L3b:
                r14.complete()
            L3e:
                return
            L3f:
                if (r13 == 0) goto L42
                goto L49
            L42:
                r0.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L16
            L49:
                if (r10 != 0) goto L6b
                boolean r4 = r14.isCancelled()
                if (r4 == 0) goto L55
                r1.clear()
                return
            L55:
                boolean r4 = r14.done
                boolean r5 = r1.isEmpty()
                if (r4 == 0) goto L6b
                if (r5 == 0) goto L6b
                java.lang.Throwable r0 = r14.error
                if (r0 == 0) goto L67
                r14.error(r0)
                goto L6a
            L67:
                r14.complete()
            L6a:
                return
            L6b:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L72
                io.reactivex.internal.util.BackpressureHelper.produced(r14, r8)
            L72:
                java.util.concurrent.atomic.AtomicInteger r4 = r14.wip
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Lf
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L20
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r2 != 0) goto L18
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            L18:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
            L20:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
                r0 = this;
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Ld
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.clear()
            Ld:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L1d
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L1d
            Lb:
                if (r2 != 0) goto L14
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L14:
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return r2
            L1d:
                r2 = 0
                return r2
        }
    }

    static final class DropAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        DropAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
                r0 = this;
                return
        }
    }

    static final class ErrorAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
                r2 = this;
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "create: could not emit value due to lack of requests"
                r0.<init>(r1)
                r2.onError(r0)
                return
        }
    }

    static final class LatestAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicReference<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        LatestAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.queue = r1
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        void drain() {
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.wip
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lb
                return
            Lb:
                org.reactivestreams.Subscriber<? super T> r1 = r0.actual
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.queue
                r3 = 1
                r4 = r3
            L11:
                long r5 = r17.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L4f
                boolean r14 = r17.isCancelled()
                if (r14 == 0) goto L28
                r2.lazySet(r13)
                return
            L28:
                boolean r14 = r0.done
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L33
                r16 = r3
                goto L35
            L33:
                r16 = r12
            L35:
                if (r14 == 0) goto L45
                if (r16 == 0) goto L45
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L41
                r0.error(r1)
                goto L44
            L41:
                r17.complete()
            L44:
                return
            L45:
                if (r16 == 0) goto L48
                goto L4f
            L48:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L4f:
                if (r11 != 0) goto L74
                boolean r5 = r17.isCancelled()
                if (r5 == 0) goto L5b
                r2.lazySet(r13)
                return
            L5b:
                boolean r5 = r0.done
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L64
                r12 = r3
            L64:
                if (r5 == 0) goto L74
                if (r12 == 0) goto L74
                java.lang.Throwable r1 = r0.error
                if (r1 == 0) goto L70
                r0.error(r1)
                goto L73
            L70:
                r17.complete()
            L73:
                return
            L74:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7b
                io.reactivex.internal.util.BackpressureHelper.produced(r0, r9)
            L7b:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.wip
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L11
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L20
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r2 != 0) goto L18
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            L18:
                java.util.concurrent.atomic.AtomicReference<T> r0 = r1.queue
                r0.set(r2)
                r1.drain()
            L20:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
                r0 = this;
                r0.drain()
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto Le
                java.util.concurrent.atomic.AtomicReference<T> r0 = r2.queue
                r1 = 0
                r0.lazySet(r1)
            Le:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L20
                boolean r0 = r2.isCancelled()
                if (r0 == 0) goto Lb
                goto L20
            Lb:
                if (r3 != 0) goto L17
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r0.<init>(r1)
                r2.onError(r0)
            L17:
                r2.error = r3
                r3 = 1
                r2.done = r3
                r2.drain()
                return r3
            L20:
                r3 = 0
                return r3
        }
    }

    static final class MissingEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                if (r5 == 0) goto L23
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
            Le:
                long r0 = r4.get()
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L22
                r2 = 1
                long r2 = r0 - r2
                boolean r5 = r4.compareAndSet(r0, r2)
                if (r5 == 0) goto Le
            L22:
                return
            L23:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r5.<init>(r0)
                r4.onError(r5)
                return
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        NoOverflowBaseAsyncEmitter(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                if (r5 != 0) goto L14
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r5.<init>(r0)
                r4.onError(r5)
                return
            L14:
                long r0 = r4.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L29
                org.reactivestreams.Subscriber<? super T> r0 = r4.actual
                r0.onNext(r5)
                r0 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r0)
                goto L2c
            L29:
                r4.onOverflow()
            L2c:
                return
        }

        abstract void onOverflow();
    }

    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> emitter;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;

        SerializedEmitter(io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> r2) {
                r1 = this;
                r1.<init>()
                r1.emitter = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0 = 16
                r2.<init>(r0)
                r1.queue = r2
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r8 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r8.emitter
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r1 = r8.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r8.error
                r3 = 1
                r4 = r3
            L8:
                boolean r5 = r0.isCancelled()
                if (r5 == 0) goto L12
                r1.clear()
                return
            L12:
                java.lang.Object r5 = r2.get()
                if (r5 == 0) goto L23
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L23:
                boolean r5 = r8.done
                java.lang.Object r6 = r1.poll()
                if (r6 != 0) goto L2d
                r7 = r3
                goto L2e
            L2d:
                r7 = 0
            L2e:
                if (r5 == 0) goto L36
                if (r7 == 0) goto L36
                r0.onComplete()
                return
            L36:
                if (r7 == 0) goto L40
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto L8
                return
            L40:
                r0.onNext(r6)
                goto L8
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L13
                boolean r0 = r1.done
                if (r0 == 0) goto Ld
                goto L13
            Ld:
                r0 = 1
                r1.done = r0
                r1.drain()
            L13:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.tryOnError(r2)
                if (r0 != 0) goto L9
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L9:
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                boolean r0 = r0.isCancelled()
                if (r0 != 0) goto L49
                boolean r0 = r2.done
                if (r0 == 0) goto Ld
                goto L49
            Ld:
                if (r3 != 0) goto L1a
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
                r2.onError(r3)
                return
            L1a:
                int r0 = r2.get()
                if (r0 != 0) goto L34
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L34
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                r0.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L42
                return
            L34:
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r2.queue
                monitor-enter(r0)
                r0.offer(r3)     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L42
                return
            L42:
                r2.drainLoop()
                return
            L46:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                throw r3
            L49:
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public long requested() {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                long r0 = r0.requested()
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public io.reactivex.FlowableEmitter<T> serialize() {
                r0 = this;
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                r0.setCancellable(r2)
                return
        }

        @Override // io.reactivex.FlowableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                r0.setDisposable(r2)
                return
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public java.lang.String toString() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r1.emitter
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter<T> r0 = r2.emitter
                boolean r0 = r0.isCancelled()
                r1 = 0
                if (r0 != 0) goto L26
                boolean r0 = r2.done
                if (r0 == 0) goto Le
                goto L26
            Le:
                if (r3 != 0) goto L17
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
            L17:
                io.reactivex.internal.util.AtomicThrowable r0 = r2.error
                boolean r3 = r0.addThrowable(r3)
                if (r3 == 0) goto L26
                r3 = 1
                r2.done = r3
                r2.drain()
                return r3
            L26:
                return r1
        }
    }

    public FlowableCreate(io.reactivex.FlowableOnSubscribe<T> r1, io.reactivex.BackpressureStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.backpressure = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            int[] r0 = io.reactivex.internal.operators.flowable.FlowableCreate.C09551.$SwitchMap$io$reactivex$BackpressureStrategy
            io.reactivex.BackpressureStrategy r1 = r2.backpressure
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L20
            io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter
            int r1 = bufferSize()
            r0.<init>(r3, r1)
            goto L37
        L20:
            io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter
            r0.<init>(r3)
            goto L37
        L26:
            io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter
            r0.<init>(r3)
            goto L37
        L2c:
            io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter
            r0.<init>(r3)
            goto L37
        L32:
            io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter r0 = new io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter
            r0.<init>(r3)
        L37:
            r3.onSubscribe(r0)
            io.reactivex.FlowableOnSubscribe<T> r3 = r2.source     // Catch: java.lang.Throwable -> L40
            r3.subscribe(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            r0.onError(r3)
        L47:
            return
    }
}
