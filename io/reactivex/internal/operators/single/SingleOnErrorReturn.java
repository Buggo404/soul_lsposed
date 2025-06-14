package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleOnErrorReturn<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> source;
    final T value;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    final class OnErrorReturn implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> observer;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleOnErrorReturn this$0;

        OnErrorReturn(io.reactivex.internal.operators.single.SingleOnErrorReturn r1, io.reactivex.SingleObserver<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.observer = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.internal.operators.single.SingleOnErrorReturn r0 = r5.this$0
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r0 = r0.valueSupplier
                if (r0 == 0) goto L27
                io.reactivex.internal.operators.single.SingleOnErrorReturn r0 = r5.this$0     // Catch: java.lang.Throwable -> Lf
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r0 = r0.valueSupplier     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> Lf
                goto L2b
            Lf:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.SingleObserver<? super T> r1 = r5.observer
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
            L27:
                io.reactivex.internal.operators.single.SingleOnErrorReturn r0 = r5.this$0
                T r0 = r0.value
            L2b:
                if (r0 != 0) goto L3d
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Value supplied was null"
                r0.<init>(r1)
                r0.initCause(r6)
                io.reactivex.SingleObserver<? super T> r6 = r5.observer
                r6.onError(r0)
                return
            L3d:
                io.reactivex.SingleObserver<? super T> r6 = r5.observer
                r6.onSuccess(r0)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.observer
                r0.onSuccess(r2)
                return
        }
    }

    public SingleOnErrorReturn(io.reactivex.SingleSource<? extends T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.valueSupplier = r2
            r0.value = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<? extends T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleOnErrorReturn$OnErrorReturn r1 = new io.reactivex.internal.operators.single.SingleOnErrorReturn$OnErrorReturn
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
