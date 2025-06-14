package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeOnErrorComplete<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;

    static final class OnErrorCompleteMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f359d;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;

        OnErrorCompleteMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f359d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f359d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Predicate<? super java.lang.Throwable> r0 = r5.predicate     // Catch: java.lang.Throwable -> L14
                boolean r0 = r0.test(r6)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto Le
                io.reactivex.MaybeObserver<? super T> r6 = r5.actual
                r6.onComplete()
                goto L13
            Le:
                io.reactivex.MaybeObserver<? super T> r0 = r5.actual
                r0.onError(r6)
            L13:
                return
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.MaybeObserver<? super T> r1 = r5.actual
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
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f359d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f359d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public MaybeOnErrorComplete(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeOnErrorComplete$OnErrorCompleteMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeOnErrorComplete$OnErrorCompleteMaybeObserver
            io.reactivex.functions.Predicate<? super java.lang.Throwable> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
