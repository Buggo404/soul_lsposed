package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableMergeArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] sources;

    static final class InnerCompletableObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -8360547806504310570L;
        final io.reactivex.CompletableObserver actual;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.disposables.CompositeDisposable set;

        InnerCompletableObserver(io.reactivex.CompletableObserver r1, java.util.concurrent.atomic.AtomicBoolean r2, io.reactivex.disposables.CompositeDisposable r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.once = r2
                r0.set = r3
                r0.lazySet(r4)
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                int r0 = r3.decrementAndGet()
                if (r0 != 0) goto L15
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onComplete()
            L15:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onError(r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
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

    public CompletableMergeArray(io.reactivex.CompletableSource[] r1) {
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
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            io.reactivex.internal.operators.completable.CompletableMergeArray$InnerCompletableObserver r2 = new io.reactivex.internal.operators.completable.CompletableMergeArray$InnerCompletableObserver
            io.reactivex.CompletableSource[] r3 = r6.sources
            int r3 = r3.length
            int r3 = r3 + 1
            r2.<init>(r7, r1, r0, r3)
            r7.onSubscribe(r0)
            io.reactivex.CompletableSource[] r7 = r6.sources
            int r1 = r7.length
            r3 = 0
        L1b:
            if (r3 >= r1) goto L3c
            r4 = r7[r3]
            boolean r5 = r0.isDisposed()
            if (r5 == 0) goto L26
            return
        L26:
            if (r4 != 0) goto L36
            r0.dispose()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "A completable source is null"
            r7.<init>(r0)
            r2.onError(r7)
            return
        L36:
            r4.subscribe(r2)
            int r3 = r3 + 1
            goto L1b
        L3c:
            r2.onComplete()
            return
    }
}
