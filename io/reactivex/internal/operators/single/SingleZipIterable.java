package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleZipIterable<T, R> extends io.reactivex.Single<R> {
    final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> sources;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.single.SingleZipIterable this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.single.SingleZipIterable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.single.SingleZipIterable r0 = r3.this$0
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r0.zipper
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
                return r4
        }
    }

    public SingleZipIterable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.zipper = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r7) {
            r6 = this;
            r0 = 8
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1 = r6.sources     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L75
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L75
            io.reactivex.SingleSource r4 = (io.reactivex.SingleSource) r4     // Catch: java.lang.Throwable -> L75
            if (r4 != 0) goto L25
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "One of the sources is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)     // Catch: java.lang.Throwable -> L75
            return
        L25:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L75
            if (r3 != r5) goto L31
            int r5 = r3 >> 2
            int r5 = r5 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L75
            io.reactivex.SingleSource[] r0 = (io.reactivex.SingleSource[]) r0     // Catch: java.lang.Throwable -> L75
        L31:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L75
            r3 = r5
            goto Lc
        L37:
            if (r3 != 0) goto L42
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
        L42:
            r1 = 1
            if (r3 != r1) goto L55
            r0 = r0[r2]
            io.reactivex.internal.operators.single.SingleMap$MapSingleObserver r1 = new io.reactivex.internal.operators.single.SingleMap$MapSingleObserver
            io.reactivex.internal.operators.single.SingleZipIterable$SingletonArrayFunc r2 = new io.reactivex.internal.operators.single.SingleZipIterable$SingletonArrayFunc
            r2.<init>(r6)
            r1.<init>(r7, r2)
            r0.subscribe(r1)
            return
        L55:
            io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator r1 = new io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4 = r6.zipper
            r1.<init>(r7, r3, r4)
            r7.onSubscribe(r1)
        L5f:
            if (r2 >= r3) goto L74
            boolean r7 = r1.isDisposed()
            if (r7 == 0) goto L68
            return
        L68:
            r7 = r0[r2]
            io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver<T>[] r4 = r1.observers
            r4 = r4[r2]
            r7.subscribe(r4)
            int r2 = r2 + 1
            goto L5f
        L74:
            return
        L75:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
    }
}
