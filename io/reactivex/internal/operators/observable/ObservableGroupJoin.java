package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> leftEnd;
    final io.reactivex.ObservableSource<? extends TRight> other;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> resultSelector;
    final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;

    static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport {
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
        final java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> lefts;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> resultSelector;
        final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> rightEnd;
        int rightIndex;
        final java.util.Map<java.lang.Integer, TRight> rights;

        static {
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_VALUE = r0
                r0 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_VALUE = r0
                r0 = 3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_CLOSE = r0
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_CLOSE = r0
                return
        }

        GroupJoinDisposable(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> r5) {
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
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.cancelled = r0
                r1.cancelAll()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L16
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L16:
                return
        }

        void drain() {
                r9 = this;
                int r0 = r9.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r9.queue
                io.reactivex.Observer<? super R> r1 = r9.actual
                r2 = 1
                r3 = r2
            Ld:
                boolean r4 = r9.cancelled
                if (r4 == 0) goto L15
                r0.clear()
                return
            L15:
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r4 = r9.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L29
                r0.clear()
                r9.cancelAll()
                r9.errorAll(r1)
                return
            L29:
                java.util.concurrent.atomic.AtomicInteger r4 = r9.active
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
                if (r4 == 0) goto L71
                if (r7 == 0) goto L71
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r0 = r9.lefts
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            L4e:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L5e
                java.lang.Object r2 = r0.next()
                io.reactivex.subjects.UnicastSubject r2 = (io.reactivex.subjects.UnicastSubject) r2
                r2.onComplete()
                goto L4e
            L5e:
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r0 = r9.lefts
                r0.clear()
                java.util.Map<java.lang.Integer, TRight> r0 = r9.rights
                r0.clear()
                io.reactivex.disposables.CompositeDisposable r0 = r9.disposables
                r0.dispose()
                r1.onComplete()
                return
            L71:
                if (r7 == 0) goto L7b
                int r3 = -r3
                int r3 = r9.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
            L7b:
                java.lang.Object r4 = r0.poll()
                java.lang.Integer r7 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_VALUE
                if (r6 != r7) goto Lf6
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create()
                int r6 = r9.leftIndex
                int r7 = r6 + 1
                r9.leftIndex = r7
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r7 = r9.lefts
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.put(r8, r5)
                io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r7 = r9.leftEnd     // Catch: java.lang.Throwable -> Lf1
                java.lang.Object r7 = r7.apply(r4)     // Catch: java.lang.Throwable -> Lf1
                java.lang.String r8 = "The leftEnd returned a null ObservableSource"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> Lf1
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> Lf1
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r8 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver
                r8.<init>(r9, r2, r6)
                io.reactivex.disposables.CompositeDisposable r6 = r9.disposables
                r6.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r6 = r9.error
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto Lc5
                r0.clear()
                r9.cancelAll()
                r9.errorAll(r1)
                return
            Lc5:
                io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> r6 = r9.resultSelector     // Catch: java.lang.Throwable -> Lec
                java.lang.Object r4 = r6.apply(r4, r5)     // Catch: java.lang.Throwable -> Lec
                java.lang.String r6 = "The resultSelector returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r6)     // Catch: java.lang.Throwable -> Lec
                r1.onNext(r4)
                java.util.Map<java.lang.Integer, TRight> r4 = r9.rights
                java.util.Collection r4 = r4.values()
                java.util.Iterator r4 = r4.iterator()
            Lde:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto Ld
                java.lang.Object r6 = r4.next()
                r5.onNext(r6)
                goto Lde
            Lec:
                r2 = move-exception
                r9.fail(r2, r1, r0)
                return
            Lf1:
                r2 = move-exception
                r9.fail(r2, r1, r0)
                return
            Lf6:
                java.lang.Integer r7 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_VALUE
                if (r6 != r7) goto L157
                int r6 = r9.rightIndex
                int r7 = r6 + 1
                r9.rightIndex = r7
                java.util.Map<java.lang.Integer, TRight> r7 = r9.rights
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.put(r8, r4)
                io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r7 = r9.rightEnd     // Catch: java.lang.Throwable -> L152
                java.lang.Object r7 = r7.apply(r4)     // Catch: java.lang.Throwable -> L152
                java.lang.String r8 = "The rightEnd returned a null ObservableSource"
                java.lang.Object r7 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r8)     // Catch: java.lang.Throwable -> L152
                io.reactivex.ObservableSource r7 = (io.reactivex.ObservableSource) r7     // Catch: java.lang.Throwable -> L152
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r8 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver
                r8.<init>(r9, r5, r6)
                io.reactivex.disposables.CompositeDisposable r5 = r9.disposables
                r5.add(r8)
                r7.subscribe(r8)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5 = r9.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L138
                r0.clear()
                r9.cancelAll()
                r9.errorAll(r1)
                return
            L138:
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r5 = r9.lefts
                java.util.Collection r5 = r5.values()
                java.util.Iterator r5 = r5.iterator()
            L142:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto Ld
                java.lang.Object r6 = r5.next()
                io.reactivex.subjects.UnicastSubject r6 = (io.reactivex.subjects.UnicastSubject) r6
                r6.onNext(r4)
                goto L142
            L152:
                r2 = move-exception
                r9.fail(r2, r1, r0)
                return
            L157:
                java.lang.Integer r5 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_CLOSE
                if (r6 != r5) goto L177
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) r4
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r5 = r9.lefts
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r5 = r5.remove(r6)
                io.reactivex.subjects.UnicastSubject r5 = (io.reactivex.subjects.UnicastSubject) r5
                io.reactivex.disposables.CompositeDisposable r6 = r9.disposables
                r6.remove(r4)
                if (r5 == 0) goto Ld
                r5.onComplete()
                goto Ld
            L177:
                java.lang.Integer r5 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_CLOSE
                if (r6 != r5) goto Ld
                io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver r4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) r4
                java.util.Map<java.lang.Integer, TRight> r5 = r9.rights
                int r6 = r4.index
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.remove(r6)
                io.reactivex.disposables.CompositeDisposable r5 = r9.disposables
                r5.remove(r4)
                goto Ld
        }

        void errorAll(io.reactivex.Observer<?> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r3.error
                java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.terminate(r0)
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r1 = r3.lefts
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L20
                java.lang.Object r2 = r1.next()
                io.reactivex.subjects.UnicastSubject r2 = (io.reactivex.subjects.UnicastSubject) r2
                r2.onError(r0)
                goto L10
            L20:
                java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> r1 = r3.lefts
                r1.clear()
                java.util.Map<java.lang.Integer, TRight> r1 = r3.rights
                r1.clear()
                r4.onError(r0)
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
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_CLOSE     // Catch: java.lang.Throwable -> L12
                goto La
            L8:
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_CLOSE     // Catch: java.lang.Throwable -> L12
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
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.LEFT_VALUE     // Catch: java.lang.Throwable -> L12
                goto La
            L8:
                java.lang.Integer r2 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.RIGHT_VALUE     // Catch: java.lang.Throwable -> L12
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

    interface JoinSupport {
        void innerClose(boolean r1, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver r2);

        void innerCloseError(java.lang.Throwable r1);

        void innerComplete(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver r1);

        void innerError(java.lang.Throwable r1);

        void innerValue(boolean r1, java.lang.Object r2);
    }

    static final class LeftRightEndObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport parent;

        LeftRightEndObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.isLeft = r2
                r0.index = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r0 = r2.parent
                boolean r1 = r2.isLeft
                r0.innerClose(r1, r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerCloseError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r2) {
                r1 = this;
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r2 == 0) goto Ld
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r2 = r1.parent
                boolean r0 = r1.isLeft
                r2.innerClose(r0, r1)
            Ld:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    static final class LeftRightObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport parent;

        LeftRightObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.isLeft = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerComplete(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r0 = r1.parent
                r0.innerError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableGroupJoin$JoinSupport r0 = r2.parent
                boolean r1 = r2.isLeft
                r0.innerValue(r1, r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableGroupJoin(io.reactivex.ObservableSource<TLeft> r1, io.reactivex.ObservableSource<? extends TRight> r2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r3, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r4, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> r5) {
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
            io.reactivex.internal.operators.observable.ObservableGroupJoin$GroupJoinDisposable r0 = new io.reactivex.internal.operators.observable.ObservableGroupJoin$GroupJoinDisposable
            io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> r1 = r4.leftEnd
            io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r2 = r4.rightEnd
            io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> r3 = r4.resultSelector
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
