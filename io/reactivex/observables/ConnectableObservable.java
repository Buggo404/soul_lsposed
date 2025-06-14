package io.reactivex.observables;

/* loaded from: classes.dex */
public abstract class ConnectableObservable<T> extends io.reactivex.Observable<T> {
    public ConnectableObservable() {
            r0 = this;
            r0.<init>()
            return
    }

    public io.reactivex.Observable<T> autoConnect() {
            r1 = this;
            r0 = 1
            io.reactivex.Observable r0 = r1.autoConnect(r0)
            return r0
    }

    public io.reactivex.Observable<T> autoConnect(int r2) {
            r1 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r2 = r1.autoConnect(r2, r0)
            return r2
    }

    public io.reactivex.Observable<T> autoConnect(int r2, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r3) {
            r1 = this;
            if (r2 > 0) goto La
            r1.connect(r3)
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r2
        La:
            io.reactivex.internal.operators.observable.ObservableAutoConnect r0 = new io.reactivex.internal.operators.observable.ObservableAutoConnect
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public final io.reactivex.disposables.Disposable connect() {
            r1 = this;
            io.reactivex.internal.util.ConnectConsumer r0 = new io.reactivex.internal.util.ConnectConsumer
            r0.<init>()
            r1.connect(r0)
            io.reactivex.disposables.Disposable r0 = r0.disposable
            return r0
    }

    public abstract void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r1);

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public io.reactivex.Observable<T> refCount() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableRefCount r0 = new io.reactivex.internal.operators.observable.ObservableRefCount
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> refCount(int r7) {
            r6 = this;
            r2 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.trampoline()
            r0 = r6
            r1 = r7
            io.reactivex.Observable r7 = r0.refCount(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> refCount(int r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.Observable r7 = r0.refCount(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> refCount(int r9, long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13) {
            r8 = this;
            java.lang.String r0 = "subscriberCount"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.observable.ObservableRefCount r0 = new io.reactivex.internal.operators.observable.ObservableRefCount
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> refCount(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            r1 = 1
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r2 = r7
            r4 = r9
            io.reactivex.Observable r7 = r0.refCount(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> refCount(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r1 = 1
            r0 = r6
            r2 = r7
            r4 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.refCount(r1, r2, r4, r5)
            return r7
    }
}
