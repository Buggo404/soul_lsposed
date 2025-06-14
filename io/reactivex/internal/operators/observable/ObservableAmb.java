package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableAmb<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;

    static final class AmbCoordinator<T> implements io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] observers;
        final java.util.concurrent.atomic.AtomicInteger winner;

        AmbCoordinator(io.reactivex.Observer<? super T> r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.winner = r0
                r1.actual = r2
                io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver[] r2 = new io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver[r3]
                r1.observers = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r4 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                int r0 = r0.get()
                r1 = -1
                if (r0 == r1) goto L1c
                java.util.concurrent.atomic.AtomicInteger r0 = r4.winner
                r0.lazySet(r1)
                io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver<T>[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L12:
                if (r2 >= r1) goto L1c
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L12
            L1c:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.winner
                int r0 = r0.get()
                r1 = -1
                if (r0 != r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] r8) {
                r7 = this;
                io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver<T>[] r0 = r7.observers
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L14
                io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver r4 = new io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver
                int r5 = r3 + 1
                io.reactivex.Observer<? super T> r6 = r7.actual
                r4.<init>(r7, r5, r6)
                r0[r3] = r4
                r3 = r5
                goto L5
            L14:
                java.util.concurrent.atomic.AtomicInteger r3 = r7.winner
                r3.lazySet(r2)
                io.reactivex.Observer<? super T> r3 = r7.actual
                r3.onSubscribe(r7)
            L1e:
                if (r2 >= r1) goto L33
                java.util.concurrent.atomic.AtomicInteger r3 = r7.winner
                int r3 = r3.get()
                if (r3 == 0) goto L29
                return
            L29:
                r3 = r8[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L1e
            L33:
                return
        }

        public boolean win(int r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r5.winner
                int r0 = r0.get()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L24
                java.util.concurrent.atomic.AtomicInteger r0 = r5.winner
                boolean r0 = r0.compareAndSet(r2, r6)
                if (r0 == 0) goto L23
                io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver<T>[] r0 = r5.observers
                int r3 = r0.length
            L15:
                if (r2 >= r3) goto L22
                int r4 = r2 + 1
                if (r4 == r6) goto L20
                r2 = r0[r2]
                r2.dispose()
            L20:
                r2 = r4
                goto L15
            L22:
                return r1
            L23:
                return r2
            L24:
                if (r0 != r6) goto L27
                goto L28
            L27:
                r1 = r2
            L28:
                return r1
        }
    }

    static final class AmbInnerObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final io.reactivex.Observer<? super T> actual;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> parent;
        boolean won;

        AmbInnerObserver(io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> r1, int r2, io.reactivex.Observer<? super T> r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                r0.actual = r3
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
                goto L1c
            La:
                io.reactivex.internal.operators.observable.ObservableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1c
                r0 = 1
                r2.won = r0
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L1c:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L20
            La:
                io.reactivex.internal.operators.observable.ObservableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                r2.won = r0
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L20
            L1d:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L20:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.won
                if (r0 == 0) goto La
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onNext(r3)
                goto L26
            La:
                io.reactivex.internal.operators.observable.ObservableAmb$AmbCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                boolean r0 = r0.win(r1)
                if (r0 == 0) goto L1d
                r0 = 1
                r2.won = r0
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onNext(r3)
                goto L26
            L1d:
                java.lang.Object r3 = r2.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                r3.dispose()
            L26:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableAmb(io.reactivex.ObservableSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r7) {
            r6 = this;
            io.reactivex.ObservableSource<? extends T>[] r0 = r6.sources
            r1 = 0
            if (r0 != 0) goto L43
            r0 = 8
            io.reactivex.Observable[] r0 = new io.reactivex.Observable[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2 = r6.sourcesIterable     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3b
            r3 = r1
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3b
            io.reactivex.ObservableSource r4 = (io.reactivex.ObservableSource) r4     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L29
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "One of the sources is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)     // Catch: java.lang.Throwable -> L3b
            return
        L29:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r3 != r5) goto L35
            int r5 = r3 >> 2
            int r5 = r5 + r3
            io.reactivex.ObservableSource[] r5 = new io.reactivex.ObservableSource[r5]     // Catch: java.lang.Throwable -> L3b
            java.lang.System.arraycopy(r0, r1, r5, r1, r3)     // Catch: java.lang.Throwable -> L3b
            r0 = r5
        L35:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L3b
            r3 = r5
            goto L10
        L3b:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
        L43:
            int r3 = r0.length
        L44:
            if (r3 != 0) goto L4a
            io.reactivex.internal.disposables.EmptyDisposable.complete(r7)
            return
        L4a:
            r2 = 1
            if (r3 != r2) goto L53
            r0 = r0[r1]
            r0.subscribe(r7)
            return
        L53:
            io.reactivex.internal.operators.observable.ObservableAmb$AmbCoordinator r1 = new io.reactivex.internal.operators.observable.ObservableAmb$AmbCoordinator
            r1.<init>(r7, r3)
            r1.subscribe(r0)
            return
    }
}
