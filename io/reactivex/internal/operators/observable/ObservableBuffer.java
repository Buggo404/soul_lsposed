package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableBuffer<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> bufferSupplier;
    final int count;
    final int skip;

    static final class BufferExactObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super U> actual;
        U buffer;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final int count;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f372s;
        int size;

        BufferExactObserver(io.reactivex.Observer<? super U> r1, int r2, java.util.concurrent.Callable<U> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.bufferSupplier = r3
                return
        }

        boolean createBuffer() {
                r2 = this;
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r2.bufferSupplier     // Catch: java.lang.Throwable -> L12
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L12
                java.lang.String r1 = "Empty buffer supplied"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L12
                r2.buffer = r0
                r0 = 1
                return r0
            L12:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 0
                r2.buffer = r1
                io.reactivex.disposables.Disposable r1 = r2.f372s
                if (r1 != 0) goto L23
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r1 = r2.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r1)
                goto L2b
            L23:
                r1.dispose()
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r1 = r2.actual
                r1.onError(r0)
            L2b:
                r0 = 0
                return r0
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f372s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f372s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                U extends java.util.Collection<? super T> r0 = r2.buffer
                if (r0 == 0) goto L17
                r1 = 0
                r2.buffer = r1
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L12
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r1 = r2.actual
                r1.onNext(r0)
            L12:
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onComplete()
            L17:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.buffer = r0
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                U extends java.util.Collection<? super T> r0 = r2.buffer
                if (r0 == 0) goto L1c
                r0.add(r3)
                int r3 = r2.size
                int r3 = r3 + 1
                r2.size = r3
                int r1 = r2.count
                if (r3 < r1) goto L1c
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r3 = r2.actual
                r3.onNext(r0)
                r3 = 0
                r2.size = r3
                r2.createBuffer()
            L1c:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f372s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f372s = r2
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    static final class BufferSkipObserver<T, U extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8223395059921494546L;
        final io.reactivex.Observer<? super U> actual;
        final java.util.concurrent.Callable<U> bufferSupplier;
        final java.util.ArrayDeque<U> buffers;
        final int count;
        long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f373s;
        final int skip;

        BufferSkipObserver(io.reactivex.Observer<? super U> r1, int r2, int r3, java.util.concurrent.Callable<U> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.skip = r3
                r0.bufferSupplier = r4
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.buffers = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f373s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f373s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
            L0:
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r0 = r2.buffers
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L14
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r1 = r2.buffers
                java.lang.Object r1 = r1.poll()
                r0.onNext(r1)
                goto L0
            L14:
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r0 = r1.buffers
                r0.clear()
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.index
                r2 = 1
                long r2 = r2 + r0
                r4.index = r2
                int r2 = r4.skip
                long r2 = (long) r2
                long r0 = r0 % r2
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L36
                java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r4.bufferSupplier     // Catch: java.lang.Throwable -> L25
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L25
                java.lang.String r1 = "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L25
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L25
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r1 = r4.buffers
                r1.offer(r0)
                goto L36
            L25:
                r5 = move-exception
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r0 = r4.buffers
                r0.clear()
                io.reactivex.disposables.Disposable r0 = r4.f373s
                r0.dispose()
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r4.actual
                r0.onError(r5)
                return
            L36:
                java.util.ArrayDeque<U extends java.util.Collection<? super T>> r0 = r4.buffers
                java.util.Iterator r0 = r0.iterator()
            L3c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5c
                java.lang.Object r1 = r0.next()
                java.util.Collection r1 = (java.util.Collection) r1
                r1.add(r5)
                int r2 = r4.count
                int r3 = r1.size()
                if (r2 > r3) goto L3c
                r0.remove()
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r2 = r4.actual
                r2.onNext(r1)
                goto L3c
            L5c:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f373s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f373s = r2
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableBuffer(io.reactivex.ObservableSource<T> r1, int r2, int r3, java.util.concurrent.Callable<U> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.skip = r3
            r0.bufferSupplier = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super U> r6) {
            r5 = this;
            int r0 = r5.skip
            int r1 = r5.count
            if (r0 != r1) goto L1b
            io.reactivex.internal.operators.observable.ObservableBuffer$BufferExactObserver r0 = new io.reactivex.internal.operators.observable.ObservableBuffer$BufferExactObserver
            int r1 = r5.count
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r2 = r5.bufferSupplier
            r0.<init>(r6, r1, r2)
            boolean r6 = r0.createBuffer()
            if (r6 == 0) goto L2b
            io.reactivex.ObservableSource<T> r6 = r5.source
            r6.subscribe(r0)
            goto L2b
        L1b:
            io.reactivex.ObservableSource<T> r0 = r5.source
            io.reactivex.internal.operators.observable.ObservableBuffer$BufferSkipObserver r1 = new io.reactivex.internal.operators.observable.ObservableBuffer$BufferSkipObserver
            int r2 = r5.count
            int r3 = r5.skip
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r4 = r5.bufferSupplier
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
        L2b:
            return
    }
}
