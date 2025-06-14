package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableAmb extends io.reactivex.Completable {
    private final io.reactivex.CompletableSource[] sources;
    private final java.lang.Iterable<? extends io.reactivex.CompletableSource> sourcesIterable;

    static final class Amb implements io.reactivex.CompletableObserver {
        private final java.util.concurrent.atomic.AtomicBoolean once;

        /* renamed from: s */
        private final io.reactivex.CompletableObserver f193s;
        private final io.reactivex.disposables.CompositeDisposable set;

        Amb(java.util.concurrent.atomic.AtomicBoolean r1, io.reactivex.disposables.CompositeDisposable r2, io.reactivex.CompletableObserver r3) {
                r0 = this;
                r0.<init>()
                r0.once = r1
                r0.set = r2
                r0.f193s = r3
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L14
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                io.reactivex.CompletableObserver r0 = r3.f193s
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                io.reactivex.CompletableObserver r0 = r3.f193s
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

    public CompletableAmb(io.reactivex.CompletableSource[] r1, java.lang.Iterable<? extends io.reactivex.CompletableSource> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r11) {
            r10 = this;
            io.reactivex.CompletableSource[] r0 = r10.sources
            java.lang.String r1 = "One of the sources is null"
            r2 = 0
            if (r0 != 0) goto L43
            r0 = 8
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            java.lang.Iterable<? extends io.reactivex.CompletableSource> r3 = r10.sourcesIterable     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
            r4 = r2
        L12:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L44
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L3b
            io.reactivex.CompletableSource r5 = (io.reactivex.CompletableSource) r5     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L29
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r11)     // Catch: java.lang.Throwable -> L3b
            return
        L29:
            int r6 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r4 != r6) goto L35
            int r6 = r4 >> 2
            int r6 = r6 + r4
            io.reactivex.CompletableSource[] r6 = new io.reactivex.CompletableSource[r6]     // Catch: java.lang.Throwable -> L3b
            java.lang.System.arraycopy(r0, r2, r6, r2, r4)     // Catch: java.lang.Throwable -> L3b
            r0 = r6
        L35:
            int r6 = r4 + 1
            r0[r4] = r5     // Catch: java.lang.Throwable -> L3b
            r4 = r6
            goto L12
        L3b:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r11)
            return
        L43:
            int r4 = r0.length
        L44:
            io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
            r3.<init>()
            r11.onSubscribe(r3)
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>()
            io.reactivex.internal.operators.completable.CompletableAmb$Amb r6 = new io.reactivex.internal.operators.completable.CompletableAmb$Amb
            r6.<init>(r5, r3, r11)
            r7 = r2
        L57:
            if (r7 >= r4) goto L81
            r8 = r0[r7]
            boolean r9 = r3.isDisposed()
            if (r9 == 0) goto L62
            return
        L62:
            if (r8 != 0) goto L7b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            r1 = 1
            boolean r1 = r5.compareAndSet(r2, r1)
            if (r1 == 0) goto L77
            r3.dispose()
            r11.onError(r0)
            goto L7a
        L77:
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L7a:
            return
        L7b:
            r8.subscribe(r6)
            int r7 = r7 + 1
            goto L57
        L81:
            if (r4 != 0) goto L86
            r11.onComplete()
        L86:
            return
    }
}
