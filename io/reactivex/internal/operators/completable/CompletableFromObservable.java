package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableFromObservable<T> extends io.reactivex.Completable {
    final io.reactivex.ObservableSource<T> observable;

    static final class CompletableFromObservableObserver<T> implements io.reactivex.Observer<T> {

        /* renamed from: co */
        final io.reactivex.CompletableObserver f201co;

        CompletableFromObservableObserver(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.f201co = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f201co
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f201co
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f201co
                r0.onSubscribe(r2)
                return
        }
    }

    public CompletableFromObservable(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.observable = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.observable
            io.reactivex.internal.operators.completable.CompletableFromObservable$CompletableFromObservableObserver r1 = new io.reactivex.internal.operators.completable.CompletableFromObservable$CompletableFromObservableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
