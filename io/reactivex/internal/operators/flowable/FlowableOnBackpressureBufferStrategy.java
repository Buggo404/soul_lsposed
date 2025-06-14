package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final io.reactivex.functions.Action onOverflow;
    final io.reactivex.BackpressureOverflowStrategy strategy;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    static /* synthetic */ class C09561 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy = null;

        static {
                io.reactivex.BackpressureOverflowStrategy[] r0 = io.reactivex.BackpressureOverflowStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.C09561.$SwitchMap$io$reactivex$BackpressureOverflowStrategy = r0
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_LATEST     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.C09561.$SwitchMap$io$reactivex$BackpressureOverflowStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.BackpressureOverflowStrategy r1 = io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    static final class OnBackpressureBufferStrategySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final long bufferSize;
        volatile boolean cancelled;
        final java.util.Deque<T> deque;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.functions.Action onOverflow;
        final java.util.concurrent.atomic.AtomicLong requested;

        /* renamed from: s */
        org.reactivestreams.Subscription f272s;
        final io.reactivex.BackpressureOverflowStrategy strategy;

        OnBackpressureBufferStrategySubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Action r2, io.reactivex.BackpressureOverflowStrategy r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onOverflow = r2
                r0.strategy = r3
                r0.bufferSize = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.deque = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f272s
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L13
                java.util.Deque<T> r0 = r1.deque
                r1.clear(r0)
            L13:
                return
        }

        void clear(java.util.Deque<T> r2) {
                r1 = this;
                monitor-enter(r2)
                r2.clear()     // Catch: java.lang.Throwable -> L6
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6
                throw r0
        }

        void drain() {
                r14 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.Deque<T> r0 = r14.deque
                org.reactivestreams.Subscriber<? super T> r1 = r14.actual
                r2 = 1
                r3 = r2
            Ld:
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L16:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L4f
                boolean r11 = r14.cancelled
                if (r11 == 0) goto L22
                r14.clear(r0)
                return
            L22:
                boolean r11 = r14.done
                monitor-enter(r0)
                java.lang.Object r12 = r0.poll()     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
                if (r12 != 0) goto L2e
                r13 = r2
                goto L2f
            L2e:
                r13 = 0
            L2f:
                if (r11 == 0) goto L42
                java.lang.Throwable r11 = r14.error
                if (r11 == 0) goto L3c
                r14.clear(r0)
                r1.onError(r11)
                return
            L3c:
                if (r13 == 0) goto L42
                r1.onComplete()
                return
            L42:
                if (r13 == 0) goto L45
                goto L4f
            L45:
                r1.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                goto L16
            L4c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
                throw r1
            L4f:
                if (r10 != 0) goto L77
                boolean r4 = r14.cancelled
                if (r4 == 0) goto L59
                r14.clear(r0)
                return
            L59:
                boolean r4 = r14.done
                monitor-enter(r0)
                boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
                if (r4 == 0) goto L77
                java.lang.Throwable r4 = r14.error
                if (r4 == 0) goto L6e
                r14.clear(r0)
                r1.onError(r4)
                return
            L6e:
                if (r5 == 0) goto L77
                r1.onComplete()
                return
            L74:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
                throw r1
            L77:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L80
                java.util.concurrent.atomic.AtomicLong r4 = r14.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r8)
            L80:
                int r3 = -r3
                int r3 = r14.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
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
        public void onNext(T r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.Deque<T> r0 = r6.deque
                monitor-enter(r0)
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L66
                long r1 = (long) r1     // Catch: java.lang.Throwable -> L66
                long r3 = r6.bufferSize     // Catch: java.lang.Throwable -> L66
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 0
                if (r1 != 0) goto L36
                int[] r1 = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.C09561.$SwitchMap$io$reactivex$BackpressureOverflowStrategy     // Catch: java.lang.Throwable -> L66
                io.reactivex.BackpressureOverflowStrategy r3 = r6.strategy     // Catch: java.lang.Throwable -> L66
                int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L66
                r1 = r1[r3]     // Catch: java.lang.Throwable -> L66
                r3 = 1
                if (r1 == r3) goto L2c
                r4 = 2
                if (r1 == r4) goto L25
                goto L3a
            L25:
                r0.poll()     // Catch: java.lang.Throwable -> L66
                r0.offer(r7)     // Catch: java.lang.Throwable -> L66
                goto L32
            L2c:
                r0.pollLast()     // Catch: java.lang.Throwable -> L66
                r0.offer(r7)     // Catch: java.lang.Throwable -> L66
            L32:
                r5 = r3
                r3 = r2
                r2 = r5
                goto L3a
            L36:
                r0.offer(r7)     // Catch: java.lang.Throwable -> L66
                r3 = r2
            L3a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
                if (r2 == 0) goto L52
                io.reactivex.functions.Action r7 = r6.onOverflow
                if (r7 == 0) goto L65
                r7.run()     // Catch: java.lang.Throwable -> L45
                goto L65
            L45:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                org.reactivestreams.Subscription r0 = r6.f272s
                r0.cancel()
                r6.onError(r7)
                goto L65
            L52:
                if (r3 == 0) goto L62
                org.reactivestreams.Subscription r7 = r6.f272s
                r7.cancel()
                io.reactivex.exceptions.MissingBackpressureException r7 = new io.reactivex.exceptions.MissingBackpressureException
                r7.<init>()
                r6.onError(r7)
                goto L65
            L62:
                r6.drain()
            L65:
                return
            L66:
                r7 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
                throw r7
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f272s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f272s = r3
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
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }
    }

    public FlowableOnBackpressureBufferStrategy(io.reactivex.Flowable<T> r1, long r2, io.reactivex.functions.Action r4, io.reactivex.BackpressureOverflowStrategy r5) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferSize = r2
            r0.onOverflow = r4
            r0.strategy = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber
            io.reactivex.functions.Action r3 = r8.onOverflow
            io.reactivex.BackpressureOverflowStrategy r4 = r8.strategy
            long r5 = r8.bufferSize
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5)
            r0.subscribe(r7)
            return
    }
}
