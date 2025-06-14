package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableAny<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class AnyObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super java.lang.Boolean> actual;
        boolean done;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f370s;

        AnyObserver(io.reactivex.Observer<? super java.lang.Boolean> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.predicate = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f370s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f370s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L16
                r0 = 1
                r2.done = r0
                io.reactivex.Observer<? super java.lang.Boolean> r0 = r2.actual
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.onNext(r1)
                io.reactivex.Observer<? super java.lang.Boolean> r0 = r2.actual
                r0.onComplete()
            L16:
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
                io.reactivex.Observer<? super java.lang.Boolean> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Predicate<? super T> r0 = r1.predicate     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.test(r2)     // Catch: java.lang.Throwable -> L24
                if (r2 == 0) goto L23
                r2 = 1
                r1.done = r2
                io.reactivex.disposables.Disposable r0 = r1.f370s
                r0.dispose()
                io.reactivex.Observer<? super java.lang.Boolean> r0 = r1.actual
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.onNext(r2)
                io.reactivex.Observer<? super java.lang.Boolean> r2 = r1.actual
                r2.onComplete()
            L23:
                return
            L24:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.disposables.Disposable r0 = r1.f370s
                r0.dispose()
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f370s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f370s = r2
                io.reactivex.Observer<? super java.lang.Boolean> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableAny(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableAny$AnyObserver r1 = new io.reactivex.internal.operators.observable.ObservableAny$AnyObserver
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
