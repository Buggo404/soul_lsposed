package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableMaterialize<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Notification<T>> {

    static final class MaterializeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.Notification<T>> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f421s;

        MaterializeObserver(io.reactivex.Observer<? super io.reactivex.Notification<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f421s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f421s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.Notification r0 = io.reactivex.Notification.createOnComplete()
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r1 = r2.actual
                r1.onNext(r0)
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Notification r2 = io.reactivex.Notification.createOnError(r2)
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r0 = r1.actual
                r0.onNext(r2)
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r2 = r1.actual
                r2.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r0 = r1.actual
                io.reactivex.Notification r2 = io.reactivex.Notification.createOnNext(r2)
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f421s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f421s = r2
                io.reactivex.Observer<? super io.reactivex.Notification<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableMaterialize(io.reactivex.ObservableSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Notification<T>> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableMaterialize$MaterializeObserver r1 = new io.reactivex.internal.operators.observable.ObservableMaterialize$MaterializeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
