package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableMergeIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> sources;

    static final class MergeCompletableObserver extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7730517613164279224L;
        final io.reactivex.CompletableObserver actual;
        final io.reactivex.disposables.CompositeDisposable set;
        final java.util.concurrent.atomic.AtomicInteger wip;

        MergeCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.disposables.CompositeDisposable r2, java.util.concurrent.atomic.AtomicInteger r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.set = r2
                r0.wip = r3
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L15
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
            L15:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L13
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onError(r3)
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L16:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }
    }

    public CompletableMergeIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r6) {
            r5 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r6.onSubscribe(r0)
            java.lang.Iterable<? extends io.reactivex.CompletableSource> r1 = r5.sources     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "The source iterator returned is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = (java.util.Iterator) r1     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r3 = 1
            r2.<init>(r3)
            io.reactivex.internal.operators.completable.CompletableMergeIterable$MergeCompletableObserver r3 = new io.reactivex.internal.operators.completable.CompletableMergeIterable$MergeCompletableObserver
            r3.<init>(r6, r0, r2)
        L21:
            boolean r6 = r0.isDisposed()
            if (r6 == 0) goto L28
            return
        L28:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L32
            r3.onComplete()
            return
        L32:
            boolean r6 = r0.isDisposed()
            if (r6 == 0) goto L39
            return
        L39:
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "The iterator returned a null CompletableSource"
            java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r4)     // Catch: java.lang.Throwable -> L53
            io.reactivex.CompletableSource r6 = (io.reactivex.CompletableSource) r6     // Catch: java.lang.Throwable -> L53
            boolean r4 = r0.isDisposed()
            if (r4 == 0) goto L4c
            return
        L4c:
            r2.getAndIncrement()
            r6.subscribe(r3)
            goto L21
        L53:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            r0.dispose()
            r3.onError(r6)
            return
        L5e:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            r0.dispose()
            r3.onError(r6)
            return
        L69:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r6.onError(r0)
            return
    }
}
