package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRetryBiPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;

    static final class RetryBiObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> predicate;
        int retries;

        /* renamed from: sa */
        final io.reactivex.internal.disposables.SequentialDisposable f433sa;
        final io.reactivex.ObservableSource<? extends T> source;

        RetryBiObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2, io.reactivex.internal.disposables.SequentialDisposable r3, io.reactivex.ObservableSource<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f433sa = r3
                r0.source = r4
                r0.predicate = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                r0 = 1
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r1 = r6.predicate     // Catch: java.lang.Throwable -> L1c
                int r2 = r6.retries     // Catch: java.lang.Throwable -> L1c
                int r2 = r2 + r0
                r6.retries = r2     // Catch: java.lang.Throwable -> L1c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r1.test(r2, r7)     // Catch: java.lang.Throwable -> L1c
                if (r0 != 0) goto L18
                io.reactivex.Observer<? super T> r0 = r6.actual
                r0.onError(r7)
                return
            L18:
                r6.subscribeNext()
                return
            L1c:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.Observer<? super T> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f433sa
                r0.update(r2)
                return
        }

        void subscribeNext() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L1c
                r0 = 1
            L7:
                io.reactivex.internal.disposables.SequentialDisposable r1 = r2.f433sa
                boolean r1 = r1.isDisposed()
                if (r1 == 0) goto L10
                return
            L10:
                io.reactivex.ObservableSource<? extends T> r1 = r2.source
                r1.subscribe(r2)
                int r0 = -r0
                int r0 = r2.addAndGet(r0)
                if (r0 != 0) goto L7
            L1c:
                return
        }
    }

    public ObservableRetryBiPredicate(io.reactivex.Observable<T> r1, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableRetryBiPredicate$RetryBiObserver r1 = new io.reactivex.internal.operators.observable.ObservableRetryBiPredicate$RetryBiObserver
            io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2 = r4.predicate
            io.reactivex.ObservableSource<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
