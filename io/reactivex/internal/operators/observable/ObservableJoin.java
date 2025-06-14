package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> leftEnd;
    final io.reactivex.ObservableSource<? extends TRight> other;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;

    static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport {
        static final java.lang.Integer LEFT_CLOSE = null;
        static final java.lang.Integer LEFT_VALUE = null;
        static final java.lang.Integer RIGHT_CLOSE = null;
        static final java.lang.Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        final java.util.concurrent.atomic.AtomicInteger active;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;
        final io.reactivex.disposables.CompositeDisposable disposables;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> error;
        final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> leftEnd;
        int leftIndex;
        final java.util.Map<java.lang.Integer, TLeft> lefts;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;
        int rightIndex;
        final java.util.Map<java.lang.Integer, TRight> rights;

        static {
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_VALUE = r0
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.RIGHT_VALUE = r0
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_CLOSE = r0
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.RIGHT_CLOSE = r0
                return
        }

        JoinDisposable(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r5) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                io.reactivex.disposables.CompositeDisposable r2 = new io.reactivex.disposables.CompositeDisposable
                r2.<init>()
                r1.disposables = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = io.reactivex.Observable.bufferSize()
                r2.<init>(r0)
                r1.queue = r2
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                r1.lefts = r2
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                r1.rights = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.error = r2
                r1.leftEnd = r3
                r1.rightEnd = r4
                r1.resultSelector = r5
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 2
                r2.<init>(r3)
                r1.active = r2
                return
        }

        void cancelAll() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L15
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L15
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L15:
                return
        }

        void drain() {
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r10.queue
                io.reactivex.Observer<? super R> r1 = r10.actual
                r2 = 1
                r3 = r2
            Ld:
                boolean r4 = r10.cancelled
                if (r4 == 0) goto L15
                r0.clear()
                return
            L15:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r10.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L29
                r0.clear()
                r10.cancelAll()
                r10.errorAll(r1)
                return
            L29:
                java.util.concurrent.atomic.AtomicInteger r4 = r10.active
                int r4 = r4.get()
                r5 = 0
                if (r4 != 0) goto L34
                r4 = r2
                goto L35
            L34:
                r4 = r5
            L35:
                java.lang.Object r6 = r0.poll()
                java.lang.Integer r6 = (java.lang.Integer) r6
                if (r6 != 0) goto L3f
                r7 = r2
                goto L40
            L3f:
                r7 = r5
            L40:
                if (r4 == 0) goto L57
                if (r7 == 0) goto L57
                java.util.Map<java.lang.Integer, TLeft> r0 = r10.lefts
                r0.clear()
                java.util.Map<java.lang.Integer, TRight> r0 = r10.rights
                r0.clear()
                io.reactivex.disposables.CompositeDisposable r0 = r10.disposables
                r0.dispose()
                r1.onComplete()
                return
            L57:
                if (r7 == 0) goto L61
                int r3 = -r3
                int r3 = r10.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
            L61:
                java.lang.Object r4 = r0.poll()
                java.lang.Integer r7 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_VALUE
                java.lang.String r8 = "The resultSelector returned a null value"
                if (r6 != r7) goto Ld5
                int r5 = r10.leftIndex
                int r6 = r5 + 1
                r10.leftIndex = r6
                java.util.Map<java.lang.Integer, TLeft> r6 = r10.lefts
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r6.put(r7, r4)
                io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r6 = r10.leftEnd     // Catch: java.lang.Throwable -> Ld0
                java.lang.Object r6 = r6.apply(r4)     // Catch: java.lang.Throwable -> Ld0
                java.lang.String r7 = "The leftEnd returned a null ObservableSource"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> Ld0
                io.reactivex.ObservableSource r6 = (io.reactivex.ObservableSource) r6     // Catch: java.lang.Throwable -> Ld0
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r7 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver
                r7.<init>(r10, r2, r5)
                io.reactivex.disposables.CompositeDisposable r5 = r10.disposables
                r5.add(r7)
                r6.subscribe(r7)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5 = r10.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto La9
                r0.clear()
                r10.cancelAll()
                r10.errorAll(r1)
                return
            La9:
                java.util.Map<java.lang.Integer, TRight> r5 = r10.rights
                java.util.Collection r5 = r5.values()
                java.util.Iterator r5 = r5.iterator()
            Lb3:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto Ld
                java.lang.Object r6 = r5.next()
                io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r7 = r10.resultSelector     // Catch: java.lang.Throwable -> Lcb
                java.lang.Object r6 = r7.apply(r4, r6)     // Catch: java.lang.Throwable -> Lcb
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r8)     // Catch: java.lang.Throwable -> Lcb
                r1.onNext(r6)
                goto Lb3
            Lcb:
                r2 = move-exception
                r10.fail(r2, r1, r0)
                return
            Ld0:
                r2 = move-exception
                r10.fail(r2, r1, r0)
                return
            Ld5:
                java.lang.Integer r7 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.RIGHT_VALUE
                if (r6 != r7) goto L143
                int r6 = r10.rightIndex
                int r7 = r6 + 1
                r10.rightIndex = r7
                java.util.Map<java.lang.Integer, TRight> r7 = r10.rights
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                r7.put(r9, r4)
                io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r7 = r10.rightEnd     // Catch: java.lang.Throwable -> L13e
                java.lang.Object r7 = r7.apply(r4)     // Catch: java.lang.Throwable -> L13e
                java.lang.String r9 = "The rightEnd returned a null ObservableSource"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r9)     // Catch: java.lang.Throwable -> L13e
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> L13e
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r9 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver
                r9.<init>(r10, r5, r6)
                io.reactivex.disposables.CompositeDisposable r5 = r10.disposables
                r5.add(r9)
                r7.subscribe(r9)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5 = r10.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L117
                r0.clear()
                r10.cancelAll()
                r10.errorAll(r1)
                return
            L117:
                java.util.Map<java.lang.Integer, TLeft> r5 = r10.lefts
                java.util.Collection r5 = r5.values()
                java.util.Iterator r5 = r5.iterator()
            L121:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto Ld
                java.lang.Object r6 = r5.next()
                io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r7 = r10.resultSelector     // Catch: java.lang.Throwable -> L139
                java.lang.Object r6 = r7.apply(r6, r4)     // Catch: java.lang.Throwable -> L139
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r8)     // Catch: java.lang.Throwable -> L139
                r1.onNext(r6)
                goto L121
            L139:
                r2 = move-exception
                r10.fail(r2, r1, r0)
                return
            L13e:
                r2 = move-exception
                r10.fail(r2, r1, r0)
                return
            L143:
                java.lang.Integer r5 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_CLOSE
                if (r6 != r5) goto L15b
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) r4
                java.util.Map<java.lang.Integer, TLeft> r5 = r10.lefts
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.remove(r6)
                io.reactivex.disposables.CompositeDisposable r5 = r10.disposables
                r5.remove(r4)
                goto Ld
            L15b:
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) r4
                java.util.Map<java.lang.Integer, TRight> r5 = r10.rights
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.remove(r6)
                io.reactivex.disposables.CompositeDisposable r5 = r10.disposables
                r5.remove(r4)
                goto Ld
        }

        void errorAll(io.reactivex.Observer<?> r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                java.util.Map<java.lang.Integer, TLeft> r1 = r2.lefts
                r1.clear()
                java.util.Map<java.lang.Integer, TRight> r1 = r2.rights
                r1.clear()
                r3.onError(r0)
                return
        }

        void fail(java.lang.Throwable r2, io.reactivex.Observer<?> r3, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> r4) {
                r1 = this;
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                r4.clear()
                r1.cancelAll()
                r1.errorAll(r3)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerClose(boolean r2, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver r3) {
                r1 = this;
                monitor-enter(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue     // Catch: java.lang.Throwable -> L12
                if (r2 == 0) goto L8
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_CLOSE     // Catch: java.lang.Throwable -> L12
                goto La
            L8:
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.RIGHT_CLOSE     // Catch: java.lang.Throwable -> L12
            La:
                r0.offer(r2, r3)     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                r1.drain()
                return
            L12:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r2
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerCloseError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto Lc
                r1.drain()
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerComplete(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.disposables
                r0.delete(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r1.active
                r2.decrementAndGet()
                r1.drain()
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.error
                boolean r0 = io.reactivex.internal.util.ExceptionHelper.addThrowable(r0, r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicInteger r2 = r1.active
                r2.decrementAndGet()
                r1.drain()
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public void innerValue(boolean r2, java.lang.Object r3) {
                r1 = this;
                monitor-enter(r1)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue     // Catch: java.lang.Throwable -> L12
                if (r2 == 0) goto L8
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.LEFT_VALUE     // Catch: java.lang.Throwable -> L12
                goto La
            L8:
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable.RIGHT_VALUE     // Catch: java.lang.Throwable -> L12
            La:
                r0.offer(r2, r3)     // Catch: java.lang.Throwable -> L12
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                r1.drain()
                return
            L12:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r2
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }
    }

    public ObservableJoin(io.reactivex.ObservableSource<TLeft> r1, io.reactivex.ObservableSource<? extends TRight> r2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r5) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.leftEnd = r3
            r0.rightEnd = r4
            r0.resultSelector = r5
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r5) {
            r4 = this;
            io.reactivex.internal.operators.observable.ObservableJoin$JoinDisposable r0 = new io.reactivex.internal.operators.observable.ObservableJoin$JoinDisposable
            io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r1 = r4.leftEnd
            io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r2 = r4.rightEnd
            io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> r3 = r4.resultSelector
            r0.<init>(r5, r1, r2, r3)
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver r5 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver
            r1 = 1
            r5.<init>(r0, r1)
            io.reactivex.disposables.CompositeDisposable r1 = r0.disposables
            r1.add(r5)
            io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver r1 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver
            r2 = 0
            r1.<init>(r0, r2)
            io.reactivex.disposables.CompositeDisposable r0 = r0.disposables
            r0.add(r1)
            io.reactivex.ObservableSource<T> r0 = r4.source
            r0.subscribe(r5)
            io.reactivex.ObservableSource<? extends TRight> r5 = r4.other
            r5.subscribe(r1)
            return
    }
}
