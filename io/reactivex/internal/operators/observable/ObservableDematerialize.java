package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDematerialize<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<io.reactivex.Notification<T>, T> {

    static final class DematerializeObserver<T> implements io.reactivex.Observer<io.reactivex.Notification<T>>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        boolean done;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f396s;

        DematerializeObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f396s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f396s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public void onNext(io.reactivex.Notification<T> r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L12
                boolean r0 = r2.isOnError()
                if (r0 == 0) goto L11
                java.lang.Throwable r2 = r2.getError()
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L11:
                return
            L12:
                boolean r0 = r2.isOnError()
                if (r0 == 0) goto L25
                io.reactivex.disposables.Disposable r0 = r1.f396s
                r0.dispose()
                java.lang.Throwable r2 = r2.getError()
                r1.onError(r2)
                goto L3d
            L25:
                boolean r0 = r2.isOnComplete()
                if (r0 == 0) goto L34
                io.reactivex.disposables.Disposable r2 = r1.f396s
                r2.dispose()
                r1.onComplete()
                goto L3d
            L34:
                io.reactivex.Observer<? super T> r0 = r1.actual
                java.lang.Object r2 = r2.getValue()
                r0.onNext(r2)
            L3d:
                return
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.Notification r1 = (io.reactivex.Notification) r1
                r0.onNext(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f396s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f396s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDematerialize(io.reactivex.ObservableSource<io.reactivex.Notification<T>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.ObservableSource<T> r0 = r2.source
            io.reactivex.internal.operators.observable.ObservableDematerialize$DematerializeObserver r1 = new io.reactivex.internal.operators.observable.ObservableDematerialize$DematerializeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
