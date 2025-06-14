package io.reactivex;

/* loaded from: classes.dex */
public abstract class Completable implements io.reactivex.CompletableSource {
    public Completable() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable amb(java.lang.Iterable<? extends io.reactivex.CompletableSource> r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableAmb r0 = new io.reactivex.internal.operators.completable.CompletableAmb
            r1 = 0
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable ambArray(io.reactivex.CompletableSource... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Completable r2 = complete()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Completable r2 = wrap(r2)
            return r2
        L19:
            io.reactivex.internal.operators.completable.CompletableAmb r0 = new io.reactivex.internal.operators.completable.CompletableAmb
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable complete() {
            io.reactivex.Completable r0 = io.reactivex.internal.operators.completable.CompletableEmpty.INSTANCE
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable concat(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableConcatIterable r0 = new io.reactivex.internal.operators.completable.CompletableConcatIterable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable concat(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1) {
            r0 = 2
            io.reactivex.Completable r1 = concat(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable concat(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.completable.CompletableConcat r0 = new io.reactivex.internal.operators.completable.CompletableConcat
            r0.<init>(r1, r2)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable concatArray(io.reactivex.CompletableSource... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Completable r2 = complete()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Completable r2 = wrap(r2)
            return r2
        L19:
            io.reactivex.internal.operators.completable.CompletableConcatArray r0 = new io.reactivex.internal.operators.completable.CompletableConcatArray
            r0.<init>(r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable create(io.reactivex.CompletableOnSubscribe r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableCreate r0 = new io.reactivex.internal.operators.completable.CompletableCreate
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable defer(java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> r1) {
            java.lang.String r0 = "completableSupplier"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableDefer r0 = new io.reactivex.internal.operators.completable.CompletableDefer
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    private io.reactivex.Completable doOnLifecycle(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r10, io.reactivex.functions.Consumer<? super java.lang.Throwable> r11, io.reactivex.functions.Action r12, io.reactivex.functions.Action r13, io.reactivex.functions.Action r14, io.reactivex.functions.Action r15) {
            r9 = this;
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "onTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            java.lang.String r0 = "onAfterTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r14, r0)
            java.lang.String r0 = "onDispose is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r15, r0)
            io.reactivex.internal.operators.completable.CompletablePeek r0 = new io.reactivex.internal.operators.completable.CompletablePeek
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            io.reactivex.Completable r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable error(java.lang.Throwable r1) {
            java.lang.String r0 = "error is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableError r0 = new io.reactivex.internal.operators.completable.CompletableError
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable error(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            java.lang.String r0 = "errorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableErrorSupplier r0 = new io.reactivex.internal.operators.completable.CompletableErrorSupplier
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable fromAction(io.reactivex.functions.Action r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromAction r0 = new io.reactivex.internal.operators.completable.CompletableFromAction
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable fromCallable(java.util.concurrent.Callable<?> r1) {
            java.lang.String r0 = "callable is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromCallable r0 = new io.reactivex.internal.operators.completable.CompletableFromCallable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable fromFuture(java.util.concurrent.Future<?> r1) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.futureAction(r1)
            io.reactivex.Completable r1 = fromAction(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Completable fromMaybe(io.reactivex.MaybeSource<T> r1) {
            java.lang.String r0 = "maybe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Completable fromObservable(io.reactivex.ObservableSource<T> r1) {
            java.lang.String r0 = "observable is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromObservable r0 = new io.reactivex.internal.operators.completable.CompletableFromObservable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Completable fromPublisher(org.reactivestreams.Publisher<T> r1) {
            java.lang.String r0 = "publisher is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromPublisher r0 = new io.reactivex.internal.operators.completable.CompletableFromPublisher
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable fromRunnable(java.lang.Runnable r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromRunnable r0 = new io.reactivex.internal.operators.completable.CompletableFromRunnable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Completable fromSingle(io.reactivex.SingleSource<T> r1) {
            java.lang.String r0 = "single is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableFromSingle r0 = new io.reactivex.internal.operators.completable.CompletableFromSingle
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable merge(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableMergeIterable r0 = new io.reactivex.internal.operators.completable.CompletableMergeIterable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable merge(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            io.reactivex.Completable r2 = merge0(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable merge(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2) {
            r0 = 0
            io.reactivex.Completable r1 = merge0(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    private static io.reactivex.Completable merge0(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2, boolean r3) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.completable.CompletableMerge r0 = new io.reactivex.internal.operators.completable.CompletableMerge
            r0.<init>(r1, r2, r3)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable mergeArray(io.reactivex.CompletableSource... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Completable r2 = complete()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Completable r2 = wrap(r2)
            return r2
        L19:
            io.reactivex.internal.operators.completable.CompletableMergeArray r0 = new io.reactivex.internal.operators.completable.CompletableMergeArray
            r0.<init>(r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable mergeArrayDelayError(io.reactivex.CompletableSource... r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray r0 = new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable mergeDelayError(java.lang.Iterable<? extends io.reactivex.CompletableSource> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable r0 = new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable mergeDelayError(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            io.reactivex.Completable r2 = merge0(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable mergeDelayError(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2) {
            r0 = 1
            io.reactivex.Completable r1 = merge0(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable never() {
            io.reactivex.Completable r0 = io.reactivex.internal.operators.completable.CompletableNever.INSTANCE
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    private io.reactivex.Completable timeout0(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, io.reactivex.CompletableSource r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.completable.CompletableTimeout r0 = new io.reactivex.internal.operators.completable.CompletableTimeout
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Completable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable timer(long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Completable r1 = timer(r1, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable timer(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.completable.CompletableTimer r0 = new io.reactivex.internal.operators.completable.CompletableTimer
            r0.<init>(r1, r3, r4)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    private static java.lang.NullPointerException toNpe(java.lang.Throwable r2) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't pass out an exception otherwise..."
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable unsafeCreate(io.reactivex.CompletableSource r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Completable
            if (r0 != 0) goto L13
            io.reactivex.internal.operators.completable.CompletableFromUnsafeSource r0 = new io.reactivex.internal.operators.completable.CompletableFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Use of unsafeCreate(Completable)!"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <R> io.reactivex.Completable using(java.util.concurrent.Callable<R> r1, io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> r2, io.reactivex.functions.Consumer<? super R> r3) {
            r0 = 1
            io.reactivex.Completable r1 = using(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <R> io.reactivex.Completable using(java.util.concurrent.Callable<R> r1, io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> r2, io.reactivex.functions.Consumer<? super R> r3, boolean r4) {
            java.lang.String r0 = "resourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "completableFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.completable.CompletableUsing r0 = new io.reactivex.internal.operators.completable.CompletableUsing
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Completable wrap(io.reactivex.CompletableSource r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Completable
            if (r0 == 0) goto L10
            io.reactivex.Completable r1 = (io.reactivex.Completable) r1
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r1
        L10:
            io.reactivex.internal.operators.completable.CompletableFromUnsafeSource r0 = new io.reactivex.internal.operators.completable.CompletableFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Completable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable ambWith(io.reactivex.CompletableSource r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Completable r3 = ambArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable andThen(io.reactivex.CompletableSource r1) {
            r0 = this;
            io.reactivex.Completable r1 = r0.concatWith(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Flowable<T> andThen(org.reactivestreams.Publisher<T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.mixed.CompletableAndThenPublisher r0 = new io.reactivex.internal.operators.mixed.CompletableAndThenPublisher
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Maybe<T> andThen(io.reactivex.MaybeSource<T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable
            r0.<init>(r2, r1)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Observable<T> andThen(io.reactivex.ObservableSource<T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.mixed.CompletableAndThenObservable r0 = new io.reactivex.internal.operators.mixed.CompletableAndThenObservable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Single<T> andThen(io.reactivex.SingleSource<T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.single.SingleDelayWithCompletable r0 = new io.reactivex.internal.operators.single.SingleDelayWithCompletable
            r0.<init>(r2, r1)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m41as(io.reactivex.CompletableConverter<? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.CompletableConverter r2 = (io.reactivex.CompletableConverter) r2
            java.lang.Object r2 = r2.apply(r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingAwait() {
            r1 = this;
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            r0.blockingGet()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final boolean blockingAwait(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            boolean r2 = r0.blockingAwait(r2, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Throwable blockingGet() {
            r1 = this;
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Throwable r0 = r0.blockingGetError()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Throwable blockingGet(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.observers.BlockingMultiObserver r0 = new io.reactivex.internal.observers.BlockingMultiObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Throwable r2 = r0.blockingGetError(r2, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable cache() {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableCache r0 = new io.reactivex.internal.operators.completable.CompletableCache
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable compose(io.reactivex.CompletableTransformer r2) {
            r1 = this;
            java.lang.String r0 = "transformer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.CompletableTransformer r2 = (io.reactivex.CompletableTransformer) r2
            io.reactivex.CompletableSource r2 = r2.apply(r1)
            io.reactivex.Completable r2 = wrap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatWith(io.reactivex.CompletableSource r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Completable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable delay(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Completable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable delay(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Completable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable delay(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.completable.CompletableDelay r0 = new io.reactivex.internal.operators.completable.CompletableDelay
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Completable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doAfterTerminate(io.reactivex.functions.Action r8) {
            r7 = this;
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r3 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r5 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doFinally(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableDoFinally r0 = new io.reactivex.internal.operators.completable.CompletableDoFinally
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnComplete(io.reactivex.functions.Action r8) {
            r7 = this;
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r3 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnDispose(io.reactivex.functions.Action r8) {
            r7 = this;
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r3 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r6 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnError(io.reactivex.functions.Consumer<? super java.lang.Throwable> r8) {
            r7 = this;
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r3 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r2 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnEvent(io.reactivex.functions.Consumer<? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "onEvent is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableDoOnEvent r0 = new io.reactivex.internal.operators.completable.CompletableDoOnEvent
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnSubscribe(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r8) {
            r7 = this;
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r3 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r1 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable doOnTerminate(io.reactivex.functions.Action r8) {
            r7 = this;
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r3 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r5 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r0 = r7
            r4 = r8
            io.reactivex.Completable r8 = r0.doOnLifecycle(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable hide() {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableHide r0 = new io.reactivex.internal.operators.completable.CompletableHide
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable lift(io.reactivex.CompletableOperator r2) {
            r1 = this;
            java.lang.String r0 = "onLift is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableLift r0 = new io.reactivex.internal.operators.completable.CompletableLift
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable mergeWith(io.reactivex.CompletableSource r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Completable r3 = mergeArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable observeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableObserveOn r0 = new io.reactivex.internal.operators.completable.CompletableObserveOn
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable onErrorComplete() {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Completable r0 = r1.onErrorComplete(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable onErrorComplete(io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableOnErrorComplete r0 = new io.reactivex.internal.operators.completable.CompletableOnErrorComplete
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable onErrorResumeNext(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            java.lang.String r0 = "errorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableResumeNext r0 = new io.reactivex.internal.operators.completable.CompletableResumeNext
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable onTerminateDetach() {
            r1 = this;
            io.reactivex.internal.operators.completable.CompletableDetach r0 = new io.reactivex.internal.operators.completable.CompletableDetach
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable repeat() {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r0 = r0.repeat()
            io.reactivex.Completable r0 = fromPublisher(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable repeat(long r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeat(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable repeatUntil(io.reactivex.functions.BooleanSupplier r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeatUntil(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable repeatWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.repeatWhen(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retry() {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r0 = r0.retry()
            io.reactivex.Completable r0 = fromPublisher(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retry(long r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retry(long r2, io.reactivex.functions.Predicate<? super java.lang.Throwable> r4) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2, r4)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retry(io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retry(io.reactivex.functions.Predicate<? super java.lang.Throwable> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retry(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable retryWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.retryWhen(r2)
            io.reactivex.Completable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable startWith(io.reactivex.CompletableSource r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.CompletableSource[] r0 = new io.reactivex.CompletableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Completable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Flowable<T> startWith(org.reactivestreams.Publisher<T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r0 = r1.toFlowable()
            io.reactivex.Flowable r2 = r0.startWith(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Observable<T> startWith(io.reactivex.Observable<T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r0 = r1.toObservable()
            io.reactivex.Observable r2 = r2.concatWith(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final io.reactivex.disposables.Disposable subscribe() {
            r1 = this;
            io.reactivex.internal.observers.EmptyCompletableObserver r0 = new io.reactivex.internal.observers.EmptyCompletableObserver
            r0.<init>()
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.observers.CallbackCompletableObserver r0 = new io.reactivex.internal.observers.CallbackCompletableObserver
            r0.<init>(r2)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Action r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.observers.CallbackCompletableObserver r0 = new io.reactivex.internal.observers.CallbackCompletableObserver
            r0.<init>(r3, r2)
            r1.subscribe(r0)
            return r0
    }

    @Override // io.reactivex.CompletableSource
    @io.reactivex.annotations.SchedulerSupport("none")
    public final void subscribe(io.reactivex.CompletableObserver r2) {
            r1 = this;
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.CompletableObserver r2 = io.reactivex.plugins.RxJavaPlugins.onSubscribe(r1, r2)     // Catch: java.lang.Throwable -> Ld java.lang.NullPointerException -> L19
            r1.subscribeActual(r2)     // Catch: java.lang.Throwable -> Ld java.lang.NullPointerException -> L19
            return
        Ld:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            java.lang.NullPointerException r2 = toNpe(r2)
            throw r2
        L19:
            r2 = move-exception
            throw r2
    }

    protected abstract void subscribeActual(io.reactivex.CompletableObserver r1);

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable subscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r0 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <E extends io.reactivex.CompletableObserver> E subscribeWith(E r1) {
            r0 = this;
            r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable takeUntil(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable r0 = new io.reactivex.internal.operators.completable.CompletableTakeUntilCompletable
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observers.TestObserver<java.lang.Void> test() {
            r1 = this;
            io.reactivex.observers.TestObserver r0 = new io.reactivex.observers.TestObserver
            r0.<init>()
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observers.TestObserver<java.lang.Void> test(boolean r2) {
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
    public final io.reactivex.Completable timeout(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Completable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable timeout(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.CompletableSource r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r11
            io.reactivex.Completable r8 = r1.timeout0(r2, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Completable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable timeout(long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.CompletableSource r6) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.Completable r2 = r1.timeout0(r2, r4, r5, r6)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <U> U m42to(io.reactivex.functions.Function<? super io.reactivex.Completable, U> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
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
    public final <T> io.reactivex.Flowable<T> toFlowable() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToFlowable
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToFlowable r0 = (io.reactivex.internal.fuseable.FuseToFlowable) r0
            io.reactivex.Flowable r0 = r0.fuseToFlowable()
            return r0
        Lc:
            io.reactivex.internal.operators.completable.CompletableToFlowable r0 = new io.reactivex.internal.operators.completable.CompletableToFlowable
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Maybe<T> toMaybe() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToMaybe
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToMaybe r0 = (io.reactivex.internal.fuseable.FuseToMaybe) r0
            io.reactivex.Maybe r0 = r0.fuseToMaybe()
            return r0
        Lc:
            io.reactivex.internal.operators.maybe.MaybeFromCompletable r0 = new io.reactivex.internal.operators.maybe.MaybeFromCompletable
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Observable<T> toObservable() {
            r1 = this;
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.FuseToObservable
            if (r0 == 0) goto Lc
            r0 = r1
            io.reactivex.internal.fuseable.FuseToObservable r0 = (io.reactivex.internal.fuseable.FuseToObservable) r0
            io.reactivex.Observable r0 = r0.fuseToObservable()
            return r0
        Lc:
            io.reactivex.internal.operators.completable.CompletableToObservable r0 = new io.reactivex.internal.operators.completable.CompletableToObservable
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Single<T> toSingle(java.util.concurrent.Callable<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "completionValueSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.completable.CompletableToSingle r0 = new io.reactivex.internal.operators.completable.CompletableToSingle
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Single r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T> io.reactivex.Single<T> toSingleDefault(T r3) {
            r2 = this;
            java.lang.String r0 = "completionValue is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.completable.CompletableToSingle r0 = new io.reactivex.internal.operators.completable.CompletableToSingle
            r1 = 0
            r0.<init>(r2, r1, r3)
            io.reactivex.Single r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable unsubscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.completable.CompletableDisposeOn r0 = new io.reactivex.internal.operators.completable.CompletableDisposeOn
            r0.<init>(r1, r2)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }
}
