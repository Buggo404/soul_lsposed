package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableMergeWithMaybe<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> other;

    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean disposed;
        final io.reactivex.internal.util.AtomicThrowable error;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> mainDisposable;
        volatile boolean mainDone;
        final io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver.OtherObserver<T> otherObserver;
        volatile int otherState;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> queue;
        T singleItem;

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> parent;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver<T> r0 = r1.parent
                    r0.otherSuccess(r2)
                    return
            }
        }

        MergeWithObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.mainDisposable = r1
                io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver r1 = new io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver
                r1.<init>(r0)
                r0.otherObserver = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver<T> r0 = r1.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L18
                r0 = 0
                r1.queue = r0
                r1.singleItem = r0
            L18:
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
                r9 = this;
                io.reactivex.Observer<? super T> r0 = r9.actual
                r1 = 1
                r2 = r1
            L4:
                boolean r3 = r9.disposed
                r4 = 0
                if (r3 == 0) goto Le
                r9.singleItem = r4
                r9.queue = r4
                return
            Le:
                io.reactivex.internal.util.AtomicThrowable r3 = r9.error
                java.lang.Object r3 = r3.get()
                if (r3 == 0) goto L24
                r9.singleItem = r4
                r9.queue = r4
                io.reactivex.internal.util.AtomicThrowable r1 = r9.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L24:
                int r3 = r9.otherState
                r5 = 2
                if (r3 != r1) goto L33
                T r3 = r9.singleItem
                r9.singleItem = r4
                r9.otherState = r5
                r0.onNext(r3)
                r3 = r5
            L33:
                boolean r6 = r9.mainDone
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r7 = r9.queue
                if (r7 == 0) goto L3e
                java.lang.Object r7 = r7.poll()
                goto L3f
            L3e:
                r7 = r4
            L3f:
                if (r7 != 0) goto L43
                r8 = r1
                goto L44
            L43:
                r8 = 0
            L44:
                if (r6 == 0) goto L50
                if (r8 == 0) goto L50
                if (r3 != r5) goto L50
                r9.queue = r4
                r0.onComplete()
                return
            L50:
                if (r8 == 0) goto L5a
                int r2 = -r2
                int r2 = r9.addAndGet(r2)
                if (r2 != 0) goto L4
                return
            L5a:
                r0.onNext(r7)
                goto L4
        }

        io.reactivex.internal.fuseable.SimplePlainQueue<T> getOrCreateQueue() {
                r2 = this;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> r0 = r2.queue
                if (r0 != 0) goto Lf
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = io.reactivex.Observable.bufferSize()
                r0.<init>(r1)
                r2.queue = r0
            Lf:
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.mainDone = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                r1.drain()
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L14
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L22
                return
            L14:
                io.reactivex.internal.fuseable.SimplePlainQueue r0 = r2.getOrCreateQueue()
                r0.offer(r3)
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L22
                return
            L22:
                r2.drainLoop()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void otherComplete() {
                r1 = this;
                r0 = 2
                r1.otherState = r0
                r1.drain()
                return
        }

        void otherError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L11
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r2)
                r1.drain()
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        void otherSuccess(T r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L11
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onNext(r3)
                r3 = 2
                r2.otherState = r3
                goto L1c
            L11:
                r2.singleItem = r3
                r2.otherState = r1
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L1c
                return
            L1c:
                r2.drainLoop()
                return
        }
    }

    public ObservableMergeWithMaybe(io.reactivex.Observable<T> r1, io.reactivex.MaybeSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver r0 = new io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.ObservableSource<T> r2 = r1.source
            r2.subscribe(r0)
            io.reactivex.MaybeSource<? extends T> r2 = r1.other
            io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver<T> r0 = r0.otherObserver
            r2.subscribe(r0)
            return
    }
}
