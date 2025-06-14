package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybePeek<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onCompleteCall;
    final io.reactivex.functions.Action onDisposeCall;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onErrorCall;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribeCall;
    final io.reactivex.functions.Consumer<? super T> onSuccessCall;

    static final class MaybePeekObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f362d;
        final io.reactivex.internal.operators.maybe.MaybePeek<T> parent;

        MaybePeekObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.internal.operators.maybe.MaybePeek<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Action r0 = r0.onDisposeCall     // Catch: java.lang.Throwable -> L8
                r0.run()     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Lf:
                io.reactivex.disposables.Disposable r0 = r1.f362d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f362d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f362d
                boolean r0 = r0.isDisposed()
                return r0
        }

        void onAfterTerminate() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Action r0 = r0.onAfterTerminate     // Catch: java.lang.Throwable -> L8
                r0.run()     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f362d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r2.parent     // Catch: java.lang.Throwable -> L1b
                io.reactivex.functions.Action r0 = r0.onCompleteCall     // Catch: java.lang.Throwable -> L1b
                r0.run()     // Catch: java.lang.Throwable -> L1b
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f362d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
                r2.onAfterTerminate()
                return
            L1b:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.onErrorInner(r0)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f362d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
            La:
                r2.onErrorInner(r3)
                return
        }

        void onErrorInner(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r4.parent     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r0.onErrorCall     // Catch: java.lang.Throwable -> L8
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
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r4.f362d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r4.actual
                r0.onError(r5)
                r4.onAfterTerminate()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f362d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L27
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L17
                io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r0.onSubscribeCall     // Catch: java.lang.Throwable -> L17
                r0.accept(r2)     // Catch: java.lang.Throwable -> L17
                r1.f362d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
                goto L27
            L17:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.dispose()
                io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f362d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r2)
            L27:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f362d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.internal.operators.maybe.MaybePeek<T> r0 = r2.parent     // Catch: java.lang.Throwable -> L1b
                io.reactivex.functions.Consumer<? super T> r0 = r0.onSuccessCall     // Catch: java.lang.Throwable -> L1b
                r0.accept(r3)     // Catch: java.lang.Throwable -> L1b
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f362d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
                r2.onAfterTerminate()
                return
            L1b:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onErrorInner(r3)
                return
        }
    }

    public MaybePeek(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2, io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4, io.reactivex.functions.Action r5, io.reactivex.functions.Action r6, io.reactivex.functions.Action r7) {
            r0 = this;
            r0.<init>(r1)
            r0.onSubscribeCall = r2
            r0.onSuccessCall = r3
            r0.onErrorCall = r4
            r0.onCompleteCall = r5
            r0.onAfterTerminate = r6
            r0.onDisposeCall = r7
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybePeek$MaybePeekObserver r1 = new io.reactivex.internal.operators.maybe.MaybePeek$MaybePeekObserver
            r1.<init>(r3, r2)
            r0.subscribe(r1)
            return
    }
}
