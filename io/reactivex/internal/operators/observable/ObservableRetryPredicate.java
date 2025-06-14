package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRetryPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long count;
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;

    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;
        long remaining;

        /* renamed from: sa */
        final io.reactivex.internal.disposables.SequentialDisposable f434sa;
        final io.reactivex.ObservableSource<? extends T> source;

        RepeatObserver(io.reactivex.Observer<? super T> r1, long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4, io.reactivex.internal.disposables.SequentialDisposable r5, io.reactivex.ObservableSource<? extends T> r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f434sa = r5
                r0.source = r6
                r0.predicate = r4
                r0.remaining = r2
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
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                long r0 = r5.remaining
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L11
                r2 = 1
                long r2 = r0 - r2
                r5.remaining = r2
            L11:
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L1d
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                goto L2e
            L1d:
                io.reactivex.functions.Predicate<? super java.lang.Throwable> r0 = r5.predicate     // Catch: java.lang.Throwable -> L2f
                boolean r0 = r0.test(r6)     // Catch: java.lang.Throwable -> L2f
                if (r0 != 0) goto L2b
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                return
            L2b:
                r5.subscribeNext()
            L2e:
                return
            L2f:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f434sa
                r0.update(r2)
                return
        }

        void subscribeNext() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L1c
                r0 = 1
            L7:
                io.reactivex.internal.disposables.SequentialDisposable r1 = r2.f434sa
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

    public ObservableRetryPredicate(io.reactivex.Observable<T> r1, long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r4
            r0.count = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            io.reactivex.internal.disposables.SequentialDisposable r5 = new io.reactivex.internal.disposables.SequentialDisposable
            r5.<init>()
            r9.onSubscribe(r5)
            io.reactivex.internal.operators.observable.ObservableRetryPredicate$RepeatObserver r7 = new io.reactivex.internal.operators.observable.ObservableRetryPredicate$RepeatObserver
            long r2 = r8.count
            io.reactivex.functions.Predicate<? super java.lang.Throwable> r4 = r8.predicate
            io.reactivex.ObservableSource<T> r6 = r8.source
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6)
            r7.subscribeNext()
            return
    }
}
