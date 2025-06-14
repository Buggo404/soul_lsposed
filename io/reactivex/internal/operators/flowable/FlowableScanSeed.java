package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableScanSeed<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
    final java.util.concurrent.Callable<R> seedSupplier;

    static final class ScanSeedSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -1776795561228106469L;
        final io.reactivex.functions.BiFunction<R, ? super T, R> accumulator;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        java.lang.Throwable error;
        final int limit;
        final int prefetch;
        final io.reactivex.internal.fuseable.SimplePlainQueue<R> queue;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f291s;
        R value;

        ScanSeedSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.BiFunction<R, ? super T, R> r2, R r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.accumulator = r2
                r0.value = r3
                r0.prefetch = r4
                int r1 = r4 >> 2
                int r1 = r4 - r1
                r0.limit = r1
                io.reactivex.internal.queue.SpscArrayQueue r1 = new io.reactivex.internal.queue.SpscArrayQueue
                r1.<init>(r4)
                r0.queue = r1
                r1.offer(r3)
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f291s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L13
                io.reactivex.internal.fuseable.SimplePlainQueue<R> r0 = r1.queue
                r0.clear()
            L13:
                return
        }

        void drain() {
                r18 = this;
                r0 = r18
                int r1 = r18.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super R> r1 = r0.actual
                io.reactivex.internal.fuseable.SimplePlainQueue<R> r2 = r0.queue
                int r3 = r0.limit
                int r4 = r0.consumed
                r5 = 1
                r6 = r5
            L13:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L1c:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L62
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L28
                r2.clear()
                return
            L28:
                boolean r14 = r0.done
                if (r14 == 0) goto L37
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L37
                r2.clear()
                r1.onError(r15)
                return
            L37:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L42
                r17 = r5
                goto L44
            L42:
                r17 = r16
            L44:
                if (r14 == 0) goto L4c
                if (r17 == 0) goto L4c
                r1.onComplete()
                return
            L4c:
                if (r17 == 0) goto L4f
                goto L62
            L4f:
                r1.onNext(r15)
                r13 = 1
                long r11 = r11 + r13
                int r4 = r4 + 1
                if (r4 != r3) goto L1c
                org.reactivestreams.Subscription r4 = r0.f291s
                long r13 = (long) r3
                r4.request(r13)
                r4 = r16
                goto L1c
            L62:
                if (r13 != 0) goto L7d
                boolean r7 = r0.done
                if (r7 == 0) goto L7d
                java.lang.Throwable r7 = r0.error
                if (r7 == 0) goto L73
                r2.clear()
                r1.onError(r7)
                return
            L73:
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto L7d
                r1.onComplete()
                return
            L7d:
                int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r7 == 0) goto L86
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r7, r11)
            L86:
                r0.consumed = r4
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto L13
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
                r1.drain()
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
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                R r0 = r2.value
                io.reactivex.functions.BiFunction<R, ? super T, R> r1 = r2.accumulator     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r0 = "The accumulator returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1e
                r2.value = r3
                io.reactivex.internal.fuseable.SimplePlainQueue<R> r0 = r2.queue
                r0.offer(r3)
                r2.drain()
                return
            L1e:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f291s
                r0.cancel()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f291s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f291s = r3
                org.reactivestreams.Subscriber<? super R> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.prefetch
                int r0 = r0 + (-1)
                long r0 = (long) r0
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public FlowableScanSeed(io.reactivex.Flowable<T> r1, java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.accumulator = r3
            r0.seedSupplier = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r6) {
            r5 = this;
            java.util.concurrent.Callable<R> r0 = r5.seedSupplier     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "The seed supplied is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1d
            io.reactivex.Flowable<T> r1 = r5.source
            io.reactivex.internal.operators.flowable.FlowableScanSeed$ScanSeedSubscriber r2 = new io.reactivex.internal.operators.flowable.FlowableScanSeed$ScanSeedSubscriber
            io.reactivex.functions.BiFunction<R, ? super T, R> r3 = r5.accumulator
            int r4 = bufferSize()
            r2.<init>(r6, r3, r0, r4)
            r1.subscribe(r2)
            return
        L1d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r6)
            return
    }
}
