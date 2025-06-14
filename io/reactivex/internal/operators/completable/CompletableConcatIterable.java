package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableConcatIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> sources;

    static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.CompletableObserver actual;

        /* renamed from: sd */
        final io.reactivex.internal.disposables.SequentialDisposable f196sd;
        final java.util.Iterator<? extends io.reactivex.CompletableSource> sources;

        ConcatInnerObserver(io.reactivex.CompletableObserver r1, java.util.Iterator<? extends io.reactivex.CompletableSource> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sources = r2
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.f196sd = r1
                return
        }

        void next() {
                r3 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r3.f196sd
                boolean r0 = r0.isDisposed()
                if (r0 == 0) goto L9
                return
            L9:
                int r0 = r3.getAndIncrement()
                if (r0 == 0) goto L10
                return
            L10:
                java.util.Iterator<? extends io.reactivex.CompletableSource> r0 = r3.sources
            L12:
                io.reactivex.internal.disposables.SequentialDisposable r1 = r3.f196sd
                boolean r1 = r1.isDisposed()
                if (r1 == 0) goto L1b
                return
            L1b:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L47
                if (r1 != 0) goto L27
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onComplete()
                return
            L27:
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
                java.lang.String r2 = "The CompletableSource returned is null"
                java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L3d
                io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1     // Catch: java.lang.Throwable -> L3d
                r1.subscribe(r3)
                int r1 = r3.decrementAndGet()
                if (r1 != 0) goto L12
                return
            L3d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r3.actual
                r1.onError(r0)
                return
            L47:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r3.actual
                r1.onError(r0)
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
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f196sd
                r0.replace(r2)
                return
        }
    }

    public CompletableConcatIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            java.lang.Iterable<? extends io.reactivex.CompletableSource> r0 = r2.sources     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "The iterator returned is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.Throwable -> L1c
            io.reactivex.internal.operators.completable.CompletableConcatIterable$ConcatInnerObserver r1 = new io.reactivex.internal.operators.completable.CompletableConcatIterable$ConcatInnerObserver
            r1.<init>(r3, r0)
            io.reactivex.internal.disposables.SequentialDisposable r0 = r1.f196sd
            r3.onSubscribe(r0)
            r1.next()
            return
        L1c:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
            return
    }
}
