package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableMergeDelayErrorIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> sources;

    public CompletableMergeDelayErrorIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r7) {
            r6 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r7.onSubscribe(r0)
            java.lang.Iterable<? extends io.reactivex.CompletableSource> r1 = r6.sources     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "The source iterator returned is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r1 = (java.util.Iterator) r1     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r3 = 1
            r2.<init>(r3)
            io.reactivex.internal.util.AtomicThrowable r3 = new io.reactivex.internal.util.AtomicThrowable
            r3.<init>()
        L21:
            boolean r4 = r0.isDisposed()
            if (r4 == 0) goto L28
            return
        L28:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r4 != 0) goto L2f
            goto L64
        L2f:
            boolean r4 = r0.isDisposed()
            if (r4 == 0) goto L36
            return
        L36:
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "The iterator returned a null CompletableSource"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L55
            io.reactivex.CompletableSource r4 = (io.reactivex.CompletableSource) r4     // Catch: java.lang.Throwable -> L55
            boolean r5 = r0.isDisposed()
            if (r5 == 0) goto L49
            return
        L49:
            r2.getAndIncrement()
            io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$MergeInnerCompletableObserver r5 = new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$MergeInnerCompletableObserver
            r5.<init>(r7, r0, r3, r2)
            r4.subscribe(r5)
            goto L21
        L55:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r3.addThrowable(r0)
            goto L64
        L5d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r3.addThrowable(r0)
        L64:
            int r0 = r2.decrementAndGet()
            if (r0 != 0) goto L77
            java.lang.Throwable r0 = r3.terminate()
            if (r0 != 0) goto L74
            r7.onComplete()
            goto L77
        L74:
            r7.onError(r0)
        L77:
            return
        L78:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            r7.onError(r0)
            return
    }
}
