package io.reactivex.parallel;

/* loaded from: classes.dex */
public abstract class ParallelFlowable<T> {
    public ParallelFlowable() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> r2) {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r1 = io.reactivex.Flowable.bufferSize()
            io.reactivex.parallel.ParallelFlowable r2 = from(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> r1, int r2) {
            int r0 = io.reactivex.Flowable.bufferSize()
            io.reactivex.parallel.ParallelFlowable r1 = from(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> r1, int r2, int r3) {
            java.lang.String r0 = "source"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "parallelism"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelFromPublisher r0 = new io.reactivex.internal.operators.parallel.ParallelFromPublisher
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> fromArray(org.reactivestreams.Publisher<T>... r1) {
            int r0 = r1.length
            if (r0 == 0) goto Ld
            io.reactivex.internal.operators.parallel.ParallelFromArray r0 = new io.reactivex.internal.operators.parallel.ParallelFromArray
            r0.<init>(r1)
            io.reactivex.parallel.ParallelFlowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Zero publishers not supported"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m52as(io.reactivex.parallel.ParallelFlowableConverter<T, R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.parallel.ParallelFlowableConverter r2 = (io.reactivex.parallel.ParallelFlowableConverter) r2
            java.lang.Object r2 = r2.apply(r1)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <C> io.reactivex.parallel.ParallelFlowable<C> collect(java.util.concurrent.Callable<? extends C> r2, io.reactivex.functions.BiConsumer<? super C, ? super T> r3) {
            r1 = this;
            java.lang.String r0 = "collectionSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "collector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelCollect r0 = new io.reactivex.internal.operators.parallel.ParallelCollect
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.parallel.ParallelFlowable<U> compose(io.reactivex.parallel.ParallelTransformer<T, U> r2) {
            r1 = this;
            java.lang.String r0 = "composer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.parallel.ParallelTransformer r2 = (io.reactivex.parallel.ParallelTransformer) r2
            io.reactivex.parallel.ParallelFlowable r2 = r2.apply(r1)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.parallel.ParallelFlowable r2 = r1.concatMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.parallel.ParallelConcatMap r0 = new io.reactivex.internal.operators.parallel.ParallelConcatMap
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.parallel.ParallelFlowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelConcatMap r0 = new io.reactivex.internal.operators.parallel.ParallelConcatMap
            if (r4 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.parallel.ParallelFlowable r2 = r1.concatMapDelayError(r2, r0, r3)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doAfterNext(io.reactivex.functions.Consumer<? super T> r12) {
            r11 = this;
            java.lang.String r0 = "onAfterNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doAfterTerminated(io.reactivex.functions.Action r12) {
            r11 = this;
            java.lang.String r0 = "onAfterTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnCancel(io.reactivex.functions.Action r12) {
            r11 = this;
            java.lang.String r0 = "onCancel is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            r1 = r0
            r2 = r11
            r10 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnComplete(io.reactivex.functions.Action r12) {
            r11 = this;
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnError(io.reactivex.functions.Consumer<java.lang.Throwable> r12) {
            r11 = this;
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> r12) {
            r11 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelDoOnNextTry r0 = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.parallel.ParallelFailureHandling r3) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelDoOnNextTry r0 = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnRequest(io.reactivex.functions.LongConsumer r12) {
            r11 = this;
            java.lang.String r0 = "onRequest is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r8 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnSubscribe(io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r12) {
            r11 = this;
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.parallel.ParallelPeek r0 = new io.reactivex.internal.operators.parallel.ParallelPeek
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r4 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r5 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r7 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.LongConsumer r9 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r10 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r11
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            io.reactivex.parallel.ParallelFlowable r12 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r12
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.parallel.ParallelFilter r0 = new io.reactivex.internal.operators.parallel.ParallelFilter
            r0.<init>(r1, r2)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
            r1 = this;
            java.lang.String r0 = "predicate"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelFilterTry r0 = new io.reactivex.internal.operators.parallel.ParallelFilterTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.parallel.ParallelFailureHandling r3) {
            r1 = this;
            java.lang.String r0 = "predicate"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelFilterTry r0 = new io.reactivex.internal.operators.parallel.ParallelFilterTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = io.reactivex.Flowable.bufferSize()
            r2 = 0
            io.reactivex.parallel.ParallelFlowable r4 = r3.flatMap(r4, r2, r0, r1)
            return r4
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, boolean r4) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = io.reactivex.Flowable.bufferSize()
            io.reactivex.parallel.ParallelFlowable r3 = r2.flatMap(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            int r0 = io.reactivex.Flowable.bufferSize()
            io.reactivex.parallel.ParallelFlowable r2 = r1.flatMap(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r8, boolean r9, int r10, int r11) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            io.reactivex.internal.operators.parallel.ParallelFlatMap r0 = new io.reactivex.internal.operators.parallel.ParallelFlatMap
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.parallel.ParallelFlowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "mapper"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.parallel.ParallelMap r0 = new io.reactivex.internal.operators.parallel.ParallelMap
            r0.<init>(r1, r2)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
            r1 = this;
            java.lang.String r0 = "mapper"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelMapTry r0 = new io.reactivex.internal.operators.parallel.ParallelMapTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2, io.reactivex.parallel.ParallelFailureHandling r3) {
            r1 = this;
            java.lang.String r0 = "mapper"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "errorHandler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelMapTry r0 = new io.reactivex.internal.operators.parallel.ParallelMapTry
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public abstract int parallelism();

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> reduce(io.reactivex.functions.BiFunction<T, T, T> r2) {
            r1 = this;
            java.lang.String r0 = "reducer"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.parallel.ParallelReduceFull r0 = new io.reactivex.internal.operators.parallel.ParallelReduceFull
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> reduce(java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "initialSupplier"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "reducer"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelReduce r0 = new io.reactivex.internal.operators.parallel.ParallelReduce
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> runOn(io.reactivex.Scheduler r2) {
            r1 = this;
            int r0 = io.reactivex.Flowable.bufferSize()
            io.reactivex.parallel.ParallelFlowable r2 = r1.runOn(r2, r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> runOn(io.reactivex.Scheduler r2, int r3) {
            r1 = this;
            java.lang.String r0 = "scheduler"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelRunOn r0 = new io.reactivex.internal.operators.parallel.ParallelRunOn
            r0.<init>(r1, r2, r3)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequential() {
            r1 = this;
            int r0 = io.reactivex.Flowable.bufferSize()
            io.reactivex.Flowable r0 = r1.sequential(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequential(int r3) {
            r2 = this;
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelJoin r0 = new io.reactivex.internal.operators.parallel.ParallelJoin
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequentialDelayError() {
            r1 = this;
            int r0 = io.reactivex.Flowable.bufferSize()
            io.reactivex.Flowable r0 = r1.sequentialDelayError(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequentialDelayError(int r3) {
            r2 = this;
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.parallel.ParallelJoin r0 = new io.reactivex.internal.operators.parallel.ParallelJoin
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted(java.util.Comparator<? super T> r2) {
            r1 = this;
            r0 = 16
            io.reactivex.Flowable r2 = r1.sorted(r2, r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted(java.util.Comparator<? super T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "comparator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            int r0 = r1.parallelism()
            int r3 = r3 / r0
            int r3 = r3 + 1
            java.util.concurrent.Callable r3 = io.reactivex.internal.functions.Functions.createArrayList(r3)
            io.reactivex.functions.BiFunction r0 = io.reactivex.internal.util.ListAddBiConsumer.instance()
            io.reactivex.parallel.ParallelFlowable r3 = r1.reduce(r3, r0)
            io.reactivex.internal.util.SorterFunction r0 = new io.reactivex.internal.util.SorterFunction
            r0.<init>(r2)
            io.reactivex.parallel.ParallelFlowable r3 = r3.map(r0)
            io.reactivex.internal.operators.parallel.ParallelSortedJoin r0 = new io.reactivex.internal.operators.parallel.ParallelSortedJoin
            r0.<init>(r3, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public abstract void subscribe(org.reactivestreams.Subscriber<? super T>[] r1);

    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <U> U m53to(io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable<T>, U> r2) {
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

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> toSortedList(java.util.Comparator<? super T> r2) {
            r1 = this;
            r0 = 16
            io.reactivex.Flowable r2 = r1.toSortedList(r2, r0)
            return r2
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> toSortedList(java.util.Comparator<? super T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "comparator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            int r0 = r1.parallelism()
            int r3 = r3 / r0
            int r3 = r3 + 1
            java.util.concurrent.Callable r3 = io.reactivex.internal.functions.Functions.createArrayList(r3)
            io.reactivex.functions.BiFunction r0 = io.reactivex.internal.util.ListAddBiConsumer.instance()
            io.reactivex.parallel.ParallelFlowable r3 = r1.reduce(r3, r0)
            io.reactivex.internal.util.SorterFunction r0 = new io.reactivex.internal.util.SorterFunction
            r0.<init>(r2)
            io.reactivex.parallel.ParallelFlowable r3 = r3.map(r0)
            io.reactivex.internal.util.MergerBiFunction r0 = new io.reactivex.internal.util.MergerBiFunction
            r0.<init>(r2)
            io.reactivex.Flowable r2 = r3.reduce(r0)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r2
    }

    protected final boolean validate(org.reactivestreams.Subscriber<?>[] r6) {
            r5 = this;
            int r0 = r5.parallelism()
            int r1 = r6.length
            if (r1 == r0) goto L34
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "parallelism = "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ", subscribers = "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r6.length
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            int r0 = r6.length
            r2 = 0
            r3 = r2
        L29:
            if (r3 >= r0) goto L33
            r4 = r6[r3]
            io.reactivex.internal.subscriptions.EmptySubscription.error(r1, r4)
            int r3 = r3 + 1
            goto L29
        L33:
            return r2
        L34:
            r6 = 1
            return r6
    }
}
