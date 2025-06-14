package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> other;

    final class SkipUntil implements io.reactivex.Observer<U> {
        private final io.reactivex.internal.disposables.ArrayCompositeDisposable frc;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f450s;
        private final io.reactivex.observers.SerializedObserver<T> serial;
        private final io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> sus;
        final /* synthetic */ io.reactivex.internal.operators.observable.ObservableSkipUntil this$0;

        SkipUntil(io.reactivex.internal.operators.observable.ObservableSkipUntil r1, io.reactivex.internal.disposables.ArrayCompositeDisposable r2, io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> r3, io.reactivex.observers.SerializedObserver<T> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.frc = r2
                r0.sus = r3
                r0.serial = r4
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver<T> r0 = r2.sus
                r1 = 1
                r0.notSkipping = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.frc
                r0.dispose()
                io.reactivex.observers.SerializedObserver<T> r0 = r1.serial
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(U r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r2 = r1.f450s
                r2.dispose()
                io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver<T> r2 = r1.sus
                r0 = 1
                r2.notSkipping = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f450s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L10
                r2.f450s = r3
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r2.frc
                r1 = 1
                r0.setResource(r1, r3)
            L10:
                return
        }
    }

    static final class SkipUntilObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable frc;
        volatile boolean notSkipping;
        boolean notSkippingLocal;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f451s;

        SkipUntilObserver(io.reactivex.Observer<? super T> r1, io.reactivex.internal.disposables.ArrayCompositeDisposable r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.frc = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.frc
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.frc
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.notSkippingLocal
                if (r0 == 0) goto La
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                goto L16
            La:
                boolean r0 = r1.notSkipping
                if (r0 == 0) goto L16
                r0 = 1
                r1.notSkippingLocal = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
            L16:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f451s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L10
                r2.f451s = r3
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r2.frc
                r1 = 0
                r0.setResource(r1, r3)
            L10:
                return
        }
    }

    public ObservableSkipUntil(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r5)
            io.reactivex.internal.disposables.ArrayCompositeDisposable r5 = new io.reactivex.internal.disposables.ArrayCompositeDisposable
            r1 = 2
            r5.<init>(r1)
            r0.onSubscribe(r5)
            io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver r1 = new io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntilObserver
            r1.<init>(r0, r5)
            io.reactivex.ObservableSource<U> r2 = r4.other
            io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntil r3 = new io.reactivex.internal.operators.observable.ObservableSkipUntil$SkipUntil
            r3.<init>(r4, r5, r1, r0)
            r2.subscribe(r3)
            io.reactivex.ObservableSource<T> r5 = r4.source
            r5.subscribe(r1)
            return
    }
}
