package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDoAfterSuccess<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> onAfterSuccess;

    static final class DoAfterObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f340d;
        final io.reactivex.functions.Consumer<? super T> onAfterSuccess;

        DoAfterObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onAfterSuccess = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f340d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f340d
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
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f340d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f340d = r2
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
                io.reactivex.functions.Consumer<? super T> r0 = r1.onAfterSuccess     // Catch: java.lang.Throwable -> Lb
                r0.accept(r2)     // Catch: java.lang.Throwable -> Lb
                goto L12
            Lb:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L12:
                return
        }
    }

    public MaybeDoAfterSuccess(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onAfterSuccess = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess$DoAfterObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess$DoAfterObserver
            io.reactivex.functions.Consumer<? super T> r2 = r3.onAfterSuccess
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
