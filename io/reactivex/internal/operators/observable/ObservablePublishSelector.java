package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservablePublishSelector<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> selector;

    static final class SourceObserver<T, R> implements io.reactivex.Observer<T> {
        final io.reactivex.subjects.PublishSubject<T> subject;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> target;

        SourceObserver(io.reactivex.subjects.PublishSubject<T> r1, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2) {
                r0 = this;
                r0.<init>()
                r0.subject = r1
                r0.target = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.subjects.PublishSubject<T> r0 = r1.subject
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.subjects.PublishSubject<T> r0 = r1.subject
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.subjects.PublishSubject<T> r0 = r1.subject
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.target
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }
    }

    static final class TargetObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 854110278590336484L;
        final io.reactivex.Observer<? super R> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f425d;

        TargetObserver(io.reactivex.Observer<? super R> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f425d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f425d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(R r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f425d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f425d = r2
                io.reactivex.Observer<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservablePublishSelector(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.selector = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super R> r4) {
            r3 = this;
            io.reactivex.subjects.PublishSubject r0 = io.reactivex.subjects.PublishSubject.create()
            io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r1 = r3.selector     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "The selector returned a null ObservableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L25
            io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L25
            io.reactivex.internal.operators.observable.ObservablePublishSelector$TargetObserver r2 = new io.reactivex.internal.operators.observable.ObservablePublishSelector$TargetObserver
            r2.<init>(r4)
            r1.subscribe(r2)
            io.reactivex.ObservableSource<T> r4 = r3.source
            io.reactivex.internal.operators.observable.ObservablePublishSelector$SourceObserver r1 = new io.reactivex.internal.operators.observable.ObservablePublishSelector$SourceObserver
            r1.<init>(r0, r2)
            r4.subscribe(r1)
            return
        L25:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
            return
    }
}
