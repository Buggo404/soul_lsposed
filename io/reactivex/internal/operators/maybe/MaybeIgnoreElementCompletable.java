package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeIgnoreElementCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToMaybe<T> {
    final io.reactivex.MaybeSource<T> source;

    static final class IgnoreMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f355d;

        IgnoreMaybeObserver(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f355d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f355d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f355d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f355d = r0
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f355d = r0
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f355d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f355d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r0.f355d = r1
                io.reactivex.CompletableObserver r1 = r0.actual
                r1.onComplete()
                return
        }
    }

    public MaybeIgnoreElementCompletable(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public io.reactivex.Maybe<T> fuseToMaybe() {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeIgnoreElement r0 = new io.reactivex.internal.operators.maybe.MaybeIgnoreElement
            io.reactivex.MaybeSource<T> r1 = r2.source
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable$IgnoreMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable$IgnoreMaybeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
