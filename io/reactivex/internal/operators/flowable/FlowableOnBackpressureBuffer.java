package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableOnBackpressureBuffer<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.functions.Action onOverflow;
    final boolean unbounded;

    static final class BackpressureBufferSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.functions.Action onOverflow;
        boolean outputFused;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f271s;

        BackpressureBufferSubscriber(org.reactivestreams.Subscriber<? super T> r2, int r3, boolean r4, boolean r5, io.reactivex.functions.Action r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.requested = r0
                r1.actual = r2
                r1.onOverflow = r6
                r1.delayError = r5
                if (r4 == 0) goto L18
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r2.<init>(r3)
                goto L1d
            L18:
                io.reactivex.internal.queue.SpscArrayQueue r2 = new io.reactivex.internal.queue.SpscArrayQueue
                r2.<init>(r3)
            L1d:
                r1.queue = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f271s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, org.reactivestreams.Subscriber<? super T> r5) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto Lb
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r3 = r2.queue
                r3.clear()
                return r1
            Lb:
                if (r3 == 0) goto L32
                boolean r3 = r2.delayError
                if (r3 == 0) goto L1f
                if (r4 == 0) goto L32
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L1b
                r5.onError(r3)
                goto L1e
            L1b:
                r5.onComplete()
            L1e:
                return r1
            L1f:
                java.lang.Throwable r3 = r2.error
                if (r3 == 0) goto L2c
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r4 = r2.queue
                r4.clear()
                r5.onError(r3)
                return r1
            L2c:
                if (r4 == 0) goto L32
                r5.onComplete()
                return r1
            L32:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        void drain() {
                r14 = this;
                int r0 = r14.getAndIncrement()
                if (r0 != 0) goto L6b
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r14.queue
                org.reactivestreams.Subscriber<? super T> r1 = r14.actual
                r2 = 1
                r3 = r2
            Lc:
                boolean r4 = r14.done
                boolean r5 = r0.isEmpty()
                boolean r4 = r14.checkTerminated(r4, r5, r1)
                if (r4 == 0) goto L19
                return
            L19:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L22:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L42
                boolean r11 = r14.done
                java.lang.Object r12 = r0.poll()
                if (r12 != 0) goto L30
                r13 = r2
                goto L31
            L30:
                r13 = 0
            L31:
                boolean r11 = r14.checkTerminated(r11, r13, r1)
                if (r11 == 0) goto L38
                return
            L38:
                if (r13 == 0) goto L3b
                goto L42
            L3b:
                r1.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L22
            L42:
                if (r10 != 0) goto L51
                boolean r10 = r14.done
                boolean r11 = r0.isEmpty()
                boolean r10 = r14.checkTerminated(r10, r11, r1)
                if (r10 == 0) goto L51
                return
            L51:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L64
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L64
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L64:
                int r3 = -r3
                int r3 = r14.addAndGet(r3)
                if (r3 != 0) goto Lc
            L6b:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                boolean r0 = r1.outputFused
                if (r0 == 0) goto Ld
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                goto L10
            Ld:
                r1.drain()
            L10:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.error = r2
                r0 = 1
                r1.done = r0
                boolean r0 = r1.outputFused
                if (r0 == 0) goto Lf
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                goto L12
            Lf:
                r1.drain()
            L12:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L25
                org.reactivestreams.Subscription r2 = r1.f271s
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Buffer is full"
                r2.<init>(r0)
                io.reactivex.functions.Action r0 = r1.onOverflow     // Catch: java.lang.Throwable -> L1a
                r0.run()     // Catch: java.lang.Throwable -> L1a
                goto L21
            L1a:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.initCause(r0)
            L21:
                r1.onError(r2)
                return
            L25:
                boolean r2 = r1.outputFused
                if (r2 == 0) goto L30
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                goto L33
            L30:
                r1.drain()
            L33:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f271s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f271s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = r1.outputFused
                if (r0 != 0) goto L12
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L12
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            L12:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }
    }

    public FlowableOnBackpressureBuffer(io.reactivex.Flowable<T> r1, int r2, boolean r3, boolean r4, io.reactivex.functions.Action r5) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferSize = r2
            r0.unbounded = r3
            r0.delayError = r4
            r0.onOverflow = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer$BackpressureBufferSubscriber
            int r3 = r8.bufferSize
            boolean r4 = r8.unbounded
            boolean r5 = r8.delayError
            io.reactivex.functions.Action r6 = r8.onOverflow
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
