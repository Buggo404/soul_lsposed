package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoOnEvent<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> onEvent;
    final io.reactivex.SingleSource<T> source;

    final class DoOnEvent implements io.reactivex.SingleObserver<T> {

        /* renamed from: s */
        private final io.reactivex.SingleObserver<? super T> f506s;
        final /* synthetic */ io.reactivex.internal.operators.single.SingleDoOnEvent this$0;

        DoOnEvent(io.reactivex.internal.operators.single.SingleDoOnEvent r1, io.reactivex.SingleObserver<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.f506s = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.operators.single.SingleDoOnEvent r0 = r4.this$0     // Catch: java.lang.Throwable -> L9
                io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r0.onEvent     // Catch: java.lang.Throwable -> L9
                r1 = 0
                r0.accept(r1, r5)     // Catch: java.lang.Throwable -> L9
                goto L1c
            L9:
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
            L1c:
                io.reactivex.SingleObserver<? super T> r0 = r4.f506s
                r0.onError(r5)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.f506s
                r0.onSubscribe(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleDoOnEvent r0 = r2.this$0     // Catch: java.lang.Throwable -> Le
                io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r0 = r0.onEvent     // Catch: java.lang.Throwable -> Le
                r1 = 0
                r0.accept(r3, r1)     // Catch: java.lang.Throwable -> Le
                io.reactivex.SingleObserver<? super T> r0 = r2.f506s
                r0.onSuccess(r3)
                return
            Le:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.SingleObserver<? super T> r0 = r2.f506s
                r0.onError(r3)
                return
        }
    }

    public SingleDoOnEvent(io.reactivex.SingleSource<T> r1, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onEvent = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleDoOnEvent$DoOnEvent r1 = new io.reactivex.internal.operators.single.SingleDoOnEvent$DoOnEvent
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
