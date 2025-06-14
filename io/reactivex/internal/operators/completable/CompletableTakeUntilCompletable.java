package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableTakeUntilCompletable extends io.reactivex.Completable {
    final io.reactivex.CompletableSource other;
    final io.reactivex.Completable source;

    static final class TakeUntilMainObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3533011714830024923L;
        final io.reactivex.CompletableObserver downstream;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver.OtherObserver other;

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5176264485428790318L;
            final io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver parent;

            OtherObserver(io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable.TakeUntilMainObserver r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver r0 = r1.parent
                    r0.innerError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        TakeUntilMainObserver(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver r1 = new io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver
                r1.<init>(r0)
                r0.other = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.once = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L12
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver r0 = r3.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
            L12:
                return
        }

        void innerComplete() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L12
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.CompletableObserver r0 = r3.downstream
                r0.onComplete()
            L12:
                return
        }

        void innerError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L13
                io.reactivex.internal.disposables.DisposableHelper.dispose(r3)
                io.reactivex.CompletableObserver r0 = r3.downstream
                r0.onError(r4)
                goto L16
            L13:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L16:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.once
                boolean r0 = r0.get()
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L14
                io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver r0 = r3.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.CompletableObserver r0 = r3.downstream
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver r0 = r3.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.CompletableObserver r0 = r3.downstream
                r0.onError(r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    public CompletableTakeUntilCompletable(io.reactivex.Completable r1, io.reactivex.CompletableSource r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver r0 = new io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            io.reactivex.CompletableSource r3 = r2.other
            io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable$TakeUntilMainObserver$OtherObserver r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.Completable r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
