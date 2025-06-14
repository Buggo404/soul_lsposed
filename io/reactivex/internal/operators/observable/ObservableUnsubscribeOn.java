package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableUnsubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    static final class UnsubscribeObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1015244841293359600L;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f464s;
        final io.reactivex.Scheduler scheduler;

        final class DisposeTask implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver this$0;

            DisposeTask(io.reactivex.internal.operators.observable.ObservableUnsubscribeOn.UnsubscribeObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver r0 = r1.this$0
                    io.reactivex.disposables.Disposable r0 = r0.f464s
                    r0.dispose()
                    return
            }
        }

        UnsubscribeObserver(io.reactivex.Observer<? super T> r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L12
                io.reactivex.Scheduler r0 = r2.scheduler
                io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$DisposeTask r1 = new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$DisposeTask
                r1.<init>(r2)
                r0.scheduleDirect(r1)
            L12:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            Lb:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 == 0) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            La:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
            Lb:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f464s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f464s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableUnsubscribeOn(io.reactivex.ObservableSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver r1 = new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
