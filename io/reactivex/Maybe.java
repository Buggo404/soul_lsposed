package io.reactivex;

/* loaded from: classes.dex */
public abstract class Maybe<T> implements io.reactivex.MaybeSource<T> {
    public Maybe() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> amb(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeAmb r0 = new io.reactivex.internal.operators.maybe.MaybeAmb
            r1 = 0
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> ambArray(io.reactivex.MaybeSource<? extends T>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto L8
            io.reactivex.Maybe r2 = empty()
            return r2
        L8:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Maybe r2 = wrap(r2)
            return r2
        L14:
            io.reactivex.internal.operators.maybe.MaybeAmb r0 = new io.reactivex.internal.operators.maybe.MaybeAmb
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4, io.reactivex.MaybeSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeConcatIterable r0 = new io.reactivex.internal.operators.maybe.MaybeConcatIterable
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            r0 = 2
            io.reactivex.Flowable r1 = concat(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapPublisher
            io.reactivex.functions.Function r1 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.internal.util.ErrorMode r2 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r3, r1, r4, r2)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArray(io.reactivex.MaybeSource<? extends T>... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r2 = io.reactivex.Flowable.empty()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L1e
            io.reactivex.internal.operators.maybe.MaybeToFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeToFlowable
            r1 = 0
            r2 = r2[r1]
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        L1e:
            io.reactivex.internal.operators.maybe.MaybeConcatArray r0 = new io.reactivex.internal.operators.maybe.MaybeConcatArray
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayDelayError(io.reactivex.MaybeSource<? extends T>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto L8
            io.reactivex.Flowable r2 = io.reactivex.Flowable.empty()
            return r2
        L8:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            io.reactivex.internal.operators.maybe.MaybeToFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeToFlowable
            r1 = 0
            r2 = r2[r1]
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        L19:
            io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError r0 = new io.reactivex.internal.operators.maybe.MaybeConcatArrayDelayError
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayEager(io.reactivex.MaybeSource<? extends T>... r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromArray(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatDelayError(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.Flowable r1 = r1.concatMapDelayError(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatDelayError(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.Flowable r1 = r1.concatMapDelayError(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            io.reactivex.Flowable r1 = io.reactivex.Flowable.fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            io.reactivex.Flowable r1 = r1.concatMapEager(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> create(io.reactivex.MaybeOnSubscribe<T> r1) {
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeCreate r0 = new io.reactivex.internal.operators.maybe.MaybeCreate
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> defer(java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            java.lang.String r0 = "maybeSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeDefer r0 = new io.reactivex.internal.operators.maybe.MaybeDefer
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> empty() {
            io.reactivex.internal.operators.maybe.MaybeEmpty r0 = io.reactivex.internal.operators.maybe.MaybeEmpty.INSTANCE
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> error(java.lang.Throwable r1) {
            java.lang.String r0 = "exception is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeError r0 = new io.reactivex.internal.operators.maybe.MaybeError
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> error(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            java.lang.String r0 = "errorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeErrorCallable r0 = new io.reactivex.internal.operators.maybe.MaybeErrorCallable
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromAction(io.reactivex.functions.Action r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeFromAction r0 = new io.reactivex.internal.operators.maybe.MaybeFromAction
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromCallable(java.util.concurrent.Callable<? extends T> r1) {
            java.lang.String r0 = "callable is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeFromCallable r0 = new io.reactivex.internal.operators.maybe.MaybeFromCallable
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromCompletable(io.reactivex.CompletableSource r1) {
            java.lang.String r0 = "completableSource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeFromCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeFromCompletable
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromFuture(java.util.concurrent.Future<? extends T> r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.maybe.MaybeFromFuture r0 = new io.reactivex.internal.operators.maybe.MaybeFromFuture
            r1 = 0
            r3 = 0
            r0.<init>(r4, r1, r3)
            io.reactivex.Maybe r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.maybe.MaybeFromFuture r0 = new io.reactivex.internal.operators.maybe.MaybeFromFuture
            r0.<init>(r1, r2, r4)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromRunnable(java.lang.Runnable r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeFromRunnable r0 = new io.reactivex.internal.operators.maybe.MaybeFromRunnable
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> fromSingle(io.reactivex.SingleSource<T> r1) {
            java.lang.String r0 = "singleSource is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeFromSingle r0 = new io.reactivex.internal.operators.maybe.MaybeFromSingle
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> just(T r1) {
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeJust r0 = new io.reactivex.internal.operators.maybe.MaybeJust
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = mergeArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = mergeArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4, io.reactivex.MaybeSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = mergeArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r0) {
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromIterable(r0)
            io.reactivex.Flowable r0 = merge(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Flowable r1 = merge(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r7, int r8) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher
            io.reactivex.functions.Function r3 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            r4 = 0
            r6 = 1
            r1 = r0
            r2 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> merge(io.reactivex.MaybeSource<? extends io.reactivex.MaybeSource<? extends T>> r2) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatten r0 = new io.reactivex.internal.operators.maybe.MaybeFlatten
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r0.<init>(r2, r1)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArray(io.reactivex.MaybeSource<? extends T>... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r2 = io.reactivex.Flowable.empty()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L1e
            io.reactivex.internal.operators.maybe.MaybeToFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeToFlowable
            r1 = 0
            r2 = r2[r1]
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        L1e:
            io.reactivex.internal.operators.maybe.MaybeMergeArray r0 = new io.reactivex.internal.operators.maybe.MaybeMergeArray
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArrayDelayError(io.reactivex.MaybeSource<? extends T>... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L8
            io.reactivex.Flowable r3 = io.reactivex.Flowable.empty()
            return r3
        L8:
            io.reactivex.Flowable r0 = io.reactivex.Flowable.fromArray(r3)
            io.reactivex.functions.Function r1 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            r2 = 1
            int r3 = r3.length
            io.reactivex.Flowable r3 = r0.flatMap(r1, r2, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = mergeArrayDelayError(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = mergeArrayDelayError(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3, io.reactivex.MaybeSource<? extends T> r4, io.reactivex.MaybeSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = mergeArrayDelayError(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r2) {
            io.reactivex.Flowable r2 = io.reactivex.Flowable.fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            r1 = 1
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Flowable r1 = mergeDelayError(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends io.reactivex.MaybeSource<? extends T>> r7, int r8) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapPublisher
            io.reactivex.functions.Function r3 = io.reactivex.internal.operators.maybe.MaybeToPublisher.instance()
            r4 = 1
            r6 = 1
            r1 = r0
            r2 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> never() {
            io.reactivex.internal.operators.maybe.MaybeNever r0 = io.reactivex.internal.operators.maybe.MaybeNever.INSTANCE
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.MaybeSource<? extends T> r1, io.reactivex.MaybeSource<? extends T> r2) {
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            io.reactivex.Single r1 = sequenceEqual(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.MaybeSource<? extends T> r1, io.reactivex.MaybeSource<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "isEqual is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeEqualSingle r0 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Maybe<java.lang.Long> timer(long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Maybe r1 = timer(r1, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Maybe<java.lang.Long> timer(long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.internal.operators.maybe.MaybeTimer r0 = new io.reactivex.internal.operators.maybe.MaybeTimer
            r1 = 0
            long r3 = java.lang.Math.max(r1, r3)
            r0.<init>(r3, r5, r6)
            io.reactivex.Maybe r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> unsafeCreate(io.reactivex.MaybeSource<T> r1) {
            boolean r0 = r1 instanceof io.reactivex.Maybe
            if (r0 != 0) goto L13
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeUnsafeCreate r0 = new io.reactivex.internal.operators.maybe.MaybeUnsafeCreate
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unsafeCreate(Maybe) should be upgraded"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Maybe<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3) {
            r0 = 1
            io.reactivex.Maybe r1 = using(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Maybe<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
            java.lang.String r0 = "resourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "sourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeUsing r0 = new io.reactivex.internal.operators.maybe.MaybeUsing
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Maybe<T> wrap(io.reactivex.MaybeSource<T> r1) {
            boolean r0 = r1 instanceof io.reactivex.Maybe
            if (r0 == 0) goto Lb
            io.reactivex.Maybe r1 = (io.reactivex.Maybe) r1
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r1
        Lb:
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeUnsafeCreate r0 = new io.reactivex.internal.operators.maybe.MaybeUnsafeCreate
            r0.<init>(r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.MaybeSource<? extends T5> r6, io.reactivex.MaybeSource<? extends T6> r7, io.reactivex.MaybeSource<? extends T7> r8, io.reactivex.MaybeSource<? extends T8> r9, io.reactivex.MaybeSource<? extends T9> r10, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
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
            io.reactivex.Maybe r2 = zipArray(r11, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.MaybeSource<? extends T5> r6, io.reactivex.MaybeSource<? extends T6> r7, io.reactivex.MaybeSource<? extends T7> r8, io.reactivex.MaybeSource<? extends T8> r9, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
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
            io.reactivex.Maybe r2 = zipArray(r10, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.MaybeSource<? extends T5> r6, io.reactivex.MaybeSource<? extends T6> r7, io.reactivex.MaybeSource<? extends T7> r8, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r9) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
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
            io.reactivex.Maybe r2 = zipArray(r9, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.MaybeSource<? extends T5> r6, io.reactivex.MaybeSource<? extends T6> r7, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
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
            io.reactivex.Maybe r2 = zipArray(r8, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.MaybeSource<? extends T5> r6, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r7) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
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
            io.reactivex.Maybe r2 = zipArray(r7, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.MaybeSource<? extends T4> r5, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r6) {
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
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Maybe r2 = zipArray(r6, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.MaybeSource<? extends T3> r4, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            r0 = 3
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Maybe r2 = zipArray(r5, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Maybe<R> zip(io.reactivex.MaybeSource<? extends T1> r2, io.reactivex.MaybeSource<? extends T2> r3, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.toFunction(r4)
            r0 = 2
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Maybe r2 = zipArray(r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Maybe<R> zip(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeZipIterable r0 = new io.reactivex.internal.operators.maybe.MaybeZipIterable
            r0.<init>(r1, r2)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Maybe<R> zipArray(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1, io.reactivex.MaybeSource<? extends T>... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Maybe r1 = empty()
            return r1
        Ld:
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeZipArray r0 = new io.reactivex.internal.operators.maybe.MaybeZipArray
            r0.<init>(r2, r1)
            io.reactivex.Maybe r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> ambWith(io.reactivex.MaybeSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.MaybeSource[] r0 = new io.reactivex.MaybeSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Maybe r3 = ambArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m45as(io.reactivex.MaybeConverter<T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.MaybeConverter r2 = (io.reactivex.MaybeConverter) r2
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
    public final T blockingGet(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultValue is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r2 = r0.blockingGet(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> cache() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeCache r0 = new io.reactivex.internal.operators.maybe.MaybeCache
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<U> cast(java.lang.Class<? extends U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.castFunction(r2)
            io.reactivex.Maybe r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> compose(io.reactivex.MaybeTransformer<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "transformer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.MaybeTransformer r2 = (io.reactivex.MaybeTransformer) r2
            io.reactivex.MaybeSource r2 = r2.apply(r1)
            io.reactivex.Maybe r2 = wrap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> concatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatten r0 = new io.reactivex.internal.operators.maybe.MaybeFlatten
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = concat(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> contains(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeContains r0 = new io.reactivex.internal.operators.maybe.MaybeContains
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Long> count() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeCount r0 = new io.reactivex.internal.operators.maybe.MaybeCount
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> defaultIfEmpty(T r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Maybe r2 = just(r2)
            io.reactivex.Maybe r2 = r1.switchIfEmpty(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> delay(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Maybe r2 = r1.delay(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> delay(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.maybe.MaybeDelay r0 = new io.reactivex.internal.operators.maybe.MaybeDelay
            r1 = 0
            long r3 = java.lang.Math.max(r1, r8)
            r1 = r0
            r2 = r7
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Maybe r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Maybe<T> delay(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "delayIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeDelayOtherPublisher
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> delaySubscription(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Maybe r2 = r1.delaySubscription(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> delaySubscription(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = io.reactivex.Flowable.timer(r1, r3, r4)
            io.reactivex.Maybe r1 = r0.delaySubscription(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> delaySubscription(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "subscriptionIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doAfterSuccess(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "doAfterSuccess is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess r0 = new io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doAfterTerminate(io.reactivex.functions.Action r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            java.lang.String r0 = "onAfterTerminate is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r6 = r10
            io.reactivex.functions.Action r6 = (io.reactivex.functions.Action) r6
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doFinally(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDoFinally r0 = new io.reactivex.internal.operators.maybe.MaybeDoFinally
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnComplete(io.reactivex.functions.Action r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            java.lang.String r0 = "onComplete is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r5 = r10
            io.reactivex.functions.Action r5 = (io.reactivex.functions.Action) r5
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnDispose(io.reactivex.functions.Action r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            java.lang.String r0 = "onDispose is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r7 = r10
            io.reactivex.functions.Action r7 = (io.reactivex.functions.Action) r7
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnError(io.reactivex.functions.Consumer<? super java.lang.Throwable> r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            java.lang.String r0 = "onError is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r4 = r10
            io.reactivex.functions.Consumer r4 = (io.reactivex.functions.Consumer) r4
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnEvent(io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "onEvent is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDoOnEvent r0 = new io.reactivex.internal.operators.maybe.MaybeDoOnEvent
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnSubscribe(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            java.lang.String r0 = "onSubscribe is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r2 = r10
            io.reactivex.functions.Consumer r2 = (io.reactivex.functions.Consumer) r2
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> doOnSuccess(io.reactivex.functions.Consumer<? super T> r10) {
            r9 = this;
            io.reactivex.internal.operators.maybe.MaybePeek r8 = new io.reactivex.internal.operators.maybe.MaybePeek
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            java.lang.String r0 = "onSubscribe is null"
            java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r3 = r10
            io.reactivex.functions.Consumer r3 = (io.reactivex.functions.Consumer) r3
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            io.reactivex.Maybe r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> filter(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFilter r0 = new io.reactivex.internal.operators.maybe.MaybeFilter
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatten r0 = new io.reactivex.internal.operators.maybe.MaybeFlatten
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Maybe<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector
            r0.<init>(r1, r2, r3)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> r4) {
            r1 = this;
            java.lang.String r0 = "onSuccessMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onErrorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCompleteSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapNotification r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapObservable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.mixed.MaybeFlatMapObservable r0 = new io.reactivex.internal.operators.mixed.MaybeFlatMapObservable
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
            io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher r0 = new io.reactivex.internal.operators.mixed.MaybeFlatMapPublisher
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> flatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapSingle r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> flatMapSingleElement(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> flattenAsFlowable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable
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
            io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable r0 = new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableObservable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> hide() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeHide r0 = new io.reactivex.internal.operators.maybe.MaybeHide
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable ignoreElement() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> isEmpty() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeIsEmptySingle r0 = new io.reactivex.internal.operators.maybe.MaybeIsEmptySingle
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> lift(io.reactivex.MaybeOperator<? extends R, ? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onLift is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeLift r0 = new io.reactivex.internal.operators.maybe.MaybeLift
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Maybe<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeMap r0 = new io.reactivex.internal.operators.maybe.MaybeMap
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = merge(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> observeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeObserveOn r0 = new io.reactivex.internal.operators.maybe.MaybeObserveOn
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<U> ofType(java.lang.Class<U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.isInstanceOf(r2)
            io.reactivex.Maybe r0 = r1.filter(r0)
            io.reactivex.Maybe r2 = r0.cast(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorComplete() {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Maybe r0 = r1.onErrorComplete(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorComplete(io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeOnErrorComplete r0 = new io.reactivex.internal.operators.maybe.MaybeOnErrorComplete
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorResumeNext(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Maybe r2 = r1.onErrorResumeNext(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorResumeNext(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> r3) {
            r2 = this;
            java.lang.String r0 = "resumeFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeOnErrorNext r0 = new io.reactivex.internal.operators.maybe.MaybeOnErrorNext
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Maybe r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorReturn(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "valueSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeOnErrorReturn r0 = new io.reactivex.internal.operators.maybe.MaybeOnErrorReturn
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onErrorReturnItem(T r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Maybe r2 = r1.onErrorReturn(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onExceptionResumeNext(io.reactivex.MaybeSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeOnErrorNext r0 = new io.reactivex.internal.operators.maybe.MaybeOnErrorNext
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.justFunction(r3)
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Maybe r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> onTerminateDetach() {
            r1 = this;
            io.reactivex.internal.operators.maybe.MaybeDetach r0 = new io.reactivex.internal.operators.maybe.MaybeDetach
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeat() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.Flowable r0 = r2.repeat(r0)
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
    public final io.reactivex.Maybe<T> retry() {
            r3 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r2 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Maybe r0 = r3.retry(r0, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retry(long r2) {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Maybe r2 = r1.retry(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retry(long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2, r4)
            io.reactivex.Maybe r2 = r2.singleElement()
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retry(io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Maybe r2 = r2.singleElement()
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retry(io.reactivex.functions.Predicate<? super java.lang.Throwable> r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.Maybe r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retryUntil(io.reactivex.functions.BooleanSupplier r3) {
            r2 = this;
            java.lang.String r0 = "stop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r3 = io.reactivex.internal.functions.Functions.predicateReverseFor(r3)
            io.reactivex.Maybe r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> retryWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retryWhen(r2)
            io.reactivex.Maybe r2 = r2.singleElement()
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final io.reactivex.disposables.Disposable subscribe() {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r0 = r3.subscribe(r0, r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r3) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r3 = r2.subscribe(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r2 = r1.subscribe(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4) {
            r1 = this;
            java.lang.String r0 = "onSuccess is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.maybe.MaybeCallbackObserver r0 = new io.reactivex.internal.operators.maybe.MaybeCallbackObserver
            r0.<init>(r2, r3, r4)
            io.reactivex.MaybeObserver r2 = r1.subscribeWith(r0)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            return r2
    }

    @Override // io.reactivex.MaybeSource
    @io.reactivex.annotations.SchedulerSupport("none")
    public final void subscribe(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "observer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.MaybeObserver r3 = io.reactivex.plugins.RxJavaPlugins.onSubscribe(r2, r3)
            java.lang.String r0 = "observer returned by the RxJavaPlugins hook is null"
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

    protected abstract void subscribeActual(io.reactivex.MaybeObserver<? super T> r1);

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> subscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeSubscribeOn r0 = new io.reactivex.internal.operators.maybe.MaybeSubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <E extends io.reactivex.MaybeObserver<? super T>> E subscribeWith(E r1) {
            r0 = this;
            r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> switchIfEmpty(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty r0 = new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> switchIfEmpty(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle r0 = new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> takeUntil(io.reactivex.MaybeSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe r0 = new io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> takeUntil(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    public final io.reactivex.Maybe<T> timeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Maybe r2 = r1.timeout(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> timeout(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.MaybeSource<? extends T> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r11
            io.reactivex.Maybe r8 = r1.timeout(r2, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> timeout(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Maybe r1 = timer(r1, r3, r4)
            io.reactivex.Maybe r1 = r0.timeout(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> timeout(long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.MaybeSource<? extends T> r6) {
            r1 = this;
            java.lang.String r0 = "fallback is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.Maybe r2 = timer(r2, r4, r5)
            io.reactivex.Maybe r2 = r1.timeout(r2, r6)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> timeout(io.reactivex.MaybeSource<U> r3) {
            r2 = this;
            java.lang.String r0 = "timeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Maybe r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> timeout(io.reactivex.MaybeSource<U> r2, io.reactivex.MaybeSource<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "timeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "fallback is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe
            r0.<init>(r1, r2, r3)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> timeout(org.reactivestreams.Publisher<U> r3) {
            r2 = this;
            java.lang.String r0 = "timeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Maybe r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Maybe<T> timeout(org.reactivestreams.Publisher<U> r2, io.reactivex.MaybeSource<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "timeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "fallback is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher r0 = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher
            r0.<init>(r1, r2, r3)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <R> R m46to(io.reactivex.functions.Function<? super io.reactivex.Maybe<T>, R> r2) {
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
            io.reactivex.internal.operators.maybe.MaybeToFlowable r0 = new io.reactivex.internal.operators.maybe.MaybeToFlowable
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
            io.reactivex.internal.operators.maybe.MaybeToObservable r0 = new io.reactivex.internal.operators.maybe.MaybeToObservable
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> toSingle() {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeToSingle r0 = new io.reactivex.internal.operators.maybe.MaybeToSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> toSingle(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultValue is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeToSingle r0 = new io.reactivex.internal.operators.maybe.MaybeToSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> unsubscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn r0 = new io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Maybe<R> zipWith(io.reactivex.MaybeSource<? extends U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Maybe r2 = zip(r1, r2, r3)
            return r2
    }
}
