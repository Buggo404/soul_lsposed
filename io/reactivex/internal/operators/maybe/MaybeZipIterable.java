package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeZipIterable<T, R> extends io.reactivex.Maybe<R> {
    final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> sources;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        final /* synthetic */ io.reactivex.internal.operators.maybe.MaybeZipIterable this$0;

        SingletonArrayFunc(io.reactivex.internal.operators.maybe.MaybeZipIterable r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(T r4) throws java.lang.Exception {
                r3 = this;
                io.reactivex.internal.operators.maybe.MaybeZipIterable r0 = r3.this$0
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

    public MaybeZipIterable(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.zipper = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r7) {
            r6 = this;
            r0 = 8
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1 = r6.sources     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L70
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L70
            io.reactivex.MaybeSource r4 = (io.reactivex.MaybeSource) r4     // Catch: java.lang.Throwable -> L70
            if (r4 != 0) goto L25
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "One of the sources is null"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)     // Catch: java.lang.Throwable -> L70
            return
        L25:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L70
            if (r3 != r5) goto L31
            int r5 = r3 >> 2
            int r5 = r5 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L70
            io.reactivex.MaybeSource[] r0 = (io.reactivex.MaybeSource[]) r0     // Catch: java.lang.Throwable -> L70
        L31:
            int r5 = r3 + 1
            r0[r3] = r4     // Catch: java.lang.Throwable -> L70
            r3 = r5
            goto Lc
        L37:
            if (r3 != 0) goto L3d
            io.reactivex.internal.disposables.EmptyDisposable.complete(r7)
            return
        L3d:
            r1 = 1
            if (r3 != r1) goto L50
            r0 = r0[r2]
            io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeMap$MapMaybeObserver
            io.reactivex.internal.operators.maybe.MaybeZipIterable$SingletonArrayFunc r2 = new io.reactivex.internal.operators.maybe.MaybeZipIterable$SingletonArrayFunc
            r2.<init>(r6)
            r1.<init>(r7, r2)
            r0.subscribe(r1)
            return
        L50:
            io.reactivex.internal.operators.maybe.MaybeZipArray$ZipCoordinator r1 = new io.reactivex.internal.operators.maybe.MaybeZipArray$ZipCoordinator
            io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r4 = r6.zipper
            r1.<init>(r7, r3, r4)
            r7.onSubscribe(r1)
        L5a:
            if (r2 >= r3) goto L6f
            boolean r7 = r1.isDisposed()
            if (r7 == 0) goto L63
            return
        L63:
            r7 = r0[r2]
            io.reactivex.internal.operators.maybe.MaybeZipArray$ZipMaybeObserver<T>[] r4 = r1.observers
            r4 = r4[r2]
            r7.subscribe(r4)
            int r2 = r2 + 1
            goto L5a
        L6f:
            return
        L70:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r7)
            return
    }
}
