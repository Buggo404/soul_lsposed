package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoOnSubscribe<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    final io.reactivex.SingleSource<T> source;

    static final class DoOnSubscribeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super T> actual;
        boolean done;
        final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

        DoOnSubscribeSingleObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onSubscribe = r2
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r2.onSubscribe     // Catch: java.lang.Throwable -> Lb
                r0.accept(r3)     // Catch: java.lang.Throwable -> Lb
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r3)
                return
            Lb:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1 = 1
                r2.done = r1
                r3.dispose()
                io.reactivex.SingleObserver<? super T> r3 = r2.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r3)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public SingleDoOnSubscribe(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onSubscribe = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleDoOnSubscribe$DoOnSubscribeSingleObserver r1 = new io.reactivex.internal.operators.single.SingleDoOnSubscribe$DoOnSubscribeSingleObserver
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2 = r3.onSubscribe
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
