package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class FlowableConcatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final int prefetch;
    final io.reactivex.Flowable<T> source;

    static final class ConcatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        int consumed;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        final int prefetch;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        org.reactivestreams.Subscription upstream;

        static final class ConcatMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable.ConcatMapCompletableObserver<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> r0 = r1.parent
                    r0.innerError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                    return
            }
        }

        ConcatMapCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, io.reactivex.internal.util.ErrorMode r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
                r0.errorMode = r3
                r0.prefetch = r4
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r1 = new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver
                r1.<init>(r0)
                r0.inner = r1
                io.reactivex.internal.queue.SpscArrayQueue r1 = new io.reactivex.internal.queue.SpscArrayQueue
                r1.<init>(r4)
                r0.queue = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r0 = r1.inner
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                r0.clear()
            L18:
                return
        }

        void drain() {
                r6 = this;
                int r0 = r6.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r6.disposed
                if (r0 == 0) goto L11
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r6.queue
                r0.clear()
                return
            L11:
                boolean r0 = r6.active
                if (r0 != 0) goto La7
                io.reactivex.internal.util.ErrorMode r0 = r6.errorMode
                io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                if (r0 != r1) goto L34
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r6.queue
                r0.clear()
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Throwable r0 = r0.terminate()
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                return
            L34:
                boolean r0 = r6.done
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r1 = r6.queue
                java.lang.Object r1 = r1.poll()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L42
                r4 = r3
                goto L43
            L42:
                r4 = r2
            L43:
                if (r0 == 0) goto L5b
                if (r4 == 0) goto L5b
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L55
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                goto L5a
            L55:
                io.reactivex.CompletableObserver r0 = r6.downstream
                r0.onComplete()
            L5a:
                return
            L5b:
                if (r4 != 0) goto La7
                int r0 = r6.prefetch
                int r4 = r0 >> 1
                int r0 = r0 - r4
                int r4 = r6.consumed
                int r4 = r4 + r3
                if (r4 != r0) goto L70
                r6.consumed = r2
                org.reactivestreams.Subscription r2 = r6.upstream
                long r4 = (long) r0
                r2.request(r4)
                goto L72
            L70:
                r6.consumed = r4
            L72:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r0 = r6.mapper     // Catch: java.lang.Throwable -> L88
                java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L88
                java.lang.String r1 = "The mapper returned a null CompletableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L88
                io.reactivex.CompletableSource r0 = (io.reactivex.CompletableSource) r0     // Catch: java.lang.Throwable -> L88
                r6.active = r3
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r1 = r6.inner
                r0.subscribe(r1)
                goto La7
            L88:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r1 = r6.queue
                r1.clear()
                org.reactivestreams.Subscription r1 = r6.upstream
                r1.cancel()
                io.reactivex.internal.util.AtomicThrowable r1 = r6.errors
                r1.addThrowable(r0)
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                java.lang.Throwable r0 = r0.terminate()
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                return
            La7:
                int r0 = r6.decrementAndGet()
                if (r0 != 0) goto L7
                return
        }

        void innerComplete() {
                r1 = this;
                r0 = 0
                r1.active = r0
                r1.drain()
                return
        }

        void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L35
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r2 != r0) goto L2e
                org.reactivestreams.Subscription r2 = r1.upstream
                r2.cancel()
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r2 == r0) goto L22
                io.reactivex.CompletableObserver r0 = r1.downstream
                r0.onError(r2)
            L22:
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L38
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r1.queue
                r2.clear()
                goto L38
            L2e:
                r2 = 0
                r1.active = r2
                r1.drain()
                goto L38
            L35:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L38:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
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
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L35
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r2 != r0) goto L2e
                io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r2 = r1.inner
                r2.dispose()
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r2 == r0) goto L22
                io.reactivex.CompletableObserver r0 = r1.downstream
                r0.onError(r2)
            L22:
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L38
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r2 = r1.queue
                r2.clear()
                goto L38
            L2e:
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L38
            L35:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L38:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 == 0) goto Lc
                r1.drain()
                goto L1b
            Lc:
                org.reactivestreams.Subscription r2 = r1.upstream
                r2.cancel()
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r0 = "Queue full?!"
                r2.<init>(r0)
                r1.onError(r2)
            L1b:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L15
                r2.upstream = r3
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onSubscribe(r2)
                int r0 = r2.prefetch
                long r0 = (long) r0
                r3.request(r0)
            L15:
                return
        }
    }

    public FlowableConcatMapCompletable(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, io.reactivex.internal.util.ErrorMode r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.errorMode = r3
            r0.prefetch = r4
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver r1 = new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable$ConcatMapCompletableObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r5.mapper
            io.reactivex.internal.util.ErrorMode r3 = r5.errorMode
            int r4 = r5.prefetch
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
