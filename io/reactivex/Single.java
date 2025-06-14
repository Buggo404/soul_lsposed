package io.reactivex;

/* loaded from: classes.dex */
public abstract class Single<T> implements io.reactivex.SingleSource<T> {
    public Single() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> amb(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleAmb r0 = new io.reactivex.internal.operators.single.SingleAmb
            r1 = 0
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> ambArray(io.reactivex.SingleSource<? extends T>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto Lc
            java.util.concurrent.Callable r2 = io.reactivex.internal.operators.single.SingleInternalHelper.emptyThrower()
            io.reactivex.Single r2 = error(r2)
            return r2
        Lc:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L18
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Single r2 = wrap(r2)
            return r2
        L18:
            io.reactivex.internal.operators.single.SingleAmb r0 = new io.reactivex.internal.operators.single.SingleAmb
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = concat(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = concat(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4, io.reactivex.SingleSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = concat(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r0) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromIterable(r0)
            io.reactivex.Flowable r0 = concat(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends io.reactivex.SingleSource<? extends T>> r1) {
            r0 = 2
            io.reactivex.Flowable r1 = concat(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends io.reactivex.SingleSource<? extends T>> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher
            io.reactivex.functions.Function r1 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            io.reactivex.internal.util.ErrorMode r2 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r3, r1, r4, r2)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends io.reactivex.SingleSource<? extends T>> r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.operators.single.SingleInternalHelper.toObservable()
            r2 = 2
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r4, r1, r2, r3)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArray(io.reactivex.SingleSource<? extends T>... r4) {
            io.reactivex.internal.operators.flowable.FlowableConcatMap r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMap
            io.reactivex.Flowable r4 = io.reactivex.Flowable.fromArray(r4)
            io.reactivex.functions.Function r1 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            r2 = 2
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
            r0.<init>(r4, r1, r2, r3)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayEager(io.reactivex.SingleSource<? extends T>... r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromArray(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(org.reactivestreams.Publisher<? extends io.reactivex.SingleSource<? extends T>> r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> create(io.reactivex.SingleOnSubscribe<T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleCreate r0 = new io.reactivex.internal.operators.single.SingleCreate
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> defer(java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> r1) {
            java.lang.String r0 = "singleSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleDefer r0 = new io.reactivex.internal.operators.single.SingleDefer
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> equals(io.reactivex.SingleSource<? extends T> r1, io.reactivex.SingleSource<? extends T> r2) {
            java.lang.String r0 = "first is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "second is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleEquals r0 = new io.reactivex.internal.operators.single.SingleEquals
            r0.<init>(r1, r2)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> error(java.lang.Throwable r1) {
            java.lang.String r0 = "error is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.justCallable(r1)
            io.reactivex.Single r1 = error(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> error(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            java.lang.String r0 = "errorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleError r0 = new io.reactivex.internal.operators.single.SingleError
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromCallable(java.util.concurrent.Callable<? extends T> r1) {
            java.lang.String r0 = "callable is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleFromCallable r0 = new io.reactivex.internal.operators.single.SingleFromCallable
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromFuture(java.util.concurrent.Future<? extends T> r0) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromFuture(r0)
            io.reactivex.Single r0 = toSingle(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromFuture(java.util.concurrent.Future<? extends T> r0, long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromFuture(r0, r1, r3)
            io.reactivex.Single r0 = toSingle(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromFuture(java.util.concurrent.Future<? extends T> r0, long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromFuture(r0, r1, r3, r4)
            io.reactivex.Single r0 = toSingle(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromFuture(java.util.concurrent.Future<? extends T> r0, io.reactivex.Scheduler r1) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromFuture(r0, r1)
            io.reactivex.Single r0 = toSingle(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromObservable(io.reactivex.ObservableSource<? extends T> r2) {
            java.lang.String r0 = "observableSource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSingleSingle r0 = new io.reactivex.internal.operators.observable.ObservableSingleSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> fromPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            java.lang.String r0 = "publisher is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleFromPublisher r0 = new io.reactivex.internal.operators.single.SingleFromPublisher
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> just(T r1) {
            java.lang.String r0 = "value is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleJust r0 = new io.reactivex.internal.operators.single.SingleJust
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = merge(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = merge(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4, io.reactivex.SingleSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = merge(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r0) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromIterable(r0)
            io.reactivex.Flowable r0 = merge(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends io.reactivex.SingleSource<? extends T>> r7) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher
            io.reactivex.functions.Function r3 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = io.reactivex.Flowable.bufferSize()
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> merge(io.reactivex.SingleSource<? extends io.reactivex.SingleSource<? extends T>> r2) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMap r0 = new io.reactivex.internal.operators.single.SingleFlatMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r0.<init>(r2, r1)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = mergeDelayError(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = mergeDelayError(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.SingleSource<? extends T> r2, io.reactivex.SingleSource<? extends T> r3, io.reactivex.SingleSource<? extends T> r4, io.reactivex.SingleSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromArray(r0)
            io.reactivex.Flowable r2 = mergeDelayError(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r0) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromIterable(r0)
            io.reactivex.Flowable r0 = mergeDelayError(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends io.reactivex.SingleSource<? extends T>> r7) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher
            io.reactivex.functions.Function r3 = io.reactivex.internal.operators.single.SingleInternalHelper.toFlowable()
            r4 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = io.reactivex.Flowable.bufferSize()
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> never() {
            io.reactivex.Single<java.lang.Object> r0 = io.reactivex.internal.operators.single.SingleNever.INSTANCE
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    private io.reactivex.Single<T> timeout0(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, io.reactivex.SingleSource<? extends T> r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.single.SingleTimeout r0 = new io.reactivex.internal.operators.single.SingleTimeout
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Single r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Single<java.lang.Long> timer(long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Single r1 = timer(r1, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Single<java.lang.Long> timer(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.single.SingleTimer r0 = new io.reactivex.internal.operators.single.SingleTimer
            r0.<init>(r1, r3, r4)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    private static <T> io.reactivex.Single<T> toSingle(io.reactivex.Flowable<T> r2) {
            io.reactivex.internal.operators.flowable.FlowableSingleSingle r0 = new io.reactivex.internal.operators.flowable.FlowableSingleSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> unsafeCreate(io.reactivex.SingleSource<T> r1) {
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Single
            if (r0 != 0) goto L13
            io.reactivex.internal.operators.single.SingleFromUnsafeSource r0 = new io.reactivex.internal.operators.single.SingleFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unsafeCreate(Single) should be upgraded"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, U> io.reactivex.Single<T> using(java.util.concurrent.Callable<U> r1, io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> r2, io.reactivex.functions.Consumer<? super U> r3) {
            r0 = 1
            io.reactivex.Single r1 = using(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, U> io.reactivex.Single<T> using(java.util.concurrent.Callable<U> r1, io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> r2, io.reactivex.functions.Consumer<? super U> r3, boolean r4) {
            java.lang.String r0 = "resourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "singleFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.single.SingleUsing r0 = new io.reactivex.internal.operators.single.SingleUsing
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<T> wrap(io.reactivex.SingleSource<T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Single
            if (r0 == 0) goto L10
            io.reactivex.Single r1 = (io.reactivex.Single) r1
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r1
        L10:
            io.reactivex.internal.operators.single.SingleFromUnsafeSource r0 = new io.reactivex.internal.operators.single.SingleFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.SingleSource<? extends T5> r6, io.reactivex.SingleSource<? extends T6> r7, io.reactivex.SingleSource<? extends T7> r8, io.reactivex.SingleSource<? extends T8> r9, io.reactivex.SingleSource<? extends T9> r10, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "source9 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            io.reactivex.functions.Function r11 = io.reactivex.internal.functions.Functions.toFunction(r11)
            r0 = 9
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            r2 = 8
            r0[r2] = r10
            io.reactivex.Single r2 = zipArray(r11, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.SingleSource<? extends T5> r6, io.reactivex.SingleSource<? extends T6> r7, io.reactivex.SingleSource<? extends T7> r8, io.reactivex.SingleSource<? extends T8> r9, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r10 = io.reactivex.internal.functions.Functions.toFunction(r10)
            r0 = 8
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            r2 = 7
            r0[r2] = r9
            io.reactivex.Single r2 = zipArray(r10, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.SingleSource<? extends T5> r6, io.reactivex.SingleSource<? extends T6> r7, io.reactivex.SingleSource<? extends T7> r8, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r9) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            io.reactivex.functions.Function r9 = io.reactivex.internal.functions.Functions.toFunction(r9)
            r0 = 7
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            r2 = 6
            r0[r2] = r8
            io.reactivex.Single r2 = zipArray(r9, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.SingleSource<? extends T5> r6, io.reactivex.SingleSource<? extends T6> r7, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.functions.Function r8 = io.reactivex.internal.functions.Functions.toFunction(r8)
            r0 = 6
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            r2 = 5
            r0[r2] = r7
            io.reactivex.Single r2 = zipArray(r8, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.SingleSource<? extends T5> r6, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r7) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.functions.Function r7 = io.reactivex.internal.functions.Functions.toFunction(r7)
            r0 = 5
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            io.reactivex.Single r2 = zipArray(r7, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.SingleSource<? extends T4> r5, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            r0 = 4
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Single r2 = zipArray(r6, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.SingleSource<? extends T3> r4, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            r0 = 3
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Single r2 = zipArray(r5, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Single<R> zip(io.reactivex.SingleSource<? extends T1> r2, io.reactivex.SingleSource<? extends T2> r3, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.toFunction(r4)
            r0 = 2
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Single r2 = zipArray(r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Single<R> zip(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.single.SingleZipIterable r0 = new io.reactivex.internal.operators.single.SingleZipIterable
            r0.<init>(r1, r2)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Single<R> zipArray(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1, io.reactivex.SingleSource<? extends T>... r2) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto L17
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            io.reactivex.Single r1 = error(r1)
            return r1
        L17:
            io.reactivex.internal.operators.single.SingleZipArray r0 = new io.reactivex.internal.operators.single.SingleZipArray
            r0.<init>(r2, r1)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> ambWith(io.reactivex.SingleSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.SingleSource[] r0 = new io.reactivex.SingleSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Single r3 = ambArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m49as(io.reactivex.SingleConverter<T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.SingleConverter r2 = (io.reactivex.SingleConverter) r2
            java.lang.Object r2 = r2.apply(r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingGet() {
            r1 = this;
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> cache() {
            r1 = this;
            io.reactivex.internal.operators.single.SingleCache r0 = new io.reactivex.internal.operators.single.SingleCache
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<U> cast(java.lang.Class<? extends U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.castFunction(r2)
            io.reactivex.Single r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> compose(io.reactivex.SingleTransformer<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "transformer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.SingleTransformer r2 = (io.reactivex.SingleTransformer) r2
            io.reactivex.SingleSource r2 = r2.apply(r1)
            io.reactivex.Single r2 = wrap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            io.reactivex.Flowable r1 = concat(r0, r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> contains(java.lang.Object r2) {
            r1 = this;
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            io.reactivex.Single r2 = r1.contains(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> contains(java.lang.Object r2, io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r3) {
            r1 = this;
            java.lang.String r0 = "value is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "comparer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.single.SingleContains r0 = new io.reactivex.internal.operators.single.SingleContains
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delay(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Single r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delay(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Single r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delay(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.single.SingleDelay r0 = new io.reactivex.internal.operators.single.SingleDelay
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Single r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delay(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Single r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delaySubscription(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Single r2 = r1.delaySubscription(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delaySubscription(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = io.reactivex.Observable.timer(r1, r3, r4)
            io.reactivex.Single r1 = r0.delaySubscription(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> delaySubscription(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDelayWithCompletable r0 = new io.reactivex.internal.operators.single.SingleDelayWithCompletable
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<T> delaySubscription(io.reactivex.ObservableSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDelayWithObservable r0 = new io.reactivex.internal.operators.single.SingleDelayWithObservable
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<T> delaySubscription(io.reactivex.SingleSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDelayWithSingle r0 = new io.reactivex.internal.operators.single.SingleDelayWithSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<T> delaySubscription(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDelayWithPublisher r0 = new io.reactivex.internal.operators.single.SingleDelayWithPublisher
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doAfterSuccess(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "doAfterSuccess is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoAfterSuccess r0 = new io.reactivex.internal.operators.single.SingleDoAfterSuccess
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doAfterTerminate(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onAfterTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoAfterTerminate r0 = new io.reactivex.internal.operators.single.SingleDoAfterTerminate
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doFinally(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoFinally r0 = new io.reactivex.internal.operators.single.SingleDoFinally
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doOnDispose(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onDispose is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoOnDispose r0 = new io.reactivex.internal.operators.single.SingleDoOnDispose
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doOnError(io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoOnError r0 = new io.reactivex.internal.operators.single.SingleDoOnError
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doOnEvent(io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "onEvent is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoOnEvent r0 = new io.reactivex.internal.operators.single.SingleDoOnEvent
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doOnSubscribe(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2) {
            r1 = this;
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoOnSubscribe r0 = new io.reactivex.internal.operators.single.SingleDoOnSubscribe
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> doOnSuccess(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onSuccess is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDoOnSuccess r0 = new io.reactivex.internal.operators.single.SingleDoOnSuccess
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> filter(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFilterSingle r0 = new io.reactivex.internal.operators.maybe.MaybeFilterSingle
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMap r0 = new io.reactivex.internal.operators.single.SingleFlatMap
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMapCompletable r0 = new io.reactivex.internal.operators.single.SingleFlatMapCompletable
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> flatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMapMaybe r0 = new io.reactivex.internal.operators.single.SingleFlatMapMaybe
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapObservable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.mixed.SingleFlatMapObservable r0 = new io.reactivex.internal.operators.mixed.SingleFlatMapObservable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMapPublisher(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMapPublisher r0 = new io.reactivex.internal.operators.single.SingleFlatMapPublisher
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> flattenAsFlowable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable r0 = new io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> flattenAsObservable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleFlatMapIterableObservable r0 = new io.reactivex.internal.operators.single.SingleFlatMapIterableObservable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> hide() {
            r1 = this;
            io.reactivex.internal.operators.single.SingleHide r0 = new io.reactivex.internal.operators.single.SingleHide
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable ignoreElement() {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableFromSingle r0 = new io.reactivex.internal.operators.completable.CompletableFromSingle
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> lift(io.reactivex.SingleOperator<? extends R, ? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onLift is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleLift r0 = new io.reactivex.internal.operators.single.SingleLift
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleMap r0 = new io.reactivex.internal.operators.single.SingleMap
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            io.reactivex.Flowable r1 = merge(r0, r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> observeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleObserveOn r0 = new io.reactivex.internal.operators.single.SingleObserveOn
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> onErrorResumeNext(io.reactivex.Single<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "resumeSingleInCaseOfError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Single r2 = r1.onErrorResumeNext(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> onErrorResumeNext(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> r2) {
            r1 = this;
            java.lang.String r0 = "resumeFunctionInCaseOfError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleResumeNext r0 = new io.reactivex.internal.operators.single.SingleResumeNext
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> onErrorReturn(io.reactivex.functions.Function<java.lang.Throwable, ? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "resumeFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.single.SingleOnErrorReturn r0 = new io.reactivex.internal.operators.single.SingleOnErrorReturn
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Single r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> onErrorReturnItem(T r3) {
            r2 = this;
            java.lang.String r0 = "value is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.single.SingleOnErrorReturn r0 = new io.reactivex.internal.operators.single.SingleOnErrorReturn
            r1 = 0
            r0.<init>(r2, r1, r3)
            io.reactivex.Single r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> onTerminateDetach() {
            r1 = this;
            io.reactivex.internal.operators.single.SingleDetach r0 = new io.reactivex.internal.operators.single.SingleDetach
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeat() {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r0 = r0.repeat()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeat(long r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeat(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeatUntil(io.reactivex.functions.BooleanSupplier r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeatUntil(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeatWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeatWhen(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retry() {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r0 = r0.retry()
            io.reactivex.Single r0 = toSingle(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retry(long r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Single r2 = toSingle(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retry(long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2, r4)
            io.reactivex.Single r2 = toSingle(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retry(io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Single r2 = toSingle(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retry(io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Single r2 = toSingle(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> retryWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retryWhen(r2)
            io.reactivex.Single r2 = toSingle(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final io.reactivex.disposables.Disposable subscribe() {
            r2 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "onCallback is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.observers.BiConsumerSingleObserver r0 = new io.reactivex.internal.observers.BiConsumerSingleObserver
            r0.<init>(r2)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.disposables.Disposable r2 = r1.subscribe(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            java.lang.String r0 = "onSuccess is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.observers.ConsumerSingleObserver r0 = new io.reactivex.internal.observers.ConsumerSingleObserver
            r0.<init>(r2, r3)
            r1.subscribe(r0)
            return r0
    }

    @Override // io.reactivex.SingleSource
    @io.reactivex.annotations.SchedulerSupport("none")
    public final void subscribe(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "subscriber is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.SingleObserver r3 = io.reactivex.plugins.RxJavaPlugins.onSubscribe(r2, r3)
            java.lang.String r0 = "subscriber returned by the RxJavaPlugins hook is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r2.subscribeActual(r3)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L21
            return
        L12:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "subscribeActual failed"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L21:
            r3 = move-exception
            throw r3
    }

    protected abstract void subscribeActual(io.reactivex.SingleObserver<? super T> r1);

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> subscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleSubscribeOn r0 = new io.reactivex.internal.operators.single.SingleSubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <E extends io.reactivex.SingleObserver<? super T>> E subscribeWith(E r1) {
            r0 = this;
            r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> takeUntil(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableToFlowable r0 = new io.reactivex.internal.operators.completable.CompletableToFlowable
            r0.<init>(r2)
            io.reactivex.Single r2 = r1.takeUntil(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <E> io.reactivex.Single<T> takeUntil(io.reactivex.SingleSource<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleToFlowable r0 = new io.reactivex.internal.operators.single.SingleToFlowable
            r0.<init>(r2)
            io.reactivex.Single r2 = r1.takeUntil(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <E> io.reactivex.Single<T> takeUntil(org.reactivestreams.Publisher<E> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleTakeUntil r0 = new io.reactivex.internal.operators.single.SingleTakeUntil
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observers.TestObserver<T> test() {
            r1 = this;
            io.reactivex.observers.TestObserver r0 = new io.reactivex.observers.TestObserver
            r0.<init>()
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observers.TestObserver<T> test(boolean r2) {
            r1 = this;
            io.reactivex.observers.TestObserver r0 = new io.reactivex.observers.TestObserver
            r0.<init>()
            if (r2 == 0) goto La
            r0.cancel()
        La:
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> timeout(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Single r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Single r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> timeout(long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.SingleSource<? extends T> r6) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.Single r2 = r1.timeout0(r2, r4, r5, r6)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> timeout(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.SingleSource<? extends T> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r11
            io.reactivex.Single r8 = r1.timeout0(r2, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <R> R m50to(io.reactivex.functions.Function<? super io.reactivex.Single<T>, R> r2) {
            r1 = this;
            java.lang.String r0 = "convert is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> Ld
            io.reactivex.functions.Function r2 = (io.reactivex.functions.Function) r2     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r2.apply(r1)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r2)
            throw r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    @java.lang.Deprecated
    public final io.reactivex.Completable toCompletable() {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableFromSingle r0 = new io.reactivex.internal.operators.completable.CompletableFromSingle
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> toFlowable() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToFlowable
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToFlowable r0 = (io.reactivex.internal.fuseable.FuseToFlowable) r0
            io.reactivex.Flowable r0 = r0.fuseToFlowable()
            return r0
        Lc:
            io.reactivex.internal.operators.single.SingleToFlowable r0 = new io.reactivex.internal.operators.single.SingleToFlowable
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.util.concurrent.Future<T> toFuture() {
            r1 = this;
            io.reactivex.internal.observers.FutureSingleObserver r0 = new io.reactivex.internal.observers.FutureSingleObserver
            r0.<init>()
            io.reactivex.SingleObserver r0 = r1.subscribeWith(r0)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> toMaybe() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToMaybe
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToMaybe r0 = (io.reactivex.internal.fuseable.FuseToMaybe) r0
            io.reactivex.Maybe r0 = r0.fuseToMaybe()
            return r0
        Lc:
            io.reactivex.internal.operators.maybe.MaybeFromSingle r0 = new io.reactivex.internal.operators.maybe.MaybeFromSingle
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> toObservable() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToObservable
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToObservable r0 = (io.reactivex.internal.fuseable.FuseToObservable) r0
            io.reactivex.Observable r0 = r0.fuseToObservable()
            return r0
        Lc:
            io.reactivex.internal.operators.single.SingleToObservable r0 = new io.reactivex.internal.operators.single.SingleToObservable
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> unsubscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleUnsubscribeOn r0 = new io.reactivex.internal.operators.single.SingleUnsubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Single<R> zipWith(io.reactivex.SingleSource<U> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2) {
            r0 = this;
            io.reactivex.Single r1 = zip(r0, r1, r2)
            return r1
    }
}
