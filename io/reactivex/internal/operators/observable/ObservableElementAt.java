package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableElementAt<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f401s;

        ElementAtObserver(io.reactivex.Observer<? super T> r1, long r2, T r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.defaultValue = r4
                r0.errorOnFewer = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f401s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f401s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L26
                r0 = 1
                r2.done = r0
                T r0 = r2.defaultValue
                if (r0 != 0) goto L1a
                boolean r1 = r2.errorOnFewer
                if (r1 == 0) goto L1a
                io.reactivex.Observer<? super T> r0 = r2.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                goto L26
            L1a:
                if (r0 == 0) goto L21
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            L21:
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L26:
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

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.count
                long r2 = r4.index
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L20
                r0 = 1
                r4.done = r0
                io.reactivex.disposables.Disposable r0 = r4.f401s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onNext(r5)
                io.reactivex.Observer<? super T> r5 = r4.actual
                r5.onComplete()
                return
            L20:
                r2 = 1
                long r0 = r0 + r2
                r4.count = r0
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f401s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f401s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableElementAt(io.reactivex.ObservableSource<T> r1, long r2, T r4, boolean r5) {
            r0 = this;
            r0.<init>(r1)
            r0.index = r2
            r0.defaultValue = r4
            r0.errorOnFewer = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableElementAt$ElementAtObserver r7 = new io.reactivex.internal.operators.observable.ObservableElementAt$ElementAtObserver
            long r3 = r8.index
            T r5 = r8.defaultValue
            boolean r6 = r8.errorOnFewer
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r7)
            return
    }
}
