package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFromIterable<T> extends io.reactivex.Observable<T> {
    final java.lang.Iterable<? extends T> source;

    static final class FromIterableDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        final io.reactivex.Observer<? super T> actual;
        boolean checkNext;
        volatile boolean disposed;
        boolean done;
        boolean fusionMode;

        /* renamed from: it */
        final java.util.Iterator<? extends T> f411it;

        FromIterableDisposable(io.reactivex.Observer<? super T> r1, java.util.Iterator<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f411it = r2
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 1
                r1.done = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
                r3 = this;
                boolean r0 = r3.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                boolean r0 = r3.checkNext
                r2 = 1
                if (r0 == 0) goto L16
                java.util.Iterator<? extends T> r0 = r3.f411it
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L18
                r3.done = r2
                return r1
            L16:
                r3.checkNext = r2
            L18:
                java.util.Iterator<? extends T> r0 = r3.f411it
                java.lang.Object r0 = r0.next()
                java.lang.String r1 = "The iterator returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r1.fusionMode = r0
                return r0
            L7:
                r2 = 0
                return r2
        }

        void run() {
                r2 = this;
            L0:
                boolean r0 = r2.isDisposed()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.Iterator<? extends T> r0 = r2.f411it     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r1 = "The iterator returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L3d
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
                boolean r0 = r2.isDisposed()
                if (r0 == 0) goto L1f
                return
            L1f:
                java.util.Iterator<? extends T> r0 = r2.f411it     // Catch: java.lang.Throwable -> L33
                boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
                if (r0 != 0) goto L0
                boolean r0 = r2.isDisposed()
                if (r0 != 0) goto L32
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L32:
                return
            L33:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onError(r0)
                return
            L3d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onError(r0)
                return
        }
    }

    public ObservableFromIterable(java.lang.Iterable<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            java.lang.Iterable<? extends T> r0 = r2.source     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L10
            io.reactivex.internal.disposables.EmptyDisposable.complete(r3)
            return
        L10:
            io.reactivex.internal.operators.observable.ObservableFromIterable$FromIterableDisposable r1 = new io.reactivex.internal.operators.observable.ObservableFromIterable$FromIterableDisposable
            r1.<init>(r3, r0)
            r3.onSubscribe(r1)
            boolean r3 = r1.fusionMode
            if (r3 != 0) goto L1f
            r1.run()
        L1f:
            return
        L20:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
        L28:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
