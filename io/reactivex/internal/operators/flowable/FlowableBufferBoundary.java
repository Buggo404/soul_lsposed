package io.reactivex.internal.operators.flowable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class FlowableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> bufferClose;
    final org.reactivestreams.Publisher<? extends Open> bufferOpen;
    final java.util.concurrent.Callable<U> bufferSupplier;

    static final class BufferBoundarySubscriber<T, C extends java.util.Collection<? super T>, Open, Close> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8466418554264089604L;
        final org.reactivestreams.Subscriber<? super C> actual;
        final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> bufferClose;
        final org.reactivestreams.Publisher<? extends Open> bufferOpen;
        final java.util.concurrent.Callable<C> bufferSupplier;
        java.util.Map<java.lang.Long, C> buffers;
        volatile boolean cancelled;
        volatile boolean done;
        long emitted;
        final io.reactivex.internal.util.AtomicThrowable errors;
        long index;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<C> queue;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.disposables.CompositeDisposable subscribers;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> upstream;

        static final class BufferOpenSubscriber<Open> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<Open>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> parent;

            BufferOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r2 = this;
                    java.lang.Object r0 = r2.get()
                    io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                    if (r0 != r1) goto La
                    r0 = 1
                    goto Lb
                La:
                    r0 = 0
                Lb:
                    return r0
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                    r1.lazySet(r0)
                    io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> r0 = r1.parent
                    r0.openComplete(r1)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                    r1.lazySet(r0)
                    io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> r0 = r1.parent
                    r0.boundaryError(r1, r2)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Open r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> r0 = r1.parent
                    r0.open(r2)
                    return
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public void onSubscribe(org.reactivestreams.Subscription r3) {
                    r2 = this;
                    r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                    return
            }
        }

        BufferBoundarySubscriber(org.reactivestreams.Subscriber<? super C> r1, org.reactivestreams.Publisher<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r3, java.util.concurrent.Callable<C> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.bufferSupplier = r4
                r0.bufferOpen = r2
                r0.bufferClose = r3
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r2 = io.reactivex.Flowable.bufferSize()
                r1.<init>(r2)
                r0.queue = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.subscribers = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                r0.buffers = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                return
        }

        void boundaryError(io.reactivex.disposables.Disposable r2, java.lang.Throwable r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.disposables.CompositeDisposable r0 = r1.subscribers
                r0.delete(r2)
                r1.onError(r3)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                if (r0 == 0) goto L24
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.CompositeDisposable r0 = r1.subscribers
                r0.dispose()
                monitor-enter(r1)
                r0 = 0
                r1.buffers = r0     // Catch: java.lang.Throwable -> L21
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                int r0 = r1.getAndIncrement()
                if (r0 == 0) goto L24
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r0 = r1.queue
                r0.clear()
                goto L24
            L21:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
                throw r0
            L24:
                return
        }

        void close(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferCloseSubscriber<T, C> r4, long r5) {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.subscribers
                r0.delete(r4)
                io.reactivex.disposables.CompositeDisposable r4 = r3.subscribers
                int r4 = r4.size()
                r0 = 1
                if (r4 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r4 = r3.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r4)
                r4 = r0
                goto L16
            L15:
                r4 = 0
            L16:
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r1 = r3.buffers     // Catch: java.lang.Throwable -> L33
                if (r1 != 0) goto L1d
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                return
            L1d:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r2 = r3.queue     // Catch: java.lang.Throwable -> L33
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r1.remove(r5)     // Catch: java.lang.Throwable -> L33
                r2.offer(r5)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L2f
                r3.done = r0
            L2f:
                r3.drain()
                return
            L33:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
                throw r4
        }

        void drain() {
                r12 = this;
                int r0 = r12.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                long r0 = r12.emitted
                org.reactivestreams.Subscriber<? super C extends java.util.Collection<? super T>> r2 = r12.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r3 = r12.queue
                r4 = 1
                r5 = r4
            Lf:
                java.util.concurrent.atomic.AtomicLong r6 = r12.requested
                long r6 = r6.get()
            L15:
                int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r8 == 0) goto L57
                boolean r9 = r12.cancelled
                if (r9 == 0) goto L21
                r3.clear()
                return
            L21:
                boolean r9 = r12.done
                if (r9 == 0) goto L3a
                io.reactivex.internal.util.AtomicThrowable r10 = r12.errors
                java.lang.Object r10 = r10.get()
                if (r10 == 0) goto L3a
                r3.clear()
                io.reactivex.internal.util.AtomicThrowable r0 = r12.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L3a:
                java.lang.Object r10 = r3.poll()
                java.util.Collection r10 = (java.util.Collection) r10
                if (r10 != 0) goto L44
                r11 = r4
                goto L45
            L44:
                r11 = 0
            L45:
                if (r9 == 0) goto L4d
                if (r11 == 0) goto L4d
                r2.onComplete()
                return
            L4d:
                if (r11 == 0) goto L50
                goto L57
            L50:
                r2.onNext(r10)
                r8 = 1
                long r0 = r0 + r8
                goto L15
            L57:
                if (r8 != 0) goto L84
                boolean r6 = r12.cancelled
                if (r6 == 0) goto L61
                r3.clear()
                return
            L61:
                boolean r6 = r12.done
                if (r6 == 0) goto L84
                io.reactivex.internal.util.AtomicThrowable r6 = r12.errors
                java.lang.Object r6 = r6.get()
                if (r6 == 0) goto L7a
                r3.clear()
                io.reactivex.internal.util.AtomicThrowable r0 = r12.errors
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                return
            L7a:
                boolean r6 = r3.isEmpty()
                if (r6 == 0) goto L84
                r2.onComplete()
                return
            L84:
                r12.emitted = r0
                int r5 = -r5
                int r5 = r12.addAndGet(r5)
                if (r5 != 0) goto Lf
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.subscribers
                r0.dispose()
                monitor-enter(r3)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r0 = r3.buffers     // Catch: java.lang.Throwable -> L31
                if (r0 != 0) goto Lc
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                return
            Lc:
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L31
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31
            L14:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L26
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L31
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C extends java.util.Collection<? super T>> r2 = r3.queue     // Catch: java.lang.Throwable -> L31
                r2.offer(r1)     // Catch: java.lang.Throwable -> L31
                goto L14
            L26:
                r0 = 0
                r3.buffers = r0     // Catch: java.lang.Throwable -> L31
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                r0 = 1
                r3.done = r0
                r3.drain()
                return
            L31:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                throw r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L1c
                io.reactivex.disposables.CompositeDisposable r2 = r1.subscribers
                r2.dispose()
                monitor-enter(r1)
                r2 = 0
                r1.buffers = r2     // Catch: java.lang.Throwable -> L19
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L1f
            L19:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
                throw r2
            L1c:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L1f:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r0 = r2.buffers     // Catch: java.lang.Throwable -> L21
                if (r0 != 0) goto L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                return
            L7:
                java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L21
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
            Lf:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
                java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L21
                r1.add(r3)     // Catch: java.lang.Throwable -> L21
                goto Lf
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
                throw r3
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r0, r3)
                if (r0 == 0) goto L1f
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber$BufferOpenSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber$BufferOpenSubscriber
                r0.<init>(r2)
                io.reactivex.disposables.CompositeDisposable r1 = r2.subscribers
                r1.add(r0)
                org.reactivestreams.Publisher<? extends Open> r1 = r2.bufferOpen
                r1.subscribe(r0)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L1f:
                return
        }

        void open(Open r6) {
                r5 = this;
                java.util.concurrent.Callable<C extends java.util.Collection<? super T>> r0 = r5.bufferSupplier     // Catch: java.lang.Throwable -> L43
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "The bufferSupplier returned a null Collection"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L43
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L43
                io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r1 = r5.bufferClose     // Catch: java.lang.Throwable -> L43
                java.lang.Object r6 = r1.apply(r6)     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "The bufferClose returned a null Publisher"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r1)     // Catch: java.lang.Throwable -> L43
                org.reactivestreams.Publisher r6 = (org.reactivestreams.Publisher) r6     // Catch: java.lang.Throwable -> L43
                long r1 = r5.index
                r3 = 1
                long r3 = r3 + r1
                r5.index = r3
                monitor-enter(r5)
                java.util.Map<java.lang.Long, C extends java.util.Collection<? super T>> r3 = r5.buffers     // Catch: java.lang.Throwable -> L40
                if (r3 != 0) goto L2a
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                return
            L2a:
                java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L40
                r3.put(r4, r0)     // Catch: java.lang.Throwable -> L40
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferCloseSubscriber
                r0.<init>(r5, r1)
                io.reactivex.disposables.CompositeDisposable r1 = r5.subscribers
                r1.add(r0)
                r6.subscribe(r0)
                return
            L40:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
                throw r6
            L43:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r5.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                r5.onError(r6)
                return
        }

        void openComplete(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber.BufferOpenSubscriber<Open> r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.subscribers
                r0.delete(r2)
                io.reactivex.disposables.CompositeDisposable r2 = r1.subscribers
                int r2 = r2.size()
                if (r2 != 0) goto L18
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r2 = r1.upstream
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r2)
                r2 = 1
                r1.done = r2
                r1.drain()
            L18:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
                return
        }
    }

    static final class BufferCloseSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, C, ?, ?> parent;

        BufferCloseSubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, C, ?, ?> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L14
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r3.lazySet(r0)
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends java.util.Collection<? super T>, ?, ?> r0 = r3.parent
                long r1 = r3.index
                r0.close(r3, r1)
            L14:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L13
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.lazySet(r0)
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends java.util.Collection<? super T>, ?, ?> r0 = r2.parent
                r0.boundaryError(r2, r3)
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L16:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r3) {
                r2 = this;
                java.lang.Object r3 = r2.get()
                org.reactivestreams.Subscription r3 = (org.reactivestreams.Subscription) r3
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r3 == r0) goto L19
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.lazySet(r0)
                r3.cancel()
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends java.util.Collection<? super T>, ?, ?> r3 = r2.parent
                long r0 = r2.index
                r3.close(r2, r0)
            L19:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }
    }

    public FlowableBufferBoundary(io.reactivex.Flowable<T> r1, org.reactivestreams.Publisher<? extends Open> r2, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r3, java.util.concurrent.Callable<U> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.bufferOpen = r2
            r0.bufferClose = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> r5) {
            r4 = this;
            io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary$BufferBoundarySubscriber
            org.reactivestreams.Publisher<? extends Open> r1 = r4.bufferOpen
            io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> r2 = r4.bufferClose
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r3 = r4.bufferSupplier
            r0.<init>(r5, r1, r2, r3)
            r5.onSubscribe(r0)
            io.reactivex.Flowable<T> r5 = r4.source
            r5.subscribe(r0)
            return
    }
}
