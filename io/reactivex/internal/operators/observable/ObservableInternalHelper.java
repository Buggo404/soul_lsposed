package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableInternalHelper {

    static final class BufferedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final int bufferSize;
        private final io.reactivex.Observable<T> parent;

        BufferedReplayCallable(io.reactivex.Observable<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.bufferSize = r2
                return
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
                r2 = this;
                io.reactivex.Observable<T> r0 = r2.parent
                int r1 = r2.bufferSize
                io.reactivex.observables.ConnectableObservable r0 = r0.replay(r1)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.observables.ConnectableObservable r0 = r1.call()
                return r0
        }
    }

    static final class BufferedTimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final int bufferSize;
        private final io.reactivex.Observable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        BufferedTimedReplayCallable(io.reactivex.Observable<T> r1, int r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.bufferSize = r2
                r0.time = r3
                r0.unit = r5
                r0.scheduler = r6
                return
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
                r6 = this;
                io.reactivex.Observable<T> r0 = r6.parent
                int r1 = r6.bufferSize
                long r2 = r6.time
                java.util.concurrent.TimeUnit r4 = r6.unit
                io.reactivex.Scheduler r5 = r6.scheduler
                io.reactivex.observables.ConnectableObservable r0 = r0.replay(r1, r2, r4, r5)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.observables.ConnectableObservable r0 = r1.call()
                return r0
        }
    }

    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> mapper;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
                r0 = this;
                r0.<init>()
                r0.mapper = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<U> apply(T r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableFromIterable r0 = new io.reactivex.internal.operators.observable.ObservableFromIterable
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1 = r2.mapper
                java.lang.Object r3 = r1.apply(r3)
                java.lang.String r1 = "The mapper returned a null Iterable"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r0.<init>(r3)
                return r0
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    static final class FlatMapWithCombinerInner<U, R, T> implements io.reactivex.functions.Function<U, R> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t */
        private final T f417t;

        FlatMapWithCombinerInner(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.combiner = r1
                r0.f417t = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public R apply(U r3) throws java.lang.Exception {
                r2 = this;
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r0 = r2.combiner
                T r1 = r2.f417t
                java.lang.Object r3 = r0.apply(r1, r3)
                return r3
        }
    }

    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2) {
                r0 = this;
                r0.<init>()
                r0.combiner = r1
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<R> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r0 = r4.mapper
                java.lang.Object r0 = r0.apply(r5)
                java.lang.String r1 = "The mapper returned a null ObservableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                io.reactivex.internal.operators.observable.ObservableMap r1 = new io.reactivex.internal.operators.observable.ObservableMap
                io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerInner r2 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerInner
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3 = r4.combiner
                r2.<init>(r3, r5)
                r1.<init>(r0, r2)
                return r1
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> itemDelay;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r1) {
                r0 = this;
                r0.<init>()
                r0.itemDelay = r1
                return
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<T> apply(T r5) throws java.lang.Exception {
                r4 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r0 = r4.itemDelay
                java.lang.Object r0 = r0.apply(r5)
                java.lang.String r1 = "The itemDelay returned a null ObservableSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                io.reactivex.internal.operators.observable.ObservableTake r1 = new io.reactivex.internal.operators.observable.ObservableTake
                r2 = 1
                r1.<init>(r0, r2)
                io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.justFunction(r5)
                io.reactivex.Observable r0 = r1.map(r0)
                io.reactivex.Observable r5 = r0.defaultIfEmpty(r5)
                return r5
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    enum MapToInt extends java.lang.Enum<io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt> implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        private static final /* synthetic */ io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[] $VALUES = null;
        public static final io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt INSTANCE = null;

        static {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.INSTANCE = r0
                r1 = 1
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r1 = new io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[r1]
                r1[r2] = r0
                io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.$VALUES = r1
                return
        }

        MapToInt(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt valueOf(java.lang.String r1) {
                java.lang.Class<io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt> r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt r1 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt) r1
                return r1
        }

        public static io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[] values() {
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt.$VALUES
                java.lang.Object r0 = r0.clone()
                io.reactivex.internal.operators.observable.ObservableInternalHelper$MapToInt[] r0 = (io.reactivex.internal.operators.observable.ObservableInternalHelper.MapToInt[]) r0
                return r0
        }

        @Override // io.reactivex.functions.Function
        public java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }
    }

    static final class ObserverOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.Observer<T> observer;

        ObserverOnComplete(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onComplete()
                return
        }
    }

    static final class ObserverOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.Observer<T> observer;

        ObserverOnError(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.accept2(r1)
                return
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.Throwable r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onError(r2)
                return
        }
    }

    static final class ObserverOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.Observer<T> observer;

        ObserverOnNext(io.reactivex.Observer<T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.Observer<T> r0 = r1.observer
                r0.onNext(r2)
                return
        }
    }

    static final class ReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final io.reactivex.Observable<T> parent;

        ReplayCallable(io.reactivex.Observable<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
                r1 = this;
                io.reactivex.Observable<T> r0 = r1.parent
                io.reactivex.observables.ConnectableObservable r0 = r0.replay()
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.observables.ConnectableObservable r0 = r1.call()
                return r0
        }
    }

    static final class ReplayFunction<T, R> implements io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.Scheduler scheduler;
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> selector;

        ReplayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.selector = r1
                r0.scheduler = r2
                return
        }

        public io.reactivex.ObservableSource<R> apply(io.reactivex.Observable<T> r2) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r0 = r1.selector
                java.lang.Object r2 = r0.apply(r2)
                java.lang.String r0 = "The selector returned a null ObservableSource"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
                io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2
                io.reactivex.Observable r2 = io.reactivex.Observable.wrap(r2)
                io.reactivex.Scheduler r0 = r1.scheduler
                io.reactivex.Observable r2 = r2.observeOn(r0)
                return r2
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Observable r1 = (io.reactivex.Observable) r1
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    static final class SimpleBiGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> consumer;

        SimpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.consumer = r1
                return
        }

        public S apply(S r2, io.reactivex.Emitter<T> r3) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r0 = r1.consumer
                r0.accept(r2, r3)
                return r2
        }

        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Emitter r2 = (io.reactivex.Emitter) r2
                java.lang.Object r1 = r0.apply(r1, r2)
                return r1
        }
    }

    static final class SimpleGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer;

        SimpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r1) {
                r0 = this;
                r0.<init>()
                r0.consumer = r1
                return
        }

        public S apply(S r2, io.reactivex.Emitter<T> r3) throws java.lang.Exception {
                r1 = this;
                io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r0 = r1.consumer
                r0.accept(r3)
                return r2
        }

        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
                r0 = this;
                io.reactivex.Emitter r2 = (io.reactivex.Emitter) r2
                java.lang.Object r1 = r0.apply(r1, r2)
                return r1
        }
    }

    static final class TimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final io.reactivex.Observable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        TimedReplayCallable(io.reactivex.Observable<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.time = r2
                r0.unit = r4
                r0.scheduler = r5
                return
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
                r5 = this;
                io.reactivex.Observable<T> r0 = r5.parent
                long r1 = r5.time
                java.util.concurrent.TimeUnit r3 = r5.unit
                io.reactivex.Scheduler r4 = r5.scheduler
                io.reactivex.observables.ConnectableObservable r0 = r0.replay(r1, r3, r4)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.observables.ConnectableObservable r0 = r1.call()
                return r0
        }
    }

    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
                r0 = this;
                r0.<init>()
                r0.zipper = r1
                return
        }

        public io.reactivex.ObservableSource<? extends R> apply(java.util.List<io.reactivex.ObservableSource<? extends T>> r4) {
                r3 = this;
                io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0 = r3.zipper
                r1 = 0
                int r2 = io.reactivex.Observable.bufferSize()
                io.reactivex.Observable r4 = io.reactivex.Observable.zipIterable(r4, r0, r1, r2)
                return r4
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
                r0 = this;
                java.util.List r1 = (java.util.List) r1
                io.reactivex.ObservableSource r1 = r0.apply(r1)
                return r1
        }
    }

    private ObservableInternalHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapIntoIterable r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapIntoIterable
            r0.<init>(r1)
            return r0
    }

    public static <T, U, R> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerOuter r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$FlatMapWithCombinerOuter
            r0.<init>(r2, r1)
            return r0
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ItemDelayFunction r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ItemDelayFunction
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Action observerOnComplete(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnComplete r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnComplete
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> observerOnError(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnError r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnError
            r0.<init>(r1)
            return r0
    }

    public static <T> io.reactivex.functions.Consumer<T> observerOnNext(io.reactivex.Observer<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnNext r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ObserverOnNext
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ReplayCallable r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ReplayCallable
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r1, int r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$BufferedReplayCallable r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$BufferedReplayCallable
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r8, int r9, long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$BufferedTimedReplayCallable r7 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$BufferedTimedReplayCallable
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r5, r6)
            return r7
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> r7, long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$TimedReplayCallable r6 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$TimedReplayCallable
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r4, r5)
            return r6
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r1, io.reactivex.Scheduler r2) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ReplayFunction r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ReplayFunction
            r0.<init>(r1, r2)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleBiGenerator r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleBiGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleGenerator r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$SimpleGenerator
            r0.<init>(r1)
            return r0
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1) {
            io.reactivex.internal.operators.observable.ObservableInternalHelper$ZipIterableFunction r0 = new io.reactivex.internal.operators.observable.ObservableInternalHelper$ZipIterableFunction
            r0.<init>(r1)
            return r0
    }
}
