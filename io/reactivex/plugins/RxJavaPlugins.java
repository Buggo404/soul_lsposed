package io.reactivex.plugins;

/* loaded from: classes.dex */
public final class RxJavaPlugins {
    static volatile io.reactivex.functions.Consumer<? super java.lang.Throwable> errorHandler;
    static volatile boolean failNonBlockingScheduler;
    static volatile boolean lockdown;
    static volatile io.reactivex.functions.BooleanSupplier onBeforeBlocking;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> onCompletableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> onCompletableSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onComputationHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> onConnectableFlowableAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> onConnectableObservableAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> onFlowableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> onFlowableSubscribe;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitComputationHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitIoHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitNewThreadHandler;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> onInitSingleHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onIoHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> onMaybeAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> onMaybeSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onNewThreadHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> onObservableAssembly;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> onObservableSubscribe;
    static volatile io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> onParallelAssembly;
    static volatile io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> onScheduleHandler;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> onSingleAssembly;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> onSingleHandler;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> onSingleSubscribe;

    private RxJavaPlugins() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    static <T, U, R> R apply(io.reactivex.functions.BiFunction<T, U, R> r0, T r1, U r2) {
            java.lang.Object r0 = r0.apply(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    static <T, R> R apply(io.reactivex.functions.Function<T, R> r0, T r1) {
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
    }

    static io.reactivex.Scheduler applyRequireNonNull(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0, java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.Object r0 = apply(r0, r1)
            java.lang.String r1 = "Scheduler Callable result can't be null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
            io.reactivex.Scheduler r0 = (io.reactivex.Scheduler) r0
            return r0
    }

    static io.reactivex.Scheduler callRequireNonNull(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "Scheduler Callable result can't be null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)     // Catch: java.lang.Throwable -> Ld
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r1)
            throw r1
    }

    public static io.reactivex.Scheduler createComputationScheduler(java.util.concurrent.ThreadFactory r2) {
            io.reactivex.internal.schedulers.ComputationScheduler r0 = new io.reactivex.internal.schedulers.ComputationScheduler
            java.lang.String r1 = "threadFactory is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            java.util.concurrent.ThreadFactory r2 = (java.util.concurrent.ThreadFactory) r2
            r0.<init>(r2)
            return r0
    }

    public static io.reactivex.Scheduler createIoScheduler(java.util.concurrent.ThreadFactory r2) {
            io.reactivex.internal.schedulers.IoScheduler r0 = new io.reactivex.internal.schedulers.IoScheduler
            java.lang.String r1 = "threadFactory is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            java.util.concurrent.ThreadFactory r2 = (java.util.concurrent.ThreadFactory) r2
            r0.<init>(r2)
            return r0
    }

    public static io.reactivex.Scheduler createNewThreadScheduler(java.util.concurrent.ThreadFactory r2) {
            io.reactivex.internal.schedulers.NewThreadScheduler r0 = new io.reactivex.internal.schedulers.NewThreadScheduler
            java.lang.String r1 = "threadFactory is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            java.util.concurrent.ThreadFactory r2 = (java.util.concurrent.ThreadFactory) r2
            r0.<init>(r2)
            return r0
    }

    public static io.reactivex.Scheduler createSingleScheduler(java.util.concurrent.ThreadFactory r2) {
            io.reactivex.internal.schedulers.SingleScheduler r0 = new io.reactivex.internal.schedulers.SingleScheduler
            java.lang.String r1 = "threadFactory is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            java.util.concurrent.ThreadFactory r2 = (java.util.concurrent.ThreadFactory) r2
            r0.<init>(r2)
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getComputationSchedulerHandler() {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onComputationHandler
            return r0
    }

    public static io.reactivex.functions.Consumer<? super java.lang.Throwable> getErrorHandler() {
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = io.reactivex.plugins.RxJavaPlugins.errorHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitComputationSchedulerHandler() {
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitComputationHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitIoSchedulerHandler() {
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitIoHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitNewThreadSchedulerHandler() {
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitNewThreadHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitSingleSchedulerHandler() {
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitSingleHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getIoSchedulerHandler() {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onIoHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getNewThreadSchedulerHandler() {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onNewThreadHandler
            return r0
    }

    public static io.reactivex.functions.BooleanSupplier getOnBeforeBlocking() {
            io.reactivex.functions.BooleanSupplier r0 = io.reactivex.plugins.RxJavaPlugins.onBeforeBlocking
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> getOnCompletableAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> r0 = io.reactivex.plugins.RxJavaPlugins.onCompletableAssembly
            return r0
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> getOnCompletableSubscribe() {
            io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onCompletableSubscribe
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> getOnConnectableFlowableAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> r0 = io.reactivex.plugins.RxJavaPlugins.onConnectableFlowableAssembly
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> getOnConnectableObservableAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> r0 = io.reactivex.plugins.RxJavaPlugins.onConnectableObservableAssembly
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> getOnFlowableAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> r0 = io.reactivex.plugins.RxJavaPlugins.onFlowableAssembly
            return r0
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> getOnFlowableSubscribe() {
            io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> r0 = io.reactivex.plugins.RxJavaPlugins.onFlowableSubscribe
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> getOnMaybeAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> r0 = io.reactivex.plugins.RxJavaPlugins.onMaybeAssembly
            return r0
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> getOnMaybeSubscribe() {
            io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onMaybeSubscribe
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> getOnObservableAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> r0 = io.reactivex.plugins.RxJavaPlugins.onObservableAssembly
            return r0
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> getOnObservableSubscribe() {
            io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> r0 = io.reactivex.plugins.RxJavaPlugins.onObservableSubscribe
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> getOnParallelAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> r0 = io.reactivex.plugins.RxJavaPlugins.onParallelAssembly
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> getOnSingleAssembly() {
            io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleAssembly
            return r0
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> getOnSingleSubscribe() {
            io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleSubscribe
            return r0
    }

    public static io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> getScheduleHandler() {
            io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> r0 = io.reactivex.plugins.RxJavaPlugins.onScheduleHandler
            return r0
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getSingleSchedulerHandler() {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleHandler
            return r0
    }

    public static io.reactivex.Scheduler initComputationScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.String r0 = "Scheduler Callable can't be null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitComputationHandler
            if (r0 != 0) goto Le
            io.reactivex.Scheduler r1 = callRequireNonNull(r1)
            return r1
        Le:
            io.reactivex.Scheduler r1 = applyRequireNonNull(r0, r1)
            return r1
    }

    public static io.reactivex.Scheduler initIoScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.String r0 = "Scheduler Callable can't be null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitIoHandler
            if (r0 != 0) goto Le
            io.reactivex.Scheduler r1 = callRequireNonNull(r1)
            return r1
        Le:
            io.reactivex.Scheduler r1 = applyRequireNonNull(r0, r1)
            return r1
    }

    public static io.reactivex.Scheduler initNewThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.String r0 = "Scheduler Callable can't be null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitNewThreadHandler
            if (r0 != 0) goto Le
            io.reactivex.Scheduler r1 = callRequireNonNull(r1)
            return r1
        Le:
            io.reactivex.Scheduler r1 = applyRequireNonNull(r0, r1)
            return r1
    }

    public static io.reactivex.Scheduler initSingleScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.String r0 = "Scheduler Callable can't be null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onInitSingleHandler
            if (r0 != 0) goto Le
            io.reactivex.Scheduler r1 = callRequireNonNull(r1)
            return r1
        Le:
            io.reactivex.Scheduler r1 = applyRequireNonNull(r0, r1)
            return r1
    }

    static boolean isBug(java.lang.Throwable r2) {
            boolean r0 = r2 instanceof io.reactivex.exceptions.OnErrorNotImplementedException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2 instanceof io.reactivex.exceptions.MissingBackpressureException
            if (r0 == 0) goto Lb
            return r1
        Lb:
            boolean r0 = r2 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L10
            return r1
        L10:
            boolean r0 = r2 instanceof java.lang.NullPointerException
            if (r0 == 0) goto L15
            return r1
        L15:
            boolean r0 = r2 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L1a
            return r1
        L1a:
            boolean r2 = r2 instanceof io.reactivex.exceptions.CompositeException
            if (r2 == 0) goto L1f
            return r1
        L1f:
            r2 = 0
            return r2
    }

    public static boolean isFailOnNonBlockingScheduler() {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.failNonBlockingScheduler
            return r0
    }

    public static boolean isLockdown() {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            return r0
    }

    public static void lockdown() {
            r0 = 1
            io.reactivex.plugins.RxJavaPlugins.lockdown = r0
            return
    }

    public static io.reactivex.Completable onAssembly(io.reactivex.Completable r1) {
            io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> r0 = io.reactivex.plugins.RxJavaPlugins.onCompletableAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Completable r1 = (io.reactivex.Completable) r1
        La:
            return r1
    }

    public static <T> io.reactivex.Flowable<T> onAssembly(io.reactivex.Flowable<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> r0 = io.reactivex.plugins.RxJavaPlugins.onFlowableAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Flowable r1 = (io.reactivex.Flowable) r1
        La:
            return r1
    }

    public static <T> io.reactivex.Maybe<T> onAssembly(io.reactivex.Maybe<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> r0 = io.reactivex.plugins.RxJavaPlugins.onMaybeAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Maybe r1 = (io.reactivex.Maybe) r1
        La:
            return r1
    }

    public static <T> io.reactivex.Observable<T> onAssembly(io.reactivex.Observable<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> r0 = io.reactivex.plugins.RxJavaPlugins.onObservableAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Observable r1 = (io.reactivex.Observable) r1
        La:
            return r1
    }

    public static <T> io.reactivex.Single<T> onAssembly(io.reactivex.Single<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Single r1 = (io.reactivex.Single) r1
        La:
            return r1
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> onAssembly(io.reactivex.flowables.ConnectableFlowable<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> r0 = io.reactivex.plugins.RxJavaPlugins.onConnectableFlowableAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.flowables.ConnectableFlowable r1 = (io.reactivex.flowables.ConnectableFlowable) r1
        La:
            return r1
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> onAssembly(io.reactivex.observables.ConnectableObservable<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> r0 = io.reactivex.plugins.RxJavaPlugins.onConnectableObservableAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.observables.ConnectableObservable r1 = (io.reactivex.observables.ConnectableObservable) r1
        La:
            return r1
    }

    public static <T> io.reactivex.parallel.ParallelFlowable<T> onAssembly(io.reactivex.parallel.ParallelFlowable<T> r1) {
            io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> r0 = io.reactivex.plugins.RxJavaPlugins.onParallelAssembly
            if (r0 == 0) goto La
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.parallel.ParallelFlowable r1 = (io.reactivex.parallel.ParallelFlowable) r1
        La:
            return r1
    }

    public static boolean onBeforeBlocking() {
            io.reactivex.functions.BooleanSupplier r0 = io.reactivex.plugins.RxJavaPlugins.onBeforeBlocking
            if (r0 == 0) goto Lf
            boolean r0 = r0.getAsBoolean()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            throw r0
        Lf:
            r0 = 0
            return r0
    }

    public static io.reactivex.Scheduler onComputationScheduler(io.reactivex.Scheduler r1) {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onComputationHandler
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            return r1
    }

    public static void onError(java.lang.Throwable r2) {
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r0 = io.reactivex.plugins.RxJavaPlugins.errorHandler
            if (r2 != 0) goto Lc
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r1 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r1)
            goto L18
        Lc:
            boolean r1 = isBug(r2)
            if (r1 != 0) goto L18
            io.reactivex.exceptions.UndeliverableException r1 = new io.reactivex.exceptions.UndeliverableException
            r1.<init>(r2)
            r2 = r1
        L18:
            if (r0 == 0) goto L25
            r0.accept(r2)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            r0.printStackTrace()
            uncaught(r0)
        L25:
            r2.printStackTrace()
            uncaught(r2)
            return
    }

    public static io.reactivex.Scheduler onIoScheduler(io.reactivex.Scheduler r1) {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onIoHandler
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            return r1
    }

    public static io.reactivex.Scheduler onNewThreadScheduler(io.reactivex.Scheduler r1) {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onNewThreadHandler
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            return r1
    }

    public static java.lang.Runnable onSchedule(java.lang.Runnable r1) {
            java.lang.String r0 = "run is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> r0 = io.reactivex.plugins.RxJavaPlugins.onScheduleHandler
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.Object r1 = apply(r0, r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            return r1
    }

    public static io.reactivex.Scheduler onSingleScheduler(io.reactivex.Scheduler r1) {
            io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleHandler
            if (r0 != 0) goto L5
            return r1
        L5:
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            return r1
    }

    public static io.reactivex.CompletableObserver onSubscribe(io.reactivex.Completable r1, io.reactivex.CompletableObserver r2) {
            io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onCompletableSubscribe
            if (r0 == 0) goto Lb
            java.lang.Object r1 = apply(r0, r1, r2)
            io.reactivex.CompletableObserver r1 = (io.reactivex.CompletableObserver) r1
            return r1
        Lb:
            return r2
    }

    public static <T> io.reactivex.MaybeObserver<? super T> onSubscribe(io.reactivex.Maybe<T> r1, io.reactivex.MaybeObserver<? super T> r2) {
            io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onMaybeSubscribe
            if (r0 == 0) goto Lb
            java.lang.Object r1 = apply(r0, r1, r2)
            io.reactivex.MaybeObserver r1 = (io.reactivex.MaybeObserver) r1
            return r1
        Lb:
            return r2
    }

    public static <T> io.reactivex.Observer<? super T> onSubscribe(io.reactivex.Observable<T> r1, io.reactivex.Observer<? super T> r2) {
            io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> r0 = io.reactivex.plugins.RxJavaPlugins.onObservableSubscribe
            if (r0 == 0) goto Lb
            java.lang.Object r1 = apply(r0, r1, r2)
            io.reactivex.Observer r1 = (io.reactivex.Observer) r1
            return r1
        Lb:
            return r2
    }

    public static <T> io.reactivex.SingleObserver<? super T> onSubscribe(io.reactivex.Single<T> r1, io.reactivex.SingleObserver<? super T> r2) {
            io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> r0 = io.reactivex.plugins.RxJavaPlugins.onSingleSubscribe
            if (r0 == 0) goto Lb
            java.lang.Object r1 = apply(r0, r1, r2)
            io.reactivex.SingleObserver r1 = (io.reactivex.SingleObserver) r1
            return r1
        Lb:
            return r2
    }

    public static <T> org.reactivestreams.Subscriber<? super T> onSubscribe(io.reactivex.Flowable<T> r1, org.reactivestreams.Subscriber<? super T> r2) {
            io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> r0 = io.reactivex.plugins.RxJavaPlugins.onFlowableSubscribe
            if (r0 == 0) goto Lb
            java.lang.Object r1 = apply(r0, r1, r2)
            org.reactivestreams.Subscriber r1 = (org.reactivestreams.Subscriber) r1
            return r1
        Lb:
            return r2
    }

    public static void reset() {
            r0 = 0
            setErrorHandler(r0)
            setScheduleHandler(r0)
            setComputationSchedulerHandler(r0)
            setInitComputationSchedulerHandler(r0)
            setIoSchedulerHandler(r0)
            setInitIoSchedulerHandler(r0)
            setSingleSchedulerHandler(r0)
            setInitSingleSchedulerHandler(r0)
            setNewThreadSchedulerHandler(r0)
            setInitNewThreadSchedulerHandler(r0)
            setOnFlowableAssembly(r0)
            setOnFlowableSubscribe(r0)
            setOnObservableAssembly(r0)
            setOnObservableSubscribe(r0)
            setOnSingleAssembly(r0)
            setOnSingleSubscribe(r0)
            setOnCompletableAssembly(r0)
            setOnCompletableSubscribe(r0)
            setOnConnectableFlowableAssembly(r0)
            setOnConnectableObservableAssembly(r0)
            setOnMaybeAssembly(r0)
            setOnMaybeSubscribe(r0)
            setOnParallelAssembly(r0)
            r1 = 0
            setFailOnNonBlockingScheduler(r1)
            setOnBeforeBlocking(r0)
            return
    }

    public static void setComputationSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onComputationHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setErrorHandler(io.reactivex.functions.Consumer<? super java.lang.Throwable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.errorHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setFailOnNonBlockingScheduler(boolean r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.failNonBlockingScheduler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setInitComputationSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onInitComputationHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setInitIoSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onInitIoHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setInitNewThreadSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onInitNewThreadHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setInitSingleSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onInitSingleHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setIoSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onIoHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setNewThreadSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onNewThreadHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnBeforeBlocking(io.reactivex.functions.BooleanSupplier r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onBeforeBlocking = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnCompletableAssembly(io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onCompletableAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnCompletableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onCompletableSubscribe = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnConnectableFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onConnectableFlowableAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnConnectableObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onConnectableObservableAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onFlowableAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnFlowableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onFlowableSubscribe = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnMaybeAssembly(io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onMaybeAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnMaybeSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onMaybeSubscribe = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onObservableAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnObservableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onObservableSubscribe = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnParallelAssembly(io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onParallelAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnSingleAssembly(io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onSingleAssembly = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setOnSingleSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onSingleSubscribe = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setScheduleHandler(io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onScheduleHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    public static void setSingleSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> r1) {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.lockdown
            if (r0 != 0) goto L7
            io.reactivex.plugins.RxJavaPlugins.onSingleHandler = r1
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Plugins can't be changed anymore"
            r1.<init>(r0)
            throw r1
    }

    static void uncaught(java.lang.Throwable r2) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r2)
            return
    }

    static void unlock() {
            r0 = 0
            io.reactivex.plugins.RxJavaPlugins.lockdown = r0
            return
    }
}
