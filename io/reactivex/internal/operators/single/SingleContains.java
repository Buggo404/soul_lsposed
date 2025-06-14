package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleContains<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> comparer;
    final io.reactivex.SingleSource<T> source;
    final java.lang.Object value;

    final class Single implements io.reactivex.SingleObserver<T> {

        /* renamed from: s */
        private final io.reactivex.SingleObserver<? super java.lang.Boolean> f495s;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleContains this$0;

        Single(io.reactivex.internal.operators.single.SingleContains r1, io.reactivex.SingleObserver<? super java.lang.Boolean> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f495s = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r1.f495s
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r1.f495s
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleContains r0 = r2.this$0     // Catch: java.lang.Throwable -> L16
                io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r0 = r0.comparer     // Catch: java.lang.Throwable -> L16
                io.reactivex.internal.operators.single.SingleContains r1 = r2.this$0     // Catch: java.lang.Throwable -> L16
                java.lang.Object r1 = r1.value     // Catch: java.lang.Throwable -> L16
                boolean r3 = r0.test(r3, r1)     // Catch: java.lang.Throwable -> L16
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r2.f495s
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.onSuccess(r3)
                return
            L16:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r2.f495s
                r0.onError(r3)
                return
        }
    }

    public SingleContains(io.reactivex.SingleSource<T> r1, java.lang.Object r2, io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.value = r2
            r0.comparer = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleContains$Single r1 = new io.reactivex.internal.operators.single.SingleContains$Single
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
