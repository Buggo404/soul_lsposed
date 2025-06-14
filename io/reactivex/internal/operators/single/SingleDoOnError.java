package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoOnError<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.SingleSource<T> source;

    final class DoOnError implements io.reactivex.SingleObserver<T> {

        /* renamed from: s */
        private final io.reactivex.SingleObserver<? super T> f505s;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleDoOnError this$0;

        DoOnError(io.reactivex.internal.operators.single.SingleDoOnError r1, io.reactivex.SingleObserver<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f505s = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.operators.single.SingleDoOnError r0 = r4.this$0     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r0.onError     // Catch: java.lang.Throwable -> L8
                r0.accept(r5)     // Catch: java.lang.Throwable -> L8
                goto L1b
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.exceptions.CompositeException r1 = new io.reactivex.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                r5 = r1
            L1b:
                io.reactivex.SingleObserver<? super T> r0 = r4.f505s
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.f505s
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.f505s
                r0.onSuccess(r2)
                return
        }
    }

    public SingleDoOnError(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onError = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleDoOnError$DoOnError r1 = new io.reactivex.internal.operators.single.SingleDoOnError$DoOnError
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
