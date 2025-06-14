package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableConcatArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] sources;

    static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.CompletableObserver actual;
        int index;

        /* renamed from: sd */
        final io.reactivex.internal.disposables.SequentialDisposable f195sd;
        final io.reactivex.CompletableSource[] sources;

        ConcatInnerObserver(io.reactivex.CompletableObserver r1, io.reactivex.CompletableSource[] r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sources = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.f195sd = r1
                return
        }

        void next() {
                r3 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r3.f195sd
                boolean r0 = r0.isDisposed()
                if (r0 == 0) goto L9
                return
            L9:
                int r0 = r3.getAndIncrement()
                if (r0 == 0) goto L10
                return
            L10:
                io.reactivex.CompletableSource[] r0 = r3.sources
            L12:
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.f195sd
                boolean r1 = r1.isDisposed()
                if (r1 == 0) goto L1b
                return
            L1b:
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                int r2 = r0.length
                if (r1 != r2) goto L2a
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onComplete()
                return
            L2a:
                r1 = r0[r1]
                r1.subscribe(r3)
                int r1 = r3.decrementAndGet()
                if (r1 != 0) goto L12
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r0 = this;
                r0.next()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f195sd
                r0.replace(r2)
                return
        }
    }

    public CompletableConcatArray(io.reactivex.CompletableSource[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.internal.operators.completable.CompletableConcatArray$ConcatInnerObserver r0 = new io.reactivex.internal.operators.completable.CompletableConcatArray$ConcatInnerObserver
            io.reactivex.CompletableSource[] r1 = r2.sources
            r0.<init>(r3, r1)
            io.reactivex.internal.disposables.SequentialDisposable r1 = r0.f195sd
            r3.onSubscribe(r1)
            r0.next()
            return
    }
}
