package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleAmb<T> extends io.reactivex.Single<T> {
    private final io.reactivex.SingleSource<? extends T>[] sources;
    private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> sourcesIterable;

    static final class AmbSingleObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -1944085461036028108L;

        /* renamed from: s */
        final io.reactivex.SingleObserver<? super T> f494s;
        final io.reactivex.disposables.CompositeDisposable set;

        AmbSingleObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.disposables.CompositeDisposable r2) {
                r0 = this;
                r0.<init>()
                r0.f494s = r1
                r0.set = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L13
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                io.reactivex.SingleObserver<? super T> r0 = r2.f494s
                r0.onError(r3)
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L16:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L12
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.dispose()
                io.reactivex.SingleObserver<? super T> r0 = r2.f494s
                r0.onSuccess(r3)
            L12:
                return
        }
    }

    public SingleAmb(io.reactivex.SingleSource<? extends T>[] r1, java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.sourcesIterable = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r10) {
            r9 = this;
            io.reactivex.SingleSource<? extends T>[] r0 = r9.sources
            java.lang.String r1 = "One of the sources is null"
            r2 = 0
            if (r0 != 0) goto L43
            r0 = 8
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r3 = r9.sourcesIterable     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
            r4 = r2
        L12:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L44
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L3b
            io.reactivex.SingleSource r5 = (io.reactivex.SingleSource) r5     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L29
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r10)     // Catch: java.lang.Throwable -> L3b
            return
        L29:
            int r6 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r4 != r6) goto L35
            int r6 = r4 >> 2
            int r6 = r6 + r4
            io.reactivex.SingleSource[] r6 = new io.reactivex.SingleSource[r6]     // Catch: java.lang.Throwable -> L3b
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
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r10)
            return
        L43:
            int r4 = r0.length
        L44:
            io.reactivex.disposables.CompositeDisposable r3 = new io.reactivex.disposables.CompositeDisposable
            r3.<init>()
            io.reactivex.internal.operators.single.SingleAmb$AmbSingleObserver r5 = new io.reactivex.internal.operators.single.SingleAmb$AmbSingleObserver
            r5.<init>(r10, r3)
            r10.onSubscribe(r3)
            r6 = r2
        L52:
            if (r6 >= r4) goto L7c
            r7 = r0[r6]
            boolean r8 = r5.get()
            if (r8 == 0) goto L5d
            return
        L5d:
            if (r7 != 0) goto L76
            r3.dispose()
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            r1 = 1
            boolean r1 = r5.compareAndSet(r2, r1)
            if (r1 == 0) goto L72
            r10.onError(r0)
            goto L75
        L72:
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
        L75:
            return
        L76:
            r7.subscribe(r5)
            int r6 = r6 + 1
            goto L52
        L7c:
            return
    }
}
