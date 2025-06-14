package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSwitchIfEmpty<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends T> other;

    static final class SwitchIfEmptyObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter;
        boolean empty;
        final io.reactivex.ObservableSource<? extends T> other;

        SwitchIfEmptyObserver(io.reactivex.Observer<? super T> r1, io.reactivex.ObservableSource<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.other = r2
                r1 = 1
                r0.empty = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.arbiter = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.empty
                if (r0 == 0) goto Ld
                r0 = 0
                r1.empty = r0
                io.reactivex.ObservableSource<? extends T> r0 = r1.other
                r0.subscribe(r1)
                goto L12
            Ld:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L12:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.empty
                if (r0 == 0) goto L7
                r0 = 0
                r1.empty = r0
            L7:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.arbiter
                r0.update(r2)
                return
        }
    }

    public ObservableSwitchIfEmpty(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty$SwitchIfEmptyObserver r0 = new io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty$SwitchIfEmptyObserver
            io.reactivex.ObservableSource<? extends T> r1 = r2.other
            r0.<init>(r3, r1)
            io.reactivex.internal.disposables.SequentialDisposable r1 = r0.arbiter
            r3.onSubscribe(r1)
            io.reactivex.ObservableSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
