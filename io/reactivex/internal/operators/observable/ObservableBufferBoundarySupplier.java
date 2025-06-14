package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> boundarySupplier;
    final java.util.concurrent.Callable<U> bufferSupplier;

    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        boolean once;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> parent;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.once
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.once = r0
                io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.next()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.once
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.once = r0
                io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(B r1) {
                r0 = this;
                boolean r1 = r0.once
                if (r1 == 0) goto L5
                return
            L5:
                r1 = 1
                r0.once = r1
                r0.dispose()
                io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    static final class BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> boundarySupplier;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f374s;

        BufferBoundarySupplierObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.other = r2
                r1.bufferSupplier = r3
                r1.boundarySupplier = r4
                return
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public /* bridge */ /* synthetic */ void accept(io.reactivex.Observer r1, java.lang.Object r2) {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.accept(r1, r2)
                return
        }

        public void accept(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                io.reactivex.Observer<? super V> r1 = r0.actual
                r1.onNext(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1a
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f374s
                r0.dispose()
                r1.disposeOther()
                boolean r0 = r1.enter()
                if (r0 == 0) goto L1a
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                r0.clear()
            L1a:
                return
        }

        void disposeOther() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        void next() {
                r4 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r4.bufferSupplier     // Catch: java.lang.Throwable -> L51
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L51
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L51
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L51
                java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r1 = r4.boundarySupplier     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L3f
                java.lang.String r2 = "The boundary ObservableSource supplied is null"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L3f
                io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L3f
                io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundaryObserver r2 = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundaryObserver
                r2.<init>(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r4.other
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper.replace(r3, r2)
                if (r3 == 0) goto L3e
                monitor-enter(r4)
                U extends java.util.Collection<? super T> r3 = r4.buffer     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L30
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
                return
            L30:
                r4.buffer = r0     // Catch: java.lang.Throwable -> L3b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
                r1.subscribe(r2)
                r0 = 0
                r4.fastPathEmit(r3, r0, r4)
                goto L3e
            L3b:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
                throw r0
            L3e:
                return
            L3f:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r4.cancelled = r1
                io.reactivex.disposables.Disposable r1 = r4.f374s
                r1.dispose()
                io.reactivex.Observer<? super V> r1 = r4.actual
                r1.onError(r0)
                return
            L51:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4.dispose()
                io.reactivex.Observer<? super V> r1 = r4.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r3 = this;
                monitor-enter(r3)
                U extends java.util.Collection<? super T> r0 = r3.buffer     // Catch: java.lang.Throwable -> L22
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
                return
            L7:
                r1 = 0
                r3.buffer = r1     // Catch: java.lang.Throwable -> L22
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r1 = r3.queue
                r1.offer(r0)
                r0 = 1
                r3.done = r0
                boolean r0 = r3.enter()
                if (r0 == 0) goto L21
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r3.queue
                io.reactivex.Observer<? super V> r1 = r3.actual
                r2 = 0
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(r0, r1, r2, r3, r3)
            L21:
                return
            L22:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
                throw r0
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.dispose()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                monitor-enter(r1)
                U extends java.util.Collection<? super T> r0 = r1.buffer     // Catch: java.lang.Throwable -> Lc
                if (r0 != 0) goto L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                return
            L7:
                r0.add(r2)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r2
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r5) {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.f374s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r5)
                if (r0 == 0) goto L59
                r4.f374s = r5
                io.reactivex.Observer<? super V> r0 = r4.actual
                r1 = 1
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r2 = r4.bufferSupplier     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L4d
                java.lang.String r3 = "The buffer supplied is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L4d
                java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L4d
                r4.buffer = r2
                java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2 = r4.boundarySupplier     // Catch: java.lang.Throwable -> L40
                java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> L40
                java.lang.String r3 = "The boundary ObservableSource supplied is null"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L40
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2     // Catch: java.lang.Throwable -> L40
                io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundaryObserver r5 = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundaryObserver
                r5.<init>(r4)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r4.other
                r1.set(r5)
                r0.onSubscribe(r4)
                boolean r0 = r4.cancelled
                if (r0 != 0) goto L59
                r2.subscribe(r5)
                goto L59
            L40:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r4.cancelled = r1
                r5.dispose()
                io.reactivex.internal.disposables.EmptyDisposable.error(r2, r0)
                return
            L4d:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r4.cancelled = r1
                r5.dispose()
                io.reactivex.internal.disposables.EmptyDisposable.error(r2, r0)
            L59:
                return
        }
    }

    public ObservableBufferBoundarySupplier(io.reactivex.ObservableSource<T> r1, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2, java.util.concurrent.Callable<U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.boundarySupplier = r2
            r0.bufferSupplier = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundarySupplierObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier$BufferBoundarySupplierObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r5)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r5 = r4.bufferSupplier
            java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r3 = r4.boundarySupplier
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}
