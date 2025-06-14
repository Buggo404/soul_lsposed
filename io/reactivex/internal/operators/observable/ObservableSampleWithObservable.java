package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final io.reactivex.ObservableSource<?> other;

    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleMainEmitLast(io.reactivex.Observer<? super T> r1, io.reactivex.ObservableSource<?> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>()
                r0.wip = r1
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completeMain() {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L13
                r1.emit()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L13:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completeOther() {
                r1 = this;
                r0 = 1
                r1.done = r0
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L13
                r1.emit()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L13:
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L1d
            L8:
                boolean r0 = r1.done
                r1.emit()
                if (r0 == 0) goto L15
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
            L15:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L8
            L1d:
                return
        }
    }

    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(io.reactivex.Observer<? super T> r1, io.reactivex.ObservableSource<?> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completeMain() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void completeOther() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        void run() {
                r0 = this;
                r0.emit()
                return
        }
    }

    static abstract class SampleMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Observer<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f437s;
        final io.reactivex.ObservableSource<?> sampler;

        SampleMainObserver(io.reactivex.Observer<? super T> r2, io.reactivex.ObservableSource<?> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.sampler = r3
                return
        }

        public void complete() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f437s
                r0.dispose()
                r1.completeOther()
                return
        }

        abstract void completeMain();

        abstract void completeOther();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.disposables.Disposable r0 = r1.f437s
                r0.dispose()
                return
        }

        void emit() {
                r2 = this;
                r0 = 0
                java.lang.Object r0 = r2.getAndSet(r0)
                if (r0 == 0) goto Lc
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            Lc:
                return
        }

        public void error(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f437s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.other
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                r1.completeMain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f437s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L21
                r1.f437s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.other
                java.lang.Object r2 = r2.get()
                if (r2 != 0) goto L21
                io.reactivex.ObservableSource<?> r2 = r1.sampler
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SamplerObserver r0 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SamplerObserver
                r0.<init>(r1)
                r2.subscribe(r0)
            L21:
                return
        }

        abstract void run();

        boolean setOther(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return r2
        }
    }

    static final class SamplerObserver<T> implements io.reactivex.Observer<java.lang.Object> {
        final io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> parent;

        SamplerObserver(io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.complete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.error(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r1 = r0.parent
                r1.run()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainObserver<T> r0 = r1.parent
                r0.setOther(r2)
                return
        }
    }

    public ObservableSampleWithObservable(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<?> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            r0.emitLast = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r4)
            boolean r4 = r3.emitLast
            if (r4 == 0) goto L16
            io.reactivex.ObservableSource<T> r4 = r3.source
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainEmitLast r1 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainEmitLast
            io.reactivex.ObservableSource<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
            goto L22
        L16:
            io.reactivex.ObservableSource<T> r4 = r3.source
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainNoLast r1 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable$SampleMainNoLast
            io.reactivex.ObservableSource<?> r2 = r3.other
            r1.<init>(r0, r2)
            r4.subscribe(r1)
        L22:
            return
    }
}
