package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.ObservableSource<B> boundary;
    final java.util.concurrent.Callable<U> bufferSupplier;

    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> parent;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> r0 = r1.parent
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(B r1) {
                r0 = this;
                io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> r1 = r0.parent
                r1.next()
                return
        }
    }

    static final class BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.ObservableSource<B> boundary;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        io.reactivex.disposables.Disposable other;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f375s;

        BufferExactBoundaryObserver(io.reactivex.Observer<? super U> r2, java.util.concurrent.Callable<U> r3, io.reactivex.ObservableSource<B> r4) {
                r1 = this;
                io.reactivex.internal.queue.MpscLinkedQueue r0 = new io.reactivex.internal.queue.MpscLinkedQueue
                r0.<init>()
                r1.<init>(r2, r0)
                r1.bufferSupplier = r3
                r1.boundary = r4
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
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.other
                r0.dispose()
                io.reactivex.disposables.Disposable r0 = r1.f375s
                r0.dispose()
                boolean r0 = r1.enter()
                if (r0 == 0) goto L1c
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r1.queue
                r0.clear()
            L1c:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        void next() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L20
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L20
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L20
                monitor-enter(r2)
                U extends java.util.Collection<? super T> r1 = r2.buffer     // Catch: java.lang.Throwable -> L1d
                if (r1 != 0) goto L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L15:
                r2.buffer = r0     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                r0 = 0
                r2.fastPathEmit(r1, r0, r2)
                return
            L1d:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                throw r0
            L20:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.dispose()
                io.reactivex.Observer<? super V> r1 = r2.actual
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
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f375s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L3f
                r2.f375s = r3
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L30
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L30
                java.lang.String r1 = "The buffer supplied is null"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L30
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L30
                r2.buffer = r0
                io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferBoundaryObserver r3 = new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferBoundaryObserver
                r3.<init>(r2)
                r2.other = r3
                io.reactivex.Observer<? super V> r0 = r2.actual
                r0.onSubscribe(r2)
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L3f
                io.reactivex.ObservableSource<B> r0 = r2.boundary
                r0.subscribe(r3)
                goto L3f
            L30:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r2.cancelled = r1
                r3.dispose()
                io.reactivex.Observer<? super V> r3 = r2.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            L3f:
                return
        }
    }

    public ObservableBufferExactBoundary(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<B> r2, java.util.concurrent.Callable<U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.boundary = r2
            r0.bufferSupplier = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferExactBoundaryObserver r1 = new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary$BufferExactBoundaryObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r5)
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r5 = r4.bufferSupplier
            io.reactivex.ObservableSource<B> r3 = r4.boundary
            r1.<init>(r2, r5, r3)
            r0.subscribe(r1)
            return
    }
}
