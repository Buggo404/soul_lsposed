package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableMergeDelayErrorArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] sources;

    static final class MergeInnerCompletableObserver implements io.reactivex.CompletableObserver {
        final io.reactivex.CompletableObserver actual;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.disposables.CompositeDisposable set;
        final java.util.concurrent.atomic.AtomicInteger wip;

        MergeInnerCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.disposables.CompositeDisposable r2, io.reactivex.internal.util.AtomicThrowable r3, java.util.concurrent.atomic.AtomicInteger r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.set = r2
                r0.error = r3
                r0.wip = r4
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r0 = this;
                r0.tryTerminate()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lc
                r1.tryTerminate()
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }

        void tryTerminate() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L1b
                io.reactivex.internal.util.AtomicThrowable r0 = r2.error
                java.lang.Throwable r0 = r0.terminate()
                if (r0 != 0) goto L16
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
                goto L1b
            L16:
                io.reactivex.CompletableObserver r1 = r2.actual
                r1.onError(r0)
            L1b:
                return
        }
    }

    public CompletableMergeDelayErrorArray(io.reactivex.CompletableSource[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r9) {
            r8 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            io.reactivex.CompletableSource[] r2 = r8.sources
            int r2 = r2.length
            int r2 = r2 + 1
            r1.<init>(r2)
            io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
            r2.<init>()
            r9.onSubscribe(r0)
            io.reactivex.CompletableSource[] r3 = r8.sources
            int r4 = r3.length
            r5 = 0
        L1b:
            if (r5 >= r4) goto L41
            r6 = r3[r5]
            boolean r7 = r0.isDisposed()
            if (r7 == 0) goto L26
            return
        L26:
            if (r6 != 0) goto L36
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "A completable source is null"
            r6.<init>(r7)
            r2.addThrowable(r6)
            r1.decrementAndGet()
            goto L3e
        L36:
            io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$MergeInnerCompletableObserver r7 = new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$MergeInnerCompletableObserver
            r7.<init>(r9, r0, r2, r1)
            r6.subscribe(r7)
        L3e:
            int r5 = r5 + 1
            goto L1b
        L41:
            int r0 = r1.decrementAndGet()
            if (r0 != 0) goto L54
            java.lang.Throwable r0 = r2.terminate()
            if (r0 != 0) goto L51
            r9.onComplete()
            goto L54
        L51:
            r9.onError(r0)
        L54:
            return
    }
}
