package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<? extends T> main;
    final io.reactivex.ObservableSource<U> other;

    final class DelayObserver implements io.reactivex.Observer<U> {
        final io.reactivex.Observer<? super T> child;
        boolean done;
        final io.reactivex.internal.disposables.SequentialDisposable serial;
        final /* synthetic */ io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther this$0;

        final class OnComplete implements io.reactivex.Observer<T> {
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver this$1;

            OnComplete(io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver r0 = r1.this$1
                    io.reactivex.Observer<? super T> r0 = r0.child
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver r0 = r1.this$1
                    io.reactivex.Observer<? super T> r0 = r0.child
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(T r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver r0 = r1.this$1
                    io.reactivex.Observer<? super T> r0 = r0.child
                    r0.onNext(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver r0 = r1.this$1
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r0.serial
                    r0.update(r2)
                    return
            }
        }

        DelayObserver(io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther r1, io.reactivex.internal.disposables.SequentialDisposable r2, io.reactivex.Observer<? super T> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.serial = r2
                r0.child = r3
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther r0 = r2.this$0
                io.reactivex.ObservableSource<? extends T> r0 = r0.main
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver$OnComplete r1 = new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver$OnComplete
                r1.<init>(r2)
                r0.subscribe(r1)
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
                io.reactivex.Observer<? super T> r0 = r1.child
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(U r1) {
                r0 = this;
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.serial
                r0.update(r2)
                return
        }
    }

    public ObservableDelaySubscriptionOther(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<U> r2) {
            r0 = this;
            r0.<init>()
            r0.main = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.disposables.SequentialDisposable r0 = new io.reactivex.internal.disposables.SequentialDisposable
            r0.<init>()
            r3.onSubscribe(r0)
            io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver r1 = new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$DelayObserver
            r1.<init>(r2, r0, r3)
            io.reactivex.ObservableSource<U> r3 = r2.other
            r3.subscribe(r1)
            return
    }
}
