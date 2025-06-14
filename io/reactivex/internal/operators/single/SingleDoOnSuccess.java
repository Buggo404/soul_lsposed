package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoOnSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super T> onSuccess;
    final io.reactivex.SingleSource<T> source;

    final class DoOnSuccess implements io.reactivex.SingleObserver<T> {

        /* renamed from: s */
        private final io.reactivex.SingleObserver<? super T> f507s;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleDoOnSuccess this$0;

        DoOnSuccess(io.reactivex.internal.operators.single.SingleDoOnSuccess r1, io.reactivex.SingleObserver<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f507s = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.f507s
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.f507s
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.internal.operators.single.SingleDoOnSuccess r0 = r1.this$0     // Catch: java.lang.Throwable -> Ld
                io.reactivex.functions.Consumer<? super T> r0 = r0.onSuccess     // Catch: java.lang.Throwable -> Ld
                r0.accept(r2)     // Catch: java.lang.Throwable -> Ld
                io.reactivex.SingleObserver<? super T> r0 = r1.f507s
                r0.onSuccess(r2)
                return
            Ld:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.SingleObserver<? super T> r0 = r1.f507s
                r0.onError(r2)
                return
        }
    }

    public SingleDoOnSuccess(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onSuccess = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleDoOnSuccess$DoOnSuccess r1 = new io.reactivex.internal.operators.single.SingleDoOnSuccess$DoOnSuccess
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
