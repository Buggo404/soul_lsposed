package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRepeatUntil<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BooleanSupplier until;

    static final class RepeatUntilObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: sd */
        final io.reactivex.internal.disposables.SequentialDisposable f430sd;
        final io.reactivex.ObservableSource<? extends T> source;
        final io.reactivex.functions.BooleanSupplier stop;

        RepeatUntilObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.BooleanSupplier r2, io.reactivex.internal.disposables.SequentialDisposable r3, io.reactivex.ObservableSource<? extends T> r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f430sd = r3
                r0.source = r4
                r0.stop = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.functions.BooleanSupplier r0 = r2.stop     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto Le
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
                goto L11
            Le:
                r2.subscribeNext()
            L11:
                return
            L12:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f430sd
                r0.replace(r2)
                return
        }

        void subscribeNext() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L13
                r0 = 1
            L7:
                io.reactivex.ObservableSource<? extends T> r1 = r2.source
                r1.subscribe(r2)
                int r0 = -r0
                int r0 = r2.addAndGet(r0)
                if (r0 != 0) goto L7
            L13:
                return
        }
    }

    public ObservableRepeatUntil(io.reactivex.Observable<T> r1, io.reactivex.functions.BooleanSupplier r2) {
            r0 = this;
            r0.<init>(r1)
            r0.until = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r5.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableRepeatUntil$RepeatUntilObserver r1 = new io.reactivex.internal.operators.observable.ObservableRepeatUntil$RepeatUntilObserver
            io.reactivex.functions.BooleanSupplier r2 = r4.until
            io.reactivex.ObservableSource<T> r3 = r4.source
            r1.<init>(r5, r2, r0, r3)
            r1.subscribeNext()
            return
    }
}
