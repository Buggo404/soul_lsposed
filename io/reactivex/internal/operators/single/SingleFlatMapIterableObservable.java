package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFlatMapIterableObservable<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final io.reactivex.SingleSource<T> source;

    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.observers.BasicIntQueueDisposable<R> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final io.reactivex.Observer<? super R> actual;
        volatile boolean cancelled;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f511d;

        /* renamed from: it */
        volatile java.util.Iterator<? extends R> f512it;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        boolean outputFused;

        FlatMapIterableObserver(io.reactivex.Observer<? super R> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 0
                r1.f512it = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f511d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f511d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                java.util.Iterator<? extends R> r0 = r1.f512it
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f511d = r0
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f511d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f511d = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.Observer<? super R> r0 = r2.actual
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r1 = r2.mapper     // Catch: java.lang.Throwable -> L51
                java.lang.Object r3 = r1.apply(r3)     // Catch: java.lang.Throwable -> L51
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L51
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L51
                boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L51
                if (r1 != 0) goto L18
                r0.onComplete()
                return
            L18:
                boolean r1 = r2.outputFused
                if (r1 == 0) goto L26
                r2.f512it = r3
                r3 = 0
                r0.onNext(r3)
                r0.onComplete()
                return
            L26:
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L2b
                return
            L2b:
                java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L49
                r0.onNext(r1)
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L37
                return
            L37:
                boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L41
                if (r1 != 0) goto L26
                r0.onComplete()
                return
            L41:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r0.onError(r3)
                return
            L49:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r0.onError(r3)
                return
            L51:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
                r4 = this;
                java.util.Iterator<? extends R> r0 = r4.f512it
                r1 = 0
                if (r0 == 0) goto L18
                java.lang.Object r2 = r0.next()
                java.lang.String r3 = "The iterator returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L17
                r4.f512it = r1
            L17:
                return r2
            L18:
                return r1
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }
    }

    public SingleFlatMapIterableObservable(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver r1 = new io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
