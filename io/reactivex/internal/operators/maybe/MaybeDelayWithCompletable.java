package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDelayWithCompletable<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.CompletableSource other;
    final io.reactivex.MaybeSource<T> source;

    static final class DelayWithMainObserver<T> implements io.reactivex.MaybeObserver<T> {
        final io.reactivex.MaybeObserver<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        DelayWithMainObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.MaybeObserver<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.actual = r2
                return
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
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.parent
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
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

    static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 703409937383992161L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.MaybeSource<T> source;

        OtherObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.MaybeSource<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.source = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                io.reactivex.MaybeSource<T> r0 = r3.source
                io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$DelayWithMainObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$DelayWithMainObserver
                io.reactivex.MaybeObserver<? super T> r2 = r3.actual
                r1.<init>(r3, r2)
                r0.subscribe(r1)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.MaybeObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }
    }

    public MaybeDelayWithCompletable(io.reactivex.MaybeSource<T> r1, io.reactivex.CompletableSource r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.CompletableSource r0 = r3.other
            io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$OtherObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$OtherObserver
            io.reactivex.MaybeSource<T> r2 = r3.source
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
