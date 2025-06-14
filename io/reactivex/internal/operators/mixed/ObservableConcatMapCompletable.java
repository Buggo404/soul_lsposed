package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class ObservableConcatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.internal.util.ErrorMode errorMode;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final int prefetch;
    final io.reactivex.Observable<T> source;

    static final class ConcatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.ErrorMode errorMode;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;
        io.reactivex.disposables.Disposable upstream;

        static final class ConcatMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> r1) {
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
                    io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> r0 = r1.parent
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
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r1 = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver
                r1.<init>(r0)
                r0.inner = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                io.reactivex.disposables.Disposable r0 = r1.upstream
                r0.dispose()
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r0 = r1.inner
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
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
                io.reactivex.internal.util.AtomicThrowable r0 = r6.errors
                io.reactivex.internal.util.ErrorMode r1 = r6.errorMode
            Lb:
                boolean r2 = r6.disposed
                if (r2 == 0) goto L15
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r6.queue
                r0.clear()
                return
            L15:
                boolean r2 = r6.active
                if (r2 != 0) goto L90
                io.reactivex.internal.util.ErrorMode r2 = io.reactivex.internal.util.ErrorMode.BOUNDARY
                r3 = 1
                if (r1 != r2) goto L35
                java.lang.Object r2 = r0.get()
                if (r2 == 0) goto L35
                r6.disposed = r3
                io.reactivex.internal.fuseable.SimpleQueue<T> r1 = r6.queue
                r1.clear()
                java.lang.Throwable r0 = r0.terminate()
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                return
            L35:
                boolean r2 = r6.done
                io.reactivex.internal.fuseable.SimpleQueue<T> r4 = r6.queue     // Catch: java.lang.Throwable -> L73
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L73
                if (r4 == 0) goto L4f
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r5 = r6.mapper     // Catch: java.lang.Throwable -> L73
                java.lang.Object r4 = r5.apply(r4)     // Catch: java.lang.Throwable -> L73
                java.lang.String r5 = "The mapper returned a null CompletableSource"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L73
                io.reactivex.CompletableSource r4 = (io.reactivex.CompletableSource) r4     // Catch: java.lang.Throwable -> L73
                r5 = 0
                goto L51
            L4f:
                r4 = 0
                r5 = r3
            L51:
                if (r2 == 0) goto L69
                if (r5 == 0) goto L69
                r6.disposed = r3
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L63
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                goto L68
            L63:
                io.reactivex.CompletableObserver r0 = r6.downstream
                r0.onComplete()
            L68:
                return
            L69:
                if (r5 != 0) goto L90
                r6.active = r3
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r2 = r6.inner
                r4.subscribe(r2)
                goto L90
            L73:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r6.disposed = r3
                io.reactivex.internal.fuseable.SimpleQueue<T> r2 = r6.queue
                r2.clear()
                io.reactivex.disposables.Disposable r2 = r6.upstream
                r2.dispose()
                r0.addThrowable(r1)
                java.lang.Throwable r0 = r0.terminate()
                io.reactivex.CompletableObserver r1 = r6.downstream
                r1.onError(r0)
                return
            L90:
                int r2 = r6.decrementAndGet()
                if (r2 != 0) goto Lb
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
                if (r0 == 0) goto L38
                io.reactivex.internal.util.ErrorMode r2 = r1.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                if (r2 != r0) goto L31
                r2 = 1
                r1.disposed = r2
                io.reactivex.disposables.Disposable r2 = r1.upstream
                r2.dispose()
                io.reactivex.internal.util.AtomicThrowable r2 = r1.errors
                java.lang.Throwable r2 = r2.terminate()
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r2 == r0) goto L25
                io.reactivex.CompletableObserver r0 = r1.downstream
                r0.onError(r2)
            L25:
                int r2 = r1.getAndIncrement()
                if (r2 != 0) goto L3b
                io.reactivex.internal.fuseable.SimpleQueue<T> r2 = r1.queue
                r2.clear()
                goto L3b
            L31:
                r2 = 0
                r1.active = r2
                r1.drain()
                goto L3b
            L38:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L3b:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto L37
                io.reactivex.internal.util.ErrorMode r3 = r2.errorMode
                io.reactivex.internal.util.ErrorMode r0 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
                r1 = 1
                if (r3 != r0) goto L31
                r2.disposed = r1
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver r3 = r2.inner
                r3.dispose()
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
                if (r3 == r0) goto L25
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onError(r3)
            L25:
                int r3 = r2.getAndIncrement()
                if (r3 != 0) goto L3a
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r2.queue
                r3.clear()
                goto L3a
            L31:
                r2.done = r1
                r2.drain()
                goto L3a
            L37:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L3a:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                if (r2 == 0) goto L7
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.offer(r2)
            L7:
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L3e
                r2.upstream = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L30
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 3
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L25
                r2.queue = r3
                r2.done = r1
                io.reactivex.CompletableObserver r3 = r2.downstream
                r3.onSubscribe(r2)
                r2.drain()
                return
            L25:
                r1 = 2
                if (r0 != r1) goto L30
                r2.queue = r3
                io.reactivex.CompletableObserver r3 = r2.downstream
                r3.onSubscribe(r2)
                return
            L30:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.prefetch
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.CompletableObserver r3 = r2.downstream
                r3.onSubscribe(r2)
            L3e:
                return
        }
    }

    public ObservableConcatMapCompletable(io.reactivex.Observable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, io.reactivex.internal.util.ErrorMode r3, int r4) {
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
            io.reactivex.Observable<T> r0 = r5.source
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r1 = r5.mapper
            boolean r0 = io.reactivex.internal.operators.mixed.ScalarXMapZHelper.tryAsCompletable(r0, r1, r6)
            if (r0 != 0) goto L1a
            io.reactivex.Observable<T> r0 = r5.source
            io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver r1 = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r5.mapper
            io.reactivex.internal.util.ErrorMode r3 = r5.errorMode
            int r4 = r5.prefetch
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
        L1a:
            return
    }
}
