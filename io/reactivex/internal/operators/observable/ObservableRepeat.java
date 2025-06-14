package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRepeat<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long count;

    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> actual;
        long remaining;

        /* renamed from: sd */
        final io.reactivex.internal.disposables.SequentialDisposable f429sd;
        final io.reactivex.ObservableSource<? extends T> source;

        RepeatObserver(io.reactivex.Observer<? super T> r1, long r2, io.reactivex.internal.disposables.SequentialDisposable r4, io.reactivex.ObservableSource<? extends T> r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.f429sd = r4
                r0.source = r5
                r0.remaining = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r4 = this;
                long r0 = r4.remaining
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L11
                r2 = 1
                long r2 = r0 - r2
                r4.remaining = r2
            L11:
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L1b
                r4.subscribeNext()
                goto L20
            L1b:
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onComplete()
            L20:
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f429sd
                r0.replace(r2)
                return
        }

        void subscribeNext() {
                r2 = this;
                int r0 = r2.getAndIncrement()
                if (r0 != 0) goto L1c
                r0 = 1
            L7:
                io.reactivex.internal.disposables.SequentialDisposable r1 = r2.f429sd
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

    public ObservableRepeat(io.reactivex.Observable<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r8) {
            r7 = this;
            io.reactivex.internal.disposables.SequentialDisposable r4 = new io.reactivex.internal.disposables.SequentialDisposable
            r4.<init>()
            r8.onSubscribe(r4)
            io.reactivex.internal.operators.observable.ObservableRepeat$RepeatObserver r6 = new io.reactivex.internal.operators.observable.ObservableRepeat$RepeatObserver
            long r0 = r7.count
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L19
            r2 = 1
            long r0 = r0 - r2
            r2 = r0
        L19:
            io.reactivex.ObservableSource<T> r5 = r7.source
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r4, r5)
            r6.subscribeNext()
            return
    }
}
