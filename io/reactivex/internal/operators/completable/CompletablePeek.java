package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletablePeek extends io.reactivex.Completable {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Action onDispose;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    final io.reactivex.functions.Action onTerminate;
    final io.reactivex.CompletableSource source;

    final class CompletableObserverImplementation implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f208d;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletablePeek this$0;

        CompletableObserverImplementation(io.reactivex.internal.operators.completable.CompletablePeek r1, io.reactivex.CompletableObserver r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.actual = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r1.this$0     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Action r0 = r0.onDispose     // Catch: java.lang.Throwable -> L8
                r0.run()     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Lf:
                io.reactivex.disposables.Disposable r0 = r1.f208d
                r0.dispose()
                return
        }

        void doAfter() {
                r1 = this;
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r1.this$0     // Catch: java.lang.Throwable -> L8
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

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f208d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f208d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto L7
                return
            L7:
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r2.this$0     // Catch: java.lang.Throwable -> L1e
                io.reactivex.functions.Action r0 = r0.onComplete     // Catch: java.lang.Throwable -> L1e
                r0.run()     // Catch: java.lang.Throwable -> L1e
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r2.this$0     // Catch: java.lang.Throwable -> L1e
                io.reactivex.functions.Action r0 = r0.onTerminate     // Catch: java.lang.Throwable -> L1e
                r0.run()     // Catch: java.lang.Throwable -> L1e
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
                r2.doAfter()
                return
            L1e:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.CompletableObserver r1 = r2.actual
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.disposables.Disposable r0 = r4.f208d
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r5)
                return
            La:
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r4.this$0     // Catch: java.lang.Throwable -> L19
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = r0.onError     // Catch: java.lang.Throwable -> L19
                r0.accept(r5)     // Catch: java.lang.Throwable -> L19
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r4.this$0     // Catch: java.lang.Throwable -> L19
                io.reactivex.functions.Action r0 = r0.onTerminate     // Catch: java.lang.Throwable -> L19
                r0.run()     // Catch: java.lang.Throwable -> L19
                goto L2c
            L19:
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
            L2c:
                io.reactivex.CompletableObserver r0 = r4.actual
                r0.onError(r5)
                r4.doAfter()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.completable.CompletablePeek r0 = r1.this$0     // Catch: java.lang.Throwable -> L17
                io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r0 = r0.onSubscribe     // Catch: java.lang.Throwable -> L17
                r0.accept(r2)     // Catch: java.lang.Throwable -> L17
                io.reactivex.disposables.Disposable r0 = r1.f208d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L16
                r1.f208d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            L16:
                return
            L17:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r2.dispose()
                io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f208d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r2)
                return
        }
    }

    public CompletablePeek(io.reactivex.CompletableSource r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5, io.reactivex.functions.Action r6, io.reactivex.functions.Action r7) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onSubscribe = r2
            r0.onError = r3
            r0.onComplete = r4
            r0.onTerminate = r5
            r0.onAfterTerminate = r6
            r0.onDispose = r7
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletablePeek$CompletableObserverImplementation r1 = new io.reactivex.internal.operators.completable.CompletablePeek$CompletableObserverImplementation
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
