package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSubscribeOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    static final class SubscribeOnObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8094547886072529208L;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f453s;

        SubscribeOnObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.f453s = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f453s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
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
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f453s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }
    }

    final class SubscribeTask implements java.lang.Runnable {
        private final io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver<T> parent;
        final /* synthetic */ io.reactivex.internal.operators.observable.ObservableSubscribeOn this$0;

        SubscribeTask(io.reactivex.internal.operators.observable.ObservableSubscribeOn r1, io.reactivex.internal.operators.observable.ObservableSubscribeOn.SubscribeOnObserver<T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parent = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableSubscribeOn r0 = r2.this$0
                io.reactivex.ObservableSource<T> r0 = r0.source
                io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver<T> r1 = r2.parent
                r0.subscribe(r1)
                return
        }
    }

    public ObservableSubscribeOn(io.reactivex.ObservableSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver r0 = new io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            io.reactivex.Scheduler r3 = r2.scheduler
            io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeTask r1 = new io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeTask
            r1.<init>(r2, r0)
            io.reactivex.disposables.Disposable r3 = r3.scheduleDirect(r1)
            r0.setDisposable(r3)
            return
    }
}
