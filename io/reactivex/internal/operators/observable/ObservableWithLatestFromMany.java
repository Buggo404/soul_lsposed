package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;
    final io.reactivex.ObservableSource<?>[] otherArray;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> otherIterable;

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.observable.ObservableWithLatestFromMany this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.observable.ObservableWithLatestFromMany r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany r0 = r3.this$0
                io.reactivex.functions.Function<? super java.lang.Object[], R> r0 = r0.combiner
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
                return r4
        }
    }

    static final class WithLatestFromObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1577321883966341961L;
        final io.reactivex.Observer<? super R> actual;
        final io.reactivex.functions.Function<? super java.lang.Object[], R> combiner;

        /* renamed from: d */
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f478d;
        volatile boolean done;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] observers;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> values;

        WithLatestFromObserver(io.reactivex.Observer<? super R> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3, int r4) {
                r1 = this;
                r1.<init>()
                r1.actual = r2
                r1.combiner = r3
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver[] r2 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[r4]
                r3 = 0
            La:
                if (r3 >= r4) goto L16
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver
                r0.<init>(r1, r3)
                r2[r3] = r0
                int r3 = r3 + 1
                goto La
            L16:
                r1.observers = r2
                java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
                r2.<init>(r4)
                r1.values = r2
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.f478d = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                return
        }

        void cancelAllBut(int r4) {
                r3 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver[] r0 = r3.observers
                r1 = 0
            L3:
                int r2 = r0.length
                if (r1 >= r2) goto L10
                if (r1 == r4) goto Ld
                r2 = r0[r1]
                r2.dispose()
            Ld:
                int r1 = r1 + 1
                goto L3
            L10:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r4 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r4.f478d
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver[] r0 = r4.observers
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.dispose()
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }

        void innerComplete(int r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto Lf
                r2 = 1
                r0.done = r2
                r0.cancelAllBut(r1)
                io.reactivex.Observer<? super R> r1 = r0.actual
                io.reactivex.internal.util.AtomicThrowable r2 = r0.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r1, r0, r2)
            Lf:
                return
        }

        void innerError(int r2, java.lang.Throwable r3) {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f478d
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                r1.cancelAllBut(r2)
                io.reactivex.Observer<? super R> r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                io.reactivex.internal.util.HalfSerializer.onError(r2, r3, r1, r0)
                return
        }

        void innerNext(int r2, java.lang.Object r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.values
                r0.set(r2, r3)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f478d
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L12
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                io.reactivex.Observer<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            L12:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            L8:
                r0 = 1
                r2.done = r0
                r0 = -1
                r2.cancelAllBut(r0)
                io.reactivex.Observer<? super R> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r4.values
                int r1 = r0.length()
                int r2 = r1 + 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
            L12:
                if (r3 >= r1) goto L20
                java.lang.Object r5 = r0.get(r3)
                if (r5 != 0) goto L1b
                return
            L1b:
                int r3 = r3 + 1
                r2[r3] = r5
                goto L12
            L20:
                io.reactivex.functions.Function<? super java.lang.Object[], R> r5 = r4.combiner     // Catch: java.lang.Throwable -> L34
                java.lang.Object r5 = r5.apply(r2)     // Catch: java.lang.Throwable -> L34
                java.lang.String r0 = "combiner returned a null value"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)     // Catch: java.lang.Throwable -> L34
                io.reactivex.Observer<? super R> r0 = r4.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r4.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r5, r4, r1)
                return
            L34:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                r4.dispose()
                r4.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f478d
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void subscribe(io.reactivex.ObservableSource<?>[] r6, int r7) {
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver[] r0 = r5.observers
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r5.f478d
                r2 = 0
            L5:
                if (r2 >= r7) goto L22
                java.lang.Object r3 = r1.get()
                io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r3)
                if (r3 != 0) goto L22
                boolean r3 = r5.done
                if (r3 == 0) goto L18
                goto L22
            L18:
                r3 = r6[r2]
                r4 = r0[r2]
                r3.subscribe(r4)
                int r2 = r2 + 1
                goto L5
            L22:
                return
        }
    }

    static final class WithLatestInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> parent;

        WithLatestInnerObserver(io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> r0 = r3.parent
                int r1 = r3.index
                boolean r2 = r3.hasValue
                r0.innerComplete(r1, r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerError(r1, r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r2.hasValue
                if (r0 != 0) goto L7
                r0 = 1
                r2.hasValue = r0
            L7:
                io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> r0 = r2.parent
                int r1 = r2.index
                r0.innerNext(r1, r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public ObservableWithLatestFromMany(io.reactivex.ObservableSource<T> r1, java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.otherArray = r1
            r0.otherIterable = r2
            r0.combiner = r3
            return
    }

    public ObservableWithLatestFromMany(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<?>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.otherArray = r2
            r1 = 0
            r0.otherIterable = r1
            r0.combiner = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r6) {
            r5 = this;
            io.reactivex.ObservableSource<?>[] r0 = r5.otherArray
            if (r0 != 0) goto L35
            r0 = 8
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> r1 = r5.otherIterable     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
        Lf:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2d
            io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r0.length     // Catch: java.lang.Throwable -> L2d
            if (r2 != r4) goto L27
            int r4 = r2 >> 1
            int r4 = r4 + r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L2d
            io.reactivex.ObservableSource[] r0 = (io.reactivex.ObservableSource[]) r0     // Catch: java.lang.Throwable -> L2d
        L27:
            int r4 = r2 + 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L2d
            r2 = r4
            goto Lf
        L2d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r6)
            return
        L35:
            int r2 = r0.length
        L36:
            if (r2 != 0) goto L48
            io.reactivex.internal.operators.observable.ObservableMap r0 = new io.reactivex.internal.operators.observable.ObservableMap
            io.reactivex.ObservableSource<T> r1 = r5.source
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$SingletonArrayFunc r2 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$SingletonArrayFunc
            r2.<init>(r5)
            r0.<init>(r1, r2)
            r0.subscribeActual(r6)
            return
        L48:
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver r1 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver
            io.reactivex.functions.Function<? super java.lang.Object[], R> r3 = r5.combiner
            r1.<init>(r6, r3, r2)
            r6.onSubscribe(r1)
            r1.subscribe(r0, r2)
            io.reactivex.ObservableSource<T> r6 = r5.source
            r6.subscribe(r1)
            return
    }
}
